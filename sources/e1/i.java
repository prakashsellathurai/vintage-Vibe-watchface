package e1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p.a;

public final class i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f4208a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f4209b;

    public i(h hVar, a aVar) {
        this.f4209b = hVar;
        this.f4208a = aVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f4208a.remove(animator);
        this.f4209b.r.remove(animator);
    }

    public final void onAnimationStart(Animator animator) {
        this.f4209b.r.add(animator);
    }
}
