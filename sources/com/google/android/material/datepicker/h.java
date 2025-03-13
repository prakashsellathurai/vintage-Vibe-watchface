package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import i0.c;
import java.util.Calendar;

public final class h extends RecyclerView.k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f3260a;

    public h(g gVar) {
        this.f3260a = gVar;
        b0.d((Calendar) null);
        b0.d((Calendar) null);
    }

    public final void d(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof d0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            d0 d0Var = (d0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (c<Long, Long> cVar : this.f3260a.f3248b0.h()) {
                cVar.getClass();
            }
        }
    }
}
