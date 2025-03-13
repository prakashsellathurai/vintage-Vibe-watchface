package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f3326a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.f f3327b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f3328c;

    public c(d dVar, boolean z8, a aVar) {
        this.f3328c = dVar;
        this.f3326a = z8;
        this.f3327b = aVar;
    }

    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f3328c;
        dVar.f3343n = 0;
        dVar.f3338i = null;
        d.f fVar = this.f3327b;
        if (fVar != null) {
            ((a) fVar).f3320a.b();
        }
    }

    public final void onAnimationStart(Animator animator) {
        d dVar = this.f3328c;
        dVar.r.b(0, this.f3326a);
        dVar.f3343n = 2;
        dVar.f3338i = animator;
    }
}
