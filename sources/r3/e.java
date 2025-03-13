package r3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import s3.a;
import s3.c;

public final class e extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<e> CREATOR = new q0();

    /* renamed from: f  reason: collision with root package name */
    public final n f6966f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6967g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6968h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f6969i;

    /* renamed from: j  reason: collision with root package name */
    public final int f6970j;

    /* renamed from: k  reason: collision with root package name */
    public final int[] f6971k;

    public e(@RecentlyNonNull n nVar, boolean z8, boolean z9, int[] iArr, int i8, int[] iArr2) {
        this.f6966f = nVar;
        this.f6967g = z8;
        this.f6968h = z9;
        this.f6969i = iArr;
        this.f6970j = i8;
        this.f6971k = iArr2;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i8) {
        int g9 = c.g(parcel, 20293);
        c.c(parcel, 1, this.f6966f, i8);
        c.a(parcel, 2, this.f6967g);
        c.a(parcel, 3, this.f6968h);
        int[] iArr = this.f6969i;
        if (iArr != null) {
            int g10 = c.g(parcel, 4);
            parcel.writeIntArray(iArr);
            c.h(parcel, g10);
        }
        c.b(parcel, 5, this.f6970j);
        int[] iArr2 = this.f6971k;
        if (iArr2 != null) {
            int g11 = c.g(parcel, 6);
            parcel.writeIntArray(iArr2);
            c.h(parcel, g11);
        }
        c.h(parcel, g9);
    }
}
