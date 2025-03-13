package v7;

import java.util.Iterator;
import p7.l;
import q7.k;

public final class i<T, R> implements d<R> {

    /* renamed from: a  reason: collision with root package name */
    public final d<T> f7966a;

    /* renamed from: b  reason: collision with root package name */
    public final l<T, R> f7967b;

    public static final class a implements Iterator<R> {

        /* renamed from: f  reason: collision with root package name */
        public final Iterator<T> f7968f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ i<T, R> f7969g;

        public a(i<T, R> iVar) {
            this.f7969g = iVar;
            this.f7968f = iVar.f7966a.iterator();
        }

        public final boolean hasNext() {
            return this.f7968f.hasNext();
        }

        public final R next() {
            return this.f7969g.f7967b.invoke(this.f7968f.next());
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public i(d<? extends T> dVar, l<? super T, ? extends R> lVar) {
        k.e(lVar, "transformer");
        this.f7966a = dVar;
        this.f7967b = lVar;
    }

    public final Iterator<R> iterator() {
        return new a(this);
    }
}
