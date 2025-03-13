package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

public final class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.a0 f1813a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1814b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1815c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1816d;
    public final /* synthetic */ ViewPropertyAnimator e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f1817f;

    public h(k kVar, RecyclerView.a0 a0Var, int i8, View view, int i9, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1817f = kVar;
        this.f1813a = a0Var;
        this.f1814b = i8;
        this.f1815c = view;
        this.f1816d = i9;
        this.e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        int i8 = this.f1814b;
        View view = this.f1815c;
        if (i8 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f1816d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.e.setListener((Animator.AnimatorListener) null);
        k kVar = this.f1817f;
        RecyclerView.a0 a0Var = this.f1813a;
        kVar.c(a0Var);
        kVar.f1835p.remove(a0Var);
        kVar.i();
    }

    public final void onAnimationStart(Animator animator) {
        this.f1817f.getClass();
    }
}
