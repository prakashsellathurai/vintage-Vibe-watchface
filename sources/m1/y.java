package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class y extends v<y, a> implements p0 {
    /* access modifiers changed from: private */
    public static final y DEFAULT_INSTANCE;
    public static final int FIXED_FIELD_NUMBER = 1;
    public static final int FLOAT_COMPARISON_FIELD_NUMBER = 6;
    public static final int INT32_COMPARISON_FIELD_NUMBER = 3;
    public static final int LOGICAL_OP_FIELD_NUMBER = 5;
    public static final int NOT_OP_FIELD_NUMBER = 4;
    private static volatile w0<y> PARSER = null;
    public static final int STATE_SOURCE_FIELD_NUMBER = 2;
    private int innerCase_ = 0;
    private Object inner_;

    public static final class a extends v.a<y, a> implements p0 {
        public a() {
            super(y.DEFAULT_INSTANCE);
        }
    }

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        v.r(y.class, yVar);
    }

    public static y t() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return this.innerCase_ == 1;
    }

    public final boolean B() {
        return this.innerCase_ == 6;
    }

    public final boolean C() {
        return this.innerCase_ == 3;
    }

    public final boolean D() {
        return this.innerCase_ == 5;
    }

    public final boolean E() {
        return this.innerCase_ == 4;
    }

    public final boolean F() {
        return this.innerCase_ == 2;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"inner_", "innerCase_", u0.class, q0.class, p.class, m0.class, k0.class, o.class});
            case 3:
                return new y();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<y> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (y.class) {
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

    public final u0 u() {
        return this.innerCase_ == 1 ? (u0) this.inner_ : u0.t();
    }

    public final o v() {
        return this.innerCase_ == 6 ? (o) this.inner_ : o.t();
    }

    public final p w() {
        return this.innerCase_ == 3 ? (p) this.inner_ : p.t();
    }

    public final k0 x() {
        return this.innerCase_ == 5 ? (k0) this.inner_ : k0.t();
    }

    public final m0 y() {
        return this.innerCase_ == 4 ? (m0) this.inner_ : m0.t();
    }

    public final q0 z() {
        return this.innerCase_ == 2 ? (q0) this.inner_ : q0.t();
    }
}
