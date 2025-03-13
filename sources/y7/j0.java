package y7;

import c8.q;
import j7.d;
import j7.f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class j0<T> extends q<T> {

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8577j = AtomicIntegerFieldUpdater.newUpdater(j0.class, "_decision");
    private volatile int _decision;

    public j0(d dVar, f fVar) {
        super(dVar, fVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j0(java.lang.Object r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f8577j
            int r1 = r0.get(r4)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0019
            if (r1 != r3) goto L_0x000d
            goto L_0x0021
        L_0x000d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already resumed"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0019:
            r1 = 2
            boolean r0 = r0.compareAndSet(r4, r2, r1)
            if (r0 == 0) goto L_0x0000
            r2 = r3
        L_0x0021:
            if (r2 == 0) goto L_0x0024
            return
        L_0x0024:
            j7.d<T> r4 = r4.f2867i
            j7.d r4 = a1.a.x(r4)
            java.lang.Object r5 = k3.j.W(r5)
            r0 = 0
            a1.a.E(r5, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.j0.j0(java.lang.Object):void");
    }

    public final void r(Object obj) {
        j0(obj);
    }
}
