package n1;

import a1.a;
import android.content.Context;
import androidx.wear.watchface.control.data.WallpaperInteractiveWatchFaceInstanceParams;
import j7.d;
import l7.e;
import l7.h;
import n1.t0;
import p7.p;
import y7.z;

@e(c = "androidx.wear.watchface.WatchFaceService$EngineWrapper$setUserStyleImpl$1", f = "WatchFaceService.kt", l = {}, m = "invokeSuspend")
public final class b1 extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ t0 f5530j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ t0.c f5531k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ WallpaperInteractiveWatchFaceInstanceParams f5532l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b1(t0 t0Var, t0.c cVar, WallpaperInteractiveWatchFaceInstanceParams wallpaperInteractiveWatchFaceInstanceParams, d<? super b1> dVar) {
        super(2, dVar);
        this.f5530j = t0Var;
        this.f5531k = cVar;
        this.f5532l = wallpaperInteractiveWatchFaceInstanceParams;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new b1(this.f5530j, this.f5531k, this.f5532l, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        return ((b1) c((z) obj, (d) obj2)).h(h7.h.f4787a);
    }

    public final Object h(Object obj) {
        a.I(obj);
        Context context = this.f5531k.e;
        this.f5530j.getClass();
        t0.k(context, this.f5532l);
        return h7.h.f4787a;
    }
}
