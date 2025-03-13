package c4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import s3.b;

public final class i implements Parcelable.Creator<h> {
    public final Object createFromParcel(Parcel parcel) {
        int i8 = b.i(parcel);
        String str = null;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < i8) {
            int readInt = parcel.readInt();
            char c9 = (char) readInt;
            if (c9 == 1) {
                int g9 = b.g(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (g9 == 0) {
                    arrayList = null;
                } else {
                    ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                    parcel.setDataPosition(dataPosition + g9);
                    arrayList = createStringArrayList;
                }
            } else if (c9 != 2) {
                b.h(parcel, readInt);
            } else {
                str = b.b(parcel, readInt);
            }
        }
        b.d(parcel, i8);
        return new h(str, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new h[i8];
    }
}
