package w1;

import android.animation.Animator;
import androidx.wear.widget.drawer.PageIndicatorView;
import x1.a;

public class c implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7982a;

    public final void onAnimationCancel(Animator animator) {
        this.f7982a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f7982a) {
            PageIndicatorView pageIndicatorView = ((a) this).f8111b;
            pageIndicatorView.f2491u = false;
            pageIndicatorView.animate().alpha(0.0f).setListener((Animator.AnimatorListener) null).setStartDelay((long) pageIndicatorView.f2482k).setDuration((long) pageIndicatorView.f2483l).start();
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.f7982a = false;
    }
}
