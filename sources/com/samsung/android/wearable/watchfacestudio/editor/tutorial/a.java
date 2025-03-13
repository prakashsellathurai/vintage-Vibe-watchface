package com.samsung.android.wearable.watchfacestudio.editor.tutorial;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import com.samsung.android.wearable.watchfacestudio.editor.h;
import com.samsung.android.wearable.watchfacestudio.editor.tutorial.TutorialView;
import com.samsung.android.wearable.watchfacestudio.editor.w;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TutorialView f3925a;

    public a(TutorialView tutorialView) {
        this.f3925a = tutorialView;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        TutorialView tutorialView = this.f3925a;
        tutorialView.f3914d.setVisibility(8);
        TutorialView.a aVar = tutorialView.f3911a;
        if (aVar != null) {
            w wVar = ((h) aVar).f3893b;
            wVar.getClass();
            Log.i("DWF:EditorFragment", "tutorial finished");
            wVar.f3942n0.requestFocus();
            wVar.u0.f3869d.b(true);
            wVar.s0.setVisibility(8);
            try {
                wVar.f3947t0.a();
            } catch (IllegalArgumentException e) {
                Log.e("DWF:EditorFragment", e.getMessage());
            }
        }
    }
}
