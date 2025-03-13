package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import androidx.viewpager2.widget.c;
import j0.x;
import java.util.ArrayList;
import k0.c;

public final class ViewPager2 extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f1988a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public final Rect f1989b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public final a f1990c;

    /* renamed from: d  reason: collision with root package name */
    public int f1991d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final a f1992f;

    /* renamed from: g  reason: collision with root package name */
    public d f1993g;

    /* renamed from: h  reason: collision with root package name */
    public int f1994h;

    /* renamed from: i  reason: collision with root package name */
    public Parcelable f1995i;

    /* renamed from: j  reason: collision with root package name */
    public RecyclerView f1996j;

    /* renamed from: k  reason: collision with root package name */
    public h f1997k;

    /* renamed from: l  reason: collision with root package name */
    public c f1998l;

    /* renamed from: m  reason: collision with root package name */
    public a f1999m;

    /* renamed from: n  reason: collision with root package name */
    public i0 f2000n;

    /* renamed from: o  reason: collision with root package name */
    public b f2001o;

    /* renamed from: p  reason: collision with root package name */
    public RecyclerView.i f2002p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2003q;
    public boolean r;

    /* renamed from: s  reason: collision with root package name */
    public int f2004s;

    /* renamed from: t  reason: collision with root package name */
    public f f2005t;

    public class a extends c {
        public a() {
        }

        public final void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.e = true;
            viewPager2.f1998l.f2030l = true;
        }
    }

    public abstract class b {
    }

    public static abstract class c extends RecyclerView.f {
    }

    public class d extends LinearLayoutManager {
        public d() {
            super(1);
        }

        public final void E0(RecyclerView.x xVar, int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.E0(xVar, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        public final void W(RecyclerView.s sVar, RecyclerView.x xVar, k0.c cVar) {
            super.W(sVar, xVar, cVar);
            ViewPager2.this.f2005t.getClass();
        }

        public final boolean j0(RecyclerView.s sVar, RecyclerView.x xVar, int i8, Bundle bundle) {
            ViewPager2.this.f2005t.getClass();
            return super.j0(sVar, xVar, i8, bundle);
        }

        public final boolean o0(RecyclerView recyclerView, View view, Rect rect, boolean z8, boolean z9) {
            return false;
        }
    }

    public static abstract class e {
        public void a(int i8) {
        }

        public void b(float f9, int i8, int i9) {
        }

        public void c(int i8) {
        }
    }

    public class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public final a f2007a = new a();

        /* renamed from: b  reason: collision with root package name */
        public final b f2008b = new b();

        /* renamed from: c  reason: collision with root package name */
        public f f2009c;

        public class a implements k0.g {
            public a() {
            }

            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.r) {
                    viewPager2.b(currentItem, true);
                }
                return true;
            }
        }

        public class b implements k0.g {
            public b() {
            }

            public final boolean a(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.r) {
                    viewPager2.b(currentItem, true);
                }
                return true;
            }
        }

        public f() {
        }

        public final void a(RecyclerView recyclerView) {
            int[] iArr = x.f4957a;
            x.c.s(recyclerView, 2);
            this.f2009c = new f(this);
            ViewPager2 viewPager2 = ViewPager2.this;
            if (x.c.c(viewPager2) == 0) {
                x.c.s(viewPager2, 1);
            }
        }

        public final void b() {
            int c9;
            c.a aVar;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i8 = 16908360;
            x.g(viewPager2, 16908360);
            boolean z8 = false;
            x.d(viewPager2, 0);
            x.g(viewPager2, 16908361);
            x.d(viewPager2, 0);
            x.g(viewPager2, 16908358);
            x.d(viewPager2, 0);
            x.g(viewPager2, 16908359);
            x.d(viewPager2, 0);
            if (viewPager2.getAdapter() != null && (c9 = viewPager2.getAdapter().c()) != 0 && viewPager2.r) {
                int orientation = viewPager2.getOrientation();
                a aVar2 = this.f2007a;
                if (orientation == 0) {
                    if (viewPager2.f1993g.B() == 1) {
                        z8 = true;
                    }
                    int i9 = z8 ? 16908360 : 16908361;
                    if (z8) {
                        i8 = 16908361;
                    }
                    if (viewPager2.f1991d < c9 - 1) {
                        x.h(viewPager2, new c.a(i9), aVar2);
                    }
                    if (viewPager2.f1991d > 0) {
                        aVar = new c.a(i8);
                    } else {
                        return;
                    }
                } else {
                    if (viewPager2.f1991d < c9 - 1) {
                        x.h(viewPager2, new c.a(16908359), aVar2);
                    }
                    if (viewPager2.f1991d > 0) {
                        aVar = new c.a(16908358);
                    } else {
                        return;
                    }
                }
                x.h(viewPager2, aVar, this.f2008b);
            }
        }
    }

    public interface g {
    }

    public class h extends u {
        public h() {
        }

        public final View d(RecyclerView.l lVar) {
            if (((c) ViewPager2.this.f2000n.f1189b).f2031m) {
                return null;
            }
            return super.d(lVar);
        }
    }

    public class i extends RecyclerView {
        public i(Context context) {
            super(context, (AttributeSet) null);
        }

        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.f2005t.getClass();
            return super.getAccessibilityClassName();
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.f1991d);
            accessibilityEvent.setToIndex(viewPager2.f1991d);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.r && super.onInterceptTouchEvent(motionEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.r && super.onTouchEvent(motionEvent);
        }
    }

    public static class j extends View.BaseSavedState {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public int f2014f;

        /* renamed from: g  reason: collision with root package name */
        public int f2015g;

        /* renamed from: h  reason: collision with root package name */
        public Parcelable f2016h;

        public static class a implements Parcelable.ClassLoaderCreator<j> {
            public final Object createFromParcel(Parcel parcel) {
                return new j(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i8) {
                return new j[i8];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new j(parcel, classLoader);
            }
        }

        public j() {
            throw null;
        }

        public j(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2014f = parcel.readInt();
            this.f2015g = parcel.readInt();
            this.f2016h = parcel.readParcelable(classLoader);
        }

        public j(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f2014f);
            parcel.writeInt(this.f2015g);
            parcel.writeParcelable(this.f2016h, i8);
        }
    }

    public static class k implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final int f2017f;

        /* renamed from: g  reason: collision with root package name */
        public final RecyclerView f2018g;

        public k(int i8, RecyclerView recyclerView) {
            this.f2017f = i8;
            this.f2018g = recyclerView;
        }

        public final void run() {
            this.f2018g.b0(this.f2017f);
        }
    }

    /* JADX INFO: finally extract failed */
    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a();
        this.f1990c = aVar;
        this.e = false;
        this.f1992f = new a();
        this.f1994h = -1;
        this.f2002p = null;
        this.f2003q = false;
        this.r = true;
        this.f2004s = -1;
        this.f2005t = new f();
        i iVar = new i(context);
        this.f1996j = iVar;
        int[] iArr = x.f4957a;
        iVar.setId(x.d.a());
        this.f1996j.setDescendantFocusability(131072);
        d dVar = new d();
        this.f1993g = dVar;
        this.f1996j.setLayoutManager(dVar);
        this.f1996j.setScrollingTouchSlop(1);
        int[] iArr2 = a1.a.f37n0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr2);
        saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.f1996j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            RecyclerView recyclerView = this.f1996j;
            j1.c cVar = new j1.c();
            if (recyclerView.A == null) {
                recyclerView.A = new ArrayList();
            }
            recyclerView.A.add(cVar);
            c cVar2 = new c(this);
            this.f1998l = cVar2;
            this.f2000n = new i0(this, cVar2, this.f1996j);
            h hVar = new h();
            this.f1997k = hVar;
            hVar.a(this.f1996j);
            this.f1996j.g(this.f1998l);
            a aVar2 = new a();
            this.f1999m = aVar2;
            this.f1998l.f2020a = aVar2;
            d dVar2 = new d(this);
            e eVar = new e(this);
            this.f1999m.f2019a.add(dVar2);
            this.f1999m.f2019a.add(eVar);
            this.f2005t.a(this.f1996j);
            this.f1999m.f2019a.add(aVar);
            b bVar = new b(this.f1993g);
            this.f2001o = bVar;
            this.f1999m.f2019a.add(bVar);
            RecyclerView recyclerView2 = this.f1996j;
            attachViewToParent(recyclerView2, 0, recyclerView2.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a() {
        RecyclerView.d adapter;
        if (this.f1994h != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.f1995i;
            if (parcelable != null) {
                if (adapter instanceof androidx.viewpager2.adapter.g) {
                    ((androidx.viewpager2.adapter.g) adapter).b(parcelable);
                }
                this.f1995i = null;
            }
            int max = Math.max(0, Math.min(this.f1994h, adapter.c() - 1));
            this.f1991d = max;
            this.f1994h = -1;
            this.f1996j.Z(max);
            this.f2005t.b();
        }
    }

    public final void b(int i8, boolean z8) {
        RecyclerView.d adapter = getAdapter();
        boolean z9 = false;
        if (adapter == null) {
            if (this.f1994h != -1) {
                this.f1994h = Math.max(i8, 0);
            }
        } else if (adapter.c() > 0) {
            int min = Math.min(Math.max(i8, 0), adapter.c() - 1);
            int i9 = this.f1991d;
            if (min == i9) {
                if (this.f1998l.f2024f == 0) {
                    return;
                }
            }
            if (min != i9 || !z8) {
                double d9 = (double) i9;
                this.f1991d = min;
                this.f2005t.b();
                c cVar = this.f1998l;
                if (!(cVar.f2024f == 0)) {
                    cVar.f();
                    c.a aVar = cVar.f2025g;
                    d9 = ((double) aVar.f2032a) + ((double) aVar.f2033b);
                }
                c cVar2 = this.f1998l;
                cVar2.getClass();
                cVar2.e = z8 ? 2 : 3;
                cVar2.f2031m = false;
                if (cVar2.f2027i != min) {
                    z9 = true;
                }
                cVar2.f2027i = min;
                cVar2.d(2);
                if (z9) {
                    cVar2.c(min);
                }
                if (!z8) {
                    this.f1996j.Z(min);
                    return;
                }
                double d10 = (double) min;
                if (Math.abs(d10 - d9) > 3.0d) {
                    this.f1996j.Z(d10 > d9 ? min - 3 : min + 3);
                    RecyclerView recyclerView = this.f1996j;
                    recyclerView.post(new k(min, recyclerView));
                    return;
                }
                this.f1996j.b0(min);
            }
        }
    }

    public final void c() {
        h hVar = this.f1997k;
        if (hVar != null) {
            View d9 = hVar.d(this.f1993g);
            if (d9 != null) {
                this.f1993g.getClass();
                int H = RecyclerView.l.H(d9);
                if (H != this.f1991d && getScrollState() == 0) {
                    this.f1999m.c(H);
                }
                this.e = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final boolean canScrollHorizontally(int i8) {
        return this.f1996j.canScrollHorizontally(i8);
    }

    public final boolean canScrollVertically(int i8) {
        return this.f1996j.canScrollVertically(i8);
    }

    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof j) {
            int i8 = ((j) parcelable).f2014f;
            sparseArray.put(this.f1996j.getId(), sparseArray.get(i8));
            sparseArray.remove(i8);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    public CharSequence getAccessibilityClassName() {
        this.f2005t.getClass();
        this.f2005t.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.d getAdapter() {
        return this.f1996j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f1991d;
    }

    public int getItemDecorationCount() {
        return this.f1996j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f2004s;
    }

    public int getOrientation() {
        return this.f1993g.f1554p;
    }

    public int getPageSize() {
        int i8;
        int i9;
        RecyclerView recyclerView = this.f1996j;
        if (getOrientation() == 0) {
            i8 = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i9 = recyclerView.getPaddingRight();
        } else {
            i8 = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i9 = recyclerView.getPaddingBottom();
        }
        return i8 - i9;
    }

    public int getScrollState() {
        return this.f1998l.f2024f;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i8;
        int i9;
        int c9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() != null) {
            int orientation = viewPager2.getOrientation();
            i8 = viewPager2.getAdapter().c();
            if (orientation == 1) {
                i9 = 0;
            } else {
                i9 = i8;
                i8 = 0;
            }
        } else {
            i9 = 0;
            i8 = 0;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) c.b.a(i8, i9, 0).f5099a);
        RecyclerView.d adapter = viewPager2.getAdapter();
        if (adapter != null && (c9 = adapter.c()) != 0 && viewPager2.r) {
            if (viewPager2.f1991d > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (viewPager2.f1991d < c9 - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int measuredWidth = this.f1996j.getMeasuredWidth();
        int measuredHeight = this.f1996j.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f1988a;
        rect.left = paddingLeft;
        rect.right = (i10 - i8) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i11 - i9) - getPaddingBottom();
        Rect rect2 = this.f1989b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f1996j.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.e) {
            c();
        }
    }

    public final void onMeasure(int i8, int i9) {
        measureChild(this.f1996j, i8, i9);
        int measuredWidth = this.f1996j.getMeasuredWidth();
        int measuredHeight = this.f1996j.getMeasuredHeight();
        int measuredState = this.f1996j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i8, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i9, measuredState << 16));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.f1994h = jVar.f2015g;
        this.f1995i = jVar.f2016h;
    }

    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f2014f = this.f1996j.getId();
        int i8 = this.f1994h;
        if (i8 == -1) {
            i8 = this.f1991d;
        }
        jVar.f2015g = i8;
        Parcelable parcelable = this.f1995i;
        if (parcelable != null) {
            jVar.f2016h = parcelable;
        } else {
            RecyclerView.d adapter = this.f1996j.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.g) {
                jVar.f2016h = ((androidx.viewpager2.adapter.g) adapter).a();
            }
        }
        return jVar;
    }

    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    public final boolean performAccessibilityAction(int i8, Bundle bundle) {
        this.f2005t.getClass();
        boolean z8 = false;
        if (!(i8 == 8192 || i8 == 4096)) {
            return super.performAccessibilityAction(i8, bundle);
        }
        f fVar = this.f2005t;
        fVar.getClass();
        if (i8 == 8192 || i8 == 4096) {
            z8 = true;
        }
        if (z8) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int currentItem = i8 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
            if (viewPager2.r) {
                viewPager2.b(currentItem, true);
            }
            return true;
        }
        throw new IllegalStateException();
    }

    public void setAdapter(RecyclerView.d dVar) {
        RecyclerView.d adapter = this.f1996j.getAdapter();
        f fVar = this.f2005t;
        if (adapter != null) {
            adapter.f1649a.unregisterObserver(fVar.f2009c);
        } else {
            fVar.getClass();
        }
        a aVar = this.f1992f;
        if (adapter != null) {
            adapter.f1649a.unregisterObserver(aVar);
        }
        this.f1996j.setAdapter(dVar);
        this.f1991d = 0;
        a();
        f fVar2 = this.f2005t;
        fVar2.b();
        if (dVar != null) {
            dVar.f1649a.registerObserver(fVar2.f2009c);
        }
        if (dVar != null) {
            dVar.f1649a.registerObserver(aVar);
        }
    }

    public void setCurrentItem(int i8) {
        if (!((c) this.f2000n.f1189b).f2031m) {
            b(i8, true);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public void setLayoutDirection(int i8) {
        super.setLayoutDirection(i8);
        this.f2005t.b();
    }

    public void setOffscreenPageLimit(int i8) {
        if (i8 >= 1 || i8 == -1) {
            this.f2004s = i8;
            this.f1996j.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i8) {
        this.f1993g.e1(i8);
        this.f2005t.b();
    }

    public void setPageTransformer(g gVar) {
        boolean z8 = this.f2003q;
        if (gVar != null) {
            if (!z8) {
                this.f2002p = this.f1996j.getItemAnimator();
                this.f2003q = true;
            }
            this.f1996j.setItemAnimator((RecyclerView.i) null);
        } else if (z8) {
            this.f1996j.setItemAnimator(this.f2002p);
            this.f2002p = null;
            this.f2003q = false;
        }
        this.f2001o.getClass();
        if (gVar != null) {
            this.f2001o.getClass();
            this.f2001o.getClass();
        }
    }

    public void setUserInputEnabled(boolean z8) {
        this.r = z8;
        this.f2005t.b();
    }
}
