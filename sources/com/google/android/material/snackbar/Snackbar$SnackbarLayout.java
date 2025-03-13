package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import z4.c;

public final class Snackbar$SnackbarLayout extends c {
    public Snackbar$SnackbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        int childCount = getChildCount();
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getLayoutParams().width == -1) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
            }
        }
    }

    public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
        super.setBackground(drawable);
    }

    public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
        super.setBackgroundTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
        super.setBackgroundTintMode(mode);
    }

    public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }
}
