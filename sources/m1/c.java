package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class c extends v<c, a> implements p0 {
    /* access modifiers changed from: private */
    public static final c DEFAULT_INSTANCE;
    private static volatile w0<c> PARSER = null;
    public static final int X1_FIELD_NUMBER = 1;
    public static final int X2_FIELD_NUMBER = 3;
    public static final int Y1_FIELD_NUMBER = 2;
    public static final int Y2_FIELD_NUMBER = 4;
    private float x1_;
    private float x2_;
    private float y1_;
    private float y2_;

    public static final class a extends v.a<c, a> implements p0 {
        public a() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        v.r(c.class, cVar);
    }

    public static c t() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0001", new Object[]{"x1_", "y1_", "x2_", "y2_"});
            case 3:
                return new c();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<c> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (c.class) {
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

    public final float u() {
        return this.x1_;
    }

    public final float v() {
        return this.x2_;
    }

    public final float w() {
        return this.y1_;
    }

    public final float x() {
        return this.y2_;
    }
}
