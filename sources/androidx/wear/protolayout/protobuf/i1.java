package androidx.wear.protolayout.protobuf;

import androidx.wear.protolayout.protobuf.y;
import java.util.Arrays;

public final class i1 {

    /* renamed from: f  reason: collision with root package name */
    public static final i1 f2120f = new i1(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f2121a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f2122b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f2123c;

    /* renamed from: d  reason: collision with root package name */
    public int f2124d;
    public boolean e;

    public i1() {
        this(0, new int[8], new Object[8], true);
    }

    public i1(int i8, int[] iArr, Object[] objArr, boolean z8) {
        this.f2124d = -1;
        this.f2121a = i8;
        this.f2122b = iArr;
        this.f2123c = objArr;
        this.e = z8;
    }

    public final void a(int i8) {
        int[] iArr = this.f2122b;
        if (i8 > iArr.length) {
            int i9 = this.f2121a;
            int i10 = i9 + (i9 / 2);
            if (i10 >= i8) {
                i8 = i10;
            }
            if (i8 < 8) {
                i8 = 8;
            }
            this.f2122b = Arrays.copyOf(iArr, i8);
            this.f2123c = Arrays.copyOf(this.f2123c, i8);
        }
    }

    public final int b() {
        int i8;
        int i9 = this.f2124d;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f2121a; i11++) {
            int i12 = this.f2122b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                i8 = j.E(i13, ((Long) this.f2123c[i11]).longValue());
            } else if (i14 == 1) {
                ((Long) this.f2123c[i11]).longValue();
                i8 = j.o(i13);
            } else if (i14 == 2) {
                i8 = j.k(i13, (g) this.f2123c[i11]);
            } else if (i14 == 3) {
                i8 = (j.B(i13) * 2) + ((i1) this.f2123c[i11]).b();
            } else if (i14 == 5) {
                ((Integer) this.f2123c[i11]).intValue();
                i8 = j.n(i13);
            } else {
                int i15 = y.f2216f;
                throw new IllegalStateException(new y.a());
            }
            i10 += i8;
        }
        this.f2124d = i10;
        return i10;
    }

    public final void c(int i8, Object obj) {
        if (this.e) {
            a(this.f2121a + 1);
            int[] iArr = this.f2122b;
            int i9 = this.f2121a;
            iArr[i9] = i8;
            this.f2123c[i9] = obj;
            this.f2121a = i9 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(k kVar) {
        if (this.f2121a != 0) {
            kVar.getClass();
            for (int i8 = 0; i8 < this.f2121a; i8++) {
                int i9 = this.f2122b[i8];
                Object obj = this.f2123c[i8];
                int i10 = i9 >>> 3;
                int i11 = i9 & 7;
                if (i11 == 0) {
                    kVar.j(i10, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    kVar.f(i10, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    kVar.b(i10, (g) obj);
                } else if (i11 == 3) {
                    j jVar = kVar.f2130a;
                    jVar.T(i10, 3);
                    ((i1) obj).d(kVar);
                    jVar.T(i10, 4);
                } else if (i11 == 5) {
                    kVar.e(i10, ((Integer) obj).intValue());
                } else {
                    int i12 = y.f2216f;
                    throw new RuntimeException(new y.a());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z8;
        boolean z9;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        int i8 = this.f2121a;
        if (i8 == i1Var.f2121a) {
            int[] iArr = this.f2122b;
            int[] iArr2 = i1Var.f2122b;
            int i9 = 0;
            while (true) {
                if (i9 >= i8) {
                    z8 = true;
                    break;
                } else if (iArr[i9] != iArr2[i9]) {
                    z8 = false;
                    break;
                } else {
                    i9++;
                }
            }
            if (z8) {
                Object[] objArr = this.f2123c;
                Object[] objArr2 = i1Var.f2123c;
                int i10 = this.f2121a;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        z9 = true;
                        break;
                    } else if (!objArr[i11].equals(objArr2[i11])) {
                        z9 = false;
                        break;
                    } else {
                        i11++;
                    }
                }
                return z9;
            }
        }
    }

    public final int hashCode() {
        int i8 = this.f2121a;
        int i9 = (527 + i8) * 31;
        int[] iArr = this.f2122b;
        int i10 = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i8; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i9 + i11) * 31;
        Object[] objArr = this.f2123c;
        int i14 = this.f2121a;
        for (int i15 = 0; i15 < i14; i15++) {
            i10 = (i10 * 31) + objArr[i15].hashCode();
        }
        return i13 + i10;
    }
}
