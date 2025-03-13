package t;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import k3.j;
import s.d;
import u.b;

public final class e extends j {
    public boolean A0 = false;
    public WeakReference<c> B0 = null;
    public WeakReference<c> C0 = null;
    public WeakReference<c> D0 = null;
    public WeakReference<c> E0 = null;
    public final b.a F0 = new b.a();

    /* renamed from: n0  reason: collision with root package name */
    public final b f7352n0 = new b(this);

    /* renamed from: o0  reason: collision with root package name */
    public final u.e f7353o0 = new u.e(this);

    /* renamed from: p0  reason: collision with root package name */
    public b.C0126b f7354p0 = null;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f7355q0 = false;

    /* renamed from: r0  reason: collision with root package name */
    public final d f7356r0 = new d();
    public int s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f7357t0;
    public int u0 = 0;

    /* renamed from: v0  reason: collision with root package name */
    public int f7358v0 = 0;

    /* renamed from: w0  reason: collision with root package name */
    public b[] f7359w0 = new b[4];

    /* renamed from: x0  reason: collision with root package name */
    public b[] f7360x0 = new b[4];
    public int y0 = 257;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f7361z0 = false;

    public static void K(d dVar, b.C0126b bVar, b.a aVar) {
        int i8;
        int i9;
        if (bVar != null) {
            int[] iArr = dVar.P;
            aVar.f7552a = iArr[0];
            boolean z8 = true;
            aVar.f7553b = iArr[1];
            aVar.f7554c = dVar.k();
            aVar.f7555d = dVar.i();
            aVar.f7559i = false;
            aVar.f7560j = 0;
            boolean z9 = aVar.f7552a == 3;
            boolean z10 = aVar.f7553b == 3;
            boolean z11 = z9 && dVar.T > 0.0f;
            boolean z12 = z10 && dVar.T > 0.0f;
            if (z9 && dVar.n(0) && dVar.f7341m == 0 && !z11) {
                aVar.f7552a = 2;
                if (z10 && dVar.f7342n == 0) {
                    aVar.f7552a = 1;
                }
                z9 = false;
            }
            if (z10 && dVar.n(1) && dVar.f7342n == 0 && !z12) {
                aVar.f7553b = 2;
                if (z9 && dVar.f7341m == 0) {
                    aVar.f7553b = 1;
                }
                z10 = false;
            }
            if (dVar.t()) {
                aVar.f7552a = 1;
                z9 = false;
            }
            if (dVar.u()) {
                aVar.f7553b = 1;
                z10 = false;
            }
            int[] iArr2 = dVar.f7343o;
            if (z11) {
                if (iArr2[0] == 4) {
                    aVar.f7552a = 1;
                } else if (!z10) {
                    if (aVar.f7553b == 1) {
                        i9 = aVar.f7555d;
                    } else {
                        aVar.f7552a = 2;
                        ((ConstraintLayout.b) bVar).b(dVar, aVar);
                        i9 = aVar.f7556f;
                    }
                    aVar.f7552a = 1;
                    int i10 = dVar.U;
                    aVar.f7554c = (int) ((i10 == 0 || i10 == -1) ? dVar.T * ((float) i9) : dVar.T / ((float) i9));
                }
            }
            if (z12) {
                if (iArr2[1] == 4) {
                    aVar.f7553b = 1;
                } else if (!z9) {
                    if (aVar.f7552a == 1) {
                        i8 = aVar.f7554c;
                    } else {
                        aVar.f7553b = 2;
                        ((ConstraintLayout.b) bVar).b(dVar, aVar);
                        i8 = aVar.e;
                    }
                    aVar.f7553b = 1;
                    int i11 = dVar.U;
                    aVar.f7555d = (int) ((i11 == 0 || i11 == -1) ? ((float) i8) / dVar.T : ((float) i8) * dVar.T);
                }
            }
            ((ConstraintLayout.b) bVar).b(dVar, aVar);
            dVar.C(aVar.e);
            dVar.z(aVar.f7556f);
            dVar.f7351z = aVar.f7558h;
            int i12 = aVar.f7557g;
            dVar.X = i12;
            if (i12 <= 0) {
                z8 = false;
            }
            dVar.f7351z = z8;
            aVar.f7560j = 0;
        }
    }

