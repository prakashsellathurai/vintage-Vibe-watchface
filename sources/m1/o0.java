package m1;

import androidx.wear.protolayout.protobuf.x;

public enum o0 implements x.a {
    PLATFORM_INT32_SOURCE_TYPE_UNDEFINED(0),
    PLATFORM_INT32_SOURCE_TYPE_CURRENT_HEART_RATE(1),
    PLATFORM_INT32_SOURCE_TYPE_DAILY_STEP_COUNT(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: f  reason: collision with root package name */
    public final int f5390f;

    /* access modifiers changed from: public */
    o0(int i8) {
        this.f5390f = i8;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f5390f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
