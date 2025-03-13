package r3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o3.c;
import s3.b;

public final class p0 implements Parcelable.Creator<o0> {
    public final Object createFromParcel(Parcel parcel) {
        int i8 = b.i(parcel);
        int i9 = 0;
        Bundle bundle = null;
        c[] cVarArr = null;
        e eVar = null;
        while (parcel.dataPosition() < i8) {
            int readInt = parcel.readInt();
            char c9 = (char) readInt;
            if (c9 == 1) {
                int g9 = b.g(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (g9 == 0) {
                    bundle = null;
                } else {
                    Bundle readBundle = parcel.readBundle();
                    parcel.setDataPosition(dataPosition + g9);
                    bundle = readBundle;
                }
            } else if (c9 == 2) {
                cVarArr = (c[]) b.c(parcel, readInt, c.CREATOR);
            } else if (c9 == 3) {
                i9 = b.f(parcel, readInt);
            } else if (c9 != 4) {
                b.h(parcel, readInt);
            } else {
                eVar = (e) b.a(parcel, readInt, e.CREATOR);
            }
        }
        b.d(parcel, i8);
        return new o0(bundle, cVarArr, i9, eVar);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new o0[i8];
    }
}
