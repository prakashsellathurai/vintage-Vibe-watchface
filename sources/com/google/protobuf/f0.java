package com.google.protobuf;

import com.google.protobuf.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class f0 extends c<String> implements g0, RandomAccess {

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f3634g;

    static {
        new f0(10).f3599f = false;
    }

    public f0(int i8) {
        this((ArrayList<Object>) new ArrayList(i8));
    }

    public f0(ArrayList<Object> arrayList) {
        this.f3634g = arrayList;
    }

    public final void add(int i8, Object obj) {
        i();
        this.f3634g.add(i8, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i8, Collection<? extends String> collection) {
        i();
        if (collection instanceof g0) {
            collection = ((g0) collection).e();
        }
        boolean addAll = this.f3634g.addAll(i8, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final a0.j b(int i8) {
        if (i8 >= size()) {
            ArrayList arrayList = new ArrayList(i8);
            arrayList.addAll(this.f3634g);
            return new f0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final g0 c() {
        return this.f3599f ? new p1(this) : this;
    }

    public final void clear() {
        i();
        this.f3634g.clear();
        this.modCount++;
    }

    public final Object d(int i8) {
        return this.f3634g.get(i8);
    }

    public final List<?> e() {
        return Collections.unmodifiableList(this.f3634g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r4 != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r0.o() != false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(int r6) {
        /*
            r5 = this;
            java.util.ArrayList r5 = r5.f3634g
            java.lang.Object r0 = r5.get(r6)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x000d
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x003a
        L_0x000d:
            boolean r1 = r0 instanceof com.google.protobuf.i
            if (r1 == 0) goto L_0x001e
            com.google.protobuf.i r0 = (com.google.protobuf.i) r0
            java.lang.String r1 = r0.u()
            boolean r0 = r0.o()
            if (r0 == 0) goto L_0x0039
            goto L_0x0036
        L_0x001e:
            byte[] r0 = (byte[]) r0
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = com.google.protobuf.a0.f3590b
            r1.<init>(r0, r2)
            com.google.protobuf.r1$b r2 = com.google.protobuf.r1.f3750a
            int r2 = r0.length
            com.google.protobuf.r1$b r3 = com.google.protobuf.r1.f3750a
            r4 = 0
            int r0 = r3.e(r4, r2, r0)
            if (r0 != 0) goto L_0x0034
            r4 = 1
        L_0x0034:
            if (r4 == 0) goto L_0x0039
        L_0x0036:
            r5.set(r6, r1)
        L_0x0039:
            r0 = r1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f0.get(int):java.lang.Object");
    }

    public final void h(i iVar) {
        i();
        this.f3634g.add(iVar);
        this.modCount++;
    }

    public final Object remove(int i8) {
        i();
        Object remove = this.f3634g.remove(i8);
        this.modCount++;
        return remove instanceof String ? (String) remove : remove instanceof i ? ((i) remove).u() : new String((byte[]) remove, a0.f3590b);
    }

    public final Object set(int i8, Object obj) {
        i();
        Object obj2 = this.f3634g.set(i8, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof i ? ((i) obj2).u() : new String((byte[]) obj2, a0.f3590b);
    }

    public final int size() {
        return this.f3634g.size();
    }
}
