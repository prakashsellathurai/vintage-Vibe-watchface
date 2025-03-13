package h;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import d0.b;

public class a extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f4714a;

    public a(Drawable drawable) {
        Drawable drawable2 = this.f4714a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f4714a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f4714a.draw(canvas);
    }

    public final int getChangingConfigurations() {
        return this.f4714a.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.f4714a.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.f4714a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f4714a.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.f4714a.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.f4714a.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.f4714a.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.f4714a.getPadding(rect);
    }

    public final int[] getState() {
        return this.f4714a.getState();
    }

    public final Region getTransparentRegion() {
        return this.f4714a.getTransparentRegion();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return d0.a.d(this.f4714a);
    }

    public final boolean isStateful() {
        return this.f4714a.isStateful();
    }

    public final void jumpToCurrentState() {
        this.f4714a.jumpToCurrentState();
    }

    public final void onBoundsChange(Rect rect) {
        this.f4714a.setBounds(rect);
    }

    public final boolean onLevelChange(int i8) {
        return this.f4714a.setLevel(i8);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j8) {
        scheduleSelf(runnable, j8);
    }

    public final void setAlpha(int i8) {
        this.f4714a.setAlpha(i8);
    }

    public final void setAutoMirrored(boolean z8) {
        d0.a.e(this.f4714a, z8);
    }

    public final void setChangingConfigurations(int i8) {
        this.f4714a.setChangingConfigurations(i8);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4714a.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z8) {
        this.f4714a.setDither(z8);
    }

    public final void setFilterBitmap(boolean z8) {
        this.f4714a.setFilterBitmap(z8);
    }

    public void setHotspot(float f9, float f10) {
        b.e(this.f4714a, f9, f10);
    }

    public void setHotspotBounds(int i8, int i9, int i10, int i11) {
        b.f(this.f4714a, i8, i9, i10, i11);
    }

    public boolean setState(int[] iArr) {
        return this.f4714a.setState(iArr);
    }

    public final void setTint(int i8) {
        b.g(this.f4714a, i8);
    }

    public final void setTintList(ColorStateList colorStateList) {
        b.h(this.f4714a, colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        b.i(this.f4714a, mode);
    }

    public boolean setVisible(boolean z8, boolean z9) {
        return super.setVisible(z8, z9) || this.f4714a.setVisible(z8, z9);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
