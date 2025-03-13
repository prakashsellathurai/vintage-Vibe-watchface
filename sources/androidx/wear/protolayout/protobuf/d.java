package androidx.wear.protolayout.protobuf;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f2067a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f2068b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f2067a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f2068b = cls2 != null;
    }

    public static boolean a() {
        return f2067a != null && !f2068b;
    }
}
