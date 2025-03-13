package q3;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import b4.b;
import c4.l;
import com.google.android.gms.common.api.Scope;
import d4.f;
import d4.h;
import java.util.Set;
import o3.a;
import r3.b0;
import r3.i;
import r3.y0;

public final /* synthetic */ class z implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f6600f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f6601g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f6602h;

    public /* synthetic */ z(Object obj, int i8, Object obj2) {
        this.f6600f = i8;
        this.f6602h = obj;
        this.f6601g = obj2;
    }

    public final void run() {
        i iVar;
        Set<Scope> set;
        switch (this.f6600f) {
            case 1:
                e0 e0Var = (e0) this.f6602h;
                l lVar = (l) this.f6601g;
                b bVar = e0.f6551i;
                a aVar = lVar.f2667g;
                boolean z8 = true;
                if (aVar.f6080g == 0) {
                    b0 b0Var = lVar.f2668h;
                    r3.b.b(b0Var);
                    aVar = b0Var.f6930h;
                    if (aVar.f6080g != 0) {
                        z8 = false;
                    }
                    if (!z8) {
                        String valueOf = String.valueOf(aVar);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                        sb.append("Sign-in succeeded with resolve account failure: ");
                        sb.append(valueOf);
                        Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                    } else {
                        d0 d0Var = e0Var.f6557h;
                        IBinder iBinder = b0Var.f6929g;
                        if (iBinder == null) {
                            iVar = null;
                        } else {
                            int i8 = i.a.f6992b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            iVar = queryLocalInterface instanceof i ? (i) queryLocalInterface : new y0(iBinder);
                        }
                        w wVar = (w) d0Var;
                        wVar.getClass();
                        if (iVar == null || (set = e0Var.e) == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            wVar.b(new a(4));
                            e0Var.f6556g.n();
                            return;
                        }
                        wVar.f6597c = iVar;
                        wVar.f6598d = set;
                        if (wVar.e) {
                            wVar.f6595a.d(iVar, set);
                        }
                        e0Var.f6556g.n();
                        return;
                    }
                }
                ((w) e0Var.f6557h).b(aVar);
                e0Var.f6556g.n();
                return;
            default:
                synchronized (((f) this.f6602h).f4039b) {
                    Object obj = this.f6602h;
                    if (((f) obj).f4040c != null) {
                        ((f) obj).f4040c.a((h) this.f6601g);
                    }
                }
                return;
        }
    }
}
