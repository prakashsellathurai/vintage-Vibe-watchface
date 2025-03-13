package androidx.coordinatorlayout.widget;

import a0.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.health.services.client.R;
import j0.d0;
import j0.m;
import j0.n;
import j0.o;
import j0.p;
import j0.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k3.j;

public class CoordinatorLayout extends ViewGroup implements m, n {

    /* renamed from: t  reason: collision with root package name */
    public static final String f1000t;

    /* renamed from: u  reason: collision with root package name */
    public static final Class<?>[] f1001u = {Context.class, AttributeSet.class};

    /* renamed from: v  reason: collision with root package name */
    public static final ThreadLocal<Map<String, Constructor<c>>> f1002v = new ThreadLocal<>();
    public static final Comparator<View> w = new i();

    /* renamed from: x  reason: collision with root package name */
    public static final i0.e f1003x = new i0.e(12);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1004a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final s.c f1005b = new s.c(1);

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1006c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f1007d = new ArrayList();
    public final int[] e = new int[2];

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1008f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public boolean f1009g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1010h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f1011i;

    /* renamed from: j  reason: collision with root package name */
    public View f1012j;

    /* renamed from: k  reason: collision with root package name */
    public View f1013k;

    /* renamed from: l  reason: collision with root package name */
    public g f1014l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1015m;

    /* renamed from: n  reason: collision with root package name */
    public d0 f1016n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1017o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f1018p;

    /* renamed from: q  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1019q;
    public a r;

    /* renamed from: s  reason: collision with root package name */
    public final o f1020s = new o();

    public class a implements p {
        public a() {
        }

        public final d0 a(View view, d0 d0Var) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!i0.b.a(coordinatorLayout.f1016n, d0Var)) {
                coordinatorLayout.f1016n = d0Var;
                boolean z8 = true;
                boolean z9 = d0Var.d() > 0;
                coordinatorLayout.f1017o = z9;
                if (z9 || coordinatorLayout.getBackground() != null) {
                    z8 = false;
                }
                coordinatorLayout.setWillNotDraw(z8);
                d0.j jVar = d0Var.f4933a;
                if (!jVar.j()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i8 = 0; i8 < childCount; i8++) {
                        View childAt = coordinatorLayout.getChildAt(i8);
                        int[] iArr = x.f4957a;
                        if (x.c.b(childAt) && ((f) childAt.getLayoutParams()).f1023a != null && jVar.j()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return d0Var;
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public boolean a(View view) {
            return false;
        }

        public boolean b(View view, View view2) {
            return false;
        }

        public void c(f fVar) {
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v8, View view) {
            return false;
        }

        public void e(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void f() {
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v8, MotionEvent motionEvent) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v8, int i8) {
            return false;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10) {
            return false;
        }

        public boolean j(View view) {
            return false;
        }

        public void k(CoordinatorLayout coordinatorLayout, V v8, View view, int i8, int i9, int[] iArr, int i10) {
        }

        public void l(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10, int[] iArr) {
            iArr[0] = iArr[0] + i9;
            iArr[1] = iArr[1] + i10;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v8, Rect rect, boolean z8) {
            return false;
        }

        public void n(View view, Parcelable parcelable) {
        }

        public Parcelable o(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v8, View view, View view2, int i8, int i9) {
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, V v8, View view, int i8) {
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v8, MotionEvent motionEvent) {
            return false;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1019q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.p(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f1019q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public c f1023a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1024b = false;

        /* renamed from: c  reason: collision with root package name */
        public final int f1025c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1026d = 0;
        public final int e = -1;

        /* renamed from: f  reason: collision with root package name */
        public final int f1027f = -1;

        /* renamed from: g  reason: collision with root package name */
        public final int f1028g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f1029h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f1030i;

        /* renamed from: j  reason: collision with root package name */
        public int f1031j;

        /* renamed from: k  reason: collision with root package name */
        public View f1032k;

        /* renamed from: l  reason: collision with root package name */
        public View f1033l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1034m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f1035n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1036o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f1037p;

        /* renamed from: q  reason: collision with root package name */
        public final Rect f1038q = new Rect();

        public f() {
            super(-2, -2);
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            c cVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f5165u);
            this.f1025c = obtainStyledAttributes.getInteger(0, 0);
            this.f1027f = obtainStyledAttributes.getResourceId(1, -1);
            this.f1026d = obtainStyledAttributes.getInteger(2, 0);
            this.e = obtainStyledAttributes.getInteger(6, -1);
            this.f1028g = obtainStyledAttributes.getInt(5, 0);
            this.f1029h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f1024b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.f1000t;
                if (TextUtils.isEmpty(string)) {
                    cVar = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f1000t;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.f1002v;
                        Map map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1001u);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        cVar = (c) constructor.newInstance(new Object[]{context, attributeSet});
                    } catch (Exception e4) {
                        throw new RuntimeException("Could not inflate Behavior subclass " + string, e4);
                    }
                }
                this.f1023a = cVar;
            }
            obtainStyledAttributes.recycle();
            c cVar2 = this.f1023a;
            if (cVar2 != null) {
                cVar2.c(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(f fVar) {
            super(fVar);
        }

        public final boolean a(int i8) {
            if (i8 == 0) {
                return this.f1035n;
            }
            if (i8 != 1) {
                return false;
            }
            return this.f1036o;
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        public final boolean onPreDraw() {
            CoordinatorLayout.this.p(0);
            return true;
        }
    }

    public static class h extends p0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public SparseArray<Parcelable> f1040h;

        public static class a implements Parcelable.ClassLoaderCreator<h> {
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i8) {
                return new h[i8];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1040h = new SparseArray<>(readInt);
            for (int i8 = 0; i8 < readInt; i8++) {
                this.f1040h.append(iArr[i8], readParcelableArray[i8]);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f6241f, i8);
            SparseArray<Parcelable> sparseArray = this.f1040h;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i9 = 0; i9 < size; i9++) {
                iArr[i9] = this.f1040h.keyAt(i9);
                parcelableArr[i9] = this.f1040h.valueAt(i9);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i8);
        }
    }

    public static class i implements Comparator<View> {
        public final int compare(Object obj, Object obj2) {
            int[] iArr = x.f4957a;
            float m8 = x.h.m((View) obj);
            float m9 = x.h.m((View) obj2);
            if (m8 > m9) {
                return -1;
            }
            return m8 < m9 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.getName()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            f1000t = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            w = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f1001u = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f1002v = r0
            i0.e r0 = new i0.e
            r1 = 12
            r0.<init>(r1)
            f1003x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        int[] iArr = j.f5164t;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f1011i = intArray;
            float f9 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i8 = 0; i8 < length; i8++) {
                int[] iArr2 = this.f1011i;
                iArr2[i8] = (int) (((float) iArr2[i8]) * f9);
            }
        }
        this.f1018p = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        x();
        super.setOnHierarchyChangeListener(new e());
        int[] iArr3 = x.f4957a;
        if (x.c.c(this) == 0) {
            x.c.s(this, 1);
        }
    }

    public static Rect d() {
        Rect rect = (Rect) f1003x.b();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i8, Rect rect, Rect rect2, f fVar, int i9, int i10) {
        int i11 = fVar.f1025c;
        if (i11 == 0) {
            i11 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, i8);
        int i12 = fVar.f1026d;
        if ((i12 & 7) == 0) {
            i12 |= 8388611;
        }
        if ((i12 & 112) == 0) {
            i12 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, i8);
        int i13 = absoluteGravity & 7;
        int i14 = absoluteGravity & 112;
        int i15 = absoluteGravity2 & 7;
        int i16 = absoluteGravity2 & 112;
        int width = i15 != 1 ? i15 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i16 != 16 ? i16 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i13 == 1) {
            width -= i9 / 2;
        } else if (i13 != 5) {
            width -= i9;
        }
        if (i14 == 16) {
            height -= i10 / 2;
        } else if (i14 != 80) {
            height -= i10;
        }
        rect2.set(width, height, i9 + width, i10 + height);
    }

