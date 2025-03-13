package y7;

import a1.a;
import d8.g;
import h7.c;
import j7.d;
import java.util.concurrent.CancellationException;
import q7.k;

public abstract class k0<T> extends g {

    /* renamed from: h  reason: collision with root package name */
    public int f8578h;

    public k0(int i8) {
        this.f8578h = i8;
    }

    public void c(Object obj, CancellationException cancellationException) {
    }

    public abstract d<T> d();

    public Throwable f(Object obj) {
        q qVar = obj instanceof q ? (q) obj : null;
        if (qVar != null) {
            return qVar.f8593a;
        }
        return null;
    }

    public <T> T g(Object obj) {
        return obj;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                a.f(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            k.b(th);
            y.a(d().a(), new c("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object j();

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r4.l0() != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0092, code lost:
        if (r4.l0() != false) goto L_0x0094;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050 A[Catch:{ all -> 0x005c, all -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e A[Catch:{ all -> 0x005c, all -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070 A[SYNTHETIC, Splitter:B:29:0x0070] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            d8.h r0 = r12.f4152g
            j7.d r1 = r12.d()     // Catch:{ all -> 0x0098 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            q7.k.c(r1, r2)     // Catch:{ all -> 0x0098 }
            c8.f r1 = (c8.f) r1     // Catch:{ all -> 0x0098 }
            j7.d<T> r2 = r1.f2841j     // Catch:{ all -> 0x0098 }
            java.lang.Object r1 = r1.f2843l     // Catch:{ all -> 0x0098 }
            j7.f r3 = r2.a()     // Catch:{ all -> 0x0098 }
            java.lang.Object r1 = c8.t.b(r3, r1)     // Catch:{ all -> 0x0098 }
            h2.d r4 = c8.t.f2871a     // Catch:{ all -> 0x0098 }
            r5 = 0
            if (r1 == r4) goto L_0x0023
            y7.u1 r4 = y7.u.b(r2, r3, r1)     // Catch:{ all -> 0x0098 }
            goto L_0x0024
        L_0x0023:
            r4 = r5
        L_0x0024:
            j7.f r6 = r2.a()     // Catch:{ all -> 0x005c }
            java.lang.Object r7 = r12.j()     // Catch:{ all -> 0x005c }
            java.lang.Throwable r8 = r12.f(r7)     // Catch:{ all -> 0x005c }
            if (r8 != 0) goto L_0x0047
            int r9 = r12.f8578h     // Catch:{ all -> 0x005c }
            r10 = 1
            if (r9 == r10) goto L_0x003c
            r11 = 2
            if (r9 != r11) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r10 = 0
        L_0x003c:
            if (r10 == 0) goto L_0x0047
            y7.z0$b r9 = y7.z0.b.f8628f     // Catch:{ all -> 0x005c }
            j7.f$b r6 = r6.d(r9)     // Catch:{ all -> 0x005c }
            y7.z0 r6 = (y7.z0) r6     // Catch:{ all -> 0x005c }
            goto L_0x0048
        L_0x0047:
            r6 = r5
        L_0x0048:
            if (r6 == 0) goto L_0x005e
            boolean r9 = r6.c()     // Catch:{ all -> 0x005c }
            if (r9 != 0) goto L_0x005e
            java.util.concurrent.CancellationException r6 = r6.D()     // Catch:{ all -> 0x005c }
            r12.c(r7, r6)     // Catch:{ all -> 0x005c }
            java.lang.Object r6 = a1.a.q(r6)     // Catch:{ all -> 0x005c }
            goto L_0x0069
        L_0x005c:
            r2 = move-exception
            goto L_0x008c
        L_0x005e:
            if (r8 == 0) goto L_0x0065
            java.lang.Object r6 = a1.a.q(r8)     // Catch:{ all -> 0x005c }
            goto L_0x0069
        L_0x0065:
            java.lang.Object r6 = r12.g(r7)     // Catch:{ all -> 0x005c }
        L_0x0069:
            r2.i(r6)     // Catch:{ all -> 0x005c }
            h7.h r2 = h7.h.f4787a     // Catch:{ all -> 0x005c }
            if (r4 == 0) goto L_0x0076
            boolean r2 = r4.l0()     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x0079
        L_0x0076:
            c8.t.a(r3, r1)     // Catch:{ all -> 0x0098 }
        L_0x0079:
            r0.b()     // Catch:{ all -> 0x007f }
            h7.h r0 = h7.h.f4787a     // Catch:{ all -> 0x007f }
            goto L_0x0084
        L_0x007f:
            r0 = move-exception
            java.lang.Object r0 = a1.a.q(r0)
        L_0x0084:
            java.lang.Throwable r0 = h7.e.a(r0)
            r12.h(r5, r0)
            goto L_0x00ab
        L_0x008c:
            if (r4 == 0) goto L_0x0094
            boolean r4 = r4.l0()     // Catch:{ all -> 0x0098 }
            if (r4 == 0) goto L_0x0097
        L_0x0094:
            c8.t.a(r3, r1)     // Catch:{ all -> 0x0098 }
        L_0x0097:
            throw r2     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r1 = move-exception
            r0.b()     // Catch:{ all -> 0x009f }
            h7.h r0 = h7.h.f4787a     // Catch:{ all -> 0x009f }
            goto L_0x00a4
        L_0x009f:
            r0 = move-exception
            java.lang.Object r0 = a1.a.q(r0)
        L_0x00a4:
            java.lang.Throwable r0 = h7.e.a(r0)
            r12.h(r1, r0)
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.k0.run():void");
    }
}
