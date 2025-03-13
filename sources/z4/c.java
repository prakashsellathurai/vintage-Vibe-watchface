package z4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.health.services.client.R;
import d0.b;
import j0.x;
import k3.j;
import u4.n;

public class c extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public static final View.OnTouchListener f8689f = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f8690a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8691b;

    /* renamed from: c  reason: collision with root package name */
    public final float f8692c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f8693d;
    public PorterDuff.Mode e;

    public static class a implements View.OnTouchListener {
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(d5.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, a1.a.f21f0);
        if (obtainStyledAttributes.hasValue(6)) {
            int[] iArr = x.f4957a;
            x.h.s(this, (float) obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f8690a = obtainStyledAttributes.getInt(2, 0);
        this.f8691b = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(v4.c.a(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(n.b(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f8692c = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f8689f);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(j.L(getBackgroundOverlayColorAlpha(), j.x(this, R.attr.colorSurface), j.x(this, R.attr.colorOnSurface)));
            ColorStateList colorStateList = this.f8693d;
            if (colorStateList != null) {
                b.h(gradientDrawable, colorStateList);
            }
            int[] iArr2 = x.f4957a;
            x.c.q(this, gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f8692c;
    }

    public int getAnimationMode() {
        return this.f8690a;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f8691b;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int[] iArr = x.f4957a;
        x.g.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
    }

    public void setAnimationMode(int i8) {
        this.f8690a = i8;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.f8693d == null)) {
            drawable = drawable.mutate();
            b.h(drawable, this.f8693d);
            b.i(drawable, this.e);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f8693d = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            b.h(mutate, colorStateList);
            b.i(mutate, this.e);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.e = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            b.i(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setOnAttachStateChangeListener(a aVar) {
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f8689f);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(b bVar) {
    }
}
