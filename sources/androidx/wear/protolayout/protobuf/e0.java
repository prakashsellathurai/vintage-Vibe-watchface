package androidx.wear.protolayout.protobuf;

import androidx.wear.protolayout.protobuf.x;
import java.util.Collections;
import java.util.List;

public abstract class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2071a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f2072b = new b();

    public static final class a extends e0 {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?> f2073c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.wear.protolayout.protobuf.c0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: androidx.wear.protolayout.protobuf.c0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: androidx.wear.protolayout.protobuf.c0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List d(int r3, long r4, java.lang.Object r6) {
            /*
                java.lang.Object r0 = androidx.wear.protolayout.protobuf.l1.o(r4, r6)
                java.util.List r0 = (java.util.List) r0
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002c
                boolean r1 = r0 instanceof androidx.wear.protolayout.protobuf.d0
                if (r1 == 0) goto L_0x0016
                androidx.wear.protolayout.protobuf.c0 r0 = new androidx.wear.protolayout.protobuf.c0
                r0.<init>((int) r3)
                goto L_0x005b
            L_0x0016:
                boolean r1 = r0 instanceof androidx.wear.protolayout.protobuf.x0
                if (r1 == 0) goto L_0x0026
                boolean r1 = r0 instanceof androidx.wear.protolayout.protobuf.x.c
                if (r1 == 0) goto L_0x0026
                androidx.wear.protolayout.protobuf.x$c r0 = (androidx.wear.protolayout.protobuf.x.c) r0
                androidx.wear.protolayout.protobuf.x$c r3 = r0.b(r3)
            L_0x0024:
                r0 = r3
                goto L_0x005b
            L_0x0026:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r3)
                goto L_0x005b
            L_0x002c:
                java.lang.Class r1 = r0.getClass()
                java.lang.Class<?> r2 = f2073c
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
                boolean r1 = r0 instanceof androidx.wear.protolayout.protobuf.k1
                if (r1 == 0) goto L_0x005f
                androidx.wear.protolayout.protobuf.c0 r1 = new androidx.wear.protolayout.protobuf.c0
                int r2 = r0.size()
                int r2 = r2 + r3
                r1.<init>((int) r2)
                androidx.wear.protolayout.protobuf.k1 r0 = (androidx.wear.protolayout.protobuf.k1) r0
                r1.addAll(r0)
                goto L_0x0045
            L_0x005b:
                androidx.wear.protolayout.protobuf.l1.v(r4, r6, r0)
                goto L_0x007a
            L_0x005f:
                boolean r1 = r0 instanceof androidx.wear.protolayout.protobuf.x0
                if (r1 == 0) goto L_0x007a
                boolean r1 = r0 instanceof androidx.wear.protolayout.protobuf.x.c
                if (r1 == 0) goto L_0x007a
                r1 = r0
                androidx.wear.protolayout.protobuf.x$c r1 = (androidx.wear.protolayout.protobuf.x.c) r1
                boolean r2 = r1.f()
                if (r2 != 0) goto L_0x007a
                int r0 = r0.size()
                int r0 = r0 + r3
                androidx.wear.protolayout.protobuf.x$c r3 = r1.b(r0)
                goto L_0x0024
            L_0x007a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.e0.a.d(int, long, java.lang.Object):java.util.List");
        }

        public final void a(long j8, Object obj) {
            Object obj2;
            List list = (List) l1.o(j8, obj);
            if (list instanceof d0) {
                obj2 = ((d0) list).c();
            } else {
                if (!f2073c.isAssignableFrom(list.getClass())) {
                    if (!(list instanceof x0) || !(list instanceof x.c)) {
                        obj2 = Collections.unmodifiableList(list);
                    } else {
                        x.c cVar = (x.c) list;
                        if (cVar.f()) {
                            cVar.a();
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            l1.v(j8, obj, obj2);
        }

        public final void b(long j8, Object obj, Object obj2) {
            List list = (List) l1.o(j8, obj2);
            List d9 = d(list.size(), j8, obj);
            int size = d9.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d9.addAll(list);
            }
            if (size > 0) {
                list = d9;
            }
            l1.v(j8, obj, list);
        }

        public final List c(long j8, Object obj) {
            return d(10, j8, obj);
        }
    }

    public static final class b extends e0 {
        public final void a(long j8, Object obj) {
            ((x.c) l1.o(j8, obj)).a();
        }

        public final void b(long j8, Object obj, Object obj2) {
            x.c cVar = (x.c) l1.o(j8, obj);
            x.c cVar2 = (x.c) l1.o(j8, obj2);
            int size = cVar.size();
            int size2 = cVar2.size();
            if (size > 0 && size2 > 0) {
                if (!cVar.f()) {
                    cVar = cVar.b(size2 + size);
                }
                cVar.addAll(cVar2);
            }
            if (size > 0) {
                cVar2 = cVar;
            }
            l1.v(j8, obj, cVar2);
        }

        public final List c(long j8, Object obj) {
            x.c cVar = (x.c) l1.o(j8, obj);
            if (cVar.f()) {
                return cVar;
            }
            int size = cVar.size();
            x.c b9 = cVar.b(size == 0 ? 10 : size * 2);
            l1.v(j8, obj, b9);
            return b9;
        }
    }

    public abstract void a(long j8, Object obj);

    public abstract void b(long j8, Object obj, Object obj2);

    public abstract List c(long j8, Object obj);
}
