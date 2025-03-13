package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class t0 extends v<t0, a> implements p0 {
    /* access modifiers changed from: private */
    public static final t0 DEFAULT_INSTANCE;
    private static volatile w0<t0> PARSER = null;
    public static final int SOURCE_KEY_FIELD_NUMBER = 1;
    public static final int SOURCE_NAMESPACE_FIELD_NUMBER = 2;
    private String sourceKey_ = "";
    private String sourceNamespace_ = "";

    public static final class a extends v.a<t0, a> implements p0 {
        public a() {
            super(t0.DEFAULT_INSTANCE);
        }
    }

    static {
        t0 t0Var = new t0();
        DEFAULT_INSTANCE = t0Var;
        v.r(t0.class, t0Var);
    }

    public static t0 t() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"sourceKey_", "sourceNamespace_"});
            case 3:
                return new t0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<t0> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (t0.class) {
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

    public final String u() {
        return this.sourceKey_;
    }

    public final String v() {
        return this.sourceNamespace_;
    }
}
