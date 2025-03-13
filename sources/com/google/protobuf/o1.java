package com.google.protobuf;

public final class o1 extends m1<n1, n1> {
    public final void a(int i8, int i9, Object obj) {
        ((n1) obj).d((i8 << 3) | 5, Integer.valueOf(i9));
    }

    public final void b(int i8, long j8, Object obj) {
        ((n1) obj).d((i8 << 3) | 1, Long.valueOf(j8));
    }

    public final void c(Object obj, int i8, Object obj2) {
        ((n1) obj).d((i8 << 3) | 3, (n1) obj2);
    }

    public final void d(Object obj, int i8, i iVar) {
        ((n1) obj).d((i8 << 3) | 2, iVar);
    }

    public final void e(int i8, long j8, Object obj) {
        ((n1) obj).d((i8 << 3) | 0, Long.valueOf(j8));
    }

    public final Object f(Object obj) {
        y yVar = (y) obj;
        n1 n1Var = yVar.unknownFields;
        if (n1Var != n1.f3726f) {
            return n1Var;
        }
        n1 n1Var2 = new n1();
        yVar.unknownFields = n1Var2;
        return n1Var2;
    }

    public final Object g(Object obj) {
        return ((y) obj).unknownFields;
    }

    public final int h(Object obj) {
        return ((n1) obj).a();
    }

    public final int i(Object obj) {
        n1 n1Var = (n1) obj;
        int i8 = n1Var.f3730d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < n1Var.f3727a; i10++) {
            i9 += (l.B(1) * 2) + l.C(2, n1Var.f3728b[i10] >>> 3) + l.k(3, (i) n1Var.f3729c[i10]);
        }
        n1Var.f3730d = i9;
        return i9;
    }

    public final void j(Object obj) {
        ((y) obj).unknownFields.e = false;
    }

    public final Object k(Object obj, Object obj2) {
        n1 n1Var = (n1) obj;
        n1 n1Var2 = (n1) obj2;
        return n1Var2.equals(n1.f3726f) ? n1Var : n1.c(n1Var, n1Var2);
    }

    public final Object m() {
        return new n1();
    }

    public final void n(Object obj, Object obj2) {
        ((y) obj).unknownFields = (n1) obj2;
    }

    public final void o(Object obj, Object obj2) {
        ((y) obj).unknownFields = (n1) obj2;
    }

    public final void p() {
    }

    public final Object q(Object obj) {
        n1 n1Var = (n1) obj;
        n1Var.e = false;
        return n1Var;
    }

    public final void r(Object obj, m mVar) {
        n1 n1Var = (n1) obj;
        n1Var.getClass();
        mVar.getClass();
        for (int i8 = 0; i8 < n1Var.f3727a; i8++) {
            mVar.l(n1Var.f3728b[i8] >>> 3, n1Var.f3729c[i8]);
        }
    }

    public final void s(Object obj, m mVar) {
        ((n1) obj).e(mVar);
    }
}
