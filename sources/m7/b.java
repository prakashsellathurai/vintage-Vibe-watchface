package m7;

import n7.a;
import q7.k;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5468a;

    static {
        a aVar;
        Object newInstance;
        a newInstance2;
        Object newInstance3;
        o7.a newInstance4;
        Class<a> cls = a.class;
        try {
            newInstance4 = o7.a.class.newInstance();
            k.d(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
            aVar = newInstance4;
        } catch (ClassCastException e) {
            ClassLoader classLoader = newInstance4.getClass().getClassLoader();
            ClassLoader classLoader2 = cls.getClassLoader();
            if (!k.a(classLoader, classLoader2)) {
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
            }
            throw e;
        } catch (ClassNotFoundException unused) {
            try {
                newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                k.d(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                aVar = (a) newInstance3;
            } catch (ClassCastException e4) {
                ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                ClassLoader classLoader4 = cls.getClassLoader();
                if (!k.a(classLoader3, classLoader4)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e4);
                }
                throw e4;
            } catch (ClassNotFoundException unused2) {
                try {
                    newInstance2 = a.class.newInstance();
                    k.d(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                    aVar = newInstance2;
                } catch (ClassCastException e9) {
                    ClassLoader classLoader5 = newInstance2.getClass().getClassLoader();
                    ClassLoader classLoader6 = cls.getClassLoader();
                    if (!k.a(classLoader5, classLoader6)) {
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e9);
                    }
                    throw e9;
                } catch (ClassNotFoundException unused3) {
                    try {
                        newInstance = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                        k.d(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                        aVar = (a) newInstance;
                    } catch (ClassCastException e10) {
                        ClassLoader classLoader7 = newInstance.getClass().getClassLoader();
                        ClassLoader classLoader8 = cls.getClassLoader();
                        if (!k.a(classLoader7, classLoader8)) {
                            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e10);
                        }
                        throw e10;
                    } catch (ClassNotFoundException unused4) {
                        aVar = new a();
                    }
                }
            }
        }
        f5468a = aVar;
    }
}
