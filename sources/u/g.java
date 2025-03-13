package u;

import java.util.Iterator;

public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f7581m;

    public g(p pVar) {
        super(pVar);
        this.e = pVar instanceof l ? 2 : 3;
    }

    public final void d(int i8) {
        if (!this.f7578j) {
            this.f7578j = true;
            this.f7575g = i8;
            Iterator it = this.f7579k.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.a(dVar);
            }
        }
    }
}
