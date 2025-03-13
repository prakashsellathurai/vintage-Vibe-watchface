package c5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.a;

public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f2670a;

    public b(a aVar) {
        this.f2670a = aVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2670a.f2680a.setEndIconVisible(false);
    }
}
