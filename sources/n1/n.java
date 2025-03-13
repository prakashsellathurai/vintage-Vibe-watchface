package n1;

import q7.k;
import q7.l;

public final class n extends l implements p7.l<h, Boolean> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l f5669f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f5670g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f5671h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(l lVar, int i8, int i9) {
        super(1);
        this.f5669f = lVar;
        this.f5670g = i8;
        this.f5671h = i9;
    }

    public final Object invoke(Object obj) {
        boolean z8;
        h hVar = (h) obj;
        k.e(hVar, "complication");
        if (hVar.f5576q) {
            p pVar = hVar.f5566g;
            b0 b0Var = this.f5669f.f5654d;
            if (b0Var == null) {
                k.h("renderer");
                throw null;
            } else if (pVar.b(hVar, b0Var.f5518f, this.f5670g, this.f5671h, true)) {
                z8 = true;
                return Boolean.valueOf(z8);
            }
        }
        z8 = false;
        return Boolean.valueOf(z8);
    }
}
