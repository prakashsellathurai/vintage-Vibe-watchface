package com.google.android.material.datepicker;

import android.view.View;

public final class p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f3281a;

    public p(o oVar) {
        this.f3281a = oVar;
    }

    public final void onClick(View view) {
        o oVar = this.f3281a;
        oVar.F0.setEnabled(oVar.u0.j());
        oVar.D0.toggle();
        oVar.v(oVar.D0);
        oVar.t();
    }
}
