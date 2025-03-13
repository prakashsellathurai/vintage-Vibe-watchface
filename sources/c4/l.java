package c4;

import android.os.Parcel;
import android.os.Parcelable;
import r3.b0;
import s3.a;
import s3.c;

public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: f  reason: collision with root package name */
    public final int f2666f;

    /* renamed from: g  reason: collision with root package name */
    public final o3.a f2667g;

    /* renamed from: h  reason: collision with root package name */
    public final b0 f2668h;

    public l(int i8, o3.a aVar, b0 b0Var) {
        this.f2666f = i8;
        this.f2667g = aVar;
        this.f2668h = b0Var;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int g9 = c.g(parcel, 20293);
        c.b(parcel, 1, this.f2666f);
        c.c(parcel, 2, this.f2667g, i8);
        c.c(parcel, 3, this.f2668h, i8);
        c.h(parcel, g9);
    }
}
