package u;

import t.d;

public final class l extends p {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f7583k = new int[2];

    public l(d dVar) {
        super(dVar);
        this.f7599h.e = 4;
        this.f7600i.e = 5;
        this.f7597f = 0;
    }

    public static void m(int[] iArr, int i8, int i9, int i10, int i11, float f9, int i12) {
        int i13 = i9 - i8;
        int i14 = i11 - i10;
        if (i12 == -1) {
            int i15 = (int) ((((float) i14) * f9) + 0.5f);
            int i16 = (int) ((((float) i13) / f9) + 0.5f);
            if (i15 <= i13) {
                iArr[0] = i15;
                iArr[1] = i14;
            } else if (i16 <= i14) {
                iArr[0] = i13;
                iArr[1] = i16;
            }
        } else if (i12 == 0) {
            iArr[0] = (int) ((((float) i14) * f9) + 0.5f);
            iArr[1] = i14;
        } else if (i12 == 1) {
            iArr[0] = i13;
            iArr[1] = (int) ((((float) i13) * f9) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x022a, code lost:
        if (r3 != 1) goto L_0x0277;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(u.d r24) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.f7601j
            int r1 = s.g.b(r1)
            r2 = 0
            r3 = 3
            if (r1 == r3) goto L_0x034d
            u.g r1 = r0.e
            boolean r4 = r1.f7578j
            u.f r5 = r0.f7599h
            u.f r6 = r0.f7600i
            r7 = 1056964608(0x3f000000, float:0.5)
            r8 = 1
            if (r4 != 0) goto L_0x0277
            int r4 = r0.f7596d
            if (r4 != r3) goto L_0x0277
            t.d r4 = r0.f7594b
            int r9 = r4.f7341m
            r10 = 2
            if (r9 == r10) goto L_0x0260
            if (r9 == r3) goto L_0x0028
            goto L_0x0277
        L_0x0028:
            int r9 = r4.f7342n
            r10 = -1
            if (r9 == 0) goto L_0x0056
            if (r9 != r3) goto L_0x0030
            goto L_0x0056
        L_0x0030:
            int r9 = r4.U
            if (r9 == r10) goto L_0x0045
            if (r9 == 0) goto L_0x003a
            if (r9 == r8) goto L_0x0045
            r4 = r2
            goto L_0x0051
        L_0x003a:
            u.n r9 = r4.e
            u.g r9 = r9.e
            int r9 = r9.f7575g
            float r9 = (float) r9
            float r4 = r4.T
            float r9 = r9 / r4
            goto L_0x004f
        L_0x0045:
            u.n r9 = r4.e
            u.g r9 = r9.e
            int r9 = r9.f7575g
            float r9 = (float) r9
            float r4 = r4.T
            float r9 = r9 * r4
        L_0x004f:
            float r9 = r9 + r7
            int r4 = (int) r9
        L_0x0051:
            r1.d(r4)
            goto L_0x0277
        L_0x0056:
            u.n r9 = r4.e
            u.f r11 = r9.f7599h
            u.f r9 = r9.f7600i
            t.c r12 = r4.E
            t.c r12 = r12.f7305f
            if (r12 == 0) goto L_0x0064
            r12 = r8
            goto L_0x0065
        L_0x0064:
            r12 = r2
        L_0x0065:
            t.c r13 = r4.F
            t.c r13 = r13.f7305f
            if (r13 == 0) goto L_0x006d
            r13 = r8
            goto L_0x006e
        L_0x006d:
            r13 = r2
        L_0x006e:
            t.c r14 = r4.G
            t.c r14 = r14.f7305f
            if (r14 == 0) goto L_0x0076
            r14 = r8
            goto L_0x0077
        L_0x0076:
            r14 = r2
        L_0x0077:
            t.c r15 = r4.H
            t.c r15 = r15.f7305f
            if (r15 == 0) goto L_0x007f
            r15 = r8
            goto L_0x0080
        L_0x007f:
            r15 = r2
        L_0x0080:
            int r3 = r4.U
            if (r12 == 0) goto L_0x0198
            if (r13 == 0) goto L_0x0198
            if (r14 == 0) goto L_0x0198
            if (r15 == 0) goto L_0x0198
            float r4 = r4.T
            boolean r10 = r11.f7578j
            int[] r12 = f7583k
            if (r10 == 0) goto L_0x00e1
            boolean r10 = r9.f7578j
            if (r10 == 0) goto L_0x00e1
            boolean r7 = r5.f7572c
            if (r7 == 0) goto L_0x00e0
            boolean r7 = r6.f7572c
            if (r7 != 0) goto L_0x009f
            goto L_0x00e0
        L_0x009f:
            java.util.ArrayList r7 = r5.f7580l
            java.lang.Object r7 = r7.get(r2)
            u.f r7 = (u.f) r7
            int r7 = r7.f7575g
            int r5 = r5.f7574f
            int r17 = r7 + r5
            java.util.ArrayList r5 = r6.f7580l
            java.lang.Object r5 = r5.get(r2)
            u.f r5 = (u.f) r5
            int r5 = r5.f7575g
            int r6 = r6.f7574f
            int r18 = r5 - r6
            int r5 = r11.f7575g
            int r6 = r11.f7574f
            int r19 = r5 + r6
            int r5 = r9.f7575g
            int r6 = r9.f7574f
            int r20 = r5 - r6
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r2 = r12[r2]
            r1.d(r2)
            t.d r0 = r0.f7594b
            u.n r0 = r0.e
            u.g r0 = r0.e
            r1 = r12[r8]
            r0.d(r1)
        L_0x00e0:
            return
        L_0x00e1:
            boolean r10 = r5.f7578j
            java.util.ArrayList r13 = r11.f7580l
            if (r10 == 0) goto L_0x0135
            boolean r10 = r6.f7578j
            if (r10 == 0) goto L_0x0135
            boolean r10 = r11.f7572c
            if (r10 == 0) goto L_0x0134
            boolean r10 = r9.f7572c
            if (r10 != 0) goto L_0x00f4
            goto L_0x0134
        L_0x00f4:
            int r10 = r5.f7575g
            int r14 = r5.f7574f
            int r17 = r10 + r14
            int r10 = r6.f7575g
            int r14 = r6.f7574f
            int r18 = r10 - r14
            java.lang.Object r10 = r13.get(r2)
            u.f r10 = (u.f) r10
            int r10 = r10.f7575g
            int r14 = r11.f7574f
            int r19 = r10 + r14
            java.util.ArrayList r10 = r9.f7580l
            java.lang.Object r10 = r10.get(r2)
            u.f r10 = (u.f) r10
            int r10 = r10.f7575g
            int r14 = r9.f7574f
            int r20 = r10 - r14
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r10 = r12[r2]
            r1.d(r10)
            t.d r10 = r0.f7594b
            u.n r10 = r10.e
            u.g r10 = r10.e
            r14 = r12[r8]
            r10.d(r14)
            goto L_0x0135
        L_0x0134:
            return
        L_0x0135:
            boolean r10 = r5.f7572c
            if (r10 == 0) goto L_0x0197
            boolean r10 = r6.f7572c
            if (r10 == 0) goto L_0x0197
            boolean r10 = r11.f7572c
            if (r10 == 0) goto L_0x0197
            boolean r10 = r9.f7572c
            if (r10 != 0) goto L_0x0146
            goto L_0x0197
        L_0x0146:
            java.util.ArrayList r10 = r5.f7580l
            java.lang.Object r10 = r10.get(r2)
            u.f r10 = (u.f) r10
            int r10 = r10.f7575g
            int r14 = r5.f7574f
            int r17 = r10 + r14
            java.util.ArrayList r10 = r6.f7580l
            java.lang.Object r10 = r10.get(r2)
            u.f r10 = (u.f) r10
            int r10 = r10.f7575g
            int r14 = r6.f7574f
            int r18 = r10 - r14
            java.lang.Object r10 = r13.get(r2)
            u.f r10 = (u.f) r10
            int r10 = r10.f7575g
            int r11 = r11.f7574f
            int r19 = r10 + r11
            java.util.ArrayList r10 = r9.f7580l
            java.lang.Object r10 = r10.get(r2)
            u.f r10 = (u.f) r10
            int r10 = r10.f7575g
            int r9 = r9.f7574f
            int r20 = r10 - r9
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r3 = r12[r2]
            r1.d(r3)
            t.d r3 = r0.f7594b
            u.n r3 = r3.e
            u.g r3 = r3.e
            r4 = r12[r8]
            r3.d(r4)
            goto L_0x0277
        L_0x0197:
            return
        L_0x0198:
            if (r12 == 0) goto L_0x01fd
            if (r14 == 0) goto L_0x01fd
            boolean r9 = r5.f7572c
            if (r9 == 0) goto L_0x01fc
            boolean r9 = r6.f7572c
            if (r9 != 0) goto L_0x01a5
            goto L_0x01fc
        L_0x01a5:
            float r4 = r4.T
            java.util.ArrayList r9 = r5.f7580l
            java.lang.Object r9 = r9.get(r2)
            u.f r9 = (u.f) r9
            int r9 = r9.f7575g
            int r11 = r5.f7574f
            int r9 = r9 + r11
            java.util.ArrayList r11 = r6.f7580l
            java.lang.Object r11 = r11.get(r2)
            u.f r11 = (u.f) r11
            int r11 = r11.f7575g
            int r12 = r6.f7574f
            int r11 = r11 - r12
            if (r3 == r10) goto L_0x01db
            if (r3 == 0) goto L_0x01db
            if (r3 == r8) goto L_0x01c9
            goto L_0x0277
        L_0x01c9:
            int r11 = r11 - r9
            int r3 = r0.g(r11, r2)
            float r9 = (float) r3
            float r9 = r9 / r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r8)
            if (r9 == r10) goto L_0x01ee
            float r3 = (float) r10
            float r3 = r3 * r4
            goto L_0x01ec
        L_0x01db:
            int r11 = r11 - r9
            int r3 = r0.g(r11, r2)
            float r9 = (float) r3
            float r9 = r9 * r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r8)
            if (r9 == r10) goto L_0x01ee
            float r3 = (float) r10
            float r3 = r3 / r4
        L_0x01ec:
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x01ee:
            r1.d(r3)
            t.d r3 = r0.f7594b
            u.n r3 = r3.e
            u.g r3 = r3.e
            r3.d(r10)
            goto L_0x0277
        L_0x01fc:
            return
        L_0x01fd:
            if (r13 == 0) goto L_0x0277
            if (r15 == 0) goto L_0x0277
            boolean r12 = r11.f7572c
            if (r12 == 0) goto L_0x025f
            boolean r12 = r9.f7572c
            if (r12 != 0) goto L_0x020a
            goto L_0x025f
        L_0x020a:
            float r4 = r4.T
            java.util.ArrayList r12 = r11.f7580l
            java.lang.Object r12 = r12.get(r2)
            u.f r12 = (u.f) r12
            int r12 = r12.f7575g
            int r11 = r11.f7574f
            int r12 = r12 + r11
            java.util.ArrayList r11 = r9.f7580l
            java.lang.Object r11 = r11.get(r2)
            u.f r11 = (u.f) r11
            int r11 = r11.f7575g
            int r9 = r9.f7574f
            int r11 = r11 - r9
            if (r3 == r10) goto L_0x023f
            if (r3 == 0) goto L_0x022d
            if (r3 == r8) goto L_0x023f
            goto L_0x0277
        L_0x022d:
            int r11 = r11 - r12
            int r3 = r0.g(r11, r8)
            float r9 = (float) r3
            float r9 = r9 * r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r2)
            if (r9 == r10) goto L_0x0252
            float r3 = (float) r10
            float r3 = r3 / r4
            goto L_0x0250
        L_0x023f:
            int r11 = r11 - r12
            int r3 = r0.g(r11, r8)
            float r9 = (float) r3
            float r9 = r9 / r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r2)
            if (r9 == r10) goto L_0x0252
            float r3 = (float) r10
            float r3 = r3 * r4
        L_0x0250:
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x0252:
            r1.d(r10)
            t.d r4 = r0.f7594b
            u.n r4 = r4.e
            u.g r4 = r4.e
            r4.d(r3)
            goto L_0x0277
        L_0x025f:
            return
        L_0x0260:
            t.d r3 = r4.Q
            if (r3 == 0) goto L_0x0277
            u.l r3 = r3.f7324d
            u.g r3 = r3.e
            boolean r9 = r3.f7578j
            if (r9 == 0) goto L_0x0277
            float r4 = r4.r
            int r3 = r3.f7575g
            float r3 = (float) r3
            float r3 = r3 * r4
            float r3 = r3 + r7
            int r3 = (int) r3
            r1.d(r3)
        L_0x0277:
            boolean r3 = r5.f7572c
            if (r3 == 0) goto L_0x034c
            boolean r3 = r6.f7572c
            if (r3 != 0) goto L_0x0281
            goto L_0x034c
        L_0x0281:
            boolean r3 = r5.f7578j
            if (r3 == 0) goto L_0x028e
            boolean r3 = r6.f7578j
            if (r3 == 0) goto L_0x028e
            boolean r3 = r1.f7578j
            if (r3 == 0) goto L_0x028e
            return
        L_0x028e:
            boolean r3 = r1.f7578j
            java.util.ArrayList r4 = r5.f7580l
            java.util.ArrayList r9 = r6.f7580l
            if (r3 != 0) goto L_0x02c9
            int r3 = r0.f7596d
            r10 = 3
            if (r3 != r10) goto L_0x02c9
            t.d r3 = r0.f7594b
            int r10 = r3.f7341m
            if (r10 != 0) goto L_0x02c9
            boolean r3 = r3.q()
            if (r3 != 0) goto L_0x02c9
            java.lang.Object r0 = r4.get(r2)
            u.f r0 = (u.f) r0
            java.lang.Object r2 = r9.get(r2)
            u.f r2 = (u.f) r2
            int r0 = r0.f7575g
            int r3 = r5.f7574f
            int r0 = r0 + r3
            int r2 = r2.f7575g
            int r3 = r6.f7574f
            int r2 = r2 + r3
            int r3 = r2 - r0
            r5.d(r0)
            r6.d(r2)
            r1.d(r3)
            return
        L_0x02c9:
            boolean r3 = r1.f7578j
            if (r3 != 0) goto L_0x0312
            int r3 = r0.f7596d
            r10 = 3
            if (r3 != r10) goto L_0x0312
            int r3 = r0.f7593a
            if (r3 != r8) goto L_0x0312
            int r3 = r4.size()
            if (r3 <= 0) goto L_0x0312
            int r3 = r9.size()
            if (r3 <= 0) goto L_0x0312
            java.lang.Object r3 = r4.get(r2)
            u.f r3 = (u.f) r3
            java.lang.Object r8 = r9.get(r2)
            u.f r8 = (u.f) r8
            int r3 = r3.f7575g
            int r10 = r5.f7574f
            int r3 = r3 + r10
            int r8 = r8.f7575g
            int r10 = r6.f7574f
            int r8 = r8 + r10
            int r8 = r8 - r3
            int r3 = r1.f7581m
            int r3 = java.lang.Math.min(r8, r3)
            t.d r8 = r0.f7594b
            int r10 = r8.f7345q
            int r8 = r8.f7344p
            int r3 = java.lang.Math.max(r8, r3)
            if (r10 <= 0) goto L_0x030f
            int r3 = java.lang.Math.min(r10, r3)
        L_0x030f:
            r1.d(r3)
        L_0x0312:
            boolean r3 = r1.f7578j
            if (r3 != 0) goto L_0x0317
            return
        L_0x0317:
            java.lang.Object r3 = r4.get(r2)
            u.f r3 = (u.f) r3
            java.lang.Object r2 = r9.get(r2)
            u.f r2 = (u.f) r2
            int r4 = r3.f7575g
            int r8 = r5.f7574f
            int r8 = r8 + r4
            int r9 = r2.f7575g
            int r10 = r6.f7574f
            int r10 = r10 + r9
            t.d r0 = r0.f7594b
            float r0 = r0.f7319a0
            if (r3 != r2) goto L_0x0335
            r0 = r7
            goto L_0x0337
        L_0x0335:
            r4 = r8
            r9 = r10
        L_0x0337:
            int r9 = r9 - r4
            int r2 = r1.f7575g
            int r9 = r9 - r2
            float r2 = (float) r4
            float r2 = r2 + r7
            float r3 = (float) r9
            float r3 = r3 * r0
            float r2 = r2 + r3
            int r0 = (int) r2
            r5.d(r0)
            int r0 = r5.f7575g
            int r1 = r1.f7575g
            int r0 = r0 + r1
            r6.d(r0)
        L_0x034c:
            return
        L_0x034d:
            t.d r1 = r0.f7594b
            t.c r3 = r1.E
            t.c r1 = r1.G
            r0.l(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.l.a(u.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        r0 = r12.f7594b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r12 = this;
            t.d r0 = r12.f7594b
            boolean r1 = r0.f7318a
            u.g r2 = r12.e
            if (r1 == 0) goto L_0x000f
            int r0 = r0.k()
            r2.d(r0)
        L_0x000f:
            boolean r0 = r2.f7578j
            u.f r1 = r12.f7600i
            u.f r3 = r12.f7599h
            r4 = 1
            r5 = 4
            r6 = 3
            r7 = 0
            if (r0 != 0) goto L_0x007a
            t.d r0 = r12.f7594b
            int[] r8 = r0.P
            r8 = r8[r7]
            r12.f7596d = r8
            if (r8 == r6) goto L_0x00ae
            if (r8 != r5) goto L_0x0070
            t.d r9 = r0.Q
            if (r9 == 0) goto L_0x0031
            int[] r10 = r9.P
            r10 = r10[r7]
            if (r10 == r4) goto L_0x0037
        L_0x0031:
            int[] r10 = r9.P
            r10 = r10[r7]
            if (r10 != r5) goto L_0x0070
        L_0x0037:
            int r0 = r9.k()
            t.d r4 = r12.f7594b
            t.c r4 = r4.E
            int r4 = r4.d()
            int r0 = r0 - r4
            t.d r4 = r12.f7594b
            t.c r4 = r4.G
            int r4 = r4.d()
            int r0 = r0 - r4
            u.l r4 = r9.f7324d
            u.f r4 = r4.f7599h
            t.d r5 = r12.f7594b
            t.c r5 = r5.E
            int r5 = r5.d()
            u.p.b(r3, r4, r5)
            u.l r3 = r9.f7324d
            u.f r3 = r3.f7600i
            t.d r12 = r12.f7594b
            t.c r12 = r12.G
            int r12 = r12.d()
            int r12 = -r12
            u.p.b(r1, r3, r12)
            r2.d(r0)
            return
        L_0x0070:
            if (r8 != r4) goto L_0x00ae
            int r0 = r0.k()
            r2.d(r0)
            goto L_0x00ae
        L_0x007a:
            int r0 = r12.f7596d
            if (r0 != r5) goto L_0x00ae
            t.d r0 = r12.f7594b
            t.d r8 = r0.Q
            if (r8 == 0) goto L_0x008a
            int[] r9 = r8.P
            r9 = r9[r7]
            if (r9 == r4) goto L_0x0090
        L_0x008a:
            int[] r9 = r8.P
            r9 = r9[r7]
            if (r9 != r5) goto L_0x00ae
        L_0x0090:
            u.l r2 = r8.f7324d
            u.f r2 = r2.f7599h
            t.c r0 = r0.E
            int r0 = r0.d()
            u.p.b(r3, r2, r0)
            u.l r0 = r8.f7324d
            u.f r0 = r0.f7600i
            t.d r12 = r12.f7594b
            t.c r12 = r12.G
            int r12 = r12.d()
            int r12 = -r12
            u.p.b(r1, r0, r12)
            return
        L_0x00ae:
            boolean r0 = r2.f7578j
            if (r0 == 0) goto L_0x0177
            t.d r0 = r12.f7594b
            boolean r8 = r0.f7318a
            if (r8 == 0) goto L_0x0177
            t.c[] r5 = r0.M
            r6 = r5[r7]
            t.c r8 = r6.f7305f
            if (r8 == 0) goto L_0x0119
            r9 = r5[r4]
            t.c r9 = r9.f7305f
            if (r9 == 0) goto L_0x0119
            boolean r0 = r0.q()
            if (r0 == 0) goto L_0x00e0
            t.d r0 = r12.f7594b
            t.c[] r0 = r0.M
            r0 = r0[r7]
            int r0 = r0.d()
            r3.f7574f = r0
            t.d r12 = r12.f7594b
            t.c[] r12 = r12.M
            r12 = r12[r4]
            goto L_0x027e
        L_0x00e0:
            t.d r0 = r12.f7594b
            t.c[] r0 = r0.M
            r0 = r0[r7]
            u.f r0 = u.p.h(r0)
            if (r0 == 0) goto L_0x00f9
            t.d r2 = r12.f7594b
            t.c[] r2 = r2.M
            r2 = r2[r7]
            int r2 = r2.d()
            u.p.b(r3, r0, r2)
        L_0x00f9:
            t.d r0 = r12.f7594b
            t.c[] r0 = r0.M
            r0 = r0[r4]
            u.f r0 = u.p.h(r0)
            if (r0 == 0) goto L_0x0113
            t.d r12 = r12.f7594b
            t.c[] r12 = r12.M
            r12 = r12[r4]
            int r12 = r12.d()
            int r12 = -r12
            u.p.b(r1, r0, r12)
        L_0x0113:
            r3.f7571b = r4
            r1.f7571b = r4
            goto L_0x02ee
        L_0x0119:
            if (r8 == 0) goto L_0x012f
            u.f r0 = u.p.h(r6)
            if (r0 == 0) goto L_0x02ee
            t.d r12 = r12.f7594b
            t.c[] r12 = r12.M
            r12 = r12[r7]
            int r12 = r12.d()
        L_0x012b:
            u.p.b(r3, r0, r12)
            goto L_0x0170
        L_0x012f:
            r5 = r5[r4]
            t.c r6 = r5.f7305f
            if (r6 == 0) goto L_0x0151
            u.f r0 = u.p.h(r5)
            if (r0 == 0) goto L_0x02ee
            t.d r12 = r12.f7594b
            t.c[] r12 = r12.M
            r12 = r12[r4]
            int r12 = r12.d()
            int r12 = -r12
            u.p.b(r1, r0, r12)
            int r12 = r2.f7575g
            int r12 = -r12
            u.p.b(r3, r1, r12)
            goto L_0x02ee
        L_0x0151:
            boolean r4 = r0 instanceof t.g
            if (r4 != 0) goto L_0x02ee
            t.d r4 = r0.Q
            if (r4 == 0) goto L_0x02ee
            t.c$a r4 = t.c.a.f7314k
            t.c r0 = r0.g(r4)
            t.c r0 = r0.f7305f
            if (r0 != 0) goto L_0x02ee
            t.d r12 = r12.f7594b
            t.d r0 = r12.Q
            u.l r0 = r0.f7324d
            u.f r0 = r0.f7599h
            int r12 = r12.l()
            goto L_0x012b
        L_0x0170:
            int r12 = r2.f7575g
            u.p.b(r1, r3, r12)
            goto L_0x02ee
        L_0x0177:
            int r0 = r12.f7596d
            if (r0 != r6) goto L_0x0256
            t.d r0 = r12.f7594b
            int r8 = r0.f7341m
            r9 = 2
            java.util.ArrayList r10 = r2.f7579k
            java.util.ArrayList r11 = r2.f7580l
            if (r8 == r9) goto L_0x023d
            if (r8 == r6) goto L_0x018a
            goto L_0x0256
        L_0x018a:
            int r8 = r0.f7342n
            if (r8 != r6) goto L_0x0208
            r3.f7570a = r12
            r1.f7570a = r12
            u.n r6 = r0.e
            u.f r8 = r6.f7599h
            r8.f7570a = r12
            u.f r6 = r6.f7600i
            r6.f7570a = r12
            r2.f7570a = r12
            boolean r0 = r0.r()
            if (r0 == 0) goto L_0x01e2
            t.d r0 = r12.f7594b
            u.n r0 = r0.e
            u.g r0 = r0.e
            r11.add(r0)
            t.d r0 = r12.f7594b
            u.n r0 = r0.e
            u.g r0 = r0.e
            java.util.ArrayList r0 = r0.f7579k
            r0.add(r2)
            t.d r0 = r12.f7594b
            u.n r0 = r0.e
            u.g r6 = r0.e
            r6.f7570a = r12
            u.f r0 = r0.f7599h
            r11.add(r0)
            t.d r0 = r12.f7594b
            u.n r0 = r0.e
            u.f r0 = r0.f7600i
            r11.add(r0)
            t.d r0 = r12.f7594b
            u.n r0 = r0.e
            u.f r0 = r0.f7599h
            java.util.ArrayList r0 = r0.f7579k
            r0.add(r2)
            t.d r0 = r12.f7594b
            u.n r0 = r0.e
            u.f r0 = r0.f7600i
            java.util.ArrayList r0 = r0.f7579k
            goto L_0x0239
        L_0x01e2:
            t.d r0 = r12.f7594b
            boolean r0 = r0.q()
            if (r0 == 0) goto L_0x01ff
            t.d r0 = r12.f7594b
            u.n r0 = r0.e
            u.g r0 = r0.e
            java.util.ArrayList r0 = r0.f7580l
            r0.add(r2)
            t.d r0 = r12.f7594b
            u.n r0 = r0.e
            u.g r0 = r0.e
            r10.add(r0)
            goto L_0x0256
        L_0x01ff:
            t.d r0 = r12.f7594b
            u.n r0 = r0.e
            u.g r0 = r0.e
            java.util.ArrayList r0 = r0.f7580l
            goto L_0x0239
        L_0x0208:
            u.n r0 = r0.e
            u.g r0 = r0.e
            r11.add(r0)
            java.util.ArrayList r0 = r0.f7579k
            r0.add(r2)
            t.d r0 = r12.f7594b
            u.n r0 = r0.e
            u.f r0 = r0.f7599h
            java.util.ArrayList r0 = r0.f7579k
            r0.add(r2)
            t.d r0 = r12.f7594b
            u.n r0 = r0.e
            u.f r0 = r0.f7600i
            java.util.ArrayList r0 = r0.f7579k
            r0.add(r2)
            r2.f7571b = r4
            r10.add(r3)
            r10.add(r1)
            java.util.ArrayList r0 = r3.f7580l
            r0.add(r2)
            java.util.ArrayList r0 = r1.f7580l
        L_0x0239:
            r0.add(r2)
            goto L_0x0256
        L_0x023d:
            t.d r0 = r0.Q
            if (r0 != 0) goto L_0x0242
            goto L_0x0256
        L_0x0242:
            u.n r0 = r0.e
            u.g r0 = r0.e
            r11.add(r0)
            java.util.ArrayList r0 = r0.f7579k
            r0.add(r2)
            r2.f7571b = r4
            r10.add(r3)
            r10.add(r1)
        L_0x0256:
            t.d r0 = r12.f7594b
            t.c[] r6 = r0.M
            r8 = r6[r7]
            t.c r9 = r8.f7305f
            if (r9 == 0) goto L_0x02a3
            r10 = r6[r4]
            t.c r10 = r10.f7305f
            if (r10 == 0) goto L_0x02a3
            boolean r0 = r0.q()
            if (r0 == 0) goto L_0x0286
            t.d r0 = r12.f7594b
            t.c[] r0 = r0.M
            r0 = r0[r7]
            int r0 = r0.d()
            r3.f7574f = r0
            t.d r12 = r12.f7594b
            t.c[] r12 = r12.M
            r12 = r12[r4]
        L_0x027e:
            int r12 = r12.d()
            int r12 = -r12
            r1.f7574f = r12
            goto L_0x02ee
        L_0x0286:
            t.d r0 = r12.f7594b
            t.c[] r0 = r0.M
            r0 = r0[r7]
            u.f r0 = u.p.h(r0)
            t.d r1 = r12.f7594b
            t.c[] r1 = r1.M
            r1 = r1[r4]
            u.f r1 = u.p.h(r1)
            r0.b(r12)
            r1.b(r12)
            r12.f7601j = r5
            goto L_0x02ee
        L_0x02a3:
            if (r9 == 0) goto L_0x02b9
            u.f r0 = u.p.h(r8)
            if (r0 == 0) goto L_0x02ee
            t.d r5 = r12.f7594b
            t.c[] r5 = r5.M
            r5 = r5[r7]
            int r5 = r5.d()
            u.p.b(r3, r0, r5)
            goto L_0x02eb
        L_0x02b9:
            r5 = r6[r4]
            t.c r6 = r5.f7305f
            if (r6 == 0) goto L_0x02d8
            u.f r0 = u.p.h(r5)
            if (r0 == 0) goto L_0x02ee
            t.d r5 = r12.f7594b
            t.c[] r5 = r5.M
            r4 = r5[r4]
            int r4 = r4.d()
            int r4 = -r4
            u.p.b(r1, r0, r4)
            r0 = -1
            r12.c(r3, r1, r0, r2)
            goto L_0x02ee
        L_0x02d8:
            boolean r5 = r0 instanceof t.g
            if (r5 != 0) goto L_0x02ee
            t.d r5 = r0.Q
            if (r5 == 0) goto L_0x02ee
            u.l r5 = r5.f7324d
            u.f r5 = r5.f7599h
            int r0 = r0.l()
            u.p.b(r3, r5, r0)
        L_0x02eb:
            r12.c(r1, r3, r4, r2)
        L_0x02ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.l.d():void");
    }

    public final void e() {
        f fVar = this.f7599h;
        if (fVar.f7578j) {
            this.f7594b.V = fVar.f7575g;
        }
    }

    public final void f() {
        this.f7595c = null;
        this.f7599h.c();
        this.f7600i.c();
        this.e.c();
        this.f7598g = false;
    }

    public final boolean k() {
        return this.f7596d != 3 || this.f7594b.f7341m == 0;
    }

    public final void n() {
        this.f7598g = false;
        f fVar = this.f7599h;
        fVar.c();
        fVar.f7578j = false;
        f fVar2 = this.f7600i;
        fVar2.c();
        fVar2.f7578j = false;
        this.e.f7578j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f7594b.f7326e0;
    }
}
