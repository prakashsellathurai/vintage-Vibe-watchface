package androidx.wear.protolayout.protobuf;

import java.util.Arrays;

public final class j1 extends h1<i1, i1> {
    public final void a(int i8, int i9, Object obj) {
        ((i1) obj).c((i8 << 3) | 5, Integer.valueOf(i9));
    }

    public final void b(int i8, long j8, Object obj) {
        ((i1) obj).c((i8 << 3) | 1, Long.valueOf(j8));
    }

    public final void c(Object obj, int i8, Object obj2) {
        ((i1) obj).c((i8 << 3) | 3, (i1) obj2);
    }

    public final void d(Object obj, int i8, g gVar) {
        ((i1) obj).c((i8 << 3) | 2, gVar);
    }

    public final void e(int i8, long j8, Object obj) {
        ((i1) obj).c((i8 << 3) | 0, Long.valueOf(j8));
    }

    public final Object f(Object obj) {
        v vVar = (v) obj;
        i1 i1Var = vVar.unknownFields;
        if (i1Var != i1.f2120f) {
            return i1Var;
        }
        i1 i1Var2 = new i1();
        vVar.unknownFields = i1Var2;
        return i1Var2;
    }

    public final Object g(Object obj) {
        return ((v) obj).unknownFields;
    }

    public final int h(Object obj) {
        return ((i1) obj).b();
    }

    public final int i(Object obj) {
        i1 i1Var = (i1) obj;
        int i8 = i1Var.f2124d;
        if (i8 != -1) {
            return i8;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < i1Var.f2121a; i10++) {
            i9 += (j.B(1) * 2) + j.C(2, i1Var.f2122b[i10] >>> 3) + j.k(3, (g) i1Var.f2123c[i10]);
        }
        i1Var.f2124d = i9;
        return i9;
    }

    public final void j(Object obj) {
        ((v) obj).unknownFields.e = false;
    }

    public final Object k(Object obj, Object obj2) {
        i1 i1Var = (i1) obj;
        i1 i1Var2 = (i1) obj2;
        i1 i1Var3 = i1.f2120f;
        if (i1Var3.equals(i1Var2)) {
            return i1Var;
        }
        if (i1Var3.equals(i1Var)) {
            int i8 = i1Var.f2121a + i1Var2.f2121a;
            int[] copyOf = Arrays.copyOf(i1Var.f2122b, i8);
            System.arraycopy(i1Var2.f2122b, 0, copyOf, i1Var.f2121a, i1Var2.f2121a);
            Object[] copyOf2 = Arrays.copyOf(i1Var.f2123c, i8);
            System.arraycopy(i1Var2.f2123c, 0, copyOf2, i1Var.f2121a, i1Var2.f2121a);
            return new i1(i8, copyOf, copyOf2, true);
        }
        i1Var.getClass();
        if (i1Var2.equals(i1Var3)) {
            return i1Var;
        }
        if (i1Var.e) {
            int i9 = i1Var.f2121a + i1Var2.f2121a;
            i1Var.a(i9);
            System.arraycopy(i1Var2.f2122b, 0, i1Var.f2122b, i1Var.f2121a, i1Var2.f2121a);
            System.arraycopy(i1Var2.f2123c, 0, i1Var.f2123c, i1Var.f2121a, i1Var2.f2121a);
            i1Var.f2121a = i9;
            return i1Var;
        }
        throw new UnsupportedOperationException();
    }

    public final Object m() {
        return new i1();
    }

    public final void n(Object obj, Object obj2) {
        ((v) obj).unknownFields = (i1) obj2;
    }

    public final void o(Object obj, Object obj2) {
        ((v) obj).unknownFields = (i1) obj2;
    }

    public final void p() {
    }

    public final Object q(Object obj) {
        i1 i1Var = (i1) obj;
        i1Var.e = false;
        return i1Var;
    }

    public final void r(Object obj, k kVar) {
        i1 i1Var = (i1) obj;
        i1Var.getClass();
        kVar.getClass();
        for (int i8 = 0; i8 < i1Var.f2121a; i8++) {
            kVar.l(i1Var.f2122b[i8] >>> 3, i1Var.f2123c[i8]);
        }
    }

    public final void s(Object obj, k kVar) {
        ((i1) obj).d(kVar);
    }
}
