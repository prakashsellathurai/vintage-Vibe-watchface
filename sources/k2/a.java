package k2;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class a extends ValueAnimator {

    /* renamed from: f  reason: collision with root package name */
    public final CopyOnWriteArraySet f5103f = new CopyOnWriteArraySet();

    /* renamed from: g  reason: collision with root package name */
    public final CopyOnWriteArraySet f5104g = new CopyOnWriteArraySet();

    public final void a() {
        Iterator it = this.f5103f.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f5104g.add(animatorListener);
    }

    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f5103f.add(animatorUpdateListener);
    }

    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void removeAllListeners() {
        this.f5104g.clear();
    }

    public final void removeAllUpdateListeners() {
        this.f5103f.clear();
    }

    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f5104g.remove(animatorListener);
    }

    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f5103f.remove(animatorUpdateListener);
    }

    public final ValueAnimator setDuration(long j8) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public final void setStartDelay(long j8) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}
