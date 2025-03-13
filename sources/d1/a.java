package d1;

import android.annotation.SuppressLint;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static long f3975a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f3976b;

    @SuppressLint({"NewApi"})
    public static boolean a() {
        try {
            if (f3976b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        Class<Trace> cls = Trace.class;
        try {
            if (f3976b == null) {
                f3975a = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                f3976b = cls.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f3976b.invoke((Object) null, new Object[]{Long.valueOf(f3975a)})).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
