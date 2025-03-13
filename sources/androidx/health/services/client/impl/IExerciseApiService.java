package androidx.health.services.client.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.impl.IExerciseUpdateListener;
import androidx.health.services.client.impl.internal.IExerciseInfoCallback;
import androidx.health.services.client.impl.internal.IStatusCallback;
import androidx.health.services.client.impl.request.AutoPauseAndResumeConfigRequest;
import androidx.health.services.client.impl.request.CapabilitiesRequest;
import androidx.health.services.client.impl.request.ExerciseGoalRequest;
import androidx.health.services.client.impl.request.FlushRequest;
import androidx.health.services.client.impl.request.PrepareExerciseRequest;
import androidx.health.services.client.impl.request.StartExerciseRequest;
import androidx.health.services.client.impl.response.ExerciseCapabilitiesResponse;

public interface IExerciseApiService extends IInterface {
    public static final int API_VERSION = 1;
    public static final String DESCRIPTOR = "androidx.health.services.client.impl.IExerciseApiService";

    public static class Default implements IExerciseApiService {
        public void addGoalToActiveExercise(ExerciseGoalRequest exerciseGoalRequest, IStatusCallback iStatusCallback) {
        }

        public IBinder asBinder() {
            return null;
        }

        public void clearUpdateListener(String str, IExerciseUpdateListener iExerciseUpdateListener, IStatusCallback iStatusCallback) {
        }

        public void endExercise(String str, IStatusCallback iStatusCallback) {
        }

        public void flushExercise(FlushRequest flushRequest, IStatusCallback iStatusCallback) {
        }

        public int getApiVersion() {
            return 0;
        }

        public ExerciseCapabilitiesResponse getCapabilities(CapabilitiesRequest capabilitiesRequest) {
            return null;
        }

        public void getCurrentExerciseInfo(String str, IExerciseInfoCallback iExerciseInfoCallback) {
        }

        public void markLap(String str, IStatusCallback iStatusCallback) {
        }

        public void overrideAutoPauseAndResumeForActiveExercise(AutoPauseAndResumeConfigRequest autoPauseAndResumeConfigRequest, IStatusCallback iStatusCallback) {
        }

        public void pauseExercise(String str, IStatusCallback iStatusCallback) {
        }

        public void prepareExercise(PrepareExerciseRequest prepareExerciseRequest, IStatusCallback iStatusCallback) {
        }

        public void removeGoalFromActiveExercise(ExerciseGoalRequest exerciseGoalRequest, IStatusCallback iStatusCallback) {
        }

        public void resumeExercise(String str, IStatusCallback iStatusCallback) {
        }

        public void setUpdateListener(String str, IExerciseUpdateListener iExerciseUpdateListener, IStatusCallback iStatusCallback) {
        }

        public void startExercise(StartExerciseRequest startExerciseRequest, IStatusCallback iStatusCallback) {
        }
    }

    public static abstract class Stub extends Binder implements IExerciseApiService {
        static final int TRANSACTION_addGoalToActiveExercise = 10;
        static final int TRANSACTION_clearUpdateListener = 9;
        static final int TRANSACTION_endExercise = 5;
        static final int TRANSACTION_flushExercise = 13;
        static final int TRANSACTION_getApiVersion = 1;
        static final int TRANSACTION_getCapabilities = 12;
        static final int TRANSACTION_getCurrentExerciseInfo = 7;
        static final int TRANSACTION_markLap = 6;
        static final int TRANSACTION_overrideAutoPauseAndResumeForActiveExercise = 11;
        static final int TRANSACTION_pauseExercise = 3;
        static final int TRANSACTION_prepareExercise = 15;
        static final int TRANSACTION_removeGoalFromActiveExercise = 14;
        static final int TRANSACTION_resumeExercise = 4;
        static final int TRANSACTION_setUpdateListener = 8;
        static final int TRANSACTION_startExercise = 2;

        public static class Proxy implements IExerciseApiService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public void addGoalToActiveExercise(ExerciseGoalRequest exerciseGoalRequest, IStatusCallback iStatusCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IExerciseApiService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, exerciseGoalRequest, 0);
                    obtain.writeStrongInterface(iStatusCallback);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void clearUpdateListener(String str, IExerciseUpdateListener iExerciseUpdateListener, IStatusCallback iStatusCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IExerciseApiService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iExerciseUpdateListener);
                    obtain.writeStrongInterface(iStatusCallback);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void endExercise(String str, IStatusCallback iStatusCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IExerciseApiService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iStatusCallback);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void flushExercise(FlushRequest flushRequest, IStatusCallback iStatusCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IExerciseApiService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, flushRequest, 0);
                    obtain.writeStrongInterface(iStatusCallback);
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getApiVersion() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IExerciseApiService.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public ExerciseCapabilitiesResponse getCapabilities(CapabilitiesRequest capabilitiesRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IExerciseApiService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, capabilitiesRequest, 0);
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ExerciseCapabilitiesResponse) _Parcel.readTypedObject(obtain2, ExerciseCapabilitiesResponse.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void getCurrentExerciseInfo(String str, IExerciseInfoCallback iExerciseInfoCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IExerciseApiService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iExerciseInfoCallback);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IExerciseApiService.DESCRIPTOR;
            }

