package s;

import java.util.Arrays;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7163a;

    /* renamed from: b  reason: collision with root package name */
    public int f7164b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f7165c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f7166d = 0;
    public float e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7167f = false;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f7168g = new float[9];

    /* renamed from: h  reason: collision with root package name */
    public final float[] f7169h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    public int f7170i;

    /* renamed from: j  reason: collision with root package name */
    public b[] f7171j = new b[16];

    /* renamed from: k  reason: collision with root package name */
    public int f7172k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f7173l = 0;

    public h(int i8) {
        this.f7170i = i8;
    }

    public final void a(b bVar) {
        int i8 = 0;
        while (true) {
            int i9 = this.f7172k;
            if (i8 >= i9) {
                b[] bVarArr = this.f7171j;
                if (i9 >= bVarArr.length) {
                    this.f7171j = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f7171j;
                int i10 = this.f7172k;
                bVarArr2[i10] = bVar;
                this.f7172k = i10 + 1;
                return;
            } else if (this.f7171j[i8] != bVar) {
                i8++;
            } else {
                return;
            }
        }
    }

    public final void b(b bVar) {
        int i8 = this.f7172k;
        int i9 = 0;
        while (i9 < i8) {
            if (this.f7171j[i9] == bVar) {
                while (i9 < i8 - 1) {
                    b[] bVarArr = this.f7171j;
                    int i10 = i9 + 1;
                    bVarArr[i9] = bVarArr[i10];
                    i9 = i10;
                }
                this.f7172k--;
                return;
            }
            i9++;
        }
    }

    public final void c() {
        this.f7170i = 5;
        this.f7166d = 0;
        this.f7164b = -1;
        this.f7165c = -1;
        this.e = 0.0f;
        this.f7167f = false;
        int i8 = this.f7172k;
        for (int i9 = 0; i9 < i8; i9++) {
            this.f7171j[i9] = null;
        }
        this.f7172k = 0;
        this.f7173l = 0;
        this.f7163a = false;
        Arrays.fill(this.f7169h, 0.0f);
    }

    public final void d(d dVar, float f9) {
        this.e = f9;
        this.f7167f = true;
        int i8 = this.f7172k;
        this.f7165c = -1;
        for (int i9 = 0; i9 < i8; i9++) {
            this.f7171j[i9].h(dVar, this, false);
        }
        this.f7172k = 0;
    }

    public final void e(d dVar, b bVar) {
        int i8 = this.f7172k;
        for (int i9 = 0; i9 < i8; i9++) {
            this.f7171j[i9].i(dVar, bVar, false);
        }
        this.f7172k = 0;
    }

    public final String toString() {
        return "" + this.f7164b;
    }
}
