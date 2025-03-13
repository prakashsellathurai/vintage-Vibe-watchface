package u;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t.d;
import t.f;
import t.h;
import u.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final t.e f7563a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7564b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7565c = true;

    /* renamed from: d  reason: collision with root package name */
    public final t.e f7566d;
    public final ArrayList<p> e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public b.C0126b f7567f;

    /* renamed from: g  reason: collision with root package name */
    public final b.a f7568g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<m> f7569h;

    public e(t.e eVar) {
        new ArrayList();
        this.f7567f = null;
        this.f7568g = new b.a();
        this.f7569h = new ArrayList<>();
        this.f7563a = eVar;
        this.f7566d = eVar;
    }

    public final void a(f fVar, int i8, int i9, ArrayList arrayList, m mVar) {
        p pVar = fVar.f7573d;
        if (pVar.f7595c == null) {
            t.e eVar = this.f7563a;
            if (pVar != eVar.f7324d && pVar != eVar.e) {
                if (mVar == null) {
                    mVar = new m(pVar);
                    arrayList.add(mVar);
                }
                pVar.f7595c = mVar;
                mVar.f7585b.add(pVar);
                f fVar2 = pVar.f7599h;
                Iterator it = fVar2.f7579k.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar instanceof f) {
                        a((f) dVar, i8, 0, arrayList, mVar);
                    }
                }
                f fVar3 = pVar.f7600i;
                Iterator it2 = fVar3.f7579k.iterator();
                while (it2.hasNext()) {
                    d dVar2 = (d) it2.next();
                    if (dVar2 instanceof f) {
                        a((f) dVar2, i8, 1, arrayList, mVar);
                    }
                }
                if (i8 == 1 && (pVar instanceof n)) {
                    Iterator it3 = ((n) pVar).f7586k.f7579k.iterator();
                    while (it3.hasNext()) {
                        d dVar3 = (d) it3.next();
                        if (dVar3 instanceof f) {
                            a((f) dVar3, i8, 2, arrayList, mVar);
                        }
                    }
                }
                Iterator it4 = fVar2.f7580l.iterator();
                while (it4.hasNext()) {
                    a((f) it4.next(), i8, 0, arrayList, mVar);
                }
                Iterator it5 = fVar3.f7580l.iterator();
                while (it5.hasNext()) {
                    a((f) it5.next(), i8, 1, arrayList, mVar);
                }
                if (i8 == 1 && (pVar instanceof n)) {
                    Iterator it6 = ((n) pVar).f7586k.f7580l.iterator();
                    while (it6.hasNext()) {
                        a((f) it6.next(), i8, 2, arrayList, mVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        if (r2.f7342n == 0) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(t.e r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList<t.d> r1 = r0.f7370m0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x021d
            java.lang.Object r2 = r1.next()
            t.d r2 = (t.d) r2
            int[] r3 = r2.P
            r4 = 0
            r5 = r3[r4]
            r9 = 1
            r3 = r3[r9]
            int r6 = r2.f7325d0
            r7 = 8
            if (r6 != r7) goto L_0x0025
        L_0x0022:
            r2.f7318a = r9
            goto L_0x0008
        L_0x0025:
            float r6 = r2.r
            r10 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r8 = 2
            r11 = 3
            if (r7 >= 0) goto L_0x0033
            if (r5 != r11) goto L_0x0033
            r2.f7341m = r8
        L_0x0033:
            float r7 = r2.f7348u
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x003d
            if (r3 != r11) goto L_0x003d
            r2.f7342n = r8
        L_0x003d:
            float r12 = r2.T
            r13 = 0
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x0064
            if (r5 != r11) goto L_0x004d
            if (r3 == r8) goto L_0x004a
            if (r3 != r9) goto L_0x004d
        L_0x004a:
            r2.f7341m = r11
            goto L_0x0064
        L_0x004d:
            if (r3 != r11) goto L_0x0054
            if (r5 == r8) goto L_0x0062
            if (r5 != r9) goto L_0x0054
            goto L_0x0062
        L_0x0054:
            if (r5 != r11) goto L_0x0064
            if (r3 != r11) goto L_0x0064
            int r12 = r2.f7341m
            if (r12 != 0) goto L_0x005e
            r2.f7341m = r11
        L_0x005e:
            int r12 = r2.f7342n
            if (r12 != 0) goto L_0x0064
        L_0x0062:
            r2.f7342n = r11
        L_0x0064:
            t.c r12 = r2.G
            t.c r13 = r2.E
            if (r5 != r11) goto L_0x0077
            int r14 = r2.f7341m
            if (r14 != r9) goto L_0x0077
            t.c r14 = r13.f7305f
            if (r14 == 0) goto L_0x0076
            t.c r14 = r12.f7305f
            if (r14 != 0) goto L_0x0077
        L_0x0076:
            r5 = r8
        L_0x0077:
            t.c r14 = r2.H
            t.c r15 = r2.F
            if (r3 != r11) goto L_0x008b
            int r10 = r2.f7342n
            if (r10 != r9) goto L_0x008b
            t.c r10 = r15.f7305f
            if (r10 == 0) goto L_0x0089
            t.c r10 = r14.f7305f
            if (r10 != 0) goto L_0x008b
        L_0x0089:
            r10 = r8
            goto L_0x008c
        L_0x008b:
            r10 = r3
        L_0x008c:
            u.l r3 = r2.f7324d
            r3.f7596d = r5
            int r4 = r2.f7341m
            r3.f7593a = r4
            u.n r3 = r2.e
            r3.f7596d = r10
            int r11 = r2.f7342n
            r3.f7593a = r11
            r3 = 4
            if (r5 == r3) goto L_0x00a3
            if (r5 == r9) goto L_0x00a3
            if (r5 != r8) goto L_0x00ab
        L_0x00a3:
            if (r10 == r3) goto L_0x01d9
            if (r10 == r9) goto L_0x01d9
            if (r10 != r8) goto L_0x00ab
            goto L_0x01d9
        L_0x00ab:
            r12 = 1056964608(0x3f000000, float:0.5)
            int[] r13 = r0.P
            t.c[] r14 = r2.M
            r15 = 3
            if (r5 != r15) goto L_0x011c
            if (r10 == r8) goto L_0x00b8
            if (r10 != r9) goto L_0x011c
        L_0x00b8:
            if (r4 != r15) goto L_0x00d7
            if (r10 != r8) goto L_0x00c6
            r6 = 0
            r8 = 0
            r7 = 2
            r3 = r16
            r4 = r2
            r5 = r7
            r3.f(r4, r5, r6, r7, r8)
        L_0x00c6:
            int r8 = r2.i()
            float r3 = (float) r8
            float r4 = r2.T
            float r3 = r3 * r4
            float r3 = r3 + r12
            int r6 = (int) r3
            r7 = 1
            r3 = r16
            r4 = r2
            r5 = r7
            goto L_0x0202
        L_0x00d7:
            if (r4 != r9) goto L_0x00ed
            r6 = 0
            r8 = 0
            r5 = 2
            r3 = r16
            r4 = r2
            r7 = r10
            r3.f(r4, r5, r6, r7, r8)
            u.l r3 = r2.f7324d
            u.g r3 = r3.e
            int r2 = r2.k()
            goto L_0x01d5
        L_0x00ed:
            if (r4 != r8) goto L_0x0106
            r15 = 0
            r8 = r13[r15]
            if (r8 == r9) goto L_0x00f6
            if (r8 != r3) goto L_0x0114
        L_0x00f6:
            int r3 = r17.k()
            float r3 = (float) r3
            float r6 = r6 * r3
            float r6 = r6 + r12
            int r3 = (int) r6
            int r4 = r2.i()
            r6 = r3
            r8 = r4
            r7 = r10
            goto L_0x0148
        L_0x0106:
            r8 = 0
            r15 = r14[r8]
            t.c r8 = r15.f7305f
            if (r8 == 0) goto L_0x0116
            r8 = r14[r9]
            t.c r8 = r8.f7305f
            if (r8 != 0) goto L_0x0114
            goto L_0x0116
        L_0x0114:
            r8 = 3
            goto L_0x011d
        L_0x0116:
            r7 = r10
            r5 = 2
            r6 = 0
            r8 = 0
            goto L_0x01ff
        L_0x011c:
            r8 = r15
        L_0x011d:
            if (r10 != r8) goto L_0x0188
            r15 = 2
            if (r5 == r15) goto L_0x0124
            if (r5 != r9) goto L_0x0188
        L_0x0124:
            if (r11 != r8) goto L_0x014b
            if (r5 != r15) goto L_0x0132
            r6 = 0
            r8 = 0
            r7 = 2
            r3 = r16
            r4 = r2
            r5 = r7
            r3.f(r4, r5, r6, r7, r8)
        L_0x0132:
            int r3 = r2.k()
            float r4 = r2.T
            int r5 = r2.U
            r6 = -1
            if (r5 != r6) goto L_0x0141
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r5 / r4
        L_0x0141:
            float r5 = (float) r3
            float r5 = r5 * r4
            float r5 = r5 + r12
            int r4 = (int) r5
            r6 = r3
            r8 = r4
            r7 = r9
        L_0x0148:
            r5 = 1
            goto L_0x01ff
        L_0x014b:
            if (r11 != r9) goto L_0x0158
            r6 = 0
            r8 = 0
            r7 = 2
            r3 = r16
            r4 = r2
            r3.f(r4, r5, r6, r7, r8)
            goto L_0x01cd
        L_0x0158:
            r8 = 2
            if (r11 != r8) goto L_0x016e
            r8 = r13[r9]
            if (r8 == r9) goto L_0x0161
            if (r8 != r3) goto L_0x017d
        L_0x0161:
            int r3 = r2.k()
            int r4 = r17.i()
            float r4 = (float) r4
            float r7 = r7 * r4
            float r7 = r7 + r12
            int r4 = (int) r7
            goto L_0x01b5
        L_0x016e:
            r3 = r8
            r8 = r14[r3]
            t.c r3 = r8.f7305f
            if (r3 == 0) goto L_0x017f
            r3 = 3
            r8 = r14[r3]
            t.c r3 = r8.f7305f
            if (r3 != 0) goto L_0x017d
            goto L_0x017f
        L_0x017d:
            r3 = 3
            goto L_0x0189
        L_0x017f:
            r6 = 0
            r8 = 0
            r5 = 2
            r3 = r16
            r4 = r2
            r7 = r10
            goto L_0x0202
        L_0x0188:
            r3 = r8
        L_0x0189:
            if (r5 != r3) goto L_0x0008
            if (r10 != r3) goto L_0x0008
            if (r4 == r9) goto L_0x01b9
            if (r11 != r9) goto L_0x0192
            goto L_0x01b9
        L_0x0192:
            r3 = 2
            if (r11 != r3) goto L_0x0008
            if (r4 != r3) goto L_0x0008
            r3 = 0
            r3 = r13[r3]
            if (r3 == r9) goto L_0x019e
            if (r3 != r9) goto L_0x0008
        L_0x019e:
            r3 = r13[r9]
            if (r3 == r9) goto L_0x01a4
            if (r3 != r9) goto L_0x0008
        L_0x01a4:
            int r3 = r17.k()
            float r3 = (float) r3
            float r6 = r6 * r3
            float r6 = r6 + r12
            int r3 = (int) r6
            int r4 = r17.i()
            float r4 = (float) r4
            float r7 = r7 * r4
            float r7 = r7 + r12
            int r4 = (int) r7
            r5 = r9
        L_0x01b5:
            r6 = r3
            r8 = r4
            r7 = r9
            goto L_0x01ff
        L_0x01b9:
            r6 = 0
            r8 = 0
            r7 = 2
            r3 = r16
            r4 = r2
            r5 = r7
            r3.f(r4, r5, r6, r7, r8)
            u.l r3 = r2.f7324d
            u.g r3 = r3.e
            int r4 = r2.k()
            r3.f7581m = r4
        L_0x01cd:
            u.n r3 = r2.e
            u.g r3 = r3.e
            int r2 = r2.i()
        L_0x01d5:
            r3.f7581m = r2
            goto L_0x0008
        L_0x01d9:
            int r4 = r2.k()
            if (r5 != r3) goto L_0x01ea
            int r4 = r17.k()
            int r5 = r13.f7306g
            int r4 = r4 - r5
            int r5 = r12.f7306g
            int r4 = r4 - r5
            r5 = r9
        L_0x01ea:
            int r6 = r2.i()
            if (r10 != r3) goto L_0x01fc
            int r3 = r17.i()
            int r6 = r15.f7306g
            int r3 = r3 - r6
            int r6 = r14.f7306g
            int r6 = r3 - r6
            r10 = r9
        L_0x01fc:
            r8 = r6
            r7 = r10
            r6 = r4
        L_0x01ff:
            r3 = r16
            r4 = r2
        L_0x0202:
            r3.f(r4, r5, r6, r7, r8)
            u.l r3 = r2.f7324d
            u.g r3 = r3.e
            int r4 = r2.k()
            r3.d(r4)
            u.n r3 = r2.e
            u.g r3 = r3.e
            int r4 = r2.i()
            r3.d(r4)
            goto L_0x0022
        L_0x021d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.e.b(t.e):void");
    }

    public final void c() {
        Object obj;
        ArrayList<p> arrayList = this.e;
        arrayList.clear();
        t.e eVar = this.f7566d;
        eVar.f7324d.f();
        eVar.e.f();
        arrayList.add(eVar.f7324d);
        arrayList.add(eVar.e);
        Iterator<d> it = eVar.f7370m0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            d next = it.next();
            if (next instanceof f) {
                obj = new j(next);
            } else {
                if (next.q()) {
                    if (next.f7320b == null) {
                        next.f7320b = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f7320b);
                } else {
                    arrayList.add(next.f7324d);
                }
                if (next.r()) {
                    if (next.f7322c == null) {
                        next.f7322c = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f7322c);
                } else {
                    arrayList.add(next.e);
                }
                if (next instanceof h) {
                    obj = new k(next);
                }
            }
            arrayList.add(obj);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f7594b != eVar) {
                next2.d();
            }
        }
        ArrayList<m> arrayList2 = this.f7569h;
        arrayList2.clear();
        t.e eVar2 = this.f7563a;
        e(eVar2.f7324d, 0, arrayList2);
        e(eVar2.e, 1, arrayList2);
        this.f7564b = false;
    }

    public final int d(t.e eVar, int i8) {
        ArrayList<m> arrayList;
        int i9;
        int i10;
        long j8;
        long j9;
        long j10;
        long j11;
        float f9;
        t.e eVar2 = eVar;
        int i11 = i8;
        ArrayList<m> arrayList2 = this.f7569h;
        int size = arrayList2.size();
        int i12 = 0;
        long j12 = 0;
        long j13 = 0;
        while (i12 < size) {
            p pVar = arrayList2.get(i12).f7584a;
            if (!(pVar instanceof c) ? i11 != 0 ? (pVar instanceof n) : (pVar instanceof l) : ((c) pVar).f7597f == i11) {
                f fVar = (i11 == 0 ? eVar2.f7324d : eVar2.e).f7599h;
                f fVar2 = (i11 == 0 ? eVar2.f7324d : eVar2.e).f7600i;
                boolean contains = pVar.f7599h.f7580l.contains(fVar);
                f fVar3 = pVar.f7600i;
                boolean contains2 = fVar3.f7580l.contains(fVar2);
                long j14 = pVar.j();
                f fVar4 = pVar.f7599h;
                if (!contains || !contains2) {
                    arrayList = arrayList2;
                    i10 = size;
                    i9 = i12;
                    if (contains) {
                        j11 = m.b(fVar4, (long) fVar4.f7574f);
                        j10 = ((long) fVar4.f7574f) + j14;
                    } else if (contains2) {
                        long a9 = m.a(fVar3, (long) fVar3.f7574f);
                        j10 = ((long) (-fVar3.f7574f)) + j14;
                        j11 = -a9;
                    } else {
                        j9 = ((long) fVar4.f7574f) + pVar.j();
                    }
                    j8 = Math.max(j11, j10);
                } else {
                    long b9 = m.b(fVar4, j12);
                    arrayList = arrayList2;
                    long a10 = m.a(fVar3, j12);
                    long j15 = b9 - j14;
                    int i13 = fVar3.f7574f;
                    i10 = size;
                    i9 = i12;
                    if (j15 >= ((long) (-i13))) {
                        j15 += (long) i13;
                    }
                    long j16 = (long) fVar4.f7574f;
                    long j17 = ((-a10) - j14) - j16;
                    if (j17 >= j16) {
                        j17 -= j16;
                    }
                    d dVar = pVar.f7594b;
                    if (i11 == 0) {
                        f9 = dVar.f7319a0;
                    } else if (i11 == 1) {
                        f9 = dVar.f7321b0;
                    } else {
                        dVar.getClass();
                        f9 = -1.0f;
                    }
                    float f10 = (float) (f9 > 0.0f ? (long) ((((float) j17) / f9) + (((float) j15) / (1.0f - f9))) : 0);
                    j9 = ((long) fVar4.f7574f) + ((long) ((f10 * f9) + 0.5f)) + j14 + ((long) ((f10 * (1.0f - f9)) + 0.5f));
                }
                j8 = j9 - ((long) fVar3.f7574f);
            } else {
                arrayList = arrayList2;
                i10 = size;
                i9 = i12;
                j8 = j12;
            }
            j13 = Math.max(j13, j8);
            i12 = i9 + 1;
            arrayList2 = arrayList;
            eVar2 = eVar;
            size = i10;
            j12 = 0;
        }
        return (int) j13;
    }

    public final void e(p pVar, int i8, ArrayList<m> arrayList) {
        f fVar;
        f fVar2;
        f fVar3;
        Iterator it = pVar.f7599h.f7579k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = pVar.f7600i;
            if (!hasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                fVar3 = (f) dVar;
            } else if (dVar instanceof p) {
                fVar3 = ((p) dVar).f7599h;
            }
            a(fVar3, i8, 0, arrayList, (m) null);
        }
        Iterator it2 = fVar.f7579k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                fVar2 = (f) dVar2;
            } else if (dVar2 instanceof p) {
                fVar2 = ((p) dVar2).f7600i;
            }
            a(fVar2, i8, 1, arrayList, (m) null);
        }
        if (i8 == 1) {
            Iterator it3 = ((n) pVar).f7586k.f7579k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    a((f) dVar3, i8, 2, arrayList, (m) null);
                }
            }
        }
    }

    public final void f(d dVar, int i8, int i9, int i10, int i11) {
        b.a aVar = this.f7568g;
        aVar.f7552a = i8;
        aVar.f7553b = i10;
        aVar.f7554c = i9;
        aVar.f7555d = i11;
        ((ConstraintLayout.b) this.f7567f).b(dVar, aVar);
        dVar.C(aVar.e);
        dVar.z(aVar.f7556f);
        dVar.f7351z = aVar.f7558h;
        int i12 = aVar.f7557g;
        dVar.X = i12;
        dVar.f7351z = i12 > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        if (r10 == 3) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0086, code lost:
        if (r8 == 3) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008b, code lost:
        r2.d(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r13 = this;
            t.e r0 = r13.f7563a
            java.util.ArrayList<t.d> r0 = r0.f7370m0
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a1
            java.lang.Object r1 = r0.next()
            t.d r1 = (t.d) r1
            boolean r2 = r1.f7318a
            if (r2 == 0) goto L_0x0019
            goto L_0x0008
        L_0x0019:
            int[] r2 = r1.P
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f7341m
            int r4 = r1.f7342n
            r5 = 2
            r11 = 3
            if (r8 == r5) goto L_0x0030
            if (r8 != r11) goto L_0x002e
            if (r2 != r9) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r2 = r3
            goto L_0x0031
        L_0x0030:
            r2 = r9
        L_0x0031:
            if (r10 == r5) goto L_0x0037
            if (r10 != r11) goto L_0x0038
            if (r4 != r9) goto L_0x0038
        L_0x0037:
            r3 = r9
        L_0x0038:
            u.l r4 = r1.f7324d
            u.g r4 = r4.e
            boolean r5 = r4.f7578j
            u.n r6 = r1.e
            u.g r6 = r6.e
            boolean r7 = r6.f7578j
            r12 = 1
            if (r5 == 0) goto L_0x0055
            if (r7 == 0) goto L_0x0055
            int r5 = r4.f7575g
            int r7 = r6.f7575g
            r6 = 1
            r2 = r13
            r3 = r1
            r4 = r6
            r2.f(r3, r4, r5, r6, r7)
            goto L_0x008e
        L_0x0055:
            if (r5 == 0) goto L_0x006f
            if (r3 == 0) goto L_0x006f
            int r5 = r4.f7575g
            int r7 = r6.f7575g
            r4 = 1
            r6 = 2
            r2 = r13
            r3 = r1
            r2.f(r3, r4, r5, r6, r7)
            u.n r2 = r1.e
            u.g r2 = r2.e
            int r3 = r1.i()
            if (r10 != r11) goto L_0x008b
            goto L_0x0088
        L_0x006f:
            if (r7 == 0) goto L_0x0090
            if (r2 == 0) goto L_0x0090
            int r5 = r4.f7575g
            int r7 = r6.f7575g
            r4 = 2
            r2 = r13
            r3 = r1
            r6 = r12
            r2.f(r3, r4, r5, r6, r7)
            u.l r2 = r1.f7324d
            u.g r2 = r2.e
            int r3 = r1.k()
            if (r8 != r11) goto L_0x008b
        L_0x0088:
            r2.f7581m = r3
            goto L_0x0090
        L_0x008b:
            r2.d(r3)
        L_0x008e:
            r1.f7318a = r9
        L_0x0090:
            boolean r2 = r1.f7318a
            if (r2 == 0) goto L_0x0008
            u.n r2 = r1.e
            u.a r2 = r2.f7587l
            if (r2 == 0) goto L_0x0008
            int r1 = r1.X
            r2.d(r1)
            goto L_0x0008
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.e.g():void");
    }
}
