package r1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface k extends IInterface {

    public static abstract class a extends Binder implements k {

        /* renamed from: r1.k$a$a  reason: collision with other inner class name */
        public static class C0116a implements k {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f6719a;

            public C0116a(IBinder iBinder) {
                this.f6719a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f6719a;
            }

            public final int getApiVersion() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.wear.watchface.control.IPendingInteractiveWatchFace");
                    this.f6719a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void m(j jVar) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.wear.watchface.control.IPendingInteractiveWatchFace");
                    obtain.writeStrongInterface(jVar);
                    this.f6719a.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void q(s1.a aVar) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.wear.watchface.control.IPendingInteractiveWatchFace");
                    if (aVar != null) {
                        obtain.writeInt(1);
                        aVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f6719a.transact(4, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.wear.watchface.control.IPendingInteractiveWatchFace");
        }

        public final IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: r1.j$a$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: r1.j$a$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: r1.j$a$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: r1.j$a$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: r1.j} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: r1.j$a$a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            /*
                r3 = this;
                java.lang.String r0 = "androidx.wear.watchface.control.IPendingInteractiveWatchFace"
                r1 = 1
                if (r4 < r1) goto L_0x000d
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                if (r4 > r2) goto L_0x000d
                r5.enforceInterface(r0)
            L_0x000d:
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 != r2) goto L_0x0016
                r6.writeString(r0)
                return r1
            L_0x0016:
                r0 = 2
                if (r4 == r0) goto L_0x005b
                r0 = 3
                r2 = 0
                if (r4 == r0) goto L_0x0039
                r0 = 4
                if (r4 == r0) goto L_0x0025
                boolean r3 = super.onTransact(r4, r5, r6, r7)
                return r3
            L_0x0025:
                android.os.Parcelable$Creator<s1.a> r4 = s1.a.CREATOR
                int r6 = r5.readInt()
                if (r6 == 0) goto L_0x0031
                java.lang.Object r2 = r4.createFromParcel(r5)
            L_0x0031:
                s1.a r2 = (s1.a) r2
                r1.o r3 = (r1.o) r3
                r3.q(r2)
                goto L_0x0067
            L_0x0039:
                android.os.IBinder r4 = r5.readStrongBinder()
                if (r4 != 0) goto L_0x0040
                goto L_0x0055
            L_0x0040:
                java.lang.String r5 = "androidx.wear.watchface.control.IInteractiveWatchFace"
                android.os.IInterface r5 = r4.queryLocalInterface(r5)
                if (r5 == 0) goto L_0x0050
                boolean r6 = r5 instanceof r1.j
                if (r6 == 0) goto L_0x0050
                r2 = r5
                r1.j r2 = (r1.j) r2
                goto L_0x0055
            L_0x0050:
                r1.j$a$a r2 = new r1.j$a$a
                r2.<init>(r4)
            L_0x0055:
                r1.o r3 = (r1.o) r3
                r3.m(r2)
                goto L_0x0067
            L_0x005b:
                r1.o r3 = (r1.o) r3
                int r3 = r3.getApiVersion()
                r6.writeNoException()
                r6.writeInt(r3)
            L_0x0067:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: r1.k.a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    int getApiVersion();

    void m(j jVar);

    void q(s1.a aVar);
}
