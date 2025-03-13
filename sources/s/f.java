package s;

import java.util.Arrays;
import java.util.Comparator;
import s.b;

public final class f extends b {

    /* renamed from: f  reason: collision with root package name */
    public h[] f7157f = new h[128];

    /* renamed from: g  reason: collision with root package name */
    public h[] f7158g = new h[128];

    /* renamed from: h  reason: collision with root package name */
    public int f7159h = 0;

    /* renamed from: i  reason: collision with root package name */
    public final b f7160i = new b();

    public class a implements Comparator<h> {
        public final int compare(Object obj, Object obj2) {
            return ((h) obj).f7164b - ((h) obj2).f7164b;
        }
    }

    public class b implements Comparable {

        /* renamed from: f  reason: collision with root package name */
        public h f7161f;

        public b() {
        }

        public final int compareTo(Object obj) {
            return this.f7161f.f7164b - ((h) obj).f7164b;
        }

        public final String toString() {
            String str = "[ ";
            if (this.f7161f != null) {
                for (int i8 = 0; i8 < 9; i8++) {
                    str = str + this.f7161f.f7169h[i8] + " ";
                }
            }
            return str + "] " + this.f7161f;
        }
    }

    public f(c cVar) {
        super(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r9 < r8) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final s.h a(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L_0x0004:
            int r4 = r11.f7159h
            if (r2 >= r4) goto L_0x0057
            s.h[] r4 = r11.f7157f
            r5 = r4[r2]
            int r6 = r5.f7164b
            boolean r6 = r12[r6]
            if (r6 == 0) goto L_0x0013
            goto L_0x0054
        L_0x0013:
            s.f$b r6 = r11.f7160i
            r6.f7161f = r5
            r5 = 1
            r7 = 8
            if (r3 != r0) goto L_0x0036
        L_0x001c:
            if (r7 < 0) goto L_0x0032
            s.h r4 = r6.f7161f
            float[] r4 = r4.f7169h
            r4 = r4[r7]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x002f
            goto L_0x0033
        L_0x002f:
            int r7 = r7 + -1
            goto L_0x001c
        L_0x0032:
            r5 = r1
        L_0x0033:
            if (r5 == 0) goto L_0x0054
            goto L_0x0053
        L_0x0036:
            r4 = r4[r3]
        L_0x0038:
            if (r7 < 0) goto L_0x0050
            float[] r8 = r4.f7169h
            r8 = r8[r7]
            s.h r9 = r6.f7161f
            float[] r9 = r9.f7169h
            r9 = r9[r7]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x004b
            int r7 = r7 + -1
            goto L_0x0038
        L_0x004b:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r5 = r1
        L_0x0051:
            if (r5 == 0) goto L_0x0054
        L_0x0053:
            r3 = r2
        L_0x0054:
            int r2 = r2 + 1
            goto L_0x0004
        L_0x0057:
            if (r3 != r0) goto L_0x005b
            r11 = 0
            return r11
        L_0x005b:
            s.h[] r11 = r11.f7157f
            r11 = r11[r3]
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: s.f.a(boolean[]):s.h");
    }

    public final boolean e() {
        return this.f7159h == 0;
    }

    public final void i(d dVar, b bVar, boolean z8) {
        boolean z9;
        b bVar2 = bVar;
        h hVar = bVar2.f7130a;
        if (hVar != null) {
            b.a aVar = bVar2.f7133d;
            int c9 = aVar.c();
            for (int i8 = 0; i8 < c9; i8++) {
                h f9 = aVar.f(i8);
                float a9 = aVar.a(i8);
                b bVar3 = this.f7160i;
                bVar3.f7161f = f9;
                boolean z10 = f9.f7163a;
                float[] fArr = hVar.f7169h;
                if (z10) {
                    boolean z11 = true;
                    for (int i9 = 0; i9 < 9; i9++) {
                        float[] fArr2 = bVar3.f7161f.f7169h;
                        float f10 = fArr2[i9] + (fArr[i9] * a9);
                        fArr2[i9] = f10;
                        if (Math.abs(f10) < 1.0E-4f) {
                            bVar3.f7161f.f7169h[i9] = 0.0f;
                        } else {
                            z11 = false;
                        }
                    }
                    if (z11) {
                        f.this.k(bVar3.f7161f);
                    }
                    z9 = false;
                } else {
                    for (int i10 = 0; i10 < 9; i10++) {
                        float f11 = fArr[i10];
                        if (f11 != 0.0f) {
                            float f12 = f11 * a9;
                            if (Math.abs(f12) < 1.0E-4f) {
                                f12 = 0.0f;
                            }
                            bVar3.f7161f.f7169h[i10] = f12;
                        } else {
                            bVar3.f7161f.f7169h[i10] = 0.0f;
                        }
                    }
                    z9 = true;
                }
                if (z9) {
                    j(f9);
                }
                this.f7131b += bVar2.f7131b * a9;
            }
            k(hVar);
        }
    }

    public final void j(h hVar) {
        int i8;
        int i9 = this.f7159h + 1;
        h[] hVarArr = this.f7157f;
        if (i9 > hVarArr.length) {
            h[] hVarArr2 = (h[]) Arrays.copyOf(hVarArr, hVarArr.length * 2);
            this.f7157f = hVarArr2;
            this.f7158g = (h[]) Arrays.copyOf(hVarArr2, hVarArr2.length * 2);
        }
        h[] hVarArr3 = this.f7157f;
        int i10 = this.f7159h;
        hVarArr3[i10] = hVar;
        int i11 = i10 + 1;
        this.f7159h = i11;
        if (i11 > 1 && hVarArr3[i11 - 1].f7164b > hVar.f7164b) {
            int i12 = 0;
            while (true) {
                i8 = this.f7159h;
                if (i12 >= i8) {
                    break;
                }
                this.f7158g[i12] = this.f7157f[i12];
                i12++;
            }
            Arrays.sort(this.f7158g, 0, i8, new a());
            for (int i13 = 0; i13 < this.f7159h; i13++) {
                this.f7157f[i13] = this.f7158g[i13];
            }
        }
        hVar.f7163a = true;
        hVar.a(this);
    }

    public final void k(h hVar) {
        int i8 = 0;
        while (i8 < this.f7159h) {
            if (this.f7157f[i8] == hVar) {
                while (true) {
                    int i9 = this.f7159h;
                    if (i8 < i9 - 1) {
                        h[] hVarArr = this.f7157f;
                        int i10 = i8 + 1;
                        hVarArr[i8] = hVarArr[i10];
                        i8 = i10;
                    } else {
                        this.f7159h = i9 - 1;
                        hVar.f7163a = false;
                        return;
                    }
                }
            } else {
                i8++;
            }
        }
    }

    public final String toString() {
        String str = " goal -> (" + this.f7131b + ") : ";
        for (int i8 = 0; i8 < this.f7159h; i8++) {
            h hVar = this.f7157f[i8];
            b bVar = this.f7160i;
            bVar.f7161f = hVar;
            str = str + bVar + " ";
        }
        return str;
    }
}
