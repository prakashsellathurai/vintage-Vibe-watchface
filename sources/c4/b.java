package c4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p3.h;
import s3.a;
import s3.c;

public final class b extends a implements h {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: f  reason: collision with root package name */
    public final int f2659f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2660g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f2661h;

    public b() {
        this(2, 0, (Intent) null);
    }

    public b(int i8, int i9, Intent intent) {
        this.f2659f = i8;
        this.f2660g = i9;
        this.f2661h = intent;
    }

    public final Status a() {
        return this.f2660g == 0 ? Status.f3019k : Status.f3020l;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int g9 = c.g(parcel, 20293);
        c.b(parcel, 1, this.f2659f);
        c.b(parcel, 2, this.f2660g);
        c.c(parcel, 3, this.f2661h, i8);
        c.h(parcel, g9);
    }
}
