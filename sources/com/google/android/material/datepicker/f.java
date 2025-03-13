package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import java.util.Calendar;

public final class f extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f3243a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3244b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3245c;

    public f() {
        Calendar d9 = b0.d((Calendar) null);
        this.f3243a = d9;
        this.f3244b = d9.getMaximum(7);
        this.f3245c = d9.getFirstDayOfWeek();
    }

    public final int getCount() {
        return this.f3244b;
    }

    public final Object getItem(int i8) {
        int i9 = this.f3244b;
        if (i8 >= i9) {
            return null;
        }
        int i10 = i8 + this.f3245c;
        if (i10 > i9) {
            i10 -= i9;
        }
        return Integer.valueOf(i10);
    }

    public final long getItemId(int i8) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r6v6, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L_0x0018
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = -2146566073(0xffffffff800e0047, float:-1.285796E-39)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0018:
            int r6 = r4.f3245c
            int r5 = r5 + r6
            int r6 = r4.f3244b
            if (r5 <= r6) goto L_0x0020
            int r5 = r5 - r6
        L_0x0020:
            java.util.Calendar r4 = r4.f3243a
            r6 = 7
            r4.set(r6, r5)
            android.content.res.Resources r5 = r0.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            java.util.Locale r5 = r5.locale
            r2 = 4
            java.lang.String r5 = r4.getDisplayName(r6, r2, r5)
            r0.setText(r5)
            android.content.Context r5 = r7.getContext()
            r7 = -2146369402(0xffffffff80110086, float:-1.561391E-39)
            java.lang.String r5 = r5.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2 = 2
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getDisplayName(r6, r2, r3)
            r7[r1] = r4
            java.lang.String r4 = java.lang.String.format(r5, r7)
            r0.setContentDescription(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.f.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
