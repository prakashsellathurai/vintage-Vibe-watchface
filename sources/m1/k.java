package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class k extends v<k, a> implements p0 {
    /* access modifiers changed from: private */
    public static final k DEFAULT_INSTANCE;
    public static final int INPUT_LHS_FIELD_NUMBER = 1;
    public static final int INPUT_RHS_FIELD_NUMBER = 2;
    public static final int OPERATION_TYPE_FIELD_NUMBER = 3;
    private static volatile w0<k> PARSER;
    private a0 inputLhs_;
    private a0 inputRhs_;
    private int operationType_;

    public static final class a extends v.a<k, a> implements p0 {
        public a() {
            super(k.DEFAULT_INSTANCE);
        }
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        v.r(k.class, kVar);
    }

    public static k t() {
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
                return new k();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<k> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (k.class) {
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

    public final a0 u() {
        a0 a0Var = this.inputLhs_;
        return a0Var == null ? a0.E() : a0Var;
    }

    public final a0 v() {
        a0 a0Var = this.inputRhs_;
        return a0Var == null ? a0.E() : a0Var;
    }

    public final m w() {
        m e = m.e(this.operationType_);
        return e == null ? m.UNRECOGNIZED : e;
    }

    public final boolean x() {
        return this.inputLhs_ != null;
    }

    public final boolean y() {
        return this.inputRhs_ != null;
    }
}
