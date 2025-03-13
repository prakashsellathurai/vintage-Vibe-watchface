package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

public class a0 extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public boolean f635a;

    /* renamed from: b  reason: collision with root package name */
    public int f636b;

    /* renamed from: c  reason: collision with root package name */
    public int f637c;

    /* renamed from: d  reason: collision with root package name */
    public int f638d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f639f;

    /* renamed from: g  reason: collision with root package name */
    public float f640g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f641h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f642i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f643j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f644k;

    /* renamed from: l  reason: collision with root package name */
    public int f645l;

    /* renamed from: m  reason: collision with root package name */
    public int f646m;

    /* renamed from: n  reason: collision with root package name */
    public int f647n;

    /* renamed from: o  reason: collision with root package name */
    public int f648o;

    public static class a extends LinearLayout.LayoutParams {
        public a(int i8, int i9) {
            super(i8, i9);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public a0(Context context) {
        this(context, (AttributeSet) null);
    }

    public a0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
        r14 = r3.getResourceId(5, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a0(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            r11.<init>(r12, r13, r14)
            r0 = 1
            r11.f635a = r0
            r1 = -1
            r11.f636b = r1
            r2 = 0
            r11.f637c = r2
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r11.e = r3
            int[] r6 = a1.a.w
            android.content.res.TypedArray r3 = r12.obtainStyledAttributes(r13, r6, r14, r2)
            r10 = 0
            int[] r4 = j0.x.f4957a
            r4 = r11
            r5 = r12
            r7 = r13
            r8 = r3
            r9 = r14
            j0.x.m.c(r4, r5, r6, r7, r8, r9, r10)
            int r13 = r3.getInt(r0, r1)
            if (r13 < 0) goto L_0x002b
            r11.setOrientation(r13)
        L_0x002b:
            int r13 = r3.getInt(r2, r1)
            if (r13 < 0) goto L_0x0034
            r11.setGravity(r13)
        L_0x0034:
            r13 = 2
            boolean r13 = r3.getBoolean(r13, r0)
            if (r13 != 0) goto L_0x003e
            r11.setBaselineAligned(r13)
        L_0x003e:
            r13 = 4
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r13 = r3.getFloat(r13, r14)
            r11.f640g = r13
            r13 = 3
            int r13 = r3.getInt(r13, r1)
            r11.f636b = r13
            r13 = 7
            boolean r13 = r3.getBoolean(r13, r2)
            r11.f641h = r13
            r13 = 5
            boolean r14 = r3.hasValue(r13)
            if (r14 == 0) goto L_0x0067
            int r14 = r3.getResourceId(r13, r2)
            if (r14 == 0) goto L_0x0067
            android.graphics.drawable.Drawable r12 = g.a.a(r12, r14)
            goto L_0x006b
        L_0x0067:
            android.graphics.drawable.Drawable r12 = r3.getDrawable(r13)
        L_0x006b:
            r11.setDividerDrawable(r12)
            r12 = 8
            int r12 = r3.getInt(r12, r2)
            r11.f647n = r12
            r12 = 6
            int r12 = r3.getDimensionPixelSize(r12, r2)
            r11.f648o = r12
            r3.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a0.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void c(int i8, Canvas canvas) {
        this.f644k.setBounds(getPaddingLeft() + this.f648o, i8, (getWidth() - getPaddingRight()) - this.f648o, this.f646m + i8);
        this.f644k.draw(canvas);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d(int i8, Canvas canvas) {
        this.f644k.setBounds(i8, getPaddingTop() + this.f648o, this.f645l + i8, (getHeight() - getPaddingBottom()) - this.f648o);
        this.f644k.draw(canvas);
    }

    /* renamed from: e */
    public a generateDefaultLayoutParams() {
        int i8 = this.f638d;
        if (i8 == 0) {
            return new a(-2, -2);
        }
        if (i8 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    /* renamed from: f */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* renamed from: g */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getBaseline() {
        int i8;
        if (this.f636b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i9 = this.f636b;
        if (childCount > i9) {
            View childAt = getChildAt(i9);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i10 = this.f637c;
                if (this.f638d == 1 && (i8 = this.e & 112) != 48) {
                    if (i8 == 16) {
                        i10 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f639f) / 2;
                    } else if (i8 == 80) {
                        i10 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f639f;
                    }
                }
                return i10 + ((a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f636b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f636b;
    }

    public Drawable getDividerDrawable() {
        return this.f644k;
    }

    public int getDividerPadding() {
        return this.f648o;
    }

    public int getDividerWidth() {
        return this.f645l;
    }

    public int getGravity() {
        return this.e;
    }

    public int getOrientation() {
        return this.f638d;
    }

    public int getShowDividers() {
        return this.f647n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f640g;
    }

    public final boolean h(int i8) {
        if (i8 == 0) {
            return (this.f647n & 1) != 0;
        }
        if (i8 == getChildCount()) {
            return (this.f647n & 4) != 0;
        }
        if ((this.f647n & 2) == 0) {
            return false;
        }
        for (int i9 = i8 - 1; i9 >= 0; i9--) {
            if (getChildAt(i9).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public final void onDraw(Canvas canvas) {
        int i8;
        int i9;
        int i10;
        if (this.f644k != null) {
            int i11 = 0;
            if (this.f638d == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i11 < virtualChildCount) {
                    View childAt = getChildAt(i11);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !h(i11))) {
                        c((childAt.getTop() - ((a) childAt.getLayoutParams()).topMargin) - this.f646m, canvas);
                    }
                    i11++;
                }
                if (h(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    c(childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f646m : childAt2.getBottom() + ((a) childAt2.getLayoutParams()).bottomMargin, canvas);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a9 = s0.a(this);
            while (i11 < virtualChildCount2) {
                View childAt3 = getChildAt(i11);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !h(i11))) {
                    a aVar = (a) childAt3.getLayoutParams();
                    d(a9 ? childAt3.getRight() + aVar.rightMargin : (childAt3.getLeft() - aVar.leftMargin) - this.f645l, canvas);
                }
                i11++;
            }
            if (h(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    a aVar2 = (a) childAt4.getLayoutParams();
                    if (a9) {
                        i10 = childAt4.getLeft();
                        i9 = aVar2.leftMargin;
                    } else {
                        i8 = childAt4.getRight() + aVar2.rightMargin;
                        d(i8, canvas);
                    }
                } else if (a9) {
                    i8 = getPaddingLeft();
                    d(i8, canvas);
                } else {
                    i10 = getWidth();
                    i9 = getPaddingRight();
                }
                i8 = (i10 - i9) - this.f645l;
                d(i8, canvas);
            }
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.f638d
            r2 = 80
            r3 = 16
            r4 = 8
            r5 = 5
            r6 = 8388615(0x800007, float:1.1754953E-38)
            r7 = 2
            r9 = 1
            if (r1 != r9) goto L_0x00b8
            int r1 = r25.getPaddingLeft()
            int r10 = r29 - r27
            int r11 = r25.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r25.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r25.getVirtualChildCount()
            int r13 = r0.e
            r14 = r13 & 112(0x70, float:1.57E-43)
            r6 = r6 & r13
            if (r14 == r3) goto L_0x0042
            if (r14 == r2) goto L_0x0036
            int r2 = r25.getPaddingTop()
            goto L_0x004d
        L_0x0036:
            int r2 = r25.getPaddingTop()
            int r2 = r2 + r30
            int r2 = r2 - r28
            int r3 = r0.f639f
            int r2 = r2 - r3
            goto L_0x004d
        L_0x0042:
            int r2 = r25.getPaddingTop()
            int r3 = r30 - r28
            int r13 = r0.f639f
            int r3 = r3 - r13
            int r3 = r3 / r7
            int r2 = r2 + r3
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 >= r12) goto L_0x01d0
            android.view.View r13 = r0.getChildAt(r3)
            if (r13 != 0) goto L_0x0059
            int r2 = r2 + 0
            goto L_0x00b2
        L_0x0059:
            int r14 = r13.getVisibility()
            if (r14 == r4) goto L_0x00b2
            int r14 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r16 = r13.getLayoutParams()
            r4 = r16
            androidx.appcompat.widget.a0$a r4 = (androidx.appcompat.widget.a0.a) r4
            int r8 = r4.gravity
            if (r8 >= 0) goto L_0x0074
            r8 = r6
        L_0x0074:
            int[] r17 = j0.x.f4957a
            int r7 = j0.x.d.d(r25)
            int r7 = android.view.Gravity.getAbsoluteGravity(r8, r7)
            r7 = r7 & 7
            if (r7 == r9) goto L_0x008b
            if (r7 == r5) goto L_0x0088
            int r7 = r4.leftMargin
            int r7 = r7 + r1
            goto L_0x0096
        L_0x0088:
            int r7 = r11 - r14
            goto L_0x0093
        L_0x008b:
            int r7 = r10 - r14
            r8 = 2
            int r7 = r7 / r8
            int r7 = r7 + r1
            int r8 = r4.leftMargin
            int r7 = r7 + r8
        L_0x0093:
            int r8 = r4.rightMargin
            int r7 = r7 - r8
        L_0x0096:
            boolean r8 = r0.h(r3)
            if (r8 == 0) goto L_0x009f
            int r8 = r0.f646m
            int r2 = r2 + r8
        L_0x009f:
            int r8 = r4.topMargin
            int r2 = r2 + r8
            int r8 = r2 + 0
            int r14 = r14 + r7
            int r5 = r15 + r8
            r13.layout(r7, r8, r14, r5)
            int r4 = r4.bottomMargin
            int r15 = r15 + r4
            r4 = 0
            int r15 = r15 + r4
            int r2 = r2 + r15
            int r3 = r3 + 0
        L_0x00b2:
            int r3 = r3 + r9
            r4 = 8
            r5 = 5
            r7 = 2
            goto L_0x004e
        L_0x00b8:
            boolean r1 = androidx.appcompat.widget.s0.a(r25)
            int r4 = r25.getPaddingTop()
            int r5 = r30 - r28
            int r7 = r25.getPaddingBottom()
            int r7 = r5 - r7
            int r5 = r5 - r4
            int r8 = r25.getPaddingBottom()
            int r5 = r5 - r8
            int r8 = r25.getVirtualChildCount()
            int r10 = r0.e
            r6 = r6 & r10
            r10 = r10 & 112(0x70, float:1.57E-43)
            boolean r11 = r0.f635a
            int[] r12 = r0.f642i
            int[] r13 = r0.f643j
            int[] r14 = j0.x.f4957a
            int r14 = j0.x.d.d(r25)
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r14)
            if (r6 == r9) goto L_0x00fd
            r14 = 5
            if (r6 == r14) goto L_0x00f1
            int r6 = r25.getPaddingLeft()
            goto L_0x0109
        L_0x00f1:
            int r6 = r25.getPaddingLeft()
            int r6 = r6 + r29
            int r6 = r6 - r27
            int r14 = r0.f639f
            int r6 = r6 - r14
            goto L_0x0109
        L_0x00fd:
            int r6 = r25.getPaddingLeft()
            int r14 = r29 - r27
            int r15 = r0.f639f
            int r14 = r14 - r15
            r15 = 2
            int r14 = r14 / r15
            int r6 = r6 + r14
        L_0x0109:
            if (r1 == 0) goto L_0x010f
            int r1 = r8 + -1
            r15 = -1
            goto L_0x0111
        L_0x010f:
            r15 = r9
            r1 = 0
        L_0x0111:
            r18 = r6
            r6 = 0
        L_0x0114:
            if (r6 >= r8) goto L_0x01d0
            int r19 = r15 * r6
            int r9 = r1 + r19
            android.view.View r2 = r0.getChildAt(r9)
            if (r2 != 0) goto L_0x012c
            int r18 = r18 + 0
        L_0x0122:
            r28 = r1
            r30 = r8
            r22 = r10
            r1 = 0
        L_0x0129:
            r2 = 1
            goto L_0x01c2
        L_0x012c:
            int r3 = r2.getVisibility()
            r14 = 8
            if (r3 == r14) goto L_0x0122
            int r3 = r2.getMeasuredWidth()
            int r21 = r2.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r22 = r2.getLayoutParams()
            r14 = r22
            androidx.appcompat.widget.a0$a r14 = (androidx.appcompat.widget.a0.a) r14
            r28 = r1
            if (r11 == 0) goto L_0x0154
            int r1 = r14.height
            r30 = r8
            r8 = -1
            if (r1 == r8) goto L_0x0156
            int r8 = r2.getBaseline()
            goto L_0x0157
        L_0x0154:
            r30 = r8
        L_0x0156:
            r8 = -1
        L_0x0157:
            int r1 = r14.gravity
            if (r1 >= 0) goto L_0x015c
            r1 = r10
        L_0x015c:
            r1 = r1 & 112(0x70, float:1.57E-43)
            r22 = r10
            r10 = 16
            if (r1 == r10) goto L_0x0194
            r10 = 48
            if (r1 == r10) goto L_0x0185
            r10 = 80
            if (r1 == r10) goto L_0x016f
            r1 = r4
            r10 = -1
            goto L_0x01a0
        L_0x016f:
            int r1 = r7 - r21
            int r10 = r14.bottomMargin
            int r1 = r1 - r10
            r10 = -1
            if (r8 == r10) goto L_0x01a0
            int r23 = r2.getMeasuredHeight()
            int r23 = r23 - r8
            r8 = 2
            r24 = r13[r8]
            int r24 = r24 - r23
            int r1 = r1 - r24
            goto L_0x01a0
        L_0x0185:
            r10 = -1
            int r1 = r14.topMargin
            int r1 = r1 + r4
            if (r8 == r10) goto L_0x01a0
            r20 = 1
            r23 = r12[r20]
            int r23 = r23 - r8
            int r1 = r1 + r23
            goto L_0x01a0
        L_0x0194:
            r10 = -1
            int r1 = r5 - r21
            r8 = 2
            int r1 = r1 / r8
            int r1 = r1 + r4
            int r8 = r14.topMargin
            int r1 = r1 + r8
            int r8 = r14.bottomMargin
            int r1 = r1 - r8
        L_0x01a0:
            boolean r8 = r0.h(r9)
            if (r8 == 0) goto L_0x01aa
            int r8 = r0.f645l
            int r18 = r18 + r8
        L_0x01aa:
            int r8 = r14.leftMargin
            int r18 = r18 + r8
            int r8 = r18 + 0
            int r9 = r3 + r8
            int r10 = r21 + r1
            r2.layout(r8, r1, r9, r10)
            int r1 = r14.rightMargin
            int r3 = r3 + r1
            r1 = 0
            int r3 = r3 + r1
            int r18 = r18 + r3
            int r6 = r6 + 0
            goto L_0x0129
        L_0x01c2:
            int r6 = r6 + r2
            r1 = r28
            r8 = r30
            r9 = r2
            r10 = r22
            r2 = 80
            r3 = 16
            goto L_0x0114
        L_0x01d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ae, code lost:
        if (r13 < 0) goto L_0x02b0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x048e  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04c0  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x04fc  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x054e  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0551  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x05fd  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x06b8  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x06d4  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x07b9  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x07dd  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0821  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x082b  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0885  */
    /* JADX WARNING: Removed duplicated region for block: B:422:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r39, int r40) {
        /*
            r38 = this;
            r6 = r38
            r7 = r39
            r8 = r40
            int r0 = r6.f638d
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r14 = 1073741824(0x40000000, float:2.0)
            r15 = 0
            r5 = 0
            r4 = 1
            if (r0 != r4) goto L_0x038a
            r6.f639f = r5
            int r3 = r38.getVirtualChildCount()
            int r2 = android.view.View.MeasureSpec.getMode(r39)
            int r1 = android.view.View.MeasureSpec.getMode(r40)
            int r0 = r6.f636b
            boolean r9 = r6.f641h
            r24 = r4
            r13 = r5
            r17 = r13
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r23 = r21
            r25 = r23
            r22 = r15
        L_0x0039:
            if (r13 >= r3) goto L_0x0179
            android.view.View r26 = r6.getChildAt(r13)
            if (r26 != 0) goto L_0x0047
            int r4 = r6.f639f
            int r4 = r4 + r5
            r6.f639f = r4
            goto L_0x004f
        L_0x0047:
            int r4 = r26.getVisibility()
            if (r4 != r12) goto L_0x005b
            int r13 = r13 + 0
        L_0x004f:
            r10 = r0
            r29 = r1
            r0 = r2
            r31 = r3
            r12 = r18
            r27 = 1
            goto L_0x0162
        L_0x005b:
            boolean r4 = r6.h(r13)
            if (r4 == 0) goto L_0x0068
            int r4 = r6.f639f
            int r5 = r6.f646m
            int r4 = r4 + r5
            r6.f639f = r4
        L_0x0068:
            android.view.ViewGroup$LayoutParams r4 = r26.getLayoutParams()
            r5 = r4
            androidx.appcompat.widget.a0$a r5 = (androidx.appcompat.widget.a0.a) r5
            float r4 = r5.weight
            float r22 = r22 + r4
            if (r1 != r14) goto L_0x0097
            int r12 = r5.height
            if (r12 != 0) goto L_0x0097
            int r12 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r12 <= 0) goto L_0x0097
            int r4 = r6.f639f
            int r12 = r5.topMargin
            int r12 = r12 + r4
            int r14 = r5.bottomMargin
            int r12 = r12 + r14
            int r4 = java.lang.Math.max(r4, r12)
            r6.f639f = r4
            r10 = r0
            r29 = r1
            r30 = r2
            r31 = r3
            r15 = r5
            r4 = 1
            r27 = 1
            goto L_0x00e8
        L_0x0097:
            int r12 = r5.height
            if (r12 != 0) goto L_0x00a3
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a3
            r5.height = r10
            r12 = 0
            goto L_0x00a4
        L_0x00a3:
            r12 = r11
        L_0x00a4:
            r4 = 0
            int r14 = (r22 > r15 ? 1 : (r22 == r15 ? 0 : -1))
            if (r14 != 0) goto L_0x00ac
            int r14 = r6.f639f
            goto L_0x00ad
        L_0x00ac:
            r14 = 0
        L_0x00ad:
            r10 = r0
            r0 = r38
            r29 = r1
            r1 = r26
            r30 = r2
            r2 = r39
            r31 = r3
            r3 = r4
            r27 = 1
            r4 = r40
            r15 = r5
            r5 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            if (r12 == r11) goto L_0x00c8
            r15.height = r12
        L_0x00c8:
            int r0 = r26.getMeasuredHeight()
            int r1 = r6.f639f
            int r2 = r1 + r0
            int r3 = r15.topMargin
            int r2 = r2 + r3
            int r3 = r15.bottomMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r6.f639f = r1
            r5 = r19
            if (r9 == 0) goto L_0x00e6
            int r19 = java.lang.Math.max(r0, r5)
        L_0x00e6:
            r4 = r23
        L_0x00e8:
            if (r10 < 0) goto L_0x00f2
            int r0 = r13 + 1
            if (r10 != r0) goto L_0x00f2
            int r0 = r6.f639f
            r6.f637c = r0
        L_0x00f2:
            if (r13 >= r10) goto L_0x0104
            float r0 = r15.weight
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00fc
            goto L_0x0104
        L_0x00fc:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0104:
            r0 = r30
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x0114
            int r1 = r15.width
            r2 = -1
            if (r1 != r2) goto L_0x0114
            r5 = r27
            r25 = r5
            goto L_0x0115
        L_0x0114:
            r5 = 0
        L_0x0115:
            int r1 = r15.leftMargin
            int r2 = r15.rightMargin
            int r1 = r1 + r2
            int r2 = r26.getMeasuredWidth()
            int r2 = r2 + r1
            r3 = r21
            int r3 = java.lang.Math.max(r3, r2)
            int r12 = r26.getMeasuredState()
            r14 = r18
            int r12 = android.view.View.combineMeasuredStates(r14, r12)
            if (r24 == 0) goto L_0x0139
            int r14 = r15.width
            r11 = -1
            if (r14 != r11) goto L_0x0139
            r11 = r27
            goto L_0x013a
        L_0x0139:
            r11 = 0
        L_0x013a:
            float r14 = r15.weight
            r15 = 0
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 <= 0) goto L_0x014c
            if (r5 == 0) goto L_0x0144
            goto L_0x0145
        L_0x0144:
            r1 = r2
        L_0x0145:
            r15 = r20
            int r20 = java.lang.Math.max(r15, r1)
            goto L_0x015a
        L_0x014c:
            r15 = r20
            if (r5 == 0) goto L_0x0151
            goto L_0x0152
        L_0x0151:
            r1 = r2
        L_0x0152:
            r2 = r17
            int r17 = java.lang.Math.max(r2, r1)
            r20 = r15
        L_0x015a:
            int r13 = r13 + 0
            r21 = r3
            r23 = r4
            r24 = r11
        L_0x0162:
            int r13 = r13 + 1
            r2 = r0
            r0 = r10
            r18 = r12
            r4 = r27
            r1 = r29
            r3 = r31
            r5 = 0
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r14 = 1073741824(0x40000000, float:2.0)
            r15 = 0
            goto L_0x0039
        L_0x0179:
            r29 = r1
            r0 = r2
            r31 = r3
            r27 = r4
            r2 = r17
            r14 = r18
            r5 = r19
            r15 = r20
            r3 = r21
            int r1 = r6.f639f
            r10 = r31
            if (r1 <= 0) goto L_0x019d
            boolean r1 = r6.h(r10)
            if (r1 == 0) goto L_0x019d
            int r1 = r6.f639f
            int r4 = r6.f646m
            int r1 = r1 + r4
            r6.f639f = r1
        L_0x019d:
            r1 = r29
            if (r9 == 0) goto L_0x01e3
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r4) goto L_0x01a7
            if (r1 != 0) goto L_0x01e3
        L_0x01a7:
            r4 = 0
            r6.f639f = r4
            r11 = r4
        L_0x01ab:
            if (r11 >= r10) goto L_0x01e3
            android.view.View r12 = r6.getChildAt(r11)
            if (r12 != 0) goto L_0x01b9
            int r12 = r6.f639f
            int r12 = r12 + r4
            r6.f639f = r12
            goto L_0x01df
        L_0x01b9:
            int r4 = r12.getVisibility()
            r13 = 8
            if (r4 != r13) goto L_0x01c4
            int r11 = r11 + 0
            goto L_0x01df
        L_0x01c4:
            android.view.ViewGroup$LayoutParams r4 = r12.getLayoutParams()
            androidx.appcompat.widget.a0$a r4 = (androidx.appcompat.widget.a0.a) r4
            int r12 = r6.f639f
            int r19 = r12 + r5
            int r13 = r4.topMargin
            int r19 = r19 + r13
            int r4 = r4.bottomMargin
            int r19 = r19 + r4
            r4 = 0
            int r13 = r19 + 0
            int r4 = java.lang.Math.max(r12, r13)
            r6.f639f = r4
        L_0x01df:
            int r11 = r11 + 1
            r4 = 0
            goto L_0x01ab
        L_0x01e3:
            int r4 = r6.f639f
            int r11 = r38.getPaddingTop()
            int r12 = r38.getPaddingBottom()
            int r11 = r11 + r12
            int r4 = r4 + r11
            r6.f639f = r4
            int r11 = r38.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r11)
            r11 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r8, r11)
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            r11 = r11 & r4
            int r12 = r6.f639f
            int r11 = r11 - r12
            if (r23 != 0) goto L_0x0250
            if (r11 == 0) goto L_0x020f
            r12 = 0
            int r13 = (r22 > r12 ? 1 : (r22 == r12 ? 0 : -1))
            if (r13 <= 0) goto L_0x020f
            goto L_0x0250
        L_0x020f:
            int r2 = java.lang.Math.max(r2, r15)
            if (r9 == 0) goto L_0x024c
            r9 = 1073741824(0x40000000, float:2.0)
            if (r1 == r9) goto L_0x024c
            r1 = 0
        L_0x021a:
            if (r1 >= r10) goto L_0x024c
            android.view.View r9 = r6.getChildAt(r1)
            if (r9 == 0) goto L_0x0249
            int r11 = r9.getVisibility()
            r12 = 8
            if (r11 != r12) goto L_0x022b
            goto L_0x0249
        L_0x022b:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            androidx.appcompat.widget.a0$a r11 = (androidx.appcompat.widget.a0.a) r11
            float r11 = r11.weight
            r12 = 0
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x0249
            int r11 = r9.getMeasuredWidth()
            r12 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r12)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r12)
            r9.measure(r11, r13)
        L_0x0249:
            int r1 = r1 + 1
            goto L_0x021a
        L_0x024c:
            r21 = r3
            goto L_0x032a
        L_0x0250:
            float r5 = r6.f640g
            r9 = 0
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 <= 0) goto L_0x0259
            r22 = r5
        L_0x0259:
            r5 = 0
            r6.f639f = r5
            r5 = 0
        L_0x025d:
            if (r5 >= r10) goto L_0x031a
            android.view.View r9 = r6.getChildAt(r5)
            int r12 = r9.getVisibility()
            r13 = 8
            if (r12 != r13) goto L_0x026f
            r29 = r1
            goto L_0x0314
        L_0x026f:
            android.view.ViewGroup$LayoutParams r12 = r9.getLayoutParams()
            androidx.appcompat.widget.a0$a r12 = (androidx.appcompat.widget.a0.a) r12
            float r13 = r12.weight
            r15 = 0
            int r16 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r16 <= 0) goto L_0x02c6
            float r15 = (float) r11
            float r15 = r15 * r13
            float r15 = r15 / r22
            int r15 = (int) r15
            float r22 = r22 - r13
            int r11 = r11 - r15
            int r13 = r38.getPaddingLeft()
            int r16 = r38.getPaddingRight()
            int r13 = r13 + r16
            r16 = r11
            int r11 = r12.leftMargin
            int r13 = r13 + r11
            int r11 = r12.rightMargin
            int r13 = r13 + r11
            int r11 = r12.width
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r7, r13, r11)
            int r13 = r12.height
            if (r13 != 0) goto L_0x02a9
            r13 = 1073741824(0x40000000, float:2.0)
            if (r1 == r13) goto L_0x02a5
            goto L_0x02a9
        L_0x02a5:
            if (r15 <= 0) goto L_0x02b0
            r13 = r15
            goto L_0x02b1
        L_0x02a9:
            int r13 = r9.getMeasuredHeight()
            int r13 = r13 + r15
            if (r13 >= 0) goto L_0x02b1
        L_0x02b0:
            r13 = 0
        L_0x02b1:
            r15 = 1073741824(0x40000000, float:2.0)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r15)
            r9.measure(r11, r13)
            int r11 = r9.getMeasuredState()
            r11 = r11 & -256(0xffffffffffffff00, float:NaN)
            int r14 = android.view.View.combineMeasuredStates(r14, r11)
            r11 = r16
        L_0x02c6:
            int r13 = r12.leftMargin
            int r15 = r12.rightMargin
            int r13 = r13 + r15
            int r15 = r9.getMeasuredWidth()
            int r15 = r15 + r13
            int r3 = java.lang.Math.max(r3, r15)
            r29 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x02e4
            int r1 = r12.width
            r16 = r3
            r3 = -1
            if (r1 != r3) goto L_0x02e7
            r1 = r27
            goto L_0x02e8
        L_0x02e4:
            r16 = r3
            r3 = -1
        L_0x02e7:
            r1 = 0
        L_0x02e8:
            if (r1 == 0) goto L_0x02eb
            goto L_0x02ec
        L_0x02eb:
            r13 = r15
        L_0x02ec:
            int r1 = java.lang.Math.max(r2, r13)
            if (r24 == 0) goto L_0x02f9
            int r2 = r12.width
            if (r2 != r3) goto L_0x02f9
            r2 = r27
            goto L_0x02fa
        L_0x02f9:
            r2 = 0
        L_0x02fa:
            int r3 = r6.f639f
            int r9 = r9.getMeasuredHeight()
            int r9 = r9 + r3
            int r13 = r12.topMargin
            int r9 = r9 + r13
            int r12 = r12.bottomMargin
            int r9 = r9 + r12
            r12 = 0
            int r9 = r9 + r12
            int r3 = java.lang.Math.max(r3, r9)
            r6.f639f = r3
            r24 = r2
            r3 = r16
            r2 = r1
        L_0x0314:
            int r5 = r5 + 1
            r1 = r29
            goto L_0x025d
        L_0x031a:
            int r1 = r6.f639f
            int r5 = r38.getPaddingTop()
            int r9 = r38.getPaddingBottom()
            int r5 = r5 + r9
            int r1 = r1 + r5
            r6.f639f = r1
            goto L_0x024c
        L_0x032a:
            if (r24 != 0) goto L_0x0331
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x0331
            goto L_0x0333
        L_0x0331:
            r2 = r21
        L_0x0333:
            int r0 = r38.getPaddingLeft()
            int r1 = r38.getPaddingRight()
            int r0 = r0 + r1
            int r2 = r2 + r0
            int r0 = r38.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r2, r0)
            int r0 = android.view.View.resolveSizeAndState(r0, r7, r14)
            r6.setMeasuredDimension(r0, r4)
            if (r25 == 0) goto L_0x08c2
            int r0 = r38.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = 0
        L_0x0359:
            if (r9 >= r10) goto L_0x08c2
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x0387
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            androidx.appcompat.widget.a0$a r11 = (androidx.appcompat.widget.a0.a) r11
            int r0 = r11.width
            r2 = -1
            if (r0 != r2) goto L_0x0387
            int r12 = r11.height
            int r0 = r1.getMeasuredHeight()
            r11.height = r0
            r3 = 0
            r5 = 0
            r0 = r38
            r2 = r7
            r4 = r40
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.height = r12
        L_0x0387:
            int r9 = r9 + 1
            goto L_0x0359
        L_0x038a:
            r27 = r4
            r0 = r5
            r6.f639f = r0
            int r9 = r38.getVirtualChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r39)
            int r11 = android.view.View.MeasureSpec.getMode(r40)
            int[] r0 = r6.f642i
            r12 = 4
            if (r0 == 0) goto L_0x03a4
            int[] r0 = r6.f643j
            if (r0 != 0) goto L_0x03ac
        L_0x03a4:
            int[] r0 = new int[r12]
            r6.f642i = r0
            int[] r0 = new int[r12]
            r6.f643j = r0
        L_0x03ac:
            int[] r13 = r6.f642i
            int[] r14 = r6.f643j
            r15 = 3
            r0 = -1
            r13[r15] = r0
            r17 = 2
            r13[r17] = r0
            r13[r27] = r0
            r1 = 0
            r13[r1] = r0
            r14[r15] = r0
            r14[r17] = r0
            r14[r27] = r0
            r14[r1] = r0
            boolean r5 = r6.f635a
            boolean r4 = r6.f641h
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x03d0
            r19 = r27
            goto L_0x03d2
        L_0x03d0:
            r19 = 0
        L_0x03d2:
            r20 = r27
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r12 = 0
            r15 = 0
            r22 = 0
            r23 = 0
            r32 = 0
        L_0x03e0:
            if (r3 >= r9) goto L_0x058b
            android.view.View r8 = r6.getChildAt(r3)
            if (r8 != 0) goto L_0x03f5
            int r8 = r6.f639f
            r25 = 0
            int r8 = r8 + 0
            r6.f639f = r8
            r25 = r0
            r26 = r2
            goto L_0x0403
        L_0x03f5:
            r25 = r0
            int r0 = r8.getVisibility()
            r26 = r2
            r2 = 8
            if (r0 != r2) goto L_0x040d
            int r3 = r3 + 0
        L_0x0403:
            r30 = r5
            r0 = r25
            r2 = r26
            r26 = r4
            goto L_0x0581
        L_0x040d:
            boolean r0 = r6.h(r3)
            if (r0 == 0) goto L_0x041a
            int r0 = r6.f639f
            int r2 = r6.f645l
            int r0 = r0 + r2
            r6.f639f = r0
        L_0x041a:
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r2 = r0
            androidx.appcompat.widget.a0$a r2 = (androidx.appcompat.widget.a0.a) r2
            float r0 = r2.weight
            float r29 = r1 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L_0x0477
            int r1 = r2.width
            if (r1 != 0) goto L_0x0477
            r1 = 0
            int r30 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r30 <= 0) goto L_0x0477
            if (r19 == 0) goto L_0x043f
            int r0 = r6.f639f
            int r1 = r2.leftMargin
            r30 = r3
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = r0 + r1
            goto L_0x044d
        L_0x043f:
            r30 = r3
            int r0 = r6.f639f
            int r1 = r2.leftMargin
            int r1 = r1 + r0
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = java.lang.Math.max(r0, r1)
        L_0x044d:
            r6.f639f = r0
            if (r5 == 0) goto L_0x0466
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r8.measure(r1, r1)
            r1 = r2
            r34 = r25
            r35 = r26
            r25 = r30
            r26 = r4
            r30 = r5
            goto L_0x04ec
        L_0x0466:
            r1 = r2
            r34 = r25
            r35 = r26
            r25 = r30
            r0 = 1073741824(0x40000000, float:2.0)
            r26 = r4
            r30 = r5
            r4 = r27
            goto L_0x04f0
        L_0x0477:
            r30 = r3
            int r1 = r2.width
            if (r1 != 0) goto L_0x0487
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0488
            r0 = -2
            r2.width = r0
            r3 = 0
            goto L_0x048a
        L_0x0487:
            r1 = 0
        L_0x0488:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x048a:
            int r0 = (r29 > r1 ? 1 : (r29 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0493
            int r0 = r6.f639f
            r31 = r0
            goto L_0x0495
        L_0x0493:
            r31 = 0
        L_0x0495:
            r33 = 0
            r1 = r25
            r0 = r38
            r34 = r1
            r1 = r8
            r36 = r2
            r35 = r26
            r2 = r39
            r37 = r3
            r25 = r30
            r3 = r31
            r26 = r4
            r4 = r40
            r30 = r5
            r5 = r33
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = r37
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x04c0
            r1 = r36
            r1.width = r0
            goto L_0x04c2
        L_0x04c0:
            r1 = r36
        L_0x04c2:
            int r0 = r8.getMeasuredWidth()
            if (r19 == 0) goto L_0x04d4
            int r2 = r6.f639f
            int r3 = r1.leftMargin
            int r3 = r3 + r0
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            r4 = 0
            int r3 = r3 + r4
            int r2 = r2 + r3
            goto L_0x04e4
        L_0x04d4:
            r4 = 0
            int r2 = r6.f639f
            int r3 = r2 + r0
            int r5 = r1.leftMargin
            int r3 = r3 + r5
            int r5 = r1.rightMargin
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r2 = java.lang.Math.max(r2, r3)
        L_0x04e4:
            r6.f639f = r2
            if (r26 == 0) goto L_0x04ec
            int r12 = java.lang.Math.max(r0, r12)
        L_0x04ec:
            r4 = r22
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x04f0:
            if (r11 == r0) goto L_0x04fc
            int r0 = r1.height
            r2 = -1
            if (r0 != r2) goto L_0x04fc
            r5 = r27
            r23 = r5
            goto L_0x04fd
        L_0x04fc:
            r5 = 0
        L_0x04fd:
            int r0 = r1.topMargin
            int r2 = r1.bottomMargin
            int r0 = r0 + r2
            int r2 = r8.getMeasuredHeight()
            int r2 = r2 + r0
            int r3 = r8.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r15, r3)
            if (r30 == 0) goto L_0x053f
            int r8 = r8.getBaseline()
            r15 = -1
            if (r8 == r15) goto L_0x053f
            int r15 = r1.gravity
            if (r15 >= 0) goto L_0x051e
            int r15 = r6.e
        L_0x051e:
            r15 = r15 & 112(0x70, float:1.57E-43)
            r22 = 4
            int r15 = r15 >> 4
            r22 = -2
            r15 = r15 & -2
            int r15 = r15 >> 1
            r22 = r0
            r0 = r13[r15]
            int r0 = java.lang.Math.max(r0, r8)
            r13[r15] = r0
            r0 = r14[r15]
            int r8 = r2 - r8
            int r0 = java.lang.Math.max(r0, r8)
            r14[r15] = r0
            goto L_0x0541
        L_0x053f:
            r22 = r0
        L_0x0541:
            r0 = r32
            int r0 = java.lang.Math.max(r0, r2)
            if (r20 == 0) goto L_0x0551
            int r8 = r1.height
            r15 = -1
            if (r8 != r15) goto L_0x0551
            r8 = r27
            goto L_0x0552
        L_0x0551:
            r8 = 0
        L_0x0552:
            float r1 = r1.weight
            r15 = 0
            int r1 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r1 <= 0) goto L_0x0567
            if (r5 == 0) goto L_0x055d
            r2 = r22
        L_0x055d:
            r1 = r35
            int r2 = java.lang.Math.max(r1, r2)
            r1 = r2
            r2 = r34
            goto L_0x0573
        L_0x0567:
            r1 = r35
            if (r5 == 0) goto L_0x056d
            r2 = r22
        L_0x056d:
            r5 = r34
            int r2 = java.lang.Math.max(r5, r2)
        L_0x0573:
            int r5 = r25 + 0
            r32 = r0
            r0 = r2
            r15 = r3
            r22 = r4
            r3 = r5
            r20 = r8
            r2 = r1
            r1 = r29
        L_0x0581:
            int r3 = r3 + 1
            r8 = r40
            r4 = r26
            r5 = r30
            goto L_0x03e0
        L_0x058b:
            r26 = r4
            r30 = r5
            r5 = r0
            r0 = r32
            int r3 = r6.f639f
            if (r3 <= 0) goto L_0x05a3
            boolean r3 = r6.h(r9)
            if (r3 == 0) goto L_0x05a3
            int r3 = r6.f639f
            int r4 = r6.f645l
            int r3 = r3 + r4
            r6.f639f = r3
        L_0x05a3:
            r3 = r13[r27]
            r4 = -1
            r25 = r15
            if (r3 != r4) goto L_0x05be
            r8 = 0
            r15 = r13[r8]
            if (r15 != r4) goto L_0x05be
            r8 = r13[r17]
            if (r8 != r4) goto L_0x05be
            r8 = 3
            r15 = r13[r8]
            if (r15 == r4) goto L_0x05b9
            goto L_0x05bf
        L_0x05b9:
            r32 = r0
            r29 = r11
            goto L_0x05ef
        L_0x05be:
            r8 = 3
        L_0x05bf:
            r4 = r13[r8]
            r15 = 0
            r8 = r13[r15]
            r15 = r13[r17]
            int r3 = java.lang.Math.max(r3, r15)
            int r3 = java.lang.Math.max(r8, r3)
            int r3 = java.lang.Math.max(r4, r3)
            r4 = 3
            r8 = r14[r4]
            r4 = 0
            r15 = r14[r4]
            r4 = r14[r27]
            r29 = r11
            r11 = r14[r17]
            int r4 = java.lang.Math.max(r4, r11)
            int r4 = java.lang.Math.max(r15, r4)
            int r4 = java.lang.Math.max(r8, r4)
            int r3 = r3 + r4
            int r32 = java.lang.Math.max(r0, r3)
        L_0x05ef:
            if (r26 == 0) goto L_0x063f
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r0) goto L_0x05f7
            if (r10 != 0) goto L_0x063f
        L_0x05f7:
            r0 = 0
            r6.f639f = r0
            r3 = r0
        L_0x05fb:
            if (r3 >= r9) goto L_0x063f
            android.view.View r4 = r6.getChildAt(r3)
            if (r4 != 0) goto L_0x0608
            int r4 = r6.f639f
            int r4 = r4 + r0
            r11 = r0
            goto L_0x0626
        L_0x0608:
            int r0 = r4.getVisibility()
            r8 = 8
            if (r0 != r8) goto L_0x0613
            int r3 = r3 + 0
            goto L_0x063b
        L_0x0613:
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            androidx.appcompat.widget.a0$a r0 = (androidx.appcompat.widget.a0.a) r0
            if (r19 == 0) goto L_0x0629
            int r4 = r6.f639f
            int r8 = r0.leftMargin
            int r8 = r8 + r12
            int r0 = r0.rightMargin
            int r8 = r8 + r0
            r11 = 0
            int r8 = r8 + r11
            int r4 = r4 + r8
        L_0x0626:
            r6.f639f = r4
            goto L_0x063b
        L_0x0629:
            r11 = 0
            int r4 = r6.f639f
            int r8 = r4 + r12
            int r15 = r0.leftMargin
            int r8 = r8 + r15
            int r0 = r0.rightMargin
            int r8 = r8 + r0
            int r8 = r8 + r11
            int r0 = java.lang.Math.max(r4, r8)
            r6.f639f = r0
        L_0x063b:
            int r3 = r3 + 1
            r0 = 0
            goto L_0x05fb
        L_0x063f:
            int r0 = r6.f639f
            int r3 = r38.getPaddingLeft()
            int r4 = r38.getPaddingRight()
            int r3 = r3 + r4
            int r0 = r0 + r3
            r6.f639f = r0
            int r3 = r38.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            r3 = 0
            int r0 = android.view.View.resolveSizeAndState(r0, r7, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r0
            int r4 = r6.f639f
            int r3 = r3 - r4
            if (r22 != 0) goto L_0x06b1
            if (r3 == 0) goto L_0x066b
            r8 = 0
            int r11 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x066b
            goto L_0x06b1
        L_0x066b:
            int r1 = java.lang.Math.max(r5, r2)
            if (r26 == 0) goto L_0x06a8
            r2 = 1073741824(0x40000000, float:2.0)
            if (r10 == r2) goto L_0x06a8
            r5 = 0
        L_0x0676:
            if (r5 >= r9) goto L_0x06a8
            android.view.View r2 = r6.getChildAt(r5)
            if (r2 == 0) goto L_0x06a5
            int r3 = r2.getVisibility()
            r8 = 8
            if (r3 != r8) goto L_0x0687
            goto L_0x06a5
        L_0x0687:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.appcompat.widget.a0$a r3 = (androidx.appcompat.widget.a0.a) r3
            float r3 = r3.weight
            r8 = 0
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x06a5
            r3 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r3)
            int r10 = r2.getMeasuredHeight()
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r3)
            r2.measure(r8, r10)
        L_0x06a5:
            int r5 = r5 + 1
            goto L_0x0676
        L_0x06a8:
            r3 = r40
            r15 = r25
            r12 = r29
            r8 = 0
            goto L_0x085b
        L_0x06b1:
            float r2 = r6.f640g
            r8 = 0
            int r11 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x06b9
            r1 = r2
        L_0x06b9:
            r2 = -1
            r8 = 3
            r13[r8] = r2
            r13[r17] = r2
            r13[r27] = r2
            r11 = 0
            r13[r11] = r2
            r14[r8] = r2
            r14[r17] = r2
            r14[r27] = r2
            r14[r11] = r2
            r6.f639f = r11
            r15 = r25
            r2 = -1
            r8 = 0
        L_0x06d2:
            if (r8 >= r9) goto L_0x0801
            android.view.View r11 = r6.getChildAt(r8)
            if (r11 == 0) goto L_0x07e9
            int r12 = r11.getVisibility()
            r4 = 8
            if (r12 != r4) goto L_0x06e4
            goto L_0x07e9
        L_0x06e4:
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            androidx.appcompat.widget.a0$a r4 = (androidx.appcompat.widget.a0.a) r4
            float r12 = r4.weight
            r18 = 0
            int r22 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r22 <= 0) goto L_0x0741
            float r7 = (float) r3
            float r7 = r7 * r12
            float r7 = r7 / r1
            int r7 = (int) r7
            float r1 = r1 - r12
            int r3 = r3 - r7
            int r12 = r38.getPaddingTop()
            int r22 = r38.getPaddingBottom()
            int r12 = r12 + r22
            r22 = r1
            int r1 = r4.topMargin
            int r12 = r12 + r1
            int r1 = r4.bottomMargin
            int r12 = r12 + r1
            int r1 = r4.height
            r25 = r3
            r3 = r40
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r3, r12, r1)
            int r12 = r4.width
            if (r12 != 0) goto L_0x0720
            r12 = 1073741824(0x40000000, float:2.0)
            if (r10 == r12) goto L_0x071d
            goto L_0x0720
        L_0x071d:
            if (r7 <= 0) goto L_0x0727
            goto L_0x0728
        L_0x0720:
            int r12 = r11.getMeasuredWidth()
            int r7 = r7 + r12
            if (r7 >= 0) goto L_0x0728
        L_0x0727:
            r7 = 0
        L_0x0728:
            r12 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
            r11.measure(r7, r1)
            int r1 = r11.getMeasuredState()
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r7
            int r15 = android.view.View.combineMeasuredStates(r15, r1)
            r1 = r22
            r7 = r25
            goto L_0x0744
        L_0x0741:
            r7 = r3
            r3 = r40
        L_0x0744:
            if (r19 == 0) goto L_0x0760
            int r12 = r6.f639f
            int r22 = r11.getMeasuredWidth()
            r25 = r1
            int r1 = r4.leftMargin
            int r22 = r22 + r1
            int r1 = r4.rightMargin
            int r22 = r22 + r1
            r1 = 0
            int r22 = r22 + 0
            int r12 = r12 + r22
            r6.f639f = r12
            r26 = r7
            goto L_0x077e
        L_0x0760:
            r25 = r1
            r1 = 0
            int r12 = r6.f639f
            int r22 = r11.getMeasuredWidth()
            int r22 = r22 + r12
            int r1 = r4.leftMargin
            int r22 = r22 + r1
            int r1 = r4.rightMargin
            int r22 = r22 + r1
            r26 = r7
            r1 = 0
            int r7 = r22 + 0
            int r1 = java.lang.Math.max(r12, r7)
            r6.f639f = r1
        L_0x077e:
            r12 = r29
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x078c
            int r1 = r4.height
            r7 = -1
            if (r1 != r7) goto L_0x078c
            r1 = r27
            goto L_0x078d
        L_0x078c:
            r1 = 0
        L_0x078d:
            int r7 = r4.topMargin
            r22 = r10
            int r10 = r4.bottomMargin
            int r7 = r7 + r10
            int r10 = r11.getMeasuredHeight()
            int r10 = r10 + r7
            int r2 = java.lang.Math.max(r2, r10)
            if (r1 == 0) goto L_0x07a0
            goto L_0x07a1
        L_0x07a0:
            r7 = r10
        L_0x07a1:
            int r1 = java.lang.Math.max(r5, r7)
            if (r20 == 0) goto L_0x07af
            int r5 = r4.height
            r7 = -1
            if (r5 != r7) goto L_0x07b0
            r5 = r27
            goto L_0x07b1
        L_0x07af:
            r7 = -1
        L_0x07b0:
            r5 = 0
        L_0x07b1:
            if (r30 == 0) goto L_0x07dd
            int r11 = r11.getBaseline()
            if (r11 == r7) goto L_0x07dd
            int r4 = r4.gravity
            if (r4 >= 0) goto L_0x07bf
            int r4 = r6.e
        L_0x07bf:
            r4 = r4 & 112(0x70, float:1.57E-43)
            r24 = 4
            int r4 = r4 >> 4
            r28 = -2
            r4 = r4 & -2
            int r4 = r4 >> 1
            r7 = r13[r4]
            int r7 = java.lang.Math.max(r7, r11)
            r13[r4] = r7
            r7 = r14[r4]
            int r10 = r10 - r11
            int r7 = java.lang.Math.max(r7, r10)
            r14[r4] = r7
            goto L_0x07e1
        L_0x07dd:
            r24 = 4
            r28 = -2
        L_0x07e1:
            r20 = r5
            r7 = r26
            r5 = r1
            r1 = r25
            goto L_0x07f6
        L_0x07e9:
            r7 = r3
            r22 = r10
            r12 = r29
            r18 = 0
            r24 = 4
            r28 = -2
            r3 = r40
        L_0x07f6:
            int r8 = r8 + 1
            r3 = r7
            r29 = r12
            r10 = r22
            r7 = r39
            goto L_0x06d2
        L_0x0801:
            r3 = r40
            r12 = r29
            int r1 = r6.f639f
            int r4 = r38.getPaddingLeft()
            int r7 = r38.getPaddingRight()
            int r4 = r4 + r7
            int r1 = r1 + r4
            r6.f639f = r1
            r1 = r13[r27]
            r4 = -1
            if (r1 != r4) goto L_0x082b
            r7 = 0
            r8 = r13[r7]
            if (r8 != r4) goto L_0x082b
            r7 = r13[r17]
            if (r7 != r4) goto L_0x082b
            r7 = 3
            r8 = r13[r7]
            if (r8 == r4) goto L_0x0827
            goto L_0x082c
        L_0x0827:
            r32 = r2
            r8 = 0
            goto L_0x085a
        L_0x082b:
            r7 = 3
        L_0x082c:
            r4 = r13[r7]
            r8 = 0
            r10 = r13[r8]
            r11 = r13[r17]
            int r1 = java.lang.Math.max(r1, r11)
            int r1 = java.lang.Math.max(r10, r1)
            int r1 = java.lang.Math.max(r4, r1)
            r4 = r14[r7]
            r7 = r14[r8]
            r10 = r14[r27]
            r11 = r14[r17]
            int r10 = java.lang.Math.max(r10, r11)
            int r7 = java.lang.Math.max(r7, r10)
            int r4 = java.lang.Math.max(r4, r7)
            int r1 = r1 + r4
            int r1 = java.lang.Math.max(r2, r1)
            r32 = r1
        L_0x085a:
            r1 = r5
        L_0x085b:
            if (r20 != 0) goto L_0x0862
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x0862
            goto L_0x0864
        L_0x0862:
            r1 = r32
        L_0x0864:
            int r2 = r38.getPaddingTop()
            int r4 = r38.getPaddingBottom()
            int r2 = r2 + r4
            int r1 = r1 + r2
            int r2 = r38.getSuggestedMinimumHeight()
            int r1 = java.lang.Math.max(r1, r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r15
            r0 = r0 | r2
            int r2 = r15 << 16
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r6.setMeasuredDimension(r0, r1)
            if (r23 == 0) goto L_0x08c2
            int r0 = r38.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
        L_0x088f:
            if (r8 >= r9) goto L_0x08c2
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r10 = 8
            if (r0 == r10) goto L_0x08be
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            androidx.appcompat.widget.a0$a r11 = (androidx.appcompat.widget.a0.a) r11
            int r0 = r11.height
            r12 = -1
            if (r0 != r12) goto L_0x08bf
            int r13 = r11.width
            int r0 = r1.getMeasuredWidth()
            r11.width = r0
            r3 = 0
            r5 = 0
            r0 = r38
            r2 = r39
            r4 = r7
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.width = r13
            goto L_0x08bf
        L_0x08be:
            r12 = -1
        L_0x08bf:
            int r8 = r8 + 1
            goto L_0x088f
        L_0x08c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z8) {
        this.f635a = z8;
    }

    public void setBaselineAlignedChildIndex(int i8) {
        if (i8 < 0 || i8 >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f636b = i8;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f644k) {
            this.f644k = drawable;
            boolean z8 = false;
            if (drawable != null) {
                this.f645l = drawable.getIntrinsicWidth();
                this.f646m = drawable.getIntrinsicHeight();
            } else {
                this.f645l = 0;
                this.f646m = 0;
            }
            if (drawable == null) {
                z8 = true;
            }
            setWillNotDraw(z8);
            requestLayout();
        }
    }

    public void setDividerPadding(int i8) {
        this.f648o = i8;
    }

    public void setGravity(int i8) {
        if (this.e != i8) {
            if ((8388615 & i8) == 0) {
                i8 |= 8388611;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            this.e = i8;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i8) {
        int i9 = i8 & 8388615;
        int i10 = this.e;
        if ((8388615 & i10) != i9) {
            this.e = i9 | (-8388616 & i10);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z8) {
        this.f641h = z8;
    }

    public void setOrientation(int i8) {
        if (this.f638d != i8) {
            this.f638d = i8;
            requestLayout();
        }
    }

    public void setShowDividers(int i8) {
        if (i8 != this.f647n) {
            requestLayout();
        }
        this.f647n = i8;
    }

    public void setVerticalGravity(int i8) {
        int i9 = i8 & 112;
        int i10 = this.e;
        if ((i10 & 112) != i9) {
            this.e = i9 | (i10 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f9) {
        this.f640g = Math.max(0.0f, f9);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
