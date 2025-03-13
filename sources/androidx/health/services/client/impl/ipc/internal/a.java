package androidx.health.services.client.impl.ipc.internal;

import android.os.IBinder;
import p1.c;
import q1.b;
import q7.k;
import y7.g;

public final /* synthetic */ class a implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1388a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1389b;

    public /* synthetic */ a(int i8, Object obj) {
        this.f1388a = i8;
        this.f1389b = obj;
    }

    public final void binderDied() {
        int i8 = this.f1388a;
        Object obj = this.f1389b;
        switch (i8) {
            case 0:
                ((ServiceConnection) obj).lambda$cleanOnDeath$0();
                return;
            default:
                c.a aVar = (c.a) obj;
                int i9 = c.a.f6254d;
                k.e(aVar, "this$0");
                g<? super b> gVar = aVar.f6256b;
                if (gVar != null) {
                    gVar.i(a1.a.q(new c.d()));
                    return;
                }
                return;
        }
    }
}
