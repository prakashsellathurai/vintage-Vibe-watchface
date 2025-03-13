package u4;

import a1.a;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.a0;

public class f extends a0 {

    /* renamed from: p  reason: collision with root package name */
    public Drawable f7765p;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f7766q;
    public final Rect r;

    /* renamed from: s  reason: collision with root package name */
    public int f7767s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f7768t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f7769u;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, 0);
        this.f7766q = new Rect();
        this.r = new Rect();
        this.f7767s = 119;
        this.f7768t = true;
        this.f7769u = false;
        TypedArray d9 = k.d(context, attributeSet, a.T, 0, 0, new int[0]);
        this.f7767s = d9.getInt(1, this.f7767s);
        Drawable drawable = d9.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f7768t = d9.getBoolean(2, true);
        d9.recycle();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f7765p;
        if (drawable != null) {
            if (this.f7769u) {
                this.f7769u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z8 = this.f7768t;
                Rect rect = this.f7766q;
                if (z8) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i8 = this.f7767s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.r;
                Gravity.apply(i8, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public final void drawableHotspotChanged(float f9, float f10) {
        super.drawableHotspotChanged(f9, f10);
        Drawable drawable = this.f7765p;
        if (drawable != null) {
            drawable.setHotspot(f9, f10);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f7765p;
        if (drawable != null && drawable.isStateful()) {
            this.f7765p.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f7765p;
    }

    public int getForegroundGravity() {
        return this.f7767s;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7765p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        this.f7769u = z8 | this.f7769u;
    }

    public final void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        this.f7769u = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f7765p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f7765p);
            }
            this.f7765p = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f7767s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i8) {
        if (this.f7767s != i8) {
            if ((8388615 & i8) == 0) {
                i8 |= 8388611;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            this.f7767s = i8;
            if (i8 == 119 && this.f7765p != null) {
                this.f7765p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7765p;
    }
}
