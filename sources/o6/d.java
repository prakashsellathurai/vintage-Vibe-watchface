package o6;

import a1.a;
import android.util.Log;
import c7.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Predicate;

public final class d extends q {

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f6132i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public f f6133j = null;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6134k = false;

    public d(q qVar) {
        super(qVar);
    }

    public final void o(q qVar) {
        if (qVar instanceof f) {
            if (this.f6133j == null) {
                this.f6133j = (f) qVar;
            } else {
                Log.e("DWF:ConditionNode", "Condition already have default node. It will be ignored.");
                return;
            }
        }
        ArrayList arrayList = this.f6176d;
        if (arrayList.size() <= 0 || !(arrayList.get(arrayList.size() - 1) instanceof f)) {
            arrayList.add(qVar);
        } else {
            arrayList.add(arrayList.size() - 1, qVar);
        }
        c cVar = new c(this);
        qVar.getClass();
        qVar.p(cVar, cVar instanceof s5.d ? (s5.d) cVar : null);
    }

    public final String q() {
        Object[] objArr = new Object[1];
        HashMap hashMap = this.f6132i;
        objArr[0] = hashMap != null ? hashMap.toString() : "null";
        return String.format("expression: %s", objArr);
    }

    public final ArrayList u(a aVar, Predicate predicate, o oVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f6176d.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (qVar.isEnabled()) {
                return qVar.l(aVar, predicate, oVar);
            }
        }
        return arrayList;
    }

    public final void v(l lVar, Predicate<q> predicate) {
        lVar.b(this);
        Iterator it = this.f6176d.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (qVar.isEnabled()) {
                qVar.m(lVar, predicate);
                return;
            }
        }
    }

    public final void x() {
        f fVar;
        if (this.f6134k) {
            Iterator it = this.f6176d.iterator();
            boolean z8 = false;
            while (it.hasNext()) {
                q qVar = (q) it.next();
                if (z8) {
                    qVar.z(false);
                } else if (qVar.isEnabled()) {
                    z8 = true;
                }
            }
            if (!z8 && (fVar = this.f6133j) != null) {
                fVar.z(true);
            }
            this.f6134k = false;
        }
    }
}
