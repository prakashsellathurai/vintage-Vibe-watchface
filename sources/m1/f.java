package m1;

import androidx.wear.protolayout.protobuf.p0;
import androidx.wear.protolayout.protobuf.v;
import androidx.wear.protolayout.protobuf.w0;
import androidx.wear.protolayout.protobuf.z0;

public final class f extends v<f, a> implements p0 {
    /* access modifiers changed from: private */
    public static final f DEFAULT_INSTANCE;
    public static final int FORWARD_REPEAT_OVERRIDE_FIELD_NUMBER = 6;
    public static final int ITERATIONS_FIELD_NUMBER = 1;
    private static volatile w0<f> PARSER = null;
    public static final int REPEAT_MODE_FIELD_NUMBER = 2;
    public static final int REVERSE_REPEAT_OVERRIDE_FIELD_NUMBER = 7;
    private a forwardRepeatOverride_;
    private int iterations_;
    private int repeatMode_;
    private a reverseRepeatOverride_;

    public static final class a extends v.a<f, a> implements p0 {
        public a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        v.r(f.class, fVar);
    }

    public static a B() {
        return (a) ((v.a) DEFAULT_INSTANCE.j(v.f.f2207j));
    }

    public static void t(f fVar, e eVar) {
        fVar.getClass();
        fVar.repeatMode_ = eVar.getNumber();
    }

    public static f u() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return this.reverseRepeatOverride_ != null;
    }

    public final Object j(v.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001\u000b\u0002\f\u0006\t\u0007\t", new Object[]{"iterations_", "repeatMode_", "forwardRepeatOverride_", "reverseRepeatOverride_"});
            case 3:
                return new f();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                w0<f> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (f.class) {
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

    public final a v() {
        a aVar = this.forwardRepeatOverride_;
        return aVar == null ? a.t() : aVar;
    }

    public final int w() {
        return this.iterations_;
    }

    public final e x() {
        e e = e.e(this.repeatMode_);
        return e == null ? e.UNRECOGNIZED : e;
    }

    public final a y() {
        a aVar = this.reverseRepeatOverride_;
        return aVar == null ? a.t() : aVar;
    }

    public final boolean z() {
        return this.forwardRepeatOverride_ != null;
    }
}
