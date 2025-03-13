package com.google.protobuf;

import com.google.protobuf.b0;
import com.google.protobuf.i;
import com.google.protobuf.r1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public int f3674a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3675b = 100;

    /* renamed from: c  reason: collision with root package name */
    public final int f3676c = Integer.MAX_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public k f3677d;

    public static final class a extends j {
        public final byte[] e;

        /* renamed from: f  reason: collision with root package name */
        public int f3678f;

        /* renamed from: g  reason: collision with root package name */
        public int f3679g;

        /* renamed from: h  reason: collision with root package name */
        public int f3680h;

        /* renamed from: i  reason: collision with root package name */
        public final int f3681i;

        /* renamed from: j  reason: collision with root package name */
        public int f3682j;

        /* renamed from: k  reason: collision with root package name */
        public int f3683k = Integer.MAX_VALUE;

        public a(byte[] bArr, int i8, int i9, boolean z8) {
            this.e = bArr;
            this.f3678f = i9 + i8;
            this.f3680h = i8;
            this.f3681i = i8;
        }

        public final int A() {
            if (e()) {
                this.f3682j = 0;
                return 0;
            }
            int G = G();
            this.f3682j = G;
            if ((G >>> 3) != 0) {
                return G;
            }
            throw b0.b();
        }

        public final int B() {
            return G();
        }

        public final long C() {
            return H();
        }

        public final boolean D(int i8) {
            int i9;
            int A;
            int i10 = i8 & 7;
            int i11 = 0;
            if (i10 != 0) {
                if (i10 == 1) {
                    i9 = 8;
                } else if (i10 == 2) {
                    i9 = G();
                } else if (i10 == 3) {
                    do {
                        A = A();
                        if (A == 0 || !D(A)) {
                            a(((i8 >>> 3) << 3) | 4);
                        }
                        A = A();
                        break;
                    } while (!D(A));
                    a(((i8 >>> 3) << 3) | 4);
                    return true;
                } else if (i10 == 4) {
                    return false;
                } else {
                    if (i10 == 5) {
                        J(4);
                        return true;
                    }
                    int i12 = b0.f3594g;
                    throw new b0.a();
                }
                J(i9);
                return true;
            }
            int i13 = this.f3678f - this.f3680h;
            byte[] bArr = this.e;
            if (i13 >= 10) {
                while (i11 < 10) {
                    int i14 = this.f3680h;
                    this.f3680h = i14 + 1;
                    if (bArr[i14] < 0) {
                        i11++;
                    }
                }
                throw b0.e();
            }
            while (i11 < 10) {
                int i15 = this.f3680h;
                if (i15 != this.f3678f) {
                    this.f3680h = i15 + 1;
                    if (bArr[i15] < 0) {
                        i11++;
                    }
                } else {
                    throw b0.h();
                }
            }
            throw b0.e();
            return true;
        }

        public final int E() {
            int i8 = this.f3680h;
            if (this.f3678f - i8 >= 4) {
                this.f3680h = i8 + 4;
                byte[] bArr = this.e;
                return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
            }
            throw b0.h();
        }

        public final long F() {
            int i8 = this.f3680h;
            if (this.f3678f - i8 >= 8) {
                this.f3680h = i8 + 8;
                byte[] bArr = this.e;
                return ((((long) bArr[i8 + 1]) & 255) << 8) | (((long) bArr[i8]) & 255) | ((((long) bArr[i8 + 2]) & 255) << 16) | ((((long) bArr[i8 + 3]) & 255) << 24) | ((((long) bArr[i8 + 4]) & 255) << 32) | ((((long) bArr[i8 + 5]) & 255) << 40) | ((((long) bArr[i8 + 6]) & 255) << 48) | ((((long) bArr[i8 + 7]) & 255) << 56);
            }
            throw b0.h();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r3[r2] < 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int G() {
            /*
                r5 = this;
                int r0 = r5.f3680h
                int r1 = r5.f3678f
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                int r2 = r0 + 1
                byte[] r3 = r5.e
                byte r0 = r3[r0]
                if (r0 < 0) goto L_0x0012
                r5.f3680h = r2
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
                long r0 = r5.I()
                int r5 = (int) r0
                return r5
            L_0x0070:
                r5.f3680h = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.a.G():int");
        }

        public final long H() {
            long j8;
            long j9;
            long j10;
            byte b9;
            int i8 = this.f3680h;
            int i9 = this.f3678f;
            if (i9 != i8) {
                int i10 = i8 + 1;
                byte[] bArr = this.e;
                byte b10 = bArr[i8];
                if (b10 >= 0) {
                    this.f3680h = i10;
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
                                this.f3680h = i11;
                                return j8;
                            }
                        }
                        i11 = i12;
                        j8 = j9;
                        this.f3680h = i11;
                        return j8;
                    }
                    j8 = (long) b9;
                    this.f3680h = i11;
                    return j8;
                }
            }
            return I();
        }

        public final long I() {
            long j8 = 0;
            int i8 = 0;
            while (i8 < 64) {
                int i9 = this.f3680h;
                if (i9 != this.f3678f) {
                    this.f3680h = i9 + 1;
                    byte b9 = this.e[i9];
                    j8 |= ((long) (b9 & Byte.MAX_VALUE)) << i8;
                    if ((b9 & 128) == 0) {
                        return j8;
                    }
                    i8 += 7;
                } else {
                    throw b0.h();
                }
            }
            throw b0.e();
        }

        public final void J(int i8) {
            if (i8 >= 0) {
                int i9 = this.f3678f;
                int i10 = this.f3680h;
                if (i8 <= i9 - i10) {
                    this.f3680h = i10 + i8;
                    return;
                }
            }
            if (i8 < 0) {
                throw b0.f();
            }
            throw b0.h();
        }

        public final void a(int i8) {
            if (this.f3682j != i8) {
                throw b0.a();
            }
        }

        public final int d() {
            return this.f3680h - this.f3681i;
        }

        public final boolean e() {
            return this.f3680h == this.f3678f;
        }

        public final void i(int i8) {
            this.f3683k = i8;
            int i9 = this.f3678f + this.f3679g;
            this.f3678f = i9;
            int i10 = i9 - this.f3681i;
            if (i10 > i8) {
                int i11 = i10 - i8;
                this.f3679g = i11;
                this.f3678f = i9 - i11;
                return;
            }
            this.f3679g = 0;
        }

        public final int j(int i8) {
            if (i8 >= 0) {
                int i9 = this.f3680h;
                int i10 = this.f3681i;
                int i11 = i8 + (i9 - i10);
                if (i11 >= 0) {
                    int i12 = this.f3683k;
                    if (i11 <= i12) {
                        this.f3683k = i11;
                        int i13 = this.f3678f + this.f3679g;
                        this.f3678f = i13;
                        int i14 = i13 - i10;
                        if (i14 > i11) {
                            int i15 = i14 - i11;
                            this.f3679g = i15;
                            this.f3678f = i13 - i15;
                        } else {
                            this.f3679g = 0;
                        }
                        return i12;
                    }
                    throw b0.h();
                }
                throw b0.g();
            }
            throw b0.f();
        }

        public final boolean k() {
            return H() != 0;
        }

        public final i.f l() {
            byte[] bArr;
            int G = G();
            byte[] bArr2 = this.e;
            if (G > 0) {
                int i8 = this.f3678f;
                int i9 = this.f3680h;
                if (G <= i8 - i9) {
                    i.f k8 = i.k(bArr2, i9, G);
                    this.f3680h += G;
                    return k8;
                }
            }
            if (G == 0) {
                return i.f3648g;
            }
            if (G > 0) {
                int i10 = this.f3678f;
                int i11 = this.f3680h;
                if (G <= i10 - i11) {
                    int i12 = G + i11;
                    this.f3680h = i12;
                    bArr = Arrays.copyOfRange(bArr2, i11, i12);
                    i.f fVar = i.f3648g;
                    return new i.f(bArr);
                }
            }
            if (G > 0) {
                throw b0.h();
            } else if (G == 0) {
                bArr = a0.f3591c;
                i.f fVar2 = i.f3648g;
                return new i.f(bArr);
            } else {
                throw b0.f();
            }
        }

        public final double m() {
            return Double.longBitsToDouble(F());
        }

        public final int n() {
            return G();
        }

        public final int o() {
            return E();
        }

        public final long p() {
            return F();
        }

        public final float q() {
            return Float.intBitsToFloat(E());
        }

        public final int r() {
            return G();
        }

        public final long s() {
            return H();
        }

        public final int u() {
            return E();
        }

        public final long v() {
            return F();
        }

        public final int w() {
            return j.b(G());
        }

        public final long x() {
            return j.c(H());
        }

        public final String y() {
            int G = G();
            if (G > 0) {
                int i8 = this.f3678f;
                int i9 = this.f3680h;
                if (G <= i8 - i9) {
                    String str = new String(this.e, i9, G, a0.f3590b);
                    this.f3680h += G;
                    return str;
                }
            }
            if (G == 0) {
                return "";
            }
            if (G < 0) {
                throw b0.f();
            }
            throw b0.h();
        }

        public final String z() {
            int G = G();
            if (G > 0) {
                int i8 = this.f3678f;
                int i9 = this.f3680h;
                if (G <= i8 - i9) {
                    String a9 = r1.f3750a.a(this.e, i9, G);
                    this.f3680h += G;
                    return a9;
                }
            }
            if (G == 0) {
                return "";
            }
            if (G <= 0) {
                throw b0.f();
            }
            throw b0.h();
        }
    }

    public static final class b extends j {
        public final InputStream e;

        /* renamed from: f  reason: collision with root package name */
        public final byte[] f3684f;

        /* renamed from: g  reason: collision with root package name */
        public int f3685g;

        /* renamed from: h  reason: collision with root package name */
        public int f3686h;

        /* renamed from: i  reason: collision with root package name */
        public int f3687i;

        /* renamed from: j  reason: collision with root package name */
        public int f3688j;

        /* renamed from: k  reason: collision with root package name */
        public int f3689k;

        /* renamed from: l  reason: collision with root package name */
        public int f3690l = Integer.MAX_VALUE;

        public b(InputStream inputStream) {
            Charset charset = a0.f3589a;
            if (inputStream != null) {
                this.e = inputStream;
                this.f3684f = new byte[4096];
                this.f3685g = 0;
                this.f3687i = 0;
                this.f3689k = 0;
                return;
            }
            throw new NullPointerException("input");
        }

        public final int A() {
            if (e()) {
                this.f3688j = 0;
                return 0;
            }
            int J = J();
            this.f3688j = J;
            if ((J >>> 3) != 0) {
                return J;
            }
            throw b0.b();
        }

        public final int B() {
            return J();
        }

        public final long C() {
            return K();
        }

        public final boolean D(int i8) {
            int i9;
            int A;
            int i10 = i8 & 7;
            int i11 = 0;
            if (i10 != 0) {
                if (i10 == 1) {
                    i9 = 8;
                } else if (i10 == 2) {
                    i9 = J();
                } else if (i10 == 3) {
                    do {
                        A = A();
                        if (A == 0 || !D(A)) {
                            a(((i8 >>> 3) << 3) | 4);
                        }
                        A = A();
                        break;
                    } while (!D(A));
                    a(((i8 >>> 3) << 3) | 4);
                    return true;
                } else if (i10 == 4) {
                    return false;
                } else {
                    if (i10 == 5) {
                        O(4);
                        return true;
                    }
                    int i12 = b0.f3594g;
                    throw new b0.a();
                }
                O(i9);
                return true;
            }
            int i13 = this.f3685g - this.f3687i;
            byte[] bArr = this.f3684f;
            if (i13 >= 10) {
                while (i11 < 10) {
                    int i14 = this.f3687i;
                    this.f3687i = i14 + 1;
                    if (bArr[i14] < 0) {
                        i11++;
                    }
                }
                throw b0.e();
            }
            while (i11 < 10) {
                if (this.f3687i == this.f3685g) {
                    N(1);
                }
                int i15 = this.f3687i;
                this.f3687i = i15 + 1;
                if (bArr[i15] < 0) {
                    i11++;
                }
            }
            throw b0.e();
            return true;
        }

        public final byte[] E(int i8) {
            byte[] F = F(i8);
            if (F != null) {
                return F;
            }
            int i9 = this.f3687i;
            int i10 = this.f3685g;
            int i11 = i10 - i9;
            this.f3689k += i10;
            this.f3687i = 0;
            this.f3685g = 0;
            ArrayList G = G(i8 - i11);
            byte[] bArr = new byte[i8];
            System.arraycopy(this.f3684f, i9, bArr, 0, i11);
            Iterator it = G.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
                i11 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] F(int i8) {
            if (i8 == 0) {
                return a0.f3591c;
            }
            if (i8 >= 0) {
                int i9 = this.f3689k;
                int i10 = this.f3687i;
                int i11 = i9 + i10 + i8;
                if (i11 - this.f3676c <= 0) {
                    int i12 = this.f3690l;
                    if (i11 <= i12) {
                        int i13 = this.f3685g - i10;
                        int i14 = i8 - i13;
                        InputStream inputStream = this.e;
                        if (i14 >= 4096) {
                            try {
                                if (i14 > inputStream.available()) {
                                    return null;
                                }
                            } catch (b0 e4) {
                                e4.f3595f = true;
                                throw e4;
                            }
                        }
                        byte[] bArr = new byte[i8];
                        System.arraycopy(this.f3684f, this.f3687i, bArr, 0, i13);
                        this.f3689k += this.f3685g;
                        this.f3687i = 0;
                        this.f3685g = 0;
                        while (i13 < i8) {
                            try {
                                int read = inputStream.read(bArr, i13, i8 - i13);
                                if (read != -1) {
                                    this.f3689k += read;
                                    i13 += read;
                                } else {
                                    throw b0.h();
                                }
                            } catch (b0 e9) {
                                e9.f3595f = true;
                                throw e9;
                            }
                        }
                        return bArr;
                    }
                    O((i12 - i9) - i10);
                    throw b0.h();
                }
                throw new b0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw b0.f();
        }

        public final ArrayList G(int i8) {
            ArrayList arrayList = new ArrayList();
            while (i8 > 0) {
                int min = Math.min(i8, 4096);
                byte[] bArr = new byte[min];
                int i9 = 0;
                while (i9 < min) {
                    int read = this.e.read(bArr, i9, min - i9);
                    if (read != -1) {
                        this.f3689k += read;
                        i9 += read;
                    } else {
                        throw b0.h();
                    }
                }
                i8 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int H() {
            int i8 = this.f3687i;
            if (this.f3685g - i8 < 4) {
                N(4);
                i8 = this.f3687i;
            }
            this.f3687i = i8 + 4;
            byte[] bArr = this.f3684f;
            return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
        }

        public final long I() {
            int i8 = this.f3687i;
            if (this.f3685g - i8 < 8) {
                N(8);
                i8 = this.f3687i;
            }
            this.f3687i = i8 + 8;
            byte[] bArr = this.f3684f;
            return ((((long) bArr[i8 + 1]) & 255) << 8) | (((long) bArr[i8]) & 255) | ((((long) bArr[i8 + 2]) & 255) << 16) | ((((long) bArr[i8 + 3]) & 255) << 24) | ((((long) bArr[i8 + 4]) & 255) << 32) | ((((long) bArr[i8 + 5]) & 255) << 40) | ((((long) bArr[i8 + 6]) & 255) << 48) | ((((long) bArr[i8 + 7]) & 255) << 56);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r3[r2] < 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int J() {
            /*
                r5 = this;
                int r0 = r5.f3687i
                int r1 = r5.f3685g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                int r2 = r0 + 1
                byte[] r3 = r5.f3684f
                byte r0 = r3[r0]
                if (r0 < 0) goto L_0x0012
                r5.f3687i = r2
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
                long r0 = r5.L()
                int r5 = (int) r0
                return r5
            L_0x0070:
                r5.f3687i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.b.J():int");
        }

        public final long K() {
            long j8;
            long j9;
            long j10;
            byte b9;
            int i8 = this.f3687i;
            int i9 = this.f3685g;
            if (i9 != i8) {
                int i10 = i8 + 1;
                byte[] bArr = this.f3684f;
                byte b10 = bArr[i8];
                if (b10 >= 0) {
                    this.f3687i = i10;
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
                                this.f3687i = i11;
                                return j8;
                            }
                        }
                        i11 = i12;
                        j8 = j9;
                        this.f3687i = i11;
                        return j8;
                    }
                    j8 = (long) b9;
                    this.f3687i = i11;
                    return j8;
                }
            }
            return L();
        }

        public final long L() {
            long j8 = 0;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                if (this.f3687i == this.f3685g) {
                    N(1);
                }
                int i9 = this.f3687i;
                this.f3687i = i9 + 1;
                byte b9 = this.f3684f[i9];
                j8 |= ((long) (b9 & Byte.MAX_VALUE)) << i8;
                if ((b9 & 128) == 0) {
                    return j8;
                }
            }
            throw b0.e();
        }

        public final void M() {
            int i8 = this.f3685g + this.f3686h;
            this.f3685g = i8;
            int i9 = this.f3689k + i8;
            int i10 = this.f3690l;
            if (i9 > i10) {
                int i11 = i9 - i10;
                this.f3686h = i11;
                this.f3685g = i8 - i11;
                return;
            }
            this.f3686h = 0;
        }

        public final void N(int i8) {
            if (P(i8)) {
                return;
            }
            if (i8 > (this.f3676c - this.f3689k) - this.f3687i) {
                throw new b0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw b0.h();
        }

        public final void O(int i8) {
            int i9 = this.f3685g;
            int i10 = this.f3687i;
            if (i8 > i9 - i10 || i8 < 0) {
                InputStream inputStream = this.e;
                if (i8 >= 0) {
                    int i11 = this.f3689k;
                    int i12 = i11 + i10;
                    int i13 = i12 + i8;
                    int i14 = this.f3690l;
                    if (i13 <= i14) {
                        this.f3689k = i12;
                        int i15 = i9 - i10;
                        this.f3685g = 0;
                        this.f3687i = 0;
                        while (i15 < i8) {
                            long j8 = (long) (i8 - i15);
                            try {
                                long skip = inputStream.skip(j8);
                                int i16 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                                if (i16 < 0 || skip > j8) {
                                    throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                                } else if (i16 == 0) {
                                    break;
                                } else {
                                    i15 += (int) skip;
                                }
                            } catch (b0 e4) {
                                e4.f3595f = true;
                                throw e4;
                            } catch (Throwable th) {
                                this.f3689k += i15;
                                M();
                                throw th;
                            }
                        }
                        this.f3689k += i15;
                        M();
                        if (i15 < i8) {
                            int i17 = this.f3685g;
                            int i18 = i17 - this.f3687i;
                            this.f3687i = i17;
                            while (true) {
                                N(1);
                                int i19 = i8 - i18;
                                int i20 = this.f3685g;
                                if (i19 > i20) {
                                    i18 += i20;
                                    this.f3687i = i20;
                                } else {
                                    this.f3687i = i19;
                                    return;
                                }
                            }
                        }
                    } else {
                        O((i14 - i11) - i10);
                        throw b0.h();
                    }
                } else {
                    throw b0.f();
                }
            } else {
                this.f3687i = i10 + i8;
            }
        }

        public final boolean P(int i8) {
            int i9 = this.f3687i;
            int i10 = i9 + i8;
            int i11 = this.f3685g;
            if (i10 > i11) {
                int i12 = this.f3689k;
                int i13 = this.f3676c;
                if (i8 > (i13 - i12) - i9 || i12 + i9 + i8 > this.f3690l) {
                    return false;
                }
                byte[] bArr = this.f3684f;
                if (i9 > 0) {
                    if (i11 > i9) {
                        System.arraycopy(bArr, i9, bArr, 0, i11 - i9);
                    }
                    this.f3689k += i9;
                    this.f3685g -= i9;
                    this.f3687i = 0;
                }
                int i14 = this.f3685g;
                int min = Math.min(bArr.length - i14, (i13 - this.f3689k) - i14);
                InputStream inputStream = this.e;
                try {
                    int read = inputStream.read(bArr, i14, min);
                    if (read == 0 || read < -1 || read > bArr.length) {
                        throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                    } else if (read <= 0) {
                        return false;
                    } else {
                        this.f3685g += read;
                        M();
                        if (this.f3685g >= i8) {
                            return true;
                        }
                        return P(i8);
                    }
                } catch (b0 e4) {
                    e4.f3595f = true;
                    throw e4;
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i8 + " bytes were already available in buffer");
            }
        }

        public final void a(int i8) {
            if (this.f3688j != i8) {
                throw b0.a();
            }
        }

        public final int d() {
            return this.f3689k + this.f3687i;
        }

        public final boolean e() {
            return this.f3687i == this.f3685g && !P(1);
        }

        public final void i(int i8) {
            this.f3690l = i8;
            M();
        }

        public final int j(int i8) {
            if (i8 >= 0) {
                int i9 = i8 + this.f3689k + this.f3687i;
                int i10 = this.f3690l;
                if (i9 <= i10) {
                    this.f3690l = i9;
                    M();
                    return i10;
                }
                throw b0.h();
            }
            throw b0.f();
        }

        public final boolean k() {
            return K() != 0;
        }

        public final i.f l() {
            int J = J();
            int i8 = this.f3685g;
            int i9 = this.f3687i;
            int i10 = i8 - i9;
            byte[] bArr = this.f3684f;
            if (J <= i10 && J > 0) {
                i.f k8 = i.k(bArr, i9, J);
                this.f3687i += J;
                return k8;
            } else if (J == 0) {
                return i.f3648g;
            } else {
                byte[] F = F(J);
                if (F != null) {
                    return i.k(F, 0, F.length);
                }
                int i11 = this.f3687i;
                int i12 = this.f3685g;
                int i13 = i12 - i11;
                this.f3689k += i12;
                this.f3687i = 0;
                this.f3685g = 0;
                ArrayList G = G(J - i13);
                byte[] bArr2 = new byte[J];
                System.arraycopy(bArr, i11, bArr2, 0, i13);
                Iterator it = G.iterator();
                while (it.hasNext()) {
                    byte[] bArr3 = (byte[]) it.next();
                    System.arraycopy(bArr3, 0, bArr2, i13, bArr3.length);
                    i13 += bArr3.length;
                }
                i.f fVar = i.f3648g;
                return new i.f(bArr2);
            }
        }

        public final double m() {
            return Double.longBitsToDouble(I());
        }

        public final int n() {
            return J();
        }

        public final int o() {
            return H();
        }

        public final long p() {
            return I();
        }

        public final float q() {
            return Float.intBitsToFloat(H());
        }

        public final int r() {
            return J();
        }

        public final long s() {
            return K();
        }

        public final int u() {
            return H();
        }

        public final long v() {
            return I();
        }

        public final int w() {
            return j.b(J());
        }

        public final long x() {
            return j.c(K());
        }

        public final String y() {
            String str;
            int J = J();
            byte[] bArr = this.f3684f;
            if (J > 0) {
                int i8 = this.f3685g;
                int i9 = this.f3687i;
                if (J <= i8 - i9) {
                    str = new String(bArr, i9, J, a0.f3590b);
                    this.f3687i += J;
                    return str;
                }
            }
            if (J == 0) {
                return "";
            }
            if (J > this.f3685g) {
                return new String(E(J), a0.f3590b);
            }
            N(J);
            str = new String(bArr, this.f3687i, J, a0.f3590b);
            this.f3687i += J;
            return str;
        }

        public final String z() {
            byte[] bArr;
            int i8;
            int J = J();
            int i9 = this.f3687i;
            int i10 = this.f3685g;
            if (J <= i10 - i9 && J > 0) {
                i8 = i9 + J;
            } else if (J == 0) {
                return "";
            } else {
                i9 = 0;
                if (J <= i10) {
                    N(J);
                    i8 = J + 0;
                } else {
                    bArr = E(J);
                    return r1.f3750a.a(bArr, i9, J);
                }
            }
            this.f3687i = i8;
            bArr = this.f3684f;
            return r1.f3750a.a(bArr, i9, J);
        }
    }

    public static final class c extends j {
        public final ByteBuffer e;

        /* renamed from: f  reason: collision with root package name */
        public final long f3691f;

        /* renamed from: g  reason: collision with root package name */
        public long f3692g;

        /* renamed from: h  reason: collision with root package name */
        public long f3693h;

        /* renamed from: i  reason: collision with root package name */
        public final long f3694i;

        /* renamed from: j  reason: collision with root package name */
        public int f3695j;

        /* renamed from: k  reason: collision with root package name */
        public int f3696k;

        /* renamed from: l  reason: collision with root package name */
        public int f3697l = Integer.MAX_VALUE;

        public c(ByteBuffer byteBuffer, boolean z8) {
            this.e = byteBuffer;
            long j8 = q1.f3744c.j(q1.f3747g, byteBuffer);
            this.f3691f = j8;
            this.f3692g = ((long) byteBuffer.limit()) + j8;
            long position = j8 + ((long) byteBuffer.position());
            this.f3693h = position;
            this.f3694i = position;
        }

        public final int A() {
            if (e()) {
                this.f3696k = 0;
                return 0;
            }
            int G = G();
            this.f3696k = G;
            if ((G >>> 3) != 0) {
                return G;
            }
            throw b0.b();
        }

        public final int B() {
            return G();
        }

        public final long C() {
            return H();
        }

        public final boolean D(int i8) {
            int i9;
            int A;
            int i10 = i8 & 7;
            int i11 = 0;
            if (i10 != 0) {
                if (i10 == 1) {
                    i9 = 8;
                } else if (i10 == 2) {
                    i9 = G();
                } else if (i10 == 3) {
                    do {
                        A = A();
                        if (A == 0 || !D(A)) {
                            a(((i8 >>> 3) << 3) | 4);
                        }
                        A = A();
                        break;
                    } while (!D(A));
                    a(((i8 >>> 3) << 3) | 4);
                    return true;
                } else if (i10 == 4) {
                    return false;
                } else {
                    if (i10 == 5) {
                        K(4);
                        return true;
                    }
                    int i12 = b0.f3594g;
                    throw new b0.a();
                }
                K(i9);
                return true;
            }
            if (((int) (this.f3692g - this.f3693h)) >= 10) {
                while (i11 < 10) {
                    long j8 = this.f3693h;
                    this.f3693h = j8 + 1;
                    if (q1.h(j8) < 0) {
                        i11++;
                    }
                }
                throw b0.e();
            }
            while (i11 < 10) {
                long j9 = this.f3693h;
                if (j9 != this.f3692g) {
                    this.f3693h = j9 + 1;
                    if (q1.h(j9) < 0) {
                        i11++;
                    }
                } else {
                    throw b0.h();
                }
            }
            throw b0.e();
            return true;
        }

        public final int E() {
            long j8 = this.f3693h;
            if (this.f3692g - j8 >= 4) {
                this.f3693h = 4 + j8;
                return (q1.h(j8) & 255) | ((q1.h(1 + j8) & 255) << 8) | ((q1.h(2 + j8) & 255) << 16) | ((q1.h(j8 + 3) & 255) << 24);
            }
            throw b0.h();
        }

        public final long F() {
            long j8 = this.f3693h;
            if (this.f3692g - j8 >= 8) {
                this.f3693h = 8 + j8;
                return ((((long) q1.h(j8 + 7)) & 255) << 56) | (((long) q1.h(j8)) & 255) | ((((long) q1.h(1 + j8)) & 255) << 8) | ((((long) q1.h(2 + j8)) & 255) << 16) | ((((long) q1.h(3 + j8)) & 255) << 24) | ((((long) q1.h(4 + j8)) & 255) << 32) | ((((long) q1.h(5 + j8)) & 255) << 40) | ((((long) q1.h(6 + j8)) & 255) << 48);
            }
            throw b0.h();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
            if (com.google.protobuf.q1.h(r4) < 0) goto L_0x0085;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int G() {
            /*
                r10 = this;
                long r0 = r10.f3693h
                long r2 = r10.f3692g
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x000a
                goto L_0x0085
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.q1.h(r0)
                if (r0 < 0) goto L_0x0017
                r10.f3693h = r4
                return r0
            L_0x0017:
                long r6 = r10.f3692g
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0021
                goto L_0x0085
            L_0x0021:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.q1.h(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x002f
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008b
            L_0x002f:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.q1.h(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003c:
                r6 = r4
                goto L_0x008b
            L_0x003e:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.q1.h(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x004e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008b
            L_0x004e:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.q1.h(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.q1.h(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.q1.h(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.q1.h(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.q1.h(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.q1.h(r4)
                if (r1 >= 0) goto L_0x008b
            L_0x0085:
                long r0 = r10.I()
                int r10 = (int) r0
                return r10
            L_0x008b:
                r10.f3693h = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.c.G():int");
        }

        public final long H() {
            long j8;
            long j9;
            long j10;
            byte b9;
            long j11 = this.f3693h;
            if (this.f3692g != j11) {
                long j12 = j11 + 1;
                byte h8 = q1.h(j11);
                if (h8 >= 0) {
                    this.f3693h = j12;
                    return (long) h8;
                } else if (this.f3692g - j12 >= 9) {
                    long j13 = j12 + 1;
                    byte h9 = h8 ^ (q1.h(j12) << 7);
                    if (h9 < 0) {
                        b9 = h9 ^ Byte.MIN_VALUE;
                    } else {
                        long j14 = j13 + 1;
                        byte h10 = h9 ^ (q1.h(j13) << 14);
                        if (h10 >= 0) {
                            j8 = (long) (h10 ^ 16256);
                        } else {
                            j13 = j14 + 1;
                            byte h11 = h10 ^ (q1.h(j14) << 21);
                            if (h11 < 0) {
                                b9 = h11 ^ -2080896;
                            } else {
                                j14 = j13 + 1;
                                long h12 = ((long) h11) ^ (((long) q1.h(j13)) << 28);
                                if (h12 >= 0) {
                                    j10 = 266354560;
                                } else {
                                    long j15 = j14 + 1;
                                    long h13 = h12 ^ (((long) q1.h(j14)) << 35);
                                    if (h13 < 0) {
                                        j9 = -34093383808L;
                                    } else {
                                        j14 = j15 + 1;
                                        h12 = h13 ^ (((long) q1.h(j15)) << 42);
                                        if (h12 >= 0) {
                                            j10 = 4363953127296L;
                                        } else {
                                            j15 = j14 + 1;
                                            h13 = h12 ^ (((long) q1.h(j14)) << 49);
                                            if (h13 < 0) {
                                                j9 = -558586000294016L;
                                            } else {
                                                j14 = j15 + 1;
                                                j8 = (h13 ^ (((long) q1.h(j15)) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    long j16 = 1 + j14;
                                                    if (((long) q1.h(j14)) >= 0) {
                                                        j13 = j16;
                                                        this.f3693h = j13;
                                                        return j8;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j8 = h13 ^ j9;
                                    j13 = j15;
                                    this.f3693h = j13;
                                    return j8;
                                }
                                j8 = h12 ^ j10;
                            }
                        }
                        j13 = j14;
                        this.f3693h = j13;
                        return j8;
                    }
                    j8 = (long) b9;
                    this.f3693h = j13;
                    return j8;
                }
            }
            return I();
        }

        public final long I() {
            long j8 = 0;
            int i8 = 0;
            while (i8 < 64) {
                long j9 = this.f3693h;
                if (j9 != this.f3692g) {
                    this.f3693h = 1 + j9;
                    byte h8 = q1.h(j9);
                    j8 |= ((long) (h8 & Byte.MAX_VALUE)) << i8;
                    if ((h8 & 128) == 0) {
                        return j8;
                    }
                    i8 += 7;
                } else {
                    throw b0.h();
                }
            }
            throw b0.e();
        }

        public final void J() {
            long j8 = this.f3692g + ((long) this.f3695j);
            this.f3692g = j8;
            int i8 = (int) (j8 - this.f3694i);
            int i9 = this.f3697l;
            if (i8 > i9) {
                int i10 = i8 - i9;
                this.f3695j = i10;
                this.f3692g = j8 - ((long) i10);
                return;
            }
            this.f3695j = 0;
        }

        public final void K(int i8) {
            if (i8 >= 0) {
                long j8 = this.f3692g;
                long j9 = this.f3693h;
                if (i8 <= ((int) (j8 - j9))) {
                    this.f3693h = j9 + ((long) i8);
                    return;
                }
            }
            if (i8 < 0) {
                throw b0.f();
            }
            throw b0.h();
        }

        public final void a(int i8) {
            if (this.f3696k != i8) {
                throw b0.a();
            }
        }

        public final int d() {
            return (int) (this.f3693h - this.f3694i);
        }

        public final boolean e() {
            return this.f3693h == this.f3692g;
        }

        public final void i(int i8) {
            this.f3697l = i8;
            J();
        }

        public final int j(int i8) {
            if (i8 >= 0) {
                int d9 = i8 + d();
                int i9 = this.f3697l;
                if (d9 <= i9) {
                    this.f3697l = d9;
                    J();
                    return i9;
                }
                throw b0.h();
            }
            throw b0.f();
        }

        public final boolean k() {
            return H() != 0;
        }

        public final i.f l() {
            int G = G();
            if (G > 0) {
                long j8 = this.f3692g;
                long j9 = this.f3693h;
                if (G <= ((int) (j8 - j9))) {
                    byte[] bArr = new byte[G];
                    long j10 = (long) G;
                    q1.f3744c.c(j9, bArr, j10);
                    this.f3693h += j10;
                    i.f fVar = i.f3648g;
                    return new i.f(bArr);
                }
            }
            if (G == 0) {
                return i.f3648g;
            }
            if (G < 0) {
                throw b0.f();
            }
            throw b0.h();
        }

        public final double m() {
            return Double.longBitsToDouble(F());
        }

        public final int n() {
            return G();
        }

        public final int o() {
            return E();
        }

        public final long p() {
            return F();
        }

        public final float q() {
            return Float.intBitsToFloat(E());
        }

        public final int r() {
            return G();
        }

        public final long s() {
            return H();
        }

        public final int u() {
            return E();
        }

        public final long v() {
            return F();
        }

        public final int w() {
            return j.b(G());
        }

        public final long x() {
            return j.c(H());
        }

        public final String y() {
            int G = G();
            if (G > 0) {
                long j8 = this.f3692g;
                long j9 = this.f3693h;
                if (G <= ((int) (j8 - j9))) {
                    byte[] bArr = new byte[G];
                    long j10 = (long) G;
                    q1.f3744c.c(j9, bArr, j10);
                    String str = new String(bArr, a0.f3590b);
                    this.f3693h += j10;
                    return str;
                }
            }
            if (G == 0) {
                return "";
            }
            if (G < 0) {
                throw b0.f();
            }
            throw b0.h();
        }

        public final String z() {
            int G = G();
            if (G > 0) {
                long j8 = this.f3692g;
                long j9 = this.f3693h;
                if (G <= ((int) (j8 - j9))) {
                    int i8 = (int) (j9 - this.f3691f);
                    r1.b bVar = r1.f3750a;
                    bVar.getClass();
                    ByteBuffer byteBuffer = this.e;
                    String a9 = byteBuffer.hasArray() ? bVar.a(byteBuffer.array(), byteBuffer.arrayOffset() + i8, G) : byteBuffer.isDirect() ? bVar.c(byteBuffer, i8, G) : r1.b.b(byteBuffer, i8, G);
                    this.f3693h += (long) G;
                    return a9;
                }
            }
            if (G == 0) {
                return "";
            }
            if (G <= 0) {
                throw b0.f();
            }
            throw b0.h();
        }
    }

    public static int b(int i8) {
        return (-(i8 & 1)) ^ (i8 >>> 1);
    }

    public static long c(long j8) {
        return (-(j8 & 1)) ^ (j8 >>> 1);
    }

    public static a f(byte[] bArr, int i8, int i9, boolean z8) {
        a aVar = new a(bArr, i8, i9, z8);
        try {
            aVar.j(i9);
            return aVar;
        } catch (b0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static j g(InputStream inputStream) {
        if (inputStream != null) {
            return new b(inputStream);
        }
        byte[] bArr = a0.f3591c;
        return f(bArr, 0, bArr.length, false);
    }

    public static j h(ByteBuffer byteBuffer, boolean z8) {
        if (byteBuffer.hasArray()) {
            return f(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z8);
        }
        if (byteBuffer.isDirect() && q1.f3745d) {
            return new c(byteBuffer, z8);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return f(bArr, 0, remaining, true);
    }

    public static int t(int i8, InputStream inputStream) {
        if ((i8 & 128) == 0) {
            return i8;
        }
        int i9 = i8 & 127;
        int i10 = 7;
        while (i10 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i9 |= (read & 127) << i10;
                if ((read & 128) == 0) {
                    return i9;
                }
                i10 += 7;
            } else {
                throw b0.h();
            }
        }
        while (i10 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw b0.h();
            } else if ((read2 & 128) == 0) {
                return i9;
            } else {
                i10 += 7;
            }
        }
        throw b0.e();
    }

    public abstract int A();

    public abstract int B();

    public abstract long C();

    public abstract boolean D(int i8);

    public abstract void a(int i8);

    public abstract int d();

    public abstract boolean e();

    public abstract void i(int i8);

    public abstract int j(int i8);

    public abstract boolean k();

    public abstract i.f l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract String y();

    public abstract String z();
}
