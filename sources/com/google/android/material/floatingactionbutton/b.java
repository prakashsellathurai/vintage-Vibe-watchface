package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3322a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f3323b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.f f3324c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f3325d;

    public b(d dVar, boolean z8, a aVar) {
        this.f3325d = dVar;
        this.f3323b = z8;
        this.f3324c = aVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f3322a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f3325d;
        dVar.f3343n = 0;
        dVar.f3338i = null;
        if (!this.f3322a) {
            boolean z8 = this.f3323b;
            dVar.r.b(z8 ? 8 : 4, z8);
            d.f fVar = this.f3324c;
            if (fVar != null) {
                a aVar = (a) fVar;
                aVar.f3320a.a(aVar.f3321b);
            }
        }
    }

    public final void onAnimationStart(Animator animator) {
        d dVar = this.f3325d;
        dVar.r.b(0, this.f3323b);
        dVar.f3343n = 1;
        dVar.f3338i = animator;
        this.f3322a = false;
    }
}
