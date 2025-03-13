package com.google.protobuf;

import com.google.protobuf.f;
import com.google.protobuf.q;
import com.google.protobuf.y;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

public final class s extends r<y.d> {
    public final int a(Map.Entry<?, ?> entry) {
        return ((y.d) entry.getKey()).f3812g;
    }

    public final Object b(q qVar, r0 r0Var, int i8) {
        qVar.getClass();
        return qVar.f3739a.get(new q.a(i8, r0Var));
    }

    public final u<y.d> c(Object obj) {
        return ((y.c) obj).f3810f;
    }

    public final u<y.d> d(Object obj) {
        y.c cVar = (y.c) obj;
        u<y.d> uVar = cVar.f3810f;
        if (uVar.f3778b) {
            cVar.f3810f = uVar.clone();
        }
        return cVar.f3810f;
    }

    public final boolean e(r0 r0Var) {
        return r0Var instanceof y.c;
    }

    public final void f(Object obj) {
        u<y.d> uVar = ((y.c) obj).f3810f;
        if (!uVar.f3778b) {
            uVar.f3777a.g();
            uVar.f3778b = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0145, code lost:
        r4 = java.lang.Long.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0170, code lost:
        if (r4 != 10) goto L_0x017d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <UT, UB> UB g(com.google.protobuf.e1 r4, java.lang.Object r5, com.google.protobuf.q r6, com.google.protobuf.u<com.google.protobuf.y.d> r7, UB r8, com.google.protobuf.m1<UT, UB> r9) {
        /*
            r3 = this;
            com.google.protobuf.y$e r5 = (com.google.protobuf.y.e) r5
            com.google.protobuf.y$d r3 = r5.f3819d
            int r0 = r3.f3812g
            boolean r1 = r3.f3814i
            com.google.protobuf.s1 r2 = r3.f3813h
            if (r1 == 0) goto L_0x00c2
            boolean r1 = r3.f3815j
            if (r1 == 0) goto L_0x00c2
            int r5 = r2.ordinal()
            switch(r5) {
                case 0: goto L_0x00ab;
                case 1: goto L_0x00a1;
                case 2: goto L_0x0097;
                case 3: goto L_0x008d;
                case 4: goto L_0x0083;
                case 5: goto L_0x0079;
                case 6: goto L_0x006f;
                case 7: goto L_0x0065;
                case 8: goto L_0x0017;
                case 9: goto L_0x0017;
                case 10: goto L_0x0017;
                case 11: goto L_0x0017;
                case 12: goto L_0x005b;
                case 13: goto L_0x004a;
                case 14: goto L_0x0040;
                case 15: goto L_0x0036;
                case 16: goto L_0x002c;
                case 17: goto L_0x0022;
                default: goto L_0x0017;
            }
        L_0x0017:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Type cannot be packed: "
            r5.<init>(r6)
            goto L_0x00b5
        L_0x0022:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.i(r5)
            goto L_0x017d
        L_0x002c:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.b(r5)
            goto L_0x017d
        L_0x0036:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.K(r5)
            goto L_0x017d
        L_0x0040:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.g(r5)
            goto L_0x017d
        L_0x004a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.P(r5)
            com.google.protobuf.a0$d<?> r4 = r3.f3811f
            java.lang.Object r4 = com.google.protobuf.g1.z(r0, r5, r4, r8, r9)
            r8 = r4
            goto L_0x017d
        L_0x005b:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.l(r5)
            goto L_0x017d
        L_0x0065:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.n(r5)
            goto L_0x017d
        L_0x006f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.e(r5)
            goto L_0x017d
        L_0x0079:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.N(r5)
            goto L_0x017d
        L_0x0083:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.O(r5)
            goto L_0x017d
        L_0x008d:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.y(r5)
            goto L_0x017d
        L_0x0097:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.J(r5)
            goto L_0x017d
        L_0x00a1:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.C(r5)
            goto L_0x017d
        L_0x00ab:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.I(r5)
            goto L_0x017d
        L_0x00b5:
            com.google.protobuf.s1 r3 = r3.f3813h
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x00c2:
            com.google.protobuf.s1 r1 = com.google.protobuf.s1.ENUM
            if (r2 != r1) goto L_0x00d7
            int r4 = r4.E()
            com.google.protobuf.a0$d<?> r5 = r3.f3811f
            com.google.protobuf.a0$c r5 = r5.findValueByNumber(r4)
            if (r5 != 0) goto L_0x0137
            java.lang.Object r3 = com.google.protobuf.g1.E(r0, r4, r8, r9)
            return r3
        L_0x00d7:
            int r9 = r2.ordinal()
            com.google.protobuf.r0 r5 = r5.f3818c
            switch(r9) {
                case 0: goto L_0x0153;
                case 1: goto L_0x014a;
                case 2: goto L_0x0141;
                case 3: goto L_0x013c;
                case 4: goto L_0x0133;
                case 5: goto L_0x012e;
                case 6: goto L_0x0129;
                case 7: goto L_0x0120;
                case 8: goto L_0x011b;
                case 9: goto L_0x0112;
                case 10: goto L_0x0109;
                case 11: goto L_0x0104;
                case 12: goto L_0x00ff;
                case 13: goto L_0x00f7;
                case 14: goto L_0x00f2;
                case 15: goto L_0x00ed;
                case 16: goto L_0x00e8;
                case 17: goto L_0x00e3;
                default: goto L_0x00e0;
            }
        L_0x00e0:
            r4 = 0
            goto L_0x015b
        L_0x00e3:
            long r4 = r4.k()
            goto L_0x0145
        L_0x00e8:
            int r4 = r4.h()
            goto L_0x0137
        L_0x00ed:
            long r4 = r4.v()
            goto L_0x0145
        L_0x00f2:
            int r4 = r4.G()
            goto L_0x0137
        L_0x00f7:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Shouldn't reach here."
            r3.<init>(r4)
            throw r3
        L_0x00ff:
            int r4 = r4.D()
            goto L_0x0137
        L_0x0104:
            com.google.protobuf.i r4 = r4.B()
            goto L_0x015b
        L_0x0109:
            java.lang.Class r5 = r5.getClass()
            java.lang.Object r4 = r4.m(r5, r6)
            goto L_0x015b
        L_0x0112:
            java.lang.Class r5 = r5.getClass()
            java.lang.Object r4 = r4.q(r5, r6)
            goto L_0x015b
        L_0x011b:
            java.lang.String r4 = r4.o()
            goto L_0x015b
        L_0x0120:
            boolean r4 = r4.r()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x015b
        L_0x0129:
            int r4 = r4.p()
            goto L_0x0137
        L_0x012e:
            long r4 = r4.f()
            goto L_0x0145
        L_0x0133:
            int r4 = r4.E()
        L_0x0137:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x015b
        L_0x013c:
            long r4 = r4.d()
            goto L_0x0145
        L_0x0141:
            long r4 = r4.L()
        L_0x0145:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x015b
        L_0x014a:
            float r4 = r4.readFloat()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L_0x015b
        L_0x0153:
            double r4 = r4.readDouble()
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
        L_0x015b:
            r5 = r4
            boolean r4 = r3.f3814i
            if (r4 == 0) goto L_0x0164
            r7.a(r3, r5)
            goto L_0x0180
        L_0x0164:
            com.google.protobuf.s1 r4 = r3.f3813h
            int r4 = r4.ordinal()
            r6 = 9
            if (r4 == r6) goto L_0x0173
            r6 = 10
            if (r4 == r6) goto L_0x0173
            goto L_0x017d
        L_0x0173:
            java.lang.Object r4 = r7.g(r3)
            if (r4 == 0) goto L_0x017d
            java.lang.Object r5 = com.google.protobuf.a0.c(r4, r5)
        L_0x017d:
            r7.o(r3, r5)
        L_0x0180:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.s.g(com.google.protobuf.e1, java.lang.Object, com.google.protobuf.q, com.google.protobuf.u, java.lang.Object, com.google.protobuf.m1):java.lang.Object");
    }

    public final void h(e1 e1Var, Object obj, q qVar, u<y.d> uVar) {
        y.e eVar = (y.e) obj;
        uVar.o(eVar.f3819d, e1Var.m(eVar.f3818c.getClass(), qVar));
    }

    public final void i(i iVar, Object obj, q qVar, u<y.d> uVar) {
        y.e eVar = (y.e) obj;
        r0 buildPartial = eVar.f3818c.newBuilderForType().buildPartial();
        ByteBuffer wrap = ByteBuffer.wrap(iVar.s());
        if (wrap.hasArray()) {
            f.a aVar = new f.a(wrap);
            b1 b1Var = b1.f3596c;
            b1Var.getClass();
            b1Var.a(buildPartial.getClass()).i(buildPartial, aVar, qVar);
            uVar.o(eVar.f3819d, buildPartial);
            if (aVar.t() != Integer.MAX_VALUE) {
                throw b0.a();
            }
            return;
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    public final void j(m mVar, Map.Entry entry) {
        y.d dVar = (y.d) entry.getKey();
        boolean z8 = dVar.f3814i;
        s1 s1Var = dVar.f3813h;
        int i8 = dVar.f3812g;
        if (z8) {
            int ordinal = s1Var.ordinal();
            boolean z9 = dVar.f3815j;
            switch (ordinal) {
                case 0:
                    g1.H(i8, (List) entry.getValue(), mVar, z9);
                    return;
                case 1:
                    g1.L(i8, (List) entry.getValue(), mVar, z9);
                    return;
                case 2:
                    g1.O(i8, (List) entry.getValue(), mVar, z9);
                    return;
                case 3:
                    g1.W(i8, (List) entry.getValue(), mVar, z9);
                    return;
                case 4:
                case 13:
                    g1.N(i8, (List) entry.getValue(), mVar, z9);
                    return;
                case 5:
                    g1.K(i8, (List) entry.getValue(), mVar, z9);
                    return;
                case 6:
                    g1.J(i8, (List) entry.getValue(), mVar, z9);
                    return;
                case 7:
                    g1.F(i8, (List) entry.getValue(), mVar, z9);
                    return;
                case 8:
                    g1.U(i8, (List) entry.getValue(), mVar);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        g1.M(i8, (List) entry.getValue(), mVar, b1.f3596c.a(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        g1.P(i8, (List) entry.getValue(), mVar, b1.f3596c.a(list2.get(0).getClass()));
                        return;
                    }
                    return;
                case 11:
                    g1.G(i8, (List) entry.getValue(), mVar);
                    return;
                case 12:
                    g1.V(i8, (List) entry.getValue(), mVar, z9);
                    return;
                case 14:
                    g1.Q(i8, (List) entry.getValue(), mVar, z9);
                    return;
                case 15:
                    g1.R(i8, (List) entry.getValue(), mVar, z9);
                    return;
                case 16:
                    g1.S(i8, (List) entry.getValue(), mVar, z9);
                    return;
                case 17:
                    g1.T(i8, (List) entry.getValue(), mVar, z9);
                    return;
                default:
                    return;
            }
        } else {
            switch (s1Var.ordinal()) {
                case 0:
                    mVar.c(i8, ((Double) entry.getValue()).doubleValue());
                    return;
                case 1:
                    mVar.g(i8, ((Float) entry.getValue()).floatValue());
                    return;
                case 2:
                    mVar.j(i8, ((Long) entry.getValue()).longValue());
                    return;
                case 3:
                    mVar.r(i8, ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                case 13:
                    mVar.i(i8, ((Integer) entry.getValue()).intValue());
                    return;
                case 5:
                    mVar.f(i8, ((Long) entry.getValue()).longValue());
                    return;
                case 6:
                    mVar.e(i8, ((Integer) entry.getValue()).intValue());
                    return;
                case 7:
                    mVar.a(i8, ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 8:
                    mVar.f3722a.W(i8, (String) entry.getValue());
                    return;
                case 9:
                    mVar.h(i8, b1.f3596c.a(entry.getValue().getClass()), entry.getValue());
                    return;
                case 10:
                    mVar.k(i8, b1.f3596c.a(entry.getValue().getClass()), entry.getValue());
                    return;
                case 11:
                    mVar.b(i8, (i) entry.getValue());
                    return;
                case 12:
                    mVar.q(i8, ((Integer) entry.getValue()).intValue());
                    return;
                case 14:
                    mVar.m(i8, ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    mVar.n(i8, ((Long) entry.getValue()).longValue());
                    return;
                case 16:
                    mVar.o(i8, ((Integer) entry.getValue()).intValue());
                    return;
                case 17:
                    mVar.p(i8, ((Long) entry.getValue()).longValue());
                    return;
                default:
                    return;
            }
        }
    }
}
