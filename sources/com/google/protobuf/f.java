package com.google.protobuf;

import com.google.protobuf.b0;
import com.google.protobuf.i;
import java.nio.ByteBuffer;
import java.util.List;

public abstract class f implements e1 {

    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f3629a = true;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f3630b;

        /* renamed from: c  reason: collision with root package name */
        public int f3631c;

        /* renamed from: d  reason: collision with root package name */
        public int f3632d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f3633f;

        public a(ByteBuffer byteBuffer) {
            this.f3630b = byteBuffer.array();
            this.f3631c = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f3632d = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        public final <T> T A(f1<T> f1Var, q qVar) {
            d0(3);
            return S(f1Var, qVar);
        }

        public final i B() {
            i iVar;
            d0(2);
            int Y = Y();
            if (Y == 0) {
                return i.f3648g;
            }
            b0(Y);
            boolean z8 = this.f3629a;
            byte[] bArr = this.f3630b;
            if (z8) {
                int i8 = this.f3631c;
                i.f fVar = i.f3648g;
                iVar = new i.c(bArr, i8, Y);
            } else {
                iVar = i.k(bArr, this.f3631c, Y);
            }
            this.f3631c += Y;
            return iVar;
        }

        public final void C(List<Float> list) {
            int i8;
            int i9;
            if (list instanceof w) {
                w wVar = (w) list;
                int i10 = this.e & 7;
                if (i10 == 2) {
                    int Y = Y();
                    f0(Y);
                    int i11 = this.f3631c + Y;
                    while (this.f3631c < i11) {
                        wVar.j(Float.intBitsToFloat(T()));
                    }
                } else if (i10 == 5) {
                    do {
                        wVar.j(readFloat());
                        if (!Q()) {
                            i9 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i9;
                } else {
                    throw b0.d();
                }
            } else {
                int i12 = this.e & 7;
                if (i12 == 2) {
                    int Y2 = Y();
                    f0(Y2);
                    int i13 = this.f3631c + Y2;
                    while (this.f3631c < i13) {
                        list.add(Float.valueOf(Float.intBitsToFloat(T())));
                    }
                } else if (i12 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (!Q()) {
                            i8 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i8;
                } else {
                    throw b0.d();
                }
            }
        }

        public final int D() {
            d0(0);
            return Y();
        }

        public final int E() {
            d0(0);
            return Y();
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0031 A[LOOP:0: B:18:0x0031->B:21:0x003e, LOOP_START] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean F() {
            /*
                r7 = this;
                boolean r0 = r7.Q()
                r1 = 0
                if (r0 != 0) goto L_0x0092
                int r0 = r7.e
                int r2 = r7.f3633f
                if (r0 != r2) goto L_0x000f
                goto L_0x0092
            L_0x000f:
                r3 = r0 & 7
                r4 = 1
                if (r3 == 0) goto L_0x0059
                if (r3 == r4) goto L_0x0053
                r1 = 2
                if (r3 == r1) goto L_0x004e
                r1 = 4
                r5 = 3
                if (r3 == r5) goto L_0x002c
                r0 = 5
                if (r3 != r0) goto L_0x0024
                r7.e0(r1)
                return r4
            L_0x0024:
                int r7 = com.google.protobuf.b0.f3594g
                com.google.protobuf.b0$a r7 = new com.google.protobuf.b0$a
                r7.<init>()
                throw r7
            L_0x002c:
                int r0 = r0 >>> r5
                int r0 = r0 << r5
                r0 = r0 | r1
                r7.f3633f = r0
            L_0x0031:
                int r0 = r7.t()
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 == r1) goto L_0x0040
                boolean r0 = r7.F()
                if (r0 != 0) goto L_0x0031
            L_0x0040:
                int r0 = r7.e
                int r1 = r7.f3633f
                if (r0 != r1) goto L_0x0049
                r7.f3633f = r2
                return r4
            L_0x0049:
                com.google.protobuf.b0 r7 = com.google.protobuf.b0.g()
                throw r7
            L_0x004e:
                int r0 = r7.Y()
                goto L_0x0055
            L_0x0053:
                r0 = 8
            L_0x0055:
                r7.e0(r0)
                return r4
            L_0x0059:
                int r0 = r7.f3632d
                int r2 = r7.f3631c
                int r0 = r0 - r2
                byte[] r3 = r7.f3630b
                r5 = 10
                if (r0 < r5) goto L_0x0074
                r0 = r1
            L_0x0065:
                if (r0 >= r5) goto L_0x0074
                int r6 = r2 + 1
                byte r2 = r3[r2]
                if (r2 < 0) goto L_0x0070
                r7.f3631c = r6
                goto L_0x0084
            L_0x0070:
                int r0 = r0 + 1
                r2 = r6
                goto L_0x0065
            L_0x0074:
                if (r1 >= r5) goto L_0x008d
                int r0 = r7.f3631c
                int r2 = r7.f3632d
                if (r0 == r2) goto L_0x0088
                int r2 = r0 + 1
                r7.f3631c = r2
                byte r0 = r3[r0]
                if (r0 < 0) goto L_0x0085
            L_0x0084:
                return r4
            L_0x0085:
                int r1 = r1 + 1
                goto L_0x0074
            L_0x0088:
                com.google.protobuf.b0 r7 = com.google.protobuf.b0.h()
                throw r7
            L_0x008d:
                com.google.protobuf.b0 r7 = com.google.protobuf.b0.e()
                throw r7
            L_0x0092:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.a.F():boolean");
        }

        public final int G() {
            d0(5);
            b0(4);
            return T();
        }

        public final void H(List<i> list) {
            int i8;
            if ((this.e & 7) == 2) {
                do {
                    list.add(B());
                    if (!Q()) {
                        i8 = this.f3631c;
                    } else {
                        return;
                    }
                } while (Y() == this.e);
                this.f3631c = i8;
                return;
            }
            throw b0.d();
        }

        public final void I(List<Double> list) {
            int i8;
            int i9;
            if (list instanceof n) {
                n nVar = (n) list;
                int i10 = this.e & 7;
                if (i10 == 1) {
                    do {
                        nVar.j(readDouble());
                        if (!Q()) {
                            i9 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i9;
                } else if (i10 == 2) {
                    int Y = Y();
                    g0(Y);
                    int i11 = this.f3631c + Y;
                    while (this.f3631c < i11) {
                        nVar.j(Double.longBitsToDouble(U()));
                    }
                } else {
                    throw b0.d();
                }
            } else {
                int i12 = this.e & 7;
                if (i12 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (!Q()) {
                            i8 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i8;
                } else if (i12 == 2) {
                    int Y2 = Y();
                    g0(Y2);
                    int i13 = this.f3631c + Y2;
                    while (this.f3631c < i13) {
                        list.add(Double.valueOf(Double.longBitsToDouble(U())));
                    }
                } else {
                    throw b0.d();
                }
            }
        }

        public final void J(List<Long> list) {
            int i8;
            int i9;
            int i10;
            if (list instanceof i0) {
                i0 i0Var = (i0) list;
                int i11 = this.e & 7;
                if (i11 == 0) {
                    do {
                        i0Var.j(L());
                        if (!Q()) {
                            i10 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i10;
                    return;
                } else if (i11 == 2) {
                    i8 = this.f3631c + Y();
                    while (this.f3631c < i8) {
                        i0Var.j(Z());
                    }
                } else {
                    throw b0.d();
                }
            } else {
                int i12 = this.e & 7;
                if (i12 == 0) {
                    do {
                        list.add(Long.valueOf(L()));
                        if (!Q()) {
                            i9 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i9;
                    return;
                } else if (i12 == 2) {
                    i8 = this.f3631c + Y();
                    while (this.f3631c < i8) {
                        list.add(Long.valueOf(Z()));
                    }
                } else {
                    throw b0.d();
                }
            }
            c0(i8);
        }

        public final void K(List<Long> list) {
            int i8;
            int i9;
            if (list instanceof i0) {
                i0 i0Var = (i0) list;
                int i10 = this.e & 7;
                if (i10 == 1) {
                    do {
                        i0Var.j(v());
                        if (!Q()) {
                            i9 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i9;
                } else if (i10 == 2) {
                    int Y = Y();
                    g0(Y);
                    int i11 = this.f3631c + Y;
                    while (this.f3631c < i11) {
                        i0Var.j(U());
                    }
                } else {
                    throw b0.d();
                }
            } else {
                int i12 = this.e & 7;
                if (i12 == 1) {
                    do {
                        list.add(Long.valueOf(v()));
                        if (!Q()) {
                            i8 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i8;
                } else if (i12 == 2) {
                    int Y2 = Y();
                    g0(Y2);
                    int i13 = this.f3631c + Y2;
                    while (this.f3631c < i13) {
                        list.add(Long.valueOf(U()));
                    }
                } else {
                    throw b0.d();
                }
            }
        }

        public final long L() {
            d0(0);
            return Z();
        }

        public final String M() {
            return W(true);
        }

        public final void N(List<Long> list) {
            int i8;
            int i9;
            if (list instanceof i0) {
                i0 i0Var = (i0) list;
                int i10 = this.e & 7;
                if (i10 == 1) {
                    do {
                        i0Var.j(f());
                        if (!Q()) {
                            i9 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i9;
                } else if (i10 == 2) {
                    int Y = Y();
                    g0(Y);
                    int i11 = this.f3631c + Y;
                    while (this.f3631c < i11) {
                        i0Var.j(U());
                    }
                } else {
                    throw b0.d();
                }
            } else {
                int i12 = this.e & 7;
                if (i12 == 1) {
                    do {
                        list.add(Long.valueOf(f()));
                        if (!Q()) {
                            i8 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i8;
                } else if (i12 == 2) {
                    int Y2 = Y();
                    g0(Y2);
                    int i13 = this.f3631c + Y2;
                    while (this.f3631c < i13) {
                        list.add(Long.valueOf(U()));
                    }
                } else {
                    throw b0.d();
                }
            }
        }

        public final void O(List<Integer> list) {
            int i8;
            int i9;
            int i10;
            if (list instanceof z) {
                z zVar = (z) list;
                int i11 = this.e & 7;
                if (i11 == 0) {
                    do {
                        zVar.j(E());
                        if (!Q()) {
                            i10 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i10;
                    return;
                } else if (i11 == 2) {
                    i8 = this.f3631c + Y();
                    while (this.f3631c < i8) {
                        zVar.j(Y());
                    }
                } else {
                    throw b0.d();
                }
            } else {
                int i12 = this.e & 7;
                if (i12 == 0) {
                    do {
                        list.add(Integer.valueOf(E()));
                        if (!Q()) {
                            i9 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i9;
                    return;
                } else if (i12 == 2) {
                    i8 = this.f3631c + Y();
                    while (this.f3631c < i8) {
                        list.add(Integer.valueOf(Y()));
                    }
                } else {
                    throw b0.d();
                }
            }
            c0(i8);
        }

        public final void P(List<Integer> list) {
            int i8;
            int i9;
            if (list instanceof z) {
                z zVar = (z) list;
                int i10 = this.e & 7;
                if (i10 == 0) {
                    do {
                        zVar.j(c());
                        if (!Q()) {
                            i9 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i9;
                } else if (i10 == 2) {
                    int Y = this.f3631c + Y();
                    while (this.f3631c < Y) {
                        zVar.j(Y());
                    }
                } else {
                    throw b0.d();
                }
            } else {
                int i11 = this.e & 7;
                if (i11 == 0) {
                    do {
                        list.add(Integer.valueOf(c()));
                        if (!Q()) {
                            i8 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i8;
                } else if (i11 == 2) {
                    int Y2 = this.f3631c + Y();
                    while (this.f3631c < Y2) {
                        list.add(Integer.valueOf(Y()));
                    }
                } else {
                    throw b0.d();
                }
            }
        }

        public final boolean Q() {
            return this.f3631c == this.f3632d;
        }

        public final Object R(s1 s1Var, Class<?> cls, q qVar) {
            switch (s1Var.ordinal()) {
                case 0:
                    return Double.valueOf(readDouble());
                case 1:
                    return Float.valueOf(readFloat());
                case 2:
                    return Long.valueOf(L());
                case 3:
                    return Long.valueOf(d());
                case 4:
                    return Integer.valueOf(E());
                case 5:
                    return Long.valueOf(f());
                case 6:
                    return Integer.valueOf(p());
                case 7:
                    return Boolean.valueOf(r());
                case 8:
                    return W(true);
                case 10:
                    return m(cls, qVar);
                case 11:
                    return B();
                case 12:
                    return Integer.valueOf(D());
                case 13:
                    return Integer.valueOf(c());
                case 14:
                    return Integer.valueOf(G());
                case 15:
                    return Long.valueOf(v());
                case 16:
                    return Integer.valueOf(h());
                case 17:
                    return Long.valueOf(k());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        public final <T> T S(f1<T> f1Var, q qVar) {
            int i8 = this.f3633f;
            this.f3633f = ((this.e >>> 3) << 3) | 4;
            try {
                T f9 = f1Var.f();
                f1Var.i(f9, this, qVar);
                f1Var.b(f9);
                if (this.e == this.f3633f) {
                    return f9;
                }
                throw b0.g();
            } finally {
                this.f3633f = i8;
            }
        }

        public final int T() {
            int i8 = this.f3631c;
            this.f3631c = i8 + 4;
            byte[] bArr = this.f3630b;
            return ((bArr[i8 + 3] & 255) << 24) | (bArr[i8] & 255) | ((bArr[i8 + 1] & 255) << 8) | ((bArr[i8 + 2] & 255) << 16);
        }

        public final long U() {
            int i8 = this.f3631c;
            this.f3631c = i8 + 8;
            byte[] bArr = this.f3630b;
            return (((long) bArr[i8]) & 255) | ((((long) bArr[i8 + 1]) & 255) << 8) | ((((long) bArr[i8 + 2]) & 255) << 16) | ((((long) bArr[i8 + 3]) & 255) << 24) | ((((long) bArr[i8 + 4]) & 255) << 32) | ((((long) bArr[i8 + 5]) & 255) << 40) | ((((long) bArr[i8 + 6]) & 255) << 48) | ((255 & ((long) bArr[i8 + 7])) << 56);
        }

        public final <T> T V(f1<T> f1Var, q qVar) {
            int Y = Y();
            b0(Y);
            int i8 = this.f3632d;
            int i9 = this.f3631c + Y;
            this.f3632d = i9;
            try {
                T f9 = f1Var.f();
                f1Var.i(f9, this, qVar);
                f1Var.b(f9);
                if (this.f3631c == i9) {
                    return f9;
                }
                throw b0.g();
            } finally {
                this.f3632d = i8;
            }
        }

        public final String W(boolean z8) {
            d0(2);
            int Y = Y();
            if (Y == 0) {
                return "";
            }
            b0(Y);
            byte[] bArr = this.f3630b;
            if (z8) {
                int i8 = this.f3631c;
                if (!r1.d(bArr, i8, i8 + Y)) {
                    throw b0.c();
                }
            }
            String str = new String(bArr, this.f3631c, Y, a0.f3590b);
            this.f3631c += Y;
            return str;
        }

        public final void X(List<String> list, boolean z8) {
            int i8;
            int i9;
            if ((this.e & 7) != 2) {
                throw b0.d();
            } else if (!(list instanceof g0) || z8) {
                do {
                    list.add(W(z8));
                    if (!Q()) {
                        i8 = this.f3631c;
                    } else {
                        return;
                    }
                } while (Y() == this.e);
                this.f3631c = i8;
            } else {
                g0 g0Var = (g0) list;
                do {
                    g0Var.h(B());
                    if (!Q()) {
                        i9 = this.f3631c;
                    } else {
                        return;
                    }
                } while (Y() == this.e);
                this.f3631c = i9;
            }
        }

        public final int Y() {
            byte b9;
            int i8 = this.f3631c;
            int i9 = this.f3632d;
            if (i9 != i8) {
                int i10 = i8 + 1;
                byte[] bArr = this.f3630b;
                byte b10 = bArr[i8];
                if (b10 >= 0) {
                    this.f3631c = i10;
                    return b10;
                } else if (i9 - i10 < 9) {
                    return (int) a0();
                } else {
                    int i11 = i10 + 1;
                    byte b11 = b10 ^ (bArr[i10] << 7);
                    if (b11 < 0) {
                        b9 = b11 ^ Byte.MIN_VALUE;
                    } else {
                        int i12 = i11 + 1;
                        byte b12 = b11 ^ (bArr[i11] << 14);
                        if (b12 >= 0) {
                            b9 = b12 ^ 16256;
                        } else {
                            i11 = i12 + 1;
                            byte b13 = b12 ^ (bArr[i12] << 21);
                            if (b13 < 0) {
                                b9 = b13 ^ -2080896;
                            } else {
                                i12 = i11 + 1;
                                byte b14 = bArr[i11];
                                b9 = (b13 ^ (b14 << 28)) ^ 266354560;
                                if (b14 < 0) {
                                    i11 = i12 + 1;
                                    if (bArr[i12] < 0) {
                                        i12 = i11 + 1;
                                        if (bArr[i11] < 0) {
                                            i11 = i12 + 1;
                                            if (bArr[i12] < 0) {
                                                i12 = i11 + 1;
                                                if (bArr[i11] < 0) {
                                                    i11 = i12 + 1;
                                                    if (bArr[i12] < 0) {
                                                        throw b0.e();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i11 = i12;
                    }
                    this.f3631c = i11;
                    return b9;
                }
            } else {
                throw b0.h();
            }
        }

        public final long Z() {
            long j8;
            long j9;
            long j10;
            byte b9;
            int i8 = this.f3631c;
            int i9 = this.f3632d;
            if (i9 != i8) {
                int i10 = i8 + 1;
                byte[] bArr = this.f3630b;
                byte b10 = bArr[i8];
                if (b10 >= 0) {
                    this.f3631c = i10;
                    return (long) b10;
                } else if (i9 - i10 < 9) {
                    return a0();
                } else {
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
                                                    } else {
                                                        throw b0.e();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j8 = j10 ^ j13;
                                    i11 = i14;
                                }
                                this.f3631c = i11;
                                return j8;
                            }
                        }
                        i11 = i12;
                        j8 = j9;
                        this.f3631c = i11;
                        return j8;
                    }
                    j8 = (long) b9;
                    this.f3631c = i11;
                    return j8;
                }
            } else {
                throw b0.h();
            }
        }

        public final int a() {
            return this.e;
        }

        public final long a0() {
            long j8 = 0;
            int i8 = 0;
            while (i8 < 64) {
                int i9 = this.f3631c;
                if (i9 != this.f3632d) {
                    this.f3631c = i9 + 1;
                    byte b9 = this.f3630b[i9];
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

        public final void b(List<Integer> list) {
            int i8;
            int i9;
            if (list instanceof z) {
                z zVar = (z) list;
                int i10 = this.e & 7;
                if (i10 == 0) {
                    do {
                        zVar.j(h());
                        if (!Q()) {
                            i9 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i9;
                } else if (i10 == 2) {
                    int Y = this.f3631c + Y();
                    while (this.f3631c < Y) {
                        zVar.j(j.b(Y()));
                    }
                } else {
                    throw b0.d();
                }
            } else {
                int i11 = this.e & 7;
                if (i11 == 0) {
                    do {
                        list.add(Integer.valueOf(h()));
                        if (!Q()) {
                            i8 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i8;
                } else if (i11 == 2) {
                    int Y2 = this.f3631c + Y();
                    while (this.f3631c < Y2) {
                        list.add(Integer.valueOf(j.b(Y())));
                    }
                } else {
                    throw b0.d();
                }
            }
        }

        public final void b0(int i8) {
            if (i8 < 0 || i8 > this.f3632d - this.f3631c) {
                throw b0.h();
            }
        }

        public final int c() {
            d0(0);
            return Y();
        }

        public final void c0(int i8) {
            if (this.f3631c != i8) {
                throw b0.h();
            }
        }

        public final long d() {
            d0(0);
            return Z();
        }

        public final void d0(int i8) {
            if ((this.e & 7) != i8) {
                throw b0.d();
            }
        }

        public final void e(List<Integer> list) {
            int i8;
            int i9;
            if (list instanceof z) {
                z zVar = (z) list;
                int i10 = this.e & 7;
                if (i10 == 2) {
                    int Y = Y();
                    f0(Y);
                    int i11 = this.f3631c + Y;
                    while (this.f3631c < i11) {
                        zVar.j(T());
                    }
                } else if (i10 == 5) {
                    do {
                        zVar.j(p());
                        if (!Q()) {
                            i9 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i9;
                } else {
                    throw b0.d();
                }
            } else {
                int i12 = this.e & 7;
                if (i12 == 2) {
                    int Y2 = Y();
                    f0(Y2);
                    int i13 = this.f3631c + Y2;
                    while (this.f3631c < i13) {
                        list.add(Integer.valueOf(T()));
                    }
                } else if (i12 == 5) {
                    do {
                        list.add(Integer.valueOf(p()));
                        if (!Q()) {
                            i8 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i8;
                } else {
                    throw b0.d();
                }
            }
        }

        public final void e0(int i8) {
            b0(i8);
            this.f3631c += i8;
        }

        public final long f() {
            d0(1);
            b0(8);
            return U();
        }

        public final void f0(int i8) {
            b0(i8);
            if ((i8 & 3) != 0) {
                throw b0.g();
            }
        }

        public final void g(List<Integer> list) {
            int i8;
            int i9;
            if (list instanceof z) {
                z zVar = (z) list;
                int i10 = this.e & 7;
                if (i10 == 2) {
                    int Y = Y();
                    f0(Y);
                    int i11 = this.f3631c + Y;
                    while (this.f3631c < i11) {
                        zVar.j(T());
                    }
                } else if (i10 == 5) {
                    do {
                        zVar.j(G());
                        if (!Q()) {
                            i9 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i9;
                } else {
                    throw b0.d();
                }
            } else {
                int i12 = this.e & 7;
                if (i12 == 2) {
                    int Y2 = Y();
                    f0(Y2);
                    int i13 = this.f3631c + Y2;
                    while (this.f3631c < i13) {
                        list.add(Integer.valueOf(T()));
                    }
                } else if (i12 == 5) {
                    do {
                        list.add(Integer.valueOf(G()));
                        if (!Q()) {
                            i8 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i8;
                } else {
                    throw b0.d();
                }
            }
        }

        public final void g0(int i8) {
            b0(i8);
            if ((i8 & 7) != 0) {
                throw b0.g();
            }
        }

        public final int h() {
            d0(0);
            return j.b(Y());
        }

        public final void i(List<Long> list) {
            int i8;
            int i9;
            if (list instanceof i0) {
                i0 i0Var = (i0) list;
                int i10 = this.e & 7;
                if (i10 == 0) {
                    do {
                        i0Var.j(k());
                        if (!Q()) {
                            i9 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i9;
                } else if (i10 == 2) {
                    int Y = this.f3631c + Y();
                    while (this.f3631c < Y) {
                        i0Var.j(j.c(Z()));
                    }
                } else {
                    throw b0.d();
                }
            } else {
                int i11 = this.e & 7;
                if (i11 == 0) {
                    do {
                        list.add(Long.valueOf(k()));
                        if (!Q()) {
                            i8 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i8;
                } else if (i11 == 2) {
                    int Y2 = this.f3631c + Y();
                    while (this.f3631c < Y2) {
                        list.add(Long.valueOf(j.c(Z())));
                    }
                } else {
                    throw b0.d();
                }
            }
        }

        public final <T> void j(List<T> list, f1<T> f1Var, q qVar) {
            int i8;
            int i9 = this.e;
            if ((i9 & 7) == 3) {
                do {
                    list.add(S(f1Var, qVar));
                    if (!Q()) {
                        i8 = this.f3631c;
                    } else {
                        return;
                    }
                } while (Y() == i9);
                this.f3631c = i8;
                return;
            }
            int i10 = b0.f3594g;
            throw new b0.a();
        }

        public final long k() {
            d0(0);
            return j.c(Z());
        }

        public final void l(List<Integer> list) {
            int i8;
            int i9;
            if (list instanceof z) {
                z zVar = (z) list;
                int i10 = this.e & 7;
                if (i10 == 0) {
                    do {
                        zVar.j(D());
                        if (!Q()) {
                            i9 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i9;
                } else if (i10 == 2) {
                    int Y = this.f3631c + Y();
                    while (this.f3631c < Y) {
                        zVar.j(Y());
                    }
                } else {
                    throw b0.d();
                }
            } else {
                int i11 = this.e & 7;
                if (i11 == 0) {
                    do {
                        list.add(Integer.valueOf(D()));
                        if (!Q()) {
                            i8 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i8;
                } else if (i11 == 2) {
                    int Y2 = this.f3631c + Y();
                    while (this.f3631c < Y2) {
                        list.add(Integer.valueOf(Y()));
                    }
                } else {
                    throw b0.d();
                }
            }
        }

        public final <T> T m(Class<T> cls, q qVar) {
            d0(2);
            return V(b1.f3596c.a(cls), qVar);
        }

        public final void n(List<Boolean> list) {
            int i8;
            int i9;
            int i10;
            if (list instanceof g) {
                g gVar = (g) list;
                int i11 = this.e & 7;
                if (i11 == 0) {
                    do {
                        gVar.j(r());
                        if (!Q()) {
                            i10 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i10;
                    return;
                } else if (i11 == 2) {
                    i8 = this.f3631c + Y();
                    while (this.f3631c < i8) {
                        gVar.j(Y() != 0);
                    }
                } else {
                    throw b0.d();
                }
            } else {
                int i12 = this.e & 7;
                if (i12 == 0) {
                    do {
                        list.add(Boolean.valueOf(r()));
                        if (!Q()) {
                            i9 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i9;
                    return;
                } else if (i12 == 2) {
                    i8 = this.f3631c + Y();
                    while (this.f3631c < i8) {
                        list.add(Boolean.valueOf(Y() != 0));
                    }
                } else {
                    throw b0.d();
                }
            }
            c0(i8);
        }

        public final String o() {
            return W(false);
        }

        public final int p() {
            d0(5);
            b0(4);
            return T();
        }

        public final <T> T q(Class<T> cls, q qVar) {
            d0(3);
            return S(b1.f3596c.a(cls), qVar);
        }

        public final boolean r() {
            d0(0);
            return Y() != 0;
        }

        public final double readDouble() {
            d0(1);
            b0(8);
            return Double.longBitsToDouble(U());
        }

        public final float readFloat() {
            d0(5);
            b0(4);
            return Float.intBitsToFloat(T());
        }

        public final <T> void s(List<T> list, f1<T> f1Var, q qVar) {
            int i8;
            int i9 = this.e;
            if ((i9 & 7) == 2) {
                do {
                    list.add(V(f1Var, qVar));
                    if (!Q()) {
                        i8 = this.f3631c;
                    } else {
                        return;
                    }
                } while (Y() == i9);
                this.f3631c = i8;
                return;
            }
            int i10 = b0.f3594g;
            throw new b0.a();
        }

        public final int t() {
            if (Q()) {
                return Integer.MAX_VALUE;
            }
            int Y = Y();
            this.e = Y;
            if (Y == this.f3633f) {
                return Integer.MAX_VALUE;
            }
            return Y >>> 3;
        }

        public final void u(List<String> list) {
            X(list, false);
        }

        public final long v() {
            d0(1);
            b0(8);
            return U();
        }

        public final <T> T w(f1<T> f1Var, q qVar) {
            d0(2);
            return V(f1Var, qVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
            if (F() != false) goto L_0x0053;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
            throw new com.google.protobuf.b0("Unable to parse map entry.");
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <K, V> void x(java.util.Map<K, V> r9, com.google.protobuf.k0.a<K, V> r10, com.google.protobuf.q r11) {
            /*
                r8 = this;
                r0 = 2
                r8.d0(r0)
                int r1 = r8.Y()
                r8.b0(r1)
                int r2 = r8.f3632d
                int r3 = r8.f3631c
                int r3 = r3 + r1
                r8.f3632d = r3
                K r1 = r10.f3709b     // Catch:{ all -> 0x005a }
                V r3 = r10.f3711d
                r4 = r3
            L_0x0017:
                int r5 = r8.t()     // Catch:{ all -> 0x005a }
                r6 = 2147483647(0x7fffffff, float:NaN)
                if (r5 != r6) goto L_0x0026
                r9.put(r1, r4)     // Catch:{ all -> 0x005a }
                r8.f3632d = r2
                return
            L_0x0026:
                r6 = 1
                java.lang.String r7 = "Unable to parse map entry."
                if (r5 == r6) goto L_0x0045
                if (r5 == r0) goto L_0x003a
                boolean r5 = r8.F()     // Catch:{ a -> 0x004d }
                if (r5 == 0) goto L_0x0034
                goto L_0x0017
            L_0x0034:
                com.google.protobuf.b0 r5 = new com.google.protobuf.b0     // Catch:{ a -> 0x004d }
                r5.<init>((java.lang.String) r7)     // Catch:{ a -> 0x004d }
                throw r5     // Catch:{ a -> 0x004d }
            L_0x003a:
                com.google.protobuf.s1 r5 = r10.f3710c     // Catch:{ a -> 0x004d }
                java.lang.Class r6 = r3.getClass()     // Catch:{ a -> 0x004d }
                java.lang.Object r4 = r8.R(r5, r6, r11)     // Catch:{ a -> 0x004d }
                goto L_0x0017
            L_0x0045:
                com.google.protobuf.s1 r5 = r10.f3708a     // Catch:{ a -> 0x004d }
                r6 = 0
                java.lang.Object r1 = r8.R(r5, r6, r6)     // Catch:{ a -> 0x004d }
                goto L_0x0017
            L_0x004d:
                boolean r5 = r8.F()     // Catch:{ all -> 0x005a }
                if (r5 == 0) goto L_0x0054
                goto L_0x0017
            L_0x0054:
                com.google.protobuf.b0 r9 = new com.google.protobuf.b0     // Catch:{ all -> 0x005a }
                r9.<init>((java.lang.String) r7)     // Catch:{ all -> 0x005a }
                throw r9     // Catch:{ all -> 0x005a }
            L_0x005a:
                r9 = move-exception
                r8.f3632d = r2
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.a.x(java.util.Map, com.google.protobuf.k0$a, com.google.protobuf.q):void");
        }

        public final void y(List<Long> list) {
            int i8;
            int i9;
            int i10;
            if (list instanceof i0) {
                i0 i0Var = (i0) list;
                int i11 = this.e & 7;
                if (i11 == 0) {
                    do {
                        i0Var.j(d());
                        if (!Q()) {
                            i10 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i10;
                    return;
                } else if (i11 == 2) {
                    i8 = this.f3631c + Y();
                    while (this.f3631c < i8) {
                        i0Var.j(Z());
                    }
                } else {
                    throw b0.d();
                }
            } else {
                int i12 = this.e & 7;
                if (i12 == 0) {
                    do {
                        list.add(Long.valueOf(d()));
                        if (!Q()) {
                            i9 = this.f3631c;
                        } else {
                            return;
                        }
                    } while (Y() == this.e);
                    this.f3631c = i9;
                    return;
                } else if (i12 == 2) {
                    i8 = this.f3631c + Y();
                    while (this.f3631c < i8) {
                        list.add(Long.valueOf(Z()));
                    }
                } else {
                    throw b0.d();
                }
            }
            c0(i8);
        }

        public final void z(List<String> list) {
            X(list, true);
        }
    }
}
