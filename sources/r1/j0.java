package r1;

import android.view.SurfaceHolder;
import androidx.wear.watchface.control.data.WatchFaceRenderParams;
import j7.d;
import l7.e;
import l7.h;
import p7.p;
import v1.a;
import y7.z;

@e(c = "androidx.wear.watchface.control.RemoteWatchFaceView$renderWatchFace$1$1", f = "RemoteWatchFaceView.kt", l = {76}, m = "invokeSuspend")
public final class j0 extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public Object f6714j;

    /* renamed from: k  reason: collision with root package name */
    public int f6715k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ k0 f6716l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ WatchFaceRenderParams f6717m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ a f6718n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, WatchFaceRenderParams watchFaceRenderParams, a aVar, d<? super j0> dVar) {
        super(2, dVar);
        this.f6716l = k0Var;
        this.f6717m = watchFaceRenderParams;
        this.f6718n = aVar;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new j0(this.f6716l, this.f6717m, this.f6718n, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        return ((j0) c((z) obj, (d) obj2)).h(h7.h.f4787a);
    }

    public final Object h(Object obj) {
        p<SurfaceHolder, WatchFaceRenderParams, h7.h> pVar;
        k7.a aVar = k7.a.f5217f;
        int i8 = this.f6715k;
        if (i8 == 0) {
            a1.a.I(obj);
            k0 k0Var = this.f6716l;
            p<SurfaceHolder, WatchFaceRenderParams, h7.h> pVar2 = k0Var.f6722c;
            this.f6714j = pVar2;
            this.f6715k = 1;
            obj = k0Var.f6723d.s(this);
            if (obj == aVar) {
                return aVar;
            }
            pVar = pVar2;
        } else if (i8 == 1) {
            pVar = (p) this.f6714j;
            a1.a.I(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pVar.g(obj, this.f6717m);
        this.f6718n.close();
        return h7.h.f4787a;
    }
}
