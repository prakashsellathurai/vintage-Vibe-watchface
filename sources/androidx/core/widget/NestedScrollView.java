package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.health.services.client.R;
import j0.k;
import j0.l;
import j0.n;
import j0.o;
import j0.x;
import java.util.ArrayList;
import k0.c;
import k0.e;
import n0.d;

public class NestedScrollView extends FrameLayout implements n, k {
    public static final int[] A = {16843130};

    /* renamed from: z  reason: collision with root package name */
    public static final a f1058z = new a();

    /* renamed from: a  reason: collision with root package name */
    public long f1059a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f1060b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public OverScroller f1061c;

    /* renamed from: d  reason: collision with root package name */
    public final EdgeEffect f1062d;
    public final EdgeEffect e;

    /* renamed from: f  reason: collision with root package name */
    public int f1063f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1064g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1065h = false;

    /* renamed from: i  reason: collision with root package name */
    public View f1066i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1067j = false;

    /* renamed from: k  reason: collision with root package name */
    public VelocityTracker f1068k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1069l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1070m = true;

    /* renamed from: n  reason: collision with root package name */
    public int f1071n;

    /* renamed from: o  reason: collision with root package name */
    public int f1072o;

    /* renamed from: p  reason: collision with root package name */
    public int f1073p;

    /* renamed from: q  reason: collision with root package name */
    public int f1074q = -1;
    public final int[] r = new int[2];

    /* renamed from: s  reason: collision with root package name */
    public final int[] f1075s = new int[2];

    /* renamed from: t  reason: collision with root package name */
    public int f1076t;

    /* renamed from: u  reason: collision with root package name */
    public int f1077u;

    /* renamed from: v  reason: collision with root package name */
    public d f1078v;
    public final o w;

    /* renamed from: x  reason: collision with root package name */
    public final l f1079x;
    public float y;

