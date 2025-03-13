package d8;

import c8.s;
import java.util.concurrent.TimeUnit;
import y7.b0;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final String f4154a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f4155b = k3.j.d0("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: c  reason: collision with root package name */
    public static final int f4156c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f4157d = k3.j.e0("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
    public static final long e = TimeUnit.SECONDS.toNanos(k3.j.d0("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));

    /* renamed from: f  reason: collision with root package name */
    public static final e f4158f = e.f4149a;

    /* renamed from: g  reason: collision with root package name */
    public static final b0 f4159g = new b0(0);

    /* renamed from: h  reason: collision with root package name */
    public static final b0 f4160h = new b0(1);

    static {
        String str;
        int i8 = s.f2870a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f4154a = str;
        int i9 = s.f2870a;
        if (i9 < 2) {
            i9 = 2;
        }
        f4156c = k3.j.e0("kotlinx.coroutines.scheduler.core.pool.size", i9, 1, 0, 8);
    }
}
