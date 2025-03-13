package com.google.protobuf;

import com.google.protobuf.d0;
import com.google.protobuf.u;
import java.util.Iterator;
import java.util.Map;

public final class v0<T> implements f1<T> {

    /* renamed from: a  reason: collision with root package name */
    public final r0 f3802a;

    /* renamed from: b  reason: collision with root package name */
    public final m1<?, ?> f3803b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3804c;

    /* renamed from: d  reason: collision with root package name */
    public final r<?> f3805d;

    public v0(m1<?, ?> m1Var, r<?> rVar, r0 r0Var) {
        this.f3803b = m1Var;
        this.f3804c = rVar.e(r0Var);
        this.f3805d = rVar;
        this.f3802a = r0Var;
    }

    public final void a(T t8, T t9) {
        Class<?> cls = g1.f3638a;
        m1<?, ?> m1Var = this.f3803b;
        m1Var.o(t8, m1Var.k(m1Var.g(t8), m1Var.g(t9)));
        if (this.f3804c) {
            g1.C(this.f3805d, t8, t9);
        }
    }

    public final void b(T t8) {
        this.f3803b.j(t8);
        this.f3805d.f(t8);
    }

    public final boolean c(T t8) {
        return this.f3805d.c(t8).k();
    }

    public final boolean d(T t8, T t9) {
        m1<?, ?> m1Var = this.f3803b;
        if (!m1Var.g(t8).equals(m1Var.g(t9))) {
            return false;
        }
        if (!this.f3804c) {
            return true;
        }
        r<?> rVar = this.f3805d;
        return rVar.c(t8).equals(rVar.c(t9));
    }

    public final int e(T t8) {
        i1<T, Object> i1Var;
        m1<?, ?> m1Var = this.f3803b;
        int i8 = 0;
        int i9 = m1Var.i(m1Var.g(t8)) + 0;
        if (!this.f3804c) {
            return i9;
        }
        u<?> c9 = this.f3805d.c(t8);
        int i10 = 0;
        while (true) {
            i1Var = c9.f3777a;
            if (i8 >= i1Var.d()) {
                break;
            }
            i10 += u.h(i1Var.c(i8));
            i8++;
        }
        for (Map.Entry<T, Object> h8 : i1Var.e()) {
            i10 += u.h(h8);
        }
        return i9 + i10;
    }

    public final T f() {
        return this.f3802a.newBuilderForType().buildPartial();
    }

    public final int g(T t8) {
        int hashCode = this.f3803b.g(t8).hashCode();
        return this.f3804c ? (hashCode * 53) + this.f3805d.c(t8).hashCode() : hashCode;
    }

