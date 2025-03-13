package androidx.health.services.client.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.impl.event.ExerciseUpdateListenerEvent;

public interface IExerciseUpdateListener extends IInterface {
    public static final String DESCRIPTOR = "androidx.health.services.client.impl.IExerciseUpdateListener";

    public static class Default implements IExerciseUpdateListener {
        public IBinder asBinder() {
            return null;
        }

        public void onExerciseUpdateListenerEvent(ExerciseUpdateListenerEvent exerciseUpdateListenerEvent) {
        }
    }

    public static abstract class Stub extends Binder implements IExerciseUpdateListener {
        static final int TRANSACTION_onExerciseUpdateListenerEvent = 1;

        public static class Proxy implements IExerciseUpdateListener {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IExerciseUpdateListener.DESCRIPTOR;
            }

            public void onExerciseUpdateListenerEvent(ExerciseUpdateListenerEvent exerciseUpdateListenerEvent) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IExerciseUpdateListener.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, exerciseUpdateListenerEvent, 0);
                    this.mRemote.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IExerciseUpdateListener.DESCRIPTOR);
        }

        public static IExerciseUpdateListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IExerciseUpdateListener.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IExerciseUpdateListener)) ? new Proxy(iBinder) : (IExerciseUpdateListener) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(IExerciseUpdateListener.DESCRIPTOR);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(IExerciseUpdateListener.DESCRIPTOR);
                return true;
            } else if (i8 != 1) {
                return super.onTransact(i8, parcel, parcel2, i9);
            } else {
                onExerciseUpdateListenerEvent((ExerciseUpdateListenerEvent) _Parcel.readTypedObject(parcel, ExerciseUpdateListenerEvent.CREATOR));
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

    void onExerciseUpdateListenerEvent(ExerciseUpdateListenerEvent exerciseUpdateListenerEvent);
}
