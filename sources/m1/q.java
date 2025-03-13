package m1;

import androidx.wear.protolayout.protobuf.x;

public enum q implements x.a {
    COMPARISON_OP_TYPE_UNDEFINED(0),
    COMPARISON_OP_TYPE_EQUALS(1),
    COMPARISON_OP_TYPE_NOT_EQUALS(2),
    COMPARISON_OP_TYPE_LESS_THAN(3),
    COMPARISON_OP_TYPE_LESS_THAN_OR_EQUAL_TO(4),
    COMPARISON_OP_TYPE_GREATER_THAN(5),
    COMPARISON_OP_TYPE_GREATER_THAN_OR_EQUAL_TO(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: f  reason: collision with root package name */
    public final int f5400f;

    /* access modifiers changed from: public */
    q(int i8) {
        this.f5400f = i8;
    }

    public static q e(int i8) {
        switch (i8) {
            case 0:
                return COMPARISON_OP_TYPE_UNDEFINED;
            case 1:
                return COMPARISON_OP_TYPE_EQUALS;
            case 2:
                return COMPARISON_OP_TYPE_NOT_EQUALS;
            case 3:
                return COMPARISON_OP_TYPE_LESS_THAN;
            case 4:
                return COMPARISON_OP_TYPE_LESS_THAN_OR_EQUAL_TO;
            case 5:
                return COMPARISON_OP_TYPE_GREATER_THAN;
            case 6:
                return COMPARISON_OP_TYPE_GREATER_THAN_OR_EQUAL_TO;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f5400f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
