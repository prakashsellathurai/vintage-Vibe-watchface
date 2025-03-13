package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class e0 extends v<e0, a> implements p0 {
    /* access modifiers changed from: private */
    public static final e0 DEFAULT_INSTANCE;
    public static final int GROUPING_USED_FIELD_NUMBER = 5;
    public static final int INPUT_FIELD_NUMBER = 1;
    public static final int MAX_FRACTION_DIGITS_FIELD_NUMBER = 2;
    public static final int MIN_FRACTION_DIGITS_FIELD_NUMBER = 3;
    public static final int MIN_INTEGER_DIGITS_FIELD_NUMBER = 4;
    private static volatile w0<e0> PARSER;
    private int bitField0_;
    private boolean groupingUsed_;
    private a0 input_;
    private int maxFractionDigits_;
    private int minFractionDigits_;
    private int minIntegerDigits_;

    public static final class a extends v.a<e0, a> implements p0 {
        public a() {
            super(e0.DEFAULT_INSTANCE);
        }
    }

    static {
        e0 e0Var = new e0();
        DEFAULT_INSTANCE = e0Var;
        v.r(e0.class, e0Var);
    }

    public static e0 t() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002င\u0000\u0003\u0004\u0004င\u0001\u0005\u0007", new Object[]{"bitField0_", "input_", "maxFractionDigits_", "minFractionDigits_", "minIntegerDigits_", "groupingUsed_"});
            case 3:
                return new e0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<e0> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (e0.class) {
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

    public final a0 v() {
        a0 a0Var = this.input_;
        return a0Var == null ? a0.E() : a0Var;
    }

    public final int w() {
        return this.maxFractionDigits_;
    }

    public final int x() {
        return this.minFractionDigits_;
    }

    public final int y() {
        return this.minIntegerDigits_;
    }

    public final boolean z() {
        return this.input_ != null;
    }
}
