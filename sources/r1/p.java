package r1;

import android.os.IBinder;
import android.os.Parcel;

public final class p implements q {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f6726a;

    public p(IBinder iBinder) {
        this.f6726a = iBinder;
    }

    public final void a() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.wear.watchface.control.IWatchfaceListener");
            this.f6726a.transact(3, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f6726a;
    }

    public final int getApiVersion() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.wear.watchface.control.IWatchfaceListener");
            this.f6726a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void s() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.wear.watchface.control.IWatchfaceListener");
            this.f6726a.transact(6, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void u() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.wear.watchface.control.IWatchfaceListener");
            obtain.writeInt(0);
            this.f6726a.transact(4, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
