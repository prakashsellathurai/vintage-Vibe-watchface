package j4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4988a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f4989b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f4990c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f4991d;
    public final /* synthetic */ BottomAppBar e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i8, boolean z8) {
        this.e = bottomAppBar;
        this.f4989b = actionMenuView;
        this.f4990c = i8;
        this.f4991d = z8;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f4988a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f4988a) {
            BottomAppBar bottomAppBar = this.e;
            int i8 = bottomAppBar.Q;
            boolean z8 = i8 != 0;
            if (i8 != 0) {
                bottomAppBar.Q = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.k(i8);
            }
            bottomAppBar.v(this.f4989b, this.f4990c, this.f4991d, z8);
        }
    }
}
