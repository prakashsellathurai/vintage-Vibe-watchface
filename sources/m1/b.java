package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class b extends v<b, a> implements p0 {
    public static final int ANIMATION_PARAMETERS_FIELD_NUMBER = 4;
    /* access modifiers changed from: private */
    public static final b DEFAULT_INSTANCE;
    public static final int DURATION_MILLIS_FIELD_NUMBER = 1;
    public static final int EASING_FIELD_NUMBER = 3;
    private static volatile w0<b> PARSER = null;
    public static final int REPEATABLE_FIELD_NUMBER = 5;
    public static final int START_DELAY_MILLIS_FIELD_NUMBER = 2;
    private a animationParameters_;
    private int durationMillis_;
    private d easing_;
    private f repeatable_;
    private int startDelayMillis_;

    public static final class a extends v.a<b, a> implements p0 {
        public a() {
            super(b.DEFAULT_INSTANCE);
        }
    }

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        v.r(b.class, bVar);
    }

    public static b u() {
        return DEFAULT_INSTANCE;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\t\u0004\t\u0005\t", new Object[]{"durationMillis_", "startDelayMillis_", "easing_", "animationParameters_", "repeatable_"});
            case 3:
                return new b();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<b> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (b.class) {
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

    public final a t() {
        a aVar = this.animationParameters_;
        return aVar == null ? a.t() : aVar;
    }

    public final f v() {
        f fVar = this.repeatable_;
        return fVar == null ? f.u() : fVar;
    }

    public final boolean w() {
        return this.animationParameters_ != null;
    }

    public final boolean x() {
        return this.repeatable_ != null;
    }
}
