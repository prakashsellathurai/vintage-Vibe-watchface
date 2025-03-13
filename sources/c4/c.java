package c4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class c implements Parcelable.Creator<b> {
    public final Object createFromParcel(Parcel parcel) {
        int i8 = b.i(parcel);
        int i9 = 0;
        Intent intent = null;
        int i10 = 0;
        while (parcel.dataPosition() < i8) {
            int readInt = parcel.readInt();
            char c9 = (char) readInt;
            if (c9 == 1) {
                i9 = b.f(parcel, readInt);
            } else if (c9 == 2) {
                i10 = b.f(parcel, readInt);
            } else if (c9 != 3) {
                b.h(parcel, readInt);
            } else {
                intent = (Intent) b.a(parcel, readInt, Intent.CREATOR);
            }
        }
        b.d(parcel, i8);
        return new b(i9, i10, intent);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new b[i8];
    }
}
