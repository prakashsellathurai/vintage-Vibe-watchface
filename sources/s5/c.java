package s5;

import com.samsung.android.wearable.watchfacestudio.editor.p;
import e7.k;
import n6.g;
import o6.h;
import o6.q;
import q6.a;
import q6.b;
import r5.e;
import w5.i;
import x6.h;

public final class c {
    public static b a(e eVar, i6.e eVar2, q qVar) {
        b bVar = new b(qVar);
        bVar.f6179h = eVar.f7074d;
        p.a(eVar.f7077h, bVar, eVar2);
        if (qVar instanceof a) {
            bVar.C = ((a) qVar).C;
        }
        i iVar = bVar.C;
        p pVar = new p(2);
        k kVar = bVar.f6135i;
        p.c(eVar, eVar2, iVar, kVar, pVar);
        p.d(bVar, eVar2);
        h hVar = new h(bVar);
        hVar.f6180i = bVar;
        bVar.H = hVar;
        String e = eVar2.b("resource").e("");
        if (!g.e(e)) {
            hVar.f8198l.add(new a7.c(e, eVar.f7078i));
        }
        eVar.a(kVar);
        eVar.c(kVar);
        return bVar;
    }

    public static void b(e eVar, b bVar, String str) {
        e7.h hVar = new e7.h(h.a.ANGLE, new z5.b(str, eVar.f7077h, bVar.C), 1);
        bVar.f6135i.l(hVar);
        hVar.l(eVar.f7077h);
    }
}
