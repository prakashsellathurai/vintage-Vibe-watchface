package j7;

import j7.f;
import j7.f.b;
import p7.l;
import q7.k;

public abstract class b<B extends f.b, E extends B> implements f.c<E> {

    /* renamed from: f  reason: collision with root package name */
    public final l<f.b, E> f5044f;

    /* renamed from: g  reason: collision with root package name */
    public final f.c<?> f5045g;

    public b(f.c<B> cVar, l<? super f.b, ? extends E> lVar) {
        k.e(cVar, "baseKey");
        k.e(lVar, "safeCast");
        this.f5044f = lVar;
        this.f5045g = cVar instanceof b ? ((b) cVar).f5045g : cVar;
    }
}
