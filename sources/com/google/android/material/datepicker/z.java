package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class z extends LinearLayoutManager {
    public z(int i8) {
        super(i8);
    }

    public final void B0(RecyclerView recyclerView, int i8) {
        y yVar = new y(recyclerView.getContext());
        yVar.f1699a = i8;
        C0(yVar);
    }
}
