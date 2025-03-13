package r3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import o3.a;
import r3.c;

public final class m0 extends d0 {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f7012g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ c f7013h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m0(c cVar, int i8, IBinder iBinder, Bundle bundle) {
        super(cVar, i8, bundle);
        this.f7013h = cVar;
        this.f7012g = iBinder;
    }

    public final boolean c() {
        IBinder iBinder = this.f7012g;
        try {
            b.b(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            c cVar = this.f7013h;
            if (!cVar.w().equals(interfaceDescriptor)) {
                String w = cVar.w();
                StringBuilder sb = new StringBuilder(String.valueOf(w).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(w);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.e("GmsClient", sb.toString());
                return false;
            }
            IInterface q8 = cVar.q(iBinder);
            if (q8 == null || (!c.y(cVar, 2, 4, q8) && !c.y(cVar, 3, 4, q8))) {
                return false;
            }
            cVar.f6949s = null;
            c.a aVar = cVar.f6945n;
            if (aVar == null) {
                return true;
            }
            ((v) aVar).f7044a.i();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    public final void d(a aVar) {
        c.b bVar = this.f7013h.f6946o;
        if (bVar != null) {
            ((w) bVar).f7050a.c(aVar);
        }
        System.currentTimeMillis();
    }
}
