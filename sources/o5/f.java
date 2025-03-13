package o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import androidx.activity.b;
import com.samsung.android.wearable.watchfacestudio.editor.tutorial.TutorialView;

public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TutorialView f6126a;

    public f(TutorialView tutorialView) {
        this.f6126a = tutorialView;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        Handler handler = new Handler();
        this.f6126a.f3919j.setAlpha(1.0f);
        handler.postDelayed(new b(7, this), 500);
    }
}
