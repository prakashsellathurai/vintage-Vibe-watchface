package r1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public interface j extends IInterface {

    public static abstract class a extends Binder implements j {

        /* renamed from: r1.j$a$a  reason: collision with other inner class name */
        public static class C0115a implements j {

            /* renamed from: a  reason: collision with root package name */
            public final IBinder f6713a;

            public C0115a(IBinder iBinder) {
                this.f6713a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f6713a;
            }
        }

        public a() {
            attachInterface(this, "androidx.wear.watchface.control.IInteractiveWatchFace");
        }

        public final IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: r1.p} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: r1.q} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: r1.q} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: r1.p} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: r1.p} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: r1.q} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: r1.q} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: r1.p} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: r1.q} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: r1.p} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: r1.q} */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x01f8, code lost:
            r7 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
            k3.j.n(r6, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x01fc, code lost:
            throw r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x027e, code lost:
            r8.writeNoException();
            r1.j.b.a(r8, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x02a6, code lost:
            r8.writeNoException();
            r8.writeLong(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x0343, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0111, code lost:
            r8.writeNoException();
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) {
            /*
                r5 = this;
                java.lang.String r0 = "androidx.wear.watchface.control.IInteractiveWatchFace"
                r1 = 1
                if (r6 < r1) goto L_0x000d
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                if (r6 > r2) goto L_0x000d
                r7.enforceInterface(r0)
            L_0x000d:
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r6 != r2) goto L_0x0016
                r8.writeString(r0)
                return r1
            L_0x0016:
                java.lang.String r0 = "androidx.wear.watchface.control.IWatchfaceListener"
                r2 = 0
                java.lang.String r3 = "listener"
                java.lang.String r4 = "InteractiveWatchFaceImpl"
                switch(r6) {
                    case 2: goto L_0x033b;
                    case 3: goto L_0x0329;
                    case 4: goto L_0x0020;
                    case 5: goto L_0x02e9;
                    case 6: goto L_0x02b5;
                    case 7: goto L_0x0020;
                    case 8: goto L_0x028d;
                    case 9: goto L_0x026d;
                    case 10: goto L_0x0232;
                    case 11: goto L_0x0204;
                    case 12: goto L_0x01de;
                    case 13: goto L_0x01d9;
                    case 14: goto L_0x01b0;
                    case 15: goto L_0x0199;
                    case 16: goto L_0x016d;
                    case 17: goto L_0x014b;
                    case 18: goto L_0x0116;
                    case 19: goto L_0x0111;
                    case 20: goto L_0x00ee;
                    case 21: goto L_0x0111;
                    case 22: goto L_0x00ba;
                    case 23: goto L_0x0086;
                    case 24: goto L_0x0058;
                    case 25: goto L_0x0025;
                    default: goto L_0x0020;
                }
            L_0x0020:
                boolean r5 = super.onTransact(r6, r7, r8, r9)
                return r5
            L_0x0025:
                android.os.IBinder r6 = r7.readStrongBinder()
                int r9 = r7.readInt()
                int r7 = r7.readInt()
                r1.h0 r5 = (r1.h0) r5
                java.lang.String r0 = "hostToken"
                q7.k.e(r6, r0)
                int r0 = n1.t0.f5732d     // Catch:{ all -> 0x0051 }
                n1.t0$c r5 = r5.f6708a     // Catch:{ all -> 0x0051 }
                java.lang.String r0 = "InteractiveWatchFaceImpl.createRemoteWatchFaceView"
                r1.v r2 = new r1.v     // Catch:{ all -> 0x0051 }
                r2.<init>(r6, r9, r7)     // Catch:{ all -> 0x0051 }
                java.lang.Object r5 = n1.t0.a.c(r5, r0, r2)     // Catch:{ all -> 0x0051 }
                r1.l r5 = (r1.l) r5     // Catch:{ all -> 0x0051 }
                r8.writeNoException()
                r8.writeStrongInterface(r5)
                goto L_0x0343
            L_0x0051:
                r5 = move-exception
                java.lang.String r6 = "createRemoteWatchFaceView failed"
                android.util.Log.e(r4, r6, r5)
                throw r5
            L_0x0058:
                int r6 = r7.readInt()
                int r7 = r7.readInt()
                r1.h0 r5 = (r1.h0) r5
                int r9 = n1.t0.f5732d     // Catch:{ all -> 0x007f }
                n1.t0$c r5 = r5.f6708a     // Catch:{ all -> 0x007f }
                java.lang.String r9 = "InteractiveWatchFaceImpl.getComplicationIdAt"
                r1.x r0 = new r1.x     // Catch:{ all -> 0x007f }
                r0.<init>(r6, r7)     // Catch:{ all -> 0x007f }
                java.lang.Object r5 = n1.t0.a.c(r5, r9, r0)     // Catch:{ all -> 0x007f }
                java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x007f }
                if (r5 == 0) goto L_0x007b
                long r5 = r5.longValue()     // Catch:{ all -> 0x007f }
                goto L_0x02a6
            L_0x007b:
                r5 = -9223372036854775808
                goto L_0x02a6
            L_0x007f:
                r5 = move-exception
                java.lang.String r6 = "getComplicationIdAt failed"
                android.util.Log.e(r4, r6, r5)
                throw r5
            L_0x0086:
                android.os.IBinder r6 = r7.readStrongBinder()
                if (r6 != 0) goto L_0x008d
                goto L_0x00a0
            L_0x008d:
                android.os.IInterface r7 = r6.queryLocalInterface(r0)
                if (r7 == 0) goto L_0x009b
                boolean r9 = r7 instanceof r1.q
                if (r9 == 0) goto L_0x009b
                r2 = r7
                r1.q r2 = (r1.q) r2
                goto L_0x00a0
            L_0x009b:
                r1.p r2 = new r1.p
                r2.<init>(r6)
            L_0x00a0:
                r1.h0 r5 = (r1.h0) r5
                q7.k.e(r2, r3)
                n1.t0$c r5 = r5.f6708a     // Catch:{ all -> 0x00b3 }
                if (r5 == 0) goto L_0x00ad
                r5.C(r2)     // Catch:{ all -> 0x00b3 }
                goto L_0x0111
            L_0x00ad:
                java.lang.String r5 = "removeWatchFaceListener ignored due to null engine"
                android.util.Log.w(r4, r5)     // Catch:{ all -> 0x00b3 }
                goto L_0x0111
            L_0x00b3:
                r5 = move-exception
                java.lang.String r6 = "removeWatchFaceListener failed"
                android.util.Log.e(r4, r6, r5)
                throw r5
            L_0x00ba:
                android.os.IBinder r6 = r7.readStrongBinder()
                if (r6 != 0) goto L_0x00c1
                goto L_0x00d4
            L_0x00c1:
                android.os.IInterface r7 = r6.queryLocalInterface(r0)
                if (r7 == 0) goto L_0x00cf
                boolean r9 = r7 instanceof r1.q
                if (r9 == 0) goto L_0x00cf
                r2 = r7
                r1.q r2 = (r1.q) r2
                goto L_0x00d4
            L_0x00cf:
                r1.p r2 = new r1.p
                r2.<init>(r6)
            L_0x00d4:
                r1.h0 r5 = (r1.h0) r5
                q7.k.e(r2, r3)
                n1.t0$c r5 = r5.f6708a     // Catch:{ all -> 0x00e7 }
                if (r5 == 0) goto L_0x00e1
                r5.n(r2)     // Catch:{ all -> 0x00e7 }
                goto L_0x0111
            L_0x00e1:
                java.lang.String r5 = "addWatchFaceListener ignored due to null engine"
                android.util.Log.w(r4, r5)     // Catch:{ all -> 0x00e7 }
                goto L_0x0111
            L_0x00e7:
                r5 = move-exception
                java.lang.String r6 = "addWatchFaceListener failed"
                android.util.Log.e(r4, r6, r5)
                throw r5
            L_0x00ee:
                r1.h0 r5 = (r1.h0) r5
                int r6 = n1.t0.f5732d     // Catch:{ all -> 0x010a }
                n1.t0$c r5 = r5.f6708a     // Catch:{ all -> 0x010a }
                java.lang.String r6 = "InteractiveWatchFaceImpl.getWatchFaceOverlayStyle"
                r1.b0 r7 = r1.b0.f6688f     // Catch:{ all -> 0x010a }
                java.lang.String r9 = "task"
                q7.k.e(r7, r9)     // Catch:{ all -> 0x010a }
                n1.u0 r9 = new n1.u0     // Catch:{ all -> 0x010a }
                r9.<init>(r2)     // Catch:{ all -> 0x010a }
                java.lang.Object r5 = n1.t0.a.b(r5, r6, r1, r7, r9)     // Catch:{ all -> 0x010a }
                androidx.wear.watchface.data.WatchFaceOverlayStyleWireFormat r5 = (androidx.wear.watchface.data.WatchFaceOverlayStyleWireFormat) r5     // Catch:{ all -> 0x010a }
                goto L_0x027e
            L_0x010a:
                r5 = move-exception
                java.lang.String r6 = "getWatchFaceOverlayStyle failed"
                android.util.Log.e(r4, r6, r5)
                throw r5
            L_0x0111:
                r8.writeNoException()
                goto L_0x0343
            L_0x0116:
                android.os.IBinder r6 = r7.readStrongBinder()
                if (r6 != 0) goto L_0x011e
                r7 = r2
                goto L_0x0132
            L_0x011e:
                java.lang.String r7 = "androidx.wear.watchface.control.IWatchfaceReadyListener"
                android.os.IInterface r7 = r6.queryLocalInterface(r7)
                if (r7 == 0) goto L_0x012d
                boolean r8 = r7 instanceof r1.s
                if (r8 == 0) goto L_0x012d
                r1.s r7 = (r1.s) r7
                goto L_0x0132
            L_0x012d:
                r1.r r7 = new r1.r
                r7.<init>(r6)
            L_0x0132:
                r1.h0 r5 = (r1.h0) r5
                q7.k.e(r7, r3)
                y7.z r6 = r5.f6710c     // Catch:{ all -> 0x0144 }
                r1.t r8 = new r1.t     // Catch:{ all -> 0x0144 }
                r8.<init>(r5, r7, r2)     // Catch:{ all -> 0x0144 }
                r5 = 3
                k3.j.K(r6, r2, r8, r5)     // Catch:{ all -> 0x0144 }
                goto L_0x0343
            L_0x0144:
                r5 = move-exception
                java.lang.String r6 = "addWatchfaceReadyListener failed"
                android.util.Log.e(r4, r6, r5)
                throw r5
            L_0x014b:
                r1.h0 r5 = (r1.h0) r5
                int r6 = n1.t0.f5732d     // Catch:{ all -> 0x0166 }
                n1.t0$c r6 = r5.f6708a     // Catch:{ all -> 0x0166 }
                java.lang.String r7 = "InteractiveWatchFaceImpl.getContentDescriptionLabels"
                r1.y r9 = new r1.y     // Catch:{ all -> 0x0166 }
                r9.<init>(r5)     // Catch:{ all -> 0x0166 }
                java.lang.Object r5 = n1.t0.a.c(r6, r7, r9)     // Catch:{ all -> 0x0166 }
                b.a[] r5 = (b.a[]) r5     // Catch:{ all -> 0x0166 }
                r8.writeNoException()
                r8.writeTypedArray(r5, r1)
                goto L_0x0343
            L_0x0166:
                r5 = move-exception
                java.lang.String r6 = "getContentDescriptionLabels failed"
                android.util.Log.e(r4, r6, r5)
                throw r5
            L_0x016d:
                android.os.Parcelable$Creator<androidx.wear.watchface.data.WatchUiState> r6 = androidx.wear.watchface.data.WatchUiState.CREATOR
                int r8 = r7.readInt()
                if (r8 == 0) goto L_0x0179
                java.lang.Object r2 = r6.createFromParcel(r7)
            L_0x0179:
                androidx.wear.watchface.data.WatchUiState r2 = (androidx.wear.watchface.data.WatchUiState) r2
                r1.h0 r5 = (r1.h0) r5
                java.lang.String r6 = "watchUiState"
                q7.k.e(r2, r6)
                int r6 = n1.t0.f5732d     // Catch:{ all -> 0x0192 }
                n1.t0$c r6 = r5.f6708a     // Catch:{ all -> 0x0192 }
                java.lang.String r7 = "InteractiveWatchFaceImpl.setWatchUiState"
                r1.f0 r8 = new r1.f0     // Catch:{ all -> 0x0192 }
                r8.<init>(r5, r2)     // Catch:{ all -> 0x0192 }
                n1.t0.a.c(r6, r7, r8)     // Catch:{ all -> 0x0192 }
                goto L_0x0343
            L_0x0192:
                r5 = move-exception
                java.lang.String r6 = "setWatchUiState failed"
                android.util.Log.e(r4, r6, r5)
                throw r5
            L_0x0199:
                r1.h0 r5 = (r1.h0) r5
                y7.z r6 = r5.f6710c     // Catch:{ all -> 0x01a9 }
                java.lang.String r7 = "InteractiveWatchFaceImpl.ambientTickUpdate"
                r1.u r8 = new r1.u     // Catch:{ all -> 0x01a9 }
                r8.<init>(r5, r2)     // Catch:{ all -> 0x01a9 }
                n1.i1.a(r6, r7, r8)     // Catch:{ all -> 0x01a9 }
                goto L_0x0343
            L_0x01a9:
                r5 = move-exception
                java.lang.String r6 = "ambientTickUpdate failed"
                android.util.Log.e(r4, r6, r5)
                throw r5
            L_0x01b0:
                int r6 = r7.readInt()
                int r8 = r7.readInt()
                int r7 = r7.readInt()
                r1.h0 r5 = (r1.h0) r5
                n1.t0$c r9 = r5.f6708a     // Catch:{ all -> 0x01d2 }
                if (r9 != 0) goto L_0x01c4
                goto L_0x0343
            L_0x01c4:
                int r0 = n1.t0.f5732d     // Catch:{ all -> 0x01d2 }
                java.lang.String r0 = "InteractiveWatchFaceImpl.sendTouchEvent"
                r1.e0 r2 = new r1.e0     // Catch:{ all -> 0x01d2 }
                r2.<init>(r7, r6, r8, r5)     // Catch:{ all -> 0x01d2 }
                n1.t0.a.c(r9, r0, r2)     // Catch:{ all -> 0x01d2 }
                goto L_0x0343
            L_0x01d2:
                r5 = move-exception
                java.lang.String r6 = "sendTouchEvent failed"
                android.util.Log.e(r4, r6, r5)
                throw r5
            L_0x01d9:
                r7.readInt()
                goto L_0x0343
            L_0x01de:
                r1.h0 r5 = (r1.h0) r5
                v1.c r6 = new v1.c     // Catch:{ all -> 0x01fd }
                java.lang.String r7 = "InteractiveWatchFaceImpl.release"
                r6.<init>(r7)     // Catch:{ all -> 0x01fd }
                androidx.wear.watchface.control.i r7 = new androidx.wear.watchface.control.i     // Catch:{ all -> 0x01f6 }
                r7.<init>(r5, r2)     // Catch:{ all -> 0x01f6 }
                k3.j.Z(r7)     // Catch:{ all -> 0x01f6 }
                h7.h r5 = h7.h.f4787a     // Catch:{ all -> 0x01f6 }
                k3.j.n(r6, r2)     // Catch:{ all -> 0x01fd }
                goto L_0x0343
            L_0x01f6:
                r5 = move-exception
                throw r5     // Catch:{ all -> 0x01f8 }
            L_0x01f8:
                r7 = move-exception
                k3.j.n(r6, r5)     // Catch:{ all -> 0x01fd }
                throw r7     // Catch:{ all -> 0x01fd }
            L_0x01fd:
                r5 = move-exception
                java.lang.String r6 = "release failed"
                android.util.Log.e(r4, r6, r5)
                throw r5
            L_0x0204:
                android.os.Parcelable$Creator<androidx.wear.watchface.control.data.WatchFaceRenderParams> r6 = androidx.wear.watchface.control.data.WatchFaceRenderParams.CREATOR
                int r9 = r7.readInt()
                if (r9 == 0) goto L_0x0210
                java.lang.Object r2 = r6.createFromParcel(r7)
            L_0x0210:
                androidx.wear.watchface.control.data.WatchFaceRenderParams r2 = (androidx.wear.watchface.control.data.WatchFaceRenderParams) r2
                r1.h0 r5 = (r1.h0) r5
                java.lang.String r6 = "params"
                q7.k.e(r2, r6)
                int r6 = n1.t0.f5732d     // Catch:{ all -> 0x022b }
                n1.t0$c r5 = r5.f6708a     // Catch:{ all -> 0x022b }
                java.lang.String r6 = "InteractiveWatchFaceImpl.renderWatchFaceToBitmap"
                r1.d0 r7 = new r1.d0     // Catch:{ all -> 0x022b }
                r7.<init>(r2)     // Catch:{ all -> 0x022b }
                java.lang.Object r5 = n1.t0.a.c(r5, r6, r7)     // Catch:{ all -> 0x022b }
                android.os.Bundle r5 = (android.os.Bundle) r5     // Catch:{ all -> 0x022b }
                goto L_0x027e
            L_0x022b:
                r5 = move-exception
                java.lang.String r6 = "renderWatchFaceToBitmap failed"
                android.util.Log.e(r4, r6, r5)
                throw r5
            L_0x0232:
                r1.h0 r5 = (r1.h0) r5
                n1.t0$c r5 = r5.f6708a     // Catch:{ all -> 0x0266 }
                int r6 = n1.t0.f5732d     // Catch:{ all -> 0x0266 }
                java.lang.String r6 = "InteractiveWatchFaceImpl.getComplicationDetails"
                r1.w r7 = new r1.w     // Catch:{ all -> 0x0266 }
                r7.<init>(r5)     // Catch:{ all -> 0x0266 }
                java.lang.Object r5 = n1.t0.a.a(r5, r6, r1, r7)     // Catch:{ all -> 0x0266 }
                java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0266 }
                r8.writeNoException()
                if (r5 != 0) goto L_0x0250
                r5 = -1
                r8.writeInt(r5)
                goto L_0x0343
            L_0x0250:
                int r6 = r5.size()
                r8.writeInt(r6)
                r7 = 0
            L_0x0258:
                if (r7 >= r6) goto L_0x0343
                java.lang.Object r9 = r5.get(r7)
                android.os.Parcelable r9 = (android.os.Parcelable) r9
                r1.j.b.a(r8, r9)
                int r7 = r7 + 1
                goto L_0x0258
            L_0x0266:
                r5 = move-exception
                java.lang.String r6 = "getComplicationDetails failed"
                android.util.Log.e(r4, r6, r5)
                throw r5
            L_0x026d:
                r1.h0 r5 = (r1.h0) r5
                int r6 = n1.t0.f5732d     // Catch:{ all -> 0x0286 }
                n1.t0$c r5 = r5.f6708a     // Catch:{ all -> 0x0286 }
                java.lang.String r6 = "InteractiveWatchFaceImpl.getUserStyleSchema"
                r1.a0 r7 = r1.a0.f6686f     // Catch:{ all -> 0x0286 }
                r9 = 2
                java.lang.Object r5 = n1.t0.a.a(r5, r6, r9, r7)     // Catch:{ all -> 0x0286 }
                androidx.wear.watchface.style.data.UserStyleSchemaWireFormat r5 = (androidx.wear.watchface.style.data.UserStyleSchemaWireFormat) r5     // Catch:{ all -> 0x0286 }
            L_0x027e:
                r8.writeNoException()
                r1.j.b.a(r8, r5)
                goto L_0x0343
            L_0x0286:
                r5 = move-exception
                java.lang.String r6 = "getUserStyleSchema failed"
                android.util.Log.e(r4, r6, r5)
                throw r5
            L_0x028d:
                r1.h0 r5 = (r1.h0) r5
                int r6 = n1.t0.f5732d     // Catch:{ all -> 0x02ae }
                n1.t0$c r5 = r5.f6708a     // Catch:{ all -> 0x02ae }
                java.lang.String r6 = "InteractiveWatchFaceImpl.getPreviewReferenceTimeMillis"
                r1.z r7 = r1.z.f6739f     // Catch:{ all -> 0x02ae }
                java.lang.Object r5 = n1.t0.a.c(r5, r6, r7)     // Catch:{ all -> 0x02ae }
                java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x02ae }
                if (r5 == 0) goto L_0x02a4
                long r5 = r5.longValue()     // Catch:{ all -> 0x02ae }
                goto L_0x02a6
            L_0x02a4:
                r5 = 0
            L_0x02a6:
                r8.writeNoException()
                r8.writeLong(r5)
                goto L_0x0343
            L_0x02ae:
                r5 = move-exception
                java.lang.String r6 = "getPreviewReferenceTimeMillis failed"
                android.util.Log.e(r4, r6, r5)
                throw r5
            L_0x02b5:
                java.lang.String r6 = r7.readString()
                android.os.Parcelable$Creator<androidx.wear.watchface.style.data.UserStyleWireFormat> r8 = androidx.wear.watchface.style.data.UserStyleWireFormat.CREATOR
                int r9 = r7.readInt()
                if (r9 == 0) goto L_0x02c6
                java.lang.Object r7 = r8.createFromParcel(r7)
                goto L_0x02c7
            L_0x02c6:
                r7 = r2
            L_0x02c7:
                androidx.wear.watchface.style.data.UserStyleWireFormat r7 = (androidx.wear.watchface.style.data.UserStyleWireFormat) r7
                r1.h0 r5 = (r1.h0) r5
                java.lang.String r8 = "newInstanceId"
                q7.k.e(r6, r8)
                java.lang.String r8 = "userStyle"
                q7.k.e(r7, r8)
                y7.z r8 = r5.f6710c     // Catch:{ all -> 0x02e2 }
                java.lang.String r9 = "InteractiveWatchFaceImpl.updateWatchfaceInstance"
                r1.g0 r0 = new r1.g0     // Catch:{ all -> 0x02e2 }
                r0.<init>(r5, r6, r7, r2)     // Catch:{ all -> 0x02e2 }
                n1.i1.a(r8, r9, r0)     // Catch:{ all -> 0x02e2 }
                goto L_0x0343
            L_0x02e2:
                r5 = move-exception
                java.lang.String r6 = "updateWatchfaceInstance failed"
                android.util.Log.e(r4, r6, r5)
                throw r5
            L_0x02e9:
                android.os.Parcelable$Creator<androidx.wear.watchface.data.IdAndComplicationDataWireFormat> r6 = androidx.wear.watchface.data.IdAndComplicationDataWireFormat.CREATOR
                java.util.ArrayList r6 = r7.createTypedArrayList(r6)
                r1.h0 r5 = (r1.h0) r5
                java.lang.String r7 = "complicationDatumWireFormats"
                q7.k.e(r6, r7)
                v1.c r7 = new v1.c     // Catch:{ all -> 0x0322 }
                java.lang.String r8 = "InteractiveWatchFaceImpl.updateComplicationData"
                r7.<init>(r8)     // Catch:{ all -> 0x0322 }
                java.lang.String r8 = "user"
                java.lang.String r9 = android.os.Build.TYPE     // Catch:{ all -> 0x030d }
                boolean r8 = q7.k.a(r8, r9)     // Catch:{ all -> 0x030d }
                if (r8 != 0) goto L_0x030f
                r8 = 63
                i7.i.W(r6, r2, r2, r8)     // Catch:{ all -> 0x030d }
                goto L_0x030f
            L_0x030d:
                r5 = move-exception
                goto L_0x031c
            L_0x030f:
                n1.t0$c r5 = r5.f6708a     // Catch:{ all -> 0x030d }
                if (r5 == 0) goto L_0x0316
                r5.D(r6)     // Catch:{ all -> 0x030d }
            L_0x0316:
                h7.h r5 = h7.h.f4787a     // Catch:{ all -> 0x030d }
                k3.j.n(r7, r2)     // Catch:{ all -> 0x0322 }
                goto L_0x0343
            L_0x031c:
                throw r5     // Catch:{ all -> 0x031d }
            L_0x031d:
                r6 = move-exception
                k3.j.n(r7, r5)     // Catch:{ all -> 0x0322 }
                throw r6     // Catch:{ all -> 0x0322 }
            L_0x0322:
                r5 = move-exception
                java.lang.String r6 = "updateComplicationData failed"
                android.util.Log.e(r4, r6, r5)
                throw r5
            L_0x0329:
                r1.h0 r5 = (r1.h0) r5
                java.lang.String r5 = r5.f6709b     // Catch:{ all -> 0x0334 }
                r8.writeNoException()
                r8.writeString(r5)
                goto L_0x0343
            L_0x0334:
                r5 = move-exception
                java.lang.String r6 = "getInstanceId failed"
                android.util.Log.e(r4, r6, r5)
                throw r5
            L_0x033b:
                r8.writeNoException()
                r5 = 9
                r8.writeInt(r5)
            L_0x0343:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: r1.j.a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    public static class b {
        public static void a(Parcel parcel, Parcelable parcelable) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, 1);
                return;
            }
            parcel.writeInt(0);
        }
    }
}
