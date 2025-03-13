package t;

import s.b;
import s.d;
import s.h;
import t.c;

public final class a extends h {

    /* renamed from: o0  reason: collision with root package name */
    public int f7281o0 = 0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f7282p0 = true;

    /* renamed from: q0  reason: collision with root package name */
    public int f7283q0 = 0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f7284r0 = false;

    public final boolean G() {
        int i8;
        c g9;
        c g10;
        c g11;
        int i9;
        int i10;
        boolean z8 = true;
        int i11 = 0;
        while (true) {
            i8 = this.f7369n0;
            if (i11 >= i8) {
                break;
            }
            d dVar = this.f7368m0[i11];
            if ((this.f7282p0 || dVar.c()) && ((((i9 = this.f7281o0) == 0 || i9 == 1) && !dVar.t()) || (((i10 = this.f7281o0) == 2 || i10 == 3) && !dVar.u()))) {
                z8 = false;
            }
            i11++;
        }
        if (!z8 || i8 <= 0) {
            return false;
        }
        int i12 = 0;
        boolean z9 = false;
        for (int i13 = 0; i13 < this.f7369n0; i13++) {
            d dVar2 = this.f7368m0[i13];
            if (this.f7282p0 || dVar2.c()) {
                c.a aVar = c.a.f7312i;
                c.a aVar2 = c.a.f7310g;
                c.a aVar3 = c.a.f7311h;
                c.a aVar4 = c.a.f7309f;
                if (!z9) {
                    int i14 = this.f7281o0;
                    if (i14 == 0) {
                        g11 = dVar2.g(aVar4);
                    } else if (i14 == 1) {
                        g11 = dVar2.g(aVar3);
                    } else if (i14 == 2) {
                        g11 = dVar2.g(aVar2);
                    } else {
                        if (i14 == 3) {
                            g11 = dVar2.g(aVar);
                        }
                        z9 = true;
                    }
                    i12 = g11.c();
                    z9 = true;
                }
                int i15 = this.f7281o0;
                if (i15 == 0) {
                    g10 = dVar2.g(aVar4);
                } else {
                    if (i15 == 1) {
                        g9 = dVar2.g(aVar3);
                    } else if (i15 == 2) {
                        g10 = dVar2.g(aVar2);
                    } else if (i15 == 3) {
                        g9 = dVar2.g(aVar);
                    }
                    i12 = Math.max(i12, g9.c());
                }
                i12 = Math.min(i12, g10.c());
            }
        }
        int i16 = i12 + this.f7283q0;
        int i17 = this.f7281o0;
        if (i17 == 0 || i17 == 1) {
            x(i16, i16);
        } else {
            y(i16, i16);
        }
        this.f7284r0 = true;
        return true;
    }

    public final int H() {
        int i8 = this.f7281o0;
        if (i8 == 0 || i8 == 1) {
            return 0;
        }
        return (i8 == 2 || i8 == 3) ? 1 : -1;
    }

