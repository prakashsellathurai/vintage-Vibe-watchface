package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

public final class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f3268a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f3269b;

    public m(g gVar, v vVar) {
        this.f3269b = gVar;
        this.f3268a = vVar;
    }

    public final void onClick(View view) {
        g gVar = this.f3269b;
        int P0 = ((LinearLayoutManager) gVar.f3254h0.getLayoutManager()).P0() - 1;
        if (P0 >= 0) {
            Calendar b9 = b0.b(this.f3268a.e.f3212f.f3286f);
            b9.add(2, P0);
            gVar.p(new s(b9));
        }
    }
}
