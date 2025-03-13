package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.z0;

public final class w0 extends v<w0, a> implements p0 {
    /* access modifiers changed from: private */
    public static final w0 DEFAULT_INSTANCE;
    private static volatile androidx.wear.protolayout.protobuf.w0<w0> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private float value_;

    public static final class a extends v.a<w0, a> implements p0 {
        public a() {
            super(w0.DEFAULT_INSTANCE);
        }
    }

    static {
        w0 w0Var = new w0();
        DEFAULT_INSTANCE = w0Var;
        v.r(w0.class, w0Var);
    }

    public static w0 t() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"value_"});
            case 3:
                return new w0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                androidx.wear.protolayout.protobuf.w0<w0> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (w0.class) {
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

    public final float u() {
        return this.value_;
    }
}
