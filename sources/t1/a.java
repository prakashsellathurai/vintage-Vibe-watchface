package t1;

import java.util.Iterator;
import java.util.Map;
import q7.l;

public final class a extends l implements p7.a<Integer> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f7376f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(0);
        this.f7376f = bVar;
    }

    public final Object invoke() {
        Object obj;
        b bVar = this.f7376f;
        bVar.s();
        Iterator it = bVar.p().getValue().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            boolean z8 = true;
            if (((o1.a) ((Map.Entry) obj).getValue()).f5989b != 1) {
                z8 = false;
                continue;
            }
            if (z8) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (Integer) entry.getKey();
        }
        return null;
    }
}
