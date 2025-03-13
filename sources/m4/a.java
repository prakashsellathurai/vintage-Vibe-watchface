package m4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.health.services.client.R;
import y4.i;
import y4.m;

public class a extends o.a implements Checkable, m {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f5445d = {R.attr.state_dragged};

    /* renamed from: c  reason: collision with root package name */
    public boolean f5446c;

    /* renamed from: m4.a$a  reason: collision with other inner class name */
    public interface C0081a {
    }

    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public int getCheckedIconMargin() {
        throw null;
    }

    public int getCheckedIconSize() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    public int getContentPaddingBottom() {
        throw null;
    }

    public int getContentPaddingLeft() {
        throw null;
    }

    public int getContentPaddingRight() {
        throw null;
    }

    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public i getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    public final boolean isChecked() {
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    public final int[] onCreateDrawableState(int i8) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + 3);
        if (this.f5446c) {
            View.mergeDrawableStates(onCreateDrawableState, f5445d);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(false);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(false);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(false);
    }

    public final void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i8) {
        ColorStateList.valueOf(i8);
        throw null;
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCardElevation(float f9) {
        super.setCardElevation(f9);
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z8) {
        throw null;
    }

    public void setChecked(boolean z8) {
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconMargin(int i8) {
        throw null;
    }

    public void setCheckedIconMarginResource(int i8) {
        if (i8 != -1) {
            getResources().getDimensionPixelSize(i8);
            throw null;
        }
    }

    public void setCheckedIconResource(int i8) {
        g.a.a(getContext(), i8);
        throw null;
    }

    public void setCheckedIconSize(int i8) {
        throw null;
    }

    public void setCheckedIconSizeResource(int i8) {
        if (i8 != 0) {
            getResources().getDimensionPixelSize(i8);
            throw null;
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setClickable(boolean z8) {
        super.setClickable(z8);
    }

    public void setDragged(boolean z8) {
        if (this.f5446c != z8) {
            this.f5446c = z8;
            refreshDrawableState();
            throw null;
        }
    }

    public void setMaxCardElevation(float f9) {
        super.setMaxCardElevation(f9);
        throw null;
    }

    public void setOnCheckedChangeListener(C0081a aVar) {
    }

    public void setPreventCornerOverlap(boolean z8) {
        super.setPreventCornerOverlap(z8);
        throw null;
    }

    public void setProgress(float f9) {
        throw null;
    }

    public void setRadius(float f9) {
        super.setRadius(f9);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i8) {
        Context context = getContext();
        Object obj = g.a.f4440a;
        context.getColorStateList(i8);
        throw null;
    }

    public void setShapeAppearanceModel(i iVar) {
        setClipToOutline(iVar.d(getBoundsAsRectF()));
        throw null;
    }

    public void setStrokeColor(int i8) {
        ColorStateList.valueOf(i8);
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeWidth(int i8) {
        throw null;
    }

    public void setUseCompatPadding(boolean z8) {
        super.setUseCompatPadding(z8);
        throw null;
    }

    public final void toggle() {
    }
}
