package g1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final p.a<String, Method> f4482a;

    /* renamed from: b  reason: collision with root package name */
    public final p.a<String, Method> f4483b;

    /* renamed from: c  reason: collision with root package name */
    public final p.a<String, Class> f4484c;

    /* renamed from: g1.a$a  reason: collision with other inner class name */
    public class C0056a extends ObjectInputStream {
        public C0056a(ByteArrayInputStream byteArrayInputStream) {
            super(byteArrayInputStream);
        }

        public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, C0056a.class.getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }
    }

    public static class b extends RuntimeException {
        public b(IOException iOException) {
            super(iOException);
        }
    }

    public a(p.a<String, Method> aVar, p.a<String, Method> aVar2, p.a<String, Class> aVar3) {
        this.f4482a = aVar;
        this.f4483b = aVar2;
        this.f4484c = aVar3;
    }

    public static int e(Object obj) {
        if (obj instanceof String) {
            return 4;
        }
        if (obj instanceof Parcelable) {
            return 2;
        }
        if (obj instanceof d) {
            return 1;
        }
        if (obj instanceof Serializable) {
            return 3;
        }
        if (obj instanceof IBinder) {
            return 5;
        }
        if (obj instanceof Integer) {
            return 7;
        }
        if (obj instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(obj.getClass().getName().concat(" cannot be VersionedParcelled"));
    }

    public final Serializable A() {
        String B = B();
        if (B == null) {
            return null;
        }
        try {
            return (Serializable) new C0056a(new ByteArrayInputStream(l())).readObject();
        } catch (IOException e) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + B + ")", e);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + B + ")", e4);
        }
    }

    public abstract String B();

    public final String C(int i8, String str) {
        return !q(i8) ? str : B();
    }

    public abstract IBinder D();

    public final <T extends d> T E() {
        String B = B();
        if (B == null) {
            return null;
        }
        a b9 = b();
        try {
            return (d) d(B).invoke((Object) null, new Object[]{b9});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        }
    }

    public final <T extends d> T F(T t8, int i8) {
        return !q(i8) ? t8 : E();
    }

    public abstract void G(int i8);

    public void H(boolean z8, boolean z9) {
    }

    public final <T> void I(T[] tArr) {
        if (tArr == null) {
            T(-1);
            return;
        }
        int length = tArr.length;
        T(length);
        if (length > 0) {
            int i8 = 0;
            int e = e(tArr[0]);
            T(e);
            if (e == 1) {
                while (i8 < length) {
                    f0((d) tArr[i8]);
                    i8++;
                }
            } else if (e == 2) {
                while (i8 < length) {
                    Z((Parcelable) tArr[i8]);
                    i8++;
                }
            } else if (e == 3) {
                while (i8 < length) {
                    b0((Serializable) tArr[i8]);
                    i8++;
                }
            } else if (e == 4) {
                while (i8 < length) {
                    d0((String) tArr[i8]);
                    i8++;
                }
            } else if (e == 5) {
                while (i8 < length) {
                    e0((IBinder) tArr[i8]);
                    i8++;
                }
            }
        }
    }

    public final void J(int i8, boolean z8) {
        G(i8);
        K(z8);
    }

    public abstract void K(boolean z8);

    public final void L(int i8, Bundle bundle) {
        G(i8);
        M(bundle);
    }

    public abstract void M(Bundle bundle);

    public abstract void N(byte[] bArr);

    public final void O(byte[] bArr, int i8) {
        G(i8);
        N(bArr);
    }

    public final void P(int i8, CharSequence charSequence) {
        G(i8);
        Q(charSequence);
    }

    public abstract void Q(CharSequence charSequence);

    public final <T> void R(Collection<T> collection) {
        if (collection == null) {
            T(-1);
            return;
        }
        int size = collection.size();
        T(size);
        if (size > 0) {
            int e = e(collection.iterator().next());
            T(e);
            switch (e) {
                case 1:
                    for (T f02 : collection) {
                        f0(f02);
                    }
                    return;
                case 2:
                    for (T Z : collection) {
                        Z(Z);
                    }
                    return;
                case 3:
                    for (T b02 : collection) {
                        b0(b02);
                    }
                    return;
                case 4:
                    for (T d02 : collection) {
                        d0(d02);
                    }
                    return;
                case 5:
                    for (T e02 : collection) {
                        e0(e02);
                    }
                    return;
                case 7:
                    for (T intValue : collection) {
                        T(intValue.intValue());
                    }
                    return;
                case 8:
                    for (T floatValue : collection) {
                        S(floatValue.floatValue());
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public abstract void S(float f9);

    public abstract void T(int i8);

    public final void U(int i8, int i9) {
        G(i9);
        T(i8);
    }

    public final void V(int i8, List list) {
        G(i8);
        R(list);
    }

    public final void W(int i8, long j8) {
        G(i8);
        X(j8);
    }

    public abstract void X(long j8);

    public final <K, V> void Y(Map<K, V> map, int i8) {
        G(i8);
        if (map == null) {
            T(-1);
            return;
        }
        int size = map.size();
        T(size);
        if (size != 0) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry next : map.entrySet()) {
                arrayList.add(next.getKey());
                arrayList2.add(next.getValue());
            }
            R(arrayList);
            R(arrayList2);
        }
    }

    public abstract void Z(Parcelable parcelable);

    public abstract void a();

    public final void a0(Parcelable parcelable, int i8) {
        G(i8);
        Z(parcelable);
    }

    public abstract a b();

    public final void b0(Serializable serializable) {
        if (serializable == null) {
            d0((String) null);
            return;
        }
        String name = serializable.getClass().getName();
        d0(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            N(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e);
        }
    }

    public final Class c(Class<? extends d> cls) {
        String name = cls.getName();
        p.a<String, Class> aVar = this.f4484c;
        Class orDefault = aVar.getOrDefault(name, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        aVar.put(cls.getName(), cls2);
        return cls2;
    }

    public final void c0(int i8, String str) {
        G(i8);
        d0(str);
    }

    public final Method d(String str) {
        p.a<String, Method> aVar = this.f4482a;
        Method orDefault = aVar.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Class<a> cls = a.class;
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        aVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public abstract void d0(String str);

    public abstract void e0(IBinder iBinder);

    public final Method f(Class cls) {
        String name = cls.getName();
        p.a<String, Method> aVar = this.f4483b;
        Method orDefault = aVar.getOrDefault(name, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class c9 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c9.getDeclaredMethod("write", new Class[]{cls, a.class});
        aVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public final void f0(d dVar) {
        if (dVar == null) {
            d0((String) null);
            return;
        }
        try {
            d0(c(dVar.getClass()).getName());
            a b9 = b();
            try {
                f(dVar.getClass()).invoke((Object) null, new Object[]{dVar, b9});
                b9.a();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            } catch (NoSuchMethodException e9) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
            }
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException(dVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e11);
        }
    }

    public final <T> T[] g(T[] tArr) {
        int s8 = s();
        if (s8 < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(s8);
        if (s8 != 0) {
            int s9 = s();
            if (s8 < 0) {
                return null;
            }
            if (s9 == 1) {
                while (s8 > 0) {
                    arrayList.add(E());
                    s8--;
                }
            } else if (s9 == 2) {
                while (s8 > 0) {
                    arrayList.add(y());
                    s8--;
                }
            } else if (s9 == 3) {
                while (s8 > 0) {
                    arrayList.add(A());
                    s8--;
                }
            } else if (s9 == 4) {
                while (s8 > 0) {
                    arrayList.add(B());
                    s8--;
                }
            } else if (s9 == 5) {
                while (s8 > 0) {
                    arrayList.add(D());
                    s8--;
                }
            }
        }
        return arrayList.toArray(tArr);
    }

    public final void g0(d dVar, int i8) {
        G(i8);
        f0(dVar);
    }

    public abstract boolean h();

    public final boolean i(int i8, boolean z8) {
        return !q(i8) ? z8 : h();
    }

    public abstract Bundle j();

    public final Bundle k(int i8, Bundle bundle) {
        return !q(i8) ? bundle : j();
    }

    public abstract byte[] l();

    public final byte[] m(byte[] bArr, int i8) {
        return !q(i8) ? bArr : l();
    }

    public abstract CharSequence n();

    public final CharSequence o(int i8, CharSequence charSequence) {
        return !q(i8) ? charSequence : n();
    }

    public final Collection p(ArrayList arrayList) {
        int s8 = s();
        if (s8 < 0) {
            return null;
        }
        if (s8 != 0) {
            int s9 = s();
            if (s8 < 0) {
                return null;
            }
            if (s9 == 1) {
                while (s8 > 0) {
                    arrayList.add(E());
                    s8--;
                }
            } else if (s9 == 2) {
                while (s8 > 0) {
                    arrayList.add(y());
                    s8--;
                }
            } else if (s9 == 3) {
                while (s8 > 0) {
                    arrayList.add(A());
                    s8--;
                }
            } else if (s9 == 4) {
                while (s8 > 0) {
                    arrayList.add(B());
                    s8--;
                }
            } else if (s9 == 5) {
                while (s8 > 0) {
                    arrayList.add(D());
                    s8--;
                }
            }
        }
        return arrayList;
    }

    public abstract boolean q(int i8);

    public abstract float r();

    public abstract int s();

    public final int t(int i8, int i9) {
        return !q(i9) ? i8 : s();
    }

    public final List u(int i8, List list) {
        return !q(i8) ? list : (List) p(new ArrayList());
    }

    public abstract long v();

    public final long w(int i8, long j8) {
        return !q(i8) ? j8 : v();
    }

    public final <K, V> Map<K, V> x(Map<K, V> map, int i8) {
        if (!q(i8)) {
            return map;
        }
        int s8 = s();
        if (s8 < 0) {
            return null;
        }
        p.a aVar = new p.a();
        if (s8 == 0) {
            return aVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        p(arrayList);
        p(arrayList2);
        for (int i9 = 0; i9 < s8; i9++) {
            aVar.put(arrayList.get(i9), arrayList2.get(i9));
        }
        return aVar;
    }

    public abstract <T extends Parcelable> T y();

    public final <T extends Parcelable> T z(T t8, int i8) {
        return !q(i8) ? t8 : y();
    }
}
