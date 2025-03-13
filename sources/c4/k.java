package c4;

import android.os.Parcel;
import android.os.Parcelable;
import r3.z;
import s3.b;

public final class k implements Parcelable.Creator<j> {
    public final Object createFromParcel(Parcel parcel) {
        int i8 = b.i(parcel);
        int i9 = 0;
        z zVar = null;
        while (parcel.dataPosition() < i8) {
            int readInt = parcel.readInt();
            char c9 = (char) readInt;
            if (c9 == 1) {
                i9 = b.f(parcel, readInt);
            } else if (c9 != 2) {
                b.h(parcel, readInt);
            } else {
                zVar = (z) b.a(parcel, readInt, z.CREATOR);
            }
        }
        b.d(parcel, i8);
        return new j(i9, zVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new j[i8];
    }
}
