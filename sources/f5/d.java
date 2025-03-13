package f5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f4414a;

    static {
        Object obj;
        Method method = null;
        try {
            obj = Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            obj = null;
        }
        f4414a = obj;
        Class<Throwable> cls = Throwable.class;
        if (obj != null) {
            try {
                Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod("getStackTraceElement", new Class[]{cls, Integer.TYPE});
            } catch (ThreadDeath e4) {
                throw e4;
            } catch (Throwable unused2) {
            }
        }
        if (obj != null) {
            try {
                method = Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod("getStackTraceDepth", new Class[]{cls});
            } catch (ThreadDeath e9) {
                throw e9;
            } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused3) {
                return;
            } catch (Throwable unused4) {
            }
            if (method != null) {
                method.invoke(obj, new Object[]{new Throwable()});
            }
        }
    }

    public static void a(Exception exc) {
        if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        } else if (exc instanceof Error) {
            throw ((Error) exc);
        }
    }
}
