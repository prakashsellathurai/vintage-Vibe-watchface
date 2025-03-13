package m1;

import androidx.wear.protolayout.protobuf.g1;
import androidx.wear.protolayout.protobuf.h;
import androidx.wear.protolayout.protobuf.n;
import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.y;
import androidx.wear.protolayout.protobuf.z0;

public final class a0 extends v<a0, a> implements p0 {
    public static final int ANIMATABLE_DYNAMIC_FIELD_NUMBER = 7;
    public static final int ANIMATABLE_FIXED_FIELD_NUMBER = 6;
    public static final int ARITHMETIC_OPERATION_FIELD_NUMBER = 2;
    public static final int CONDITIONAL_OP_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final a0 DEFAULT_INSTANCE;
    public static final int FIXED_FIELD_NUMBER = 1;
    public static final int INT32_TO_FLOAT_OPERATION_FIELD_NUMBER = 3;
    private static volatile w0<a0> PARSER = null;
    public static final int STATE_SOURCE_FIELD_NUMBER = 4;
    private int innerCase_ = 0;
    private Object inner_;

    public static final class a extends v.a<a0, a> implements p0 {
        public a() {
            super(a0.DEFAULT_INSTANCE);
        }
    }

    static {
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        v.r(a0.class, a0Var);
    }

    public static a0 E() {
        return DEFAULT_INSTANCE;
    }

    public static a P() {
        return (a) ((v.a) DEFAULT_INSTANCE.j(v.f.f2207j));
    }

    public static a0 Q(h.a aVar, n nVar) {
        v q8 = v.q(DEFAULT_INSTANCE, aVar, nVar);
        if (v.n(q8, true)) {
            return (a0) q8;
        }
        throw new y(new g1().getMessage());
    }

    public static void t(a0 a0Var, w0 w0Var) {
        a0Var.getClass();
        w0Var.getClass();
        a0Var.inner_ = w0Var;
        a0Var.innerCase_ = 1;
    }

    public static void u(a0 a0Var, k kVar) {
        a0Var.getClass();
        kVar.getClass();
        a0Var.inner_ = kVar;
        a0Var.innerCase_ = 2;
    }

    public static void v(a0 a0Var, j0 j0Var) {
        a0Var.getClass();
        j0Var.getClass();
        a0Var.inner_ = j0Var;
        a0Var.innerCase_ = 3;
    }

    public static void w(a0 a0Var, r0 r0Var) {
        a0Var.getClass();
        r0Var.getClass();
        a0Var.inner_ = r0Var;
        a0Var.innerCase_ = 4;
    }

    public static void x(a0 a0Var, t tVar) {
        a0Var.getClass();
        tVar.getClass();
        a0Var.inner_ = tVar;
        a0Var.innerCase_ = 5;
    }

    public static void y(a0 a0Var, i iVar) {
        a0Var.getClass();
        iVar.getClass();
        a0Var.inner_ = iVar;
        a0Var.innerCase_ = 6;
    }

    public static void z(a0 a0Var, g gVar) {
        a0Var.getClass();
        gVar.getClass();
        a0Var.inner_ = gVar;
        a0Var.innerCase_ = 7;
    }

    public final g A() {
        return this.innerCase_ == 7 ? (g) this.inner_ : g.u();
    }

    public final i B() {
        return this.innerCase_ == 6 ? (i) this.inner_ : i.u();
    }

    public final k C() {
        return this.innerCase_ == 2 ? (k) this.inner_ : k.t();
    }

    public final t D() {
        return this.innerCase_ == 5 ? (t) this.inner_ : t.u();
    }

    public final w0 F() {
        return this.innerCase_ == 1 ? (w0) this.inner_ : w0.t();
    }

    public final j0 G() {
        return this.innerCase_ == 3 ? (j0) this.inner_ : j0.t();
    }

    public final r0 H() {
        return this.innerCase_ == 4 ? (r0) this.inner_ : r0.t();
    }

    public final boolean I() {
        return this.innerCase_ == 7;
    }

    public final boolean J() {
        return this.innerCase_ == 6;
    }

    public final boolean K() {
        return this.innerCase_ == 2;
    }

    public final boolean L() {
        return this.innerCase_ == 5;
    }

    public final boolean M() {
        return this.innerCase_ == 1;
    }

    public final boolean N() {
        return this.innerCase_ == 3;
    }

    public final boolean O() {
        return this.innerCase_ == 4;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"inner_", "innerCase_", w0.class, k.class, j0.class, r0.class, t.class, i.class, g.class});
            case 3:
                return new a0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<a0> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (a0.class) {
                        try {
                            w0Var = PARSER;
                            if (w0Var == null) {
                                w0Var = new v.b<>(DEFAULT_INSTANCE);
                                PARSER = w0Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return w0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
