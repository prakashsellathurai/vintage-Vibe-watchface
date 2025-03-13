package s;

import java.util.Arrays;
import s.b;
import t.c;

public final class d {

    /* renamed from: p  reason: collision with root package name */
    public static boolean f7138p = false;

    /* renamed from: q  reason: collision with root package name */
    public static int f7139q = 1000;

    /* renamed from: a  reason: collision with root package name */
    public boolean f7140a;

    /* renamed from: b  reason: collision with root package name */
    public int f7141b;

    /* renamed from: c  reason: collision with root package name */
    public final f f7142c;

    /* renamed from: d  reason: collision with root package name */
    public int f7143d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public b[] f7144f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7145g;

    /* renamed from: h  reason: collision with root package name */
    public boolean[] f7146h;

    /* renamed from: i  reason: collision with root package name */
    public int f7147i;

    /* renamed from: j  reason: collision with root package name */
    public int f7148j;

    /* renamed from: k  reason: collision with root package name */
    public int f7149k;

    /* renamed from: l  reason: collision with root package name */
    public final c f7150l;

    /* renamed from: m  reason: collision with root package name */
    public h[] f7151m;

    /* renamed from: n  reason: collision with root package name */
    public int f7152n;

    /* renamed from: o  reason: collision with root package name */
    public b f7153o;

    public interface a {
        h a(boolean[] zArr);
    }

    public d() {
        this.f7140a = false;
        this.f7141b = 0;
        this.f7143d = 32;
        this.e = 32;
        this.f7144f = null;
        this.f7145g = false;
        this.f7146h = new boolean[32];
        this.f7147i = 1;
        this.f7148j = 0;
        this.f7149k = 32;
        this.f7151m = new h[f7139q];
        this.f7152n = 0;
        this.f7144f = new b[32];
        t();
        c cVar = new c(0);
        this.f7150l = cVar;
        this.f7142c = new f(cVar);
        this.f7153o = new b(cVar);
    }

    public static int o(Object obj) {
        h hVar = ((c) obj).f7308i;
        if (hVar != null) {
            return (int) (hVar.e + 0.5f);
        }
        return 0;
    }

    public final h a(int i8) {
        h hVar = (h) ((e) this.f7150l.f7136c).b();
        if (hVar == null) {
            hVar = new h(i8);
        } else {
            hVar.c();
        }
        hVar.f7170i = i8;
        int i9 = this.f7152n;
        int i10 = f7139q;
        if (i9 >= i10) {
            int i11 = i10 * 2;
            f7139q = i11;
            this.f7151m = (h[]) Arrays.copyOf(this.f7151m, i11);
        }
        h[] hVarArr = this.f7151m;
        int i12 = this.f7152n;
        this.f7152n = i12 + 1;
        hVarArr[i12] = hVar;
        return hVar;
    }

