package g4;

import android.animation.ValueAnimator;
import y4.f;

public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f4603a;

    public a(f fVar) {
        this.f4603a = fVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4603a.i(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
