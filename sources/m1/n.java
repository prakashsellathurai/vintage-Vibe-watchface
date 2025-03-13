package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class n extends v<n, a> implements p0 {
    /* access modifiers changed from: private */
    public static final n DEFAULT_INSTANCE;
    public static final int END_EXCLUSIVE_FIELD_NUMBER = 2;
    private static volatile w0<n> PARSER = null;
    public static final int START_INCLUSIVE_FIELD_NUMBER = 1;
    private b0 endExclusive_;
    private b0 startInclusive_;

    public static final class a extends v.a<n, a> implements p0 {
        public a() {
            super(n.DEFAULT_INSTANCE);
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        v.r(n.class, nVar);
    }

    public static n t() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"startInclusive_", "endExclusive_"});
            case 3:
                return new n();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<n> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (n.class) {
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

    public final b0 u() {
        b0 b0Var = this.endExclusive_;
        return b0Var == null ? b0.u() : b0Var;
    }

    public final b0 v() {
        b0 b0Var = this.startInclusive_;
        return b0Var == null ? b0.u() : b0Var;
    }

    public final boolean w() {
        return this.endExclusive_ != null;
    }

    public final boolean x() {
        return this.startInclusive_ != null;
    }
}