    public final void h(Object obj, m mVar) {
        Iterator<Map.Entry<?, Object>> m8 = this.f3805d.c(obj).m();
        while (m8.hasNext()) {
            Map.Entry next = m8.next();
            u.a aVar = (u.a) next.getKey();
            if (aVar.c() != t1.MESSAGE || aVar.a() || aVar.d()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            mVar.l(aVar.getNumber(), next instanceof d0.a ? ((d0.a) next).f3617f.getValue().b() : next.getValue());
        }
        m1<?, ?> m1Var = this.f3803b;
        m1Var.r(m1Var.g(obj), mVar);
    }

    public final void i(T t8, e1 e1Var, q qVar) {
        m1<?, ?> m1Var = this.f3803b;
        Object f9 = m1Var.f(t8);
        r<?> rVar = this.f3805d;
        u<?> d9 = rVar.d(t8);
        do {
            try {
                if (e1Var.t() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                m1Var.n(t8, f9);
            }
        } while (k(e1Var, qVar, rVar, d9, m1Var, f9));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: com.google.protobuf.y$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d4 A[EDGE_INSN: B:48:0x00d4->B:36:0x00d4 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(T r17, byte[] r18, int r19, int r20, com.google.protobuf.e.a r21) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r20
            r9 = r21
            r1 = r17
            com.google.protobuf.y r1 = (com.google.protobuf.y) r1
            com.google.protobuf.n1 r2 = r1.unknownFields
            com.google.protobuf.n1 r3 = com.google.protobuf.n1.f3726f
            if (r2 != r3) goto L_0x0019
            com.google.protobuf.n1 r2 = new com.google.protobuf.n1
            r2.<init>()
            r1.unknownFields = r2
        L_0x0019:
            r10 = r2
            r1 = r17
            com.google.protobuf.y$c r1 = (com.google.protobuf.y.c) r1
            com.google.protobuf.u<com.google.protobuf.y$d> r2 = r1.f3810f
            boolean r3 = r2.f3778b
            if (r3 == 0) goto L_0x002a
            com.google.protobuf.u r2 = r2.clone()
            r1.f3810f = r2
        L_0x002a:
            com.google.protobuf.u<com.google.protobuf.y$d> r11 = r1.f3810f
            r1 = r19
            r2 = 0
        L_0x002f:
            if (r1 >= r8) goto L_0x00e2
            int r3 = com.google.protobuf.e.I(r7, r1, r9)
            int r1 = r9.f3623a
            r4 = 2
            r5 = 11
            com.google.protobuf.r0 r6 = r0.f3802a
            com.google.protobuf.r<?> r13 = r0.f3805d
            com.google.protobuf.q r14 = r9.f3626d
            if (r1 == r5) goto L_0x007b
            r5 = r1 & 7
            if (r5 != r4) goto L_0x0076
            int r2 = r1 >>> 3
            java.lang.Object r2 = r13.b(r14, r6, r2)
            r13 = r2
            com.google.protobuf.y$e r13 = (com.google.protobuf.y.e) r13
            if (r13 == 0) goto L_0x0069
            com.google.protobuf.b1 r1 = com.google.protobuf.b1.f3596c
            com.google.protobuf.r0 r2 = r13.f3818c
            java.lang.Class r2 = r2.getClass()
            com.google.protobuf.f1 r1 = r1.a(r2)
            int r1 = com.google.protobuf.e.p(r1, r7, r3, r8, r9)
            com.google.protobuf.y$d r2 = r13.f3819d
            java.lang.Object r3 = r9.f3625c
            r11.o(r2, r3)
            goto L_0x0074
        L_0x0069:
            r2 = r18
            r4 = r20
            r5 = r10
            r6 = r21
            int r1 = com.google.protobuf.e.G(r1, r2, r3, r4, r5, r6)
        L_0x0074:
            r2 = r13
            goto L_0x002f
        L_0x0076:
            int r1 = com.google.protobuf.e.M(r1, r7, r3, r8, r9)
            goto L_0x002f
        L_0x007b:
            r1 = 0
            r5 = 0
        L_0x007d:
            if (r3 >= r8) goto L_0x00d4
            int r3 = com.google.protobuf.e.I(r7, r3, r9)
            int r15 = r9.f3623a
            int r12 = r15 >>> 3
            r0 = r15 & 7
            if (r12 == r4) goto L_0x00b6
            r4 = 3
            if (r12 == r4) goto L_0x008f
            goto L_0x00c6
        L_0x008f:
            if (r2 == 0) goto L_0x00a9
            com.google.protobuf.b1 r0 = com.google.protobuf.b1.f3596c
            com.google.protobuf.r0 r4 = r2.f3818c
            java.lang.Class r4 = r4.getClass()
            com.google.protobuf.f1 r0 = r0.a(r4)
            int r0 = com.google.protobuf.e.p(r0, r7, r3, r8, r9)
            com.google.protobuf.y$d r3 = r2.f3819d
            java.lang.Object r4 = r9.f3625c
            r11.o(r3, r4)
            goto L_0x00c4
        L_0x00a9:
            r4 = 2
            if (r0 != r4) goto L_0x00c6
            int r0 = com.google.protobuf.e.b(r7, r3, r9)
            java.lang.Object r3 = r9.f3625c
            r5 = r3
            com.google.protobuf.i r5 = (com.google.protobuf.i) r5
            goto L_0x00c4
        L_0x00b6:
            if (r0 != 0) goto L_0x00c6
            int r0 = com.google.protobuf.e.I(r7, r3, r9)
            int r1 = r9.f3623a
            java.lang.Object r2 = r13.b(r14, r6, r1)
            com.google.protobuf.y$e r2 = (com.google.protobuf.y.e) r2
        L_0x00c4:
            r3 = r0
            goto L_0x00d0
        L_0x00c6:
            r0 = 12
            if (r15 != r0) goto L_0x00cb
            goto L_0x00d4
        L_0x00cb:
            int r0 = com.google.protobuf.e.M(r15, r7, r3, r8, r9)
            goto L_0x00c4
        L_0x00d0:
            r4 = 2
            r0 = r16
            goto L_0x007d
        L_0x00d4:
            if (r5 == 0) goto L_0x00dd
            int r0 = r1 << 3
            r1 = 2
            r0 = r0 | r1
            r10.d(r0, r5)
        L_0x00dd:
            r0 = r16
            r1 = r3
            goto L_0x002f
        L_0x00e2:
            if (r1 != r8) goto L_0x00e5
            return
        L_0x00e5:
            com.google.protobuf.b0 r0 = com.google.protobuf.b0.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v0.j(java.lang.Object, byte[], int, int, com.google.protobuf.e$a):void");
    }

    public final <UT, UB, ET extends u.a<ET>> boolean k(e1 e1Var, q qVar, r<ET> rVar, u<ET> uVar, m1<UT, UB> m1Var, UB ub) {
        int a9 = e1Var.a();
        r0 r0Var = this.f3802a;
        if (a9 == 11) {
            Object obj = null;
            int i8 = 0;
            i iVar = null;
            while (e1Var.t() != Integer.MAX_VALUE) {
                int a10 = e1Var.a();
                if (a10 == 16) {
                    i8 = e1Var.D();
                    obj = rVar.b(qVar, r0Var, i8);
                } else if (a10 == 26) {
                    if (obj != null) {
                        rVar.h(e1Var, obj, qVar, uVar);
                    } else {
                        iVar = e1Var.B();
                    }
                } else if (!e1Var.F()) {
                    break;
                }
            }
            if (e1Var.a() == 12) {
                if (iVar != null) {
                    if (obj != null) {
                        rVar.i(iVar, obj, qVar, uVar);
                    } else {
                        m1Var.d(ub, i8, iVar);
                    }
                }
                return true;
            }
            throw b0.a();
        } else if ((a9 & 7) != 2) {
            return e1Var.F();
        } else {
            Object b9 = rVar.b(qVar, r0Var, a9 >>> 3);
            if (b9 == null) {
                return m1Var.l(ub, e1Var);
            }
            rVar.h(e1Var, b9, qVar, uVar);
            return true;
        }
    }
}