    public final void D(boolean z8, boolean z9) {
        super.D(z8, z9);
        int size = this.f7370m0.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.f7370m0.get(i8).D(z8, z9);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v89, resolved type: t.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v90, resolved type: t.a} */
    /* JADX WARNING: type inference failed for: r6v4, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x05f8  */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x064f  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x0665  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0695  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0697  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x06a2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x06b5  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x06b7  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x06c1  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x06de  */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x07cb  */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x07f3  */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x0812  */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x086f  */
    /* JADX WARNING: Removed duplicated region for block: B:502:0x0882  */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x088d  */
    /* JADX WARNING: Removed duplicated region for block: B:506:0x08a0  */
    /* JADX WARNING: Removed duplicated region for block: B:507:0x08a8  */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x08ad  */
    /* JADX WARNING: Removed duplicated region for block: B:521:0x08db  */
    /* JADX WARNING: Removed duplicated region for block: B:526:0x08e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F() {
        /*
            r29 = this;
            r1 = r29
            r2 = 0
            r1.V = r2
            r1.W = r2
            r1.f7361z0 = r2
            r1.A0 = r2
            java.util.ArrayList<t.d> r0 = r1.f7370m0
            int r3 = r0.size()
            int r0 = r29.k()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r29.i()
            int r4 = java.lang.Math.max(r2, r4)
            int[] r5 = r1.P
            r6 = 1
            r7 = r5[r6]
            r8 = r5[r2]
            int r9 = r1.y0
            boolean r9 = k3.j.r(r9, r6)
            t.c r11 = r1.F
            t.c r12 = r1.E
            if (r9 == 0) goto L_0x0280
            u.b$b r9 = r1.f7354p0
            r13 = r5[r2]
            r14 = r5[r6]
            r1.f7333i = r2
            r1.f7335j = r2
            java.util.ArrayList<t.c> r15 = r1.N
            int r10 = r15.size()
            r6 = r2
        L_0x0045:
            if (r6 >= r10) goto L_0x005a
            java.lang.Object r17 = r15.get(r6)
            r18 = r10
            r10 = r17
            t.c r10 = (t.c) r10
            r10.f7303c = r2
            r10.f7302b = r2
            int r6 = r6 + 1
            r10 = r18
            goto L_0x0045
        L_0x005a:
            java.util.ArrayList<t.d> r6 = r1.f7370m0
            int r10 = r6.size()
            r15 = r2
        L_0x0061:
            if (r15 >= r10) goto L_0x009c
            java.lang.Object r17 = r6.get(r15)
            r18 = r4
            r4 = r17
            t.d r4 = (t.d) r4
            r4.f7333i = r2
            r4.f7335j = r2
            java.util.ArrayList<t.c> r4 = r4.N
            int r2 = r4.size()
            r19 = r0
            r0 = 0
        L_0x007a:
            if (r0 >= r2) goto L_0x0094
            java.lang.Object r20 = r4.get(r0)
            r21 = r2
            r2 = r20
            t.c r2 = (t.c) r2
            r20 = r4
            r4 = 0
            r2.f7303c = r4
            r2.f7302b = r4
            int r0 = r0 + 1
            r4 = r20
            r2 = r21
            goto L_0x007a
        L_0x0094:
            int r15 = r15 + 1
            r4 = r18
            r0 = r19
            r2 = 0
            goto L_0x0061
        L_0x009c:
            r19 = r0
            r18 = r4
            boolean r0 = r1.f7355q0
            r2 = 1
            if (r13 != r2) goto L_0x00ae
            int r2 = r29.k()
            r4 = 0
            r1.x(r4, r2)
            goto L_0x00b4
        L_0x00ae:
            r4 = 0
            r12.i(r4)
            r1.V = r4
        L_0x00b4:
            r2 = 0
            r4 = 0
            r13 = 0
        L_0x00b7:
            r20 = 1056964608(0x3f000000, float:0.5)
            if (r4 >= r10) goto L_0x011b
            java.lang.Object r21 = r6.get(r4)
            r15 = r21
            t.d r15 = (t.d) r15
            r21 = r12
            boolean r12 = r15 instanceof t.f
            if (r12 == 0) goto L_0x0105
            t.f r15 = (t.f) r15
            int r12 = r15.f7366q0
            r22 = r5
            r5 = 1
            if (r12 != r5) goto L_0x0114
            int r2 = r15.f7363n0
            r5 = -1
            if (r2 == r5) goto L_0x00d8
            goto L_0x00fb
        L_0x00d8:
            int r2 = r15.f7364o0
            if (r2 == r5) goto L_0x00ea
            boolean r2 = r29.t()
            if (r2 == 0) goto L_0x00ea
            int r2 = r29.k()
            int r5 = r15.f7364o0
            int r2 = r2 - r5
            goto L_0x00fb
        L_0x00ea:
            boolean r2 = r29.t()
            if (r2 == 0) goto L_0x0103
            float r2 = r15.f7362m0
            int r5 = r29.k()
            float r5 = (float) r5
            float r2 = r2 * r5
            float r2 = r2 + r20
            int r2 = (int) r2
        L_0x00fb:
            t.c r5 = r15.f7365p0
            r5.i(r2)
            r2 = 1
            r15.f7367r0 = r2
        L_0x0103:
            r2 = 1
            goto L_0x0114
        L_0x0105:
            r22 = r5
            boolean r5 = r15 instanceof t.a
            if (r5 == 0) goto L_0x0114
            t.a r15 = (t.a) r15
            int r5 = r15.H()
            if (r5 != 0) goto L_0x0114
            r13 = 1
        L_0x0114:
            int r4 = r4 + 1
            r12 = r21
            r5 = r22
            goto L_0x00b7
        L_0x011b:
            r22 = r5
            r21 = r12
            if (r2 == 0) goto L_0x013b
            r2 = 0
        L_0x0122:
            if (r2 >= r10) goto L_0x013b
            java.lang.Object r4 = r6.get(r2)
            t.d r4 = (t.d) r4
            boolean r5 = r4 instanceof t.f
            if (r5 == 0) goto L_0x0138
            t.f r4 = (t.f) r4
            int r5 = r4.f7366q0
            r12 = 1
            if (r5 != r12) goto L_0x0138
            u.h.b(r4, r9, r0)
        L_0x0138:
            int r2 = r2 + 1
            goto L_0x0122
        L_0x013b:
            u.h.b(r1, r9, r0)
            if (r13 == 0) goto L_0x0161
            r2 = 0
        L_0x0141:
            if (r2 >= r10) goto L_0x0161
            java.lang.Object r4 = r6.get(r2)
            t.d r4 = (t.d) r4
            boolean r5 = r4 instanceof t.a
            if (r5 == 0) goto L_0x015e
            t.a r4 = (t.a) r4
            int r5 = r4.H()
            if (r5 != 0) goto L_0x015e
            boolean r5 = r4.G()
            if (r5 == 0) goto L_0x015e
            u.h.b(r4, r9, r0)
        L_0x015e:
            int r2 = r2 + 1
            goto L_0x0141
        L_0x0161:
            r2 = 1
            if (r14 != r2) goto L_0x016d
            int r2 = r29.i()
            r4 = 0
            r1.y(r4, r2)
            goto L_0x0173
        L_0x016d:
            r4 = 0
            r11.i(r4)
            r1.W = r4
        L_0x0173:
            r2 = 0
            r4 = 0
            r5 = 0
        L_0x0176:
            if (r5 >= r10) goto L_0x01d1
            java.lang.Object r12 = r6.get(r5)
            t.d r12 = (t.d) r12
            boolean r13 = r12 instanceof t.f
            if (r13 == 0) goto L_0x01bf
            t.f r12 = (t.f) r12
            int r13 = r12.f7366q0
            if (r13 != 0) goto L_0x01bd
            int r2 = r12.f7363n0
            r13 = -1
            if (r2 == r13) goto L_0x018e
            goto L_0x01b1
        L_0x018e:
            int r2 = r12.f7364o0
            if (r2 == r13) goto L_0x01a0
            boolean r2 = r29.u()
            if (r2 == 0) goto L_0x01a0
            int r2 = r29.i()
            int r14 = r12.f7364o0
            int r2 = r2 - r14
            goto L_0x01b1
        L_0x01a0:
            boolean r2 = r29.u()
            if (r2 == 0) goto L_0x01ba
            float r2 = r12.f7362m0
            int r14 = r29.i()
            float r14 = (float) r14
            float r2 = r2 * r14
            float r2 = r2 + r20
            int r2 = (int) r2
        L_0x01b1:
            t.c r14 = r12.f7365p0
            r14.i(r2)
            r14 = 1
            r12.f7367r0 = r14
            goto L_0x01bb
        L_0x01ba:
            r14 = 1
        L_0x01bb:
            r2 = r14
            goto L_0x01ce
        L_0x01bd:
            r13 = -1
            goto L_0x01ce
        L_0x01bf:
            r13 = -1
            r14 = 1
            boolean r15 = r12 instanceof t.a
            if (r15 == 0) goto L_0x01ce
            t.a r12 = (t.a) r12
            int r12 = r12.H()
            if (r12 != r14) goto L_0x01ce
            r4 = 1
        L_0x01ce:
            int r5 = r5 + 1
            goto L_0x0176
        L_0x01d1:
            if (r2 == 0) goto L_0x01ec
            r2 = 0
        L_0x01d4:
            if (r2 >= r10) goto L_0x01ec
            java.lang.Object r5 = r6.get(r2)
            t.d r5 = (t.d) r5
            boolean r12 = r5 instanceof t.f
            if (r12 == 0) goto L_0x01e9
            t.f r5 = (t.f) r5
            int r12 = r5.f7366q0
            if (r12 != 0) goto L_0x01e9
            u.h.g(r5, r9)
        L_0x01e9:
            int r2 = r2 + 1
            goto L_0x01d4
        L_0x01ec:
            u.h.g(r1, r9)
            if (r4 == 0) goto L_0x0213
            r2 = 0
        L_0x01f2:
            if (r2 >= r10) goto L_0x0213
            java.lang.Object r4 = r6.get(r2)
            t.d r4 = (t.d) r4
            boolean r5 = r4 instanceof t.a
            if (r5 == 0) goto L_0x0210
            t.a r4 = (t.a) r4
            int r5 = r4.H()
            r12 = 1
            if (r5 != r12) goto L_0x0210
            boolean r5 = r4.G()
            if (r5 == 0) goto L_0x0210
            u.h.g(r4, r9)
        L_0x0210:
            int r2 = r2 + 1
            goto L_0x01f2
        L_0x0213:
            r2 = 0
        L_0x0214:
            if (r2 >= r10) goto L_0x0236
            java.lang.Object r4 = r6.get(r2)
            t.d r4 = (t.d) r4
            boolean r5 = r4.s()
            if (r5 == 0) goto L_0x0233
            boolean r5 = u.h.a(r4)
            if (r5 == 0) goto L_0x0233
            u.b$a r5 = u.h.f7582a
            K(r4, r9, r5)
            u.h.b(r4, r9, r0)
            u.h.g(r4, r9)
        L_0x0233:
            int r2 = r2 + 1
            goto L_0x0214
        L_0x0236:
            r0 = 0
        L_0x0237:
            if (r0 >= r3) goto L_0x0288
            java.util.ArrayList<t.d> r2 = r1.f7370m0
            java.lang.Object r2 = r2.get(r0)
            t.d r2 = (t.d) r2
            boolean r4 = r2.s()
            if (r4 == 0) goto L_0x027d
            boolean r4 = r2 instanceof t.f
            if (r4 != 0) goto L_0x027d
            boolean r4 = r2 instanceof t.a
            if (r4 != 0) goto L_0x027d
            boolean r4 = r2 instanceof t.i
            if (r4 != 0) goto L_0x027d
            boolean r4 = r2.B
            if (r4 != 0) goto L_0x027d
            r4 = 0
            int r5 = r2.h(r4)
            r4 = 1
            int r6 = r2.h(r4)
            r9 = 3
            if (r5 != r9) goto L_0x0270
            int r5 = r2.f7341m
            if (r5 == r4) goto L_0x0270
            if (r6 != r9) goto L_0x0270
            int r5 = r2.f7342n
            if (r5 == r4) goto L_0x0270
            r4 = 1
            goto L_0x0271
        L_0x0270:
            r4 = 0
        L_0x0271:
            if (r4 != 0) goto L_0x027d
            u.b$a r4 = new u.b$a
            r4.<init>()
            u.b$b r5 = r1.f7354p0
            K(r2, r5, r4)
        L_0x027d:
            int r0 = r0 + 1
            goto L_0x0237
        L_0x0280:
            r19 = r0
            r18 = r4
            r22 = r5
            r21 = r12
        L_0x0288:
            s.d r2 = r1.f7356r0
            r4 = 2
            if (r3 <= r4) goto L_0x0675
            if (r8 == r4) goto L_0x0291
            if (r7 != r4) goto L_0x0675
        L_0x0291:
            int r0 = r1.y0
            r6 = 1024(0x400, float:1.435E-42)
            boolean r0 = k3.j.r(r0, r6)
            if (r0 == 0) goto L_0x0675
            u.b$b r0 = r1.f7354p0
            java.util.ArrayList<t.d> r6 = r1.f7370m0
            int r9 = r6.size()
            r10 = 0
        L_0x02a4:
            if (r10 >= r9) goto L_0x02ce
            java.lang.Object r12 = r6.get(r10)
            t.d r12 = (t.d) r12
            r13 = 0
            r14 = r22[r13]
            r15 = 1
            r4 = r22[r15]
            int[] r12 = r12.P
            r5 = r12[r13]
            r12 = r12[r15]
            boolean r4 = u.i.b(r14, r4, r5, r12)
            if (r4 != 0) goto L_0x02ca
            r23 = r3
            r25 = r7
            r26 = r8
            r24 = r11
            r0 = 0
            r8 = r2
            goto L_0x062a
        L_0x02ca:
            int r10 = r10 + 1
            r4 = 2
            goto L_0x02a4
        L_0x02ce:
            r4 = 0
            r5 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x02d5:
            if (r4 >= r9) goto L_0x03b6
            java.lang.Object r23 = r6.get(r4)
            r24 = r11
            r11 = r23
            t.d r11 = (t.d) r11
            r23 = r3
            r17 = 0
            r3 = r22[r17]
            r25 = r7
            r16 = 1
            r7 = r22[r16]
            r26 = r8
            int[] r8 = r11.P
            r27 = r2
            r2 = r8[r17]
            r8 = r8[r16]
            boolean r2 = u.i.b(r3, r7, r2, r8)
            if (r2 != 0) goto L_0x0302
            u.b$a r2 = r1.F0
            K(r11, r0, r2)
        L_0x0302:
            boolean r2 = r11 instanceof t.f
            if (r2 == 0) goto L_0x0327
            r3 = r11
            t.f r3 = (t.f) r3
            int r7 = r3.f7366q0
            if (r7 != 0) goto L_0x0318
            if (r12 != 0) goto L_0x0315
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r12 = r7
        L_0x0315:
            r12.add(r3)
        L_0x0318:
            int r7 = r3.f7366q0
            r8 = 1
            if (r7 != r8) goto L_0x0327
            if (r5 != 0) goto L_0x0324
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0324:
            r5.add(r3)
        L_0x0327:
            boolean r3 = r11 instanceof t.h
            if (r3 == 0) goto L_0x036a
            boolean r3 = r11 instanceof t.a
            if (r3 == 0) goto L_0x0352
            r3 = r11
            t.a r3 = (t.a) r3
            int r7 = r3.H()
            if (r7 != 0) goto L_0x0343
            if (r10 != 0) goto L_0x0340
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r10 = r7
        L_0x0340:
            r10.add(r3)
        L_0x0343:
            int r7 = r3.H()
            r8 = 1
            if (r7 != r8) goto L_0x036a
            if (r13 != 0) goto L_0x0367
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            goto L_0x0366
        L_0x0352:
            r3 = r11
            t.h r3 = (t.h) r3
            if (r10 != 0) goto L_0x035c
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x035c:
            r10.add(r3)
            if (r13 != 0) goto L_0x0367
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0366:
            r13 = r7
        L_0x0367:
            r13.add(r3)
        L_0x036a:
            t.c r3 = r11.E
            t.c r3 = r3.f7305f
            if (r3 != 0) goto L_0x0386
            t.c r3 = r11.G
            t.c r3 = r3.f7305f
            if (r3 != 0) goto L_0x0386
            if (r2 != 0) goto L_0x0386
            boolean r3 = r11 instanceof t.a
            if (r3 != 0) goto L_0x0386
            if (r14 != 0) goto L_0x0383
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x0383:
            r14.add(r11)
        L_0x0386:
            t.c r3 = r11.F
            t.c r3 = r3.f7305f
            if (r3 != 0) goto L_0x03a8
            t.c r3 = r11.H
            t.c r3 = r3.f7305f
            if (r3 != 0) goto L_0x03a8
            t.c r3 = r11.I
            t.c r3 = r3.f7305f
            if (r3 != 0) goto L_0x03a8
            if (r2 != 0) goto L_0x03a8
            boolean r2 = r11 instanceof t.a
            if (r2 != 0) goto L_0x03a8
            if (r15 != 0) goto L_0x03a5
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L_0x03a5:
            r15.add(r11)
        L_0x03a8:
            int r4 = r4 + 1
            r3 = r23
            r11 = r24
            r7 = r25
            r8 = r26
            r2 = r27
            goto L_0x02d5
        L_0x03b6:
            r27 = r2
            r23 = r3
            r25 = r7
            r26 = r8
            r24 = r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r5 == 0) goto L_0x03dd
            java.util.Iterator r2 = r5.iterator()
        L_0x03cb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03dd
            java.lang.Object r3 = r2.next()
            t.f r3 = (t.f) r3
            r4 = 0
            r5 = 0
            u.i.a(r3, r5, r0, r4)
            goto L_0x03cb
        L_0x03dd:
            r4 = 0
            r5 = 0
            if (r10 == 0) goto L_0x03fe
            java.util.Iterator r2 = r10.iterator()
        L_0x03e5:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03fe
            java.lang.Object r3 = r2.next()
            t.h r3 = (t.h) r3
            u.o r7 = u.i.a(r3, r5, r0, r4)
            r3.F(r5, r7, r0)
            r7.a(r0)
            r4 = 0
            r5 = 0
            goto L_0x03e5
        L_0x03fe:
            t.c$a r2 = t.c.a.f7309f
            t.c r2 = r1.g(r2)
            java.util.HashSet<t.c> r2 = r2.f7301a
            if (r2 == 0) goto L_0x0420
            java.util.Iterator r2 = r2.iterator()
        L_0x040c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.next()
            t.c r3 = (t.c) r3
            t.d r3 = r3.f7304d
            r4 = 0
            r5 = 0
            u.i.a(r3, r5, r0, r4)
            goto L_0x040c
        L_0x0420:
            t.c$a r2 = t.c.a.f7311h
            t.c r2 = r1.g(r2)
            java.util.HashSet<t.c> r2 = r2.f7301a
            if (r2 == 0) goto L_0x0442
            java.util.Iterator r2 = r2.iterator()
        L_0x042e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0442
            java.lang.Object r3 = r2.next()
            t.c r3 = (t.c) r3
            t.d r3 = r3.f7304d
            r4 = 0
            r5 = 0
            u.i.a(r3, r5, r0, r4)
            goto L_0x042e
        L_0x0442:
            t.c$a r2 = t.c.a.f7314k
            t.c r3 = r1.g(r2)
            java.util.HashSet<t.c> r3 = r3.f7301a
            if (r3 == 0) goto L_0x0464
            java.util.Iterator r3 = r3.iterator()
        L_0x0450:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0464
            java.lang.Object r4 = r3.next()
            t.c r4 = (t.c) r4
            t.d r4 = r4.f7304d
            r5 = 0
            r7 = 0
            u.i.a(r4, r7, r0, r5)
            goto L_0x0450
        L_0x0464:
            r5 = 0
            r7 = 0
            if (r14 == 0) goto L_0x047c
            java.util.Iterator r3 = r14.iterator()
        L_0x046c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x047c
            java.lang.Object r4 = r3.next()
            t.d r4 = (t.d) r4
            u.i.a(r4, r7, r0, r5)
            goto L_0x046c
        L_0x047c:
            if (r12 == 0) goto L_0x0493
            java.util.Iterator r3 = r12.iterator()
        L_0x0482:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0493
            java.lang.Object r4 = r3.next()
            t.f r4 = (t.f) r4
            r7 = 1
            u.i.a(r4, r7, r0, r5)
            goto L_0x0482
        L_0x0493:
            r7 = 1
            if (r13 == 0) goto L_0x04b3
            java.util.Iterator r3 = r13.iterator()
        L_0x049a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04b3
            java.lang.Object r4 = r3.next()
            t.h r4 = (t.h) r4
            u.o r8 = u.i.a(r4, r7, r0, r5)
            r4.F(r7, r8, r0)
            r8.a(r0)
            r5 = 0
            r7 = 1
            goto L_0x049a
        L_0x04b3:
            t.c$a r3 = t.c.a.f7310g
            t.c r3 = r1.g(r3)
            java.util.HashSet<t.c> r3 = r3.f7301a
            if (r3 == 0) goto L_0x04d5
            java.util.Iterator r3 = r3.iterator()
        L_0x04c1:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04d5
            java.lang.Object r4 = r3.next()
            t.c r4 = (t.c) r4
            t.d r4 = r4.f7304d
            r5 = 0
            r7 = 1
            u.i.a(r4, r7, r0, r5)
            goto L_0x04c1
        L_0x04d5:
            t.c$a r3 = t.c.a.f7313j
            t.c r3 = r1.g(r3)
            java.util.HashSet<t.c> r3 = r3.f7301a
            if (r3 == 0) goto L_0x04f7
            java.util.Iterator r3 = r3.iterator()
        L_0x04e3:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04f7
            java.lang.Object r4 = r3.next()
            t.c r4 = (t.c) r4
            t.d r4 = r4.f7304d
            r5 = 0
            r7 = 1
            u.i.a(r4, r7, r0, r5)
            goto L_0x04e3
        L_0x04f7:
            t.c$a r3 = t.c.a.f7312i
            t.c r3 = r1.g(r3)
            java.util.HashSet<t.c> r3 = r3.f7301a
            if (r3 == 0) goto L_0x0519
            java.util.Iterator r3 = r3.iterator()
        L_0x0505:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0519
            java.lang.Object r4 = r3.next()
            t.c r4 = (t.c) r4
            t.d r4 = r4.f7304d
            r5 = 0
            r7 = 1
            u.i.a(r4, r7, r0, r5)
            goto L_0x0505
        L_0x0519:
            t.c r2 = r1.g(r2)
            java.util.HashSet<t.c> r2 = r2.f7301a
            if (r2 == 0) goto L_0x0539
            java.util.Iterator r2 = r2.iterator()
        L_0x0525:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0539
            java.lang.Object r3 = r2.next()
            t.c r3 = (t.c) r3
            t.d r3 = r3.f7304d
            r4 = 0
            r5 = 1
            u.i.a(r3, r5, r0, r4)
            goto L_0x0525
        L_0x0539:
            r4 = 0
            r5 = 1
            if (r15 == 0) goto L_0x0551
            java.util.Iterator r2 = r15.iterator()
        L_0x0541:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0551
            java.lang.Object r3 = r2.next()
            t.d r3 = (t.d) r3
            u.i.a(r3, r5, r0, r4)
            goto L_0x0541
        L_0x0551:
            r2 = 0
        L_0x0552:
            if (r2 >= r9) goto L_0x05ad
            java.lang.Object r3 = r6.get(r2)
            t.d r3 = (t.d) r3
            int[] r4 = r3.P
            r7 = 0
            r8 = r4[r7]
            r7 = 3
            if (r8 != r7) goto L_0x0568
            r4 = r4[r5]
            if (r4 != r7) goto L_0x0568
            r4 = 1
            goto L_0x0569
        L_0x0568:
            r4 = 0
        L_0x0569:
            if (r4 == 0) goto L_0x05a9
            int r4 = r3.f7338k0
            int r5 = r0.size()
            r8 = 0
        L_0x0572:
            if (r8 >= r5) goto L_0x0582
            java.lang.Object r10 = r0.get(r8)
            u.o r10 = (u.o) r10
            int r11 = r10.f7590b
            if (r4 != r11) goto L_0x057f
            goto L_0x0583
        L_0x057f:
            int r8 = r8 + 1
            goto L_0x0572
        L_0x0582:
            r10 = 0
        L_0x0583:
            int r3 = r3.f7340l0
            int r4 = r0.size()
            r5 = 0
        L_0x058a:
            if (r5 >= r4) goto L_0x059a
            java.lang.Object r8 = r0.get(r5)
            u.o r8 = (u.o) r8
            int r11 = r8.f7590b
            if (r3 != r11) goto L_0x0597
            goto L_0x059b
        L_0x0597:
            int r5 = r5 + 1
            goto L_0x058a
        L_0x059a:
            r8 = 0
        L_0x059b:
            if (r10 == 0) goto L_0x05a9
            if (r8 == 0) goto L_0x05a9
            r3 = 0
            r10.c(r3, r8)
            r3 = 2
            r8.f7591c = r3
            r0.remove(r10)
        L_0x05a9:
            int r2 = r2 + 1
            r5 = 1
            goto L_0x0552
        L_0x05ad:
            int r2 = r0.size()
            r3 = 1
            if (r2 > r3) goto L_0x05b8
            r8 = r27
            goto L_0x0627
        L_0x05b8:
            r2 = 0
            r4 = r22[r2]
            r5 = 2
            if (r4 != r5) goto L_0x05f0
            java.util.Iterator r4 = r0.iterator()
            r5 = r2
            r6 = 0
        L_0x05c4:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x05e5
            java.lang.Object r7 = r4.next()
            u.o r7 = (u.o) r7
            int r8 = r7.f7591c
            if (r8 != r3) goto L_0x05d7
            r8 = r27
            goto L_0x05e1
        L_0x05d7:
            r8 = r27
            int r9 = r7.b(r8, r2)
            if (r9 <= r5) goto L_0x05e1
            r6 = r7
            r5 = r9
        L_0x05e1:
            r27 = r8
            r2 = 0
            goto L_0x05c4
        L_0x05e5:
            r8 = r27
            if (r6 == 0) goto L_0x05f2
            r1.A(r3)
            r1.C(r5)
            goto L_0x05f3
        L_0x05f0:
            r8 = r27
        L_0x05f2:
            r6 = 0
        L_0x05f3:
            r2 = r22[r3]
            r4 = 2
            if (r2 != r4) goto L_0x0621
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r4 = 0
        L_0x05fe:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0618
            java.lang.Object r5 = r0.next()
            u.o r5 = (u.o) r5
            int r7 = r5.f7591c
            if (r7 != 0) goto L_0x060f
            goto L_0x05fe
        L_0x060f:
            int r7 = r5.b(r8, r3)
            if (r7 <= r2) goto L_0x05fe
            r4 = r5
            r2 = r7
            goto L_0x05fe
        L_0x0618:
            if (r4 == 0) goto L_0x0621
            r1.B(r3)
            r1.z(r2)
            goto L_0x0622
        L_0x0621:
            r4 = 0
        L_0x0622:
            if (r6 != 0) goto L_0x0629
            if (r4 == 0) goto L_0x0627
            goto L_0x0629
        L_0x0627:
            r0 = 0
            goto L_0x062a
        L_0x0629:
            r0 = 1
        L_0x062a:
            if (r0 == 0) goto L_0x066c
            r2 = r26
            r3 = 2
            if (r2 != r3) goto L_0x0647
            int r0 = r29.k()
            r3 = r19
            if (r3 >= r0) goto L_0x0642
            if (r3 <= 0) goto L_0x0642
            r1.C(r3)
            r4 = 1
            r1.f7361z0 = r4
            goto L_0x0649
        L_0x0642:
            int r0 = r29.k()
            goto L_0x064a
        L_0x0647:
            r3 = r19
        L_0x0649:
            r0 = r3
        L_0x064a:
            r4 = r25
            r3 = 2
            if (r4 != r3) goto L_0x0665
            int r3 = r29.i()
            r5 = r18
            if (r5 >= r3) goto L_0x0660
            if (r5 <= 0) goto L_0x0660
            r1.z(r5)
            r3 = 1
            r1.A0 = r3
            goto L_0x0667
        L_0x0660:
            int r3 = r29.i()
            goto L_0x0668
        L_0x0665:
            r5 = r18
        L_0x0667:
            r3 = r5
        L_0x0668:
            r5 = r3
            r3 = r0
            r0 = 1
            goto L_0x0684
        L_0x066c:
            r5 = r18
            r3 = r19
            r4 = r25
            r2 = r26
            goto L_0x0683
        L_0x0675:
            r23 = r3
            r4 = r7
            r24 = r11
            r5 = r18
            r3 = r19
            r28 = r8
            r8 = r2
            r2 = r28
        L_0x0683:
            r0 = 0
        L_0x0684:
            r6 = 64
            boolean r7 = r1.L(r6)
            if (r7 != 0) goto L_0x0697
            r7 = 128(0x80, float:1.794E-43)
            boolean r7 = r1.L(r7)
            if (r7 == 0) goto L_0x0695
            goto L_0x0697
        L_0x0695:
            r7 = 0
            goto L_0x0698
        L_0x0697:
            r7 = 1
        L_0x0698:
            r8.getClass()
            r9 = 0
            r8.f7145g = r9
            int r10 = r1.y0
            if (r10 == 0) goto L_0x06a8
            if (r7 == 0) goto L_0x06a8
            r7 = 1
            r8.f7145g = r7
            goto L_0x06a9
        L_0x06a8:
            r7 = 1
        L_0x06a9:
            java.util.ArrayList<t.d> r10 = r1.f7370m0
            r11 = r22[r9]
            r12 = 2
            if (r11 == r12) goto L_0x06b7
            r11 = r22[r7]
            if (r11 != r12) goto L_0x06b5
            goto L_0x06b7
        L_0x06b5:
            r7 = r9
            goto L_0x06b8
        L_0x06b7:
            r7 = 1
        L_0x06b8:
            r1.u0 = r9
            r1.f7358v0 = r9
            r11 = r23
            r9 = 0
        L_0x06bf:
            if (r9 >= r11) goto L_0x06d5
            java.util.ArrayList<t.d> r12 = r1.f7370m0
            java.lang.Object r12 = r12.get(r9)
            t.d r12 = (t.d) r12
            boolean r13 = r12 instanceof t.j
            if (r13 == 0) goto L_0x06d2
            t.j r12 = (t.j) r12
            r12.F()
        L_0x06d2:
            int r9 = r9 + 1
            goto L_0x06bf
        L_0x06d5:
            boolean r9 = r1.L(r6)
            r12 = r0
            r0 = 0
            r13 = 1
        L_0x06dc:
            if (r13 == 0) goto L_0x08e5
            r14 = 1
            int r15 = r0 + 1
            r8.u()     // Catch:{ Exception -> 0x07ad }
            r14 = 0
            r1.u0 = r14     // Catch:{ Exception -> 0x07ad }
            r1.f7358v0 = r14     // Catch:{ Exception -> 0x07ad }
            r1.e(r8)     // Catch:{ Exception -> 0x07ad }
            r0 = 0
        L_0x06ed:
            if (r0 >= r11) goto L_0x06fd
            java.util.ArrayList<t.d> r14 = r1.f7370m0     // Catch:{ Exception -> 0x07ad }
            java.lang.Object r14 = r14.get(r0)     // Catch:{ Exception -> 0x07ad }
            t.d r14 = (t.d) r14     // Catch:{ Exception -> 0x07ad }
            r14.e(r8)     // Catch:{ Exception -> 0x07ad }
            int r0 = r0 + 1
            goto L_0x06ed
        L_0x06fd:
            r1.H(r8)     // Catch:{ Exception -> 0x07ad }
            java.lang.ref.WeakReference<t.c> r0 = r1.B0     // Catch:{ Exception -> 0x07a1 }
            r13 = 5
            if (r0 == 0) goto L_0x072d
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0727 }
            if (r0 == 0) goto L_0x072d
            java.lang.ref.WeakReference<t.c> r0 = r1.B0     // Catch:{ Exception -> 0x0727 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0727 }
            t.c r0 = (t.c) r0     // Catch:{ Exception -> 0x0727 }
            r14 = r24
            s.h r6 = r8.l(r14)     // Catch:{ Exception -> 0x0729 }
            s.h r0 = r8.l(r0)     // Catch:{ Exception -> 0x0729 }
            r24 = r14
            r14 = 0
            r8.f(r0, r6, r14, r13)     // Catch:{ Exception -> 0x0727 }
            r6 = 0
            r1.B0 = r6     // Catch:{ Exception -> 0x0727 }
            goto L_0x072d
        L_0x0727:
            r0 = move-exception
            goto L_0x0751
        L_0x0729:
            r0 = move-exception
            r24 = r14
            goto L_0x0751
        L_0x072d:
            java.lang.ref.WeakReference<t.c> r0 = r1.D0     // Catch:{ Exception -> 0x07a1 }
            if (r0 == 0) goto L_0x0753
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0727 }
            if (r0 == 0) goto L_0x0753
            java.lang.ref.WeakReference<t.c> r0 = r1.D0     // Catch:{ Exception -> 0x0727 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0727 }
            t.c r0 = (t.c) r0     // Catch:{ Exception -> 0x0727 }
            t.c r6 = r1.H     // Catch:{ Exception -> 0x0727 }
            s.h r6 = r8.l(r6)     // Catch:{ Exception -> 0x0727 }
            s.h r0 = r8.l(r0)     // Catch:{ Exception -> 0x0727 }
            r14 = 0
            r8.f(r6, r0, r14, r13)     // Catch:{ Exception -> 0x0727 }
            r6 = 0
            r1.D0 = r6     // Catch:{ Exception -> 0x0727 }
            goto L_0x0753
        L_0x0751:
            r6 = 0
            goto L_0x07ab
        L_0x0753:
            java.lang.ref.WeakReference<t.c> r0 = r1.C0     // Catch:{ Exception -> 0x07a1 }
            if (r0 == 0) goto L_0x077d
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x07a1 }
            if (r0 == 0) goto L_0x077d
            java.lang.ref.WeakReference<t.c> r0 = r1.C0     // Catch:{ Exception -> 0x07a1 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x07a1 }
            t.c r0 = (t.c) r0     // Catch:{ Exception -> 0x07a1 }
            r6 = r21
            s.h r14 = r8.l(r6)     // Catch:{ Exception -> 0x0779 }
            s.h r0 = r8.l(r0)     // Catch:{ Exception -> 0x0779 }
            r21 = r6
            r6 = 0
            r8.f(r0, r14, r6, r13)     // Catch:{ Exception -> 0x07a1 }
            r6 = 0
            r1.C0 = r6     // Catch:{ Exception -> 0x07aa }
            goto L_0x077d
        L_0x0779:
            r0 = move-exception
            r21 = r6
            goto L_0x0751
        L_0x077d:
            java.lang.ref.WeakReference<t.c> r0 = r1.E0     // Catch:{ Exception -> 0x07a1 }
            if (r0 == 0) goto L_0x07a3
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x07a1 }
            if (r0 == 0) goto L_0x07a3
            java.lang.ref.WeakReference<t.c> r0 = r1.E0     // Catch:{ Exception -> 0x07a1 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x07a1 }
            t.c r0 = (t.c) r0     // Catch:{ Exception -> 0x07a1 }
            t.c r6 = r1.G     // Catch:{ Exception -> 0x07a1 }
            s.h r6 = r8.l(r6)     // Catch:{ Exception -> 0x07a1 }
            s.h r0 = r8.l(r0)     // Catch:{ Exception -> 0x07a1 }
            r14 = 0
            r8.f(r6, r0, r14, r13)     // Catch:{ Exception -> 0x07a1 }
            r6 = 0
            r1.E0 = r6     // Catch:{ Exception -> 0x07aa }
            goto L_0x07a4
        L_0x07a1:
            r0 = move-exception
            goto L_0x0751
        L_0x07a3:
            r6 = 0
        L_0x07a4:
            r8.q()     // Catch:{ Exception -> 0x07aa }
            r18 = 1
            goto L_0x07c7
        L_0x07aa:
            r0 = move-exception
        L_0x07ab:
            r13 = 1
            goto L_0x07af
        L_0x07ad:
            r0 = move-exception
            r6 = 0
        L_0x07af:
            r0.printStackTrace()
            java.io.PrintStream r14 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r18 = r13
            java.lang.String r13 = "EXCEPTION : "
            r6.<init>(r13)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r14.println(r0)
        L_0x07c7:
            boolean[] r0 = k3.j.f5153h
            if (r18 == 0) goto L_0x07f3
            r6 = 2
            r13 = 0
            r0[r6] = r13
            r6 = 64
            boolean r13 = r1.L(r6)
            r1.E(r8, r13)
            java.util.ArrayList<t.d> r14 = r1.f7370m0
            int r14 = r14.size()
            r6 = 0
        L_0x07df:
            if (r6 >= r14) goto L_0x0807
            r18 = r14
            java.util.ArrayList<t.d> r14 = r1.f7370m0
            java.lang.Object r14 = r14.get(r6)
            t.d r14 = (t.d) r14
            r14.E(r8, r13)
            int r6 = r6 + 1
            r14 = r18
            goto L_0x07df
        L_0x07f3:
            r1.E(r8, r9)
            r6 = 0
        L_0x07f7:
            if (r6 >= r11) goto L_0x0807
            java.util.ArrayList<t.d> r13 = r1.f7370m0
            java.lang.Object r13 = r13.get(r6)
            t.d r13 = (t.d) r13
            r13.E(r8, r9)
            int r6 = r6 + 1
            goto L_0x07f7
        L_0x0807:
            if (r7 == 0) goto L_0x086f
            r6 = 8
            if (r15 >= r6) goto L_0x086f
            r6 = 2
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x086f
            r0 = 0
            r6 = 0
            r13 = 0
        L_0x0815:
            if (r0 >= r11) goto L_0x083d
            java.util.ArrayList<t.d> r14 = r1.f7370m0
            java.lang.Object r14 = r14.get(r0)
            t.d r14 = (t.d) r14
            r18 = r7
            int r7 = r14.V
            int r19 = r14.k()
            int r7 = r7 + r19
            int r6 = java.lang.Math.max(r6, r7)
            int r7 = r14.W
            int r14 = r14.i()
            int r7 = r7 + r14
            int r13 = java.lang.Math.max(r13, r7)
            int r0 = r0 + 1
            r7 = r18
            goto L_0x0815
        L_0x083d:
            r18 = r7
            int r0 = r1.Y
            int r0 = java.lang.Math.max(r0, r6)
            int r6 = r1.Z
            int r6 = java.lang.Math.max(r6, r13)
            r7 = 2
            if (r2 != r7) goto L_0x085d
            int r13 = r29.k()
            if (r13 >= r0) goto L_0x085d
            r1.C(r0)
            r12 = 0
            r22[r12] = r7
            r0 = 1
            r12 = 1
            goto L_0x085e
        L_0x085d:
            r0 = 0
        L_0x085e:
            if (r4 != r7) goto L_0x0872
            int r13 = r29.i()
            if (r13 >= r6) goto L_0x0872
            r1.z(r6)
            r6 = 1
            r22[r6] = r7
            r0 = 1
            r12 = 1
            goto L_0x0872
        L_0x086f:
            r18 = r7
            r0 = 0
        L_0x0872:
            int r6 = r1.Y
            int r7 = r29.k()
            int r6 = java.lang.Math.max(r6, r7)
            int r7 = r29.k()
            if (r6 <= r7) goto L_0x088d
            r1.C(r6)
            r6 = 1
            r7 = 0
            r22[r7] = r6
            r0 = r6
            r16 = r0
            goto L_0x0890
        L_0x088d:
            r6 = 1
            r16 = r12
        L_0x0890:
            int r7 = r1.Z
            int r12 = r29.i()
            int r7 = java.lang.Math.max(r7, r12)
            int r12 = r29.i()
            if (r7 <= r12) goto L_0x08a8
            r1.z(r7)
            r22[r6] = r6
            r0 = r6
            r7 = r0
            goto L_0x08ab
        L_0x08a8:
            r7 = r0
            r0 = r16
        L_0x08ab:
            if (r0 != 0) goto L_0x08db
            r12 = 0
            r13 = r22[r12]
            r14 = 2
            if (r13 != r14) goto L_0x08c4
            if (r3 <= 0) goto L_0x08c4
            int r13 = r29.k()
            if (r13 <= r3) goto L_0x08c4
            r1.f7361z0 = r6
            r22[r12] = r6
            r1.C(r3)
            r0 = r6
            r7 = r0
        L_0x08c4:
            r12 = r22[r6]
            r13 = 2
            if (r12 != r13) goto L_0x08dc
            if (r5 <= 0) goto L_0x08dc
            int r12 = r29.i()
            if (r12 <= r5) goto L_0x08dc
            r1.A0 = r6
            r22[r6] = r6
            r1.z(r5)
            r7 = 1
            r12 = 1
            goto L_0x08dd
        L_0x08db:
            r13 = 2
        L_0x08dc:
            r12 = r0
        L_0x08dd:
            r13 = r7
            r0 = r15
            r7 = r18
            r6 = 64
            goto L_0x06dc
        L_0x08e5:
            r1.f7370m0 = r10
            if (r12 == 0) goto L_0x08ef
            r3 = 0
            r22[r3] = r2
            r2 = 1
            r22[r2] = r4
        L_0x08ef:
            s.c r0 = r8.f7150l
            r1.w(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.e.F():void");
    }

    public final void G(d dVar, int i8) {
        if (i8 == 0) {
            int i9 = this.u0 + 1;
            b[] bVarArr = this.f7360x0;
            if (i9 >= bVarArr.length) {
                this.f7360x0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.f7360x0;
            int i10 = this.u0;
            bVarArr2[i10] = new b(dVar, 0, this.f7355q0);
            this.u0 = i10 + 1;
        } else if (i8 == 1) {
            int i11 = this.f7358v0 + 1;
            b[] bVarArr3 = this.f7359w0;
            if (i11 >= bVarArr3.length) {
                this.f7359w0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.f7359w0;
            int i12 = this.f7358v0;
            bVarArr4[i12] = new b(dVar, 1, this.f7355q0);
            this.f7358v0 = i12 + 1;
        }
    }

    public final void H(d dVar) {
        boolean L = L(64);
        b(dVar, L);
        int size = this.f7370m0.size();
        boolean z8 = false;
        for (int i8 = 0; i8 < size; i8++) {
            d dVar2 = this.f7370m0.get(i8);
            boolean[] zArr = dVar2.O;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar2 instanceof a) {
                z8 = true;
            }
        }
        if (z8) {
            for (int i9 = 0; i9 < size; i9++) {
                d dVar3 = this.f7370m0.get(i9);
                if (dVar3 instanceof a) {
                    a aVar = (a) dVar3;
                    for (int i10 = 0; i10 < aVar.f7369n0; i10++) {
                        d dVar4 = aVar.f7368m0[i10];
                        int i11 = aVar.f7281o0;
                        if (i11 == 0 || i11 == 1) {
                            dVar4.O[0] = true;
                        } else if (i11 == 2 || i11 == 3) {
                            dVar4.O[1] = true;
                        }
                    }
                }
            }
        }
        for (int i12 = 0; i12 < size; i12++) {
            d dVar5 = this.f7370m0.get(i12);
            dVar5.getClass();
            if ((dVar5 instanceof i) || (dVar5 instanceof f)) {
                dVar5.b(dVar, L);
            }
        }
        if (d.f7138p) {
            HashSet hashSet = new HashSet();
            for (int i13 = 0; i13 < size; i13++) {
                d dVar6 = this.f7370m0.get(i13);
                dVar6.getClass();
                if (!((dVar6 instanceof i) || (dVar6 instanceof f))) {
                    hashSet.add(dVar6);
                }
            }
            a(this, dVar, hashSet, this.P[0] == 2 ? 0 : 1, false);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                d dVar7 = (d) it.next();
                j.k(this, dVar, dVar7);
                dVar7.b(dVar, L);
            }
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                d dVar8 = this.f7370m0.get(i14);
                if (dVar8 instanceof e) {
                    int[] iArr = dVar8.P;
                    int i15 = iArr[0];
                    int i16 = iArr[1];
                    if (i15 == 2) {
                        dVar8.A(1);
                    }
                    if (i16 == 2) {
                        dVar8.B(1);
                    }
                    dVar8.b(dVar, L);
                    if (i15 == 2) {
                        dVar8.A(i15);
                    }
                    if (i16 == 2) {
                        dVar8.B(i16);
                    }
                } else {
                    j.k(this, dVar, dVar8);
                    if (!((dVar8 instanceof i) || (dVar8 instanceof f))) {
                        dVar8.b(dVar, L);
                    }
                }
            }
        }
        if (this.u0 > 0) {
            j.g(this, dVar, (ArrayList) null, 0);
        }
        if (this.f7358v0 > 0) {
            j.g(this, dVar, (ArrayList) null, 1);
        }
    }

    public final void I(c cVar) {
        WeakReference<c> weakReference = this.B0;
        if (weakReference == null || weakReference.get() == null || cVar.c() > this.B0.get().c()) {
            this.B0 = new WeakReference<>(cVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0105 A[EDGE_INSN: B:76:0x0105->B:60:0x0105 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean J(int r13, boolean r14) {
        /*
            r12 = this;
            r0 = 1
            r14 = r14 & r0
            u.e r12 = r12.f7353o0
            t.e r1 = r12.f7563a
            r2 = 0
            int r3 = r1.h(r2)
            int r4 = r1.h(r0)
            int r5 = r1.l()
            int r6 = r1.m()
            java.util.ArrayList<u.p> r7 = r12.e
            if (r14 == 0) goto L_0x006d
            r8 = 2
            if (r3 == r8) goto L_0x0020
            if (r4 != r8) goto L_0x006d
        L_0x0020:
            java.util.Iterator r9 = r7.iterator()
        L_0x0024:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x003b
            java.lang.Object r10 = r9.next()
            u.p r10 = (u.p) r10
            int r11 = r10.f7597f
            if (r11 != r13) goto L_0x0024
            boolean r10 = r10.k()
            if (r10 != 0) goto L_0x0024
            r14 = r2
        L_0x003b:
            if (r13 != 0) goto L_0x0054
            if (r14 == 0) goto L_0x006d
            if (r3 != r8) goto L_0x006d
            r1.A(r0)
            int r14 = r12.d(r1, r2)
            r1.C(r14)
            u.l r14 = r1.f7324d
            u.g r14 = r14.e
            int r8 = r1.k()
            goto L_0x006a
        L_0x0054:
            if (r14 == 0) goto L_0x006d
            if (r4 != r8) goto L_0x006d
            r1.B(r0)
            int r14 = r12.d(r1, r0)
            r1.z(r14)
            u.n r14 = r1.e
            u.g r14 = r14.e
            int r8 = r1.i()
        L_0x006a:
            r14.d(r8)
        L_0x006d:
            r14 = 4
            int[] r8 = r1.P
            if (r13 != 0) goto L_0x008d
            r6 = r8[r2]
            if (r6 == r0) goto L_0x0078
            if (r6 != r14) goto L_0x0094
        L_0x0078:
            int r14 = r1.k()
            int r14 = r14 + r5
            u.l r6 = r1.f7324d
            u.f r6 = r6.f7600i
            r6.d(r14)
            u.l r6 = r1.f7324d
            u.g r6 = r6.e
            int r14 = r14 - r5
            r6.d(r14)
            goto L_0x00aa
        L_0x008d:
            r5 = r8[r0]
            if (r5 == r0) goto L_0x0096
            if (r5 != r14) goto L_0x0094
            goto L_0x0096
        L_0x0094:
            r14 = r2
            goto L_0x00ab
        L_0x0096:
            int r14 = r1.i()
            int r14 = r14 + r6
            u.n r5 = r1.e
            u.f r5 = r5.f7600i
            r5.d(r14)
            u.n r5 = r1.e
            u.g r5 = r5.e
            int r14 = r14 - r6
            r5.d(r14)
        L_0x00aa:
            r14 = r0
        L_0x00ab:
            r12.g()
            java.util.Iterator r12 = r7.iterator()
        L_0x00b2:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x00d0
            java.lang.Object r5 = r12.next()
            u.p r5 = (u.p) r5
            int r6 = r5.f7597f
            if (r6 == r13) goto L_0x00c3
            goto L_0x00b2
        L_0x00c3:
            t.d r6 = r5.f7594b
            if (r6 != r1) goto L_0x00cc
            boolean r6 = r5.f7598g
            if (r6 != 0) goto L_0x00cc
            goto L_0x00b2
        L_0x00cc:
            r5.e()
            goto L_0x00b2
        L_0x00d0:
            java.util.Iterator r12 = r7.iterator()
        L_0x00d4:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x0105
            java.lang.Object r5 = r12.next()
            u.p r5 = (u.p) r5
            int r6 = r5.f7597f
            if (r6 == r13) goto L_0x00e5
            goto L_0x00d4
        L_0x00e5:
            if (r14 != 0) goto L_0x00ec
            t.d r6 = r5.f7594b
            if (r6 != r1) goto L_0x00ec
            goto L_0x00d4
        L_0x00ec:
            u.f r6 = r5.f7599h
            boolean r6 = r6.f7578j
            if (r6 != 0) goto L_0x00f3
            goto L_0x0104
        L_0x00f3:
            u.f r6 = r5.f7600i
            boolean r6 = r6.f7578j
            if (r6 != 0) goto L_0x00fa
            goto L_0x0104
        L_0x00fa:
            boolean r6 = r5 instanceof u.c
            if (r6 != 0) goto L_0x00d4
            u.g r5 = r5.e
            boolean r5 = r5.f7578j
            if (r5 != 0) goto L_0x00d4
        L_0x0104:
            r0 = r2
        L_0x0105:
            r1.A(r3)
            r1.B(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.e.J(int, boolean):boolean");
    }

    public final boolean L(int i8) {
        return (this.y0 & i8) == i8;
    }

    public final void v() {
        this.f7356r0.u();
        this.s0 = 0;
        this.f7357t0 = 0;
        super.v();
    }
}
