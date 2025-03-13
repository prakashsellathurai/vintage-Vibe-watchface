package androidx.health.services.client.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IHealthServicesApiService extends IInterface {
    public static final int API_VERSION = 1;
    public static final String DESCRIPTOR = "androidx.health.services.client.impl.IHealthServicesApiService";

    public static class Default implements IHealthServicesApiService {
        public IBinder asBinder() {
            return null;
        }

        public int getApiVersion() {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IHealthServicesApiService {
        static final int TRANSACTION_getApiVersion = 1;

        public static class Proxy implements IHealthServicesApiService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public int getApiVersion() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthServicesApiService.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IHealthServicesApiService.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, IHealthServicesApiService.DESCRIPTOR);
        }

        public static IHealthServicesApiService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IHealthServicesApiService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IHealthServicesApiService)) ? new Proxy(iBinder) : (IHealthServicesApiService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(IHealthServicesApiService.DESCRIPTOR);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(IHealthServicesApiService.DESCRIPTOR);
                return true;
            } else if (i8 != 1) {
                return super.onTransact(i8, parcel, parcel2, i9);
            } else {
                int apiVersion = getApiVersion();
                parcel2.writeNoException();
                parcel2.writeInt(apiVersion);
                return true;
            }
        }
    }

    int getApiVersion();
}
