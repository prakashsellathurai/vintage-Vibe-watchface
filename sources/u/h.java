package u;

import t.c;
import t.d;
import t.e;
import u.b;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final b.a f7582a = new b.a();

    public static boolean a(d dVar) {
        int[] iArr = dVar.P;
        int i8 = iArr[0];
        int i9 = iArr[1];
        d dVar2 = dVar.Q;
        e eVar = dVar2 != null ? (e) dVar2 : null;
        if (eVar != null) {
            int i10 = eVar.P[0];
        }
        if (eVar != null) {
            int i11 = eVar.P[1];
        }
        boolean z8 = i8 == 1 || i8 == 2 || (i8 == 3 && dVar.f7341m == 0 && dVar.T == 0.0f && dVar.n(0)) || dVar.t();
        boolean z9 = i9 == 1 || i9 == 2 || (i9 == 3 && dVar.f7342n == 0 && dVar.T == 0.0f && dVar.n(1)) || dVar.u();
        if (dVar.T <= 0.0f || (!z8 && !z9)) {
            return z8 && z9;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0096, code lost:
        r14 = r9.f7305f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a0, code lost:
        r7 = r8.f7305f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(t.d r16, u.b.C0126b r17, boolean r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0 instanceof t.e
            if (r3 != 0) goto L_0x001e
            boolean r3 = r16.s()
            if (r3 == 0) goto L_0x001e
            boolean r3 = a(r16)
            if (r3 == 0) goto L_0x001e
            u.b$a r3 = new u.b$a
            r3.<init>()
            t.e.K(r0, r1, r3)
        L_0x001e:
            t.c$a r3 = t.c.a.f7309f
            t.c r3 = r0.g(r3)
            t.c$a r4 = t.c.a.f7311h
            t.c r4 = r0.g(r4)
            int r5 = r3.c()
            int r6 = r4.c()
            java.util.HashSet<t.c> r7 = r3.f7301a
            r9 = 0
            r10 = 0
            r11 = 8
            r12 = 3
            if (r7 == 0) goto L_0x0101
            boolean r3 = r3.f7303c
            if (r3 == 0) goto L_0x0101
            java.util.Iterator r3 = r7.iterator()
        L_0x0043:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0101
            java.lang.Object r7 = r3.next()
            t.c r7 = (t.c) r7
            t.d r13 = r7.f7304d
            boolean r14 = a(r13)
            boolean r15 = r13.s()
            if (r15 == 0) goto L_0x0065
            if (r14 == 0) goto L_0x0065
            u.b$a r15 = new u.b$a
            r15.<init>()
            t.e.K(r13, r1, r15)
        L_0x0065:
            int[] r15 = r13.P
            r15 = r15[r9]
            t.c r8 = r13.E
            t.c r9 = r13.G
            if (r15 != r12) goto L_0x00b7
            if (r14 == 0) goto L_0x0072
            goto L_0x00b7
        L_0x0072:
            if (r15 != r12) goto L_0x00fe
            int r14 = r13.f7345q
            if (r14 < 0) goto L_0x00fe
            int r14 = r13.f7344p
            if (r14 < 0) goto L_0x00fe
            int r14 = r13.f7325d0
            if (r14 == r11) goto L_0x008a
            int r14 = r13.f7341m
            if (r14 != 0) goto L_0x00fe
            float r14 = r13.T
            int r14 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r14 != 0) goto L_0x00fe
        L_0x008a:
            boolean r14 = r13.q()
            if (r14 != 0) goto L_0x00fe
            boolean r14 = r13.B
            if (r14 != 0) goto L_0x00fe
            if (r7 != r8) goto L_0x009e
            t.c r14 = r9.f7305f
            if (r14 == 0) goto L_0x009e
            boolean r14 = r14.f7303c
            if (r14 != 0) goto L_0x00a8
        L_0x009e:
            if (r7 != r9) goto L_0x00aa
            t.c r7 = r8.f7305f
            if (r7 == 0) goto L_0x00aa
            boolean r7 = r7.f7303c
            if (r7 == 0) goto L_0x00aa
        L_0x00a8:
            r7 = 1
            goto L_0x00ab
        L_0x00aa:
            r7 = 0
        L_0x00ab:
            if (r7 == 0) goto L_0x00fe
            boolean r7 = r13.q()
            if (r7 != 0) goto L_0x00fe
            d(r0, r1, r13, r2)
            goto L_0x00fe
        L_0x00b7:
            boolean r14 = r13.s()
            if (r14 == 0) goto L_0x00be
            goto L_0x00fe
        L_0x00be:
            if (r7 != r8) goto L_0x00d2
            t.c r14 = r9.f7305f
            if (r14 != 0) goto L_0x00d2
            int r7 = r8.d()
            int r7 = r7 + r5
            int r8 = r13.k()
            int r8 = r8 + r7
            r13.x(r7, r8)
            goto L_0x00e7
        L_0x00d2:
            if (r7 != r9) goto L_0x00eb
            t.c r14 = r8.f7305f
            if (r14 != 0) goto L_0x00eb
            int r7 = r9.d()
            int r7 = r5 - r7
            int r8 = r13.k()
            int r8 = r7 - r8
            r13.x(r8, r7)
        L_0x00e7:
            b(r13, r1, r2)
            goto L_0x00fe
        L_0x00eb:
            if (r7 != r8) goto L_0x00fe
            t.c r7 = r9.f7305f
            if (r7 == 0) goto L_0x00fe
            boolean r7 = r7.f7303c
            if (r7 == 0) goto L_0x00fe
            boolean r7 = r13.q()
            if (r7 != 0) goto L_0x00fe
            c(r13, r1, r2)
        L_0x00fe:
            r9 = 0
            goto L_0x0043
        L_0x0101:
            boolean r3 = r0 instanceof t.f
            if (r3 == 0) goto L_0x0106
            return
        L_0x0106:
            java.util.HashSet<t.c> r3 = r4.f7301a
            if (r3 == 0) goto L_0x01c9
            boolean r4 = r4.f7303c
            if (r4 == 0) goto L_0x01c9
            java.util.Iterator r3 = r3.iterator()
        L_0x0112:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01c9
            java.lang.Object r4 = r3.next()
            t.c r4 = (t.c) r4
            t.d r5 = r4.f7304d
            boolean r7 = a(r5)
            boolean r8 = r5.s()
            if (r8 == 0) goto L_0x0134
            if (r7 == 0) goto L_0x0134
            u.b$a r8 = new u.b$a
            r8.<init>()
            t.e.K(r5, r1, r8)
        L_0x0134:
            t.c r8 = r5.E
            t.c r9 = r5.G
            if (r4 != r8) goto L_0x0142
            t.c r13 = r9.f7305f
            if (r13 == 0) goto L_0x0142
            boolean r13 = r13.f7303c
            if (r13 != 0) goto L_0x014c
        L_0x0142:
            if (r4 != r9) goto L_0x014e
            t.c r13 = r8.f7305f
            if (r13 == 0) goto L_0x014e
            boolean r13 = r13.f7303c
            if (r13 == 0) goto L_0x014e
        L_0x014c:
            r13 = 1
            goto L_0x014f
        L_0x014e:
            r13 = 0
        L_0x014f:
            int[] r14 = r5.P
            r15 = 0
            r14 = r14[r15]
            if (r14 != r12) goto L_0x0187
            if (r7 == 0) goto L_0x0159
            goto L_0x0187
        L_0x0159:
            if (r14 != r12) goto L_0x0112
            int r4 = r5.f7345q
            if (r4 < 0) goto L_0x0112
            int r4 = r5.f7344p
            if (r4 < 0) goto L_0x0112
            int r4 = r5.f7325d0
            if (r4 == r11) goto L_0x0171
            int r4 = r5.f7341m
            if (r4 != 0) goto L_0x0112
            float r4 = r5.T
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x0112
        L_0x0171:
            boolean r4 = r5.q()
            if (r4 != 0) goto L_0x0112
            boolean r4 = r5.B
            if (r4 != 0) goto L_0x0112
            if (r13 == 0) goto L_0x0112
            boolean r4 = r5.q()
            if (r4 != 0) goto L_0x0112
            d(r0, r1, r5, r2)
            goto L_0x0112
        L_0x0187:
            boolean r7 = r5.s()
            if (r7 == 0) goto L_0x018e
            goto L_0x0112
        L_0x018e:
            if (r4 != r8) goto L_0x01a2
            t.c r7 = r9.f7305f
            if (r7 != 0) goto L_0x01a2
            int r4 = r8.d()
            int r4 = r4 + r6
            int r7 = r5.k()
            int r7 = r7 + r4
            r5.x(r4, r7)
            goto L_0x01b7
        L_0x01a2:
            if (r4 != r9) goto L_0x01bc
            t.c r4 = r8.f7305f
            if (r4 != 0) goto L_0x01bc
            int r4 = r9.d()
            int r4 = r6 - r4
            int r7 = r5.k()
            int r7 = r4 - r7
            r5.x(r7, r4)
        L_0x01b7:
            b(r5, r1, r2)
            goto L_0x0112
        L_0x01bc:
            if (r13 == 0) goto L_0x0112
            boolean r4 = r5.q()
            if (r4 != 0) goto L_0x0112
            c(r5, r1, r2)
            goto L_0x0112
        L_0x01c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.h.b(t.d, u.b$b, boolean):void");
    }

    public static void c(d dVar, b.C0126b bVar, boolean z8) {
        float f9 = dVar.f7319a0;
        c cVar = dVar.E;
        int c9 = cVar.f7305f.c();
        c cVar2 = dVar.G;
        int c10 = cVar2.f7305f.c();
        int d9 = cVar.d() + c9;
        int d10 = c10 - cVar2.d();
        if (c9 == c10) {
            f9 = 0.5f;
        } else {
            c9 = d9;
            c10 = d10;
        }
        int k8 = dVar.k();
        int i8 = (c10 - c9) - k8;
        if (c9 > c10) {
            i8 = (c9 - c10) - k8;
        }
        int i9 = ((int) ((f9 * ((float) i8)) + 0.5f)) + c9;
        int i10 = i9 + k8;
        if (c9 > c10) {
            i10 = i9 - k8;
        }
        dVar.x(i9, i10);
        b(dVar, bVar, z8);
    }

    public static void d(d dVar, b.C0126b bVar, d dVar2, boolean z8) {
        float f9 = dVar2.f7319a0;
        c cVar = dVar2.E;
        int c9 = cVar.f7305f.c() + cVar.d();
        c cVar2 = dVar2.G;
        int c10 = cVar2.f7305f.c() - cVar2.d();
        if (c10 >= c9) {
            int k8 = dVar2.k();
            if (dVar2.f7325d0 != 8) {
                int i8 = dVar2.f7341m;
                if (i8 == 2) {
                    if (!(dVar instanceof e)) {
                        dVar = dVar.Q;
                    }
                    k8 = (int) (dVar2.f7319a0 * 0.5f * ((float) dVar.k()));
                } else if (i8 == 0) {
                    k8 = c10 - c9;
                }
                k8 = Math.max(dVar2.f7344p, k8);
                int i9 = dVar2.f7345q;
                if (i9 > 0) {
                    k8 = Math.min(i9, k8);
                }
            }
            int i10 = c9 + ((int) ((f9 * ((float) ((c10 - c9) - k8))) + 0.5f));
            dVar2.x(i10, k8 + i10);
            b(dVar2, bVar, z8);
        }
    }

    public static void e(d dVar, b.C0126b bVar) {
        float f9 = dVar.f7321b0;
        c cVar = dVar.F;
        int c9 = cVar.f7305f.c();
        c cVar2 = dVar.H;
        int c10 = cVar2.f7305f.c();
        int d9 = cVar.d() + c9;
        int d10 = c10 - cVar2.d();
        if (c9 == c10) {
            f9 = 0.5f;
        } else {
            c9 = d9;
            c10 = d10;
        }
        int i8 = dVar.i();
        int i9 = (c10 - c9) - i8;
        if (c9 > c10) {
            i9 = (c9 - c10) - i8;
        }
        int i10 = (int) ((f9 * ((float) i9)) + 0.5f);
        int i11 = c9 + i10;
        int i12 = i11 + i8;
        if (c9 > c10) {
            i11 = c9 - i10;
            i12 = i11 - i8;
        }
        dVar.y(i11, i12);
        g(dVar, bVar);
    }

    public static void f(d dVar, b.C0126b bVar, d dVar2) {
        float f9 = dVar2.f7321b0;
        c cVar = dVar2.F;
        int c9 = cVar.f7305f.c() + cVar.d();
        c cVar2 = dVar2.H;
        int c10 = cVar2.f7305f.c() - cVar2.d();
        if (c10 >= c9) {
            int i8 = dVar2.i();
            if (dVar2.f7325d0 != 8) {
                int i9 = dVar2.f7342n;
                if (i9 == 2) {
                    if (!(dVar instanceof e)) {
                        dVar = dVar.Q;
                    }
                    i8 = (int) (f9 * 0.5f * ((float) dVar.i()));
                } else if (i9 == 0) {
                    i8 = c10 - c9;
                }
                i8 = Math.max(dVar2.f7346s, i8);
                int i10 = dVar2.f7347t;
                if (i10 > 0) {
                    i8 = Math.min(i10, i8);
                }
            }
            int i11 = c9 + ((int) ((f9 * ((float) ((c10 - c9) - i8))) + 0.5f));
            dVar2.y(i11, i8 + i11);
            g(dVar2, bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0094, code lost:
        r13 = r8.f7305f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
        r6 = r15.f7305f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(t.d r16, u.b.C0126b r17) {
        /*
            r0 = r16
            r1 = r17
            boolean r2 = r0 instanceof t.e
            if (r2 != 0) goto L_0x001c
            boolean r2 = r16.s()
            if (r2 == 0) goto L_0x001c
            boolean r2 = a(r16)
            if (r2 == 0) goto L_0x001c
            u.b$a r2 = new u.b$a
            r2.<init>()
            t.e.K(r0, r1, r2)
        L_0x001c:
            t.c$a r2 = t.c.a.f7310g
            t.c r2 = r0.g(r2)
            t.c$a r3 = t.c.a.f7312i
            t.c r3 = r0.g(r3)
            int r4 = r2.c()
            int r5 = r3.c()
            java.util.HashSet<t.c> r6 = r2.f7301a
            r7 = 1
            r9 = 0
            r10 = 8
            r11 = 3
            if (r6 == 0) goto L_0x00f9
            boolean r2 = r2.f7303c
            if (r2 == 0) goto L_0x00f9
            java.util.Iterator r2 = r6.iterator()
        L_0x0041:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00f9
            java.lang.Object r6 = r2.next()
            t.c r6 = (t.c) r6
            t.d r12 = r6.f7304d
            boolean r13 = a(r12)
            boolean r14 = r12.s()
            if (r14 == 0) goto L_0x0063
            if (r13 == 0) goto L_0x0063
            u.b$a r14 = new u.b$a
            r14.<init>()
            t.e.K(r12, r1, r14)
        L_0x0063:
            int[] r14 = r12.P
            r14 = r14[r7]
            t.c r15 = r12.F
            t.c r8 = r12.H
            if (r14 != r11) goto L_0x00b5
            if (r13 == 0) goto L_0x0070
            goto L_0x00b5
        L_0x0070:
            if (r14 != r11) goto L_0x0041
            int r13 = r12.f7347t
            if (r13 < 0) goto L_0x0041
            int r13 = r12.f7346s
            if (r13 < 0) goto L_0x0041
            int r13 = r12.f7325d0
            if (r13 == r10) goto L_0x0088
            int r13 = r12.f7342n
            if (r13 != 0) goto L_0x0041
            float r13 = r12.T
            int r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x0041
        L_0x0088:
            boolean r13 = r12.r()
            if (r13 != 0) goto L_0x0041
            boolean r13 = r12.B
            if (r13 != 0) goto L_0x0041
            if (r6 != r15) goto L_0x009c
            t.c r13 = r8.f7305f
            if (r13 == 0) goto L_0x009c
            boolean r13 = r13.f7303c
            if (r13 != 0) goto L_0x00a6
        L_0x009c:
            if (r6 != r8) goto L_0x00a8
            t.c r6 = r15.f7305f
            if (r6 == 0) goto L_0x00a8
            boolean r6 = r6.f7303c
            if (r6 == 0) goto L_0x00a8
        L_0x00a6:
            r6 = r7
            goto L_0x00a9
        L_0x00a8:
            r6 = 0
        L_0x00a9:
            if (r6 == 0) goto L_0x0041
            boolean r6 = r12.r()
            if (r6 != 0) goto L_0x0041
            f(r0, r1, r12)
            goto L_0x0041
        L_0x00b5:
            boolean r13 = r12.s()
            if (r13 == 0) goto L_0x00bc
            goto L_0x0041
        L_0x00bc:
            if (r6 != r15) goto L_0x00d0
            t.c r13 = r8.f7305f
            if (r13 != 0) goto L_0x00d0
            int r6 = r15.d()
            int r6 = r6 + r4
            int r8 = r12.i()
            int r8 = r8 + r6
            r12.y(r6, r8)
            goto L_0x00e5
        L_0x00d0:
            if (r6 != r8) goto L_0x00ea
            t.c r13 = r8.f7305f
            if (r13 != 0) goto L_0x00ea
            int r6 = r8.d()
            int r6 = r4 - r6
            int r8 = r12.i()
            int r8 = r6 - r8
            r12.y(r8, r6)
        L_0x00e5:
            g(r12, r1)
            goto L_0x0041
        L_0x00ea:
            if (r6 != r15) goto L_0x0041
            t.c r6 = r8.f7305f
            if (r6 == 0) goto L_0x0041
            boolean r6 = r6.f7303c
            if (r6 == 0) goto L_0x0041
            e(r12, r1)
            goto L_0x0041
        L_0x00f9:
            boolean r2 = r0 instanceof t.f
            if (r2 == 0) goto L_0x00fe
            return
        L_0x00fe:
            java.util.HashSet<t.c> r2 = r3.f7301a
            if (r2 == 0) goto L_0x01c0
            boolean r3 = r3.f7303c
            if (r3 == 0) goto L_0x01c0
            java.util.Iterator r2 = r2.iterator()
        L_0x010a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01c0
            java.lang.Object r3 = r2.next()
            t.c r3 = (t.c) r3
            t.d r4 = r3.f7304d
            boolean r6 = a(r4)
            boolean r8 = r4.s()
            if (r8 == 0) goto L_0x012c
            if (r6 == 0) goto L_0x012c
            u.b$a r8 = new u.b$a
            r8.<init>()
            t.e.K(r4, r1, r8)
        L_0x012c:
            t.c r8 = r4.F
            t.c r12 = r4.H
            if (r3 != r8) goto L_0x013a
            t.c r13 = r12.f7305f
            if (r13 == 0) goto L_0x013a
            boolean r13 = r13.f7303c
            if (r13 != 0) goto L_0x0144
        L_0x013a:
            if (r3 != r12) goto L_0x0146
            t.c r13 = r8.f7305f
            if (r13 == 0) goto L_0x0146
            boolean r13 = r13.f7303c
            if (r13 == 0) goto L_0x0146
        L_0x0144:
            r13 = r7
            goto L_0x0147
        L_0x0146:
            r13 = 0
        L_0x0147:
            int[] r14 = r4.P
            r14 = r14[r7]
            if (r14 != r11) goto L_0x017e
            if (r6 == 0) goto L_0x0150
            goto L_0x017e
        L_0x0150:
            if (r14 != r11) goto L_0x010a
            int r3 = r4.f7347t
            if (r3 < 0) goto L_0x010a
            int r3 = r4.f7346s
            if (r3 < 0) goto L_0x010a
            int r3 = r4.f7325d0
            if (r3 == r10) goto L_0x0168
            int r3 = r4.f7342n
            if (r3 != 0) goto L_0x010a
            float r3 = r4.T
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x010a
        L_0x0168:
            boolean r3 = r4.r()
            if (r3 != 0) goto L_0x010a
            boolean r3 = r4.B
            if (r3 != 0) goto L_0x010a
            if (r13 == 0) goto L_0x010a
            boolean r3 = r4.r()
            if (r3 != 0) goto L_0x010a
            f(r0, r1, r4)
            goto L_0x010a
        L_0x017e:
            boolean r6 = r4.s()
            if (r6 == 0) goto L_0x0185
            goto L_0x010a
        L_0x0185:
            if (r3 != r8) goto L_0x0199
            t.c r6 = r12.f7305f
            if (r6 != 0) goto L_0x0199
            int r3 = r8.d()
            int r3 = r3 + r5
            int r6 = r4.i()
            int r6 = r6 + r3
            r4.y(r3, r6)
            goto L_0x01ae
        L_0x0199:
            if (r3 != r12) goto L_0x01b3
            t.c r3 = r8.f7305f
            if (r3 != 0) goto L_0x01b3
            int r3 = r12.d()
            int r3 = r5 - r3
            int r6 = r4.i()
            int r6 = r3 - r6
            r4.y(r6, r3)
        L_0x01ae:
            g(r4, r1)
            goto L_0x010a
        L_0x01b3:
            if (r13 == 0) goto L_0x010a
            boolean r3 = r4.r()
            if (r3 != 0) goto L_0x010a
            e(r4, r1)
            goto L_0x010a
        L_0x01c0:
            t.c$a r2 = t.c.a.f7313j
            t.c r0 = r0.g(r2)
            java.util.HashSet<t.c> r2 = r0.f7301a
            if (r2 == 0) goto L_0x022e
            boolean r2 = r0.f7303c
            if (r2 == 0) goto L_0x022e
            int r2 = r0.c()
            java.util.HashSet<t.c> r0 = r0.f7301a
            java.util.Iterator r0 = r0.iterator()
        L_0x01d8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x022e
            java.lang.Object r3 = r0.next()
            t.c r3 = (t.c) r3
            t.d r4 = r3.f7304d
            boolean r5 = a(r4)
            boolean r6 = r4.s()
            if (r6 == 0) goto L_0x01fa
            if (r5 == 0) goto L_0x01fa
            u.b$a r6 = new u.b$a
            r6.<init>()
            t.e.K(r4, r1, r6)
        L_0x01fa:
            int[] r6 = r4.P
            r6 = r6[r7]
            if (r6 != r11) goto L_0x0202
            if (r5 == 0) goto L_0x01d8
        L_0x0202:
            boolean r5 = r4.s()
            if (r5 == 0) goto L_0x0209
            goto L_0x01d8
        L_0x0209:
            t.c r5 = r4.I
            if (r3 != r5) goto L_0x01d8
            boolean r3 = r4.f7351z
            if (r3 != 0) goto L_0x0212
            goto L_0x022a
        L_0x0212:
            int r3 = r4.X
            int r3 = r2 - r3
            int r6 = r4.S
            int r6 = r6 + r3
            r4.W = r3
            t.c r8 = r4.F
            r8.i(r3)
            t.c r3 = r4.H
            r3.i(r6)
            r5.i(r2)
            r4.f7335j = r7
        L_0x022a:
            g(r4, r1)
            goto L_0x01d8
        L_0x022e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.h.g(t.d, u.b$b):void");
    }
}
