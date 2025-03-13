package e1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f4210a;

    public j(h hVar) {
        this.f4210a = hVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f4210a.m();
        animator.removeListener(this);
    }
}
