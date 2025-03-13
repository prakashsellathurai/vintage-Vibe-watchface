package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class h extends v<h, a> implements p0 {
    public static final int ANIMATION_SPEC_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final h DEFAULT_INSTANCE;
    public static final int INPUT_FIELD_NUMBER = 1;
    private static volatile w0<h> PARSER;
    private b animationSpec_;
    private c0 input_;

    public static final class a extends v.a<h, a> implements p0 {
        public a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        v.r(h.class, hVar);
    }

    public static h u() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"input_", "animationSpec_"});
            case 3:
                return new h();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<h> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (h.class) {
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

    public final b t() {
        b bVar = this.animationSpec_;
        return bVar == null ? b.u() : bVar;
    }

    public final c0 v() {
        c0 c0Var = this.input_;
        return c0Var == null ? c0.x() : c0Var;
    }

    public final boolean w() {
        return this.animationSpec_ != null;
    }

    public final boolean x() {
        return this.input_ != null;
    }
}
