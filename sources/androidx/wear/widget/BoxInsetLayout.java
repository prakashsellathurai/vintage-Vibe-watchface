package androidx.wear.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;

public class BoxInsetLayout extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public final int f2435a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2436b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2437c;

    /* renamed from: d  reason: collision with root package name */
    public Rect f2438d;
    public final Rect e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f2439f;

    public static class a extends FrameLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public final int f2440a = 0;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.f41p0, 0, 0);
            this.f2440a = obtainStyledAttributes.getInt(obtainStyledAttributes.hasValueOrEmpty(1) ? 1 : 0, 0);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public BoxInsetLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (this.f2438d == null) {
            this.f2438d = new Rect();
        }
        if (this.e == null) {
            this.e = new Rect();
        }
        this.f2435a = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.f2436b = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2437c = getResources().getConfiguration().isScreenRound();
        WindowInsets rootWindowInsets = getRootWindowInsets();
        this.e.set(rootWindowInsets.getSystemWindowInsetLeft(), rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetRight(), rootWindowInsets.getSystemWindowInsetBottom());
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r19.getChildCount()
            int r2 = r19.getPaddingLeft()
            android.graphics.Rect r3 = r0.f2438d
            int r3 = r3.left
            int r2 = r2 + r3
            int r3 = r23 - r21
            int r4 = r19.getPaddingRight()
            int r3 = r3 - r4
            android.graphics.Rect r4 = r0.f2438d
            int r4 = r4.right
            int r3 = r3 - r4
            int r4 = r19.getPaddingTop()
            android.graphics.Rect r5 = r0.f2438d
            int r5 = r5.top
            int r4 = r4 + r5
            int r5 = r24 - r22
            int r6 = r19.getPaddingBottom()
            int r5 = r5 - r6
            android.graphics.Rect r6 = r0.f2438d
            int r6 = r6.bottom
            int r5 = r5 - r6
            r6 = 0
        L_0x0031:
            if (r6 >= r1) goto L_0x0130
            android.view.View r7 = r0.getChildAt(r6)
            int r8 = r7.getVisibility()
            r9 = 8
            if (r8 == r9) goto L_0x0120
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.wear.widget.BoxInsetLayout$a r8 = (androidx.wear.widget.BoxInsetLayout.a) r8
            int r9 = r7.getMeasuredWidth()
            int r10 = r7.getMeasuredHeight()
            int r11 = r8.gravity
            r12 = -1
            if (r11 != r12) goto L_0x0055
            r11 = 8388659(0x800033, float:1.1755015E-38)
        L_0x0055:
            int r13 = r19.getLayoutDirection()
            int r13 = android.view.Gravity.getAbsoluteGravity(r11, r13)
            r14 = r11 & 112(0x70, float:1.57E-43)
            r11 = r11 & 7
            int r15 = r19.getMeasuredWidth()
            int r12 = r19.getMeasuredHeight()
            r16 = r1
            int r1 = r0.f2436b
            int r1 = java.lang.Math.min(r15, r1)
            int r15 = r0.f2435a
            int r12 = java.lang.Math.min(r12, r15)
            int r1 = java.lang.Math.max(r1, r12)
            float r1 = (float) r1
            r12 = 1041626676(0x3e15f634, float:0.146447)
            float r1 = r1 * r12
            int r1 = (int) r1
            boolean r12 = r0.f2437c
            int r15 = r8.f2440a
            if (r12 == 0) goto L_0x0099
            r17 = r15 & 1
            if (r17 == 0) goto L_0x0099
            int r0 = r8.width
            r17 = r6
            r6 = -1
            if (r0 == r6) goto L_0x0095
            r0 = 3
            if (r11 != r0) goto L_0x009b
        L_0x0095:
            int r0 = r8.leftMargin
            int r0 = r0 + r1
            goto L_0x009d
        L_0x0099:
            r17 = r6
        L_0x009b:
            int r0 = r8.leftMargin
        L_0x009d:
            r6 = 5
            if (r12 == 0) goto L_0x00b3
            r18 = r15 & 4
            if (r18 == 0) goto L_0x00b3
            r21 = r7
            int r7 = r8.width
            r22 = r5
            r5 = -1
            if (r7 == r5) goto L_0x00af
            if (r11 != r6) goto L_0x00b7
        L_0x00af:
            int r5 = r8.rightMargin
            int r5 = r5 + r1
            goto L_0x00b9
        L_0x00b3:
            r22 = r5
            r21 = r7
        L_0x00b7:
            int r5 = r8.rightMargin
        L_0x00b9:
            int r7 = r8.width
            r11 = -1
            if (r7 != r11) goto L_0x00bf
            goto L_0x00c6
        L_0x00bf:
            r7 = r13 & 7
            r11 = 1
            if (r7 == r11) goto L_0x00cb
            if (r7 == r6) goto L_0x00c8
        L_0x00c6:
            int r0 = r0 + r2
            goto L_0x00d3
        L_0x00c8:
            int r0 = r3 - r9
            goto L_0x00d2
        L_0x00cb:
            int r6 = r3 - r2
            int r6 = r6 - r9
            int r6 = r6 / 2
            int r6 = r6 + r2
            int r0 = r0 + r6
        L_0x00d2:
            int r0 = r0 - r5
        L_0x00d3:
            if (r12 == 0) goto L_0x00e6
            r5 = r15 & 2
            if (r5 == 0) goto L_0x00e6
            int r5 = r8.height
            r6 = -1
            if (r5 == r6) goto L_0x00e2
            r5 = 48
            if (r14 != r5) goto L_0x00e6
        L_0x00e2:
            int r5 = r8.topMargin
            int r5 = r5 + r1
            goto L_0x00e8
        L_0x00e6:
            int r5 = r8.topMargin
        L_0x00e8:
            r6 = 80
            if (r12 == 0) goto L_0x00fb
            r7 = r15 & 8
            if (r7 == 0) goto L_0x00fb
            int r7 = r8.height
            r11 = -1
            if (r7 == r11) goto L_0x00f7
            if (r14 != r6) goto L_0x00fb
        L_0x00f7:
            int r7 = r8.bottomMargin
            int r7 = r7 + r1
            goto L_0x00fd
        L_0x00fb:
            int r7 = r8.bottomMargin
        L_0x00fd:
            int r1 = r8.height
            r8 = -1
            if (r1 != r8) goto L_0x0103
            goto L_0x0109
        L_0x0103:
            r1 = 16
            if (r14 == r1) goto L_0x010f
            if (r14 == r6) goto L_0x010b
        L_0x0109:
            int r5 = r5 + r4
            goto L_0x0118
        L_0x010b:
            int r5 = r22 - r10
            int r5 = r5 - r7
            goto L_0x0118
        L_0x010f:
            int r1 = r22 - r4
            int r1 = r1 - r10
            int r1 = r1 / 2
            int r1 = r1 + r4
            int r1 = r1 + r5
            int r5 = r1 - r7
        L_0x0118:
            int r9 = r9 + r0
            int r10 = r10 + r5
            r1 = r21
            r1.layout(r0, r5, r9, r10)
            goto L_0x0126
        L_0x0120:
            r16 = r1
            r22 = r5
            r17 = r6
        L_0x0126:
            int r6 = r17 + 1
            r0 = r19
            r5 = r22
            r1 = r16
            goto L_0x0031
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.widget.BoxInsetLayout.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        BoxInsetLayout boxInsetLayout = this;
        int i17 = i8;
        int i18 = i9;
        int childCount = getChildCount();
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt = boxInsetLayout.getChildAt(i23);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                if (boxInsetLayout.f2437c) {
                    int i24 = aVar.f2440a;
                    i16 = (i24 & 1) == 0 ? aVar.leftMargin : 0;
                    i15 = (i24 & 4) == 0 ? aVar.rightMargin : 0;
                    i14 = (i24 & 2) == 0 ? aVar.topMargin : 0;
                    if ((i24 & 8) != 0) {
                        i12 = i16;
                        i11 = i15;
                        i10 = i14;
                        i13 = 0;
                        measureChildWithMargins(childAt, i8, 0, i9, 0);
                        i20 = Math.max(i20, childAt.getMeasuredWidth() + i12 + i11);
                        i21 = Math.max(i21, childAt.getMeasuredHeight() + i10 + i13);
                        i22 = View.combineMeasuredStates(i22, childAt.getMeasuredState());
                    }
                } else {
                    int i25 = aVar.leftMargin;
                    int i26 = aVar.topMargin;
                    i15 = aVar.rightMargin;
                    i14 = i26;
                    i16 = i25;
                }
                i13 = aVar.bottomMargin;
                i12 = i16;
                i11 = i15;
                i10 = i14;
                measureChildWithMargins(childAt, i8, 0, i9, 0);
                i20 = Math.max(i20, childAt.getMeasuredWidth() + i12 + i11);
                i21 = Math.max(i21, childAt.getMeasuredHeight() + i10 + i13);
                i22 = View.combineMeasuredStates(i22, childAt.getMeasuredState());
            }
        }
        int paddingLeft = i20 + getPaddingLeft() + boxInsetLayout.f2438d.left + getPaddingRight() + boxInsetLayout.f2438d.right;
        int max = Math.max(i21 + getPaddingTop() + boxInsetLayout.f2438d.top + getPaddingBottom() + boxInsetLayout.f2438d.bottom, getSuggestedMinimumHeight());
        int max2 = Math.max(paddingLeft, getSuggestedMinimumWidth());
        Drawable drawable = boxInsetLayout.f2439f;
        if (drawable != null) {
            max = Math.max(max, drawable.getMinimumHeight());
            max2 = Math.max(max2, boxInsetLayout.f2439f.getMinimumWidth());
        }
        int resolveSizeAndState = View.resolveSizeAndState(max2, i17, i22);
        int resolveSizeAndState2 = View.resolveSizeAndState(max, i18, i22 << 16);
        boxInsetLayout.setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
        int max3 = (int) (((float) Math.max(Math.min(resolveSizeAndState, boxInsetLayout.f2436b), Math.min(resolveSizeAndState2, boxInsetLayout.f2435a))) * 0.146447f);
        while (i19 < childCount) {
            View childAt2 = boxInsetLayout.getChildAt(i19);
            a aVar2 = (a) childAt2.getLayoutParams();
            int i27 = aVar2.gravity;
            if (i27 == -1) {
                i27 = 8388659;
            }
            int i28 = i27 & 112;
            int i29 = i27 & 7;
            int paddingLeft2 = getPaddingLeft() + boxInsetLayout.f2438d.left;
            int paddingRight = getPaddingRight() + boxInsetLayout.f2438d.right;
            int paddingTop = getPaddingTop() + boxInsetLayout.f2438d.top;
            int paddingBottom = getPaddingBottom() + boxInsetLayout.f2438d.bottom;
            int i30 = paddingLeft2 + paddingRight;
            boolean z8 = boxInsetLayout.f2437c;
            int i31 = aVar2.f2440a;
            int i32 = i30 + ((!z8 || (i31 & 1) == 0 || !(aVar2.width == -1 || i29 == 3)) ? aVar2.leftMargin : aVar2.leftMargin + max3) + ((!z8 || (i31 & 4) == 0 || !(aVar2.width == -1 || i29 == 5)) ? aVar2.rightMargin : aVar2.rightMargin + max3);
            int i33 = paddingTop + paddingBottom + ((!z8 || (i31 & 2) == 0 || !(aVar2.height == -1 || i28 == 48)) ? aVar2.topMargin : aVar2.topMargin + max3) + ((!z8 || (i31 & 8) == 0 || !(aVar2.height == -1 || i28 == 80)) ? aVar2.bottomMargin : aVar2.bottomMargin + max3);
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i17, i32, aVar2.width);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i18, i33, aVar2.height);
            int measuredWidth = getMeasuredWidth() - i32;
            int measuredHeight = getMeasuredHeight() - i33;
            if (childAt2.getMeasuredWidth() > measuredWidth || childAt2.getMeasuredHeight() > measuredHeight) {
                childAt2.measure(childMeasureSpec, childMeasureSpec2);
            }
            i19++;
            boxInsetLayout = this;
        }
    }

    public void setForeground(Drawable drawable) {
        super.setForeground(drawable);
        this.f2439f = drawable;
        if (this.f2438d == null) {
            this.f2438d = new Rect();
        }
        if (this.f2439f != null) {
            drawable.getPadding(this.f2438d);
        }
    }
}
