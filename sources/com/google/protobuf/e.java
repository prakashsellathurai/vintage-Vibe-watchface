package com.google.protobuf;

import com.google.protobuf.a0;
import com.google.protobuf.q;
import com.google.protobuf.y;

public final class e {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f3623a;

        /* renamed from: b  reason: collision with root package name */
        public long f3624b;

        /* renamed from: c  reason: collision with root package name */
        public Object f3625c;

        /* renamed from: d  reason: collision with root package name */
        public final q f3626d;

        public a(q qVar) {
            qVar.getClass();
            this.f3626d = qVar;
        }
    }

    public static int A(int i8, byte[] bArr, int i9, int i10, a0.j<?> jVar, a aVar) {
        z zVar = (z) jVar;
        int I = I(bArr, i9, aVar);
        while (true) {
            zVar.j(j.b(aVar.f3623a));
            if (I >= i10) {
                break;
            }
            int I2 = I(bArr, I, aVar);
            if (i8 != aVar.f3623a) {
                break;
            }
            I = I(bArr, I2, aVar);
        }
        return I;
    }

    public static int B(int i8, byte[] bArr, int i9, int i10, a0.j<?> jVar, a aVar) {
        i0 i0Var = (i0) jVar;
        int K = K(bArr, i9, aVar);
        while (true) {
            i0Var.j(j.c(aVar.f3624b));
            if (K >= i10) {
                break;
            }
            int I = I(bArr, K, aVar);
            if (i8 != aVar.f3623a) {
                break;
            }
            K = K(bArr, I, aVar);
        }
        return K;
    }

    public static int C(byte[] bArr, int i8, a aVar) {
        int I = I(bArr, i8, aVar);
        int i9 = aVar.f3623a;
        if (i9 < 0) {
            throw b0.f();
        } else if (i9 == 0) {
            aVar.f3625c = "";
            return I;
        } else {
            aVar.f3625c = new String(bArr, I, i9, a0.f3590b);
            return I + i9;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int D(int r4, byte[] r5, int r6, int r7, com.google.protobuf.a0.j<?> r8, com.google.protobuf.e.a r9) {
        /*
            int r6 = I(r5, r6, r9)
            int r0 = r9.f3623a
            if (r0 < 0) goto L_0x003f
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x000d
            goto L_0x002d
        L_0x000d:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.a0.f3590b
            r2.<init>(r5, r6, r0, r3)
        L_0x0014:
            r8.add(r2)
            int r6 = r6 + r0
        L_0x0018:
            if (r6 >= r7) goto L_0x003e
            int r0 = I(r5, r6, r9)
            int r2 = r9.f3623a
            if (r4 == r2) goto L_0x0023
            goto L_0x003e
        L_0x0023:
            int r6 = I(r5, r0, r9)
            int r0 = r9.f3623a
            if (r0 < 0) goto L_0x0039
            if (r0 != 0) goto L_0x0031
        L_0x002d:
            r8.add(r1)
            goto L_0x0018
        L_0x0031:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.a0.f3590b
            r2.<init>(r5, r6, r0, r3)
            goto L_0x0014
        L_0x0039:
            com.google.protobuf.b0 r4 = com.google.protobuf.b0.f()
            throw r4
        L_0x003e:
            return r6
        L_0x003f:
            com.google.protobuf.b0 r4 = com.google.protobuf.b0.f()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.e.D(int, byte[], int, int, com.google.protobuf.a0$j, com.google.protobuf.e$a):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int E(int r5, byte[] r6, int r7, int r8, com.google.protobuf.a0.j<?> r9, com.google.protobuf.e.a r10) {
        /*
            int r7 = I(r6, r7, r10)
            int r0 = r10.f3623a
            if (r0 < 0) goto L_0x005a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r2 = r7
            goto L_0x0036
        L_0x000e:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.r1.d(r6, r7, r2)
            if (r3 == 0) goto L_0x0055
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.a0.f3590b
            r3.<init>(r6, r7, r0, r4)
        L_0x001d:
            r9.add(r3)
        L_0x0020:
            if (r2 >= r8) goto L_0x0054
            int r7 = I(r6, r2, r10)
            int r0 = r10.f3623a
            if (r5 == r0) goto L_0x002b
            goto L_0x0054
        L_0x002b:
            int r7 = I(r6, r7, r10)
            int r0 = r10.f3623a
            if (r0 < 0) goto L_0x004f
            if (r0 != 0) goto L_0x003a
            goto L_0x000c
        L_0x0036:
            r9.add(r1)
            goto L_0x0020
        L_0x003a:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.r1.d(r6, r7, r2)
            if (r3 == 0) goto L_0x004a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.a0.f3590b
            r3.<init>(r6, r7, r0, r4)
            goto L_0x001d
        L_0x004a:
            com.google.protobuf.b0 r5 = com.google.protobuf.b0.c()
            throw r5
        L_0x004f:
            com.google.protobuf.b0 r5 = com.google.protobuf.b0.f()
            throw r5
        L_0x0054:
            return r2
        L_0x0055:
            com.google.protobuf.b0 r5 = com.google.protobuf.b0.c()
            throw r5
        L_0x005a:
            com.google.protobuf.b0 r5 = com.google.protobuf.b0.f()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.e.E(int, byte[], int, int, com.google.protobuf.a0$j, com.google.protobuf.e$a):int");
    }

    public static int F(byte[] bArr, int i8, a aVar) {
        int I = I(bArr, i8, aVar);
        int i9 = aVar.f3623a;
        if (i9 < 0) {
            throw b0.f();
        } else if (i9 == 0) {
            aVar.f3625c = "";
            return I;
        } else {
            aVar.f3625c = r1.f3750a.a(bArr, I, i9);
            return I + i9;
        }
    }

    public static int G(int i8, byte[] bArr, int i9, int i10, n1 n1Var, a aVar) {
        if ((i8 >>> 3) != 0) {
            int i11 = i8 & 7;
            if (i11 == 0) {
                int K = K(bArr, i9, aVar);
                n1Var.d(i8, Long.valueOf(aVar.f3624b));
                return K;
            } else if (i11 == 1) {
                n1Var.d(i8, Long.valueOf(j(bArr, i9)));
                return i9 + 8;
            } else if (i11 == 2) {
                int I = I(bArr, i9, aVar);
                int i12 = aVar.f3623a;
                if (i12 < 0) {
                    throw b0.f();
                } else if (i12 <= bArr.length - I) {
                    n1Var.d(i8, i12 == 0 ? i.f3648g : i.k(bArr, I, i12));
                    return I + i12;
                } else {
                    throw b0.h();
                }
            } else if (i11 == 3) {
                n1 n1Var2 = new n1();
                int i13 = (i8 & -8) | 4;
                int i14 = 0;
                while (true) {
                    if (i9 >= i10) {
                        break;
                    }
                    int I2 = I(bArr, i9, aVar);
                    int i15 = aVar.f3623a;
                    i14 = i15;
                    if (i15 == i13) {
                        i9 = I2;
                        break;
                    }
                    int G = G(i14, bArr, I2, i10, n1Var2, aVar);
                    i14 = i15;
                    i9 = G;
                }
                if (i9 > i10 || i14 != i13) {
                    throw b0.g();
                }
                n1Var.d(i8, n1Var2);
                return i9;
            } else if (i11 == 5) {
                n1Var.d(i8, Integer.valueOf(h(bArr, i9)));
                return i9 + 4;
            } else {
                throw b0.b();
            }
        } else {
            throw b0.b();
        }
    }

    public static int H(int i8, byte[] bArr, int i9, a aVar) {
        int i10;
        int i11;
        int i12 = i8 & 127;
        int i13 = i9 + 1;
        byte b9 = bArr[i9];
        if (b9 >= 0) {
            i11 = b9 << 7;
        } else {
            int i14 = i12 | ((b9 & Byte.MAX_VALUE) << 7);
            int i15 = i13 + 1;
            byte b10 = bArr[i13];
            if (b10 >= 0) {
                i10 = b10 << 14;
            } else {
                i12 = i14 | ((b10 & Byte.MAX_VALUE) << 14);
                i13 = i15 + 1;
                byte b11 = bArr[i15];
                if (b11 >= 0) {
                    i11 = b11 << 21;
                } else {
                    i14 = i12 | ((b11 & Byte.MAX_VALUE) << 21);
                    i15 = i13 + 1;
                    byte b12 = bArr[i13];
                    if (b12 >= 0) {
                        i10 = b12 << 28;
                    } else {
                        int i16 = i14 | ((b12 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i17 = i15 + 1;
                            if (bArr[i15] < 0) {
                                i15 = i17;
                            } else {
                                aVar.f3623a = i16;
                                return i17;
                            }
                        }
                    }
                }
            }
            aVar.f3623a = i14 | i10;
            return i15;
        }
        aVar.f3623a = i12 | i11;
        return i13;
    }

    public static int I(byte[] bArr, int i8, a aVar) {
        int i9 = i8 + 1;
        byte b9 = bArr[i8];
        if (b9 < 0) {
            return H(b9, bArr, i9, aVar);
        }
        aVar.f3623a = b9;
        return i9;
    }

    public static int J(int i8, byte[] bArr, int i9, int i10, a0.j<?> jVar, a aVar) {
        z zVar = (z) jVar;
        int I = I(bArr, i9, aVar);
        while (true) {
            zVar.j(aVar.f3623a);
            if (I >= i10) {
                break;
            }
            int I2 = I(bArr, I, aVar);
            if (i8 != aVar.f3623a) {
                break;
            }
            I = I(bArr, I2, aVar);
        }
        return I;
    }

    public static int K(byte[] bArr, int i8, a aVar) {
        int i9 = i8 + 1;
        long j8 = (long) bArr[i8];
        if (j8 >= 0) {
            aVar.f3624b = j8;
            return i9;
        }
        int i10 = i9 + 1;
        byte b9 = bArr[i9];
        long j9 = (j8 & 127) | (((long) (b9 & Byte.MAX_VALUE)) << 7);
        int i11 = 7;
        while (b9 < 0) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            i11 += 7;
            j9 |= ((long) (b10 & Byte.MAX_VALUE)) << i11;
            int i13 = i12;
            b9 = b10;
            i10 = i13;
        }
        aVar.f3624b = j9;
        return i10;
    }

    public static int L(int i8, byte[] bArr, int i9, int i10, a0.j<?> jVar, a aVar) {
        i0 i0Var = (i0) jVar;
        int K = K(bArr, i9, aVar);
        while (true) {
            i0Var.j(aVar.f3624b);
            if (K >= i10) {
                break;
            }
            int I = I(bArr, K, aVar);
            if (i8 != aVar.f3623a) {
                break;
            }
            K = K(bArr, I, aVar);
        }
        return K;
    }

    public static int M(int i8, byte[] bArr, int i9, int i10, a aVar) {
        if ((i8 >>> 3) != 0) {
            int i11 = i8 & 7;
            if (i11 == 0) {
                return K(bArr, i9, aVar);
            }
            if (i11 == 1) {
                return i9 + 8;
            }
            if (i11 == 2) {
                return I(bArr, i9, aVar) + aVar.f3623a;
            }
            if (i11 == 3) {
                int i12 = (i8 & -8) | 4;
                int i13 = 0;
                while (i9 < i10) {
                    i9 = I(bArr, i9, aVar);
                    i13 = aVar.f3623a;
                    if (i13 == i12) {
                        break;
                    }
                    i9 = M(i13, bArr, i9, i10, aVar);
                }
                if (i9 <= i10 && i13 == i12) {
                    return i9;
                }
                throw b0.g();
            } else if (i11 == 5) {
                return i9 + 4;
            } else {
                throw b0.b();
            }
        } else {
            throw b0.b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1:0x000c, code lost:
        if (r9.f3624b != 0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        r8.j(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        if (r6 >= r7) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        r0 = I(r5, r6, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r4 == r9.f3623a) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        r6 = K(r5, r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r9.f3624b == 0) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(int r4, byte[] r5, int r6, int r7, com.google.protobuf.a0.j<?> r8, com.google.protobuf.e.a r9) {
        /*
            com.google.protobuf.g r8 = (com.google.protobuf.g) r8
            int r6 = K(r5, r6, r9)
            long r0 = r9.f3624b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x000f
            goto L_0x0028
        L_0x000f:
            r0 = 0
        L_0x0010:
            r8.j(r0)
            if (r6 >= r7) goto L_0x002a
            int r0 = I(r5, r6, r9)
            int r1 = r9.f3623a
            if (r4 == r1) goto L_0x001e
            goto L_0x002a
        L_0x001e:
            int r6 = K(r5, r0, r9)
            long r0 = r9.f3624b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x000f
        L_0x0028:
            r0 = 1
            goto L_0x0010
        L_0x002a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.e.a(int, byte[], int, int, com.google.protobuf.a0$j, com.google.protobuf.e$a):int");
    }

    public static int b(byte[] bArr, int i8, a aVar) {
        int I = I(bArr, i8, aVar);
        int i9 = aVar.f3623a;
        if (i9 < 0) {
            throw b0.f();
        } else if (i9 > bArr.length - I) {
            throw b0.h();
        } else if (i9 == 0) {
            aVar.f3625c = i.f3648g;
            return I;
        } else {
            aVar.f3625c = i.k(bArr, I, i9);
            return I + i9;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r0 < 0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r0 > (r3.length - r4)) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r0 != 0) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r6.add(com.google.protobuf.i.f3648g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        throw com.google.protobuf.b0.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        throw com.google.protobuf.b0.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r0 == 0) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r6.add(com.google.protobuf.i.k(r3, r4, r0));
        r4 = r4 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r4 >= r5) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        r0 = I(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r2 == r7.f3623a) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        r4 = I(r3, r0, r7);
        r0 = r7.f3623a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(int r2, byte[] r3, int r4, int r5, com.google.protobuf.a0.j<?> r6, com.google.protobuf.e.a r7) {
        /*
            int r4 = I(r3, r4, r7)
            int r0 = r7.f3623a
            if (r0 < 0) goto L_0x0046
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x0041
            if (r0 != 0) goto L_0x000f
            goto L_0x0030
        L_0x000f:
            com.google.protobuf.i$f r1 = com.google.protobuf.i.k(r3, r4, r0)
            r6.add(r1)
            int r4 = r4 + r0
        L_0x0017:
            if (r4 >= r5) goto L_0x0040
            int r0 = I(r3, r4, r7)
            int r1 = r7.f3623a
            if (r2 == r1) goto L_0x0022
            goto L_0x0040
        L_0x0022:
            int r4 = I(r3, r0, r7)
            int r0 = r7.f3623a
            if (r0 < 0) goto L_0x003b
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x0036
            if (r0 != 0) goto L_0x000f
        L_0x0030:
            com.google.protobuf.i$f r0 = com.google.protobuf.i.f3648g
            r6.add(r0)
            goto L_0x0017
        L_0x0036:
            com.google.protobuf.b0 r2 = com.google.protobuf.b0.h()
            throw r2
        L_0x003b:
            com.google.protobuf.b0 r2 = com.google.protobuf.b0.f()
            throw r2
        L_0x0040:
            return r4
        L_0x0041:
            com.google.protobuf.b0 r2 = com.google.protobuf.b0.h()
            throw r2
        L_0x0046:
            com.google.protobuf.b0 r2 = com.google.protobuf.b0.f()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.e.c(int, byte[], int, int, com.google.protobuf.a0$j, com.google.protobuf.e$a):int");
    }

    public static double d(byte[] bArr, int i8) {
        return Double.longBitsToDouble(j(bArr, i8));
    }

    public static int e(int i8, byte[] bArr, int i9, int i10, a0.j<?> jVar, a aVar) {
        n nVar = (n) jVar;
        nVar.j(Double.longBitsToDouble(j(bArr, i9)));
        int i11 = i9 + 8;
        while (i11 < i10) {
            int I = I(bArr, i11, aVar);
            if (i8 != aVar.f3623a) {
                break;
            }
            nVar.j(Double.longBitsToDouble(j(bArr, I)));
            i11 = I + 8;
        }
        return i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0136, code lost:
        r10 = r8;
        r5 = r15.f3625c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0166, code lost:
        r10 = r8;
        r5 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0172, code lost:
        r5 = java.lang.Long.valueOf(r9);
        r10 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0184, code lost:
        r5 = r8;
        r10 = r10 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0194, code lost:
        r5 = r8;
        r10 = r10 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int f(int r8, byte[] r9, int r10, int r11, com.google.protobuf.y.c<?, ?> r12, com.google.protobuf.y.e<?, ?> r13, com.google.protobuf.m1<com.google.protobuf.n1, com.google.protobuf.n1> r14, com.google.protobuf.e.a r15) {
        /*
            com.google.protobuf.u<com.google.protobuf.y$d> r0 = r12.f3810f
            int r8 = r8 >>> 3
            com.google.protobuf.y$d r1 = r13.f3819d
            boolean r2 = r1.f3814i
            com.google.protobuf.n1 r3 = com.google.protobuf.n1.f3726f
            com.google.protobuf.s1 r4 = r1.f3813h
            r5 = 0
            if (r2 == 0) goto L_0x00b1
            boolean r2 = r1.f3815j
            if (r2 == 0) goto L_0x00b1
            int r11 = r4.ordinal()
            switch(r11) {
                case 0: goto L_0x0096;
                case 1: goto L_0x008c;
                case 2: goto L_0x0082;
                case 3: goto L_0x0082;
                case 4: goto L_0x0078;
                case 5: goto L_0x006e;
                case 6: goto L_0x0064;
                case 7: goto L_0x005a;
                case 8: goto L_0x001a;
                case 9: goto L_0x001a;
                case 10: goto L_0x001a;
                case 11: goto L_0x001a;
                case 12: goto L_0x0078;
                case 13: goto L_0x003a;
                case 14: goto L_0x0064;
                case 15: goto L_0x006e;
                case 16: goto L_0x0030;
                case 17: goto L_0x0025;
                default: goto L_0x001a;
            }
        L_0x001a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Type cannot be packed: "
            r9.<init>(r10)
            goto L_0x00a4
        L_0x0025:
            com.google.protobuf.i0 r8 = new com.google.protobuf.i0
            r8.<init>()
            int r9 = x(r9, r10, r8, r15)
            goto L_0x009f
        L_0x0030:
            com.google.protobuf.z r8 = new com.google.protobuf.z
            r8.<init>()
            int r9 = w(r9, r10, r8, r15)
            goto L_0x009f
        L_0x003a:
            com.google.protobuf.z r11 = new com.google.protobuf.z
            r11.<init>()
            int r9 = y(r9, r10, r11, r15)
            com.google.protobuf.n1 r10 = r12.unknownFields
            if (r10 != r3) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r5 = r10
        L_0x0049:
            com.google.protobuf.a0$d<?> r10 = r1.f3811f
            java.lang.Object r8 = com.google.protobuf.g1.z(r8, r11, r10, r5, r14)
            com.google.protobuf.n1 r8 = (com.google.protobuf.n1) r8
            if (r8 == 0) goto L_0x0055
            r12.unknownFields = r8
        L_0x0055:
            r0.o(r1, r11)
            goto L_0x01bc
        L_0x005a:
            com.google.protobuf.g r8 = new com.google.protobuf.g
            r8.<init>()
            int r9 = r(r9, r10, r8, r15)
            goto L_0x009f
        L_0x0064:
            com.google.protobuf.z r8 = new com.google.protobuf.z
            r8.<init>()
            int r9 = t(r9, r10, r8, r15)
            goto L_0x009f
        L_0x006e:
            com.google.protobuf.i0 r8 = new com.google.protobuf.i0
            r8.<init>()
            int r9 = u(r9, r10, r8, r15)
            goto L_0x009f
        L_0x0078:
            com.google.protobuf.z r8 = new com.google.protobuf.z
            r8.<init>()
            int r9 = y(r9, r10, r8, r15)
            goto L_0x009f
        L_0x0082:
            com.google.protobuf.i0 r8 = new com.google.protobuf.i0
            r8.<init>()
            int r9 = z(r9, r10, r8, r15)
            goto L_0x009f
        L_0x008c:
            com.google.protobuf.w r8 = new com.google.protobuf.w
            r8.<init>()
            int r9 = v(r9, r10, r8, r15)
            goto L_0x009f
        L_0x0096:
            com.google.protobuf.n r8 = new com.google.protobuf.n
            r8.<init>()
            int r9 = s(r9, r10, r8, r15)
        L_0x009f:
            r0.o(r1, r8)
            goto L_0x01bc
        L_0x00a4:
            com.google.protobuf.s1 r10 = r1.f3813h
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x00b1:
            com.google.protobuf.s1 r2 = com.google.protobuf.s1.ENUM
            if (r4 != r2) goto L_0x00dc
            int r10 = I(r9, r10, r15)
            com.google.protobuf.a0$d<?> r9 = r1.f3811f
            int r11 = r15.f3623a
            com.google.protobuf.a0$c r9 = r9.findValueByNumber(r11)
            if (r9 != 0) goto L_0x00d4
            com.google.protobuf.n1 r9 = r12.unknownFields
            if (r9 != r3) goto L_0x00ce
            com.google.protobuf.n1 r9 = new com.google.protobuf.n1
            r9.<init>()
            r12.unknownFields = r9
        L_0x00ce:
            int r11 = r15.f3623a
            com.google.protobuf.g1.E(r8, r11, r9, r14)
            return r10
        L_0x00d4:
            int r8 = r15.f3623a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            goto L_0x0197
        L_0x00dc:
            int r12 = r4.ordinal()
            com.google.protobuf.r0 r13 = r13.f3818c
            switch(r12) {
                case 0: goto L_0x0188;
                case 1: goto L_0x0178;
                case 2: goto L_0x016c;
                case 3: goto L_0x016c;
                case 4: goto L_0x0160;
                case 5: goto L_0x0157;
                case 6: goto L_0x014e;
                case 7: goto L_0x013a;
                case 8: goto L_0x0132;
                case 9: goto L_0x011b;
                case 10: goto L_0x010c;
                case 11: goto L_0x0107;
                case 12: goto L_0x0160;
                case 13: goto L_0x00ff;
                case 14: goto L_0x014e;
                case 15: goto L_0x0157;
                case 16: goto L_0x00f3;
                case 17: goto L_0x00e7;
                default: goto L_0x00e5;
            }
        L_0x00e5:
            goto L_0x0197
        L_0x00e7:
            int r8 = K(r9, r10, r15)
            long r9 = r15.f3624b
            long r9 = com.google.protobuf.j.c(r9)
            goto L_0x0172
        L_0x00f3:
            int r8 = I(r9, r10, r15)
            int r9 = r15.f3623a
            int r9 = com.google.protobuf.j.b(r9)
            goto L_0x0166
        L_0x00ff:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Shouldn't reach here."
            r8.<init>(r9)
            throw r8
        L_0x0107:
            int r8 = b(r9, r10, r15)
            goto L_0x0136
        L_0x010c:
            com.google.protobuf.b1 r8 = com.google.protobuf.b1.f3596c
            java.lang.Class r12 = r13.getClass()
            com.google.protobuf.f1 r8 = r8.a(r12)
            int r8 = p(r8, r9, r10, r11, r15)
            goto L_0x0136
        L_0x011b:
            int r8 = r8 << 3
            r6 = r8 | 4
            com.google.protobuf.b1 r8 = com.google.protobuf.b1.f3596c
            java.lang.Class r12 = r13.getClass()
            com.google.protobuf.f1 r2 = r8.a(r12)
            r3 = r9
            r4 = r10
            r5 = r11
            r7 = r15
            int r8 = n(r2, r3, r4, r5, r6, r7)
            goto L_0x0136
        L_0x0132:
            int r8 = C(r9, r10, r15)
        L_0x0136:
            r10 = r8
            java.lang.Object r5 = r15.f3625c
            goto L_0x0197
        L_0x013a:
            int r10 = K(r9, r10, r15)
            long r8 = r15.f3624b
            r11 = 0
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x0148
            r8 = 1
            goto L_0x0149
        L_0x0148:
            r8 = 0
        L_0x0149:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
            goto L_0x0197
        L_0x014e:
            int r8 = h(r9, r10)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0184
        L_0x0157:
            long r8 = j(r9, r10)
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            goto L_0x0194
        L_0x0160:
            int r8 = I(r9, r10, r15)
            int r9 = r15.f3623a
        L_0x0166:
            r10 = r8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            goto L_0x0197
        L_0x016c:
            int r8 = K(r9, r10, r15)
            long r9 = r15.f3624b
        L_0x0172:
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            r10 = r8
            goto L_0x0197
        L_0x0178:
            int r8 = h(r9, r10)
            float r8 = java.lang.Float.intBitsToFloat(r8)
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
        L_0x0184:
            r5 = r8
            int r10 = r10 + 4
            goto L_0x0197
        L_0x0188:
            long r8 = j(r9, r10)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
        L_0x0194:
            r5 = r8
            int r10 = r10 + 8
        L_0x0197:
            boolean r8 = r1.f3814i
            if (r8 == 0) goto L_0x019f
            r0.a(r1, r5)
            goto L_0x01bb
        L_0x019f:
            com.google.protobuf.s1 r8 = r1.f3813h
            int r8 = r8.ordinal()
            r9 = 9
            if (r8 == r9) goto L_0x01ae
            r9 = 10
            if (r8 == r9) goto L_0x01ae
            goto L_0x01b8
        L_0x01ae:
            java.lang.Object r8 = r0.g(r1)
            if (r8 == 0) goto L_0x01b8
            java.lang.Object r5 = com.google.protobuf.a0.c(r8, r5)
        L_0x01b8:
            r0.o(r1, r5)
        L_0x01bb:
            r9 = r10
        L_0x01bc:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.e.f(int, byte[], int, int, com.google.protobuf.y$c, com.google.protobuf.y$e, com.google.protobuf.m1, com.google.protobuf.e$a):int");
    }

    public static int g(int i8, byte[] bArr, int i9, int i10, Object obj, r0 r0Var, m1<n1, n1> m1Var, a aVar) {
        q qVar = aVar.f3626d;
        qVar.getClass();
        y.e eVar = qVar.f3739a.get(new q.a(i8 >>> 3, r0Var));
        if (eVar == null) {
            return G(i8, bArr, i9, i10, u0.q(obj), aVar);
        }
        y.c cVar = (y.c) obj;
        u<y.d> uVar = cVar.f3810f;
        if (uVar.f3778b) {
            cVar.f3810f = uVar.clone();
        }
        return f(i8, bArr, i9, i10, cVar, eVar, m1Var, aVar);
    }

    public static int h(byte[] bArr, int i8) {
        return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
    }

    public static int i(int i8, byte[] bArr, int i9, int i10, a0.j<?> jVar, a aVar) {
        z zVar = (z) jVar;
        zVar.j(h(bArr, i9));
        int i11 = i9 + 4;
        while (i11 < i10) {
            int I = I(bArr, i11, aVar);
            if (i8 != aVar.f3623a) {
                break;
            }
            zVar.j(h(bArr, I));
            i11 = I + 4;
        }
        return i11;
    }

    public static long j(byte[] bArr, int i8) {
        return ((((long) bArr[i8 + 7]) & 255) << 56) | (((long) bArr[i8]) & 255) | ((((long) bArr[i8 + 1]) & 255) << 8) | ((((long) bArr[i8 + 2]) & 255) << 16) | ((((long) bArr[i8 + 3]) & 255) << 24) | ((((long) bArr[i8 + 4]) & 255) << 32) | ((((long) bArr[i8 + 5]) & 255) << 40) | ((((long) bArr[i8 + 6]) & 255) << 48);
    }

    public static int k(int i8, byte[] bArr, int i9, int i10, a0.j<?> jVar, a aVar) {
        i0 i0Var = (i0) jVar;
        i0Var.j(j(bArr, i9));
        int i11 = i9 + 8;
        while (i11 < i10) {
            int I = I(bArr, i11, aVar);
            if (i8 != aVar.f3623a) {
                break;
            }
            i0Var.j(j(bArr, I));
            i11 = I + 8;
        }
        return i11;
    }

    public static float l(byte[] bArr, int i8) {
        return Float.intBitsToFloat(h(bArr, i8));
    }

    public static int m(int i8, byte[] bArr, int i9, int i10, a0.j<?> jVar, a aVar) {
        w wVar = (w) jVar;
        wVar.j(Float.intBitsToFloat(h(bArr, i9)));
        int i11 = i9 + 4;
        while (i11 < i10) {
            int I = I(bArr, i11, aVar);
            if (i8 != aVar.f3623a) {
                break;
            }
            wVar.j(Float.intBitsToFloat(h(bArr, I)));
            i11 = I + 4;
        }
        return i11;
    }

    public static int n(f1 f1Var, byte[] bArr, int i8, int i9, int i10, a aVar) {
        u0 u0Var = (u0) f1Var;
        Object f9 = u0Var.f();
        int C = u0Var.C(f9, bArr, i8, i9, i10, aVar);
        u0Var.b(f9);
        aVar.f3625c = f9;
        return C;
    }

    public static int o(f1 f1Var, int i8, byte[] bArr, int i9, int i10, a0.j<?> jVar, a aVar) {
        int i11 = (i8 & -8) | 4;
        int n8 = n(f1Var, bArr, i9, i10, i11, aVar);
        while (true) {
            jVar.add(aVar.f3625c);
            if (n8 >= i10) {
                break;
            }
            int I = I(bArr, n8, aVar);
            if (i8 != aVar.f3623a) {
                break;
            }
            n8 = n(f1Var, bArr, I, i10, i11, aVar);
        }
        return n8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int p(com.google.protobuf.f1 r6, byte[] r7, int r8, int r9, com.google.protobuf.e.a r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = H(r8, r7, r0, r10)
            int r8 = r10.f3623a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.f()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.j(r1, r2, r3, r4, r5)
            r6.b(r9)
            r10.f3625c = r9
            return r8
        L_0x0025:
            com.google.protobuf.b0 r6 = com.google.protobuf.b0.h()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.e.p(com.google.protobuf.f1, byte[], int, int, com.google.protobuf.e$a):int");
    }

    public static int q(f1<?> f1Var, int i8, byte[] bArr, int i9, int i10, a0.j<?> jVar, a aVar) {
        int p8 = p(f1Var, bArr, i9, i10, aVar);
        while (true) {
            jVar.add(aVar.f3625c);
            if (p8 >= i10) {
                break;
            }
            int I = I(bArr, p8, aVar);
            if (i8 != aVar.f3623a) {
                break;
            }
            p8 = p(f1Var, bArr, I, i10, aVar);
        }
        return p8;
    }

    public static int r(byte[] bArr, int i8, a0.j<?> jVar, a aVar) {
        g gVar = (g) jVar;
        int I = I(bArr, i8, aVar);
        int i9 = aVar.f3623a + I;
        while (I < i9) {
            I = K(bArr, I, aVar);
            gVar.j(aVar.f3624b != 0);
        }
        if (I == i9) {
            return I;
        }
        throw b0.h();
    }

    public static int s(byte[] bArr, int i8, a0.j<?> jVar, a aVar) {
        n nVar = (n) jVar;
        int I = I(bArr, i8, aVar);
        int i9 = aVar.f3623a + I;
        while (I < i9) {
            nVar.j(Double.longBitsToDouble(j(bArr, I)));
            I += 8;
        }
        if (I == i9) {
            return I;
        }
        throw b0.h();
    }

    public static int t(byte[] bArr, int i8, a0.j<?> jVar, a aVar) {
        z zVar = (z) jVar;
        int I = I(bArr, i8, aVar);
        int i9 = aVar.f3623a + I;
        while (I < i9) {
            zVar.j(h(bArr, I));
            I += 4;
        }
        if (I == i9) {
            return I;
        }
        throw b0.h();
    }

    public static int u(byte[] bArr, int i8, a0.j<?> jVar, a aVar) {
        i0 i0Var = (i0) jVar;
        int I = I(bArr, i8, aVar);
        int i9 = aVar.f3623a + I;
        while (I < i9) {
            i0Var.j(j(bArr, I));
            I += 8;
        }
        if (I == i9) {
            return I;
        }
        throw b0.h();
    }

    public static int v(byte[] bArr, int i8, a0.j<?> jVar, a aVar) {
        w wVar = (w) jVar;
        int I = I(bArr, i8, aVar);
        int i9 = aVar.f3623a + I;
        while (I < i9) {
            wVar.j(Float.intBitsToFloat(h(bArr, I)));
            I += 4;
        }
        if (I == i9) {
            return I;
        }
        throw b0.h();
    }

    public static int w(byte[] bArr, int i8, a0.j<?> jVar, a aVar) {
        z zVar = (z) jVar;
        int I = I(bArr, i8, aVar);
        int i9 = aVar.f3623a + I;
        while (I < i9) {
            I = I(bArr, I, aVar);
            zVar.j(j.b(aVar.f3623a));
        }
        if (I == i9) {
            return I;
        }
        throw b0.h();
    }

    public static int x(byte[] bArr, int i8, a0.j<?> jVar, a aVar) {
        i0 i0Var = (i0) jVar;
        int I = I(bArr, i8, aVar);
        int i9 = aVar.f3623a + I;
        while (I < i9) {
            I = K(bArr, I, aVar);
            i0Var.j(j.c(aVar.f3624b));
        }
        if (I == i9) {
            return I;
        }
        throw b0.h();
    }

    public static int y(byte[] bArr, int i8, a0.j<?> jVar, a aVar) {
        z zVar = (z) jVar;
        int I = I(bArr, i8, aVar);
        int i9 = aVar.f3623a + I;
        while (I < i9) {
            I = I(bArr, I, aVar);
            zVar.j(aVar.f3623a);
        }
        if (I == i9) {
            return I;
        }
        throw b0.h();
    }

    public static int z(byte[] bArr, int i8, a0.j<?> jVar, a aVar) {
        i0 i0Var = (i0) jVar;
        int I = I(bArr, i8, aVar);
        int i9 = aVar.f3623a + I;
        while (I < i9) {
            I = K(bArr, I, aVar);
            i0Var.j(aVar.f3624b);
        }
        if (I == i9) {
            return I;
        }
        throw b0.h();
    }
}
