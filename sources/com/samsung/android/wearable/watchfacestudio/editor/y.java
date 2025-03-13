package com.samsung.android.wearable.watchfacestudio.editor;

import android.transition.Transition;
import android.transition.TransitionListenerAdapter;

public final class y extends TransitionListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f3964a;

    public y(z zVar) {
        this.f3964a = zVar;
    }

    public final void onTransitionEnd(Transition transition) {
        this.f3964a.c();
    }
}
