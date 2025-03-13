package y7;

import a1.a;
import h7.h;
import j7.d;
import j7.e;
import j7.f;

public final class h0 {
    public static final Object a(long j8, d<? super h> dVar) {
        if (j8 <= 0) {
            return h.f4787a;
        }
        h hVar = new h(1, a.x(dVar));
        hVar.v();
        if (j8 < Long.MAX_VALUE) {
            b(hVar.f8573j).a(j8, hVar);
        }
        Object u8 = hVar.u();
        return u8 == k7.a.f5217f ? u8 : h.f4787a;
    }

    public static final g0 b(f fVar) {
        int i8 = e.f5049d;
        f.b d9 = fVar.d(e.a.f5050f);
        g0 g0Var = d9 instanceof g0 ? (g0) d9 : null;
        return g0Var == null ? d0.f8554a : g0Var;
    }
}
