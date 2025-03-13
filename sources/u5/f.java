package u5;

import android.animation.ValueAnimator;
import u5.d;

public final /* synthetic */ class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.b f7801a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f7802b;

    public /* synthetic */ f(d.b bVar, float f9) {
        this.f7801a = bVar;
        this.f7802b = f9;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        d.b bVar = this.f7801a;
        bVar.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue("scaleF");
        if (animatedValue != null) {
            bVar.f7795b = true;
            bVar.f7796c = ((Float) animatedValue).floatValue() * this.f7802b;
            bVar.f7798f.c();
        }
    }
}
