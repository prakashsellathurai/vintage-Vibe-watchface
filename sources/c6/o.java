package c6;

import android.content.Context;
import android.icu.util.TimeZone;
import android.text.format.DateFormat;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.util.Date;
import java.util.HashSet;
import w5.d;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final int f2777a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2778b;

    /* renamed from: c  reason: collision with root package name */
    public long f2779c;

    /* renamed from: d  reason: collision with root package name */
    public int f2780d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f2781f;

    /* renamed from: g  reason: collision with root package name */
    public int f2782g;

    /* renamed from: h  reason: collision with root package name */
    public int f2783h;

    /* renamed from: i  reason: collision with root package name */
    public int f2784i;

    /* renamed from: j  reason: collision with root package name */
    public int f2785j;

    /* renamed from: k  reason: collision with root package name */
    public int f2786k;

    /* renamed from: l  reason: collision with root package name */
    public int f2787l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2788m;

    /* renamed from: n  reason: collision with root package name */
    public int f2789n;

    public o(Context context, ZonedDateTime zonedDateTime) {
        this.f2778b = DateFormat.is24HourFormat(context);
        this.f2780d = zonedDateTime.get(ChronoField.MILLI_OF_SECOND);
        this.e = zonedDateTime.getSecond();
        this.f2781f = zonedDateTime.getMinute();
        this.f2782g = zonedDateTime.get(ChronoField.HOUR_OF_AMPM);
        this.f2783h = zonedDateTime.getHour();
        this.f2784i = zonedDateTime.getDayOfMonth();
        this.f2785j = (zonedDateTime.getDayOfWeek().getValue() % 7) + 1;
        this.f2777a = zonedDateTime.getDayOfYear();
        this.f2786k = zonedDateTime.getMonthValue();
        this.f2787l = zonedDateTime.getYear();
        this.f2789n = zonedDateTime.get(ChronoField.AMPM_OF_DAY);
        this.f2779c = zonedDateTime.toInstant().toEpochMilli();
        this.f2788m = TimeZone.getTimeZone(zonedDateTime.getZone().getId()).inDaylightTime(new Date(this.f2779c));
    }

    public final HashSet a(o oVar) {
        HashSet hashSet = new HashSet();
        if (this.f2778b != oVar.f2778b) {
            hashSet.add(d.Z);
        }
        if (this.f2779c != oVar.f2779c) {
            hashSet.add(d.f8031j);
        }
        if (this.f2780d != oVar.f2780d) {
            hashSet.add(d.f8027h);
            hashSet.add(d.f8029i);
        }
        if (this.e != oVar.e) {
            hashSet.add(d.f8033k);
            hashSet.add(d.f8035l);
            hashSet.add(d.f8029i);
            hashSet.add(d.f8039n);
        }
        if (this.f2781f != oVar.f2781f) {
            hashSet.add(d.f8041o);
            hashSet.add(d.f8043p);
            hashSet.add(d.f8039n);
            hashSet.add(d.f8045q);
            hashSet.add(d.r);
            hashSet.add(d.f8048s);
            hashSet.add(d.f8049t);
            hashSet.add(d.f8019a0);
        }
        if (this.f2783h != oVar.f2783h) {
            hashSet.add(d.f8051u);
            hashSet.add(d.f8052v);
            hashSet.add(d.w);
            hashSet.add(d.f8055x);
            hashSet.add(d.f8045q);
            hashSet.add(d.r);
            hashSet.add(d.C);
            hashSet.add(d.D);
            hashSet.add(d.y);
            hashSet.add(d.f8057z);
            hashSet.add(d.A);
            hashSet.add(d.B);
            hashSet.add(d.f8048s);
            hashSet.add(d.f8049t);
        }
        if (this.f2784i != oVar.f2784i) {
            hashSet.add(d.E);
            hashSet.add(d.F);
            hashSet.add(d.C);
            hashSet.add(d.I);
            hashSet.add(d.K);
            hashSet.add(d.L);
            hashSet.add(d.M);
            hashSet.add(d.N);
        }
        if (this.f2786k != oVar.f2786k) {
            hashSet.add(d.E);
            hashSet.add(d.F);
            hashSet.add(d.C);
            hashSet.add(d.P);
            hashSet.add(d.R);
            hashSet.add(d.S);
            hashSet.add(d.I);
            hashSet.add(d.O);
            hashSet.add(d.U);
            hashSet.add(d.K);
            hashSet.add(d.L);
            hashSet.add(d.M);
            hashSet.add(d.N);
        }
        if (this.f2787l != oVar.f2787l) {
            hashSet.add(d.E);
            hashSet.add(d.C);
            hashSet.add(d.I);
            hashSet.add(d.V);
            hashSet.add(d.W);
            hashSet.add(d.U);
            hashSet.add(d.K);
            hashSet.add(d.O);
            hashSet.add(d.L);
            hashSet.add(d.M);
            hashSet.add(d.N);
        }
        if (this.f2788m != oVar.f2788m) {
            hashSet.add(d.f8019a0);
        }
        if (this.f2789n != oVar.f2789n) {
            hashSet.add(d.f8024f0);
            hashSet.add(d.f8028h0);
        }
        return hashSet;
    }
}
