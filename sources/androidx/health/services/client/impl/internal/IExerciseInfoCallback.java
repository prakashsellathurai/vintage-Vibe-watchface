package androidx.health.services.client.impl.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.impl.response.ExerciseInfoResponse;

public interface IExerciseInfoCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx.health.services.client.impl.internal.IExerciseInfoCallback";

    public static class Default implements IExerciseInfoCallback {
        public IBinder asBinder() {
            return null;
        }

        public void onExerciseInfo(ExerciseInfoResponse exerciseInfoResponse) {
        }

        public void onFailure(String str) {
        }
    }

    public static abstract class Stub extends Binder implements IExerciseInfoCallback {
        static final int TRANSACTION_onExerciseInfo = 1;
        static final int TRANSACTION_onFailure = 2;

        public static class Proxy implements IExerciseInfoCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IExerciseInfoCallback.DESCRIPTOR;
            }

            public void onExerciseInfo(ExerciseInfoResponse exerciseInfoResponse) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IExerciseInfoCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, exerciseInfoResponse, 0);
                    this.mRemote.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void onFailure(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IExerciseInfoCallback.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IExerciseInfoCallback.DESCRIPTOR);
        }

        public static IExerciseInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IExerciseInfoCallback.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IExerciseInfoCallback)) ? new Proxy(iBinder) : (IExerciseInfoCallback) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(IExerciseInfoCallback.DESCRIPTOR);
            }
            if (i8 != 1598968902) {
                if (i8 == 1) {
                    onExerciseInfo((ExerciseInfoResponse) _Parcel.readTypedObject(parcel, ExerciseInfoResponse.CREATOR));
                } else if (i8 != 2) {
                    return super.onTransact(i8, parcel, parcel2, i9);
                } else {
                    onFailure(parcel.readString());
                }
                return true;
            }
            parcel2.writeString(IExerciseInfoCallback.DESCRIPTOR);
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

    void onExerciseInfo(ExerciseInfoResponse exerciseInfoResponse);

    void onFailure(String str);
}
