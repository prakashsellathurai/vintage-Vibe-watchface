package c7;

import j6.b;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.function.Predicate;
import o6.s;
import w5.c;
import w5.d;
import w5.f;
import w5.g;

public abstract class q extends s implements g {

    /* renamed from: j  reason: collision with root package name */
    public n f2826j;

    /* renamed from: k  reason: collision with root package name */
    public String f2827k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2828l = false;

    /* renamed from: m  reason: collision with root package name */
    public final EnumSet<a> f2829m = EnumSet.noneOf(a.class);

    /* renamed from: n  reason: collision with root package name */
    public b f2830n;

    public enum a {
        ;

        /* access modifiers changed from: public */
        a() {
        }
    }

    public q(o6.q qVar) {
        super(qVar);
    }

    public final ArrayList B(a1.a aVar, Predicate predicate, o oVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f6176d.iterator();
        while (it.hasNext()) {
            ArrayList l8 = ((o6.q) it.next()).l(aVar, predicate, oVar);
            if (l8 != null) {
                arrayList.addAll(l8);
            }
        }
        return C(arrayList);
    }

    public ArrayList<n> C(ArrayList<n> arrayList) {
        n nVar = this.f2826j;
        if (nVar == null) {
            return arrayList;
        }
        if (!(nVar instanceof h) && n6.g.e(nVar.f2818f)) {
            return arrayList;
        }
        ArrayList<n> arrayList2 = new ArrayList<>();
        arrayList2.addAll(arrayList);
        arrayList2.add((n) this.f2826j.clone());
        return arrayList2;
    }

    public abstract void D();

    public void E(o oVar) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r3.f2829m.contains(c7.q.a.f2831f) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(v5.b r4) {
        /*
            r3 = this;
            c7.n r0 = r3.f2826j
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = r0.f2818f
            if (r0 == 0) goto L_0x0021
            j6.b r1 = r3.f2830n
            if (r1 == 0) goto L_0x0021
            int r0 = r1.f(r0)
            if (r0 == 0) goto L_0x0021
            c7.n r0 = r3.f2826j
            java.lang.String r1 = r0.f2818f
            r3.f2827k = r1
            j6.b r2 = r3.f2830n
            java.lang.String r1 = r2.o(r1)
            r0.b(r1)
        L_0x0021:
            java.lang.String r0 = r3.f2827k
            if (r0 != 0) goto L_0x002f
            c7.q$a r0 = c7.q.a.f2831f
            java.util.EnumSet<c7.q$a> r1 = r3.f2829m
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0038
        L_0x002f:
            w5.d r0 = w5.d.f8034k0
            w5.c r0 = w5.e.a(r0)
            r4.b(r0, r3)
        L_0x0038:
            r3.D()
            r4 = 1
            r3.f2828l = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.q.F(v5.b):void");
    }

    public void G(String str) {
        toString();
        if (str != null) {
            n nVar = this.f2826j;
            if (nVar == null) {
                this.f2826j = new n(str);
            } else {
                nVar.b(str);
            }
        }
    }

    public final void g(c cVar, f fVar) {
        String str;
        n nVar;
        if (!(!cVar.f8018a.equals(d.f8034k0.f8059f[0]) || (str = this.f2827k) == null || (nVar = this.f2826j) == null)) {
            nVar.b(this.f2830n.o(str));
        }
        A();
    }

    public final boolean isEnabled() {
        return this.f2828l && super.isEnabled();
    }

    public String q() {
        n nVar = this.f2826j;
        if (nVar == null) {
            return null;
        }
        return nVar.toString();
    }

    public ArrayList u(a1.a aVar, Predicate predicate, o oVar) {
        aVar.K(this, oVar);
        return B(aVar, predicate, new o(oVar));
    }
}
