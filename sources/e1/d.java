package e1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import j0.x;
import java.util.HashMap;

public final class d extends v {

    public static class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f4176a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4177b = false;

        public a(View view) {
            this.f4176a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            Property<View, Float> property = o.f4223a;
            View view = this.f4176a;
            view.setTransitionAlpha(1.0f);
            if (this.f4177b) {
                view.setLayerType(0, (Paint) null);
            }
        }

        public final void onAnimationStart(Animator animator) {
            int[] iArr = x.f4957a;
            View view = this.f4176a;
            if (x.c.h(view) && view.getLayerType() == 0) {
                this.f4177b = true;
                view.setLayerType(2, (Paint) null);
            }
        }
    }

    public d(int i8) {
        if ((i8 & -4) == 0) {
            this.C = i8;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public final ObjectAnimator J(View view, float f9, float f10) {
        if (f9 == f10) {
            return null;
        }
        Property<View, Float> property = o.f4223a;
        view.setTransitionAlpha(f9);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, o.f4223a, new float[]{f10});
        ofFloat.addListener(new a(view));
        a(new c(view));
        return ofFloat;
    }

    public final void g(n nVar) {
        H(nVar);
        HashMap hashMap = nVar.f4220a;
        Property<View, Float> property = o.f4223a;
        hashMap.put("android:fade:transitionAlpha", Float.valueOf(nVar.f4221b.getTransitionAlpha()));
    }
}
