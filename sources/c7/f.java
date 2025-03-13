package c7;

import java.util.ArrayList;
import java.util.Iterator;
import o6.q;

public final class f extends q {

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f2798o = new ArrayList();

    public f(q qVar) {
        super(qVar);
    }

    public final ArrayList<n> C(ArrayList<n> arrayList) {
        ArrayList arrayList2 = this.f2798o;
        if (arrayList2.size() < 1) {
            return arrayList;
        }
        ArrayList<n> C = super.C(arrayList);
        ArrayList<n> arrayList3 = new ArrayList<>();
        Iterator<n> it = C.iterator();
        while (it.hasNext()) {
            n next = it.next();
            if (!(next instanceof h)) {
                arrayList3.add(new b(next, arrayList2));
            } else {
                arrayList3.add(next);
            }
        }
        return arrayList3;
    }

    public final void D() {
    }

    public final void H(c cVar) {
        this.f2798o.add(cVar);
        cVar.f2794a = new r5.f(21, this);
    }
}
