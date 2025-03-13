package android.support.wearable.complications;

import android.content.ComponentName;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p1.c;

public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f239a = 0;

        /* renamed from: android.support.wearable.complications.b$a$a  reason: collision with other inner class name */
        public static class C0005a implements b {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f240a;

            public C0005a(IBinder iBinder) {
                this.f240a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f240a;
            }

            public final int getApiVersion() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.wearable.complications.IProviderInfoService");
                    this.f240a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final ComplicationProviderInfo[] l(ComponentName componentName, int[] iArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.wearable.complications.IProviderInfoService");
                    if (componentName != null) {
                        obtain.writeInt(1);
                        componentName.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeIntArray(iArr);
                    this.f240a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ComplicationProviderInfo[]) obtain2.createTypedArray(ComplicationProviderInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean r(ComponentName componentName, int i8, c.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.wearable.complications.IProviderInfoService");
                    boolean z8 = true;
                    if (componentName != null) {
                        obtain.writeInt(1);
                        componentName.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i8);
                    obtain.writeStrongInterface(aVar);
                    this.f240a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z8 = false;
                    }
                    return z8;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    int getApiVersion();

    ComplicationProviderInfo[] l(ComponentName componentName, int[] iArr);

    boolean r(ComponentName componentName, int i8, c.a aVar);
}
