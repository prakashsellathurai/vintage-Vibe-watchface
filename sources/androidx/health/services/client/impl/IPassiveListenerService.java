package androidx.health.services.client.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.impl.event.PassiveListenerEvent;

public interface IPassiveListenerService extends IInterface {
    public static final int API_VERSION = 1;
    public static final String DESCRIPTOR = "androidx.health.services.client.impl.IPassiveListenerService";

    public static class Default implements IPassiveListenerService {
        public IBinder asBinder() {
            return null;
        }

        public int getApiVersion() {
            return 0;
        }

        public void onPassiveListenerEvent(PassiveListenerEvent passiveListenerEvent) {
        }
    }

    public static abstract class Stub extends Binder implements IPassiveListenerService {
        static final int TRANSACTION_getApiVersion = 1;
        static final int TRANSACTION_onPassiveListenerEvent = 2;

        public static class Proxy implements IPassiveListenerService {
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
                    obtain.writeInterfaceToken(IPassiveListenerService.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IPassiveListenerService.DESCRIPTOR;
            }

            public void onPassiveListenerEvent(PassiveListenerEvent passiveListenerEvent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IPassiveListenerService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, passiveListenerEvent, 0);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IPassiveListenerService.DESCRIPTOR);
        }

        public static IPassiveListenerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IPassiveListenerService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPassiveListenerService)) ? new Proxy(iBinder) : (IPassiveListenerService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(IPassiveListenerService.DESCRIPTOR);
            }
            if (i8 != 1598968902) {
                if (i8 == 1) {
                    int apiVersion = getApiVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(apiVersion);
                } else if (i8 != 2) {
                    return super.onTransact(i8, parcel, parcel2, i9);
                } else {
                    onPassiveListenerEvent((PassiveListenerEvent) _Parcel.readTypedObject(parcel, PassiveListenerEvent.CREATOR));
                    parcel2.writeNoException();
                }
                return true;
            }
            parcel2.writeString(IPassiveListenerService.DESCRIPTOR);
            return true;
        }
    }

    public static class _Parcel {
        /* access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t8, int i8) {
            if (t8 != null) {
                parcel.writeInt(1);
                t8.writeToParcel(parcel, i8);
                return;
            }
            parcel.writeInt(0);
        }
    }

    int getApiVersion();

    void onPassiveListenerEvent(PassiveListenerEvent passiveListenerEvent);
}
