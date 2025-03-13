package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

public final class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.a0 f1809a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1810b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1811c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f1812d;

    public g(View view, ViewPropertyAnimator viewPropertyAnimator, k kVar, RecyclerView.a0 a0Var) {
        this.f1812d = kVar;
        this.f1809a = a0Var;
        this.f1810b = view;
        this.f1811c = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f1810b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1811c.setListener((Animator.AnimatorListener) null);
        k kVar = this.f1812d;
        RecyclerView.a0 a0Var = this.f1809a;
        kVar.c(a0Var);
        kVar.f1834o.remove(a0Var);
        kVar.i();
    }

    public final void onAnimationStart(Animator animator) {
        this.f1812d.getClass();
    }
}
