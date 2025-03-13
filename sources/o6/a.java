package o6;

import r5.d;
import v5.b;
import w5.f;

public class a extends q {

    /* renamed from: i  reason: collision with root package name */
    public final C0099a f6130i;

    /* renamed from: o6.a$a  reason: collision with other inner class name */
    public class C0099a extends f6.a {
        public C0099a(b bVar, z5.b bVar2) {
            super(bVar, bVar2);
        }

        public final void b(f fVar) {
            d dVar;
            boolean a9 = fVar.a();
            a aVar = a.this;
            if (!(a9 == aVar.isEnabled() || (dVar = aVar.f6179h) == null)) {
                dVar.c();
            }
            aVar.z(a9);
        }
    }

    public a(q qVar, z5.b bVar, b bVar2) {
        super(qVar);
        if (bVar != null) {
            C0099a aVar = new C0099a(bVar2, bVar);
            this.f6130i = aVar;
            z(aVar.f4416b.a());
            qVar.k(new s5.f(aVar, 6));
        }
    }

    public final String q() {
        C0099a aVar = this.f6130i;
        return aVar != null ? aVar.f4416b.h() : "no expression";
    }
}
