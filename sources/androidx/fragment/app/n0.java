package androidx.fragment.app;

import android.transition.Transition;

public final class n0 implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f1300a;

    public n0(Runnable runnable) {
        this.f1300a = runnable;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        this.f1300a.run();
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
    }
}
