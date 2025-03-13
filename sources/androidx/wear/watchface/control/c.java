package androidx.wear.watchface.control;

import a1.a;
import androidx.wear.watchface.control.b;
import androidx.wear.watchface.control.data.HeadlessWatchFaceInstanceParams;
import j7.d;
import l7.e;
import l7.h;
import p7.l;

@e(c = "androidx.wear.watchface.control.IWatchFaceInstanceServiceStub$createHeadlessWatchFaceInstance$1$1$1$1", f = "WatchFaceControlService.kt", l = {}, m = "invokeSuspend")
public final class c extends h implements l<d<? super a>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b.a f2257j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ HeadlessWatchFaceInstanceParams f2258k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(b.a aVar, HeadlessWatchFaceInstanceParams headlessWatchFaceInstanceParams, d<? super c> dVar) {
        super(1, dVar);
        this.f2257j = aVar;
        this.f2258k = headlessWatchFaceInstanceParams;
    }

    public final Object h(Object obj) {
        a.I(obj);
        return this.f2257j.f2256b.r(this.f2258k);
    }

    public final Object invoke(Object obj) {
        return new c(this.f2257j, this.f2258k, (d) obj).h(h7.h.f4787a);
    }
}
