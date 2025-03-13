package r3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import s3.a;
import s3.c;

public final class k extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<k> CREATOR = new y();

    /* renamed from: f  reason: collision with root package name */
    public final int f6997f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6998g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6999h;

    /* renamed from: i  reason: collision with root package name */
    public final long f7000i;

    /* renamed from: j  reason: collision with root package name */
    public final long f7001j;

    /* renamed from: k  reason: collision with root package name */
    public final String f7002k;

    /* renamed from: l  reason: collision with root package name */
    public final String f7003l;

    /* renamed from: m  reason: collision with root package name */
    public final int f7004m;

    public k(int i8, int i9, int i10, long j8, long j9, String str, String str2, int i11) {
        this.f6997f = i8;
        this.f6998g = i9;
        this.f6999h = i10;
        this.f7000i = j8;
        this.f7001j = j9;
        this.f7002k = str;
        this.f7003l = str2;
        this.f7004m = i11;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i8) {
        int g9 = c.g(parcel, 20293);
        c.b(parcel, 1, this.f6997f);
        c.b(parcel, 2, this.f6998g);
        c.b(parcel, 3, this.f6999h);
        parcel.writeInt(524292);
        parcel.writeLong(this.f7000i);
        parcel.writeInt(524293);
        parcel.writeLong(this.f7001j);
        c.d(parcel, 6, this.f7002k);
        c.d(parcel, 7, this.f7003l);
        c.b(parcel, 8, this.f7004m);
        c.h(parcel, g9);
    }
}
