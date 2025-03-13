package y2;

import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

public final class l {
    public static final File e = new File("/proc/self/fd");

    /* renamed from: f  reason: collision with root package name */
    public static volatile l f8368f;

    /* renamed from: g  reason: collision with root package name */
    public static volatile int f8369g = -1;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8370a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8371b;

    /* renamed from: c  reason: collision with root package name */
    public int f8372c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8373d = true;

    public l() {
        new AtomicBoolean(false);
        this.f8370a = true;
        this.f8371b = 20000;
    }

    public final boolean a(int i8, int i9, boolean z8, boolean z9) {
        boolean z10;
        if (!z8) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (!this.f8370a) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (z9) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (i8 < 0) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else if (i9 < 0) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        } else {
            synchronized (this) {
                int i10 = this.f8372c + 1;
                this.f8372c = i10;
                if (i10 >= 50) {
                    this.f8372c = 0;
                    int length = e.list().length;
                    long j8 = (long) (f8369g != -1 ? f8369g : this.f8371b);
                    boolean z11 = ((long) length) < j8;
                    this.f8373d = z11;
                    if (!z11 && Log.isLoggable("Downsampler", 5)) {
                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j8);
                    }
                }
                z10 = this.f8373d;
            }
            if (z10) {
                return true;
            }
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
    }
}
