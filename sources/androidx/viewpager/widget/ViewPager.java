package androidx.viewpager.widget;

import a0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import j0.x;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

public class ViewPager extends ViewGroup {
    public static final int[] I = {16842931};
    public static final Interpolator J = new a();
    public boolean A = true;
    public boolean B;
    public int C;
    public ArrayList D;
    public h E;
    public ArrayList F;
    public final Runnable G = new b();
    public int H = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<d> f1931a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final d f1932b = new d();

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1933c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f1934d = null;
    public Scroller e;

    /* renamed from: f  reason: collision with root package name */
    public int f1935f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1936g;

    /* renamed from: h  reason: collision with root package name */
    public float f1937h = -3.4028235E38f;

    /* renamed from: i  reason: collision with root package name */
    public float f1938i = Float.MAX_VALUE;

    /* renamed from: j  reason: collision with root package name */
    public int f1939j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1940k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1941l;

    /* renamed from: m  reason: collision with root package name */
    public int f1942m = 1;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1943n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1944o;

    /* renamed from: p  reason: collision with root package name */
    public int f1945p;

    /* renamed from: q  reason: collision with root package name */
    public int f1946q;
    public int r;

    /* renamed from: s  reason: collision with root package name */
    public float f1947s;

    /* renamed from: t  reason: collision with root package name */
    public float f1948t;

    /* renamed from: u  reason: collision with root package name */
    public float f1949u;

    /* renamed from: v  reason: collision with root package name */
    public int f1950v = -1;
    public VelocityTracker w;

    /* renamed from: x  reason: collision with root package name */
    public int f1951x;
    public EdgeEffect y;

    /* renamed from: z  reason: collision with root package name */
    public EdgeEffect f1952z;

    public static class a implements Interpolator {
        public final float getInterpolation(float f9) {
            float f10 = f9 - 1.0f;
            return (f10 * f10 * f10 * f10 * f10) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            ViewPager.this.setScrollState(0);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f1954a;

        /* renamed from: b  reason: collision with root package name */
        public float f1955b;
    }

    public static class e extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1956a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1957b;

        public e() {
            super(-1, -1);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.I);
            this.f1957b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public class f extends j0.a {
        public f() {
        }

        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            viewPager.getClass();
            accessibilityEvent.setScrollable(false);
            if (accessibilityEvent.getEventType() == 4096) {
                viewPager.getClass();
            }
        }

        public final void d(View view, k0.c cVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f4917a;
            AccessibilityNodeInfo accessibilityNodeInfo = cVar.f5085a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            cVar.f("androidx.viewpager.widget.ViewPager");
            ViewPager viewPager = ViewPager.this;
            viewPager.getClass();
            accessibilityNodeInfo.setScrollable(false);
            if (viewPager.canScrollHorizontally(1)) {
                cVar.a(4096);
            }
            if (viewPager.canScrollHorizontally(-1)) {
                cVar.a(8192);
            }
        }

        public final boolean g(View view, int i8, Bundle bundle) {
            int i9;
            if (super.g(view, i8, bundle)) {
                return true;
            }
            ViewPager viewPager = ViewPager.this;
            if (i8 != 4096) {
                if (i8 != 8192 || !viewPager.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager.getClass();
                i9 = 0 - 1;
            } else if (!viewPager.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager.getClass();
                i9 = 0 + 1;
            }
            viewPager.setCurrentItem(i9);
            return true;
        }
    }

    public interface g {
        void a(ViewPager viewPager);
    }

    public interface h {
        void a(int i8);

        void b(float f9, int i8);
    }

    public static class i extends p0.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public int f1959h;

        /* renamed from: i  reason: collision with root package name */
        public Parcelable f1960i;

