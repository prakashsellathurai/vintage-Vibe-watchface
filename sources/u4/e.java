package u4;

import a1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.health.services.client.R;
import j0.g;
import j0.x;

public class e extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public int f7761a;

    /* renamed from: b  reason: collision with root package name */
    public int f7762b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7763c;

    /* renamed from: d  reason: collision with root package name */
    public int f7764d;

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public e(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f7763c = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.S, 0, 0);
        this.f7761a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f7762b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public boolean a() {
        return this.f7763c;
    }

    public int getItemSpacing() {
        return this.f7762b;
    }

    public int getLineSpacing() {
        return this.f7761a;
    }

    public int getRowCount() {
        return this.f7764d;
    }

    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        if (getChildCount() == 0) {
            this.f7764d = 0;
            return;
        }
        this.f7764d = 1;
        int[] iArr = x.f4957a;
        boolean z9 = x.d.d(this) == 1;
        int paddingRight = z9 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z9 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i14 = (i10 - i8) - paddingLeft;
        int i15 = paddingRight;
        int i16 = paddingTop;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = g.c(marginLayoutParams);
                    i13 = g.b(marginLayoutParams);
                } else {
                    i13 = 0;
                    i12 = 0;
                }
                int measuredWidth = i15 + i12 + childAt.getMeasuredWidth();
                if (!this.f7763c && measuredWidth > i14) {
                    i16 = this.f7761a + paddingTop;
                    this.f7764d++;
                    i15 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f7764d - 1));
                int i18 = i15 + i12;
                int measuredWidth2 = childAt.getMeasuredWidth() + i18;
                int measuredHeight = childAt.getMeasuredHeight() + i16;
                if (z9) {
                    i18 = i14 - measuredWidth2;
                    measuredWidth2 = (i14 - i15) - i12;
                }
                childAt.layout(i18, i16, measuredWidth2, measuredHeight);
                i15 += i12 + i13 + childAt.getMeasuredWidth() + this.f7762b;
                paddingTop = measuredHeight;
            }
        }
    }

    public final void onMeasure(int i8, int i9) {
        int i10;
        int i11;
        int size = View.MeasureSpec.getSize(i8);
        int mode = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i9);
        int mode2 = View.MeasureSpec.getMode(i9);
        int i12 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i12 - getPaddingRight();
        int i13 = paddingTop;
        int i14 = 0;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() == 8) {
                int i16 = i9;
            } else {
                measureChild(childAt, i8, i9);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i10 = marginLayoutParams.leftMargin + 0;
                    i11 = marginLayoutParams.rightMargin + 0;
                } else {
                    i11 = 0;
                    i10 = 0;
                }
                if (paddingLeft + i10 + childAt.getMeasuredWidth() > paddingRight && !a()) {
                    paddingLeft = getPaddingLeft();
                    i13 = this.f7761a + paddingTop;
                }
                int measuredWidth = paddingLeft + i10 + childAt.getMeasuredWidth();
                paddingTop = childAt.getMeasuredHeight() + i13;
                if (measuredWidth > i14) {
                    i14 = measuredWidth;
                }
                paddingLeft += i10 + i11 + childAt.getMeasuredWidth() + this.f7762b;
                if (i15 == getChildCount() - 1) {
                    i14 += i11;
                }
            }
        }
        int paddingRight2 = i14 + getPaddingRight();
        int paddingBottom = paddingTop + getPaddingBottom();
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(paddingRight2, size);
        } else if (mode != 1073741824) {
            size = paddingRight2;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != 1073741824) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i8) {
        this.f7762b = i8;
    }

    public void setLineSpacing(int i8) {
        this.f7761a = i8;
    }

    public void setSingleLine(boolean z8) {
        this.f7763c = z8;
    }
}
