package p;

import k3.j;

public final class d<E> implements Cloneable {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f6220j = new Object();

    /* renamed from: f  reason: collision with root package name */
    public boolean f6221f;

    /* renamed from: g  reason: collision with root package name */
    public long[] f6222g;

    /* renamed from: h  reason: collision with root package name */
    public Object[] f6223h;

    /* renamed from: i  reason: collision with root package name */
    public int f6224i;

    public d() {
        this(10);
    }

    public d(int i8) {
        this.f6221f = false;
        if (i8 == 0) {
            this.f6222g = j.f5148b;
            this.f6223h = j.f5149c;
            return;
        }
        int i9 = i8 * 8;
        int i10 = 4;
        while (true) {
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (i9 <= i11) {
                i9 = i11;
                break;
            }
            i10++;
        }
        int i12 = i9 / 8;
        this.f6222g = new long[i12];
        this.f6223h = new Object[i12];
    }

    public final void a() {
        int i8 = this.f6224i;
        Object[] objArr = this.f6223h;
        for (int i9 = 0; i9 < i8; i9++) {
            objArr[i9] = null;
        }
        this.f6224i = 0;
        this.f6221f = false;
    }

    /* renamed from: b */
    public final d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f6222g = (long[]) this.f6222g.clone();
            dVar.f6223h = (Object[]) this.f6223h.clone();
            return dVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void c() {
        int i8 = this.f6224i;
        long[] jArr = this.f6222g;
        Object[] objArr = this.f6223h;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            Object obj = objArr[i10];
            if (obj != f6220j) {
                if (i10 != i9) {
                    jArr[i9] = jArr[i10];
                    objArr[i9] = obj;
                    objArr[i10] = null;
                }
                i9++;
            }
        }
        this.f6221f = false;
        this.f6224i = i9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r2 = r2.f6223h[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(long r3, java.lang.Long r5) {
        /*
            r2 = this;
            long[] r0 = r2.f6222g
            int r1 = r2.f6224i
            int r3 = k3.j.i(r0, r1, r3)
            if (r3 < 0) goto L_0x0014
            java.lang.Object[] r2 = r2.f6223h
            r2 = r2[r3]
            java.lang.Object r3 = f6220j
            if (r2 != r3) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return r2
        L_0x0014:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.d.d(long, java.lang.Long):java.lang.Object");
    }

    public final long e(int i8) {
        if (this.f6221f) {
            c();
        }
        return this.f6222g[i8];
    }

    public final void f(long j8, E e) {
        int i8 = j.i(this.f6222g, this.f6224i, j8);
        if (i8 >= 0) {
            this.f6223h[i8] = e;
            return;
        }
        int i9 = ~i8;
        int i10 = this.f6224i;
        if (i9 < i10) {
            Object[] objArr = this.f6223h;
            if (objArr[i9] == f6220j) {
                this.f6222g[i9] = j8;
                objArr[i9] = e;
                return;
            }
        }
        if (this.f6221f && i10 >= this.f6222g.length) {
            c();
            i9 = ~j.i(this.f6222g, this.f6224i, j8);
        }
        int i11 = this.f6224i;
        if (i11 >= this.f6222g.length) {
            int i12 = (i11 + 1) * 8;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 8;
            long[] jArr = new long[i15];
            Object[] objArr2 = new Object[i15];
            long[] jArr2 = this.f6222g;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f6223h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f6222g = jArr;
            this.f6223h = objArr2;
        }
        int i16 = this.f6224i - i9;
        if (i16 != 0) {
            long[] jArr3 = this.f6222g;
            int i17 = i9 + 1;
            System.arraycopy(jArr3, i9, jArr3, i17, i16);
            Object[] objArr4 = this.f6223h;
            System.arraycopy(objArr4, i9, objArr4, i17, this.f6224i - i9);
        }
        this.f6222g[i9] = j8;
        this.f6223h[i9] = e;
        this.f6224i++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f6223h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f6222g
            int r1 = r2.f6224i
            int r3 = k3.j.i(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f6223h
            r0 = r4[r3]
            java.lang.Object r1 = f6220j
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f6221f = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.d.g(long):void");
    }

    public final int h() {
        if (this.f6221f) {
            c();
        }
        return this.f6224i;
    }

    public final E i(int i8) {
        if (this.f6221f) {
            c();
        }
        return this.f6223h[i8];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f6224i * 28);
        sb.append('{');
        for (int i8 = 0; i8 < this.f6224i; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(e(i8));
            sb.append('=');
            Object i9 = i(i8);
            if (i9 != this) {
                sb.append(i9);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
