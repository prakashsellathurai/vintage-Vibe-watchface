package c4;

import android.os.Parcel;
import android.os.Parcelable;
import o3.a;
import r3.b0;
import s3.b;

public final class m implements Parcelable.Creator<l> {
    public final Object createFromParcel(Parcel parcel) {
        int i8 = b.i(parcel);
        int i9 = 0;
        a aVar = null;
        b0 b0Var = null;
        while (parcel.dataPosition() < i8) {
            int readInt = parcel.readInt();
            char c9 = (char) readInt;
            if (c9 == 1) {
                i9 = b.f(parcel, readInt);
            } else if (c9 == 2) {
                aVar = (a) b.a(parcel, readInt, a.CREATOR);
            } else if (c9 != 3) {
                b.h(parcel, readInt);
            } else {
                b0Var = (b0) b.a(parcel, readInt, b0.CREATOR);
            }
        }
        b.d(parcel, i8);
        return new l(i9, aVar, b0Var);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new l[i8];
    }
}
