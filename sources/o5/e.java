package o5;

import android.animation.Animator;
import android.os.Handler;
import com.airbnb.lottie.LottieAnimationView;
import com.samsung.android.wearable.watchfacestudio.editor.tutorial.TutorialView;

public final class e implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TutorialView f6125a;

    public e(TutorialView tutorialView) {
        this.f6125a = tutorialView;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        long j8;
        d dVar;
        Handler handler = new Handler();
        TutorialView tutorialView = this.f6125a;
        int i8 = (tutorialView.f3918i.getRotation() > 180.0f ? 1 : (tutorialView.f3918i.getRotation() == 180.0f ? 0 : -1));
        LottieAnimationView lottieAnimationView = tutorialView.f3918i;
        if (i8 == 0) {
            lottieAnimationView.setRotation(0.0f);
            dVar = new d(this, 0);
            j8 = 1500;
        } else {
            lottieAnimationView.setRotation(180.0f);
            dVar = new d(this, 1);
            j8 = 1000;
        }
        handler.postDelayed(dVar, j8);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
