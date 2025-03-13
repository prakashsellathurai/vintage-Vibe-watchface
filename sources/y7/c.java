package y7;

import j7.f;
import java.util.concurrent.locks.LockSupport;
import q7.k;

public final class c<T> extends a<T> {

    /* renamed from: i  reason: collision with root package name */
    public final Thread f8548i;

    /* renamed from: j  reason: collision with root package name */
    public final q0 f8549j;

    public c(f fVar, Thread thread, q0 q0Var) {
        super(fVar, true);
        this.f8548i = thread;
        this.f8549j = q0Var;
    }

    public final void r(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f8548i;
        if (!k.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
