package androidx.wear.protolayout.protobuf;

import java.nio.charset.Charset;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final j f2130a;

    public k(j jVar) {
        Charset charset = x.f2214a;
        if (jVar != null) {
            this.f2130a = jVar;
            jVar.f2127a = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public final void a(int i8, boolean z8) {
        this.f2130a.H(i8, z8);
    }

    public final void b(int i8, g gVar) {
        this.f2130a.I(i8, gVar);
    }

    public final void c(int i8, double d9) {
        j jVar = this.f2130a;
        jVar.getClass();
        jVar.L(i8, Double.doubleToRawLongBits(d9));
    }

    public final void d(int i8, int i9) {
        this.f2130a.N(i8, i9);
    }

    public final void e(int i8, int i9) {
        this.f2130a.J(i8, i9);
    }

    public final void f(int i8, long j8) {
        this.f2130a.L(i8, j8);
    }

    public final void g(int i8, float f9) {
        j jVar = this.f2130a;
        jVar.getClass();
        jVar.J(i8, Float.floatToRawIntBits(f9));
    }

    public final void h(int i8, b1 b1Var, Object obj) {
        j jVar = this.f2130a;
        jVar.T(i8, 3);
        b1Var.i((o0) obj, jVar.f2127a);
        jVar.T(i8, 4);
    }

    public final void i(int i8, int i9) {
        this.f2130a.N(i8, i9);
    }

    public final void j(int i8, long j8) {
        this.f2130a.W(i8, j8);
    }

    public final void k(int i8, b1 b1Var, Object obj) {
        this.f2130a.P(i8, (o0) obj, b1Var);
    }

    public final void l(int i8, Object obj) {
        boolean z8 = obj instanceof g;
        j jVar = this.f2130a;
        if (z8) {
            jVar.R(i8, (g) obj);
        } else {
            jVar.Q(i8, (o0) obj);
        }
    }

    public final void m(int i8, int i9) {
        this.f2130a.J(i8, i9);
    }

    public final void n(int i8, long j8) {
        this.f2130a.L(i8, j8);
    }

    public final void o(int i8, int i9) {
        j jVar = this.f2130a;
        jVar.U(i8, (i9 >> 31) ^ (i9 << 1));
    }

    public final void p(int i8, long j8) {
        j jVar = this.f2130a;
        jVar.W(i8, (j8 >> 63) ^ (j8 << 1));
    }

    public final void q(int i8, int i9) {
        this.f2130a.U(i8, i9);
    }

    public final void r(int i8, long j8) {
        this.f2130a.W(i8, j8);
    }
}
