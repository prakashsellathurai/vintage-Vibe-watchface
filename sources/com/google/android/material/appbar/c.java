package com.google.android.material.appbar;

import android.view.View;
import k0.g;

public final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f3062a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f3063b;

    public c(AppBarLayout appBarLayout, boolean z8) {
        this.f3062a = appBarLayout;
        this.f3063b = z8;
    }

    public final boolean a(View view) {
        this.f3062a.setExpanded(this.f3063b);
        return true;
    }
}
