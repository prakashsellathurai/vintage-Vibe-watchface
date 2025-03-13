package s;

import java.util.Arrays;
import s.b;

public final class a implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public int f7121a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final b f7122b;

    /* renamed from: c  reason: collision with root package name */
    public final c f7123c;

    /* renamed from: d  reason: collision with root package name */
    public int f7124d = 8;
    public int[] e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f7125f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f7126g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f7127h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f7128i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7129j = false;

    public a(b bVar, c cVar) {
        this.f7122b = bVar;
        this.f7123c = cVar;
    }

    public final float a(int i8) {
        int i9 = this.f7127h;
        int i10 = 0;
        while (i9 != -1 && i10 < this.f7121a) {
            if (i10 == i8) {
                return this.f7126g[i9];
            }
            i9 = this.f7125f[i9];
            i10++;
        }
        return 0.0f;
    }

    public final void b(h hVar, float f9) {
        if (f9 == 0.0f) {
            e(hVar, true);
            return;
        }
        int i8 = this.f7127h;
        b bVar = this.f7122b;
        if (i8 == -1) {
            this.f7127h = 0;
            this.f7126g[0] = f9;
            this.e[0] = hVar.f7164b;
            this.f7125f[0] = -1;
            hVar.f7173l++;
            hVar.a(bVar);
            this.f7121a++;
            if (!this.f7129j) {
                int i9 = this.f7128i + 1;
                this.f7128i = i9;
                int[] iArr = this.e;
                if (i9 >= iArr.length) {
                    this.f7129j = true;
                    this.f7128i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i10 = -1;
        int i11 = 0;
        while (i8 != -1 && i11 < this.f7121a) {
            int i12 = this.e[i8];
            int i13 = hVar.f7164b;
            if (i12 == i13) {
                this.f7126g[i8] = f9;
                return;
            }
            if (i12 < i13) {
                i10 = i8;
            }
            i8 = this.f7125f[i8];
            i11++;
        }
        int i14 = this.f7128i;
        int i15 = i14 + 1;
        if (this.f7129j) {
            int[] iArr2 = this.e;
            if (iArr2[i14] != -1) {
                i14 = iArr2.length;
            }
        } else {
            i14 = i15;
        }
        int[] iArr3 = this.e;
        if (i14 >= iArr3.length && this.f7121a < iArr3.length) {
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.e;
                if (i16 >= iArr4.length) {
                    break;
                } else if (iArr4[i16] == -1) {
                    i14 = i16;
                    break;
                } else {
                    i16++;
                }
            }
        }
        int[] iArr5 = this.e;
        if (i14 >= iArr5.length) {
            i14 = iArr5.length;
            int i17 = this.f7124d * 2;
            this.f7124d = i17;
            this.f7129j = false;
            this.f7128i = i14 - 1;
            this.f7126g = Arrays.copyOf(this.f7126g, i17);
            this.e = Arrays.copyOf(this.e, this.f7124d);
            this.f7125f = Arrays.copyOf(this.f7125f, this.f7124d);
        }
        this.e[i14] = hVar.f7164b;
        this.f7126g[i14] = f9;
        int[] iArr6 = this.f7125f;
        if (i10 != -1) {
            iArr6[i14] = iArr6[i10];
            iArr6[i10] = i14;
        } else {
            iArr6[i14] = this.f7127h;
            this.f7127h = i14;
        }
        hVar.f7173l++;
        hVar.a(bVar);
        int i18 = this.f7121a + 1;
        this.f7121a = i18;
        if (!this.f7129j) {
            this.f7128i++;
        }
        int[] iArr7 = this.e;
        if (i18 >= iArr7.length) {
            this.f7129j = true;
        }
        if (this.f7128i >= iArr7.length) {
            this.f7129j = true;
            this.f7128i = iArr7.length - 1;
        }
    }

    public final int c() {
        return this.f7121a;
    }

    public final void clear() {
        int i8 = this.f7127h;
        int i9 = 0;
        while (i8 != -1 && i9 < this.f7121a) {
            h hVar = ((h[]) this.f7123c.f7137d)[this.e[i8]];
            if (hVar != null) {
                hVar.b(this.f7122b);
            }
            i8 = this.f7125f[i8];
            i9++;
        }
        this.f7127h = -1;
        this.f7128i = -1;
        this.f7129j = false;
        this.f7121a = 0;
    }

    public final float d(b bVar, boolean z8) {
        float g9 = g(bVar.f7130a);
        e(bVar.f7130a, z8);
        b.a aVar = bVar.f7133d;
        int c9 = aVar.c();
        for (int i8 = 0; i8 < c9; i8++) {
            h f9 = aVar.f(i8);
            j(f9, aVar.g(f9) * g9, z8);
        }
        return g9;
    }

    public final float e(h hVar, boolean z8) {
        int i8 = this.f7127h;
        if (i8 == -1) {
            return 0.0f;
        }
        int i9 = 0;
        int i10 = -1;
        while (i8 != -1 && i9 < this.f7121a) {
            if (this.e[i8] == hVar.f7164b) {
                if (i8 == this.f7127h) {
                    this.f7127h = this.f7125f[i8];
                } else {
                    int[] iArr = this.f7125f;
                    iArr[i10] = iArr[i8];
                }
                if (z8) {
                    hVar.b(this.f7122b);
                }
                hVar.f7173l--;
                this.f7121a--;
                this.e[i8] = -1;
                if (this.f7129j) {
                    this.f7128i = i8;
                }
                return this.f7126g[i8];
            }
            i9++;
            i10 = i8;
            i8 = this.f7125f[i8];
        }
        return 0.0f;
    }

    public final h f(int i8) {
        int i9 = this.f7127h;
        int i10 = 0;
        while (i9 != -1 && i10 < this.f7121a) {
            if (i10 == i8) {
                return ((h[]) this.f7123c.f7137d)[this.e[i9]];
            }
            i9 = this.f7125f[i9];
            i10++;
        }
        return null;
    }

    public final float g(h hVar) {
        int i8 = this.f7127h;
        int i9 = 0;
        while (i8 != -1 && i9 < this.f7121a) {
            if (this.e[i8] == hVar.f7164b) {
                return this.f7126g[i8];
            }
            i8 = this.f7125f[i8];
            i9++;
        }
        return 0.0f;
    }

    public final boolean h(h hVar) {
        int i8 = this.f7127h;
        if (i8 == -1) {
            return false;
        }
        int i9 = 0;
        while (i8 != -1 && i9 < this.f7121a) {
            if (this.e[i8] == hVar.f7164b) {
                return true;
            }
            i8 = this.f7125f[i8];
            i9++;
        }
        return false;
    }

    public final void i(float f9) {
        int i8 = this.f7127h;
        int i9 = 0;
        while (i8 != -1 && i9 < this.f7121a) {
            float[] fArr = this.f7126g;
            fArr[i8] = fArr[i8] / f9;
            i8 = this.f7125f[i8];
            i9++;
        }
    }

    public final void j(h hVar, float f9, boolean z8) {
        if (f9 <= -0.001f || f9 >= 0.001f) {
            int i8 = this.f7127h;
            b bVar = this.f7122b;
            if (i8 == -1) {
                this.f7127h = 0;
                this.f7126g[0] = f9;
                this.e[0] = hVar.f7164b;
                this.f7125f[0] = -1;
                hVar.f7173l++;
                hVar.a(bVar);
                this.f7121a++;
                if (!this.f7129j) {
                    int i9 = this.f7128i + 1;
                    this.f7128i = i9;
                    int[] iArr = this.e;
                    if (i9 >= iArr.length) {
                        this.f7129j = true;
                        this.f7128i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i10 = 0;
            int i11 = -1;
            while (i8 != -1 && i10 < this.f7121a) {
                int i12 = this.e[i8];
                int i13 = hVar.f7164b;
                if (i12 == i13) {
                    float[] fArr = this.f7126g;
                    float f10 = fArr[i8] + f9;
                    if (f10 > -0.001f && f10 < 0.001f) {
                        f10 = 0.0f;
                    }
                    fArr[i8] = f10;
                    if (f10 == 0.0f) {
                        if (i8 == this.f7127h) {
                            this.f7127h = this.f7125f[i8];
                        } else {
                            int[] iArr2 = this.f7125f;
                            iArr2[i11] = iArr2[i8];
                        }
                        if (z8) {
                            hVar.b(bVar);
                        }
                        if (this.f7129j) {
                            this.f7128i = i8;
                        }
                        hVar.f7173l--;
                        this.f7121a--;
                        return;
                    }
                    return;
                }
                if (i12 < i13) {
                    i11 = i8;
                }
                i8 = this.f7125f[i8];
                i10++;
            }
            int i14 = this.f7128i;
            int i15 = i14 + 1;
            if (this.f7129j) {
                int[] iArr3 = this.e;
                if (iArr3[i14] != -1) {
                    i14 = iArr3.length;
                }
            } else {
                i14 = i15;
            }
            int[] iArr4 = this.e;
            if (i14 >= iArr4.length && this.f7121a < iArr4.length) {
                int i16 = 0;
                while (true) {
                    int[] iArr5 = this.e;
                    if (i16 >= iArr5.length) {
                        break;
                    } else if (iArr5[i16] == -1) {
                        i14 = i16;
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            int[] iArr6 = this.e;
            if (i14 >= iArr6.length) {
                i14 = iArr6.length;
                int i17 = this.f7124d * 2;
                this.f7124d = i17;
                this.f7129j = false;
                this.f7128i = i14 - 1;
                this.f7126g = Arrays.copyOf(this.f7126g, i17);
                this.e = Arrays.copyOf(this.e, this.f7124d);
                this.f7125f = Arrays.copyOf(this.f7125f, this.f7124d);
            }
            this.e[i14] = hVar.f7164b;
            this.f7126g[i14] = f9;
            int[] iArr7 = this.f7125f;
            if (i11 != -1) {
                iArr7[i14] = iArr7[i11];
                iArr7[i11] = i14;
            } else {
                iArr7[i14] = this.f7127h;
                this.f7127h = i14;
            }
            hVar.f7173l++;
            hVar.a(bVar);
            this.f7121a++;
            if (!this.f7129j) {
                this.f7128i++;
            }
            int i18 = this.f7128i;
            int[] iArr8 = this.e;
            if (i18 >= iArr8.length) {
                this.f7129j = true;
                this.f7128i = iArr8.length - 1;
            }
        }
    }

    public final void k() {
        int i8 = this.f7127h;
        int i9 = 0;
        while (i8 != -1 && i9 < this.f7121a) {
            float[] fArr = this.f7126g;
            fArr[i8] = fArr[i8] * -1.0f;
            i8 = this.f7125f[i8];
            i9++;
        }
    }

    public final String toString() {
        int i8 = this.f7127h;
        String str = "";
        int i9 = 0;
        while (i8 != -1 && i9 < this.f7121a) {
            str = ((str + " -> ") + this.f7126g[i8] + " : ") + ((h[]) this.f7123c.f7137d)[this.e[i8]];
            i8 = this.f7125f[i8];
            i9++;
        }
        return str;
    }
}
