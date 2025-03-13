package com.google.android.material.datepicker;

import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.TimeZone;

public final class j extends RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f3262a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f3263b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f3264c;

    public j(g gVar, v vVar, MaterialButton materialButton) {
        this.f3264c = gVar;
        this.f3262a = vVar;
        this.f3263b = materialButton;
    }

    public final void a(int i8, RecyclerView recyclerView) {
        if (i8 == 0) {
            recyclerView.announceForAccessibility(this.f3263b.getText());
        }
    }

    public final void b(RecyclerView recyclerView, int i8, int i9) {
        g gVar = this.f3264c;
        int O0 = i8 < 0 ? ((LinearLayoutManager) gVar.f3254h0.getLayoutManager()).O0() : ((LinearLayoutManager) gVar.f3254h0.getLayoutManager()).P0();
        v vVar = this.f3262a;
        Calendar b9 = b0.b(vVar.e.f3212f.f3286f);
        b9.add(2, O0);
        gVar.f3250d0 = new s(b9);
        Calendar b10 = b0.b(vVar.e.f3212f.f3286f);
        b10.add(2, O0);
        b10.set(5, 1);
        Calendar b11 = b0.b(b10);
        b11.get(2);
        b11.get(1);
        b11.getMaximum(7);
        b11.getActualMaximum(5);
        b11.getTimeInMillis();
        long timeInMillis = b11.getTimeInMillis();
        this.f3263b.setText(DateUtils.formatDateTime(vVar.f3300d, timeInMillis - ((long) TimeZone.getDefault().getOffset(timeInMillis)), 36));
    }
}
