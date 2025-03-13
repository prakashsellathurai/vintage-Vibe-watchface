package n1;

import androidx.health.services.client.impl.c;
import com.samsung.android.wearable.watchfacestudio.WatchFaceStudioRuntime;
import p7.a;
import q7.k;
import q7.l;

public final class j extends l implements a<e> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f5630f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(h hVar) {
        super(0);
        this.f5630f = hVar;
    }

    public final Object invoke() {
        h hVar = this.f5630f;
        f fVar = hVar.f5563c;
        l lVar = hVar.f5568i;
        if (lVar == null) {
            k.h("complicationSlotsManager");
            throw null;
        } else if (lVar.f5652b != null) {
            c cVar = (c) fVar;
            WatchFaceStudioRuntime watchFaceStudioRuntime = (WatchFaceStudioRuntime) cVar.f1371b;
            int i8 = WatchFaceStudioRuntime.f3833j;
            watchFaceStudioRuntime.getClass();
            return new WatchFaceStudioRuntime.a(((x5.c) cVar.f1372c).f8147a);
        } else {
            k.h("watchState");
            throw null;
        }
    }
}
