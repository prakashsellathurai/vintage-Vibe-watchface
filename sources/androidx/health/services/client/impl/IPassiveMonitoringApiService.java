package androidx.health.services.client.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.impl.IPassiveListenerCallback;
import androidx.health.services.client.impl.internal.IStatusCallback;
import androidx.health.services.client.impl.request.CapabilitiesRequest;
import androidx.health.services.client.impl.request.FlushRequest;
import androidx.health.services.client.impl.request.PassiveListenerCallbackRegistrationRequest;
import androidx.health.services.client.impl.request.PassiveListenerServiceRegistrationRequest;
import androidx.health.services.client.impl.response.PassiveMonitoringCapabilitiesResponse;

public interface IPassiveMonitoringApiService extends IInterface {
    public static final int API_VERSION = 4;
    public static final String DESCRIPTOR = "androidx.health.services.client.impl.IPassiveMonitoringApiService";

    public static class Default implements IPassiveMonitoringApiService {
        public IBinder asBinder() {
            return null;
        }

        public void flush(FlushRequest flushRequest, IStatusCallback iStatusCallback) {
        }

        public int getApiVersion() {
            return 0;
        }

        public PassiveMonitoringCapabilitiesResponse getCapabilities(CapabilitiesRequest capabilitiesRequest) {
            return null;
        }

        public void registerPassiveListenerCallback(PassiveListenerCallbackRegistrationRequest passiveListenerCallbackRegistrationRequest, IPassiveListenerCallback iPassiveListenerCallback, IStatusCallback iStatusCallback) {
        }

        public void registerPassiveListenerService(PassiveListenerServiceRegistrationRequest passiveListenerServiceRegistrationRequest, IStatusCallback iStatusCallback) {
        }

        public void unregisterPassiveListenerCallback(String str, IStatusCallback iStatusCallback) {
        }

        public void unregisterPassiveListenerService(String str, IStatusCallback iStatusCallback) {
        }
    }

    public static abstract class Stub extends Binder implements IPassiveMonitoringApiService {
        static final int TRANSACTION_flush = 7;
        static final int TRANSACTION_getApiVersion = 1;
        static final int TRANSACTION_getCapabilities = 6;
        static final int TRANSACTION_registerPassiveListenerCallback = 12;
        static final int TRANSACTION_registerPassiveListenerService = 11;
        static final int TRANSACTION_unregisterPassiveListenerCallback = 14;
        static final int TRANSACTION_unregisterPassiveListenerService = 13;

        public static class Proxy implements IPassiveMonitoringApiService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void flush(FlushRequest flushRequest, IStatusCallback iStatusCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IPassiveMonitoringApiService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, flushRequest, 0);
                    obtain.writeStrongInterface(iStatusCallback);
                    this.mRemote.transact(7, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken(IPassiveMonitoringApiService.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public PassiveMonitoringCapabilitiesResponse getCapabilities(CapabilitiesRequest capabilitiesRequest) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IPassiveMonitoringApiService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, capabilitiesRequest, 0);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return (PassiveMonitoringCapabilitiesResponse) _Parcel.readTypedObject(obtain2, PassiveMonitoringCapabilitiesResponse.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IPassiveMonitoringApiService.DESCRIPTOR;
            }

            public void registerPassiveListenerCallback(PassiveListenerCallbackRegistrationRequest passiveListenerCallbackRegistrationRequest, IPassiveListenerCallback iPassiveListenerCallback, IStatusCallback iStatusCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IPassiveMonitoringApiService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, passiveListenerCallbackRegistrationRequest, 0);
                    obtain.writeStrongInterface(iPassiveListenerCallback);
                    obtain.writeStrongInterface(iStatusCallback);
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void registerPassiveListenerService(PassiveListenerServiceRegistrationRequest passiveListenerServiceRegistrationRequest, IStatusCallback iStatusCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IPassiveMonitoringApiService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, passiveListenerServiceRegistrationRequest, 0);
                    obtain.writeStrongInterface(iStatusCallback);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void unregisterPassiveListenerCallback(String str, IStatusCallback iStatusCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IPassiveMonitoringApiService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iStatusCallback);
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void unregisterPassiveListenerService(String str, IStatusCallback iStatusCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IPassiveMonitoringApiService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iStatusCallback);
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IPassiveMonitoringApiService.DESCRIPTOR);
        }

        public static IPassiveMonitoringApiService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IPassiveMonitoringApiService.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPassiveMonitoringApiService)) ? new Proxy(iBinder) : (IPassiveMonitoringApiService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(IPassiveMonitoringApiService.DESCRIPTOR);
            }
            if (i8 != 1598968902) {
                if (i8 == 1) {
                    int apiVersion = getApiVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(apiVersion);
                } else if (i8 != 6) {
                    if (i8 != 7) {
                        switch (i8) {
                            case 11:
                                registerPassiveListenerService((PassiveListenerServiceRegistrationRequest) _Parcel.readTypedObject(parcel, PassiveListenerServiceRegistrationRequest.CREATOR), IStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                                break;
                            case 12:
                                registerPassiveListenerCallback((PassiveListenerCallbackRegistrationRequest) _Parcel.readTypedObject(parcel, PassiveListenerCallbackRegistrationRequest.CREATOR), IPassiveListenerCallback.Stub.asInterface(parcel.readStrongBinder()), IStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                                break;
                            case 13:
                                unregisterPassiveListenerService(parcel.readString(), IStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                                break;
                            case 14:
                                unregisterPassiveListenerCallback(parcel.readString(), IStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                                break;
                            default:
                                return super.onTransact(i8, parcel, parcel2, i9);
                        }
                    } else {
                        flush((FlushRequest) _Parcel.readTypedObject(parcel, FlushRequest.CREATOR), IStatusCallback.Stub.asInterface(parcel.readStrongBinder()));
                    }
                    parcel2.writeNoException();
                } else {
                    PassiveMonitoringCapabilitiesResponse capabilities = getCapabilities((CapabilitiesRequest) _Parcel.readTypedObject(parcel, CapabilitiesRequest.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, capabilities, 1);
                }
                return true;
            }
            parcel2.writeString(IPassiveMonitoringApiService.DESCRIPTOR);
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

    void flush(FlushRequest flushRequest, IStatusCallback iStatusCallback);

    int getApiVersion();

    PassiveMonitoringCapabilitiesResponse getCapabilities(CapabilitiesRequest capabilitiesRequest);

    void registerPassiveListenerCallback(PassiveListenerCallbackRegistrationRequest passiveListenerCallbackRegistrationRequest, IPassiveListenerCallback iPassiveListenerCallback, IStatusCallback iStatusCallback);

    void registerPassiveListenerService(PassiveListenerServiceRegistrationRequest passiveListenerServiceRegistrationRequest, IStatusCallback iStatusCallback);

    void unregisterPassiveListenerCallback(String str, IStatusCallback iStatusCallback);

    void unregisterPassiveListenerService(String str, IStatusCallback iStatusCallback);
}
