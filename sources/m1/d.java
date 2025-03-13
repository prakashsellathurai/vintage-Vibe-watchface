package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class d extends v<d, a> implements p0 {
    public static final int CUBIC_BEZIER_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final d DEFAULT_INSTANCE;
    private static volatile w0<d> PARSER;
    private int innerCase_ = 0;
    private Object inner_;

    public static final class a extends v.a<d, a> implements p0 {
        public a() {
            super(d.DEFAULT_INSTANCE);
        }
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        v.r(d.class, dVar);
    }

    public static d u() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"inner_", "innerCase_", c.class});
            case 3:
                return new d();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<d> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (d.class) {
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

    public final c t() {
        return this.innerCase_ == 1 ? (c) this.inner_ : c.t();
    }

    public final boolean v() {
        return this.innerCase_ == 1;
    }
}
