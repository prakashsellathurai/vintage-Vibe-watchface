package o5;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.samsung.android.wearable.watchfacestudio.editor.tutorial.TutorialView;

public final /* synthetic */ class b implements View.OnGenericMotionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TutorialView f6121a;

    public /* synthetic */ b(TutorialView tutorialView) {
        this.f6121a = tutorialView;
    }

    public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
        int i8 = TutorialView.f3910k;
        TutorialView tutorialView = this.f6121a;
        tutorialView.getClass();
        if (motionEvent.getAction() != 8) {
            return false;
        }
        Log.i("DWF:TutorialView", "Bezel scrolled on TutorialView");
        if (!tutorialView.b()) {
            return false;
        }
        tutorialView.a();
        return false;
    }
}
