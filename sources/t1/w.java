package t1;

import n1.i0;
import p7.a;
import q7.k;
import q7.l;

public final class w extends l implements a<u1.l> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ u f7460f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(u uVar) {
        super(0);
        this.f7460f = uVar;
    }

    public final Object invoke() {
        u uVar = this.f7460f;
        uVar.s();
        i0.b bVar = uVar.y;
        if (bVar != null) {
            return bVar.e();
        }
        k.h("editorDelegate");
        throw null;
    }
}
