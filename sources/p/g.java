package p;

import k3.j;

public final class g<E> implements Cloneable {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f6236i = new Object();

    /* renamed from: f  reason: collision with root package name */
    public int[] f6237f;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f6238g;

    /* renamed from: h  reason: collision with root package name */
    public int f6239h;

    public g() {
        int i8;
        int i9 = 4;
        while (true) {
            i8 = 40;
            if (i9 >= 32) {
                break;
            }
            int i10 = (1 << i9) - 12;
            if (40 <= i10) {
                i8 = i10;
                break;
            }
            i9++;
        }
        int i11 = i8 / 4;
        this.f6237f = new int[i11];
        this.f6238g = new Object[i11];
    }

    public final void a(int i8, E e) {
        int i9 = this.f6239h;
        if (i9 == 0 || i8 > this.f6237f[i9 - 1]) {
            if (i9 >= this.f6237f.length) {
                int i10 = (i9 + 1) * 4;
                int i11 = 4;
                while (true) {
                    if (i11 >= 32) {
                        break;
                    }
                    int i12 = (1 << i11) - 12;
                    if (i10 <= i12) {
                        i10 = i12;
                        break;
                    }
                    i11++;
                }
                int i13 = i10 / 4;
                int[] iArr = new int[i13];
                Object[] objArr = new Object[i13];
                int[] iArr2 = this.f6237f;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f6238g;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f6237f = iArr;
                this.f6238g = objArr;
            }
            this.f6237f[i9] = i8;
            this.f6238g[i9] = e;
            this.f6239h = i9 + 1;
            return;
        }
        d(i8, e);
    }

    /* renamed from: b */
    public final g<E> clone() {
        try {
            g<E> gVar = (g) super.clone();
            gVar.f6237f = (int[]) this.f6237f.clone();
            gVar.f6238g = (Object[]) this.f6238g.clone();
            return gVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r2 = r2.f6238g[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(int r3, java.lang.Integer r4) {
        /*
            r2 = this;
            int[] r0 = r2.f6237f
            int r1 = r2.f6239h
            int r3 = k3.j.h(r1, r3, r0)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r2 = r2.f6238g
            r2 = r2[r3]
            java.lang.Object r3 = f6236i
            if (r2 != r3) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r2
        L_0x0014:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g.c(int, java.lang.Integer):java.lang.Object");
    }

    public final void d(int i8, E e) {
        int h8 = j.h(this.f6239h, i8, this.f6237f);
        if (h8 >= 0) {
            this.f6238g[h8] = e;
            return;
        }
        int i9 = ~h8;
        int i10 = this.f6239h;
        if (i9 < i10) {
            Object[] objArr = this.f6238g;
            if (objArr[i9] == f6236i) {
                this.f6237f[i9] = i8;
                objArr[i9] = e;
                return;
            }
        }
        if (i10 >= this.f6237f.length) {
            int i11 = (i10 + 1) * 4;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 4;
            int[] iArr = new int[i14];
            Object[] objArr2 = new Object[i14];
            int[] iArr2 = this.f6237f;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f6238g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f6237f = iArr;
            this.f6238g = objArr2;
        }
        int i15 = this.f6239h - i9;
        if (i15 != 0) {
            int[] iArr3 = this.f6237f;
            int i16 = i9 + 1;
            System.arraycopy(iArr3, i9, iArr3, i16, i15);
            Object[] objArr4 = this.f6238g;
            System.arraycopy(objArr4, i9, objArr4, i16, this.f6239h - i9);
        }
        this.f6237f[i9] = i8;
        this.f6238g[i9] = e;
        this.f6239h++;
    }

    public final int e() {
        return this.f6239h;
    }

    public final String toString() {
        int i8 = this.f6239h;
        if (i8 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i8 * 28);
        sb.append('{');
        for (int i9 = 0; i9 < this.f6239h; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            sb.append(this.f6237f[i9]);
            sb.append('=');
            Object obj = this.f6238g[i9];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
