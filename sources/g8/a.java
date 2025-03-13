package g8;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

public final class a implements b, Closeable, Flushable, WritableByteChannel, Cloneable, ByteChannel {

    /* renamed from: f  reason: collision with root package name */
    public j f4682f;

    /* renamed from: g  reason: collision with root package name */
    public long f4683g;

    public final long C(c cVar) {
        return c(cVar, 0);
    }

    public final int L(f fVar) {
        int n8 = n(fVar, false);
        if (n8 == -1) {
            return -1;
        }
        try {
            o((long) fVar.f4691f[n8].j());
            return n8;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public final byte a(long j8) {
        int i8;
        n.a(this.f4683g, j8, 1);
        long j9 = this.f4683g;
        if (j9 - j8 > j8) {
            j jVar = this.f4682f;
            while (true) {
                int i9 = jVar.f4705c;
                int i10 = jVar.f4704b;
                long j10 = (long) (i9 - i10);
                if (j8 < j10) {
                    return jVar.f4703a[i10 + ((int) j8)];
                }
                j8 -= j10;
                jVar = jVar.f4707f;
            }
        } else {
            long j11 = j8 - j9;
            j jVar2 = this.f4682f;
            do {
                jVar2 = jVar2.f4708g;
                int i11 = jVar2.f4705c;
                i8 = jVar2.f4704b;
                j11 += (long) (i11 - i8);
            } while (j11 < 0);
            return jVar2.f4703a[i8 + ((int) j11)];
        }
    }

    public final long c(c cVar, long j8) {
        int i8;
        long j9 = 0;
        if (j8 >= 0) {
            j jVar = this.f4682f;
            if (jVar == null) {
                return -1;
            }
            long j10 = this.f4683g;
            if (j10 - j8 < j8) {
                while (j10 > j8) {
                    jVar = jVar.f4708g;
                    j10 -= (long) (jVar.f4705c - jVar.f4704b);
                }
            } else {
                while (true) {
                    long j11 = ((long) (jVar.f4705c - jVar.f4704b)) + j9;
                    if (j11 >= j8) {
                        break;
                    }
                    jVar = jVar.f4707f;
                    j9 = j11;
                }
                j10 = j9;
            }
            byte[] bArr = cVar.f4686f;
            if (bArr.length == 2) {
                byte b9 = bArr[0];
                byte b10 = bArr[1];
                while (j10 < this.f4683g) {
                    byte[] bArr2 = jVar.f4703a;
                    i8 = (int) ((((long) jVar.f4704b) + j8) - j10);
                    int i9 = jVar.f4705c;
                    while (i8 < i9) {
                        byte b11 = bArr2[i8];
                        if (!(b11 == b9 || b11 == b10)) {
                            i8++;
                        }
                    }
                    j10 += (long) (jVar.f4705c - jVar.f4704b);
                    jVar = jVar.f4707f;
                    j8 = j10;
                }
                return -1;
            }
            while (j10 < this.f4683g) {
                byte[] bArr3 = jVar.f4703a;
                int i10 = (int) ((((long) jVar.f4704b) + j8) - j10);
                int i11 = jVar.f4705c;
                while (i8 < i11) {
                    byte b12 = bArr3[i8];
                    int length = bArr.length;
                    int i12 = 0;
                    while (i12 < length) {
                        if (b12 != bArr[i12]) {
                            i12++;
                        }
                    }
                    i10 = i8 + 1;
                }
                j10 += (long) (jVar.f4705c - jVar.f4704b);
                jVar = jVar.f4707f;
                j8 = j10;
            }
            return -1;
            return ((long) (i8 - jVar.f4704b)) + j10;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    public final Object clone() {
        a aVar = new a();
        if (this.f4683g != 0) {
            j c9 = this.f4682f.c();
            aVar.f4682f = c9;
            c9.f4708g = c9;
            c9.f4707f = c9;
            j jVar = this.f4682f;
            while (true) {
                jVar = jVar.f4707f;
                if (jVar == this.f4682f) {
                    break;
                }
                aVar.f4682f.f4708g.b(jVar.c());
            }
            aVar.f4683g = this.f4683g;
        }
        return aVar;
    }

    public final void close() {
    }

    public final byte d() {
        long j8 = this.f4683g;
        if (j8 != 0) {
            j jVar = this.f4682f;
            int i8 = jVar.f4704b;
            int i9 = jVar.f4705c;
            int i10 = i8 + 1;
            byte b9 = jVar.f4703a[i8];
            this.f4683g = j8 - 1;
            if (i10 == i9) {
                this.f4682f = jVar.a();
                k.a(jVar);
            } else {
                jVar.f4704b = i10;
            }
            return b9;
        }
        throw new IllegalStateException("size == 0");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        long j8 = this.f4683g;
        if (j8 != aVar.f4683g) {
            return false;
        }
        long j9 = 0;
        if (j8 == 0) {
            return true;
        }
        j jVar = this.f4682f;
        j jVar2 = aVar.f4682f;
        int i8 = jVar.f4704b;
        int i9 = jVar2.f4704b;
        while (j9 < this.f4683g) {
            long min = (long) Math.min(jVar.f4705c - i8, jVar2.f4705c - i9);
            int i10 = 0;
            while (((long) i10) < min) {
                int i11 = i8 + 1;
                int i12 = i9 + 1;
                if (jVar.f4703a[i8] != jVar2.f4703a[i9]) {
                    return false;
                }
                i10++;
                i8 = i11;
                i9 = i12;
            }
            if (i8 == jVar.f4705c) {
                jVar = jVar.f4707f;
                i8 = jVar.f4704b;
            }
            if (i9 == jVar2.f4705c) {
                jVar2 = jVar2.f4707f;
                i9 = jVar2.f4704b;
            }
            j9 += min;
        }
        return true;
    }

    public final void flush() {
    }

    public final byte[] g(long j8) {
        n.a(this.f4683g, 0, j8);
        if (j8 <= 2147483647L) {
            int i8 = (int) j8;
            byte[] bArr = new byte[i8];
            int i9 = 0;
            while (i9 < i8) {
                int read = read(bArr, i9, i8 - i9);
                if (read != -1) {
                    i9 += read;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j8);
    }

    public final String h(long j8, Charset charset) {
        n.a(this.f4683g, 0, j8);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j8 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j8);
        } else if (j8 == 0) {
            return "";
        } else {
            j jVar = this.f4682f;
            int i8 = jVar.f4704b;
            if (((long) i8) + j8 > ((long) jVar.f4705c)) {
                return new String(g(j8), charset);
            }
            String str = new String(jVar.f4703a, i8, (int) j8, charset);
            int i9 = (int) (((long) jVar.f4704b) + j8);
            jVar.f4704b = i9;
            this.f4683g -= j8;
            if (i9 == jVar.f4705c) {
                this.f4682f = jVar.a();
                k.a(jVar);
            }
            return str;
        }
    }

    public final int hashCode() {
        j jVar = this.f4682f;
        if (jVar == null) {
            return 0;
        }
        int i8 = 1;
        do {
            int i9 = jVar.f4705c;
            for (int i10 = jVar.f4704b; i10 < i9; i10++) {
                i8 = (i8 * 31) + jVar.f4703a[i10];
            }
            jVar = jVar.f4707f;
        } while (jVar != this.f4682f);
        return i8;
    }

    public final a i() {
        return this;
    }

    public final boolean isOpen() {
        return true;
    }

    public final String j(long j8) {
        return h(j8, n.f4713a);
    }

    public final boolean m(long j8) {
        return this.f4683g >= j8;
    }

    public final int n(f fVar, boolean z8) {
        byte[] bArr;
        int i8;
        int i9;
        int i10;
        byte[] bArr2;
        j jVar;
        int i11;
        f fVar2 = fVar;
        j jVar2 = this.f4682f;
        if (jVar2 != null) {
            int i12 = jVar2.f4704b;
            int i13 = jVar2.f4705c;
            int[] iArr = fVar2.f4692g;
            byte[] bArr3 = jVar2.f4703a;
            j jVar3 = jVar2;
            int i14 = 0;
            int i15 = -1;
            loop0:
            while (true) {
                int i16 = i14 + 1;
                int i17 = iArr[i14];
                int i18 = i16 + 1;
                int i19 = iArr[i16];
                if (i19 != -1) {
                    i15 = i19;
                }
                if (jVar3 == null) {
                    break;
                }
                if (i17 < 0) {
                    int i20 = i18 + (i17 * -1);
                    while (true) {
                        int i21 = i12 + 1;
                        int i22 = i18 + 1;
                        if ((bArr3[i12] & 255) != iArr[i18]) {
                            return i15;
                        }
                        boolean z9 = i22 == i20;
                        if (i21 == i13) {
                            j jVar4 = jVar3.f4707f;
                            i11 = jVar4.f4704b;
                            int i23 = jVar4.f4705c;
                            bArr2 = jVar4.f4703a;
                            if (jVar4 != jVar2) {
                                int i24 = i23;
                                jVar = jVar4;
                                i13 = i24;
                            } else if (!z9) {
                                break loop0;
                            } else {
                                i13 = i23;
                                jVar = null;
                            }
                        } else {
                            j jVar5 = jVar3;
                            bArr2 = bArr3;
                            i11 = i21;
                            jVar = jVar5;
                        }
                        if (z9) {
                            i10 = iArr[i22];
                            int i25 = i11;
                            i8 = i13;
                            i9 = i25;
                            byte[] bArr4 = bArr2;
                            jVar3 = jVar;
                            bArr = bArr4;
                            break;
                        }
                        i12 = i11;
                        bArr3 = bArr2;
                        i18 = i22;
                        jVar3 = jVar;
                    }
                } else {
                    int i26 = i12 + 1;
                    byte b9 = bArr3[i12] & 255;
                    int i27 = i18 + i17;
                    while (i18 != i27) {
                        if (b9 == iArr[i18]) {
                            i10 = iArr[i18 + i17];
                            if (i26 == i13) {
                                jVar3 = jVar3.f4707f;
                                i9 = jVar3.f4704b;
                                i8 = jVar3.f4705c;
                                bArr = jVar3.f4703a;
                                if (jVar3 == jVar2) {
                                    jVar3 = null;
                                }
                            } else {
                                bArr = bArr3;
                                i8 = i13;
                                i9 = i26;
                            }
                        } else {
                            i18++;
                        }
                    }
                    return i15;
                }
                if (i10 >= 0) {
                    return i10;
                }
                byte[] bArr5 = bArr;
                i14 = -i10;
                i12 = i9;
                i13 = i8;
                bArr3 = bArr5;
            }
            if (z8) {
                return -2;
            }
            return i15;
        } else if (z8) {
            return -2;
        } else {
            return fVar2.indexOf(c.f4685j);
        }
    }

    public final void o(long j8) {
        while (j8 > 0) {
            j jVar = this.f4682f;
            if (jVar != null) {
                int min = (int) Math.min(j8, (long) (jVar.f4705c - jVar.f4704b));
                long j9 = (long) min;
                this.f4683g -= j9;
                j8 -= j9;
                j jVar2 = this.f4682f;
                int i8 = jVar2.f4704b + min;
                jVar2.f4704b = i8;
                if (i8 == jVar2.f4705c) {
                    this.f4682f = jVar2.a();
                    k.a(jVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final j q(int i8) {
        if (i8 < 1 || i8 > 8192) {
            throw new IllegalArgumentException();
        }
        j jVar = this.f4682f;
        if (jVar == null) {
            j b9 = k.b();
            this.f4682f = b9;
            b9.f4708g = b9;
            b9.f4707f = b9;
            return b9;
        }
        j jVar2 = jVar.f4708g;
        if (jVar2.f4705c + i8 <= 8192 && jVar2.e) {
            return jVar2;
        }
        j b10 = k.b();
        jVar2.b(b10);
        return b10;
    }

    public final int read(ByteBuffer byteBuffer) {
        j jVar = this.f4682f;
        if (jVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), jVar.f4705c - jVar.f4704b);
        byteBuffer.put(jVar.f4703a, jVar.f4704b, min);
        int i8 = jVar.f4704b + min;
        jVar.f4704b = i8;
        this.f4683g -= (long) min;
        if (i8 == jVar.f4705c) {
            this.f4682f = jVar.a();
            k.a(jVar);
        }
        return min;
    }

    public final int read(byte[] bArr, int i8, int i9) {
        n.a((long) bArr.length, (long) i8, (long) i9);
        j jVar = this.f4682f;
        if (jVar == null) {
            return -1;
        }
        int min = Math.min(i9, jVar.f4705c - jVar.f4704b);
        System.arraycopy(jVar.f4703a, jVar.f4704b, bArr, i8, min);
        int i10 = jVar.f4704b + min;
        jVar.f4704b = i10;
        this.f4683g -= (long) min;
        if (i10 == jVar.f4705c) {
            this.f4682f = jVar.a();
            k.a(jVar);
        }
        return min;
    }

    public final void s(a aVar, long j8) {
        j jVar;
        if (aVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (aVar != this) {
            n.a(aVar.f4683g, 0, j8);
            while (j8 > 0) {
                j jVar2 = aVar.f4682f;
                int i8 = jVar2.f4705c - jVar2.f4704b;
                int i9 = 0;
                if (j8 < ((long) i8)) {
                    j jVar3 = this.f4682f;
                    j jVar4 = jVar3 != null ? jVar3.f4708g : null;
                    if (jVar4 != null && jVar4.e) {
                        if ((((long) jVar4.f4705c) + j8) - ((long) (jVar4.f4706d ? 0 : jVar4.f4704b)) <= 8192) {
                            jVar2.d(jVar4, (int) j8);
                            aVar.f4683g -= j8;
                            this.f4683g += j8;
                            return;
                        }
                    }
                    int i10 = (int) j8;
                    if (i10 <= 0 || i10 > i8) {
                        throw new IllegalArgumentException();
                    }
                    if (i10 >= 1024) {
                        jVar = jVar2.c();
                    } else {
                        jVar = k.b();
                        System.arraycopy(jVar2.f4703a, jVar2.f4704b, jVar.f4703a, 0, i10);
                    }
                    jVar.f4705c = jVar.f4704b + i10;
                    jVar2.f4704b += i10;
                    jVar2.f4708g.b(jVar);
                    aVar.f4682f = jVar;
                }
                j jVar5 = aVar.f4682f;
                long j9 = (long) (jVar5.f4705c - jVar5.f4704b);
                aVar.f4682f = jVar5.a();
                j jVar6 = this.f4682f;
                if (jVar6 == null) {
                    this.f4682f = jVar5;
                    jVar5.f4708g = jVar5;
                    jVar5.f4707f = jVar5;
                } else {
                    jVar6.f4708g.b(jVar5);
                    j jVar7 = jVar5.f4708g;
                    if (jVar7 == jVar5) {
                        throw new IllegalStateException();
                    } else if (jVar7.e) {
                        int i11 = jVar5.f4705c - jVar5.f4704b;
                        int i12 = 8192 - jVar7.f4705c;
                        if (!jVar7.f4706d) {
                            i9 = jVar7.f4704b;
                        }
                        if (i11 <= i12 + i9) {
                            jVar5.d(jVar7, i11);
                            jVar5.a();
                            k.a(jVar5);
                        }
                    }
                }
                aVar.f4683g -= j9;
                this.f4683g += j9;
                j8 -= j9;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public final void t(int i8) {
        j q8 = q(1);
        int i9 = q8.f4705c;
        q8.f4705c = i9 + 1;
        q8.f4703a[i9] = (byte) i8;
        this.f4683g++;
    }

    public final String toString() {
        long j8 = this.f4683g;
        if (j8 <= 2147483647L) {
            int i8 = (int) j8;
            return (i8 == 0 ? c.f4685j : new l(this, i8)).toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f4683g);
    }

    public final void u(int i8) {
        j q8 = q(4);
        int i9 = q8.f4705c;
        int i10 = i9 + 1;
        byte[] bArr = q8.f4703a;
        bArr[i9] = (byte) ((i8 >>> 24) & 255);
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((i8 >>> 16) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i8 >>> 8) & 255);
        bArr[i12] = (byte) (i8 & 255);
        q8.f4705c = i12 + 1;
        this.f4683g += 4;
    }

    public final void v(String str, int i8, int i9) {
        int i10;
        char charAt;
        if (i8 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i8);
        } else if (i9 < i8) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i9 + " < " + i8);
        } else if (i9 <= str.length()) {
            while (i8 < i9) {
                char charAt2 = str.charAt(i8);
                if (charAt2 < 128) {
                    j q8 = q(1);
                    int i11 = q8.f4705c - i8;
                    int min = Math.min(i9, 8192 - i11);
                    int i12 = i8 + 1;
                    byte[] bArr = q8.f4703a;
                    bArr[i8 + i11] = (byte) charAt2;
                    while (true) {
                        i8 = i12;
                        if (i8 >= min || (charAt = str.charAt(i8)) >= 128) {
                            int i13 = q8.f4705c;
                            int i14 = (i11 + i8) - i13;
                            q8.f4705c = i13 + i14;
                            this.f4683g += (long) i14;
                        } else {
                            i12 = i8 + 1;
                            bArr[i8 + i11] = (byte) charAt;
                        }
                    }
                    int i132 = q8.f4705c;
                    int i142 = (i11 + i8) - i132;
                    q8.f4705c = i132 + i142;
                    this.f4683g += (long) i142;
                } else {
                    if (charAt2 < 2048) {
                        i10 = (charAt2 >> 6) | 192;
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        t((charAt2 >> 12) | 224);
                        i10 = ((charAt2 >> 6) & 63) | 128;
                    } else {
                        int i15 = i8 + 1;
                        char charAt3 = i15 < i9 ? str.charAt(i15) : 0;
                        if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            t(63);
                            i8 = i15;
                        } else {
                            int i16 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 0;
                            t((i16 >> 18) | 240);
                            t(((i16 >> 12) & 63) | 128);
                            t(((i16 >> 6) & 63) | 128);
                            t((i16 & 63) | 128);
                            i8 += 2;
                        }
                    }
                    t(i10);
                    t((charAt2 & '?') | 128);
                    i8++;
                }
            }
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i9 + " > " + str.length());
        }
    }

    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i8 = remaining;
            while (i8 > 0) {
                j q8 = q(1);
                int min = Math.min(i8, 8192 - q8.f4705c);
                byteBuffer.get(q8.f4703a, q8.f4705c, min);
                i8 -= min;
                q8.f4705c += min;
            }
            this.f4683g += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final long y(a aVar, long j8) {
        if (aVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j8 >= 0) {
            long j9 = this.f4683g;
            if (j9 == 0) {
                return -1;
            }
            if (j8 > j9) {
                j8 = j9;
            }
            aVar.s(this, j8);
            return j8;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }
    }
}
