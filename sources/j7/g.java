package j7;

import j7.f;
import java.io.Serializable;
import p7.p;
import q7.k;

public final class g implements f, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public static final g f5052f = new g();

    public final <E extends f.b> E d(f.c<E> cVar) {
        k.e(cVar, "key");
        return null;
    }

    public final f g(f.c<?> cVar) {
        k.e(cVar, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    public final <R> R q(R r, p<? super R, ? super f.b, ? extends R> pVar) {
        k.e(pVar, "operation");
        return r;
    }

    public final f t(f fVar) {
        k.e(fVar, "context");
        return fVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
