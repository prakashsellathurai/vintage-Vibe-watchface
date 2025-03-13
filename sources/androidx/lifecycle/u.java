package androidx.lifecycle;

import a1.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import q7.k;
import w7.l;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f1510a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f1511b = new HashMap();

    public static j a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(new Object[]{obj});
            k.d(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return (j) newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    public static final String b(String str) {
        StringBuilder sb = new StringBuilder();
        int q8 = l.q(0, str, ".", false);
        if (q8 >= 0) {
            int length = (str.length() - 1) + 1;
            if (length >= 0) {
                StringBuilder sb2 = new StringBuilder(length);
                int i8 = 0;
                do {
                    sb2.append(str, i8, q8);
                    sb2.append("_");
                    i8 = q8 + 1;
                    if (q8 >= str.length() || (q8 = l.q(i8, str, ".", false)) <= 0) {
                        sb2.append(str, i8, str.length());
                        str = sb2.toString();
                        k.d(str, "stringBuilder.append(this, i, length).toString()");
                    }
                    sb2.append(str, i8, q8);
                    sb2.append("_");
                    i8 = q8 + 1;
                    break;
                } while ((q8 = l.q(i8, str, ".", false)) <= 0);
                sb2.append(str, i8, str.length());
                str = sb2.toString();
                k.d(str, "stringBuilder.append(this, i, length).toString()");
            } else {
                throw new OutOfMemoryError();
            }
        }
        sb.append(str);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    public static int c(Class cls) {
        Constructor<?> constructor;
        boolean z8;
        HashMap hashMap = f1510a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i8 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package packageR = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = packageR != null ? packageR.getName() : "";
                k.d(name, "fullPackage");
                if (!(name.length() == 0)) {
                    k.d(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    k.d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                k.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String b9 = b(canonicalName);
                if (!(name.length() == 0)) {
                    b9 = name + '.' + b9;
                }
                constructor = Class.forName(b9).getDeclaredConstructor(new Class[]{cls});
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap hashMap2 = f1511b;
            if (constructor != null) {
                hashMap2.put(cls, a.A(constructor));
            } else {
                e eVar = e.f1447c;
                HashMap hashMap3 = eVar.f1449b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z8 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z8 = false;
                                break;
                            } else if (((a0) declaredMethods[i9].getAnnotation(a0.class)) != null) {
                                eVar.a(cls, declaredMethods);
                                z8 = true;
                                break;
                            } else {
                                i9++;
                            }
                        }
                    } catch (NoClassDefFoundError e4) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
                    }
                }
                if (!z8) {
                    Class superclass = cls.getSuperclass();
                    Class<q> cls2 = q.class;
                    if (superclass != null && cls2.isAssignableFrom(superclass)) {
                        k.d(superclass, "superclass");
                        if (c(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            k.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    k.d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length2) {
                            Class cls3 = interfaces[i10];
                            if (cls3 != null && cls2.isAssignableFrom(cls3)) {
                                k.d(cls3, "intrface");
                                if (c(cls3) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls3);
                                k.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i10++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i8 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i8));
        return i8;
    }
}
