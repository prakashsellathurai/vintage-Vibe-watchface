package u1;

import i7.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import q7.k;
import q7.l;
import u1.m;

public final class d implements Iterable<Map.Entry<? extends m, ? extends m.h>> {

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<m, m.h> f7611f;

    public static final class a extends l implements p7.l<Map.Entry<m, m.h>, CharSequence> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f7612f = new a();

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            k.e(entry, "it");
            return ((m) entry.getKey()).f7641a + " -> " + entry.getValue();
        }
    }

    public d(e eVar) {
        HashMap<m, m.h> hashMap = new HashMap<>();
        for (Map.Entry next : eVar.entrySet()) {
            hashMap.put((m) next.getKey(), (m.h) next.getValue());
        }
        this.f7611f = hashMap;
    }

    public final void i(m mVar, m.h hVar) {
        k.e(mVar, "setting");
        k.e(hVar, "option");
        HashMap<m, m.h> hashMap = this.f7611f;
        if (!hashMap.containsKey(mVar)) {
            throw new IllegalArgumentException(("Unknown setting " + mVar).toString());
        } else if (k.a(hVar.d(), mVar.getClass())) {
            hashMap.put(mVar, hVar);
        } else {
            throw new IllegalArgumentException(("The option class (" + hVar.getClass().getCanonicalName() + ") must match the setting class " + mVar.getClass().getCanonicalName()).toString());
        }
    }

    public final Iterator<Map.Entry<m, m.h>> iterator() {
        return this.f7611f.entrySet().iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableUserStyle[");
        Set<Map.Entry<m, m.h>> entrySet = this.f7611f.entrySet();
        k.d(entrySet, "selectedOptions.entries");
        sb.append(i.W(entrySet, (String) null, a.f7612f, 31));
        sb.append(']');
        return sb.toString();
    }
}
