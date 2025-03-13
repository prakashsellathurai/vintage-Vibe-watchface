package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class j extends v<j, a> implements p0 {
    public static final int ANIMATION_SPEC_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final j DEFAULT_INSTANCE;
    public static final int FROM_VALUE_FIELD_NUMBER = 1;
    private static volatile w0<j> PARSER = null;
    public static final int TO_VALUE_FIELD_NUMBER = 2;
    private b animationSpec_;
    private int fromValue_;
    private int toValue_;

    public static final class a extends v.a<j, a> implements p0 {
        public a() {
            super(j.DEFAULT_INSTANCE);
        }
    }

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        v.r(j.class, jVar);
    }

    public static j u() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\t", new Object[]{"fromValue_", "toValue_", "animationSpec_"});
            case 3:
                return new j();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<j> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (j.class) {
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

    public final int v() {
        return this.fromValue_;
    }

    public final int w() {
        return this.toValue_;
    }

    public final boolean x() {
        return this.animationSpec_ != null;
    }
}
