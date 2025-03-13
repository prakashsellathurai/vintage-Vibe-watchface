package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public int f3064a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f3065b = 2;

    /* renamed from: c  reason: collision with root package name */
    public int f3066c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ViewPropertyAnimator f3067d;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public final void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f3067d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean h(CoordinatorLayout coordinatorLayout, V v8, int i8) {
        this.f3064a = v8.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v8.getLayoutParams()).bottomMargin;
        return false;
    }

    public final void l(CoordinatorLayout coordinatorLayout, View view, int i8, int i9, int i10, int[] iArr) {
        if (i8 > 0) {
            if (this.f3065b != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.f3067d;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f3065b = 1;
                s(view, this.f3064a + this.f3066c, 175, f4.a.f4393c);
            }
        } else if (i8 < 0 && this.f3065b != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.f3067d;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.f3065b = 2;
            s(view, 0, 225, f4.a.f4394d);
        }
    }

    public boolean p(CoordinatorLayout coordinatorLayout, V v8, View view, View view2, int i8, int i9) {
        return i8 == 2;
    }

    public final void s(V v8, int i8, long j8, TimeInterpolator timeInterpolator) {
        this.f3067d = v8.animate().translationY((float) i8).setInterpolator(timeInterpolator).setDuration(j8).setListener(new a());
    }
}
