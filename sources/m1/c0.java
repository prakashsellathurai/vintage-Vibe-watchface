package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class c0 extends v<c0, a> implements p0 {
    public static final int ANIMATABLE_DYNAMIC_FIELD_NUMBER = 9;
    public static final int ANIMATABLE_FIXED_FIELD_NUMBER = 8;
    public static final int ARITHMETIC_OPERATION_FIELD_NUMBER = 3;
    public static final int CONDITIONAL_OP_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final c0 DEFAULT_INSTANCE;
    public static final int DURATION_PART_FIELD_NUMBER = 7;
    public static final int FIXED_FIELD_NUMBER = 1;
    public static final int FLOAT_TO_INT_FIELD_NUMBER = 6;
    private static volatile w0<c0> PARSER = null;
    public static final int PLATFORM_SOURCE_FIELD_NUMBER = 2;
    public static final int STATE_SOURCE_FIELD_NUMBER = 4;
    private int innerCase_ = 0;
    private Object inner_;

    public static final class a extends v.a<c0, a> implements p0 {
        public a() {
            super(c0.DEFAULT_INSTANCE);
        }
    }

    static {
        c0 c0Var = new c0();
        DEFAULT_INSTANCE = c0Var;
        v.r(c0.class, c0Var);
    }

    public static c0 x() {
        return DEFAULT_INSTANCE;
    }

    public final f0 A() {
        return this.innerCase_ == 6 ? (f0) this.inner_ : f0.t();
    }

    public final n0 B() {
        return this.innerCase_ == 2 ? (n0) this.inner_ : n0.t();
    }

    public final s0 C() {
        return this.innerCase_ == 4 ? (s0) this.inner_ : s0.t();
    }

    public final boolean D() {
        return this.innerCase_ == 9;
    }

    public final boolean E() {
        return this.innerCase_ == 8;
    }

    public final boolean F() {
        return this.innerCase_ == 3;
    }

    public final boolean G() {
        return this.innerCase_ == 5;
    }

    public final boolean H() {
        return this.innerCase_ == 7;
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
        return this.innerCase_ == 4;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"inner_", "innerCase_", y0.class, n0.class, l.class, s0.class, v.class, f0.class, h0.class, j.class, h.class});
            case 3:
                return new c0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<c0> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (c0.class) {
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

    public final h t() {
        return this.innerCase_ == 9 ? (h) this.inner_ : h.u();
    }

    public final j u() {
        return this.innerCase_ == 8 ? (j) this.inner_ : j.u();
    }

    public final l v() {
        return this.innerCase_ == 3 ? (l) this.inner_ : l.t();
    }

    public final v w() {
        return this.innerCase_ == 5 ? (v) this.inner_ : v.u();
    }

    public final h0 y() {
        return this.innerCase_ == 7 ? (h0) this.inner_ : h0.t();
    }

    public final y0 z() {
        return this.innerCase_ == 1 ? (y0) this.inner_ : y0.t();
    }
}
