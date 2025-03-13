package o3;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class l implements Parcelable.Creator<c> {
    public final Object createFromParcel(Parcel parcel) {
        int i8 = b.i(parcel);
        String str = null;
        int i9 = 0;
        long j8 = -1;
        while (parcel.dataPosition() < i8) {
            int readInt = parcel.readInt();
            char c9 = (char) readInt;
            if (c9 == 1) {
                str = b.b(parcel, readInt);
            } else if (c9 == 2) {
                i9 = b.f(parcel, readInt);
            } else if (c9 != 3) {
                b.h(parcel, readInt);
            } else {
                b.j(parcel, readInt, 8);
                j8 = parcel.readLong();
            }
        }
        b.d(parcel, i8);
        return new c(str, i9, j8);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new c[i8];
    }
}
