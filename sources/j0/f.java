package j0;

import android.graphics.Rect;
import android.view.Gravity;

public final class f {
    public static void a(int i8, int i9, int i10, Rect rect, int i11, int i12, Rect rect2, int i13) {
        Gravity.apply(i8, i9, i10, rect, i11, i12, rect2, i13);
    }

    public static void b(int i8, int i9, int i10, Rect rect, Rect rect2, int i11) {
        Gravity.apply(i8, i9, i10, rect, rect2, i11);
    }

    public static void c(int i8, Rect rect, Rect rect2, int i9) {
        Gravity.applyDisplay(i8, rect, rect2, i9);
    }
}
