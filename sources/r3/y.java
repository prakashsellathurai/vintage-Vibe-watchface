package r3;

import android.os.Parcel;
import android.os.Parcelable;
import s3.b;

public final class y implements Parcelable.Creator<k> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int i8 = b.i(parcel);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        long j8 = 0;
        long j9 = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < i8) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i9 = b.f(parcel2, readInt);
                    break;
                case 2:
                    i10 = b.f(parcel2, readInt);
                    break;
                case 3:
                    i11 = b.f(parcel2, readInt);
                    break;
                case 4:
                    b.j(parcel2, readInt, 8);
                    j8 = parcel.readLong();
                    break;
                case 5:
                    b.j(parcel2, readInt, 8);
                    j9 = parcel.readLong();
                    break;
                case 6:
                    str = b.b(parcel2, readInt);
                    break;
                case 7:
                    str2 = b.b(parcel2, readInt);
                    break;
                case 8:
                    i12 = b.f(parcel2, readInt);
                    break;
                default:
                    b.h(parcel2, readInt);
                    break;
            }
        }
        b.d(parcel2, i8);
        return new k(i9, i10, i11, j8, j9, str, str2, i12);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new k[i8];
    }
}
