package com.google.protobuf;

import com.google.protobuf.b0;
import java.nio.charset.Charset;
import java.util.List;

public final class k implements e1 {

    /* renamed from: a  reason: collision with root package name */
    public final j f3701a;

    /* renamed from: b  reason: collision with root package name */
    public int f3702b;

    /* renamed from: c  reason: collision with root package name */
    public int f3703c;

    /* renamed from: d  reason: collision with root package name */
    public int f3704d = 0;

    public k(j jVar) {
        Charset charset = a0.f3589a;
        if (jVar != null) {
            this.f3701a = jVar;
            jVar.f3677d = this;
            return;
        }
        throw new NullPointerException("input");
    }

    public final <T> T A(f1<T> f1Var, q qVar) {
        V(3);
        return R(f1Var, qVar);
    }

    public final i B() {
        V(2);
        return this.f3701a.l();
    }

    public final void C(List<Float> list) {
        int A;
        int A2;
        boolean z8 = list instanceof w;
        j jVar = this.f3701a;
        if (z8) {
            w wVar = (w) list;
            int i8 = this.f3702b & 7;
            if (i8 == 2) {
                int B = jVar.B();
                W(B);
                int d9 = jVar.d() + B;
                do {
                    wVar.j(jVar.q());
                } while (jVar.d() < d9);
            } else if (i8 == 5) {
                do {
                    wVar.j(jVar.q());
                    if (!jVar.e()) {
                        A2 = jVar.A();
                    } else {
                        return;
                    }
                } while (A2 == this.f3702b);
                this.f3704d = A2;
            } else {
                throw b0.d();
            }
        } else {
            int i9 = this.f3702b & 7;
            if (i9 == 2) {
                int B2 = jVar.B();
                W(B2);
                int d10 = jVar.d() + B2;
                do {
                    list.add(Float.valueOf(jVar.q()));
                } while (jVar.d() < d10);
            } else if (i9 == 5) {
                do {
                    list.add(Float.valueOf(jVar.q()));
                    if (!jVar.e()) {
                        A = jVar.A();
                    } else {
                        return;
                    }
                } while (A == this.f3702b);
                this.f3704d = A;
            } else {
                throw b0.d();
            }
        }
    }

    public final int D() {
        V(0);
        return this.f3701a.B();
    }

    public final int E() {
        V(0);
        return this.f3701a.r();
    }

    public final boolean F() {
        int i8;
        j jVar = this.f3701a;
        if (jVar.e() || (i8 = this.f3702b) == this.f3703c) {
            return false;
        }
        return jVar.D(i8);
    }

    public final int G() {
        V(5);
        return this.f3701a.u();
    }

    public final void H(List<i> list) {
        int A;
        if ((this.f3702b & 7) == 2) {
            do {
                list.add(B());
                j jVar = this.f3701a;
                if (!jVar.e()) {
                    A = jVar.A();
                } else {
                    return;
                }
            } while (A == this.f3702b);
            this.f3704d = A;
            return;
        }
        throw b0.d();
    }

    public final void I(List<Double> list) {
        int A;
        int A2;
        boolean z8 = list instanceof n;
        j jVar = this.f3701a;
        if (z8) {
            n nVar = (n) list;
            int i8 = this.f3702b & 7;
            if (i8 == 1) {
                do {
                    nVar.j(jVar.m());
                    if (!jVar.e()) {
                        A2 = jVar.A();
                    } else {
                        return;
                    }
                } while (A2 == this.f3702b);
                this.f3704d = A2;
            } else if (i8 == 2) {
                int B = jVar.B();
                X(B);
                int d9 = jVar.d() + B;
                do {
                    nVar.j(jVar.m());
                } while (jVar.d() < d9);
            } else {
                throw b0.d();
            }
        } else {
            int i9 = this.f3702b & 7;
            if (i9 == 1) {
                do {
                    list.add(Double.valueOf(jVar.m()));
                    if (!jVar.e()) {
                        A = jVar.A();
                    } else {
                        return;
                    }
                } while (A == this.f3702b);
                this.f3704d = A;
            } else if (i9 == 2) {
                int B2 = jVar.B();
                X(B2);
                int d10 = jVar.d() + B2;
                do {
                    list.add(Double.valueOf(jVar.m()));
                } while (jVar.d() < d10);
            } else {
                throw b0.d();
            }
        }
    }

