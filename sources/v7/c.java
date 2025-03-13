package v7;

import java.util.Iterator;
import p7.p;
import q7.k;

public final class c<T1, T2, V> implements d<V> {

    /* renamed from: a  reason: collision with root package name */
    public final d<T1> f7958a;

    /* renamed from: b  reason: collision with root package name */
    public final d<T2> f7959b;

    /* renamed from: c  reason: collision with root package name */
    public final p<T1, T2, V> f7960c;

    public static final class a implements Iterator<V> {

        /* renamed from: f  reason: collision with root package name */
        public final Iterator<T1> f7961f;

        /* renamed from: g  reason: collision with root package name */
        public final Iterator<T2> f7962g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ c<T1, T2, V> f7963h;

        public a(c<T1, T2, V> cVar) {
            this.f7963h = cVar;
            this.f7961f = cVar.f7958a.iterator();
            this.f7962g = cVar.f7959b.iterator();
        }

        public final boolean hasNext() {
            return this.f7961f.hasNext() && this.f7962g.hasNext();
        }

        public final V next() {
            return this.f7963h.f7960c.g(this.f7961f.next(), this.f7962g.next());
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(d dVar, d dVar2, g gVar) {
        k.e(gVar, "transform");
        this.f7958a = dVar;
        this.f7959b = dVar2;
        this.f7960c = gVar;
    }

    public final Iterator<V> iterator() {
        return new a(this);
    }
}