    public final void b(d dVar, boolean z8) {
        boolean z9;
        h hVar;
        c cVar;
        int i8;
        int i9;
        h hVar2;
        int i10;
        d dVar2 = dVar;
        c[] cVarArr = this.M;
        c cVar2 = this.E;
        cVarArr[0] = cVar2;
        int i11 = 2;
        c cVar3 = this.F;
        cVarArr[2] = cVar3;
        c cVar4 = this.G;
        cVarArr[1] = cVar4;
        c cVar5 = this.H;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.f7308i = dVar2.l(cVar6);
        }
        int i12 = this.f7281o0;
        if (i12 >= 0 && i12 < 4) {
            c cVar7 = cVarArr[i12];
            if (!this.f7284r0) {
                G();
            }
            if (this.f7284r0) {
                this.f7284r0 = false;
                int i13 = this.f7281o0;
                if (i13 == 0 || i13 == 1) {
                    dVar2.d(cVar2.f7308i, this.V);
                    hVar2 = cVar4.f7308i;
                    i10 = this.V;
                } else if (i13 == 2 || i13 == 3) {
                    dVar2.d(cVar3.f7308i, this.W);
                    hVar2 = cVar5.f7308i;
                    i10 = this.W;
                } else {
                    return;
                }
                dVar2.d(hVar2, i10);
                return;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= this.f7369n0) {
                    z9 = false;
                    break;
                }
                d dVar3 = this.f7368m0[i14];
                if ((this.f7282p0 || dVar3.c()) && ((((i9 = this.f7281o0) == 0 || i9 == 1) && dVar3.P[0] == 3 && dVar3.E.f7305f != null && dVar3.G.f7305f != null) || ((i9 == 2 || i9 == 3) && dVar3.P[1] == 3 && dVar3.F.f7305f != null && dVar3.H.f7305f != null))) {
                    z9 = true;
                } else {
                    i14++;
                }
            }
            boolean z10 = cVar2.e() || cVar4.e();
            boolean z11 = cVar3.e() || cVar5.e();
            int i15 = !(!z9 && (((i8 = this.f7281o0) == 0 && z10) || ((i8 == 2 && z11) || ((i8 == 1 && z10) || (i8 == 3 && z11))))) ? 4 : 5;
            int i16 = 0;
            while (i16 < this.f7369n0) {
                d dVar4 = this.f7368m0[i16];
                if (this.f7282p0 || dVar4.c()) {
                    h l8 = dVar2.l(dVar4.M[this.f7281o0]);
                    int i17 = this.f7281o0;
                    c cVar8 = dVar4.M[i17];
                    cVar8.f7308i = l8;
                    c cVar9 = cVar8.f7305f;
                    int i18 = (cVar9 == null || cVar9.f7304d != this) ? 0 : cVar8.f7306g + 0;
                    if (i17 == 0 || i17 == i11) {
                        b m8 = dVar.m();
                        h n8 = dVar.n();
                        n8.f7166d = 0;
                        m8.d(cVar7.f7308i, l8, n8, this.f7283q0 - i18);
                        dVar2.c(m8);
                    } else {
                        b m9 = dVar.m();
                        h n9 = dVar.n();
                        n9.f7166d = 0;
                        m9.c(cVar7.f7308i, l8, n9, this.f7283q0 + i18);
                        dVar2.c(m9);
                    }
                    dVar2.e(cVar7.f7308i, l8, this.f7283q0 + i18, i15);
                }
                i16++;
                i11 = 2;
            }
            int i19 = this.f7281o0;
            if (i19 == 0) {
                dVar2.e(cVar4.f7308i, cVar2.f7308i, 0, 8);
                dVar2.e(cVar2.f7308i, this.Q.G.f7308i, 0, 4);
                hVar = cVar2.f7308i;
                cVar = this.Q.E;
            } else if (i19 == 1) {
                dVar2.e(cVar2.f7308i, cVar4.f7308i, 0, 8);
                dVar2.e(cVar2.f7308i, this.Q.E.f7308i, 0, 4);
                hVar = cVar2.f7308i;
                cVar = this.Q.G;
            } else if (i19 == 2) {
                dVar2.e(cVar5.f7308i, cVar3.f7308i, 0, 8);
                dVar2.e(cVar3.f7308i, this.Q.H.f7308i, 0, 4);
                hVar = cVar3.f7308i;
                cVar = this.Q.F;
            } else if (i19 == 3) {
                dVar2.e(cVar3.f7308i, cVar5.f7308i, 0, 8);
                dVar2.e(cVar3.f7308i, this.Q.F.f7308i, 0, 4);
                hVar = cVar3.f7308i;
                cVar = this.Q.H;
            } else {
                return;
            }
            dVar2.e(hVar, cVar.f7308i, 0, 0);
        }
    }

    public final boolean c() {
        return true;
    }

    public final boolean t() {
        return this.f7284r0;
    }

    public final String toString() {
        String str = "[Barrier] " + this.f7326e0 + " {";
        for (int i8 = 0; i8 < this.f7369n0; i8++) {
            d dVar = this.f7368m0[i8];
            if (i8 > 0) {
                str = str + ", ";
            }
            str = str + dVar.f7326e0;
        }
        return str + "}";
    }

    public final boolean u() {
        return this.f7284r0;
    }
}
