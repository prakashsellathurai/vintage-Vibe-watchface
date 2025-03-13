package y7;

import j7.f;
import p7.p;
import q7.k;

public final class v1 implements f.b, f.c<v1> {

    /* renamed from: f  reason: collision with root package name */
    public static final v1 f8620f = new v1();

    public final <E extends f.b> E d(f.c<E> cVar) {
        return f.b.a.a(this, cVar);
    }

    public final f g(f.c<?> cVar) {
        return f.b.a.b(this, cVar);
    }

    public final f.c<?> getKey() {
        return this;
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
