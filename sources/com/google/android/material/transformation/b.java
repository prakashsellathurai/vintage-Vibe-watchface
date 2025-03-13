package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import o4.d;

public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f3585a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f3586b;

    public b(d dVar, Drawable drawable) {
        this.f3585a = dVar;
        this.f3586b = drawable;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f3585a.setCircularRevealOverlayDrawable((Drawable) null);
    }

    public final void onAnimationStart(Animator animator) {
        this.f3585a.setCircularRevealOverlayDrawable(this.f3586b);
    }
}
