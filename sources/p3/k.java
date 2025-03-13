package p3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import s3.b;

public final class k implements Parcelable.Creator<Scope> {
    public final Object createFromParcel(Parcel parcel) {
        int i8 = b.i(parcel);
        int i9 = 0;
        String str = null;
        while (parcel.dataPosition() < i8) {
            int readInt = parcel.readInt();
            char c9 = (char) readInt;
            if (c9 == 1) {
                i9 = b.f(parcel, readInt);
            } else if (c9 != 2) {
                b.h(parcel, readInt);
            } else {
                str = b.b(parcel, readInt);
            }
        }
        b.d(parcel, i8);
        return new Scope(i9, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new Scope[i8];
    }
}
