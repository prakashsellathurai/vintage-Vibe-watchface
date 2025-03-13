package j4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f4987a;

    public c(BottomAppBar bottomAppBar) {
        this.f4987a = bottomAppBar;
    }

    public final void onAnimationEnd(Animator animator) {
        BottomAppBar bottomAppBar = this.f4987a;
        bottomAppBar.getClass();
        bottomAppBar.M = null;
    }

    public final void onAnimationStart(Animator animator) {
        this.f4987a.getClass();
    }
}
