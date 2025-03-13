package q1;

import i7.f;
import i7.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q7.k;

public final class a0 {
    public static final int[] a(List list) {
        k.e(list, "<this>");
        ArrayList arrayList = new ArrayList(f.M(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((d) it.next()).f6450f));
        }
        return i.b0(arrayList);
    }
}
