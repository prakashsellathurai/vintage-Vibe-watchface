package com.google.android.material.datepicker;

import a1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.health.services.client.R;
import v4.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f3232a;

    /* renamed from: b  reason: collision with root package name */
    public final b f3233b;

    /* renamed from: c  reason: collision with root package name */
    public final b f3234c;

    /* renamed from: d  reason: collision with root package name */
    public final b f3235d;
    public final b e;

    /* renamed from: f  reason: collision with root package name */
    public final b f3236f;

    /* renamed from: g  reason: collision with root package name */
    public final b f3237g;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.b(context, R.attr.materialCalendarStyle, g.class.getCanonicalName()), a.W);
        this.f3232a = b.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f3237g = b.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f3233b = b.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f3234c = b.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList a9 = v4.c.a(context, obtainStyledAttributes, 6);
        this.f3235d = b.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.e = b.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f3236f = b.a(context, obtainStyledAttributes.getResourceId(9, 0));
        new Paint().setColor(a9.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
