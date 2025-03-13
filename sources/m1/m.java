package m1;

import androidx.wear.protolayout.protobuf.x;

public enum m implements x.a {
    ARITHMETIC_OP_TYPE_UNDEFINED(0),
    ARITHMETIC_OP_TYPE_ADD(1),
    ARITHMETIC_OP_TYPE_SUBTRACT(2),
    ARITHMETIC_OP_TYPE_MULTIPLY(3),
    ARITHMETIC_OP_TYPE_DIVIDE(4),
    ARITHMETIC_OP_TYPE_MODULO(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: f  reason: collision with root package name */
    public final int f5384f;

    /* access modifiers changed from: public */
    m(int i8) {
        this.f5384f = i8;
    }

    public static m e(int i8) {
        if (i8 == 0) {
            return ARITHMETIC_OP_TYPE_UNDEFINED;
        }
        if (i8 == 1) {
            return ARITHMETIC_OP_TYPE_ADD;
        }
        if (i8 == 2) {
            return ARITHMETIC_OP_TYPE_SUBTRACT;
        }
        if (i8 == 3) {
            return ARITHMETIC_OP_TYPE_MULTIPLY;
        }
        if (i8 == 4) {
            return ARITHMETIC_OP_TYPE_DIVIDE;
        }
        if (i8 != 5) {
            return null;
        }
        return ARITHMETIC_OP_TYPE_MODULO;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f5384f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
