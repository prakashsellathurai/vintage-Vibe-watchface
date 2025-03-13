package r3;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class h0 implements Parcelable.Creator<n> {
    public final Object createFromParcel(Parcel parcel) {
        int i8 = b.i(parcel);
        int i9 = 0;
        boolean z8 = false;
        boolean z9 = false;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < i8) {
            int readInt = parcel.readInt();
            char c9 = (char) readInt;
            if (c9 == 1) {
                i9 = b.f(parcel, readInt);
            } else if (c9 == 2) {
                z8 = b.e(parcel, readInt);
            } else if (c9 == 3) {
                z9 = b.e(parcel, readInt);
            } else if (c9 == 4) {
                i10 = b.f(parcel, readInt);
            } else if (c9 != 5) {
                b.h(parcel, readInt);
            } else {
                i11 = b.f(parcel, readInt);
            }
        }
        b.d(parcel, i8);
        return new n(i9, z8, z9, i10, i11);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new n[i8];
    }
}
