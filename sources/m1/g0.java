package m1;

import androidx.wear.protolayout.protobuf.x;

public enum g0 implements x.a {
    ROUND_MODE_UNDEFINED(0),
    ROUND_MODE_FLOOR(1),
    ROUND_MODE_ROUND(2),
    ROUND_MODE_CEILING(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f  reason: collision with root package name */
    public final int f5367f;

    /* access modifiers changed from: public */
    g0(int i8) {
        this.f5367f = i8;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f5367f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
