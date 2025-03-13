package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class f0 extends v<f0, a> implements p0 {
    /* access modifiers changed from: private */
    public static final f0 DEFAULT_INSTANCE;
    public static final int INPUT_FIELD_NUMBER = 1;
    private static volatile w0<f0> PARSER = null;
    public static final int ROUND_MODE_FIELD_NUMBER = 2;
    private a0 input_;
    private int roundMode_;

    public static final class a extends v.a<f0, a> implements p0 {
        public a() {
            super(f0.DEFAULT_INSTANCE);
        }
    }

    static {
        f0 f0Var = new f0();
        DEFAULT_INSTANCE = f0Var;
        v.r(f0.class, f0Var);
    }

    public static f0 t() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"input_", "roundMode_"});
            case 3:
                return new f0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<f0> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (f0.class) {
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
        a0 a0Var = this.input_;
        return a0Var == null ? a0.E() : a0Var;
    }

    public final g0 v() {
        int i8 = this.roundMode_;
        g0 g0Var = i8 != 0 ? i8 != 1 ? i8 != 2 ? i8 != 3 ? null : g0.ROUND_MODE_CEILING : g0.ROUND_MODE_ROUND : g0.ROUND_MODE_FLOOR : g0.ROUND_MODE_UNDEFINED;
        return g0Var == null ? g0.UNRECOGNIZED : g0Var;
    }

    public final boolean w() {
        return this.input_ != null;
    }
}