        public static class a implements Parcelable.ClassLoaderCreator<i> {
            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i8) {
                return new i[i8];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? i.class.getClassLoader() : classLoader;
            this.f1959h = parcel.readInt();
            this.f1960i = parcel.readParcelable(classLoader);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f1959h + "}";
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f6241f, i8);
            parcel.writeInt(this.f1959h);
            parcel.writeParcelable(this.f1960i, i8);
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.e = new Scroller(context2, J);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f9 = context2.getResources().getDisplayMetrics().density;
        this.r = viewConfiguration.getScaledPagingTouchSlop();
        viewConfiguration.getScaledMaximumFlingVelocity();
        this.y = new EdgeEffect(context2);
        this.f1952z = new EdgeEffect(context2);
        this.f1951x = (int) (2.0f * f9);
        this.f1945p = (int) (f9 * 16.0f);
        x.i(this, new f());
        if (x.c.c(this) == 0) {
            x.c.s(this, 1);
        }
        x.h.u(this, new h1.b(this));
    }

    public static boolean b(int i8, int i9, int i10, View view, boolean z8) {
        int i11;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i12 = i9 + scrollX;
                if (i12 >= childAt.getLeft() && i12 < childAt.getRight() && (i11 = i10 + scrollY) >= childAt.getTop() && i11 < childAt.getBottom() && b(i8, i12 - childAt.getLeft(), i11 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z8 && view.canScrollHorizontally(-i8);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z8) {
        if (this.f1941l != z8) {
            this.f1941l = z8;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0084, code lost:
        if (r4 >= r1) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        if (r4 <= r1) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.findFocus()
            r1 = 1
            r2 = 0
            if (r0 != r5) goto L_0x0009
            goto L_0x0063
        L_0x0009:
            if (r0 == 0) goto L_0x0064
            android.view.ViewParent r3 = r0.getParent()
        L_0x000f:
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x001c
            if (r3 != r5) goto L_0x0017
            r3 = r1
            goto L_0x001d
        L_0x0017:
            android.view.ViewParent r3 = r3.getParent()
            goto L_0x000f
        L_0x001c:
            r3 = r2
        L_0x001d:
            if (r3 != 0) goto L_0x0064
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0033:
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x004c
            java.lang.String r4 = " => "
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0033
        L_0x004c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "ViewPager"
            android.util.Log.e(r3, r0)
        L_0x0063:
            r0 = 0
        L_0x0064:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r5, r0, r6)
            r4 = 17
            if (r3 == 0) goto L_0x00a0
            if (r3 == r0) goto L_0x00a0
            android.graphics.Rect r1 = r5.f1933c
            if (r6 != r4) goto L_0x0087
            android.graphics.Rect r4 = r5.d(r3, r1)
            int r4 = r4.left
            android.graphics.Rect r1 = r5.d(r0, r1)
            int r1 = r1.left
            if (r0 == 0) goto L_0x009c
            if (r4 < r1) goto L_0x009c
            goto L_0x00a0
        L_0x0087:
            r4 = 66
            if (r6 != r4) goto L_0x00a0
            android.graphics.Rect r4 = r5.d(r3, r1)
            int r4 = r4.left
            android.graphics.Rect r1 = r5.d(r0, r1)
            int r1 = r1.left
            if (r0 == 0) goto L_0x009c
            if (r4 > r1) goto L_0x009c
            goto L_0x00a0
        L_0x009c:
            boolean r2 = r3.requestFocus()
        L_0x00a0:
            if (r2 == 0) goto L_0x00a9
            int r6 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r6)
        L_0x00a9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.a(int):boolean");
    }

    public final void addFocusables(ArrayList<View> arrayList, int i8, int i9) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                if (getChildAt(i10).getVisibility() == 0) {
                    e();
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i9 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public final void addTouchables(ArrayList<View> arrayList) {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if (getChildAt(i8).getVisibility() == 0) {
                e();
            }
        }
    }

    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        e eVar = (e) layoutParams;
        boolean z8 = eVar.f1956a | (view.getClass().getAnnotation(c.class) != null);
        eVar.f1956a = z8;
        if (!this.f1940k) {
            super.addView(view, i8, layoutParams);
        } else if (!z8) {
            addViewInLayout(view, i8, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public final void c(boolean z8) {
        int i8 = 0;
        boolean z9 = this.H == 2;
        if (z9) {
            setScrollingCacheEnabled(false);
            if (!this.e.isFinished()) {
                this.e.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.e.getCurrX();
                int currY = this.e.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        h(currX);
                    }
                }
            }
        }
        while (true) {
            ArrayList<d> arrayList = this.f1931a;
            if (i8 >= arrayList.size()) {
                break;
            }
            arrayList.get(i8).getClass();
            i8++;
        }
        if (z9) {
            Runnable runnable = this.G;
            if (z8) {
                int[] iArr = x.f4957a;
                x.c.m(this, runnable);
                return;
            }
            ((b) runnable).run();
        }
    }

    public final boolean canScrollHorizontally(int i8) {
        return false;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        if (this.e.isFinished() || !this.e.computeScrollOffset()) {
            c(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.e.getCurrX();
        int currY = this.e.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!h(currX)) {
                this.e.abortAnimation();
                scrollTo(0, currY);
            }
        }
        int[] iArr = x.f4957a;
        x.c.k(this);
    }

    public final Rect d(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        int bottom = view.getBottom();
        while (true) {
            rect.bottom = bottom;
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || parent == this) {
                return rect;
            }
            view = (ViewGroup) parent;
            rect.left += view.getLeft();
            rect.right += view.getRight();
            rect.top += view.getTop();
            bottom = rect.bottom + view.getBottom();
        }
        return rect;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L_0x0053
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x004e
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L_0x0040
            r3 = 22
            if (r0 == r3) goto L_0x0036
            r3 = 61
            if (r0 == r3) goto L_0x0020
            goto L_0x004e
        L_0x0020:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L_0x002b
            boolean r5 = r5.a(r4)
            goto L_0x004f
        L_0x002b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L_0x004e
            boolean r5 = r5.a(r1)
            goto L_0x004f
        L_0x0036:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x003d
            goto L_0x004e
        L_0x003d:
            r6 = 66
            goto L_0x0049
        L_0x0040:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0047
            goto L_0x004e
        L_0x0047:
            r6 = 17
        L_0x0049:
            boolean r5 = r5.a(r6)
            goto L_0x004f
        L_0x004e:
            r5 = r2
        L_0x004f:
            if (r5 == 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r1 = r2
        L_0x0053:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            if (getChildAt(i8).getVisibility() == 0) {
                e();
            }
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z8 = false;
        if (getOverScrollMode() != 0) {
            this.y.finish();
            this.f1952z.finish();
        } else {
            if (!this.y.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f1937h * ((float) width));
                this.y.setSize(height, width);
                z8 = false | this.y.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f1952z.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f1938i + 1.0f)) * ((float) width2));
                this.f1952z.setSize(height2, width2);
                z8 |= this.f1952z.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z8) {
            int[] iArr = x.f4957a;
            x.c.k(this);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1936g;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public final void e() {
        ArrayList<d> arrayList = this.f1931a;
        if (arrayList.size() > 0) {
            arrayList.get(0).getClass();
            throw null;
        }
    }

    public final d f(int i8) {
        int i9 = 0;
        while (true) {
            ArrayList<d> arrayList = this.f1931a;
            if (i9 >= arrayList.size()) {
                return null;
            }
            d dVar = arrayList.get(i9);
            if (dVar.f1954a == i8) {
                return dVar;
            }
            i9++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(float r12, int r13, int r14) {
        /*
            r11 = this;
            int r14 = r11.C
            r0 = 0
            r1 = 1
            if (r14 <= 0) goto L_0x006b
            int r14 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = r0
        L_0x001b:
            if (r6 >= r5) goto L_0x006b
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.ViewPager$e r8 = (androidx.viewpager.widget.ViewPager.e) r8
            boolean r9 = r8.f1956a
            if (r9 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r8 = r8.f1957b
            r8 = r8 & 7
            if (r8 == r1) goto L_0x004d
            r9 = 3
            if (r8 == r9) goto L_0x0047
            r9 = 5
            if (r8 == r9) goto L_0x003a
            r8 = r2
            goto L_0x005c
        L_0x003a:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
            goto L_0x0059
        L_0x0047:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L_0x005c
        L_0x004d:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
        L_0x0059:
            r10 = r8
            r8 = r2
            r2 = r10
        L_0x005c:
            int r2 = r2 + r14
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L_0x0067
            r7.offsetLeftAndRight(r2)
        L_0x0067:
            r2 = r8
        L_0x0068:
            int r6 = r6 + 1
            goto L_0x001b
        L_0x006b:
            androidx.viewpager.widget.ViewPager$h r14 = r11.E
            if (r14 == 0) goto L_0x0072
            r14.b(r12, r13)
        L_0x0072:
            java.util.ArrayList r14 = r11.D
            if (r14 == 0) goto L_0x008c
            int r14 = r14.size()
        L_0x007a:
            if (r0 >= r14) goto L_0x008c
            java.util.ArrayList r2 = r11.D
            java.lang.Object r2 = r2.get(r0)
            androidx.viewpager.widget.ViewPager$h r2 = (androidx.viewpager.widget.ViewPager.h) r2
            if (r2 == 0) goto L_0x0089
            r2.b(r12, r13)
        L_0x0089:
            int r0 = r0 + 1
            goto L_0x007a
        L_0x008c:
            r11.B = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.g(float, int, int):void");
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public h1.a getAdapter() {
        return null;
    }

    public final int getChildDrawingOrder(int i8, int i9) {
        throw null;
    }

    public int getCurrentItem() {
        return 0;
    }

    public int getOffscreenPageLimit() {
        return this.f1942m;
    }

    public int getPageMargin() {
        return this.f1935f;
    }

    public final boolean h(int i8) {
        d dVar;
        int i9;
        ArrayList<d> arrayList = this.f1931a;
        if (arrayList.size() != 0) {
            int clientWidth = getClientWidth();
            float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
            float f9 = clientWidth > 0 ? ((float) this.f1935f) / ((float) clientWidth) : 0.0f;
            int i10 = -1;
            boolean z8 = true;
            float f10 = 0.0f;
            int i11 = 0;
            d dVar2 = null;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                dVar = arrayList.get(i11);
                if (z8 || dVar.f1954a == (i9 = i10 + 1)) {
                    f10 = dVar.f1955b;
                    float f11 = 0.0f + f10 + f9;
                    if (!z8 && scrollX < f10) {
                        break;
                    } else if (scrollX < f11 || i11 == arrayList.size() - 1) {
                        dVar2 = dVar;
                    } else {
                        i10 = dVar.f1954a;
                        i11++;
                        z8 = false;
                        dVar2 = dVar;
                    }
                } else {
                    d dVar3 = this.f1932b;
                    dVar3.f1955b = f10 + 0.0f + f9;
                    dVar3.f1954a = i9;
                    throw null;
                }
            }
            dVar2 = dVar;
            int clientWidth2 = getClientWidth();
            int i12 = this.f1935f;
            int i13 = clientWidth2 + i12;
            float f12 = (float) clientWidth2;
            int i14 = dVar2.f1954a;
            float f13 = ((((float) i8) / f12) - dVar2.f1955b) / ((((float) i12) / f12) + 0.0f);
            this.B = false;
            g(f13, i14, (int) (((float) i13) * f13));
            if (this.B) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.A) {
            return false;
        } else {
            this.B = false;
            g(0.0f, 0, 0);
            if (this.B) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public final void i(int i8, int i9, int i10, int i11) {
        int i12;
        if (i9 <= 0 || this.f1931a.isEmpty()) {
            d f9 = f(0);
            i12 = (int) ((f9 != null ? Math.min(f9.f1955b, this.f1938i) : 0.0f) * ((float) ((i8 - getPaddingLeft()) - getPaddingRight())));
            if (i12 != getScrollX()) {
                c(false);
            } else {
                return;
            }
        } else if (!this.e.isFinished()) {
            this.e.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            i12 = (int) ((((float) getScrollX()) / ((float) (((i9 - getPaddingLeft()) - getPaddingRight()) + i11))) * ((float) (((i8 - getPaddingLeft()) - getPaddingRight()) + i10)));
        }
        scrollTo(i12, getScrollY());
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A = true;
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.G);
        Scroller scroller = this.e;
        if (scroller != null && !scroller.isFinished()) {
            this.e.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1935f > 0 && this.f1936g != null) {
            this.f1931a.size();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        int i8 = 0;
        if (action == 3 || action == 1) {
            this.f1950v = -1;
            this.f1943n = false;
            this.f1944o = false;
            VelocityTracker velocityTracker = this.w;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.w = null;
            }
            this.y.onRelease();
            this.f1952z.onRelease();
            if (!this.y.isFinished()) {
                this.f1952z.isFinished();
            }
            return false;
        }
        if (action != 0) {
            if (this.f1943n) {
                return true;
            }
            if (this.f1944o) {
                return false;
            }
        }
        if (action == 0) {
            float x8 = motionEvent.getX();
            this.f1948t = x8;
            this.f1947s = x8;
            this.f1949u = motionEvent.getY();
            this.f1950v = motionEvent.getPointerId(0);
            this.f1944o = false;
            this.e.computeScrollOffset();
            if (this.H != 2 || Math.abs(this.e.getFinalX() - this.e.getCurrX()) <= this.f1951x) {
                c(false);
                this.f1943n = false;
            } else {
                this.e.abortAnimation();
                this.f1943n = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i9 = this.f1950v;
            if (i9 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i9);
                float x9 = motionEvent.getX(findPointerIndex);
                float f9 = x9 - this.f1947s;
                float abs = Math.abs(f9);
                float y8 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y8 - this.f1949u);
                int i10 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
                if (i10 != 0) {
                    float f10 = this.f1947s;
                    if (!((f10 < ((float) this.f1946q) && i10 > 0) || (f10 > ((float) (getWidth() - this.f1946q)) && f9 < 0.0f)) && b((int) f9, (int) x9, (int) y8, this, false)) {
                        this.f1947s = x9;
                        this.f1944o = true;
                        return false;
                    }
                }
                float f11 = (float) this.r;
                if (abs > f11 && abs * 0.5f > abs2) {
                    this.f1943n = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f12 = this.f1948t;
                    float f13 = (float) this.r;
                    this.f1947s = i10 > 0 ? f12 + f13 : f12 - f13;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f11) {
                    this.f1944o = true;
                }
                if (this.f1943n) {
                    this.f1947s = x9;
                    getScrollX();
                    getClientWidth();
                    ArrayList<d> arrayList = this.f1931a;
                    int i11 = arrayList.get(0).f1954a;
                    int i12 = arrayList.get(arrayList.size() - 1).f1954a;
                    throw null;
                }
            }
        } else if (action == 6) {
            int actionIndex = motionEvent.getActionIndex();
            if (motionEvent.getPointerId(actionIndex) == this.f1950v) {
                if (actionIndex == 0) {
                    i8 = 1;
                }
                this.f1947s = motionEvent.getX(i8);
                this.f1950v = motionEvent.getPointerId(i8);
                VelocityTracker velocityTracker2 = this.w;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
        }
        if (this.w == null) {
            this.w = VelocityTracker.obtain();
        }
        this.w.addMovement(motionEvent);
        return this.f1943n;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r17.getChildCount()
            int r2 = r21 - r19
            int r3 = r22 - r20
            int r4 = r17.getPaddingLeft()
            int r5 = r17.getPaddingTop()
            int r6 = r17.getPaddingRight()
            int r7 = r17.getPaddingBottom()
            int r8 = r17.getScrollX()
            r9 = 0
            r10 = 0
        L_0x0020:
            r11 = 8
            if (r9 >= r1) goto L_0x00b5
            android.view.View r12 = r0.getChildAt(r9)
            int r13 = r12.getVisibility()
            if (r13 == r11) goto L_0x00b1
            android.view.ViewGroup$LayoutParams r11 = r12.getLayoutParams()
            androidx.viewpager.widget.ViewPager$e r11 = (androidx.viewpager.widget.ViewPager.e) r11
            boolean r13 = r11.f1956a
            if (r13 == 0) goto L_0x00b1
            int r11 = r11.f1957b
            r13 = r11 & 7
            r11 = r11 & 112(0x70, float:1.57E-43)
            r14 = 1
            if (r13 == r14) goto L_0x005c
            r14 = 3
            if (r13 == r14) goto L_0x0056
            r14 = 5
            if (r13 == r14) goto L_0x0049
            r13 = r4
            goto L_0x006d
        L_0x0049:
            int r13 = r2 - r6
            int r14 = r12.getMeasuredWidth()
            int r13 = r13 - r14
            int r14 = r12.getMeasuredWidth()
            int r6 = r6 + r14
            goto L_0x0068
        L_0x0056:
            int r13 = r12.getMeasuredWidth()
            int r13 = r13 + r4
            goto L_0x006d
        L_0x005c:
            int r13 = r12.getMeasuredWidth()
            int r13 = r2 - r13
            int r13 = r13 / 2
            int r13 = java.lang.Math.max(r13, r4)
        L_0x0068:
            r16 = r13
            r13 = r4
            r4 = r16
        L_0x006d:
            r14 = 16
            if (r11 == r14) goto L_0x008e
            r14 = 48
            if (r11 == r14) goto L_0x0088
            r14 = 80
            if (r11 == r14) goto L_0x007b
            r11 = r5
            goto L_0x009f
        L_0x007b:
            int r11 = r3 - r7
            int r14 = r12.getMeasuredHeight()
            int r11 = r11 - r14
            int r14 = r12.getMeasuredHeight()
            int r7 = r7 + r14
            goto L_0x009a
        L_0x0088:
            int r11 = r12.getMeasuredHeight()
            int r11 = r11 + r5
            goto L_0x009f
        L_0x008e:
            int r11 = r12.getMeasuredHeight()
            int r11 = r3 - r11
            int r11 = r11 / 2
            int r11 = java.lang.Math.max(r11, r5)
        L_0x009a:
            r16 = r11
            r11 = r5
            r5 = r16
        L_0x009f:
            int r4 = r4 + r8
            int r14 = r12.getMeasuredWidth()
            int r14 = r14 + r4
            int r15 = r12.getMeasuredHeight()
            int r15 = r15 + r5
            r12.layout(r4, r5, r14, r15)
            int r10 = r10 + 1
            r5 = r11
            r4 = r13
        L_0x00b1:
            int r9 = r9 + 1
            goto L_0x0020
        L_0x00b5:
            r2 = 0
        L_0x00b6:
            if (r2 >= r1) goto L_0x00d2
            android.view.View r3 = r0.getChildAt(r2)
            int r4 = r3.getVisibility()
            if (r4 == r11) goto L_0x00cf
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$e r3 = (androidx.viewpager.widget.ViewPager.e) r3
            boolean r3 = r3.f1956a
            if (r3 != 0) goto L_0x00cf
            r17.e()
        L_0x00cf:
            int r2 = r2 + 1
            goto L_0x00b6
        L_0x00d2:
            r0.C = r10
            boolean r1 = r0.A
            if (r1 == 0) goto L_0x0101
            r1 = 0
            androidx.viewpager.widget.ViewPager$d r1 = r0.f(r1)
            if (r1 == 0) goto L_0x00f5
            int r2 = r17.getClientWidth()
            float r2 = (float) r2
            float r3 = r0.f1937h
            float r1 = r1.f1955b
            float r4 = r0.f1938i
            float r1 = java.lang.Math.min(r1, r4)
            float r1 = java.lang.Math.max(r3, r1)
            float r2 = r2 * r1
            int r1 = (int) r2
            goto L_0x00f6
        L_0x00f5:
            r1 = 0
        L_0x00f6:
            r2 = 0
            r0.c(r2)
            r0.scrollTo(r1, r2)
            r0.h(r1)
            goto L_0x0102
        L_0x0101:
            r2 = 0
        L_0x0102:
            r0.A = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i8, int i9) {
        e eVar;
        e eVar2;
        int i10;
        setMeasuredDimension(View.getDefaultSize(0, i8), View.getDefaultSize(0, i9));
        int measuredWidth = getMeasuredWidth();
        this.f1946q = Math.min(measuredWidth / 10, this.f1945p);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i11 = 0;
        while (true) {
            int i12 = 1073741824;
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (!(childAt.getVisibility() == 8 || (eVar2 = (e) childAt.getLayoutParams()) == null || !eVar2.f1956a)) {
                int i13 = eVar2.f1957b;
                int i14 = i13 & 7;
                int i15 = i13 & 112;
                boolean z8 = true;
                boolean z9 = i15 == 48 || i15 == 80;
                if (!(i14 == 3 || i14 == 5)) {
                    z8 = false;
                }
                int i16 = Integer.MIN_VALUE;
                if (z9) {
                    i10 = 1073741824;
                } else {
                    i10 = Integer.MIN_VALUE;
                    if (z8) {
                        i16 = 1073741824;
                    }
                }
                int i17 = eVar2.width;
                if (i17 != -2) {
                    if (i17 == -1) {
                        i17 = paddingLeft;
                    }
                    i10 = 1073741824;
                } else {
                    i17 = paddingLeft;
                }
                int i18 = eVar2.height;
                if (i18 == -2) {
                    i18 = measuredHeight;
                    i12 = i16;
                } else if (i18 == -1) {
                    i18 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, i10), View.MeasureSpec.makeMeasureSpec(i18, i12));
                if (z9) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z8) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i11++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f1939j = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f1940k = false;
        int childCount2 = getChildCount();
        for (int i19 = 0; i19 < childCount2; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8 && ((eVar = (e) childAt2.getLayoutParams()) == null || !eVar.f1956a)) {
                eVar.getClass();
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * 0.0f), 1073741824), this.f1939j);
            }
        }
    }

    public final boolean onRequestFocusInDescendants(int i8, Rect rect) {
        int i9;
        int i10;
        int i11;
        int childCount = getChildCount();
        if ((i8 & 2) != 0) {
            i10 = 1;
            i11 = childCount;
            i9 = 0;
        } else {
            i9 = childCount - 1;
            i10 = -1;
            i11 = -1;
        }
        while (i9 != i11) {
            if (getChildAt(i9).getVisibility() == 0) {
                e();
            }
            i9 += i10;
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f6241f);
        this.f1934d = iVar.f1960i;
    }

    public final Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        iVar.f1959h = 0;
        return iVar;
    }

    public final void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        if (i8 != i10) {
            int i12 = this.f1935f;
            i(i8, i10, i12, i12);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    public final void removeView(View view) {
        if (this.f1940k) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(h1.a aVar) {
        ArrayList arrayList = this.F;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.F.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((g) this.F.get(i8)).a(this);
            }
        }
    }

    public void setCurrentItem(int i8) {
        setScrollingCacheEnabled(false);
    }

    public void setOffscreenPageLimit(int i8) {
        if (i8 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i8 + " too small; defaulting to 1");
            i8 = 1;
        }
        if (i8 != this.f1942m) {
            this.f1942m = i8;
        }
    }

    @Deprecated
    public void setOnPageChangeListener(h hVar) {
        this.E = hVar;
    }

    public void setPageMargin(int i8) {
        int i9 = this.f1935f;
        this.f1935f = i8;
        int width = getWidth();
        i(width, width, i8, i9);
        requestLayout();
    }

    public void setPageMarginDrawable(int i8) {
        Context context = getContext();
        Object obj = a0.a.f10a;
        setPageMarginDrawable(a.b.b(context, i8));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f1936g = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i8) {
        if (this.H != i8) {
            this.H = i8;
            h hVar = this.E;
            if (hVar != null) {
                hVar.a(i8);
            }
            ArrayList arrayList = this.D;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    h hVar2 = (h) this.D.get(i9);
                    if (hVar2 != null) {
                        hVar2.a(i8);
                    }
                }
            }
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1936g;
    }
}
