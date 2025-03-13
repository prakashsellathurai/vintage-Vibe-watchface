package u1;

import a1.a;
import a8.g;
import java.util.Iterator;
import java.util.Map;
import q7.k;
import u1.m;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final l f7605a;

    /* renamed from: b  reason: collision with root package name */
    public final g f7606b;

    public b(l lVar) {
        k.e(lVar, "schema");
        this.f7605a = lVar;
        this.f7606b = a.c(lVar.c());
    }

    public final void a(e eVar) {
        T t8;
        k.e(eVar, "newUserStyle");
        for (Map.Entry next : eVar.entrySet()) {
            m mVar = (m) next.getKey();
            m.h hVar = (m.h) next.getValue();
            Iterator<T> it = this.f7605a.f7637a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t8 = null;
                    break;
                }
                t8 = it.next();
                if (k.a((m) t8, mVar)) {
                    break;
                }
            }
            m mVar2 = (m) t8;
            if (!(mVar2 != null)) {
                throw new IllegalArgumentException(("UserStyleSetting " + mVar + " is not a reference to a UserStyleSetting within the schema.").toString());
            } else if (!k.a(mVar2.getClass(), hVar.d())) {
                throw new IllegalArgumentException(("The option class (" + hVar.getClass().getCanonicalName() + ") in " + mVar + " must match the setting class " + mVar2.getClass().getCanonicalName()).toString());
            }
        }
        this.f7606b.setValue(eVar);
    }
}
