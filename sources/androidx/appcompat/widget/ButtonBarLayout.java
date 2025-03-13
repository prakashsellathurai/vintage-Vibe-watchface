package androidx.appcompat.widget;

import a1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.health.services.client.R;
import j0.x;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f531a;

    /* renamed from: b  reason: collision with root package name */
    public int f532b = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = a.f47u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        int[] iArr2 = x.f4957a;
        x.m.c(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f531a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z8) {
        setOrientation(z8 ? 1 : 0);
        setGravity(z8 ? 8388613 : 80);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z8 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    public final void onMeasure(int i8, int i9) {
        boolean z8;
        int i10;
        int i11;
        int size = View.MeasureSpec.getSize(i8);
        int i12 = 0;
        if (this.f531a) {
            if (size > this.f532b) {
                if (getOrientation() == 1) {
                    setStacked(false);
                }
            }
            this.f532b = size;
        }
        if ((getOrientation() == 1) || View.MeasureSpec.getMode(i8) != 1073741824) {
            i10 = i8;
            z8 = false;
        } else {
            i10 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z8 = true;
        }
        super.onMeasure(i10, i9);
        if (this.f531a) {
            if (!(getOrientation() == 1)) {
                if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                    setStacked(true);
                    z8 = true;
                }
            }
        }
        if (z8) {
            super.onMeasure(i8, i9);
        }
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            i11 = -1;
            if (i13 >= childCount) {
                i13 = -1;
                break;
            } else if (getChildAt(i13).getVisibility() == 0) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 >= 0) {
            View childAt = getChildAt(i13);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (getOrientation() == 1) {
                i12 = 1;
            }
            if (i12 != 0) {
                int i14 = i13 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i14 >= childCount2) {
                        break;
                    } else if (getChildAt(i14).getVisibility() == 0) {
                        i11 = i14;
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i11 >= 0) {
                    paddingTop += getChildAt(i11).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i12 = paddingTop;
            } else {
                i12 = paddingTop + getPaddingBottom();
            }
        }
        int[] iArr = x.f4957a;
        if (x.c.d(this) != i12) {
            setMinimumHeight(i12);
        }
    }

    public void setAllowStacking(boolean z8) {
        if (this.f531a != z8) {
            this.f531a = z8;
            if (!z8 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
