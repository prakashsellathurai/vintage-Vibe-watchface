package com.google.protobuf;

import java.nio.charset.Charset;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final l f3722a;

    public m(l lVar) {
        Charset charset = a0.f3589a;
        if (lVar != null) {
            this.f3722a = lVar;
            lVar.f3714a = this;
            return;
        }
        throw new NullPointerException("output");
    }

    public final void a(int i8, boolean z8) {
        this.f3722a.I(i8, z8);
    }

    public final void b(int i8, i iVar) {
        this.f3722a.K(i8, iVar);
    }

    public final void c(int i8, double d9) {
        l lVar = this.f3722a;
        lVar.getClass();
        lVar.O(i8, Double.doubleToRawLongBits(d9));
    }

    public final void d(int i8, int i9) {
        this.f3722a.Q(i8, i9);
    }

    public final void e(int i8, int i9) {
        this.f3722a.M(i8, i9);
    }

    public final void f(int i8, long j8) {
        this.f3722a.O(i8, j8);
    }

    public final void g(int i8, float f9) {
        l lVar = this.f3722a;
        lVar.getClass();
        lVar.M(i8, Float.floatToRawIntBits(f9));
    }

    public final void h(int i8, f1 f1Var, Object obj) {
        l lVar = this.f3722a;
        lVar.Y(i8, 3);
        f1Var.h((r0) obj, lVar.f3714a);
        lVar.Y(i8, 4);
    }

    public final void i(int i8, int i9) {
        this.f3722a.Q(i8, i9);
    }

    public final void j(int i8, long j8) {
        this.f3722a.b0(i8, j8);
    }

    public final void k(int i8, f1 f1Var, Object obj) {
        this.f3722a.S(i8, (r0) obj, f1Var);
    }

    public final void l(int i8, Object obj) {
        boolean z8 = obj instanceof i;
        l lVar = this.f3722a;
        if (z8) {
            lVar.V(i8, (i) obj);
        } else {
            lVar.U(i8, (r0) obj);
        }
    }

    public final void m(int i8, int i9) {
        this.f3722a.M(i8, i9);
    }

    public final void n(int i8, long j8) {
        this.f3722a.O(i8, j8);
    }

    public final void o(int i8, int i9) {
        l lVar = this.f3722a;
        lVar.Z(i8, (i9 >> 31) ^ (i9 << 1));
    }

    public final void p(int i8, long j8) {
        l lVar = this.f3722a;
        lVar.b0(i8, (j8 >> 63) ^ (j8 << 1));
    }

    public final void q(int i8, int i9) {
        this.f3722a.Z(i8, i9);
    }

    public final void r(int i8, long j8) {
        this.f3722a.b0(i8, j8);
    }
}
