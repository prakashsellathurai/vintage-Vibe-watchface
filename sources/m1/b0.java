package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class b0 extends v<b0, a> implements p0 {
    public static final int CONDITIONAL_OP_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final b0 DEFAULT_INSTANCE;
    public static final int FIXED_FIELD_NUMBER = 1;
    private static volatile w0<b0> PARSER = null;
    public static final int PLATFORM_SOURCE_FIELD_NUMBER = 2;
    private int innerCase_ = 0;
    private Object inner_;

    public static final class a extends v.a<b0, a> implements p0 {
        public a() {
            super(b0.DEFAULT_INSTANCE);
        }
    }

    static {
        b0 b0Var = new b0();
        DEFAULT_INSTANCE = b0Var;
        v.r(b0.class, b0Var);
    }

    public static b0 u() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"inner_", "innerCase_", x0.class, p0.class, u.class});
            case 3:
                return new b0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<b0> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (b0.class) {
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

    public final u t() {
        return this.innerCase_ == 3 ? (u) this.inner_ : u.u();
    }

    public final x0 v() {
        return this.innerCase_ == 1 ? (x0) this.inner_ : x0.t();
    }

    public final p0 w() {
        return this.innerCase_ == 2 ? (p0) this.inner_ : p0.t();
    }

    public final boolean x() {
        return this.innerCase_ == 3;
    }

    public final boolean y() {
        return this.innerCase_ == 1;
    }

    public final boolean z() {
        return this.innerCase_ == 2;
    }
}
