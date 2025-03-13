package u4;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;

public final class n {

    public interface a {
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f7784a;

        public b(int i8, int i9, int i10, int i11) {
            this.f7784a = i8;
        }
    }

    public static float a(Context context, int i8) {
        return TypedValue.applyDimension(1, (float) i8, context.getResources().getDisplayMetrics());
    }

    public static PorterDuff.Mode b(int i8, PorterDuff.Mode mode) {
        if (i8 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i8 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i8 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i8) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
