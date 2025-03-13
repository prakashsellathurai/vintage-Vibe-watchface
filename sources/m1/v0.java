package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class v0 extends v<v0, a> implements p0 {
    /* access modifiers changed from: private */
    public static final v0 DEFAULT_INSTANCE;
    private static volatile w0<v0> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private long seconds_;

    public static final class a extends v.a<v0, a> implements p0 {
        public a() {
            super(v0.DEFAULT_INSTANCE);
        }
    }

    static {
        v0 v0Var = new v0();
        DEFAULT_INSTANCE = v0Var;
        v.r(v0.class, v0Var);
    }

    public static v0 t() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"seconds_"});
            case 3:
                return new v0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<v0> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (v0.class) {
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
        return this.seconds_;
    }
}
