package n1;

import j7.d;
import k7.a;
import l7.e;
import l7.h;
import n1.t0;
import p7.p;
import y7.o;

@e(c = "androidx.wear.watchface.WatchFaceService$Companion$awaitDeferredEarlyInitDetailsThenRunOnThread$1", f = "WatchFaceService.kt", l = {435}, m = "invokeSuspend")
public final class r0 extends h implements p<t0.c, d<? super t0.b>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f5709j;

    /* renamed from: k  reason: collision with root package name */
    public /* synthetic */ Object f5710k;

    public r0(d<? super r0> dVar) {
        super(2, dVar);
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        r0 r0Var = new r0(dVar);
        r0Var.f5710k = obj;
        return r0Var;
    }

    public final Object g(Object obj, Object obj2) {
        return ((r0) c((t0.c) obj, (d) obj2)).h(h7.h.f4787a);
    }

    public final Object h(Object obj) {
        a aVar = a.f5217f;
        int i8 = this.f5709j;
        if (i8 == 0) {
            a1.a.I(obj);
            o oVar = ((t0.c) this.f5710k).f5746g;
            this.f5709j = 1;
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
