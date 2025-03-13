package y7;

import h7.e;
import j7.d;
import j7.f;
import k3.j;
import y7.z0;

public abstract class a<T> extends e1 implements d<T>, z {

    /* renamed from: h  reason: collision with root package name */
    public final f f8544h;

    public a(f fVar, boolean z8) {
        super(z8);
        U((z0) fVar.d(z0.b.f8628f));
        this.f8544h = fVar.t(this);
    }

    public final String E() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public final void T(Throwable th) {
        y.a(this.f8544h, th);
    }

    public String Z() {
        return super.Z();
    }

    public final f a() {
        return this.f8544h;
    }

    public final boolean c() {
        return super.c();
    }

    public final void c0(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            Throwable th = qVar.f8593a;
            qVar.getClass();
            q.f8592b.get(qVar);
        }
    }

    public final f f() {
        return this.f8544h;
    }

    public final void i(Object obj) {
        Throwable a9 = e.a(obj);
        if (a9 != null) {
            obj = new q(a9, false);
        }
        Object Y = Y(obj);
        if (Y != j.Q) {
            j0(Y);
        }
    }

    public void j0(Object obj) {
        r(obj);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [int, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> void k0(java.lang.Object r4, R r5, p7.p<? super R, ? super j7.d<? super T>, ? extends java.lang.Object> r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0064
            int r4 = r4 + -1
            if (r4 == 0) goto L_0x004d
            r1 = 1
            if (r4 == r1) goto L_0x005a
            r1 = 2
            if (r4 == r1) goto L_0x003a
            r2 = 3
            if (r4 != r2) goto L_0x0034
            j7.f r4 = r3.f8544h     // Catch:{ all -> 0x0025 }
            java.lang.Object r0 = c8.t.b(r4, r0)     // Catch:{ all -> 0x0025 }
            q7.s.a(r1, r6)     // Catch:{ all -> 0x0027 }
            java.lang.Object r5 = r6.g(r5, r3)     // Catch:{ all -> 0x0027 }
            c8.t.a(r4, r0)     // Catch:{ all -> 0x0025 }
            k7.a r4 = k7.a.f5217f
            if (r5 == r4) goto L_0x005a
            goto L_0x0030
        L_0x0025:
            r4 = move-exception
            goto L_0x002c
        L_0x0027:
            r5 = move-exception
            c8.t.a(r4, r0)     // Catch:{ all -> 0x0025 }
            throw r5     // Catch:{ all -> 0x0025 }
        L_0x002c:
            java.lang.Object r5 = a1.a.q(r4)
        L_0x0030:
            r3.i(r5)
            goto L_0x005a
        L_0x0034:
            c1.c r3 = new c1.c
            r3.<init>()
            throw r3
        L_0x003a:
            java.lang.String r4 = "<this>"
            q7.k.e(r6, r4)
            j7.d r3 = a1.a.p(r5, r3, r6)
            j7.d r3 = a1.a.x(r3)
            h7.h r4 = h7.h.f4787a
            r3.i(r4)
            goto L_0x005a
        L_0x004d:
            j7.d r4 = a1.a.p(r5, r3, r6)     // Catch:{ all -> 0x005b }
            j7.d r4 = a1.a.x(r4)     // Catch:{ all -> 0x005b }
            h7.h r5 = h7.h.f4787a     // Catch:{ all -> 0x005b }
            a1.a.E(r5, r4, r0)     // Catch:{ all -> 0x005b }
        L_0x005a:
            return
        L_0x005b:
            r4 = move-exception
            java.lang.Object r5 = a1.a.q(r4)
            r3.i(r5)
            throw r4
        L_0x0064:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.a.k0(int, java.lang.Object, p7.p):void");
    }
}
