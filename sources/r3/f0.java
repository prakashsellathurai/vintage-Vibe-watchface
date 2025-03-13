package r3;

import android.os.IBinder;
import android.os.Parcel;

public final class f0 implements j {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f6985a;

    public f0(IBinder iBinder) {
        this.f6985a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f6985a;
    }

    public final void b(k0 k0Var, f fVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(k0Var);
            obtain.writeInt(1);
            r0.a(fVar, obtain, 0);
            this.f6985a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