    public final void b(h hVar, h hVar2, int i8, float f9, h hVar3, h hVar4, int i9, int i10) {
        float f10;
        int i11;
        b m8 = m();
        if (hVar2 == hVar3) {
            m8.f7133d.b(hVar, 1.0f);
            m8.f7133d.b(hVar4, 1.0f);
            m8.f7133d.b(hVar2, -2.0f);
        } else {
            if (f9 == 0.5f) {
                m8.f7133d.b(hVar, 1.0f);
                m8.f7133d.b(hVar2, -1.0f);
                m8.f7133d.b(hVar3, -1.0f);
                m8.f7133d.b(hVar4, 1.0f);
                if (i8 > 0 || i9 > 0) {
                    i11 = (-i8) + i9;
                }
            } else {
                if (f9 <= 0.0f) {
                    m8.f7133d.b(hVar, -1.0f);
                    m8.f7133d.b(hVar2, 1.0f);
                    f10 = (float) i8;
                } else if (f9 >= 1.0f) {
                    m8.f7133d.b(hVar4, -1.0f);
                    m8.f7133d.b(hVar3, 1.0f);
                    i11 = -i9;
                } else {
                    float f11 = 1.0f - f9;
                    m8.f7133d.b(hVar, f11 * 1.0f);
                    m8.f7133d.b(hVar2, f11 * -1.0f);
                    m8.f7133d.b(hVar3, -1.0f * f9);
                    m8.f7133d.b(hVar4, 1.0f * f9);
                    if (i8 > 0 || i9 > 0) {
                        f10 = (((float) (-i8)) * f11) + (((float) i9) * f9);
                    }
                }
                m8.f7131b = f10;
            }
            f10 = (float) i11;
            m8.f7131b = f10;
        }
        if (i10 != 8) {
            m8.b(this, i10);
        }
        c(m8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b9, code lost:
        if (r4.f7173l <= 1) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c2, code lost:
        if (r4.f7173l <= 1) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e0, code lost:
        if (r4.f7173l <= 1) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e9, code lost:
        if (r4.f7173l <= 1) goto L_0x00f9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01b1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(s.b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f7148j
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f7149k
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.f7147i
            int r2 = r2 + r3
            int r4 = r0.e
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r16.p()
        L_0x0016:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x01b4
            s.b[] r2 = r0.f7144f
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x007d
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x006d
            s.b$a r6 = r1.f7133d
            int r6 = r6.c()
            r7 = 0
        L_0x002b:
            java.util.ArrayList<s.h> r8 = r1.f7132c
            if (r7 >= r6) goto L_0x0044
            s.b$a r9 = r1.f7133d
            s.h r9 = r9.f(r7)
            int r10 = r9.f7165c
            if (r10 != r5) goto L_0x003e
            boolean r10 = r9.f7167f
            if (r10 != 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            r8.add(r9)
        L_0x0041:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0044:
            int r6 = r8.size()
            if (r6 <= 0) goto L_0x006b
            r7 = 0
        L_0x004b:
            if (r7 >= r6) goto L_0x0067
            java.lang.Object r9 = r8.get(r7)
            s.h r9 = (s.h) r9
            boolean r10 = r9.f7167f
            if (r10 == 0) goto L_0x005b
            r1.h(r0, r9, r3)
            goto L_0x0064
        L_0x005b:
            s.b[] r10 = r0.f7144f
            int r9 = r9.f7165c
            r9 = r10[r9]
            r1.i(r0, r9, r3)
        L_0x0064:
            int r7 = r7 + 1
            goto L_0x004b
        L_0x0067:
            r8.clear()
            goto L_0x0022
        L_0x006b:
            r2 = r3
            goto L_0x0022
        L_0x006d:
            s.h r2 = r1.f7130a
            if (r2 == 0) goto L_0x007d
            s.b$a r2 = r1.f7133d
            int r2 = r2.c()
            if (r2 != 0) goto L_0x007d
            r1.e = r3
            r0.f7140a = r3
        L_0x007d:
            boolean r2 = r17.e()
            if (r2 == 0) goto L_0x0084
            return
        L_0x0084:
            float r2 = r1.f7131b
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0095
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.f7131b = r2
            s.b$a r2 = r1.f7133d
            r2.k()
        L_0x0095:
            s.b$a r2 = r1.f7133d
            int r2 = r2.c()
            r7 = 0
            r11 = r6
            r13 = r11
            r9 = r7
            r10 = r9
            r8 = 0
            r12 = 0
            r14 = 0
        L_0x00a3:
            if (r8 >= r2) goto L_0x0100
            s.b$a r15 = r1.f7133d
            float r15 = r15.a(r8)
            s.b$a r4 = r1.f7133d
            s.h r4 = r4.f(r8)
            int r5 = r4.f7170i
            if (r5 != r3) goto L_0x00d6
            if (r9 != 0) goto L_0x00bc
            int r5 = r4.f7173l
            if (r5 > r3) goto L_0x00c5
            goto L_0x00d2
        L_0x00bc:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00c7
            int r5 = r4.f7173l
            if (r5 > r3) goto L_0x00c5
            goto L_0x00d2
        L_0x00c5:
            r12 = 0
            goto L_0x00d3
        L_0x00c7:
            if (r12 != 0) goto L_0x00fc
            int r5 = r4.f7173l
            if (r5 > r3) goto L_0x00cf
            r5 = r3
            goto L_0x00d0
        L_0x00cf:
            r5 = 0
        L_0x00d0:
            if (r5 == 0) goto L_0x00fc
        L_0x00d2:
            r12 = r3
        L_0x00d3:
            r9 = r4
            r11 = r15
            goto L_0x00fc
        L_0x00d6:
            if (r9 != 0) goto L_0x00fc
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x00fc
            if (r10 != 0) goto L_0x00e3
            int r5 = r4.f7173l
            if (r5 > r3) goto L_0x00ec
            goto L_0x00f9
        L_0x00e3:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00ee
            int r5 = r4.f7173l
            if (r5 > r3) goto L_0x00ec
            goto L_0x00f9
        L_0x00ec:
            r14 = 0
            goto L_0x00fa
        L_0x00ee:
            if (r14 != 0) goto L_0x00fc
            int r5 = r4.f7173l
            if (r5 > r3) goto L_0x00f6
            r5 = r3
            goto L_0x00f7
        L_0x00f6:
            r5 = 0
        L_0x00f7:
            if (r5 == 0) goto L_0x00fc
        L_0x00f9:
            r14 = r3
        L_0x00fa:
            r10 = r4
            r13 = r15
        L_0x00fc:
            int r8 = r8 + 1
            r5 = -1
            goto L_0x00a3
        L_0x0100:
            if (r9 == 0) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r9 = r10
        L_0x0104:
            if (r9 != 0) goto L_0x0108
            r2 = r3
            goto L_0x010c
        L_0x0108:
            r1.g(r9)
            r2 = 0
        L_0x010c:
            s.b$a r4 = r1.f7133d
            int r4 = r4.c()
            if (r4 != 0) goto L_0x0116
            r1.e = r3
        L_0x0116:
            if (r2 == 0) goto L_0x019e
            int r2 = r0.f7147i
            int r2 = r2 + r3
            int r4 = r0.e
            if (r2 < r4) goto L_0x0122
            r16.p()
        L_0x0122:
            r2 = 3
            s.h r2 = r0.a(r2)
            int r4 = r0.f7141b
            int r4 = r4 + r3
            r0.f7141b = r4
            int r5 = r0.f7147i
            int r5 = r5 + r3
            r0.f7147i = r5
            r2.f7164b = r4
            s.c r5 = r0.f7150l
            java.lang.Object r8 = r5.f7137d
            s.h[] r8 = (s.h[]) r8
            r8[r4] = r2
            r1.f7130a = r2
            int r4 = r0.f7148j
            r16.i(r17)
            int r8 = r0.f7148j
            int r4 = r4 + r3
            if (r8 != r4) goto L_0x019e
            s.b r4 = r0.f7153o
            r4.getClass()
            r4.f7130a = r7
            s.b$a r8 = r4.f7133d
            r8.clear()
            r8 = 0
        L_0x0154:
            s.b$a r9 = r1.f7133d
            int r9 = r9.c()
            if (r8 >= r9) goto L_0x0170
            s.b$a r9 = r1.f7133d
            s.h r9 = r9.f(r8)
            s.b$a r10 = r1.f7133d
            float r10 = r10.a(r8)
            s.b$a r11 = r4.f7133d
            r11.j(r9, r10, r3)
            int r8 = r8 + 1
            goto L_0x0154
        L_0x0170:
            s.b r4 = r0.f7153o
            r0.s(r4)
            int r4 = r2.f7165c
            r8 = -1
            if (r4 != r8) goto L_0x019c
            s.h r4 = r1.f7130a
            if (r4 != r2) goto L_0x0187
            s.h r2 = r1.f(r7, r2)
            if (r2 == 0) goto L_0x0187
            r1.g(r2)
        L_0x0187:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x0190
            s.h r2 = r1.f7130a
            r2.e(r0, r1)
        L_0x0190:
            java.lang.Object r2 = r5.f7135b
            s.e r2 = (s.e) r2
            r2.a(r1)
            int r2 = r0.f7148j
            int r2 = r2 - r3
            r0.f7148j = r2
        L_0x019c:
            r2 = r3
            goto L_0x019f
        L_0x019e:
            r2 = 0
        L_0x019f:
            s.h r4 = r1.f7130a
            if (r4 == 0) goto L_0x01ae
            int r4 = r4.f7170i
            if (r4 == r3) goto L_0x01af
            float r4 = r1.f7131b
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x01ae
            goto L_0x01af
        L_0x01ae:
            r3 = 0
        L_0x01af:
            if (r3 != 0) goto L_0x01b2
            return
        L_0x01b2:
            r4 = r2
            goto L_0x01b5
        L_0x01b4:
            r4 = 0
        L_0x01b5:
            if (r4 != 0) goto L_0x01ba
            r16.i(r17)
        L_0x01ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.d.c(s.b):void");
    }

    public final void d(h hVar, int i8) {
        b bVar;
        b.a aVar;
        float f9;
        int i9 = hVar.f7165c;
        if (i9 == -1) {
            hVar.d(this, (float) i8);
            for (int i10 = 0; i10 < this.f7141b + 1; i10++) {
                h hVar2 = ((h[]) this.f7150l.f7137d)[i10];
            }
            return;
        }
        if (i9 != -1) {
            b bVar2 = this.f7144f[i9];
            if (!bVar2.e) {
                if (bVar2.f7133d.c() == 0) {
                    bVar2.e = true;
                } else {
                    bVar = m();
                    if (i8 < 0) {
                        bVar.f7131b = (float) (i8 * -1);
                        aVar = bVar.f7133d;
                        f9 = 1.0f;
                    } else {
                        bVar.f7131b = (float) i8;
                        aVar = bVar.f7133d;
                        f9 = -1.0f;
                    }
                    aVar.b(hVar, f9);
                }
            }
            bVar2.f7131b = (float) i8;
            return;
        }
        bVar = m();
        bVar.f7130a = hVar;
        float f10 = (float) i8;
        hVar.e = f10;
        bVar.f7131b = f10;
        bVar.e = true;
        c(bVar);
    }

    public final void e(h hVar, h hVar2, int i8, int i9) {
        if (i9 == 8 && hVar2.f7167f && hVar.f7165c == -1) {
            hVar.d(this, hVar2.e + ((float) i8));
            return;
        }
        b m8 = m();
        boolean z8 = false;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z8 = true;
            }
            m8.f7131b = (float) i8;
        }
        if (!z8) {
            m8.f7133d.b(hVar, -1.0f);
            m8.f7133d.b(hVar2, 1.0f);
        } else {
            m8.f7133d.b(hVar, 1.0f);
            m8.f7133d.b(hVar2, -1.0f);
        }
        if (i9 != 8) {
            m8.b(this, i9);
        }
        c(m8);
    }

    public final void f(h hVar, h hVar2, int i8, int i9) {
        b m8 = m();
        h n8 = n();
        n8.f7166d = 0;
        m8.c(hVar, hVar2, n8, i8);
        if (i9 != 8) {
            m8.f7133d.b(k(i9), (float) ((int) (m8.f7133d.g(n8) * -1.0f)));
        }
        c(m8);
    }

    public final void g(h hVar, h hVar2, int i8, int i9) {
        b m8 = m();
        h n8 = n();
        n8.f7166d = 0;
        m8.d(hVar, hVar2, n8, i8);
        if (i9 != 8) {
            m8.f7133d.b(k(i9), (float) ((int) (m8.f7133d.g(n8) * -1.0f)));
        }
        c(m8);
    }

    public final void h(h hVar, h hVar2, h hVar3, h hVar4, float f9) {
        b m8 = m();
        m8.f7133d.b(hVar, -1.0f);
        m8.f7133d.b(hVar2, 1.0f);
        m8.f7133d.b(hVar3, f9);
        m8.f7133d.b(hVar4, -f9);
        c(m8);
    }

    public final void i(b bVar) {
        int i8;
        if (bVar.e) {
            bVar.f7130a.d(this, bVar.f7131b);
        } else {
            b[] bVarArr = this.f7144f;
            int i9 = this.f7148j;
            bVarArr[i9] = bVar;
            h hVar = bVar.f7130a;
            hVar.f7165c = i9;
            this.f7148j = i9 + 1;
            hVar.e(this, bVar);
        }
        if (this.f7140a) {
            int i10 = 0;
            while (i10 < this.f7148j) {
                if (this.f7144f[i10] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f7144f[i10];
                if (bVar2 != null && bVar2.e) {
                    bVar2.f7130a.d(this, bVar2.f7131b);
                    ((e) this.f7150l.f7135b).a(bVar2);
                    this.f7144f[i10] = null;
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (true) {
                        i8 = this.f7148j;
                        if (i11 >= i8) {
                            break;
                        }
                        b[] bVarArr2 = this.f7144f;
                        int i13 = i11 - 1;
                        b bVar3 = bVarArr2[i11];
                        bVarArr2[i13] = bVar3;
                        h hVar2 = bVar3.f7130a;
                        if (hVar2.f7165c == i11) {
                            hVar2.f7165c = i13;
                        }
                        i12 = i11;
                        i11++;
                    }
                    if (i12 < i8) {
                        this.f7144f[i12] = null;
                    }
                    this.f7148j = i8 - 1;
                    i10--;
                }
                i10++;
            }
            this.f7140a = false;
        }
    }

    public final void j() {
        for (int i8 = 0; i8 < this.f7148j; i8++) {
            b bVar = this.f7144f[i8];
            bVar.f7130a.e = bVar.f7131b;
        }
    }

    public final h k(int i8) {
        if (this.f7147i + 1 >= this.e) {
            p();
        }
        h a9 = a(4);
        int i9 = this.f7141b + 1;
        this.f7141b = i9;
        this.f7147i++;
        a9.f7164b = i9;
        a9.f7166d = i8;
        ((h[]) this.f7150l.f7137d)[i9] = a9;
        f fVar = this.f7142c;
        fVar.f7160i.f7161f = a9;
        float[] fArr = a9.f7169h;
        Arrays.fill(fArr, 0.0f);
        fArr[a9.f7166d] = 1.0f;
        fVar.j(a9);
        return a9;
    }

    public final h l(Object obj) {
        h hVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f7147i + 1 >= this.e) {
            p();
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            hVar = cVar.f7308i;
            if (hVar == null) {
                cVar.h();
                hVar = cVar.f7308i;
            }
            int i8 = hVar.f7164b;
            c cVar2 = this.f7150l;
            if (i8 == -1 || i8 > this.f7141b || ((h[]) cVar2.f7137d)[i8] == null) {
                if (i8 != -1) {
                    hVar.c();
                }
                int i9 = this.f7141b + 1;
                this.f7141b = i9;
                this.f7147i++;
                hVar.f7164b = i9;
                hVar.f7170i = 1;
                ((h[]) cVar2.f7137d)[i9] = hVar;
            }
        }
        return hVar;
    }

    public final b m() {
        c cVar = this.f7150l;
        b bVar = (b) ((e) cVar.f7135b).b();
        if (bVar == null) {
            return new b(cVar);
        }
        bVar.f7130a = null;
        bVar.f7133d.clear();
        bVar.f7131b = 0.0f;
        bVar.e = false;
        return bVar;
    }

    public final h n() {
        if (this.f7147i + 1 >= this.e) {
            p();
        }
        h a9 = a(3);
        int i8 = this.f7141b + 1;
        this.f7141b = i8;
        this.f7147i++;
        a9.f7164b = i8;
        ((h[]) this.f7150l.f7137d)[i8] = a9;
        return a9;
    }

    public final void p() {
        int i8 = this.f7143d * 2;
        this.f7143d = i8;
        this.f7144f = (b[]) Arrays.copyOf(this.f7144f, i8);
        c cVar = this.f7150l;
        cVar.f7137d = (h[]) Arrays.copyOf((h[]) cVar.f7137d, this.f7143d);
        int i9 = this.f7143d;
        this.f7146h = new boolean[i9];
        this.e = i9;
        this.f7149k = i9;
    }

    public final void q() {
        f fVar = this.f7142c;
        if (fVar.e()) {
            j();
            return;
        }
        if (this.f7145g) {
            boolean z8 = false;
            int i8 = 0;
            while (true) {
                if (i8 >= this.f7148j) {
                    z8 = true;
                    break;
                } else if (!this.f7144f[i8].e) {
                    break;
                } else {
                    i8++;
                }
            }
            if (z8) {
                j();
                return;
            }
        }
        r(fVar);
    }

    public final void r(f fVar) {
        float f9;
        int i8;
        boolean z8;
        int i9 = 0;
        while (true) {
            f9 = 0.0f;
            i8 = 1;
            if (i9 >= this.f7148j) {
                z8 = false;
                break;
            }
            b bVar = this.f7144f[i9];
            if (bVar.f7130a.f7170i != 1 && bVar.f7131b < 0.0f) {
                z8 = true;
                break;
            }
            i9++;
        }
        if (z8) {
            boolean z9 = false;
            int i10 = 0;
            while (!z9) {
                i10 += i8;
                float f10 = Float.MAX_VALUE;
                int i11 = -1;
                int i12 = -1;
                int i13 = 0;
                int i14 = 0;
                while (i13 < this.f7148j) {
                    b bVar2 = this.f7144f[i13];
                    if (bVar2.f7130a.f7170i != i8 && !bVar2.e && bVar2.f7131b < f9) {
                        int c9 = bVar2.f7133d.c();
                        int i15 = 0;
                        while (i15 < c9) {
                            h f11 = bVar2.f7133d.f(i15);
                            float g9 = bVar2.f7133d.g(f11);
                            if (g9 > f9) {
                                for (int i16 = 0; i16 < 9; i16++) {
                                    float f12 = f11.f7168g[i16] / g9;
                                    if ((f12 < f10 && i16 == i14) || i16 > i14) {
                                        i12 = f11.f7164b;
                                        i14 = i16;
                                        f10 = f12;
                                        i11 = i13;
                                    }
                                }
                            }
                            i15++;
                            f9 = 0.0f;
                        }
                    }
                    i13++;
                    f9 = 0.0f;
                    i8 = 1;
                }
                if (i11 != -1) {
                    b bVar3 = this.f7144f[i11];
                    bVar3.f7130a.f7165c = -1;
                    bVar3.g(((h[]) this.f7150l.f7137d)[i12]);
                    h hVar = bVar3.f7130a;
                    hVar.f7165c = i11;
                    hVar.e(this, bVar3);
                } else {
                    z9 = true;
                }
                if (i10 > this.f7147i / 2) {
                    z9 = true;
                }
                f9 = 0.0f;
                i8 = 1;
            }
        }
        s(fVar);
        j();
    }

    public final void s(b bVar) {
        for (int i8 = 0; i8 < this.f7147i; i8++) {
            this.f7146h[i8] = false;
        }
        boolean z8 = false;
        int i9 = 0;
        while (!z8) {
            i9++;
            if (i9 < this.f7147i * 2) {
                h hVar = bVar.f7130a;
                if (hVar != null) {
                    this.f7146h[hVar.f7164b] = true;
                }
                h a9 = bVar.a(this.f7146h);
                if (a9 != null) {
                    boolean[] zArr = this.f7146h;
                    int i10 = a9.f7164b;
                    if (!zArr[i10]) {
                        zArr[i10] = true;
                    } else {
                        return;
                    }
                }
                if (a9 != null) {
                    float f9 = Float.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < this.f7148j; i12++) {
                        b bVar2 = this.f7144f[i12];
                        if (bVar2.f7130a.f7170i != 1 && !bVar2.e && bVar2.f7133d.h(a9)) {
                            float g9 = bVar2.f7133d.g(a9);
                            if (g9 < 0.0f) {
                                float f10 = (-bVar2.f7131b) / g9;
                                if (f10 < f9) {
                                    i11 = i12;
                                    f9 = f10;
                                }
                            }
                        }
                    }
                    if (i11 > -1) {
                        b bVar3 = this.f7144f[i11];
                        bVar3.f7130a.f7165c = -1;
                        bVar3.g(a9);
                        h hVar2 = bVar3.f7130a;
                        hVar2.f7165c = i11;
                        hVar2.e(this, bVar3);
                    }
                } else {
                    z8 = true;
                }
            } else {
                return;
            }
        }
    }

