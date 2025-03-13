package c5;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.a;

public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f2672a;

    public d(a aVar) {
        this.f2672a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        a aVar = this.f2672a;
        aVar.f2682c.setScaleX(floatValue);
        aVar.f2682c.setScaleY(floatValue);
    }
}
