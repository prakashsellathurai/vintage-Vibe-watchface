package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.health.services.client.R;
import j0.a;
import j0.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import k0.c;
import q0.c;
import u4.l;
import u4.m;
import u4.n;
import y4.f;
import y4.i;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public boolean A;
    public int B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public WeakReference<V> G;
    public WeakReference<View> H;
    public final ArrayList<c> I = new ArrayList<>();
    public VelocityTracker J;
    public int K;
    public int L;
    public boolean M;
    public HashMap N;
    public int O = -1;
    public final b P = new b();

    /* renamed from: a  reason: collision with root package name */
    public int f3089a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3090b = true;

    /* renamed from: c  reason: collision with root package name */
    public final float f3091c;

    /* renamed from: d  reason: collision with root package name */
    public int f3092d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public int f3093f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3094g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3095h;

    /* renamed from: i  reason: collision with root package name */
    public f f3096i;

    /* renamed from: j  reason: collision with root package name */
    public int f3097j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3098k;

    /* renamed from: l  reason: collision with root package name */
    public i f3099l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3100m;

    /* renamed from: n  reason: collision with root package name */
    public BottomSheetBehavior<V>.e f3101n = null;

    /* renamed from: o  reason: collision with root package name */
    public ValueAnimator f3102o;

    /* renamed from: p  reason: collision with root package name */
    public int f3103p;

    /* renamed from: q  reason: collision with root package name */
    public int f3104q;
    public int r;

    /* renamed from: s  reason: collision with root package name */
    public float f3105s = 0.5f;

    /* renamed from: t  reason: collision with root package name */
    public int f3106t;

    /* renamed from: u  reason: collision with root package name */
    public final float f3107u = -1.0f;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3108v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3109x = true;
    public int y = 4;

    /* renamed from: z  reason: collision with root package name */
    public q0.c f3110z;

    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ View f3111f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f3112g;

        public a(View view, int i8) {
            this.f3111f = view;
            this.f3112g = i8;
        }

        public final void run() {
            BottomSheetBehavior.this.D(this.f3111f, this.f3112g);
        }
    }

    public class b extends c.C0112c {
        public b() {
        }

        public final int a(View view, int i8) {
            return view.getLeft();
        }

        public final int b(View view, int i8) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return a1.a.l(i8, bottomSheetBehavior.x(), bottomSheetBehavior.f3108v ? bottomSheetBehavior.F : bottomSheetBehavior.f3106t);
        }

        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f3108v ? bottomSheetBehavior.F : bottomSheetBehavior.f3106t;
        }

        public final void f(int i8) {
            if (i8 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f3109x) {
                    bottomSheetBehavior.C(1);
                }
            }
        }

        public final void g(View view, int i8, int i9) {
            BottomSheetBehavior.this.v(i9);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
            if (java.lang.Math.abs(r5.getTop() - r4.f3103p) < java.lang.Math.abs(r5.getTop() - r4.r)) goto L_0x00c3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0095, code lost:
            if (java.lang.Math.abs(r6 - r4.r) < java.lang.Math.abs(r6 - r4.f3106t)) goto L_0x00d7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00af, code lost:
            if (java.lang.Math.abs(r6 - r4.f3104q) < java.lang.Math.abs(r6 - r4.f3106t)) goto L_0x00b1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c1, code lost:
            if (r6 < java.lang.Math.abs(r6 - r4.f3106t)) goto L_0x00c3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c3, code lost:
            r6 = r4.f3103p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d5, code lost:
            if (java.lang.Math.abs(r6 - r7) < java.lang.Math.abs(r6 - r4.f3106t)) goto L_0x00d7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
            if (r6 > r7) goto L_0x00dd;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void h(android.view.View r5, float r6, float r7) {
            /*
                r4 = this;
                r0 = 0
                int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                r2 = 1
                r3 = 6
                com.google.android.material.bottomsheet.BottomSheetBehavior r4 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                if (r1 >= 0) goto L_0x0019
                boolean r6 = r4.f3090b
                if (r6 == 0) goto L_0x000f
                goto L_0x00b1
            L_0x000f:
                int r6 = r5.getTop()
                int r7 = r4.r
                if (r6 <= r7) goto L_0x00c3
                goto L_0x00dd
            L_0x0019:
                boolean r1 = r4.f3108v
                if (r1 == 0) goto L_0x006c
                boolean r1 = r4.F(r5, r7)
                if (r1 == 0) goto L_0x006c
                float r6 = java.lang.Math.abs(r6)
                float r0 = java.lang.Math.abs(r7)
                int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r6 >= 0) goto L_0x0035
                r6 = 1140457472(0x43fa0000, float:500.0)
                int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r6 > 0) goto L_0x0049
            L_0x0035:
                int r6 = r5.getTop()
                int r7 = r4.F
                int r0 = r4.x()
                int r7 = r7 + r0
                int r7 = r7 / 2
                if (r6 <= r7) goto L_0x0046
                r6 = r2
                goto L_0x0047
            L_0x0046:
                r6 = 0
            L_0x0047:
                if (r6 == 0) goto L_0x004e
            L_0x0049:
                int r7 = r4.F
                r3 = 5
                goto L_0x00dd
            L_0x004e:
                boolean r6 = r4.f3090b
                if (r6 == 0) goto L_0x0053
                goto L_0x00b1
            L_0x0053:
                int r6 = r5.getTop()
                int r7 = r4.f3103p
                int r6 = r6 - r7
                int r6 = java.lang.Math.abs(r6)
                int r7 = r5.getTop()
                int r0 = r4.r
                int r7 = r7 - r0
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto L_0x00d7
                goto L_0x00c3
            L_0x006c:
                int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x0098
                float r6 = java.lang.Math.abs(r6)
                float r7 = java.lang.Math.abs(r7)
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto L_0x007d
                goto L_0x0098
            L_0x007d:
                boolean r6 = r4.f3090b
                if (r6 == 0) goto L_0x0082
                goto L_0x00da
            L_0x0082:
                int r6 = r5.getTop()
                int r7 = r4.r
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r0 = r4.f3106t
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x00da
                goto L_0x00d7
            L_0x0098:
                int r6 = r5.getTop()
                boolean r7 = r4.f3090b
                if (r7 == 0) goto L_0x00b5
                int r7 = r4.f3104q
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r0 = r4.f3106t
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x00da
            L_0x00b1:
                int r6 = r4.f3104q
            L_0x00b3:
                r7 = r6
                goto L_0x00c6
            L_0x00b5:
                int r7 = r4.r
                if (r6 >= r7) goto L_0x00c8
                int r7 = r4.f3106t
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto L_0x00d7
            L_0x00c3:
                int r6 = r4.f3103p
                goto L_0x00b3
            L_0x00c6:
                r3 = 3
                goto L_0x00dd
            L_0x00c8:
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r0 = r4.f3106t
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x00da
            L_0x00d7:
                int r7 = r4.r
                goto L_0x00dd
            L_0x00da:
                int r7 = r4.f3106t
                r3 = 4
            L_0x00dd:
                r4.G(r5, r3, r7, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b.h(android.view.View, float, float):void");
        }

        public final boolean i(View view, int i8) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i9 = bottomSheetBehavior.y;
            if (i9 == 1 || bottomSheetBehavior.M) {
                return false;
            }
            if (i9 == 3 && bottomSheetBehavior.K == i8) {
                WeakReference<View> weakReference = bottomSheetBehavior.H;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = bottomSheetBehavior.G;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public static abstract class c {
        public abstract void a();

        public abstract void b();
    }

    public static class d extends p0.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public final int f3115h;

        /* renamed from: i  reason: collision with root package name */
        public final int f3116i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f3117j;

        /* renamed from: k  reason: collision with root package name */
        public final boolean f3118k;

        /* renamed from: l  reason: collision with root package name */
        public final boolean f3119l;

        public static class a implements Parcelable.ClassLoaderCreator<d> {
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i8) {
                return new d[i8];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3115h = parcel.readInt();
            this.f3116i = parcel.readInt();
            boolean z8 = false;
            this.f3117j = parcel.readInt() == 1;
            this.f3118k = parcel.readInt() == 1;
            this.f3119l = parcel.readInt() == 1 ? true : z8;
        }

        public d(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.f3115h = bottomSheetBehavior.y;
            this.f3116i = bottomSheetBehavior.f3092d;
            this.f3117j = bottomSheetBehavior.f3090b;
            this.f3118k = bottomSheetBehavior.f3108v;
            this.f3119l = bottomSheetBehavior.w;
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f6241f, i8);
            parcel.writeInt(this.f3115h);
            parcel.writeInt(this.f3116i);
            parcel.writeInt(this.f3117j ? 1 : 0);
            parcel.writeInt(this.f3118k ? 1 : 0);
            parcel.writeInt(this.f3119l ? 1 : 0);
        }
    }

    public class e implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final View f3120f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f3121g;

        /* renamed from: h  reason: collision with root package name */
        public int f3122h;

        public e(View view, int i8) {
            this.f3120f = view;
            this.f3122h = i8;
        }

        public final void run() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            q0.c cVar = bottomSheetBehavior.f3110z;
            if (cVar == null || !cVar.g()) {
                bottomSheetBehavior.C(this.f3122h);
            } else {
                int[] iArr = x.f4957a;
                x.c.m(this.f3120f, this);
            }
            this.f3121g = false;
        }
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i8;
        this.f3094g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.L);
        this.f3095h = obtainStyledAttributes.hasValue(11);
        boolean hasValue = obtainStyledAttributes.hasValue(1);
        if (hasValue) {
            u(context, attributeSet, hasValue, v4.c.a(context, obtainStyledAttributes, 1));
        } else {
            u(context, attributeSet, hasValue, (ColorStateList) null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f3102o = ofFloat;
        ofFloat.setDuration(500);
        this.f3102o.addUpdateListener(new k4.a(this));
        this.f3107u = obtainStyledAttributes.getDimension(0, -1.0f);
        TypedValue peekValue = obtainStyledAttributes.peekValue(7);
        if (peekValue == null || (i8 = peekValue.data) != -1) {
            A(obtainStyledAttributes.getDimensionPixelSize(7, -1));
        } else {
            A(i8);
        }
        boolean z8 = obtainStyledAttributes.getBoolean(6, false);
        if (this.f3108v != z8) {
            this.f3108v = z8;
            if (!z8 && this.y == 5) {
                B(4);
            }
            H();
        }
        this.f3098k = obtainStyledAttributes.getBoolean(10, false);
        boolean z9 = obtainStyledAttributes.getBoolean(4, true);
        if (this.f3090b != z9) {
            this.f3090b = z9;
            if (this.G != null) {
                s();
            }
            C((!this.f3090b || this.y != 6) ? this.y : 3);
            H();
        }
        this.w = obtainStyledAttributes.getBoolean(9, false);
        this.f3109x = obtainStyledAttributes.getBoolean(2, true);
        this.f3089a = obtainStyledAttributes.getInt(8, 0);
        float f9 = obtainStyledAttributes.getFloat(5, 0.5f);
        if (f9 <= 0.0f || f9 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f3105s = f9;
        if (this.G != null) {
            this.r = (int) (((float) this.F) * (1.0f - f9));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(3);
        z((peekValue2 == null || peekValue2.type != 16) ? obtainStyledAttributes.getDimensionPixelOffset(3, 0) : peekValue2.data);
        obtainStyledAttributes.recycle();
        this.f3091c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View w(View view) {
        int[] iArr = x.f4957a;
        if (x.h.p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View w8 = w(viewGroup.getChildAt(i8));
            if (w8 != null) {
                return w8;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(int r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = -1
            r2 = 1
            if (r4 != r1) goto L_0x000c
            boolean r4 = r3.e
            if (r4 != 0) goto L_0x001d
            r3.e = r2
            goto L_0x001c
        L_0x000c:
            boolean r1 = r3.e
            if (r1 != 0) goto L_0x0014
            int r1 = r3.f3092d
            if (r1 == r4) goto L_0x001d
        L_0x0014:
            r3.e = r0
            int r4 = java.lang.Math.max(r0, r4)
            r3.f3092d = r4
        L_0x001c:
            r0 = r2
        L_0x001d:
            if (r0 == 0) goto L_0x0022
            r3.K()
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A(int):void");
    }

    public final void B(int i8) {
        if (i8 != this.y) {
            if (this.G != null) {
                E(i8);
            } else if (i8 == 4 || i8 == 3 || i8 == 6 || (this.f3108v && i8 == 5)) {
                this.y = i8;
            }
        }
    }

    public final void C(int i8) {
        if (this.y != i8) {
            this.y = i8;
            WeakReference<V> weakReference = this.G;
            if (weakReference != null && ((View) weakReference.get()) != null) {
                int i9 = 0;
                if (i8 == 3) {
                    J(true);
                } else if (i8 == 6 || i8 == 5 || i8 == 4) {
                    J(false);
                }
                I(i8);
                while (true) {
                    ArrayList<c> arrayList = this.I;
                    if (i9 < arrayList.size()) {
                        arrayList.get(i9).b();
                        i9++;
                    } else {
                        H();
                        return;
                    }
                }
            }
        }
    }

    public final void D(View view, int i8) {
        int i9;
        int i10;
        if (i8 == 4) {
            i9 = this.f3106t;
        } else if (i8 == 6) {
            i9 = this.r;
            if (this.f3090b && i9 <= (i10 = this.f3104q)) {
                i8 = 3;
                i9 = i10;
            }
        } else if (i8 == 3) {
            i9 = x();
        } else if (!this.f3108v || i8 != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i8);
        } else {
            i9 = this.F;
        }
        G(view, i8, i9, false);
    }

    public final void E(int i8) {
        View view = (View) this.G.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                int[] iArr = x.f4957a;
                if (x.f.b(view)) {
                    view.post(new a(view, i8));
                    return;
                }
            }
            D(view, i8);
        }
    }

    public final boolean F(View view, float f9) {
        if (this.w) {
            return true;
        }
        if (view.getTop() < this.f3106t) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f9 * 0.1f)) - ((float) this.f3106t)) / ((float) t()) > 0.5f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r7 != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (r0.q(r5.getLeft(), r7) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void G(android.view.View r5, int r6, int r7, boolean r8) {
        /*
            r4 = this;
            q0.c r0 = r4.f3110z
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0030
            if (r8 == 0) goto L_0x0013
            int r8 = r5.getLeft()
            boolean r7 = r0.q(r8, r7)
            if (r7 == 0) goto L_0x0030
            goto L_0x002f
        L_0x0013:
            int r8 = r5.getLeft()
            r0.r = r5
            r3 = -1
            r0.f6398c = r3
            boolean r7 = r0.i(r8, r7, r2, r2)
            if (r7 != 0) goto L_0x002d
            int r8 = r0.f6396a
            if (r8 != 0) goto L_0x002d
            android.view.View r8 = r0.r
            if (r8 == 0) goto L_0x002d
            r8 = 0
            r0.r = r8
        L_0x002d:
            if (r7 == 0) goto L_0x0030
        L_0x002f:
            r2 = r1
        L_0x0030:
            if (r2 == 0) goto L_0x0056
            r7 = 2
            r4.C(r7)
            r4.I(r6)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$e r7 = r4.f3101n
            if (r7 != 0) goto L_0x0044
            com.google.android.material.bottomsheet.BottomSheetBehavior$e r7 = new com.google.android.material.bottomsheet.BottomSheetBehavior$e
            r7.<init>(r5, r6)
            r4.f3101n = r7
        L_0x0044:
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$e r7 = r4.f3101n
            boolean r8 = r7.f3121g
            r7.f3122h = r6
            if (r8 != 0) goto L_0x0059
            int[] r6 = j0.x.f4957a
            j0.x.c.m(r5, r7)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$e r4 = r4.f3101n
            r4.f3121g = r1
            goto L_0x0059
        L_0x0056:
            r4.C(r6)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.G(android.view.View, int, int, boolean):void");
    }

    public final void H() {
        View view;
        c.a aVar;
        int i8;
        WeakReference<V> weakReference = this.G;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            x.g(view, 524288);
            x.d(view, 0);
            x.g(view, 262144);
            x.d(view, 0);
            x.g(view, 1048576);
            x.d(view, 0);
            int i9 = this.O;
            if (i9 != -1) {
                x.g(view, i9);
                x.d(view, 0);
            }
            int i10 = 6;
            if (this.y != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                k4.c cVar = new k4.c(this, 6);
                ArrayList b9 = x.b(view);
                int i11 = 0;
                while (true) {
                    if (i11 >= b9.size()) {
                        int i12 = 0;
                        int i13 = -1;
                        while (true) {
                            int[] iArr = x.f4957a;
                            if (i12 >= iArr.length || i13 != -1) {
                                i8 = i13;
                            } else {
                                int i14 = iArr[i12];
                                boolean z8 = true;
                                for (int i15 = 0; i15 < b9.size(); i15++) {
                                    z8 &= ((c.a) b9.get(i15)).a() != i14;
                                }
                                if (z8) {
                                    i13 = i14;
                                }
                                i12++;
                            }
                        }
                        i8 = i13;
                    } else if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((c.a) b9.get(i11)).f5095a).getLabel())) {
                        i8 = ((c.a) b9.get(i11)).a();
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i8 != -1) {
                    c.a aVar2 = new c.a((Object) null, i8, string, cVar, (Class) null);
                    View.AccessibilityDelegate a9 = x.m.a(view);
                    j0.a aVar3 = a9 == null ? null : a9 instanceof a.C0066a ? ((a.C0066a) a9).f4919a : new j0.a(a9);
                    if (aVar3 == null) {
                        aVar3 = new j0.a();
                    }
                    x.i(view, aVar3);
                    x.g(view, aVar2.a());
                    x.b(view).add(aVar2);
                    x.d(view, 0);
                }
                this.O = i8;
            }
            if (this.f3108v && this.y != 5) {
                y(view, c.a.f5092j, 5);
            }
            int i16 = this.y;
            if (i16 == 3) {
                if (this.f3090b) {
                    i10 = 4;
                }
                aVar = c.a.f5091i;
            } else if (i16 == 4) {
                if (this.f3090b) {
                    i10 = 3;
                }
                aVar = c.a.f5090h;
            } else if (i16 == 6) {
                y(view, c.a.f5091i, 4);
                y(view, c.a.f5090h, 3);
                return;
            } else {
                return;
            }
            y(view, aVar, i10);
        }
    }

    public final void I(int i8) {
        ValueAnimator valueAnimator;
        if (i8 != 2) {
            boolean z8 = i8 == 3;
            if (this.f3100m != z8) {
                this.f3100m = z8;
                if (this.f3096i != null && (valueAnimator = this.f3102o) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f3102o.reverse();
                        return;
                    }
                    float f9 = z8 ? 0.0f : 1.0f;
                    this.f3102o.setFloatValues(new float[]{1.0f - f9, f9});
                    this.f3102o.start();
                }
            }
        }
    }

    public final void J(boolean z8) {
        WeakReference<V> weakReference = this.G;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z8) {
                    if (this.N == null) {
                        this.N = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i8 = 0; i8 < childCount; i8++) {
                    V childAt = coordinatorLayout.getChildAt(i8);
                    if (childAt != this.G.get() && z8) {
                        this.N.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z8) {
                    this.N = null;
                }
            }
        }
    }

    public final void K() {
        View view;
        if (this.G != null) {
            s();
            if (this.y == 4 && (view = (View) this.G.get()) != null) {
                view.requestLayout();
            }
        }
    }

    public final void c(CoordinatorLayout.f fVar) {
        this.G = null;
        this.f3110z = null;
    }

    public final void f() {
        this.G = null;
        this.f3110z = null;
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, V v8, MotionEvent motionEvent) {
        q0.c cVar;
        if (!v8.isShown() || !this.f3109x) {
            this.A = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view = null;
        if (actionMasked == 0) {
            this.K = -1;
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.J = null;
            }
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x8 = (int) motionEvent.getX();
            this.L = (int) motionEvent.getY();
            if (this.y != 2) {
                WeakReference<View> weakReference = this.H;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x8, this.L)) {
                    this.K = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.M = true;
                }
            }
            this.A = this.K == -1 && !coordinatorLayout.o(v8, x8, this.L);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.M = false;
            this.K = -1;
            if (this.A) {
                this.A = false;
                return false;
            }
        }
        if (!this.A && (cVar = this.f3110z) != null && cVar.r(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.H;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        return actionMasked == 2 && view != null && !this.A && this.y != 1 && !coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f3110z != null && Math.abs(((float) this.L) - motionEvent.getY()) > ((float) this.f3110z.f6397b);
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, V v8, int i8) {
        int i9;
        f fVar;
        int[] iArr = x.f4957a;
        if (x.c.b(coordinatorLayout) && !x.c.b(v8)) {
            v8.setFitsSystemWindows(true);
        }
        if (this.G == null) {
            this.f3093f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (!this.f3098k && !this.e) {
                x.h.u(v8, new l(new k4.b(this), new n.b(x.d.f(v8), v8.getPaddingTop(), x.d.e(v8), v8.getPaddingBottom())));
                if (x.f.b(v8)) {
                    x.g.c(v8);
                } else {
                    v8.addOnAttachStateChangeListener(new m());
                }
            }
            this.G = new WeakReference<>(v8);
            if (this.f3095h && (fVar = this.f3096i) != null) {
                x.c.q(v8, fVar);
            }
            f fVar2 = this.f3096i;
            if (fVar2 != null) {
                float f9 = this.f3107u;
                if (f9 == -1.0f) {
                    f9 = x.h.i(v8);
                }
                fVar2.i(f9);
                boolean z8 = this.y == 3;
                this.f3100m = z8;
                f fVar3 = this.f3096i;
                float f10 = z8 ? 0.0f : 1.0f;
                f.b bVar = fVar3.f8412a;
                if (bVar.f8441j != f10) {
                    bVar.f8441j = f10;
                    fVar3.e = true;
                    fVar3.invalidateSelf();
                }
            }
            H();
            if (x.c.c(v8) == 0) {
                x.c.s(v8, 1);
            }
        }
        if (this.f3110z == null) {
            this.f3110z = new q0.c(coordinatorLayout.getContext(), coordinatorLayout, this.P);
        }
        int top = v8.getTop();
        coordinatorLayout.q(v8, i8);
        this.E = coordinatorLayout.getWidth();
        this.F = coordinatorLayout.getHeight();
        int height = v8.getHeight();
        this.D = height;
        this.f3104q = Math.max(0, this.F - height);
        this.r = (int) (((float) this.F) * (1.0f - this.f3105s));
        s();
        int i10 = this.y;
        if (i10 == 3) {
            i9 = x();
        } else if (i10 == 6) {
            i9 = this.r;
        } else if (this.f3108v && i10 == 5) {
            i9 = this.F;
        } else if (i10 == 4) {
            i9 = this.f3106t;
        } else {
            if (i10 == 1 || i10 == 2) {
                v8.offsetTopAndBottom(top - v8.getTop());
            }
            this.H = new WeakReference<>(w(v8));
            return true;
        }
        v8.offsetTopAndBottom(i9);
        this.H = new WeakReference<>(w(v8));
        return true;
    }

    public final boolean j(View view) {
        WeakReference<View> weakReference = this.H;
        return (weakReference == null || view != weakReference.get() || this.y == 3) ? false : true;
    }

    public final void k(CoordinatorLayout coordinatorLayout, V v8, View view, int i8, int i9, int[] iArr, int i10) {
        int i11;
        if (i10 != 1) {
            WeakReference<View> weakReference = this.H;
            if (view == (weakReference != null ? weakReference.get() : null)) {
                int top = v8.getTop();
                int i12 = top - i9;
                if (i9 <= 0) {
                    if (i9 < 0 && !view.canScrollVertically(-1)) {
                        int i13 = this.f3106t;
                        if (i12 > i13 && !this.f3108v) {
                            int i14 = top - i13;
                            iArr[1] = i14;
                            int i15 = -i14;
                            int[] iArr2 = x.f4957a;
                            v8.offsetTopAndBottom(i15);
                            i11 = 4;
                            C(i11);
                        } else if (this.f3109x) {
                            iArr[1] = i9;
                        } else {
                            return;
                        }
                    }
                    v(v8.getTop());
                    this.B = i9;
                    this.C = true;
                } else if (i12 < x()) {
                    int x8 = top - x();
                    iArr[1] = x8;
                    int i16 = -x8;
                    int[] iArr3 = x.f4957a;
                    v8.offsetTopAndBottom(i16);
                    i11 = 3;
                    C(i11);
                    v(v8.getTop());
                    this.B = i9;
                    this.C = true;
                } else if (this.f3109x) {
                    iArr[1] = i9;
                } else {
                    return;
                }
                int i17 = -i9;
                int[] iArr4 = x.f4957a;
                v8.offsetTopAndBottom(i17);
                C(1);
                v(v8.getTop());
                this.B = i9;
                this.C = true;
            }
        }
    }

    public final void l(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10, int[] iArr) {
    }

    public final void n(View view, Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i8 = this.f3089a;
        if (i8 != 0) {
            if (i8 == -1 || (i8 & 1) == 1) {
                this.f3092d = dVar.f3116i;
            }
            if (i8 == -1 || (i8 & 2) == 2) {
                this.f3090b = dVar.f3117j;
            }
            if (i8 == -1 || (i8 & 4) == 4) {
                this.f3108v = dVar.f3118k;
            }
            if (i8 == -1 || (i8 & 8) == 8) {
                this.w = dVar.f3119l;
            }
        }
        int i9 = dVar.f3115h;
        if (i9 == 1 || i9 == 2) {
            this.y = 4;
        } else {
            this.y = i9;
        }
    }

    public final Parcelable o(View view) {
        return new d(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final boolean p(CoordinatorLayout coordinatorLayout, V v8, View view, View view2, int i8, int i9) {
        this.B = 0;
        this.C = false;
        return (i8 & 2) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r3 > r6) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (java.lang.Math.abs(r3 - r2.f3104q) < java.lang.Math.abs(r3 - r2.f3106t)) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0083, code lost:
        if (r3 < java.lang.Math.abs(r3 - r2.f3106t)) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0085, code lost:
        r6 = r2.f3103p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        if (java.lang.Math.abs(r3 - r6) < java.lang.Math.abs(r3 - r2.f3106t)) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b0, code lost:
        if (java.lang.Math.abs(r3 - r2.r) < java.lang.Math.abs(r3 - r2.f3106t)) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.x()
            r0 = 3
            if (r3 != r6) goto L_0x000f
            r2.C(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.H
            if (r3 == 0) goto L_0x00bf
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x00bf
            boolean r3 = r2.C
            if (r3 != 0) goto L_0x001f
            goto L_0x00bf
        L_0x001f:
            int r3 = r2.B
            r5 = 6
            if (r3 <= 0) goto L_0x0034
            boolean r3 = r2.f3090b
            if (r3 == 0) goto L_0x0029
            goto L_0x0074
        L_0x0029:
            int r3 = r4.getTop()
            int r6 = r2.r
            if (r3 <= r6) goto L_0x0085
        L_0x0031:
            r0 = r5
            goto L_0x00b9
        L_0x0034:
            boolean r3 = r2.f3108v
            if (r3 == 0) goto L_0x0057
            android.view.VelocityTracker r3 = r2.J
            if (r3 != 0) goto L_0x003e
            r3 = 0
            goto L_0x004d
        L_0x003e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.f3091c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.J
            int r6 = r2.K
            float r3 = r3.getYVelocity(r6)
        L_0x004d:
            boolean r3 = r2.F(r4, r3)
            if (r3 == 0) goto L_0x0057
            int r6 = r2.F
            r0 = 5
            goto L_0x00b9
        L_0x0057:
            int r3 = r2.B
            if (r3 != 0) goto L_0x0098
            int r3 = r4.getTop()
            boolean r6 = r2.f3090b
            if (r6 == 0) goto L_0x0077
            int r5 = r2.f3104q
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r6 = r2.f3106t
            int r3 = r3 - r6
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L_0x00b6
        L_0x0074:
            int r6 = r2.f3104q
            goto L_0x00b9
        L_0x0077:
            int r6 = r2.r
            if (r3 >= r6) goto L_0x0088
            int r6 = r2.f3106t
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L_0x00b2
        L_0x0085:
            int r6 = r2.f3103p
            goto L_0x00b9
        L_0x0088:
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r2.f3106t
            int r3 = r3 - r0
            int r3 = java.lang.Math.abs(r3)
            if (r6 >= r3) goto L_0x00b6
            goto L_0x00b2
        L_0x0098:
            boolean r3 = r2.f3090b
            if (r3 == 0) goto L_0x009d
            goto L_0x00b6
        L_0x009d:
            int r3 = r4.getTop()
            int r6 = r2.r
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r2.f3106t
            int r3 = r3 - r0
            int r3 = java.lang.Math.abs(r3)
            if (r6 >= r3) goto L_0x00b6
        L_0x00b2:
            int r6 = r2.r
            goto L_0x0031
        L_0x00b6:
            int r6 = r2.f3106t
            r0 = 4
        L_0x00b9:
            r3 = 0
            r2.G(r4, r0, r6, r3)
            r2.C = r3
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public final boolean r(CoordinatorLayout coordinatorLayout, V v8, MotionEvent motionEvent) {
        if (!v8.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.y == 1 && actionMasked == 0) {
            return true;
        }
        q0.c cVar = this.f3110z;
        if (cVar != null) {
            cVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.K = -1;
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.J = null;
            }
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        if (this.f3110z != null && actionMasked == 2 && !this.A) {
            float abs = Math.abs(((float) this.L) - motionEvent.getY());
            q0.c cVar2 = this.f3110z;
            if (abs > ((float) cVar2.f6397b)) {
                cVar2.b(v8, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.A;
    }

    public final void s() {
        int t8 = t();
        if (this.f3090b) {
            this.f3106t = Math.max(this.F - t8, this.f3104q);
        } else {
            this.f3106t = this.F - t8;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r0 = r3.f3097j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int t() {
        /*
            r3 = this;
            boolean r0 = r3.e
            if (r0 == 0) goto L_0x001a
            int r0 = r3.f3093f
            int r1 = r3.F
            int r2 = r3.E
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r3 = r3.D
            int r3 = java.lang.Math.min(r0, r3)
            return r3
        L_0x001a:
            boolean r0 = r3.f3098k
            if (r0 != 0) goto L_0x002c
            int r0 = r3.f3097j
            if (r0 <= 0) goto L_0x002c
            int r1 = r3.f3092d
            int r3 = r3.f3094g
            int r0 = r0 + r3
            int r3 = java.lang.Math.max(r1, r0)
            return r3
        L_0x002c:
            int r3 = r3.f3092d
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.t():int");
    }

    public final void u(Context context, AttributeSet attributeSet, boolean z8, ColorStateList colorStateList) {
        if (this.f3095h) {
            this.f3099l = i.b(context, attributeSet, R.attr.bottomSheetStyle, -2146303374).a();
            f fVar = new f(this.f3099l);
            this.f3096i = fVar;
            fVar.h(context);
            if (!z8 || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f3096i.setTint(typedValue.data);
                return;
            }
            this.f3096i.j(colorStateList);
        }
    }

    public final void v(int i8) {
        if (((View) this.G.get()) != null) {
            ArrayList<c> arrayList = this.I;
            if (!arrayList.isEmpty()) {
                if (i8 <= this.f3106t) {
                    int x8 = x();
                }
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    arrayList.get(i9).a();
                }
            }
        }
    }

    public final int x() {
        return this.f3090b ? this.f3104q : this.f3103p;
    }

    public final void y(V v8, c.a aVar, int i8) {
        x.h(v8, aVar, new k4.c(this, i8));
    }

    public final void z(int i8) {
        if (i8 >= 0) {
            this.f3103p = i8;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }
}
