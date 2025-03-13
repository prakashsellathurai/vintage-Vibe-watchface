package androidx.wear.protolayout.protobuf;

import androidx.wear.watchface.style.data.ComplicationOverlayWireFormat;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class m1 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f2146a = ((!(l1.e && l1.f2141d) || d.a()) ? new c() : new e());

    public static class a {
        public static boolean a(byte b9) {
            return b9 > -65;
        }
    }

    public static abstract class b {
        public abstract String a(byte[] bArr, int i8, int i9);

        public abstract int b(CharSequence charSequence, byte[] bArr, int i8, int i9);

        public abstract int c(int i8, int i9, byte[] bArr);
    }

    public static final class c extends b {
        public final String a(byte[] bArr, int i8, int i9) {
            int i10;
            int i11;
            int i12;
            if ((i8 | i9 | ((bArr.length - i8) - i9)) >= 0) {
                int i13 = i8 + i9;
                char[] cArr = new char[i9];
                int i14 = 0;
                while (r12 < i13) {
                    byte b9 = bArr[r12];
                    if (!(b9 >= 0)) {
                        break;
                    }
                    i8 = r12 + 1;
                    cArr[i10] = (char) b9;
                    i14 = i10 + 1;
                }
                while (r12 < i13) {
                    int i15 = r12 + 1;
                    byte b10 = bArr[r12];
                    if (b10 >= 0) {
                        int i16 = i10 + 1;
                        cArr[i10] = (char) b10;
                        r12 = i15;
                        while (true) {
                            i10 = i16;
                            if (r12 >= i13) {
                                break;
                            }
                            byte b11 = bArr[r12];
                            if (!(b11 >= 0)) {
                                break;
                            }
                            r12++;
                            i16 = i10 + 1;
                            cArr[i10] = (char) b11;
                        }
                    } else {
                        if (!(b10 < -32)) {
                            if (b10 < -16) {
                                if (i15 < i13 - 1) {
                                    int i17 = i15 + 1;
                                    byte b12 = bArr[i15];
                                    i12 = i17 + 1;
                                    byte b13 = bArr[i17];
                                    i11 = i10 + 1;
                                    if (a.a(b12) || ((b10 == -32 && b12 < -96) || ((b10 == -19 && b12 >= -96) || a.a(b13)))) {
                                        throw y.a();
                                    }
                                    cArr[i10] = (char) (((b10 & 15) << 12) | ((b12 & 63) << 6) | (b13 & 63));
                                } else {
                                    throw y.a();
                                }
                            } else if (i15 < i13 - 2) {
                                int i18 = i15 + 1;
                                byte b14 = bArr[i15];
                                int i19 = i18 + 1;
                                byte b15 = bArr[i18];
                                i12 = i19 + 1;
                                byte b16 = bArr[i19];
                                int i20 = i10 + 1;
                                if (a.a(b14) || (((b10 << 28) + (b14 + 112)) >> 30) != 0 || a.a(b15) || a.a(b16)) {
                                    throw y.a();
                                }
                                byte b17 = ((b10 & 7) << 18) | ((b14 & 63) << 12) | ((b15 & 63) << 6) | (b16 & 63);
                                cArr[i10] = (char) ((b17 >>> 10) + 55232);
                                cArr[i20] = (char) ((b17 & 1023) + 56320);
                                i11 = i20 + 1;
                            } else {
                                throw y.a();
                            }
                            r12 = i12;
                            i10 = i11;
                        } else if (i15 < i13) {
                            int i21 = i15 + 1;
                            byte b18 = bArr[i15];
                            int i22 = i10 + 1;
                            if (b10 < -62 || a.a(b18)) {
                                throw y.a();
                            }
                            cArr[i10] = (char) (((b10 & 31) << 6) | (b18 & 63));
                            r12 = i21;
                            i10 = i22;
                        } else {
                            throw y.a();
                        }
                    }
                }
                return new String(cArr, 0, i10);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)}));
        }

        public final int b(CharSequence charSequence, byte[] bArr, int i8, int i9) {
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

        public final int c(int i8, int i9, byte[] bArr) {
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
                                    return m1.b(b13, bArr[i10]);
                                }
                                if (i14 == 2) {
                                    return m1.c(b13, bArr[i10], bArr[i10 + 1]);
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
        public static int d(long j8, byte[] bArr, int i8, int i9) {
            if (i9 == 0) {
                b bVar = m1.f2146a;
                if (i8 > -12) {
                    return -1;
                }
                return i8;
            } else if (i9 == 1) {
                return m1.b(i8, l1.h(bArr, j8));
            } else {
                if (i9 == 2) {
                    return m1.c(i8, l1.h(bArr, j8), l1.h(bArr, j8 + 1));
                }
                throw new AssertionError();
            }
        }

        public final String a(byte[] bArr, int i8, int i9) {
            Charset charset = x.f2214a;
            String str = new String(bArr, i8, i9, charset);
            if (!str.contains("�") || Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i8, i9 + i8))) {
                return str;
            }
            throw y.a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:37:0x00fc, LOOP_START, PHI: r2 r3 r4 r11 
          PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 long) = (r11v2 long), (r11v5 long) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int b(java.lang.CharSequence r21, byte[] r22, int r23, int r24) {
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
                androidx.wear.protolayout.protobuf.l1.q(r1, r4, r3)
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
                androidx.wear.protolayout.protobuf.l1.q(r1, r4, r13)
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
                androidx.wear.protolayout.protobuf.l1.q(r1, r4, r3)
                long r3 = r14 + r11
                r5 = r13 & 63
                r13 = 128(0x80, float:1.794E-43)
                r5 = r5 | r13
                byte r5 = (byte) r5
                androidx.wear.protolayout.protobuf.l1.q(r1, r14, r5)
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
                androidx.wear.protolayout.protobuf.l1.q(r1, r4, r3)
                long r3 = r14 + r11
                int r5 = r13 >>> 6
                r5 = r5 & 63
                r11 = 128(0x80, float:1.794E-43)
                r5 = r5 | r11
                byte r5 = (byte) r5
                androidx.wear.protolayout.protobuf.l1.q(r1, r14, r5)
                r14 = 1
                long r16 = r3 + r14
                r5 = r13 & 63
                r5 = r5 | r11
                byte r5 = (byte) r5
                androidx.wear.protolayout.protobuf.l1.q(r1, r3, r5)
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
                androidx.wear.protolayout.protobuf.l1.q(r1, r4, r15)
                long r4 = r13 + r11
                int r15 = r2 >>> 12
                r15 = r15 & 63
                r11 = 128(0x80, float:1.794E-43)
                r12 = r15 | 128(0x80, float:1.794E-43)
                byte r12 = (byte) r12
                androidx.wear.protolayout.protobuf.l1.q(r1, r13, r12)
                r12 = 1
                long r14 = r4 + r12
                int r16 = r2 >>> 6
                r12 = r16 & 63
                r12 = r12 | r11
                byte r12 = (byte) r12
                androidx.wear.protolayout.protobuf.l1.q(r1, r4, r12)
                r4 = 1
                long r12 = r14 + r4
                r2 = r2 & 63
                r2 = r2 | r11
                byte r2 = (byte) r2
                androidx.wear.protolayout.protobuf.l1.q(r1, r14, r2)
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
                androidx.wear.protolayout.protobuf.m1$d r0 = new androidx.wear.protolayout.protobuf.m1$d
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
                androidx.wear.protolayout.protobuf.m1$d r0 = new androidx.wear.protolayout.protobuf.m1$d
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.m1.e.b(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e4, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int c(int r18, int r19, byte[] r20) {
            /*
                r17 = this;
                r0 = r18
                r1 = r19
                r2 = r20
                r3 = r0 | r1
                int r4 = r2.length
                int r4 = r4 - r1
                r3 = r3 | r4
                r4 = 2
                r5 = 3
                r6 = 0
                if (r3 < 0) goto L_0x00e6
                long r7 = (long) r0
                long r0 = (long) r1
                long r0 = r0 - r7
                int r0 = (int) r0
                r1 = 16
                r9 = 1
                if (r0 >= r1) goto L_0x001c
                r3 = r6
                goto L_0x005f
            L_0x001c:
                int r1 = (int) r7
                r1 = r1 & 7
                int r1 = 8 - r1
                r3 = r6
                r11 = r7
            L_0x0023:
                if (r3 >= r1) goto L_0x0032
                long r13 = r11 + r9
                byte r11 = androidx.wear.protolayout.protobuf.l1.h(r2, r11)
                if (r11 >= 0) goto L_0x002e
                goto L_0x005f
            L_0x002e:
                int r3 = r3 + 1
                r11 = r13
                goto L_0x0023
            L_0x0032:
                int r1 = r3 + 8
                if (r1 > r0) goto L_0x004f
                long r13 = androidx.wear.protolayout.protobuf.l1.f2142f
                long r13 = r13 + r11
                long r13 = androidx.wear.protolayout.protobuf.l1.n(r13, r2)
                r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r13 = r13 & r15
                r15 = 0
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 == 0) goto L_0x004a
                goto L_0x004f
            L_0x004a:
                r13 = 8
                long r11 = r11 + r13
                r3 = r1
                goto L_0x0032
            L_0x004f:
                if (r3 >= r0) goto L_0x005e
                long r13 = r11 + r9
                byte r1 = androidx.wear.protolayout.protobuf.l1.h(r2, r11)
                if (r1 >= 0) goto L_0x005a
                goto L_0x005f
            L_0x005a:
                int r3 = r3 + 1
                r11 = r13
                goto L_0x004f
            L_0x005e:
                r3 = r0
            L_0x005f:
                int r0 = r0 - r3
                long r11 = (long) r3
                long r7 = r7 + r11
            L_0x0062:
                r1 = r6
            L_0x0063:
                if (r0 <= 0) goto L_0x0072
                long r11 = r7 + r9
                byte r1 = androidx.wear.protolayout.protobuf.l1.h(r2, r7)
                if (r1 < 0) goto L_0x0071
                int r0 = r0 + -1
                r7 = r11
                goto L_0x0063
            L_0x0071:
                r7 = r11
            L_0x0072:
                if (r0 != 0) goto L_0x0076
                goto L_0x00e5
            L_0x0076:
                int r0 = r0 + -1
                r3 = -32
                r11 = -65
                if (r1 >= r3) goto L_0x0094
                if (r0 != 0) goto L_0x0083
                r6 = r1
                goto L_0x00e5
            L_0x0083:
                int r0 = r0 + -1
                r3 = -62
                if (r1 < r3) goto L_0x00e4
                long r12 = r7 + r9
                byte r1 = androidx.wear.protolayout.protobuf.l1.h(r2, r7)
                if (r1 <= r11) goto L_0x0092
                goto L_0x00e4
            L_0x0092:
                r7 = r12
                goto L_0x0062
            L_0x0094:
                r12 = -16
                if (r1 >= r12) goto L_0x00ba
                if (r0 >= r4) goto L_0x009b
                goto L_0x00bc
            L_0x009b:
                int r0 = r0 + -2
                long r12 = r7 + r9
                byte r7 = androidx.wear.protolayout.protobuf.l1.h(r2, r7)
                if (r7 > r11) goto L_0x00e4
                r8 = -96
                if (r1 != r3) goto L_0x00ab
                if (r7 < r8) goto L_0x00e4
            L_0x00ab:
                r3 = -19
                if (r1 != r3) goto L_0x00b1
                if (r7 >= r8) goto L_0x00e4
            L_0x00b1:
                long r7 = r12 + r9
                byte r1 = androidx.wear.protolayout.protobuf.l1.h(r2, r12)
                if (r1 <= r11) goto L_0x0062
                goto L_0x00e4
            L_0x00ba:
                if (r0 >= r5) goto L_0x00c1
            L_0x00bc:
                int r6 = d(r7, r2, r1, r0)
                goto L_0x00e5
            L_0x00c1:
                int r0 = r0 + -3
                long r12 = r7 + r9
                byte r3 = androidx.wear.protolayout.protobuf.l1.h(r2, r7)
                if (r3 > r11) goto L_0x00e4
                int r1 = r1 << 28
                int r3 = r3 + 112
                int r1 = r1 + r3
                int r1 = r1 >> 30
                if (r1 != 0) goto L_0x00e4
                long r7 = r12 + r9
                byte r1 = androidx.wear.protolayout.protobuf.l1.h(r2, r12)
                if (r1 > r11) goto L_0x00e4
                long r12 = r7 + r9
                byte r1 = androidx.wear.protolayout.protobuf.l1.h(r2, r7)
                if (r1 <= r11) goto L_0x0092
            L_0x00e4:
                r6 = -1
            L_0x00e5:
                return r6
            L_0x00e6:
                java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.Object[] r5 = new java.lang.Object[r5]
                int r2 = r2.length
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r5[r6] = r2
                java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
                r2 = 1
                r5[r2] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
                r5[r4] = r0
                java.lang.String r0 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r0 = java.lang.String.format(r0, r5)
                r3.<init>(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.m1.e.c(int, int, byte[]):int");
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
}
