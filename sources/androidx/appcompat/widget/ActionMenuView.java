package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.c;

public class ActionMenuView extends a0 implements d.b, h {

    /* renamed from: p  reason: collision with root package name */
    public androidx.appcompat.view.menu.d f516p;

    /* renamed from: q  reason: collision with root package name */
    public Context f517q;
    public int r;

    /* renamed from: s  reason: collision with root package name */
    public c f518s;

    /* renamed from: t  reason: collision with root package name */
    public g.a f519t;

    /* renamed from: u  reason: collision with root package name */
    public d.a f520u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f521v;
    public int w;

    /* renamed from: x  reason: collision with root package name */
    public final int f522x;
    public final int y;

    /* renamed from: z  reason: collision with root package name */
    public e f523z;

    public interface a {
        boolean a();

        boolean c();
    }

    public static class b implements g.a {
        public final void a(androidx.appcompat.view.menu.d dVar, boolean z8) {
        }

        public final boolean b(androidx.appcompat.view.menu.d dVar) {
            return false;
        }
    }

    public static class c extends a0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f524a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f525b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f526c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f527d;
        @ViewDebug.ExportedProperty
        public boolean e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f528f;

        public c() {
            super(-2, -2);
            this.f524a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f524a = cVar.f524a;
        }
    }

    public class d implements d.a {
        public d() {
        }

        public final boolean a(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.f523z;
            if (eVar == null) {
                return false;
            }
            Toolbar.this.getClass();
            return false;
        }

        public final void b(androidx.appcompat.view.menu.d dVar) {
            d.a aVar = ActionMenuView.this.f520u;
            if (aVar != null) {
                aVar.b(dVar);
            }
        }
    }

    public interface e {
    }

    public ActionMenuView() {
        throw null;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f9 = context.getResources().getDisplayMetrics().density;
        this.f522x = (int) (56.0f * f9);
        this.y = (int) (f9 * 4.0f);
        this.f517q = context;
        this.r = 0;
    }

    public static c i(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
            if (cVar.gravity <= 0) {
                cVar.gravity = 16;
            }
            return cVar;
        }
        c cVar2 = new c();
        cVar2.gravity = 16;
        return cVar2;
    }

    public final boolean a(androidx.appcompat.view.menu.e eVar) {
        return this.f516p.p(eVar, (g) null, 0);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final a0.a e() {
        c cVar = new c();
        cVar.gravity = 16;
        return cVar;
    }

    public final a0.a f(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public final /* bridge */ /* synthetic */ a0.a g(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c();
        cVar.gravity = 16;
        return cVar;
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f516p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.d dVar = new androidx.appcompat.view.menu.d(context);
            this.f516p = dVar;
            dVar.e = new d();
            c cVar = new c(context);
            this.f518s = cVar;
            cVar.f654k = true;
            cVar.f655l = true;
            g.a aVar = this.f519t;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.e = aVar;
            this.f516p.b(cVar, this.f517q);
            c cVar2 = this.f518s;
            cVar2.f361g = this;
            this.f516p = cVar2.f358c;
        }
        return this.f516p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        c cVar = this.f518s;
        c.d dVar = cVar.f651h;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.f653j) {
            return cVar.f652i;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i8) {
        boolean z8 = false;
        if (i8 == 0) {
            return false;
        }
        View childAt = getChildAt(i8 - 1);
        View childAt2 = getChildAt(i8);
        if (i8 < getChildCount() && (childAt instanceof a)) {
            z8 = false | ((a) childAt).a();
        }
        return (i8 <= 0 || !(childAt2 instanceof a)) ? z8 : z8 | ((a) childAt2).c();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c cVar = this.f518s;
        if (cVar != null) {
            cVar.e();
            if (this.f518s.i()) {
                this.f518s.f();
                this.f518s.l();
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f518s;
        if (cVar != null) {
            cVar.f();
            c.a aVar = cVar.f661s;
            if (aVar != null && aVar.b()) {
                aVar.f449j.dismiss();
            }
        }
    }

    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        if (!this.f521v) {
            super.onLayout(z8, i8, i9, i10, i11);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i11 - i9) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i10 - i8;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean a9 = s0.a(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f524a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a9) {
                        i12 = getPaddingLeft() + cVar.leftMargin;
                        i13 = i12 + measuredWidth;
                    } else {
                        i13 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i12 = i13 - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(i12, i19, i13, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    j(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int max = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (a9) {
            int width = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f524a) {
                    int i24 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width = i24 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f524a) {
                int i27 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft = i27 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    public final void onMeasure(int i8, int i9) {
        int i10;
        boolean z8;
        boolean z9;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        androidx.appcompat.view.menu.d dVar;
        boolean z11 = this.f521v;
        boolean z12 = View.MeasureSpec.getMode(i8) == 1073741824;
        this.f521v = z12;
        if (z11 != z12) {
            this.w = 0;
        }
        int size = View.MeasureSpec.getSize(i8);
        if (!(!this.f521v || (dVar = this.f516p) == null || size == this.w)) {
            this.w = size;
            dVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.f521v || childCount <= 0) {
            int i16 = i9;
            for (int i17 = 0; i17 < childCount; i17++) {
                c cVar = (c) getChildAt(i17).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i8, i9);
            return;
        }
        int mode = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i8);
        int size3 = View.MeasureSpec.getSize(i9);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, paddingTop, -2);
        int i18 = size2 - paddingLeft;
        int i19 = this.f522x;
        int i20 = i18 / i19;
        int i21 = i18 % i19;
        if (i20 == 0) {
            setMeasuredDimension(i18, 0);
            return;
        }
        int i22 = i19 + (i21 / i20);
        int childCount2 = getChildCount();
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        boolean z13 = false;
        int i27 = 0;
        long j8 = 0;
        while (true) {
            i10 = this.y;
            if (i26 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i26);
            int i28 = size3;
            int i29 = i18;
            if (childAt.getVisibility() == 8) {
                i13 = mode;
                i14 = paddingTop;
            } else {
                boolean z14 = childAt instanceof ActionMenuItemView;
                int i30 = i24 + 1;
                if (z14) {
                    childAt.setPadding(i10, 0, i10, 0);
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f528f = false;
                cVar2.f526c = 0;
                cVar2.f525b = 0;
                cVar2.f527d = false;
                cVar2.leftMargin = 0;
                cVar2.rightMargin = 0;
                cVar2.e = z14 && ((ActionMenuItemView) childAt).d();
                int i31 = cVar2.f524a ? 1 : i20;
                int i32 = i30;
                c cVar3 = (c) childAt.getLayoutParams();
                i13 = mode;
                i14 = paddingTop;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingTop, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z14 ? (ActionMenuItemView) childAt : null;
                boolean z15 = actionMenuItemView != null && actionMenuItemView.d();
                if (i31 <= 0 || (z15 && i31 < 2)) {
                    i15 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i31 * i22, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i15 = measuredWidth / i22;
                    if (measuredWidth % i22 != 0) {
                        i15++;
                    }
                    if (z15 && i15 < 2) {
                        i15 = 2;
                    }
                }
                cVar3.f527d = !cVar3.f524a && z15;
                cVar3.f525b = i15;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i22 * i15, 1073741824), makeMeasureSpec);
                i25 = Math.max(i25, i15);
                if (cVar2.f527d) {
                    i27++;
                }
                if (cVar2.f524a) {
                    z13 = true;
                }
                i20 -= i15;
                i23 = Math.max(i23, childAt.getMeasuredHeight());
                if (i15 == 1) {
                    j8 |= (long) (1 << i26);
                }
                i24 = i32;
            }
            i26++;
            size3 = i28;
            i18 = i29;
            paddingTop = i14;
            mode = i13;
        }
        int i33 = mode;
        int i34 = i18;
        int i35 = size3;
        boolean z16 = z13 && i24 == 2;
        boolean z17 = false;
        while (true) {
            if (i27 <= 0 || i20 <= 0) {
                z8 = z17;
            } else {
                int i36 = Integer.MAX_VALUE;
                int i37 = 0;
                int i38 = 0;
                long j9 = 0;
                while (i38 < childCount2) {
                    c cVar4 = (c) getChildAt(i38).getLayoutParams();
                    boolean z18 = z17;
                    if (cVar4.f527d) {
                        int i39 = cVar4.f525b;
                        if (i39 < i36) {
                            j9 = 1 << i38;
                            i36 = i39;
                            i37 = 1;
                        } else if (i39 == i36) {
                            j9 |= 1 << i38;
                            i37++;
                        }
                    }
                    i38++;
                    z17 = z18;
                }
                z8 = z17;
                j8 |= j9;
                if (i37 > i20) {
                    break;
                }
                int i40 = i36 + 1;
                int i41 = 0;
                while (i41 < childCount2) {
                    View childAt2 = getChildAt(i41);
                    c cVar5 = (c) childAt2.getLayoutParams();
                    int i42 = i23;
                    int i43 = i25;
                    long j10 = (long) (1 << i41);
                    if ((j9 & j10) != 0) {
                        if (!z16 || !cVar5.e) {
                            z10 = true;
                        } else {
                            z10 = true;
                            if (i20 == 1) {
                                childAt2.setPadding(i10 + i22, 0, i10, 0);
                            }
                        }
                        cVar5.f525b += z10 ? 1 : 0;
                        cVar5.f528f = z10;
                        i20--;
                    } else if (cVar5.f525b == i40) {
                        j8 |= j10;
                    }
                    i41++;
                    i23 = i42;
                    i25 = i43;
                }
                z17 = true;
            }
        }
        z8 = z17;
        int i44 = i23;
        int i45 = i25;
        boolean z19 = !z13 && i24 == 1;
        if (i20 <= 0 || j8 == 0 || (i20 >= i24 - 1 && !z19 && i45 <= 1)) {
            z9 = z8;
        } else {
            float bitCount = (float) Long.bitCount(j8);
            if (!z19) {
                if ((j8 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i46 = childCount2 - 1;
                if ((j8 & ((long) (1 << i46))) != 0 && !((c) getChildAt(i46).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i47 = bitCount > 0.0f ? (int) (((float) (i20 * i22)) / bitCount) : 0;
            boolean z20 = z8;
            for (int i48 = 0; i48 < childCount2; i48++) {
                if ((j8 & ((long) (1 << i48))) != 0) {
                    View childAt3 = getChildAt(i48);
                    c cVar6 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar6.f526c = i47;
                        cVar6.f528f = true;
                        if (i48 == 0 && !cVar6.e) {
                            cVar6.leftMargin = (-i47) / 2;
                        }
                        z20 = true;
                    } else {
                        if (cVar6.f524a) {
                            cVar6.f526c = i47;
                            cVar6.f528f = true;
                            cVar6.rightMargin = (-i47) / 2;
                            z20 = true;
                        } else {
                            if (i48 != 0) {
                                cVar6.leftMargin = i47 / 2;
                            }
                            if (i48 != childCount2 - 1) {
                                cVar6.rightMargin = i47 / 2;
                            }
                        }
                    }
                }
            }
            z9 = z20;
        }
        if (z9) {
            for (int i49 = 0; i49 < childCount2; i49++) {
                View childAt4 = getChildAt(i49);
                c cVar7 = (c) childAt4.getLayoutParams();
                if (cVar7.f528f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar7.f525b * i22) + cVar7.f526c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (i33 != 1073741824) {
            i12 = i34;
            i11 = i44;
        } else {
            i11 = i35;
            i12 = i34;
        }
        setMeasuredDimension(i12, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z8) {
        this.f518s.f659p = z8;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f523z = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        c cVar = this.f518s;
        c.d dVar = cVar.f651h;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.f653j = true;
        cVar.f652i = drawable;
    }

    public void setOverflowReserved(boolean z8) {
    }

    public void setPopupTheme(int i8) {
        if (this.r != i8) {
            this.r = i8;
            if (i8 == 0) {
                this.f517q = getContext();
            } else {
                this.f517q = new ContextThemeWrapper(getContext(), i8);
            }
        }
    }

    public void setPresenter(c cVar) {
        this.f518s = cVar;
        cVar.f361g = this;
        this.f516p = cVar.f358c;
    }
}
