package j7;

import j7.f;
import p7.p;
import q7.k;

public abstract class a implements f.b {

    /* renamed from: f  reason: collision with root package name */
    public final f.c<?> f5043f;

    public a(f.c<?> cVar) {
        this.f5043f = cVar;
    }

    public <E extends f.b> E d(f.c<E> cVar) {
        return f.b.a.a(this, cVar);
    }

    public f g(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    public final f.c<?> getKey() {
        return this.f5043f;
    }

    public final <R> R q(R r, p<? super R, ? super f.b, ? extends R> pVar) {
        k.e(pVar, "operation");
        return pVar.g(r, this);
    }

    public final f t(f fVar) {
        k.e(fVar, "context");
        return f.a.a(this, fVar);
    }
}
