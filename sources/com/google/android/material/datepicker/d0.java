package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.health.services.client.R;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Locale;

public final class d0 extends RecyclerView.d<a> {

    /* renamed from: d  reason: collision with root package name */
    public final g<?> f3240d;

    public static class a extends RecyclerView.a0 {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f3241u;

        public a(TextView textView) {
            super(textView);
            this.f3241u = textView;
        }
    }

    public d0(g<?> gVar) {
        this.f3240d = gVar;
    }

    public final int c() {
        return this.f3240d.f3249c0.f3216j;
    }

    public final void f(RecyclerView.a0 a0Var, int i8) {
        g<?> gVar = this.f3240d;
        int i9 = gVar.f3249c0.f3212f.f3288h + i8;
        TextView textView = ((a) a0Var).f3241u;
        String string = textView.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        textView.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i9)}));
        textView.setContentDescription(String.format(string, new Object[]{Integer.valueOf(i9)}));
        c cVar = gVar.f3252f0;
        Calendar c9 = b0.c();
        b bVar = c9.get(1) == i9 ? cVar.f3236f : cVar.f3235d;
        for (Long longValue : gVar.f3248b0.l()) {
            c9.setTimeInMillis(longValue.longValue());
            if (c9.get(1) == i9) {
                bVar = cVar.e;
            }
        }
        bVar.b(textView);
        textView.setOnClickListener(new c0(this, i9));
    }

    public final RecyclerView.a0 g(ViewGroup viewGroup) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
