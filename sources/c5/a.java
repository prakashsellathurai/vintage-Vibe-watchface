package c5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.textfield.a f2669a;

    public a(com.google.android.material.textfield.a aVar) {
        this.f2669a = aVar;
    }

    public final void onAnimationStart(Animator animator) {
        this.f2669a.f2680a.setEndIconVisible(true);
    }
}
