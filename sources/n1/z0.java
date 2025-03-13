package n1;

import android.content.Context;
import androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams;
import i7.k;
import j7.d;
import k7.a;
import l7.e;
import l7.h;
import n1.t0;
import p7.p;
import r1.h0;
import y7.o;
import y7.z;

@e(c = "androidx.wear.watchface.WatchFaceService$EngineWrapper$maybeCreateWCSApi$1$3", f = "WatchFaceService.kt", l = {1487}, m = "invokeSuspend")
public final class z0 extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f5901j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ h0 f5902k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ WallpaperInteractiveWatchFaceInstanceParams f5903l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ t0 f5904m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ t0.c f5905n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z0(h0 h0Var, WallpaperInteractiveWatchFaceInstanceParams wallpaperInteractiveWatchFaceInstanceParams, t0 t0Var, t0.c cVar, d<? super z0> dVar) {
        super(2, dVar);
        this.f5902k = h0Var;
        this.f5903l = wallpaperInteractiveWatchFaceInstanceParams;
        this.f5904m = t0Var;
        this.f5905n = cVar;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new z0(this.f5902k, this.f5903l, this.f5904m, this.f5905n, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        return ((z0) c((z) obj, (d) obj2)).h(h7.h.f4787a);
    }

    public final Object h(Object obj) {
        t0.c cVar;
        o oVar;
        a aVar = a.f5217f;
        int i8 = this.f5901j;
        if (i8 == 0) {
            a1.a.I(obj);
            h0 h0Var = this.f5902k;
            if (!(h0Var == null || (cVar = h0Var.f6708a) == null || (oVar = cVar.f5748i) == null)) {
                this.f5901j = 1;
                obj = oVar.s(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            k kVar = k.f4879f;
            WallpaperInteractiveWatchFaceInstanceParams wallpaperInteractiveWatchFaceInstanceParams = this.f5903l;
            wallpaperInteractiveWatchFaceInstanceParams.f2282j = kVar;
            Context context = this.f5905n.e;
            this.f5904m.getClass();
            t0.k(context, wallpaperInteractiveWatchFaceInstanceParams);
            return h7.h.f4787a;
        } else if (i8 == 1) {
            a1.a.I(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p0 p0Var = (p0) obj;
        k kVar2 = k.f4879f;
        WallpaperInteractiveWatchFaceInstanceParams wallpaperInteractiveWatchFaceInstanceParams2 = this.f5903l;
        wallpaperInteractiveWatchFaceInstanceParams2.f2282j = kVar2;
        Context context2 = this.f5905n.e;
        this.f5904m.getClass();
        t0.k(context2, wallpaperInteractiveWatchFaceInstanceParams2);
        return h7.h.f4787a;
    }
}
