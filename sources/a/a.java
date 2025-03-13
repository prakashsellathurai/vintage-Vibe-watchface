package a;

import android.content.ComponentName;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public interface a extends IInterface {

    /* renamed from: a.a$a  reason: collision with other inner class name */
    public static abstract class C0000a extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f0a = 0;

        /* renamed from: a.a$a$a  reason: collision with other inner class name */
        public static class C0001a implements a {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f1a;

            public C0001a(IBinder iBinder) {
                this.f1a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f1a;
            }

            public final void d(c cVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.wearable.watchface.IWatchFaceService");
                    b.a(obtain, cVar);
                    this.f1a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void e(int i8, ComponentName componentName, int i9) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.wearable.watchface.IWatchFaceService");
                    obtain.writeInt(i8);
                    b.a(obtain, componentName);
                    obtain.writeInt(i9);
                    this.f1a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void f(int[] iArr, boolean z8) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.wearable.watchface.IWatchFaceService");
                    obtain.writeIntArray(iArr);
                    obtain.writeInt(z8 ? 1 : 0);
                    this.f1a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int getApiVersion() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.wearable.watchface.IWatchFaceService");
                    this.f1a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void n(int i8, int i9, int i10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.wearable.watchface.IWatchFaceService");
                    obtain.writeInt(i8);
                    obtain.writeInt(i9);
                    obtain.writeInt(i10);
                    this.f1a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void p(int i8, ArrayList arrayList, int i9, int i10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.wearable.watchface.IWatchFaceService");
                    obtain.writeInt(i8);
                    int size = arrayList.size();
                    obtain.writeInt(size);
                    for (int i11 = 0; i11 < size; i11++) {
                        b.a(obtain, (Parcelable) arrayList.get(i11));
                    }
                    obtain.writeInt(i9);
                    obtain.writeInt(i10);
                    this.f1a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void t(b.a[] aVarArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.wearable.watchface.IWatchFaceService");
                    obtain.writeTypedArray(aVarArr, 0);
                    this.f1a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    public static class b {
        public static void a(Parcel parcel, Parcelable parcelable) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, 0);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void d(c cVar);

    void e(int i8, ComponentName componentName, int i9);

    void f(int[] iArr, boolean z8);

    int getApiVersion();

    void n(int i8, int i9, int i10);

    void p(int i8, ArrayList arrayList, int i9, int i10);

    void t(b.a[] aVarArr);
}
