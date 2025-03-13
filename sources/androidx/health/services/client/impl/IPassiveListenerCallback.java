package androidx.health.services.client.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.impl.event.PassiveListenerEvent;

public interface IPassiveListenerCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx.health.services.client.impl.IPassiveListenerCallback";

    public static class Default implements IPassiveListenerCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onPassiveListenerEvent(PassiveListenerEvent passiveListenerEvent) {
        }
    }

    public static abstract class Stub extends Binder implements IPassiveListenerCallback {
        static final int TRANSACTION_onPassiveListenerEvent = 1;

        public static class Proxy implements IPassiveListenerCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IPassiveListenerCallback.DESCRIPTOR;
            }

            public void onPassiveListenerEvent(PassiveListenerEvent passiveListenerEvent) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IPassiveListenerCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, passiveListenerEvent, 0);
                    this.mRemote.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IPassiveListenerCallback.DESCRIPTOR);
        }

        public static IPassiveListenerCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IPassiveListenerCallback.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPassiveListenerCallback)) ? new Proxy(iBinder) : (IPassiveListenerCallback) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(IPassiveListenerCallback.DESCRIPTOR);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(IPassiveListenerCallback.DESCRIPTOR);
                return true;
            } else if (i8 != 1) {
                return super.onTransact(i8, parcel, parcel2, i9);
            } else {
                onPassiveListenerEvent((PassiveListenerEvent) _Parcel.readTypedObject(parcel, PassiveListenerEvent.CREATOR));
                return true;
            }
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

    void onPassiveListenerEvent(PassiveListenerEvent passiveListenerEvent);
}
