package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class r extends v<r, a> implements p0 {
    /* access modifiers changed from: private */
    public static final r DEFAULT_INSTANCE;
    public static final int INPUT_LHS_FIELD_NUMBER = 1;
    public static final int INPUT_RHS_FIELD_NUMBER = 2;
    private static volatile w0<r> PARSER;
    private d0 inputLhs_;
    private d0 inputRhs_;

    public static final class a extends v.a<r, a> implements p0 {
        public a() {
            super(r.DEFAULT_INSTANCE);
        }
    }

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        v.r(r.class, rVar);
    }

    public static r t() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"inputLhs_", "inputRhs_"});
            case 3:
                return new r();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<r> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (r.class) {
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

    public final d0 u() {
        d0 d0Var = this.inputLhs_;
        return d0Var == null ? d0.B() : d0Var;
    }

    public final d0 v() {
        d0 d0Var = this.inputRhs_;
        return d0Var == null ? d0.B() : d0Var;
    }

    public final boolean w() {
        return this.inputLhs_ != null;
    }

    public final boolean x() {
        return this.inputRhs_ != null;
    }
}
