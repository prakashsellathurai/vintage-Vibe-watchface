package u;

import java.util.ArrayList;
import java.util.Iterator;
import t.a;
import t.d;

public final class k extends p {
    public k(d dVar) {
        super(dVar);
    }

    public final void a(d dVar) {
        a aVar = (a) this.f7594b;
        int i8 = aVar.f7281o0;
        f fVar = this.f7599h;
        Iterator it = fVar.f7580l.iterator();
        int i9 = 0;
        int i10 = -1;
        while (it.hasNext()) {
            int i11 = ((f) it.next()).f7575g;
            if (i10 == -1 || i11 < i10) {
                i10 = i11;
            }
            if (i9 < i11) {
                i9 = i11;
            }
        }
        if (i8 == 0 || i8 == 2) {
            fVar.d(i10 + aVar.f7283q0);
        } else {
            fVar.d(i9 + aVar.f7283q0);
        }
    }

    public final void d() {
        p pVar;
        d dVar = this.f7594b;
        if (dVar instanceof a) {
            f fVar = this.f7599h;
            fVar.f7571b = true;
            a aVar = (a) dVar;
            int i8 = aVar.f7281o0;
            boolean z8 = aVar.f7282p0;
            ArrayList arrayList = fVar.f7580l;
            int i9 = 0;
            if (i8 == 0) {
                fVar.e = 4;
                while (i9 < aVar.f7369n0) {
                    d dVar2 = aVar.f7368m0[i9];
                    if (z8 || dVar2.f7325d0 != 8) {
                        f fVar2 = dVar2.f7324d.f7599h;
                        fVar2.f7579k.add(fVar);
                        arrayList.add(fVar2);
                    }
                    i9++;
                }
            } else if (i8 != 1) {
                if (i8 == 2) {
                    fVar.e = 6;
                    while (i9 < aVar.f7369n0) {
                        d dVar3 = aVar.f7368m0[i9];
                        if (z8 || dVar3.f7325d0 != 8) {
                            f fVar3 = dVar3.e.f7599h;
                            fVar3.f7579k.add(fVar);
                            arrayList.add(fVar3);
                        }
                        i9++;
                    }
                } else if (i8 == 3) {
                    fVar.e = 7;
                    while (i9 < aVar.f7369n0) {
                        d dVar4 = aVar.f7368m0[i9];
                        if (z8 || dVar4.f7325d0 != 8) {
                            f fVar4 = dVar4.e.f7600i;
                            fVar4.f7579k.add(fVar);
                            arrayList.add(fVar4);
                        }
                        i9++;
                    }
                } else {
                    return;
                }
                m(this.f7594b.e.f7599h);
                pVar = this.f7594b.e;
                m(pVar.f7600i);
            } else {
                fVar.e = 5;
                while (i9 < aVar.f7369n0) {
                    d dVar5 = aVar.f7368m0[i9];
                    if (z8 || dVar5.f7325d0 != 8) {
                        f fVar5 = dVar5.f7324d.f7600i;
                        fVar5.f7579k.add(fVar);
                        arrayList.add(fVar5);
                    }
                    i9++;
                }
            }
            m(this.f7594b.f7324d.f7599h);
            pVar = this.f7594b.f7324d;
            m(pVar.f7600i);
        }
    }

    public final void e() {
        d dVar = this.f7594b;
        if (dVar instanceof a) {
            int i8 = ((a) dVar).f7281o0;
            f fVar = this.f7599h;
            if (i8 == 0 || i8 == 1) {
                dVar.V = fVar.f7575g;
            } else {
                dVar.W = fVar.f7575g;
            }
        }
    }

    public final void f() {
        this.f7595c = null;
        this.f7599h.c();
    }

    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f7599h;
        fVar2.f7579k.add(fVar);
        fVar.f7580l.add(fVar2);
    }
}