    public final void J(List<Long> list) {
        int i8;
        int A;
        int A2;
        boolean z8 = list instanceof i0;
        j jVar = this.f3701a;
        if (z8) {
            i0 i0Var = (i0) list;
            int i9 = this.f3702b & 7;
            if (i9 == 0) {
                do {
                    i0Var.j(jVar.s());
                    if (!jVar.e()) {
                        A2 = jVar.A();
                    } else {
                        return;
                    }
                } while (A2 == this.f3702b);
                this.f3704d = A2;
                return;
            } else if (i9 == 2) {
                i8 = jVar.d() + jVar.B();
                do {
                    i0Var.j(jVar.s());
                } while (jVar.d() < i8);
            } else {
                throw b0.d();
            }
        } else {
            int i10 = this.f3702b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(jVar.s()));
                    if (!jVar.e()) {
                        A = jVar.A();
                    } else {
                        return;
                    }
                } while (A == this.f3702b);
                this.f3704d = A;
                return;
            } else if (i10 == 2) {
                i8 = jVar.d() + jVar.B();
                do {
                    list.add(Long.valueOf(jVar.s()));
                } while (jVar.d() < i8);
            } else {
                throw b0.d();
            }
        }
        U(i8);
    }

    public final void K(List<Long> list) {
        int A;
        int A2;
        boolean z8 = list instanceof i0;
        j jVar = this.f3701a;
        if (z8) {
            i0 i0Var = (i0) list;
            int i8 = this.f3702b & 7;
            if (i8 == 1) {
                do {
                    i0Var.j(jVar.v());
                    if (!jVar.e()) {
                        A2 = jVar.A();
                    } else {
                        return;
                    }
                } while (A2 == this.f3702b);
                this.f3704d = A2;
            } else if (i8 == 2) {
                int B = jVar.B();
                X(B);
                int d9 = jVar.d() + B;
                do {
                    i0Var.j(jVar.v());
                } while (jVar.d() < d9);
            } else {
                throw b0.d();
            }
        } else {
            int i9 = this.f3702b & 7;
            if (i9 == 1) {
                do {
                    list.add(Long.valueOf(jVar.v()));
                    if (!jVar.e()) {
                        A = jVar.A();
                    } else {
                        return;
                    }
                } while (A == this.f3702b);
                this.f3704d = A;
            } else if (i9 == 2) {
                int B2 = jVar.B();
                X(B2);
                int d10 = jVar.d() + B2;
                do {
                    list.add(Long.valueOf(jVar.v()));
                } while (jVar.d() < d10);
            } else {
                throw b0.d();
            }
        }
    }

    public final long L() {
        V(0);
        return this.f3701a.s();
    }

    public final String M() {
        V(2);
        return this.f3701a.z();
    }

    public final void N(List<Long> list) {
        int A;
        int A2;
        boolean z8 = list instanceof i0;
        j jVar = this.f3701a;
        if (z8) {
            i0 i0Var = (i0) list;
            int i8 = this.f3702b & 7;
            if (i8 == 1) {
                do {
                    i0Var.j(jVar.p());
                    if (!jVar.e()) {
                        A2 = jVar.A();
                    } else {
                        return;
                    }
                } while (A2 == this.f3702b);
                this.f3704d = A2;
            } else if (i8 == 2) {
                int B = jVar.B();
                X(B);
                int d9 = jVar.d() + B;
                do {
                    i0Var.j(jVar.p());
                } while (jVar.d() < d9);
            } else {
                throw b0.d();
            }
        } else {
            int i9 = this.f3702b & 7;
            if (i9 == 1) {
                do {
                    list.add(Long.valueOf(jVar.p()));
                    if (!jVar.e()) {
                        A = jVar.A();
                    } else {
                        return;
                    }
                } while (A == this.f3702b);
                this.f3704d = A;
            } else if (i9 == 2) {
                int B2 = jVar.B();
                X(B2);
                int d10 = jVar.d() + B2;
                do {
                    list.add(Long.valueOf(jVar.p()));
                } while (jVar.d() < d10);
            } else {
                throw b0.d();
            }
        }
    }

    public final void O(List<Integer> list) {
        int i8;
        int A;
        int A2;
        boolean z8 = list instanceof z;
        j jVar = this.f3701a;
        if (z8) {
            z zVar = (z) list;
            int i9 = this.f3702b & 7;
            if (i9 == 0) {
                do {
                    zVar.j(jVar.r());
                    if (!jVar.e()) {
                        A2 = jVar.A();
                    } else {
                        return;
                    }
                } while (A2 == this.f3702b);
                this.f3704d = A2;
                return;
            } else if (i9 == 2) {
                i8 = jVar.d() + jVar.B();
                do {
                    zVar.j(jVar.r());
                } while (jVar.d() < i8);
            } else {
                throw b0.d();
            }
        } else {
            int i10 = this.f3702b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(jVar.r()));
                    if (!jVar.e()) {
                        A = jVar.A();
                    } else {
                        return;
                    }
                } while (A == this.f3702b);
                this.f3704d = A;
                return;
            } else if (i10 == 2) {
                i8 = jVar.d() + jVar.B();
                do {
                    list.add(Integer.valueOf(jVar.r()));
                } while (jVar.d() < i8);
            } else {
                throw b0.d();
            }
        }
        U(i8);
    }

    public final void P(List<Integer> list) {
        int i8;
        int A;
        int A2;
        boolean z8 = list instanceof z;
        j jVar = this.f3701a;
        if (z8) {
            z zVar = (z) list;
            int i9 = this.f3702b & 7;
            if (i9 == 0) {
                do {
                    zVar.j(jVar.n());
                    if (!jVar.e()) {
                        A2 = jVar.A();
                    } else {
                        return;
                    }
                } while (A2 == this.f3702b);
                this.f3704d = A2;
                return;
            } else if (i9 == 2) {
                i8 = jVar.d() + jVar.B();
                do {
                    zVar.j(jVar.n());
                } while (jVar.d() < i8);
            } else {
                throw b0.d();
            }
        } else {
            int i10 = this.f3702b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(jVar.n()));
                    if (!jVar.e()) {
                        A = jVar.A();
                    } else {
                        return;
                    }
                } while (A == this.f3702b);
                this.f3704d = A;
                return;
            } else if (i10 == 2) {
                i8 = jVar.d() + jVar.B();
                do {
                    list.add(Integer.valueOf(jVar.n()));
                } while (jVar.d() < i8);
            } else {
                throw b0.d();
            }
        }
        U(i8);
    }

    public final Object Q(s1 s1Var, Class<?> cls, q qVar) {
        switch (s1Var.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(L());
            case 3:
                return Long.valueOf(d());
            case 4:
                return Integer.valueOf(E());
            case 5:
                return Long.valueOf(f());
            case 6:
                return Integer.valueOf(p());
            case 7:
                return Boolean.valueOf(r());
            case 8:
                return M();
            case 10:
                return m(cls, qVar);
            case 11:
                return B();
            case 12:
                return Integer.valueOf(D());
            case 13:
                return Integer.valueOf(c());
            case 14:
                return Integer.valueOf(G());
            case 15:
                return Long.valueOf(v());
            case 16:
                return Integer.valueOf(h());
            case 17:
                return Long.valueOf(k());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public final <T> T R(f1<T> f1Var, q qVar) {
        int i8 = this.f3703c;
        this.f3703c = ((this.f3702b >>> 3) << 3) | 4;
        try {
            T f9 = f1Var.f();
            f1Var.i(f9, this, qVar);
            f1Var.b(f9);
            if (this.f3702b == this.f3703c) {
                return f9;
            }
            throw b0.g();
        } finally {
            this.f3703c = i8;
        }
    }

    public final <T> T S(f1<T> f1Var, q qVar) {
        j jVar = this.f3701a;
        int B = jVar.B();
        if (jVar.f3674a < jVar.f3675b) {
            int j8 = jVar.j(B);
            T f9 = f1Var.f();
            jVar.f3674a++;
            f1Var.i(f9, this, qVar);
            f1Var.b(f9);
            jVar.a(0);
            jVar.f3674a--;
            jVar.i(j8);
            return f9;
        }
        throw new b0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final void T(List<String> list, boolean z8) {
        int A;
        int A2;
        if ((this.f3702b & 7) == 2) {
            boolean z9 = list instanceof g0;
            j jVar = this.f3701a;
            if (!z9 || z8) {
                do {
                    list.add(z8 ? M() : o());
                    if (!jVar.e()) {
                        A = jVar.A();
                    } else {
                        return;
                    }
                } while (A == this.f3702b);
                this.f3704d = A;
                return;
            }
            g0 g0Var = (g0) list;
            do {
                g0Var.h(B());
                if (!jVar.e()) {
                    A2 = jVar.A();
                } else {
                    return;
                }
            } while (A2 == this.f3702b);
            this.f3704d = A2;
            return;
        }
        throw b0.d();
    }

    public final void U(int i8) {
        if (this.f3701a.d() != i8) {
            throw b0.h();
        }
    }

    public final void V(int i8) {
        if ((this.f3702b & 7) != i8) {
            throw b0.d();
        }
    }

    public final void W(int i8) {
        if ((i8 & 3) != 0) {
            throw b0.g();
        }
    }

    public final void X(int i8) {
        if ((i8 & 7) != 0) {
            throw b0.g();
        }
    }

    public final int a() {
        return this.f3702b;
    }

    public final void b(List<Integer> list) {
        int i8;
        int A;
        int A2;
        boolean z8 = list instanceof z;
        j jVar = this.f3701a;
        if (z8) {
            z zVar = (z) list;
            int i9 = this.f3702b & 7;
            if (i9 == 0) {
                do {
                    zVar.j(jVar.w());
                    if (!jVar.e()) {
                        A2 = jVar.A();
                    } else {
                        return;
                    }
                } while (A2 == this.f3702b);
                this.f3704d = A2;
                return;
            } else if (i9 == 2) {
                i8 = jVar.d() + jVar.B();
                do {
                    zVar.j(jVar.w());
                } while (jVar.d() < i8);
            } else {
                throw b0.d();
            }
        } else {
            int i10 = this.f3702b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(jVar.w()));
                    if (!jVar.e()) {
                        A = jVar.A();
                    } else {
                        return;
                    }
                } while (A == this.f3702b);
                this.f3704d = A;
                return;
            } else if (i10 == 2) {
                i8 = jVar.d() + jVar.B();
                do {
                    list.add(Integer.valueOf(jVar.w()));
                } while (jVar.d() < i8);
            } else {
                throw b0.d();
            }
        }
        U(i8);
    }

    public final int c() {
        V(0);
        return this.f3701a.n();
    }

    public final long d() {
        V(0);
        return this.f3701a.C();
    }

    public final void e(List<Integer> list) {
        int A;
        int A2;
        boolean z8 = list instanceof z;
        j jVar = this.f3701a;
        if (z8) {
            z zVar = (z) list;
            int i8 = this.f3702b & 7;
            if (i8 == 2) {
                int B = jVar.B();
                W(B);
                int d9 = jVar.d() + B;
                do {
                    zVar.j(jVar.o());
                } while (jVar.d() < d9);
            } else if (i8 == 5) {
                do {
                    zVar.j(jVar.o());
                    if (!jVar.e()) {
                        A2 = jVar.A();
                    } else {
                        return;
                    }
                } while (A2 == this.f3702b);
                this.f3704d = A2;
            } else {
                throw b0.d();
            }
        } else {
            int i9 = this.f3702b & 7;
            if (i9 == 2) {
                int B2 = jVar.B();
                W(B2);
                int d10 = jVar.d() + B2;
                do {
                    list.add(Integer.valueOf(jVar.o()));
                } while (jVar.d() < d10);
            } else if (i9 == 5) {
                do {
                    list.add(Integer.valueOf(jVar.o()));
                    if (!jVar.e()) {
                        A = jVar.A();
                    } else {
                        return;
                    }
                } while (A == this.f3702b);
                this.f3704d = A;
            } else {
                throw b0.d();
            }
        }
    }

    public final long f() {
        V(1);
        return this.f3701a.p();
    }

    public final void g(List<Integer> list) {
        int A;
        int A2;
        boolean z8 = list instanceof z;
        j jVar = this.f3701a;
        if (z8) {
            z zVar = (z) list;
            int i8 = this.f3702b & 7;
            if (i8 == 2) {
                int B = jVar.B();
                W(B);
                int d9 = jVar.d() + B;
                do {
                    zVar.j(jVar.u());
                } while (jVar.d() < d9);
            } else if (i8 == 5) {
                do {
                    zVar.j(jVar.u());
                    if (!jVar.e()) {
                        A2 = jVar.A();
                    } else {
                        return;
                    }
                } while (A2 == this.f3702b);
                this.f3704d = A2;
            } else {
                throw b0.d();
            }
        } else {
            int i9 = this.f3702b & 7;
            if (i9 == 2) {
                int B2 = jVar.B();
                W(B2);
                int d10 = jVar.d() + B2;
                do {
                    list.add(Integer.valueOf(jVar.u()));
                } while (jVar.d() < d10);
            } else if (i9 == 5) {
                do {
                    list.add(Integer.valueOf(jVar.u()));
                    if (!jVar.e()) {
                        A = jVar.A();
                    } else {
                        return;
                    }
                } while (A == this.f3702b);
                this.f3704d = A;
            } else {
                throw b0.d();
            }
        }
    }

    public final int h() {
        V(0);
        return this.f3701a.w();
    }

    public final void i(List<Long> list) {
        int i8;
        int A;
        int A2;
        boolean z8 = list instanceof i0;
        j jVar = this.f3701a;
        if (z8) {
            i0 i0Var = (i0) list;
            int i9 = this.f3702b & 7;
            if (i9 == 0) {
                do {
                    i0Var.j(jVar.x());
                    if (!jVar.e()) {
                        A2 = jVar.A();
                    } else {
                        return;
                    }
                } while (A2 == this.f3702b);
                this.f3704d = A2;
                return;
            } else if (i9 == 2) {
                i8 = jVar.d() + jVar.B();
                do {
                    i0Var.j(jVar.x());
                } while (jVar.d() < i8);
            } else {
                throw b0.d();
            }
        } else {
            int i10 = this.f3702b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(jVar.x()));
                    if (!jVar.e()) {
                        A = jVar.A();
                    } else {
                        return;
                    }
                } while (A == this.f3702b);
                this.f3704d = A;
                return;
            } else if (i10 == 2) {
                i8 = jVar.d() + jVar.B();
                do {
                    list.add(Long.valueOf(jVar.x()));
                } while (jVar.d() < i8);
            } else {
                throw b0.d();
            }
        }
        U(i8);
    }

    public final <T> void j(List<T> list, f1<T> f1Var, q qVar) {
        int A;
        int i8 = this.f3702b;
        if ((i8 & 7) == 3) {
            do {
                list.add(R(f1Var, qVar));
                j jVar = this.f3701a;
                if (!jVar.e() && this.f3704d == 0) {
                    A = jVar.A();
                } else {
                    return;
                }
            } while (A == i8);
            this.f3704d = A;
            return;
        }
        int i9 = b0.f3594g;
        throw new b0.a();
    }

    public final long k() {
        V(0);
        return this.f3701a.x();
    }

    public final void l(List<Integer> list) {
        int i8;
        int A;
        int A2;
        boolean z8 = list instanceof z;
        j jVar = this.f3701a;
        if (z8) {
            z zVar = (z) list;
            int i9 = this.f3702b & 7;
            if (i9 == 0) {
                do {
                    zVar.j(jVar.B());
                    if (!jVar.e()) {
                        A2 = jVar.A();
                    } else {
                        return;
                    }
                } while (A2 == this.f3702b);
                this.f3704d = A2;
                return;
            } else if (i9 == 2) {
                i8 = jVar.d() + jVar.B();
                do {
                    zVar.j(jVar.B());
                } while (jVar.d() < i8);
            } else {
                throw b0.d();
            }
        } else {
            int i10 = this.f3702b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(jVar.B()));
                    if (!jVar.e()) {
                        A = jVar.A();
                    } else {
                        return;
                    }
                } while (A == this.f3702b);
                this.f3704d = A;
                return;
            } else if (i10 == 2) {
                i8 = jVar.d() + jVar.B();
                do {
                    list.add(Integer.valueOf(jVar.B()));
                } while (jVar.d() < i8);
            } else {
                throw b0.d();
            }
        }
        U(i8);
    }

    public final <T> T m(Class<T> cls, q qVar) {
        V(2);
        return S(b1.f3596c.a(cls), qVar);
    }

    public final void n(List<Boolean> list) {
        int i8;
        int A;
        int A2;
        boolean z8 = list instanceof g;
        j jVar = this.f3701a;
        if (z8) {
            g gVar = (g) list;
            int i9 = this.f3702b & 7;
            if (i9 == 0) {
                do {
                    gVar.j(jVar.k());
                    if (!jVar.e()) {
                        A2 = jVar.A();
                    } else {
                        return;
                    }
                } while (A2 == this.f3702b);
                this.f3704d = A2;
                return;
            } else if (i9 == 2) {
                i8 = jVar.d() + jVar.B();
                do {
                    gVar.j(jVar.k());
                } while (jVar.d() < i8);
            } else {
                throw b0.d();
            }
        } else {
            int i10 = this.f3702b & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(jVar.k()));
                    if (!jVar.e()) {
                        A = jVar.A();
                    } else {
                        return;
                    }
                } while (A == this.f3702b);
                this.f3704d = A;
                return;
            } else if (i10 == 2) {
                i8 = jVar.d() + jVar.B();
                do {
                    list.add(Boolean.valueOf(jVar.k()));
                } while (jVar.d() < i8);
            } else {
                throw b0.d();
            }
        }
        U(i8);
    }

    public final String o() {
        V(2);
        return this.f3701a.y();
    }

    public final int p() {
        V(5);
        return this.f3701a.o();
    }

    public final <T> T q(Class<T> cls, q qVar) {
        V(3);
        return R(b1.f3596c.a(cls), qVar);
    }

    public final boolean r() {
        V(0);
        return this.f3701a.k();
    }

    public final double readDouble() {
        V(1);
        return this.f3701a.m();
    }

    public final float readFloat() {
        V(5);
        return this.f3701a.q();
    }

    public final <T> void s(List<T> list, f1<T> f1Var, q qVar) {
        int A;
        int i8 = this.f3702b;
        if ((i8 & 7) == 2) {
            do {
                list.add(S(f1Var, qVar));
                j jVar = this.f3701a;
                if (!jVar.e() && this.f3704d == 0) {
                    A = jVar.A();
                } else {
                    return;
                }
            } while (A == i8);
            this.f3704d = A;
            return;
        }
        int i9 = b0.f3594g;
        throw new b0.a();
    }

    public final int t() {
        int i8 = this.f3704d;
        if (i8 != 0) {
            this.f3702b = i8;
            this.f3704d = 0;
        } else {
            this.f3702b = this.f3701a.A();
        }
        int i9 = this.f3702b;
        if (i9 == 0 || i9 == this.f3703c) {
            return Integer.MAX_VALUE;
        }
        return i9 >>> 3;
    }

    public final void u(List<String> list) {
        T(list, false);
    }

    public final long v() {
        V(1);
        return this.f3701a.v();
    }

    public final <T> T w(f1<T> f1Var, q qVar) {
        V(2);
        return S(f1Var, qVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (F() != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        throw new com.google.protobuf.b0("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void x(java.util.Map<K, V> r10, com.google.protobuf.k0.a<K, V> r11, com.google.protobuf.q r12) {
        /*
            r9 = this;
            r0 = 2
            r9.V(r0)
            com.google.protobuf.j r1 = r9.f3701a
            int r2 = r1.B()
            int r2 = r1.j(r2)
            K r3 = r11.f3709b
            V r4 = r11.f3711d
            r5 = r4
        L_0x0013:
            int r6 = r9.t()     // Catch:{ all -> 0x005e }
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L_0x0057
            boolean r7 = r1.e()     // Catch:{ all -> 0x005e }
            if (r7 == 0) goto L_0x0023
            goto L_0x0057
        L_0x0023:
            r7 = 1
            java.lang.String r8 = "Unable to parse map entry."
            if (r6 == r7) goto L_0x0042
            if (r6 == r0) goto L_0x0037
            boolean r6 = r9.F()     // Catch:{ a -> 0x004a }
            if (r6 == 0) goto L_0x0031
            goto L_0x0013
        L_0x0031:
            com.google.protobuf.b0 r6 = new com.google.protobuf.b0     // Catch:{ a -> 0x004a }
            r6.<init>((java.lang.String) r8)     // Catch:{ a -> 0x004a }
            throw r6     // Catch:{ a -> 0x004a }
        L_0x0037:
            com.google.protobuf.s1 r6 = r11.f3710c     // Catch:{ a -> 0x004a }
            java.lang.Class r7 = r4.getClass()     // Catch:{ a -> 0x004a }
            java.lang.Object r5 = r9.Q(r6, r7, r12)     // Catch:{ a -> 0x004a }
            goto L_0x0013
        L_0x0042:
            com.google.protobuf.s1 r6 = r11.f3708a     // Catch:{ a -> 0x004a }
            r7 = 0
            java.lang.Object r3 = r9.Q(r6, r7, r7)     // Catch:{ a -> 0x004a }
            goto L_0x0013
        L_0x004a:
            boolean r6 = r9.F()     // Catch:{ all -> 0x005e }
            if (r6 == 0) goto L_0x0051
            goto L_0x0013
        L_0x0051:
            com.google.protobuf.b0 r9 = new com.google.protobuf.b0     // Catch:{ all -> 0x005e }
            r9.<init>((java.lang.String) r8)     // Catch:{ all -> 0x005e }
            throw r9     // Catch:{ all -> 0x005e }
        L_0x0057:
            r10.put(r3, r5)     // Catch:{ all -> 0x005e }
            r1.i(r2)
            return
        L_0x005e:
            r9 = move-exception
            r1.i(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.x(java.util.Map, com.google.protobuf.k0$a, com.google.protobuf.q):void");
    }

    public final void y(List<Long> list) {
        int i8;
        int A;
        int A2;
        boolean z8 = list instanceof i0;
        j jVar = this.f3701a;
        if (z8) {
            i0 i0Var = (i0) list;
            int i9 = this.f3702b & 7;
            if (i9 == 0) {
                do {
                    i0Var.j(jVar.C());
                    if (!jVar.e()) {
                        A2 = jVar.A();
                    } else {
                        return;
                    }
                } while (A2 == this.f3702b);
                this.f3704d = A2;
                return;
            } else if (i9 == 2) {
                i8 = jVar.d() + jVar.B();
                do {
                    i0Var.j(jVar.C());
                } while (jVar.d() < i8);
            } else {
                throw b0.d();
            }
        } else {
            int i10 = this.f3702b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(jVar.C()));
                    if (!jVar.e()) {
                        A = jVar.A();
                    } else {
                        return;
                    }
                } while (A == this.f3702b);
                this.f3704d = A;
                return;
            } else if (i10 == 2) {
                i8 = jVar.d() + jVar.B();
                do {
                    list.add(Long.valueOf(jVar.C()));
                } while (jVar.d() < i8);
            } else {
                throw b0.d();
            }
        }
        U(i8);
    }

    public final void z(List<String> list) {
        T(list, true);
    }
}
