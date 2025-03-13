package d6;

import android.util.Log;
import c6.o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import w5.b;
import w5.d;
import w5.e;
import w5.f;

public final /* synthetic */ class c implements c6.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4056a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f4057b;

    public /* synthetic */ c(d dVar, int i8) {
        this.f4056a = i8;
        this.f4057b = dVar;
    }

    public final void a(List list) {
        d dVar;
        boolean z8;
        d dVar2;
        int i8 = this.f4056a;
        d dVar3 = this.f4057b;
        switch (i8) {
            case 0:
                dVar3.getClass();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int ordinal = ((d) it.next()).ordinal();
                    if (ordinal == 1) {
                        dVar = d.f8027h;
                    } else if (ordinal == 2) {
                        dVar = d.f8029i;
                    } else if (ordinal == 3) {
                        dVar3.s(d.f8031j);
                        dVar = d.f8037m;
                    } else if (ordinal == 4) {
                        dVar3.s(d.f8033k);
                        dVar = d.f8035l;
                    } else if (ordinal == 7) {
                        dVar = d.f8039n;
                    } else if (ordinal == 8) {
                        dVar3.s(d.f8041o);
                        dVar = d.f8043p;
                    } else if (ordinal == 10) {
                        dVar3.s(d.f8045q);
                        dVar3.s(d.r);
                        dVar3.s(d.f8048s);
                        dVar = d.f8049t;
                    } else if (ordinal == 14) {
                        dVar3.s(d.f8051u);
                        dVar3.s(d.w);
                        dVar3.s(d.y);
                        dVar3.s(d.A);
                        dVar3.s(d.f8052v);
                        dVar3.s(d.f8055x);
                        dVar3.s(d.f8057z);
                        dVar = d.B;
                    } else if (ordinal == 22) {
                        dVar3.s(d.C);
                        dVar = d.D;
                    } else if (ordinal == 24) {
                        dVar3.s(d.E);
                        dVar3.s(d.F);
                        dVar3.s(d.G);
                        dVar = d.H;
                    } else if (ordinal != 28) {
                        if (ordinal != 48) {
                            if (ordinal == 51) {
                                dVar3.t(d.f8024f0, dVar3.e);
                                dVar2 = d.f8028h0;
                            } else if (ordinal == 30) {
                                dVar = d.K;
                            } else if (ordinal == 31) {
                                dVar3.s(d.L);
                                dVar3.s(d.M);
                                dVar3.s(d.N);
                                dVar3.s(d.X);
                                dVar = d.Y;
                            } else if (ordinal == 34) {
                                dVar = d.O;
                            } else if (ordinal == 35) {
                                dVar3.s(d.P);
                                dVar3.s(d.T);
                                dVar3.s(d.Q);
                                dVar3.s(d.R);
                                dVar = d.S;
                            } else if (ordinal == 40) {
                                dVar = d.U;
                            } else if (ordinal == 41) {
                                dVar3.s(d.V);
                                dVar = d.W;
                            } else if (ordinal == 45) {
                                dVar2 = d.Z;
                            } else if (ordinal == 46) {
                                dVar = d.f8019a0;
                            }
                            z8 = dVar3.e;
                        } else {
                            dVar3.t(d.f8019a0, true);
                            dVar3.t(d.f8020b0, true);
                            dVar3.t(d.f8021c0, true);
                            dVar3.t(d.f8022d0, true);
                            dVar2 = d.f8023e0;
                            z8 = true;
                        }
                        dVar3.t(dVar2, z8);
                    } else {
                        dVar3.s(d.I);
                        dVar = d.J;
                    }
                    dVar3.s(dVar);
                }
                o oVar = dVar3.f4063o.f2773j;
                long j8 = (oVar.f2779c / 1000) - ((long) oVar.e);
                if (Math.abs(dVar3.f4059k - j8) >= 60) {
                    dVar3.f4059k = j8;
                    dVar3.f4060l = true;
                    return;
                }
                return;
            case 1:
                dVar3.getClass();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    dVar3.t((d) it2.next(), dVar3.e);
                }
                return;
            case 2:
                dVar3.getClass();
                dVar3.s(d.f8034k0);
                for (String str : dVar3.f4049b.keySet()) {
                    if (((f) b.f8015a.getOrDefault(e.c(str), f.f8063k)).f8067a == 6) {
                        if (str.isEmpty()) {
                            Log.e("DWF:DataSource", "invalid source");
                        }
                        HashMap hashMap = e.f8060a;
                        dVar3.g(str, dVar3.q(e.c(str)), false);
                    }
                }
                dVar3.s(d.f8026g0);
                return;
            case 3:
                dVar3.getClass();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    dVar3.s((d) it3.next());
                }
                return;
            case 4:
                dVar3.getClass();
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    dVar3.s((d) it4.next());
                }
                return;
            case 5:
                dVar3.getClass();
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    d dVar4 = (d) it5.next();
                    dVar3.f4065q.getClass();
                    dVar3.t(dVar4, d.O0.ordinal() < dVar4.ordinal() && dVar4.ordinal() < d.R0.ordinal());
                }
                return;
            case 6:
                dVar3.getClass();
                Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    dVar3.s((d) it6.next());
                }
                return;
            default:
                dVar3.getClass();
                Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    dVar3.s((d) it7.next());
                }
                return;
        }
    }
}
