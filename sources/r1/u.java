package r1;

import a1.a;
import android.util.Log;
import j7.d;
import l7.e;
import l7.h;
import n1.t0;
import p7.l;

@e(c = "androidx.wear.watchface.control.InteractiveWatchFaceImpl$ambientTickUpdate$1$1", f = "InteractiveWatchFaceImpl.kt", l = {}, m = "invokeSuspend")
public final class u extends h implements l<d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ h0 f6731j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(h0 h0Var, d<? super u> dVar) {
        super(1, dVar);
        this.f6731j = h0Var;
    }

    public final Object h(Object obj) {
        a.I(obj);
        h0 h0Var = this.f6731j;
        t0.c cVar = h0Var.f6708a;
        if (cVar != null) {
            cVar.p();
        } else {
            new Integer(Log.d("InteractiveWatchFaceImpl", "ambientTickUpdate ignored due to null engine id " + h0Var.f6709b));
        }
        return h7.h.f4787a;
    }

    public final Object invoke(Object obj) {
        return new u(this.f6731j, (d) obj).h(h7.h.f4787a);
    }
}
