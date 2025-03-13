package y7;

import h7.h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p7.l;

public final class y0 extends b1 {

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8626k = AtomicIntegerFieldUpdater.newUpdater(y0.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: j  reason: collision with root package name */
    public final l<Throwable, h> f8627j;

    public y0(d1 d1Var) {
        this.f8627j = d1Var;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        n((Throwable) obj);
        return h.f4787a;
    }

    public final void n(Throwable th) {
        if (f8626k.compareAndSet(this, 0, 1)) {
            this.f8627j.invoke(th);
        }
    }
}
