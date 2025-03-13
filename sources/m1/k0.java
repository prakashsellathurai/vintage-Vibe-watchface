package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class k0 extends v<k0, a> implements p0 {
    /* access modifiers changed from: private */
    public static final k0 DEFAULT_INSTANCE;
    public static final int INPUT_LHS_FIELD_NUMBER = 1;
    public static final int INPUT_RHS_FIELD_NUMBER = 2;
    public static final int OPERATION_TYPE_FIELD_NUMBER = 3;
    private static volatile w0<k0> PARSER;
    private y inputLhs_;
    private y inputRhs_;
    private int operationType_;

    public static final class a extends v.a<k0, a> implements p0 {
        public a() {
            super(k0.DEFAULT_INSTANCE);
        }
    }

    static {
        k0 k0Var = new k0();
        DEFAULT_INSTANCE = k0Var;
        v.r(k0.class, k0Var);
    }

    public static k0 t() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"inputLhs_", "inputRhs_", "operationType_"});
            case 3:
                return new k0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<k0> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (k0.class) {
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

    public final y u() {
        y yVar = this.inputLhs_;
        return yVar == null ? y.t() : yVar;
    }

    public final y v() {
        y yVar = this.inputRhs_;
        return yVar == null ? y.t() : yVar;
    }

    public final l0 w() {
        l0 e = l0.e(this.operationType_);
        return e == null ? l0.UNRECOGNIZED : e;
    }

    public final boolean x() {
        return this.inputLhs_ != null;
    }

    public final boolean y() {
        return this.inputRhs_ != null;
    }
}
