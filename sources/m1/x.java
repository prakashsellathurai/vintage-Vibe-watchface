package m1;

import androidx.wear.protolayout.protobuf.x;

public enum x implements x.a {
    DURATION_PART_TYPE_UNDEFINED(0),
    DURATION_PART_TYPE_TOTAL_DAYS(1),
    DURATION_PART_TYPE_TOTAL_HOURS(2),
    DURATION_PART_TYPE_TOTAL_MINUTES(3),
    DURATION_PART_TYPE_TOTAL_SECONDS(4),
    DURATION_PART_TYPE_DAYS(5),
    DURATION_PART_TYPE_HOURS(6),
    DURATION_PART_TYPE_MINUTES(7),
    DURATION_PART_TYPE_SECONDS(8),
    UNRECOGNIZED(-1);
    

    /* renamed from: f  reason: collision with root package name */
    public final int f5412f;

    /* access modifiers changed from: public */
    x(int i8) {
        this.f5412f = i8;
    }

    public static x e(int i8) {
        switch (i8) {
            case 0:
                return DURATION_PART_TYPE_UNDEFINED;
            case 1:
                return DURATION_PART_TYPE_TOTAL_DAYS;
            case 2:
                return DURATION_PART_TYPE_TOTAL_HOURS;
            case 3:
                return DURATION_PART_TYPE_TOTAL_MINUTES;
            case 4:
                return DURATION_PART_TYPE_TOTAL_SECONDS;
            case 5:
                return DURATION_PART_TYPE_DAYS;
            case 6:
                return DURATION_PART_TYPE_HOURS;
            case 7:
                return DURATION_PART_TYPE_MINUTES;
            case 8:
                return DURATION_PART_TYPE_SECONDS;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f5412f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
