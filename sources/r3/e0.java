package r3;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import y3.b;
import z3.a;

public abstract class e0 extends b {
    public e0() {
        super(1, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final boolean w(int i8, Parcel parcel, Parcel parcel2) {
        if (i8 == 1) {
            k0 k0Var = (k0) this;
            b.c(k0Var.f7005b, "onPostInitComplete can be called only once per call to getRemoteService");
            c cVar = k0Var.f7005b;
            Handler handler = cVar.e;
            handler.sendMessage(handler.obtainMessage(1, k0Var.f7006c, -1, new m0(cVar, parcel.readInt(), parcel.readStrongBinder(), (Bundle) a.a(parcel, Bundle.CREATOR))));
            k0Var.f7005b = null;
        } else if (i8 == 2) {
            parcel.readInt();
            Bundle bundle = (Bundle) a.a(parcel, Bundle.CREATOR);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else if (i8 != 3) {
            return false;
        } else {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            o0 o0Var = (o0) a.a(parcel, o0.CREATOR);
            k0 k0Var2 = (k0) this;
            c cVar2 = k0Var2.f7005b;
            b.c(cVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            b.b(o0Var);
            cVar2.f6951u = o0Var;
            Bundle bundle2 = o0Var.f7022f;
            b.c(k0Var2.f7005b, "onPostInitComplete can be called only once per call to getRemoteService");
            c cVar3 = k0Var2.f7005b;
            Handler handler2 = cVar3.e;
            handler2.sendMessage(handler2.obtainMessage(1, k0Var2.f7006c, -1, new m0(cVar3, readInt, readStrongBinder, bundle2)));
            k0Var2.f7005b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
