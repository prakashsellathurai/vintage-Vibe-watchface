package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class x0 extends v<x0, a> implements p0 {
    /* access modifiers changed from: private */
    public static final x0 DEFAULT_INSTANCE;
    public static final int EPOCH_SECONDS_FIELD_NUMBER = 1;
    private static volatile w0<x0> PARSER;
    private long epochSeconds_;

    public static final class a extends v.a<x0, a> implements p0 {
        public a() {
            super(x0.DEFAULT_INSTANCE);
        }
    }

    static {
        x0 x0Var = new x0();
        DEFAULT_INSTANCE = x0Var;
        v.r(x0.class, x0Var);
    }

    public static x0 t() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"epochSeconds_"});
            case 3:
                return new x0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<x0> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (x0.class) {
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

    public final long u() {
        return this.epochSeconds_;
    }
}
