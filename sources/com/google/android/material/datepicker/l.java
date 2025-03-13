package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

public final class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f3266a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f3267b;

    public l(g gVar, v vVar) {
        this.f3267b = gVar;
        this.f3266a = vVar;
    }

    public final void onClick(View view) {
        g gVar = this.f3267b;
        int O0 = ((LinearLayoutManager) gVar.f3254h0.getLayoutManager()).O0() + 1;
        if (O0 < gVar.f3254h0.getAdapter().c()) {
            Calendar b9 = b0.b(this.f3266a.e.f3212f.f3286f);
            b9.add(2, O0);
            gVar.p(new s(b9));
        }
    }
}
