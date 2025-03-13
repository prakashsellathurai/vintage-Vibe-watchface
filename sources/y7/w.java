package y7;

import j7.b;
import j7.d;
import j7.e;
import j7.f;
import j7.g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l7.c;
import q7.k;
import q7.l;

public abstract class w extends j7.a implements e {

    /* renamed from: g  reason: collision with root package name */
    public static final a f8621g = new a();

    public static final class a extends b<e, w> {

        /* renamed from: y7.w$a$a  reason: collision with other inner class name */
        public static final class C0157a extends l implements p7.l<f.b, w> {

            /* renamed from: f  reason: collision with root package name */
            public static final C0157a f8622f = new C0157a();

            public C0157a() {
                super(1);
            }

            public final Object invoke(Object obj) {
                f.b bVar = (f.b) obj;
                if (bVar instanceof w) {
                    return (w) bVar;
                }
                return null;
            }
        }

        public a() {
            super(e.a.f5050f, C0157a.f8622f);
        }
    }

    public w() {
        super(e.a.f5050f);
    }

    public abstract void N(f fVar, Runnable runnable);

    public boolean O() {
        return !(this instanceof t1);
    }

    public final <E extends f.b> E d(f.c<E> cVar) {
        f fVar;
        k.e(cVar, "key");
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            f.c<?> cVar2 = this.f5043f;
            k.e(cVar2, "key");
            if (!(cVar2 == bVar || bVar.f5045g == cVar2)) {
                return null;
            }
            f fVar2 = (f.b) bVar.f5044f.invoke(this);
            boolean z8 = fVar2 instanceof f.b;
            fVar = fVar2;
            if (!z8) {
                return null;
            }
        } else {
            this = this;
            if (e.a.f5050f != cVar) {
                fVar = null;
            }
        }
        return fVar;
    }

    public final f g(f.c<?> cVar) {
        k.e(cVar, "key");
        boolean z8 = cVar instanceof b;
        g gVar = g.f5052f;
        if (z8) {
            b bVar = (b) cVar;
            f.c<?> cVar2 = this.f5043f;
            k.e(cVar2, "key");
            if (!(cVar2 == bVar || bVar.f5045g == cVar2) || ((f.b) bVar.f5044f.invoke(this)) == null) {
                return this;
            }
        } else if (e.a.f5050f != cVar) {
            return this;
        }
        return gVar;
    }

    public final c8.f h(c cVar) {
        return new c8.f(this, cVar);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + b0.l(this);
    }

    public final void v(d<?> dVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c8.f fVar = (c8.f) dVar;
        do {
            atomicReferenceFieldUpdater = c8.f.f2839m;
        } while (atomicReferenceFieldUpdater.get(fVar) == a1.a.f30k);
        Object obj = atomicReferenceFieldUpdater.get(fVar);
        h hVar = obj instanceof h ? (h) obj : null;
        if (hVar != null) {
            hVar.r();
        }
    }
}
