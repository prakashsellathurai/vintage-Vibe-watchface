package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.tabs.TabLayout;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3425a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TabLayout.e f3426b;

    public c(TabLayout.e eVar, int i8) {
        this.f3426b = eVar;
        this.f3425a = i8;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f3426b.f3396b = this.f3425a;
    }

    public final void onAnimationStart(Animator animator) {
        this.f3426b.f3396b = this.f3425a;
    }
}
