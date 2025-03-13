package o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import androidx.activity.b;
import com.samsung.android.wearable.watchfacestudio.editor.tutorial.TutorialView;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TutorialView f6122a;

    public c(TutorialView tutorialView) {
        this.f6122a = tutorialView;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        Handler handler = new Handler();
        this.f6122a.f3918i.setAlpha(1.0f);
        handler.postDelayed(new b(6, this), 500);
    }
}
