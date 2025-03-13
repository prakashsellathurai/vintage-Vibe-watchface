package y7;

import c8.q;
import c8.t;
import h7.d;
import h7.h;
import j7.f;
import k3.j;

public final class u1<T> extends q<T> {

    /* renamed from: j  reason: collision with root package name */
    public final ThreadLocal<d<f, Object>> f8617j;
    private volatile boolean threadLocalIsSet;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u1(j7.d r3, j7.f r4) {
        /*
            r2 = this;
            y7.v1 r0 = y7.v1.f8620f
            j7.f$b r1 = r4.d(r0)
            if (r1 != 0) goto L_0x000d
            j7.f r0 = r4.t(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r4
        L_0x000e:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f8617j = r0
            j7.f r3 = r3.a()
            j7.e$a r0 = j7.e.a.f5050f
            j7.f$b r3 = r3.d(r0)
            boolean r3 = r3 instanceof y7.w
            if (r3 != 0) goto L_0x0031
            r3 = 0
            java.lang.Object r3 = c8.t.b(r4, r3)
            c8.t.a(r4, r3)
            r2.m0(r4, r3)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y7.u1.<init>(j7.d, j7.f):void");
    }

    public final void j0(Object obj) {
        if (this.threadLocalIsSet) {
            d dVar = this.f8617j.get();
            if (dVar != null) {
                t.a((f) dVar.f4781f, dVar.f4782g);
            }
            this.f8617j.remove();
        }
        Object W = j.W(obj);
        j7.d<T> dVar2 = this.f2867i;
        f a9 = dVar2.a();
        u1<?> u1Var = null;
        Object b9 = t.b(a9, u1Var);
        if (b9 != t.f2871a) {
            u1Var = u.b(dVar2, a9, b9);
        }
        try {
            this.f2867i.i(W);
            h hVar = h.f4787a;
        } finally {
            if (u1Var == null || u1Var.l0()) {
                t.a(a9, b9);
            }
        }
    }

    public final boolean l0() {
        boolean z8 = this.threadLocalIsSet && this.f8617j.get() == null;
        this.f8617j.remove();
        return !z8;
    }

    public final void m0(f fVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f8617j.set(new d(fVar, obj));
    }
}
