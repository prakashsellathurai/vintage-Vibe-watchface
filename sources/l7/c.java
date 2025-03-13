package l7;

import j7.d;
import j7.e;
import j7.f;
import q7.k;

public abstract class c extends a {

    /* renamed from: g  reason: collision with root package name */
    public final f f5330g;

    /* renamed from: h  reason: collision with root package name */
    public transient d<Object> f5331h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(d<Object> dVar) {
        this(dVar, dVar != null ? dVar.a() : null);
    }

    public c(d<Object> dVar, f fVar) {
        super(dVar);
        this.f5330g = fVar;
    }

    public f a() {
        f fVar = this.f5330g;
        k.b(fVar);
        return fVar;
    }

    public void n() {
        d<Object> dVar = this.f5331h;
        if (!(dVar == null || dVar == this)) {
            f a9 = a();
            int i8 = e.f5049d;
            f.b d9 = a9.d(e.a.f5050f);
            k.b(d9);
            ((e) d9).v(dVar);
        }
        this.f5331h = b.f5329f;
    }
}
