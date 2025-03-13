package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.health.services.client.R;
import g4.b;
import g4.e;
import j0.k;
import j0.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k0.c;
import k3.j;
import y4.f;

public final class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: a  reason: collision with root package name */
    public int f3030a;

    /* renamed from: b  reason: collision with root package name */
    public int f3031b;

    /* renamed from: c  reason: collision with root package name */
    public int f3032c;

    /* renamed from: d  reason: collision with root package name */
    public int f3033d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public int f3034f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3035g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3036h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3037i;

    /* renamed from: j  reason: collision with root package name */
    public int f3038j;

    /* renamed from: k  reason: collision with root package name */
    public WeakReference<View> f3039k;

    /* renamed from: l  reason: collision with root package name */
    public ValueAnimator f3040l;

    /* renamed from: m  reason: collision with root package name */
    public int[] f3041m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f3042n;

    public static class BaseBehavior<T extends AppBarLayout> extends b<T> {

        /* renamed from: j  reason: collision with root package name */
        public int f3043j;

        /* renamed from: k  reason: collision with root package name */
        public int f3044k;

        /* renamed from: l  reason: collision with root package name */
        public ValueAnimator f3045l;

        /* renamed from: m  reason: collision with root package name */
        public int f3046m = -1;

        /* renamed from: n  reason: collision with root package name */
        public boolean f3047n;

        /* renamed from: o  reason: collision with root package name */
        public float f3048o;

        /* renamed from: p  reason: collision with root package name */
        public WeakReference<View> f3049p;

        public static class a extends p0.a {
            public static final Parcelable.Creator<a> CREATOR = new C0032a();

            /* renamed from: h  reason: collision with root package name */
            public int f3050h;

            /* renamed from: i  reason: collision with root package name */
            public float f3051i;

            /* renamed from: j  reason: collision with root package name */
            public boolean f3052j;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a  reason: collision with other inner class name */
            public static class C0032a implements Parcelable.ClassLoaderCreator<a> {
                public final Object createFromParcel(Parcel parcel) {
                    return new a(parcel, (ClassLoader) null);
                }

                public final Object[] newArray(int i8) {
                    return new a[i8];
                }

                public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new a(parcel, classLoader);
                }
            }

            public a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f3050h = parcel.readInt();
                this.f3051i = parcel.readFloat();
                this.f3052j = parcel.readByte() != 0;
            }

            public a(AbsSavedState absSavedState) {
                super(absSavedState);
            }

            public final void writeToParcel(Parcel parcel, int i8) {
                parcel.writeParcelable(this.f6241f, i8);
                parcel.writeInt(this.f3050h);
                parcel.writeFloat(this.f3051i);
                parcel.writeByte(this.f3052j ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static View C(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = coordinatorLayout.getChildAt(i8);
                if ((childAt instanceof k) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void G(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            L_0x000a:
                r4 = 0
                if (r3 >= r1) goto L_0x0021
                android.view.View r5 = r8.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L_0x001e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L_0x001e
                goto L_0x0022
            L_0x001e:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0021:
                r5 = r4
            L_0x0022:
                if (r5 == 0) goto L_0x00b2
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$a r0 = (com.google.android.material.appbar.AppBarLayout.a) r0
                int r0 = r0.f3053a
                r1 = r0 & 1
                r3 = 1
                if (r1 == 0) goto L_0x005e
                int[] r1 = j0.x.f4957a
                int r1 = j0.x.c.d(r5)
                if (r10 <= 0) goto L_0x004b
                r10 = r0 & 12
                if (r10 == 0) goto L_0x004b
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L_0x005e
                goto L_0x005c
            L_0x004b:
                r10 = r0 & 2
                if (r10 == 0) goto L_0x005e
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r1
                int r0 = r8.getTopInset()
                int r10 = r10 - r0
                if (r9 < r10) goto L_0x005e
            L_0x005c:
                r9 = r3
                goto L_0x005f
            L_0x005e:
                r9 = r2
            L_0x005f:
                boolean r10 = r8.f3037i
                if (r10 == 0) goto L_0x006b
                android.view.View r9 = C(r7)
                boolean r9 = r8.c(r9)
            L_0x006b:
                boolean r9 = r8.b(r9)
                if (r11 != 0) goto L_0x00af
                if (r9 == 0) goto L_0x00b2
                s.c r9 = r7.f1005b
                java.lang.Object r9 = r9.f7135b
                p.f r9 = (p.f) r9
                java.lang.Object r9 = r9.getOrDefault(r8, r4)
                java.util.List r9 = (java.util.List) r9
                java.util.ArrayList r7 = r7.f1007d
                r7.clear()
                if (r9 == 0) goto L_0x0089
                r7.addAll(r9)
            L_0x0089:
                int r9 = r7.size()
                r10 = r2
            L_0x008e:
                if (r10 >= r9) goto L_0x00ad
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.f1023a
                boolean r0 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r0 == 0) goto L_0x00aa
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f4615f
                if (r7 == 0) goto L_0x00ad
                r2 = r3
                goto L_0x00ad
            L_0x00aa:
                int r10 = r10 + 1
                goto L_0x008e
            L_0x00ad:
                if (r2 == 0) goto L_0x00b2
            L_0x00af:
                r8.jumpDrawablesToCurrentState()
            L_0x00b2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.G(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public final void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i8) {
            int abs = Math.abs(x() - i8);
            float abs2 = Math.abs(0.0f);
            float f9 = (float) abs;
            int round = abs2 > 0.0f ? Math.round((f9 / abs2) * 1000.0f) * 3 : (int) (((f9 / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            int x8 = x();
            if (x8 == i8) {
                ValueAnimator valueAnimator = this.f3045l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f3045l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f3045l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f3045l = valueAnimator3;
                valueAnimator3.setInterpolator(f4.a.e);
                this.f3045l.addUpdateListener(new a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f3045l.setDuration((long) Math.min(round, 600));
            this.f3045l.setIntValues(new int[]{x8, i8});
            this.f3045l.start();
        }

        public final void D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i8, int[] iArr) {
            int i9;
            int i10;
            if (i8 != 0) {
                if (i8 < 0) {
                    i10 = -appBarLayout.getTotalScrollRange();
                    i9 = appBarLayout.getDownNestedPreScrollRange() + i10;
                } else {
                    i10 = -appBarLayout.getUpNestedPreScrollRange();
                    i9 = 0;
                }
                int i11 = i10;
                int i12 = i9;
                if (i11 != i12) {
                    iArr[1] = z(coordinatorLayout, appBarLayout, x() - i8, i11, i12);
                }
            }
            if (appBarLayout.f3037i) {
                appBarLayout.b(appBarLayout.c(view));
            }
        }

        public final void E(CoordinatorLayout coordinatorLayout, T t8) {
            boolean z8;
            int x8 = x();
            int childCount = t8.getChildCount();
            int i8 = 0;
            while (true) {
                z8 = true;
                if (i8 >= childCount) {
                    i8 = -1;
                    break;
                }
                View childAt = t8.getChildAt(i8);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                a aVar = (a) childAt.getLayoutParams();
                if ((aVar.f3053a & 32) == 32) {
                    top -= aVar.topMargin;
                    bottom += aVar.bottomMargin;
                }
                int i9 = -x8;
                if (top <= i9 && bottom >= i9) {
                    break;
                }
                i8++;
            }
            if (i8 >= 0) {
                View childAt2 = t8.getChildAt(i8);
                a aVar2 = (a) childAt2.getLayoutParams();
                int i10 = aVar2.f3053a;
                if ((i10 & 17) == 17) {
                    int i11 = -childAt2.getTop();
                    int i12 = -childAt2.getBottom();
                    if (i8 == t8.getChildCount() - 1) {
                        i12 += t8.getTopInset();
                    }
                    if ((i10 & 2) == 2) {
                        int[] iArr = x.f4957a;
                        i12 += x.c.d(childAt2);
                    } else {
                        if ((i10 & 5) == 5) {
                            int[] iArr2 = x.f4957a;
                            int d9 = x.c.d(childAt2) + i12;
                            if (x8 < d9) {
                                i11 = d9;
                            } else {
                                i12 = d9;
                            }
                        }
                    }
                    if ((i10 & 32) != 32) {
                        z8 = false;
                    }
                    if (z8) {
                        i11 += aVar2.topMargin;
                        i12 -= aVar2.bottomMargin;
                    }
                    if (x8 < (i12 + i11) / 2) {
                        i11 = i12;
                    }
                    B(coordinatorLayout, t8, a1.a.l(i11, -t8.getTotalScrollRange(), 0));
                }
            }
        }

        public final void F(CoordinatorLayout coordinatorLayout, T t8) {
            c.a aVar = c.a.f5088f;
            x.g(coordinatorLayout, aVar.a());
            x.d(coordinatorLayout, 0);
            c.a aVar2 = c.a.f5089g;
            x.g(coordinatorLayout, aVar2.a());
            x.d(coordinatorLayout, 0);
            View C = C(coordinatorLayout);
            if (C != null && t8.getTotalScrollRange() != 0 && (((CoordinatorLayout.f) C.getLayoutParams()).f1023a instanceof ScrollingViewBehavior)) {
                if (x() != (-t8.getTotalScrollRange()) && C.canScrollVertically(1)) {
                    x.h(coordinatorLayout, aVar, new c(t8, false));
                }
                if (x() == 0) {
                    return;
                }
                if (C.canScrollVertically(-1)) {
                    int i8 = -t8.getDownNestedPreScrollRange();
                    if (i8 != 0) {
                        x.h(coordinatorLayout, aVar2, new b(this, coordinatorLayout, t8, C, i8));
                        return;
                    }
                    return;
                }
                x.h(coordinatorLayout, aVar2, new c(t8, true));
            }
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i8) {
            int i9;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i8);
            int pendingAction = appBarLayout.getPendingAction();
            int i10 = this.f3046m;
            if (i10 >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i10);
                int i11 = -childAt.getBottom();
                if (this.f3047n) {
                    int[] iArr = x.f4957a;
                    i9 = x.c.d(childAt) + appBarLayout.getTopInset();
                } else {
                    i9 = Math.round(((float) childAt.getHeight()) * this.f3048o);
                }
                A(coordinatorLayout, appBarLayout, i11 + i9);
            } else if (pendingAction != 0) {
                boolean z8 = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i12 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z8) {
                        B(coordinatorLayout, appBarLayout, i12);
                    } else {
                        A(coordinatorLayout, appBarLayout, i12);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z8) {
                        B(coordinatorLayout, appBarLayout, 0);
                    } else {
                        A(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f3034f = 0;
            this.f3046m = -1;
            int l8 = a1.a.l(s(), -appBarLayout.getTotalScrollRange(), 0);
            e eVar = this.f4616a;
            if (eVar == null) {
                this.f4617b = l8;
            } else if (eVar.f4621d != l8) {
                eVar.f4621d = l8;
                eVar.a();
            }
            G(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.f3030a = s();
            if (!appBarLayout.willNotDraw()) {
                int[] iArr2 = x.f4957a;
                x.c.k(appBarLayout);
            }
            F(coordinatorLayout, appBarLayout);
            return true;
        }

        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((CoordinatorLayout.f) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.r(appBarLayout, i8, i9, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i8, int i9, int[] iArr, int i10) {
            D(coordinatorLayout, (AppBarLayout) view, view2, i9, iArr);
        }

        public final void l(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i10 < 0) {
                CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
                AppBarLayout appBarLayout2 = appBarLayout;
                iArr[1] = z(coordinatorLayout2, appBarLayout2, x() - i10, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i10 == 0) {
                F(coordinatorLayout, appBarLayout);
            }
        }

        public final void n(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof a) {
                a aVar = (a) parcelable;
                this.f3046m = aVar.f3050h;
                this.f3048o = aVar.f3051i;
                this.f3047n = aVar.f3052j;
                return;
            }
            this.f3046m = -1;
        }

        public final Parcelable o(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int s8 = s();
            int childCount = appBarLayout.getChildCount();
            boolean z8 = false;
            int i8 = 0;
            while (i8 < childCount) {
                View childAt = appBarLayout.getChildAt(i8);
                int bottom = childAt.getBottom() + s8;
                if (childAt.getTop() + s8 > 0 || bottom < 0) {
                    i8++;
                } else {
                    a aVar = new a(absSavedState);
                    aVar.f3050h = i8;
                    int[] iArr = x.f4957a;
                    if (bottom == x.c.d(childAt) + appBarLayout.getTopInset()) {
                        z8 = true;
                    }
                    aVar.f3052j = z8;
                    aVar.f3051i = ((float) bottom) / ((float) childAt.getHeight());
                    return aVar;
                }
            }
            return absSavedState;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
            if (((r3.getTotalScrollRange() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L_0x002b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean p(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 0
                if (r5 == 0) goto L_0x002c
                boolean r5 = r3.f3037i
                r0 = 1
                if (r5 != 0) goto L_0x002b
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L_0x0014
                r5 = r0
                goto L_0x0015
            L_0x0014:
                r5 = r6
            L_0x0015:
                if (r5 == 0) goto L_0x0028
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L_0x0028
                r2 = r0
                goto L_0x0029
            L_0x0028:
                r2 = r6
            L_0x0029:
                if (r2 == 0) goto L_0x002c
            L_0x002b:
                r6 = r0
            L_0x002c:
                if (r6 == 0) goto L_0x0035
                android.animation.ValueAnimator r2 = r1.f3045l
                if (r2 == 0) goto L_0x0035
                r2.cancel()
            L_0x0035:
                r2 = 0
                r1.f3049p = r2
                r1.f3044k = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.p(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i8) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f3044k == 0 || i8 == 1) {
                E(coordinatorLayout, appBarLayout);
                if (appBarLayout.f3037i) {
                    appBarLayout.b(appBarLayout.c(view2));
                }
            }
            this.f3049p = new WeakReference<>(view2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r0.get();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean u(android.view.View r1) {
            /*
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
                java.lang.ref.WeakReference<android.view.View> r0 = r0.f3049p
                if (r0 == 0) goto L_0x001e
                java.lang.Object r0 = r0.get()
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L_0x001c
                boolean r1 = r0.isShown()
                if (r1 == 0) goto L_0x001c
                r1 = -1
                boolean r0 = r0.canScrollVertically(r1)
                if (r0 != 0) goto L_0x001c
                goto L_0x001e
            L_0x001c:
                r0 = 0
                goto L_0x001f
            L_0x001e:
                r0 = 1
            L_0x001f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.u(android.view.View):boolean");
        }

        public final int v(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        public final int w(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        public final int x() {
            return s() + this.f3043j;
        }

        public final void y(View view, CoordinatorLayout coordinatorLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            E(coordinatorLayout, appBarLayout);
            if (appBarLayout.f3037i) {
                appBarLayout.b(appBarLayout.c(C(coordinatorLayout)));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x008e  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00ef  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int z(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                com.google.android.material.appbar.AppBarLayout r9 = (com.google.android.material.appbar.AppBarLayout) r9
                int r0 = r7.x()
                r1 = 0
                if (r11 == 0) goto L_0x00f5
                if (r0 < r11) goto L_0x00f5
                if (r0 > r12) goto L_0x00f5
                int r10 = a1.a.l(r10, r11, r12)
                if (r0 == r10) goto L_0x00f7
                boolean r11 = r9.e
                if (r11 == 0) goto L_0x0088
                int r11 = java.lang.Math.abs(r10)
                int r12 = r9.getChildCount()
                r2 = r1
            L_0x0020:
                if (r2 >= r12) goto L_0x0088
                android.view.View r3 = r9.getChildAt(r2)
                android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$a r4 = (com.google.android.material.appbar.AppBarLayout.a) r4
                android.view.animation.Interpolator r5 = r4.f3054b
                int r6 = r3.getTop()
                if (r11 < r6) goto L_0x0085
                int r6 = r3.getBottom()
                if (r11 > r6) goto L_0x0085
                if (r5 == 0) goto L_0x0088
                int r12 = r4.f3053a
                r2 = r12 & 1
                if (r2 == 0) goto L_0x0059
                int r2 = r3.getHeight()
                int r6 = r4.topMargin
                int r2 = r2 + r6
                int r4 = r4.bottomMargin
                int r2 = r2 + r4
                int r2 = r2 + r1
                r12 = r12 & 2
                if (r12 == 0) goto L_0x005a
                int[] r12 = j0.x.f4957a
                int r12 = j0.x.c.d(r3)
                int r2 = r2 - r12
                goto L_0x005a
            L_0x0059:
                r2 = r1
            L_0x005a:
                int[] r12 = j0.x.f4957a
                boolean r12 = j0.x.c.b(r3)
                if (r12 == 0) goto L_0x0067
                int r12 = r9.getTopInset()
                int r2 = r2 - r12
            L_0x0067:
                if (r2 <= 0) goto L_0x0088
                int r12 = r3.getTop()
                int r11 = r11 - r12
                float r12 = (float) r2
                float r11 = (float) r11
                float r11 = r11 / r12
                float r11 = r5.getInterpolation(r11)
                float r12 = r12 * r11
                int r11 = java.lang.Math.round(r12)
                int r12 = java.lang.Integer.signum(r10)
                int r2 = r3.getTop()
                int r2 = r2 + r11
                int r12 = r12 * r2
                goto L_0x0089
            L_0x0085:
                int r2 = r2 + 1
                goto L_0x0020
            L_0x0088:
                r12 = r10
            L_0x0089:
                g4.e r11 = r7.f4616a
                r2 = 1
                if (r11 == 0) goto L_0x009b
                int r3 = r11.f4621d
                if (r3 == r12) goto L_0x0099
                r11.f4621d = r12
                r11.a()
                r11 = r2
                goto L_0x009e
            L_0x0099:
                r11 = r1
                goto L_0x009e
            L_0x009b:
                r7.f4617b = r12
                goto L_0x0099
            L_0x009e:
                int r3 = r0 - r10
                int r12 = r10 - r12
                r7.f3043j = r12
                if (r11 != 0) goto L_0x00dc
                boolean r11 = r9.e
                if (r11 == 0) goto L_0x00dc
                s.c r11 = r8.f1005b
                java.lang.Object r11 = r11.f7135b
                p.f r11 = (p.f) r11
                r12 = 0
                java.lang.Object r11 = r11.getOrDefault(r9, r12)
                java.util.List r11 = (java.util.List) r11
                if (r11 == 0) goto L_0x00dc
                boolean r12 = r11.isEmpty()
                if (r12 != 0) goto L_0x00dc
                r12 = r1
            L_0x00c0:
                int r4 = r11.size()
                if (r12 >= r4) goto L_0x00dc
                java.lang.Object r4 = r11.get(r12)
                android.view.View r4 = (android.view.View) r4
                android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r5
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r5 = r5.f1023a
                if (r5 == 0) goto L_0x00d9
                r5.d(r8, r4, r9)
            L_0x00d9:
                int r12 = r12 + 1
                goto L_0x00c0
            L_0x00dc:
                int r11 = r7.s()
                r9.f3030a = r11
                boolean r11 = r9.willNotDraw()
                if (r11 != 0) goto L_0x00ed
                int[] r11 = j0.x.f4957a
                j0.x.c.k(r9)
            L_0x00ed:
                if (r10 >= r0) goto L_0x00f0
                r2 = -1
            L_0x00f0:
                G(r8, r9, r10, r2, r1)
                r1 = r3
                goto L_0x00f7
            L_0x00f5:
                r7.f3043j = r1
            L_0x00f7:
                r7.F(r8, r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.z(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends g4.c {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.f18d0);
            this.f4615f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int i8;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f1023a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f3043j + this.e;
                if (this.f4615f == 0) {
                    i8 = 0;
                } else {
                    float v8 = v(view2);
                    int i9 = this.f4615f;
                    i8 = a1.a.l((int) (v8 * ((float) i9)), 0, i9);
                }
                int i10 = bottom - i8;
                int[] iArr = x.f4957a;
                view.offsetTopAndBottom(i10);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f3037i) {
                    appBarLayout.b(appBarLayout.c(view));
                }
            }
            return false;
        }

        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                x.g(coordinatorLayout, c.a.f5088f.a());
                x.d(coordinatorLayout, 0);
                x.g(coordinatorLayout, c.a.f5089g.a());
                x.d(coordinatorLayout, 0);
            }
        }

        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z8) {
            AppBarLayout appBarLayout;
            ArrayList j8 = coordinatorLayout.j(view);
            int size = j8.size();
            int i8 = 0;
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    appBarLayout = null;
                    break;
                }
                View view2 = (View) j8.get(i9);
                if (view2 instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) view2;
                    break;
                }
                i9++;
            }
            if (appBarLayout != null) {
                rect.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect2 = this.f4613c;
                rect2.set(0, 0, width, height);
                if (!rect2.contains(rect)) {
                    if (!z8) {
                        i8 = 4;
                    }
                    appBarLayout.f3034f = 2 | i8 | 8;
                    appBarLayout.requestLayout();
                    return true;
                }
            }
            return false;
        }

        public final View u(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = (View) arrayList.get(i8);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final float v(View view) {
            int i8;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f1023a;
                int x8 = cVar instanceof BaseBehavior ? ((BaseBehavior) cVar).x() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + x8 > downNestedPreScrollRange) && (i8 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) x8) / ((float) i8)) + 1.0f;
                }
            }
            return 0.0f;
        }

        public final int w(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }
    }

    public static class a extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public final int f3053a = 1;

        /* renamed from: b  reason: collision with root package name */
        public final Interpolator f3054b;

        public a() {
            super(-1, -2);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.a.J);
            this.f3053a = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f3054b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public a(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static a a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new a((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public final boolean b(boolean z8) {
        if (this.f3036h == z8) {
            return false;
        }
        this.f3036h = z8;
        refreshDrawableState();
        if (this.f3037i && (getBackground() instanceof f)) {
            f fVar = (f) getBackground();
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            float f9 = z8 ? 0.0f : dimension;
            if (!z8) {
                dimension = 0.0f;
            }
            ValueAnimator valueAnimator = this.f3040l;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f9, dimension});
            this.f3040l = ofFloat;
            ofFloat.setDuration((long) getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f3040l.setInterpolator(f4.a.f4391a);
            this.f3040l.addUpdateListener(new g4.a(fVar));
            this.f3040l.start();
        }
        return true;
    }

    public final boolean c(View view) {
        int i8;
        View view2 = null;
        if (this.f3039k == null && (i8 = this.f3038j) != -1) {
            View findViewById = view != null ? view.findViewById(i8) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f3038j);
            }
            if (findViewById != null) {
                this.f3039k = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f3039k;
        if (weakReference != null) {
            view2 = weakReference.get();
        }
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final boolean d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        int[] iArr = x.f4957a;
        return !x.c.b(childAt);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f3042n != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f3030a));
            this.f3042n.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3042n;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.f3032c
            r1 = -1
            if (r0 == r1) goto L_0x0006
            return r0
        L_0x0006:
            int r0 = r9.getChildCount()
            int r0 = r0 + -1
            r1 = 0
            r2 = r1
        L_0x000e:
            if (r0 < 0) goto L_0x005f
            android.view.View r3 = r9.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$a r4 = (com.google.android.material.appbar.AppBarLayout.a) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f3053a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L_0x0059
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L_0x0036
            int[] r4 = j0.x.f4957a
            int r4 = j0.x.c.d(r3)
        L_0x0034:
            int r7 = r7 + r4
            goto L_0x0044
        L_0x0036:
            r4 = r6 & 2
            if (r4 == 0) goto L_0x0043
            int[] r4 = j0.x.f4957a
            int r4 = j0.x.c.d(r3)
            int r4 = r5 - r4
            goto L_0x0034
        L_0x0043:
            int r7 = r7 + r5
        L_0x0044:
            if (r0 != 0) goto L_0x0057
            int[] r4 = j0.x.f4957a
            boolean r3 = j0.x.c.b(r3)
            if (r3 == 0) goto L_0x0057
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r7 = java.lang.Math.min(r7, r5)
        L_0x0057:
            int r2 = r2 + r7
            goto L_0x005c
        L_0x0059:
            if (r2 <= 0) goto L_0x005c
            goto L_0x005f
        L_0x005c:
            int r0 = r0 + -1
            goto L_0x000e
        L_0x005f:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f3032c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i8 = this.f3033d;
        if (i8 != -1) {
            return i8;
        }
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + aVar.topMargin + aVar.bottomMargin;
            int i11 = aVar.f3053a;
            if ((i11 & 1) == 0) {
                break;
            }
            i10 += measuredHeight;
            if ((i11 & 2) != 0) {
                int[] iArr = x.f4957a;
                i10 -= x.c.d(childAt);
                break;
            }
            i9++;
        }
        int max = Math.max(0, i10);
        this.f3033d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f3038j;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int[] iArr = x.f4957a;
        int d9 = x.c.d(this);
        if (d9 == 0) {
            int childCount = getChildCount();
            d9 = childCount >= 1 ? x.c.d(getChildAt(childCount - 1)) : 0;
            if (d9 == 0) {
                return getHeight() / 3;
            }
        }
        return (d9 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f3034f;
    }

    public Drawable getStatusBarForeground() {
        return this.f3042n;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i8 = this.f3031b;
        if (i8 != -1) {
            return i8;
        }
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i9 >= childCount) {
                break;
            }
            View childAt = getChildAt(i9);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i11 = aVar.f3053a;
            if ((i11 & 1) == 0) {
                break;
            }
            i10 += measuredHeight + aVar.topMargin + aVar.bottomMargin;
            if (i9 == 0) {
                int[] iArr = x.f4957a;
                if (x.c.b(childAt)) {
                    i10 -= getTopInset();
                }
            }
            if ((i11 & 2) != 0) {
                int[] iArr2 = x.f4957a;
                i10 -= x.c.d(childAt);
                break;
            }
            i9++;
        }
        int max = Math.max(0, i10);
        this.f3031b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof f) {
            j.b0(this, (f) background);
        }
    }

    public final int[] onCreateDrawableState(int i8) {
        if (this.f3041m == null) {
            this.f3041m = new int[4];
        }
        int[] iArr = this.f3041m;
        int[] onCreateDrawableState = super.onCreateDrawableState(i8 + iArr.length);
        boolean z8 = this.f3035g;
        iArr[0] = z8 ? R.attr.state_liftable : 2147220621;
        iArr[1] = (!z8 || !this.f3036h) ? 2147220620 : R.attr.state_lifted;
        iArr[2] = z8 ? R.attr.state_collapsible : 2147220623;
        iArr[3] = (!z8 || !this.f3036h) ? 2147220624 : R.attr.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f3039k;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f3039k = null;
    }

    public final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        boolean z9;
        super.onLayout(z8, i8, i9, i10, i11);
        int[] iArr = x.f4957a;
        boolean z10 = true;
        if (x.c.b(this) && d()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        this.f3031b = -1;
        this.f3032c = -1;
        this.f3033d = -1;
        this.e = false;
        int childCount2 = getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount2) {
                break;
            } else if (((a) getChildAt(i12).getLayoutParams()).f3054b != null) {
                this.e = true;
                break;
            } else {
                i12++;
            }
        }
        Drawable drawable = this.f3042n;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f3037i) {
            int childCount3 = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount3) {
                    z9 = false;
                    break;
                }
                int i14 = ((a) getChildAt(i13).getLayoutParams()).f3053a;
                if ((i14 & 1) == 1 && (i14 & 10) != 0) {
                    z9 = true;
                    break;
                }
                i13++;
            }
            if (!z9) {
                z10 = false;
            }
        }
        if (this.f3035g != z10) {
            this.f3035g = z10;
            refreshDrawableState();
        }
    }

    public final void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        int mode = View.MeasureSpec.getMode(i9);
        if (mode != 1073741824) {
            int[] iArr = x.f4957a;
            if (x.c.b(this) && d()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = a1.a.l(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i9));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        this.f3031b = -1;
        this.f3032c = -1;
        this.f3033d = -1;
    }

    public void setElevation(float f9) {
        super.setElevation(f9);
        Drawable background = getBackground();
        if (background instanceof f) {
            ((f) background).i(f9);
        }
    }

    public void setExpanded(boolean z8) {
        int[] iArr = x.f4957a;
        this.f3034f = (z8 ? 1 : 2) | (x.f.c(this) ? 4 : 0) | 8;
        requestLayout();
    }

    public void setLiftOnScroll(boolean z8) {
        this.f3037i = z8;
    }

    public void setLiftOnScrollTargetViewId(int i8) {
        this.f3038j = i8;
        WeakReference<View> weakReference = this.f3039k;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f3039k = null;
    }

    public void setOrientation(int i8) {
        if (i8 == 1) {
            super.setOrientation(i8);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f3042n;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f3042n = drawable3;
            boolean z8 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f3042n.setState(getDrawableState());
                }
                Drawable drawable4 = this.f3042n;
                int[] iArr = x.f4957a;
                d0.c.b(drawable4, x.d.d(this));
                this.f3042n.setVisible(getVisibility() == 0, false);
                this.f3042n.setCallback(this);
            }
            if (this.f3042n != null && getTopInset() > 0) {
                z8 = true;
            }
            setWillNotDraw(!z8);
            int[] iArr2 = x.f4957a;
            x.c.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i8) {
        setStatusBarForeground(new ColorDrawable(i8));
    }

    public void setStatusBarForegroundResource(int i8) {
        setStatusBarForeground(g.a.a(getContext(), i8));
    }

    @Deprecated
    public void setTargetElevation(float f9) {
        int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j8 = (long) integer;
        stateListAnimator.addState(new int[]{16842766, R.attr.state_liftable, 2147220620}, ObjectAnimator.ofFloat(this, "elevation", new float[]{0.0f}).setDuration(j8));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(this, "elevation", new float[]{f9}).setDuration(j8));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", new float[]{0.0f}).setDuration(0));
        setStateListAnimator(stateListAnimator);
    }

    public void setVisibility(int i8) {
        super.setVisibility(i8);
        boolean z8 = i8 == 0;
        Drawable drawable = this.f3042n;
        if (drawable != null) {
            drawable.setVisible(z8, false);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3042n;
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public final LinearLayout.LayoutParams m0generateDefaultLayoutParams() {
        return new a();
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public final LinearLayout.LayoutParams m1generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }
}
