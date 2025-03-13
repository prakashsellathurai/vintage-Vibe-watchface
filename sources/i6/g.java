package i6;

import com.samsung.android.wearable.watchfacestudio.editor.q;
import java.util.ArrayList;
import java.util.Iterator;
import w5.c;

public final class g {
    public static c a(String str) {
        if (str.startsWith("[") && str.endsWith("]")) {
            return new c(str.substring(1, str.length() - 1));
        }
        return null;
    }

    public static ArrayList<e> b(e eVar, String str) {
        ArrayList<e> arrayList = new ArrayList<>();
        Iterator it = eVar.f4863b.iterator();
        while (it.hasNext()) {
            e eVar2 = (e) it.next();
            if (eVar2.f4862a.equals(str)) {
                arrayList.add(eVar2);
            }
        }
        return arrayList;
    }

    public static e c(e eVar, String str) {
        Iterator it = eVar.f4863b.iterator();
        while (it.hasNext()) {
            e eVar2 = (e) it.next();
            if (eVar2.f4862a.equals(str)) {
                return eVar2;
            }
        }
        return null;
    }

    public static String d(e eVar) {
        ArrayList<c> e = e(eVar);
        if (e.size() > 0) {
            return e.get(0).e;
        }
        return null;
    }

    public static ArrayList<c> e(e eVar) {
        ArrayList<c> arrayList = new ArrayList<>();
        Iterator it = eVar.f4863b.iterator();
        while (it.hasNext()) {
            e eVar2 = (e) it.next();
            if (eVar2 instanceof c) {
                arrayList.add((c) eVar2);
            }
        }
        return arrayList;
    }

    public static boolean f(e eVar, String[] strArr) {
        e eVar2;
        Iterator it = eVar.f4863b.iterator();
        do {
            if (!it.hasNext()) {
                return false;
            }
            eVar2 = (e) it.next();
            for (String equals : strArr) {
                if (eVar2.f4862a.equals(equals)) {
                    return true;
                }
            }
        } while (!f(eVar2, strArr));
        return true;
    }

    public static boolean g(e eVar) {
        while (eVar != null) {
            if (eVar.b("renderMode").e("SOURCE").contains("MASK")) {
                return true;
            }
            eVar = eVar.f4864c;
        }
        return false;
    }

    public static boolean h(e eVar) {
        boolean z8 = false;
        while (eVar != null) {
            z8 = eVar.f4863b.stream().filter(new q(10)).anyMatch(new q(11));
            if (z8) {
                break;
            }
            eVar = eVar.f4864c;
        }
        return z8;
    }

    public static boolean i(e eVar) {
        boolean z8 = false;
        while (eVar != null) {
            z8 = eVar.f4863b.stream().filter(new q(8)).anyMatch(new q(9));
            if (z8) {
                break;
            }
            eVar = eVar.f4864c;
        }
        return z8;
    }
}
