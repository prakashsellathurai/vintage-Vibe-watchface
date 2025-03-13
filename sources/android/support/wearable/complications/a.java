package android.support.wearable.complications;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import p1.c;
import q1.b;
import q1.e;
import q7.k;
import y7.g;

public abstract class a extends Binder implements IInterface {
    public a() {
        attachInterface(this, "android.support.wearable.complications.IPreviewComplicationDataCallback");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
        if (i8 >= 1 && i8 <= 16777215) {
            parcel.enforceInterface("android.support.wearable.complications.IPreviewComplicationDataCallback");
        }
        if (i8 == 1598968902) {
            parcel2.writeString("android.support.wearable.complications.IPreviewComplicationDataCallback");
            return true;
        } else if (i8 != 1) {
            return super.onTransact(i8, parcel, parcel2, i9);
        } else {
            ComplicationData createFromParcel = parcel.readInt() != 0 ? ComplicationData.CREATOR.createFromParcel(parcel) : null;
            c.a aVar = (c.a) this;
            try {
                aVar.c();
                g<? super b> gVar = aVar.f6256b;
                k.b(gVar);
                gVar.i(createFromParcel != null ? e.h(createFromParcel) : null);
                aVar.f6256b = null;
                return true;
            } catch (Throwable th) {
                Log.e("ComplicationDataS", "updateComplicationData failed", th);
                throw th;
            }
        }
    }
}
