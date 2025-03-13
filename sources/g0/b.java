package g0;

import a1.a;
import b0.b;
import c0.c;

public final class b implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f4443f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f4444g;

    public b(a aVar, int i8) {
        this.f4443f = aVar;
        this.f4444g = i8;
    }

    public final void run() {
        b.C0027b bVar = ((c.a) this.f4443f).s0;
        if (bVar != null) {
            bVar.c(this.f4444g);
        }
    }
}
