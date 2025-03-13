package o6;

import e7.i;
import e7.k;
import s5.d;
import w5.f;

public final class u extends d implements k, e7.d {

    /* renamed from: b  reason: collision with root package name */
    public final k f6181b = new k(this);

    /* renamed from: c  reason: collision with root package name */
    public final v f6182c = new v();

    /* renamed from: d  reason: collision with root package name */
    public final t f6183d;
    public final n6.d e = new n6.d(1.0f, 1.0f);

    /* renamed from: f  reason: collision with root package name */
    public r5.d f6184f = null;

    public u(int i8, int i9) {
        t tVar = new t();
        this.f6183d = tVar;
        tVar.N(0.0f, 0.0f, (float) i8, (float) i9);
    }

    public final f a(i.a aVar) {
        return this.f6182c.b(aVar);
    }

    public final void e(i.a aVar, f fVar) {
        this.f6182c.d(aVar, fVar);
        r5.d dVar = this.f6184f;
        if (dVar != null) {
            dVar.c();
        }
    }

    public final boolean isEnabled() {
        return true;
    }
}
