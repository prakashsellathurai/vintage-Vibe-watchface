package g2;

import b2.a;

public final class a implements a.C0028a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f4506a;

    public a(b bVar) {
        this.f4506a = bVar;
    }

    public final void b() {
        b bVar = this.f4506a;
        boolean z8 = bVar.f4521p.l() == 1.0f;
        if (z8 != bVar.f4526v) {
            bVar.f4526v = z8;
            bVar.f4518m.invalidateSelf();
        }
    }
}
