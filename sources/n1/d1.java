package n1;

import j7.d;
import k7.a;
import l7.e;
import l7.h;
import n1.t0;
import p7.p;
import y7.z;

@e(c = "androidx.wear.watchface.WatchFaceService$WslFlow$onSetBinder$1", f = "WatchFaceService.kt", l = {1122}, m = "invokeSuspend")
public final class d1 extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f5546j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ t0.e f5547k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d1(t0.e eVar, d<? super d1> dVar) {
        super(2, dVar);
        this.f5547k = eVar;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new d1(this.f5547k, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        return ((d1) c((z) obj, (d) obj2)).h(h7.h.f4787a);
    }

    public final Object h(Object obj) {
        a aVar = a.f5217f;
        int i8 = this.f5546j;
        if (i8 == 0) {
            a1.a.I(obj);
            this.f5546j = 1;
            if (t0.e.a(this.f5547k, this) == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            a1.a.I(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return h7.h.f4787a;
    }
}
