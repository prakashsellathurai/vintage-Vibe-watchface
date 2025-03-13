package j0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

public final class t {
    public static PointerIcon a(Bitmap bitmap, float f9, float f10) {
        return PointerIcon.create(bitmap, f9, f10);
    }

    public static PointerIcon b(Context context, int i8) {
        return PointerIcon.getSystemIcon(context, i8);
    }

    public static PointerIcon c(Resources resources, int i8) {
        return PointerIcon.load(resources, i8);
    }
}
