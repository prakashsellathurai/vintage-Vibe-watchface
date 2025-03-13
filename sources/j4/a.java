package j4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f4983a;

    public a(BottomAppBar bottomAppBar) {
        this.f4983a = bottomAppBar;
    }

    public final void onAnimationEnd(Animator animator) {
        BottomAppBar bottomAppBar = this.f4983a;
        bottomAppBar.getClass();
        bottomAppBar.L = null;
    }

    public final void onAnimationStart(Animator animator) {
        this.f4983a.getClass();
    }
}
