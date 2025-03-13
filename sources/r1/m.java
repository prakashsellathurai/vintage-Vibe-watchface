package r1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public abstract class m extends Binder implements IInterface {
    public m() {
        attachInterface(this, "androidx.wear.watchface.control.IWatchFaceControlService");
    }

    public final IBinder asBinder() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01c6, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        k3.j.n(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01ca, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01d9, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        r7.writeNoException();
        r1.n.b(r7, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017f, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        k3.j.n(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0183, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ba, code lost:
        r7.writeNoException();
        r7.writeStrongInterface(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
        /*
            r4 = this;
            java.lang.String r0 = "androidx.wear.watchface.control.IWatchFaceControlService"
            r1 = 1
            if (r5 < r1) goto L_0x000d
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            if (r5 > r2) goto L_0x000d
            r6.enforceInterface(r0)
        L_0x000d:
            r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r5 != r2) goto L_0x0016
            r7.writeString(r0)
            return r1
        L_0x0016:
            r0 = 0
            switch(r5) {
                case 2: goto L_0x01d2;
                case 3: goto L_0x018d;
                case 4: goto L_0x0145;
                case 5: goto L_0x00f5;
                case 6: goto L_0x00e4;
                case 7: goto L_0x00b3;
                case 8: goto L_0x0082;
                case 9: goto L_0x0051;
                case 10: goto L_0x0049;
                case 11: goto L_0x001f;
                default: goto L_0x001a;
            }
        L_0x001a:
            boolean r4 = super.onTransact(r5, r6, r7, r8)
            return r4
        L_0x001f:
            android.os.Parcelable$Creator<androidx.wear.watchface.control.data.GetUserStyleFlavorsParams> r5 = androidx.wear.watchface.control.data.GetUserStyleFlavorsParams.CREATOR
            java.lang.Object r5 = r1.n.a(r6, r5)
            androidx.wear.watchface.control.data.GetUserStyleFlavorsParams r5 = (androidx.wear.watchface.control.data.GetUserStyleFlavorsParams) r5
            androidx.wear.watchface.control.b r4 = (androidx.wear.watchface.control.b) r4
            java.lang.String r6 = "params"
            q7.k.e(r5, r6)
            android.content.ComponentName r5 = r5.f2267f     // Catch:{ all -> 0x0040 }
            java.lang.String r6 = "params.watchFaceName"
            q7.k.d(r5, r6)     // Catch:{ all -> 0x0040 }
            java.lang.String r6 = "IWatchFaceInstanceServiceStub.getUserStyleFlavors"
            androidx.wear.watchface.control.f r8 = androidx.wear.watchface.control.f.f2290f     // Catch:{ all -> 0x0040 }
            java.lang.Object r4 = r4.h(r5, r6, r8)     // Catch:{ all -> 0x0040 }
            androidx.wear.watchface.style.data.UserStyleFlavorsWireFormat r4 = (androidx.wear.watchface.style.data.UserStyleFlavorsWireFormat) r4     // Catch:{ all -> 0x0040 }
            goto L_0x00a2
        L_0x0040:
            r4 = move-exception
            java.lang.String r5 = "getUserStyleFlavors failed"
            java.lang.String r6 = "IWatchFaceInstanceServiceStub"
            android.util.Log.e(r6, r5, r4)
            throw r4
        L_0x0049:
            r7.writeNoException()
            r7.writeInt(r1)
            goto L_0x01d9
        L_0x0051:
            android.os.Parcelable$Creator<androidx.wear.watchface.control.data.GetComplicationSlotMetadataParams> r5 = androidx.wear.watchface.control.data.GetComplicationSlotMetadataParams.CREATOR
            java.lang.Object r5 = r1.n.a(r6, r5)
            androidx.wear.watchface.control.data.GetComplicationSlotMetadataParams r5 = (androidx.wear.watchface.control.data.GetComplicationSlotMetadataParams) r5
            androidx.wear.watchface.control.b r4 = (androidx.wear.watchface.control.b) r4
            java.lang.String r6 = "params"
            q7.k.e(r5, r6)
            android.content.ComponentName r5 = r5.f2266f     // Catch:{ all -> 0x0079 }
            java.lang.String r6 = "params.watchFaceName"
            q7.k.d(r5, r6)     // Catch:{ all -> 0x0079 }
            java.lang.String r6 = "IWatchFaceInstanceServiceStub.getComplicationSlotMetadata"
            androidx.wear.watchface.control.d r8 = androidx.wear.watchface.control.d.f2259f     // Catch:{ all -> 0x0079 }
            java.lang.Object r4 = r4.h(r5, r6, r8)     // Catch:{ all -> 0x0079 }
            androidx.wear.watchface.data.ComplicationSlotMetadataWireFormat[] r4 = (androidx.wear.watchface.data.ComplicationSlotMetadataWireFormat[]) r4     // Catch:{ all -> 0x0079 }
            r7.writeNoException()
            r7.writeTypedArray(r4, r1)
            goto L_0x01d9
        L_0x0079:
            r4 = move-exception
            java.lang.String r5 = "getComplicationSlotMetadata failed"
            java.lang.String r6 = "IWatchFaceInstanceServiceStub"
            android.util.Log.e(r6, r5, r4)
            throw r4
        L_0x0082:
            android.os.Parcelable$Creator<androidx.wear.watchface.control.data.GetUserStyleSchemaParams> r5 = androidx.wear.watchface.control.data.GetUserStyleSchemaParams.CREATOR
            java.lang.Object r5 = r1.n.a(r6, r5)
            androidx.wear.watchface.control.data.GetUserStyleSchemaParams r5 = (androidx.wear.watchface.control.data.GetUserStyleSchemaParams) r5
            androidx.wear.watchface.control.b r4 = (androidx.wear.watchface.control.b) r4
            java.lang.String r6 = "params"
            q7.k.e(r5, r6)
            android.content.ComponentName r5 = r5.f2268f     // Catch:{ all -> 0x00aa }
            java.lang.String r6 = "params.watchFaceName"
            q7.k.d(r5, r6)     // Catch:{ all -> 0x00aa }
            java.lang.String r6 = "IWatchFaceInstanceServiceStub.getUserStyleSchema"
            androidx.wear.watchface.control.g r8 = androidx.wear.watchface.control.g.f2291f     // Catch:{ all -> 0x00aa }
            java.lang.Object r4 = r4.h(r5, r6, r8)     // Catch:{ all -> 0x00aa }
            androidx.wear.watchface.style.data.UserStyleSchemaWireFormat r4 = (androidx.wear.watchface.style.data.UserStyleSchemaWireFormat) r4     // Catch:{ all -> 0x00aa }
        L_0x00a2:
            r7.writeNoException()
            r1.n.b(r7, r4)
            goto L_0x01d9
        L_0x00aa:
            r4 = move-exception
            java.lang.String r5 = "getUserStyleSchema failed"
            java.lang.String r6 = "IWatchFaceInstanceServiceStub"
            android.util.Log.e(r6, r5, r4)
            throw r4
        L_0x00b3:
            android.os.Parcelable$Creator<androidx.wear.watchface.control.data.DefaultProviderPoliciesParams> r5 = androidx.wear.watchface.control.data.DefaultProviderPoliciesParams.CREATOR
            java.lang.Object r5 = r1.n.a(r6, r5)
            androidx.wear.watchface.control.data.DefaultProviderPoliciesParams r5 = (androidx.wear.watchface.control.data.DefaultProviderPoliciesParams) r5
            androidx.wear.watchface.control.b r4 = (androidx.wear.watchface.control.b) r4
            java.lang.String r6 = "params"
            q7.k.e(r5, r6)
            android.content.ComponentName r5 = r5.f2265f     // Catch:{ all -> 0x00db }
            java.lang.String r6 = "params.watchFaceName"
            q7.k.d(r5, r6)     // Catch:{ all -> 0x00db }
            java.lang.String r6 = "IWatchFaceInstanceServiceStub.getDefaultProviderPolicies"
            androidx.wear.watchface.control.e r8 = androidx.wear.watchface.control.e.f2289f     // Catch:{ all -> 0x00db }
            java.lang.Object r4 = r4.h(r5, r6, r8)     // Catch:{ all -> 0x00db }
            androidx.wear.watchface.control.data.IdTypeAndDefaultProviderPolicyWireFormat[] r4 = (androidx.wear.watchface.control.data.IdTypeAndDefaultProviderPolicyWireFormat[]) r4     // Catch:{ all -> 0x00db }
            r7.writeNoException()
            r7.writeTypedArray(r4, r1)
            goto L_0x01d9
        L_0x00db:
            r4 = move-exception
            java.lang.String r5 = "getDefaultProviderPolicies failed"
            java.lang.String r6 = "IWatchFaceInstanceServiceStub"
            android.util.Log.e(r6, r5, r4)
            throw r4
        L_0x00e4:
            h7.f r4 = t1.l.f7438f     // Catch:{ all -> 0x00ec }
            t1.l r4 = t1.l.c.a()     // Catch:{ all -> 0x00ec }
            goto L_0x01ba
        L_0x00ec:
            r4 = move-exception
            java.lang.String r5 = "getEditorService failed"
            java.lang.String r6 = "IWatchFaceInstanceServiceStub"
            android.util.Log.e(r6, r5, r4)
            throw r4
        L_0x00f5:
            android.os.Parcelable$Creator<androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams> r4 = androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams.CREATOR
            java.lang.Object r4 = r1.n.a(r6, r4)
            androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams r4 = (androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams) r4
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 != 0) goto L_0x0104
            goto L_0x0119
        L_0x0104:
            java.lang.String r6 = "androidx.wear.watchface.control.IPendingInteractiveWatchFace"
            android.os.IInterface r6 = r5.queryLocalInterface(r6)
            if (r6 == 0) goto L_0x0114
            boolean r8 = r6 instanceof r1.k
            if (r8 == 0) goto L_0x0114
            r0 = r6
            r1.k r0 = (r1.k) r0
            goto L_0x0119
        L_0x0114:
            r1.k$a$a r0 = new r1.k$a$a
            r0.<init>(r5)
        L_0x0119:
            java.lang.String r5 = "params"
            q7.k.e(r4, r5)
            java.lang.String r5 = "callback"
            q7.k.e(r0, r5)
            v1.a r5 = new v1.a     // Catch:{ all -> 0x013c }
            java.lang.String r6 = "IWatchFaceInstanceServiceStub.getOrCreateInteractiveWatchFaceWCS"
            r5.<init>(r6)     // Catch:{ all -> 0x013c }
            java.util.HashMap<java.lang.String, androidx.wear.watchface.control.h$c> r6 = androidx.wear.watchface.control.h.f2292a     // Catch:{ all -> 0x013c }
            androidx.wear.watchface.control.h$b r6 = new androidx.wear.watchface.control.h$b     // Catch:{ all -> 0x013c }
            r1.o r8 = new r1.o     // Catch:{ all -> 0x013c }
            r8.<init>(r0, r5)     // Catch:{ all -> 0x013c }
            r6.<init>(r4, r8)     // Catch:{ all -> 0x013c }
            r1.h0 r4 = androidx.wear.watchface.control.h.a.d(r6)     // Catch:{ all -> 0x013c }
            goto L_0x01ba
        L_0x013c:
            r4 = move-exception
            java.lang.String r5 = "getOrCreateInteractiveWatchFace failed"
            java.lang.String r6 = "IWatchFaceInstanceServiceStub"
            android.util.Log.e(r6, r5, r4)
            throw r4
        L_0x0145:
            android.os.Parcelable$Creator<androidx.wear.watchface.control.data.HeadlessWatchFaceInstanceParams> r5 = androidx.wear.watchface.control.data.HeadlessWatchFaceInstanceParams.CREATOR
            java.lang.Object r5 = r1.n.a(r6, r5)
            androidx.wear.watchface.control.data.HeadlessWatchFaceInstanceParams r5 = (androidx.wear.watchface.control.data.HeadlessWatchFaceInstanceParams) r5
            androidx.wear.watchface.control.b r4 = (androidx.wear.watchface.control.b) r4
            java.lang.String r6 = "params"
            q7.k.e(r5, r6)
            v1.c r6 = new v1.c     // Catch:{ all -> 0x0184 }
            java.lang.String r8 = "IWatchFaceInstanceServiceStub.createHeadlessWatchFaceInstance"
            r6.<init>(r8)     // Catch:{ all -> 0x0184 }
            android.content.ComponentName r8 = r5.f2269f     // Catch:{ all -> 0x017d }
            java.lang.String r2 = "params.watchFaceName"
            q7.k.d(r8, r2)     // Catch:{ all -> 0x017d }
            androidx.wear.watchface.control.b$a r8 = r4.c(r8)     // Catch:{ all -> 0x017d }
            if (r8 == 0) goto L_0x0178
            y7.z r4 = r4.f2254b     // Catch:{ all -> 0x017d }
            java.lang.String r2 = "createHeadlessInstance"
            androidx.wear.watchface.control.c r3 = new androidx.wear.watchface.control.c     // Catch:{ all -> 0x017d }
            r3.<init>(r8, r5, r0)     // Catch:{ all -> 0x017d }
            java.lang.Object r4 = n1.i1.a(r4, r2, r3)     // Catch:{ all -> 0x017d }
            androidx.wear.watchface.control.a r4 = (androidx.wear.watchface.control.a) r4     // Catch:{ all -> 0x017d }
            goto L_0x0179
        L_0x0178:
            r4 = r0
        L_0x0179:
            k3.j.n(r6, r0)     // Catch:{ all -> 0x0184 }
            goto L_0x01ba
        L_0x017d:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x017f }
        L_0x017f:
            r5 = move-exception
            k3.j.n(r6, r4)     // Catch:{ all -> 0x0184 }
            throw r5     // Catch:{ all -> 0x0184 }
        L_0x0184:
            r4 = move-exception
            java.lang.String r5 = "createHeadlessWatchFaceInstance failed"
            java.lang.String r6 = "IWatchFaceInstanceServiceStub"
            android.util.Log.e(r6, r5, r4)
            throw r4
        L_0x018d:
            java.lang.String r4 = r6.readString()
            java.lang.String r5 = "instanceId"
            q7.k.e(r4, r5)
            java.lang.String r5 = "IWatchFaceInstanceServiceStub"
            v1.c r6 = new v1.c     // Catch:{ all -> 0x01cb }
            java.lang.String r8 = "IWatchFaceInstanceServiceStub.getInteractiveWatchFaceInstance"
            r6.<init>(r8)     // Catch:{ all -> 0x01cb }
            java.lang.Object r8 = androidx.wear.watchface.control.h.f2293b     // Catch:{ all -> 0x01c4 }
            monitor-enter(r8)     // Catch:{ all -> 0x01c4 }
            java.util.HashMap<java.lang.String, androidx.wear.watchface.control.h$c> r2 = androidx.wear.watchface.control.h.f2292a     // Catch:{ all -> 0x01c1 }
            java.lang.Object r4 = r2.get(r4)     // Catch:{ all -> 0x01c1 }
            androidx.wear.watchface.control.h$c r4 = (androidx.wear.watchface.control.h.c) r4     // Catch:{ all -> 0x01c1 }
            if (r4 != 0) goto L_0x01af
            monitor-exit(r8)     // Catch:{ all -> 0x01c4 }
            r4 = r0
            goto L_0x01b7
        L_0x01af:
            int r2 = r4.f2299b     // Catch:{ all -> 0x01c1 }
            int r2 = r2 + r1
            r4.f2299b = r2     // Catch:{ all -> 0x01c1 }
            r1.h0 r4 = r4.f2298a     // Catch:{ all -> 0x01c1 }
            monitor-exit(r8)     // Catch:{ all -> 0x01c4 }
        L_0x01b7:
            k3.j.n(r6, r0)     // Catch:{ all -> 0x01cb }
        L_0x01ba:
            r7.writeNoException()
            r7.writeStrongInterface(r4)
            goto L_0x01d9
        L_0x01c1:
            r4 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01c4 }
            throw r4     // Catch:{ all -> 0x01c4 }
        L_0x01c4:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x01c6 }
        L_0x01c6:
            r7 = move-exception
            k3.j.n(r6, r4)     // Catch:{ all -> 0x01cb }
            throw r7     // Catch:{ all -> 0x01cb }
        L_0x01cb:
            r4 = move-exception
            java.lang.String r6 = "getInteractiveWatchFaceInstance failed"
            android.util.Log.e(r5, r6, r4)
            throw r4
        L_0x01d2:
            r7.writeNoException()
            r4 = 5
            r7.writeInt(r4)
        L_0x01d9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.m.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
