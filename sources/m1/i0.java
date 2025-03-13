package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class i0 extends v<i0, a> implements p0 {
    /* access modifiers changed from: private */
    public static final i0 DEFAULT_INSTANCE;
    public static final int GROUPING_USED_FIELD_NUMBER = 5;
    public static final int INPUT_FIELD_NUMBER = 1;
    public static final int MIN_INTEGER_DIGITS_FIELD_NUMBER = 4;
    private static volatile w0<i0> PARSER;
    private int bitField0_;
    private boolean groupingUsed_;
    private c0 input_;
    private int minIntegerDigits_;

    public static final class a extends v.a<i0, a> implements p0 {
        public a() {
            super(i0.DEFAULT_INSTANCE);
        }
    }

    static {
        i0 i0Var = new i0();
        DEFAULT_INSTANCE = i0Var;
        v.r(i0.class, i0Var);
    }

    public static i0 t() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001\t\u0004င\u0000\u0005\u0007", new Object[]{"bitField0_", "input_", "minIntegerDigits_", "groupingUsed_"});
            case 3:
                return new i0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<i0> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (i0.class) {
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

    public final boolean u() {
        return this.groupingUsed_;
    }

    public final c0 v() {
        c0 c0Var = this.input_;
        return c0Var == null ? c0.x() : c0Var;
    }

    public final int w() {
        return this.minIntegerDigits_;
    }

    public final boolean x() {
        return this.input_ != null;
    }
}
