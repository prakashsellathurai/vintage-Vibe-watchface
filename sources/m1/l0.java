package m1;

import androidx.wear.protolayout.protobuf.x;

public enum l0 implements x.a {
    LOGICAL_OP_TYPE_UNDEFINED(0),
    LOGICAL_OP_TYPE_AND(1),
    LOGICAL_OP_TYPE_OR(2),
    LOGICAL_OP_TYPE_EQUAL(3),
    LOGICAL_OP_TYPE_NOT_EQUAL(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: f  reason: collision with root package name */
    public final int f5375f;

    /* access modifiers changed from: public */
    l0(int i8) {
        this.f5375f = i8;
    }

    public static l0 e(int i8) {
        if (i8 == 0) {
            return LOGICAL_OP_TYPE_UNDEFINED;
        }
        if (i8 == 1) {
            return LOGICAL_OP_TYPE_AND;
        }
        if (i8 == 2) {
            return LOGICAL_OP_TYPE_OR;
        }
        if (i8 == 3) {
            return LOGICAL_OP_TYPE_EQUAL;
        }
        if (i8 != 4) {
            return null;
        }
        return LOGICAL_OP_TYPE_NOT_EQUAL;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f5375f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
