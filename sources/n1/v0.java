package n1;

import a1.a;
import android.util.Log;
import androidx.wear.watchface.control.h;
import j7.d;
import l7.e;
import l7.h;
import n1.t0;
import p7.p;
import y7.z;

@e(c = "androidx.wear.watchface.WatchFaceService$EngineWrapper$attachToParameterlessEngine$1", f = "WatchFaceService.kt", l = {}, m = "invokeSuspend")
public final class v0 extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ h.b f5852j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ t0.c f5853k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v0(h.b bVar, t0.c cVar, d<? super v0> dVar) {
        super(2, dVar);
        this.f5852j = bVar;
        this.f5853k = cVar;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new v0(this.f5852j, this.f5853k, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        return ((v0) c((z) obj, (d) obj2)).h(h7.h.f4787a);
    }

    public final Object h(Object obj) {
        h.b bVar = this.f5852j;
        a.I(obj);
        try {
            bVar.f2297b.m(this.f5853k.s(bVar.f2296a, "attachToParameterlessEngine"));
        } catch (Exception e) {
            Log.e("WatchFaceService", "attachToParameterlessEngine failed", e);
            bVar.f2297b.q(new s1.a(e));
        }
        return h7.h.f4787a;
    }
}
