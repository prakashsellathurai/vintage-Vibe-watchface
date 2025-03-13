package o5;

import android.animation.Animator;
import android.os.Handler;
import com.airbnb.lottie.LottieAnimationView;
import com.samsung.android.wearable.watchfacestudio.editor.tutorial.TutorialView;

public final class h implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TutorialView f6129a;

    public h(TutorialView tutorialView) {
        this.f6129a = tutorialView;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        long j8;
        g gVar;
        Handler handler = new Handler();
        TutorialView tutorialView = this.f6129a;
        int i8 = (tutorialView.f3919j.getRotation() > 90.0f ? 1 : (tutorialView.f3919j.getRotation() == 90.0f ? 0 : -1));
        LottieAnimationView lottieAnimationView = tutorialView.f3919j;
        if (i8 == 0) {
            lottieAnimationView.setRotation(270.0f);
            gVar = new g(this, 0);
            j8 = 1500;
        } else {
            lottieAnimationView.setRotation(90.0f);
            gVar = new g(this, 1);
            j8 = 1000;
        }
        handler.postDelayed(gVar, j8);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
