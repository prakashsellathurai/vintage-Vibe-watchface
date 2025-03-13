package u;

import t.d;
import t.f;

public final class j extends p {
    public j(d dVar) {
        super(dVar);
        dVar.f7324d.f();
        dVar.e.f();
        this.f7597f = ((f) dVar).f7366q0;
    }

    public final void a(d dVar) {
        f fVar = this.f7599h;
        if (fVar.f7572c && !fVar.f7578j) {
            fVar.d((int) ((((float) ((f) fVar.f7580l.get(0)).f7575g) * ((f) this.f7594b).f7362m0) + 0.5f));
        }
    }

    public final void d() {
        p pVar;
        d dVar = this.f7594b;
        f fVar = (f) dVar;
        int i8 = fVar.f7363n0;
        int i9 = fVar.f7364o0;
        int i10 = fVar.f7366q0;
        f fVar2 = this.f7599h;
        if (i10 == 1) {
            if (i8 != -1) {
                fVar2.f7580l.add(dVar.Q.f7324d.f7599h);
                this.f7594b.Q.f7324d.f7599h.f7579k.add(fVar2);
                fVar2.f7574f = i8;
            } else if (i9 != -1) {
                fVar2.f7580l.add(dVar.Q.f7324d.f7600i);
                this.f7594b.Q.f7324d.f7600i.f7579k.add(fVar2);
                fVar2.f7574f = -i9;
            } else {
                fVar2.f7571b = true;
                fVar2.f7580l.add(dVar.Q.f7324d.f7600i);
                this.f7594b.Q.f7324d.f7600i.f7579k.add(fVar2);
            }
            m(this.f7594b.f7324d.f7599h);
            pVar = this.f7594b.f7324d;
        } else {
            if (i8 != -1) {
                fVar2.f7580l.add(dVar.Q.e.f7599h);
                this.f7594b.Q.e.f7599h.f7579k.add(fVar2);
                fVar2.f7574f = i8;
            } else if (i9 != -1) {
                fVar2.f7580l.add(dVar.Q.e.f7600i);
                this.f7594b.Q.e.f7600i.f7579k.add(fVar2);
                fVar2.f7574f = -i9;
            } else {
                fVar2.f7571b = true;
                fVar2.f7580l.add(dVar.Q.e.f7600i);
                this.f7594b.Q.e.f7600i.f7579k.add(fVar2);
            }
            m(this.f7594b.e.f7599h);
            pVar = this.f7594b.e;
        }
        m(pVar.f7600i);
    }

    public final void e() {
        d dVar = this.f7594b;
        int i8 = ((f) dVar).f7366q0;
        int i9 = this.f7599h.f7575g;
        if (i8 == 1) {
            dVar.V = i9;
        } else {
            dVar.W = i9;
        }
    }

    public final void f() {
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