            public void markLap(String str, IStatusCallback iStatusCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IExerciseApiService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iStatusCallback);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void overrideAutoPauseAndResumeForActiveExercise(AutoPauseAndResumeConfigRequest autoPauseAndResumeConfigRequest, IStatusCallback iStatusCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IExerciseApiService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, autoPauseAndResumeConfigRequest, 0);
                    obtain.writeStrongInterface(iStatusCallback);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void pauseExercise(String str, IStatusCallback iStatusCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IExerciseApiService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iStatusCallback);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void prepareExercise(PrepareExerciseRequest prepareExerciseRequest, IStatusCallback iStatusCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IExerciseApiService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, prepareExerciseRequest, 0);
                    obtain.writeStrongInterface(iStatusCallback);
                    this.mRemote.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void removeGoalFromActiveExercise(ExerciseGoalRequest exerciseGoalRequest, IStatusCallback iStatusCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IExerciseApiService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, exerciseGoalRequest, 0);
                    obtain.writeStrongInterface(iStatusCallback);
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void resumeExercise(String str, IStatusCallback iStatusCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IExerciseApiService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iStatusCallback);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setUpdateListener(String str, IExerciseUpdateListener iExerciseUpdateListener, IStatusCallback iStatusCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IExerciseApiService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iExerciseUpdateListener);
                    obtain.writeStrongInterface(iStatusCallback);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void startExercise(StartExerciseRequest startExerciseRequest, IStatusCallback iStatusCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IExerciseApiService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, startExerciseRequest, 0);
                    obtain.writeStrongInterface(iStatusCallback);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IExerciseApiService.DESCRIPTOR);
        }

        public static IExerciseApiService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IExerciseApiService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IExerciseApiService)) ? new Proxy(iBinder) : (IExerciseApiService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(IExerciseApiService.DESCRIPTOR);
            }
            if (i8 != 1598968902) {
                switch (i8) {
                    case 1:
                        int apiVersion = getApiVersion();
                        parcel2.writeNoException();
                        parcel2.writeInt(apiVersion);
                        break;
                    case 2:
                        startExercise((StartExerciseRequest) _Parcel.readTypedObject(parcel, StartExerciseRequest.CREATOR), IStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 3:
                        pauseExercise(parcel.readString(), IStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 4:
                        resumeExercise(parcel.readString(), IStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 5:
                        endExercise(parcel.readString(), IStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 6:
                        markLap(parcel.readString(), IStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 7:
                        getCurrentExerciseInfo(parcel.readString(), IExerciseInfoCallback.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 8:
                        setUpdateListener(parcel.readString(), IExerciseUpdateListener.Stub.asInterface(parcel.readStrongBinder()), IStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 9:
                        clearUpdateListener(parcel.readString(), IExerciseUpdateListener.Stub.asInterface(parcel.readStrongBinder()), IStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 10:
                        addGoalToActiveExercise((ExerciseGoalRequest) _Parcel.readTypedObject(parcel, ExerciseGoalRequest.CREATOR), IStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 11:
                        overrideAutoPauseAndResumeForActiveExercise((AutoPauseAndResumeConfigRequest) _Parcel.readTypedObject(parcel, AutoPauseAndResumeConfigRequest.CREATOR), IStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 12:
                        ExerciseCapabilitiesResponse capabilities = getCapabilities((CapabilitiesRequest) _Parcel.readTypedObject(parcel, CapabilitiesRequest.CREATOR));
                        parcel2.writeNoException();
                        _Parcel.writeTypedObject(parcel2, capabilities, 1);
                        break;
                    case 13:
                        flushExercise((FlushRequest) _Parcel.readTypedObject(parcel, FlushRequest.CREATOR), IStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 14:
                        removeGoalFromActiveExercise((ExerciseGoalRequest) _Parcel.readTypedObject(parcel, ExerciseGoalRequest.CREATOR), IStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    case 15:
                        prepareExercise((PrepareExerciseRequest) _Parcel.readTypedObject(parcel, PrepareExerciseRequest.CREATOR), IStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                        break;
                    default:
                        return super.onTransact(i8, parcel, parcel2, i9);
                }
                parcel2.writeNoException();
                return true;
            }
            parcel2.writeString(IExerciseApiService.DESCRIPTOR);
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

    void addGoalToActiveExercise(ExerciseGoalRequest exerciseGoalRequest, IStatusCallback iStatusCallback);

    void clearUpdateListener(String str, IExerciseUpdateListener iExerciseUpdateListener, IStatusCallback iStatusCallback);

    void endExercise(String str, IStatusCallback iStatusCallback);

    void flushExercise(FlushRequest flushRequest, IStatusCallback iStatusCallback);

    int getApiVersion();

    ExerciseCapabilitiesResponse getCapabilities(CapabilitiesRequest capabilitiesRequest);

    void getCurrentExerciseInfo(String str, IExerciseInfoCallback iExerciseInfoCallback);

    void markLap(String str, IStatusCallback iStatusCallback);

    void overrideAutoPauseAndResumeForActiveExercise(AutoPauseAndResumeConfigRequest autoPauseAndResumeConfigRequest, IStatusCallback iStatusCallback);

    void pauseExercise(String str, IStatusCallback iStatusCallback);

    void prepareExercise(PrepareExerciseRequest prepareExerciseRequest, IStatusCallback iStatusCallback);

    void removeGoalFromActiveExercise(ExerciseGoalRequest exerciseGoalRequest, IStatusCallback iStatusCallback);

    void resumeExercise(String str, IStatusCallback iStatusCallback);

    void setUpdateListener(String str, IExerciseUpdateListener iExerciseUpdateListener, IStatusCallback iStatusCallback);

    void startExercise(StartExerciseRequest startExerciseRequest, IStatusCallback iStatusCallback);
}
