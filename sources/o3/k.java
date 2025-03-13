package o3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class k implements Parcelable.Creator<a> {
    public final Object createFromParcel(Parcel parcel) {
        int i8 = b.i(parcel);
        int i9 = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < i8) {
            int readInt = parcel.readInt();
            char c9 = (char) readInt;
            if (c9 == 1) {
                i9 = b.f(parcel, readInt);
            } else if (c9 == 2) {
                i10 = b.f(parcel, readInt);
            } else if (c9 == 3) {
                pendingIntent = (PendingIntent) b.a(parcel, readInt, PendingIntent.CREATOR);
            } else if (c9 != 4) {
                b.h(parcel, readInt);
            } else {
                str = b.b(parcel, readInt);
            }
        }
        b.d(parcel, i8);
        return new a(i9, i10, pendingIntent, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new a[i8];
    }
}
