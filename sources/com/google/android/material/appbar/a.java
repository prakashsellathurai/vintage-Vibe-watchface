package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f3055a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f3056b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f3057c;

    public a(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f3057c = baseBehavior;
        this.f3055a = coordinatorLayout;
        this.f3056b = appBarLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f3057c.A(this.f3055a, this.f3056b, intValue);
    }
}
