package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import k0.g;

public final class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f3058a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f3059b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3060c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3061d;
    public final /* synthetic */ AppBarLayout.BaseBehavior e;

    public b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i8) {
        this.e = baseBehavior;
        this.f3058a = coordinatorLayout;
        this.f3059b = appBarLayout;
        this.f3060c = view;
        this.f3061d = i8;
    }

    public final boolean a(View view) {
        this.e.D(this.f3058a, this.f3059b, this.f3060c, this.f3061d, new int[]{0, 0});
        return true;
    }
}
