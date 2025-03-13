package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k3.j;
import t.c;
import u.c;
import u.f;
import u.l;
import u.n;

public class d {
    public boolean A;
    public boolean B = false;
    public int C = 0;
    public int D = 0;
    public final c E;
    public final c F;
    public final c G;
    public final c H;
    public final c I;
    public final c J;
    public final c K;
    public final c L;
    public final c[] M;
    public final ArrayList<c> N;
    public final boolean[] O;
    public final int[] P;
    public d Q;
    public int R;
    public int S;
    public float T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f7318a = false;

    /* renamed from: a0  reason: collision with root package name */
    public float f7319a0;

    /* renamed from: b  reason: collision with root package name */
    public c f7320b;

    /* renamed from: b0  reason: collision with root package name */
    public float f7321b0;

    /* renamed from: c  reason: collision with root package name */
    public c f7322c;

    /* renamed from: c0  reason: collision with root package name */
    public Object f7323c0;

    /* renamed from: d  reason: collision with root package name */
    public l f7324d = null;

    /* renamed from: d0  reason: collision with root package name */
    public int f7325d0;
    public n e = null;

    /* renamed from: e0  reason: collision with root package name */
    public String f7326e0;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f7327f = {true, true};

    /* renamed from: f0  reason: collision with root package name */
    public int f7328f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7329g = true;

    /* renamed from: g0  reason: collision with root package name */
    public int f7330g0;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f7331h = true;

    /* renamed from: h0  reason: collision with root package name */
    public final float[] f7332h0;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7333i = false;

    /* renamed from: i0  reason: collision with root package name */
    public final d[] f7334i0;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7335j = false;

    /* renamed from: j0  reason: collision with root package name */
    public final d[] f7336j0;

    /* renamed from: k  reason: collision with root package name */
    public int f7337k = -1;

    /* renamed from: k0  reason: collision with root package name */
    public int f7338k0;

    /* renamed from: l  reason: collision with root package name */
    public int f7339l = -1;

    /* renamed from: l0  reason: collision with root package name */
    public int f7340l0;

    /* renamed from: m  reason: collision with root package name */
    public int f7341m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f7342n = 0;

    /* renamed from: o  reason: collision with root package name */
    public final int[] f7343o = new int[2];

    /* renamed from: p  reason: collision with root package name */
    public int f7344p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f7345q = 0;
    public float r = 1.0f;

    /* renamed from: s  reason: collision with root package name */
    public int f7346s = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f7347t = 0;

    /* renamed from: u  reason: collision with root package name */
    public float f7348u = 1.0f;

    /* renamed from: v  reason: collision with root package name */
    public int f7349v = -1;
    public float w = 1.0f;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f7350x = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float y = 0.0f;

    /* renamed from: z  reason: collision with root package name */
    public boolean f7351z = false;

