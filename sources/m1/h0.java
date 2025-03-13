package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class h0 extends v<h0, a> implements p0 {
    /* access modifiers changed from: private */
    public static final h0 DEFAULT_INSTANCE;
    public static final int DURATION_PART_FIELD_NUMBER = 2;
    public static final int INPUT_FIELD_NUMBER = 1;
    private static volatile w0<h0> PARSER;
    private int durationPart_;
    private z input_;

    public static final class a extends v.a<h0, a> implements p0 {
        public a() {
            super(h0.DEFAULT_INSTANCE);
        }
    }

    static {
        h0 h0Var = new h0();
        DEFAULT_INSTANCE = h0Var;
        v.r(h0.class, h0Var);
    }

    public static h0 t() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"input_", "durationPart_"});
            case 3:
                return new h0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<h0> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (h0.class) {
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

    public final x u() {
        x e = x.e(this.durationPart_);
        return e == null ? x.UNRECOGNIZED : e;
    }

    public final z v() {
        z zVar = this.input_;
        return zVar == null ? z.v() : zVar;
    }

    public final boolean w() {
        return this.input_ != null;
    }
}
