package q7;

import h7.g;
import java.util.Arrays;

public final class k {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            f(k.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str);
            f(k.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
            f(k.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Class<k> cls = k.class;
            String name = cls.getName();
            int i8 = 0;
            while (!stackTrace[i8].getClassName().equals(name)) {
                i8++;
            }
            while (stackTrace[i8].getClassName().equals(name)) {
                i8++;
            }
            StackTraceElement stackTraceElement = stackTrace[i8];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str);
            f(cls.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static void f(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i8 = -1;
        for (int i9 = 0; i9 < length; i9++) {
            if (str.equals(stackTrace[i9].getClassName())) {
                i8 = i9;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i8 + 1, length));
    }

    public static void g() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void h(String str) {
        g gVar = new g("lateinit property " + str + " has not been initialized");
        f(k.class.getName(), gVar);
        throw gVar;
    }
}
