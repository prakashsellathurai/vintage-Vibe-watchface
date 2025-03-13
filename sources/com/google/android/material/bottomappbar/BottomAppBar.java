package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import j0.x;
import j4.e;
import j4.f;
import java.lang.ref.WeakReference;
import k3.j;

public final class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final /* synthetic */ int T = 0;
    public Animator L;
    public Animator M;
    public int N;
    public int O;
    public boolean P;
    public int Q;
    public boolean R;
    public Behavior S;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public final Rect e = new Rect();

        /* renamed from: f  reason: collision with root package name */
        public WeakReference<BottomAppBar> f3080f;

        /* renamed from: g  reason: collision with root package name */
        public final View.OnLayoutChangeListener f3081g = new a();

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            public final void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                Behavior behavior = Behavior.this;
                if (behavior.f3080f.get() == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                behavior.e.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                throw null;
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i8) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f3080f = new WeakReference<>(bottomAppBar);
            int i9 = BottomAppBar.T;
            View r = bottomAppBar.r();
            if (r != null) {
                int[] iArr = x.f4957a;
                if (!x.f.c(r)) {
                    ((CoordinatorLayout.f) r.getLayoutParams()).f1026d = 49;
                    if (r instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) r;
                        floatingActionButton.addOnLayoutChangeListener(this.f3081g);
                        floatingActionButton.c();
                        floatingActionButton.d(new e(bottomAppBar));
                        floatingActionButton.e();
                    }
                    bottomAppBar.u();
                    throw null;
                }
            }
            coordinatorLayout.q(bottomAppBar, i8);
            super.h(coordinatorLayout, bottomAppBar, i8);
            return false;
        }

        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i8, int i9) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.p(coordinatorLayout, bottomAppBar, view2, view3, i8, i9);
        }
    }

    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f3083f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f3084g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ boolean f3085h;

        public a(ActionMenuView actionMenuView, int i8, boolean z8) {
            this.f3083f = actionMenuView;
            this.f3084g = i8;
            this.f3085h = z8;
        }

        public final void run() {
            int i8 = this.f3084g;
            boolean z8 = this.f3085h;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            ActionMenuView actionMenuView = this.f3083f;
            actionMenuView.setTranslationX((float) bottomAppBar.s(actionMenuView, i8, z8));
        }
    }

    public static class b extends p0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public int f3087h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f3088i;

        public static class a implements Parcelable.ClassLoaderCreator<b> {
            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i8) {
                return new b[i8];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3087h = parcel.readInt();
            this.f3088i = parcel.readInt() != 0;
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f6241f, i8);
            parcel.writeInt(this.f3087h);
            parcel.writeInt(this.f3088i ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private int getBottomInset() {
        return 0;
    }

    private float getFabTranslationX() {
        return t(this.N);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f4995h;
    }

    private int getLeftInset() {
        return 0;
    }

    private int getRightInset() {
        return 0;
    }

    private f getTopEdgeTreatment() {
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public Behavior getBehavior() {
        if (this.S == null) {
            this.S = new Behavior();
        }
        return this.S;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f4995h;
    }

    public int getFabAlignmentMode() {
        return this.N;
    }

    public int getFabAnimationMode() {
        return this.O;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f4994g;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f4993f;
    }

    public boolean getHideOnScroll() {
        return this.P;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j.b0(this, (y4.f) null);
        throw null;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        /*
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r2 = 0
            if (r1 == 0) goto L_0x0018
            android.animation.Animator r1 = r0.M
            if (r1 == 0) goto L_0x000d
            r1.cancel()
        L_0x000d:
            android.animation.Animator r1 = r0.L
            if (r1 == 0) goto L_0x0014
            r1.cancel()
        L_0x0014:
            r0.u()
            throw r2
        L_0x0018:
            androidx.appcompat.widget.ActionMenuView r1 = r0.getActionMenuView()
            if (r1 == 0) goto L_0x004b
            android.animation.Animator r3 = r0.M
            if (r3 != 0) goto L_0x004b
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r3)
            android.view.View r3 = r0.r()
            boolean r4 = r3 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r4 == 0) goto L_0x0032
            r2 = r3
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
        L_0x0032:
            r3 = 0
            if (r2 == 0) goto L_0x003d
            boolean r2 = r2.i()
            if (r2 == 0) goto L_0x003d
            r2 = 1
            goto L_0x003e
        L_0x003d:
            r2 = r3
        L_0x003e:
            if (r2 != 0) goto L_0x0044
            r0.v(r1, r3, r3, r3)
            goto L_0x004b
        L_0x0044:
            int r2 = r0.N
            boolean r4 = r0.R
            r0.v(r1, r2, r4, r3)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.onLayout(boolean, int, int, int, int):void");
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f6241f);
        this.N = bVar.f3087h;
        this.R = bVar.f3088i;
    }

    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f3087h = this.N;
        bVar.f3088i = this.R;
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View r() {
        /*
            r3 = this;
            android.view.ViewParent r0 = r3.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r3.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            s.c r2 = r0.f1005b
            java.lang.Object r2 = r2.f7135b
            p.f r2 = (p.f) r2
            java.lang.Object r3 = r2.getOrDefault(r3, r1)
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r0 = r0.f1007d
            r0.clear()
            if (r3 == 0) goto L_0x0026
            r0.addAll(r3)
        L_0x0026:
            java.util.Iterator r3 = r0.iterator()
        L_0x002a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r3.next()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r0 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r2 != 0) goto L_0x003e
            boolean r2 = r0 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r2 == 0) goto L_0x002a
        L_0x003e:
            return r0
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.r():android.view.View");
    }

    public final int s(ActionMenuView actionMenuView, int i8, boolean z8) {
        if (i8 != 1 || !z8) {
            return 0;
        }
        int[] iArr = x.f4957a;
        boolean z9 = x.d.d(this) == 1;
        int measuredWidth = z9 ? getMeasuredWidth() : 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f4297a & 8388615) == 8388611) {
                measuredWidth = z9 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((z9 ? actionMenuView.getRight() : actionMenuView.getLeft()) + 0);
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        d0.b.h((Drawable) null, colorStateList);
    }

    public void setCradleVerticalOffset(float f9) {
        if (f9 != getCradleVerticalOffset()) {
            f topEdgeTreatment = getTopEdgeTreatment();
            if (f9 >= 0.0f) {
                topEdgeTreatment.f4995h = f9;
                throw null;
            } else {
                topEdgeTreatment.getClass();
                throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
            }
        }
    }

    public void setElevation(float f9) {
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFabAlignmentMode(int r13) {
        /*
            r12 = this;
            r0 = 0
            r12.Q = r0
            boolean r1 = r12.R
            int[] r2 = j0.x.f4957a
            boolean r2 = j0.x.f.c(r12)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0021
            int r1 = r12.Q
            if (r1 == 0) goto L_0x00ba
            r12.Q = r0
            android.view.Menu r2 = r12.getMenu()
            r2.clear()
            r12.k(r1)
            goto L_0x00ba
        L_0x0021:
            android.animation.Animator r2 = r12.M
            if (r2 == 0) goto L_0x0028
            r2.cancel()
        L_0x0028:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.view.View r5 = r12.r()
            boolean r6 = r5 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r6 == 0) goto L_0x0038
            com.google.android.material.floatingactionbutton.FloatingActionButton r5 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r5
            goto L_0x0039
        L_0x0038:
            r5 = r3
        L_0x0039:
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.i()
            if (r5 == 0) goto L_0x0043
            r5 = r4
            goto L_0x0044
        L_0x0043:
            r5 = r0
        L_0x0044:
            if (r5 != 0) goto L_0x0049
            r1 = r0
            r5 = r1
            goto L_0x004a
        L_0x0049:
            r5 = r13
        L_0x004a:
            androidx.appcompat.widget.ActionMenuView r6 = r12.getActionMenuView()
            if (r6 != 0) goto L_0x0051
            goto L_0x00a3
        L_0x0051:
            float[] r7 = new float[r4]
            r8 = 1065353216(0x3f800000, float:1.0)
            r7[r0] = r8
            java.lang.String r9 = "alpha"
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r6, r9, r7)
            float r10 = r6.getTranslationX()
            int r11 = r12.s(r6, r5, r1)
            float r11 = (float) r11
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0098
            float[] r8 = new float[r4]
            r10 = 0
            r8[r0] = r10
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r6, r9, r8)
            j4.d r9 = new j4.d
            r9.<init>(r12, r6, r5, r1)
            r8.addListener(r9)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r5 = 150(0x96, double:7.4E-322)
            r1.setDuration(r5)
            r5 = 2
            android.animation.Animator[] r5 = new android.animation.Animator[r5]
            r5[r0] = r8
            r5[r4] = r7
            r1.playSequentially(r5)
            r2.add(r1)
            goto L_0x00a3
        L_0x0098:
            float r1 = r6.getAlpha()
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x00a3
            r2.add(r7)
        L_0x00a3:
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r1.playTogether(r2)
            r12.M = r1
            j4.c r2 = new j4.c
            r2.<init>(r12)
            r1.addListener(r2)
            android.animation.Animator r1 = r12.M
            r1.start()
        L_0x00ba:
            int r1 = r12.N
            if (r1 == r13) goto L_0x012a
            boolean r1 = j0.x.f.c(r12)
            if (r1 != 0) goto L_0x00c5
            goto L_0x012a
        L_0x00c5:
            android.animation.Animator r1 = r12.L
            if (r1 == 0) goto L_0x00cc
            r1.cancel()
        L_0x00cc:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r12.O
            if (r2 != r4) goto L_0x00f7
            android.view.View r2 = r12.r()
            boolean r5 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r5 == 0) goto L_0x00e0
            r3 = r2
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r3
        L_0x00e0:
            float[] r2 = new float[r4]
            float r4 = r12.t(r13)
            r2[r0] = r4
            java.lang.String r0 = "translationX"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r3, r0, r2)
            r2 = 300(0x12c, double:1.48E-321)
            r0.setDuration(r2)
            r1.add(r0)
            goto L_0x0113
        L_0x00f7:
            android.view.View r0 = r12.r()
            boolean r2 = r0 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r2 == 0) goto L_0x0102
            r3 = r0
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r3
        L_0x0102:
            if (r3 == 0) goto L_0x0113
            boolean r0 = r3.h()
            if (r0 == 0) goto L_0x010b
            goto L_0x0113
        L_0x010b:
            j4.b r0 = new j4.b
            r0.<init>(r12, r13)
            r3.g(r0, r4)
        L_0x0113:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r0.playTogether(r1)
            r12.L = r0
            j4.a r1 = new j4.a
            r1.<init>(r12)
            r0.addListener(r1)
            android.animation.Animator r0 = r12.L
            r0.start()
        L_0x012a:
            r12.N = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.setFabAlignmentMode(int):void");
    }

    public void setFabAnimationMode(int i8) {
        this.O = i8;
    }

    public void setFabCradleMargin(float f9) {
        if (f9 != getFabCradleMargin()) {
            getTopEdgeTreatment().f4994g = f9;
            throw null;
        }
    }

    public void setFabCradleRoundedCornerRadius(float f9) {
        if (f9 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f4993f = f9;
            throw null;
        }
    }

    public void setHideOnScroll(boolean z8) {
        this.P = z8;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public final float t(int i8) {
        int[] iArr = x.f4957a;
        int i9 = 1;
        boolean z8 = x.d.d(this) == 1;
        if (i8 != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) + 0;
        if (z8) {
            i9 = -1;
        }
        return (float) (measuredWidth * i9);
    }

    public final void u() {
        f topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        r();
        if (this.R) {
            View r = r();
            FloatingActionButton floatingActionButton = r instanceof FloatingActionButton ? (FloatingActionButton) r : null;
            if (floatingActionButton != null) {
                floatingActionButton.i();
            }
        }
        throw null;
    }

    public final void v(ActionMenuView actionMenuView, int i8, boolean z8, boolean z9) {
        a aVar = new a(actionMenuView, i8, z8);
        if (z9) {
            actionMenuView.post(aVar);
        } else {
            aVar.run();
        }
    }
}
