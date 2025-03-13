package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class a extends v<a, C0079a> implements p0 {
    /* access modifiers changed from: private */
    public static final a DEFAULT_INSTANCE;
    public static final int DELAY_MILLIS_FIELD_NUMBER = 3;
    public static final int DURATION_MILLIS_FIELD_NUMBER = 1;
    public static final int EASING_FIELD_NUMBER = 2;
    private static volatile w0<a> PARSER;
    private long durationMillis_;
    private d easing_;
    private int optionalDelayMillisCase_ = 0;
    private Object optionalDelayMillis_;

    /* renamed from: m1.a$a  reason: collision with other inner class name */
    public static final class C0079a extends v.a<a, C0079a> implements p0 {
        public C0079a() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        v.r(a.class, aVar);
    }

    public static a t() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0003\u0002\t\u00036\u0000", new Object[]{"optionalDelayMillis_", "optionalDelayMillisCase_", "durationMillis_", "easing_"});
            case 3:
                return new a();
            case 4:
                return new C0079a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<a> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (a.class) {
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

    public final long u() {
        if (this.optionalDelayMillisCase_ == 3) {
            return ((Long) this.optionalDelayMillis_).longValue();
        }
        return 0;
    }

    public final long v() {
        return this.durationMillis_;
    }

    public final d w() {
        d dVar = this.easing_;
        return dVar == null ? d.u() : dVar;
    }

    public final boolean x() {
        return this.easing_ != null;
    }
}
