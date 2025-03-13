package m1;

import androidx.wear.protolayout.protobuf.g1;
import androidx.wear.protolayout.protobuf.h;
import androidx.wear.protolayout.protobuf.n;
import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.y;
import androidx.wear.protolayout.protobuf.z0;

public final class d0 extends v<d0, a> implements p0 {
    public static final int CONCAT_OP_FIELD_NUMBER = 5;
    public static final int CONDITIONAL_OP_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final d0 DEFAULT_INSTANCE;
    public static final int FIXED_FIELD_NUMBER = 1;
    public static final int FLOAT_FORMAT_OP_FIELD_NUMBER = 6;
    public static final int INT32_FORMAT_OP_FIELD_NUMBER = 2;
    private static volatile w0<d0> PARSER = null;
    public static final int STATE_SOURCE_FIELD_NUMBER = 3;
    private int innerCase_ = 0;
    private Object inner_;

    public static final class a extends v.a<d0, a> implements p0 {
        public a() {
            super(d0.DEFAULT_INSTANCE);
        }
    }

    static {
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        v.r(d0.class, d0Var);
    }

    public static d0 B() {
        return DEFAULT_INSTANCE;
    }

    public static a M() {
        return (a) ((v.a) DEFAULT_INSTANCE.j(v.f.f2207j));
    }

    public static d0 N(h.a aVar, n nVar) {
        v q8 = v.q(DEFAULT_INSTANCE, aVar, nVar);
        if (v.n(q8, true)) {
            return (d0) q8;
        }
        throw new y(new g1().getMessage());
    }

    public static void t(d0 d0Var, z0 z0Var) {
        d0Var.getClass();
        z0Var.getClass();
        d0Var.inner_ = z0Var;
        d0Var.innerCase_ = 1;
    }

    public static void u(d0 d0Var, i0 i0Var) {
        d0Var.getClass();
        i0Var.getClass();
        d0Var.inner_ = i0Var;
        d0Var.innerCase_ = 2;
    }

    public static void v(d0 d0Var, t0 t0Var) {
        d0Var.getClass();
        t0Var.getClass();
        d0Var.inner_ = t0Var;
        d0Var.innerCase_ = 3;
    }

    public static void w(d0 d0Var, w wVar) {
        d0Var.getClass();
        wVar.getClass();
        d0Var.inner_ = wVar;
        d0Var.innerCase_ = 4;
    }

    public static void x(d0 d0Var, r rVar) {
        d0Var.getClass();
        rVar.getClass();
        d0Var.inner_ = rVar;
        d0Var.innerCase_ = 5;
    }

    public static void y(d0 d0Var, e0 e0Var) {
        d0Var.getClass();
        e0Var.getClass();
        d0Var.inner_ = e0Var;
        d0Var.innerCase_ = 6;
    }

    public final w A() {
        return this.innerCase_ == 4 ? (w) this.inner_ : w.u();
    }

    public final z0 C() {
        return this.innerCase_ == 1 ? (z0) this.inner_ : z0.t();
    }

    public final e0 D() {
        return this.innerCase_ == 6 ? (e0) this.inner_ : e0.t();
    }

    public final i0 E() {
        return this.innerCase_ == 2 ? (i0) this.inner_ : i0.t();
    }

    public final t0 F() {
        return this.innerCase_ == 3 ? (t0) this.inner_ : t0.t();
    }

    public final boolean G() {
        return this.innerCase_ == 5;
    }

    public final boolean H() {
        return this.innerCase_ == 4;
    }

    public final boolean I() {
        return this.innerCase_ == 1;
    }

    public final boolean J() {
        return this.innerCase_ == 6;
    }

    public final boolean K() {
        return this.innerCase_ == 2;
    }

    public final boolean L() {
        return this.innerCase_ == 3;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"inner_", "innerCase_", z0.class, i0.class, t0.class, w.class, r.class, e0.class});
            case 3:
                return new d0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<d0> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (d0.class) {
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

    public final r z() {
        return this.innerCase_ == 5 ? (r) this.inner_ : r.t();
    }
}
