package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j0.x;
import k0.c;
import q0.c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public c f3069a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3070b;

    /* renamed from: c  reason: collision with root package name */
    public int f3071c = 2;

    /* renamed from: d  reason: collision with root package name */
    public final float f3072d = 0.5f;
    public float e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f3073f = 0.5f;

    /* renamed from: g  reason: collision with root package name */
    public final a f3074g = new a();

    public class a extends c.C0112c {

        /* renamed from: a  reason: collision with root package name */
        public int f3075a;

        /* renamed from: b  reason: collision with root package name */
        public int f3076b = -1;

        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
            r3 = r4.f3075a - r5.getWidth();
            r5 = r4.f3075a;
            r4 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
            if (r0 != false) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
            if (r0 != false) goto L_0x0019;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int a(android.view.View r5, int r6) {
            /*
                r4 = this;
                int[] r0 = j0.x.f4957a
                int r0 = j0.x.d.d(r5)
                r1 = 1
                if (r0 != r1) goto L_0x000b
                r0 = r1
                goto L_0x000c
            L_0x000b:
                r0 = 0
            L_0x000c:
                com.google.android.material.behavior.SwipeDismissBehavior r2 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r2 = r2.f3071c
                if (r2 != 0) goto L_0x0015
                if (r0 == 0) goto L_0x0019
                goto L_0x0021
            L_0x0015:
                if (r2 != r1) goto L_0x002f
                if (r0 == 0) goto L_0x0021
            L_0x0019:
                int r4 = r4.f3075a
                int r5 = r5.getWidth()
                int r5 = r5 + r4
                goto L_0x003e
            L_0x0021:
                int r0 = r4.f3075a
                int r5 = r5.getWidth()
                int r5 = r0 - r5
                int r4 = r4.f3075a
                r3 = r5
                r5 = r4
                r4 = r3
                goto L_0x003e
            L_0x002f:
                int r0 = r4.f3075a
                int r1 = r5.getWidth()
                int r0 = r0 - r1
                int r4 = r4.f3075a
                int r5 = r5.getWidth()
                int r5 = r5 + r4
                r4 = r0
            L_0x003e:
                int r4 = java.lang.Math.max(r4, r6)
                int r4 = java.lang.Math.min(r4, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int):int");
        }

        public final int b(View view, int i8) {
            return view.getTop();
        }

        public final int c(View view) {
            return view.getWidth();
        }

        public final void e(View view, int i8) {
            this.f3076b = i8;
            this.f3075a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public final void f(int i8) {
            SwipeDismissBehavior.this.getClass();
        }

        public final void g(View view, int i8, int i9) {
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float width = ((float) this.f3075a) + (((float) view.getWidth()) * swipeDismissBehavior.e);
            float width2 = ((float) this.f3075a) + (((float) view.getWidth()) * swipeDismissBehavior.f3073f);
            float f9 = (float) i8;
            if (f9 <= width) {
                view.setAlpha(1.0f);
            } else if (f9 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f9 - width) / (width2 - width))), 1.0f));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
            if (java.lang.Math.abs(r9.getLeft() - r8.f3075a) >= java.lang.Math.round(((float) r9.getWidth()) * r3.f3072d)) goto L_0x0052;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void h(android.view.View r9, float r10, float r11) {
            /*
                r8 = this;
                r11 = -1
                r8.f3076b = r11
                int r11 = r9.getWidth()
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                r2 = 1
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r4 = 0
                if (r1 == 0) goto L_0x0039
                int[] r5 = j0.x.f4957a
                int r5 = j0.x.d.d(r9)
                if (r5 != r2) goto L_0x001a
                r5 = r2
                goto L_0x001b
            L_0x001a:
                r5 = r4
            L_0x001b:
                int r6 = r3.f3071c
                r7 = 2
                if (r6 != r7) goto L_0x0021
                goto L_0x0052
            L_0x0021:
                if (r6 != 0) goto L_0x002d
                if (r5 == 0) goto L_0x002a
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 >= 0) goto L_0x0054
                goto L_0x0052
            L_0x002a:
                if (r1 <= 0) goto L_0x0054
                goto L_0x0052
            L_0x002d:
                if (r6 != r2) goto L_0x0054
                if (r5 == 0) goto L_0x0034
                if (r1 <= 0) goto L_0x0054
                goto L_0x0052
            L_0x0034:
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 >= 0) goto L_0x0054
                goto L_0x0052
            L_0x0039:
                int r10 = r9.getLeft()
                int r0 = r8.f3075a
                int r10 = r10 - r0
                int r0 = r9.getWidth()
                float r0 = (float) r0
                float r1 = r3.f3072d
                float r0 = r0 * r1
                int r0 = java.lang.Math.round(r0)
                int r10 = java.lang.Math.abs(r10)
                if (r10 < r0) goto L_0x0054
            L_0x0052:
                r10 = r2
                goto L_0x0055
            L_0x0054:
                r10 = r4
            L_0x0055:
                if (r10 == 0) goto L_0x0063
                int r10 = r9.getLeft()
                int r8 = r8.f3075a
                if (r10 >= r8) goto L_0x0061
                int r8 = r8 - r11
                goto L_0x0066
            L_0x0061:
                int r8 = r8 + r11
                goto L_0x0066
            L_0x0063:
                int r8 = r8.f3075a
                r2 = r4
            L_0x0066:
                q0.c r10 = r3.f3069a
                int r11 = r9.getTop()
                boolean r8 = r10.q(r8, r11)
                if (r8 == 0) goto L_0x007c
                com.google.android.material.behavior.SwipeDismissBehavior$b r8 = new com.google.android.material.behavior.SwipeDismissBehavior$b
                r8.<init>(r9, r2)
                int[] r10 = j0.x.f4957a
                j0.x.c.m(r9, r8)
            L_0x007c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.h(android.view.View, float, float):void");
        }

        public final boolean i(View view, int i8) {
            int i9 = this.f3076b;
            return (i9 == -1 || i9 == i8) && SwipeDismissBehavior.this.s(view);
        }
    }

    public class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final View f3078f;

        public b(View view, boolean z8) {
            this.f3078f = view;
        }

        public final void run() {
            c cVar = SwipeDismissBehavior.this.f3069a;
            if (cVar != null && cVar.g()) {
                int[] iArr = x.f4957a;
                x.c.m(this.f3078f, this);
            }
        }
    }

    public boolean g(CoordinatorLayout coordinatorLayout, V v8, MotionEvent motionEvent) {
        boolean z8 = this.f3070b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z8 = coordinatorLayout.o(v8, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f3070b = z8;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3070b = false;
        }
        if (!z8) {
            return false;
        }
        if (this.f3069a == null) {
            this.f3069a = new c(coordinatorLayout.getContext(), coordinatorLayout, this.f3074g);
        }
        return this.f3069a.r(motionEvent);
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, V v8, int i8) {
        int[] iArr = x.f4957a;
        if (x.c.c(v8) == 0) {
            x.c.s(v8, 1);
            x.g(v8, 1048576);
            x.d(v8, 0);
            if (s(v8)) {
                x.h(v8, c.a.f5092j, new i4.a(this));
            }
        }
        return false;
    }

    public final boolean r(CoordinatorLayout coordinatorLayout, V v8, MotionEvent motionEvent) {
        q0.c cVar = this.f3069a;
        if (cVar == null) {
            return false;
        }
        cVar.k(motionEvent);
        return true;
    }

    public boolean s(View view) {
        return true;
    }
}
