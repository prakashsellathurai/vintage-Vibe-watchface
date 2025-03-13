package e3;

import java.lang.reflect.InvocationTargetException;

@Deprecated
public final class e {
    public static c a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof c) {
                    return (c) newInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + newInstance);
            } catch (InstantiationException e) {
                b(cls, e);
                throw null;
            } catch (IllegalAccessException e4) {
                b(cls, e4);
                throw null;
            } catch (NoSuchMethodException e9) {
                b(cls, e9);
                throw null;
            } catch (InvocationTargetException e10) {
                b(cls, e10);
                throw null;
            }
        } catch (ClassNotFoundException e11) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e11);
        }
    }

    public static void b(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }
}
