package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class z extends v<z, a> implements p0 {
    public static final int BETWEEN_FIELD_NUMBER = 1;
    public static final int CONDITIONAL_OP_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final z DEFAULT_INSTANCE;
    public static final int FIXED_FIELD_NUMBER = 2;
    private static volatile w0<z> PARSER;
    private int innerCase_ = 0;
    private Object inner_;

    public static final class a extends v.a<z, a> implements p0 {
        public a() {
            super(z.DEFAULT_INSTANCE);
        }
    }

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        v.r(z.class, zVar);
    }

    public static z v() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"inner_", "innerCase_", n.class, v0.class, s.class});
            case 3:
                return new z();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<z> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (z.class) {
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

    public final n t() {
        return this.innerCase_ == 1 ? (n) this.inner_ : n.t();
    }

    public final s u() {
        return this.innerCase_ == 3 ? (s) this.inner_ : s.u();
    }

    public final v0 w() {
        return this.innerCase_ == 2 ? (v0) this.inner_ : v0.t();
    }

    public final boolean x() {
        return this.innerCase_ == 1;
    }

    public final boolean y() {
        return this.innerCase_ == 3;
    }

    public final boolean z() {
        return this.innerCase_ == 2;
    }
}
