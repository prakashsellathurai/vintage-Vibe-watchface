package j7;

import j7.f;
import java.io.Serializable;
import p7.p;
import q7.k;
import q7.l;

public final class c implements f, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final f f5046f;

    /* renamed from: g  reason: collision with root package name */
    public final f.b f5047g;

    public static final class a extends l implements p<String, f.b, String> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f5048f = new a();

        public a() {
            super(2);
        }

        public final Object g(Object obj, Object obj2) {
            String str = (String) obj;
            f.b bVar = (f.b) obj2;
            k.e(str, "acc");
            k.e(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(f.b bVar, f fVar) {
        k.e(fVar, "left");
        k.e(bVar, "element");
        this.f5046f = fVar;
        this.f5047g = bVar;
    }

    public final <E extends f.b> E d(f.c<E> cVar) {
        k.e(cVar, "key");
        while (true) {
            E d9 = this.f5047g.d(cVar);
            if (d9 != null) {
                return d9;
            }
            f fVar = this.f5046f;
            if (!(fVar instanceof c)) {
                return fVar.d(cVar);
            }
            this = (c) fVar;
        }
    }

    public final boolean equals(Object obj) {
        boolean z8;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i8 = 2;
            c cVar2 = cVar;
            int i9 = 2;
            while (true) {
                f fVar = cVar2.f5046f;
                cVar2 = fVar instanceof c ? (c) fVar : null;
                if (cVar2 == null) {
                    break;
                }
                i9++;
            }
            c cVar3 = this;
            while (true) {
                f fVar2 = cVar3.f5046f;
                cVar3 = fVar2 instanceof c ? (c) fVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i8++;
            }
            if (i9 != i8) {
                return false;
            }
            while (true) {
                f.b bVar = this.f5047g;
                if (k.a(cVar.d(bVar.getKey()), bVar)) {
                    f fVar3 = this.f5046f;
                    if (!(fVar3 instanceof c)) {
                        k.c(fVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f.b bVar2 = (f.b) fVar3;
                        z8 = k.a(cVar.d(bVar2.getKey()), bVar2);
                        break;
                    }
                    this = (c) fVar3;
                } else {
                    z8 = false;
                    break;
                }
            }
            return z8;
        }
    }

    public final f g(f.c<?> cVar) {
        k.e(cVar, "key");
        f.b bVar = this.f5047g;
        f.b d9 = bVar.d(cVar);
        f fVar = this.f5046f;
        if (d9 != null) {
            return fVar;
        }
        f g9 = fVar.g(cVar);
        return g9 == fVar ? this : g9 == g.f5052f ? bVar : new c(bVar, g9);
    }

    public final int hashCode() {
        return this.f5046f.hashCode() + this.f5047g.hashCode();
    }

    public final <R> R q(R r, p<? super R, ? super f.b, ? extends R> pVar) {
        k.e(pVar, "operation");
        return pVar.g(this.f5046f.q(r, pVar), this.f5047g);
    }

    public final f t(f fVar) {
        return f.a.a(this, fVar);
    }

    public final String toString() {
        return "[" + ((String) q("", a.f5048f)) + ']';
    }
}
