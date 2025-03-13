package t;

import java.util.ArrayList;
import s.b;
import s.d;
import s.h;
import t.c;

public final class f extends d {

    /* renamed from: m0  reason: collision with root package name */
    public float f7362m0 = -1.0f;

    /* renamed from: n0  reason: collision with root package name */
    public int f7363n0 = -1;

    /* renamed from: o0  reason: collision with root package name */
    public int f7364o0 = -1;

    /* renamed from: p0  reason: collision with root package name */
    public c f7365p0 = this.F;

    /* renamed from: q0  reason: collision with root package name */
    public int f7366q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f7367r0;

    public f() {
        this.f7366q0 = 0;
        this.N.clear();
        this.N.add(this.f7365p0);
        int length = this.M.length;
        for (int i8 = 0; i8 < length; i8++) {
            this.M[i8] = this.f7365p0;
        }
    }

    public final void E(d dVar, boolean z8) {
        if (this.Q != null) {
            c cVar = this.f7365p0;
            dVar.getClass();
            int o8 = d.o(cVar);
            if (this.f7366q0 == 1) {
                this.V = o8;
                this.W = 0;
                z(this.Q.i());
                C(0);
                return;
            }
            this.V = 0;
            this.W = o8;
            C(this.Q.k());
            z(0);
        }
    }

    public final void F(int i8) {
        if (this.f7366q0 != i8) {
            this.f7366q0 = i8;
            ArrayList<c> arrayList = this.N;
            arrayList.clear();
            this.f7365p0 = this.f7366q0 == 1 ? this.E : this.F;
            arrayList.add(this.f7365p0);
            c[] cVarArr = this.M;
            int length = cVarArr.length;
            for (int i9 = 0; i9 < length; i9++) {
                cVarArr[i9] = this.f7365p0;
            }
        }
    }

    public final void b(d dVar, boolean z8) {
        e eVar = (e) this.Q;
        if (eVar != null) {
            c g9 = eVar.g(c.a.f7309f);
            c g10 = eVar.g(c.a.f7311h);
            d dVar2 = this.Q;
            boolean z9 = true;
            boolean z10 = dVar2 != null && dVar2.P[0] == 2;
            if (this.f7366q0 == 0) {
                g9 = eVar.g(c.a.f7310g);
                g10 = eVar.g(c.a.f7312i);
                d dVar3 = this.Q;
                if (dVar3 == null || dVar3.P[1] != 2) {
                    z9 = false;
                }
                z10 = z9;
            }
            if (this.f7367r0) {
                c cVar = this.f7365p0;
                if (cVar.f7303c) {
                    h l8 = dVar.l(cVar);
                    dVar.d(l8, this.f7365p0.c());
                    if (this.f7363n0 != -1) {
                        if (z10) {
                            dVar.f(dVar.l(g10), l8, 0, 5);
                        }
                    } else if (this.f7364o0 != -1 && z10) {
                        h l9 = dVar.l(g10);
                        dVar.f(l8, dVar.l(g9), 0, 5);
                        dVar.f(l9, l8, 0, 5);
                    }
                    this.f7367r0 = false;
                    return;
                }
            }
            if (this.f7363n0 != -1) {
                h l10 = dVar.l(this.f7365p0);
                dVar.e(l10, dVar.l(g9), this.f7363n0, 8);
                if (z10) {
                    dVar.f(dVar.l(g10), l10, 0, 5);
                }
            } else if (this.f7364o0 != -1) {
                h l11 = dVar.l(this.f7365p0);
                h l12 = dVar.l(g10);
                dVar.e(l11, l12, -this.f7364o0, 8);
                if (z10) {
                    dVar.f(l11, dVar.l(g9), 0, 5);
                    dVar.f(l12, l11, 0, 5);
                }
            } else if (this.f7362m0 != -1.0f) {
                h l13 = dVar.l(this.f7365p0);
                h l14 = dVar.l(g10);
                float f9 = this.f7362m0;
                b m8 = dVar.m();
                m8.f7133d.b(l13, -1.0f);
                m8.f7133d.b(l14, f9);
                dVar.c(m8);
            }
        }
    }

    public final boolean c() {
        return true;
    }

    public final c g(c.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f7366q0 == 1) {
                    return this.f7365p0;
                }
                break;
            case 2:
            case 4:
                if (this.f7366q0 == 0) {
                    return this.f7365p0;
                }
                break;
        }
        throw new AssertionError(aVar.name());
    }

    public final boolean t() {
        return this.f7367r0;
    }

    public final boolean u() {
        return this.f7367r0;
    }
}
