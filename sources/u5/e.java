package u5;

import android.animation.ValueAnimator;
import u5.d;

public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.b f7800a;

    public /* synthetic */ e(d.b bVar) {
        this.f7800a = bVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        d.b bVar = this.f7800a;
        bVar.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue("alpha");
        if (animatedValue != null) {
            bVar.f7794a.setAlpha((int) (((Float) animatedValue).floatValue() * 255.0f));
            bVar.f7798f.c();
        }
    }
}
