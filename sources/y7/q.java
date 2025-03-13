package y7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class q {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8592b = AtomicIntegerFieldUpdater.newUpdater(q.class, "_handled");
    private volatile int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f8593a;

    public q(Throwable th, boolean z8) {
        this.f8593a = th;
        this._handled = z8 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f8593a + ']';
    }
}
