package r3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import s3.a;
import s3.c;

public final class n extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<n> CREATOR = new h0();

    /* renamed from: f  reason: collision with root package name */
    public final int f7014f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7015g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f7016h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7017i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7018j;

    public n(int i8, boolean z8, boolean z9, int i9, int i10) {
        this.f7014f = i8;
        this.f7015g = z8;
        this.f7016h = z9;
        this.f7017i = i9;
        this.f7018j = i10;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i8) {
        int g9 = c.g(parcel, 20293);
        c.b(parcel, 1, this.f7014f);
        c.a(parcel, 2, this.f7015g);
        c.a(parcel, 3, this.f7016h);
        c.b(parcel, 4, this.f7017i);
        c.b(parcel, 5, this.f7018j);
        c.h(parcel, g9);
    }
}
