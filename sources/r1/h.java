package r1;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.wear.watchface.control.a;
import androidx.wear.watchface.control.data.ComplicationRenderParams;
import androidx.wear.watchface.control.data.WatchFaceRenderParams;
import androidx.wear.watchface.style.data.UserStyleFlavorsWireFormat;
import androidx.wear.watchface.style.data.UserStyleSchemaWireFormat;
import java.util.List;
import n1.t0;
import q7.k;

public abstract class h extends Binder implements IInterface {
    public h() {
        attachInterface(this, "androidx.wear.watchface.control.IHeadlessWatchFace");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
        Parcelable parcelable;
        if (i8 >= 1 && i8 <= 16777215) {
            parcel.enforceInterface("androidx.wear.watchface.control.IHeadlessWatchFace");
        }
        if (i8 == 1598968902) {
            parcel2.writeString("androidx.wear.watchface.control.IHeadlessWatchFace");
            return true;
        }
        Object obj = null;
        switch (i8) {
            case 2:
                parcel2.writeNoException();
                parcel2.writeInt(4);
                break;
            case 3:
                a aVar = (a) this;
                try {
                    int i10 = t0.f5732d;
                    Long l8 = (Long) t0.a.c(aVar.f2243a, "HeadlessWatchFaceImpl.getPreviewReferenceTimeMillis", c.f6689f);
                    long longValue = l8 != null ? l8.longValue() : 0;
                    parcel2.writeNoException();
                    parcel2.writeLong(longValue);
                    break;
                } catch (Throwable th) {
                    Log.e("HeadlessWatchFaceImpl", "getPreviewReferenceTimeMillis failed", th);
                    throw th;
                }
            case 4:
                a aVar2 = (a) this;
                try {
                    int i11 = t0.f5732d;
                    parcelable = (UserStyleSchemaWireFormat) t0.a.a(aVar2.f2243a, "HeadlessWatchFaceImpl.getUserStyleSchema", 2, e.f6695f);
                    break;
                } catch (Throwable th2) {
                    Log.e("HeadlessWatchFaceImpl", "getUserStyleSchema failed", th2);
                    throw th2;
                }
            case 5:
                try {
                    t0.c cVar = ((a) this).f2243a;
                    int i12 = t0.f5732d;
                    List list = (List) t0.a.a(cVar, "HeadlessWatchFaceImpl.getComplicationState", 1, new b(cVar));
                    parcel2.writeNoException();
                    if (list != null) {
                        int size = list.size();
                        parcel2.writeInt(size);
                        for (int i13 = 0; i13 < size; i13++) {
                            i.a(parcel2, (Parcelable) list.get(i13));
                        }
                        break;
                    } else {
                        parcel2.writeInt(-1);
                        break;
                    }
                } catch (Throwable th3) {
                    Log.e("HeadlessWatchFaceImpl", "getComplicationState failed", th3);
                    throw th3;
                }
            case 6:
                Parcelable.Creator creator = WatchFaceRenderParams.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator.createFromParcel(parcel);
                }
                WatchFaceRenderParams watchFaceRenderParams = (WatchFaceRenderParams) obj;
                a aVar3 = (a) this;
                k.e(watchFaceRenderParams, "params");
                try {
                    int i14 = t0.f5732d;
                    parcelable = (Bundle) t0.a.c(aVar3.f2243a, "HeadlessWatchFaceImpl.renderWatchFaceToBitmap", new g(watchFaceRenderParams));
                    break;
                } catch (Throwable th4) {
                    Log.e("HeadlessWatchFaceImpl", "renderWatchFaceToBitmap failed", th4);
                    throw th4;
                }
            case 7:
                Parcelable.Creator creator2 = ComplicationRenderParams.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator2.createFromParcel(parcel);
                }
                ComplicationRenderParams complicationRenderParams = (ComplicationRenderParams) obj;
                a aVar4 = (a) this;
                k.e(complicationRenderParams, "params");
                try {
                    int i15 = t0.f5732d;
                    parcelable = (Bundle) t0.a.c(aVar4.f2243a, "HeadlessWatchFaceImpl.renderComplicationToBitmap", new f(complicationRenderParams));
                    break;
                } catch (Throwable th5) {
                    Log.e("HeadlessWatchFaceImpl", "renderComplicationToBitmap failed", th5);
                    throw th5;
                }
            case 8:
                ((a) this).c();
                break;
            case 9:
                a aVar5 = (a) this;
                try {
                    int i16 = t0.f5732d;
                    byte[] bArr = (byte[]) t0.a.a(aVar5.f2243a, "HeadlessWatchFaceImpl.computeUserStyleSchemaDigestHash", 2, a.f6685f);
                    parcel2.writeNoException();
                    parcel2.writeByteArray(bArr);
                    break;
                } catch (Throwable th6) {
                    Log.e("HeadlessWatchFaceImpl", "computeUserStyleSchemaDigestHash failed", th6);
                    throw th6;
                }
            case 10:
                a aVar6 = (a) this;
                try {
                    int i17 = t0.f5732d;
                    parcelable = (UserStyleFlavorsWireFormat) t0.a.a(aVar6.f2243a, "HeadlessWatchFaceImpl.getUserStyleFlavors", 2, d.f6693f);
                    break;
                } catch (Throwable th7) {
                    Log.e("HeadlessWatchFaceImpl", "getUserStyleFlavors failed", th7);
                    throw th7;
                }
            default:
                return super.onTransact(i8, parcel, parcel2, i9);
        }
        parcel2.writeNoException();
        i.a(parcel2, parcelable);
        return true;
    }
}
