package androidx.lifecycle;

import androidx.lifecycle.m;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f1447c = new e();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1448a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f1449b = new HashMap();

    @Deprecated
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f1450a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<b, m.a> f1451b;

        public a(HashMap hashMap) {
            this.f1451b = hashMap;
            for (Map.Entry entry : hashMap.entrySet()) {
                m.a aVar = (m.a) entry.getValue();
                List list = (List) this.f1450a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f1450a.put(aVar, list);
                }
                list.add((b) entry.getKey());
            }
        }

        public static void a(List<b> list, r rVar, m.a aVar, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    b bVar = list.get(size);
                    bVar.getClass();
                    try {
                        int i8 = bVar.f1452a;
                        Method method = bVar.f1453b;
                        if (i8 == 0) {
                            method.invoke(obj, new Object[0]);
                        } else if (i8 == 1) {
                            method.invoke(obj, new Object[]{rVar});
                        } else if (i8 == 2) {
                            method.invoke(obj, new Object[]{rVar, aVar});
                        }
                        size--;
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e4) {
                        throw new RuntimeException(e4);
                    }
                }
            }
        }
    }

    @Deprecated
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f1452a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f1453b;

        public b(int i8, Method method) {
            this.f1452a = i8;
            this.f1453b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1452a == bVar.f1452a && this.f1453b.getName().equals(bVar.f1453b.getName());
        }

        public final int hashCode() {
            return (this.f1452a * 31) + this.f1453b.getName().hashCode();
        }
    }

    public static void c(HashMap hashMap, b bVar, m.a aVar, Class cls) {
        m.a aVar2 = (m.a) hashMap.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f1453b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            hashMap.put(bVar, aVar);
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i8;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).f1451b);
        }
        for (Class b9 : cls.getInterfaces()) {
            for (Map.Entry next : b(b9).f1451b.entrySet()) {
                c(hashMap, (b) next.getKey(), (m.a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z8 = false;
        for (Method method : methodArr) {
            a0 a0Var = (a0) method.getAnnotation(a0.class);
            if (a0Var != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i8 = 0;
                } else if (r.class.isAssignableFrom(parameterTypes[0])) {
                    i8 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                m.a value = a0Var.value();
                if (parameterTypes.length > 1) {
                    if (!m.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == m.a.ON_ANY) {
                        i8 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new b(i8, method), value, cls);
                    z8 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f1448a.put(cls, aVar);
        this.f1449b.put(cls, Boolean.valueOf(z8));
        return aVar;
    }

    public final a b(Class<?> cls) {
        a aVar = (a) this.f1448a.get(cls);
        return aVar != null ? aVar : a(cls, (Method[]) null);
    }
}
