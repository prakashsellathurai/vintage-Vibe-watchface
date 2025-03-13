package androidx.health.services.client.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.impl.event.MeasureCallbackEvent;

public interface IMeasureCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx.health.services.client.impl.IMeasureCallback";

    public static class Default implements IMeasureCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onMeasureCallbackEvent(MeasureCallbackEvent measureCallbackEvent) {
        }
    }

    public static abstract class Stub extends Binder implements IMeasureCallback {
        static final int TRANSACTION_onMeasureCallbackEvent = 1;

        public static class Proxy implements IMeasureCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IMeasureCallback.DESCRIPTOR;
            }

            public void onMeasureCallbackEvent(MeasureCallbackEvent measureCallbackEvent) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMeasureCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, measureCallbackEvent, 0);
                    this.mRemote.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMeasureCallback.DESCRIPTOR);
        }

        public static IMeasureCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IMeasureCallback.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMeasureCallback)) ? new Proxy(iBinder) : (IMeasureCallback) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(IMeasureCallback.DESCRIPTOR);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(IMeasureCallback.DESCRIPTOR);
                return true;
            } else if (i8 != 1) {
                return super.onTransact(i8, parcel, parcel2, i9);
            } else {
                onMeasureCallbackEvent((MeasureCallbackEvent) _Parcel.readTypedObject(parcel, MeasureCallbackEvent.CREATOR));
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

    void onMeasureCallbackEvent(MeasureCallbackEvent measureCallbackEvent);
}
