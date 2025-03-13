package o4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f6109a;

    public a(d dVar) {
        this.f6109a = dVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6109a.a();
    }

    public final void onAnimationStart(Animator animator) {
        this.f6109a.b();
    }
}
