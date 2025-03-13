package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

public final class d implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f3427a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TabLayout.h f3428b;

    public d(TabLayout.h hVar, View view) {
        this.f3428b = hVar;
        this.f3427a = view;
    }

    public final void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        View view2 = this.f3427a;
        if (view2.getVisibility() == 0) {
            this.f3428b.d(view2);
        }
    }
}
