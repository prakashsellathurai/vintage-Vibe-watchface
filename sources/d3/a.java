package d3;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import k3.k;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Set<g> f4004a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public boolean f4005b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4006c;

    public final void a(g gVar) {
        this.f4004a.add(gVar);
        if (this.f4006c) {
            gVar.a();
        } else if (this.f4005b) {
            gVar.j();
        } else {
            gVar.d();
        }
    }

    public final void b() {
        this.f4006c = true;
        Iterator it = k.d(this.f4004a).iterator();
        while (it.hasNext()) {
            ((g) it.next()).a();
        }
    }

    public final void c(g gVar) {
        this.f4004a.remove(gVar);
    }

    public final void d() {
        this.f4005b = true;
        Iterator it = k.d(this.f4004a).iterator();
        while (it.hasNext()) {
            ((g) it.next()).j();
        }
    }

    public final void e() {
        this.f4005b = false;
        Iterator it = k.d(this.f4004a).iterator();
        while (it.hasNext()) {
            ((g) it.next()).d();
        }
    }
}
