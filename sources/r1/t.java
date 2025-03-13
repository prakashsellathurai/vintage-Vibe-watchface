package r1;

import android.util.Log;
import j7.d;
import k7.a;
import l7.e;
import l7.h;
import n1.t0;
import p7.p;
import y7.z;

@e(c = "androidx.wear.watchface.control.InteractiveWatchFaceImpl$addWatchfaceReadyListener$1$1", f = "InteractiveWatchFaceImpl.kt", l = {265}, m = "invokeSuspend")
public final class t extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f6728j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ h0 f6729k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ s f6730l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(h0 h0Var, s sVar, d<? super t> dVar) {
        super(2, dVar);
        this.f6729k = h0Var;
        this.f6730l = sVar;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new t(this.f6729k, this.f6730l, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        return ((t) c((z) obj, (d) obj2)).h(h7.h.f4787a);
    }

    public final Object h(Object obj) {
        a aVar = a.f5217f;
        int i8 = this.f6728j;
        if (i8 == 0) {
            a1.a.I(obj);
            h0 h0Var = this.f6729k;
            t0.c cVar = h0Var.f6708a;
            if (cVar != null) {
                this.f6728j = 1;
                if (cVar.o(this.f6730l, this) == aVar) {
                    return aVar;
                }
            } else {
                new Integer(Log.d("InteractiveWatchFaceImpl", "addWatchfaceReadyListener ignored due to null engine id " + h0Var.f6709b));
            }
        } else if (i8 == 1) {
            a1.a.I(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return h7.h.f4787a;
    }
}
