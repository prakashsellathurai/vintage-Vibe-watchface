package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

public final class s implements Comparable<s>, Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final Calendar f3286f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3287g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3288h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3289i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3290j;

    /* renamed from: k  reason: collision with root package name */
    public final long f3291k;

    /* renamed from: l  reason: collision with root package name */
    public String f3292l;

    public static class a implements Parcelable.Creator<s> {
        public final Object createFromParcel(Parcel parcel) {
            return s.p(parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i8) {
            return new s[i8];
        }
    }

    public s(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b9 = b0.b(calendar);
        this.f3286f = b9;
        this.f3287g = b9.get(2);
        this.f3288h = b9.get(1);
        this.f3289i = b9.getMaximum(7);
        this.f3290j = b9.getActualMaximum(5);
        this.f3291k = b9.getTimeInMillis();
    }

    public static s p(int i8, int i9) {
        Calendar d9 = b0.d((Calendar) null);
        d9.set(1, i8);
        d9.set(2, i9);
        return new s(d9);
    }

    public static s q(long j8) {
        Calendar d9 = b0.d((Calendar) null);
        d9.setTimeInMillis(j8);
        return new s(d9);
    }

    public final int compareTo(Object obj) {
        return this.f3286f.compareTo(((s) obj).f3286f);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f3287g == sVar.f3287g && this.f3288h == sVar.f3288h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3287g), Integer.valueOf(this.f3288h)});
    }

    public final int r() {
        Calendar calendar = this.f3286f;
        int firstDayOfWeek = calendar.get(7) - calendar.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f3289i : firstDayOfWeek;
    }

    public final String s(Context context) {
        if (this.f3292l == null) {
            long timeInMillis = this.f3286f.getTimeInMillis();
            this.f3292l = DateUtils.formatDateTime(context, timeInMillis - ((long) TimeZone.getDefault().getOffset(timeInMillis)), 36);
        }
        return this.f3292l;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f3288h);
        parcel.writeInt(this.f3287g);
    }
}