    public final void t() {
        for (int i8 = 0; i8 < this.f7148j; i8++) {
            b bVar = this.f7144f[i8];
            if (bVar != null) {
                ((e) this.f7150l.f7135b).a(bVar);
            }
            this.f7144f[i8] = null;
        }
    }

    public final void u() {
        c cVar;
        int i8 = 0;
        while (true) {
            cVar = this.f7150l;
            h[] hVarArr = (h[]) cVar.f7137d;
            if (i8 >= hVarArr.length) {
                break;
            }
            h hVar = hVarArr[i8];
            if (hVar != null) {
                hVar.c();
            }
            i8++;
        }
        e eVar = (e) cVar.f7136c;
        h[] hVarArr2 = this.f7151m;
        int i9 = this.f7152n;
        eVar.getClass();
        if (i9 > hVarArr2.length) {
            i9 = hVarArr2.length;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            h hVar2 = hVarArr2[i10];
            int i11 = eVar.f7156c;
            Object[] objArr = eVar.f7155b;
            if (i11 < objArr.length) {
                objArr[i11] = hVar2;
                eVar.f7156c = i11 + 1;
            }
        }
        this.f7152n = 0;
        Arrays.fill((h[]) cVar.f7137d, (Object) null);
        this.f7141b = 0;
        f fVar = this.f7142c;
        fVar.f7159h = 0;
        fVar.f7131b = 0.0f;
        this.f7147i = 1;
        for (int i12 = 0; i12 < this.f7148j; i12++) {
            b bVar = this.f7144f[i12];
        }
        t();
        this.f7148j = 0;
        this.f7153o = new b(cVar);
    }
}
