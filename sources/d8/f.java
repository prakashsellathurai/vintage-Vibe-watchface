package d8;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import y7.u0;

public class f extends u0 {

    /* renamed from: h  reason: collision with root package name */
    public final a f4150h;

    public f(int i8, int i9, long j8, String str) {
        this.f4150h = new a(i8, i9, j8, str);
    }

    public final void N(j7.f fVar, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.f4126m;
        this.f4150h.c(runnable, j.f4159g, false);
    }
}
