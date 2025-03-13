package c4;

import android.os.Parcel;
import android.os.Parcelable;
import r3.z;
import s3.a;
import s3.c;

public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: f  reason: collision with root package name */
    public final int f2664f;

    /* renamed from: g  reason: collision with root package name */
    public final z f2665g;

    public j(int i8, z zVar) {
        this.f2664f = i8;
        this.f2665g = zVar;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int g9 = c.g(parcel, 20293);
        c.b(parcel, 1, this.f2664f);
        c.c(parcel, 2, this.f2665g, i8);
        c.h(parcel, g9);
    }
}
