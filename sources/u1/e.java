package u1;

import i7.f;
import i7.i;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import q7.k;
import q7.l;
import u1.m;

public final class e implements Map<m, m.h> {

    /* renamed from: f  reason: collision with root package name */
    public final Map<m, m.h> f7613f;

    /* renamed from: g  reason: collision with root package name */
    public final Map f7614g;

    public static final class a extends l implements p7.l<Map.Entry<? extends m, ? extends m.h>, CharSequence> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f7615f = new a();

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            k.e(entry, "it");
            return ((m) entry.getKey()).f7641a + " -> " + entry.getValue();
        }
    }

    public e() {
        throw null;
    }

    public e(HashMap hashMap) {
        k.e(hashMap, "selectedOptions");
        this.f7613f = new HashMap(hashMap);
        this.f7614g = hashMap;
    }

    public final LinkedHashMap a() {
        Set<Map.Entry<m, m.h>> entrySet = this.f7613f.entrySet();
        int C = a1.a.C(f.M(entrySet));
        if (C < 16) {
            C = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(((m) entry.getKey()).f7641a.f7683a, ((m.h) entry.getValue()).f7694a.f7696a);
        }
        return linkedHashMap;
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        k.e(mVar, "key");
        return this.f7613f.containsKey(mVar);
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof m.h)) {
            return false;
        }
        m.h hVar = (m.h) obj;
        k.e(hVar, "value");
        return this.f7613f.containsValue(hVar);
    }

    public final Set<Map.Entry<m, m.h>> entrySet() {
        return this.f7613f.entrySet();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.a(e.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.c(obj, "null cannot be cast to non-null type androidx.wear.watchface.style.UserStyle");
        return k.a(this.f7613f, ((e) obj).f7613f);
    }

    public final Object get(Object obj) {
        if (!(obj instanceof m)) {
            return null;
        }
        m mVar = (m) obj;
        k.e(mVar, "key");
        return this.f7613f.get(mVar);
    }

    public final int hashCode() {
        return this.f7613f.hashCode();
    }

    public final boolean isEmpty() {
        return this.f7613f.isEmpty();
    }

    public final Set<m> keySet() {
        return this.f7613f.keySet();
    }

    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map<? extends m, ? extends m.h> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void replaceAll(BiFunction<? super m, ? super m.h, ? extends m.h> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f7614g.size();
    }

    public final String toString() {
        return "UserStyle[" + i.W(this.f7613f.entrySet(), (String) null, a.f7615f, 31) + ']';
    }

    public final Collection<m.h> values() {
        return this.f7613f.values();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(u1.f r5, u1.l r6) {
        /*
            r4 = this;
            java.lang.String r0 = "userStyle"
            q7.k.e(r5, r0)
            java.lang.String r0 = "styleSchema"
            q7.k.e(r6, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.List<u1.m> r6 = r6.f7637a
            java.util.Iterator r6 = r6.iterator()
        L_0x0015:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r6.next()
            u1.m r1 = (u1.m) r1
            u1.m$e r2 = r1.f7641a
            java.lang.String r2 = r2.f7683a
            java.util.Map<java.lang.String, byte[]> r3 = r5.f7616a
            java.lang.Object r2 = r3.get(r2)
            byte[] r2 = (byte[]) r2
            if (r2 == 0) goto L_0x0039
            u1.m$h$a r3 = new u1.m$h$a
            r3.<init>((byte[]) r2)
            u1.m$h r2 = r1.d(r3)
            goto L_0x0043
        L_0x0039:
            java.util.List<u1.m$h> r2 = r1.f7645f
            int r3 = r1.f7646g
            java.lang.Object r2 = r2.get(r3)
            u1.m$h r2 = (u1.m.h) r2
        L_0x0043:
            r0.put(r1, r2)
            goto L_0x0015
        L_0x0047:
            r4.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.e.<init>(u1.f, u1.l):void");
    }
}
