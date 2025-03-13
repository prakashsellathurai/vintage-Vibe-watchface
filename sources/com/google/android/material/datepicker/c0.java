package com.google.android.material.datepicker;

import android.view.View;
import java.util.Calendar;

public final class c0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3238a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d0 f3239b;

    public c0(d0 d0Var, int i8) {
        this.f3239b = d0Var;
        this.f3238a = i8;
    }

    public final void onClick(View view) {
        d0 d0Var = this.f3239b;
        s p8 = s.p(this.f3238a, d0Var.f3240d.f3250d0.f3287g);
        g<?> gVar = d0Var.f3240d;
        a aVar = gVar.f3249c0;
        s sVar = aVar.f3212f;
        Calendar calendar = sVar.f3286f;
        Calendar calendar2 = p8.f3286f;
        if (calendar2.compareTo(calendar) < 0) {
            p8 = sVar;
        } else {
            s sVar2 = aVar.f3213g;
            if (calendar2.compareTo(sVar2.f3286f) > 0) {
                p8 = sVar2;
            }
        }
        gVar.p(p8);
        gVar.q(1);
    }
}
