package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class u0 extends v<u0, a> implements p0 {
    /* access modifiers changed from: private */
    public static final u0 DEFAULT_INSTANCE;
    private static volatile w0<u0> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    public static final class a extends v.a<u0, a> implements p0 {
        public a() {
            super(u0.DEFAULT_INSTANCE);
        }
    }

    static {
        u0 u0Var = new u0();
        DEFAULT_INSTANCE = u0Var;
        v.r(u0.class, u0Var);
    }

    public static u0 t() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            case 3:
                return new u0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<u0> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (u0.class) {
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
        return this.value_;
    }
}
