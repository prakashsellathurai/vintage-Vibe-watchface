package com.google.protobuf;

import androidx.fragment.app.u;
import com.google.protobuf.r1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class l extends u {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f3712b = Logger.getLogger(l.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f3713c = q1.e;

    /* renamed from: a  reason: collision with root package name */
    public m f3714a;

    public static abstract class a extends l {

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f3715d;
        public final int e;

        /* renamed from: f  reason: collision with root package name */
        public int f3716f;

        public a(int i8) {
            if (i8 >= 0) {
                byte[] bArr = new byte[Math.max(i8, 20)];
                this.f3715d = bArr;
                this.e = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        public final void d0(int i8) {
            int i9 = this.f3716f;
            int i10 = i9 + 1;
            byte[] bArr = this.f3715d;
            bArr[i9] = (byte) (i8 & 255);
            int i11 = i10 + 1;
            bArr[i10] = (byte) ((i8 >> 8) & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((i8 >> 16) & 255);
            this.f3716f = i12 + 1;
            bArr[i12] = (byte) ((i8 >> 24) & 255);
        }

        public final void e0(long j8) {
            int i8 = this.f3716f;
            int i9 = i8 + 1;
            byte[] bArr = this.f3715d;
            bArr[i8] = (byte) ((int) (j8 & 255));
            int i10 = i9 + 1;
            bArr[i9] = (byte) ((int) ((j8 >> 8) & 255));
            int i11 = i10 + 1;
            bArr[i10] = (byte) ((int) ((j8 >> 16) & 255));
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((int) (255 & (j8 >> 24)));
            int i13 = i12 + 1;
            bArr[i12] = (byte) (((int) (j8 >> 32)) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (((int) (j8 >> 40)) & 255);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j8 >> 48)) & 255);
            this.f3716f = i15 + 1;
            bArr[i15] = (byte) (((int) (j8 >> 56)) & 255);
        }

        public final void f0(int i8, int i9) {
            g0((i8 << 3) | i9);
        }

        public final void g0(int i8) {
            boolean z8 = l.f3713c;
            byte[] bArr = this.f3715d;
            if (z8) {
                while ((i8 & -128) != 0) {
                    int i9 = this.f3716f;
                    this.f3716f = i9 + 1;
                    q1.s(bArr, (long) i9, (byte) ((i8 & 127) | 128));
                    i8 >>>= 7;
                }
                int i10 = this.f3716f;
                this.f3716f = i10 + 1;
                q1.s(bArr, (long) i10, (byte) i8);
                return;
            }
            while ((i8 & -128) != 0) {
                int i11 = this.f3716f;
                this.f3716f = i11 + 1;
                bArr[i11] = (byte) ((i8 & 127) | 128);
                i8 >>>= 7;
            }
            int i12 = this.f3716f;
            this.f3716f = i12 + 1;
            bArr[i12] = (byte) i8;
        }

        public final void h0(long j8) {
            boolean z8 = l.f3713c;
            byte[] bArr = this.f3715d;
            if (z8) {
                while ((j8 & -128) != 0) {
                    int i8 = this.f3716f;
                    this.f3716f = i8 + 1;
                    q1.s(bArr, (long) i8, (byte) ((((int) j8) & 127) | 128));
                    j8 >>>= 7;
                }
                int i9 = this.f3716f;
                this.f3716f = i9 + 1;
                q1.s(bArr, (long) i9, (byte) ((int) j8));
                return;
            }
            while ((j8 & -128) != 0) {
                int i10 = this.f3716f;
                this.f3716f = i10 + 1;
                bArr[i10] = (byte) ((((int) j8) & 127) | 128);
                j8 >>>= 7;
            }
            int i11 = this.f3716f;
            this.f3716f = i11 + 1;
            bArr[i11] = (byte) ((int) j8);
        }
    }

    public static class b extends l {

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f3717d;
        public final int e;

        /* renamed from: f  reason: collision with root package name */
        public int f3718f;

        public b(byte[] bArr, int i8) {
            int i9 = 0 + i8;
            if ((0 | i8 | (bArr.length - i9)) >= 0) {
                this.f3717d = bArr;
                this.f3718f = 0;
                this.e = i9;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i8)}));
        }

        public final void H(byte b9) {
            try {
                byte[] bArr = this.f3717d;
                int i8 = this.f3718f;
                this.f3718f = i8 + 1;
                bArr[i8] = b9;
            } catch (IndexOutOfBoundsException e4) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3718f), Integer.valueOf(this.e), 1}), e4);
            }
        }

        public final void I(int i8, boolean z8) {
            Y(i8, 0);
            H(z8 ? (byte) 1 : 0);
        }

        public final void J(byte[] bArr, int i8) {
            a0(i8);
            e0(bArr, 0, i8);
        }

        public final void K(int i8, i iVar) {
            Y(i8, 2);
            L(iVar);
        }

        public final void L(i iVar) {
            a0(iVar.size());
            iVar.v(this);
        }

        public final void M(int i8, int i9) {
            Y(i8, 5);
            N(i9);
        }

        public final void N(int i8) {
            try {
                byte[] bArr = this.f3717d;
                int i9 = this.f3718f;
                int i10 = i9 + 1;
                bArr[i9] = (byte) (i8 & 255);
                int i11 = i10 + 1;
                bArr[i10] = (byte) ((i8 >> 8) & 255);
                int i12 = i11 + 1;
                bArr[i11] = (byte) ((i8 >> 16) & 255);
                this.f3718f = i12 + 1;
                bArr[i12] = (byte) ((i8 >> 24) & 255);
            } catch (IndexOutOfBoundsException e4) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3718f), Integer.valueOf(this.e), 1}), e4);
            }
        }

        public final void O(int i8, long j8) {
            Y(i8, 1);
            P(j8);
        }

        public final void P(long j8) {
            try {
                byte[] bArr = this.f3717d;
                int i8 = this.f3718f;
                int i9 = i8 + 1;
                bArr[i8] = (byte) (((int) j8) & 255);
                int i10 = i9 + 1;
                bArr[i9] = (byte) (((int) (j8 >> 8)) & 255);
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((int) (j8 >> 16)) & 255);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((int) (j8 >> 24)) & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((int) (j8 >> 32)) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((int) (j8 >> 40)) & 255);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (((int) (j8 >> 48)) & 255);
                this.f3718f = i15 + 1;
                bArr[i15] = (byte) (((int) (j8 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e4) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3718f), Integer.valueOf(this.e), 1}), e4);
            }
        }

        public final void Q(int i8, int i9) {
            Y(i8, 0);
            R(i9);
        }

        public final void R(int i8) {
            if (i8 >= 0) {
                a0(i8);
            } else {
                c0((long) i8);
            }
        }

        public final void S(int i8, r0 r0Var, f1 f1Var) {
            Y(i8, 2);
            a0(((a) r0Var).getSerializedSize(f1Var));
            f1Var.h(r0Var, this.f3714a);
        }

        public final void T(r0 r0Var) {
            a0(r0Var.getSerializedSize());
            r0Var.writeTo(this);
        }

        public final void U(int i8, r0 r0Var) {
            Y(1, 3);
            Z(2, i8);
            Y(3, 2);
            T(r0Var);
            Y(1, 4);
        }

        public final void V(int i8, i iVar) {
            Y(1, 3);
            Z(2, i8);
            K(3, iVar);
            Y(1, 4);
        }

        public final void W(int i8, String str) {
            Y(i8, 2);
            X(str);
        }

        public final void X(String str) {
            int i8;
            int i9 = this.f3718f;
            try {
                int D = l.D(str.length() * 3);
                int D2 = l.D(str.length());
                int i10 = this.e;
                byte[] bArr = this.f3717d;
                if (D2 == D) {
                    int i11 = i9 + D2;
                    this.f3718f = i11;
                    i8 = r1.f3750a.d(str, bArr, i11, i10 - i11);
                    this.f3718f = i9;
                    a0((i8 - i9) - D2);
                } else {
                    a0(r1.a(str));
                    int i12 = this.f3718f;
                    i8 = r1.f3750a.d(str, bArr, i12, i10 - i12);
                }
                this.f3718f = i8;
            } catch (r1.d e4) {
                this.f3718f = i9;
                G(str, e4);
            } catch (IndexOutOfBoundsException e9) {
                throw new c(e9);
            }
        }

        public final void Y(int i8, int i9) {
            a0((i8 << 3) | i9);
        }

        public final void Z(int i8, int i9) {
            Y(i8, 0);
            a0(i9);
        }

        public final void a0(int i8) {
            boolean z8 = l.f3713c;
            int i9 = this.e;
            byte[] bArr = this.f3717d;
            if (z8 && !d.a()) {
                int i10 = this.f3718f;
                if (i9 - i10 >= 5) {
                    if ((i8 & -128) != 0) {
                        this.f3718f = i10 + 1;
                        q1.s(bArr, (long) i10, (byte) (i8 | 128));
                        i8 >>>= 7;
                        if ((i8 & -128) != 0) {
                            int i11 = this.f3718f;
                            this.f3718f = i11 + 1;
                            q1.s(bArr, (long) i11, (byte) (i8 | 128));
                            i8 >>>= 7;
                            if ((i8 & -128) != 0) {
                                int i12 = this.f3718f;
                                this.f3718f = i12 + 1;
                                q1.s(bArr, (long) i12, (byte) (i8 | 128));
                                i8 >>>= 7;
                                if ((i8 & -128) != 0) {
                                    int i13 = this.f3718f;
                                    this.f3718f = i13 + 1;
                                    q1.s(bArr, (long) i13, (byte) (i8 | 128));
                                    i8 >>>= 7;
                                    i10 = this.f3718f;
                                }
                            }
                        }
                        i10 = this.f3718f;
                    }
                    this.f3718f = i10 + 1;
                    q1.s(bArr, (long) i10, (byte) i8);
                    return;
                }
            }
            while ((i8 & -128) != 0) {
                int i14 = this.f3718f;
                this.f3718f = i14 + 1;
                bArr[i14] = (byte) ((i8 & 127) | 128);
                i8 >>>= 7;
            }
            try {
                int i15 = this.f3718f;
                this.f3718f = i15 + 1;
                bArr[i15] = (byte) i8;
            } catch (IndexOutOfBoundsException e4) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3718f), Integer.valueOf(i9), 1}), e4);
            }
        }

        public final void b0(int i8, long j8) {
            Y(i8, 0);
            c0(j8);
        }

        public final void c0(long j8) {
            boolean z8 = l.f3713c;
            int i8 = this.e;
            byte[] bArr = this.f3717d;
            if (!z8 || i8 - this.f3718f < 10) {
                while ((j8 & -128) != 0) {
                    int i9 = this.f3718f;
                    this.f3718f = i9 + 1;
                    bArr[i9] = (byte) ((((int) j8) & 127) | 128);
                    j8 >>>= 7;
                }
                try {
                    int i10 = this.f3718f;
                    this.f3718f = i10 + 1;
                    bArr[i10] = (byte) ((int) j8);
                } catch (IndexOutOfBoundsException e4) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3718f), Integer.valueOf(i8), 1}), e4);
                }
            } else {
                while ((j8 & -128) != 0) {
                    int i11 = this.f3718f;
                    this.f3718f = i11 + 1;
                    q1.s(bArr, (long) i11, (byte) ((((int) j8) & 127) | 128));
                    j8 >>>= 7;
                }
                int i12 = this.f3718f;
                this.f3718f = i12 + 1;
                q1.s(bArr, (long) i12, (byte) ((int) j8));
            }
        }

        public final int d0() {
            return this.e - this.f3718f;
        }

        public final void e0(byte[] bArr, int i8, int i9) {
            try {
                System.arraycopy(bArr, i8, this.f3717d, this.f3718f, i9);
                this.f3718f += i9;
            } catch (IndexOutOfBoundsException e4) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f3718f), Integer.valueOf(this.e), Integer.valueOf(i9)}), e4);
            }
        }

        public final void i(byte[] bArr, int i8, int i9) {
            e0(bArr, i8, i9);
        }
    }

    public static class c extends IOException {
        public c(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public c(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, indexOutOfBoundsException);
        }
    }

    public static final class d extends a {

        /* renamed from: g  reason: collision with root package name */
        public final OutputStream f3719g;

        public d(OutputStream outputStream, int i8) {
            super(i8);
            if (outputStream != null) {
                this.f3719g = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        public final void H(byte b9) {
            if (this.f3716f == this.e) {
                i0();
            }
            int i8 = this.f3716f;
            this.f3716f = i8 + 1;
            this.f3715d[i8] = b9;
        }

        public final void I(int i8, boolean z8) {
            j0(11);
            f0(i8, 0);
            byte b9 = z8 ? (byte) 1 : 0;
            int i9 = this.f3716f;
            this.f3716f = i9 + 1;
            this.f3715d[i9] = b9;
        }

        public final void J(byte[] bArr, int i8) {
            a0(i8);
            k0(bArr, 0, i8);
        }

        public final void K(int i8, i iVar) {
            Y(i8, 2);
            L(iVar);
        }

        public final void L(i iVar) {
            a0(iVar.size());
            iVar.v(this);
        }

        public final void M(int i8, int i9) {
            j0(14);
            f0(i8, 5);
            d0(i9);
        }

        public final void N(int i8) {
            j0(4);
            d0(i8);
        }

        public final void O(int i8, long j8) {
            j0(18);
            f0(i8, 1);
            e0(j8);
        }

        public final void P(long j8) {
            j0(8);
            e0(j8);
        }

        public final void Q(int i8, int i9) {
            j0(20);
            f0(i8, 0);
            if (i9 >= 0) {
                g0(i9);
            } else {
                h0((long) i9);
            }
        }

        public final void R(int i8) {
            if (i8 >= 0) {
                a0(i8);
            } else {
                c0((long) i8);
            }
        }

        public final void S(int i8, r0 r0Var, f1 f1Var) {
            Y(i8, 2);
            a0(((a) r0Var).getSerializedSize(f1Var));
            f1Var.h(r0Var, this.f3714a);
        }

        public final void T(r0 r0Var) {
            a0(r0Var.getSerializedSize());
            r0Var.writeTo(this);
        }

        public final void U(int i8, r0 r0Var) {
            Y(1, 3);
            Z(2, i8);
            Y(3, 2);
            T(r0Var);
            Y(1, 4);
        }

        public final void V(int i8, i iVar) {
            Y(1, 3);
            Z(2, i8);
            K(3, iVar);
            Y(1, 4);
        }

        public final void W(int i8, String str) {
            Y(i8, 2);
            X(str);
        }

        public final void X(String str) {
            int i8;
            try {
                int length = str.length() * 3;
                int D = l.D(length);
                int i9 = D + length;
                int i10 = this.e;
                if (i9 > i10) {
                    byte[] bArr = new byte[length];
                    int d9 = r1.f3750a.d(str, bArr, 0, length);
                    a0(d9);
                    k0(bArr, 0, d9);
                    return;
                }
                if (i9 > i10 - this.f3716f) {
                    i0();
                }
                int D2 = l.D(str.length());
                i8 = this.f3716f;
                byte[] bArr2 = this.f3715d;
                if (D2 == D) {
                    int i11 = i8 + D2;
                    this.f3716f = i11;
                    int d10 = r1.f3750a.d(str, bArr2, i11, i10 - i11);
                    this.f3716f = i8;
                    g0((d10 - i8) - D2);
                    this.f3716f = d10;
                    return;
                }
                int a9 = r1.a(str);
                g0(a9);
                this.f3716f = r1.f3750a.d(str, bArr2, this.f3716f, a9);
            } catch (r1.d e) {
                this.f3716f = i8;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e4) {
                throw new c(e4);
            } catch (r1.d e9) {
                G(str, e9);
            }
        }

        public final void Y(int i8, int i9) {
            a0((i8 << 3) | i9);
        }

        public final void Z(int i8, int i9) {
            j0(20);
            f0(i8, 0);
            g0(i9);
        }

        public final void a0(int i8) {
            j0(5);
            g0(i8);
        }

        public final void b0(int i8, long j8) {
            j0(20);
            f0(i8, 0);
            h0(j8);
        }

        public final void c0(long j8) {
            j0(10);
            h0(j8);
        }

        public final void i(byte[] bArr, int i8, int i9) {
            k0(bArr, i8, i9);
        }

        public final void i0() {
            this.f3719g.write(this.f3715d, 0, this.f3716f);
            this.f3716f = 0;
        }

        public final void j0(int i8) {
            if (this.e - this.f3716f < i8) {
                i0();
            }
        }

        public final void k0(byte[] bArr, int i8, int i9) {
            int i10 = this.f3716f;
            int i11 = this.e;
            int i12 = i11 - i10;
            byte[] bArr2 = this.f3715d;
            if (i12 >= i9) {
                System.arraycopy(bArr, i8, bArr2, i10, i9);
                this.f3716f += i9;
                return;
            }
            System.arraycopy(bArr, i8, bArr2, i10, i12);
            int i13 = i8 + i12;
            int i14 = i9 - i12;
            this.f3716f = i11;
            i0();
            if (i14 <= i11) {
                System.arraycopy(bArr, i13, bArr2, 0, i14);
                this.f3716f = i14;
                return;
            }
            this.f3719g.write(bArr, i13, i14);
        }
    }

    public static int A(String str) {
        int i8;
        try {
            i8 = r1.a(str);
        } catch (r1.d unused) {
            i8 = str.getBytes(a0.f3590b).length;
        }
        return D(i8) + i8;
    }

    public static int B(int i8) {
        return D((i8 << 3) | 0);
    }

    public static int C(int i8, int i9) {
        return B(i8) + D(i9);
    }

    public static int D(int i8) {
        if ((i8 & -128) == 0) {
            return 1;
        }
        if ((i8 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i8) == 0) {
            return 3;
        }
        return (i8 & -268435456) == 0 ? 4 : 5;
    }

    public static int E(int i8, long j8) {
        return B(i8) + F(j8);
    }

    public static int F(long j8) {
        int i8;
        if ((-128 & j8) == 0) {
            return 1;
        }
        if (j8 < 0) {
            return 10;
        }
        if ((-34359738368L & j8) != 0) {
            j8 >>>= 28;
            i8 = 6;
        } else {
            i8 = 2;
        }
        if ((-2097152 & j8) != 0) {
            i8 += 2;
            j8 >>>= 14;
        }
        return (j8 & -16384) != 0 ? i8 + 1 : i8;
    }

    public static int j(int i8) {
        return B(i8) + 1;
    }

    public static int k(int i8, i iVar) {
        int B = B(i8);
        int size = iVar.size();
        return B + D(size) + size;
    }

    public static int l(int i8) {
        return B(i8) + 8;
    }

    public static int m(int i8, int i9) {
        return B(i8) + s(i9);
    }

    public static int n(int i8) {
        return B(i8) + 4;
    }

    public static int o(int i8) {
        return B(i8) + 8;
    }

    public static int p(int i8) {
        return B(i8) + 4;
    }

    @Deprecated
    public static int q(int i8, r0 r0Var, f1 f1Var) {
        return (B(i8) * 2) + ((a) r0Var).getSerializedSize(f1Var);
    }

    public static int r(int i8, int i9) {
        return B(i8) + s(i9);
    }

    public static int s(int i8) {
        if (i8 >= 0) {
            return D(i8);
        }
        return 10;
    }

    public static int t(int i8, long j8) {
        return B(i8) + F(j8);
    }

    public static int u(e0 e0Var) {
        int size = e0Var.f3628b != null ? e0Var.f3628b.size() : e0Var.f3627a != null ? e0Var.f3627a.getSerializedSize() : 0;
        return D(size) + size;
    }

    public static int v(int i8) {
        return B(i8) + 4;
    }

    public static int w(int i8) {
        return B(i8) + 8;
    }

    public static int x(int i8, int i9) {
        return B(i8) + D((i9 >> 31) ^ (i9 << 1));
    }

    public static int y(int i8, long j8) {
        return B(i8) + F((j8 >> 63) ^ (j8 << 1));
    }

    public static int z(int i8, String str) {
        return B(i8) + A(str);
    }

    public final void G(String str, r1.d dVar) {
        f3712b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(a0.f3590b);
        try {
            a0(bytes.length);
            i(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new c(e);
        } catch (c e4) {
            throw e4;
        }
    }

    public abstract void H(byte b9);

    public abstract void I(int i8, boolean z8);

    public abstract void J(byte[] bArr, int i8);

    public abstract void K(int i8, i iVar);

    public abstract void L(i iVar);

    public abstract void M(int i8, int i9);

    public abstract void N(int i8);

    public abstract void O(int i8, long j8);

    public abstract void P(long j8);

    public abstract void Q(int i8, int i9);

    public abstract void R(int i8);

    public abstract void S(int i8, r0 r0Var, f1 f1Var);

    public abstract void T(r0 r0Var);

    public abstract void U(int i8, r0 r0Var);

    public abstract void V(int i8, i iVar);

    public abstract void W(int i8, String str);

    public abstract void X(String str);

    public abstract void Y(int i8, int i9);

    public abstract void Z(int i8, int i9);

    public abstract void a0(int i8);

    public abstract void b0(int i8, long j8);

    public abstract void c0(long j8);
}
