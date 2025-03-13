package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.a0;
import androidx.health.services.client.R;
import j0.x;

public class AlertDialogLayout extends a0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int i(View view) {
        int[] iArr = x.f4957a;
        int d9 = x.c.d(view);
        if (d9 > 0) {
            return d9;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return i(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L_0x0039
            r4 = 80
            if (r3 == r4) goto L_0x0030
            int r12 = r9.getPaddingTop()
            goto L_0x0043
        L_0x0030:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L_0x0043
        L_0x0039:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r3 + r14
        L_0x0043:
            android.graphics.drawable.Drawable r14 = r9.getDividerDrawable()
            r0 = 0
            if (r14 != 0) goto L_0x004c
            r14 = r0
            goto L_0x0050
        L_0x004c:
            int r14 = r14.getIntrinsicHeight()
        L_0x0050:
            if (r0 >= r1) goto L_0x00ae
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto L_0x00ab
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto L_0x00ab
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.appcompat.widget.a0$a r6 = (androidx.appcompat.widget.a0.a) r6
            int r7 = r6.gravity
            if (r7 >= 0) goto L_0x0073
            r7 = r2
        L_0x0073:
            int[] r8 = j0.x.f4957a
            int r8 = j0.x.d.d(r9)
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L_0x008c
            r8 = 5
            if (r7 == r8) goto L_0x0089
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L_0x0097
        L_0x0089:
            int r7 = r11 - r4
            goto L_0x0094
        L_0x008c:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
        L_0x0094:
            int r8 = r6.rightMargin
            int r7 = r7 - r8
        L_0x0097:
            boolean r8 = r9.h(r0)
            if (r8 == 0) goto L_0x009e
            int r12 = r12 + r14
        L_0x009e:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r5 + r12
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r12 = r12 + r5
        L_0x00ab:
            int r0 = r0 + 1
            goto L_0x0050
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = i8;
        int childCount = getChildCount();
        View view = null;
        boolean z8 = false;
        View view2 = null;
        View view3 = null;
        int i15 = 0;
        while (true) {
            if (i15 < childCount) {
                View childAt = getChildAt(i15);
                if (childAt.getVisibility() != 8) {
                    int id = childAt.getId();
                    if (id == R.id.topPanel) {
                        view = childAt;
                    } else if (id == R.id.buttonPanel) {
                        view2 = childAt;
                    } else if ((id == R.id.contentPanel || id == R.id.customPanel) && view3 == null) {
                        view3 = childAt;
                    }
                }
                i15++;
            } else {
                int mode = View.MeasureSpec.getMode(i9);
                int size = View.MeasureSpec.getSize(i9);
                int mode2 = View.MeasureSpec.getMode(i8);
                int paddingTop = getPaddingTop() + getPaddingBottom();
                if (view != null) {
                    view.measure(i14, 0);
                    paddingTop += view.getMeasuredHeight();
                    i10 = View.combineMeasuredStates(0, view.getMeasuredState());
                } else {
                    i10 = 0;
                }
                if (view2 != null) {
                    view2.measure(i14, 0);
                    i12 = i(view2);
                    i11 = view2.getMeasuredHeight() - i12;
                    paddingTop += i12;
                    i10 = View.combineMeasuredStates(i10, view2.getMeasuredState());
                } else {
                    i12 = 0;
                    i11 = 0;
                }
                if (view3 != null) {
                    view3.measure(i14, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
                    i13 = view3.getMeasuredHeight();
                    paddingTop += i13;
                    i10 = View.combineMeasuredStates(i10, view3.getMeasuredState());
                } else {
                    i13 = 0;
                }
                int i16 = size - paddingTop;
                if (view2 != null) {
                    int i17 = paddingTop - i12;
                    int min = Math.min(i16, i11);
                    if (min > 0) {
                        i16 -= min;
                        i12 += min;
                    }
                    view2.measure(i14, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                    paddingTop = i17 + view2.getMeasuredHeight();
                    i10 = View.combineMeasuredStates(i10, view2.getMeasuredState());
                }
                if (view3 != null && i16 > 0) {
                    view3.measure(i14, View.MeasureSpec.makeMeasureSpec(i13 + i16, mode));
                    paddingTop = (paddingTop - i13) + view3.getMeasuredHeight();
                    i10 = View.combineMeasuredStates(i10, view3.getMeasuredState());
                }
                int i18 = 0;
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt2 = getChildAt(i19);
                    if (childAt2.getVisibility() != 8) {
                        i18 = Math.max(i18, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(i18 + getPaddingLeft() + getPaddingRight(), i14, i10), View.resolveSizeAndState(paddingTop, i9, 0));
                if (mode2 != 1073741824) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i20 = 0; i20 < childCount; i20++) {
                        View childAt3 = getChildAt(i20);
                        if (childAt3.getVisibility() != 8) {
                            a0.a aVar = (a0.a) childAt3.getLayoutParams();
                            if (aVar.width == -1) {
                                int i21 = aVar.height;
                                aVar.height = childAt3.getMeasuredHeight();
                                measureChildWithMargins(childAt3, makeMeasureSpec, 0, i9, 0);
                                aVar.height = i21;
                            }
                        }
                    }
                }
                z8 = true;
            }
        }
        int i22 = i9;
        if (!z8) {
            super.onMeasure(i8, i9);
        }
    }
}
