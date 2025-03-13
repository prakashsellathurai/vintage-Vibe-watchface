package r3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

public final class l0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final int f7009a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f7010b;

    public l0(c cVar, int i8) {
        this.f7010b = cVar;
        this.f7009a = i8;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i8;
        int i9;
        if (iBinder == null) {
            c cVar = this.f7010b;
            synchronized (cVar.f6937f) {
                i8 = cVar.f6944m;
            }
            if (i8 == 3) {
                cVar.f6950t = true;
                i9 = 5;
            } else {
                i9 = 4;
            }
            Handler handler = cVar.e;
            handler.sendMessage(handler.obtainMessage(i9, cVar.f6952v.get(), 16));
            return;
        }
        synchronized (this.f7010b.f6938g) {
            c cVar2 = this.f7010b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            cVar2.f6939h = (queryLocalInterface == null || !(queryLocalInterface instanceof j)) ? new f0(iBinder) : (j) queryLocalInterface;
        }
        c cVar3 = this.f7010b;
        int i10 = this.f7009a;
        Handler handler2 = cVar3.e;
        handler2.sendMessage(handler2.obtainMessage(7, i10, -1, new n0(cVar3, 0)));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        c cVar;
        synchronized (this.f7010b.f6938g) {
            cVar = this.f7010b;
            cVar.f6939h = null;
        }
        Handler handler = cVar.e;
        handler.sendMessage(handler.obtainMessage(6, this.f7009a, 1));
    }
}
