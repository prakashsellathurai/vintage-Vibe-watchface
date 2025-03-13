package z7;

import h7.h;
import q7.l;

public final class e extends l implements p7.l<Throwable, h> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f f8723f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Runnable f8724g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(f fVar, Runnable runnable) {
        super(1);
        this.f8723f = fVar;
        this.f8724g = runnable;
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.f8723f.f8725h.removeCallbacks(this.f8724g);
        return h.f4787a;
    }
}
