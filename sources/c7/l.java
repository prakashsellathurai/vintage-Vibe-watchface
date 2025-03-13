package c7;

import a1.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.function.Predicate;
import o6.q;

public final class l extends q {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f2815o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(q qVar, int i8) {
        super(qVar);
        this.f2815o = i8;
    }

    public final ArrayList C(ArrayList arrayList) {
        switch (this.f2815o) {
            case 0:
                ArrayList<n> C = super.C(arrayList);
                Iterator<n> it = C.iterator();
                while (it.hasNext()) {
                    n next = it.next();
                    String str = next.f2818f;
                    if (str != null && !str.isEmpty()) {
                        next.b(str.toLowerCase(Locale.getDefault()));
                    }
                }
                return C;
            case 1:
                StringBuilder sb = new StringBuilder();
                if (arrayList.size() == 0) {
                    n nVar = this.f2826j;
                    sb.append(nVar == null ? null : nVar.f2818f);
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        String str2 = ((n) it2.next()).f2818f;
                        if (str2 != null && !str2.isEmpty()) {
                            sb.append(str2);
                        }
                    }
                }
                super.G(sb.toString());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add((n) this.f2826j.clone());
                return arrayList2;
            case 5:
                ArrayList<n> C2 = super.C(arrayList);
                Iterator<n> it3 = C2.iterator();
                while (it3.hasNext()) {
                    n next2 = it3.next();
                    String str3 = next2.f2818f;
                    if (str3 != null && !str3.isEmpty()) {
                        next2.b(str3.toUpperCase(Locale.getDefault()));
                    }
                }
                return C2;
            default:
                return super.C(arrayList);
        }
    }

    public final void D() {
    }

    public final void G(String str) {
        switch (this.f2815o) {
            case 1:
                super.G(str);
                A();
                return;
            default:
                super.G(str);
                return;
        }
    }

    public final ArrayList u(a aVar, Predicate predicate, o oVar) {
        switch (this.f2815o) {
            case 3:
                aVar.K(this, oVar);
                o oVar2 = new o(oVar);
                oVar2.setFlags(oVar2.getFlags() | 16);
                return B(aVar, predicate, oVar2);
            case 4:
                aVar.K(this, oVar);
                o oVar3 = new o(oVar);
                oVar3.setFlags(oVar3.getFlags() | 8);
                return B(aVar, predicate, oVar3);
            default:
                return super.u(aVar, predicate, oVar);
        }
    }
}
