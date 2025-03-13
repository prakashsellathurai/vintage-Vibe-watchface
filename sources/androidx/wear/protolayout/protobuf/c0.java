package androidx.wear.protolayout.protobuf;

import androidx.wear.protolayout.protobuf.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class c0 extends c<String> implements d0, RandomAccess {

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f2062g;

    static {
        new c0(10).f2061f = false;
    }

    public c0(int i8) {
        this((ArrayList<Object>) new ArrayList(i8));
    }

    public c0(ArrayList<Object> arrayList) {
        this.f2062g = arrayList;
    }

    public final void add(int i8, Object obj) {
        i();
        this.f2062g.add(i8, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i8, Collection<? extends String> collection) {
        i();
        if (collection instanceof d0) {
            collection = ((d0) collection).e();
        }
        boolean addAll = this.f2062g.addAll(i8, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final x.c b(int i8) {
        if (i8 >= size()) {
            ArrayList arrayList = new ArrayList(i8);
            arrayList.addAll(this.f2062g);
            return new c0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final d0 c() {
        return this.f2061f ? new k1(this) : this;
    }

    public final void clear() {
        i();
        this.f2062g.clear();
        this.modCount++;
    }

    public final Object d(int i8) {
        return this.f2062g.get(i8);
    }

    public final List<?> e() {
        return Collections.unmodifiableList(this.f2062g);
    }

    public final void g(g gVar) {
        i();
        this.f2062g.add(gVar);
        this.modCount++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r0.l() != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r4 != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(int r6) {
        /*
            r5 = this;
            java.util.ArrayList r5 = r5.f2062g
            java.lang.Object r0 = r5.get(r6)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x000d
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0048
        L_0x000d:
            boolean r1 = r0 instanceof androidx.wear.protolayout.protobuf.g
            if (r1 == 0) goto L_0x002c
            androidx.wear.protolayout.protobuf.g r0 = (androidx.wear.protolayout.protobuf.g) r0
            r0.getClass()
            java.nio.charset.Charset r1 = androidx.wear.protolayout.protobuf.x.f2214a
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0021
            java.lang.String r1 = ""
            goto L_0x0025
        L_0x0021:
            java.lang.String r1 = r0.o(r1)
        L_0x0025:
            boolean r0 = r0.l()
            if (r0 == 0) goto L_0x0047
            goto L_0x0044
        L_0x002c:
            byte[] r0 = (byte[]) r0
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = androidx.wear.protolayout.protobuf.x.f2214a
            r1.<init>(r0, r2)
            androidx.wear.protolayout.protobuf.m1$b r2 = androidx.wear.protolayout.protobuf.m1.f2146a
            int r2 = r0.length
            androidx.wear.protolayout.protobuf.m1$b r3 = androidx.wear.protolayout.protobuf.m1.f2146a
            r4 = 0
            int r0 = r3.c(r4, r2, r0)
            if (r0 != 0) goto L_0x0042
            r4 = 1
        L_0x0042:
            if (r4 == 0) goto L_0x0047
        L_0x0044:
            r5.set(r6, r1)
        L_0x0047:
            r0 = r1
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.c0.get(int):java.lang.Object");
    }

    public final Object remove(int i8) {
        String str;
        i();
        Object remove = this.f2062g.remove(i8);
        this.modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof g) {
            g gVar = (g) remove;
            gVar.getClass();
            str = gVar.size() == 0 ? "" : gVar.o(x.f2214a);
        } else {
            str = new String((byte[]) remove, x.f2214a);
        }
        return str;
    }

    public final Object set(int i8, Object obj) {
        i();
        Object obj2 = this.f2062g.set(i8, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof g)) {
            return new String((byte[]) obj2, x.f2214a);
        }
        g gVar = (g) obj2;
        gVar.getClass();
        return gVar.size() == 0 ? "" : gVar.o(x.f2214a);
    }

    public final int size() {
        return this.f2062g.size();
    }
}
