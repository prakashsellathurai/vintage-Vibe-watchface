package u;

import java.util.ArrayList;
import s.g;
import t.d;

public final class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public final f f7586k;

    /* renamed from: l  reason: collision with root package name */
    public a f7587l = null;

    public n(d dVar) {
        super(dVar);
        f fVar = new f(this);
        this.f7586k = fVar;
        this.f7599h.e = 6;
        this.f7600i.e = 7;
        fVar.e = 8;
        this.f7597f = 1;
    }

    public final void a(d dVar) {
        int i8;
        float f9;
        if (g.b(this.f7601j) != 3) {
            g gVar = this.e;
            if (gVar.f7572c && !gVar.f7578j && this.f7596d == 3) {
                d dVar2 = this.f7594b;
                int i9 = dVar2.f7342n;
                if (i9 == 2) {
                    d dVar3 = dVar2.Q;
                    if (dVar3 != null) {
                        g gVar2 = dVar3.e.e;
                        if (gVar2.f7578j) {
                            f9 = ((float) gVar2.f7575g) * dVar2.f7348u;
                        }
                    }
                } else if (i9 == 3) {
                    g gVar3 = dVar2.f7324d.e;
                    if (gVar3.f7578j) {
                        int i10 = dVar2.U;
                        if (i10 != -1) {
                            if (i10 == 0) {
                                f9 = ((float) gVar3.f7575g) * dVar2.T;
                            } else if (i10 != 1) {
                                i8 = 0;
                                gVar.d(i8);
                            }
                        }
                        f9 = ((float) gVar3.f7575g) / dVar2.T;
                    }
                }
                i8 = (int) (f9 + 0.5f);
                gVar.d(i8);
            }
            f fVar = this.f7599h;
            if (fVar.f7572c) {
                f fVar2 = this.f7600i;
                if (fVar2.f7572c) {
                    if (!fVar.f7578j || !fVar2.f7578j || !gVar.f7578j) {
                        boolean z8 = gVar.f7578j;
                        ArrayList arrayList = fVar.f7580l;
                        ArrayList arrayList2 = fVar2.f7580l;
                        if (!z8 && this.f7596d == 3) {
                            d dVar4 = this.f7594b;
                            if (dVar4.f7341m == 0 && !dVar4.r()) {
                                int i11 = ((f) arrayList.get(0)).f7575g + fVar.f7574f;
                                int i12 = ((f) arrayList2.get(0)).f7575g + fVar2.f7574f;
                                fVar.d(i11);
                                fVar2.d(i12);
                                gVar.d(i12 - i11);
                                return;
                            }
                        }
                        if (!gVar.f7578j && this.f7596d == 3 && this.f7593a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                            int i13 = (((f) arrayList2.get(0)).f7575g + fVar2.f7574f) - (((f) arrayList.get(0)).f7575g + fVar.f7574f);
                            int i14 = gVar.f7581m;
                            if (i13 < i14) {
                                gVar.d(i13);
                            } else {
                                gVar.d(i14);
                            }
                        }
                        if (gVar.f7578j && arrayList.size() > 0 && arrayList2.size() > 0) {
                            f fVar3 = (f) arrayList.get(0);
                            f fVar4 = (f) arrayList2.get(0);
                            int i15 = fVar3.f7575g;
                            int i16 = fVar.f7574f + i15;
                            int i17 = fVar4.f7575g;
                            int i18 = fVar2.f7574f + i17;
                            float f10 = this.f7594b.f7321b0;
                            if (fVar3 == fVar4) {
                                f10 = 0.5f;
                            } else {
                                i15 = i16;
                                i17 = i18;
                            }
                            fVar.d((int) (((float) i15) + 0.5f + (((float) ((i17 - i15) - gVar.f7575g)) * f10)));
                            fVar2.d(fVar.f7575g + gVar.f7575g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        d dVar5 = this.f7594b;
        l(dVar5.F, dVar5.H, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x028e, code lost:
        if (r0.f7596d == 3) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02b4, code lost:
        if (r15.f7594b.f7351z != false) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0305, code lost:
        if (r0.f7596d == 3) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        r0 = r15.f7594b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0257, code lost:
        if (r15.f7594b.f7351z != false) goto L_0x02b6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r15 = this;
            t.d r0 = r15.f7594b
            boolean r1 = r0.f7318a
            u.g r2 = r15.e
            if (r1 == 0) goto L_0x000f
            int r0 = r0.i()
            r2.d(r0)
        L_0x000f:
            boolean r0 = r2.f7578j
            u.f r1 = r15.f7600i
            u.f r3 = r15.f7599h
            r4 = 3
            r5 = 1
            r6 = 4
            if (r0 != 0) goto L_0x0084
            t.d r0 = r15.f7594b
            int[] r7 = r0.P
            r7 = r7[r5]
            r15.f7596d = r7
            boolean r0 = r0.f7351z
            if (r0 == 0) goto L_0x002d
            u.a r0 = new u.a
            r0.<init>(r15)
            r15.f7587l = r0
        L_0x002d:
            int r0 = r15.f7596d
            if (r0 == r4) goto L_0x00b2
            if (r0 != r6) goto L_0x0078
            t.d r7 = r15.f7594b
            t.d r7 = r7.Q
            if (r7 == 0) goto L_0x0078
            int[] r8 = r7.P
            r8 = r8[r5]
            if (r8 != r5) goto L_0x0078
            int r0 = r7.i()
            t.d r4 = r15.f7594b
            t.c r4 = r4.F
            int r4 = r4.d()
            int r0 = r0 - r4
            t.d r4 = r15.f7594b
            t.c r4 = r4.H
            int r4 = r4.d()
            int r0 = r0 - r4
            u.n r4 = r7.e
            u.f r4 = r4.f7599h
            t.d r5 = r15.f7594b
            t.c r5 = r5.F
            int r5 = r5.d()
            u.p.b(r3, r4, r5)
            u.n r3 = r7.e
            u.f r3 = r3.f7600i
            t.d r15 = r15.f7594b
            t.c r15 = r15.H
            int r15 = r15.d()
            int r15 = -r15
            u.p.b(r1, r3, r15)
            r2.d(r0)
            return
        L_0x0078:
            if (r0 != r5) goto L_0x00b2
            t.d r0 = r15.f7594b
            int r0 = r0.i()
            r2.d(r0)
            goto L_0x00b2
        L_0x0084:
            int r0 = r15.f7596d
            if (r0 != r6) goto L_0x00b2
            t.d r0 = r15.f7594b
            t.d r7 = r0.Q
            if (r7 == 0) goto L_0x00b2
            int[] r8 = r7.P
            r8 = r8[r5]
            if (r8 != r5) goto L_0x00b2
            u.n r2 = r7.e
            u.f r2 = r2.f7599h
            t.c r0 = r0.F
            int r0 = r0.d()
            u.p.b(r3, r2, r0)
            u.n r0 = r7.e
            u.f r0 = r0.f7600i
            t.d r15 = r15.f7594b
            t.c r15 = r15.H
            int r15 = r15.d()
            int r15 = -r15
            u.p.b(r1, r0, r15)
            return
        L_0x00b2:
            boolean r0 = r2.f7578j
            u.f r7 = r15.f7586k
            r8 = 0
            r9 = 2
            if (r0 == 0) goto L_0x01c7
            t.d r10 = r15.f7594b
            boolean r11 = r10.f7318a
            if (r11 == 0) goto L_0x01c7
            t.c[] r0 = r10.M
            r11 = r0[r9]
            t.c r12 = r11.f7305f
            if (r12 == 0) goto L_0x012d
            r13 = r0[r4]
            t.c r13 = r13.f7305f
            if (r13 == 0) goto L_0x012d
            boolean r0 = r10.r()
            if (r0 == 0) goto L_0x00ee
            t.d r0 = r15.f7594b
            t.c[] r0 = r0.M
            r0 = r0[r9]
            int r0 = r0.d()
            r3.f7574f = r0
            t.d r0 = r15.f7594b
            t.c[] r0 = r0.M
            r0 = r0[r4]
            int r0 = r0.d()
            int r0 = -r0
            r1.f7574f = r0
            goto L_0x0125
        L_0x00ee:
            t.d r0 = r15.f7594b
            t.c[] r0 = r0.M
            r0 = r0[r9]
            u.f r0 = u.p.h(r0)
            if (r0 == 0) goto L_0x0107
            t.d r2 = r15.f7594b
            t.c[] r2 = r2.M
            r2 = r2[r9]
            int r2 = r2.d()
            u.p.b(r3, r0, r2)
        L_0x0107:
            t.d r0 = r15.f7594b
            t.c[] r0 = r0.M
            r0 = r0[r4]
            u.f r0 = u.p.h(r0)
            if (r0 == 0) goto L_0x0121
            t.d r2 = r15.f7594b
            t.c[] r2 = r2.M
            r2 = r2[r4]
            int r2 = r2.d()
            int r2 = -r2
            u.p.b(r1, r0, r2)
        L_0x0121:
            r3.f7571b = r5
            r1.f7571b = r5
        L_0x0125:
            t.d r15 = r15.f7594b
            boolean r0 = r15.f7351z
            if (r0 == 0) goto L_0x0321
            goto L_0x01c0
        L_0x012d:
            if (r12 == 0) goto L_0x014f
            u.f r0 = u.p.h(r11)
            if (r0 == 0) goto L_0x0321
            t.d r4 = r15.f7594b
            t.c[] r4 = r4.M
            r4 = r4[r9]
            int r4 = r4.d()
            u.p.b(r3, r0, r4)
            int r0 = r2.f7575g
            u.p.b(r1, r3, r0)
            t.d r15 = r15.f7594b
            boolean r0 = r15.f7351z
            if (r0 == 0) goto L_0x0321
            goto L_0x01c0
        L_0x014f:
            r5 = r0[r4]
            t.c r9 = r5.f7305f
            if (r9 == 0) goto L_0x0176
            u.f r0 = u.p.h(r5)
            if (r0 == 0) goto L_0x016f
            t.d r5 = r15.f7594b
            t.c[] r5 = r5.M
            r4 = r5[r4]
            int r4 = r4.d()
            int r4 = -r4
            u.p.b(r1, r0, r4)
            int r0 = r2.f7575g
            int r0 = -r0
            u.p.b(r3, r1, r0)
        L_0x016f:
            t.d r15 = r15.f7594b
            boolean r0 = r15.f7351z
            if (r0 == 0) goto L_0x0321
            goto L_0x01c0
        L_0x0176:
            r0 = r0[r6]
            t.c r4 = r0.f7305f
            if (r4 == 0) goto L_0x0194
            u.f r0 = u.p.h(r0)
            if (r0 == 0) goto L_0x0321
            u.p.b(r7, r0, r8)
            t.d r15 = r15.f7594b
            int r15 = r15.X
            int r15 = -r15
            u.p.b(r3, r7, r15)
            int r15 = r2.f7575g
            u.p.b(r1, r3, r15)
            goto L_0x0321
        L_0x0194:
            boolean r0 = r10 instanceof t.g
            if (r0 != 0) goto L_0x0321
            t.d r0 = r10.Q
            if (r0 == 0) goto L_0x0321
            t.c$a r0 = t.c.a.f7314k
            t.c r0 = r10.g(r0)
            t.c r0 = r0.f7305f
            if (r0 != 0) goto L_0x0321
            t.d r0 = r15.f7594b
            t.d r4 = r0.Q
            u.n r4 = r4.e
            u.f r4 = r4.f7599h
            int r0 = r0.m()
            u.p.b(r3, r4, r0)
            int r0 = r2.f7575g
            u.p.b(r1, r3, r0)
            t.d r15 = r15.f7594b
            boolean r0 = r15.f7351z
            if (r0 == 0) goto L_0x0321
        L_0x01c0:
            int r15 = r15.X
            u.p.b(r7, r3, r15)
            goto L_0x0321
        L_0x01c7:
            java.util.ArrayList r10 = r2.f7580l
            if (r0 != 0) goto L_0x0204
            int r0 = r15.f7596d
            if (r0 != r4) goto L_0x0204
            t.d r0 = r15.f7594b
            int r11 = r0.f7342n
            if (r11 == r9) goto L_0x01e8
            if (r11 == r4) goto L_0x01d8
            goto L_0x0207
        L_0x01d8:
            boolean r0 = r0.r()
            if (r0 != 0) goto L_0x0207
            t.d r0 = r15.f7594b
            int r11 = r0.f7341m
            if (r11 != r4) goto L_0x01e5
            goto L_0x0207
        L_0x01e5:
            u.l r0 = r0.f7324d
            goto L_0x01ef
        L_0x01e8:
            t.d r0 = r0.Q
            if (r0 != 0) goto L_0x01ed
            goto L_0x0207
        L_0x01ed:
            u.n r0 = r0.e
        L_0x01ef:
            u.g r0 = r0.e
            r10.add(r0)
            java.util.ArrayList r0 = r0.f7579k
            r0.add(r2)
            r2.f7571b = r5
            java.util.ArrayList r0 = r2.f7579k
            r0.add(r3)
            r0.add(r1)
            goto L_0x0207
        L_0x0204:
            r2.b(r15)
        L_0x0207:
            t.d r0 = r15.f7594b
            t.c[] r11 = r0.M
            r12 = r11[r9]
            t.c r13 = r12.f7305f
            if (r13 == 0) goto L_0x025a
            r14 = r11[r4]
            t.c r14 = r14.f7305f
            if (r14 == 0) goto L_0x025a
            boolean r0 = r0.r()
            if (r0 == 0) goto L_0x0237
            t.d r0 = r15.f7594b
            t.c[] r0 = r0.M
            r0 = r0[r9]
            int r0 = r0.d()
            r3.f7574f = r0
            t.d r0 = r15.f7594b
            t.c[] r0 = r0.M
            r0 = r0[r4]
            int r0 = r0.d()
            int r0 = -r0
            r1.f7574f = r0
            goto L_0x0253
        L_0x0237:
            t.d r0 = r15.f7594b
            t.c[] r0 = r0.M
            r0 = r0[r9]
            u.f r0 = u.p.h(r0)
            t.d r1 = r15.f7594b
            t.c[] r1 = r1.M
            r1 = r1[r4]
            u.f r1 = u.p.h(r1)
            r0.b(r15)
            r1.b(r15)
            r15.f7601j = r6
        L_0x0253:
            t.d r0 = r15.f7594b
            boolean r0 = r0.f7351z
            if (r0 == 0) goto L_0x0319
            goto L_0x02b6
        L_0x025a:
            r14 = 0
            if (r13 == 0) goto L_0x0292
            u.f r0 = u.p.h(r12)
            if (r0 == 0) goto L_0x0319
            t.d r6 = r15.f7594b
            t.c[] r6 = r6.M
            r6 = r6[r9]
            int r6 = r6.d()
            u.p.b(r3, r0, r6)
            r15.c(r1, r3, r5, r2)
            t.d r0 = r15.f7594b
            boolean r0 = r0.f7351z
            if (r0 == 0) goto L_0x027e
            u.a r0 = r15.f7587l
            r15.c(r7, r3, r5, r0)
        L_0x027e:
            int r0 = r15.f7596d
            if (r0 != r4) goto L_0x0319
            t.d r0 = r15.f7594b
            float r1 = r0.T
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x0319
            u.l r0 = r0.f7324d
            int r1 = r0.f7596d
            if (r1 != r4) goto L_0x0319
            goto L_0x0307
        L_0x0292:
            r9 = r11[r4]
            t.c r12 = r9.f7305f
            r13 = -1
            if (r12 == 0) goto L_0x02bc
            u.f r0 = u.p.h(r9)
            if (r0 == 0) goto L_0x0319
            t.d r6 = r15.f7594b
            t.c[] r6 = r6.M
            r4 = r6[r4]
            int r4 = r4.d()
            int r4 = -r4
            u.p.b(r1, r0, r4)
            r15.c(r3, r1, r13, r2)
            t.d r0 = r15.f7594b
            boolean r0 = r0.f7351z
            if (r0 == 0) goto L_0x0319
        L_0x02b6:
            u.a r0 = r15.f7587l
            r15.c(r7, r3, r5, r0)
            goto L_0x0319
        L_0x02bc:
            r6 = r11[r6]
            t.c r9 = r6.f7305f
            if (r9 == 0) goto L_0x02d4
            u.f r0 = u.p.h(r6)
            if (r0 == 0) goto L_0x0319
            u.p.b(r7, r0, r8)
            u.a r0 = r15.f7587l
            r15.c(r3, r7, r13, r0)
            r15.c(r1, r3, r5, r2)
            goto L_0x0319
        L_0x02d4:
            boolean r6 = r0 instanceof t.g
            if (r6 != 0) goto L_0x0319
            t.d r6 = r0.Q
            if (r6 == 0) goto L_0x0319
            u.n r6 = r6.e
            u.f r6 = r6.f7599h
            int r0 = r0.m()
            u.p.b(r3, r6, r0)
            r15.c(r1, r3, r5, r2)
            t.d r0 = r15.f7594b
            boolean r0 = r0.f7351z
            if (r0 == 0) goto L_0x02f5
            u.a r0 = r15.f7587l
            r15.c(r7, r3, r5, r0)
        L_0x02f5:
            int r0 = r15.f7596d
            if (r0 != r4) goto L_0x0319
            t.d r0 = r15.f7594b
            float r1 = r0.T
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x0319
            u.l r0 = r0.f7324d
            int r1 = r0.f7596d
            if (r1 != r4) goto L_0x0319
        L_0x0307:
            u.g r0 = r0.e
            java.util.ArrayList r0 = r0.f7579k
            r0.add(r2)
            t.d r0 = r15.f7594b
            u.l r0 = r0.f7324d
            u.g r0 = r0.e
            r10.add(r0)
            r2.f7570a = r15
        L_0x0319:
            int r15 = r10.size()
            if (r15 != 0) goto L_0x0321
            r2.f7572c = r5
        L_0x0321:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.n.d():void");
    }

    public final void e() {
        f fVar = this.f7599h;
        if (fVar.f7578j) {
            this.f7594b.W = fVar.f7575g;
        }
    }

    public final void f() {
        this.f7595c = null;
        this.f7599h.c();
        this.f7600i.c();
        this.f7586k.c();
        this.e.c();
        this.f7598g = false;
    }

    public final boolean k() {
        return this.f7596d != 3 || this.f7594b.f7342n == 0;
    }

    public final void m() {
        this.f7598g = false;
        f fVar = this.f7599h;
        fVar.c();
        fVar.f7578j = false;
        f fVar2 = this.f7600i;
        fVar2.c();
        fVar2.f7578j = false;
        f fVar3 = this.f7586k;
        fVar3.c();
        fVar3.f7578j = false;
        this.e.f7578j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f7594b.f7326e0;
    }
}
