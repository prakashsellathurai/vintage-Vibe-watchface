package r1;

import android.os.IBinder;
import android.os.Parcel;

public final class r implements s {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f6727a;

    public r(IBinder iBinder) {
        this.f6727a = iBinder;
    }

    public final void a() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.wear.watchface.control.IWatchfaceReadyListener");
            this.f6727a.transact(3, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f6727a;
    }
}
