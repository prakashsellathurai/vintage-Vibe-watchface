package d0;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;

public final class a {
    public static int a(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i8) {
        return drawableContainerState.getChild(i8);
    }

    public static Drawable c(InsetDrawable insetDrawable) {
        return insetDrawable.getDrawable();
    }

    public static boolean d(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void e(Drawable drawable, boolean z8) {
        drawable.setAutoMirrored(z8);
    }
}
