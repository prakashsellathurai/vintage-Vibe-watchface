package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

public final class t extends BaseAdapter {

    /* renamed from: f  reason: collision with root package name */
    public static final int f3293f = b0.d((Calendar) null).getMaximum(4);

    /* renamed from: a  reason: collision with root package name */
    public final s f3294a;

    /* renamed from: b  reason: collision with root package name */
    public final d<?> f3295b;

    /* renamed from: c  reason: collision with root package name */
    public Collection<Long> f3296c;

    /* renamed from: d  reason: collision with root package name */
    public c f3297d;
    public final a e;

    public t(s sVar, d<?> dVar, a aVar) {
        this.f3294a = sVar;
        this.f3295b = dVar;
        this.e = aVar;
        this.f3296c = dVar.l();
    }

    public final int a() {
        return this.f3294a.r();
    }

    /* renamed from: b */
    public final Long getItem(int i8) {
        s sVar = this.f3294a;
        if (i8 < sVar.r() || i8 > (sVar.r() + sVar.f3290j) - 1) {
            return null;
        }
        Calendar b9 = b0.b(sVar.f3286f);
        b9.set(5, (i8 - sVar.r()) + 1);
        return Long.valueOf(b9.getTimeInMillis());
    }

    public final void c(TextView textView, long j8) {
        b bVar;
        if (textView != null) {
            boolean z8 = false;
            if (this.e.f3214h.i(j8)) {
                textView.setEnabled(true);
                Iterator<Long> it = this.f3295b.l().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (b0.a(j8) == b0.a(it.next().longValue())) {
                        z8 = true;
                        break;
                    }
                }
                if (z8) {
                    bVar = this.f3297d.f3233b;
                } else {
                    int i8 = (b0.c().getTimeInMillis() > j8 ? 1 : (b0.c().getTimeInMillis() == j8 ? 0 : -1));
                    c cVar = this.f3297d;
                    bVar = i8 == 0 ? cVar.f3234c : cVar.f3232a;
                }
            } else {
                textView.setEnabled(false);
                bVar = this.f3297d.f3237g;
            }
            bVar.b(textView);
        }
    }

    public final void d(MaterialCalendarGridView materialCalendarGridView, long j8) {
        s q8 = s.q(j8);
        s sVar = this.f3294a;
        if (q8.equals(sVar)) {
            Calendar b9 = b0.b(sVar.f3286f);
            b9.setTimeInMillis(j8);
            int i8 = b9.get(5);
            c((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter().a() + (i8 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j8);
        }
    }

    public final int getCount() {
        return this.f3294a.f3290j + a();
    }

    public final long getItemId(int i8) {
        return (long) (i8 / this.f3294a.f3289i);
    }

    /* JADX WARNING: type inference failed for: r10v17, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            android.content.Context r0 = r11.getContext()
            com.google.android.material.datepicker.c r1 = r8.f3297d
            if (r1 != 0) goto L_0x000f
            com.google.android.material.datepicker.c r1 = new com.google.android.material.datepicker.c
            r1.<init>(r0)
            r8.f3297d = r1
        L_0x000f:
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r10 != 0) goto L_0x0027
            android.content.Context r10 = r11.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r0 = -2146566074(0xffffffff800e0046, float:-1.285795E-39)
            android.view.View r10 = r10.inflate(r0, r11, r1)
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0027:
            int r10 = r8.a()
            int r10 = r9 - r10
            if (r10 < 0) goto L_0x00c7
            com.google.android.material.datepicker.s r11 = r8.f3294a
            int r2 = r11.f3290j
            if (r10 < r2) goto L_0x0037
            goto L_0x00c7
        L_0x0037:
            r2 = 1
            int r10 = r10 + r2
            r0.setTag(r11)
            android.content.res.Resources r3 = r0.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            java.util.Locale r3 = r3.locale
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r4[r1] = r5
            java.lang.String r5 = "%d"
            java.lang.String r3 = java.lang.String.format(r3, r5, r4)
            r0.setText(r3)
            java.util.Calendar r3 = r11.f3286f
            java.util.Calendar r3 = com.google.android.material.datepicker.b0.b(r3)
            r4 = 5
            r3.set(r4, r10)
            long r5 = r3.getTimeInMillis()
            java.util.Calendar r10 = com.google.android.material.datepicker.b0.c()
            r10.set(r4, r2)
            java.util.Calendar r10 = com.google.android.material.datepicker.b0.b(r10)
            r3 = 2
            r10.get(r3)
            int r3 = r10.get(r2)
            r7 = 7
            r10.getMaximum(r7)
            r10.getActualMaximum(r4)
            r10.getTimeInMillis()
            int r10 = r11.f3288h
            java.lang.String r11 = "UTC"
            if (r10 != r3) goto L_0x00a3
            java.util.Locale r10 = java.util.Locale.getDefault()
            java.lang.String r3 = "MMMEd"
            android.icu.text.DateFormat r10 = android.icu.text.DateFormat.getInstanceForSkeleton(r3, r10)
            android.icu.util.TimeZone r11 = android.icu.util.TimeZone.getTimeZone(r11)
            r10.setTimeZone(r11)
            java.util.Date r11 = new java.util.Date
            r11.<init>(r5)
            java.lang.String r10 = r10.format(r11)
            goto L_0x00bd
        L_0x00a3:
            java.util.Locale r10 = java.util.Locale.getDefault()
            java.lang.String r3 = "yMMMEd"
            android.icu.text.DateFormat r10 = android.icu.text.DateFormat.getInstanceForSkeleton(r3, r10)
            android.icu.util.TimeZone r11 = android.icu.util.TimeZone.getTimeZone(r11)
            r10.setTimeZone(r11)
            java.util.Date r11 = new java.util.Date
            r11.<init>(r5)
            java.lang.String r10 = r10.format(r11)
        L_0x00bd:
            r0.setContentDescription(r10)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x00cf
        L_0x00c7:
            r10 = 8
            r0.setVisibility(r10)
            r0.setEnabled(r1)
        L_0x00cf:
            java.lang.Long r9 = r8.getItem(r9)
            if (r9 != 0) goto L_0x00d6
            goto L_0x00dd
        L_0x00d6:
            long r9 = r9.longValue()
            r8.c(r0, r9)
        L_0x00dd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.t.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean hasStableIds() {
        return true;
    }
}
