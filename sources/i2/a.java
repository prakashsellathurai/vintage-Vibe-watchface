package i2;

import b2.g;
import e2.e;
import j2.b;
import j2.c;
import java.util.ArrayList;
import k3.j;
import y1.f;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b.a f4792a = b.a.a("k", "x", "y");

    public static a2.b a(c cVar, f fVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.t() == 1) {
            cVar.a();
            while (cVar.j()) {
                arrayList.add(new g(fVar, n.b(cVar, fVar, k2.g.c(), s.f4830a, cVar.t() == 3, false)));
            }
            cVar.d();
            o.b(arrayList);
        } else {
            arrayList.add(new l2.a(m.b(cVar, k2.g.c())));
        }
        return new a2.b(arrayList);
    }

    public static e b(c cVar, f fVar) {
        cVar.c();
        a2.b bVar = null;
        e2.b bVar2 = null;
        boolean z8 = false;
        e2.b bVar3 = null;
        while (cVar.t() != 4) {
            int v8 = cVar.v(f4792a);
            if (v8 != 0) {
                if (v8 != 1) {
                    if (v8 != 2) {
                        cVar.w();
                        cVar.x();
                    } else if (cVar.t() != 6) {
                        bVar2 = j.O(cVar, fVar, true);
                    }
                } else if (cVar.t() != 6) {
                    bVar3 = j.O(cVar, fVar, true);
                }
                cVar.x();
                z8 = true;
            } else {
                bVar = a(cVar, fVar);
            }
        }
        cVar.g();
        if (z8) {
            fVar.a("Lottie doesn't support expressions.");
        }
        return bVar != null ? bVar : new e2.c(bVar3, bVar2);
    }
}
