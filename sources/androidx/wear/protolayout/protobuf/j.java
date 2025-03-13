package androidx.wear.protolayout.protobuf;

import androidx.fragment.app.u;
import androidx.wear.protolayout.protobuf.m1;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class j extends u {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f2125b = Logger.getLogger(j.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f2126c = l1.e;

    /* renamed from: a  reason: collision with root package name */
    public k f2127a;

    public static class a extends j {

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f2128d;
        public final int e;

        /* renamed from: f  reason: collision with root package name */
        public int f2129f;

        public a(byte[] bArr, int i8) {
            int i9 = 0 + i8;
            if ((0 | i8 | (bArr.length - i9)) >= 0) {
                this.f2128d = bArr;
                this.f2129f = 0;
                this.e = i9;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i8)}));
        }

        public final void G(byte b9) {
            try {
                byte[] bArr = this.f2128d;
                int i8 = this.f2129f;
                this.f2129f = i8 + 1;
                bArr[i8] = b9;
            } catch (IndexOutOfBoundsException e4) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2129f), Integer.valueOf(this.e), 1}), e4);
            }
        }

        public final void H(int i8, boolean z8) {
            T(i8, 0);
            G(z8 ? (byte) 1 : 0);
        }

        public final void I(int i8, g gVar) {
            T(i8, 2);
            a0(gVar);
        }

        public final void J(int i8, int i9) {
            T(i8, 5);
            K(i9);
        }

        public final void K(int i8) {
            try {
                byte[] bArr = this.f2128d;
                int i9 = this.f2129f;
                int i10 = i9 + 1;
                bArr[i9] = (byte) (i8 & 255);
                int i11 = i10 + 1;
                bArr[i10] = (byte) ((i8 >> 8) & 255);
                int i12 = i11 + 1;
                bArr[i11] = (byte) ((i8 >> 16) & 255);
                this.f2129f = i12 + 1;
                bArr[i12] = (byte) ((i8 >> 24) & 255);
            } catch (IndexOutOfBoundsException e4) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2129f), Integer.valueOf(this.e), 1}), e4);
            }
        }

        public final void L(int i8, long j8) {
            T(i8, 1);
            M(j8);
        }

        public final void M(long j8) {
            try {
                byte[] bArr = this.f2128d;
                int i8 = this.f2129f;
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
                this.f2129f = i15 + 1;
                bArr[i15] = (byte) (((int) (j8 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e4) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2129f), Integer.valueOf(this.e), 1}), e4);
            }
        }

        public final void N(int i8, int i9) {
            T(i8, 0);
            O(i9);
        }

        public final void O(int i8) {
            if (i8 >= 0) {
                V(i8);
            } else {
                X((long) i8);
            }
        }

        public final void P(int i8, o0 o0Var, b1 b1Var) {
            T(i8, 2);
            V(((a) o0Var).d(b1Var));
            b1Var.i(o0Var, this.f2127a);
        }

        public final void Q(int i8, o0 o0Var) {
            T(1, 3);
            U(2, i8);
            T(3, 2);
            b0(o0Var);
            T(1, 4);
        }

        public final void R(int i8, g gVar) {
            T(1, 3);
            U(2, i8);
            I(3, gVar);
            T(1, 4);
        }

        public final void S(int i8, String str) {
            T(i8, 2);
            c0(str);
        }

        public final void T(int i8, int i9) {
            V((i8 << 3) | i9);
        }

        public final void U(int i8, int i9) {
            T(i8, 0);
            V(i9);
        }

        public final void V(int i8) {
            while (true) {
                int i9 = i8 & -128;
                byte[] bArr = this.f2128d;
                if (i9 == 0) {
                    try {
                        int i10 = this.f2129f;
                        this.f2129f = i10 + 1;
                        bArr[i10] = (byte) i8;
                        return;
                    } catch (IndexOutOfBoundsException e4) {
                        throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2129f), Integer.valueOf(this.e), 1}), e4);
                    }
                } else {
                    int i11 = this.f2129f;
                    this.f2129f = i11 + 1;
                    bArr[i11] = (byte) ((i8 & 127) | 128);
                    i8 >>>= 7;
                }
            }
        }

        public final void W(int i8, long j8) {
            T(i8, 0);
            X(j8);
        }

        public final void X(long j8) {
            boolean z8 = j.f2126c;
            int i8 = this.e;
            byte[] bArr = this.f2128d;
            if (!z8 || i8 - this.f2129f < 10) {
                while ((j8 & -128) != 0) {
                    int i9 = this.f2129f;
                    this.f2129f = i9 + 1;
                    bArr[i9] = (byte) ((((int) j8) & 127) | 128);
                    j8 >>>= 7;
                }
                try {
                    int i10 = this.f2129f;
                    this.f2129f = i10 + 1;
                    bArr[i10] = (byte) ((int) j8);
                } catch (IndexOutOfBoundsException e4) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2129f), Integer.valueOf(i8), 1}), e4);
                }
            } else {
                while ((j8 & -128) != 0) {
                    int i11 = this.f2129f;
                    this.f2129f = i11 + 1;
                    l1.q(bArr, (long) i11, (byte) ((((int) j8) & 127) | 128));
                    j8 >>>= 7;
                }
                int i12 = this.f2129f;
                this.f2129f = i12 + 1;
                l1.q(bArr, (long) i12, (byte) ((int) j8));
            }
        }

        public final int Y() {
            return this.e - this.f2129f;
        }

        public final void Z(byte[] bArr, int i8, int i9) {
            try {
                System.arraycopy(bArr, i8, this.f2128d, this.f2129f, i9);
                this.f2129f += i9;
            } catch (IndexOutOfBoundsException e4) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2129f), Integer.valueOf(this.e), Integer.valueOf(i9)}), e4);
            }
        }

        public final void a0(g gVar) {
            V(gVar.size());
            gVar.p(this);
        }

        public final void b0(o0 o0Var) {
            V(o0Var.getSerializedSize());
            o0Var.a(this);
        }

        public final void c0(String str) {
            int i8;
            int i9 = this.f2129f;
            try {
                int D = j.D(str.length() * 3);
                int D2 = j.D(str.length());
                int i10 = this.e;
                byte[] bArr = this.f2128d;
                if (D2 == D) {
                    int i11 = i9 + D2;
                    this.f2129f = i11;
                    i8 = m1.f2146a.b(str, bArr, i11, i10 - i11);
                    this.f2129f = i9;
                    V((i8 - i9) - D2);
                } else {
                    V(m1.a(str));
                    int i12 = this.f2129f;
                    i8 = m1.f2146a.b(str, bArr, i12, i10 - i12);
                }
                this.f2129f = i8;
            } catch (m1.d e4) {
                this.f2129f = i9;
                j.f2125b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e4);
                byte[] bytes = str.getBytes(x.f2214a);
                try {
                    V(bytes.length);
                    Z(bytes, 0, bytes.length);
                } catch (IndexOutOfBoundsException e9) {
                    throw new b(e9);
                }
            } catch (IndexOutOfBoundsException e10) {
                throw new b(e10);
            }
        }

        public final void i(byte[] bArr, int i8, int i9) {
            Z(bArr, i8, i9);
        }
    }

    public static class b extends IOException {
        public b(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public b(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, indexOutOfBoundsException);
        }
    }

    public static int A(String str) {
        int i8;
        try {
            i8 = m1.a(str);
        } catch (m1.d unused) {
            i8 = str.getBytes(x.f2214a).length;
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

    public static int k(int i8, g gVar) {
        int B = B(i8);
        int size = gVar.size();
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
    public static int q(int i8, o0 o0Var, b1 b1Var) {
        return (B(i8) * 2) + ((a) o0Var).d(b1Var);
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

    public static int u(b0 b0Var) {
        int size = b0Var.f2060b != null ? b0Var.f2060b.size() : b0Var.f2059a != null ? b0Var.f2059a.getSerializedSize() : 0;
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

    public abstract void G(byte b9);

    public abstract void H(int i8, boolean z8);

    public abstract void I(int i8, g gVar);

    public abstract void J(int i8, int i9);

    public abstract void K(int i8);

    public abstract void L(int i8, long j8);

    public abstract void M(long j8);

    public abstract void N(int i8, int i9);

    public abstract void O(int i8);

    public abstract void P(int i8, o0 o0Var, b1 b1Var);

    public abstract void Q(int i8, o0 o0Var);

    public abstract void R(int i8, g gVar);

    public abstract void S(int i8, String str);

    public abstract void T(int i8, int i9);

    public abstract void U(int i8, int i9);

    public abstract void V(int i8);

    public abstract void W(int i8, long j8);

    public abstract void X(long j8);
}
