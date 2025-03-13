package androidx.health.services.client.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.impl.IMeasureCallback;
import androidx.health.services.client.impl.internal.IStatusCallback;
import androidx.health.services.client.impl.request.CapabilitiesRequest;
import androidx.health.services.client.impl.request.MeasureRegistrationRequest;
import androidx.health.services.client.impl.request.MeasureUnregistrationRequest;
import androidx.health.services.client.impl.response.MeasureCapabilitiesResponse;

public interface IMeasureApiService extends IInterface {
    public static final int API_VERSION = 1;
    public static final String DESCRIPTOR = "androidx.health.services.client.impl.IMeasureApiService";

    public static class Default implements IMeasureApiService {
        public IBinder asBinder() {
            return null;
        }

        public int getApiVersion() {
            return 0;
        }

        public MeasureCapabilitiesResponse getCapabilities(CapabilitiesRequest capabilitiesRequest) {
            return null;
        }

        public void registerCallback(MeasureRegistrationRequest measureRegistrationRequest, IMeasureCallback iMeasureCallback, IStatusCallback iStatusCallback) {
        }

        public void unregisterCallback(MeasureUnregistrationRequest measureUnregistrationRequest, IMeasureCallback iMeasureCallback, IStatusCallback iStatusCallback) {
        }
    }

    public static abstract class Stub extends Binder implements IMeasureApiService {
        static final int TRANSACTION_getApiVersion = 1;
        static final int TRANSACTION_getCapabilities = 4;
        static final int TRANSACTION_registerCallback = 2;
        static final int TRANSACTION_unregisterCallback = 3;

        public static class Proxy implements IMeasureApiService {
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
                    obtain.writeInterfaceToken(IMeasureApiService.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public MeasureCapabilitiesResponse getCapabilities(CapabilitiesRequest capabilitiesRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMeasureApiService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, capabilitiesRequest, 0);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return (MeasureCapabilitiesResponse) _Parcel.readTypedObject(obtain2, MeasureCapabilitiesResponse.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IMeasureApiService.DESCRIPTOR;
            }

            public void registerCallback(MeasureRegistrationRequest measureRegistrationRequest, IMeasureCallback iMeasureCallback, IStatusCallback iStatusCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMeasureApiService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, measureRegistrationRequest, 0);
                    obtain.writeStrongInterface(iMeasureCallback);
                    obtain.writeStrongInterface(iStatusCallback);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void unregisterCallback(MeasureUnregistrationRequest measureUnregistrationRequest, IMeasureCallback iMeasureCallback, IStatusCallback iStatusCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IMeasureApiService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, measureUnregistrationRequest, 0);
                    obtain.writeStrongInterface(iMeasureCallback);
                    obtain.writeStrongInterface(iStatusCallback);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IMeasureApiService.DESCRIPTOR);
        }

        public static IMeasureApiService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IMeasureApiService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IMeasureApiService)) ? new Proxy(iBinder) : (IMeasureApiService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(IMeasureApiService.DESCRIPTOR);
            }
            if (i8 != 1598968902) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        registerCallback((MeasureRegistrationRequest) _Parcel.readTypedObject(parcel, MeasureRegistrationRequest.CREATOR), IMeasureCallback.Stub.asInterface(parcel.readStrongBinder()), IStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                    } else if (i8 == 3) {
                        unregisterCallback((MeasureUnregistrationRequest) _Parcel.readTypedObject(parcel, MeasureUnregistrationRequest.CREATOR), IMeasureCallback.Stub.asInterface(parcel.readStrongBinder()), IStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                    } else if (i8 != 4) {
                        return super.onTransact(i8, parcel, parcel2, i9);
                    } else {
                        MeasureCapabilitiesResponse capabilities = getCapabilities((CapabilitiesRequest) _Parcel.readTypedObject(parcel, CapabilitiesRequest.CREATOR));
                        parcel2.writeNoException();
                        _Parcel.writeTypedObject(parcel2, capabilities, 1);
                    }
                    parcel2.writeNoException();
                } else {
                    int apiVersion = getApiVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(apiVersion);
                }
                return true;
            }
            parcel2.writeString(IMeasureApiService.DESCRIPTOR);
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

    MeasureCapabilitiesResponse getCapabilities(CapabilitiesRequest capabilitiesRequest);

    void registerCallback(MeasureRegistrationRequest measureRegistrationRequest, IMeasureCallback iMeasureCallback, IStatusCallback iStatusCallback);

    void unregisterCallback(MeasureUnregistrationRequest measureUnregistrationRequest, IMeasureCallback iMeasureCallback, IStatusCallback iStatusCallback);
}
