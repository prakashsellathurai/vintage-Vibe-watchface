package q1;

public enum d {
    NO_DATA(10),
    EMPTY(2),
    NOT_CONFIGURED(1),
    SHORT_TEXT(3),
    LONG_TEXT(4),
    RANGED_VALUE(5),
    MONOCHROMATIC_IMAGE(6),
    SMALL_IMAGE(7),
    PHOTO_IMAGE(8),
    NO_PERMISSION(9),
    GOAL_PROGRESS(13),
    WEIGHTED_ELEMENTS(14);
    

    /* renamed from: f  reason: collision with root package name */
    public final int f6450f;

    public static final class a {
        public static d a(int i8) {
            if (i8 == 10) {
                return d.NO_DATA;
            }
            d dVar = d.EMPTY;
            if (i8 != 2) {
                if (i8 == 1) {
                    return d.NOT_CONFIGURED;
                }
                if (i8 == 3) {
                    return d.SHORT_TEXT;
                }
                if (i8 == 4) {
                    return d.LONG_TEXT;
                }
                if (i8 == 5) {
                    return d.RANGED_VALUE;
                }
                if (i8 == 6) {
                    return d.MONOCHROMATIC_IMAGE;
                }
                if (i8 == 7) {
                    return d.SMALL_IMAGE;
                }
                if (i8 == 8) {
                    return d.PHOTO_IMAGE;
                }
                if (i8 == 9) {
                    return d.NO_PERMISSION;
                }
                if (i8 == 13) {
                    return d.GOAL_PROGRESS;
                }
                if (i8 == 14) {
                    return d.WEIGHTED_ELEMENTS;
                }
            }
            return dVar;
        }
    }

    /* access modifiers changed from: public */
    d(int i8) {
        this.f6450f = i8;
    }
}
