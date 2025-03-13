package u;

import java.util.ArrayList;
import t.c;
import t.d;
import t.f;
import t.h;

public final class i {
    public static o a(d dVar, int i8, ArrayList<o> arrayList, o oVar) {
        boolean z8;
        c cVar;
        int i9;
        int i10 = i8 == 0 ? dVar.f7338k0 : dVar.f7340l0;
        int i11 = 0;
        if (i10 != -1 && (oVar == null || i10 != oVar.f7590b)) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i12);
                if (oVar2.f7590b == i10) {
                    if (oVar != null) {
                        oVar.c(i8, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i12++;
                }
            }
        } else if (i10 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (dVar instanceof h) {
                h hVar = (h) dVar;
                int i13 = 0;
                while (true) {
                    if (i13 >= hVar.f7369n0) {
                        i9 = -1;
                        break;
                    }
                    d dVar2 = hVar.f7368m0[i13];
                    if ((i8 == 0 && (i9 = dVar2.f7338k0) != -1) || (i8 == 1 && (i9 = dVar2.f7340l0) != -1)) {
                        break;
                    }
                    i13++;
                }
                if (i9 != -1) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList.size()) {
                            break;
                        }
                        o oVar3 = arrayList.get(i14);
                        if (oVar3.f7590b == i9) {
                            oVar = oVar3;
                            break;
                        }
                        i14++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i8);
            }
            arrayList.add(oVar);
        }
        ArrayList<d> arrayList2 = oVar.f7589a;
        if (arrayList2.contains(dVar)) {
            z8 = false;
        } else {
            arrayList2.add(dVar);
            z8 = true;
        }
        if (z8) {
            if (dVar instanceof f) {
                f fVar = (f) dVar;
                c cVar2 = fVar.f7365p0;
                if (fVar.f7366q0 == 0) {
                    i11 = 1;
                }
                cVar2.b(i11, oVar, arrayList);
            }
            int i15 = oVar.f7590b;
            if (i8 == 0) {
                dVar.f7338k0 = i15;
                dVar.E.b(i8, oVar, arrayList);
                cVar = dVar.G;
            } else {
                dVar.f7340l0 = i15;
                dVar.F.b(i8, oVar, arrayList);
                dVar.I.b(i8, oVar, arrayList);
                cVar = dVar.H;
            }
            cVar.b(i8, oVar, arrayList);
            dVar.L.b(i8, oVar, arrayList);
        }
        return oVar;
    }

    public static boolean b(int i8, int i9, int i10, int i11) {
        return (i10 == 1 || i10 == 2 || (i10 == 4 && i8 != 2)) || (i11 == 1 || i11 == 2 || (i11 == 4 && i9 != 2));
    }
}
