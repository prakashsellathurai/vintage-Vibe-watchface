package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

public final class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f649a;

    public b(ActionBarContainer actionBarContainer) {
        this.f649a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f649a;
        if (actionBarContainer.f480h) {
            Drawable drawable = actionBarContainer.f479g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f478f;
        if (drawable3 != null && actionBarContainer.f481i) {
            drawable3.draw(canvas);
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f649a;
        if (actionBarContainer.f480h) {
            drawable = actionBarContainer.f479g;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.e;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    public final void setAlpha(int i8) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
