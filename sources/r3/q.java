package r3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import s3.b;

public final class q implements Parcelable.Creator<o> {
    public final Object createFromParcel(Parcel parcel) {
        int i8 = b.i(parcel);
        int i9 = 0;
        while (true) {
            ArrayList<k> arrayList = null;
            while (true) {
                if (parcel.dataPosition() < i8) {
                    int readInt = parcel.readInt();
                    char c9 = (char) readInt;
                    if (c9 == 1) {
                        i9 = b.f(parcel, readInt);
                    } else if (c9 != 2) {
                        b.h(parcel, readInt);
                    } else {
                        Parcelable.Creator<k> creator = k.CREATOR;
                        int g9 = b.g(parcel, readInt);
                        int dataPosition = parcel.dataPosition();
                        if (g9 != 0) {
                            arrayList = parcel.createTypedArrayList(creator);
                            parcel.setDataPosition(dataPosition + g9);
                        }
                    }
                } else {
                    b.d(parcel, i8);
                    return new o(i9, arrayList);
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new o[i8];
    }
}
