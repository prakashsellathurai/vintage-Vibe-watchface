package com.samsung.android.wearable.watchfacestudio.editor;

import android.animation.ValueAnimator;

public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f3878a;

    public /* synthetic */ c(d dVar) {
        this.f3878a = dVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3878a.Z.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
