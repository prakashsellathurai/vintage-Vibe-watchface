package com.samsung.android.wearable.watchfacestudio.editor;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import h6.a;
import r5.b;
import r5.d;

public final /* synthetic */ class m implements d, a.C0064a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f3899a;

    public /* synthetic */ m(View view) {
        this.f3899a = view;
    }

    public final void a(b bVar, float f9, float f10) {
        VerticalOptionView verticalOptionView = (VerticalOptionView) this.f3899a;
        int i8 = VerticalOptionView.K0;
        if (bVar == b.f7066f) {
            RecyclerView.d adapter = verticalOptionView.getAdapter();
            if (adapter instanceof a0) {
                a0 a0Var = (a0) adapter;
                int i9 = a0Var.f3873f + 1;
                if (i9 < a0Var.c()) {
                    verticalOptionView.J0.B0(verticalOptionView, i9);
                } else {
                    verticalOptionView.f0(true);
                }
            }
        } else {
            verticalOptionView.getClass();
        }
    }

    public final void c() {
        ((ConfigPreview) this.f3899a).invalidate();
    }
}
