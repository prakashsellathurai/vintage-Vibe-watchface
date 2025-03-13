package c5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.b;

public final class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f2679a;

    public j(b bVar) {
        this.f2679a = bVar;
    }

    public final void onAnimationEnd(Animator animator) {
        b bVar = this.f2679a;
        bVar.f2682c.setChecked(bVar.f3512j);
        bVar.f3518p.start();
    }
}
