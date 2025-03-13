package v1;

import android.os.Trace;
import java.io.Closeable;
import q7.k;

public final class a implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    public static final Object f7836h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static int f7837i;

    /* renamed from: f  reason: collision with root package name */
    public final String f7838f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7839g;

    /* renamed from: v1.a$a  reason: collision with other inner class name */
    public static final class C0143a {
        public static final void a(String str, int i8) {
            k.e(str, "traceName");
            Trace.beginAsyncSection(str, i8);
        }

        public static final void b(String str, int i8) {
            k.e(str, "traceName");
            Trace.endAsyncSection(str, i8);
        }
    }

    public a(String str) {
        int i8;
        this.f7838f = str;
        synchronized (f7836h) {
            i8 = f7837i;
            f7837i = i8 + 1;
        }
        this.f7839g = i8;
        C0143a.a(str, i8);
    }

    public final void close() {
        C0143a.b(this.f7838f, this.f7839g);
    }
}
