package com.google.protobuf;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f3615a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f3616b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f3615a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f3616b = cls2 != null;
    }

    public static boolean a() {
        return f3615a != null && !f3616b;
    }
}
