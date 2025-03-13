package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<a0> f3231a = new AtomicReference<>();

    public static long a(long j8) {
        Calendar d9 = d((Calendar) null);
        d9.setTimeInMillis(j8);
        return b(d9).getTimeInMillis();
    }

    public static Calendar b(Calendar calendar) {
        Calendar d9 = d(calendar);
        Calendar d10 = d((Calendar) null);
        d10.set(d9.get(1), d9.get(2), d9.get(5));
        return d10;
    }

    public static Calendar c() {
        a0 a0Var = f3231a.get();
        if (a0Var == null) {
            a0Var = a0.f3223c;
        }
        TimeZone timeZone = a0Var.f3225b;
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l8 = a0Var.f3224a;
        if (l8 != null) {
            instance.setTimeInMillis(l8.longValue());
        }
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instance;
    }

    public static Calendar d(Calendar calendar) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }
}
