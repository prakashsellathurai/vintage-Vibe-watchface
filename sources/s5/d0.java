package s5;

import a7.d;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import i6.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import r5.e;
import r5.f;
import v6.b;
import w5.c;
import x6.c;
import x6.h;
import x6.j;

public final class d0 {
    public static void a(e eVar, i6.e eVar2, h hVar) {
        String e = eVar2.b("resource").e("");
        c a9 = g.a(e);
        if (a9 != null) {
            d dVar = new d(hVar);
            c0 c0Var = new c0(eVar.f7077h, a9, dVar);
            c0Var.g(a9, c0Var.f4416b);
            hVar.f8198l.add(dVar);
            hVar.k(new f(c0Var, 1));
        } else if (!e.isEmpty()) {
            hVar.f8198l.add(new a7.c(e, eVar.f7078i));
        } else {
            Log.e("DWF:PartImageFactory", "Resource path is empty. Image should have a resource.");
        }
    }

    public static void b(e eVar, b bVar, x6.e eVar2, j jVar) {
        Context context = eVar.f7071a;
        x6.c cVar = new x6.c();
        ArrayList arrayList = cVar.f8182c;
        if (!arrayList.contains(eVar2)) {
            arrayList.add(eVar2);
        }
        jVar.c(cVar);
        context.registerReceiver(cVar, new IntentFilter("DWF:EventTriggerAction"));
        bVar.k(new b0.c(context, 13, cVar));
        if (eVar2.i(c.a.f8184f)) {
            z zVar = new z(context, cVar);
            ArrayList arrayList2 = bVar.D;
            if (!arrayList2.contains(zVar)) {
                arrayList2.add(zVar);
            }
        }
        if (eVar2.i(c.a.f8185g)) {
            jVar.c(new a0(context, cVar));
        }
        v5.b bVar2 = eVar.f7077h;
        if (eVar2.i(c.a.f8186h)) {
            bVar2.b(w5.e.a(w5.d.f8033k), new b0(context, cVar, 0));
        }
        if (eVar2.i(c.a.f8187i)) {
            bVar2.b(w5.e.a(w5.d.f8041o), new b0(context, cVar, 1));
        }
        if (eVar2.i(c.a.f8188j)) {
            bVar2.b(w5.e.a(w5.d.y), new b0(context, cVar, 2));
        }
    }

    public static EnumSet<c.a> c(String str) {
        String[] f9 = n6.g.f(str);
        EnumSet<c.a> noneOf = EnumSet.noneOf(c.a.class);
        Arrays.stream(f9).forEach(new f(4, noneOf));
        return noneOf;
    }
}
