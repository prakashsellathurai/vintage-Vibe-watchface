package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class s extends v<s, a> implements p0 {
    public static final int CONDITION_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final s DEFAULT_INSTANCE;
    private static volatile w0<s> PARSER = null;
    public static final int VALUE_IF_FALSE_FIELD_NUMBER = 3;
    public static final int VALUE_IF_TRUE_FIELD_NUMBER = 2;
    private y condition_;
    private z valueIfFalse_;
    private z valueIfTrue_;

    public static final class a extends v.a<s, a> implements p0 {
        public a() {
            super(s.DEFAULT_INSTANCE);
        }
    }

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        v.r(s.class, sVar);
    }

    public static s u() {
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
                return new s();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<s> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (s.class) {
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

    public final z v() {
        z zVar = this.valueIfFalse_;
        return zVar == null ? z.v() : zVar;
    }

    public final z w() {
        z zVar = this.valueIfTrue_;
        return zVar == null ? z.v() : zVar;
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
