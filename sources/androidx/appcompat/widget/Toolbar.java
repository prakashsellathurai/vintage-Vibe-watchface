package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.health.services.client.R;
import f.a;
import j0.x;
import java.util.ArrayList;

public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList<View> D;
    public final ArrayList<View> E;
    public final int[] F;
    public final a G;
    public q0 H;
    public d I;
    public boolean J;
    public final Runnable K;

    /* renamed from: a  reason: collision with root package name */
    public ActionMenuView f596a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f597b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f598c;

    /* renamed from: d  reason: collision with root package name */
    public ImageButton f599d;
    public ImageView e;

    /* renamed from: f  reason: collision with root package name */
    public final Drawable f600f;

    /* renamed from: g  reason: collision with root package name */
    public final CharSequence f601g;

    /* renamed from: h  reason: collision with root package name */
    public ImageButton f602h;

    /* renamed from: i  reason: collision with root package name */
    public View f603i;

    /* renamed from: j  reason: collision with root package name */
    public Context f604j;

    /* renamed from: k  reason: collision with root package name */
    public int f605k;

    /* renamed from: l  reason: collision with root package name */
    public int f606l;

    /* renamed from: m  reason: collision with root package name */
    public int f607m;

    /* renamed from: n  reason: collision with root package name */
    public final int f608n;

    /* renamed from: o  reason: collision with root package name */
    public final int f609o;

    /* renamed from: p  reason: collision with root package name */
    public int f610p;

    /* renamed from: q  reason: collision with root package name */
    public int f611q;
    public int r;

    /* renamed from: s  reason: collision with root package name */
    public int f612s;

    /* renamed from: t  reason: collision with root package name */
    public h0 f613t;

    /* renamed from: u  reason: collision with root package name */
    public int f614u;

    /* renamed from: v  reason: collision with root package name */
    public int f615v;
    public final int w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f616x;
    public CharSequence y;

    /* renamed from: z  reason: collision with root package name */
    public ColorStateList f617z;

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            c cVar;
            ActionMenuView actionMenuView = Toolbar.this.f596a;
            if (actionMenuView != null && (cVar = actionMenuView.f518s) != null) {
                cVar.l();
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public final void onClick(View view) {
            d dVar = Toolbar.this.I;
            androidx.appcompat.view.menu.e eVar = dVar == null ? null : dVar.f622b;
            if (eVar != null) {
                eVar.collapseActionView();
            }
        }
    }

    public class d implements androidx.appcompat.view.menu.g {

        /* renamed from: a  reason: collision with root package name */
        public androidx.appcompat.view.menu.d f621a;

        /* renamed from: b  reason: collision with root package name */
        public androidx.appcompat.view.menu.e f622b;

        public d() {
        }

        public final void a(androidx.appcompat.view.menu.d dVar, boolean z8) {
        }

        public final boolean b(androidx.appcompat.view.menu.e eVar) {
            Toolbar toolbar = Toolbar.this;
            View view = toolbar.f603i;
            if (view instanceof j.a) {
                ((j.a) view).onActionViewCollapsed();
            }
            toolbar.removeView(toolbar.f603i);
            toolbar.removeView(toolbar.f602h);
            toolbar.f603i = null;
            ArrayList<View> arrayList = toolbar.E;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar.addView(arrayList.get(size));
                } else {
                    arrayList.clear();
                    this.f622b = null;
                    toolbar.requestLayout();
                    eVar.C = false;
                    eVar.f430n.o(false);
                    return true;
                }
            }
        }

        public final void d(Context context, androidx.appcompat.view.menu.d dVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.d dVar2 = this.f621a;
            if (!(dVar2 == null || (eVar = this.f622b) == null)) {
                dVar2.d(eVar);
            }
            this.f621a = dVar;
        }

        public final void e() {
            if (this.f622b != null) {
                androidx.appcompat.view.menu.d dVar = this.f621a;
                boolean z8 = false;
                if (dVar != null) {
                    int size = dVar.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size) {
                            break;
                        } else if (this.f621a.getItem(i8) == this.f622b) {
                            z8 = true;
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                if (!z8) {
                    b(this.f622b);
                }
            }
        }

        public final boolean g(j jVar) {
            return false;
        }

        public final boolean h() {
            return false;
        }

        public final boolean k(androidx.appcompat.view.menu.e eVar) {
            Toolbar toolbar = Toolbar.this;
            toolbar.c();
            ViewParent parent = toolbar.f602h.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f602h);
                }
                toolbar.addView(toolbar.f602h);
            }
            View actionView = eVar.getActionView();
            toolbar.f603i = actionView;
            this.f622b = eVar;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.f603i);
                }
                e eVar2 = new e();
                eVar2.f4297a = (toolbar.f608n & 112) | 8388611;
                eVar2.f624b = 2;
                toolbar.f603i.setLayoutParams(eVar2);
                toolbar.addView(toolbar.f603i);
            }
            int childCount = toolbar.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar.getChildAt(childCount);
                if (!(((e) childAt.getLayoutParams()).f624b == 2 || childAt == toolbar.f596a)) {
                    toolbar.removeViewAt(childCount);
                    toolbar.E.add(childAt);
                }
            }
            toolbar.requestLayout();
            eVar.C = true;
            eVar.f430n.o(false);
            View view = toolbar.f603i;
            if (view instanceof j.a) {
                ((j.a) view).onActionViewExpanded();
            }
            return true;
        }
    }

    public static class e extends a.C0053a {

        /* renamed from: b  reason: collision with root package name */
        public int f624b = 0;

        public e() {
            this.f4297a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(e eVar) {
            super((a.C0053a) eVar);
            this.f624b = eVar.f624b;
        }

        public e(a.C0053a aVar) {
            super(aVar);
        }
    }

    public interface f {
    }

    public static class g extends p0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public int f625h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f626i;

        public class a implements Parcelable.ClassLoaderCreator<g> {
            public final Object createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i8) {
                return new g[i8];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f625h = parcel.readInt();
            this.f626i = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f6241f, i8);
            parcel.writeInt(this.f625h);
            parcel.writeInt(this.f626i ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.w = 8388627;
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new int[2];
        this.G = new a();
        this.K = new b();
        Context context2 = getContext();
        int[] iArr = a1.a.G;
        o0 l8 = o0.l(context2, attributeSet, iArr, R.attr.toolbarStyle);
        TypedArray typedArray = l8.f782b;
        int[] iArr2 = x.f4957a;
        x.m.c(this, context, iArr, attributeSet, typedArray, R.attr.toolbarStyle, 0);
        this.f606l = l8.h(28, 0);
        this.f607m = l8.h(19, 0);
        TypedArray typedArray2 = l8.f782b;
        this.w = typedArray2.getInteger(0, 8388627);
        this.f608n = typedArray2.getInteger(2, 48);
        int c9 = l8.c(22, 0);
        c9 = l8.k(27) ? l8.c(27, c9) : c9;
        this.f612s = c9;
        this.r = c9;
        this.f611q = c9;
        this.f610p = c9;
        int c10 = l8.c(25, -1);
        if (c10 >= 0) {
            this.f610p = c10;
        }
        int c11 = l8.c(24, -1);
        if (c11 >= 0) {
            this.f611q = c11;
        }
        int c12 = l8.c(26, -1);
        if (c12 >= 0) {
            this.r = c12;
        }
        int c13 = l8.c(23, -1);
        if (c13 >= 0) {
            this.f612s = c13;
        }
        this.f609o = l8.d(13, -1);
        int c14 = l8.c(9, Integer.MIN_VALUE);
        int c15 = l8.c(5, Integer.MIN_VALUE);
        int d9 = l8.d(7, 0);
        int d10 = l8.d(8, 0);
        if (this.f613t == null) {
            this.f613t = new h0();
        }
        h0 h0Var = this.f613t;
        h0Var.f735h = false;
        if (d9 != Integer.MIN_VALUE) {
            h0Var.e = d9;
            h0Var.f729a = d9;
        }
        if (d10 != Integer.MIN_VALUE) {
            h0Var.f733f = d10;
            h0Var.f730b = d10;
        }
        if (!(c14 == Integer.MIN_VALUE && c15 == Integer.MIN_VALUE)) {
            h0Var.a(c14, c15);
        }
        this.f614u = l8.c(10, Integer.MIN_VALUE);
        this.f615v = l8.c(6, Integer.MIN_VALUE);
        this.f600f = l8.e(4);
        this.f601g = l8.j(3);
        CharSequence j8 = l8.j(21);
        if (!TextUtils.isEmpty(j8)) {
            setTitle(j8);
        }
        CharSequence j9 = l8.j(18);
        if (!TextUtils.isEmpty(j9)) {
            setSubtitle(j9);
        }
        this.f604j = getContext();
        setPopupTheme(l8.h(17, 0));
        Drawable e4 = l8.e(16);
        if (e4 != null) {
            setNavigationIcon(e4);
        }
        CharSequence j10 = l8.j(15);
        if (!TextUtils.isEmpty(j10)) {
            setNavigationContentDescription(j10);
        }
        Drawable e9 = l8.e(11);
        if (e9 != null) {
            setLogo(e9);
        }
        CharSequence j11 = l8.j(12);
        if (!TextUtils.isEmpty(j11)) {
            setLogoDescription(j11);
        }
        if (l8.k(29)) {
            setTitleTextColor(l8.b(29));
        }
        if (l8.k(20)) {
            setSubtitleTextColor(l8.b(20));
        }
        if (l8.k(14)) {
            k(l8.h(14, 0));
        }
        l8.m();
    }

    public static e g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0053a ? new e((a.C0053a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    private MenuInflater getMenuInflater() {
        return new j.c(getContext());
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return j0.g.c(marginLayoutParams) + j0.g.b(marginLayoutParams);
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i8, ArrayList arrayList) {
        int[] iArr = x.f4957a;
        boolean z8 = x.d.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i8, x.d.d(this));
        arrayList.clear();
        if (z8) {
            for (int i9 = childCount - 1; i9 >= 0; i9--) {
                View childAt = getChildAt(i9);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f624b == 0 && q(childAt)) {
                    int i10 = eVar.f4297a;
                    int[] iArr2 = x.f4957a;
                    int d9 = x.d.d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i10, d9) & 7;
                    if (!(absoluteGravity2 == 1 || absoluteGravity2 == 3 || absoluteGravity2 == 5)) {
                        absoluteGravity2 = d9 == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f624b == 0 && q(childAt2)) {
                int i12 = eVar2.f4297a;
                int[] iArr3 = x.f4957a;
                int d10 = x.d.d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i12, d10) & 7;
                if (!(absoluteGravity3 == 1 || absoluteGravity3 == 3 || absoluteGravity3 == 5)) {
                    absoluteGravity3 = d10 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z8) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e eVar = layoutParams == null ? new e() : !checkLayoutParams(layoutParams) ? g(layoutParams) : (e) layoutParams;
        eVar.f624b = 1;
        if (!z8 || this.f603i == null) {
            addView(view, eVar);
            return;
        }
        view.setLayoutParams(eVar);
        this.E.add(view);
    }

    public final void c() {
        if (this.f602h == null) {
            k kVar = new k(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            this.f602h = kVar;
            kVar.setImageDrawable(this.f600f);
            this.f602h.setContentDescription(this.f601g);
            e eVar = new e();
            eVar.f4297a = (this.f608n & 112) | 8388611;
            eVar.f624b = 2;
            this.f602h.setLayoutParams(eVar);
            this.f602h.setOnClickListener(new c());
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        e();
        ActionMenuView actionMenuView = this.f596a;
        if (actionMenuView.f516p == null) {
            androidx.appcompat.view.menu.d dVar = (androidx.appcompat.view.menu.d) actionMenuView.getMenu();
            if (this.I == null) {
                this.I = new d();
            }
            this.f596a.setExpandedActionViewsExclusive(true);
            dVar.b(this.I, this.f604j);
        }
    }

    public final void e() {
        if (this.f596a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.f596a = actionMenuView;
            actionMenuView.setPopupTheme(this.f605k);
            this.f596a.setOnMenuItemClickListener(this.G);
            ActionMenuView actionMenuView2 = this.f596a;
            actionMenuView2.f519t = null;
            actionMenuView2.f520u = null;
            e eVar = new e();
            eVar.f4297a = (this.f608n & 112) | 8388613;
            this.f596a.setLayoutParams(eVar);
            b(this.f596a, false);
        }
    }

    public final void f() {
        if (this.f599d == null) {
            this.f599d = new k(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            e eVar = new e();
            eVar.f4297a = (this.f608n & 112) | 8388611;
            this.f599d.setLayoutParams(eVar);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f602h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f602h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        h0 h0Var = this.f613t;
        if (h0Var != null) {
            return h0Var.f734g ? h0Var.f729a : h0Var.f730b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i8 = this.f615v;
        return i8 != Integer.MIN_VALUE ? i8 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        h0 h0Var = this.f613t;
        if (h0Var != null) {
            return h0Var.f729a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        h0 h0Var = this.f613t;
        if (h0Var != null) {
            return h0Var.f730b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        h0 h0Var = this.f613t;
        if (h0Var != null) {
            return h0Var.f734g ? h0Var.f730b : h0Var.f729a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i8 = this.f614u;
        return i8 != Integer.MIN_VALUE ? i8 : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.f516p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r2 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r2.f596a
            r1 = 0
            if (r0 == 0) goto L_0x0011
            androidx.appcompat.view.menu.d r0 = r0.f516p
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0023
            int r0 = r2.getContentInsetEnd()
            int r2 = r2.f615v
            int r2 = java.lang.Math.max(r2, r1)
            int r2 = java.lang.Math.max(r0, r2)
            goto L_0x0027
        L_0x0023:
            int r2 = r2.getContentInsetEnd()
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        int[] iArr = x.f4957a;
        return x.d.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        int[] iArr = x.f4957a;
        return x.d.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f614u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.f596a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f599d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f599d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public c getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        d();
        return this.f596a.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f604j;
    }

    public int getPopupTheme() {
        return this.f605k;
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    public final TextView getSubtitleTextView() {
        return this.f598c;
    }

    public CharSequence getTitle() {
        return this.f616x;
    }

    public int getTitleMarginBottom() {
        return this.f612s;
    }

    public int getTitleMarginEnd() {
        return this.f611q;
    }

    public int getTitleMarginStart() {
        return this.f610p;
    }

    public int getTitleMarginTop() {
        return this.r;
    }

    public final TextView getTitleTextView() {
        return this.f597b;
    }

    public v getWrapper() {
        if (this.H == null) {
            this.H = new q0(this);
        }
        return this.H;
    }

    public final int h(View view, int i8) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i9 = i8 > 0 ? (measuredHeight - i8) / 2 : 0;
        int i10 = eVar.f4297a & 112;
        if (!(i10 == 16 || i10 == 48 || i10 == 80)) {
            i10 = this.w & 112;
        }
        if (i10 == 48) {
            return getPaddingTop() - i9;
        }
        if (i10 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i9;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i11 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = eVar.topMargin;
        if (i11 < i12) {
            i11 = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - i11) - paddingTop;
            int i14 = eVar.bottomMargin;
            if (i13 < i14) {
                i11 = Math.max(0, i11 - (i14 - i13));
            }
        }
        return paddingTop + i11;
    }

    public final void k(int i8) {
        getMenuInflater().inflate(i8, getMenu());
    }

    public final boolean l(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public final int m(View view, int i8, int i9, int[] iArr) {
        e eVar = (e) view.getLayoutParams();
        int i10 = eVar.leftMargin - iArr[0];
        int max = i8 + Math.max(0, i10);
        iArr[0] = Math.max(0, -i10);
        int h8 = h(view, i9);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, h8, max + measuredWidth, view.getMeasuredHeight() + h8);
        return max + measuredWidth + eVar.rightMargin;
    }

    public final int n(View view, int i8, int i9, int[] iArr) {
        e eVar = (e) view.getLayoutParams();
        int i10 = eVar.rightMargin - iArr[1];
        int max = i8 - Math.max(0, i10);
        iArr[1] = Math.max(0, -i10);
        int h8 = h(view, i9);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, h8, max, view.getMeasuredHeight() + h8);
        return max - (measuredWidth + eVar.leftMargin);
    }

    public final int o(View view, int i8, int i9, int i10, int i11, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i12 = marginLayoutParams.leftMargin - iArr[0];
        int i13 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i12) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i12);
        iArr[1] = Math.max(0, -i13);
        view.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + max + i9, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i10, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i11, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.K);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0288 A[LOOP:0: B:104:0x0286->B:105:0x0288, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a4 A[LOOP:1: B:107:0x02a2->B:108:0x02a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02c2 A[LOOP:2: B:110:0x02c0->B:111:0x02c2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0310 A[LOOP:3: B:118:0x030e->B:119:0x0310, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0213  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int[] r1 = j0.x.f4957a
            int r1 = j0.x.d.d(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000e
            r1 = r2
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.F
            r11[r2] = r3
            r11[r3] = r3
            int r12 = j0.x.c.d(r19)
            if (r12 < 0) goto L_0x003c
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = r3
        L_0x003d:
            android.widget.ImageButton r13 = r0.f599d
            boolean r13 = r0.q(r13)
            if (r13 == 0) goto L_0x0055
            android.widget.ImageButton r13 = r0.f599d
            if (r1 == 0) goto L_0x0050
            int r13 = r0.n(r13, r10, r12, r11)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x0050:
            int r13 = r0.m(r13, r6, r12, r11)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f602h
            boolean r15 = r0.q(r15)
            if (r15 == 0) goto L_0x006c
            android.widget.ImageButton r15 = r0.f602h
            if (r1 == 0) goto L_0x0068
            int r14 = r0.n(r15, r14, r12, r11)
            goto L_0x006c
        L_0x0068:
            int r13 = r0.m(r15, r13, r12, r11)
        L_0x006c:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f596a
            boolean r15 = r0.q(r15)
            if (r15 == 0) goto L_0x0081
            androidx.appcompat.widget.ActionMenuView r15 = r0.f596a
            if (r1 == 0) goto L_0x007d
            int r13 = r0.m(r15, r13, r12, r11)
            goto L_0x0081
        L_0x007d:
            int r14 = r0.n(r15, r14, r12, r11)
        L_0x0081:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f603i
            boolean r13 = r0.q(r13)
            if (r13 == 0) goto L_0x00bc
            android.view.View r13 = r0.f603i
            if (r1 == 0) goto L_0x00b8
            int r10 = r0.n(r13, r10, r12, r11)
            goto L_0x00bc
        L_0x00b8:
            int r2 = r0.m(r13, r2, r12, r11)
        L_0x00bc:
            android.widget.ImageView r13 = r0.e
            boolean r13 = r0.q(r13)
            if (r13 == 0) goto L_0x00d1
            android.widget.ImageView r13 = r0.e
            if (r1 == 0) goto L_0x00cd
            int r10 = r0.n(r13, r10, r12, r11)
            goto L_0x00d1
        L_0x00cd:
            int r2 = r0.m(r13, r2, r12, r11)
        L_0x00d1:
            android.widget.TextView r13 = r0.f597b
            boolean r13 = r0.q(r13)
            android.widget.TextView r14 = r0.f598c
            boolean r14 = r0.q(r14)
            if (r13 == 0) goto L_0x00f8
            android.widget.TextView r15 = r0.f597b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f597b
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x00fb
        L_0x00f8:
            r23 = r7
            r3 = 0
        L_0x00fb:
            if (r14 == 0) goto L_0x0115
            android.widget.TextView r7 = r0.f598c
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f598c
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x0117
        L_0x0115:
            r16 = r4
        L_0x0117:
            if (r13 != 0) goto L_0x0122
            if (r14 == 0) goto L_0x011c
            goto L_0x0122
        L_0x011c:
            r18 = r6
            r22 = r12
            goto L_0x027a
        L_0x0122:
            if (r13 == 0) goto L_0x0127
            android.widget.TextView r4 = r0.f597b
            goto L_0x0129
        L_0x0127:
            android.widget.TextView r4 = r0.f598c
        L_0x0129:
            if (r14 == 0) goto L_0x012e
            android.widget.TextView r7 = r0.f598c
            goto L_0x0130
        L_0x012e:
            android.widget.TextView r7 = r0.f597b
        L_0x0130:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.e) r7
            if (r13 == 0) goto L_0x0146
            android.widget.TextView r15 = r0.f597b
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0150
        L_0x0146:
            if (r14 == 0) goto L_0x0153
            android.widget.TextView r15 = r0.f598c
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0153
        L_0x0150:
            r17 = 1
            goto L_0x0155
        L_0x0153:
            r17 = 0
        L_0x0155:
            int r15 = r0.w
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x0197
            r6 = 80
            if (r15 == r6) goto L_0x018b
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.r
            int r15 = r15 + r12
            if (r6 >= r15) goto L_0x0174
            r6 = r15
            goto L_0x0189
        L_0x0174:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r3 = r4.bottomMargin
            int r4 = r0.f612s
            int r3 = r3 + r4
            if (r5 >= r3) goto L_0x0189
            int r3 = r7.bottomMargin
            int r3 = r3 + r4
            int r3 = r3 - r5
            int r6 = r6 - r3
            r3 = 0
            int r6 = java.lang.Math.max(r3, r6)
        L_0x0189:
            int r8 = r8 + r6
            goto L_0x01a4
        L_0x018b:
            r22 = r12
            int r5 = r5 - r9
            int r4 = r7.bottomMargin
            int r5 = r5 - r4
            int r4 = r0.f612s
            int r5 = r5 - r4
            int r8 = r5 - r3
            goto L_0x01a4
        L_0x0197:
            r22 = r12
            int r3 = r19.getPaddingTop()
            int r4 = r4.topMargin
            int r3 = r3 + r4
            int r4 = r0.r
            int r8 = r3 + r4
        L_0x01a4:
            if (r1 == 0) goto L_0x0213
            if (r17 == 0) goto L_0x01ab
            int r1 = r0.f610p
            goto L_0x01ac
        L_0x01ab:
            r1 = 0
        L_0x01ac:
            r3 = 1
            r4 = r11[r3]
            int r1 = r1 - r4
            r4 = 0
            int r5 = java.lang.Math.max(r4, r1)
            int r10 = r10 - r5
            int r1 = -r1
            int r1 = java.lang.Math.max(r4, r1)
            r11[r3] = r1
            if (r13 == 0) goto L_0x01e3
            android.widget.TextView r1 = r0.f597b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r3 = r0.f597b
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.f597b
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f597b
            r5.layout(r3, r8, r10, r4)
            int r5 = r0.f611q
            int r3 = r3 - r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x01e4
        L_0x01e3:
            r3 = r10
        L_0x01e4:
            if (r14 == 0) goto L_0x020a
            android.widget.TextView r1 = r0.f598c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f598c
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r4 = r0.f598c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f598c
            r5.layout(r1, r8, r10, r4)
            int r1 = r0.f611q
            int r1 = r10 - r1
            goto L_0x020b
        L_0x020a:
            r1 = r10
        L_0x020b:
            if (r17 == 0) goto L_0x027a
            int r1 = java.lang.Math.min(r3, r1)
            r10 = r1
            goto L_0x027a
        L_0x0213:
            if (r17 == 0) goto L_0x0218
            int r1 = r0.f610p
            goto L_0x0219
        L_0x0218:
            r1 = 0
        L_0x0219:
            r3 = 0
            r4 = r11[r3]
            int r1 = r1 - r4
            int r4 = java.lang.Math.max(r3, r1)
            int r2 = r2 + r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r3] = r1
            if (r13 == 0) goto L_0x024e
            android.widget.TextView r1 = r0.f597b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r3 = r0.f597b
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r4 = r0.f597b
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f597b
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.f611q
            int r3 = r3 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x024f
        L_0x024e:
            r3 = r2
        L_0x024f:
            if (r14 == 0) goto L_0x0273
            android.widget.TextView r1 = r0.f598c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f598c
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r2
            android.widget.TextView r4 = r0.f598c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f598c
            r5.layout(r2, r8, r1, r4)
            int r4 = r0.f611q
            int r1 = r1 + r4
            goto L_0x0274
        L_0x0273:
            r1 = r2
        L_0x0274:
            if (r17 == 0) goto L_0x027a
            int r2 = java.lang.Math.max(r3, r1)
        L_0x027a:
            java.util.ArrayList<android.view.View> r1 = r0.D
            r3 = 3
            r0.a(r3, r1)
            int r3 = r1.size()
            r4 = r2
            r2 = 0
        L_0x0286:
            if (r2 >= r3) goto L_0x0297
            java.lang.Object r5 = r1.get(r2)
            android.view.View r5 = (android.view.View) r5
            r12 = r22
            int r4 = r0.m(r5, r4, r12, r11)
            int r2 = r2 + 1
            goto L_0x0286
        L_0x0297:
            r12 = r22
            r2 = 5
            r0.a(r2, r1)
            int r2 = r1.size()
            r3 = 0
        L_0x02a2:
            if (r3 >= r2) goto L_0x02b1
            java.lang.Object r5 = r1.get(r3)
            android.view.View r5 = (android.view.View) r5
            int r10 = r0.n(r5, r10, r12, r11)
            int r3 = r3 + 1
            goto L_0x02a2
        L_0x02b1:
            r3 = 1
            r0.a(r3, r1)
            r2 = 0
            r5 = r11[r2]
            r2 = r11[r3]
            int r3 = r1.size()
            r6 = 0
            r7 = 0
        L_0x02c0:
            if (r7 >= r3) goto L_0x02f3
            java.lang.Object r8 = r1.get(r7)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r9 = (androidx.appcompat.widget.Toolbar.e) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r5
            int r5 = r9.rightMargin
            int r5 = r5 - r2
            r2 = 0
            int r9 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r5)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r5 = -r5
            int r5 = java.lang.Math.max(r2, r5)
            int r8 = r8.getMeasuredWidth()
            int r9 = r9 + r8
            int r9 = r9 + r14
            int r6 = r6 + r9
            int r7 = r7 + 1
            r2 = r5
            r5 = r13
            goto L_0x02c0
        L_0x02f3:
            r2 = 0
            int r3 = r16 - r18
            int r3 = r3 - r23
            int r3 = r3 / 2
            int r3 = r18 + r3
            int r5 = r6 / 2
            int r3 = r3 - r5
            int r6 = r6 + r3
            if (r3 >= r4) goto L_0x0303
            goto L_0x030a
        L_0x0303:
            if (r6 <= r10) goto L_0x0309
            int r6 = r6 - r10
            int r4 = r3 - r6
            goto L_0x030a
        L_0x0309:
            r4 = r3
        L_0x030a:
            int r3 = r1.size()
        L_0x030e:
            if (r2 >= r3) goto L_0x031d
            java.lang.Object r5 = r1.get(r2)
            android.view.View r5 = (android.view.View) r5
            int r4 = r0.m(r5, r4, r12, r11)
            int r2 = r2 + 1
            goto L_0x030e
        L_0x031d:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z8;
        char a9 = s0.a(this);
        char c9 = a9 ^ 1;
        int i17 = 0;
        if (q(this.f599d)) {
            p(this.f599d, i8, 0, i9, this.f609o);
            i12 = this.f599d.getMeasuredWidth() + i(this.f599d);
            i11 = Math.max(0, this.f599d.getMeasuredHeight() + j(this.f599d));
            i10 = View.combineMeasuredStates(0, this.f599d.getMeasuredState());
        } else {
            i12 = 0;
            i11 = 0;
            i10 = 0;
        }
        if (q(this.f602h)) {
            p(this.f602h, i8, 0, i9, this.f609o);
            i12 = this.f602h.getMeasuredWidth() + i(this.f602h);
            i11 = Math.max(i11, this.f602h.getMeasuredHeight() + j(this.f602h));
            i10 = View.combineMeasuredStates(i10, this.f602h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i12);
        int max2 = Math.max(0, currentContentInsetStart - i12);
        int[] iArr = this.F;
        iArr[a9] = max2;
        if (q(this.f596a)) {
            p(this.f596a, i8, max, i9, this.f609o);
            i13 = this.f596a.getMeasuredWidth() + i(this.f596a);
            i11 = Math.max(i11, this.f596a.getMeasuredHeight() + j(this.f596a));
            i10 = View.combineMeasuredStates(i10, this.f596a.getMeasuredState());
        } else {
            i13 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i13);
        iArr[c9] = Math.max(0, currentContentInsetEnd - i13);
        if (q(this.f603i)) {
            max3 += o(this.f603i, i8, max3, i9, 0, iArr);
            i11 = Math.max(i11, this.f603i.getMeasuredHeight() + j(this.f603i));
            i10 = View.combineMeasuredStates(i10, this.f603i.getMeasuredState());
        }
        if (q(this.e)) {
            max3 += o(this.e, i8, max3, i9, 0, iArr);
            i11 = Math.max(i11, this.e.getMeasuredHeight() + j(this.e));
            i10 = View.combineMeasuredStates(i10, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (((e) childAt.getLayoutParams()).f624b == 0 && q(childAt)) {
                max3 += o(childAt, i8, max3, i9, 0, iArr);
                i11 = Math.max(i11, childAt.getMeasuredHeight() + j(childAt));
                i10 = View.combineMeasuredStates(i10, childAt.getMeasuredState());
            }
        }
        int i19 = this.r + this.f612s;
        int i20 = this.f610p + this.f611q;
        if (q(this.f597b)) {
            o(this.f597b, i8, max3 + i20, i9, i19, iArr);
            int measuredWidth = this.f597b.getMeasuredWidth() + i(this.f597b);
            i14 = this.f597b.getMeasuredHeight() + j(this.f597b);
            i16 = View.combineMeasuredStates(i10, this.f597b.getMeasuredState());
            i15 = measuredWidth;
        } else {
            i14 = 0;
            i16 = i10;
            i15 = 0;
        }
        if (q(this.f598c)) {
            i15 = Math.max(i15, o(this.f598c, i8, max3 + i20, i9, i14 + i19, iArr));
            i14 += this.f598c.getMeasuredHeight() + j(this.f598c);
            i16 = View.combineMeasuredStates(i16, this.f598c.getMeasuredState());
        } else {
            int i21 = i16;
        }
        int max4 = Math.max(i11, i14);
        int paddingLeft = max3 + i15 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max4 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i8, -16777216 & i16);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i9, i16 << 16);
        if (this.J) {
            int childCount2 = getChildCount();
            int i22 = 0;
            while (true) {
                if (i22 >= childCount2) {
                    z8 = true;
                    break;
                }
                View childAt2 = getChildAt(i22);
                if (q(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i22++;
            }
        }
        z8 = false;
        if (!z8) {
            i17 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i17);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f6241f);
        ActionMenuView actionMenuView = this.f596a;
        androidx.appcompat.view.menu.d dVar = actionMenuView != null ? actionMenuView.f516p : null;
        int i8 = gVar.f625h;
        if (!(i8 == 0 || this.I == null || dVar == null || (findItem = dVar.findItem(i8)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f626i) {
            Runnable runnable = this.K;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r0 != Integer.MIN_VALUE) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        if (r0 != Integer.MIN_VALUE) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRtlPropertiesChanged(int r2) {
        /*
            r1 = this;
            super.onRtlPropertiesChanged(r2)
            androidx.appcompat.widget.h0 r0 = r1.f613t
            if (r0 != 0) goto L_0x000e
            androidx.appcompat.widget.h0 r0 = new androidx.appcompat.widget.h0
            r0.<init>()
            r1.f613t = r0
        L_0x000e:
            androidx.appcompat.widget.h0 r1 = r1.f613t
            r0 = 1
            if (r2 != r0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            boolean r2 = r1.f734g
            if (r0 != r2) goto L_0x001a
            goto L_0x0048
        L_0x001a:
            r1.f734g = r0
            boolean r2 = r1.f735h
            if (r2 == 0) goto L_0x0040
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L_0x0032
            int r0 = r1.f732d
            if (r0 == r2) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            int r0 = r1.e
        L_0x002b:
            r1.f729a = r0
            int r0 = r1.f731c
            if (r0 == r2) goto L_0x0044
            goto L_0x0046
        L_0x0032:
            int r0 = r1.f731c
            if (r0 == r2) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            int r0 = r1.e
        L_0x0039:
            r1.f729a = r0
            int r0 = r1.f732d
            if (r0 == r2) goto L_0x0044
            goto L_0x0046
        L_0x0040:
            int r2 = r1.e
            r1.f729a = r2
        L_0x0044:
            int r0 = r1.f733f
        L_0x0046:
            r1.f730b = r0
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.e eVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.I;
        if (!(dVar == null || (eVar = dVar.f622b) == null)) {
            gVar.f625h = eVar.f418a;
        }
        ActionMenuView actionMenuView = this.f596a;
        boolean z8 = false;
        if (actionMenuView != null) {
            c cVar = actionMenuView.f518s;
            if (cVar != null && cVar.i()) {
                z8 = true;
            }
        }
        gVar.f626i = z8;
        return gVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public final void p(View view, int i8, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i11 >= 0) {
            if (mode != 0) {
                i11 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i11);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapseContentDescription(int i8) {
        setCollapseContentDescription(i8 != 0 ? getContext().getText(i8) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        ImageButton imageButton = this.f602h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i8) {
        setCollapseIcon(g.a.a(getContext(), i8));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f602h.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f602h;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f600f);
        }
    }

    public void setCollapsible(boolean z8) {
        this.J = z8;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i8) {
        if (i8 < 0) {
            i8 = Integer.MIN_VALUE;
        }
        if (i8 != this.f615v) {
            this.f615v = i8;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i8) {
        if (i8 < 0) {
            i8 = Integer.MIN_VALUE;
        }
        if (i8 != this.f614u) {
            this.f614u = i8;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i8) {
        setLogo(g.a.a(getContext(), i8));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.e == null) {
                this.e = new m(getContext(), (AttributeSet) null);
            }
            if (!l(this.e)) {
                b(this.e, true);
            }
        } else {
            ImageView imageView = this.e;
            if (imageView != null && l(imageView)) {
                removeView(this.e);
                this.E.remove(this.e);
            }
        }
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i8) {
        setLogoDescription(getContext().getText(i8));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new m(getContext(), (AttributeSet) null);
        }
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i8) {
        setNavigationContentDescription(i8 != 0 ? getContext().getText(i8) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        ImageButton imageButton = this.f599d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i8) {
        setNavigationIcon(g.a.a(getContext(), i8));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!l(this.f599d)) {
                b(this.f599d, true);
            }
        } else {
            ImageButton imageButton = this.f599d;
            if (imageButton != null && l(imageButton)) {
                removeView(this.f599d);
                this.E.remove(this.f599d);
            }
        }
        ImageButton imageButton2 = this.f599d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f599d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        this.f596a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i8) {
        if (this.f605k != i8) {
            this.f605k = i8;
            if (i8 == 0) {
                this.f604j = getContext();
            } else {
                this.f604j = new ContextThemeWrapper(getContext(), i8);
            }
        }
    }

    public void setSubtitle(int i8) {
        setSubtitle(getContext().getText(i8));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f598c == null) {
                Context context = getContext();
                s sVar = new s(context, (AttributeSet) null);
                this.f598c = sVar;
                sVar.setSingleLine();
                this.f598c.setEllipsize(TextUtils.TruncateAt.END);
                int i8 = this.f607m;
                if (i8 != 0) {
                    this.f598c.setTextAppearance(context, i8);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f598c.setTextColor(colorStateList);
                }
            }
            if (!l(this.f598c)) {
                b(this.f598c, true);
            }
        } else {
            TextView textView = this.f598c;
            if (textView != null && l(textView)) {
                removeView(this.f598c);
                this.E.remove(this.f598c);
            }
        }
        TextView textView2 = this.f598c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setSubtitleTextColor(int i8) {
        setSubtitleTextColor(ColorStateList.valueOf(i8));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f598c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i8) {
        setTitle(getContext().getText(i8));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f597b == null) {
                Context context = getContext();
                s sVar = new s(context, (AttributeSet) null);
                this.f597b = sVar;
                sVar.setSingleLine();
                this.f597b.setEllipsize(TextUtils.TruncateAt.END);
                int i8 = this.f606l;
                if (i8 != 0) {
                    this.f597b.setTextAppearance(context, i8);
                }
                ColorStateList colorStateList = this.f617z;
                if (colorStateList != null) {
                    this.f597b.setTextColor(colorStateList);
                }
            }
            if (!l(this.f597b)) {
                b(this.f597b, true);
            }
        } else {
            TextView textView = this.f597b;
            if (textView != null && l(textView)) {
                removeView(this.f597b);
                this.E.remove(this.f597b);
            }
        }
        TextView textView2 = this.f597b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f616x = charSequence;
    }

    public void setTitleMarginBottom(int i8) {
        this.f612s = i8;
        requestLayout();
    }

    public void setTitleMarginEnd(int i8) {
        this.f611q = i8;
        requestLayout();
    }

    public void setTitleMarginStart(int i8) {
        this.f610p = i8;
        requestLayout();
    }

    public void setTitleMarginTop(int i8) {
        this.r = i8;
        requestLayout();
    }

    public void setTitleTextColor(int i8) {
        setTitleTextColor(ColorStateList.valueOf(i8));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f617z = colorStateList;
        TextView textView = this.f597b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }
}
