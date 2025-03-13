package w4;

import android.content.res.ColorStateList;
import android.graphics.Color;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f8011a = {16842919};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f8012b = {16842913, 16842919};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f8013c = {16842913};

    public static int a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return c0.a.b(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static boolean b(int[] iArr) {
        boolean z8 = false;
        boolean z9 = false;
        for (int i8 : iArr) {
            if (i8 == 16842910) {
                z8 = true;
            } else if (i8 == 16842908 || i8 == 16842919 || i8 == 16843623) {
                z9 = true;
            }
        }
        return z8 && z9;
    }
}
