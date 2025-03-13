package c5;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.a;

public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f2671a;

    public c(a aVar) {
        this.f2671a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2671a.f2682c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
