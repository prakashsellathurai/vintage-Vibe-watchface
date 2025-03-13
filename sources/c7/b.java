package c7;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;

public final class b extends n {

    /* renamed from: j  reason: collision with root package name */
    public final List<c> f2793j;

    public b(n nVar, ArrayList arrayList) {
        nVar.getClass();
        this.f2818f = nVar.f2818f;
        this.f2819g = new Rect(nVar.f2819g);
        this.f2820h = new o(nVar.f2820h);
        this.f2793j = arrayList;
    }

    public final boolean d() {
        for (c b9 : this.f2793j) {
            if (!b9.b()) {
                return false;
            }
        }
        return true;
    }

    public final ArrayList e(o oVar) {
        ArrayList arrayList = new ArrayList();
        for (c next : this.f2793j) {
            next.getClass();
            arrayList.add(next.a(new o(oVar)));
        }
        return arrayList;
    }
}
