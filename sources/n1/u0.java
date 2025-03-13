package n1;

import j7.d;
import k7.a;
import l7.e;
import l7.h;
import n1.t0;
import p7.p;
import y7.o;

@e(c = "androidx.wear.watchface.WatchFaceService$Companion$awaitDeferredWatchFaceThenRunOnUiThread$1", f = "WatchFaceService.kt", l = {420}, m = "invokeSuspend")
public final class u0 extends h implements p<t0.c, d<? super i0>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f5849j;

    /* renamed from: k  reason: collision with root package name */
    public /* synthetic */ Object f5850k;

    public u0(d<? super u0> dVar) {
        super(2, dVar);
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        u0 u0Var = new u0(dVar);
        u0Var.f5850k = obj;
        return u0Var;
    }

    public final Object g(Object obj, Object obj2) {
        return ((u0) c((t0.c) obj, (d) obj2)).h(h7.h.f4787a);
    }

    public final Object h(Object obj) {
        a aVar = a.f5217f;
        int i8 = this.f5849j;
        if (i8 == 0) {
            a1.a.I(obj);
            o oVar = ((t0.c) this.f5850k).f5747h;
            this.f5849j = 1;
            obj = oVar.s(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            a1.a.I(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
