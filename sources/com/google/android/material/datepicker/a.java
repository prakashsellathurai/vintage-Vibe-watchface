package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.GregorianCalendar;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0034a();

    /* renamed from: f  reason: collision with root package name */
    public final s f3212f;

    /* renamed from: g  reason: collision with root package name */
    public final s f3213g;

    /* renamed from: h  reason: collision with root package name */
    public final c f3214h;

    /* renamed from: i  reason: collision with root package name */
    public final s f3215i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3216j;

    /* renamed from: k  reason: collision with root package name */
    public final int f3217k;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    public static class C0034a implements Parcelable.Creator<a> {
        public final Object createFromParcel(Parcel parcel) {
            Class<s> cls = s.class;
            return new a((s) parcel.readParcelable(cls.getClassLoader()), (s) parcel.readParcelable(cls.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (s) parcel.readParcelable(cls.getClassLoader()));
        }

        public final Object[] newArray(int i8) {
            return new a[i8];
        }
    }

    public static final class b {
        public static final long e = b0.a(s.p(1900, 0).f3291k);

        /* renamed from: f  reason: collision with root package name */
        public static final long f3218f = b0.a(s.p(2100, 11).f3291k);

        /* renamed from: a  reason: collision with root package name */
        public final long f3219a = e;

        /* renamed from: b  reason: collision with root package name */
        public final long f3220b = f3218f;

        /* renamed from: c  reason: collision with root package name */
        public Long f3221c;

        /* renamed from: d  reason: collision with root package name */
        public final c f3222d = new e(Long.MIN_VALUE);

        public b(a aVar) {
            this.f3219a = aVar.f3212f.f3291k;
            this.f3220b = aVar.f3213g.f3291k;
            this.f3221c = Long.valueOf(aVar.f3215i.f3291k);
            this.f3222d = aVar.f3214h;
        }
    }

    public interface c extends Parcelable {
        boolean i(long j8);
    }

    public a(s sVar, s sVar2, c cVar, s sVar3) {
        this.f3212f = sVar;
        this.f3213g = sVar2;
        this.f3215i = sVar3;
        this.f3214h = cVar;
        if (sVar3 != null && sVar.f3286f.compareTo(sVar3.f3286f) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (sVar3 != null && sVar3.f3286f.compareTo(sVar2.f3286f) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        } else if (sVar.f3286f instanceof GregorianCalendar) {
            int i8 = sVar2.f3288h;
            int i9 = sVar.f3288h;
            this.f3217k = ((i8 - i9) * 12) + (sVar2.f3287g - sVar.f3287g) + 1;
            this.f3216j = (i8 - i9) + 1;
        } else {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3212f.equals(aVar.f3212f) && this.f3213g.equals(aVar.f3213g) && i0.b.a(this.f3215i, aVar.f3215i) && this.f3214h.equals(aVar.f3214h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3212f, this.f3213g, this.f3215i, this.f3214h});
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(this.f3212f, 0);
        parcel.writeParcelable(this.f3213g, 0);
        parcel.writeParcelable(this.f3215i, 0);
        parcel.writeParcelable(this.f3214h, 0);
    }
}
