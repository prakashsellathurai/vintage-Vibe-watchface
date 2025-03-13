package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.health.services.client.R;
import j0.d0;
import j0.m;
import j0.n;
import j0.o;
import j0.x;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements u, m, n {
    public static final int[] A = {R.attr.actionBarSize, 16842841};

    /* renamed from: a  reason: collision with root package name */
    public int f491a;

    /* renamed from: b  reason: collision with root package name */
    public int f492b = 0;

    /* renamed from: c  reason: collision with root package name */
    public ContentFrameLayout f493c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f494d;
    public v e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f495f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f496g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f497h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f498i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f499j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f500k;

    /* renamed from: l  reason: collision with root package name */
    public int f501l;

    /* renamed from: m  reason: collision with root package name */
    public int f502m;

    /* renamed from: n  reason: collision with root package name */
    public final Rect f503n = new Rect();

    /* renamed from: o  reason: collision with root package name */
    public final Rect f504o = new Rect();

    /* renamed from: p  reason: collision with root package name */
    public final Rect f505p = new Rect();

    /* renamed from: q  reason: collision with root package name */
    public d0 f506q;
    public d0 r;

    /* renamed from: s  reason: collision with root package name */
    public d0 f507s;

    /* renamed from: t  reason: collision with root package name */
    public d0 f508t;

    /* renamed from: u  reason: collision with root package name */
    public OverScroller f509u;

    /* renamed from: v  reason: collision with root package name */
    public ViewPropertyAnimator f510v;
    public final AnimatorListenerAdapter w;

    /* renamed from: x  reason: collision with root package name */
    public final Runnable f511x;
    public final Runnable y;

    /* renamed from: z  reason: collision with root package name */
    public final o f512z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f510v = null;
            actionBarOverlayLayout.f500k = false;
        }

        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f510v = null;
            actionBarOverlayLayout.f500k = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.i();
            actionBarOverlayLayout.f510v = actionBarOverlayLayout.f494d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.w);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.i();
            actionBarOverlayLayout.f510v = actionBarOverlayLayout.f494d.animate().translationY((float) (-actionBarOverlayLayout.f494d.getHeight())).setListener(actionBarOverlayLayout.w);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e() {
            super(-1, -1);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        d0 d0Var = d0.f4932b;
        this.f506q = d0Var;
        this.r = d0Var;
        this.f507s = d0Var;
        this.f508t = d0Var;
        this.w = new a();
        this.f511x = new b();
        this.y = new c();
        j(context);
        this.f512z = new o();
    }

    public static boolean h(FrameLayout frameLayout, Rect rect, boolean z8) {
        boolean z9;
        int i8;
        e eVar = (e) frameLayout.getLayoutParams();
        int i9 = eVar.leftMargin;
        int i10 = rect.left;
        if (i9 != i10) {
            eVar.leftMargin = i10;
            z9 = true;
        } else {
            z9 = false;
        }
        int i11 = eVar.topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            eVar.topMargin = i12;
            z9 = true;
        }
        int i13 = eVar.rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            eVar.rightMargin = i14;
            z9 = true;
        }
        if (!z8 || eVar.bottomMargin == (i8 = rect.bottom)) {
            return z9;
        }
        eVar.bottomMargin = i8;
        return true;
    }

    public final void a(View view, View view2, int i8, int i9) {
        if (i9 == 0) {
            onNestedScrollAccepted(view, view2, i8);
        }
    }

    public final void b(View view, int i8) {
        if (i8 == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void c(View view, int i8, int i9, int[] iArr, int i10) {
        if (i10 == 0) {
            onNestedPreScroll(view, i8, i9, iArr);
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public final void d() {
        k();
        this.e.a();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f495f != null && !this.f496g) {
            int bottom = this.f494d.getVisibility() == 0 ? (int) (((float) this.f494d.getBottom()) + this.f494d.getTranslationY() + 0.5f) : 0;
            this.f495f.setBounds(0, bottom, getWidth(), this.f495f.getIntrinsicHeight() + bottom);
            this.f495f.draw(canvas);
        }
    }

    public final void e(View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        f(view, i8, i9, i10, i11, i12);
    }

    public final void f(View view, int i8, int i9, int i10, int i11, int i12) {
        if (i12 == 0) {
            onNestedScroll(view, i8, i9, i10, i11);
        }
    }

    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final boolean g(View view, View view2, int i8, int i9) {
        return i9 == 0 && onStartNestedScroll(view, view2, i8);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f494d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        o oVar = this.f512z;
        return oVar.f4953b | oVar.f4952a;
    }

    public CharSequence getTitle() {
        k();
        return this.e.getTitle();
    }

    public final void i() {
        removeCallbacks(this.f511x);
        removeCallbacks(this.y);
        ViewPropertyAnimator viewPropertyAnimator = this.f510v;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void j(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(A);
        boolean z8 = false;
        this.f491a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f495f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z8 = true;
        }
        this.f496g = z8;
        this.f509u = new OverScroller(context);
    }

    public final void k() {
        v vVar;
        if (this.f493c == null) {
            this.f493c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f494d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof v) {
                vVar = (v) findViewById;
            } else if (findViewById instanceof Toolbar) {
                vVar = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.e = vVar;
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        d0 g9 = d0.g(windowInsets, this);
        boolean h8 = h(this.f494d, new Rect(g9.b(), g9.d(), g9.c(), g9.a()), false);
        int[] iArr = x.f4957a;
        Rect rect = this.f503n;
        x.h.b(this, g9, rect);
        int i8 = rect.left;
        int i9 = rect.top;
        int i10 = rect.right;
        int i11 = rect.bottom;
        d0.j jVar = g9.f4933a;
        d0 i12 = jVar.i(i8, i9, i10, i11);
        this.f506q = i12;
        boolean z8 = true;
        if (!this.r.equals(i12)) {
            this.r = this.f506q;
            h8 = true;
        }
        Rect rect2 = this.f504o;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z8 = h8;
        }
        if (z8) {
            requestLayout();
        }
        return jVar.a().f4933a.c().f4933a.b().f();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j(getContext());
        int[] iArr = x.f4957a;
        x.g.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }

    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = eVar.leftMargin + paddingLeft;
                int i14 = eVar.topMargin + paddingTop;
                childAt.layout(i13, i14, measuredWidth + i13, measuredHeight + i14);
            }
        }
    }

    public final void onMeasure(int i8, int i9) {
        int i10;
        d0 d0Var;
        k();
        measureChildWithMargins(this.f494d, i8, 0, i9, 0);
        e eVar = (e) this.f494d.getLayoutParams();
        int max = Math.max(0, this.f494d.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f494d.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f494d.getMeasuredState());
        int[] iArr = x.f4957a;
        boolean z8 = (x.c.g(this) & 256) != 0;
        if (z8) {
            i10 = this.f491a;
            if (this.f498i && this.f494d.getTabContainer() != null) {
                i10 += this.f491a;
            }
        } else {
            i10 = this.f494d.getVisibility() != 8 ? this.f494d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f503n;
        Rect rect2 = this.f505p;
        rect2.set(rect);
        d0 d0Var2 = this.f506q;
        this.f507s = d0Var2;
        if (this.f497h || z8) {
            c0.b a9 = c0.b.a(d0Var2.b(), this.f507s.d() + i10, this.f507s.c(), this.f507s.a() + 0);
            d0.c cVar = new d0.c(this.f507s);
            cVar.d(a9);
            d0Var = cVar.b();
        } else {
            rect2.top += i10;
            rect2.bottom += 0;
            d0Var = d0Var2.f4933a.i(0, i10, 0, 0);
        }
        this.f507s = d0Var;
        h(this.f493c, rect2, true);
        if (!this.f508t.equals(this.f507s)) {
            d0 d0Var3 = this.f507s;
            this.f508t = d0Var3;
            x.a(this.f493c, d0Var3);
        }
        measureChildWithMargins(this.f493c, i8, 0, i9, 0);
        e eVar2 = (e) this.f493c.getLayoutParams();
        int max3 = Math.max(max, this.f493c.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f493c.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f493c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i8, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i9, combineMeasuredStates2 << 16));
    }

    public final boolean onNestedFling(View view, float f9, float f10, boolean z8) {
        boolean z9 = false;
        if (!this.f499j || !z8) {
            return false;
        }
        this.f509u.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f509u.getFinalY() > this.f494d.getHeight()) {
            z9 = true;
        }
        if (z9) {
            i();
            ((c) this.y).run();
        } else {
            i();
            ((b) this.f511x).run();
        }
        this.f500k = true;
        return true;
    }

    public final boolean onNestedPreFling(View view, float f9, float f10) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i8, int i9, int[] iArr) {
    }

    public final void onNestedScroll(View view, int i8, int i9, int i10, int i11) {
        int i12 = this.f501l + i9;
        this.f501l = i12;
        setActionBarHideOffset(i12);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i8) {
        this.f512z.f4952a = i8;
        this.f501l = getActionBarHideOffset();
        i();
    }

    public final boolean onStartNestedScroll(View view, View view2, int i8) {
        if ((i8 & 2) == 0 || this.f494d.getVisibility() != 0) {
            return false;
        }
        return this.f499j;
    }

    public final void onStopNestedScroll(View view) {
        if (this.f499j && !this.f500k) {
            if (this.f501l <= this.f494d.getHeight()) {
                i();
                postDelayed(this.f511x, 600);
                return;
            }
            i();
            postDelayed(this.y, 600);
        }
    }

    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i8) {
        super.onWindowSystemUiVisibilityChanged(i8);
        k();
        this.f502m = i8;
    }

    public final void onWindowVisibilityChanged(int i8) {
        super.onWindowVisibilityChanged(i8);
        this.f492b = i8;
    }

    public void setActionBarHideOffset(int i8) {
        i();
        this.f494d.setTranslationY((float) (-Math.max(0, Math.min(i8, this.f494d.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z8) {
        this.f498i = z8;
    }

    public void setHideOnContentScrollEnabled(boolean z8) {
        if (z8 != this.f499j) {
            this.f499j = z8;
            if (!z8) {
                i();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i8) {
        k();
        this.e.setIcon(i8);
    }

    public void setIcon(Drawable drawable) {
        k();
        this.e.setIcon(drawable);
    }

    public void setLogo(int i8) {
        k();
        this.e.d(i8);
    }

    public void setOverlayMode(boolean z8) {
        this.f497h = z8;
        this.f496g = z8 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z8) {
    }

    public void setUiOptions(int i8) {
    }

    public void setWindowCallback(Window.Callback callback) {
        k();
        this.e.c(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        k();
        this.e.b(charSequence);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
