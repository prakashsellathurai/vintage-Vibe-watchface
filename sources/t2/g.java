package t2;

import p2.e;
import r2.m;
import r2.v;
import t2.h;

public final class g extends k3.g<e, v<?>> implements h {

    /* renamed from: d  reason: collision with root package name */
    public h.a f7477d;

    public g(long j8) {
        super(j8);
    }

    public final int b(Object obj) {
        v vVar = (v) obj;
        if (vVar == null) {
            return 1;
        }
        return vVar.b();
    }

    public final void c(Object obj, Object obj2) {
        e eVar = (e) obj;
        v vVar = (v) obj2;
        h.a aVar = this.f7477d;
        if (aVar != null && vVar != null) {
            ((m) aVar).e.a(vVar, true);
        }
    }
}
