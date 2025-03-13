package o4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import o4.d;

public final class b {
    public static AnimatorSet a(d dVar, float f9, float f10, float f11) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, d.b.f6112a, d.a.f6110b, new d.C0098d[]{new d.C0098d(f9, f10, f11)});
        d.C0098d revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f9, (int) f10, revealInfo.f6116c, f11);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
