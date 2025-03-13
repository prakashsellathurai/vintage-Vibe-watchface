package r3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o3.c;
import s3.a;

public final class o0 extends a {
    public static final Parcelable.Creator<o0> CREATOR = new p0();

    /* renamed from: f  reason: collision with root package name */
    public final Bundle f7022f;

    /* renamed from: g  reason: collision with root package name */
    public final c[] f7023g;

    /* renamed from: h  reason: collision with root package name */
    public final int f7024h;

    /* renamed from: i  reason: collision with root package name */
    public final e f7025i;

    public o0() {
    }

    public o0(Bundle bundle, c[] cVarArr, int i8, e eVar) {
        this.f7022f = bundle;
        this.f7023g = cVarArr;
        this.f7024h = i8;
        this.f7025i = eVar;
    }

    public final void writeToParcel(Parcel parcel, int i8) {
        int g9 = s3.c.g(parcel, 20293);
        Bundle bundle = this.f7022f;
        if (bundle != null) {
            int g10 = s3.c.g(parcel, 1);
            parcel.writeBundle(bundle);
            s3.c.h(parcel, g10);
        }
        s3.c.e(parcel, 2, this.f7023g, i8);
        s3.c.b(parcel, 3, this.f7024h);
        s3.c.c(parcel, 4, this.f7025i, i8);
        s3.c.h(parcel, g9);
    }
}
