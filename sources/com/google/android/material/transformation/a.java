package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f3584a;

    public a(View view) {
        this.f3584a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3584a.invalidate();
    }
}