    public static class a extends j0.a {
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            e.c(accessibilityEvent, nestedScrollView.getScrollX());
            e.d(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public final void d(View view, k0.c cVar) {
            int scrollRange;
            View.AccessibilityDelegate accessibilityDelegate = this.f4917a;
            AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5085a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.f(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                accessibilityNodeInfo.setScrollable(true);
                if (nestedScrollView.getScrollY() > 0) {
                    cVar.b(c.a.f5089g);
                    cVar.b(c.a.f5093k);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    cVar.b(c.a.f5088f);
                    cVar.b(c.a.f5094l);
                }
            }
        }

        public final boolean g(View view, int i8, Bundle bundle) {
            if (super.g(view, i8, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i8 != 4096) {
                if (i8 == 8192 || i8 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.t(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                    return true;
                } else if (i8 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.t(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
            return true;
        }
    }

    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
    }

    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public int f1080f;

        public class a implements Parcelable.Creator<d> {
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            public final Object[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f1080f = parcel.readInt();
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1080f + "}";
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f1080f);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        int i8 = Build.VERSION.SDK_INT;
        this.f1062d = i8 >= 31 ? d.b.a(context, attributeSet) : new EdgeEffect(context);
        this.e = i8 >= 31 ? d.b.a(context, attributeSet) : new EdgeEffect(context);
        this.f1061c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1071n = viewConfiguration.getScaledTouchSlop();
        this.f1072o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1073p = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.w = new o();
        this.f1079x = new l(this);
        setNestedScrollingEnabled(true);
        x.i(this, f1058z);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.y == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.y = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.y;
    }

    public static boolean n(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && n((View) parent, view2);
    }

    public final void a(View view, View view2, int i8, int i9) {
        o oVar = this.w;
        if (i9 == 1) {
            oVar.f4953b = i8;
        } else {
            oVar.f4952a = i8;
        }
        u(2, i9);
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i8) {
        if (getChildCount() <= 0) {
            super.addView(view, i8);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i8, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void b(View view, int i8) {
        o oVar = this.w;
        if (i8 == 1) {
            oVar.f4953b = 0;
        } else {
            oVar.f4952a = 0;
        }
        w(i8);
    }

    public final void c(View view, int i8, int i9, int[] iArr, int i10) {
        this.f1079x.c(i8, i9, iArr, (int[]) null, i10);
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        if (r0.isFinished() != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        if (r0.isFinished() != false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void computeScroll() {
        /*
            r13 = this;
            android.widget.OverScroller r0 = r13.f1061c
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            android.widget.OverScroller r0 = r13.f1061c
            r0.computeScrollOffset()
            android.widget.OverScroller r0 = r13.f1061c
            int r0 = r0.getCurrY()
            int r1 = r13.f1077u
            int r1 = r0 - r1
            r13.f1077u = r0
            int[] r0 = r13.f1075s
            r10 = 1
            r11 = 0
            r0[r10] = r11
            r3 = 0
            r6 = 0
            r7 = 1
            j0.l r2 = r13.f1079x
            r4 = r1
            r5 = r0
            r2.c(r3, r4, r5, r6, r7)
            r2 = r0[r10]
            int r1 = r1 - r2
            int r12 = r13.getScrollRange()
            if (r1 == 0) goto L_0x0056
            int r2 = r13.getScrollY()
            int r3 = r13.getScrollX()
            r13.r(r1, r3, r2, r12)
            int r3 = r13.getScrollY()
            int r4 = r3 - r2
            int r1 = r1 - r4
            r0[r10] = r11
            int[] r7 = r13.r
            r8 = 1
            r3 = 0
            r5 = 0
            j0.l r2 = r13.f1079x
            r6 = r1
            r9 = r0
            r2.e(r3, r4, r5, r6, r7, r8, r9)
            r0 = r0[r10]
            int r1 = r1 - r0
        L_0x0056:
            if (r1 == 0) goto L_0x008a
            int r0 = r13.getOverScrollMode()
            if (r0 == 0) goto L_0x0062
            if (r0 != r10) goto L_0x0063
            if (r12 <= 0) goto L_0x0063
        L_0x0062:
            r11 = r10
        L_0x0063:
            if (r11 == 0) goto L_0x0082
            if (r1 >= 0) goto L_0x0070
            android.widget.EdgeEffect r0 = r13.f1062d
            boolean r1 = r0.isFinished()
            if (r1 == 0) goto L_0x0082
            goto L_0x0078
        L_0x0070:
            android.widget.EdgeEffect r0 = r13.e
            boolean r1 = r0.isFinished()
            if (r1 == 0) goto L_0x0082
        L_0x0078:
            android.widget.OverScroller r1 = r13.f1061c
            float r1 = r1.getCurrVelocity()
            int r1 = (int) r1
            r0.onAbsorb(r1)
        L_0x0082:
            android.widget.OverScroller r0 = r13.f1061c
            r0.abortAnimation()
            r13.w(r10)
        L_0x008a:
            android.widget.OverScroller r0 = r13.f1061c
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0098
            int[] r0 = j0.x.f4957a
            j0.x.c.k(r13)
            goto L_0x009b
        L_0x0098:
            r13.w(r10)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final boolean d(int i8) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i8);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !o(findNextFocus, maxScrollAmount, getHeight())) {
            if (i8 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i8 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i8 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            i(maxScrollAmount);
        } else {
            Rect rect = this.f1060b;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            i(h(rect));
            findNextFocus.requestFocus(i8);
        }
        if (findFocus != null && findFocus.isFocused() && (!o(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || k(keyEvent);
    }

    public final boolean dispatchNestedFling(float f9, float f10, boolean z8) {
        return this.f1079x.a(f9, f10, z8);
    }

    public final boolean dispatchNestedPreFling(float f9, float f10) {
        return this.f1079x.b(f9, f10);
    }

    public final boolean dispatchNestedPreScroll(int i8, int i9, int[] iArr, int[] iArr2) {
        return this.f1079x.c(i8, i9, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr) {
        return this.f1079x.e(i8, i9, i10, i11, iArr, 0, (int[]) null);
    }

    public final void draw(Canvas canvas) {
        int i8;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1062d;
        int i9 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i8 = getPaddingLeft() + 0;
            } else {
                i8 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i8, (float) min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                int[] iArr = x.f4957a;
                x.c.k(this);
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.e;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (b.a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i9 = 0 + getPaddingLeft();
            }
            if (b.a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i9 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                int[] iArr2 = x.f4957a;
                x.c.k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    public final void e(View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        p(i11, i12, iArr);
    }

    public final void f(View view, int i8, int i9, int i10, int i11, int i12) {
        p(i11, i12, (int[]) null);
    }

    public final boolean g(View view, View view2, int i8, int i9) {
        return (i8 & 2) != 0;
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        o oVar = this.w;
        return oVar.f4953b | oVar.f4952a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i9 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i8 - verticalFadingEdgeLength : i8;
        int i10 = rect.bottom;
        if (i10 > i9 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i9) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i8);
        } else if (rect.top >= scrollY || i10 >= i9) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i9 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public final boolean hasNestedScrollingParent() {
        return this.f1079x.f(0) != null;
    }

    public final void i(int i8) {
        if (i8 == 0) {
            return;
        }
        if (this.f1070m) {
            t(0, i8, false);
        } else {
            scrollBy(0, i8);
        }
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f1079x.f4951d;
    }

    public final void j() {
        this.f1067j = false;
        VelocityTracker velocityTracker = this.f1068k;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1068k = null;
        }
        w(0);
        this.f1062d.onRelease();
        this.e.onRelease();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(android.view.KeyEvent r8) {
        /*
            r7 = this;
            android.graphics.Rect r0 = r7.f1060b
            r0.setEmpty()
            int r1 = r7.getChildCount()
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L_0x0033
            android.view.View r1 = r7.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            int r1 = r1.getHeight()
            int r5 = r4.topMargin
            int r1 = r1 + r5
            int r4 = r4.bottomMargin
            int r1 = r1 + r4
            int r4 = r7.getHeight()
            int r5 = r7.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r7.getPaddingBottom()
            int r4 = r4 - r5
            if (r1 <= r4) goto L_0x0033
            r1 = r2
            goto L_0x0034
        L_0x0033:
            r1 = r3
        L_0x0034:
            r4 = 130(0x82, float:1.82E-43)
            if (r1 != 0) goto L_0x0062
            boolean r0 = r7.isFocused()
            if (r0 == 0) goto L_0x0061
            int r8 = r8.getKeyCode()
            r0 = 4
            if (r8 == r0) goto L_0x0061
            android.view.View r8 = r7.findFocus()
            if (r8 != r7) goto L_0x004c
            r8 = 0
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r8 = r0.findNextFocus(r7, r8, r4)
            if (r8 == 0) goto L_0x005f
            if (r8 == r7) goto L_0x005f
            boolean r7 = r8.requestFocus(r4)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r2 = r3
        L_0x0060:
            return r2
        L_0x0061:
            return r3
        L_0x0062:
            int r1 = r8.getAction()
            if (r1 != 0) goto L_0x00ef
            int r1 = r8.getKeyCode()
            r5 = 19
            r6 = 33
            if (r1 == r5) goto L_0x00e0
            r5 = 20
            if (r1 == r5) goto L_0x00d0
            r5 = 62
            if (r1 == r5) goto L_0x007c
            goto L_0x00ef
        L_0x007c:
            boolean r8 = r8.isShiftPressed()
            if (r8 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r6 = r4
        L_0x0084:
            if (r6 != r4) goto L_0x0088
            r8 = r2
            goto L_0x0089
        L_0x0088:
            r8 = r3
        L_0x0089:
            int r1 = r7.getHeight()
            if (r8 == 0) goto L_0x00bc
            int r8 = r7.getScrollY()
            int r8 = r8 + r1
            r0.top = r8
            int r8 = r7.getChildCount()
            if (r8 <= 0) goto L_0x00c7
            int r8 = r8 - r2
            android.view.View r8 = r7.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r8 = r8.getBottom()
            int r2 = r2.bottomMargin
            int r8 = r8 + r2
            int r2 = r7.getPaddingBottom()
            int r8 = r8 + r2
            int r2 = r0.top
            int r2 = r2 + r1
            if (r2 <= r8) goto L_0x00c7
            int r8 = r8 - r1
            r0.top = r8
            goto L_0x00c7
        L_0x00bc:
            int r8 = r7.getScrollY()
            int r8 = r8 - r1
            r0.top = r8
            if (r8 >= 0) goto L_0x00c7
            r0.top = r3
        L_0x00c7:
            int r8 = r0.top
            int r1 = r1 + r8
            r0.bottom = r1
            r7.s(r6, r8, r1)
            goto L_0x00ef
        L_0x00d0:
            boolean r8 = r8.isAltPressed()
            if (r8 != 0) goto L_0x00db
            boolean r3 = r7.d(r4)
            goto L_0x00ef
        L_0x00db:
            boolean r3 = r7.m(r4)
            goto L_0x00ef
        L_0x00e0:
            boolean r8 = r8.isAltPressed()
            if (r8 != 0) goto L_0x00eb
            boolean r3 = r7.d(r6)
            goto L_0x00ef
        L_0x00eb:
            boolean r3 = r7.m(r6)
        L_0x00ef:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.k(android.view.KeyEvent):boolean");
    }

    public final void l(int i8) {
        if (getChildCount() > 0) {
            this.f1061c.fling(getScrollX(), getScrollY(), 0, i8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.f1077u = getScrollY();
            int[] iArr = x.f4957a;
            x.c.k(this);
        }
    }

    public final boolean m(int i8) {
        int childCount;
        boolean z8 = i8 == 130;
        int height = getHeight();
        Rect rect = this.f1060b;
        rect.top = 0;
        rect.bottom = height;
        if (z8 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            rect.top = rect.bottom - height;
        }
        return s(i8, rect.top, rect.bottom);
    }

    public final void measureChild(View view, int i8, int i9) {
        view.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void measureChildWithMargins(View view, int i8, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean o(View view, int i8, int i9) {
        Rect rect = this.f1060b;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i8 >= getScrollY() && rect.top - i8 <= getScrollY() + i9;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1065h = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 8
            r2 = 0
            if (r0 != r1) goto L_0x00be
            boolean r0 = r8.f1067j
            if (r0 != 0) goto L_0x00be
            r0 = 2
            boolean r0 = a1.a.y(r9, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0018
            r0 = 9
            goto L_0x0022
        L_0x0018:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = a1.a.y(r9, r0)
            if (r0 == 0) goto L_0x0027
            r0 = 26
        L_0x0022:
            float r0 = r9.getAxisValue(r0)
            goto L_0x0028
        L_0x0027:
            r0 = r1
        L_0x0028:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x00be
            float r1 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r1
            int r0 = (int) r0
            int r1 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 8194(0x2002, float:1.1482E-41)
            if (r0 >= 0) goto L_0x0079
            int r1 = r8.getOverScrollMode()
            if (r1 == 0) goto L_0x0054
            if (r1 != r4) goto L_0x0052
            int r1 = r8.getScrollRange()
            if (r1 <= 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r1 = r2
            goto L_0x0055
        L_0x0054:
            r1 = r4
        L_0x0055:
            if (r1 == 0) goto L_0x005f
            boolean r9 = a1.a.y(r9, r6)
            if (r9 != 0) goto L_0x005f
            r9 = r4
            goto L_0x0060
        L_0x005f:
            r9 = r2
        L_0x0060:
            if (r9 == 0) goto L_0x0077
            float r9 = (float) r0
            float r9 = -r9
            int r0 = r8.getHeight()
            float r0 = (float) r0
            float r9 = r9 / r0
            android.widget.EdgeEffect r0 = r8.f1062d
            n0.d.b(r0, r9, r5)
            r0.onRelease()
            r8.invalidate()
            r9 = r4
            goto L_0x00b3
        L_0x0077:
            r9 = r2
            goto L_0x00b3
        L_0x0079:
            if (r0 <= r1) goto L_0x00b1
            int r7 = r8.getOverScrollMode()
            if (r7 == 0) goto L_0x008c
            if (r7 != r4) goto L_0x008a
            int r7 = r8.getScrollRange()
            if (r7 <= 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            r7 = r2
            goto L_0x008d
        L_0x008c:
            r7 = r4
        L_0x008d:
            if (r7 == 0) goto L_0x0097
            boolean r9 = a1.a.y(r9, r6)
            if (r9 != 0) goto L_0x0097
            r9 = r4
            goto L_0x0098
        L_0x0097:
            r9 = r2
        L_0x0098:
            if (r9 == 0) goto L_0x00ae
            int r0 = r0 - r1
            float r9 = (float) r0
            int r0 = r8.getHeight()
            float r0 = (float) r0
            float r9 = r9 / r0
            android.widget.EdgeEffect r0 = r8.e
            n0.d.b(r0, r9, r5)
            r0.onRelease()
            r8.invalidate()
            r2 = r4
        L_0x00ae:
            r9 = r2
            r2 = r1
            goto L_0x00b3
        L_0x00b1:
            r9 = r2
            r2 = r0
        L_0x00b3:
            if (r2 == r3) goto L_0x00bd
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r2)
            return r4
        L_0x00bd:
            return r9
        L_0x00be:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L_0x000d
            boolean r3 = r12.f1067j
            if (r3 == 0) goto L_0x000d
            return r1
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x00b1
            r5 = -1
            if (r0 == r1) goto L_0x0083
            if (r0 == r2) goto L_0x0025
            r1 = 3
            if (r0 == r1) goto L_0x0083
            r1 = 6
            if (r0 == r1) goto L_0x0020
            goto L_0x0139
        L_0x0020:
            r12.q(r13)
            goto L_0x0139
        L_0x0025:
            int r0 = r12.f1074q
            if (r0 != r5) goto L_0x002b
            goto L_0x0139
        L_0x002b:
            int r3 = r13.findPointerIndex(r0)
            if (r3 != r5) goto L_0x004b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid pointerId="
            r13.<init>(r1)
            r13.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r13)
            goto L_0x0139
        L_0x004b:
            float r0 = r13.getY(r3)
            int r0 = (int) r0
            int r3 = r12.f1063f
            int r3 = r0 - r3
            int r3 = java.lang.Math.abs(r3)
            int r5 = r12.f1071n
            if (r3 <= r5) goto L_0x0139
            int r3 = r12.getNestedScrollAxes()
            r2 = r2 & r3
            if (r2 != 0) goto L_0x0139
            r12.f1067j = r1
            r12.f1063f = r0
            android.view.VelocityTracker r0 = r12.f1068k
            if (r0 != 0) goto L_0x0071
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f1068k = r0
        L_0x0071:
            android.view.VelocityTracker r0 = r12.f1068k
            r0.addMovement(r13)
            r12.f1076t = r4
            android.view.ViewParent r13 = r12.getParent()
            if (r13 == 0) goto L_0x0139
            r13.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0139
        L_0x0083:
            r12.f1067j = r4
            r12.f1074q = r5
            android.view.VelocityTracker r13 = r12.f1068k
            if (r13 == 0) goto L_0x0090
            r13.recycle()
            r12.f1068k = r3
        L_0x0090:
            android.widget.OverScroller r5 = r12.f1061c
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto L_0x00ac
            int[] r13 = j0.x.f4957a
            j0.x.c.k(r12)
        L_0x00ac:
            r12.w(r4)
            goto L_0x0139
        L_0x00b1:
            float r0 = r13.getY()
            int r0 = (int) r0
            float r5 = r13.getX()
            int r5 = (int) r5
            int r6 = r12.getChildCount()
            if (r6 <= 0) goto L_0x00e5
            int r6 = r12.getScrollY()
            android.view.View r7 = r12.getChildAt(r4)
            int r8 = r7.getTop()
            int r8 = r8 - r6
            if (r0 < r8) goto L_0x00e5
            int r8 = r7.getBottom()
            int r8 = r8 - r6
            if (r0 >= r8) goto L_0x00e5
            int r6 = r7.getLeft()
            if (r5 < r6) goto L_0x00e5
            int r6 = r7.getRight()
            if (r5 >= r6) goto L_0x00e5
            r5 = r1
            goto L_0x00e6
        L_0x00e5:
            r5 = r4
        L_0x00e6:
            if (r5 != 0) goto L_0x0104
            boolean r13 = r12.v(r13)
            if (r13 != 0) goto L_0x00f8
            android.widget.OverScroller r13 = r12.f1061c
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L_0x00f7
            goto L_0x00f8
        L_0x00f7:
            r1 = r4
        L_0x00f8:
            r12.f1067j = r1
            android.view.VelocityTracker r13 = r12.f1068k
            if (r13 == 0) goto L_0x0139
            r13.recycle()
            r12.f1068k = r3
            goto L_0x0139
        L_0x0104:
            r12.f1063f = r0
            int r0 = r13.getPointerId(r4)
            r12.f1074q = r0
            android.view.VelocityTracker r0 = r12.f1068k
            if (r0 != 0) goto L_0x0117
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f1068k = r0
            goto L_0x011a
        L_0x0117:
            r0.clear()
        L_0x011a:
            android.view.VelocityTracker r0 = r12.f1068k
            r0.addMovement(r13)
            android.widget.OverScroller r0 = r12.f1061c
            r0.computeScrollOffset()
            boolean r13 = r12.v(r13)
            if (r13 != 0) goto L_0x0134
            android.widget.OverScroller r13 = r12.f1061c
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r1 = r4
        L_0x0134:
            r12.f1067j = r1
            r12.u(r2, r4)
        L_0x0139:
            boolean r12 = r12.f1067j
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int i12;
        super.onLayout(z8, i8, i9, i10, i11);
        int i13 = 0;
        this.f1064g = false;
        View view = this.f1066i;
        if (view != null && n(view, this)) {
            View view2 = this.f1066i;
            Rect rect = this.f1060b;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h8 = h(rect);
            if (h8 != 0) {
                scrollBy(0, h8);
            }
        }
        this.f1066i = null;
        if (!this.f1065h) {
            if (this.f1078v != null) {
                scrollTo(getScrollX(), this.f1078v.f1080f);
                this.f1078v = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i12 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i12 = 0;
            }
            int paddingTop = ((i11 - i9) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i12 && scrollY >= 0) {
                i13 = paddingTop + scrollY > i12 ? i12 - paddingTop : scrollY;
            }
            if (i13 != scrollY) {
                scrollTo(getScrollX(), i13);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1065h = true;
    }

    public final void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        if (this.f1069l && View.MeasureSpec.getMode(i9) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public final boolean onNestedFling(View view, float f9, float f10, boolean z8) {
        if (z8) {
            return false;
        }
        dispatchNestedFling(0.0f, f10, true);
        l((int) f10);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f9, float f10) {
        return dispatchNestedPreFling(f9, f10);
    }

    public final void onNestedPreScroll(View view, int i8, int i9, int[] iArr) {
        c(view, i8, i9, iArr, 0);
    }

    public final void onNestedScroll(View view, int i8, int i9, int i10, int i11) {
        p(i11, 0, (int[]) null);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i8) {
        a(view, view2, i8, 0);
    }

    public final void onOverScrolled(int i8, int i9, boolean z8, boolean z9) {
        super.scrollTo(i8, i9);
    }

    public final boolean onRequestFocusInDescendants(int i8, Rect rect) {
        if (i8 == 2) {
            i8 = 130;
        } else if (i8 == 1) {
            i8 = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, (View) null, i8) : instance.findNextFocusFromRect(this, rect, i8);
        if (findNextFocus != null && !(!o(findNextFocus, 0, getHeight()))) {
            return findNextFocus.requestFocus(i8, rect);
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f1078v = dVar;
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f1080f = getScrollY();
        return dVar;
    }

    public final void onScrollChanged(int i8, int i9, int i10, int i11) {
        super.onScrollChanged(i8, i9, i10, i11);
    }

    public final void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && o(findFocus, 0, i11)) {
            Rect rect = this.f1060b;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            i(h(rect));
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i8) {
        return g(view, view2, i8, 0);
    }

    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x020b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            android.view.VelocityTracker r2 = r0.f1068k
            if (r2 != 0) goto L_0x000e
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r0.f1068k = r2
        L_0x000e:
            int r2 = r25.getActionMasked()
            r3 = 0
            if (r2 != 0) goto L_0x0017
            r0.f1076t = r3
        L_0x0017:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r25)
            int r5 = r0.f1076t
            float r5 = (float) r5
            r6 = 0
            r4.offsetLocation(r6, r5)
            r5 = 1
            r7 = 2
            if (r2 == 0) goto L_0x0279
            r8 = -1
            android.widget.EdgeEffect r9 = r0.e
            android.widget.EdgeEffect r10 = r0.f1062d
            if (r2 == r5) goto L_0x0212
            if (r2 == r7) goto L_0x0084
            r3 = 3
            if (r2 == r3) goto L_0x005f
            r3 = 5
            if (r2 == r3) goto L_0x004c
            r3 = 6
            if (r2 == r3) goto L_0x003a
            goto L_0x02af
        L_0x003a:
            r24.q(r25)
            int r2 = r0.f1074q
            int r2 = r1.findPointerIndex(r2)
            float r1 = r1.getY(r2)
            int r1 = (int) r1
            r0.f1063f = r1
            goto L_0x02af
        L_0x004c:
            int r2 = r25.getActionIndex()
            float r3 = r1.getY(r2)
            int r3 = (int) r3
            r0.f1063f = r3
            int r1 = r1.getPointerId(r2)
            r0.f1074q = r1
            goto L_0x02af
        L_0x005f:
            boolean r1 = r0.f1067j
            if (r1 == 0) goto L_0x0273
            int r1 = r24.getChildCount()
            if (r1 <= 0) goto L_0x0273
            android.widget.OverScroller r9 = r0.f1061c
            int r10 = r24.getScrollX()
            int r11 = r24.getScrollY()
            r12 = 0
            r13 = 0
            r14 = 0
            int r15 = r24.getScrollRange()
            boolean r1 = r9.springBack(r10, r11, r12, r13, r14, r15)
            if (r1 == 0) goto L_0x0273
            int[] r1 = j0.x.f4957a
            goto L_0x0270
        L_0x0084:
            int r2 = r0.f1074q
            int r2 = r1.findPointerIndex(r2)
            if (r2 != r8) goto L_0x00a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid pointerId="
            r1.<init>(r2)
            int r2 = r0.f1074q
            r1.append(r2)
            java.lang.String r2 = " in onTouchEvent"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "NestedScrollView"
            android.util.Log.e(r2, r1)
            goto L_0x02af
        L_0x00a8:
            float r7 = r1.getY(r2)
            int r7 = (int) r7
            int r8 = r0.f1063f
            int r8 = r8 - r7
            float r11 = r1.getX(r2)
            int r12 = r24.getWidth()
            float r12 = (float) r12
            float r11 = r11 / r12
            float r12 = (float) r8
            int r13 = r24.getHeight()
            float r13 = (float) r13
            float r12 = r12 / r13
            float r13 = n0.d.a(r10)
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x00dd
            float r12 = -r12
            float r11 = n0.d.b(r10, r12, r11)
            float r11 = -r11
            float r12 = n0.d.a(r10)
            int r6 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x00db
            r6 = r10
            goto L_0x00f4
        L_0x00db:
            r6 = r11
            goto L_0x00f8
        L_0x00dd:
            float r13 = n0.d.a(r9)
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 == 0) goto L_0x00f8
            float r11 = r14 - r11
            float r11 = n0.d.b(r9, r12, r11)
            float r12 = n0.d.a(r9)
            int r6 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x00db
            r6 = r9
        L_0x00f4:
            r6.onRelease()
            goto L_0x00db
        L_0x00f8:
            int r11 = r24.getHeight()
            float r11 = (float) r11
            float r6 = r6 * r11
            int r6 = java.lang.Math.round(r6)
            if (r6 == 0) goto L_0x0107
            r24.invalidate()
        L_0x0107:
            int r8 = r8 - r6
            boolean r6 = r0.f1067j
            if (r6 != 0) goto L_0x0126
            int r6 = java.lang.Math.abs(r8)
            int r11 = r0.f1071n
            if (r6 <= r11) goto L_0x0126
            android.view.ViewParent r6 = r24.getParent()
            if (r6 == 0) goto L_0x011d
            r6.requestDisallowInterceptTouchEvent(r5)
        L_0x011d:
            r0.f1067j = r5
            int r6 = r0.f1071n
            if (r8 <= 0) goto L_0x0125
            int r8 = r8 - r6
            goto L_0x0126
        L_0x0125:
            int r8 = r8 + r6
        L_0x0126:
            boolean r6 = r0.f1067j
            if (r6 == 0) goto L_0x02af
            r16 = 0
            int[] r6 = r0.f1075s
            int[] r11 = r0.r
            r20 = 0
            j0.l r15 = r0.f1079x
            r17 = r8
            r18 = r6
            r19 = r11
            boolean r6 = r15.c(r16, r17, r18, r19, r20)
            int[] r11 = r0.f1075s
            int[] r12 = r0.r
            if (r6 == 0) goto L_0x014e
            r6 = r11[r5]
            int r8 = r8 - r6
            int r6 = r0.f1076t
            r13 = r12[r5]
            int r6 = r6 + r13
            r0.f1076t = r6
        L_0x014e:
            r6 = r12[r5]
            int r7 = r7 - r6
            r0.f1063f = r7
            int r6 = r24.getScrollY()
            int r7 = r24.getScrollRange()
            int r13 = r24.getOverScrollMode()
            if (r13 == 0) goto L_0x0168
            if (r13 != r5) goto L_0x0166
            if (r7 <= 0) goto L_0x0166
            goto L_0x0168
        L_0x0166:
            r13 = r3
            goto L_0x0169
        L_0x0168:
            r13 = r5
        L_0x0169:
            int r15 = r24.getScrollY()
            boolean r15 = r0.r(r8, r3, r15, r7)
            if (r15 == 0) goto L_0x0183
            j0.l r15 = r0.f1079x
            android.view.ViewParent r15 = r15.f(r3)
            if (r15 == 0) goto L_0x017d
            r15 = r5
            goto L_0x017e
        L_0x017d:
            r15 = r3
        L_0x017e:
            if (r15 != 0) goto L_0x0183
            r23 = r5
            goto L_0x0185
        L_0x0183:
            r23 = r3
        L_0x0185:
            int r15 = r24.getScrollY()
            int r17 = r15 - r6
            int r19 = r8 - r17
            r11[r5] = r3
            int[] r15 = r0.r
            r21 = 0
            r16 = 0
            r18 = 0
            j0.l r3 = r0.f1079x
            r20 = r15
            r15 = r3
            r22 = r11
            r15.e(r16, r17, r18, r19, r20, r21, r22)
            int r3 = r0.f1063f
            r12 = r12[r5]
            int r3 = r3 - r12
            r0.f1063f = r3
            int r3 = r0.f1076t
            int r3 = r3 + r12
            r0.f1076t = r3
            if (r13 == 0) goto L_0x0207
            r3 = r11[r5]
            int r8 = r8 - r3
            int r6 = r6 + r8
            if (r6 >= 0) goto L_0x01d4
            int r3 = -r8
            float r3 = (float) r3
            int r6 = r24.getHeight()
            float r6 = (float) r6
            float r3 = r3 / r6
            float r1 = r1.getX(r2)
            int r2 = r24.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            n0.d.b(r10, r3, r1)
            boolean r1 = r9.isFinished()
            if (r1 != 0) goto L_0x01f4
            r9.onRelease()
            goto L_0x01f4
        L_0x01d4:
            if (r6 <= r7) goto L_0x01f4
            float r3 = (float) r8
            int r6 = r24.getHeight()
            float r6 = (float) r6
            float r3 = r3 / r6
            float r1 = r1.getX(r2)
            int r2 = r24.getWidth()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r14 = r14 - r1
            n0.d.b(r9, r3, r14)
            boolean r1 = r10.isFinished()
            if (r1 != 0) goto L_0x01f4
            r10.onRelease()
        L_0x01f4:
            boolean r1 = r10.isFinished()
            if (r1 == 0) goto L_0x0200
            boolean r1 = r9.isFinished()
            if (r1 != 0) goto L_0x0207
        L_0x0200:
            int[] r1 = j0.x.f4957a
            j0.x.c.k(r24)
            r3 = 0
            goto L_0x0209
        L_0x0207:
            r3 = r23
        L_0x0209:
            if (r3 == 0) goto L_0x02af
            android.view.VelocityTracker r1 = r0.f1068k
            r1.clear()
            goto L_0x02af
        L_0x0212:
            android.view.VelocityTracker r1 = r0.f1068k
            int r2 = r0.f1073p
            float r2 = (float) r2
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3, r2)
            int r2 = r0.f1074q
            float r1 = r1.getYVelocity(r2)
            int r1 = (int) r1
            int r2 = java.lang.Math.abs(r1)
            int r3 = r0.f1072o
            if (r2 < r3) goto L_0x0257
            float r2 = n0.d.a(r10)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0237
            r10.onAbsorb(r1)
            goto L_0x0243
        L_0x0237:
            float r2 = n0.d.a(r9)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0245
            int r2 = -r1
            r9.onAbsorb(r2)
        L_0x0243:
            r3 = r5
            goto L_0x0246
        L_0x0245:
            r3 = 0
        L_0x0246:
            if (r3 != 0) goto L_0x0273
            int r1 = -r1
            float r2 = (float) r1
            boolean r3 = r0.dispatchNestedPreFling(r6, r2)
            if (r3 != 0) goto L_0x0273
            r0.dispatchNestedFling(r6, r2, r5)
            r0.l(r1)
            goto L_0x0273
        L_0x0257:
            android.widget.OverScroller r9 = r0.f1061c
            int r10 = r24.getScrollX()
            int r11 = r24.getScrollY()
            r12 = 0
            r13 = 0
            r14 = 0
            int r15 = r24.getScrollRange()
            boolean r1 = r9.springBack(r10, r11, r12, r13, r14, r15)
            if (r1 == 0) goto L_0x0273
            int[] r1 = j0.x.f4957a
        L_0x0270:
            j0.x.c.k(r24)
        L_0x0273:
            r0.f1074q = r8
            r24.j()
            goto L_0x02af
        L_0x0279:
            int r2 = r24.getChildCount()
            if (r2 != 0) goto L_0x0281
            r2 = 0
            return r2
        L_0x0281:
            boolean r2 = r0.f1067j
            if (r2 == 0) goto L_0x028e
            android.view.ViewParent r2 = r24.getParent()
            if (r2 == 0) goto L_0x028e
            r2.requestDisallowInterceptTouchEvent(r5)
        L_0x028e:
            android.widget.OverScroller r2 = r0.f1061c
            boolean r2 = r2.isFinished()
            if (r2 != 0) goto L_0x029e
            android.widget.OverScroller r2 = r0.f1061c
            r2.abortAnimation()
            r0.w(r5)
        L_0x029e:
            float r2 = r25.getY()
            int r2 = (int) r2
            r0.f1063f = r2
            r2 = 0
            int r1 = r1.getPointerId(r2)
            r0.f1074q = r1
            r0.u(r7, r2)
        L_0x02af:
            android.view.VelocityTracker r0 = r0.f1068k
            if (r0 == 0) goto L_0x02b6
            r0.addMovement(r4)
        L_0x02b6:
            r4.recycle()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i8, int i9, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i8);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1079x.d(scrollY2, i8 - scrollY2, i9, iArr);
    }

    public final void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1074q) {
            int i8 = actionIndex == 0 ? 1 : 0;
            this.f1063f = (int) motionEvent.getY(i8);
            this.f1074q = motionEvent.getPointerId(i8);
            VelocityTracker velocityTracker = this.f1068k;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.getOverScrollMode()
            r9.computeHorizontalScrollRange()
            r9.computeHorizontalScrollExtent()
            r9.computeVerticalScrollRange()
            r9.computeVerticalScrollExtent()
            r1 = 1
            r0 = 0
            int r11 = r11 + r0
            int r12 = r12 + r10
            int r13 = r13 + r0
            if (r11 <= 0) goto L_0x001a
        L_0x0017:
            r11 = r0
            r10 = r1
            goto L_0x001e
        L_0x001a:
            if (r11 >= 0) goto L_0x001d
            goto L_0x0017
        L_0x001d:
            r10 = r0
        L_0x001e:
            if (r12 <= r13) goto L_0x0023
            r12 = r13
        L_0x0021:
            r13 = r1
            goto L_0x0028
        L_0x0023:
            if (r12 >= 0) goto L_0x0027
            r12 = r0
            goto L_0x0021
        L_0x0027:
            r13 = r0
        L_0x0028:
            if (r13 == 0) goto L_0x0045
            j0.l r2 = r9.f1079x
            android.view.ViewParent r2 = r2.f(r1)
            if (r2 == 0) goto L_0x0034
            r2 = r1
            goto L_0x0035
        L_0x0034:
            r2 = r0
        L_0x0035:
            if (r2 != 0) goto L_0x0045
            android.widget.OverScroller r2 = r9.f1061c
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r9.getScrollRange()
            r3 = r11
            r4 = r12
            r2.springBack(r3, r4, r5, r6, r7, r8)
        L_0x0045:
            r9.onOverScrolled(r11, r12, r10, r13)
            if (r10 != 0) goto L_0x004e
            if (r13 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r1 = r0
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.r(int, int, int, int):boolean");
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.f1064g) {
            Rect rect = this.f1060b;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h8 = h(rect);
            if (h8 != 0) {
                scrollBy(0, h8);
            }
        } else {
            this.f1066i = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z8) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h8 = h(rect);
        boolean z9 = h8 != 0;
        if (z9) {
            if (z8) {
                scrollBy(0, h8);
            } else {
                t(0, h8, false);
            }
        }
        return z9;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z8) {
        VelocityTracker velocityTracker;
        if (z8 && (velocityTracker = this.f1068k) != null) {
            velocityTracker.recycle();
            this.f1068k = null;
        }
        super.requestDisallowInterceptTouchEvent(z8);
    }

    public final void requestLayout() {
        this.f1064g = true;
        super.requestLayout();
    }

    public final boolean s(int i8, int i9, int i10) {
        boolean z8;
        int i11 = i8;
        int i12 = i9;
        int i13 = i10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i14 = height + scrollY;
        boolean z9 = i11 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z10 = false;
        for (int i15 = 0; i15 < size; i15++) {
            View view2 = focusables.get(i15);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i12 < bottom && top < i13) {
                boolean z11 = i12 < top && bottom < i13;
                if (view == null) {
                    view = view2;
                    z10 = z11;
                } else {
                    boolean z12 = (z9 && top < view.getTop()) || (!z9 && bottom > view.getBottom());
                    if (z10) {
                        if (z11) {
                            if (!z12) {
                            }
                        }
                    } else if (z11) {
                        view = view2;
                        z10 = true;
                    } else if (!z12) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i12 < scrollY || i13 > i14) {
            i(z9 ? i12 - scrollY : i13 - i14);
            z8 = true;
        } else {
            z8 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i11);
        }
        return z8;
    }

    public final void scrollTo(int i8, int i9) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i8 < 0) {
                i8 = 0;
            } else if (width + i8 > width2) {
                i8 = width2 - width;
            }
            if (height >= height2 || i9 < 0) {
                i9 = 0;
            } else if (height + i9 > height2) {
                i9 = height2 - height;
            }
            if (i8 != getScrollX() || i9 != getScrollY()) {
                super.scrollTo(i8, i9);
            }
        }
    }

    public void setFillViewport(boolean z8) {
        if (z8 != this.f1069l) {
            this.f1069l = z8;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z8) {
        l lVar = this.f1079x;
        if (lVar.f4951d) {
            int[] iArr = x.f4957a;
            x.h.z(lVar.f4950c);
        }
        lVar.f4951d = z8;
    }

    public void setOnScrollChangeListener(c cVar) {
    }

    public void setSmoothScrollingEnabled(boolean z8) {
        this.f1070m = z8;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int i8) {
        return u(i8, 0);
    }

    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i8, int i9, boolean z8) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1059a > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f1061c;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i9 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
                if (z8) {
                    u(2, 1);
                } else {
                    w(1);
                }
                this.f1077u = getScrollY();
                int[] iArr = x.f4957a;
                x.c.k(this);
            } else {
                if (!this.f1061c.isFinished()) {
                    this.f1061c.abortAnimation();
                    w(1);
                }
                scrollBy(i8, i9);
            }
            this.f1059a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final boolean u(int i8, int i9) {
        return this.f1079x.g(i8, i9);
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z8;
        EdgeEffect edgeEffect = this.f1062d;
        if (n0.d.a(edgeEffect) != 0.0f) {
            n0.d.b(edgeEffect, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z8 = true;
        } else {
            z8 = false;
        }
        EdgeEffect edgeEffect2 = this.e;
        if (n0.d.a(edgeEffect2) == 0.0f) {
            return z8;
        }
        n0.d.b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    public final void w(int i8) {
        this.f1079x.h(i8);
    }
}
