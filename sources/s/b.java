package s;

import java.util.ArrayList;
import s.d;

public class b implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public h f7130a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f7131b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<h> f7132c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public a f7133d;
    public boolean e = false;

    public interface a {
        float a(int i8);

        void b(h hVar, float f9);

        int c();

        void clear();

        float d(b bVar, boolean z8);

        float e(h hVar, boolean z8);

        h f(int i8);

        float g(h hVar);

        boolean h(h hVar);

        void i(float f9);

        void j(h hVar, float f9, boolean z8);

        void k();
    }

    public b() {
    }

    public b(c cVar) {
        this.f7133d = new a(this, cVar);
    }

    public h a(boolean[] zArr) {
        return f(zArr, (h) null);
    }

    public final void b(d dVar, int i8) {
        this.f7133d.b(dVar.k(i8), 1.0f);
        this.f7133d.b(dVar.k(i8), -1.0f);
    }

    public final void c(h hVar, h hVar2, h hVar3, int i8) {
        boolean z8 = false;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z8 = true;
            }
            this.f7131b = (float) i8;
        }
        if (!z8) {
            this.f7133d.b(hVar, -1.0f);
            this.f7133d.b(hVar2, 1.0f);
            this.f7133d.b(hVar3, 1.0f);
            return;
        }
        this.f7133d.b(hVar, 1.0f);
        this.f7133d.b(hVar2, -1.0f);
        this.f7133d.b(hVar3, -1.0f);
    }

    public final void d(h hVar, h hVar2, h hVar3, int i8) {
        boolean z8 = false;
        if (i8 != 0) {
            if (i8 < 0) {
                i8 *= -1;
                z8 = true;
            }
            this.f7131b = (float) i8;
        }
        if (!z8) {
            this.f7133d.b(hVar, -1.0f);
            this.f7133d.b(hVar2, 1.0f);
            this.f7133d.b(hVar3, -1.0f);
            return;
        }
        this.f7133d.b(hVar, 1.0f);
        this.f7133d.b(hVar2, -1.0f);
        this.f7133d.b(hVar3, 1.0f);
    }

    public boolean e() {
        return this.f7130a == null && this.f7131b == 0.0f && this.f7133d.c() == 0;
    }

    public final h f(boolean[] zArr, h hVar) {
        int i8;
        int c9 = this.f7133d.c();
        h hVar2 = null;
        float f9 = 0.0f;
        for (int i9 = 0; i9 < c9; i9++) {
            float a9 = this.f7133d.a(i9);
            if (a9 < 0.0f) {
                h f10 = this.f7133d.f(i9);
                if ((zArr == null || !zArr[f10.f7164b]) && f10 != hVar && (((i8 = f10.f7170i) == 3 || i8 == 4) && a9 < f9)) {
                    f9 = a9;
                    hVar2 = f10;
                }
            }
        }
        return hVar2;
    }

    public final void g(h hVar) {
        h hVar2 = this.f7130a;
        if (hVar2 != null) {
            this.f7133d.b(hVar2, -1.0f);
            this.f7130a.f7165c = -1;
            this.f7130a = null;
        }
        float e4 = this.f7133d.e(hVar, true) * -1.0f;
        this.f7130a = hVar;
        if (e4 != 1.0f) {
            this.f7131b /= e4;
            this.f7133d.i(e4);
        }
    }

    public final void h(d dVar, h hVar, boolean z8) {
        if (hVar.f7167f) {
            this.f7131b += hVar.e * this.f7133d.g(hVar);
            this.f7133d.e(hVar, z8);
            if (z8) {
                hVar.b(this);
            }
            if (this.f7133d.c() == 0) {
                this.e = true;
                dVar.f7140a = true;
            }
        }
    }

    public void i(d dVar, b bVar, boolean z8) {
        this.f7131b += bVar.f7131b * this.f7133d.d(bVar, z8);
        if (z8) {
            bVar.f7130a.b(this);
        }
        if (this.f7130a != null && this.f7133d.c() == 0) {
            this.e = true;
            dVar.f7140a = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            s.h r0 = r9.f7130a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0017
        L_0x0007:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            s.h r1 = r9.f7130a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0017:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.f7131b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0044
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f7131b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r3
            goto L_0x0045
        L_0x0044:
            r1 = r4
        L_0x0045:
            s.b$a r5 = r9.f7133d
            int r5 = r5.c()
        L_0x004b:
            if (r4 >= r5) goto L_0x00bd
            s.b$a r6 = r9.f7133d
            s.h r6 = r6.f(r4)
            if (r6 != 0) goto L_0x0056
            goto L_0x00ba
        L_0x0056:
            s.b$a r7 = r9.f7133d
            float r7 = r7.a(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0061
            goto L_0x00ba
        L_0x0061:
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L_0x0076
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0096
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto L_0x008c
        L_0x0076:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            if (r8 <= 0) goto L_0x008a
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0096
        L_0x008a:
            java.lang.String r0 = " - "
        L_0x008c:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = r7 * r1
        L_0x0096:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00a2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x00af
        L_0x00a2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L_0x00af:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = r3
        L_0x00ba:
            int r4 = r4 + 1
            goto L_0x004b
        L_0x00bd:
            if (r1 != 0) goto L_0x00d0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r0 = "0.0"
            r9.append(r0)
            java.lang.String r0 = r9.toString()
        L_0x00d0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s.b.toString():java.lang.String");
    }
}
