package com.google.protobuf;

import com.google.protobuf.a0;
import java.util.Collections;
import java.util.List;

public abstract class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f3645a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f3646b = new b();

    public static final class a extends h0 {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?> f3647c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.protobuf.f0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.protobuf.f0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.protobuf.f0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List d(int r3, long r4, java.lang.Object r6) {
            /*
                java.lang.Object r0 = com.google.protobuf.q1.p(r4, r6)
                java.util.List r0 = (java.util.List) r0
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002c
                boolean r1 = r0 instanceof com.google.protobuf.g0
                if (r1 == 0) goto L_0x0016
                com.google.protobuf.f0 r0 = new com.google.protobuf.f0
                r0.<init>((int) r3)
                goto L_0x005b
            L_0x0016:
                boolean r1 = r0 instanceof com.google.protobuf.a1
                if (r1 == 0) goto L_0x0026
                boolean r1 = r0 instanceof com.google.protobuf.a0.j
                if (r1 == 0) goto L_0x0026
                com.google.protobuf.a0$j r0 = (com.google.protobuf.a0.j) r0
                com.google.protobuf.a0$j r3 = r0.b(r3)
            L_0x0024:
                r0 = r3
                goto L_0x005b
            L_0x0026:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r3)
                goto L_0x005b
            L_0x002c:
                java.lang.Class r1 = r0.getClass()
                java.lang.Class<?> r2 = f3647c
                boolean r1 = r2.isAssignableFrom(r1)
                if (r1 == 0) goto L_0x0047
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r3
                r1.<init>(r2)
                r1.addAll(r0)
            L_0x0045:
                r0 = r1
                goto L_0x005b
            L_0x0047:
                boolean r1 = r0 instanceof com.google.protobuf.p1
                if (r1 == 0) goto L_0x005f
                com.google.protobuf.f0 r1 = new com.google.protobuf.f0
                int r2 = r0.size()
                int r2 = r2 + r3
                r1.<init>((int) r2)
                com.google.protobuf.p1 r0 = (com.google.protobuf.p1) r0
                r1.addAll(r0)
                goto L_0x0045
            L_0x005b:
                com.google.protobuf.q1.z(r4, r6, r0)
                goto L_0x007a
            L_0x005f:
                boolean r1 = r0 instanceof com.google.protobuf.a1
                if (r1 == 0) goto L_0x007a
                boolean r1 = r0 instanceof com.google.protobuf.a0.j
                if (r1 == 0) goto L_0x007a
                r1 = r0
                com.google.protobuf.a0$j r1 = (com.google.protobuf.a0.j) r1
                boolean r2 = r1.f()
                if (r2 != 0) goto L_0x007a
                int r0 = r0.size()
                int r0 = r0 + r3
                com.google.protobuf.a0$j r3 = r1.b(r0)
                goto L_0x0024
            L_0x007a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.h0.a.d(int, long, java.lang.Object):java.util.List");
        }

        public final void a(long j8, Object obj) {
            Object obj2;
            List list = (List) q1.p(j8, obj);
            if (list instanceof g0) {
                obj2 = ((g0) list).c();
            } else {
                if (!f3647c.isAssignableFrom(list.getClass())) {
                    if (!(list instanceof a1) || !(list instanceof a0.j)) {
                        obj2 = Collections.unmodifiableList(list);
                    } else {
                        a0.j jVar = (a0.j) list;
                        if (jVar.f()) {
                            jVar.a();
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            q1.z(j8, obj, obj2);
        }

        public final void b(long j8, Object obj, Object obj2) {
            List list = (List) q1.p(j8, obj2);
            List d9 = d(list.size(), j8, obj);
            int size = d9.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d9.addAll(list);
            }
            if (size > 0) {
                list = d9;
            }
            q1.z(j8, obj, list);
        }

        public final List c(long j8, Object obj) {
            return d(10, j8, obj);
        }
    }

    public static final class b extends h0 {
        public final void a(long j8, Object obj) {
            ((a0.j) q1.p(j8, obj)).a();
        }

        public final void b(long j8, Object obj, Object obj2) {
            a0.j jVar = (a0.j) q1.p(j8, obj);
            a0.j jVar2 = (a0.j) q1.p(j8, obj2);
            int size = jVar.size();
            int size2 = jVar2.size();
            if (size > 0 && size2 > 0) {
                if (!jVar.f()) {
                    jVar = jVar.b(size2 + size);
                }
                jVar.addAll(jVar2);
            }
            if (size > 0) {
                jVar2 = jVar;
            }
            q1.z(j8, obj, jVar2);
        }

        public final List c(long j8, Object obj) {
            a0.j jVar = (a0.j) q1.p(j8, obj);
            if (jVar.f()) {
                return jVar;
            }
            int size = jVar.size();
            a0.j b9 = jVar.b(size == 0 ? 10 : size * 2);
            q1.z(j8, obj, b9);
            return b9;
        }
    }

    public abstract void a(long j8, Object obj);

    public abstract void b(long j8, Object obj, Object obj2);

    public abstract List c(long j8, Object obj);
}
