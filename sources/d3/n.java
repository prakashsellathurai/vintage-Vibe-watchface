package d3;

import h3.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import k3.k;

public final class n implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Set<c<?>> f4034a = Collections.newSetFromMap(new WeakHashMap());

    public final void a() {
        Iterator it = k.d(this.f4034a).iterator();
        while (it.hasNext()) {
            ((c) it.next()).a();
        }
    }

    public final void d() {
        Iterator it = k.d(this.f4034a).iterator();
        while (it.hasNext()) {
            ((c) it.next()).d();
        }
    }

    public final void j() {
        Iterator it = k.d(this.f4034a).iterator();
        while (it.hasNext()) {
            ((c) it.next()).j();
        }
    }
}
