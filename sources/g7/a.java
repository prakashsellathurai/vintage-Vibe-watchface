package g7;

import b6.b;
import java.util.ArrayList;
import java.util.Locale;
import r5.g;
import u1.m;
import w5.f;

public final class a {
    public static ArrayList a(b bVar, m.h hVar) {
        ArrayList arrayList = new ArrayList();
        String aVar = hVar.f7694a.toString();
        if (bVar != null) {
            int i8 = bVar.f2603a;
            if (i8 == 3) {
                bVar.f2608g.stream().filter(new g(6, aVar)).findFirst().ifPresent(new s5.a(3, arrayList));
            } else {
                arrayList.add(i8 == 1 ? new f(hVar.toString().toUpperCase(Locale.getDefault())) : new f(aVar));
            }
        }
        return arrayList;
    }
}
