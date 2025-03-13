package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import o4.d;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f3587a;

    public c(d dVar) {
        this.f3587a = dVar;
    }

    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f3587a;
        d.C0098d revealInfo = dVar.getRevealInfo();
        revealInfo.f6116c = Float.MAX_VALUE;
        dVar.setRevealInfo(revealInfo);
    }
}
