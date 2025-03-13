package androidx.health.services.client.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IVersionApiService extends IInterface {
    public static final int CANONICAL_SDK_VERSION = 27;
    public static final String DESCRIPTOR = "androidx.health.services.client.impl.IVersionApiService";
    public static final int VERSION_API_SERVICE_VERSION = 1;

    public static class Default implements IVersionApiService {
        public IBinder asBinder() {
            return null;
        }

        public int getSdkVersion() {
            return 0;
        }

        public int getVersionApiServiceVersion() {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IVersionApiService {
        static final int TRANSACTION_getSdkVersion = 2;
        static final int TRANSACTION_getVersionApiServiceVersion = 1;

        public static class Proxy implements IVersionApiService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IVersionApiService.DESCRIPTOR;
            }

            public int getSdkVersion() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IVersionApiService.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getVersionApiServiceVersion() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IVersionApiService.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IVersionApiService.DESCRIPTOR);
        }

        public static IVersionApiService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IVersionApiService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IVersionApiService)) ? new Proxy(iBinder) : (IVersionApiService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            int i10;
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(IVersionApiService.DESCRIPTOR);
            }
            if (i8 != 1598968902) {
                if (i8 == 1) {
                    i10 = getVersionApiServiceVersion();
                } else if (i8 != 2) {
                    return super.onTransact(i8, parcel, parcel2, i9);
                } else {
                    i10 = getSdkVersion();
                }
                parcel2.writeNoException();
                parcel2.writeInt(i10);
                return true;
            }
            parcel2.writeString(IVersionApiService.DESCRIPTOR);
            return true;
        }
    }

    int getSdkVersion();

    int getVersionApiServiceVersion();
}
