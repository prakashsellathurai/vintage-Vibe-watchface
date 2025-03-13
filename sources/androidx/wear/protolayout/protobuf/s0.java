package androidx.wear.protolayout.protobuf;

import androidx.wear.protolayout.protobuf.a0;
import androidx.wear.protolayout.protobuf.r;
import java.util.Iterator;
import java.util.Map;

public final class s0<T> implements b1<T> {

    /* renamed from: a  reason: collision with root package name */
    public final o0 f2194a;

    /* renamed from: b  reason: collision with root package name */
    public final h1<?, ?> f2195b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2196c;

    /* renamed from: d  reason: collision with root package name */
    public final o<?> f2197d;

    public s0(h1<?, ?> h1Var, o<?> oVar, o0 o0Var) {
        this.f2195b = h1Var;
        this.f2196c = oVar.e(o0Var);
        this.f2197d = oVar;
        this.f2194a = o0Var;
    }

    public final void a(T t8, T t9) {
        Class<?> cls = c1.f2063a;
        h1<?, ?> h1Var = this.f2195b;
        h1Var.o(t8, h1Var.k(h1Var.g(t8), h1Var.g(t9)));
        if (this.f2196c) {
            c1.A(this.f2197d, t8, t9);
        }
    }

    public final void b(T t8) {
        this.f2195b.j(t8);
        this.f2197d.f(t8);
    }

    public final boolean c(T t8) {
        return this.f2197d.c(t8).j();
    }

    public final boolean d(T t8, T t9) {
        h1<?, ?> h1Var = this.f2195b;
        if (!h1Var.g(t8).equals(h1Var.g(t9))) {
            return false;
        }
        if (!this.f2196c) {
            return true;
        }
        o<?> oVar = this.f2197d;
        return oVar.c(t8).equals(oVar.c(t9));
    }

    public final int e(T t8) {
        e1<T, Object> e1Var;
        h1<?, ?> h1Var = this.f2195b;
        int i8 = 0;
        int i9 = h1Var.i(h1Var.g(t8)) + 0;
        if (!this.f2196c) {
            return i9;
        }
        r<?> c9 = this.f2197d.c(t8);
        int i10 = 0;
        while (true) {
            e1Var = c9.f2169a;
            if (i8 >= e1Var.d()) {
                break;
            }
            i10 += r.g(e1Var.c(i8));
            i8++;
        }
        for (Map.Entry<T, Object> g9 : e1Var.e()) {
            i10 += r.g(g9);
        }
        return i9 + i10;
    }

    public final T f() {
        o0 o0Var = this.f2194a;
        return o0Var instanceof v ? (v) ((v) o0Var).k() : o0Var.newBuilderForType().d();
    }

    public final int g(T t8) {
        int hashCode = this.f2195b.g(t8).hashCode();
        return this.f2196c ? (hashCode * 53) + this.f2197d.c(t8).hashCode() : hashCode;
    }

    public final void h(T t8, a1 a1Var, n nVar) {
        i iVar;
        h1<?, ?> h1Var = this.f2195b;
        Object f9 = h1Var.f(t8);
        o<?> oVar = this.f2197d;
        r<?> d9 = oVar.d(t8);
        do {
            try {
                iVar = (i) a1Var;
                if (iVar.a() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                h1Var.n(t8, f9);
            }
        } while (j(iVar, nVar, oVar, d9, h1Var, f9));
    }

    public final void i(Object obj, k kVar) {
        Iterator<Map.Entry<?, Object>> l8 = this.f2197d.c(obj).l();
        while (l8.hasNext()) {
            Map.Entry next = l8.next();
            r.a aVar = (r.a) next.getKey();
            if (aVar.c() == o1.MESSAGE) {
                aVar.a();
                aVar.d();
                boolean z8 = next instanceof a0.a;
                aVar.getNumber();
                kVar.l(0, z8 ? ((a0.a) next).f2057f.getValue().b() : next.getValue());
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        h1<?, ?> h1Var = this.f2195b;
        h1Var.r(h1Var.g(obj), kVar);
    }

    public final <UT, UB, ET extends r.a<ET>> boolean j(a1 a1Var, n nVar, o<ET> oVar, r<ET> rVar, h1<UT, UB> h1Var, UB ub) {
        i iVar = (i) a1Var;
        int i8 = iVar.f2115b;
        o0 o0Var = this.f2194a;
        if (i8 == 11) {
            Object obj = null;
            int i9 = 0;
            g gVar = null;
            while (iVar.a() != Integer.MAX_VALUE) {
                int i10 = iVar.f2115b;
                if (i10 == 16) {
                    iVar.v(0);
                    i9 = iVar.f2114a.w();
                    obj = oVar.b(nVar, o0Var, i9);
                } else if (i10 == 26) {
                    if (obj != null) {
                        oVar.h(obj);
                    } else {
                        gVar = iVar.e();
                    }
                } else if (!iVar.w()) {
                    break;
                }
            }
            if (iVar.f2115b == 12) {
                if (gVar != null) {
                    if (obj != null) {
                        oVar.i(obj);
                    } else {
                        h1Var.d(ub, i9, gVar);
                    }
                }
                return true;
            }
            throw new y("Protocol message end-group tag did not match expected tag.");
        } else if ((i8 & 7) != 2) {
            return iVar.w();
        } else {
            Object b9 = oVar.b(nVar, o0Var, i8 >>> 3);
            if (b9 == null) {
                return h1Var.l(ub, a1Var);
            }
            oVar.h(b9);
            return true;
        }
    }
}
