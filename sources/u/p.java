package u;

import t.c;
import t.d;

public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f7593a;

    /* renamed from: b  reason: collision with root package name */
    public d f7594b;

    /* renamed from: c  reason: collision with root package name */
    public m f7595c;

    /* renamed from: d  reason: collision with root package name */
    public int f7596d;
    public final g e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f7597f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7598g = false;

    /* renamed from: h  reason: collision with root package name */
    public final f f7599h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public final f f7600i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public int f7601j = 1;

    public p(d dVar) {
        this.f7594b = dVar;
    }

    public static void b(f fVar, f fVar2, int i8) {
        fVar.f7580l.add(fVar2);
        fVar.f7574f = i8;
        fVar2.f7579k.add(fVar);
    }

    public static f h(c cVar) {
        p pVar;
        p pVar2;
        c cVar2 = cVar.f7305f;
        if (cVar2 == null) {
            return null;
        }
        int ordinal = cVar2.e.ordinal();
        d dVar = cVar2.f7304d;
        if (ordinal == 1) {
            pVar = dVar.f7324d;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                pVar2 = dVar.f7324d;
            } else if (ordinal == 4) {
                pVar2 = dVar.e;
            } else if (ordinal != 5) {
                return null;
            } else {
                return dVar.e.f7586k;
            }
            return pVar2.f7600i;
        } else {
            pVar = dVar.e;
        }
        return pVar.f7599h;
    }

    public static f i(c cVar, int i8) {
        c cVar2 = cVar.f7305f;
        if (cVar2 == null) {
            return null;
        }
        d dVar = cVar2.f7304d;
        p pVar = i8 == 0 ? dVar.f7324d : dVar.e;
        int ordinal = cVar2.e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return pVar.f7599h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return pVar.f7600i;
        }
        return null;
    }

    public void a(d dVar) {
    }

    public final void c(f fVar, f fVar2, int i8, g gVar) {
        fVar.f7580l.add(fVar2);
        fVar.f7580l.add(this.e);
        fVar.f7576h = i8;
        fVar.f7577i = gVar;
        fVar2.f7579k.add(fVar);
        gVar.f7579k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i8, int i9) {
        int i10;
        d dVar = this.f7594b;
        if (i9 == 0) {
            int i11 = dVar.f7345q;
            i10 = Math.max(dVar.f7344p, i8);
            if (i11 > 0) {
                i10 = Math.min(i11, i8);
            }
            if (i10 == i8) {
                return i8;
            }
        } else {
            int i12 = dVar.f7347t;
            int max = Math.max(dVar.f7346s, i8);
            if (i12 > 0) {
                max = Math.min(i12, i8);
            }
            if (i10 == i8) {
                return i8;
            }
        }
        return i10;
    }

    public long j() {
        g gVar = this.e;
        if (gVar.f7578j) {
            return (long) gVar.f7575g;
        }
        return 0;
    }

    public abstract boolean k();

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r9.f7593a == 3) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(t.c r12, t.c r13, int r14) {
        /*
            r11 = this;
            u.f r0 = h(r12)
            u.f r1 = h(r13)
            boolean r2 = r0.f7578j
            if (r2 == 0) goto L_0x00db
            boolean r2 = r1.f7578j
            if (r2 != 0) goto L_0x0012
            goto L_0x00db
        L_0x0012:
            int r2 = r0.f7575g
            int r12 = r12.d()
            int r2 = r2 + r12
            int r12 = r1.f7575g
            int r13 = r13.d()
            int r12 = r12 - r13
            int r13 = r12 - r2
            u.g r3 = r11.e
            boolean r4 = r3.f7578j
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto L_0x00a4
            int r4 = r11.f7596d
            r6 = 3
            if (r4 != r6) goto L_0x00a4
            int r4 = r11.f7593a
            if (r4 == 0) goto L_0x009c
            r7 = 1
            if (r4 == r7) goto L_0x0091
            r8 = 2
            if (r4 == r8) goto L_0x0070
            if (r4 == r6) goto L_0x003d
            goto L_0x00a4
        L_0x003d:
            t.d r4 = r11.f7594b
            u.l r8 = r4.f7324d
            int r9 = r8.f7596d
            if (r9 != r6) goto L_0x0054
            int r9 = r8.f7593a
            if (r9 != r6) goto L_0x0054
            u.n r9 = r4.e
            int r10 = r9.f7596d
            if (r10 != r6) goto L_0x0054
            int r9 = r9.f7593a
            if (r9 != r6) goto L_0x0054
            goto L_0x00a4
        L_0x0054:
            if (r14 != 0) goto L_0x0058
            u.n r8 = r4.e
        L_0x0058:
            u.g r6 = r8.e
            boolean r8 = r6.f7578j
            if (r8 == 0) goto L_0x00a4
            float r4 = r4.T
            if (r14 != r7) goto L_0x0069
            int r6 = r6.f7575g
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x00a1
        L_0x0069:
            int r6 = r6.f7575g
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
            goto L_0x00a1
        L_0x0070:
            t.d r4 = r11.f7594b
            t.d r6 = r4.Q
            if (r6 == 0) goto L_0x00a4
            if (r14 != 0) goto L_0x007b
            u.l r6 = r6.f7324d
            goto L_0x007d
        L_0x007b:
            u.n r6 = r6.e
        L_0x007d:
            u.g r6 = r6.e
            boolean r7 = r6.f7578j
            if (r7 == 0) goto L_0x00a4
            if (r14 != 0) goto L_0x0088
            float r4 = r4.r
            goto L_0x008a
        L_0x0088:
            float r4 = r4.f7348u
        L_0x008a:
            int r6 = r6.f7575g
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x009d
        L_0x0091:
            int r4 = r3.f7581m
            int r4 = r11.g(r4, r14)
            int r4 = java.lang.Math.min(r4, r13)
            goto L_0x00a1
        L_0x009c:
            r4 = r13
        L_0x009d:
            int r4 = r11.g(r4, r14)
        L_0x00a1:
            r3.d(r4)
        L_0x00a4:
            boolean r4 = r3.f7578j
            if (r4 != 0) goto L_0x00a9
            return
        L_0x00a9:
            int r4 = r3.f7575g
            u.f r6 = r11.f7600i
            u.f r7 = r11.f7599h
            if (r4 != r13) goto L_0x00b8
            r7.d(r2)
            r6.d(r12)
            return
        L_0x00b8:
            t.d r11 = r11.f7594b
            if (r14 != 0) goto L_0x00bf
            float r11 = r11.f7319a0
            goto L_0x00c1
        L_0x00bf:
            float r11 = r11.f7321b0
        L_0x00c1:
            if (r0 != r1) goto L_0x00c8
            int r2 = r0.f7575g
            int r12 = r1.f7575g
            r11 = r5
        L_0x00c8:
            int r12 = r12 - r2
            int r12 = r12 - r4
            float r13 = (float) r2
            float r13 = r13 + r5
            float r12 = (float) r12
            float r12 = r12 * r11
            float r13 = r13 + r12
            int r11 = (int) r13
            r7.d(r11)
            int r11 = r7.f7575g
            int r12 = r3.f7575g
            int r11 = r11 + r12
            r6.d(r11)
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.p.l(t.c, t.c, int):void");
    }
}
