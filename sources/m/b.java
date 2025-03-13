package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: f  reason: collision with root package name */
    public c<K, V> f5339f;

    /* renamed from: g  reason: collision with root package name */
    public c<K, V> f5340g;

    /* renamed from: h  reason: collision with root package name */
    public final WeakHashMap<f<K, V>, Boolean> f5341h = new WeakHashMap<>();

    /* renamed from: i  reason: collision with root package name */
    public int f5342i = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f5346i;
        }

        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f5345h;
        }
    }

    /* renamed from: m.b$b  reason: collision with other inner class name */
    public static class C0078b<K, V> extends e<K, V> {
        public C0078b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f5345h;
        }

        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f5346i;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: f  reason: collision with root package name */
        public final K f5343f;

        /* renamed from: g  reason: collision with root package name */
        public final V f5344g;

        /* renamed from: h  reason: collision with root package name */
        public c<K, V> f5345h;

        /* renamed from: i  reason: collision with root package name */
        public c<K, V> f5346i;

        public c(K k8, V v8) {
            this.f5343f = k8;
            this.f5344g = v8;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f5343f.equals(cVar.f5343f) && this.f5344g.equals(cVar.f5344g);
        }

        public final K getKey() {
            return this.f5343f;
        }

        public final V getValue() {
            return this.f5344g;
        }

        public final int hashCode() {
            return this.f5344g.hashCode() ^ this.f5343f.hashCode();
        }

        public final V setValue(V v8) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f5343f + "=" + this.f5344g;
        }
    }

    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: f  reason: collision with root package name */
        public c<K, V> f5347f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5348g = true;

        public d() {
        }

        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f5347f;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f5346i;
                this.f5347f = cVar3;
                this.f5348g = cVar3 == null;
            }
        }

        public final boolean hasNext() {
            if (this.f5348g) {
                return b.this.f5339f != null;
            }
            c<K, V> cVar = this.f5347f;
            return (cVar == null || cVar.f5345h == null) ? false : true;
        }

        public final Object next() {
            c<K, V> cVar;
            if (this.f5348g) {
                this.f5348g = false;
                cVar = b.this.f5339f;
            } else {
                c<K, V> cVar2 = this.f5347f;
                cVar = cVar2 != null ? cVar2.f5345h : null;
            }
            this.f5347f = cVar;
            return cVar;
        }
    }

    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: f  reason: collision with root package name */
        public c<K, V> f5350f;

        /* renamed from: g  reason: collision with root package name */
        public c<K, V> f5351g;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f5350f = cVar2;
            this.f5351g = cVar;
        }

        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f5350f == cVar && cVar == this.f5351g) {
                this.f5351g = null;
                this.f5350f = null;
            }
            c<K, V> cVar3 = this.f5350f;
            if (cVar3 == cVar) {
                this.f5350f = b(cVar3);
            }
            c<K, V> cVar4 = this.f5351g;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f5350f;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = c(cVar4);
                }
                this.f5351g = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        public final boolean hasNext() {
            return this.f5351g != null;
        }

        public final Object next() {
            c<K, V> cVar = this.f5351g;
            c<K, V> cVar2 = this.f5350f;
            this.f5351g = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    public static abstract class f<K, V> {
        public abstract void a(c<K, V> cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r1.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((m.b.e) r6).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof m.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            m.b r6 = (m.b) r6
            int r1 = r5.f5342i
            int r3 = r6.f5342i
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L_0x001b:
            r1 = r5
            m.b$e r1 = (m.b.e) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0044
            r3 = r6
            m.b$e r3 = (m.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L_0x003b
            if (r3 != 0) goto L_0x0043
        L_0x003b:
            if (r1 == 0) goto L_0x001b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L_0x0053
            m.b$e r6 = (m.b.e) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i8 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i8;
            }
            i8 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    public c<K, V> i(K k8) {
        c<K, V> cVar = this.f5339f;
        while (cVar != null && !cVar.f5343f.equals(k8)) {
            cVar = cVar.f5345h;
        }
        return cVar;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f5339f, this.f5340g);
        this.f5341h.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V j(K k8) {
        c i8 = i(k8);
        if (i8 == null) {
            return null;
        }
        this.f5342i--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.f5341h;
        if (!weakHashMap.isEmpty()) {
            for (f<K, V> a9 : weakHashMap.keySet()) {
                a9.a(i8);
            }
        }
        c<K, V> cVar = i8.f5346i;
        c<K, V> cVar2 = i8.f5345h;
        if (cVar != null) {
            cVar.f5345h = cVar2;
        } else {
            this.f5339f = cVar2;
        }
        c<K, V> cVar3 = i8.f5345h;
        if (cVar3 != null) {
            cVar3.f5346i = cVar;
        } else {
            this.f5340g = cVar;
        }
        i8.f5345h = null;
        i8.f5346i = null;
        return i8.f5344g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                sb.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
