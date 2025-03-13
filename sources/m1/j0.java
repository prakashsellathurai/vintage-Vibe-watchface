package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class j0 extends v<j0, a> implements p0 {
    /* access modifiers changed from: private */
    public static final j0 DEFAULT_INSTANCE;
    public static final int INPUT_FIELD_NUMBER = 1;
    private static volatile w0<j0> PARSER;
    private c0 input_;

    public static final class a extends v.a<j0, a> implements p0 {
        public a() {
            super(j0.DEFAULT_INSTANCE);
        }
    }

    static {
        j0 j0Var = new j0();
        DEFAULT_INSTANCE = j0Var;
        v.r(j0.class, j0Var);
    }

    public static j0 t() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"input_"});
            case 3:
                return new j0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<j0> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (j0.class) {
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

    public final c0 u() {
        c0 c0Var = this.input_;
        return c0Var == null ? c0.x() : c0Var;
    }

    public final boolean v() {
        return this.input_ != null;
    }
}
