package com.google.android.material.datepicker;

import android.view.View;

public final class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f3265a;

    public k(g gVar) {
        this.f3265a = gVar;
    }

    public final void onClick(View view) {
        g gVar = this.f3265a;
        int i8 = gVar.f3251e0;
        if (i8 == 2) {
            gVar.q(1);
        } else if (i8 == 1) {
            gVar.q(2);
        }
    }
}
