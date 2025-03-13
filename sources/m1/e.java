package m1;

import androidx.wear.protolayout.protobuf.x;

public enum e implements x.a {
    REPEAT_MODE_UNKNOWN(0),
    REPEAT_MODE_RESTART(1),
    REPEAT_MODE_REVERSE(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: f  reason: collision with root package name */
    public final int f5360f;

    /* access modifiers changed from: public */
    e(int i8) {
        this.f5360f = i8;
    }

    public static e e(int i8) {
        if (i8 == 0) {
            return REPEAT_MODE_UNKNOWN;
        }
        if (i8 == 1) {
            return REPEAT_MODE_RESTART;
        }
        if (i8 != 2) {
            return null;
        }
        return REPEAT_MODE_REVERSE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f5360f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
