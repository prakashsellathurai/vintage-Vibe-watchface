package y3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class b extends Binder implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8404a;

    public b(int i8, String str) {
        this.f8404a = i8;
        if (i8 != 1) {
            attachInterface(this, str);
        } else {
            attachInterface(this, str);
        }
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
        switch (this.f8404a) {
            case 0:
                if (i8 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i8, parcel, parcel2, i9)) {
                    return true;
                }
                return v(i8, parcel, parcel2);
            default:
                if (i8 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i8, parcel, parcel2, i9)) {
                    return true;
                }
                return w(i8, parcel, parcel2);
        }
    }

    public boolean v(int i8, Parcel parcel, Parcel parcel2) {
        throw null;
    }

    public boolean w(int i8, Parcel parcel, Parcel parcel2) {
        return false;
    }
}
