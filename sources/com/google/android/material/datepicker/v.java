package com.google.android.material.datepicker;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.health.services.client.R;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.g;
import j0.w;
import j0.x;
import java.util.Calendar;

public final class v extends RecyclerView.d<a> {

    /* renamed from: d  reason: collision with root package name */
    public final Context f3300d;
    public final a e;

    /* renamed from: f  reason: collision with root package name */
    public final d<?> f3301f;

    /* renamed from: g  reason: collision with root package name */
    public final g.e f3302g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3303h;

    public static class a extends RecyclerView.a0 {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f3304u;

        /* renamed from: v  reason: collision with root package name */
        public final MaterialCalendarGridView f3305v;

        public a(LinearLayout linearLayout, boolean z8) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f3304u = textView;
            int[] iArr = x.f4957a;
            new w().e(textView, Boolean.TRUE);
            this.f3305v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z8) {
                textView.setVisibility(8);
            }
        }
    }

    public v(ContextThemeWrapper contextThemeWrapper, d dVar, a aVar, g.d dVar2) {
        Calendar calendar = aVar.f3212f.f3286f;
        s sVar = aVar.f3215i;
        if (calendar.compareTo(sVar.f3286f) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (sVar.f3286f.compareTo(aVar.f3213g.f3286f) <= 0) {
            int i8 = t.f3293f;
            int i9 = g.f3246k0;
            int dimensionPixelSize = i8 * contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
            int dimensionPixelSize2 = o.r(contextThemeWrapper) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0;
            this.f3300d = contextThemeWrapper;
            this.f3303h = dimensionPixelSize + dimensionPixelSize2;
            this.e = aVar;
            this.f3301f = dVar;
            this.f3302g = dVar2;
            if (!this.f1649a.a()) {
                this.f1650b = true;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public final int c() {
        return this.e.f3217k;
    }

    public final long d(int i8) {
        Calendar b9 = b0.b(this.e.f3212f.f3286f);
        b9.add(2, i8);
        return new s(b9).f3286f.getTimeInMillis();
    }

    public final void f(RecyclerView.a0 a0Var, int i8) {
        a aVar = (a) a0Var;
        a aVar2 = this.e;
        Calendar b9 = b0.b(aVar2.f3212f.f3286f);
        b9.add(2, i8);
        s sVar = new s(b9);
        aVar.f3304u.setText(sVar.s(aVar.f1631a.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f3305v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !sVar.equals(materialCalendarGridView.getAdapter().f3294a)) {
            t tVar = new t(sVar, this.f3301f, aVar2);
            materialCalendarGridView.setNumColumns(sVar.f3289i);
            materialCalendarGridView.setAdapter((ListAdapter) tVar);
        } else {
            materialCalendarGridView.invalidate();
            t a9 = materialCalendarGridView.getAdapter();
            for (Long longValue : a9.f3296c) {
                a9.d(materialCalendarGridView, longValue.longValue());
            }
            d<?> dVar = a9.f3295b;
            if (dVar != null) {
                for (Long longValue2 : dVar.l()) {
                    a9.d(materialCalendarGridView, longValue2.longValue());
                }
                a9.f3296c = dVar.l();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new u(this, materialCalendarGridView));
    }

    public final RecyclerView.a0 g(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!o.r(viewGroup.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.m(-1, this.f3303h));
        return new a(linearLayout, true);
    }
}