    public d() {
        c cVar = new c(this, c.a.f7309f);
        this.E = cVar;
        c cVar2 = new c(this, c.a.f7310g);
        this.F = cVar2;
        c cVar3 = new c(this, c.a.f7311h);
        this.G = cVar3;
        c cVar4 = new c(this, c.a.f7312i);
        this.H = cVar4;
        c cVar5 = new c(this, c.a.f7313j);
        this.I = cVar5;
        c cVar6 = new c(this, c.a.f7315l);
        this.J = cVar6;
        c cVar7 = new c(this, c.a.f7316m);
        this.K = cVar7;
        c cVar8 = new c(this, c.a.f7314k);
        this.L = cVar8;
        this.M = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList<c> arrayList = new ArrayList<>();
        this.N = arrayList;
        this.O = new boolean[2];
        this.P = new int[]{1, 1};
        this.Q = null;
        this.R = 0;
        this.S = 0;
        this.T = 0.0f;
        this.U = -1;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.f7319a0 = 0.5f;
        this.f7321b0 = 0.5f;
        this.f7325d0 = 0;
        this.f7326e0 = null;
        this.f7328f0 = 0;
        this.f7330g0 = 0;
        this.f7332h0 = new float[]{-1.0f, -1.0f};
        this.f7334i0 = new d[]{null, null};
        this.f7336j0 = new d[]{null, null};
        this.f7338k0 = -1;
        this.f7340l0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public final void A(int i8) {
        this.P[0] = i8;
    }

    public final void B(int i8) {
        this.P[1] = i8;
    }

    public final void C(int i8) {
        this.R = i8;
        int i9 = this.Y;
        if (i8 < i9) {
            this.R = i9;
        }
    }

    public void D(boolean z8, boolean z9) {
        int i8;
        int i9;
        l lVar = this.f7324d;
        boolean z10 = z8 & lVar.f7598g;
        n nVar = this.e;
        boolean z11 = z9 & nVar.f7598g;
        int i10 = lVar.f7599h.f7575g;
        int i11 = nVar.f7599h.f7575g;
        int i12 = lVar.f7600i.f7575g;
        int i13 = nVar.f7600i.f7575g;
        int i14 = i13 - i11;
        if (i12 - i10 < 0 || i14 < 0 || i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE) {
            i12 = 0;
            i13 = 0;
            i10 = 0;
            i11 = 0;
        }
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        if (z10) {
            this.V = i10;
        }
        if (z11) {
            this.W = i11;
        }
        if (this.f7325d0 == 8) {
            this.R = 0;
            this.S = 0;
            return;
        }
        int[] iArr = this.P;
        if (z10) {
            if (iArr[0] == 1 && i15 < (i9 = this.R)) {
                i15 = i9;
            }
            this.R = i15;
            int i17 = this.Y;
            if (i15 < i17) {
                this.R = i17;
            }
        }
        if (z11) {
            if (iArr[1] == 1 && i16 < (i8 = this.S)) {
                i16 = i8;
            }
            this.S = i16;
            int i18 = this.Z;
            if (i16 < i18) {
                this.S = i18;
            }
        }
    }

    public void E(s.d dVar, boolean z8) {
        int i8;
        int i9;
        n nVar;
        l lVar;
        dVar.getClass();
        int o8 = s.d.o(this.E);
        int o9 = s.d.o(this.F);
        int o10 = s.d.o(this.G);
        int o11 = s.d.o(this.H);
        if (z8 && (lVar = this.f7324d) != null) {
            f fVar = lVar.f7599h;
            if (fVar.f7578j) {
                f fVar2 = lVar.f7600i;
                if (fVar2.f7578j) {
                    o8 = fVar.f7575g;
                    o10 = fVar2.f7575g;
                }
            }
        }
        if (z8 && (nVar = this.e) != null) {
            f fVar3 = nVar.f7599h;
            if (fVar3.f7578j) {
                f fVar4 = nVar.f7600i;
                if (fVar4.f7578j) {
                    o9 = fVar3.f7575g;
                    o11 = fVar4.f7575g;
                }
            }
        }
        int i10 = o11 - o9;
        if (o10 - o8 < 0 || i10 < 0 || o8 == Integer.MIN_VALUE || o8 == Integer.MAX_VALUE || o9 == Integer.MIN_VALUE || o9 == Integer.MAX_VALUE || o10 == Integer.MIN_VALUE || o10 == Integer.MAX_VALUE || o11 == Integer.MIN_VALUE || o11 == Integer.MAX_VALUE) {
            o8 = 0;
            o9 = 0;
            o10 = 0;
            o11 = 0;
        }
        int i11 = o10 - o8;
        int i12 = o11 - o9;
        this.V = o8;
        this.W = o9;
        if (this.f7325d0 == 8) {
            this.R = 0;
            this.S = 0;
            return;
        }
        int[] iArr = this.P;
        if (iArr[0] == 1 && i11 < (i9 = this.R)) {
            i11 = i9;
        }
        if (iArr[1] == 1 && i12 < (i8 = this.S)) {
            i12 = i8;
        }
        this.R = i11;
        this.S = i12;
        int i13 = this.Z;
        if (i12 < i13) {
            this.S = i13;
        }
        int i14 = this.Y;
        if (i11 < i14) {
            this.R = i14;
        }
    }

    public final void a(e eVar, s.d dVar, HashSet<d> hashSet, int i8, boolean z8) {
        if (z8) {
            if (hashSet.contains(this)) {
                j.k(eVar, dVar, this);
                hashSet.remove(this);
                b(dVar, eVar.L(64));
            } else {
                return;
            }
        }
        if (i8 == 0) {
            HashSet<c> hashSet2 = this.E.f7301a;
            if (hashSet2 != null) {
                Iterator<c> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f7304d.a(eVar, dVar, hashSet, i8, true);
                }
            }
            HashSet<c> hashSet3 = this.G.f7301a;
            if (hashSet3 != null) {
                Iterator<c> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f7304d.a(eVar, dVar, hashSet, i8, true);
                }
                return;
            }
            return;
        }
        HashSet<c> hashSet4 = this.F.f7301a;
        if (hashSet4 != null) {
            Iterator<c> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f7304d.a(eVar, dVar, hashSet, i8, true);
            }
        }
        HashSet<c> hashSet5 = this.H.f7301a;
        if (hashSet5 != null) {
            Iterator<c> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f7304d.a(eVar, dVar, hashSet, i8, true);
            }
        }
        HashSet<c> hashSet6 = this.I.f7301a;
        if (hashSet6 != null) {
            Iterator<c> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f7304d.a(eVar, dVar, hashSet, i8, true);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: int} */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x037b, code lost:
        if (r7 != 3) goto L_0x03a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ca, code lost:
        if (r1.c() > r3.E0.get().c()) goto L_0x00cf;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x045f  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0595  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0597  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x059e  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0614  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x0617  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0655  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x065d  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0680  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(s.d r60, boolean r61) {
        /*
            r59 = this;
            r15 = r59
            r14 = r60
            t.c r0 = r15.E
            s.h r13 = r14.l(r0)
            t.c r1 = r15.G
            s.h r12 = r14.l(r1)
            t.c r2 = r15.F
            s.h r11 = r14.l(r2)
            t.c r10 = r15.H
            s.h r9 = r14.l(r10)
            t.c r8 = r15.I
            s.h r7 = r14.l(r8)
            t.d r3 = r15.Q
            r5 = 2
            r4 = 0
            if (r3 == 0) goto L_0x003f
            int[] r3 = r3.P
            r6 = r3[r4]
            if (r6 != r5) goto L_0x0030
            r6 = 1
            goto L_0x0031
        L_0x0030:
            r6 = r4
        L_0x0031:
            r16 = 1
            r3 = r3[r16]
            if (r3 != r5) goto L_0x0039
            r3 = 1
            goto L_0x003a
        L_0x0039:
            r3 = r4
        L_0x003a:
            r28 = r3
            r29 = r6
            goto L_0x0043
        L_0x003f:
            r28 = r4
            r29 = r28
        L_0x0043:
            int r3 = r15.f7325d0
            r6 = 8
            boolean[] r5 = r15.O
            if (r3 != r6) goto L_0x0082
            java.util.ArrayList<t.c> r3 = r15.N
            int r6 = r3.size()
        L_0x0051:
            if (r4 >= r6) goto L_0x0074
            java.lang.Object r20 = r3.get(r4)
            r21 = r3
            r3 = r20
            t.c r3 = (t.c) r3
            java.util.HashSet<t.c> r3 = r3.f7301a
            if (r3 != 0) goto L_0x0062
            goto L_0x006a
        L_0x0062:
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x006a
            r3 = 1
            goto L_0x006b
        L_0x006a:
            r3 = 0
        L_0x006b:
            if (r3 == 0) goto L_0x006f
            r3 = 1
            goto L_0x0075
        L_0x006f:
            int r4 = r4 + 1
            r3 = r21
            goto L_0x0051
        L_0x0074:
            r3 = 0
        L_0x0075:
            if (r3 != 0) goto L_0x0082
            r3 = 0
            boolean r4 = r5[r3]
            if (r4 != 0) goto L_0x0082
            r3 = 1
            boolean r4 = r5[r3]
            if (r4 != 0) goto L_0x0082
            return
        L_0x0082:
            boolean r3 = r15.f7333i
            if (r3 != 0) goto L_0x0090
            boolean r4 = r15.f7335j
            if (r4 == 0) goto L_0x008b
            goto L_0x0090
        L_0x008b:
            r21 = r5
            r6 = 5
            goto L_0x015c
        L_0x0090:
            boolean r4 = r15.f7331h
            if (r3 == 0) goto L_0x00e5
            int r3 = r15.V
            r14.d(r13, r3)
            int r3 = r15.V
            int r6 = r15.R
            int r3 = r3 + r6
            r14.d(r12, r3)
            if (r29 == 0) goto L_0x00e5
            t.d r3 = r15.Q
            if (r3 == 0) goto L_0x00e5
            if (r4 == 0) goto L_0x00d7
            t.e r3 = (t.e) r3
            r3.I(r0)
            java.lang.ref.WeakReference<t.c> r6 = r3.E0
            if (r6 == 0) goto L_0x00cd
            java.lang.Object r6 = r6.get()
            if (r6 == 0) goto L_0x00cd
            int r6 = r1.c()
            r21 = r5
            java.lang.ref.WeakReference<t.c> r5 = r3.E0
            java.lang.Object r5 = r5.get()
            t.c r5 = (t.c) r5
            int r5 = r5.c()
            if (r6 <= r5) goto L_0x00e7
            goto L_0x00cf
        L_0x00cd:
            r21 = r5
        L_0x00cf:
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r1)
            r3.E0 = r5
            goto L_0x00e7
        L_0x00d7:
            r21 = r5
            t.c r3 = r3.G
            s.h r3 = r14.l(r3)
            r5 = 5
            r6 = 0
            r14.f(r3, r12, r6, r5)
            goto L_0x00e7
        L_0x00e5:
            r21 = r5
        L_0x00e7:
            boolean r3 = r15.f7335j
            if (r3 == 0) goto L_0x014d
            int r3 = r15.W
            r14.d(r11, r3)
            int r3 = r15.W
            int r5 = r15.S
            int r3 = r3 + r5
            r14.d(r9, r3)
            java.util.HashSet<t.c> r3 = r8.f7301a
            if (r3 != 0) goto L_0x00fd
            goto L_0x0105
        L_0x00fd:
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0105
            r3 = 1
            goto L_0x0106
        L_0x0105:
            r3 = 0
        L_0x0106:
            if (r3 == 0) goto L_0x0110
            int r3 = r15.W
            int r5 = r15.X
            int r3 = r3 + r5
            r14.d(r7, r3)
        L_0x0110:
            if (r28 == 0) goto L_0x014d
            t.d r3 = r15.Q
            if (r3 == 0) goto L_0x014d
            if (r4 == 0) goto L_0x0141
            t.e r3 = (t.e) r3
            r3.I(r2)
            java.lang.ref.WeakReference<t.c> r4 = r3.D0
            if (r4 == 0) goto L_0x0139
            java.lang.Object r4 = r4.get()
            if (r4 == 0) goto L_0x0139
            int r4 = r10.c()
            java.lang.ref.WeakReference<t.c> r5 = r3.D0
            java.lang.Object r5 = r5.get()
            t.c r5 = (t.c) r5
            int r5 = r5.c()
            if (r4 <= r5) goto L_0x014d
        L_0x0139:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r10)
            r3.D0 = r4
            goto L_0x014d
        L_0x0141:
            t.c r3 = r3.H
            s.h r3 = r14.l(r3)
            r4 = 0
            r6 = 5
            r14.f(r3, r9, r4, r6)
            goto L_0x014f
        L_0x014d:
            r4 = 0
            r6 = 5
        L_0x014f:
            boolean r3 = r15.f7333i
            if (r3 == 0) goto L_0x015c
            boolean r3 = r15.f7335j
            if (r3 == 0) goto L_0x015c
            r15.f7333i = r4
            r15.f7335j = r4
            return
        L_0x015c:
            boolean[] r5 = r15.f7327f
            if (r61 == 0) goto L_0x01eb
            u.l r3 = r15.f7324d
            if (r3 == 0) goto L_0x01eb
            u.n r4 = r15.e
            if (r4 == 0) goto L_0x01eb
            u.f r6 = r3.f7599h
            r22 = r8
            boolean r8 = r6.f7578j
            if (r8 == 0) goto L_0x01ed
            u.f r3 = r3.f7600i
            boolean r3 = r3.f7578j
            if (r3 == 0) goto L_0x01ed
            u.f r3 = r4.f7599h
            boolean r3 = r3.f7578j
            if (r3 == 0) goto L_0x01ed
            u.f r3 = r4.f7600i
            boolean r3 = r3.f7578j
            if (r3 == 0) goto L_0x01ed
            int r0 = r6.f7575g
            r14.d(r13, r0)
            u.l r0 = r15.f7324d
            u.f r0 = r0.f7600i
            int r0 = r0.f7575g
            r14.d(r12, r0)
            u.n r0 = r15.e
            u.f r0 = r0.f7599h
            int r0 = r0.f7575g
            r14.d(r11, r0)
            u.n r0 = r15.e
            u.f r0 = r0.f7600i
            int r0 = r0.f7575g
            r14.d(r9, r0)
            u.n r0 = r15.e
            u.f r0 = r0.f7586k
            int r0 = r0.f7575g
            r14.d(r7, r0)
            t.d r0 = r15.Q
            if (r0 == 0) goto L_0x01e5
            if (r29 == 0) goto L_0x01c9
            r0 = 0
            boolean r1 = r5[r0]
            if (r1 == 0) goto L_0x01c9
            boolean r1 = r59.q()
            if (r1 != 0) goto L_0x01c9
            t.d r1 = r15.Q
            t.c r1 = r1.G
            s.h r1 = r14.l(r1)
            r2 = 8
            r14.f(r1, r12, r0, r2)
        L_0x01c9:
            if (r28 == 0) goto L_0x01e5
            r0 = 1
            boolean r0 = r5[r0]
            if (r0 == 0) goto L_0x01e5
            boolean r0 = r59.r()
            if (r0 != 0) goto L_0x01e5
            t.d r0 = r15.Q
            t.c r0 = r0.H
            s.h r0 = r14.l(r0)
            r1 = 8
            r2 = 0
            r14.f(r0, r9, r2, r1)
            goto L_0x01e6
        L_0x01e5:
            r2 = 0
        L_0x01e6:
            r15.f7333i = r2
            r15.f7335j = r2
            return
        L_0x01eb:
            r22 = r8
        L_0x01ed:
            t.d r3 = r15.Q
            if (r3 == 0) goto L_0x0263
            r3 = 0
            boolean r4 = r15.p(r3)
            if (r4 == 0) goto L_0x0201
            t.d r4 = r15.Q
            t.e r4 = (t.e) r4
            r4.G(r15, r3)
            r3 = 1
            goto L_0x0205
        L_0x0201:
            boolean r3 = r59.q()
        L_0x0205:
            r4 = 1
            boolean r6 = r15.p(r4)
            if (r6 == 0) goto L_0x0215
            t.d r6 = r15.Q
            t.e r6 = (t.e) r6
            r6.G(r15, r4)
            r4 = 1
            goto L_0x0219
        L_0x0215:
            boolean r4 = r59.r()
        L_0x0219:
            if (r3 != 0) goto L_0x023b
            if (r29 == 0) goto L_0x023b
            int r6 = r15.f7325d0
            r8 = 8
            if (r6 == r8) goto L_0x023b
            t.c r6 = r0.f7305f
            if (r6 != 0) goto L_0x023b
            t.c r6 = r1.f7305f
            if (r6 != 0) goto L_0x023b
            t.d r6 = r15.Q
            t.c r6 = r6.G
            s.h r6 = r14.l(r6)
            r23 = r3
            r3 = 0
            r8 = 1
            r14.f(r6, r12, r3, r8)
            goto L_0x023d
        L_0x023b:
            r23 = r3
        L_0x023d:
            if (r4 != 0) goto L_0x025e
            if (r28 == 0) goto L_0x025e
            int r3 = r15.f7325d0
            r6 = 8
            if (r3 == r6) goto L_0x025e
            t.c r3 = r2.f7305f
            if (r3 != 0) goto L_0x025e
            t.c r3 = r10.f7305f
            if (r3 != 0) goto L_0x025e
            if (r22 != 0) goto L_0x025e
            t.d r3 = r15.Q
            t.c r3 = r3.H
            s.h r3 = r14.l(r3)
            r6 = 1
            r8 = 0
            r14.f(r3, r9, r8, r6)
        L_0x025e:
            r30 = r4
            r31 = r23
            goto L_0x0267
        L_0x0263:
            r30 = 0
            r31 = 0
        L_0x0267:
            int r3 = r15.R
            int r4 = r15.Y
            if (r3 >= r4) goto L_0x026e
            goto L_0x026f
        L_0x026e:
            r4 = r3
        L_0x026f:
            int r6 = r15.S
            int r8 = r15.Z
            if (r6 >= r8) goto L_0x0276
            goto L_0x0277
        L_0x0276:
            r8 = r6
        L_0x0277:
            r23 = r11
            int[] r11 = r15.P
            r24 = r4
            r19 = 0
            r4 = r11[r19]
            r27 = r9
            r9 = 3
            r32 = r7
            r16 = 1
            if (r4 == r9) goto L_0x028d
            r25 = 1
            goto L_0x028f
        L_0x028d:
            r25 = 0
        L_0x028f:
            r7 = r11[r16]
            if (r7 == r9) goto L_0x0296
            r26 = 1
            goto L_0x0298
        L_0x0296:
            r26 = 0
        L_0x0298:
            int r9 = r15.U
            r15.f7349v = r9
            r34 = r8
            float r8 = r15.T
            r15.w = r8
            r35 = r5
            int r5 = r15.f7341m
            r36 = r12
            int r12 = r15.f7342n
            r37 = 0
            int r37 = (r8 > r37 ? 1 : (r8 == r37 ? 0 : -1))
            r38 = r13
            if (r37 <= 0) goto L_0x03a1
            int r13 = r15.f7325d0
            r14 = 8
            if (r13 == r14) goto L_0x03a1
            r13 = 3
            if (r4 != r13) goto L_0x02be
            if (r5 != 0) goto L_0x02be
            r5 = r13
        L_0x02be:
            if (r7 != r13) goto L_0x02c3
            if (r12 != 0) goto L_0x02c3
            r12 = r13
        L_0x02c3:
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r4 != r13) goto L_0x036d
            if (r7 != r13) goto L_0x036d
            if (r5 != r13) goto L_0x036d
            if (r12 != r13) goto L_0x036d
            r13 = -1
            if (r9 != r13) goto L_0x02e5
            if (r25 == 0) goto L_0x02d8
            if (r26 != 0) goto L_0x02d8
            r3 = 0
            r15.f7349v = r3
            goto L_0x02e5
        L_0x02d8:
            if (r25 != 0) goto L_0x02e5
            if (r26 == 0) goto L_0x02e5
            r3 = 1
            r15.f7349v = r3
            if (r9 != r13) goto L_0x02e5
            float r3 = r14 / r8
            r15.w = r3
        L_0x02e5:
            int r3 = r15.f7349v
            if (r3 != 0) goto L_0x02f7
            boolean r3 = r2.f()
            if (r3 == 0) goto L_0x02f5
            boolean r3 = r10.f()
            if (r3 != 0) goto L_0x02f7
        L_0x02f5:
            r3 = 1
            goto L_0x0309
        L_0x02f7:
            int r3 = r15.f7349v
            r4 = 1
            if (r3 != r4) goto L_0x030b
            boolean r3 = r0.f()
            if (r3 == 0) goto L_0x0308
            boolean r3 = r1.f()
            if (r3 != 0) goto L_0x030b
        L_0x0308:
            r3 = 0
        L_0x0309:
            r15.f7349v = r3
        L_0x030b:
            int r3 = r15.f7349v
            r4 = -1
            if (r3 != r4) goto L_0x034d
            boolean r3 = r2.f()
            if (r3 == 0) goto L_0x0328
            boolean r3 = r10.f()
            if (r3 == 0) goto L_0x0328
            boolean r3 = r0.f()
            if (r3 == 0) goto L_0x0328
            boolean r3 = r1.f()
            if (r3 != 0) goto L_0x034d
        L_0x0328:
            boolean r2 = r2.f()
            if (r2 == 0) goto L_0x0338
            boolean r2 = r10.f()
            if (r2 == 0) goto L_0x0338
            r2 = 0
            r15.f7349v = r2
            goto L_0x034d
        L_0x0338:
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x034d
            boolean r0 = r1.f()
            if (r0 == 0) goto L_0x034d
            float r0 = r15.w
            float r0 = r14 / r0
            r15.w = r0
            r0 = 1
            r15.f7349v = r0
        L_0x034d:
            int r0 = r15.f7349v
            r1 = -1
            if (r0 != r1) goto L_0x0394
            int r0 = r15.f7344p
            if (r0 <= 0) goto L_0x035e
            int r1 = r15.f7346s
            if (r1 != 0) goto L_0x035e
            r1 = 0
            r15.f7349v = r1
            goto L_0x0394
        L_0x035e:
            if (r0 != 0) goto L_0x0394
            int r0 = r15.f7346s
            if (r0 <= 0) goto L_0x0394
            float r0 = r15.w
            float r14 = r14 / r0
            r15.w = r14
            r0 = 1
            r15.f7349v = r0
            goto L_0x0394
        L_0x036d:
            r0 = 4
            r1 = 3
            if (r4 != r1) goto L_0x037e
            if (r5 != r1) goto L_0x037e
            r2 = 0
            r15.f7349v = r2
            float r2 = (float) r6
            float r8 = r8 * r2
            int r4 = (int) r8
            r8 = r34
            if (r7 == r1) goto L_0x0398
            goto L_0x03a6
        L_0x037e:
            if (r7 != r1) goto L_0x0394
            if (r12 != r1) goto L_0x0394
            r2 = 1
            r15.f7349v = r2
            r2 = -1
            if (r9 != r2) goto L_0x038b
            float r14 = r14 / r8
            r15.w = r14
        L_0x038b:
            float r2 = r15.w
            float r3 = (float) r3
            float r2 = r2 * r3
            int r8 = (int) r2
            if (r4 == r1) goto L_0x0396
            r12 = r0
            goto L_0x03a3
        L_0x0394:
            r8 = r34
        L_0x0396:
            r4 = r24
        L_0x0398:
            r41 = r5
            r34 = r8
            r40 = r12
            r39 = 1
            goto L_0x03ae
        L_0x03a1:
            r8 = r34
        L_0x03a3:
            r0 = r5
            r4 = r24
        L_0x03a6:
            r41 = r0
            r34 = r8
            r40 = r12
            r39 = 0
        L_0x03ae:
            int[] r0 = r15.f7343o
            r1 = 0
            r0[r1] = r41
            r1 = 1
            r0[r1] = r40
            if (r39 == 0) goto L_0x03c2
            int r0 = r15.f7349v
            r1 = -1
            if (r0 == 0) goto L_0x03bf
            if (r0 != r1) goto L_0x03c3
        L_0x03bf:
            r37 = 1
            goto L_0x03c5
        L_0x03c2:
            r1 = -1
        L_0x03c3:
            r37 = 0
        L_0x03c5:
            if (r39 == 0) goto L_0x03d2
            int r0 = r15.f7349v
            r2 = 1
            if (r0 == r2) goto L_0x03ce
            if (r0 != r1) goto L_0x03d2
        L_0x03ce:
            r0 = 0
            r42 = 1
            goto L_0x03d5
        L_0x03d2:
            r0 = 0
            r42 = 0
        L_0x03d5:
            r1 = r11[r0]
            r0 = 2
            if (r1 != r0) goto L_0x03e0
            boolean r0 = r15 instanceof t.e
            if (r0 == 0) goto L_0x03e0
            r9 = 1
            goto L_0x03e1
        L_0x03e0:
            r9 = 0
        L_0x03e1:
            if (r9 == 0) goto L_0x03e5
            r13 = 0
            goto L_0x03e6
        L_0x03e5:
            r13 = r4
        L_0x03e6:
            t.c r14 = r15.L
            boolean r0 = r14.f()
            r1 = 1
            r43 = r0 ^ 1
            r0 = 0
            boolean r44 = r21[r0]
            boolean r45 = r21[r1]
            int r0 = r15.f7337k
            int[] r12 = r15.f7350x
            r46 = 0
            r5 = 2
            if (r0 == r5) goto L_0x050b
            boolean r0 = r15.f7333i
            if (r0 != 0) goto L_0x050b
            if (r61 == 0) goto L_0x0463
            u.l r0 = r15.f7324d
            if (r0 == 0) goto L_0x0463
            u.f r1 = r0.f7599h
            boolean r2 = r1.f7578j
            if (r2 == 0) goto L_0x0463
            u.f r0 = r0.f7600i
            boolean r0 = r0.f7578j
            if (r0 != 0) goto L_0x0414
            goto L_0x0463
        L_0x0414:
            if (r61 == 0) goto L_0x045f
            int r0 = r1.f7575g
            r8 = r60
            r7 = r38
            r8.d(r7, r0)
            u.l r0 = r15.f7324d
            u.f r0 = r0.f7600i
            int r0 = r0.f7575g
            r6 = r36
            r8.d(r6, r0)
            t.d r0 = r15.Q
            if (r0 == 0) goto L_0x0449
            if (r29 == 0) goto L_0x0449
            r0 = 0
            boolean r1 = r35[r0]
            if (r1 == 0) goto L_0x0449
            boolean r1 = r59.q()
            if (r1 != 0) goto L_0x0449
            t.d r1 = r15.Q
            t.c r1 = r1.G
            s.h r1 = r8.l(r1)
            r4 = 8
            r8.f(r1, r6, r0, r4)
            goto L_0x044b
        L_0x0449:
            r4 = 8
        L_0x044b:
            r36 = r6
            r50 = r7
            r57 = r10
            r48 = r12
            r51 = r14
            r55 = r22
            r58 = r23
            r56 = r27
            r54 = r32
            goto L_0x051b
        L_0x045f:
            r8 = r60
            goto L_0x050b
        L_0x0463:
            r8 = r60
            r6 = r36
            r7 = r38
            r4 = 8
            t.d r0 = r15.Q
            if (r0 == 0) goto L_0x0478
            t.c r0 = r0.G
            s.h r0 = r8.l(r0)
            r17 = r0
            goto L_0x047a
        L_0x0478:
            r17 = r46
        L_0x047a:
            t.d r0 = r15.Q
            if (r0 == 0) goto L_0x0487
            t.c r0 = r0.E
            s.h r0 = r8.l(r0)
            r18 = r0
            goto L_0x0489
        L_0x0487:
            r18 = r46
        L_0x0489:
            r19 = 0
            boolean r21 = r35[r19]
            r36 = r11[r19]
            t.c r3 = r15.E
            t.c r1 = r15.G
            int r0 = r15.V
            int r2 = r15.Y
            r38 = r12[r19]
            r47 = r2
            float r2 = r15.f7319a0
            r16 = 1
            r4 = r11[r16]
            r49 = r2
            r2 = 3
            if (r4 != r2) goto L_0x04a9
            r33 = r16
            goto L_0x04ab
        L_0x04a9:
            r33 = r19
        L_0x04ab:
            int r4 = r15.f7344p
            r24 = r4
            int r4 = r15.f7345q
            r25 = r4
            float r4 = r15.r
            r26 = r4
            r4 = 1
            r50 = r2
            r2 = r4
            r51 = r0
            r0 = r59
            r52 = r1
            r1 = r60
            r53 = r3
            r3 = r29
            r19 = 8
            r4 = r28
            r5 = r21
            r16 = r6
            r6 = r18
            r18 = r7
            r54 = r32
            r7 = r17
            r55 = r22
            r8 = r36
            r56 = r27
            r57 = r10
            r10 = r53
            r32 = r11
            r58 = r23
            r11 = r52
            r48 = r12
            r36 = r16
            r12 = r51
            r50 = r18
            r51 = r14
            r14 = r47
            r15 = r38
            r16 = r49
            r17 = r37
            r18 = r33
            r19 = r31
            r20 = r30
            r21 = r44
            r22 = r41
            r23 = r40
            r27 = r43
            r0.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x051d
        L_0x050b:
            r57 = r10
            r48 = r12
            r51 = r14
            r55 = r22
            r58 = r23
            r56 = r27
            r54 = r32
            r50 = r38
        L_0x051b:
            r32 = r11
        L_0x051d:
            if (r61 == 0) goto L_0x0581
            r15 = r59
            u.n r0 = r15.e
            if (r0 == 0) goto L_0x0574
            u.f r1 = r0.f7599h
            boolean r2 = r1.f7578j
            if (r2 == 0) goto L_0x0574
            u.f r0 = r0.f7600i
            boolean r0 = r0.f7578j
            if (r0 == 0) goto L_0x0574
            int r0 = r1.f7575g
            r14 = r60
            r13 = r58
            r14.d(r13, r0)
            u.n r0 = r15.e
            u.f r0 = r0.f7600i
            int r0 = r0.f7575g
            r12 = r56
            r14.d(r12, r0)
            u.n r0 = r15.e
            u.f r0 = r0.f7586k
            int r0 = r0.f7575g
            r1 = r54
            r14.d(r1, r0)
            t.d r0 = r15.Q
            if (r0 == 0) goto L_0x056e
            if (r30 != 0) goto L_0x056e
            if (r28 == 0) goto L_0x056e
            r11 = 1
            boolean r2 = r35[r11]
            if (r2 == 0) goto L_0x056a
            t.c r0 = r0.H
            s.h r0 = r14.l(r0)
            r2 = 8
            r10 = 0
            r14.f(r0, r12, r10, r2)
            goto L_0x0572
        L_0x056a:
            r2 = 8
            r10 = 0
            goto L_0x0572
        L_0x056e:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x0572:
            r6 = r10
            goto L_0x0590
        L_0x0574:
            r14 = r60
            r1 = r54
            r12 = r56
            r13 = r58
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x058f
        L_0x0581:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r59
            r14 = r60
            r1 = r54
            r12 = r56
            r13 = r58
        L_0x058f:
            r6 = r11
        L_0x0590:
            int r0 = r15.f7339l
            r3 = 2
            if (r0 != r3) goto L_0x0597
            r4 = r10
            goto L_0x0598
        L_0x0597:
            r4 = r6
        L_0x0598:
            if (r4 == 0) goto L_0x0655
            boolean r0 = r15.f7335j
            if (r0 != 0) goto L_0x0655
            r0 = r32[r11]
            if (r0 != r3) goto L_0x05a8
            boolean r0 = r15 instanceof t.e
            if (r0 == 0) goto L_0x05a8
            r9 = r11
            goto L_0x05a9
        L_0x05a8:
            r9 = r10
        L_0x05a9:
            if (r9 == 0) goto L_0x05ad
            r34 = r10
        L_0x05ad:
            t.d r0 = r15.Q
            if (r0 == 0) goto L_0x05b9
            t.c r0 = r0.H
            s.h r0 = r14.l(r0)
            r7 = r0
            goto L_0x05bb
        L_0x05b9:
            r7 = r46
        L_0x05bb:
            t.d r0 = r15.Q
            if (r0 == 0) goto L_0x05c7
            t.c r0 = r0.F
            s.h r0 = r14.l(r0)
            r6 = r0
            goto L_0x05c9
        L_0x05c7:
            r6 = r46
        L_0x05c9:
            int r0 = r15.X
            if (r0 > 0) goto L_0x05d1
            int r3 = r15.f7325d0
            if (r3 != r2) goto L_0x05fd
        L_0x05d1:
            r3 = r55
            t.c r4 = r3.f7305f
            if (r4 == 0) goto L_0x05f2
            r14.e(r1, r13, r0, r2)
            t.c r0 = r3.f7305f
            s.h r0 = r14.l(r0)
            r14.e(r1, r0, r10, r2)
            if (r28 == 0) goto L_0x05ef
            r0 = r57
            s.h r0 = r14.l(r0)
            r1 = 5
            r14.f(r7, r0, r10, r1)
        L_0x05ef:
            r27 = r10
            goto L_0x05ff
        L_0x05f2:
            int r3 = r15.f7325d0
            if (r3 != r2) goto L_0x05fa
            r14.e(r1, r13, r10, r2)
            goto L_0x05fd
        L_0x05fa:
            r14.e(r1, r13, r0, r2)
        L_0x05fd:
            r27 = r43
        L_0x05ff:
            boolean r5 = r35[r11]
            r8 = r32[r11]
            t.c r4 = r15.F
            t.c r3 = r15.H
            int r1 = r15.W
            int r0 = r15.Z
            r16 = r48[r11]
            float r2 = r15.f7321b0
            r11 = r32[r10]
            r10 = 3
            if (r11 != r10) goto L_0x0617
            r18 = 1
            goto L_0x0619
        L_0x0617:
            r18 = 0
        L_0x0619:
            int r10 = r15.f7346s
            r24 = r10
            int r10 = r15.f7347t
            r25 = r10
            float r10 = r15.f7348u
            r26 = r10
            r10 = 0
            r17 = r2
            r2 = r10
            r19 = r0
            r0 = r59
            r20 = r1
            r1 = r60
            r11 = r3
            r3 = r28
            r10 = r4
            r4 = r29
            r28 = r12
            r12 = r20
            r29 = r13
            r13 = r34
            r14 = r19
            r15 = r16
            r16 = r17
            r17 = r42
            r19 = r30
            r20 = r31
            r21 = r45
            r22 = r40
            r23 = r41
            r0.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0659
        L_0x0655:
            r28 = r12
            r29 = r13
        L_0x0659:
            r6 = r59
            if (r39 == 0) goto L_0x067a
            int r0 = r6.f7349v
            float r5 = r6.w
            r1 = 1
            if (r0 != r1) goto L_0x066d
            r1 = r28
            r2 = r29
            r3 = r36
            r4 = r50
            goto L_0x0675
        L_0x066d:
            r3 = r28
            r4 = r29
            r1 = r36
            r2 = r50
        L_0x0675:
            r0 = r60
            r0.h(r1, r2, r3, r4, r5)
        L_0x067a:
            boolean r0 = r51.f()
            if (r0 == 0) goto L_0x0738
            r0 = r51
            t.c r1 = r0.f7305f
            t.d r1 = r1.f7304d
            float r2 = r6.y
            r3 = 1119092736(0x42b40000, float:90.0)
            float r2 = r2 + r3
            double r2 = (double) r2
            double r2 = java.lang.Math.toRadians(r2)
            float r2 = (float) r2
            int r0 = r0.d()
            t.c$a r3 = t.c.a.f7309f
            t.c r4 = r6.g(r3)
            r5 = r60
            s.h r4 = r5.l(r4)
            t.c$a r7 = t.c.a.f7310g
            t.c r8 = r6.g(r7)
            s.h r8 = r5.l(r8)
            t.c$a r9 = t.c.a.f7311h
            t.c r10 = r6.g(r9)
            s.h r10 = r5.l(r10)
            t.c$a r11 = t.c.a.f7312i
            t.c r12 = r6.g(r11)
            s.h r12 = r5.l(r12)
            t.c r3 = r1.g(r3)
            s.h r3 = r5.l(r3)
            t.c r7 = r1.g(r7)
            s.h r7 = r5.l(r7)
            t.c r9 = r1.g(r9)
            s.h r9 = r5.l(r9)
            t.c r1 = r1.g(r11)
            s.h r1 = r5.l(r1)
            s.b r11 = r60.m()
            double r13 = (double) r2
            double r15 = java.lang.Math.sin(r13)
            r2 = r9
            r61 = r10
            double r9 = (double) r0
            r17 = r2
            r0 = r3
            double r2 = r15 * r9
            float r2 = (float) r2
            s.b$a r3 = r11.f7133d
            r15 = 1056964608(0x3f000000, float:0.5)
            r3.b(r7, r15)
            s.b$a r3 = r11.f7133d
            r3.b(r1, r15)
            s.b$a r1 = r11.f7133d
            r3 = -1090519040(0xffffffffbf000000, float:-0.5)
            r1.b(r8, r3)
            s.b$a r1 = r11.f7133d
            r1.b(r12, r3)
            float r1 = -r2
            r11.f7131b = r1
            r5.c(r11)
            s.b r1 = r60.m()
            double r7 = java.lang.Math.cos(r13)
            double r7 = r7 * r9
            float r2 = (float) r7
            s.b$a r7 = r1.f7133d
            r7.b(r0, r15)
            s.b$a r0 = r1.f7133d
            r7 = r17
            r0.b(r7, r15)
            s.b$a r0 = r1.f7133d
            r0.b(r4, r3)
            s.b$a r0 = r1.f7133d
            r4 = r61
            r0.b(r4, r3)
            float r0 = -r2
            r1.f7131b = r0
            r5.c(r1)
        L_0x0738:
            r0 = 0
            r6.f7333i = r0
            r6.f7335j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.d.b(s.d, boolean):void");
    }

    public boolean c() {
        return this.f7325d0 != 8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:307:0x04d9, code lost:
        if (r0[1] == 3) goto L_0x04de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x033e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03f3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x040b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0467  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x047d  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0486 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x04ac A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:319:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:323:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:326:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0182 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(s.d r34, boolean r35, boolean r36, boolean r37, boolean r38, s.h r39, s.h r40, int r41, boolean r42, t.c r43, t.c r44, int r45, int r46, int r47, int r48, float r49, boolean r50, boolean r51, boolean r52, boolean r53, boolean r54, int r55, int r56, int r57, int r58, float r59, boolean r60) {
        /*
            r33 = this;
            r0 = r33
            r10 = r34
            r11 = r39
            r12 = r40
            r13 = r43
            r14 = r44
            r15 = r47
            r1 = r48
            r2 = r56
            r3 = r57
            r4 = r58
            r5 = r59
            s.h r9 = r10.l(r13)
            s.h r8 = r10.l(r14)
            t.c r6 = r13.f7305f
            s.h r7 = r10.l(r6)
            t.c r6 = r14.f7305f
            s.h r6 = r10.l(r6)
            boolean r16 = r43.f()
            boolean r17 = r44.f()
            t.c r12 = r0.L
            boolean r12 = r12.f()
            if (r17 == 0) goto L_0x003f
            int r18 = r16 + 1
            goto L_0x0041
        L_0x003f:
            r18 = r16
        L_0x0041:
            if (r12 == 0) goto L_0x0045
            int r18 = r18 + 1
        L_0x0045:
            r2 = r18
            if (r50 == 0) goto L_0x004b
            r14 = 3
            goto L_0x004d
        L_0x004b:
            r14 = r55
        L_0x004d:
            if (r41 == 0) goto L_0x04e6
            r11 = -1
            r19 = r6
            int r6 = r41 + -1
            r11 = 1
            if (r6 == 0) goto L_0x0062
            if (r6 == r11) goto L_0x0062
            r11 = 2
            if (r6 == r11) goto L_0x005d
            goto L_0x0062
        L_0x005d:
            r11 = 4
            if (r14 == r11) goto L_0x0062
            r6 = 1
            goto L_0x0063
        L_0x0062:
            r6 = 0
        L_0x0063:
            int r11 = r0.f7325d0
            r21 = r6
            r6 = 8
            if (r11 != r6) goto L_0x006f
            r11 = 0
            r21 = 0
            goto L_0x0071
        L_0x006f:
            r11 = r46
        L_0x0071:
            if (r60 == 0) goto L_0x0094
            if (r16 != 0) goto L_0x007f
            if (r17 != 0) goto L_0x007f
            if (r12 != 0) goto L_0x007f
            r6 = r45
            r10.d(r9, r6)
            goto L_0x008f
        L_0x007f:
            if (r16 == 0) goto L_0x008f
            if (r17 != 0) goto L_0x008f
            int r6 = r43.d()
            r23 = r12
            r12 = 8
            r10.e(r9, r7, r6, r12)
            goto L_0x0097
        L_0x008f:
            r23 = r12
            r12 = 8
            goto L_0x0097
        L_0x0094:
            r23 = r12
            r12 = r6
        L_0x0097:
            if (r21 != 0) goto L_0x00b8
            r5 = 3
            if (r42 == 0) goto L_0x00ae
            r6 = 0
            r10.e(r8, r9, r6, r5)
            if (r15 <= 0) goto L_0x00a5
            r10.f(r8, r9, r15, r12)
        L_0x00a5:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r6) goto L_0x00b1
            r10.g(r8, r9, r1, r12)
            goto L_0x00b1
        L_0x00ae:
            r10.e(r8, r9, r11, r12)
        L_0x00b1:
            r11 = r38
            r24 = r2
            r12 = r3
            goto L_0x0180
        L_0x00b8:
            r1 = 2
            r6 = 3
            if (r2 == r1) goto L_0x00db
            if (r50 != 0) goto L_0x00db
            r1 = 1
            if (r14 == r1) goto L_0x00c3
            if (r14 != 0) goto L_0x00db
        L_0x00c3:
            int r1 = java.lang.Math.max(r3, r11)
            if (r4 <= 0) goto L_0x00cd
            int r1 = java.lang.Math.min(r4, r1)
        L_0x00cd:
            r5 = 8
            r10.e(r8, r9, r1, r5)
            r11 = r38
            r24 = r2
        L_0x00d6:
            r12 = r3
            r21 = 0
            goto L_0x0180
        L_0x00db:
            r1 = -2
            if (r3 != r1) goto L_0x00df
            r3 = r11
        L_0x00df:
            if (r4 != r1) goto L_0x00e2
            r4 = r11
        L_0x00e2:
            if (r11 <= 0) goto L_0x00e8
            r1 = 1
            if (r14 == r1) goto L_0x00e8
            r11 = 0
        L_0x00e8:
            if (r3 <= 0) goto L_0x00f3
            r1 = 8
            r10.f(r8, r9, r3, r1)
            int r11 = java.lang.Math.max(r11, r3)
        L_0x00f3:
            if (r4 <= 0) goto L_0x010c
            if (r36 == 0) goto L_0x00fc
            r1 = 1
            if (r14 != r1) goto L_0x00fc
            r1 = 0
            goto L_0x00fd
        L_0x00fc:
            r1 = 1
        L_0x00fd:
            if (r1 == 0) goto L_0x0105
            r1 = 8
            r10.g(r8, r9, r4, r1)
            goto L_0x0107
        L_0x0105:
            r1 = 8
        L_0x0107:
            int r11 = java.lang.Math.min(r11, r4)
            goto L_0x010e
        L_0x010c:
            r1 = 8
        L_0x010e:
            r12 = 1
            if (r14 != r12) goto L_0x011f
            if (r36 == 0) goto L_0x0117
            r10.e(r8, r9, r11, r1)
            goto L_0x00b1
        L_0x0117:
            r5 = 5
            r10.e(r8, r9, r11, r5)
            r10.g(r8, r9, r11, r1)
            goto L_0x00b1
        L_0x011f:
            r1 = 2
            if (r14 != r1) goto L_0x017c
            t.c$a r1 = t.c.a.f7310g
            t.c$a r11 = t.c.a.f7312i
            t.c$a r12 = r13.e
            if (r12 == r1) goto L_0x0142
            if (r12 != r11) goto L_0x012d
            goto L_0x0142
        L_0x012d:
            t.d r1 = r0.Q
            t.c$a r11 = t.c.a.f7309f
            t.c r1 = r1.g(r11)
            s.h r1 = r10.l(r1)
            t.d r11 = r0.Q
            t.c$a r12 = t.c.a.f7311h
            t.c r11 = r11.g(r12)
            goto L_0x0152
        L_0x0142:
            t.d r12 = r0.Q
            t.c r1 = r12.g(r1)
            s.h r1 = r10.l(r1)
            t.d r12 = r0.Q
            t.c r11 = r12.g(r11)
        L_0x0152:
            s.h r11 = r10.l(r11)
            s.b r12 = r34.m()
            s.b$a r6 = r12.f7133d
            r24 = r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.b(r8, r2)
            s.b$a r2 = r12.f7133d
            r6 = 1065353216(0x3f800000, float:1.0)
            r2.b(r9, r6)
            s.b$a r2 = r12.f7133d
            r2.b(r11, r5)
            s.b$a r2 = r12.f7133d
            float r5 = -r5
            r2.b(r1, r5)
            r10.c(r12)
            r11 = r38
            goto L_0x00d6
        L_0x017c:
            r24 = r2
            r12 = r3
            r11 = 1
        L_0x0180:
            if (r60 == 0) goto L_0x049c
            if (r52 == 0) goto L_0x0186
            goto L_0x049c
        L_0x0186:
            if (r16 != 0) goto L_0x018d
            if (r17 != 0) goto L_0x018d
            if (r23 != 0) goto L_0x018d
            goto L_0x0191
        L_0x018d:
            if (r16 == 0) goto L_0x019b
            if (r17 != 0) goto L_0x019b
        L_0x0191:
            r14 = r44
            r5 = r8
            r38 = r11
            r1 = r19
        L_0x0198:
            r0 = 5
            goto L_0x0482
        L_0x019b:
            if (r16 != 0) goto L_0x01c3
            if (r17 == 0) goto L_0x01c3
            int r0 = r44.d()
            int r0 = -r0
            r6 = r19
            r1 = 8
            r10.e(r8, r6, r0, r1)
            if (r36 == 0) goto L_0x01bc
            r5 = r39
            r0 = 5
            r1 = 0
            r10.f(r9, r5, r1, r0)
            r14 = r44
            r1 = r6
            r5 = r8
            r38 = r11
            goto L_0x0482
        L_0x01bc:
            r14 = r44
            r1 = r6
            r5 = r8
            r38 = r11
            goto L_0x0198
        L_0x01c3:
            r5 = r39
            r6 = r19
            r1 = -1
            if (r16 == 0) goto L_0x01bc
            if (r17 == 0) goto L_0x01bc
            t.c r2 = r13.f7305f
            t.d r3 = r2.f7304d
            r2 = r44
            t.c r1 = r2.f7305f
            t.d r1 = r1.f7304d
            t.d r13 = r0.Q
            r16 = 6
            if (r21 == 0) goto L_0x02e9
            if (r14 != 0) goto L_0x0245
            if (r4 != 0) goto L_0x0209
            if (r12 != 0) goto L_0x0209
            boolean r4 = r7.f7167f
            if (r4 == 0) goto L_0x01fc
            boolean r4 = r6.f7167f
            if (r4 == 0) goto L_0x01fc
            int r0 = r43.d()
            r4 = 8
            r10.e(r9, r7, r0, r4)
            int r0 = r44.d()
            int r0 = -r0
            r10.e(r8, r6, r0, r4)
            return
        L_0x01fc:
            r4 = 8
            r17 = r4
            r19 = r17
            r22 = 0
            r23 = 0
            r24 = 1
            goto L_0x0215
        L_0x0209:
            r4 = 8
            r17 = 5
            r19 = 5
            r22 = 1
            r23 = 1
            r24 = 0
        L_0x0215:
            boolean r4 = r3 instanceof t.a
            if (r4 != 0) goto L_0x0230
            boolean r4 = r1 instanceof t.a
            if (r4 == 0) goto L_0x021e
            goto L_0x0230
        L_0x021e:
            r4 = r16
            r25 = r23
            r26 = r24
            r15 = 5
            r23 = r17
            r24 = r22
            r17 = 8
            r22 = r19
            r19 = r14
            goto L_0x0259
        L_0x0230:
            r19 = r14
            r4 = r16
            r25 = r23
            r26 = r24
            r15 = 5
            r14 = r40
            r23 = r17
            r24 = r22
            r17 = 8
            r22 = 4
            goto L_0x033c
        L_0x0245:
            r15 = 1
            r17 = 8
            if (r14 != r15) goto L_0x025d
            r19 = r14
            r4 = r16
            r23 = r17
            r15 = 5
            r22 = 4
            r24 = 1
            r25 = 1
            r26 = 0
        L_0x0259:
            r14 = r40
            goto L_0x033c
        L_0x025d:
            r15 = 3
            if (r14 != r15) goto L_0x02d9
            int r15 = r0.f7349v
            r19 = r14
            r14 = -1
            if (r15 != r14) goto L_0x0282
            r14 = r40
            if (r53 == 0) goto L_0x0273
            r23 = r17
            if (r36 == 0) goto L_0x0271
            r4 = 5
            goto L_0x0277
        L_0x0271:
            r4 = 4
            goto L_0x0277
        L_0x0273:
            r4 = r17
            r23 = r4
        L_0x0277:
            r15 = 5
            r22 = 5
        L_0x027a:
            r24 = 1
            r25 = 1
            r26 = 1
            goto L_0x033c
        L_0x0282:
            if (r50 == 0) goto L_0x02a6
            r14 = r56
            r15 = 2
            if (r14 == r15) goto L_0x028f
            r4 = 1
            if (r14 != r4) goto L_0x028d
            goto L_0x028f
        L_0x028d:
            r4 = 0
            goto L_0x0290
        L_0x028f:
            r4 = 1
        L_0x0290:
            if (r4 != 0) goto L_0x0296
            r4 = r17
            r14 = 5
            goto L_0x0298
        L_0x0296:
            r4 = 5
            r14 = 4
        L_0x0298:
            r23 = r4
            r22 = r14
            r4 = r16
            r15 = 5
            r24 = 1
            r25 = 1
            r26 = 1
            goto L_0x0259
        L_0x02a6:
            if (r4 <= 0) goto L_0x02b2
            r14 = r40
            r4 = r16
            r15 = 5
            r22 = 5
        L_0x02af:
            r23 = 5
            goto L_0x027a
        L_0x02b2:
            if (r4 != 0) goto L_0x02d1
            if (r12 != 0) goto L_0x02d1
            if (r53 != 0) goto L_0x02c0
            r14 = r40
            r4 = r16
            r22 = r17
            r15 = 5
            goto L_0x02af
        L_0x02c0:
            if (r3 == r13) goto L_0x02c6
            if (r1 == r13) goto L_0x02c6
            r4 = 4
            goto L_0x02c7
        L_0x02c6:
            r4 = 5
        L_0x02c7:
            r14 = r40
            r23 = r4
            r4 = r16
            r15 = 5
            r22 = 4
            goto L_0x027a
        L_0x02d1:
            r14 = r40
            r4 = r16
            r15 = 5
            r22 = 4
            goto L_0x02af
        L_0x02d9:
            r19 = r14
            r14 = r40
            r4 = r16
            r15 = 5
            r22 = 4
            r23 = 5
            r24 = 0
            r25 = 0
            goto L_0x033a
        L_0x02e9:
            r19 = r14
            r17 = 8
            boolean r4 = r7.f7167f
            if (r4 == 0) goto L_0x032d
            boolean r4 = r6.f7167f
            if (r4 == 0) goto L_0x032d
            int r0 = r43.d()
            int r1 = r44.d()
            r3 = 8
            r50 = r34
            r51 = r9
            r52 = r7
            r53 = r0
            r54 = r49
            r55 = r6
            r56 = r8
            r57 = r1
            r58 = r3
            r50.b(r51, r52, r53, r54, r55, r56, r57, r58)
            if (r36 == 0) goto L_0x032c
            if (r11 == 0) goto L_0x032c
            t.c r0 = r2.f7305f
            if (r0 == 0) goto L_0x0323
            int r11 = r44.d()
            r14 = r40
            goto L_0x0326
        L_0x0323:
            r14 = r40
            r11 = 0
        L_0x0326:
            if (r6 == r14) goto L_0x032c
            r15 = 5
            r10.f(r14, r8, r11, r15)
        L_0x032c:
            return
        L_0x032d:
            r14 = r40
            r15 = 5
            r23 = r15
            r4 = r16
            r22 = 4
            r24 = 1
            r25 = 1
        L_0x033a:
            r26 = 0
        L_0x033c:
            if (r24 == 0) goto L_0x0347
            if (r7 != r6) goto L_0x0347
            if (r3 == r13) goto L_0x0347
            r24 = 0
            r27 = 0
            goto L_0x034b
        L_0x0347:
            r27 = r24
            r24 = 1
        L_0x034b:
            if (r25 == 0) goto L_0x0394
            if (r21 != 0) goto L_0x0360
            if (r51 != 0) goto L_0x0360
            if (r53 != 0) goto L_0x0360
            if (r7 != r5) goto L_0x0360
            if (r6 != r14) goto L_0x0360
            r24 = r17
            r25 = r24
            r23 = 0
            r28 = 0
            goto L_0x0368
        L_0x0360:
            r25 = r23
            r28 = r24
            r23 = r36
            r24 = r4
        L_0x0368:
            int r4 = r43.d()
            int r29 = r44.d()
            r15 = r1
            r14 = 3
            r1 = r34
            r14 = r2
            r2 = r9
            r38 = r11
            r11 = r3
            r3 = r7
            r41 = r12
            r12 = r5
            r5 = r49
            r35 = r6
            r12 = r17
            r30 = r7
            r7 = r8
            r31 = r8
            r8 = r29
            r32 = r9
            r9 = r24
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            r24 = r28
            goto L_0x03a9
        L_0x0394:
            r15 = r1
            r14 = r2
            r35 = r6
            r30 = r7
            r31 = r8
            r32 = r9
            r38 = r11
            r41 = r12
            r12 = r17
            r11 = r3
            r25 = r23
            r23 = r36
        L_0x03a9:
            int r0 = r0.f7325d0
            if (r0 != r12) goto L_0x03be
            java.util.HashSet<t.c> r0 = r14.f7301a
            if (r0 != 0) goto L_0x03b2
            goto L_0x03ba
        L_0x03b2:
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ba
            r0 = 1
            goto L_0x03bb
        L_0x03ba:
            r0 = 0
        L_0x03bb:
            if (r0 != 0) goto L_0x03be
            return
        L_0x03be:
            r1 = r35
            r0 = r30
            if (r27 == 0) goto L_0x03ed
            if (r23 == 0) goto L_0x03d5
            if (r0 == r1) goto L_0x03d5
            if (r21 != 0) goto L_0x03d5
            boolean r2 = r11 instanceof t.a
            if (r2 != 0) goto L_0x03d2
            boolean r2 = r15 instanceof t.a
            if (r2 == 0) goto L_0x03d5
        L_0x03d2:
            r2 = r16
            goto L_0x03d7
        L_0x03d5:
            r2 = r25
        L_0x03d7:
            int r3 = r43.d()
            r4 = r32
            r10.f(r4, r0, r3, r2)
            int r3 = r44.d()
            int r3 = -r3
            r5 = r31
            r10.g(r5, r1, r3, r2)
            r25 = r2
            goto L_0x03f1
        L_0x03ed:
            r5 = r31
            r4 = r32
        L_0x03f1:
            if (r23 == 0) goto L_0x0403
            if (r54 == 0) goto L_0x0403
            boolean r2 = r11 instanceof t.a
            if (r2 != 0) goto L_0x0403
            boolean r2 = r15 instanceof t.a
            if (r2 != 0) goto L_0x0403
            r2 = r16
            r3 = r2
            r20 = 1
            goto L_0x0409
        L_0x0403:
            r2 = r22
            r20 = r24
            r3 = r25
        L_0x0409:
            if (r20 == 0) goto L_0x0453
            if (r26 == 0) goto L_0x0433
            if (r53 == 0) goto L_0x0411
            if (r37 == 0) goto L_0x0433
        L_0x0411:
            if (r11 == r13) goto L_0x0418
            if (r15 != r13) goto L_0x0416
            goto L_0x0418
        L_0x0416:
            r6 = r2
            goto L_0x041a
        L_0x0418:
            r6 = r16
        L_0x041a:
            boolean r7 = r11 instanceof t.f
            if (r7 != 0) goto L_0x0422
            boolean r7 = r15 instanceof t.f
            if (r7 == 0) goto L_0x0423
        L_0x0422:
            r6 = 5
        L_0x0423:
            boolean r7 = r11 instanceof t.a
            if (r7 != 0) goto L_0x042b
            boolean r7 = r15 instanceof t.a
            if (r7 == 0) goto L_0x042c
        L_0x042b:
            r6 = 5
        L_0x042c:
            if (r53 == 0) goto L_0x042f
            r6 = 5
        L_0x042f:
            int r2 = java.lang.Math.max(r6, r2)
        L_0x0433:
            if (r23 == 0) goto L_0x0443
            int r2 = java.lang.Math.min(r3, r2)
            if (r50 == 0) goto L_0x0443
            if (r53 != 0) goto L_0x0443
            if (r11 == r13) goto L_0x0441
            if (r15 != r13) goto L_0x0443
        L_0x0441:
            r11 = 4
            goto L_0x0444
        L_0x0443:
            r11 = r2
        L_0x0444:
            int r2 = r43.d()
            r10.e(r4, r0, r2, r11)
            int r2 = r44.d()
            int r2 = -r2
            r10.e(r5, r1, r2, r11)
        L_0x0453:
            if (r23 == 0) goto L_0x0467
            r2 = r39
            r3 = r12
            if (r2 != r0) goto L_0x045f
            int r6 = r43.d()
            goto L_0x0460
        L_0x045f:
            r6 = 0
        L_0x0460:
            if (r0 == r2) goto L_0x0468
            r0 = 5
            r10.f(r4, r2, r6, r0)
            goto L_0x0469
        L_0x0467:
            r3 = r12
        L_0x0468:
            r0 = 5
        L_0x0469:
            if (r23 == 0) goto L_0x0484
            if (r21 == 0) goto L_0x0484
            if (r47 != 0) goto L_0x0484
            if (r41 != 0) goto L_0x0484
            if (r21 == 0) goto L_0x047d
            r2 = r19
            r6 = 3
            if (r2 != r6) goto L_0x047d
            r2 = 0
            r10.f(r5, r4, r2, r3)
            goto L_0x0484
        L_0x047d:
            r2 = 0
            r10.f(r5, r4, r2, r0)
            goto L_0x0484
        L_0x0482:
            r23 = r36
        L_0x0484:
            if (r23 == 0) goto L_0x049b
            if (r38 == 0) goto L_0x049b
            t.c r2 = r14.f7305f
            if (r2 == 0) goto L_0x0493
            int r11 = r44.d()
            r6 = r40
            goto L_0x0496
        L_0x0493:
            r6 = r40
            r11 = 0
        L_0x0496:
            if (r1 == r6) goto L_0x049b
            r10.f(r6, r5, r11, r0)
        L_0x049b:
            return
        L_0x049c:
            r2 = r39
            r6 = r40
            r5 = r8
            r4 = r9
            r38 = r11
            r1 = r24
            r3 = 8
            r7 = 3
            r8 = 2
            if (r1 >= r8) goto L_0x04e5
            if (r36 == 0) goto L_0x04e5
            if (r38 == 0) goto L_0x04e5
            r1 = 0
            r10.f(r4, r2, r1, r3)
            t.c r0 = r0.I
            if (r35 != 0) goto L_0x04bf
            t.c r1 = r0.f7305f
            if (r1 != 0) goto L_0x04bd
            goto L_0x04bf
        L_0x04bd:
            r1 = 0
            goto L_0x04c0
        L_0x04bf:
            r1 = 1
        L_0x04c0:
            if (r35 != 0) goto L_0x04de
            t.c r0 = r0.f7305f
            if (r0 == 0) goto L_0x04de
            t.d r0 = r0.f7304d
            float r1 = r0.T
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x04dc
            int[] r0 = r0.P
            r1 = 0
            r2 = r0[r1]
            if (r2 != r7) goto L_0x04dc
            r1 = 1
            r0 = r0[r1]
            if (r0 != r7) goto L_0x04dc
            goto L_0x04de
        L_0x04dc:
            r11 = 0
            goto L_0x04df
        L_0x04de:
            r11 = r1
        L_0x04df:
            if (r11 == 0) goto L_0x04e5
            r0 = 0
            r10.f(r6, r5, r0, r3)
        L_0x04e5:
            return
        L_0x04e6:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.d.d(s.d, boolean, boolean, boolean, boolean, s.h, s.h, int, boolean, t.c, t.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(s.d dVar) {
        dVar.l(this.E);
        dVar.l(this.F);
        dVar.l(this.G);
        dVar.l(this.H);
        if (this.X > 0) {
            dVar.l(this.I);
        }
    }

    public final void f() {
        if (this.f7324d == null) {
            this.f7324d = new l(this);
        }
        if (this.e == null) {
            this.e = new n(this);
        }
    }

    public c g(c.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.E;
            case 2:
                return this.F;
            case 3:
                return this.G;
            case 4:
                return this.H;
            case 5:
                return this.I;
            case 6:
                return this.L;
            case 7:
                return this.J;
            case 8:
                return this.K;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public final int h(int i8) {
        int[] iArr = this.P;
        if (i8 == 0) {
            return iArr[0];
        }
        if (i8 == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int i() {
        if (this.f7325d0 == 8) {
            return 0;
        }
        return this.S;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r1 = r1.H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final t.d j(int r2) {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x000f
            t.c r1 = r1.G
            t.c r2 = r1.f7305f
            if (r2 == 0) goto L_0x001f
            t.c r0 = r2.f7305f
            if (r0 != r1) goto L_0x001f
            t.d r1 = r2.f7304d
            return r1
        L_0x000f:
            r0 = 1
            if (r2 != r0) goto L_0x001f
            t.c r1 = r1.H
            t.c r2 = r1.f7305f
            if (r2 == 0) goto L_0x001f
            t.c r0 = r2.f7305f
            if (r0 != r1) goto L_0x001f
            t.d r1 = r2.f7304d
            return r1
        L_0x001f:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t.d.j(int):t.d");
    }

    public final int k() {
        if (this.f7325d0 == 8) {
            return 0;
        }
        return this.R;
    }

    public final int l() {
        d dVar = this.Q;
        return (dVar == null || !(dVar instanceof e)) ? this.V : ((e) dVar).s0 + this.V;
    }

    public final int m() {
        d dVar = this.Q;
        return (dVar == null || !(dVar instanceof e)) ? this.W : ((e) dVar).f7357t0 + this.W;
    }

    public final boolean n(int i8) {
        if (i8 == 0) {
            return (this.E.f7305f != null ? 1 : 0) + (this.G.f7305f != null ? 1 : 0) < 2;
        }
        return ((this.F.f7305f != null ? 1 : 0) + (this.H.f7305f != null ? 1 : 0)) + (this.I.f7305f != null ? 1 : 0) < 2;
    }

    public final void o(c.a aVar, d dVar, c.a aVar2, int i8, int i9) {
        g(aVar).a(dVar.g(aVar2), i8, i9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r2 = r2[r3 + 1];
        r3 = r2.f7305f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p(int r3) {
        /*
            r2 = this;
            int r3 = r3 * 2
            t.c[] r2 = r2.M
            r0 = r2[r3]
            t.c r1 = r0.f7305f
            if (r1 == 0) goto L_0x001b
            t.c r1 = r1.f7305f
            if (r1 == r0) goto L_0x001b
            r0 = 1
            int r3 = r3 + r0
            r2 = r2[r3]
            t.c r3 = r2.f7305f
            if (r3 == 0) goto L_0x001b
            t.c r3 = r3.f7305f
            if (r3 != r2) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t.d.p(int):boolean");
    }

    public final boolean q() {
        c cVar = this.E;
        c cVar2 = cVar.f7305f;
        if (cVar2 != null && cVar2.f7305f == cVar) {
            return true;
        }
        c cVar3 = this.G;
        c cVar4 = cVar3.f7305f;
        return cVar4 != null && cVar4.f7305f == cVar3;
    }

    public final boolean r() {
        c cVar = this.F;
        c cVar2 = cVar.f7305f;
        if (cVar2 != null && cVar2.f7305f == cVar) {
            return true;
        }
        c cVar3 = this.H;
        c cVar4 = cVar3.f7305f;
        return cVar4 != null && cVar4.f7305f == cVar3;
    }

    public final boolean s() {
        return this.f7329g && this.f7325d0 != 8;
    }

    public boolean t() {
        return this.f7333i || (this.E.f7303c && this.G.f7303c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        if (this.f7326e0 != null) {
            str = "id: " + this.f7326e0 + " ";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.V);
        sb.append(", ");
        sb.append(this.W);
        sb.append(") - (");
        sb.append(this.R);
        sb.append(" x ");
        sb.append(this.S);
        sb.append(")");
        return sb.toString();
    }

    public boolean u() {
        return this.f7335j || (this.F.f7303c && this.H.f7303c);
    }

    public void v() {
        this.E.g();
        this.F.g();
        this.G.g();
        this.H.g();
        this.I.g();
        this.J.g();
        this.K.g();
        this.L.g();
        this.Q = null;
        this.y = 0.0f;
        this.R = 0;
        this.S = 0;
        this.T = 0.0f;
        this.U = -1;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.f7319a0 = 0.5f;
        this.f7321b0 = 0.5f;
        int[] iArr = this.P;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f7323c0 = null;
        this.f7325d0 = 0;
        this.f7328f0 = 0;
        this.f7330g0 = 0;
        float[] fArr = this.f7332h0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f7337k = -1;
        this.f7339l = -1;
        int[] iArr2 = this.f7350x;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f7341m = 0;
        this.f7342n = 0;
        this.r = 1.0f;
        this.f7348u = 1.0f;
        this.f7345q = Integer.MAX_VALUE;
        this.f7347t = Integer.MAX_VALUE;
        this.f7344p = 0;
        this.f7346s = 0;
        this.f7349v = -1;
        this.w = 1.0f;
        boolean[] zArr = this.f7327f;
        zArr[0] = true;
        zArr[1] = true;
        this.B = false;
        boolean[] zArr2 = this.O;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f7329g = true;
    }

    public void w(s.c cVar) {
        this.E.h();
        this.F.h();
        this.G.h();
        this.H.h();
        this.I.h();
        this.L.h();
        this.J.h();
        this.K.h();
    }

    public final void x(int i8, int i9) {
        this.E.i(i8);
        this.G.i(i9);
        this.V = i8;
        this.R = i9 - i8;
        this.f7333i = true;
    }

    public final void y(int i8, int i9) {
        this.F.i(i8);
        this.H.i(i9);
        this.W = i8;
        this.S = i9 - i8;
        if (this.f7351z) {
            this.I.i(i8 + this.X);
        }
        this.f7335j = true;
    }

    public final void z(int i8) {
        this.S = i8;
        int i9 = this.Z;
        if (i8 < i9) {
            this.S = i9;
        }
    }
}
