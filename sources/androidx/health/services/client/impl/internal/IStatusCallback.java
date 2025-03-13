package androidx.health.services.client.impl.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IStatusCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx.health.services.client.impl.internal.IStatusCallback";

    public static class Default implements IStatusCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onFailure(String str) {
        }

        public void onSuccess() {
        }
    }

    public static abstract class Stub extends Binder implements IStatusCallback {
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onSuccess = 1;

        public static class Proxy implements IStatusCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IStatusCallback.DESCRIPTOR;
            }

            public void onFailure(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IStatusCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onSuccess() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IStatusCallback.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IStatusCallback.DESCRIPTOR);
        }

        public static IStatusCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IStatusCallback.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IStatusCallback)) ? new Proxy(iBinder) : (IStatusCallback) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(IStatusCallback.DESCRIPTOR);
            }
            if (i8 != 1598968902) {
                if (i8 == 1) {
                    onSuccess();
                } else if (i8 != 2) {
                    return super.onTransact(i8, parcel, parcel2, i9);
                } else {
                    onFailure(parcel.readString());
                }
                return true;
            }
            parcel2.writeString(IStatusCallback.DESCRIPTOR);
            return true;
        }
    }

    void onFailure(String str);

    void onSuccess();
}
