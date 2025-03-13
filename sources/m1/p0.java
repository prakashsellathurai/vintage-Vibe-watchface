package m1;

import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class p0 extends v<p0, a> implements androidx.wear.protolayout.protobuf.p0 {
    /* access modifiers changed from: private */
    public static final p0 DEFAULT_INSTANCE;
    private static volatile w0<p0> PARSER;

    public static final class a extends v.a<p0, a> implements androidx.wear.protolayout.protobuf.p0 {
        public a() {
            super(p0.DEFAULT_INSTANCE);
        }
    }

    static {
        p0 p0Var = new p0();
        DEFAULT_INSTANCE = p0Var;
        v.r(p0.class, p0Var);
    }

    public static p0 t() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            case 3:
                return new p0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<p0> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (p0.class) {
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
}
