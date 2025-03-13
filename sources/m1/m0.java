package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class m0 extends v<m0, a> implements p0 {
    /* access modifiers changed from: private */
    public static final m0 DEFAULT_INSTANCE;
    public static final int INPUT_FIELD_NUMBER = 1;
    private static volatile w0<m0> PARSER;
    private y input_;

    public static final class a extends v.a<m0, a> implements p0 {
        public a() {
            super(m0.DEFAULT_INSTANCE);
        }
    }

    static {
        m0 m0Var = new m0();
        DEFAULT_INSTANCE = m0Var;
        v.r(m0.class, m0Var);
    }

    public static m0 t() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"input_"});
            case 3:
                return new m0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<m0> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (m0.class) {
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

    public final y u() {
        y yVar = this.input_;
        return yVar == null ? y.t() : yVar;
    }

    public final boolean v() {
        return this.input_ != null;
    }
}
