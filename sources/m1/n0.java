package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class n0 extends v<n0, a> implements p0 {
    /* access modifiers changed from: private */
    public static final n0 DEFAULT_INSTANCE;
    private static volatile w0<n0> PARSER = null;
    public static final int SOURCE_TYPE_FIELD_NUMBER = 1;
    private int sourceType_;

    public static final class a extends v.a<n0, a> implements p0 {
        public a() {
            super(n0.DEFAULT_INSTANCE);
        }
    }

    static {
        n0 n0Var = new n0();
        DEFAULT_INSTANCE = n0Var;
        v.r(n0.class, n0Var);
    }

    public static n0 t() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"sourceType_"});
            case 3:
                return new n0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<n0> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (n0.class) {
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

    public final o0 u() {
        int i8 = this.sourceType_;
        o0 o0Var = i8 != 0 ? i8 != 1 ? i8 != 2 ? null : o0.PLATFORM_INT32_SOURCE_TYPE_DAILY_STEP_COUNT : o0.PLATFORM_INT32_SOURCE_TYPE_CURRENT_HEART_RATE : o0.PLATFORM_INT32_SOURCE_TYPE_UNDEFINED;
        return o0Var == null ? o0.UNRECOGNIZED : o0Var;
    }
}
