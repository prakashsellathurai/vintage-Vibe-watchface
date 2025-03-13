package j2;

import g8.a;
import g8.b;
import g8.i;
import g8.n;
import j2.b;
import java.io.EOFException;

public final class c extends b {

    /* renamed from: q  reason: collision with root package name */
    public static final g8.c f4973q = g8.c.e("'\\");
    public static final g8.c r = g8.c.e("\"\\");

    /* renamed from: s  reason: collision with root package name */
    public static final g8.c f4974s = g8.c.e("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: k  reason: collision with root package name */
    public final b f4975k;

    /* renamed from: l  reason: collision with root package name */
    public final a f4976l;

    /* renamed from: m  reason: collision with root package name */
    public int f4977m = 0;

    /* renamed from: n  reason: collision with root package name */
    public long f4978n;

    /* renamed from: o  reason: collision with root package name */
    public int f4979o;

    /* renamed from: p  reason: collision with root package name */
    public String f4980p;

    static {
        g8.c.e("\n\r");
        g8.c.e("*/");
    }

    public c(i iVar) {
        this.f4975k = iVar;
        this.f4976l = iVar.f4700f;
        u(6);
    }

    public final void A() {
        z("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0193, code lost:
        if (F(r1) != false) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0195, code lost:
        if (r4 != 2) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0197, code lost:
        if (r6 == false) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x019d, code lost:
        if (r10 != Long.MIN_VALUE) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x019f, code lost:
        if (r7 == false) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01a5, code lost:
        if (r10 != 0) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01a7, code lost:
        if (r7 != false) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01a9, code lost:
        if (r7 == false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01ac, code lost:
        r10 = -r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01ad, code lost:
        r0.f4978n = r10;
        r5.o((long) r3);
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01b6, code lost:
        if (r4 == 2) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01b9, code lost:
        if (r4 == 4) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01bc, code lost:
        if (r4 != 7) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01be, code lost:
        r0.f4979o = r3;
        r1 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01c2, code lost:
        r8 = r1;
        r0.f4977m = r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0110 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int B() {
        /*
            r17 = this;
            r0 = r17
            int[] r1 = r0.f4968g
            int r2 = r0.f4967f
            int r3 = r2 + -1
            r3 = r1[r3]
            r6 = 0
            r7 = 93
            r9 = 59
            r10 = 44
            r11 = 3
            r12 = 6
            r13 = 7
            r14 = 5
            r15 = 2
            r4 = 4
            g8.a r5 = r0.f4976l
            r8 = 1
            if (r3 != r8) goto L_0x0021
            int r2 = r2 - r8
            r1[r2] = r15
        L_0x001f:
            r1 = 0
            goto L_0x007d
        L_0x0021:
            if (r3 != r15) goto L_0x003d
            int r1 = r0.H(r8)
            r5.d()
            if (r1 == r10) goto L_0x001f
            if (r1 == r9) goto L_0x0039
            if (r1 != r7) goto L_0x0033
            r0.f4977m = r4
            return r4
        L_0x0033:
            java.lang.String r1 = "Unterminated array"
            r0.z(r1)
            throw r6
        L_0x0039:
            r17.A()
            throw r6
        L_0x003d:
            if (r3 == r11) goto L_0x024f
            if (r3 != r14) goto L_0x0043
            goto L_0x024f
        L_0x0043:
            if (r3 != r4) goto L_0x0061
            int r2 = r2 - r8
            r1[r2] = r14
            int r1 = r0.H(r8)
            r5.d()
            r2 = 58
            if (r1 == r2) goto L_0x001f
            r2 = 61
            if (r1 == r2) goto L_0x005d
            java.lang.String r1 = "Expected ':'"
            r0.z(r1)
            throw r6
        L_0x005d:
            r17.A()
            throw r6
        L_0x0061:
            if (r3 != r12) goto L_0x0067
            int r2 = r2 - r8
            r1[r2] = r13
            goto L_0x001f
        L_0x0067:
            r1 = 0
            if (r3 != r13) goto L_0x0079
            int r1 = r0.H(r1)
            r2 = -1
            if (r1 != r2) goto L_0x0075
            r11 = 18
            goto L_0x02a3
        L_0x0075:
            r17.A()
            throw r6
        L_0x0079:
            r2 = 8
            if (r3 == r2) goto L_0x0247
        L_0x007d:
            int r2 = r0.H(r8)
            r1 = 34
            if (r2 == r1) goto L_0x0241
            r1 = 39
            if (r2 == r1) goto L_0x023c
            if (r2 == r10) goto L_0x022a
            if (r2 == r9) goto L_0x022a
            r1 = 91
            if (r2 == r1) goto L_0x0224
            if (r2 == r7) goto L_0x021b
            r1 = 123(0x7b, float:1.72E-43)
            if (r2 == r1) goto L_0x0214
            r1 = 0
            byte r3 = r5.a(r1)
            r7 = 116(0x74, float:1.63E-43)
            g8.b r9 = r0.f4975k
            if (r3 == r7) goto L_0x00c5
            r7 = 84
            if (r3 != r7) goto L_0x00a8
            goto L_0x00c5
        L_0x00a8:
            r7 = 102(0x66, float:1.43E-43)
            if (r3 == r7) goto L_0x00bf
            r7 = 70
            if (r3 != r7) goto L_0x00b1
            goto L_0x00bf
        L_0x00b1:
            r7 = 110(0x6e, float:1.54E-43)
            if (r3 == r7) goto L_0x00b9
            r7 = 78
            if (r3 != r7) goto L_0x0106
        L_0x00b9:
            java.lang.String r3 = "null"
            java.lang.String r7 = "NULL"
            r10 = r13
            goto L_0x00ca
        L_0x00bf:
            java.lang.String r3 = "false"
            java.lang.String r7 = "FALSE"
            r10 = r12
            goto L_0x00ca
        L_0x00c5:
            java.lang.String r3 = "true"
            java.lang.String r7 = "TRUE"
            r10 = r14
        L_0x00ca:
            int r6 = r3.length()
            r13 = r8
        L_0x00cf:
            if (r13 >= r6) goto L_0x00f2
            int r4 = r13 + 1
            long r11 = (long) r4
            boolean r11 = r9.m(r11)
            if (r11 != 0) goto L_0x00db
            goto L_0x0106
        L_0x00db:
            long r11 = (long) r13
            byte r11 = r5.a(r11)
            char r12 = r3.charAt(r13)
            if (r11 == r12) goto L_0x00ed
            char r12 = r7.charAt(r13)
            if (r11 == r12) goto L_0x00ed
            goto L_0x0106
        L_0x00ed:
            r13 = r4
            r4 = 4
            r11 = 3
            r12 = 6
            goto L_0x00cf
        L_0x00f2:
            int r3 = r6 + 1
            long r3 = (long) r3
            boolean r3 = r9.m(r3)
            if (r3 == 0) goto L_0x0108
            long r3 = (long) r6
            byte r3 = r5.a(r3)
            boolean r3 = r0.F(r3)
            if (r3 == 0) goto L_0x0108
        L_0x0106:
            r10 = 0
            goto L_0x010e
        L_0x0108:
            long r3 = (long) r6
            r5.o(r3)
            r0.f4977m = r10
        L_0x010e:
            if (r10 == 0) goto L_0x0111
            return r10
        L_0x0111:
            r10 = r1
            r6 = r8
            r3 = 0
            r4 = 0
            r7 = 0
        L_0x0116:
            int r12 = r3 + 1
            long r1 = (long) r12
            boolean r1 = r9.m(r1)
            if (r1 != 0) goto L_0x0121
            goto L_0x0195
        L_0x0121:
            long r1 = (long) r3
            byte r1 = r5.a(r1)
            r2 = 43
            if (r1 == r2) goto L_0x01e8
            r2 = 69
            if (r1 == r2) goto L_0x01dc
            r2 = 101(0x65, float:1.42E-43)
            if (r1 == r2) goto L_0x01dc
            r2 = 45
            if (r1 == r2) goto L_0x01cf
            r2 = 46
            if (r1 == r2) goto L_0x01c6
            r2 = 48
            if (r1 < r2) goto L_0x018f
            r2 = 57
            if (r1 <= r2) goto L_0x0143
            goto L_0x018f
        L_0x0143:
            if (r4 == r8) goto L_0x0182
            if (r4 != 0) goto L_0x0148
            goto L_0x0182
        L_0x0148:
            if (r4 != r15) goto L_0x0173
            r2 = 0
            int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x0152
            goto L_0x01f8
        L_0x0152:
            r2 = 10
            long r2 = r2 * r10
            int r1 = r1 + -48
            r16 = r9
            long r8 = (long) r1
            long r2 = r2 - r8
            r8 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x016d
            if (r1 != 0) goto L_0x016b
            int r1 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x016b
            goto L_0x016d
        L_0x016b:
            r1 = 0
            goto L_0x016e
        L_0x016d:
            r1 = 1
        L_0x016e:
            r1 = r1 & r6
            r6 = r1
            r10 = r2
            r2 = 3
            goto L_0x0179
        L_0x0173:
            r16 = r9
            r2 = 3
            if (r4 != r2) goto L_0x017b
            r4 = 4
        L_0x0179:
            r8 = 6
            goto L_0x018c
        L_0x017b:
            r8 = 6
            if (r4 == r14) goto L_0x0180
            if (r4 != r8) goto L_0x018c
        L_0x0180:
            r4 = 7
            goto L_0x018c
        L_0x0182:
            r16 = r9
            r2 = 3
            r8 = 6
            int r1 = r1 + -48
            int r1 = -r1
            long r3 = (long) r1
            r10 = r3
            r4 = r15
        L_0x018c:
            r1 = 7
            goto L_0x01f0
        L_0x018f:
            boolean r1 = r0.F(r1)
            if (r1 != 0) goto L_0x01f8
        L_0x0195:
            if (r4 != r15) goto L_0x01b6
            if (r6 == 0) goto L_0x01b6
            r1 = -9223372036854775808
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x01a1
            if (r7 == 0) goto L_0x01b6
        L_0x01a1:
            r1 = 0
            int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x01a9
            if (r7 != 0) goto L_0x01b6
        L_0x01a9:
            if (r7 == 0) goto L_0x01ac
            goto L_0x01ad
        L_0x01ac:
            long r10 = -r10
        L_0x01ad:
            r0.f4978n = r10
            long r1 = (long) r3
            r5.o(r1)
            r1 = 16
            goto L_0x01c2
        L_0x01b6:
            if (r4 == r15) goto L_0x01be
            r1 = 4
            if (r4 == r1) goto L_0x01be
            r1 = 7
            if (r4 != r1) goto L_0x01f8
        L_0x01be:
            r0.f4979o = r3
            r1 = 17
        L_0x01c2:
            r8 = r1
            r0.f4977m = r8
            goto L_0x01f9
        L_0x01c6:
            r16 = r9
            r1 = 7
            r2 = 3
            r8 = 6
            if (r4 != r15) goto L_0x01f8
            r4 = r2
            goto L_0x01f0
        L_0x01cf:
            r16 = r9
            r1 = 7
            r2 = 3
            r8 = 6
            if (r4 != 0) goto L_0x01d9
            r4 = 1
            r7 = 1
            goto L_0x01f0
        L_0x01d9:
            if (r4 != r14) goto L_0x01f8
            goto L_0x01ef
        L_0x01dc:
            r16 = r9
            r1 = 7
            r2 = 3
            r8 = 6
            if (r4 == r15) goto L_0x01e6
            r3 = 4
            if (r4 != r3) goto L_0x01f8
        L_0x01e6:
            r4 = r14
            goto L_0x01f0
        L_0x01e8:
            r16 = r9
            r1 = 7
            r2 = 3
            r8 = 6
            if (r4 != r14) goto L_0x01f8
        L_0x01ef:
            r4 = r8
        L_0x01f0:
            r3 = r12
            r9 = r16
            r1 = 0
            r8 = 1
            goto L_0x0116
        L_0x01f8:
            r8 = 0
        L_0x01f9:
            if (r8 == 0) goto L_0x01fc
            return r8
        L_0x01fc:
            r1 = 0
            byte r1 = r5.a(r1)
            boolean r1 = r0.F(r1)
            if (r1 != 0) goto L_0x020f
            java.lang.String r1 = "Expected value"
            r0.z(r1)
            r1 = 0
            throw r1
        L_0x020f:
            r1 = 0
            r17.A()
            throw r1
        L_0x0214:
            r5.d()
            r1 = 1
            r0.f4977m = r1
            return r1
        L_0x021b:
            r1 = r8
            if (r3 != r1) goto L_0x022b
            r5.d()
            r11 = 4
            goto L_0x02a3
        L_0x0224:
            r2 = r11
            r5.d()
            goto L_0x02a3
        L_0x022a:
            r1 = r8
        L_0x022b:
            if (r3 == r1) goto L_0x0237
            if (r3 != r15) goto L_0x0230
            goto L_0x0237
        L_0x0230:
            java.lang.String r1 = "Unexpected value"
            r0.z(r1)
            r1 = 0
            throw r1
        L_0x0237:
            r1 = 0
            r17.A()
            throw r1
        L_0x023c:
            r1 = r6
            r17.A()
            throw r1
        L_0x0241:
            r5.d()
            r11 = 9
            goto L_0x02a3
        L_0x0247:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JsonReader is closed"
            r0.<init>(r1)
            throw r0
        L_0x024f:
            r4 = r8
            int r2 = r2 - r4
            r6 = 4
            r1[r2] = r6
            r1 = 125(0x7d, float:1.75E-43)
            if (r3 != r14) goto L_0x0274
            int r2 = r0.H(r4)
            r5.d()
            if (r2 == r10) goto L_0x0272
            if (r2 == r9) goto L_0x026d
            if (r2 != r1) goto L_0x0266
            goto L_0x0288
        L_0x0266:
            java.lang.String r1 = "Unterminated object"
            r0.z(r1)
            r1 = 0
            throw r1
        L_0x026d:
            r1 = 0
            r17.A()
            throw r1
        L_0x0272:
            r2 = 1
            goto L_0x0275
        L_0x0274:
            r2 = r4
        L_0x0275:
            int r2 = r0.H(r2)
            r4 = 34
            if (r2 == r4) goto L_0x029e
            r4 = 39
            if (r2 == r4) goto L_0x0296
            if (r2 != r1) goto L_0x0291
            if (r3 == r14) goto L_0x028a
            r5.d()
        L_0x0288:
            r11 = r15
            goto L_0x02a3
        L_0x028a:
            java.lang.String r1 = "Expected name"
            r0.z(r1)
            r1 = 0
            throw r1
        L_0x0291:
            r1 = 0
            r17.A()
            throw r1
        L_0x0296:
            r1 = 0
            r5.d()
            r17.A()
            throw r1
        L_0x029e:
            r5.d()
            r11 = 13
        L_0x02a3:
            r0.f4977m = r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.c.B():int");
    }

    public final int D(String str, b.a aVar) {
        int length = aVar.f4971a.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (str.equals(aVar.f4971a[i8])) {
                this.f4977m = 0;
                this.f4969h[this.f4967f - 1] = str;
                return i8;
            }
        }
        return -1;
    }

    public final boolean F(int i8) {
        if (i8 == 9 || i8 == 10 || i8 == 12 || i8 == 13 || i8 == 32) {
            return false;
        }
        if (i8 != 35) {
            if (i8 == 44) {
                return false;
            }
            if (!(i8 == 47 || i8 == 61)) {
                if (i8 == 123 || i8 == 125 || i8 == 58) {
                    return false;
                }
                if (i8 != 59) {
                    switch (i8) {
                        case EXERCISE_TYPE_CROSS_COUNTRY_SKIING_VALUE:
                        case 93:
                            return false;
                        case EXERCISE_TYPE_ALPINE_SKIING_VALUE:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        A();
        throw null;
    }

    public final String G() {
        String str;
        g8.c cVar;
        int i8 = this.f4977m;
        if (i8 == 0) {
            i8 = B();
        }
        if (i8 == 14) {
            str = M();
        } else {
            if (i8 == 13) {
                cVar = r;
            } else if (i8 == 12) {
                cVar = f4973q;
            } else if (i8 == 15) {
                str = this.f4980p;
            } else {
                throw new c1.c("Expected a name but was " + b6.a.p(t()) + " at path " + h());
            }
            str = I(cVar);
        }
        this.f4977m = 0;
        this.f4969h[this.f4967f - 1] = str;
        return str;
    }

    public final int H(boolean z8) {
        int i8 = 0;
        while (true) {
            int i9 = i8 + 1;
            g8.b bVar = this.f4975k;
            if (bVar.m((long) i9)) {
                long j8 = (long) i8;
                a aVar = this.f4976l;
                byte a9 = aVar.a(j8);
                if (a9 == 10 || a9 == 32 || a9 == 13 || a9 == 9) {
                    i8 = i9;
                } else {
                    aVar.o((long) (i9 - 1));
                    if (a9 == 47) {
                        if (!bVar.m(2)) {
                            return a9;
                        }
                        A();
                        throw null;
                    } else if (a9 != 35) {
                        return a9;
                    } else {
                        A();
                        throw null;
                    }
                }
            } else if (!z8) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    public final String I(g8.c cVar) {
        StringBuilder sb = null;
        while (true) {
            long C = this.f4975k.C(cVar);
            if (C != -1) {
                a aVar = this.f4976l;
                if (aVar.a(C) == 92) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(aVar.j(C));
                    aVar.d();
                    sb.append(N());
                } else {
                    String j8 = aVar.j(C);
                    if (sb == null) {
                        aVar.d();
                        return j8;
                    }
                    sb.append(j8);
                    aVar.d();
                    return sb.toString();
                }
            } else {
                z("Unterminated string");
                throw null;
            }
        }
    }

    public final String M() {
        long C = this.f4975k.C(f4974s);
        int i8 = (C > -1 ? 1 : (C == -1 ? 0 : -1));
        a aVar = this.f4976l;
        if (i8 != 0) {
            return aVar.j(C);
        }
        aVar.getClass();
        try {
            return aVar.h(aVar.f4683g, n.f4713a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final char N() {
        int i8;
        int i9;
        g8.b bVar = this.f4975k;
        if (bVar.m(1)) {
            a aVar = this.f4976l;
            byte d9 = aVar.d();
            if (d9 == 10 || d9 == 34 || d9 == 39 || d9 == 47 || d9 == 92) {
                return (char) d9;
            }
            if (d9 == 98) {
                return 8;
            }
            if (d9 == 102) {
                return 12;
            }
            if (d9 == 110) {
                return 10;
            }
            if (d9 == 114) {
                return 13;
            }
            if (d9 == 116) {
                return 9;
            }
            if (d9 != 117) {
                z("Invalid escape sequence: \\" + ((char) d9));
                throw null;
            } else if (bVar.m(4)) {
                char c9 = 0;
                for (int i10 = 0; i10 < 4; i10++) {
                    byte a9 = aVar.a((long) i10);
                    char c10 = (char) (c9 << 4);
                    if (a9 < 48 || a9 > 57) {
                        if (a9 >= 97 && a9 <= 102) {
                            i9 = a9 - 97;
                        } else if (a9 < 65 || a9 > 70) {
                            z("\\u".concat(aVar.j(4)));
                            throw null;
                        } else {
                            i9 = a9 - 65;
                        }
                        i8 = i9 + 10;
                    } else {
                        i8 = a9 - 48;
                    }
                    c9 = (char) (c10 + i8);
                }
                aVar.o(4);
                return c9;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + h());
            }
        } else {
            z("Unterminated escape sequence");
            throw null;
        }
    }

    public final void O(g8.c cVar) {
        while (true) {
            long C = this.f4975k.C(cVar);
            if (C != -1) {
                a aVar = this.f4976l;
                byte a9 = aVar.a(C);
                aVar.o(C + 1);
                if (a9 == 92) {
                    N();
                } else {
                    return;
                }
            } else {
                z("Unterminated string");
                throw null;
            }
        }
    }

    public final void a() {
        int i8 = this.f4977m;
        if (i8 == 0) {
            i8 = B();
        }
        if (i8 == 3) {
            u(1);
            this.f4970i[this.f4967f - 1] = 0;
            this.f4977m = 0;
            return;
        }
        throw new c1.c("Expected BEGIN_ARRAY but was " + b6.a.p(t()) + " at path " + h());
    }

    public final void c() {
        int i8 = this.f4977m;
        if (i8 == 0) {
            i8 = B();
        }
        if (i8 == 1) {
            u(3);
            this.f4977m = 0;
            return;
        }
        throw new c1.c("Expected BEGIN_OBJECT but was " + b6.a.p(t()) + " at path " + h());
    }

    public final void close() {
        this.f4977m = 0;
        this.f4968g[0] = 8;
        this.f4967f = 1;
        a aVar = this.f4976l;
        aVar.getClass();
        try {
            aVar.o(aVar.f4683g);
            this.f4975k.close();
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final void d() {
        int i8 = this.f4977m;
        if (i8 == 0) {
            i8 = B();
        }
        if (i8 == 4) {
            int i9 = this.f4967f - 1;
            this.f4967f = i9;
            int[] iArr = this.f4970i;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
            this.f4977m = 0;
            return;
        }
        throw new c1.c("Expected END_ARRAY but was " + b6.a.p(t()) + " at path " + h());
    }

    public final void g() {
        int i8 = this.f4977m;
        if (i8 == 0) {
            i8 = B();
        }
        if (i8 == 2) {
            int i9 = this.f4967f - 1;
            this.f4967f = i9;
            this.f4969h[i9] = null;
            int[] iArr = this.f4970i;
            int i10 = i9 - 1;
            iArr[i10] = iArr[i10] + 1;
            this.f4977m = 0;
            return;
        }
        throw new c1.c("Expected END_OBJECT but was " + b6.a.p(t()) + " at path " + h());
    }

    public final boolean j() {
        int i8 = this.f4977m;
        if (i8 == 0) {
            i8 = B();
        }
        return (i8 == 2 || i8 == 4 || i8 == 18) ? false : true;
    }

    public final boolean n() {
        int i8 = this.f4977m;
        if (i8 == 0) {
            i8 = B();
        }
        if (i8 == 5) {
            this.f4977m = 0;
            int[] iArr = this.f4970i;
            int i9 = this.f4967f - 1;
            iArr[i9] = iArr[i9] + 1;
            return true;
        } else if (i8 == 6) {
            this.f4977m = 0;
            int[] iArr2 = this.f4970i;
            int i10 = this.f4967f - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return false;
        } else {
            throw new c1.c("Expected a boolean but was " + b6.a.p(t()) + " at path " + h());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double o() {
        /*
            r7 = this;
            int r0 = r7.f4977m
            if (r0 != 0) goto L_0x0008
            int r0 = r7.B()
        L_0x0008:
            r1 = 16
            r2 = 0
            if (r0 != r1) goto L_0x001f
            r7.f4977m = r2
            int[] r0 = r7.f4970i
            int r1 = r7.f4967f
            int r1 = r1 + -1
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            long r0 = r7.f4978n
            double r0 = (double) r0
            return r0
        L_0x001f:
            r1 = 17
            java.lang.String r3 = "Expected a double but was "
            r4 = 11
            java.lang.String r5 = " at path "
            if (r0 != r1) goto L_0x0035
            int r0 = r7.f4979o
            long r0 = (long) r0
            g8.a r6 = r7.f4976l
            java.lang.String r0 = r6.j(r0)
        L_0x0032:
            r7.f4980p = r0
            goto L_0x0052
        L_0x0035:
            r1 = 9
            if (r0 != r1) goto L_0x0040
            g8.c r0 = r
        L_0x003b:
            java.lang.String r0 = r7.I(r0)
            goto L_0x0032
        L_0x0040:
            r1 = 8
            if (r0 != r1) goto L_0x0047
            g8.c r0 = f4973q
            goto L_0x003b
        L_0x0047:
            r1 = 10
            if (r0 != r1) goto L_0x0050
            java.lang.String r0 = r7.M()
            goto L_0x0032
        L_0x0050:
            if (r0 != r4) goto L_0x00b4
        L_0x0052:
            r7.f4977m = r4
            java.lang.String r0 = r7.f4980p     // Catch:{ NumberFormatException -> 0x0096 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0096 }
            boolean r3 = java.lang.Double.isNaN(r0)
            if (r3 != 0) goto L_0x0078
            boolean r3 = java.lang.Double.isInfinite(r0)
            if (r3 != 0) goto L_0x0078
            r3 = 0
            r7.f4980p = r3
            r7.f4977m = r2
            int[] r2 = r7.f4970i
            int r7 = r7.f4967f
            int r7 = r7 + -1
            r3 = r2[r7]
            int r3 = r3 + 1
            r2[r7] = r3
            return r0
        L_0x0078:
            j2.a r2 = new j2.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "JSON forbids NaN and infinities: "
            r3.<init>(r4)
            r3.append(r0)
            r3.append(r5)
            java.lang.String r7 = r7.h()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7)
            throw r2
        L_0x0096:
            c1.c r0 = new c1.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r2 = r7.f4980p
            r1.append(r2)
            r1.append(r5)
            java.lang.String r7 = r7.h()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>((java.lang.String) r7)
            throw r0
        L_0x00b4:
            c1.c r0 = new c1.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            int r2 = r7.t()
            java.lang.String r2 = b6.a.p(r2)
            r1.append(r2)
            r1.append(r5)
            java.lang.String r7 = r7.h()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>((java.lang.String) r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.c.o():double");
    }

    public final int q() {
        int i8 = this.f4977m;
        if (i8 == 0) {
            i8 = B();
        }
        if (i8 == 16) {
            long j8 = this.f4978n;
            int i9 = (int) j8;
            if (j8 == ((long) i9)) {
                this.f4977m = 0;
                int[] iArr = this.f4970i;
                int i10 = this.f4967f - 1;
                iArr[i10] = iArr[i10] + 1;
                return i9;
            }
            throw new c1.c("Expected an int but was " + this.f4978n + " at path " + h());
        }
        if (i8 == 17) {
            this.f4980p = this.f4976l.j((long) this.f4979o);
        } else if (i8 == 9 || i8 == 8) {
            String I = I(i8 == 9 ? r : f4973q);
            this.f4980p = I;
            try {
                int parseInt = Integer.parseInt(I);
                this.f4977m = 0;
                int[] iArr2 = this.f4970i;
                int i11 = this.f4967f - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i8 != 11) {
            throw new c1.c("Expected an int but was " + b6.a.p(t()) + " at path " + h());
        }
        this.f4977m = 11;
        try {
            double parseDouble = Double.parseDouble(this.f4980p);
            int i12 = (int) parseDouble;
            if (((double) i12) == parseDouble) {
                this.f4980p = null;
                this.f4977m = 0;
                int[] iArr3 = this.f4970i;
                int i13 = this.f4967f - 1;
                iArr3[i13] = iArr3[i13] + 1;
                return i12;
            }
            throw new c1.c("Expected an int but was " + this.f4980p + " at path " + h());
        } catch (NumberFormatException unused2) {
            throw new c1.c("Expected an int but was " + this.f4980p + " at path " + h());
        }
    }

    public final String s() {
        String str;
        g8.c cVar;
        int i8 = this.f4977m;
        if (i8 == 0) {
            i8 = B();
        }
        if (i8 == 10) {
            str = M();
        } else {
            if (i8 == 9) {
                cVar = r;
            } else if (i8 == 8) {
                cVar = f4973q;
            } else if (i8 == 11) {
                str = this.f4980p;
                this.f4980p = null;
            } else if (i8 == 16) {
                str = Long.toString(this.f4978n);
            } else if (i8 == 17) {
                str = this.f4976l.j((long) this.f4979o);
            } else {
                throw new c1.c("Expected a string but was " + b6.a.p(t()) + " at path " + h());
            }
            str = I(cVar);
        }
        this.f4977m = 0;
        int[] iArr = this.f4970i;
        int i9 = this.f4967f - 1;
        iArr[i9] = iArr[i9] + 1;
        return str;
    }

    public final int t() {
        int i8 = this.f4977m;
        if (i8 == 0) {
            i8 = B();
        }
        switch (i8) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f4975k + ")";
    }

    public final int v(b.a aVar) {
        int i8 = this.f4977m;
        if (i8 == 0) {
            i8 = B();
        }
        if (i8 < 12 || i8 > 15) {
            return -1;
        }
        if (i8 == 15) {
            return D(this.f4980p, aVar);
        }
        int L = this.f4975k.L(aVar.f4972b);
        if (L != -1) {
            this.f4977m = 0;
            this.f4969h[this.f4967f - 1] = aVar.f4971a[L];
            return L;
        }
        String str = this.f4969h[this.f4967f - 1];
        String G = G();
        int D = D(G, aVar);
        if (D == -1) {
            this.f4977m = 15;
            this.f4980p = G;
            this.f4969h[this.f4967f - 1] = str;
        }
        return D;
    }

    public final void w() {
        g8.c cVar;
        int i8 = this.f4977m;
        if (i8 == 0) {
            i8 = B();
        }
        if (i8 == 14) {
            long C = this.f4975k.C(f4974s);
            int i9 = (C > -1 ? 1 : (C == -1 ? 0 : -1));
            a aVar = this.f4976l;
            if (i9 == 0) {
                C = aVar.f4683g;
            }
            aVar.o(C);
        } else {
            if (i8 == 13) {
                cVar = r;
            } else if (i8 == 12) {
                cVar = f4973q;
            } else if (i8 != 15) {
                throw new c1.c("Expected a name but was " + b6.a.p(t()) + " at path " + h());
            }
            O(cVar);
        }
        this.f4977m = 0;
        this.f4969h[this.f4967f - 1] = "null";
    }

    public final void x() {
        g8.c cVar;
        int i8 = 0;
        do {
            int i9 = this.f4977m;
            if (i9 == 0) {
                i9 = B();
            }
            if (i9 == 3) {
                u(1);
            } else if (i9 == 1) {
                u(3);
            } else {
                if (i9 == 4) {
                    i8--;
                    if (i8 < 0) {
                        throw new c1.c("Expected a value but was " + b6.a.p(t()) + " at path " + h());
                    }
                } else if (i9 == 2) {
                    i8--;
                    if (i8 < 0) {
                        throw new c1.c("Expected a value but was " + b6.a.p(t()) + " at path " + h());
                    }
                } else {
                    a aVar = this.f4976l;
                    if (i9 == 14 || i9 == 10) {
                        long C = this.f4975k.C(f4974s);
                        if (C == -1) {
                            C = aVar.f4683g;
                        }
                        aVar.o(C);
                        this.f4977m = 0;
                    } else {
                        if (i9 == 9 || i9 == 13) {
                            cVar = r;
                        } else if (i9 == 8 || i9 == 12) {
                            cVar = f4973q;
                        } else {
                            if (i9 == 17) {
                                aVar.o((long) this.f4979o);
                            } else if (i9 == 18) {
                                throw new c1.c("Expected a value but was " + b6.a.p(t()) + " at path " + h());
                            }
                            this.f4977m = 0;
                        }
                        O(cVar);
                        this.f4977m = 0;
                    }
                }
                this.f4967f--;
                this.f4977m = 0;
            }
            i8++;
            this.f4977m = 0;
        } while (i8 != 0);
        int[] iArr = this.f4970i;
        int i10 = this.f4967f;
        int i11 = i10 - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f4969h[i10 - 1] = "null";
    }
}
