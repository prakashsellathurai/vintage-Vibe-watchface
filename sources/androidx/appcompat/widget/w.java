package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import d0.d;
import h.a;

@SuppressLint({"RestrictedAPI"})
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final Rect f833a = new Rect();

    static {
        try {
            Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    public static boolean a(Drawable drawable) {
        Drawable drawable2;
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable a9 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!a(a9)) {
                    return false;
                }
            }
            return true;
        }
        if (drawable instanceof d) {
            drawable2 = ((d) drawable).a();
        } else if (drawable instanceof a) {
            return a(((a) drawable).f4714a);
        } else {
            if (!(drawable instanceof ScaleDrawable)) {
                return true;
            }
            drawable2 = ((ScaleDrawable) drawable).getDrawable();
        }
        return a(drawable2);
    }

    public static Rect b(Drawable drawable) {
        Insets opticalInsets = drawable.getOpticalInsets();
        Rect rect = new Rect();
        rect.left = opticalInsets.left;
        rect.right = opticalInsets.right;
        rect.top = opticalInsets.top;
        rect.bottom = opticalInsets.bottom;
        return rect;
    }

    public static PorterDuff.Mode c(int i8, PorterDuff.Mode mode) {
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
