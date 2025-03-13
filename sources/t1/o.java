package t1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import q7.k;

public abstract class o extends Binder implements IInterface {
    public o() {
        attachInterface(this, "androidx.wear.watchface.editor.IEditorService");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
        n nVar;
        int i10;
        if (i8 >= 1 && i8 <= 16777215) {
            parcel.enforceInterface("androidx.wear.watchface.editor.IEditorService");
        }
        if (i8 == 1598968902) {
            parcel2.writeString("androidx.wear.watchface.editor.IEditorService");
            return true;
        }
        if (i8 == 2) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
        } else if (i8 != 3) {
            if (i8 == 4) {
                ((l) this).h(parcel.readInt());
            } else if (i8 != 5) {
                return super.onTransact(i8, parcel, parcel2, i9);
            } else {
                ((l) this).c();
            }
            parcel2.writeNoException();
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                nVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.wear.watchface.editor.IEditorObserver");
                nVar = (queryLocalInterface == null || !(queryLocalInterface instanceof n)) ? new m(readStrongBinder) : (n) queryLocalInterface;
            }
            l lVar = (l) this;
            k.e(nVar, "observer");
            try {
                synchronized (lVar.f7439a) {
                    i10 = lVar.f7440b;
                    lVar.f7440b = i10 + 1;
                    lVar.f7441c.put(Integer.valueOf(i10), nVar);
                    k kVar = new k(lVar, i10);
                    nVar.asBinder().linkToDeath(kVar, 0);
                    lVar.f7442d.put(Integer.valueOf(i10), kVar);
                }
                parcel2.writeNoException();
                parcel2.writeInt(i10);
            } catch (Throwable th) {
                Log.e("EditorService", "registerObserver failed", th);
                throw th;
            }
        }
        return true;
    }
}
