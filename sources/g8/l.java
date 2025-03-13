package g8;

import java.nio.charset.Charset;
import java.util.Arrays;

public final class l extends c {

    /* renamed from: k  reason: collision with root package name */
    public final transient byte[][] f4711k;

    /* renamed from: l  reason: collision with root package name */
    public final transient int[] f4712l;

    public l(a aVar, int i8) {
        super((byte[]) null);
        n.a(aVar.f4683g, 0, (long) i8);
        j jVar = aVar.f4682f;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            int i12 = jVar.f4705c;
            int i13 = jVar.f4704b;
            if (i12 != i13) {
                i10 += i12 - i13;
                i11++;
                jVar = jVar.f4707f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f4711k = new byte[i11][];
        this.f4712l = new int[(i11 * 2)];
        j jVar2 = aVar.f4682f;
        int i14 = 0;
        while (i9 < i8) {
            byte[][] bArr = this.f4711k;
            bArr[i14] = jVar2.f4703a;
            int i15 = jVar2.f4705c;
            int i16 = jVar2.f4704b;
            i9 += i15 - i16;
            if (i9 > i8) {
                i9 = i8;
            }
            int[] iArr = this.f4712l;
            iArr[i14] = i9;
            iArr[bArr.length + i14] = i16;
            jVar2.f4706d = true;
            i14++;
            jVar2 = jVar2.f4707f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return cVar.j() == j() && i(cVar, j());
        }
    }

    public final byte f(int i8) {
        byte[][] bArr = this.f4711k;
        int[] iArr = this.f4712l;
        n.a((long) iArr[bArr.length - 1], (long) i8, 1);
        int o8 = o(i8);
        return bArr[o8][(i8 - (o8 == 0 ? 0 : iArr[o8 - 1])) + iArr[bArr.length + o8]];
    }

    public final String g() {
        return new c(p()).g();
    }

    public final boolean h(int i8, int i9, int i10, byte[] bArr) {
        if (i8 < 0 || i8 > j() - i10 || i9 < 0 || i9 > bArr.length - i10) {
            return false;
        }
        int o8 = o(i8);
        while (true) {
            boolean z8 = true;
            if (i10 <= 0) {
                return true;
            }
            int[] iArr = this.f4712l;
            int i11 = o8 == 0 ? 0 : iArr[o8 - 1];
            int min = Math.min(i10, ((iArr[o8] - i11) + i11) - i8);
            byte[][] bArr2 = this.f4711k;
            int i12 = (i8 - i11) + iArr[bArr2.length + o8];
            byte[] bArr3 = bArr2[o8];
            Charset charset = n.f4713a;
            int i13 = 0;
            while (true) {
                if (i13 >= min) {
                    break;
                } else if (bArr3[i13 + i12] != bArr[i13 + i9]) {
                    z8 = false;
                    break;
                } else {
                    i13++;
                }
            }
            if (!z8) {
                return false;
            }
            i8 += min;
            i9 += min;
            i10 -= min;
            o8++;
        }
    }

    public final int hashCode() {
        int i8 = this.f4687g;
        if (i8 != 0) {
            return i8;
        }
        byte[][] bArr = this.f4711k;
        int length = bArr.length;
        int i9 = 0;
        int i10 = 1;
        int i11 = 0;
        while (i9 < length) {
            byte[] bArr2 = bArr[i9];
            int[] iArr = this.f4712l;
            int i12 = iArr[length + i9];
            int i13 = iArr[i9];
            int i14 = (i13 - i11) + i12;
            while (i12 < i14) {
                i10 = (i10 * 31) + bArr2[i12];
                i12++;
            }
            i9++;
            i11 = i13;
        }
        this.f4687g = i10;
        return i10;
    }

    public final boolean i(c cVar, int i8) {
        if (j() - i8 < 0) {
            return false;
        }
        int o8 = o(0);
        int i9 = 0;
        int i10 = 0;
        while (i8 > 0) {
            int[] iArr = this.f4712l;
            int i11 = o8 == 0 ? 0 : iArr[o8 - 1];
            int min = Math.min(i8, ((iArr[o8] - i11) + i11) - i9);
            byte[][] bArr = this.f4711k;
            if (!cVar.h(i10, (i9 - i11) + iArr[bArr.length + o8], min, bArr[o8])) {
                return false;
            }
            i9 += min;
            i10 += min;
            i8 -= min;
            o8++;
        }
        return true;
    }

    public final int j() {
        return this.f4712l[this.f4711k.length - 1];
    }

    public final c l() {
        return new c(p()).l();
    }

    public final String n() {
        return new c(p()).n();
    }

    public final int o(int i8) {
        int binarySearch = Arrays.binarySearch(this.f4712l, 0, this.f4711k.length, i8 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    public final byte[] p() {
        byte[][] bArr = this.f4711k;
        int[] iArr = this.f4712l;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = iArr[length + i8];
            int i11 = iArr[i8];
            System.arraycopy(bArr[i8], i10, bArr2, i9, i11 - i9);
            i8++;
            i9 = i11;
        }
        return bArr2;
    }

    public final String toString() {
        return new c(p()).toString();
    }
}
