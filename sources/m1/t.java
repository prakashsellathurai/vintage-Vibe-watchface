package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class t extends v<t, a> implements p0 {
    public static final int CONDITION_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final t DEFAULT_INSTANCE;
    private static volatile w0<t> PARSER = null;
    public static final int VALUE_IF_FALSE_FIELD_NUMBER = 3;
    public static final int VALUE_IF_TRUE_FIELD_NUMBER = 2;
    private y condition_;
    private a0 valueIfFalse_;
    private a0 valueIfTrue_;

    public static final class a extends v.a<t, a> implements p0 {
        public a() {
            super(t.DEFAULT_INSTANCE);
        }
    }

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        v.r(t.class, tVar);
    }

    public static t u() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"condition_", "valueIfTrue_", "valueIfFalse_"});
            case 3:
                return new t();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<t> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (t.class) {
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

    public final y t() {
        y yVar = this.condition_;
        return yVar == null ? y.t() : yVar;
    }

    public final a0 v() {
        a0 a0Var = this.valueIfFalse_;
        return a0Var == null ? a0.E() : a0Var;
    }

    public final a0 w() {
        a0 a0Var = this.valueIfTrue_;
        return a0Var == null ? a0.E() : a0Var;
    }

    public final boolean x() {
        return this.condition_ != null;
    }

    public final boolean y() {
        return this.valueIfFalse_ != null;
    }

    public final boolean z() {
        return this.valueIfTrue_ != null;
    }
}
