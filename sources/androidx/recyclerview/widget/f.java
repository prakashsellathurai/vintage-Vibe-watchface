package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.a0 f1805a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1806b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1807c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f1808d;

    public f(View view, ViewPropertyAnimator viewPropertyAnimator, k kVar, RecyclerView.a0 a0Var) {
        this.f1808d = kVar;
        this.f1805a = a0Var;
        this.f1806b = viewPropertyAnimator;
        this.f1807c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1806b.setListener((Animator.AnimatorListener) null);
        this.f1807c.setAlpha(1.0f);
        k kVar = this.f1808d;
        RecyclerView.a0 a0Var = this.f1805a;
        kVar.c(a0Var);
        kVar.f1836q.remove(a0Var);
        kVar.i();
    }

    public final void onAnimationStart(Animator animator) {
        this.f1808d.getClass();
    }
}
