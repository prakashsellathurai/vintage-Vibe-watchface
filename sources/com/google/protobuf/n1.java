package com.google.protobuf;

import com.google.protobuf.b0;
import java.util.Arrays;

public final class n1 {

    /* renamed from: f  reason: collision with root package name */
    public static final n1 f3726f = new n1(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f3727a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f3728b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f3729c;

    /* renamed from: d  reason: collision with root package name */
    public int f3730d;
    public boolean e;

    public n1() {
        this(0, new int[8], new Object[8], true);
    }

    public n1(int i8, int[] iArr, Object[] objArr, boolean z8) {
        this.f3730d = -1;
        this.f3727a = i8;
        this.f3728b = iArr;
        this.f3729c = objArr;
        this.e = z8;
    }

    public static n1 c(n1 n1Var, n1 n1Var2) {
        int i8 = n1Var.f3727a + n1Var2.f3727a;
        int[] copyOf = Arrays.copyOf(n1Var.f3728b, i8);
        System.arraycopy(n1Var2.f3728b, 0, copyOf, n1Var.f3727a, n1Var2.f3727a);
        Object[] copyOf2 = Arrays.copyOf(n1Var.f3729c, i8);
        System.arraycopy(n1Var2.f3729c, 0, copyOf2, n1Var.f3727a, n1Var2.f3727a);
        return new n1(i8, copyOf, copyOf2, true);
    }

    public final int a() {
        int i8;
        int i9 = this.f3730d;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f3727a; i11++) {
            int i12 = this.f3728b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 == 0) {
                i8 = l.E(i13, ((Long) this.f3729c[i11]).longValue());
            } else if (i14 == 1) {
                ((Long) this.f3729c[i11]).longValue();
                i8 = l.o(i13);
            } else if (i14 == 2) {
                i8 = l.k(i13, (i) this.f3729c[i11]);
            } else if (i14 == 3) {
                i8 = (l.B(i13) * 2) + ((n1) this.f3729c[i11]).a();
            } else if (i14 == 5) {
                ((Integer) this.f3729c[i11]).intValue();
                i8 = l.n(i13);
            } else {
                int i15 = b0.f3594g;
                throw new IllegalStateException(new b0.a());
            }
            i10 += i8;
        }
        this.f3730d = i10;
        return i10;
    }

    public final boolean b(int i8, j jVar) {
        int A;
        if (this.e) {
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 == 0) {
                d(i8, Long.valueOf(jVar.s()));
                return true;
            } else if (i10 == 1) {
                d(i8, Long.valueOf(jVar.p()));
                return true;
            } else if (i10 == 2) {
                d(i8, jVar.l());
                return true;
            } else if (i10 == 3) {
                n1 n1Var = new n1();
                do {
                    A = jVar.A();
                    if (A == 0 || !n1Var.b(A, jVar)) {
                        jVar.a((i9 << 3) | 4);
                        d(i8, n1Var);
                    }
                    A = jVar.A();
                    break;
                } while (!n1Var.b(A, jVar));
                jVar.a((i9 << 3) | 4);
                d(i8, n1Var);
                return true;
            } else if (i10 == 4) {
                return false;
            } else {
                if (i10 == 5) {
                    d(i8, Integer.valueOf(jVar.o()));
                    return true;
                }
                int i11 = b0.f3594g;
                throw new b0.a();
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void d(int i8, Object obj) {
        if (this.e) {
            int i9 = this.f3727a;
            int[] iArr = this.f3728b;
            if (i9 == iArr.length) {
                int i10 = i9 + (i9 < 4 ? 8 : i9 >> 1);
                this.f3728b = Arrays.copyOf(iArr, i10);
                this.f3729c = Arrays.copyOf(this.f3729c, i10);
            }
            int[] iArr2 = this.f3728b;
            int i11 = this.f3727a;
            iArr2[i11] = i8;
            this.f3729c[i11] = obj;
            this.f3727a = i11 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void e(m mVar) {
        if (this.f3727a != 0) {
            mVar.getClass();
            for (int i8 = 0; i8 < this.f3727a; i8++) {
                int i9 = this.f3728b[i8];
                Object obj = this.f3729c[i8];
                int i10 = i9 >>> 3;
                int i11 = i9 & 7;
                if (i11 == 0) {
                    mVar.j(i10, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    mVar.f(i10, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    mVar.b(i10, (i) obj);
                } else if (i11 == 3) {
                    l lVar = mVar.f3722a;
                    lVar.Y(i10, 3);
                    ((n1) obj).e(mVar);
                    lVar.Y(i10, 4);
                } else if (i11 == 5) {
                    mVar.e(i10, ((Integer) obj).intValue());
                } else {
                    int i12 = b0.f3594g;
                    throw new RuntimeException(new b0.a());
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
        if (obj == null || !(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        int i8 = this.f3727a;
        if (i8 == n1Var.f3727a) {
            int[] iArr = this.f3728b;
            int[] iArr2 = n1Var.f3728b;
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
                Object[] objArr = this.f3729c;
                Object[] objArr2 = n1Var.f3729c;
                int i10 = this.f3727a;
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
        int i8 = this.f3727a;
        int i9 = (527 + i8) * 31;
        int[] iArr = this.f3728b;
        int i10 = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i8; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i9 + i11) * 31;
        Object[] objArr = this.f3729c;
        int i14 = this.f3727a;
        for (int i15 = 0; i15 < i14; i15++) {
            i10 = (i10 * 31) + objArr[i15].hashCode();
        }
        return i13 + i10;
    }
}
