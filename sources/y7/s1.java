package y7;

import c8.q;
import j7.d;

public final class s1<U, T extends U> extends q<T> implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    public final long f8611j;

    public s1(long j8, d<? super U> dVar) {
        super(dVar, dVar.a());
        this.f8611j = j8;
    }

    public final String Z() {
        return super.Z() + "(timeMillis=" + this.f8611j + ')';
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        if (r0 == null) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            j7.f r0 = r10.f8544h
            y7.g0 r0 = y7.h0.b(r0)
            boolean r1 = r0 instanceof y7.i0
            if (r1 == 0) goto L_0x000d
            y7.i0 r0 = (y7.i0) r0
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            long r1 = r10.f8611j
            if (r0 == 0) goto L_0x0069
            int r3 = x7.a.f8208f
            x7.c r3 = x7.c.MILLISECONDS
            java.lang.String r4 = "unit"
            q7.k.e(r3, r4)
            x7.c r4 = x7.c.NANOSECONDS
            java.lang.String r5 = "sourceUnit"
            q7.k.e(r4, r5)
            java.util.concurrent.TimeUnit r5 = r4.f8213f
            java.util.concurrent.TimeUnit r3 = r3.f8213f
            r6 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            long r5 = r3.convert(r6, r5)
            t7.f r7 = new t7.f
            long r8 = -r5
            r7.<init>(r8, r5)
            int r5 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0041
            long r5 = r7.f7543g
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0041
            r5 = 1
            goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            if (r5 == 0) goto L_0x004c
            java.util.concurrent.TimeUnit r4 = r4.f8213f
            r4.convert(r1, r3)
            int r3 = x7.b.f8209a
            goto L_0x0063
        L_0x004c:
            long r3 = r3.convert(r1, r3)
            r5 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x005a
            goto L_0x0061
        L_0x005a:
            r5 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
        L_0x0061:
            int r3 = x7.b.f8209a
        L_0x0063:
            java.lang.String r0 = r0.F()
            if (r0 != 0) goto L_0x007c
        L_0x0069:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Timed out waiting for "
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r1 = " ms"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x007c:
            y7.r1 r1 = new y7.r1
            r1.<init>(r0, r10)
            r10.y(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.s1.run():void");
    }
}
