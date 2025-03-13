package t1;

import kotlinx.coroutines.flow.MutableStateFlow;
import n1.i0;
import p7.a;
import q7.k;
import q7.l;
import u1.e;

public final class x extends l implements a<MutableStateFlow<e>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ u f7461f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(u uVar) {
        super(0);
        this.f7461f = uVar;
    }

    public final Object invoke() {
        i0.b bVar = this.f7461f.y;
        if (bVar != null) {
            return a1.a.c(bVar.b());
        }
        k.h("editorDelegate");
        throw null;
    }
}
