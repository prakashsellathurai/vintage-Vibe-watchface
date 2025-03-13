package t1;

import java.time.Instant;
import n1.i0;
import p7.a;
import q7.k;
import q7.l;

public final class t extends l implements a<Instant> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ u f7455f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(u uVar) {
        super(0);
        this.f7455f = uVar;
    }

    public final Object invoke() {
        i0.b bVar = this.f7455f.y;
        if (bVar != null) {
            return bVar.f();
        }
        k.h("editorDelegate");
        throw null;
    }
}
