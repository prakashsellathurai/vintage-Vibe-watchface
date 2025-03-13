package androidx.wear.protolayout.protobuf;

import androidx.wear.protolayout.protobuf.g;
import androidx.wear.protolayout.protobuf.y;
import java.util.Arrays;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public int f2105a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2106b = 100;

    /* renamed from: c  reason: collision with root package name */
    public i f2107c;

    public static final class a extends h {

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f2108d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f2109f;

        /* renamed from: g  reason: collision with root package name */
        public int f2110g;

        /* renamed from: h  reason: collision with root package name */
        public final int f2111h;

        /* renamed from: i  reason: collision with root package name */
        public int f2112i;

        /* renamed from: j  reason: collision with root package name */
        public int f2113j = Integer.MAX_VALUE;

        public a(byte[] bArr, int i8, int i9, boolean z8) {
            this.f2108d = bArr;
            this.e = i9 + i8;
            this.f2110g = i8;
            this.f2111h = i8;
        }

        public final long A() {
            int i8 = this.f2110g;
            if (this.e - i8 >= 8) {
                this.f2110g = i8 + 8;
                byte[] bArr = this.f2108d;
                return ((((long) bArr[i8 + 1]) & 255) << 8) | (((long) bArr[i8]) & 255) | ((((long) bArr[i8 + 2]) & 255) << 16) | ((((long) bArr[i8 + 3]) & 255) << 24) | ((((long) bArr[i8 + 4]) & 255) << 32) | ((((long) bArr[i8 + 5]) & 255) << 40) | ((((long) bArr[i8 + 6]) & 255) << 48) | ((((long) bArr[i8 + 7]) & 255) << 56);
            }
            throw y.c();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r3[r2] < 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int B() {
            /*
                r5 = this;
                int r0 = r5.f2110g
                int r1 = r5.e
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                int r2 = r0 + 1
                byte[] r3 = r5.f2108d
                byte r0 = r3[r0]
                if (r0 < 0) goto L_0x0012
                r5.f2110g = r2
                return r0
            L_0x0012:
                int r1 = r1 - r2
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r2 + 1
                byte r2 = r3[r2]
                int r2 = r2 << 7
                r0 = r0 ^ r2
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r2 = r1 + 1
                byte r1 = r3[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r2
                goto L_0x0070
            L_0x0031:
                int r1 = r2 + 1
                byte r2 = r3[r2]
                int r2 = r2 << 21
                r0 = r0 ^ r2
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r2 = r1 + 1
                byte r1 = r3[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r2 + 1
                byte r2 = r3[r2]
                if (r2 >= 0) goto L_0x0070
                int r2 = r1 + 1
                byte r1 = r3[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r2 + 1
                byte r2 = r3[r2]
                if (r2 >= 0) goto L_0x0070
                int r2 = r1 + 1
                byte r1 = r3[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r2 + 1
                byte r2 = r3[r2]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.D()
                int r5 = (int) r0
                return r5
            L_0x0070:
                r5.f2110g = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.h.a.B():int");
        }

        public final long C() {
            long j8;
            long j9;
            long j10;
            byte b9;
            int i8 = this.f2110g;
            int i9 = this.e;
            if (i9 != i8) {
                int i10 = i8 + 1;
                byte[] bArr = this.f2108d;
                byte b10 = bArr[i8];
                if (b10 >= 0) {
                    this.f2110g = i10;
                    return (long) b10;
                } else if (i9 - i10 >= 9) {
                    int i11 = i10 + 1;
                    byte b11 = b10 ^ (bArr[i10] << 7);
                    if (b11 < 0) {
                        b9 = b11 ^ Byte.MIN_VALUE;
                    } else {
                        int i12 = i11 + 1;
                        byte b12 = b11 ^ (bArr[i11] << 14);
                        if (b12 >= 0) {
                            j9 = (long) (b12 ^ 16256);
                        } else {
                            i11 = i12 + 1;
                            byte b13 = b12 ^ (bArr[i12] << 21);
                            if (b13 < 0) {
                                b9 = b13 ^ -2080896;
                            } else {
                                long j11 = (long) b13;
                                int i13 = i11 + 1;
                                long j12 = (((long) bArr[i11]) << 28) ^ j11;
                                if (j12 >= 0) {
                                    j8 = j12 ^ 266354560;
                                    i11 = i13;
                                } else {
                                    int i14 = i13 + 1;
                                    long j13 = j12 ^ (((long) bArr[i13]) << 35);
                                    if (j13 < 0) {
                                        j10 = -34093383808L;
                                    } else {
                                        i12 = i14 + 1;
                                        long j14 = j13 ^ (((long) bArr[i14]) << 42);
                                        if (j14 >= 0) {
                                            j9 = j14 ^ 4363953127296L;
                                        } else {
                                            i14 = i12 + 1;
                                            j13 = j14 ^ (((long) bArr[i12]) << 49);
                                            if (j13 < 0) {
                                                j10 = -558586000294016L;
                                            } else {
                                                i12 = i14 + 1;
                                                j9 = (j13 ^ (((long) bArr[i14]) << 56)) ^ 71499008037633920L;
                                                if (j9 < 0) {
                                                    i14 = i12 + 1;
                                                    if (((long) bArr[i12]) >= 0) {
                                                        j8 = j9;
                                                        i11 = i14;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j8 = j10 ^ j13;
                                    i11 = i14;
                                }
                                this.f2110g = i11;
                                return j8;
                            }
                        }
                        i11 = i12;
                        j8 = j9;
                        this.f2110g = i11;
                        return j8;
                    }
                    j8 = (long) b9;
                    this.f2110g = i11;
                    return j8;
                }
            }
            return D();
        }

        public final long D() {
            long j8 = 0;
            int i8 = 0;
            while (i8 < 64) {
                int i9 = this.f2110g;
                if (i9 != this.e) {
                    this.f2110g = i9 + 1;
                    byte b9 = this.f2108d[i9];
                    j8 |= ((long) (b9 & Byte.MAX_VALUE)) << i8;
                    if ((b9 & 128) == 0) {
                        return j8;
                    }
                    i8 += 7;
                } else {
                    throw y.c();
                }
            }
            throw new y("CodedInputStream encountered a malformed varint.");
        }

        public final void E(int i8) {
            if (i8 >= 0) {
                int i9 = this.e;
                int i10 = this.f2110g;
                if (i8 <= i9 - i10) {
                    this.f2110g = i10 + i8;
                    return;
                }
            }
            if (i8 < 0) {
                throw new y("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw y.c();
        }

        public final void a(int i8) {
            if (this.f2112i != i8) {
                throw new y("Protocol message end-group tag did not match expected tag.");
            }
        }

        public final int b() {
            return this.f2110g - this.f2111h;
        }

        public final boolean c() {
            return this.f2110g == this.e;
        }

        public final void e(int i8) {
            this.f2113j = i8;
            int i9 = this.e + this.f2109f;
            this.e = i9;
            int i10 = i9 - this.f2111h;
            if (i10 > i8) {
                int i11 = i10 - i8;
                this.f2109f = i11;
                this.e = i9 - i11;
                return;
            }
            this.f2109f = 0;
        }

        public final int f(int i8) {
            if (i8 >= 0) {
                int i9 = this.f2110g;
                int i10 = this.f2111h;
                int i11 = i8 + (i9 - i10);
                if (i11 >= 0) {
                    int i12 = this.f2113j;
                    if (i11 <= i12) {
                        this.f2113j = i11;
                        int i13 = this.e + this.f2109f;
                        this.e = i13;
                        int i14 = i13 - i10;
                        if (i14 > i11) {
                            int i15 = i14 - i11;
                            this.f2109f = i15;
                            this.e = i13 - i15;
                        } else {
                            this.f2109f = 0;
                        }
                        return i12;
                    }
                    throw y.c();
                }
                throw new y("Failed to parse the message.");
            }
            throw new y("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }

        public final boolean g() {
            return C() != 0;
        }

        public final g.f h() {
            byte[] bArr;
            int B = B();
            byte[] bArr2 = this.f2108d;
            if (B > 0) {
                int i8 = this.e;
                int i9 = this.f2110g;
                if (B <= i8 - i9) {
                    g.f fVar = g.f2096g;
                    g.j(i9, i9 + B, bArr2.length);
                    g.f fVar2 = new g.f(g.f2097h.a(bArr2, i9, B));
                    this.f2110g += B;
                    return fVar2;
                }
            }
            if (B == 0) {
                return g.f2096g;
            }
            if (B > 0) {
                int i10 = this.e;
                int i11 = this.f2110g;
                if (B <= i10 - i11) {
                    int i12 = B + i11;
                    this.f2110g = i12;
                    bArr = Arrays.copyOfRange(bArr2, i11, i12);
                    g.f fVar3 = g.f2096g;
                    return new g.f(bArr);
                }
            }
            if (B > 0) {
                throw y.c();
            } else if (B == 0) {
                bArr = x.f2215b;
                g.f fVar32 = g.f2096g;
                return new g.f(bArr);
            } else {
                throw new y("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        }

        public final double i() {
            return Double.longBitsToDouble(A());
        }

        public final int j() {
            return B();
        }

        public final int k() {
            return z();
        }

        public final long l() {
            return A();
        }

        public final float m() {
            return Float.intBitsToFloat(z());
        }

        public final int n() {
            return B();
        }

        public final long o() {
            return C();
        }

        public final int p() {
            return z();
        }

        public final long q() {
            return A();
        }

        public final int r() {
            int B = B();
            return (-(B & 1)) ^ (B >>> 1);
        }

        public final long s() {
            long C = C();
            return (-(C & 1)) ^ (C >>> 1);
        }

        public final String t() {
            int B = B();
            if (B > 0) {
                int i8 = this.e;
                int i9 = this.f2110g;
                if (B <= i8 - i9) {
                    String str = new String(this.f2108d, i9, B, x.f2214a);
                    this.f2110g += B;
                    return str;
                }
            }
            if (B == 0) {
                return "";
            }
            if (B < 0) {
                throw new y("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw y.c();
        }

        public final String u() {
            int B = B();
            if (B > 0) {
                int i8 = this.e;
                int i9 = this.f2110g;
                if (B <= i8 - i9) {
                    String a9 = m1.f2146a.a(this.f2108d, i9, B);
                    this.f2110g += B;
                    return a9;
                }
            }
            if (B == 0) {
                return "";
            }
            if (B <= 0) {
                throw new y("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw y.c();
        }

        public final int v() {
            if (c()) {
                this.f2112i = 0;
                return 0;
            }
            int B = B();
            this.f2112i = B;
            if ((B >>> 3) != 0) {
                return B;
            }
            throw new y("Protocol message contained an invalid tag (zero).");
        }

        public final int w() {
            return B();
        }

        public final long x() {
            return C();
        }

        public final boolean y(int i8) {
            int i9;
            int v8;
            int i10 = i8 & 7;
            int i11 = 0;
            if (i10 != 0) {
                if (i10 == 1) {
                    i9 = 8;
                } else if (i10 == 2) {
                    i9 = B();
                } else if (i10 == 3) {
                    do {
                        v8 = v();
                        if (v8 == 0 || !y(v8)) {
                            a(((i8 >>> 3) << 3) | 4);
                        }
                        v8 = v();
                        break;
                    } while (!y(v8));
                    a(((i8 >>> 3) << 3) | 4);
                    return true;
                } else if (i10 == 4) {
                    return false;
                } else {
                    if (i10 == 5) {
                        E(4);
                        return true;
                    }
                    int i12 = y.f2216f;
                    throw new y.a();
                }
                E(i9);
                return true;
            }
            int i13 = this.e - this.f2110g;
            byte[] bArr = this.f2108d;
            if (i13 >= 10) {
                while (i11 < 10) {
                    int i14 = this.f2110g;
                    this.f2110g = i14 + 1;
                    if (bArr[i14] < 0) {
                        i11++;
                    }
                }
                throw new y("CodedInputStream encountered a malformed varint.");
            }
            while (i11 < 10) {
                int i15 = this.f2110g;
                if (i15 != this.e) {
                    this.f2110g = i15 + 1;
                    if (bArr[i15] < 0) {
                        i11++;
                    }
                } else {
                    throw y.c();
                }
            }
            throw new y("CodedInputStream encountered a malformed varint.");
            return true;
        }

        public final int z() {
            int i8 = this.f2110g;
            if (this.e - i8 >= 4) {
                this.f2110g = i8 + 4;
                byte[] bArr = this.f2108d;
                return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
            }
            throw y.c();
        }
    }

    public static a d(byte[] bArr, int i8, int i9, boolean z8) {
        a aVar = new a(bArr, i8, i9, z8);
        try {
            aVar.f(i9);
            return aVar;
        } catch (y e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract void a(int i8);

    public abstract int b();

    public abstract boolean c();

    public abstract void e(int i8);

    public abstract int f(int i8);

    public abstract boolean g();

    public abstract g.f h();

    public abstract double i();

    public abstract int j();

    public abstract int k();

    public abstract long l();

    public abstract float m();

    public abstract int n();

    public abstract long o();

    public abstract int p();

    public abstract long q();

    public abstract int r();

    public abstract long s();

    public abstract String t();

    public abstract String u();

    public abstract int v();

    public abstract int w();

    public abstract long x();

    public abstract boolean y(int i8);
}
