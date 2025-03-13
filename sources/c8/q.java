package c8;

import j7.f;
import k3.j;
import l7.d;
import p7.l;
import y7.a;

public class q<T> extends a<T> implements d {

    /* renamed from: i  reason: collision with root package name */
    public final j7.d<T> f2867i;

    public q(j7.d dVar, f fVar) {
        super(fVar, true);
        this.f2867i = dVar;
    }

    public final boolean W() {
        return true;
    }

    public final d e() {
        j7.d<T> dVar = this.f2867i;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public void j0(Object obj) {
        this.f2867i.i(j.W(obj));
    }

    public void r(Object obj) {
        a1.a.E(j.W(obj), a1.a.x(this.f2867i), (l) null);
    }
}
