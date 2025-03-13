package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class g extends v<g, a> implements p0 {
    public static final int ANIMATION_SPEC_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final g DEFAULT_INSTANCE;
    public static final int INPUT_FIELD_NUMBER = 1;
    private static volatile w0<g> PARSER;
    private b animationSpec_;
    private a0 input_;

    public static final class a extends v.a<g, a> implements p0 {
        public a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        v.r(g.class, gVar);
    }

    public static g u() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\t\u0003\t", new Object[]{"input_", "animationSpec_"});
            case 3:
                return new g();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<g> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (g.class) {
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

    public final a0 v() {
        a0 a0Var = this.input_;
        return a0Var == null ? a0.E() : a0Var;
    }

    public final boolean w() {
        return this.animationSpec_ != null;
    }

    public final boolean x() {
        return this.input_ != null;
    }
}