    public static f n(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f1024b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c cVar = fVar.f1023a;
                if (cVar != behavior) {
                    if (cVar != null) {
                        cVar.f();
                    }
                    fVar.f1023a = behavior;
                    fVar.f1024b = true;
                    if (behavior != null) {
                        behavior.c(fVar);
                    }
                }
            } else {
                d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        c cVar2 = (c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        c cVar3 = fVar.f1023a;
                        if (cVar3 != cVar2) {
                            if (cVar3 != null) {
                                cVar3.f();
                            }
                            fVar.f1023a = cVar2;
                            fVar.f1024b = true;
                            if (cVar2 != null) {
                                cVar2.c(fVar);
                            }
                        }
                    } catch (Exception e4) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e4);
                    }
                }
            }
            fVar.f1024b = true;
        }
        return fVar;
    }

    public static void v(View view, int i8) {
        f fVar = (f) view.getLayoutParams();
        int i9 = fVar.f1030i;
        if (i9 != i8) {
            int[] iArr = x.f4957a;
            view.offsetLeftAndRight(i8 - i9);
            fVar.f1030i = i8;
        }
    }

    public static void w(View view, int i8) {
        f fVar = (f) view.getLayoutParams();
        int i9 = fVar.f1031j;
        if (i9 != i8) {
            int[] iArr = x.f4957a;
            view.offsetTopAndBottom(i8 - i9);
            fVar.f1031j = i8;
        }
    }

    public final void a(View view, View view2, int i8, int i9) {
        o oVar = this.f1020s;
        if (i9 == 1) {
            oVar.f4953b = i8;
        } else {
            oVar.f4952a = i8;
        }
        this.f1013k = view2;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ((f) getChildAt(i10).getLayoutParams()).getClass();
        }
    }

    public final void b(View view, int i8) {
        o oVar = this.f1020s;
        if (i8 == 1) {
            oVar.f4953b = 0;
        } else {
            oVar.f4952a = 0;
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i8)) {
                c cVar = fVar.f1023a;
                if (cVar != null) {
                    cVar.q(this, childAt, view, i8);
                }
                if (i8 == 0) {
                    fVar.f1035n = false;
                } else if (i8 == 1) {
                    fVar.f1036o = false;
                }
                fVar.f1037p = false;
            }
        }
        this.f1013k = null;
    }

    public final void c(View view, int i8, int i9, int[] iArr, int i10) {
        c cVar;
        int childCount = getChildCount();
        boolean z8 = false;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                int i14 = i10;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i10) && (cVar = fVar.f1023a) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.k(this, childAt, view, i8, i9, iArr2, i10);
                    int[] iArr3 = this.e;
                    i11 = i8 > 0 ? Math.max(i11, iArr3[0]) : Math.min(i11, iArr3[0]);
                    i12 = i9 > 0 ? Math.max(i12, iArr3[1]) : Math.min(i12, iArr3[1]);
                    z8 = true;
                }
            }
        }
        iArr[0] = i11;
        iArr[1] = i12;
        if (z8) {
            p(1);
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final boolean drawChild(Canvas canvas, View view, long j8) {
        c cVar = ((f) view.getLayoutParams()).f1023a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j8);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1018p;
        boolean z8 = false;
        if (drawable != null && drawable.isStateful()) {
            z8 = false | drawable.setState(drawableState);
        }
        if (z8) {
            invalidate();
        }
    }

    public final void e(View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        c cVar;
        int childCount = getChildCount();
        boolean z8 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() == 8) {
                int i16 = i12;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i12) && (cVar = fVar.f1023a) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.l(this, childAt, i9, i10, i11, iArr2);
                    i13 = i10 > 0 ? Math.max(i13, iArr2[0]) : Math.min(i13, iArr2[0]);
                    i14 = i11 > 0 ? Math.max(i14, iArr2[1]) : Math.min(i14, iArr2[1]);
                    z8 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i13;
        iArr[1] = iArr[1] + i14;
        if (z8) {
            p(1);
        }
    }

    public final void f(View view, int i8, int i9, int i10, int i11, int i12) {
        e(view, i8, i9, i10, i11, 0, this.f1008f);
    }

    public final boolean g(View view, View view2, int i8, int i9) {
        int i10 = i9;
        int childCount = getChildCount();
        boolean z8 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f1023a;
                if (cVar != null) {
                    boolean p8 = cVar.p(this, childAt, view, view2, i8, i9);
                    z8 |= p8;
                    if (i10 == 0) {
                        fVar.f1035n = p8;
                    } else if (i10 == 1) {
                        fVar.f1036o = p8;
                    }
                } else if (i10 == 0) {
                    fVar.f1035n = false;
                } else if (i10 == 1) {
                    fVar.f1036o = false;
                }
            }
        }
        return z8;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        t();
        return Collections.unmodifiableList(this.f1004a);
    }

    public final d0 getLastWindowInsets() {
        return this.f1016n;
    }

    public int getNestedScrollAxes() {
        o oVar = this.f1020s;
        return oVar.f4953b | oVar.f4952a;
    }

    public Drawable getStatusBarBackground() {
        return this.f1018p;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public final void h(f fVar, Rect rect, int i8, int i9) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i8) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i9) - fVar.bottomMargin));
        rect.set(max, max2, i8 + max, i9 + max2);
    }

    public final void i(View view, Rect rect, boolean z8) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z8) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        p.f fVar = (p.f) this.f1005b.f7135b;
        int i8 = fVar.f6235h;
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < i8; i9++) {
            ArrayList arrayList2 = (ArrayList) fVar.l(i9);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fVar.h(i9));
            }
        }
        ArrayList arrayList3 = this.f1007d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = x.a.f8096a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = x.a.f8096a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        x.a.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = x.a.f8097b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int m(int i8) {
        StringBuilder sb;
        int[] iArr = this.f1011i;
        if (iArr == null) {
            sb = new StringBuilder("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i8);
        } else if (i8 >= 0 && i8 < iArr.length) {
            return iArr[i8];
        } else {
            sb = new StringBuilder("Keyline index ");
            sb.append(i8);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    public final boolean o(View view, int i8, int i9) {
        i0.e eVar = f1003x;
        Rect d9 = d();
        k(view, d9);
        try {
            return d9.contains(i8, i9);
        } finally {
            d9.setEmpty();
            eVar.a(d9);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(false);
        if (this.f1015m) {
            if (this.f1014l == null) {
                this.f1014l = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1014l);
        }
        if (this.f1016n == null) {
            int[] iArr = x.f4957a;
            if (x.c.b(this)) {
                x.g.c(this);
            }
        }
        this.f1010h = true;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u(false);
        if (this.f1015m && this.f1014l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1014l);
        }
        View view = this.f1013k;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1010h = false;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1017o && this.f1018p != null) {
            d0 d0Var = this.f1016n;
            int d9 = d0Var != null ? d0Var.d() : 0;
            if (d9 > 0) {
                this.f1018p.setBounds(0, 0, getWidth(), d9);
                this.f1018p.draw(canvas);
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u(true);
        }
        boolean s8 = s(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            u(true);
        }
        return s8;
    }

    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        c cVar;
        int[] iArr = x.f4957a;
        int d9 = x.d.d(this);
        ArrayList arrayList = this.f1004a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) arrayList.get(i12);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f1023a) == null || !cVar.h(this, view, d9))) {
                q(view, d9);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0193, code lost:
        if (r0.i(r32, r19, r25, r20, r26) == false) goto L_0x01ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0196  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r33, int r34) {
        /*
            r32 = this;
            r6 = r32
            r32.t()
            int r0 = r32.getChildCount()
            r7 = 0
            r1 = r7
        L_0x000b:
            r2 = 1
            if (r1 >= r0) goto L_0x0038
            android.view.View r3 = r6.getChildAt(r1)
            s.c r4 = r6.f1005b
            java.lang.Object r4 = r4.f7135b
            p.f r4 = (p.f) r4
            int r5 = r4.f6235h
            r8 = r7
        L_0x001b:
            if (r8 >= r5) goto L_0x0030
            java.lang.Object r9 = r4.l(r8)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x002d
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L_0x002d
            r3 = r2
            goto L_0x0031
        L_0x002d:
            int r8 = r8 + 1
            goto L_0x001b
        L_0x0030:
            r3 = r7
        L_0x0031:
            if (r3 == 0) goto L_0x0035
            r0 = r2
            goto L_0x0039
        L_0x0035:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x0038:
            r0 = r7
        L_0x0039:
            boolean r1 = r6.f1015m
            if (r0 == r1) goto L_0x006d
            if (r0 == 0) goto L_0x005a
            boolean r0 = r6.f1010h
            if (r0 == 0) goto L_0x0057
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r6.f1014l
            if (r0 != 0) goto L_0x004e
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>()
            r6.f1014l = r0
        L_0x004e:
            android.view.ViewTreeObserver r0 = r32.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r6.f1014l
            r0.addOnPreDrawListener(r1)
        L_0x0057:
            r6.f1015m = r2
            goto L_0x006d
        L_0x005a:
            boolean r0 = r6.f1010h
            if (r0 == 0) goto L_0x006b
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r6.f1014l
            if (r0 == 0) goto L_0x006b
            android.view.ViewTreeObserver r0 = r32.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r6.f1014l
            r0.removeOnPreDrawListener(r1)
        L_0x006b:
            r6.f1015m = r7
        L_0x006d:
            int r8 = r32.getPaddingLeft()
            int r0 = r32.getPaddingTop()
            int r9 = r32.getPaddingRight()
            int r1 = r32.getPaddingBottom()
            int[] r3 = j0.x.f4957a
            int r10 = j0.x.d.d(r32)
            if (r10 != r2) goto L_0x0087
            r11 = r2
            goto L_0x0088
        L_0x0087:
            r11 = r7
        L_0x0088:
            int r12 = android.view.View.MeasureSpec.getMode(r33)
            int r13 = android.view.View.MeasureSpec.getSize(r33)
            int r14 = android.view.View.MeasureSpec.getMode(r34)
            int r15 = android.view.View.MeasureSpec.getSize(r34)
            int r16 = r8 + r9
            int r17 = r0 + r1
            int r0 = r32.getSuggestedMinimumWidth()
            int r1 = r32.getSuggestedMinimumHeight()
            j0.d0 r3 = r6.f1016n
            if (r3 == 0) goto L_0x00b1
            boolean r3 = j0.x.c.b(r32)
            if (r3 == 0) goto L_0x00b1
            r18 = r2
            goto L_0x00b3
        L_0x00b1:
            r18 = r7
        L_0x00b3:
            java.util.ArrayList r5 = r6.f1004a
            int r4 = r5.size()
            r3 = r0
            r2 = r1
            r0 = r7
            r1 = r0
        L_0x00bd:
            if (r1 >= r4) goto L_0x01f6
            java.lang.Object r19 = r5.get(r1)
            android.view.View r19 = (android.view.View) r19
            int r7 = r19.getVisibility()
            r21 = r0
            r0 = 8
            if (r7 != r0) goto L_0x00e1
            r28 = r4
            r29 = r5
            r22 = r8
            r23 = r9
            r27 = r10
            r0 = r21
            r24 = 0
            r21 = r1
            goto L_0x01e6
        L_0x00e1:
            android.view.ViewGroup$LayoutParams r0 = r19.getLayoutParams()
            r7 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r7
            int r0 = r7.e
            if (r0 < 0) goto L_0x012d
            if (r12 == 0) goto L_0x012d
            int r0 = r6.m(r0)
            r22 = r1
            int r1 = r7.f1025c
            if (r1 != 0) goto L_0x00fb
            r1 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00fb:
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r10)
            r1 = r1 & 7
            r23 = r2
            r2 = 3
            if (r1 != r2) goto L_0x0108
            if (r11 == 0) goto L_0x010d
        L_0x0108:
            r2 = 5
            if (r1 != r2) goto L_0x0119
            if (r11 == 0) goto L_0x0119
        L_0x010d:
            int r1 = r13 - r9
            int r1 = r1 - r0
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
            r2 = r0
            r20 = r1
            goto L_0x0134
        L_0x0119:
            if (r1 != r2) goto L_0x011d
            if (r11 == 0) goto L_0x0122
        L_0x011d:
            r2 = 3
            if (r1 != r2) goto L_0x012b
            if (r11 == 0) goto L_0x012b
        L_0x0122:
            int r0 = r0 - r8
            r2 = 0
            int r0 = java.lang.Math.max(r2, r0)
            r20 = r0
            goto L_0x0134
        L_0x012b:
            r2 = 0
            goto L_0x0132
        L_0x012d:
            r22 = r1
            r23 = r2
            goto L_0x012b
        L_0x0132:
            r20 = r2
        L_0x0134:
            if (r18 == 0) goto L_0x0167
            boolean r0 = j0.x.c.b(r19)
            if (r0 != 0) goto L_0x0167
            j0.d0 r0 = r6.f1016n
            int r0 = r0.b()
            j0.d0 r1 = r6.f1016n
            int r1 = r1.c()
            int r0 = r0 + r1
            j0.d0 r1 = r6.f1016n
            int r1 = r1.d()
            j0.d0 r2 = r6.f1016n
            int r2 = r2.a()
            int r1 = r1 + r2
            int r0 = r13 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r12)
            int r1 = r15 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r14)
            r25 = r0
            r26 = r1
            goto L_0x016b
        L_0x0167:
            r25 = r33
            r26 = r34
        L_0x016b:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r7.f1023a
            if (r0 == 0) goto L_0x0196
            r2 = r21
            r21 = r22
            r1 = r32
            r22 = r8
            r24 = 0
            r8 = r2
            r30 = r23
            r23 = r9
            r9 = r30
            r2 = r19
            r27 = r10
            r10 = r3
            r3 = r25
            r28 = r4
            r4 = r20
            r29 = r5
            r5 = r26
            boolean r0 = r0.i(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x01bb
            goto L_0x01ad
        L_0x0196:
            r28 = r4
            r29 = r5
            r27 = r10
            r24 = 0
            r10 = r3
            r30 = r22
            r22 = r8
            r8 = r21
            r21 = r30
            r31 = r23
            r23 = r9
            r9 = r31
        L_0x01ad:
            r5 = 0
            r0 = r32
            r1 = r19
            r2 = r25
            r3 = r20
            r4 = r26
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x01bb:
            int r0 = r19.getMeasuredWidth()
            int r0 = r16 + r0
            int r1 = r7.leftMargin
            int r0 = r0 + r1
            int r1 = r7.rightMargin
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r10, r0)
            int r1 = r19.getMeasuredHeight()
            int r1 = r17 + r1
            int r2 = r7.topMargin
            int r1 = r1 + r2
            int r2 = r7.bottomMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r9, r1)
            int r2 = r19.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r3 = r0
            r0 = r2
            r2 = r1
        L_0x01e6:
            int r1 = r21 + 1
            r8 = r22
            r9 = r23
            r7 = r24
            r10 = r27
            r4 = r28
            r5 = r29
            goto L_0x00bd
        L_0x01f6:
            r8 = r0
            r9 = r2
            r10 = r3
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r1 = r33
            int r0 = android.view.View.resolveSizeAndState(r10, r1, r0)
            int r1 = r8 << 16
            r2 = r34
            int r1 = android.view.View.resolveSizeAndState(r9, r2, r1)
            r6.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f9, float f10, boolean z8) {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.f1023a;
                }
            }
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f9, float f10) {
        c cVar;
        int childCount = getChildCount();
        boolean z8 = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f1023a) != null) {
                    z8 |= cVar.j(view);
                }
            }
        }
        return z8;
    }

    public final void onNestedPreScroll(View view, int i8, int i9, int[] iArr) {
        c(view, i8, i9, iArr, 0);
    }

    public final void onNestedScroll(View view, int i8, int i9, int i10, int i11) {
        f(view, i8, i9, i10, i11, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i8) {
        a(view, view2, i8, 0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f6241f);
        SparseArray<Parcelable> sparseArray = hVar.f1040h;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            int id = childAt.getId();
            c cVar = n(childAt).f1023a;
            if (!(id == -1 || cVar == null || (parcelable2 = sparseArray.get(id)) == null)) {
                cVar.n(childAt, parcelable2);
            }
        }
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable o8;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f1023a;
            if (!(id == -1 || cVar == null || (o8 = cVar.o(childAt)) == null)) {
                sparseArray.append(id, o8);
            }
        }
        hVar.f1040h = sparseArray;
        return hVar;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i8) {
        return g(view, view2, i8, 0);
    }

    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1012j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.s(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.view.View r6 = r0.f1012j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f1023a
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.f1012j
            boolean r6 = r6.r(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = r5
        L_0x002a:
            android.view.View r7 = r0.f1012j
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.u(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0298 A[EDGE_INSN: B:134:0x0298->B:100:0x0298 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(int r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            int[] r2 = j0.x.f4957a
            int r2 = j0.x.d.d(r25)
            java.util.ArrayList r9 = r0.f1004a
            int r10 = r9.size()
            android.graphics.Rect r11 = d()
            android.graphics.Rect r12 = d()
            android.graphics.Rect r13 = d()
            r3 = r1
            r15 = 0
        L_0x001e:
            i0.e r8 = f1003x
            if (r15 >= r10) goto L_0x02f2
            java.lang.Object r4 = r9.get(r15)
            r7 = r4
            android.view.View r7 = (android.view.View) r7
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            r6 = r4
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            if (r3 != 0) goto L_0x0042
            int r4 = r7.getVisibility()
            r5 = 8
            if (r4 != r5) goto L_0x0042
            r7 = r9
            r6 = r10
            r5 = r13
            r21 = r15
            r14 = 0
            goto L_0x02eb
        L_0x0042:
            r5 = 0
        L_0x0043:
            if (r5 >= r15) goto L_0x0109
            java.lang.Object r3 = r9.get(r5)
            android.view.View r3 = (android.view.View) r3
            android.view.View r4 = r6.f1033l
            if (r4 != r3) goto L_0x00eb
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            r4 = r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r4
            android.view.View r3 = r4.f1032k
            if (r3 == 0) goto L_0x00eb
            android.graphics.Rect r3 = d()
            android.graphics.Rect r14 = d()
            r17 = r9
            android.graphics.Rect r9 = d()
            r18 = r5
            android.view.View r5 = r4.f1032k
            r0.k(r5, r3)
            r5 = 0
            r0.i(r7, r14, r5)
            int r5 = r7.getMeasuredWidth()
            r19 = r10
            int r10 = r7.getMeasuredHeight()
            r20 = r3
            r3 = r2
            r16 = r4
            r21 = r15
            r15 = 1
            r4 = r20
            r22 = r5
            r5 = r9
            r23 = r6
            r6 = r16
            r15 = r7
            r7 = r22
            r24 = r13
            r13 = r8
            r8 = r10
            l(r3, r4, r5, r6, r7, r8)
            int r3 = r9.left
            int r4 = r14.left
            if (r3 != r4) goto L_0x00ab
            int r3 = r9.top
            int r4 = r14.top
            if (r3 == r4) goto L_0x00a5
            goto L_0x00ab
        L_0x00a5:
            r3 = r16
            r5 = r22
            r4 = 0
            goto L_0x00b0
        L_0x00ab:
            r3 = r16
            r5 = r22
            r4 = 1
        L_0x00b0:
            r0.h(r3, r9, r5, r10)
            int r5 = r9.left
            int r6 = r14.left
            int r5 = r5 - r6
            int r6 = r9.top
            int r7 = r14.top
            int r6 = r6 - r7
            if (r5 == 0) goto L_0x00c4
            int[] r7 = j0.x.f4957a
            r15.offsetLeftAndRight(r5)
        L_0x00c4:
            if (r6 == 0) goto L_0x00cb
            int[] r5 = j0.x.f4957a
            r15.offsetTopAndBottom(r6)
        L_0x00cb:
            if (r4 == 0) goto L_0x00d6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r3.f1023a
            if (r4 == 0) goto L_0x00d6
            android.view.View r3 = r3.f1032k
            r4.d(r0, r15, r3)
        L_0x00d6:
            r20.setEmpty()
            r3 = r20
            r13.a(r3)
            r14.setEmpty()
            r13.a(r14)
            r9.setEmpty()
            r13.a(r9)
            goto L_0x00f9
        L_0x00eb:
            r18 = r5
            r23 = r6
            r17 = r9
            r19 = r10
            r24 = r13
            r21 = r15
            r15 = r7
            r13 = r8
        L_0x00f9:
            int r5 = r18 + 1
            r8 = r13
            r7 = r15
            r9 = r17
            r10 = r19
            r15 = r21
            r6 = r23
            r13 = r24
            goto L_0x0043
        L_0x0109:
            r23 = r6
            r17 = r9
            r19 = r10
            r24 = r13
            r21 = r15
            r3 = 1
            r15 = r7
            r13 = r8
            r0.i(r15, r12, r3)
            r4 = r23
            int r3 = r4.f1028g
            r5 = 48
            r6 = 80
            r7 = 3
            r8 = 5
            if (r3 == 0) goto L_0x0173
            boolean r3 = r12.isEmpty()
            if (r3 != 0) goto L_0x0173
            int r3 = r4.f1028g
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r2)
            r9 = r3 & 112(0x70, float:1.57E-43)
            if (r9 == r5) goto L_0x0148
            if (r9 == r6) goto L_0x0138
            goto L_0x0152
        L_0x0138:
            int r9 = r11.bottom
            int r10 = r25.getHeight()
            int r14 = r12.top
            int r10 = r10 - r14
            int r9 = java.lang.Math.max(r9, r10)
            r11.bottom = r9
            goto L_0x0152
        L_0x0148:
            int r9 = r11.top
            int r10 = r12.bottom
            int r9 = java.lang.Math.max(r9, r10)
            r11.top = r9
        L_0x0152:
            r3 = r3 & 7
            if (r3 == r7) goto L_0x0169
            if (r3 == r8) goto L_0x0159
            goto L_0x0173
        L_0x0159:
            int r3 = r11.right
            int r9 = r25.getWidth()
            int r10 = r12.left
            int r9 = r9 - r10
            int r3 = java.lang.Math.max(r3, r9)
            r11.right = r3
            goto L_0x0173
        L_0x0169:
            int r3 = r11.left
            int r9 = r12.right
            int r3 = java.lang.Math.max(r3, r9)
            r11.left = r3
        L_0x0173:
            int r3 = r4.f1029h
            if (r3 == 0) goto L_0x027e
            int r3 = r15.getVisibility()
            if (r3 != 0) goto L_0x027e
            int[] r3 = j0.x.f4957a
            boolean r3 = j0.x.f.c(r15)
            if (r3 != 0) goto L_0x0187
            goto L_0x027e
        L_0x0187:
            int r3 = r15.getWidth()
            if (r3 <= 0) goto L_0x027e
            int r3 = r15.getHeight()
            if (r3 > 0) goto L_0x0195
            goto L_0x027e
        L_0x0195:
            android.view.ViewGroup$LayoutParams r3 = r15.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r3.f1023a
            android.graphics.Rect r9 = d()
            android.graphics.Rect r10 = d()
            int r14 = r15.getLeft()
            int r8 = r15.getTop()
            int r7 = r15.getRight()
            int r6 = r15.getBottom()
            r10.set(r14, r8, r7, r6)
            if (r4 == 0) goto L_0x01eb
            boolean r4 = r4.a(r15)
            if (r4 == 0) goto L_0x01eb
            boolean r4 = r10.contains(r9)
            if (r4 == 0) goto L_0x01c7
            goto L_0x01ee
        L_0x01c7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Rect should be within the child's bounds. Rect:"
            r1.<init>(r2)
            java.lang.String r2 = r9.toShortString()
            r1.append(r2)
            java.lang.String r2 = " | Bounds:"
            r1.append(r2)
            java.lang.String r2 = r10.toShortString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01eb:
            r9.set(r10)
        L_0x01ee:
            r10.setEmpty()
            r13.a(r10)
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L_0x0202
        L_0x01fa:
            r9.setEmpty()
            r13.a(r9)
            goto L_0x027e
        L_0x0202:
            int r4 = r3.f1029h
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r2)
            r6 = r4 & 48
            if (r6 != r5) goto L_0x021e
            int r5 = r9.top
            int r6 = r3.topMargin
            int r5 = r5 - r6
            int r6 = r3.f1031j
            int r5 = r5 - r6
            int r6 = r11.top
            if (r5 >= r6) goto L_0x021e
            int r6 = r6 - r5
            w(r15, r6)
            r5 = 1
            goto L_0x021f
        L_0x021e:
            r5 = 0
        L_0x021f:
            r6 = r4 & 80
            r7 = 80
            if (r6 != r7) goto L_0x023b
            int r6 = r25.getHeight()
            int r7 = r9.bottom
            int r6 = r6 - r7
            int r7 = r3.bottomMargin
            int r6 = r6 - r7
            int r7 = r3.f1031j
            int r6 = r6 + r7
            int r7 = r11.bottom
            if (r6 >= r7) goto L_0x023b
            int r6 = r6 - r7
            w(r15, r6)
            r5 = 1
        L_0x023b:
            if (r5 != 0) goto L_0x0241
            r5 = 0
            w(r15, r5)
        L_0x0241:
            r5 = r4 & 3
            r6 = 3
            if (r5 != r6) goto L_0x0258
            int r5 = r9.left
            int r6 = r3.leftMargin
            int r5 = r5 - r6
            int r6 = r3.f1030i
            int r5 = r5 - r6
            int r6 = r11.left
            if (r5 >= r6) goto L_0x0258
            int r6 = r6 - r5
            v(r15, r6)
            r5 = 1
            goto L_0x0259
        L_0x0258:
            r5 = 0
        L_0x0259:
            r4 = r4 & 5
            r6 = 5
            if (r4 != r6) goto L_0x0275
            int r4 = r25.getWidth()
            int r6 = r9.right
            int r4 = r4 - r6
            int r6 = r3.rightMargin
            int r4 = r4 - r6
            int r3 = r3.f1030i
            int r4 = r4 + r3
            int r3 = r11.right
            if (r4 >= r3) goto L_0x0275
            int r4 = r4 - r3
            v(r15, r4)
            r4 = 1
            goto L_0x0276
        L_0x0275:
            r4 = r5
        L_0x0276:
            if (r4 != 0) goto L_0x01fa
            r3 = 0
            v(r15, r3)
            goto L_0x01fa
        L_0x027e:
            r3 = 2
            if (r1 == r3) goto L_0x02a6
            android.view.ViewGroup$LayoutParams r4 = r15.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r4
            android.graphics.Rect r4 = r4.f1038q
            r5 = r24
            r5.set(r4)
            boolean r4 = r5.equals(r12)
            if (r4 == 0) goto L_0x029a
            r7 = r17
            r6 = r19
        L_0x0298:
            r14 = 0
            goto L_0x02ea
        L_0x029a:
            android.view.ViewGroup$LayoutParams r4 = r15.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r4
            android.graphics.Rect r4 = r4.f1038q
            r4.set(r12)
            goto L_0x02a8
        L_0x02a6:
            r5 = r24
        L_0x02a8:
            int r4 = r21 + 1
            r6 = r19
        L_0x02ac:
            r7 = r17
            if (r4 >= r6) goto L_0x0298
            java.lang.Object r8 = r7.get(r4)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r9
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r10 = r9.f1023a
            if (r10 == 0) goto L_0x02e3
            boolean r13 = r10.b(r8, r15)
            if (r13 == 0) goto L_0x02e3
            if (r1 != 0) goto L_0x02d1
            boolean r13 = r9.f1037p
            if (r13 == 0) goto L_0x02d1
            r14 = 0
            r9.f1037p = r14
            r10 = 1
            goto L_0x02e5
        L_0x02d1:
            r14 = 0
            if (r1 == r3) goto L_0x02d9
            boolean r8 = r10.d(r0, r8, r15)
            goto L_0x02dd
        L_0x02d9:
            r10.e(r0, r15)
            r8 = 1
        L_0x02dd:
            r10 = 1
            if (r1 != r10) goto L_0x02e5
            r9.f1037p = r8
            goto L_0x02e5
        L_0x02e3:
            r10 = 1
            r14 = 0
        L_0x02e5:
            int r4 = r4 + 1
            r17 = r7
            goto L_0x02ac
        L_0x02ea:
            r3 = r1
        L_0x02eb:
            int r15 = r21 + 1
            r13 = r5
            r10 = r6
            r9 = r7
            goto L_0x001e
        L_0x02f2:
            r5 = r13
            r13 = r8
            r11.setEmpty()
            r13.a(r11)
            r12.setEmpty()
            r13.a(r12)
            r5.setEmpty()
            r13.a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    public final void q(View view, int i8) {
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f1032k;
        int i9 = 0;
        if (!(view2 == null && fVar.f1027f != -1)) {
            i0.e eVar = f1003x;
            if (view2 != null) {
                Rect d9 = d();
                Rect d10 = d();
                try {
                    k(view2, d9);
                    f fVar2 = (f) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    l(i8, d9, d10, fVar2, measuredWidth, measuredHeight);
                    h(fVar2, d10, measuredWidth, measuredHeight);
                    view.layout(d10.left, d10.top, d10.right, d10.bottom);
                } finally {
                    d9.setEmpty();
                    eVar.a(d9);
                    d10.setEmpty();
                    eVar.a(d10);
                }
            } else {
                int i10 = fVar.e;
                if (i10 >= 0) {
                    f fVar3 = (f) view.getLayoutParams();
                    int i11 = fVar3.f1025c;
                    if (i11 == 0) {
                        i11 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i11, i8);
                    int i12 = absoluteGravity & 7;
                    int i13 = absoluteGravity & 112;
                    int width = getWidth();
                    int height = getHeight();
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    if (i8 == 1) {
                        i10 = width - i10;
                    }
                    int m8 = m(i10) - measuredWidth2;
                    if (i12 == 1) {
                        m8 += measuredWidth2 / 2;
                    } else if (i12 == 5) {
                        m8 += measuredWidth2;
                    }
                    if (i13 == 16) {
                        i9 = 0 + (measuredHeight2 / 2);
                    } else if (i13 == 80) {
                        i9 = measuredHeight2 + 0;
                    }
                    int max = Math.max(getPaddingLeft() + fVar3.leftMargin, Math.min(m8, ((width - getPaddingRight()) - measuredWidth2) - fVar3.rightMargin));
                    int max2 = Math.max(getPaddingTop() + fVar3.topMargin, Math.min(i9, ((height - getPaddingBottom()) - measuredHeight2) - fVar3.bottomMargin));
                    view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                    return;
                }
                f fVar4 = (f) view.getLayoutParams();
                Rect d11 = d();
                d11.set(getPaddingLeft() + fVar4.leftMargin, getPaddingTop() + fVar4.topMargin, (getWidth() - getPaddingRight()) - fVar4.rightMargin, (getHeight() - getPaddingBottom()) - fVar4.bottomMargin);
                if (this.f1016n != null) {
                    int[] iArr = x.f4957a;
                    if (x.c.b(this) && !x.c.b(view)) {
                        d11.left += this.f1016n.b();
                        d11.top += this.f1016n.d();
                        d11.right -= this.f1016n.c();
                        d11.bottom -= this.f1016n.a();
                    }
                }
                Rect d12 = d();
                int i14 = fVar4.f1025c;
                if ((i14 & 7) == 0) {
                    i14 |= 8388611;
                }
                if ((i14 & 112) == 0) {
                    i14 |= 48;
                }
                j0.f.b(i14, view.getMeasuredWidth(), view.getMeasuredHeight(), d11, d12, i8);
                view.layout(d12.left, d12.top, d12.right, d12.bottom);
                d11.setEmpty();
                eVar.a(d11);
                d12.setEmpty();
                eVar.a(d12);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public final void r(View view, int i8, int i9, int i10) {
        measureChildWithMargins(view, i8, i9, i10, 0);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z8) {
        c cVar = ((f) view.getLayoutParams()).f1023a;
        if (cVar == null || !cVar.m(this, view, rect, z8)) {
            return super.requestChildRectangleOnScreen(view, rect, z8);
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z8) {
        super.requestDisallowInterceptTouchEvent(z8);
        if (z8 && !this.f1009g) {
            u(false);
            this.f1009g = true;
        }
    }

    public final boolean s(MotionEvent motionEvent, int i8) {
        boolean z8;
        MotionEvent motionEvent2 = motionEvent;
        int i9 = i8;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1006c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator<View> comparator = w;
        if (comparator != null) {
            Collections.sort(arrayList, comparator);
        }
        int size = arrayList.size();
        MotionEvent motionEvent3 = null;
        boolean z9 = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) arrayList.get(i11);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.f1023a;
            if ((!z9 && !z10) || actionMasked == 0) {
                if (!z9 && cVar != null) {
                    if (i9 == 0) {
                        z9 = cVar.g(this, view, motionEvent2);
                    } else if (i9 == 1) {
                        z9 = cVar.r(this, view, motionEvent2);
                    }
                    if (z9) {
                        this.f1012j = view;
                    }
                }
                if (fVar.f1023a == null) {
                    fVar.f1034m = false;
                }
                boolean z11 = fVar.f1034m;
                if (z11) {
                    z8 = true;
                } else {
                    z8 = z11 | false;
                    fVar.f1034m = z8;
                }
                z10 = z8 && !z11;
                if (z8 && !z10) {
                    break;
                }
            } else if (cVar != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i9 == 0) {
                    cVar.g(this, view, motionEvent3);
                } else if (i9 == 1) {
                    cVar.r(this, view, motionEvent3);
                }
            }
        }
        arrayList.clear();
        return z9;
    }

    public void setFitsSystemWindows(boolean z8) {
        super.setFitsSystemWindows(z8);
        x();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1019q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1018p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1018p = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f1018p.setState(getDrawableState());
                }
                Drawable drawable4 = this.f1018p;
                int[] iArr = x.f4957a;
                d0.c.b(drawable4, x.d.d(this));
                this.f1018p.setVisible(getVisibility() == 0, false);
                this.f1018p.setCallback(this);
            }
            int[] iArr2 = x.f4957a;
            x.c.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i8) {
        setStatusBarBackground(new ColorDrawable(i8));
    }

    public void setStatusBarBackgroundResource(int i8) {
        Drawable drawable;
        if (i8 != 0) {
            Context context = getContext();
            Object obj = a0.a.f10a;
            drawable = a.b.b(context, i8);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i8) {
        super.setVisibility(i8);
        boolean z8 = i8 == 0;
        Drawable drawable = this.f1018p;
        if (drawable != null && drawable.isVisible() != z8) {
            this.f1018p.setVisible(z8, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
        if (r12 != false) goto L_0x00c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x015a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t() {
        /*
            r16 = this;
            r0 = r16
            java.util.ArrayList r1 = r0.f1004a
            r1.clear()
            s.c r2 = r0.f1005b
            java.lang.Object r3 = r2.f7135b
            p.f r3 = (p.f) r3
            int r4 = r3.f6235h
            r6 = 0
        L_0x0010:
            java.lang.Object r7 = r2.f7134a
            if (r6 >= r4) goto L_0x0027
            java.lang.Object r8 = r3.l(r6)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 == 0) goto L_0x0024
            r8.clear()
            i0.d r7 = (i0.d) r7
            r7.a(r8)
        L_0x0024:
            int r6 = r6 + 1
            goto L_0x0010
        L_0x0027:
            r3.clear()
            int r3 = r16.getChildCount()
            r4 = 0
        L_0x002f:
            java.lang.Object r6 = r2.f7135b
            if (r4 >= r3) goto L_0x0186
            android.view.View r8 = r0.getChildAt(r4)
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r9 = n(r8)
            r10 = 0
            r11 = 1
            r12 = -1
            int r13 = r9.f1027f
            if (r13 != r12) goto L_0x0048
            r9.f1033l = r10
            r9.f1032k = r10
            goto L_0x00c2
        L_0x0048:
            android.view.View r12 = r9.f1032k
            if (r12 == 0) goto L_0x0077
            int r12 = r12.getId()
            if (r12 == r13) goto L_0x0053
            goto L_0x0070
        L_0x0053:
            android.view.View r12 = r9.f1032k
            android.view.ViewParent r14 = r12.getParent()
        L_0x0059:
            if (r14 == r0) goto L_0x0072
            if (r14 == 0) goto L_0x006c
            if (r14 != r8) goto L_0x0060
            goto L_0x006c
        L_0x0060:
            boolean r15 = r14 instanceof android.view.View
            if (r15 == 0) goto L_0x0067
            r12 = r14
            android.view.View r12 = (android.view.View) r12
        L_0x0067:
            android.view.ViewParent r14 = r14.getParent()
            goto L_0x0059
        L_0x006c:
            r9.f1033l = r10
            r9.f1032k = r10
        L_0x0070:
            r12 = 0
            goto L_0x0075
        L_0x0072:
            r9.f1033l = r12
            r12 = r11
        L_0x0075:
            if (r12 != 0) goto L_0x00c2
        L_0x0077:
            android.view.View r12 = r0.findViewById(r13)
            r9.f1032k = r12
            if (r12 == 0) goto L_0x00b8
            if (r12 != r0) goto L_0x0090
            boolean r12 = r16.isInEditMode()
            if (r12 == 0) goto L_0x0088
            goto L_0x00be
        L_0x0088:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x0090:
            android.view.ViewParent r13 = r12.getParent()
        L_0x0094:
            if (r13 == r0) goto L_0x00b5
            if (r13 == 0) goto L_0x00b5
            if (r13 != r8) goto L_0x00a9
            boolean r12 = r16.isInEditMode()
            if (r12 == 0) goto L_0x00a1
            goto L_0x00be
        L_0x00a1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x00a9:
            boolean r14 = r13 instanceof android.view.View
            if (r14 == 0) goto L_0x00b0
            r12 = r13
            android.view.View r12 = (android.view.View) r12
        L_0x00b0:
            android.view.ViewParent r13 = r13.getParent()
            goto L_0x0094
        L_0x00b5:
            r9.f1033l = r12
            goto L_0x00c2
        L_0x00b8:
            boolean r12 = r16.isInEditMode()
            if (r12 == 0) goto L_0x0162
        L_0x00be:
            r9.f1033l = r10
            r9.f1032k = r10
        L_0x00c2:
            r12 = r6
            p.f r12 = (p.f) r12
            boolean r13 = r12.containsKey(r8)
            if (r13 != 0) goto L_0x00ce
            r12.put(r8, r10)
        L_0x00ce:
            r12 = 0
        L_0x00cf:
            if (r12 >= r3) goto L_0x015e
            if (r12 != r4) goto L_0x00d5
            goto L_0x015a
        L_0x00d5:
            android.view.View r13 = r0.getChildAt(r12)
            android.view.View r14 = r9.f1033l
            if (r13 == r14) goto L_0x010c
            int[] r14 = j0.x.f4957a
            int r14 = j0.x.d.d(r16)
            android.view.ViewGroup$LayoutParams r15 = r13.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r15 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r15
            int r15 = r15.f1028g
            int r15 = android.view.Gravity.getAbsoluteGravity(r15, r14)
            if (r15 == 0) goto L_0x00fc
            int r5 = r9.f1029h
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r14)
            r5 = r5 & r15
            if (r5 != r15) goto L_0x00fc
            r5 = r11
            goto L_0x00fd
        L_0x00fc:
            r5 = 0
        L_0x00fd:
            if (r5 != 0) goto L_0x010c
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r5 = r9.f1023a
            if (r5 == 0) goto L_0x010a
            boolean r5 = r5.b(r8, r13)
            if (r5 == 0) goto L_0x010a
            goto L_0x010c
        L_0x010a:
            r5 = 0
            goto L_0x010d
        L_0x010c:
            r5 = r11
        L_0x010d:
            if (r5 == 0) goto L_0x015a
            r5 = r6
            p.f r5 = (p.f) r5
            boolean r5 = r5.containsKey(r13)
            if (r5 != 0) goto L_0x0124
            r5 = r6
            p.f r5 = (p.f) r5
            boolean r14 = r5.containsKey(r13)
            if (r14 != 0) goto L_0x0124
            r5.put(r13, r10)
        L_0x0124:
            r5 = r6
            p.f r5 = (p.f) r5
            boolean r14 = r5.containsKey(r13)
            if (r14 == 0) goto L_0x0152
            boolean r14 = r5.containsKey(r8)
            if (r14 == 0) goto L_0x0152
            java.lang.Object r14 = r5.getOrDefault(r13, r10)
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            if (r14 != 0) goto L_0x014e
            r14 = r7
            i0.d r14 = (i0.d) r14
            java.lang.Object r14 = r14.b()
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            if (r14 != 0) goto L_0x014b
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x014b:
            r5.put(r13, r14)
        L_0x014e:
            r14.add(r8)
            goto L_0x015a
        L_0x0152:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x015a:
            int r12 = r12 + 1
            goto L_0x00cf
        L_0x015e:
            int r4 = r4 + 1
            goto L_0x002f
        L_0x0162:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not find CoordinatorLayout descendant view with id "
            r2.<init>(r3)
            android.content.res.Resources r0 = r16.getResources()
            java.lang.String r0 = r0.getResourceName(r13)
            r2.append(r0)
            java.lang.String r0 = " to anchor view "
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0186:
            java.lang.Object r0 = r2.f7136c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.lang.Object r3 = r2.f7137d
            java.util.HashSet r3 = (java.util.HashSet) r3
            r3.clear()
            p.f r6 = (p.f) r6
            int r3 = r6.f6235h
            r5 = 0
        L_0x0199:
            if (r5 >= r3) goto L_0x01a9
            java.lang.Object r4 = r6.h(r5)
            java.lang.Object r7 = r2.f7137d
            java.util.HashSet r7 = (java.util.HashSet) r7
            r2.a(r4, r0, r7)
            int r5 = r5 + 1
            goto L_0x0199
        L_0x01a9:
            r1.addAll(r0)
            java.util.Collections.reverse(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.t():void");
    }

    public final void u(boolean z8) {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            c cVar = ((f) childAt.getLayoutParams()).f1023a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z8) {
                    cVar.g(this, childAt, obtain);
                } else {
                    cVar.r(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            ((f) getChildAt(i9).getLayoutParams()).f1034m = false;
        }
        this.f1012j = null;
        this.f1009g = false;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1018p;
    }

    public final void x() {
        int[] iArr = x.f4957a;
        if (x.c.b(this)) {
            if (this.r == null) {
                this.r = new a();
            }
            x.h.u(this, this.r);
            setSystemUiVisibility(1280);
            return;
        }
        x.h.u(this, (p) null);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }
}
