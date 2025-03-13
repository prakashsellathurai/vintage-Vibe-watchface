package w7;

import i7.o;
import java.util.Collection;
import java.util.Iterator;
import k3.j;
import q7.k;
import t7.b;
import t7.c;

public class i extends h {
    public static final boolean n(String str) {
        boolean z8;
        k.e(str, "<this>");
        if (str.length() == 0) {
            return true;
        }
        c cVar = new c(0, str.length() - 1);
        if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
            Iterator it = cVar.iterator();
            while (true) {
                if (((b) it).f7539h) {
                    if (!j.I(str.charAt(((o) it).nextInt()))) {
                        z8 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z8 = true;
        return z8;
    }

    public static final boolean o(int i8, int i9, int i10, String str, String str2, boolean z8) {
        k.e(str, "<this>");
        k.e(str2, "other");
        return !z8 ? str.regionMatches(i8, str2, i9, i10) : str.regionMatches(z8, i8, str2, i9, i10);
    }
}
