package y7;

import j7.d;
import j7.f;
import j7.g;
import p7.p;
import q7.l;

public final class u {

    public static final class a extends l implements p<f, f.b, f> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f8614f = new a();

        public a() {
            super(2);
        }

        public final Object g(Object obj, Object obj2) {
            f fVar = (f) obj;
            f.b bVar = (f.b) obj2;
            return bVar instanceof t ? fVar.t(((t) bVar).o()) : fVar.t(bVar);
        }
    }

    public static final class b extends l implements p<f, f.b, f> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ q7.p<f> f8615f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ boolean f8616g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(q7.p<f> pVar, boolean z8) {
            super(2);
            this.f8615f = pVar;
            this.f8616g = z8;
        }

        public final Object g(Object obj, Object obj2) {
            f fVar;
            f fVar2 = (f) obj;
            f.b bVar = (f.b) obj2;
            if (!(bVar instanceof t)) {
                return fVar2.t(bVar);
            }
            q7.p<f> pVar = this.f8615f;
            if (((f) pVar.f6643f).d(bVar.getKey()) == null) {
                fVar = this.f8616g ? ((t) bVar).o() : (t) bVar;
            } else {
                pVar.f6643f = ((f) pVar.f6643f).g(bVar.getKey());
                fVar = ((t) bVar).I();
            }
            return fVar2.t(fVar);
        }
    }

    public static final f a(f fVar, f fVar2, boolean z8) {
        Boolean bool = Boolean.FALSE;
        v vVar = v.f8618f;
        boolean booleanValue = ((Boolean) fVar.q(bool, vVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) fVar2.q(bool, vVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return fVar.t(fVar2);
        }
        q7.p pVar = new q7.p();
        pVar.f6643f = fVar2;
        g gVar = g.f5052f;
        f fVar3 = (f) fVar.q(gVar, new b(pVar, z8));
        if (booleanValue2) {
            pVar.f6643f = ((f) pVar.f6643f).q(gVar, a.f8614f);
        }
        return fVar3.t((f) pVar.f6643f);
    }

    public static final u1<?> b(d<?> dVar, f fVar, Object obj) {
        u1<?> u1Var = null;
        if (!(dVar instanceof l7.d)) {
            return null;
        }
        if (!(fVar.d(v1.f8620f) != null)) {
            return null;
        }
        l7.d dVar2 = (l7.d) dVar;
        while (true) {
            if (!(dVar2 instanceof j0) && (dVar2 = dVar2.e()) != null) {
                if (dVar2 instanceof u1) {
                    u1Var = (u1) dVar2;
                    break;
                }
            } else {
                break;
            }
        }
        if (u1Var != null) {
            u1Var.m0(fVar, obj);
        }
        return u1Var;
    }
}
