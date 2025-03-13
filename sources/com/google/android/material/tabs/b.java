package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f3422a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3423b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TabLayout.e f3424c;

    public b(TabLayout.e eVar, View view, View view2) {
        this.f3424c = eVar;
        this.f3422a = view;
        this.f3423b = view2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3424c.b(this.f3422a, this.f3423b, valueAnimator.getAnimatedFraction());
    }
}
