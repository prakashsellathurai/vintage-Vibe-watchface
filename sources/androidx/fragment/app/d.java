package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.l;
import androidx.fragment.app.s0;

public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1139a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1140b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f1141c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ s0.d f1142d;
    public final /* synthetic */ l.a e;

    public d(ViewGroup viewGroup, View view, boolean z8, s0.d dVar, l.a aVar) {
        this.f1139a = viewGroup;
        this.f1140b = view;
        this.f1141c = z8;
        this.f1142d = dVar;
        this.e = aVar;
    }

    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1139a;
        View view = this.f1140b;
        viewGroup.endViewTransition(view);
        if (this.f1141c) {
            this.f1142d.f1330a.e(view);
        }
        this.e.a();
    }
}
