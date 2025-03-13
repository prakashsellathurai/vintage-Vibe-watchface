package r3;

import android.os.Parcel;
import o3.n;
import y3.b;
import z3.a;

public abstract class z0 extends b implements a1 {
    public z0() {
        super(1, "com.google.android.gms.common.internal.ICertData");
    }

    public final boolean w(int i8, Parcel parcel, Parcel parcel2) {
        if (i8 == 1) {
            x3.b g9 = ((n) this).g();
            parcel2.writeNoException();
            int i9 = a.f8688a;
            parcel2.writeStrongBinder(g9);
        } else if (i8 != 2) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(((n) this).f6101b);
        }
        return true;
    }
}
