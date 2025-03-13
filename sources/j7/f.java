package j7;

import j7.e;
import p7.p;
import q7.k;
import q7.l;

public interface f {

    public static final class a {

        /* renamed from: j7.f$a$a  reason: collision with other inner class name */
        public static final class C0070a extends l implements p<f, b, f> {

            /* renamed from: f  reason: collision with root package name */
            public static final C0070a f5051f = new C0070a();

            public C0070a() {
                super(2);
            }

            public final Object g(Object obj, Object obj2) {
                c cVar;
                f fVar = (f) obj;
                b bVar = (b) obj2;
                k.e(fVar, "acc");
                k.e(bVar, "element");
                f g9 = fVar.g(bVar.getKey());
                g gVar = g.f5052f;
                if (g9 == gVar) {
                    return bVar;
                }
                int i8 = e.f5049d;
                e.a aVar = e.a.f5050f;
                e eVar = (e) g9.d(aVar);
                if (eVar == null) {
                    cVar = new c(bVar, g9);
                } else {
                    f g10 = g9.g(aVar);
                    if (g10 == gVar) {
                        return new c(eVar, bVar);
                    }
                    cVar = new c(eVar, new c(bVar, g10));
                }
                return cVar;
            }
        }

        public static f a(f fVar, f fVar2) {
            k.e(fVar2, "context");
            return fVar2 == g.f5052f ? fVar : (f) fVar2.q(fVar, C0070a.f5051f);
        }
    }

    public interface b extends f {

        public static final class a {
            public static <E extends b> E a(b bVar, c<E> cVar) {
                k.e(cVar, "key");
                if (k.a(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static f b(b bVar, c<?> cVar) {
                k.e(cVar, "key");
                return k.a(bVar.getKey(), cVar) ? g.f5052f : bVar;
            }
        }

        <E extends b> E d(c<E> cVar);

        c<?> getKey();
    }

    public interface c<E extends b> {
    }

    <E extends b> E d(c<E> cVar);

    f g(c<?> cVar);

    <R> R q(R r, p<? super R, ? super b, ? extends R> pVar);

    f t(f fVar);
}
