package r1;

import android.os.Parcel;
import android.os.Parcelable;

public final class i {
    public static void a(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
            return;
        }
        parcel.writeInt(0);
    }
}
