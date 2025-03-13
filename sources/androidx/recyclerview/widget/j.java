package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;

public final class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.a f1822a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1823b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1824c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f1825d;

    public j(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1825d = kVar;
        this.f1822a = aVar;
        this.f1823b = viewPropertyAnimator;
        this.f1824c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1823b.setListener((Animator.AnimatorListener) null);
        View view = this.f1824c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        k.a aVar = this.f1822a;
        RecyclerView.a0 a0Var = aVar.f1838b;
        k kVar = this.f1825d;
        kVar.c(a0Var);
        kVar.r.remove(aVar.f1838b);
        kVar.i();
    }

    public final void onAnimationStart(Animator animator) {
        RecyclerView.a0 a0Var = this.f1822a.f1838b;
        this.f1825d.getClass();
    }
}
