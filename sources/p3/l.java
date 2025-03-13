package p3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import o3.a;
import s3.b;

public final class l implements Parcelable.Creator<Status> {
    public final Object createFromParcel(Parcel parcel) {
        int i8 = b.i(parcel);
        int i9 = 0;
        int i10 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        a aVar = null;
        while (parcel.dataPosition() < i8) {
            int readInt = parcel.readInt();
            char c9 = (char) readInt;
            if (c9 == 1) {
                i10 = b.f(parcel, readInt);
            } else if (c9 == 2) {
                str = b.b(parcel, readInt);
            } else if (c9 == 3) {
                pendingIntent = (PendingIntent) b.a(parcel, readInt, PendingIntent.CREATOR);
            } else if (c9 == 4) {
                aVar = (a) b.a(parcel, readInt, a.CREATOR);
            } else if (c9 != 1000) {
                b.h(parcel, readInt);
            } else {
                i9 = b.f(parcel, readInt);
            }
        }
        b.d(parcel, i8);
        return new Status(i9, i10, str, pendingIntent, aVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new Status[i8];
    }
}
