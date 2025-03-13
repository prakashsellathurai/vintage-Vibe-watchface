package com.google.protobuf;

import androidx.wear.watchface.style.data.ComplicationOverlayWireFormat;
import java.nio.ByteBuffer;

public final class r1 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f3750a = ((!(q1.e && q1.f3745d) || d.a()) ? new c() : new e());

    public static class a {
        public static void a(byte b9, byte b10, byte b11, byte b12, char[] cArr, int i8) {
            if (d(b10) || (((b9 << 28) + (b10 + 112)) >> 30) != 0 || d(b11) || d(b12)) {
                throw b0.c();
            }
            byte b13 = ((b9 & 7) << 18) | ((b10 & 63) << 12) | ((b11 & 63) << 6) | (b12 & 63);
            cArr[i8] = (char) ((b13 >>> 10) + 55232);
            cArr[i8 + 1] = (char) ((b13 & 1023) + 56320);
        }

        public static void b(byte b9, byte b10, char[] cArr, int i8) {
            if (b9 < -62 || d(b10)) {
                throw b0.c();
            }
            cArr[i8] = (char) (((b9 & 31) << 6) | (b10 & 63));
        }

        public static void c(byte b9, byte b10, byte b11, char[] cArr, int i8) {
            if (d(b10) || ((b9 == -32 && b10 < -96) || ((b9 == -19 && b10 >= -96) || d(b11)))) {
                throw b0.c();
            }
            cArr[i8] = (char) (((b9 & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
        }

        public static boolean d(byte b9) {
            return b9 > -65;
        }
    }

    public static abstract class b {
        public static String b(ByteBuffer byteBuffer, int i8, int i9) {
            if ((i8 | i9 | ((byteBuffer.limit() - i8) - i9)) >= 0) {
                int i10 = i8 + i9;
                char[] cArr = new char[i9];
                int i11 = 0;
                while (r12 < i10) {
                    byte b9 = byteBuffer.get(r12);
                    if (!(b9 >= 0)) {
                        break;
                    }
                    i8 = r12 + 1;
                    cArr[i11] = (char) b9;
                    i11++;
                }
                int i12 = i11;
                while (r12 < i10) {
                    int i13 = r12 + 1;
                    byte b10 = byteBuffer.get(r12);
                    if (b10 >= 0) {
                        int i14 = i12 + 1;
                        cArr[i12] = (char) b10;
                        r12 = i13;
                        while (true) {
                            i12 = i14;
                            if (r12 >= i10) {
                                break;
                            }
                            byte b11 = byteBuffer.get(r12);
                            if (!(b11 >= 0)) {
                                break;
                            }
                            r12++;
                            i14 = i12 + 1;
                            cArr[i12] = (char) b11;
                        }
                    } else {
                        if (!(b10 < -32)) {
                            if (b10 < -16) {
                                if (i13 < i10 - 1) {
                                    int i15 = i13 + 1;
                                    a.c(b10, byteBuffer.get(i13), byteBuffer.get(i15), cArr, i12);
                                    r12 = i15 + 1;
                                    i12++;
                                } else {
                                    throw b0.c();
                                }
                            } else if (i13 < i10 - 2) {
                                int i16 = i13 + 1;
                                byte b12 = byteBuffer.get(i13);
                                int i17 = i16 + 1;
                                a.a(b10, b12, byteBuffer.get(i16), byteBuffer.get(i17), cArr, i12);
                                i12 = i12 + 1 + 1;
                                r12 = i17 + 1;
                            } else {
                                throw b0.c();
                            }
                        } else if (i13 < i10) {
                            a.b(b10, byteBuffer.get(i13), cArr, i12);
                            r12 = i13 + 1;
                            i12++;
                        } else {
                            throw b0.c();
                        }
                    }
                }
                return new String(cArr, 0, i12);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i8), Integer.valueOf(i9)}));
        }

        public abstract String a(byte[] bArr, int i8, int i9);

        public abstract String c(ByteBuffer byteBuffer, int i8, int i9);

        public abstract int d(CharSequence charSequence, byte[] bArr, int i8, int i9);

        public abstract int e(int i8, int i9, byte[] bArr);
    }

    public static final class c extends b {
        public final String a(byte[] bArr, int i8, int i9) {
            if ((i8 | i9 | ((bArr.length - i8) - i9)) >= 0) {
                int i10 = i8 + i9;
                char[] cArr = new char[i9];
                int i11 = 0;
                while (r12 < i10) {
                    byte b9 = bArr[r12];
                    if (!(b9 >= 0)) {
                        break;
                    }
                    i8 = r12 + 1;
                    cArr[i11] = (char) b9;
                    i11++;
                }
                int i12 = i11;
                while (r12 < i10) {
                    int i13 = r12 + 1;
                    byte b10 = bArr[r12];
                    if (b10 >= 0) {
                        int i14 = i12 + 1;
                        cArr[i12] = (char) b10;
                        r12 = i13;
                        while (true) {
                            i12 = i14;
                            if (r12 >= i10) {
                                break;
                            }
                            byte b11 = bArr[r12];
                            if (!(b11 >= 0)) {
                                break;
                            }
                            r12++;
                            i14 = i12 + 1;
                            cArr[i12] = (char) b11;
                        }
                    } else {
                        if (!(b10 < -32)) {
                            if (b10 < -16) {
                                if (i13 < i10 - 1) {
                                    int i15 = i13 + 1;
                                    a.c(b10, bArr[i13], bArr[i15], cArr, i12);
                                    r12 = i15 + 1;
                                    i12++;
                                } else {
                                    throw b0.c();
                                }
                            } else if (i13 < i10 - 2) {
                                int i16 = i13 + 1;
                                byte b12 = bArr[i13];
                                int i17 = i16 + 1;
                                a.a(b10, b12, bArr[i16], bArr[i17], cArr, i12);
                                i12 = i12 + 1 + 1;
                                r12 = i17 + 1;
                            } else {
                                throw b0.c();
                            }
                        } else if (i13 < i10) {
                            a.b(b10, bArr[i13], cArr, i12);
                            r12 = i13 + 1;
                            i12++;
                        } else {
                            throw b0.c();
                        }
                    }
                }
                return new String(cArr, 0, i12);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)}));
        }

        public final String c(ByteBuffer byteBuffer, int i8, int i9) {
            return b.b(byteBuffer, i8, i9);
        }

        public final int d(CharSequence charSequence, byte[] bArr, int i8, int i9) {
            int i10;
            int i11;
            int i12;
            char charAt;
            int length = charSequence.length();
            int i13 = i9 + i8;
            int i14 = 0;
            while (i14 < length && (i12 = i14 + i8) < i13 && (charAt = charSequence.charAt(i14)) < 128) {
                bArr[i12] = (byte) charAt;
                i14++;
            }
            if (i14 == length) {
                return i8 + length;
            }
            int i15 = i8 + i14;
            while (i14 < length) {
                char charAt2 = charSequence.charAt(i14);
                if (charAt2 < 128 && i15 < i13) {
                    i10 = i15 + 1;
                    bArr[i15] = (byte) charAt2;
                } else if (charAt2 < 2048 && i15 <= i13 - 2) {
                    int i16 = i15 + 1;
                    bArr[i15] = (byte) ((charAt2 >>> 6) | 960);
                    i15 = i16 + 1;
                    bArr[i16] = (byte) ((charAt2 & '?') | 128);
                    i14++;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i15 <= i13 - 3) {
                    int i17 = i15 + 1;
                    bArr[i15] = (byte) ((charAt2 >>> 12) | 480);
                    int i18 = i17 + 1;
                    bArr[i17] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i10 = i18 + 1;
                    bArr[i18] = (byte) ((charAt2 & '?') | 128);
                } else if (i15 <= i13 - 4) {
                    int i19 = i14 + 1;
                    if (i19 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i19);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i20 = i15 + 1;
                            bArr[i15] = (byte) ((codePoint >>> 18) | 240);
                            int i21 = i20 + 1;
                            bArr[i20] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i22 = i21 + 1;
                            bArr[i21] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i15 = i22 + 1;
                            bArr[i22] = (byte) ((codePoint & 63) | 128);
                            i14 = i19;
                            i14++;
                        } else {
                            i14 = i19;
                        }
                    }
                    throw new d(i14 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i11 = i14 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i11)))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i15);
                } else {
                    throw new d(i14, length);
                }
                i15 = i10;
                i14++;
            }
            return i15;
        }

        public final int e(int i8, int i9, byte[] bArr) {
            while (r6 < i9 && bArr[r6] >= 0) {
                i8 = r6 + 1;
            }
            if (r6 < i9) {
                while (r6 < i9) {
                    int i10 = r6 + 1;
                    byte b9 = bArr[r6];
                    if (b9 < 0) {
                        byte b10 = -1;
                        if (b9 >= -32) {
                            if (b9 < -16) {
                                if (i10 < i9 - 1) {
                                    int i11 = i10 + 1;
                                    byte b11 = bArr[i10];
                                    if (b11 <= -65 && ((b9 != -32 || b11 >= -96) && (b9 != -19 || b11 < -96))) {
                                        r6 = i11 + 1;
                                        if (bArr[i11] > -65) {
                                        }
                                    }
                                }
                            } else if (i10 < i9 - 2) {
                                int i12 = i10 + 1;
                                byte b12 = bArr[i10];
                                if (b12 <= -65 && (((b9 << 28) + (b12 + 112)) >> 30) == 0) {
                                    int i13 = i12 + 1;
                                    if (bArr[i12] <= -65) {
                                        r6 = i13 + 1;
                                        if (bArr[i13] > -65) {
                                        }
                                    }
                                }
                            }
                            byte b13 = bArr[i10 - 1];
                            int i14 = i9 - i10;
                            if (i14 != 0) {
                                if (i14 == 1) {
                                    return r1.b(b13, bArr[i10]);
                                }
                                if (i14 == 2) {
                                    return r1.c(b13, bArr[i10], bArr[i10 + 1]);
                                }
                                throw new AssertionError();
                            } else if (b13 <= -12) {
                                b10 = b13;
                            }
                        } else if (i10 >= i9) {
                            return b9;
                        } else {
                            if (b9 >= -62) {
                                r6 = i10 + 1;
                                if (bArr[i10] > -65) {
                                }
                            }
                        }
                        return b10;
                    }
                    r6 = i10;
                }
            }
            return 0;
        }
    }

    public static class d extends IllegalArgumentException {
        public d(int i8, int i9) {
            super("Unpaired surrogate at index " + i8 + " of " + i9);
        }
    }

    public static final class e extends b {
        public static int f(byte[] bArr, long j8, int i8) {
            int i9 = 0;
            if (i8 < 16) {
                return 0;
            }
            while (true) {
                int i10 = i9 + 8;
                if (i10 <= i8 && (q1.o(q1.f3746f + j8, bArr) & -9187201950435737472L) == 0) {
                    j8 += 8;
                    i9 = i10;
                }
            }
            while (i9 < i8) {
                long j9 = 1 + j8;
                if (q1.i(bArr, j8) < 0) {
                    return i9;
                }
                i9++;
                j8 = j9;
            }
            return i8;
        }

        public static int g(long j8, byte[] bArr, int i8, int i9) {
            if (i9 == 0) {
                b bVar = r1.f3750a;
                if (i8 > -12) {
                    return -1;
                }
                return i8;
            } else if (i9 == 1) {
                return r1.b(i8, q1.i(bArr, j8));
            } else {
                if (i9 == 2) {
                    return r1.c(i8, q1.i(bArr, j8), q1.i(bArr, j8 + 1));
                }
                throw new AssertionError();
            }
        }

        public final String a(byte[] bArr, int i8, int i9) {
            int i10;
            if ((i8 | i9 | ((bArr.length - i8) - i9)) >= 0) {
                int f9 = f(bArr, (long) i8, i9) + i8;
                int i11 = i8 + i9;
                while (i10 < i11 && q1.i(bArr, (long) i10) >= 0) {
                    f9 = i10 + 1;
                }
                if (i10 == i11) {
                    return new String(bArr, i8, i9, a0.f3589a);
                }
                char[] cArr = new char[i9];
                int i12 = 0;
                while (i8 < i10) {
                    cArr[i12] = (char) q1.i(bArr, (long) i8);
                    i8++;
                    i12++;
                }
                int i13 = i12;
                while (i10 < i11) {
                    int i14 = i10 + 1;
                    byte i15 = q1.i(bArr, (long) i10);
                    if (i15 >= 0) {
                        cArr[i13] = (char) i15;
                        i13++;
                        i10 = i14;
                        while (i10 < i11) {
                            byte i16 = q1.i(bArr, (long) i10);
                            if (!(i16 >= 0)) {
                                break;
                            }
                            i10++;
                            cArr[i13] = (char) i16;
                            i13++;
                        }
                    } else {
                        if (!(i15 < -32)) {
                            if (i15 < -16) {
                                if (i14 < i11 - 1) {
                                    int i17 = i14 + 1;
                                    a.c(i15, q1.i(bArr, (long) i14), q1.i(bArr, (long) i17), cArr, i13);
                                    i10 = i17 + 1;
                                    i13++;
                                } else {
                                    throw b0.c();
                                }
                            } else if (i14 < i11 - 2) {
                                int i18 = i14 + 1;
                                int i19 = i18 + 1;
                                i10 = i19 + 1;
                                a.a(i15, q1.i(bArr, (long) i14), q1.i(bArr, (long) i18), q1.i(bArr, (long) i19), cArr, i13);
                                i13 = i13 + 1 + 1;
                            } else {
                                throw b0.c();
                            }
                        } else if (i14 < i11) {
                            i10 = i14 + 1;
                            a.b(i15, q1.i(bArr, (long) i14), cArr, i13);
                            i13++;
                        } else {
                            throw b0.c();
                        }
                    }
                }
                return new String(cArr, 0, i13);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)}));
        }

        public final String c(ByteBuffer byteBuffer, int i8, int i9) {
            long j8;
            int i10 = i8;
            int i11 = i9;
            if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) >= 0) {
                long j9 = q1.f3744c.j(q1.f3747g, byteBuffer) + ((long) i10);
                long j10 = ((long) i11) + j9;
                char[] cArr = new char[i11];
                int i12 = 0;
                while (j9 < j10) {
                    byte h8 = q1.h(j9);
                    if (!(h8 >= 0)) {
                        break;
                    }
                    j9++;
                    cArr[i12] = (char) h8;
                    i12++;
                }
                while (true) {
                    int i13 = i12;
                    while (j8 < j10) {
                        long j11 = j8 + 1;
                        byte h9 = q1.h(j8);
                        if (h9 >= 0) {
                            cArr[i13] = (char) h9;
                            i13++;
                            j8 = j11;
                            while (j8 < j10) {
                                byte h10 = q1.h(j8);
                                if (!(h10 >= 0)) {
                                    break;
                                }
                                j8++;
                                cArr[i13] = (char) h10;
                                i13++;
                            }
                        } else {
                            if (!(h9 < -32)) {
                                if (h9 < -16) {
                                    if (j11 < j10 - 1) {
                                        long j12 = j11 + 1;
                                        a.c(h9, q1.h(j11), q1.h(j12), cArr, i13);
                                        i13++;
                                        j8 = j12 + 1;
                                    } else {
                                        throw b0.c();
                                    }
                                } else if (j11 < j10 - 2) {
                                    long j13 = j11 + 1;
                                    byte h11 = q1.h(j11);
                                    long j14 = j13 + 1;
                                    byte h12 = q1.h(j13);
                                    j9 = j14 + 1;
                                    a.a(h9, h11, h12, q1.h(j14), cArr, i13);
                                    i12 = i13 + 1 + 1;
                                } else {
                                    throw b0.c();
                                }
                            } else if (j11 < j10) {
                                j8 = j11 + 1;
                                a.b(h9, q1.h(j11), cArr, i13);
                                i13++;
                            } else {
                                throw b0.c();
                            }
                        }
                    }
                    return new String(cArr, 0, i13);
                }
            }
            ByteBuffer byteBuffer2 = byteBuffer;
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i8), Integer.valueOf(i9)}));
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:37:0x00fc, LOOP_START, PHI: r2 r3 r4 r11 
          PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 long) = (r11v2 long), (r11v5 long) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int d(java.lang.CharSequence r21, byte[] r22, int r23, int r24) {
            /*
                r20 = this;
                r0 = r21
                r1 = r22
                r2 = r23
                r3 = r24
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r21.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L_0x0141
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L_0x0141
                r2 = 0
            L_0x001a:
                r11 = 1
                r3 = 128(0x80, float:1.794E-43)
                if (r2 >= r8) goto L_0x002f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x002f
                long r11 = r11 + r4
                byte r3 = (byte) r13
                com.google.protobuf.q1.s(r1, r4, r3)
                int r2 = r2 + 1
                r4 = r11
                goto L_0x001a
            L_0x002f:
                if (r2 != r8) goto L_0x0033
                int r0 = (int) r4
                return r0
            L_0x0033:
                if (r2 >= r8) goto L_0x013f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x004a
                int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r14 >= 0) goto L_0x004a
                long r14 = r4 + r11
                byte r13 = (byte) r13
                com.google.protobuf.q1.s(r1, r4, r13)
                r4 = r11
                r12 = r14
                r11 = r3
                goto L_0x00fc
            L_0x004a:
                r14 = 2048(0x800, float:2.87E-42)
                if (r13 >= r14) goto L_0x0074
                r14 = 2
                long r14 = r6 - r14
                int r14 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r14 > 0) goto L_0x0074
                long r14 = r4 + r11
                int r3 = r13 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                com.google.protobuf.q1.s(r1, r4, r3)
                long r3 = r14 + r11
                r5 = r13 & 63
                r13 = 128(0x80, float:1.794E-43)
                r5 = r5 | r13
                byte r5 = (byte) r5
                com.google.protobuf.q1.s(r1, r14, r5)
                r18 = r11
                r11 = 128(0x80, float:1.794E-43)
                r12 = r3
                r4 = r18
                goto L_0x00fc
            L_0x0074:
                r3 = 57343(0xdfff, float:8.0355E-41)
                r14 = 55296(0xd800, float:7.7486E-41)
                if (r13 < r14) goto L_0x007e
                if (r3 >= r13) goto L_0x00af
            L_0x007e:
                r15 = 3
                long r15 = r6 - r15
                int r15 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r15 > 0) goto L_0x00af
                long r14 = r4 + r11
                int r3 = r13 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                com.google.protobuf.q1.s(r1, r4, r3)
                long r3 = r14 + r11
                int r5 = r13 >>> 6
                r5 = r5 & 63
                r11 = 128(0x80, float:1.794E-43)
                r5 = r5 | r11
                byte r5 = (byte) r5
                com.google.protobuf.q1.s(r1, r14, r5)
                r14 = 1
                long r16 = r3 + r14
                r5 = r13 & 63
                r5 = r5 | r11
                byte r5 = (byte) r5
                com.google.protobuf.q1.s(r1, r3, r5)
                r12 = r16
                r4 = 1
                r11 = 128(0x80, float:1.794E-43)
                goto L_0x00fc
            L_0x00af:
                r11 = 4
                long r11 = r6 - r11
                int r11 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r11 > 0) goto L_0x010f
                int r3 = r2 + 1
                if (r3 == r8) goto L_0x0107
                char r2 = r0.charAt(r3)
                boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r11 == 0) goto L_0x0106
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r11 = 1
                long r13 = r4 + r11
                int r15 = r2 >>> 18
                r15 = r15 | 240(0xf0, float:3.36E-43)
                byte r15 = (byte) r15
                com.google.protobuf.q1.s(r1, r4, r15)
                long r4 = r13 + r11
                int r15 = r2 >>> 12
                r15 = r15 & 63
                r11 = 128(0x80, float:1.794E-43)
                r12 = r15 | 128(0x80, float:1.794E-43)
                byte r12 = (byte) r12
                com.google.protobuf.q1.s(r1, r13, r12)
                r12 = 1
                long r14 = r4 + r12
                int r16 = r2 >>> 6
                r12 = r16 & 63
                r12 = r12 | r11
                byte r12 = (byte) r12
                com.google.protobuf.q1.s(r1, r4, r12)
                r4 = 1
                long r12 = r14 + r4
                r2 = r2 & 63
                r2 = r2 | r11
                byte r2 = (byte) r2
                com.google.protobuf.q1.s(r1, r14, r2)
                r2 = r3
            L_0x00fc:
                int r2 = r2 + 1
                r3 = r11
                r18 = r4
                r4 = r12
                r11 = r18
                goto L_0x0033
            L_0x0106:
                r2 = r3
            L_0x0107:
                com.google.protobuf.r1$d r0 = new com.google.protobuf.r1$d
                int r2 = r2 + -1
                r0.<init>(r2, r8)
                throw r0
            L_0x010f:
                if (r14 > r13) goto L_0x0127
                if (r13 > r3) goto L_0x0127
                int r1 = r2 + 1
                if (r1 == r8) goto L_0x0121
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L_0x0127
            L_0x0121:
                com.google.protobuf.r1$d r0 = new com.google.protobuf.r1$d
                r0.<init>(r2, r8)
                throw r0
            L_0x0127:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r10)
                r1.append(r13)
                r1.append(r9)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x013f:
                int r0 = (int) r4
                return r0
            L_0x0141:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>(r10)
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                r4.append(r0)
                r4.append(r9)
                int r0 = r2 + r3
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.r1.e.d(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
            return g(r10, r13, r3, r12);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int e(int r11, int r12, byte[] r13) {
            /*
                r10 = this;
                r10 = r11 | r12
                int r0 = r13.length
                int r0 = r0 - r12
                r10 = r10 | r0
                r0 = 3
                r1 = 0
                r2 = 2
                if (r10 < 0) goto L_0x009d
                long r10 = (long) r11
                long r3 = (long) r12
                long r3 = r3 - r10
                int r12 = (int) r3
                int r3 = f(r13, r10, r12)
                int r12 = r12 - r3
                long r3 = (long) r3
                long r10 = r10 + r3
            L_0x0015:
                r3 = r1
            L_0x0016:
                r4 = 1
                if (r12 <= 0) goto L_0x0027
                long r6 = r10 + r4
                byte r3 = com.google.protobuf.q1.i(r13, r10)
                if (r3 < 0) goto L_0x0026
                int r12 = r12 + -1
                r10 = r6
                goto L_0x0016
            L_0x0026:
                r10 = r6
            L_0x0027:
                if (r12 != 0) goto L_0x002b
                goto L_0x009c
            L_0x002b:
                int r12 = r12 + -1
                r6 = -32
                r7 = -65
                if (r3 >= r6) goto L_0x0048
                if (r12 != 0) goto L_0x0038
                r1 = r3
                goto L_0x009c
            L_0x0038:
                int r12 = r12 + -1
                r6 = -62
                if (r3 < r6) goto L_0x009b
                long r4 = r4 + r10
                byte r10 = com.google.protobuf.q1.i(r13, r10)
                if (r10 <= r7) goto L_0x0046
                goto L_0x009b
            L_0x0046:
                r10 = r4
                goto L_0x0015
            L_0x0048:
                r8 = -16
                if (r3 >= r8) goto L_0x006d
                if (r12 >= r2) goto L_0x004f
                goto L_0x006f
            L_0x004f:
                int r12 = r12 + -2
                long r8 = r10 + r4
                byte r10 = com.google.protobuf.q1.i(r13, r10)
                if (r10 > r7) goto L_0x009b
                r11 = -96
                if (r3 != r6) goto L_0x005f
                if (r10 < r11) goto L_0x009b
            L_0x005f:
                r6 = -19
                if (r3 != r6) goto L_0x0065
                if (r10 >= r11) goto L_0x009b
            L_0x0065:
                long r4 = r4 + r8
                byte r10 = com.google.protobuf.q1.i(r13, r8)
                if (r10 <= r7) goto L_0x0046
                goto L_0x009b
            L_0x006d:
                if (r12 >= r0) goto L_0x0074
            L_0x006f:
                int r1 = g(r10, r13, r3, r12)
                goto L_0x009c
            L_0x0074:
                int r12 = r12 + -3
                long r8 = r10 + r4
                byte r10 = com.google.protobuf.q1.i(r13, r10)
                if (r10 > r7) goto L_0x009b
                int r11 = r3 << 28
                int r10 = r10 + 112
                int r11 = r11 + r10
                int r10 = r11 >> 30
                if (r10 != 0) goto L_0x009b
                long r10 = r8 + r4
                byte r3 = com.google.protobuf.q1.i(r13, r8)
                if (r3 > r7) goto L_0x009b
                long r3 = r10 + r4
                byte r10 = com.google.protobuf.q1.i(r13, r10)
                if (r10 <= r7) goto L_0x0098
                goto L_0x009b
            L_0x0098:
                r10 = r3
                goto L_0x0015
            L_0x009b:
                r1 = -1
            L_0x009c:
                return r1
            L_0x009d:
                java.lang.ArrayIndexOutOfBoundsException r10 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int r13 = r13.length
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r0[r1] = r13
                r13 = 1
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r0[r13] = r11
                java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
                r0[r2] = r11
                java.lang.String r11 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r11 = java.lang.String.format(r11, r0)
                r10.<init>(r11)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.r1.e.e(int, int, byte[]):int");
        }
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i8 = 0;
        int i9 = 0;
        while (i9 < length && charSequence.charAt(i9) < 128) {
            i9++;
        }
        int i10 = length;
        while (true) {
            if (i9 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i9);
            if (charAt < 2048) {
                i10 += (127 - charAt) >>> 31;
                i9++;
            } else {
                int length2 = charSequence.length();
                while (i9 < length2) {
                    char charAt2 = charSequence.charAt(i9);
                    if (charAt2 < 2048) {
                        i8 += (127 - charAt2) >>> 31;
                    } else {
                        i8 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i9) >= 65536) {
                                i9++;
                            } else {
                                throw new d(i9, length2);
                            }
                        }
                    }
                    i9++;
                }
                i10 += i8;
            }
        }
        if (i10 >= length) {
            return i10;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i10) + ComplicationOverlayWireFormat.NULL_ACCESSIBILITY_TRAVERSAL_INDEX));
    }

    public static int b(int i8, int i9) {
        if (i8 > -12 || i9 > -65) {
            return -1;
        }
        return i8 ^ (i9 << 8);
    }

    public static int c(int i8, int i9, int i10) {
        if (i8 > -12 || i9 > -65 || i10 > -65) {
            return -1;
        }
        return (i8 ^ (i9 << 8)) ^ (i10 << 16);
    }

    public static boolean d(byte[] bArr, int i8, int i9) {
        return f3750a.e(i8, i9, bArr) == 0;
    }
}
