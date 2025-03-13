package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;

public final class i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.a f1818a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1819b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1820c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k f1821d;

    public i(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1821d = kVar;
        this.f1818a = aVar;
        this.f1819b = viewPropertyAnimator;
        this.f1820c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1819b.setListener((Animator.AnimatorListener) null);
        View view = this.f1820c;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        k.a aVar = this.f1818a;
        RecyclerView.a0 a0Var = aVar.f1837a;
        k kVar = this.f1821d;
        kVar.c(a0Var);
        kVar.r.remove(aVar.f1837a);
        kVar.i();
    }

    public final void onAnimationStart(Animator animator) {
        RecyclerView.a0 a0Var = this.f1818a.f1837a;
        this.f1821d.getClass();
    }
}
