package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class BaselineLayout extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public int f3357a = -1;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public int getBaseline() {
        return this.f3357a;
    }

    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i10 - i8) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int baseline = (this.f3357a == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f3357a + paddingTop) - childAt.getBaseline();
                childAt.layout(i13, baseline, measuredWidth + i13, measuredHeight + baseline);
            }
        }
    }

    public final void onMeasure(int i8, int i9) {
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i8, i9);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i13 = Math.max(i13, baseline);
                    i14 = Math.max(i14, childAt.getMeasuredHeight() - baseline);
                }
                i11 = Math.max(i11, childAt.getMeasuredWidth());
                i10 = Math.max(i10, childAt.getMeasuredHeight());
                i12 = View.combineMeasuredStates(i12, childAt.getMeasuredState());
            }
        }
        if (i13 != -1) {
            i10 = Math.max(i10, Math.max(i14, getPaddingBottom()) + i13);
            this.f3357a = i13;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i11, getSuggestedMinimumWidth()), i8, i12), View.resolveSizeAndState(Math.max(i10, getSuggestedMinimumHeight()), i9, i12 << 16));
    }
}
