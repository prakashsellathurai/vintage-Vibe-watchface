package c5;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.b;

public final class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f2675a;

    public g(b bVar) {
        this.f2675a = bVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2675a.f2682c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
