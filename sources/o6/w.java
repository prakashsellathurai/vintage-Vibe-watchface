package o6;

import f6.a;
import v5.b;
import w5.f;

public final class w extends a {
    public final /* synthetic */ int e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f6189f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(x xVar, b bVar, z5.b bVar2, int i8) {
        super(bVar, bVar2);
        this.f6189f = xVar;
        this.e = i8;
    }

    public final void b(f fVar) {
        x xVar = this.f6189f;
        xVar.f6192c.set(this.e, String.valueOf(fVar.h()));
        n nVar = xVar.f6190a;
        if (nVar != null) {
            xVar.a();
            s5.b bVar = (s5.b) nVar;
            if (bVar.f7211b != null && !bVar.f7213d) {
                bVar.f7213d = true;
                bVar.f7212c.postDelayed(new androidx.activity.b(8, bVar), 100);
            }
        }
    }
}
