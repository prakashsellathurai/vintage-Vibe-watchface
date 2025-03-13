package com.google.protobuf;

import com.google.protobuf.a0;
import com.google.protobuf.e;
import com.google.protobuf.i;
import com.google.protobuf.k0;
import com.google.protobuf.l;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public final class u0<T> implements f1<T> {
    public static final int[] r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    public static final Unsafe f3780s = q1.q();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f3781a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f3782b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3783c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3784d;
    public final r0 e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3785f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3786g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3787h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f3788i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f3789j;

    /* renamed from: k  reason: collision with root package name */
    public final int f3790k;

    /* renamed from: l  reason: collision with root package name */
    public final int f3791l;

    /* renamed from: m  reason: collision with root package name */
    public final w0 f3792m;

    /* renamed from: n  reason: collision with root package name */
    public final h0 f3793n;

    /* renamed from: o  reason: collision with root package name */
    public final m1<?, ?> f3794o;

    /* renamed from: p  reason: collision with root package name */
    public final r<?> f3795p;

    /* renamed from: q  reason: collision with root package name */
    public final m0 f3796q;

    public u0(int[] iArr, Object[] objArr, int i8, int i9, r0 r0Var, boolean z8, int[] iArr2, int i10, int i11, w0 w0Var, h0 h0Var, m1 m1Var, r rVar, m0 m0Var) {
        this.f3781a = iArr;
        this.f3782b = objArr;
        this.f3783c = i8;
        this.f3784d = i9;
        this.f3786g = r0Var instanceof y;
        this.f3787h = z8;
        this.f3785f = rVar != null && rVar.e(r0Var);
        this.f3788i = false;
        this.f3789j = iArr2;
        this.f3790k = i10;
        this.f3791l = i11;
        this.f3792m = w0Var;
        this.f3793n = h0Var;
        this.f3794o = m1Var;
        this.f3795p = rVar;
        this.e = r0Var;
        this.f3796q = m0Var;
    }

    public static Field J(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static void Q(int i8, Object obj, m mVar) {
        if (obj instanceof String) {
            mVar.f3722a.W(i8, (String) obj);
            return;
        }
        mVar.b(i8, (i) obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        r1 = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        r1 = java.lang.Long.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        r5.f3625c = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0085, code lost:
        r5.f3625c = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
        r5.f3625c = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return r1 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r1 + 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int l(byte[] r0, int r1, int r2, com.google.protobuf.s1 r3, java.lang.Class r4, com.google.protobuf.e.a r5) {
        /*
            int r3 = r3.ordinal()
            switch(r3) {
                case 0: goto L_0x008a;
                case 1: goto L_0x0079;
                case 2: goto L_0x006c;
                case 3: goto L_0x006c;
                case 4: goto L_0x0061;
                case 5: goto L_0x0058;
                case 6: goto L_0x004f;
                case 7: goto L_0x003b;
                case 8: goto L_0x0036;
                case 9: goto L_0x0007;
                case 10: goto L_0x002b;
                case 11: goto L_0x0025;
                case 12: goto L_0x0061;
                case 13: goto L_0x0061;
                case 14: goto L_0x004f;
                case 15: goto L_0x0058;
                case 16: goto L_0x001a;
                case 17: goto L_0x000f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "unsupported field type."
            r0.<init>(r1)
            throw r0
        L_0x000f:
            int r0 = com.google.protobuf.e.K(r0, r1, r5)
            long r1 = r5.f3624b
            long r1 = com.google.protobuf.j.c(r1)
            goto L_0x0072
        L_0x001a:
            int r0 = com.google.protobuf.e.I(r0, r1, r5)
            int r1 = r5.f3623a
            int r1 = com.google.protobuf.j.b(r1)
            goto L_0x0067
        L_0x0025:
            int r0 = com.google.protobuf.e.b(r0, r1, r5)
            goto L_0x009a
        L_0x002b:
            com.google.protobuf.b1 r3 = com.google.protobuf.b1.f3596c
            com.google.protobuf.f1 r3 = r3.a(r4)
            int r0 = com.google.protobuf.e.p(r3, r0, r1, r2, r5)
            goto L_0x009a
        L_0x0036:
            int r0 = com.google.protobuf.e.F(r0, r1, r5)
            goto L_0x009a
        L_0x003b:
            int r0 = com.google.protobuf.e.K(r0, r1, r5)
            long r1 = r5.f3624b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0049
            r1 = 1
            goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x0076
        L_0x004f:
            int r0 = com.google.protobuf.e.h(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0085
        L_0x0058:
            long r2 = com.google.protobuf.e.j(r0, r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L_0x0096
        L_0x0061:
            int r0 = com.google.protobuf.e.I(r0, r1, r5)
            int r1 = r5.f3623a
        L_0x0067:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0076
        L_0x006c:
            int r0 = com.google.protobuf.e.K(r0, r1, r5)
            long r1 = r5.f3624b
        L_0x0072:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L_0x0076:
            r5.f3625c = r1
            goto L_0x009a
        L_0x0079:
            int r0 = com.google.protobuf.e.h(r0, r1)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x0085:
            r5.f3625c = r0
            int r0 = r1 + 4
            goto L_0x009a
        L_0x008a:
            long r2 = com.google.protobuf.e.j(r0, r1)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
        L_0x0096:
            r5.f3625c = r0
            int r0 = r1 + 8
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.l(byte[], int, int, com.google.protobuf.s1, java.lang.Class, com.google.protobuf.e$a):int");
    }

    public static n1 q(Object obj) {
        y yVar = (y) obj;
        n1 n1Var = yVar.unknownFields;
        if (n1Var != n1.f3726f) {
            return n1Var;
        }
        n1 n1Var2 = new n1();
        yVar.unknownFields = n1Var2;
        return n1Var2;
    }

    public static List v(long j8, Object obj) {
        return (List) q1.p(j8, obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:155:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0389  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.google.protobuf.u0<T> x(com.google.protobuf.d1 r34, com.google.protobuf.w0 r35, com.google.protobuf.h0 r36, com.google.protobuf.m1<?, ?> r37, com.google.protobuf.r<?> r38, com.google.protobuf.m0 r39) {
        /*
            int r0 = r34.a()
            r2 = 2
            r3 = 0
            if (r0 != r2) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = r3
        L_0x000b:
            java.lang.String r0 = r34.e()
            int r4 = r0.length()
            char r5 = r0.charAt(r3)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0027
            r5 = 1
        L_0x001d:
            int r7 = r5 + 1
            char r5 = r0.charAt(r5)
            if (r5 < r6) goto L_0x0028
            r5 = r7
            goto L_0x001d
        L_0x0027:
            r7 = 1
        L_0x0028:
            int r5 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0047
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0034:
            int r11 = r5 + 1
            char r5 = r0.charAt(r5)
            if (r5 < r6) goto L_0x0044
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r11
            goto L_0x0034
        L_0x0044:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r11
        L_0x0047:
            if (r7 != 0) goto L_0x0054
            int[] r7 = r
            r9 = r3
            r11 = r9
            r13 = r11
            r14 = r13
            r15 = r14
            r12 = r7
            r7 = r15
            goto L_0x0166
        L_0x0054:
            int r7 = r5 + 1
            char r5 = r0.charAt(r5)
            if (r5 < r6) goto L_0x0073
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0060:
            int r11 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0070
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r11
            goto L_0x0060
        L_0x0070:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r11
        L_0x0073:
            int r9 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0092
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x007f:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x008f
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r7 = r7 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x007f
        L_0x008f:
            int r9 = r9 << r11
            r7 = r7 | r9
            r9 = r12
        L_0x0092:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x00b1
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x009e:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00ae
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x009e
        L_0x00ae:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00b1:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00bd:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00cd
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00bd
        L_0x00cd:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00d0:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00dc:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x00ec
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00dc
        L_0x00ec:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00ef:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x0110
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x00fb:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x010c
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x00fb
        L_0x010c:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0110:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x0133
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x011c:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x012e
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x011c
        L_0x012e:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0133:
            int r16 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x0158
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r3 = r16
            r16 = 13
        L_0x0141:
            int r18 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r6) goto L_0x0153
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r16
            r15 = r15 | r3
            int r16 = r16 + 13
            r3 = r18
            goto L_0x0141
        L_0x0153:
            int r3 = r3 << r16
            r15 = r15 | r3
            r16 = r18
        L_0x0158:
            int r3 = r15 + r13
            int r3 = r3 + r14
            int[] r3 = new int[r3]
            int r14 = r5 * 2
            int r14 = r14 + r7
            r7 = r9
            r9 = r12
            r12 = r3
            r3 = r5
            r5 = r16
        L_0x0166:
            java.lang.Object[] r16 = r34.d()
            com.google.protobuf.r0 r18 = r34.c()
            java.lang.Class r8 = r18.getClass()
            int r1 = r9 * 3
            int[] r1 = new int[r1]
            int r9 = r9 * r2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            int r13 = r13 + r15
            r22 = r13
            r21 = r15
            r19 = 0
            r20 = 0
        L_0x0182:
            if (r5 >= r4) goto L_0x03de
            int r23 = r5 + 1
            char r5 = r0.charAt(r5)
            if (r5 < r6) goto L_0x01aa
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r2 = r23
            r23 = 13
        L_0x0192:
            int r25 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r6) goto L_0x01a4
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r23
            r5 = r5 | r2
            int r23 = r23 + 13
            r2 = r25
            goto L_0x0192
        L_0x01a4:
            int r2 = r2 << r23
            r5 = r5 | r2
            r2 = r25
            goto L_0x01ac
        L_0x01aa:
            r2 = r23
        L_0x01ac:
            int r23 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r6) goto L_0x01d9
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r6 = r23
            r23 = 13
        L_0x01ba:
            int r26 = r6 + 1
            char r6 = r0.charAt(r6)
            r27 = r4
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r4) goto L_0x01d3
            r4 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r23
            r2 = r2 | r4
            int r23 = r23 + 13
            r6 = r26
            r4 = r27
            goto L_0x01ba
        L_0x01d3:
            int r4 = r6 << r23
            r2 = r2 | r4
            r4 = r26
            goto L_0x01dd
        L_0x01d9:
            r27 = r4
            r4 = r23
        L_0x01dd:
            r6 = r2 & 255(0xff, float:3.57E-43)
            r23 = r13
            r13 = r2 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x01eb
            int r13 = r20 + 1
            r12[r20] = r19
            r20 = r13
        L_0x01eb:
            r13 = 51
            r30 = r15
            sun.misc.Unsafe r15 = f3780s
            if (r6 < r13) goto L_0x029a
            int r13 = r4 + 1
            char r4 = r0.charAt(r4)
            r31 = r13
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r13) goto L_0x0225
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r13 = r31
            r31 = 13
        L_0x0206:
            int r32 = r13 + 1
            char r13 = r0.charAt(r13)
            r33 = r11
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r11) goto L_0x021f
            r11 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r31
            r4 = r4 | r11
            int r31 = r31 + 13
            r13 = r32
            r11 = r33
            goto L_0x0206
        L_0x021f:
            int r11 = r13 << r31
            r4 = r4 | r11
            r13 = r32
            goto L_0x0229
        L_0x0225:
            r33 = r11
            r13 = r31
        L_0x0229:
            int r11 = r6 + -51
            r31 = r13
            r13 = 9
            if (r11 == r13) goto L_0x024b
            r13 = 17
            if (r11 != r13) goto L_0x0236
            goto L_0x024b
        L_0x0236:
            r13 = 12
            if (r11 != r13) goto L_0x0249
            if (r10 != 0) goto L_0x0249
            int r11 = r19 / 3
            r13 = 2
            int r11 = r11 * r13
            r13 = 1
            int r11 = r11 + r13
            int r13 = r14 + 1
            r14 = r16[r14]
            r9[r11] = r14
            r14 = r13
        L_0x0249:
            r13 = 2
            goto L_0x025b
        L_0x024b:
            int r11 = r19 / 3
            r13 = 2
            int r11 = r11 * r13
            r18 = 1
            int r11 = r11 + 1
            int r24 = r14 + 1
            r14 = r16[r14]
            r9[r11] = r14
            r14 = r24
        L_0x025b:
            int r4 = r4 * r13
            r11 = r16[r4]
            boolean r13 = r11 instanceof java.lang.reflect.Field
            if (r13 == 0) goto L_0x0265
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x026d
        L_0x0265:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = J(r8, r11)
            r16[r4] = r11
        L_0x026d:
            r26 = r14
            long r13 = r15.objectFieldOffset(r11)
            int r11 = (int) r13
            int r4 = r4 + 1
            r13 = r16[r4]
            boolean r14 = r13 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x027f
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x0287
        L_0x027f:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = J(r8, r13)
            r16[r4] = r13
        L_0x0287:
            long r13 = r15.objectFieldOffset(r13)
            int r4 = (int) r13
            r29 = r0
            r0 = r4
            r14 = r26
            r13 = r31
            r4 = 0
            r18 = 1
            r24 = 2
            goto L_0x03a2
        L_0x029a:
            r33 = r11
            int r11 = r14 + 1
            r13 = r16[r14]
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = J(r8, r13)
            r14 = 9
            if (r6 == r14) goto L_0x0319
            r14 = 17
            if (r6 != r14) goto L_0x02b0
            goto L_0x0319
        L_0x02b0:
            r14 = 27
            if (r6 == r14) goto L_0x0308
            r14 = 49
            if (r6 != r14) goto L_0x02b9
            goto L_0x0308
        L_0x02b9:
            r14 = 12
            if (r6 == r14) goto L_0x02ee
            r14 = 30
            if (r6 == r14) goto L_0x02ee
            r14 = 44
            if (r6 != r14) goto L_0x02c6
            goto L_0x02ee
        L_0x02c6:
            r14 = 50
            if (r6 != r14) goto L_0x0305
            int r14 = r21 + 1
            r12[r21] = r19
            int r21 = r19 / 3
            r24 = 2
            int r21 = r21 * 2
            int r26 = r11 + 1
            r11 = r16[r11]
            r9[r21] = r11
            r11 = r2 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x02e9
            int r21 = r21 + 1
            int r11 = r26 + 1
            r26 = r16[r26]
            r9[r21] = r26
            r21 = r14
            goto L_0x0305
        L_0x02e9:
            r21 = r14
            r18 = 1
            goto L_0x032b
        L_0x02ee:
            if (r10 != 0) goto L_0x0305
            int r14 = r19 / 3
            r24 = 2
            int r14 = r14 * 2
            r18 = 1
            int r14 = r14 + 1
            int r26 = r11 + 1
            r11 = r16[r11]
            r9[r14] = r11
            r18 = 1
            r24 = 2
            goto L_0x032b
        L_0x0305:
            r18 = 1
            goto L_0x0329
        L_0x0308:
            int r14 = r19 / 3
            r24 = 2
            int r14 = r14 * 2
            r18 = 1
            int r14 = r14 + 1
            int r26 = r11 + 1
            r11 = r16[r11]
            r9[r14] = r11
            goto L_0x032b
        L_0x0319:
            r18 = 1
            r24 = 2
            int r14 = r19 / 3
            int r14 = r14 * 2
            int r14 = r14 + 1
            java.lang.Class r26 = r13.getType()
            r9[r14] = r26
        L_0x0329:
            r26 = r11
        L_0x032b:
            long r13 = r15.objectFieldOffset(r13)
            int r11 = (int) r13
            r13 = r2 & 4096(0x1000, float:5.74E-42)
            r14 = 4096(0x1000, float:5.74E-42)
            if (r13 != r14) goto L_0x0339
            r13 = r18
            goto L_0x033a
        L_0x0339:
            r13 = 0
        L_0x033a:
            if (r13 == 0) goto L_0x0389
            r13 = 17
            if (r6 > r13) goto L_0x0389
            int r13 = r4 + 1
            char r4 = r0.charAt(r4)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r14) goto L_0x0366
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r25 = 13
        L_0x034f:
            int r28 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r14) goto L_0x0361
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r25
            r4 = r4 | r13
            int r25 = r25 + 13
            r13 = r28
            goto L_0x034f
        L_0x0361:
            int r13 = r13 << r25
            r4 = r4 | r13
            r13 = r28
        L_0x0366:
            r24 = 2
            int r25 = r3 * 2
            int r28 = r4 / 32
            int r25 = r25 + r28
            r14 = r16[r25]
            r29 = r0
            boolean r0 = r14 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0379
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            goto L_0x0381
        L_0x0379:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = J(r8, r14)
            r16[r25] = r14
        L_0x0381:
            long r14 = r15.objectFieldOffset(r14)
            int r0 = (int) r14
            int r4 = r4 % 32
            goto L_0x0392
        L_0x0389:
            r29 = r0
            r24 = 2
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r4
            r4 = 0
        L_0x0392:
            r14 = 18
            if (r6 < r14) goto L_0x03a0
            r14 = 49
            if (r6 > r14) goto L_0x03a0
            int r14 = r22 + 1
            r12[r22] = r11
            r22 = r14
        L_0x03a0:
            r14 = r26
        L_0x03a2:
            int r15 = r19 + 1
            r1[r19] = r5
            int r5 = r15 + 1
            r19 = r3
            r3 = r2 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x03b1
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b2
        L_0x03b1:
            r3 = 0
        L_0x03b2:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03b9
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03ba
        L_0x03b9:
            r2 = 0
        L_0x03ba:
            r2 = r2 | r3
            int r3 = r6 << 20
            r2 = r2 | r3
            r2 = r2 | r11
            r1[r15] = r2
            int r2 = r5 + 1
            int r3 = r4 << 20
            r0 = r0 | r3
            r1[r5] = r0
            r5 = r13
            r3 = r19
            r13 = r23
            r4 = r27
            r0 = r29
            r15 = r30
            r11 = r33
            r6 = 55296(0xd800, float:7.7486E-41)
            r19 = r2
            r2 = r24
            goto L_0x0182
        L_0x03de:
            r33 = r11
            r23 = r13
            r30 = r15
            com.google.protobuf.u0 r0 = new com.google.protobuf.u0
            com.google.protobuf.r0 r2 = r34.c()
            r4 = r0
            r5 = r1
            r6 = r9
            r8 = r33
            r9 = r2
            r11 = r12
            r12 = r30
            r14 = r35
            r15 = r36
            r16 = r37
            r17 = r38
            r18 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.x(com.google.protobuf.d1, com.google.protobuf.w0, com.google.protobuf.h0, com.google.protobuf.m1, com.google.protobuf.r, com.google.protobuf.m0):com.google.protobuf.u0");
    }

    public static int y(long j8, Object obj) {
        return ((Integer) q1.p(j8, obj)).intValue();
    }

    public static long z(long j8, Object obj) {
        return ((Long) q1.p(j8, obj)).longValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> int A(T r8, byte[] r9, int r10, int r11, int r12, long r13, com.google.protobuf.e.a r15) {
        /*
            r7 = this;
            java.lang.Object r12 = r7.o(r12)
            sun.misc.Unsafe r0 = f3780s
            java.lang.Object r1 = r0.getObject(r8, r13)
            com.google.protobuf.m0 r7 = r7.f3796q
            boolean r2 = r7.c(r1)
            if (r2 == 0) goto L_0x001d
            java.lang.Object r2 = r7.f()
            r7.a(r2, r1)
            r0.putObject(r8, r13, r2)
            r1 = r2
        L_0x001d:
            com.google.protobuf.k0$a r8 = r7.e(r12)
            java.util.Map r7 = r7.h(r1)
            int r10 = com.google.protobuf.e.I(r9, r10, r15)
            int r12 = r15.f3623a
            if (r12 < 0) goto L_0x0086
            int r13 = r11 - r10
            if (r12 > r13) goto L_0x0086
            int r12 = r12 + r10
            K r13 = r8.f3709b
            V r14 = r8.f3711d
            r0 = r14
        L_0x0037:
            if (r10 >= r12) goto L_0x007b
            int r1 = r10 + 1
            byte r10 = r9[r10]
            if (r10 >= 0) goto L_0x0045
            int r1 = com.google.protobuf.e.H(r10, r9, r1, r15)
            int r10 = r15.f3623a
        L_0x0045:
            r2 = r1
            int r1 = r10 >>> 3
            r3 = r10 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0065
            r4 = 2
            if (r1 == r4) goto L_0x0051
            goto L_0x0076
        L_0x0051:
            com.google.protobuf.s1 r4 = r8.f3710c
            int r1 = r4.f3762g
            if (r3 != r1) goto L_0x0076
            java.lang.Class r5 = r14.getClass()
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = l(r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = r15.f3625c
            goto L_0x0037
        L_0x0065:
            com.google.protobuf.s1 r4 = r8.f3708a
            int r1 = r4.f3762g
            if (r3 != r1) goto L_0x0076
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = l(r1, r2, r3, r4, r5, r6)
            java.lang.Object r13 = r15.f3625c
            goto L_0x0037
        L_0x0076:
            int r10 = com.google.protobuf.e.M(r10, r9, r2, r11, r15)
            goto L_0x0037
        L_0x007b:
            if (r10 != r12) goto L_0x0081
            r7.put(r13, r0)
            return r12
        L_0x0081:
            com.google.protobuf.b0 r7 = com.google.protobuf.b0.g()
            throw r7
        L_0x0086:
            com.google.protobuf.b0 r7 = com.google.protobuf.b0.h()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.A(java.lang.Object, byte[], int, int, int, long, com.google.protobuf.e$a):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a1, code lost:
        r2 = r11.f3625c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bd, code lost:
        if (r2 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c0, code lost:
        r2 = com.google.protobuf.a0.c(r2, r11.f3625c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012a, code lost:
        r2 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0137, code lost:
        r2 = java.lang.Long.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013b, code lost:
        r14.putObject(r1, r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014a, code lost:
        r14.putObject(r1, r9, r0);
        r0 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015a, code lost:
        r14.putObject(r1, r9, r0);
        r0 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015f, code lost:
        r14.putInt(r1, r12, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004c, code lost:
        if (r2 == null) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int B(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.protobuf.e.a r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            int r7 = r6 + 2
            int[] r12 = r0.f3781a
            r7 = r12[r7]
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r12
            long r12 = (long) r7
            r7 = 1
            r15 = 2
            sun.misc.Unsafe r14 = f3780s
            switch(r25) {
                case 51: goto L_0x0150;
                case 52: goto L_0x013f;
                case 53: goto L_0x012f;
                case 54: goto L_0x012f;
                case 55: goto L_0x0122;
                case 56: goto L_0x0117;
                case 57: goto L_0x010b;
                case 58: goto L_0x00f6;
                case 59: goto L_0x00c8;
                case 60: goto L_0x00a5;
                case 61: goto L_0x009b;
                case 62: goto L_0x0122;
                case 63: goto L_0x006c;
                case 64: goto L_0x010b;
                case 65: goto L_0x0117;
                case 66: goto L_0x005e;
                case 67: goto L_0x0050;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0164
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x0164
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.protobuf.f1 r2 = r0.p(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r0 = com.google.protobuf.e.n(r2, r3, r4, r5, r6, r7)
            int r2 = r14.getInt(r1, r12)
            if (r2 != r8) goto L_0x004b
            java.lang.Object r2 = r14.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r2 = 0
        L_0x004c:
            if (r2 != 0) goto L_0x00c0
            goto L_0x00bf
        L_0x0050:
            if (r5 != 0) goto L_0x0164
            int r0 = com.google.protobuf.e.K(r3, r4, r11)
            long r2 = r11.f3624b
            long r2 = com.google.protobuf.j.c(r2)
            goto L_0x0137
        L_0x005e:
            if (r5 != 0) goto L_0x0164
            int r0 = com.google.protobuf.e.I(r3, r4, r11)
            int r2 = r11.f3623a
            int r2 = com.google.protobuf.j.b(r2)
            goto L_0x012a
        L_0x006c:
            if (r5 != 0) goto L_0x0164
            int r3 = com.google.protobuf.e.I(r3, r4, r11)
            int r4 = r11.f3623a
            com.google.protobuf.a0$e r0 = r0.n(r6)
            if (r0 == 0) goto L_0x008f
            boolean r0 = r0.isInRange(r4)
            if (r0 == 0) goto L_0x0081
            goto L_0x008f
        L_0x0081:
            com.google.protobuf.n1 r0 = q(r17)
            long r4 = (long) r4
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r0.d(r2, r1)
            goto L_0x0165
        L_0x008f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r14.putObject(r1, r9, r0)
            r14.putInt(r1, r12, r8)
            goto L_0x0165
        L_0x009b:
            if (r5 != r15) goto L_0x0164
            int r0 = com.google.protobuf.e.b(r3, r4, r11)
        L_0x00a1:
            java.lang.Object r2 = r11.f3625c
            goto L_0x013b
        L_0x00a5:
            if (r5 != r15) goto L_0x0164
            com.google.protobuf.f1 r0 = r0.p(r6)
            r2 = r20
            int r0 = com.google.protobuf.e.p(r0, r3, r4, r2, r11)
            int r2 = r14.getInt(r1, r12)
            if (r2 != r8) goto L_0x00bc
            java.lang.Object r2 = r14.getObject(r1, r9)
            goto L_0x00bd
        L_0x00bc:
            r2 = 0
        L_0x00bd:
            if (r2 != 0) goto L_0x00c0
        L_0x00bf:
            goto L_0x00a1
        L_0x00c0:
            java.lang.Object r3 = r11.f3625c
            java.lang.Object r2 = com.google.protobuf.a0.c(r2, r3)
            goto L_0x013b
        L_0x00c8:
            if (r5 != r15) goto L_0x0164
            int r0 = com.google.protobuf.e.I(r3, r4, r11)
            int r2 = r11.f3623a
            if (r2 != 0) goto L_0x00d5
            java.lang.String r2 = ""
            goto L_0x013b
        L_0x00d5:
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r4 = r24 & r4
            if (r4 == 0) goto L_0x00e9
            int r4 = r0 + r2
            boolean r4 = com.google.protobuf.r1.d(r3, r0, r4)
            if (r4 == 0) goto L_0x00e4
            goto L_0x00e9
        L_0x00e4:
            com.google.protobuf.b0 r0 = com.google.protobuf.b0.c()
            throw r0
        L_0x00e9:
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r5 = com.google.protobuf.a0.f3590b
            r4.<init>(r3, r0, r2, r5)
            r14.putObject(r1, r9, r4)
            int r0 = r0 + r2
            goto L_0x015f
        L_0x00f6:
            if (r5 != 0) goto L_0x0164
            int r0 = com.google.protobuf.e.K(r3, r4, r11)
            long r2 = r11.f3624b
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r7 = 0
        L_0x0106:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            goto L_0x013b
        L_0x010b:
            r0 = 5
            if (r5 != r0) goto L_0x0164
            int r0 = com.google.protobuf.e.h(r18, r19)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x014a
        L_0x0117:
            if (r5 != r7) goto L_0x0164
            long r2 = com.google.protobuf.e.j(r18, r19)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L_0x015a
        L_0x0122:
            if (r5 != 0) goto L_0x0164
            int r0 = com.google.protobuf.e.I(r3, r4, r11)
            int r2 = r11.f3623a
        L_0x012a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x013b
        L_0x012f:
            if (r5 != 0) goto L_0x0164
            int r0 = com.google.protobuf.e.K(r3, r4, r11)
            long r2 = r11.f3624b
        L_0x0137:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L_0x013b:
            r14.putObject(r1, r9, r2)
            goto L_0x015f
        L_0x013f:
            r0 = 5
            if (r5 != r0) goto L_0x0164
            float r0 = com.google.protobuf.e.l(r18, r19)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x014a:
            r14.putObject(r1, r9, r0)
            int r0 = r4 + 4
            goto L_0x015f
        L_0x0150:
            if (r5 != r7) goto L_0x0164
            double r2 = com.google.protobuf.e.d(r18, r19)
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
        L_0x015a:
            r14.putObject(r1, r9, r0)
            int r0 = r4 + 8
        L_0x015f:
            r14.putInt(r1, r12, r8)
            r3 = r0
            goto L_0x0165
        L_0x0164:
            r3 = r4
        L_0x0165:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.B(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.protobuf.e$a):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v94, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02d4, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02d5, code lost:
        r12 = r12 | r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02d6, code lost:
        r8 = r0;
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02d8, code lost:
        r1 = r0;
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02da, code lost:
        r2 = r33;
        r12 = r6;
        r3 = r7;
        r4 = r13;
        r5 = r20;
        r13 = r34;
        r6 = r1;
        r1 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02e8, code lost:
        r16 = r33;
        r8 = r35;
        r2 = r4;
        r10 = r7;
        r27 = r9;
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0392, code lost:
        if (r0 != r15) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03c3, code lost:
        if (r0 != r15) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03e3, code lost:
        if (r0 != r15) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03e5, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r4 = r33;
        r13 = r34;
        r1 = r35;
        r11 = r36;
        r2 = r16;
        r3 = r19;
        r5 = r20;
        r6 = r22;
        r9 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00af, code lost:
        r6 = r32;
        r7 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0174, code lost:
        r6 = r3;
        r7 = r5;
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b4, code lost:
        r4 = r11.f3625c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e8, code lost:
        r9.putObject(r14, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0230, code lost:
        r4 = r0;
        r0 = r12 | r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0234, code lost:
        r1 = r0;
        r6 = r3;
        r0 = r4;
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0264, code lost:
        r6 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0265, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x027f, code lost:
        r9.putInt(r14, r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0299, code lost:
        r9.putLong(r31, r2, r4);
        r0 = r12 | r10;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v5, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x040a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0437  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int C(T r31, byte[] r32, int r33, int r34, int r35, com.google.protobuf.e.a r36) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r36
            sun.misc.Unsafe r9 = f3780s
            r0 = r33
            r1 = r35
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = 0
        L_0x0017:
            if (r0 >= r13) goto L_0x0458
            int r4 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002a
            int r0 = com.google.protobuf.e.H(r0, r12, r4, r11)
            int r4 = r11.f3623a
            r28 = r4
            r4 = r0
            r0 = r28
        L_0x002a:
            int r7 = r0 >>> 3
            r8 = r0 & 7
            int r10 = r15.f3784d
            r33 = r0
            int r0 = r15.f3783c
            r19 = r1
            r1 = 3
            if (r7 <= r2) goto L_0x0048
            int r3 = r3 / r1
            if (r7 < r0) goto L_0x0043
            if (r7 > r10) goto L_0x0043
            int r0 = r15.M(r7, r3)
            goto L_0x0044
        L_0x0043:
            r0 = -1
        L_0x0044:
            r3 = r0
            r2 = -1
            r10 = 0
            goto L_0x0056
        L_0x0048:
            if (r7 < r0) goto L_0x0052
            if (r7 > r10) goto L_0x0052
            r10 = 0
            int r0 = r15.M(r7, r10)
            goto L_0x0054
        L_0x0052:
            r10 = 0
            r0 = -1
        L_0x0054:
            r3 = r0
            r2 = -1
        L_0x0056:
            if (r3 != r2) goto L_0x006a
            r17 = r2
            r2 = r4
            r20 = r5
            r12 = r6
            r16 = r7
            r27 = r9
            r18 = r10
            r8 = r19
            r9 = r33
            goto L_0x0408
        L_0x006a:
            int r0 = r3 + 1
            int[] r2 = r15.f3781a
            r0 = r2[r0]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r0 & r18
            int r1 = r18 >>> 20
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r0 & r16
            long r12 = (long) r10
            r10 = 17
            r19 = r0
            if (r1 > r10) goto L_0x02f5
            int r10 = r3 + 2
            r2 = r2[r10]
            int r10 = r2 >>> 20
            r0 = 1
            int r10 = r0 << r10
            r22 = r12
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r12
            if (r2 == r5) goto L_0x00a1
            if (r5 == r12) goto L_0x0099
            long r12 = (long) r5
            r9.putInt(r14, r12, r6)
        L_0x0099:
            long r5 = (long) r2
            int r6 = r9.getInt(r14, r5)
            r12 = r6
            r6 = r2
            goto L_0x00a3
        L_0x00a1:
            r12 = r6
            r6 = r5
        L_0x00a3:
            r2 = 5
            switch(r1) {
                case 0: goto L_0x02bb;
                case 1: goto L_0x02a2;
                case 2: goto L_0x0283;
                case 3: goto L_0x0283;
                case 4: goto L_0x0268;
                case 5: goto L_0x023a;
                case 6: goto L_0x0216;
                case 7: goto L_0x01ec;
                case 8: goto L_0x01c6;
                case 9: goto L_0x0196;
                case 10: goto L_0x0179;
                case 11: goto L_0x0268;
                case 12: goto L_0x0142;
                case 13: goto L_0x0216;
                case 14: goto L_0x023a;
                case 15: goto L_0x0128;
                case 16: goto L_0x00fd;
                case 17: goto L_0x00b4;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            r13 = r33
            r20 = r6
            r33 = r7
            r17 = -1
        L_0x00af:
            r6 = r32
            r7 = r3
            goto L_0x02e8
        L_0x00b4:
            r1 = 3
            if (r8 != r1) goto L_0x00f4
            int r0 = r7 << 3
            r5 = r0 | 4
            com.google.protobuf.f1 r0 = r15.p(r3)
            r13 = r33
            r1 = r32
            r17 = -1
            r2 = r4
            r8 = r3
            r3 = r34
            r4 = r5
            r5 = r36
            int r0 = com.google.protobuf.e.n(r0, r1, r2, r3, r4, r5)
            r1 = r12 & r10
            if (r1 != 0) goto L_0x00da
            java.lang.Object r1 = r11.f3625c
            r3 = r1
            r1 = r22
            goto L_0x00e6
        L_0x00da:
            r1 = r22
            java.lang.Object r3 = r9.getObject(r14, r1)
            java.lang.Object r4 = r11.f3625c
            java.lang.Object r3 = com.google.protobuf.a0.c(r3, r4)
        L_0x00e6:
            r9.putObject(r14, r1, r3)
            r1 = r12 | r10
            r20 = r6
            r33 = r7
            r7 = r8
            r6 = r32
            goto L_0x02da
        L_0x00f4:
            r13 = r33
            r17 = -1
            r20 = r6
            r33 = r7
            goto L_0x00af
        L_0x00fd:
            r13 = r33
            r5 = r3
            r1 = r22
            r17 = -1
            if (r8 != 0) goto L_0x0120
            r3 = r32
            int r0 = com.google.protobuf.e.K(r3, r4, r11)
            r20 = r6
            r33 = r7
            long r6 = r11.f3624b
            long r6 = com.google.protobuf.j.c(r6)
            r8 = r0
            r28 = r6
            r6 = r3
            r2 = r1
            r7 = r5
            r4 = r28
            goto L_0x0299
        L_0x0120:
            r20 = r6
            r33 = r7
            r6 = r32
            goto L_0x0265
        L_0x0128:
            r13 = r33
            r5 = r3
            r20 = r6
            r33 = r7
            r1 = r22
            r17 = -1
            r3 = r32
            if (r8 != 0) goto L_0x0264
            int r0 = com.google.protobuf.e.I(r3, r4, r11)
            int r4 = r11.f3623a
            int r4 = com.google.protobuf.j.b(r4)
            goto L_0x0174
        L_0x0142:
            r13 = r33
            r5 = r3
            r20 = r6
            r33 = r7
            r1 = r22
            r17 = -1
            r3 = r32
            if (r8 != 0) goto L_0x0264
            int r0 = com.google.protobuf.e.I(r3, r4, r11)
            int r4 = r11.f3623a
            com.google.protobuf.a0$e r6 = r15.n(r5)
            if (r6 == 0) goto L_0x0174
            boolean r6 = r6.isInRange(r4)
            if (r6 == 0) goto L_0x0164
            goto L_0x0174
        L_0x0164:
            com.google.protobuf.n1 r1 = q(r31)
            long r6 = (long) r4
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r1.d(r13, r2)
            r6 = r3
            r7 = r5
            goto L_0x02d6
        L_0x0174:
            r6 = r3
            r7 = r5
            r2 = r1
            goto L_0x027f
        L_0x0179:
            r13 = r33
            r5 = r3
            r20 = r6
            r33 = r7
            r1 = r22
            r0 = 2
            r17 = -1
            r3 = r32
            if (r8 != r0) goto L_0x0264
            int r0 = com.google.protobuf.e.b(r3, r4, r11)
            java.lang.Object r4 = r11.f3625c
            r9.putObject(r14, r1, r4)
            r6 = r3
            r7 = r5
            goto L_0x02d5
        L_0x0196:
            r13 = r33
            r5 = r3
            r20 = r6
            r33 = r7
            r1 = r22
            r0 = 2
            r17 = -1
            r3 = r32
            if (r8 != r0) goto L_0x01c2
            com.google.protobuf.f1 r0 = r15.p(r5)
            r7 = r34
            int r0 = com.google.protobuf.e.p(r0, r3, r4, r7, r11)
            r4 = r12 & r10
            if (r4 != 0) goto L_0x01b7
        L_0x01b4:
            java.lang.Object r4 = r11.f3625c
            goto L_0x01e8
        L_0x01b7:
            java.lang.Object r4 = r9.getObject(r14, r1)
            java.lang.Object r6 = r11.f3625c
            java.lang.Object r4 = com.google.protobuf.a0.c(r4, r6)
            goto L_0x01e8
        L_0x01c2:
            r7 = r34
            goto L_0x0264
        L_0x01c6:
            r13 = r33
            r5 = r3
            r20 = r6
            r33 = r7
            r1 = r22
            r0 = 2
            r17 = -1
            r3 = r32
            r7 = r34
            if (r8 != r0) goto L_0x0264
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r19 & r0
            if (r0 != 0) goto L_0x01e3
            int r0 = com.google.protobuf.e.C(r3, r4, r11)
            goto L_0x01b4
        L_0x01e3:
            int r0 = com.google.protobuf.e.F(r3, r4, r11)
            goto L_0x01b4
        L_0x01e8:
            r9.putObject(r14, r1, r4)
            goto L_0x0230
        L_0x01ec:
            r13 = r33
            r5 = r3
            r20 = r6
            r33 = r7
            r1 = r22
            r17 = -1
            r3 = r32
            r7 = r34
            if (r8 != 0) goto L_0x0264
            int r4 = com.google.protobuf.e.K(r3, r4, r11)
            r22 = r1
            long r0 = r11.f3624b
            r24 = 0
            int r0 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1))
            r1 = r22
            if (r0 == 0) goto L_0x020f
            r0 = 1
            goto L_0x0210
        L_0x020f:
            r0 = 0
        L_0x0210:
            com.google.protobuf.q1.r(r14, r1, r0)
            r0 = r12 | r10
            goto L_0x0234
        L_0x0216:
            r13 = r33
            r5 = r3
            r20 = r6
            r33 = r7
            r0 = r22
            r17 = -1
            r3 = r32
            r7 = r34
            if (r8 != r2) goto L_0x0264
            int r2 = com.google.protobuf.e.h(r3, r4)
            r9.putInt(r14, r0, r2)
            int r0 = r4 + 4
        L_0x0230:
            r1 = r12 | r10
            r4 = r0
            r0 = r1
        L_0x0234:
            r1 = r0
            r6 = r3
            r0 = r4
            r7 = r5
            goto L_0x02da
        L_0x023a:
            r13 = r33
            r2 = r0
            r5 = r3
            r20 = r6
            r33 = r7
            r0 = r22
            r17 = -1
            r3 = r32
            r7 = r34
            if (r8 != r2) goto L_0x0264
            long r21 = com.google.protobuf.e.j(r3, r4)
            r1 = r0
            r0 = r9
            r23 = r1
            r1 = r31
            r6 = r3
            r2 = r23
            r8 = r4
            r7 = r5
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r4 = r8 + 8
            goto L_0x02d4
        L_0x0264:
            r6 = r3
        L_0x0265:
            r7 = r5
            goto L_0x02e8
        L_0x0268:
            r13 = r33
            r20 = r6
            r33 = r7
            r23 = r22
            r17 = -1
            r6 = r32
            r7 = r3
            if (r8 != 0) goto L_0x02e8
            int r0 = com.google.protobuf.e.I(r6, r4, r11)
            int r4 = r11.f3623a
            r2 = r23
        L_0x027f:
            r9.putInt(r14, r2, r4)
            goto L_0x02d5
        L_0x0283:
            r13 = r33
            r20 = r6
            r33 = r7
            r17 = -1
            r6 = r32
            r7 = r3
            r2 = r22
            if (r8 != 0) goto L_0x02e8
            int r0 = com.google.protobuf.e.K(r6, r4, r11)
            long r4 = r11.f3624b
            r8 = r0
        L_0x0299:
            r0 = r9
            r1 = r31
            r0.putLong(r1, r2, r4)
            r0 = r12 | r10
            goto L_0x02d8
        L_0x02a2:
            r13 = r33
            r20 = r6
            r33 = r7
            r0 = r22
            r17 = -1
            r6 = r32
            r7 = r3
            if (r8 != r2) goto L_0x02e8
            float r2 = com.google.protobuf.e.l(r6, r4)
            com.google.protobuf.q1.w(r14, r0, r2)
            int r4 = r4 + 4
            goto L_0x02d4
        L_0x02bb:
            r13 = r33
            r2 = r0
            r20 = r6
            r33 = r7
            r0 = r22
            r17 = -1
            r6 = r32
            r7 = r3
            if (r8 != r2) goto L_0x02e8
            double r2 = com.google.protobuf.e.d(r6, r4)
            com.google.protobuf.q1.v(r14, r0, r2)
            int r4 = r4 + 8
        L_0x02d4:
            r0 = r4
        L_0x02d5:
            r12 = r12 | r10
        L_0x02d6:
            r8 = r0
            r0 = r12
        L_0x02d8:
            r1 = r0
            r0 = r8
        L_0x02da:
            r2 = r33
            r12 = r6
            r3 = r7
            r4 = r13
            r5 = r20
            r13 = r34
            r6 = r1
            r1 = r35
            goto L_0x0017
        L_0x02e8:
            r16 = r33
            r8 = r35
            r2 = r4
            r10 = r7
            r27 = r9
            r9 = r13
            r18 = 0
            goto L_0x0408
        L_0x02f5:
            r17 = -1
            r28 = r12
            r13 = r33
            r33 = r7
            r7 = r3
            r2 = r28
            r0 = 27
            if (r1 != r0) goto L_0x035c
            r0 = 2
            if (r8 != r0) goto L_0x034b
            java.lang.Object r0 = r9.getObject(r14, r2)
            com.google.protobuf.a0$j r0 = (com.google.protobuf.a0.j) r0
            boolean r1 = r0.f()
            if (r1 != 0) goto L_0x0325
            int r1 = r0.size()
            if (r1 != 0) goto L_0x031c
            r1 = 10
            goto L_0x031e
        L_0x031c:
            int r1 = r1 * 2
        L_0x031e:
            com.google.protobuf.a0$j r0 = r0.b(r1)
            r9.putObject(r14, r2, r0)
        L_0x0325:
            r8 = r0
            com.google.protobuf.f1 r0 = r15.p(r7)
            r1 = r13
            r2 = r32
            r3 = r4
            r4 = r34
            r20 = r5
            r5 = r8
            r22 = r6
            r6 = r36
            int r0 = com.google.protobuf.e.q(r0, r1, r2, r3, r4, r5, r6)
            r12 = r32
            r2 = r33
            r1 = r35
            r3 = r7
            r4 = r13
            r5 = r20
            r6 = r22
        L_0x0347:
            r13 = r34
            goto L_0x0017
        L_0x034b:
            r20 = r5
            r22 = r6
            r16 = r33
            r15 = r4
            r19 = r7
            r27 = r9
            r33 = r13
            r18 = 0
            goto L_0x03c6
        L_0x035c:
            r20 = r5
            r22 = r6
            r0 = 49
            if (r1 > r0) goto L_0x0399
            r0 = r19
            long r5 = (long) r0
            r0 = r30
            r12 = r1
            r1 = r31
            r23 = r2
            r2 = r32
            r3 = r4
            r10 = r4
            r4 = r34
            r25 = r5
            r5 = r13
            r6 = r33
            r16 = r33
            r19 = r7
            r7 = r8
            r8 = r19
            r27 = r9
            r15 = r10
            r18 = 0
            r9 = r25
            r11 = r12
            r33 = r13
            r12 = r23
            r14 = r36
            int r0 = r0.E(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0396
            goto L_0x03e5
        L_0x0396:
            r4 = r0
            goto L_0x03ff
        L_0x0399:
            r16 = r33
            r12 = r1
            r23 = r2
            r15 = r4
            r27 = r9
            r33 = r13
            r0 = r19
            r18 = 0
            r19 = r7
            r1 = 50
            if (r12 != r1) goto L_0x03c8
            r1 = 2
            if (r8 != r1) goto L_0x03c6
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r19
            r6 = r23
            r8 = r36
            int r0 = r0.A(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0396
            goto L_0x03e5
        L_0x03c6:
            r4 = r15
            goto L_0x03ff
        L_0x03c8:
            r9 = r0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r33
            r6 = r16
            r7 = r8
            r8 = r9
            r9 = r12
            r10 = r23
            r12 = r19
            r13 = r36
            int r0 = r0.B(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0396
        L_0x03e5:
            r15 = r30
            r14 = r31
            r12 = r32
            r4 = r33
            r13 = r34
            r1 = r35
            r11 = r36
            r2 = r16
            r3 = r19
            r5 = r20
            r6 = r22
            r9 = r27
            goto L_0x0017
        L_0x03ff:
            r9 = r33
            r8 = r35
            r2 = r4
            r10 = r19
            r12 = r22
        L_0x0408:
            if (r9 != r8) goto L_0x0415
            if (r8 == 0) goto L_0x0415
            r11 = r30
            r0 = r2
            r1 = r8
            r4 = r9
            r6 = r12
            r5 = r20
            goto L_0x0461
        L_0x0415:
            r11 = r30
            boolean r0 = r11.f3785f
            r13 = r36
            if (r0 == 0) goto L_0x0437
            com.google.protobuf.q r0 = r13.f3626d
            com.google.protobuf.q r1 = com.google.protobuf.q.a()
            if (r0 == r1) goto L_0x0437
            com.google.protobuf.r0 r5 = r11.e
            com.google.protobuf.m1<?, ?> r6 = r11.f3794o
            r0 = r9
            r1 = r32
            r3 = r34
            r4 = r31
            r7 = r36
            int r0 = com.google.protobuf.e.g(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0446
        L_0x0437:
            com.google.protobuf.n1 r4 = q(r31)
            r0 = r9
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = com.google.protobuf.e.G(r0, r1, r2, r3, r4, r5)
        L_0x0446:
            r14 = r31
            r1 = r8
            r4 = r9
            r3 = r10
            r15 = r11
            r6 = r12
            r11 = r13
            r2 = r16
            r5 = r20
            r9 = r27
            r12 = r32
            goto L_0x0347
        L_0x0458:
            r19 = r1
            r20 = r5
            r22 = r6
            r27 = r9
            r11 = r15
        L_0x0461:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r5 == r2) goto L_0x046f
            long r2 = (long) r5
            r5 = r31
            r7 = r27
            r7.putInt(r5, r2, r6)
            goto L_0x0471
        L_0x046f:
            r5 = r31
        L_0x0471:
            r2 = 0
            int r3 = r11.f3790k
        L_0x0474:
            int r6 = r11.f3791l
            com.google.protobuf.m1<?, ?> r7 = r11.f3794o
            if (r3 >= r6) goto L_0x0487
            int[] r6 = r11.f3789j
            r6 = r6[r3]
            java.lang.Object r2 = r11.m(r5, r6, r2, r7)
            com.google.protobuf.n1 r2 = (com.google.protobuf.n1) r2
            int r3 = r3 + 1
            goto L_0x0474
        L_0x0487:
            if (r2 == 0) goto L_0x048c
            r7.n(r5, r2)
        L_0x048c:
            r2 = r34
            if (r1 != 0) goto L_0x0498
            if (r0 != r2) goto L_0x0493
            goto L_0x049c
        L_0x0493:
            com.google.protobuf.b0 r0 = com.google.protobuf.b0.g()
            throw r0
        L_0x0498:
            if (r0 > r2) goto L_0x049d
            if (r4 != r1) goto L_0x049d
        L_0x049c:
            return r0
        L_0x049d:
            com.google.protobuf.b0 r0 = com.google.protobuf.b0.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.C(java.lang.Object, byte[], int, int, int, com.google.protobuf.e$a):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0286, code lost:
        if (r0 != r15) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02c0, code lost:
        if (r0 != r15) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02dd, code lost:
        if (r0 != r15) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02df, code lost:
        r2 = r18;
        r6 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011b, code lost:
        r1 = r11.f3625c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013b, code lost:
        r9.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0165, code lost:
        r5 = r6;
        r2 = r8;
        r10 = 0;
        r6 = r17 | r7;
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0186, code lost:
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0191, code lost:
        if (r0 == 0) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0193, code lost:
        r0 = com.google.protobuf.e.I(r12, r10, r11);
        r1 = r11.f3623a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0199, code lost:
        r9.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ab, code lost:
        r9.putLong(r30, r2, r4);
        r5 = r6;
        r6 = r17 | r7;
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d8, code lost:
        r0 = r10 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01da, code lost:
        r5 = r6;
        r6 = r17 | r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01df, code lost:
        r26 = r6;
        r27 = r9;
        r2 = r10;
        r6 = r17;
        r17 = 0;
        r10 = r8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(java.lang.Object r30, byte[] r31, int r32, int r33, com.google.protobuf.e.a r34) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            sun.misc.Unsafe r9 = f3780s
            r10 = 0
            r0 = r32
            r2 = r10
            r6 = r2
            r1 = -1
            r5 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0015:
            if (r0 >= r13) goto L_0x030e
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0027
            int r0 = com.google.protobuf.e.H(r0, r12, r3, r11)
            int r3 = r11.f3623a
            r4 = r0
            r16 = r3
            goto L_0x002a
        L_0x0027:
            r16 = r0
            r4 = r3
        L_0x002a:
            int r3 = r16 >>> 3
            r0 = r16 & 7
            int r7 = r15.f3784d
            int r8 = r15.f3783c
            if (r3 <= r1) goto L_0x003f
            int r2 = r2 / 3
            if (r3 < r8) goto L_0x0048
            if (r3 > r7) goto L_0x0048
            int r1 = r15.M(r3, r2)
            goto L_0x0049
        L_0x003f:
            if (r3 < r8) goto L_0x0048
            if (r3 > r7) goto L_0x0048
            int r1 = r15.M(r3, r10)
            goto L_0x0049
        L_0x0048:
            r1 = -1
        L_0x0049:
            r8 = r1
            r7 = -1
            if (r8 != r7) goto L_0x005a
            r19 = r3
            r2 = r4
            r26 = r5
            r22 = r7
            r27 = r9
            r17 = r10
            goto L_0x02e9
        L_0x005a:
            int r1 = r8 + 1
            int[] r2 = r15.f3781a
            r1 = r2[r1]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r1 & r18
            int r10 = r18 >>> 20
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r1 & r17
            r19 = r3
            r32 = r4
            long r3 = (long) r7
            r7 = 17
            r20 = r1
            if (r10 > r7) goto L_0x01ed
            int r7 = r8 + 2
            r2 = r2[r7]
            int r7 = r2 >>> 20
            r1 = 1
            int r7 = r1 << r7
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            if (r2 == r5) goto L_0x00a4
            if (r5 == r1) goto L_0x0093
            r23 = r2
            long r1 = (long) r5
            r9.putInt(r14, r1, r6)
            r1 = r23
            r2 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0098
        L_0x0093:
            r28 = r2
            r2 = r1
            r1 = r28
        L_0x0098:
            if (r1 == r2) goto L_0x00a0
            long r5 = (long) r1
            int r5 = r9.getInt(r14, r5)
            r6 = r5
        L_0x00a0:
            r17 = r6
            r6 = r1
            goto L_0x00a8
        L_0x00a4:
            r2 = r1
            r17 = r6
            r6 = r5
        L_0x00a8:
            r1 = 5
            switch(r10) {
                case 0: goto L_0x01c9;
                case 1: goto L_0x01b8;
                case 2: goto L_0x019d;
                case 3: goto L_0x019d;
                case 4: goto L_0x018c;
                case 5: goto L_0x016f;
                case 6: goto L_0x0157;
                case 7: goto L_0x013f;
                case 8: goto L_0x0125;
                case 9: goto L_0x0107;
                case 10: goto L_0x00f0;
                case 11: goto L_0x018c;
                case 12: goto L_0x00e2;
                case 13: goto L_0x0157;
                case 14: goto L_0x016f;
                case 15: goto L_0x00cb;
                case 16: goto L_0x00b2;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            r10 = r32
            r22 = r2
            goto L_0x01df
        L_0x00b2:
            r5 = r32
            if (r0 != 0) goto L_0x0186
            int r0 = com.google.protobuf.e.K(r12, r5, r11)
            r24 = r3
            long r2 = r11.f3624b
            long r1 = com.google.protobuf.j.c(r2)
            r10 = r0
            r4 = r1
            r2 = r24
            r22 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x01ab
        L_0x00cb:
            r5 = r32
            r24 = r3
            if (r0 != 0) goto L_0x0186
            int r0 = com.google.protobuf.e.I(r12, r5, r11)
            int r1 = r11.f3623a
            int r1 = com.google.protobuf.j.b(r1)
            r2 = r24
            r22 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0199
        L_0x00e2:
            r5 = r32
            r24 = r3
            if (r0 != 0) goto L_0x0186
            r10 = r5
            r2 = r24
            r22 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0193
        L_0x00f0:
            r5 = r32
            r24 = r3
            r1 = 2
            if (r0 != r1) goto L_0x0186
            int r0 = com.google.protobuf.e.b(r12, r5, r11)
            java.lang.Object r1 = r11.f3625c
            r2 = r24
            r9.putObject(r14, r2, r1)
            r22 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x01da
        L_0x0107:
            r5 = r32
            r2 = r3
            r1 = 2
            if (r0 != r1) goto L_0x0186
            com.google.protobuf.f1 r0 = r15.p(r8)
            int r0 = com.google.protobuf.e.p(r0, r12, r5, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x011e
        L_0x011b:
            java.lang.Object r1 = r11.f3625c
            goto L_0x013b
        L_0x011e:
            java.lang.Object r5 = r11.f3625c
            java.lang.Object r1 = com.google.protobuf.a0.c(r1, r5)
            goto L_0x013b
        L_0x0125:
            r5 = r32
            r2 = r3
            r1 = 2
            if (r0 != r1) goto L_0x0186
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x0136
            int r0 = com.google.protobuf.e.C(r12, r5, r11)
            goto L_0x011b
        L_0x0136:
            int r0 = com.google.protobuf.e.F(r12, r5, r11)
            goto L_0x011b
        L_0x013b:
            r9.putObject(r14, r2, r1)
            goto L_0x0165
        L_0x013f:
            r5 = r32
            r2 = r3
            if (r0 != 0) goto L_0x0186
            int r0 = com.google.protobuf.e.K(r12, r5, r11)
            long r4 = r11.f3624b
            r20 = 0
            int r1 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r1 == 0) goto L_0x0152
            r1 = 1
            goto L_0x0153
        L_0x0152:
            r1 = 0
        L_0x0153:
            com.google.protobuf.q1.r(r14, r2, r1)
            goto L_0x0165
        L_0x0157:
            r5 = r32
            r2 = r3
            if (r0 != r1) goto L_0x0186
            int r0 = com.google.protobuf.e.h(r12, r5)
            r9.putInt(r14, r2, r0)
            int r0 = r5 + 4
        L_0x0165:
            r1 = r17 | r7
            r5 = r6
            r2 = r8
            r10 = 0
            r6 = r1
            r1 = r19
            goto L_0x0015
        L_0x016f:
            r5 = r32
            r2 = r3
            r1 = 1
            if (r0 != r1) goto L_0x0186
            long r20 = com.google.protobuf.e.j(r12, r5)
            r0 = r9
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r30
            r10 = r5
            r4 = r20
            r0.putLong(r1, r2, r4)
            goto L_0x01d8
        L_0x0186:
            r10 = r5
            r22 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x01df
        L_0x018c:
            r10 = r32
            r22 = r2
            r2 = r3
            if (r0 != 0) goto L_0x01df
        L_0x0193:
            int r0 = com.google.protobuf.e.I(r12, r10, r11)
            int r1 = r11.f3623a
        L_0x0199:
            r9.putInt(r14, r2, r1)
            goto L_0x01da
        L_0x019d:
            r10 = r32
            r22 = r2
            r2 = r3
            if (r0 != 0) goto L_0x01df
            int r0 = com.google.protobuf.e.K(r12, r10, r11)
            long r4 = r11.f3624b
            r10 = r0
        L_0x01ab:
            r0 = r9
            r1 = r30
            r0.putLong(r1, r2, r4)
            r0 = r17 | r7
            r5 = r6
            r6 = r0
            r0 = r10
            goto L_0x022f
        L_0x01b8:
            r10 = r32
            r22 = r2
            r2 = r3
            if (r0 != r1) goto L_0x01df
            float r0 = com.google.protobuf.e.l(r12, r10)
            com.google.protobuf.q1.w(r14, r2, r0)
            int r0 = r10 + 4
            goto L_0x01da
        L_0x01c9:
            r10 = r32
            r22 = r2
            r2 = r3
            r1 = 1
            if (r0 != r1) goto L_0x01df
            double r0 = com.google.protobuf.e.d(r12, r10)
            com.google.protobuf.q1.v(r14, r2, r0)
        L_0x01d8:
            int r0 = r10 + 8
        L_0x01da:
            r1 = r17 | r7
            r5 = r6
            r6 = r1
            goto L_0x022f
        L_0x01df:
            r26 = r6
            r27 = r9
            r2 = r10
            r6 = r17
            r17 = 0
            r22 = -1
            r10 = r8
            goto L_0x02e9
        L_0x01ed:
            r7 = r32
            r2 = r3
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 27
            if (r10 != r1) goto L_0x0245
            r1 = 2
            if (r0 != r1) goto L_0x0235
            java.lang.Object r0 = r9.getObject(r14, r2)
            com.google.protobuf.a0$j r0 = (com.google.protobuf.a0.j) r0
            boolean r1 = r0.f()
            if (r1 != 0) goto L_0x0218
            int r1 = r0.size()
            if (r1 != 0) goto L_0x020f
            r1 = 10
            goto L_0x0211
        L_0x020f:
            int r1 = r1 * 2
        L_0x0211:
            com.google.protobuf.a0$j r0 = r0.b(r1)
            r9.putObject(r14, r2, r0)
        L_0x0218:
            r10 = r0
            com.google.protobuf.f1 r0 = r15.p(r8)
            r1 = r16
            r2 = r31
            r3 = r7
            r4 = r33
            r7 = r5
            r5 = r10
            r10 = r6
            r6 = r34
            int r0 = com.google.protobuf.e.q(r0, r1, r2, r3, r4, r5, r6)
            r5 = r7
            r6 = r10
        L_0x022f:
            r2 = r8
            r1 = r19
            r10 = 0
            goto L_0x0015
        L_0x0235:
            r10 = r6
            r26 = r5
            r15 = r7
            r18 = r8
            r27 = r9
            r25 = r10
            r17 = 0
            r22 = -1
            goto L_0x02c3
        L_0x0245:
            r28 = r6
            r6 = r5
            r5 = r28
            r1 = 49
            if (r10 > r1) goto L_0x028d
            r17 = r9
            r32 = r10
            r1 = r20
            long r9 = (long) r1
            r4 = r0
            r0 = r29
            r1 = r30
            r20 = r2
            r2 = r31
            r23 = r20
            r3 = r7
            r20 = r4
            r4 = r33
            r15 = r5
            r5 = r16
            r25 = r15
            r15 = r6
            r6 = r19
            r26 = r15
            r18 = -1
            r15 = r7
            r7 = r20
            r22 = r18
            r18 = r8
            r27 = r17
            r17 = 0
            r11 = r32
            r12 = r23
            r14 = r34
            int r0 = r0.E(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x028a
            goto L_0x02df
        L_0x028a:
            r4 = r0
            goto L_0x02e4
        L_0x028d:
            r23 = r2
            r25 = r5
            r26 = r6
            r15 = r7
            r18 = r8
            r27 = r9
            r32 = r10
            r1 = r20
            r17 = 0
            r22 = -1
            r20 = r0
            r0 = 50
            r9 = r32
            r7 = r20
            if (r9 != r0) goto L_0x02c5
            r0 = 2
            if (r7 != r0) goto L_0x02c3
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r18
            r6 = r23
            r8 = r34
            int r0 = r0.A(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x028a
            goto L_0x02df
        L_0x02c3:
            r4 = r15
            goto L_0x02e4
        L_0x02c5:
            r0 = r29
            r8 = r1
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r16
            r6 = r19
            r10 = r23
            r12 = r18
            r13 = r34
            int r0 = r0.B(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x028a
        L_0x02df:
            r2 = r18
            r6 = r25
            goto L_0x02fa
        L_0x02e4:
            r2 = r4
            r10 = r18
            r6 = r25
        L_0x02e9:
            com.google.protobuf.n1 r4 = q(r30)
            r0 = r16
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = com.google.protobuf.e.G(r0, r1, r2, r3, r4, r5)
            r2 = r10
        L_0x02fa:
            r5 = r26
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r10 = r17
            r1 = r19
            r9 = r27
            goto L_0x0015
        L_0x030e:
            r25 = r6
            r27 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r5 == r1) goto L_0x0321
            long r1 = (long) r5
            r3 = r30
            r6 = r25
            r4 = r27
            r4.putInt(r3, r1, r6)
        L_0x0321:
            r1 = r33
            if (r0 != r1) goto L_0x0326
            return
        L_0x0326:
            com.google.protobuf.b0 r0 = com.google.protobuf.b0.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.D(java.lang.Object, byte[], int, int, com.google.protobuf.e$a):void");
    }

    public final int E(T t8, byte[] bArr, int i8, int i9, int i10, int i11, int i12, int i13, long j8, int i14, long j9, e.a aVar) {
        int i15;
        T t9 = t8;
        byte[] bArr2 = bArr;
        int i16 = i8;
        int i17 = i12;
        int i18 = i13;
        long j10 = j9;
        e.a aVar2 = aVar;
        Unsafe unsafe = f3780s;
        a0.j jVar = (a0.j) unsafe.getObject(t8, j10);
        if (!jVar.f()) {
            int size = jVar.size();
            jVar = jVar.b(size == 0 ? 10 : size * 2);
            unsafe.putObject(t8, j10, jVar);
        }
        switch (i14) {
            case 18:
            case EXERCISE_TYPE_HANDBALL_VALUE:
                if (i17 == 2) {
                    return e.s(bArr, i16, jVar, aVar2);
                }
                if (i17 == 1) {
                    return e.e(i10, bArr, i8, i9, jVar, aVar);
                }
                break;
            case 19:
            case EXERCISE_TYPE_HIGH_INTENSITY_INTERVAL_TRAINING_VALUE:
                if (i17 == 2) {
                    return e.v(bArr, i16, jVar, aVar2);
                }
                if (i17 == 5) {
                    return e.m(i10, bArr, i8, i9, jVar, aVar);
                }
                break;
            case EXERCISE_TYPE_DUMBBELL_FRONT_RAISE_VALUE:
            case EXERCISE_TYPE_DUMBBELL_LATERAL_RAISE_VALUE:
            case EXERCISE_TYPE_HIKING_VALUE:
            case EXERCISE_TYPE_ICE_HOCKEY_VALUE:
                if (i17 == 2) {
                    return e.z(bArr, i16, jVar, aVar2);
                }
                if (i17 == 0) {
                    return e.L(i10, bArr, i8, i9, jVar, aVar);
                }
                break;
            case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM_VALUE:
            case EXERCISE_TYPE_FOOTBALL_AMERICAN_VALUE:
            case EXERCISE_TYPE_ICE_SKATING_VALUE:
            case EXERCISE_TYPE_LUNGE_VALUE:
                if (i17 == 2) {
                    return e.y(bArr, i16, jVar, aVar2);
                }
                if (i17 == 0) {
                    return e.J(i10, bArr, i8, i9, jVar, aVar);
                }
                break;
            case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM_VALUE:
            case EXERCISE_TYPE_GOLF_VALUE:
            case EXERCISE_TYPE_JUMP_ROPE_VALUE:
            case EXERCISE_TYPE_PADDLING_VALUE:
                if (i17 == 2) {
                    return e.u(bArr, i16, jVar, aVar2);
                }
                if (i17 == 1) {
                    return e.k(i10, bArr, i8, i9, jVar, aVar);
                }
                break;
            case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_TWO_ARM_VALUE:
            case EXERCISE_TYPE_FORWARD_TWIST_VALUE:
            case EXERCISE_TYPE_JUMPING_JACK_VALUE:
            case EXERCISE_TYPE_MEDITATION_VALUE:
                if (i17 == 2) {
                    return e.t(bArr, i16, jVar, aVar2);
                }
                if (i17 == 5) {
                    return e.i(i10, bArr, i8, i9, jVar, aVar);
                }
                break;
            case EXERCISE_TYPE_ELLIPTICAL_VALUE:
            case EXERCISE_TYPE_LAT_PULL_DOWN_VALUE:
                if (i17 == 2) {
                    return e.r(bArr, i16, jVar, aVar2);
                }
                if (i17 == 0) {
                    return e.a(i10, bArr, i8, i9, jVar, aVar);
                }
                break;
            case EXERCISE_TYPE_EXERCISE_CLASS_VALUE:
                if (i17 == 2) {
                    int i19 = ((j8 & 536870912) > 0 ? 1 : ((j8 & 536870912) == 0 ? 0 : -1));
                    byte[] bArr3 = bArr;
                    int i20 = i8;
                    int i21 = i9;
                    a0.j jVar2 = jVar;
                    e.a aVar3 = aVar;
                    return i19 == 0 ? e.D(i10, bArr3, i20, i21, jVar2, aVar3) : e.E(i10, bArr3, i20, i21, jVar2, aVar3);
                }
                break;
            case 27:
                if (i17 == 2) {
                    return e.q(p(i18), i10, bArr, i8, i9, jVar, aVar);
                }
                break;
            case EXERCISE_TYPE_FRISBEE_DISC_VALUE:
                if (i17 == 2) {
                    return e.c(i10, bArr, i8, i9, jVar, aVar);
                }
                break;
            case EXERCISE_TYPE_FOOTBALL_AUSTRALIAN_VALUE:
            case EXERCISE_TYPE_MARTIAL_ARTS_VALUE:
                if (i17 == 2) {
                    i15 = e.y(bArr, i16, jVar, aVar2);
                } else if (i17 == 0) {
                    i15 = e.J(i10, bArr, i8, i9, jVar, aVar);
                }
                y yVar = (y) t9;
                n1 n1Var = yVar.unknownFields;
                if (n1Var == n1.f3726f) {
                    n1Var = null;
                }
                n1 n1Var2 = (n1) g1.A(i11, jVar, n(i18), n1Var, this.f3794o);
                if (n1Var2 != null) {
                    yVar.unknownFields = n1Var2;
                }
                return i15;
            case EXERCISE_TYPE_GUIDED_BREATHING_VALUE:
            case EXERCISE_TYPE_PARA_GLIDING_VALUE:
                if (i17 == 2) {
                    return e.w(bArr, i16, jVar, aVar2);
                }
                if (i17 == 0) {
                    return e.A(i10, bArr, i8, i9, jVar, aVar);
                }
                break;
            case EXERCISE_TYPE_GYMNASTICS_VALUE:
            case EXERCISE_TYPE_PILATES_VALUE:
                if (i17 == 2) {
                    return e.x(bArr, i16, jVar, aVar2);
                }
                if (i17 == 0) {
                    return e.B(i10, bArr, i8, i9, jVar, aVar);
                }
                break;
            case EXERCISE_TYPE_PLANK_VALUE:
                if (i17 == 3) {
                    return e.o(p(i18), i10, bArr, i8, i9, jVar, aVar);
                }
                break;
        }
        return i16;
    }

    public final <E> void F(Object obj, long j8, e1 e1Var, f1<E> f1Var, q qVar) {
        e1Var.j(this.f3793n.c(j8, obj), f1Var, qVar);
    }

    public final <E> void G(Object obj, int i8, e1 e1Var, f1<E> f1Var, q qVar) {
        e1Var.s(this.f3793n.c((long) (i8 & 1048575), obj), f1Var, qVar);
    }

    public final void H(Object obj, int i8, e1 e1Var) {
        Object obj2;
        long j8;
        if ((536870912 & i8) != 0) {
            j8 = (long) (i8 & 1048575);
            obj2 = e1Var.M();
        } else if (this.f3786g) {
            j8 = (long) (i8 & 1048575);
            obj2 = e1Var.o();
        } else {
            j8 = (long) (i8 & 1048575);
            obj2 = e1Var.B();
        }
        q1.z(j8, obj, obj2);
    }

    public final void I(Object obj, int i8, e1 e1Var) {
        boolean z8 = (536870912 & i8) != 0;
        h0 h0Var = this.f3793n;
        int i9 = i8 & 1048575;
        if (z8) {
            e1Var.z(h0Var.c((long) i9, obj));
        } else {
            e1Var.u(h0Var.c((long) i9, obj));
        }
    }

    public final void K(int i8, Object obj) {
        int i9 = this.f3781a[i8 + 2];
        long j8 = (long) (1048575 & i9);
        if (j8 != 1048575) {
            q1.x((1 << (i9 >>> 20)) | q1.n(j8, obj), j8, obj);
        }
    }

    public final void L(int i8, int i9, Object obj) {
        q1.x(i8, (long) (this.f3781a[i9 + 2] & 1048575), obj);
    }

    public final int M(int i8, int i9) {
        int[] iArr = this.f3781a;
        int length = (iArr.length / 3) - 1;
        while (i9 <= length) {
            int i10 = (length + i9) >>> 1;
            int i11 = i10 * 3;
            int i12 = iArr[i11];
            if (i8 == i12) {
                return i11;
            }
            if (i8 < i12) {
                length = i10 - 1;
            } else {
                i9 = i10 + 1;
            }
        }
        return -1;
    }

    public final int N(int i8) {
        return this.f3781a[i8 + 1];
    }

    /* JADX WARNING: Removed duplicated region for block: B:171:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O(java.lang.Object r21, com.google.protobuf.m r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r4 = r0.f3785f
            com.google.protobuf.r<?> r5 = r0.f3795p
            if (r4 == 0) goto L_0x0021
            com.google.protobuf.u r4 = r5.c(r1)
            boolean r6 = r4.j()
            if (r6 != 0) goto L_0x0021
            java.util.Iterator r4 = r4.m()
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x0023
        L_0x0021:
            r4 = 0
            r6 = 0
        L_0x0023:
            int[] r7 = r0.f3781a
            int r8 = r7.length
            r11 = 0
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r13 = 0
        L_0x002b:
            if (r11 >= r8) goto L_0x04d4
            int r14 = r0.N(r11)
            r15 = r7[r11]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r14 & r16
            int r3 = r16 >>> 20
            r10 = 17
            sun.misc.Unsafe r9 = f3780s
            if (r3 > r10) goto L_0x005b
            int r10 = r11 + 2
            r10 = r7[r10]
            r18 = r6
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r10 & r17
            if (r6 == r12) goto L_0x0052
            long r12 = (long) r6
            int r13 = r9.getInt(r1, r12)
            r12 = r6
        L_0x0052:
            int r6 = r10 >>> 20
            r10 = 1
            int r6 = r10 << r6
            r10 = r6
            r6 = r18
            goto L_0x005e
        L_0x005b:
            r18 = r6
            r10 = 0
        L_0x005e:
            r19 = r8
            if (r6 == 0) goto L_0x007c
            int r8 = r5.a(r6)
            if (r8 > r15) goto L_0x007c
            r5.j(r2, r6)
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0078
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x0079
        L_0x0078:
            r6 = 0
        L_0x0079:
            r8 = r19
            goto L_0x005e
        L_0x007c:
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r14 = r14 & r8
            r17 = r9
            long r8 = (long) r14
            switch(r3) {
                case 0: goto L_0x04c2;
                case 1: goto L_0x04b5;
                case 2: goto L_0x04a7;
                case 3: goto L_0x0499;
                case 4: goto L_0x048b;
                case 5: goto L_0x047d;
                case 6: goto L_0x046f;
                case 7: goto L_0x0462;
                case 8: goto L_0x0453;
                case 9: goto L_0x0440;
                case 10: goto L_0x042f;
                case 11: goto L_0x0420;
                case 12: goto L_0x0411;
                case 13: goto L_0x0402;
                case 14: goto L_0x03f3;
                case 15: goto L_0x03e4;
                case 16: goto L_0x03d5;
                case 17: goto L_0x03c2;
                case 18: goto L_0x03b2;
                case 19: goto L_0x03a2;
                case 20: goto L_0x0392;
                case 21: goto L_0x0382;
                case 22: goto L_0x0372;
                case 23: goto L_0x0362;
                case 24: goto L_0x0352;
                case 25: goto L_0x0342;
                case 26: goto L_0x0333;
                case 27: goto L_0x0320;
                case 28: goto L_0x0311;
                case 29: goto L_0x0301;
                case 30: goto L_0x02f1;
                case 31: goto L_0x02e1;
                case 32: goto L_0x02d1;
                case 33: goto L_0x02c1;
                case 34: goto L_0x02b1;
                case 35: goto L_0x02a1;
                case 36: goto L_0x0291;
                case 37: goto L_0x0281;
                case 38: goto L_0x0271;
                case 39: goto L_0x0261;
                case 40: goto L_0x0251;
                case 41: goto L_0x0241;
                case 42: goto L_0x0231;
                case 43: goto L_0x0221;
                case 44: goto L_0x0211;
                case 45: goto L_0x0201;
                case 46: goto L_0x01f1;
                case 47: goto L_0x01e1;
                case 48: goto L_0x01d1;
                case 49: goto L_0x01be;
                case 50: goto L_0x01b3;
                case 51: goto L_0x019e;
                case 52: goto L_0x0189;
                case 53: goto L_0x017a;
                case 54: goto L_0x016b;
                case 55: goto L_0x015c;
                case 56: goto L_0x014d;
                case 57: goto L_0x013e;
                case 58: goto L_0x0129;
                case 59: goto L_0x0118;
                case 60: goto L_0x0103;
                case 61: goto L_0x00f1;
                case 62: goto L_0x00e3;
                case 63: goto L_0x00d5;
                case 64: goto L_0x00c7;
                case 65: goto L_0x00b9;
                case 66: goto L_0x00ab;
                case 67: goto L_0x009d;
                case 68: goto L_0x0089;
                default: goto L_0x0086;
            }
        L_0x0086:
            r14 = 0
            goto L_0x04ce
        L_0x0089:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            r3 = r17
            java.lang.Object r3 = r3.getObject(r1, r8)
            com.google.protobuf.f1 r8 = r0.p(r11)
            r2.h(r15, r8, r3)
            goto L_0x0086
        L_0x009d:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            long r8 = z(r8, r1)
            r2.p(r15, r8)
            goto L_0x0086
        L_0x00ab:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            int r3 = y(r8, r1)
            r2.o(r15, r3)
            goto L_0x0086
        L_0x00b9:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            long r8 = z(r8, r1)
            r2.n(r15, r8)
            goto L_0x0086
        L_0x00c7:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            int r3 = y(r8, r1)
            r2.m(r15, r3)
            goto L_0x0086
        L_0x00d5:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            int r3 = y(r8, r1)
            r2.d(r15, r3)
            goto L_0x0086
        L_0x00e3:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            int r3 = y(r8, r1)
            r2.q(r15, r3)
            goto L_0x0086
        L_0x00f1:
            r3 = r17
            boolean r10 = r0.u(r15, r11, r1)
            if (r10 == 0) goto L_0x0086
            java.lang.Object r3 = r3.getObject(r1, r8)
            com.google.protobuf.i r3 = (com.google.protobuf.i) r3
            r2.b(r15, r3)
            goto L_0x0086
        L_0x0103:
            r3 = r17
            boolean r10 = r0.u(r15, r11, r1)
            if (r10 == 0) goto L_0x0086
            java.lang.Object r3 = r3.getObject(r1, r8)
            com.google.protobuf.f1 r8 = r0.p(r11)
            r2.k(r15, r8, r3)
            goto L_0x0086
        L_0x0118:
            r3 = r17
            boolean r10 = r0.u(r15, r11, r1)
            if (r10 == 0) goto L_0x0086
            java.lang.Object r3 = r3.getObject(r1, r8)
            Q(r15, r3, r2)
            goto L_0x0086
        L_0x0129:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            java.lang.Object r3 = com.google.protobuf.q1.p(r8, r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.a(r15, r3)
            goto L_0x0086
        L_0x013e:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            int r3 = y(r8, r1)
            r2.e(r15, r3)
            goto L_0x0086
        L_0x014d:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            long r8 = z(r8, r1)
            r2.f(r15, r8)
            goto L_0x0086
        L_0x015c:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            int r3 = y(r8, r1)
            r2.i(r15, r3)
            goto L_0x0086
        L_0x016b:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            long r8 = z(r8, r1)
            r2.r(r15, r8)
            goto L_0x0086
        L_0x017a:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            long r8 = z(r8, r1)
            r2.j(r15, r8)
            goto L_0x0086
        L_0x0189:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            java.lang.Object r3 = com.google.protobuf.q1.p(r8, r1)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2.g(r15, r3)
            goto L_0x0086
        L_0x019e:
            boolean r3 = r0.u(r15, r11, r1)
            if (r3 == 0) goto L_0x0086
            java.lang.Object r3 = com.google.protobuf.q1.p(r8, r1)
            java.lang.Double r3 = (java.lang.Double) r3
            double r8 = r3.doubleValue()
            r2.c(r15, r8)
            goto L_0x0086
        L_0x01b3:
            r3 = r17
            java.lang.Object r3 = r3.getObject(r1, r8)
            r0.P(r2, r15, r3, r11)
            goto L_0x0086
        L_0x01be:
            r3 = r17
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.f1 r8 = r0.p(r11)
            com.google.protobuf.g1.M(r10, r3, r2, r8)
            goto L_0x0086
        L_0x01d1:
            r3 = r17
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            r14 = 1
            com.google.protobuf.g1.T(r10, r3, r2, r14)
            goto L_0x0086
        L_0x01e1:
            r3 = r17
            r14 = 1
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.S(r10, r3, r2, r14)
            goto L_0x0086
        L_0x01f1:
            r3 = r17
            r14 = 1
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.R(r10, r3, r2, r14)
            goto L_0x0086
        L_0x0201:
            r3 = r17
            r14 = 1
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.Q(r10, r3, r2, r14)
            goto L_0x0086
        L_0x0211:
            r3 = r17
            r14 = 1
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.I(r10, r3, r2, r14)
            goto L_0x0086
        L_0x0221:
            r3 = r17
            r14 = 1
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.V(r10, r3, r2, r14)
            goto L_0x0086
        L_0x0231:
            r3 = r17
            r14 = 1
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.F(r10, r3, r2, r14)
            goto L_0x0086
        L_0x0241:
            r3 = r17
            r14 = 1
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.J(r10, r3, r2, r14)
            goto L_0x0086
        L_0x0251:
            r3 = r17
            r14 = 1
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.K(r10, r3, r2, r14)
            goto L_0x0086
        L_0x0261:
            r3 = r17
            r14 = 1
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.N(r10, r3, r2, r14)
            goto L_0x0086
        L_0x0271:
            r3 = r17
            r14 = 1
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.W(r10, r3, r2, r14)
            goto L_0x0086
        L_0x0281:
            r3 = r17
            r14 = 1
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.O(r10, r3, r2, r14)
            goto L_0x0086
        L_0x0291:
            r3 = r17
            r14 = 1
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.L(r10, r3, r2, r14)
            goto L_0x0086
        L_0x02a1:
            r3 = r17
            r14 = 1
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.H(r10, r3, r2, r14)
            goto L_0x0086
        L_0x02b1:
            r3 = r17
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            r14 = 0
            com.google.protobuf.g1.T(r10, r3, r2, r14)
            goto L_0x04ce
        L_0x02c1:
            r3 = r17
            r14 = 0
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.S(r10, r3, r2, r14)
            goto L_0x04ce
        L_0x02d1:
            r3 = r17
            r14 = 0
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.R(r10, r3, r2, r14)
            goto L_0x04ce
        L_0x02e1:
            r3 = r17
            r14 = 0
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.Q(r10, r3, r2, r14)
            goto L_0x04ce
        L_0x02f1:
            r3 = r17
            r14 = 0
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.I(r10, r3, r2, r14)
            goto L_0x04ce
        L_0x0301:
            r3 = r17
            r14 = 0
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.V(r10, r3, r2, r14)
            goto L_0x04ce
        L_0x0311:
            r3 = r17
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.G(r10, r3, r2)
            goto L_0x0086
        L_0x0320:
            r3 = r17
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.f1 r8 = r0.p(r11)
            com.google.protobuf.g1.P(r10, r3, r2, r8)
            goto L_0x0086
        L_0x0333:
            r3 = r17
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.U(r10, r3, r2)
            goto L_0x0086
        L_0x0342:
            r3 = r17
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            r14 = 0
            com.google.protobuf.g1.F(r10, r3, r2, r14)
            goto L_0x04ce
        L_0x0352:
            r3 = r17
            r14 = 0
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.J(r10, r3, r2, r14)
            goto L_0x04ce
        L_0x0362:
            r3 = r17
            r14 = 0
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.K(r10, r3, r2, r14)
            goto L_0x04ce
        L_0x0372:
            r3 = r17
            r14 = 0
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.N(r10, r3, r2, r14)
            goto L_0x04ce
        L_0x0382:
            r3 = r17
            r14 = 0
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.W(r10, r3, r2, r14)
            goto L_0x04ce
        L_0x0392:
            r3 = r17
            r14 = 0
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.O(r10, r3, r2, r14)
            goto L_0x04ce
        L_0x03a2:
            r3 = r17
            r14 = 0
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.L(r10, r3, r2, r14)
            goto L_0x04ce
        L_0x03b2:
            r3 = r17
            r14 = 0
            r10 = r7[r11]
            java.lang.Object r3 = r3.getObject(r1, r8)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.H(r10, r3, r2, r14)
            goto L_0x04ce
        L_0x03c2:
            r3 = r17
            r14 = 0
            r10 = r10 & r13
            if (r10 == 0) goto L_0x04ce
            java.lang.Object r3 = r3.getObject(r1, r8)
            com.google.protobuf.f1 r8 = r0.p(r11)
            r2.h(r15, r8, r3)
            goto L_0x04ce
        L_0x03d5:
            r3 = r17
            r14 = 0
            r10 = r10 & r13
            if (r10 == 0) goto L_0x04ce
            long r8 = r3.getLong(r1, r8)
            r2.p(r15, r8)
            goto L_0x04ce
        L_0x03e4:
            r3 = r17
            r14 = 0
            r10 = r10 & r13
            if (r10 == 0) goto L_0x04ce
            int r3 = r3.getInt(r1, r8)
            r2.o(r15, r3)
            goto L_0x04ce
        L_0x03f3:
            r3 = r17
            r14 = 0
            r10 = r10 & r13
            if (r10 == 0) goto L_0x04ce
            long r8 = r3.getLong(r1, r8)
            r2.n(r15, r8)
            goto L_0x04ce
        L_0x0402:
            r3 = r17
            r14 = 0
            r10 = r10 & r13
            if (r10 == 0) goto L_0x04ce
            int r3 = r3.getInt(r1, r8)
            r2.m(r15, r3)
            goto L_0x04ce
        L_0x0411:
            r3 = r17
            r14 = 0
            r10 = r10 & r13
            if (r10 == 0) goto L_0x04ce
            int r3 = r3.getInt(r1, r8)
            r2.d(r15, r3)
            goto L_0x04ce
        L_0x0420:
            r3 = r17
            r14 = 0
            r10 = r10 & r13
            if (r10 == 0) goto L_0x04ce
            int r3 = r3.getInt(r1, r8)
            r2.q(r15, r3)
            goto L_0x04ce
        L_0x042f:
            r3 = r17
            r14 = 0
            r10 = r10 & r13
            if (r10 == 0) goto L_0x04ce
            java.lang.Object r3 = r3.getObject(r1, r8)
            com.google.protobuf.i r3 = (com.google.protobuf.i) r3
            r2.b(r15, r3)
            goto L_0x04ce
        L_0x0440:
            r3 = r17
            r14 = 0
            r10 = r10 & r13
            if (r10 == 0) goto L_0x04ce
            java.lang.Object r3 = r3.getObject(r1, r8)
            com.google.protobuf.f1 r8 = r0.p(r11)
            r2.k(r15, r8, r3)
            goto L_0x04ce
        L_0x0453:
            r3 = r17
            r14 = 0
            r10 = r10 & r13
            if (r10 == 0) goto L_0x04ce
            java.lang.Object r3 = r3.getObject(r1, r8)
            Q(r15, r3, r2)
            goto L_0x04ce
        L_0x0462:
            r14 = 0
            r3 = r13 & r10
            if (r3 == 0) goto L_0x04ce
            boolean r3 = com.google.protobuf.q1.g(r8, r1)
            r2.a(r15, r3)
            goto L_0x04ce
        L_0x046f:
            r3 = r17
            r14 = 0
            r10 = r10 & r13
            if (r10 == 0) goto L_0x04ce
            int r3 = r3.getInt(r1, r8)
            r2.e(r15, r3)
            goto L_0x04ce
        L_0x047d:
            r3 = r17
            r14 = 0
            r10 = r10 & r13
            if (r10 == 0) goto L_0x04ce
            long r8 = r3.getLong(r1, r8)
            r2.f(r15, r8)
            goto L_0x04ce
        L_0x048b:
            r3 = r17
            r14 = 0
            r10 = r10 & r13
            if (r10 == 0) goto L_0x04ce
            int r3 = r3.getInt(r1, r8)
            r2.i(r15, r3)
            goto L_0x04ce
        L_0x0499:
            r3 = r17
            r14 = 0
            r10 = r10 & r13
            if (r10 == 0) goto L_0x04ce
            long r8 = r3.getLong(r1, r8)
            r2.r(r15, r8)
            goto L_0x04ce
        L_0x04a7:
            r3 = r17
            r14 = 0
            r10 = r10 & r13
            if (r10 == 0) goto L_0x04ce
            long r8 = r3.getLong(r1, r8)
            r2.j(r15, r8)
            goto L_0x04ce
        L_0x04b5:
            r14 = 0
            r3 = r13 & r10
            if (r3 == 0) goto L_0x04ce
            float r3 = com.google.protobuf.q1.m(r8, r1)
            r2.g(r15, r3)
            goto L_0x04ce
        L_0x04c2:
            r14 = 0
            r3 = r13 & r10
            if (r3 == 0) goto L_0x04ce
            double r8 = com.google.protobuf.q1.l(r8, r1)
            r2.c(r15, r8)
        L_0x04ce:
            int r11 = r11 + 3
            r8 = r19
            goto L_0x002b
        L_0x04d4:
            r18 = r6
        L_0x04d6:
            if (r6 == 0) goto L_0x04eb
            r5.j(r2, r6)
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x04e9
            java.lang.Object r3 = r4.next()
            r6 = r3
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x04d6
        L_0x04e9:
            r6 = 0
            goto L_0x04d6
        L_0x04eb:
            com.google.protobuf.m1<?, ?> r0 = r0.f3794o
            java.lang.Object r1 = r0.g(r1)
            r0.s(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.O(java.lang.Object, com.google.protobuf.m):void");
    }

    public final void P(m mVar, int i8, Object obj, int i9) {
        if (obj != null) {
            Object o8 = o(i9);
            m0 m0Var = this.f3796q;
            k0.a<?, ?> e4 = m0Var.e(o8);
            Map<?, ?> g9 = m0Var.g(obj);
            l lVar = mVar.f3722a;
            lVar.getClass();
            for (Map.Entry next : g9.entrySet()) {
                lVar.Y(i8, 2);
                lVar.a0(k0.a(e4, next.getKey(), next.getValue()));
                Object key = next.getKey();
                Object value = next.getValue();
                u.q(lVar, e4.f3708a, 1, key);
                u.q(lVar, e4.f3710c, 2, value);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        com.google.protobuf.q1.z(r4, r9, com.google.protobuf.q1.p(r4, r10));
        L(r6, r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ec, code lost:
        com.google.protobuf.q1.z(r4, r9, com.google.protobuf.q1.p(r4, r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0116, code lost:
        com.google.protobuf.q1.x(com.google.protobuf.q1.n(r4, r10), r4, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012b, code lost:
        com.google.protobuf.q1.y(r9, r4, com.google.protobuf.q1.o(r4, r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014e, code lost:
        K(r0, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r9, T r10) {
        /*
            r8 = this;
            r10.getClass()
            r0 = 0
        L_0x0004:
            int[] r1 = r8.f3781a
            int r2 = r1.length
            if (r0 >= r2) goto L_0x0155
            int r2 = r8.N(r0)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2 & r3
            long r4 = (long) r4
            r6 = r1[r0]
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = r2 & r7
            int r2 = r2 >>> 20
            switch(r2) {
                case 0: goto L_0x0141;
                case 1: goto L_0x0133;
                case 2: goto L_0x0125;
                case 3: goto L_0x011e;
                case 4: goto L_0x0110;
                case 5: goto L_0x0109;
                case 6: goto L_0x0102;
                case 7: goto L_0x00f4;
                case 8: goto L_0x00e6;
                case 9: goto L_0x00bd;
                case 10: goto L_0x00b6;
                case 11: goto L_0x00af;
                case 12: goto L_0x00a7;
                case 13: goto L_0x009f;
                case 14: goto L_0x0097;
                case 15: goto L_0x008f;
                case 16: goto L_0x0087;
                case 17: goto L_0x00bd;
                case 18: goto L_0x0080;
                case 19: goto L_0x0080;
                case 20: goto L_0x0080;
                case 21: goto L_0x0080;
                case 22: goto L_0x0080;
                case 23: goto L_0x0080;
                case 24: goto L_0x0080;
                case 25: goto L_0x0080;
                case 26: goto L_0x0080;
                case 27: goto L_0x0080;
                case 28: goto L_0x0080;
                case 29: goto L_0x0080;
                case 30: goto L_0x0080;
                case 31: goto L_0x0080;
                case 32: goto L_0x0080;
                case 33: goto L_0x0080;
                case 34: goto L_0x0080;
                case 35: goto L_0x0080;
                case 36: goto L_0x0080;
                case 37: goto L_0x0080;
                case 38: goto L_0x0080;
                case 39: goto L_0x0080;
                case 40: goto L_0x0080;
                case 41: goto L_0x0080;
                case 42: goto L_0x0080;
                case 43: goto L_0x0080;
                case 44: goto L_0x0080;
                case 45: goto L_0x0080;
                case 46: goto L_0x0080;
                case 47: goto L_0x0080;
                case 48: goto L_0x0080;
                case 49: goto L_0x0080;
                case 50: goto L_0x006b;
                case 51: goto L_0x0059;
                case 52: goto L_0x0059;
                case 53: goto L_0x0059;
                case 54: goto L_0x0059;
                case 55: goto L_0x0059;
                case 56: goto L_0x0059;
                case 57: goto L_0x0059;
                case 58: goto L_0x0059;
                case 59: goto L_0x0059;
                case 60: goto L_0x0026;
                case 61: goto L_0x001f;
                case 62: goto L_0x001f;
                case 63: goto L_0x001f;
                case 64: goto L_0x001f;
                case 65: goto L_0x001f;
                case 66: goto L_0x001f;
                case 67: goto L_0x001f;
                case 68: goto L_0x0026;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0151
        L_0x001f:
            boolean r1 = r8.u(r6, r0, r10)
            if (r1 == 0) goto L_0x0151
            goto L_0x005f
        L_0x0026:
            int r2 = r8.N(r0)
            r1 = r1[r0]
            r2 = r2 & r3
            long r2 = (long) r2
            boolean r4 = r8.u(r1, r0, r10)
            if (r4 != 0) goto L_0x0036
            goto L_0x0151
        L_0x0036:
            boolean r4 = r8.u(r1, r0, r9)
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = com.google.protobuf.q1.p(r2, r9)
            goto L_0x0042
        L_0x0041:
            r4 = 0
        L_0x0042:
            java.lang.Object r5 = com.google.protobuf.q1.p(r2, r10)
            if (r4 == 0) goto L_0x004f
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = com.google.protobuf.a0.c(r4, r5)
            goto L_0x0051
        L_0x004f:
            if (r5 == 0) goto L_0x0151
        L_0x0051:
            com.google.protobuf.q1.z(r2, r9, r5)
            r8.L(r1, r0, r9)
            goto L_0x0151
        L_0x0059:
            boolean r1 = r8.u(r6, r0, r10)
            if (r1 == 0) goto L_0x0151
        L_0x005f:
            java.lang.Object r1 = com.google.protobuf.q1.p(r4, r10)
            com.google.protobuf.q1.z(r4, r9, r1)
            r8.L(r6, r0, r9)
            goto L_0x0151
        L_0x006b:
            java.lang.Class<?> r1 = com.google.protobuf.g1.f3638a
            java.lang.Object r1 = com.google.protobuf.q1.p(r4, r9)
            java.lang.Object r2 = com.google.protobuf.q1.p(r4, r10)
            com.google.protobuf.m0 r3 = r8.f3796q
            java.lang.Object r1 = r3.a(r1, r2)
            com.google.protobuf.q1.z(r4, r9, r1)
            goto L_0x0151
        L_0x0080:
            com.google.protobuf.h0 r1 = r8.f3793n
            r1.b(r4, r9, r10)
            goto L_0x0151
        L_0x0087:
            boolean r1 = r8.t(r0, r10)
            if (r1 == 0) goto L_0x0151
            goto L_0x012b
        L_0x008f:
            boolean r1 = r8.t(r0, r10)
            if (r1 == 0) goto L_0x0151
            goto L_0x0116
        L_0x0097:
            boolean r1 = r8.t(r0, r10)
            if (r1 == 0) goto L_0x0151
            goto L_0x012b
        L_0x009f:
            boolean r1 = r8.t(r0, r10)
            if (r1 == 0) goto L_0x0151
            goto L_0x0116
        L_0x00a7:
            boolean r1 = r8.t(r0, r10)
            if (r1 == 0) goto L_0x0151
            goto L_0x0116
        L_0x00af:
            boolean r1 = r8.t(r0, r10)
            if (r1 == 0) goto L_0x0151
            goto L_0x0116
        L_0x00b6:
            boolean r1 = r8.t(r0, r10)
            if (r1 == 0) goto L_0x0151
            goto L_0x00ec
        L_0x00bd:
            int r1 = r8.N(r0)
            r1 = r1 & r3
            long r1 = (long) r1
            boolean r3 = r8.t(r0, r10)
            if (r3 != 0) goto L_0x00cb
            goto L_0x0151
        L_0x00cb:
            java.lang.Object r3 = com.google.protobuf.q1.p(r1, r9)
            java.lang.Object r4 = com.google.protobuf.q1.p(r1, r10)
            if (r3 == 0) goto L_0x00dc
            if (r4 == 0) goto L_0x00dc
            java.lang.Object r4 = com.google.protobuf.a0.c(r3, r4)
            goto L_0x00de
        L_0x00dc:
            if (r4 == 0) goto L_0x0151
        L_0x00de:
            com.google.protobuf.q1.z(r1, r9, r4)
            r8.K(r0, r9)
            goto L_0x0151
        L_0x00e6:
            boolean r1 = r8.t(r0, r10)
            if (r1 == 0) goto L_0x0151
        L_0x00ec:
            java.lang.Object r1 = com.google.protobuf.q1.p(r4, r10)
            com.google.protobuf.q1.z(r4, r9, r1)
            goto L_0x014e
        L_0x00f4:
            boolean r1 = r8.t(r0, r10)
            if (r1 == 0) goto L_0x0151
            boolean r1 = com.google.protobuf.q1.g(r4, r10)
            com.google.protobuf.q1.r(r9, r4, r1)
            goto L_0x014e
        L_0x0102:
            boolean r1 = r8.t(r0, r10)
            if (r1 == 0) goto L_0x0151
            goto L_0x0116
        L_0x0109:
            boolean r1 = r8.t(r0, r10)
            if (r1 == 0) goto L_0x0151
            goto L_0x012b
        L_0x0110:
            boolean r1 = r8.t(r0, r10)
            if (r1 == 0) goto L_0x0151
        L_0x0116:
            int r1 = com.google.protobuf.q1.n(r4, r10)
            com.google.protobuf.q1.x(r1, r4, r9)
            goto L_0x014e
        L_0x011e:
            boolean r1 = r8.t(r0, r10)
            if (r1 == 0) goto L_0x0151
            goto L_0x012b
        L_0x0125:
            boolean r1 = r8.t(r0, r10)
            if (r1 == 0) goto L_0x0151
        L_0x012b:
            long r1 = com.google.protobuf.q1.o(r4, r10)
            com.google.protobuf.q1.y(r9, r4, r1)
            goto L_0x014e
        L_0x0133:
            boolean r1 = r8.t(r0, r10)
            if (r1 == 0) goto L_0x0151
            float r1 = com.google.protobuf.q1.m(r4, r10)
            com.google.protobuf.q1.w(r9, r4, r1)
            goto L_0x014e
        L_0x0141:
            boolean r1 = r8.t(r0, r10)
            if (r1 == 0) goto L_0x0151
            double r1 = com.google.protobuf.q1.l(r4, r10)
            com.google.protobuf.q1.v(r9, r4, r1)
        L_0x014e:
            r8.K(r0, r9)
        L_0x0151:
            int r0 = r0 + 3
            goto L_0x0004
        L_0x0155:
            java.lang.Class<?> r0 = com.google.protobuf.g1.f3638a
            com.google.protobuf.m1<?, ?> r0 = r8.f3794o
            java.lang.Object r1 = r0.g(r9)
            java.lang.Object r2 = r0.g(r10)
            java.lang.Object r1 = r0.k(r1, r2)
            r0.o(r9, r1)
            boolean r0 = r8.f3785f
            if (r0 == 0) goto L_0x0171
            com.google.protobuf.r<?> r8 = r8.f3795p
            com.google.protobuf.g1.C(r8, r9, r10)
        L_0x0171:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.a(java.lang.Object, java.lang.Object):void");
    }

    public final void b(T t8) {
        int[] iArr;
        int i8;
        int i9 = this.f3790k;
        while (true) {
            iArr = this.f3789j;
            i8 = this.f3791l;
            if (i9 >= i8) {
                break;
            }
            long N = (long) (N(iArr[i9]) & 1048575);
            Object p8 = q1.p(N, t8);
            if (p8 != null) {
                q1.z(N, t8, this.f3796q.d(p8));
            }
            i9++;
        }
        int length = iArr.length;
        while (i8 < length) {
            this.f3793n.a((long) iArr[i8], t8);
            i8++;
        }
        this.f3794o.j(t8);
        if (this.f3785f) {
            this.f3795p.f(t8);
        }
    }

    public final boolean c(T t8) {
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            boolean z8 = true;
            if (i9 >= this.f3790k) {
                return !this.f3785f || this.f3795p.c(t8).k();
            }
            int i11 = this.f3789j[i9];
            int[] iArr = this.f3781a;
            int i12 = iArr[i11];
            int N = N(i11);
            int i13 = iArr[i11 + 2];
            int i14 = i13 & 1048575;
            int i15 = 1 << (i13 >>> 20);
            if (i14 != i8) {
                if (i14 != 1048575) {
                    i10 = f3780s.getInt(t8, (long) i14);
                }
                i8 = i14;
            }
            if ((268435456 & N) != 0) {
                if (!(i8 == 1048575 ? t(i11, t8) : (i10 & i15) != 0)) {
                    return false;
                }
            }
            int i16 = (267386880 & N) >>> 20;
            if (i16 == 9 || i16 == 17) {
                if (i8 == 1048575) {
                    z8 = t(i11, t8);
                } else if ((i15 & i10) == 0) {
                    z8 = false;
                }
                if (z8 && !p(i11).c(q1.p((long) (N & 1048575), t8))) {
                    return false;
                }
            } else {
                if (i16 != 27) {
                    if (i16 == 60 || i16 == 68) {
                        if (u(i12, i11, t8) && !p(i11).c(q1.p((long) (N & 1048575), t8))) {
                            return false;
                        }
                    } else if (i16 != 49) {
                        if (i16 != 50) {
                            continue;
                        } else {
                            Object p8 = q1.p((long) (N & 1048575), t8);
                            m0 m0Var = this.f3796q;
                            Map<?, ?> g9 = m0Var.g(p8);
                            if (!g9.isEmpty() && m0Var.e(o(i11)).f3710c.f3761f == t1.MESSAGE) {
                                Iterator<?> it = g9.values().iterator();
                                f1<?> f1Var = null;
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    Object next = it.next();
                                    if (f1Var == null) {
                                        f1Var = b1.f3596c.a(next.getClass());
                                    }
                                    if (!f1Var.c(next)) {
                                        z8 = false;
                                        break;
                                    }
                                }
                            }
                            if (!z8) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) q1.p((long) (N & 1048575), t8);
                if (!list.isEmpty()) {
                    f1 p9 = p(i11);
                    int i17 = 0;
                    while (true) {
                        if (i17 >= list.size()) {
                            break;
                        } else if (!p9.c(list.get(i17))) {
                            z8 = false;
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                if (!z8) {
                    return false;
                }
            }
            i9++;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (com.google.protobuf.g1.D(com.google.protobuf.q1.p(r7, r11), com.google.protobuf.q1.p(r7, r12)) != false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        if (com.google.protobuf.g1.D(com.google.protobuf.q1.p(r7, r11), com.google.protobuf.q1.p(r7, r12)) != false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        if (com.google.protobuf.q1.o(r7, r11) == com.google.protobuf.q1.o(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
        if (com.google.protobuf.q1.n(r7, r11) == com.google.protobuf.q1.n(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        if (com.google.protobuf.q1.o(r7, r11) == com.google.protobuf.q1.o(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ad, code lost:
        if (com.google.protobuf.q1.n(r7, r11) == com.google.protobuf.q1.n(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bf, code lost:
        if (com.google.protobuf.q1.n(r7, r11) == com.google.protobuf.q1.n(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d1, code lost:
        if (com.google.protobuf.q1.n(r7, r11) == com.google.protobuf.q1.n(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e7, code lost:
        if (com.google.protobuf.g1.D(com.google.protobuf.q1.p(r7, r11), com.google.protobuf.q1.p(r7, r12)) != false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fd, code lost:
        if (com.google.protobuf.g1.D(com.google.protobuf.q1.p(r7, r11), com.google.protobuf.q1.p(r7, r12)) != false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0113, code lost:
        if (com.google.protobuf.g1.D(com.google.protobuf.q1.p(r7, r11), com.google.protobuf.q1.p(r7, r12)) != false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0125, code lost:
        if (com.google.protobuf.q1.g(r7, r11) == com.google.protobuf.q1.g(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0137, code lost:
        if (com.google.protobuf.q1.n(r7, r11) == com.google.protobuf.q1.n(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014b, code lost:
        if (com.google.protobuf.q1.o(r7, r11) == com.google.protobuf.q1.o(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015d, code lost:
        if (com.google.protobuf.q1.n(r7, r11) == com.google.protobuf.q1.n(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0170, code lost:
        if (com.google.protobuf.q1.o(r7, r11) == com.google.protobuf.q1.o(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0183, code lost:
        if (com.google.protobuf.q1.o(r7, r11) == com.google.protobuf.q1.o(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019c, code lost:
        if (java.lang.Float.floatToIntBits(com.google.protobuf.q1.m(r7, r11)) == java.lang.Float.floatToIntBits(com.google.protobuf.q1.m(r7, r12))) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b7, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.protobuf.q1.l(r7, r11)) == java.lang.Double.doubleToLongBits(com.google.protobuf.q1.l(r7, r12))) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ba, code lost:
        r4 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(T r11, T r12) {
        /*
            r10 = this;
            int[] r0 = r10.f3781a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x0005:
            r4 = 1
            if (r3 >= r1) goto L_0x01c2
            int r5 = r10.N(r3)
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r5 & r6
            long r7 = (long) r7
            r9 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r9
            int r5 = r5 >>> 20
            switch(r5) {
                case 0: goto L_0x019f;
                case 1: goto L_0x0186;
                case 2: goto L_0x0173;
                case 3: goto L_0x0160;
                case 4: goto L_0x014f;
                case 5: goto L_0x013b;
                case 6: goto L_0x0129;
                case 7: goto L_0x0117;
                case 8: goto L_0x0101;
                case 9: goto L_0x00eb;
                case 10: goto L_0x00d5;
                case 11: goto L_0x00c3;
                case 12: goto L_0x00b1;
                case 13: goto L_0x009f;
                case 14: goto L_0x008b;
                case 15: goto L_0x0079;
                case 16: goto L_0x0065;
                case 17: goto L_0x004f;
                case 18: goto L_0x0041;
                case 19: goto L_0x0041;
                case 20: goto L_0x0041;
                case 21: goto L_0x0041;
                case 22: goto L_0x0041;
                case 23: goto L_0x0041;
                case 24: goto L_0x0041;
                case 25: goto L_0x0041;
                case 26: goto L_0x0041;
                case 27: goto L_0x0041;
                case 28: goto L_0x0041;
                case 29: goto L_0x0041;
                case 30: goto L_0x0041;
                case 31: goto L_0x0041;
                case 32: goto L_0x0041;
                case 33: goto L_0x0041;
                case 34: goto L_0x0041;
                case 35: goto L_0x0041;
                case 36: goto L_0x0041;
                case 37: goto L_0x0041;
                case 38: goto L_0x0041;
                case 39: goto L_0x0041;
                case 40: goto L_0x0041;
                case 41: goto L_0x0041;
                case 42: goto L_0x0041;
                case 43: goto L_0x0041;
                case 44: goto L_0x0041;
                case 45: goto L_0x0041;
                case 46: goto L_0x0041;
                case 47: goto L_0x0041;
                case 48: goto L_0x0041;
                case 49: goto L_0x0041;
                case 50: goto L_0x0041;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01bb
        L_0x001c:
            int r5 = r3 + 2
            r5 = r0[r5]
            r5 = r5 & r6
            long r5 = (long) r5
            int r9 = com.google.protobuf.q1.n(r5, r11)
            int r5 = com.google.protobuf.q1.n(r5, r12)
            if (r9 != r5) goto L_0x002e
            r5 = r4
            goto L_0x002f
        L_0x002e:
            r5 = r2
        L_0x002f:
            if (r5 == 0) goto L_0x01ba
            java.lang.Object r5 = com.google.protobuf.q1.p(r7, r11)
            java.lang.Object r6 = com.google.protobuf.q1.p(r7, r12)
            boolean r5 = com.google.protobuf.g1.D(r5, r6)
            if (r5 == 0) goto L_0x01ba
            goto L_0x01bb
        L_0x0041:
            java.lang.Object r4 = com.google.protobuf.q1.p(r7, r11)
            java.lang.Object r5 = com.google.protobuf.q1.p(r7, r12)
            boolean r4 = com.google.protobuf.g1.D(r4, r5)
            goto L_0x01bb
        L_0x004f:
            boolean r5 = r10.k(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            java.lang.Object r5 = com.google.protobuf.q1.p(r7, r11)
            java.lang.Object r6 = com.google.protobuf.q1.p(r7, r12)
            boolean r5 = com.google.protobuf.g1.D(r5, r6)
            if (r5 == 0) goto L_0x01ba
            goto L_0x01bb
        L_0x0065:
            boolean r5 = r10.k(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            long r5 = com.google.protobuf.q1.o(r7, r11)
            long r7 = com.google.protobuf.q1.o(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x01ba
            goto L_0x01bb
        L_0x0079:
            boolean r5 = r10.k(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            int r5 = com.google.protobuf.q1.n(r7, r11)
            int r6 = com.google.protobuf.q1.n(r7, r12)
            if (r5 != r6) goto L_0x01ba
            goto L_0x01bb
        L_0x008b:
            boolean r5 = r10.k(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            long r5 = com.google.protobuf.q1.o(r7, r11)
            long r7 = com.google.protobuf.q1.o(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x01ba
            goto L_0x01bb
        L_0x009f:
            boolean r5 = r10.k(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            int r5 = com.google.protobuf.q1.n(r7, r11)
            int r6 = com.google.protobuf.q1.n(r7, r12)
            if (r5 != r6) goto L_0x01ba
            goto L_0x01bb
        L_0x00b1:
            boolean r5 = r10.k(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            int r5 = com.google.protobuf.q1.n(r7, r11)
            int r6 = com.google.protobuf.q1.n(r7, r12)
            if (r5 != r6) goto L_0x01ba
            goto L_0x01bb
        L_0x00c3:
            boolean r5 = r10.k(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            int r5 = com.google.protobuf.q1.n(r7, r11)
            int r6 = com.google.protobuf.q1.n(r7, r12)
            if (r5 != r6) goto L_0x01ba
            goto L_0x01bb
        L_0x00d5:
            boolean r5 = r10.k(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            java.lang.Object r5 = com.google.protobuf.q1.p(r7, r11)
            java.lang.Object r6 = com.google.protobuf.q1.p(r7, r12)
            boolean r5 = com.google.protobuf.g1.D(r5, r6)
            if (r5 == 0) goto L_0x01ba
            goto L_0x01bb
        L_0x00eb:
            boolean r5 = r10.k(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            java.lang.Object r5 = com.google.protobuf.q1.p(r7, r11)
            java.lang.Object r6 = com.google.protobuf.q1.p(r7, r12)
            boolean r5 = com.google.protobuf.g1.D(r5, r6)
            if (r5 == 0) goto L_0x01ba
            goto L_0x01bb
        L_0x0101:
            boolean r5 = r10.k(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            java.lang.Object r5 = com.google.protobuf.q1.p(r7, r11)
            java.lang.Object r6 = com.google.protobuf.q1.p(r7, r12)
            boolean r5 = com.google.protobuf.g1.D(r5, r6)
            if (r5 == 0) goto L_0x01ba
            goto L_0x01bb
        L_0x0117:
            boolean r5 = r10.k(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            boolean r5 = com.google.protobuf.q1.g(r7, r11)
            boolean r6 = com.google.protobuf.q1.g(r7, r12)
            if (r5 != r6) goto L_0x01ba
            goto L_0x01bb
        L_0x0129:
            boolean r5 = r10.k(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            int r5 = com.google.protobuf.q1.n(r7, r11)
            int r6 = com.google.protobuf.q1.n(r7, r12)
            if (r5 != r6) goto L_0x01ba
            goto L_0x01bb
        L_0x013b:
            boolean r5 = r10.k(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            long r5 = com.google.protobuf.q1.o(r7, r11)
            long r7 = com.google.protobuf.q1.o(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x01ba
            goto L_0x01bb
        L_0x014f:
            boolean r5 = r10.k(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            int r5 = com.google.protobuf.q1.n(r7, r11)
            int r6 = com.google.protobuf.q1.n(r7, r12)
            if (r5 != r6) goto L_0x01ba
            goto L_0x01bb
        L_0x0160:
            boolean r5 = r10.k(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            long r5 = com.google.protobuf.q1.o(r7, r11)
            long r7 = com.google.protobuf.q1.o(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x01ba
            goto L_0x01bb
        L_0x0173:
            boolean r5 = r10.k(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            long r5 = com.google.protobuf.q1.o(r7, r11)
            long r7 = com.google.protobuf.q1.o(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x01ba
            goto L_0x01bb
        L_0x0186:
            boolean r5 = r10.k(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            float r5 = com.google.protobuf.q1.m(r7, r11)
            int r5 = java.lang.Float.floatToIntBits(r5)
            float r6 = com.google.protobuf.q1.m(r7, r12)
            int r6 = java.lang.Float.floatToIntBits(r6)
            if (r5 != r6) goto L_0x01ba
            goto L_0x01bb
        L_0x019f:
            boolean r5 = r10.k(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            double r5 = com.google.protobuf.q1.l(r7, r11)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            double r7 = com.google.protobuf.q1.l(r7, r12)
            long r7 = java.lang.Double.doubleToLongBits(r7)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x01ba
            goto L_0x01bb
        L_0x01ba:
            r4 = r2
        L_0x01bb:
            if (r4 != 0) goto L_0x01be
            return r2
        L_0x01be:
            int r3 = r3 + 3
            goto L_0x0005
        L_0x01c2:
            com.google.protobuf.m1<?, ?> r0 = r10.f3794o
            java.lang.Object r1 = r0.g(r11)
            java.lang.Object r0 = r0.g(r12)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01d3
            return r2
        L_0x01d3:
            boolean r0 = r10.f3785f
            if (r0 == 0) goto L_0x01e6
            com.google.protobuf.r<?> r10 = r10.f3795p
            com.google.protobuf.u r11 = r10.c(r11)
            com.google.protobuf.u r10 = r10.c(r12)
            boolean r10 = r11.equals(r10)
            return r10
        L_0x01e6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.d(java.lang.Object, java.lang.Object):boolean");
    }

    public final int e(T t8) {
        return this.f3787h ? s(t8) : r(t8);
    }

    public final T f() {
        return this.f3792m.a(this.e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        r4 = com.google.protobuf.q1.p(r6, r10);
        r3 = r3 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        r3 = r3 * 53;
        r4 = y(r6, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ab, code lost:
        r3 = r3 * 53;
        r4 = z(r6, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dd, code lost:
        if (r4 != null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e0, code lost:
        r3 = r3 * 53;
        r4 = com.google.protobuf.q1.p(r6, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e6, code lost:
        r4 = r4.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ef, code lost:
        if (r4 != null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f1, code lost:
        r4 = r4.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f6, code lost:
        r4 = 37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f8, code lost:
        r3 = r3 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fb, code lost:
        r3 = r3 * 53;
        r4 = ((java.lang.String) com.google.protobuf.q1.p(r6, r10)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010e, code lost:
        r4 = com.google.protobuf.a0.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0127, code lost:
        r4 = java.lang.Float.floatToIntBits(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0132, code lost:
        r4 = java.lang.Double.doubleToLongBits(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0136, code lost:
        r4 = com.google.protobuf.a0.b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x013a, code lost:
        r3 = r3 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013b, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(T r10) {
        /*
            r9 = this;
            int[] r0 = r9.f3781a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x0005:
            if (r2 >= r1) goto L_0x013f
            int r4 = r9.N(r2)
            r5 = r0[r2]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r4
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x012c;
                case 1: goto L_0x0121;
                case 2: goto L_0x011a;
                case 3: goto L_0x011a;
                case 4: goto L_0x0113;
                case 5: goto L_0x011a;
                case 6: goto L_0x0113;
                case 7: goto L_0x0108;
                case 8: goto L_0x00fb;
                case 9: goto L_0x00eb;
                case 10: goto L_0x00e0;
                case 11: goto L_0x0113;
                case 12: goto L_0x0113;
                case 13: goto L_0x0113;
                case 14: goto L_0x011a;
                case 15: goto L_0x0113;
                case 16: goto L_0x011a;
                case 17: goto L_0x00d9;
                case 18: goto L_0x00e0;
                case 19: goto L_0x00e0;
                case 20: goto L_0x00e0;
                case 21: goto L_0x00e0;
                case 22: goto L_0x00e0;
                case 23: goto L_0x00e0;
                case 24: goto L_0x00e0;
                case 25: goto L_0x00e0;
                case 26: goto L_0x00e0;
                case 27: goto L_0x00e0;
                case 28: goto L_0x00e0;
                case 29: goto L_0x00e0;
                case 30: goto L_0x00e0;
                case 31: goto L_0x00e0;
                case 32: goto L_0x00e0;
                case 33: goto L_0x00e0;
                case 34: goto L_0x00e0;
                case 35: goto L_0x00e0;
                case 36: goto L_0x00e0;
                case 37: goto L_0x00e0;
                case 38: goto L_0x00e0;
                case 39: goto L_0x00e0;
                case 40: goto L_0x00e0;
                case 41: goto L_0x00e0;
                case 42: goto L_0x00e0;
                case 43: goto L_0x00e0;
                case 44: goto L_0x00e0;
                case 45: goto L_0x00e0;
                case 46: goto L_0x00e0;
                case 47: goto L_0x00e0;
                case 48: goto L_0x00e0;
                case 49: goto L_0x00e0;
                case 50: goto L_0x00e0;
                case 51: goto L_0x00c6;
                case 52: goto L_0x00b3;
                case 53: goto L_0x00a5;
                case 54: goto L_0x009e;
                case 55: goto L_0x0090;
                case 56: goto L_0x0089;
                case 57: goto L_0x0082;
                case 58: goto L_0x006e;
                case 59: goto L_0x0066;
                case 60: goto L_0x0058;
                case 61: goto L_0x0050;
                case 62: goto L_0x0049;
                case 63: goto L_0x0042;
                case 64: goto L_0x003b;
                case 65: goto L_0x0033;
                case 66: goto L_0x002b;
                case 67: goto L_0x0023;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x013b
        L_0x001c:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x005e
        L_0x0023:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x00ab
        L_0x002b:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x0096
        L_0x0033:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x00ab
        L_0x003b:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x0096
        L_0x0042:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x0096
        L_0x0049:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x0096
        L_0x0050:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x00e0
        L_0x0058:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
        L_0x005e:
            java.lang.Object r4 = com.google.protobuf.q1.p(r6, r10)
            int r3 = r3 * 53
            goto L_0x00e6
        L_0x0066:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x00fb
        L_0x006e:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.protobuf.q1.p(r6, r10)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            goto L_0x010e
        L_0x0082:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x0096
        L_0x0089:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x00ab
        L_0x0090:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
        L_0x0096:
            int r3 = r3 * 53
            int r4 = y(r6, r10)
            goto L_0x013a
        L_0x009e:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x00ab
        L_0x00a5:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
        L_0x00ab:
            int r3 = r3 * 53
            long r4 = z(r6, r10)
            goto L_0x0136
        L_0x00b3:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.protobuf.q1.p(r6, r10)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            goto L_0x0127
        L_0x00c6:
            boolean r4 = r9.u(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.protobuf.q1.p(r6, r10)
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            goto L_0x0132
        L_0x00d9:
            java.lang.Object r4 = com.google.protobuf.q1.p(r6, r10)
            if (r4 == 0) goto L_0x00f6
            goto L_0x00f1
        L_0x00e0:
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.protobuf.q1.p(r6, r10)
        L_0x00e6:
            int r4 = r4.hashCode()
            goto L_0x013a
        L_0x00eb:
            java.lang.Object r4 = com.google.protobuf.q1.p(r6, r10)
            if (r4 == 0) goto L_0x00f6
        L_0x00f1:
            int r4 = r4.hashCode()
            goto L_0x00f8
        L_0x00f6:
            r4 = 37
        L_0x00f8:
            int r3 = r3 * 53
            goto L_0x013a
        L_0x00fb:
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.protobuf.q1.p(r6, r10)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.hashCode()
            goto L_0x013a
        L_0x0108:
            int r3 = r3 * 53
            boolean r4 = com.google.protobuf.q1.g(r6, r10)
        L_0x010e:
            int r4 = com.google.protobuf.a0.a(r4)
            goto L_0x013a
        L_0x0113:
            int r3 = r3 * 53
            int r4 = com.google.protobuf.q1.n(r6, r10)
            goto L_0x013a
        L_0x011a:
            int r3 = r3 * 53
            long r4 = com.google.protobuf.q1.o(r6, r10)
            goto L_0x0136
        L_0x0121:
            int r3 = r3 * 53
            float r4 = com.google.protobuf.q1.m(r6, r10)
        L_0x0127:
            int r4 = java.lang.Float.floatToIntBits(r4)
            goto L_0x013a
        L_0x012c:
            int r3 = r3 * 53
            double r4 = com.google.protobuf.q1.l(r6, r10)
        L_0x0132:
            long r4 = java.lang.Double.doubleToLongBits(r4)
        L_0x0136:
            int r4 = com.google.protobuf.a0.b(r4)
        L_0x013a:
            int r3 = r3 + r4
        L_0x013b:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x013f:
            int r3 = r3 * 53
            com.google.protobuf.m1<?, ?> r0 = r9.f3794o
            java.lang.Object r0 = r0.g(r10)
            int r0 = r0.hashCode()
            int r3 = r3 + r0
            boolean r0 = r9.f3785f
            if (r0 == 0) goto L_0x015d
            int r3 = r3 * 53
            com.google.protobuf.r<?> r9 = r9.f3795p
            com.google.protobuf.u r9 = r9.c(r10)
            int r9 = r9.hashCode()
            int r3 = r3 + r9
        L_0x015d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.g(java.lang.Object):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x056c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(java.lang.Object r18, com.google.protobuf.m r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r19.getClass()
            boolean r3 = r0.f3787h
            if (r3 == 0) goto L_0x0589
            boolean r4 = r0.f3785f
            com.google.protobuf.r<?> r5 = r0.f3795p
            if (r4 == 0) goto L_0x0028
            com.google.protobuf.u r4 = r5.c(r1)
            boolean r6 = r4.j()
            if (r6 != 0) goto L_0x0028
            java.util.Iterator r4 = r4.m()
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x002a
        L_0x0028:
            r4 = 0
            r6 = 0
        L_0x002a:
            int[] r7 = r0.f3781a
            int r8 = r7.length
            r9 = 0
            r10 = r9
        L_0x002f:
            if (r10 >= r8) goto L_0x0568
            int r11 = r0.N(r10)
            r12 = r7[r10]
        L_0x0037:
            if (r6 == 0) goto L_0x0051
            int r13 = r5.a(r6)
            if (r13 > r12) goto L_0x0051
            r5.j(r2, r6)
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x004f
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x0037
        L_0x004f:
            r6 = 0
            goto L_0x0037
        L_0x0051:
            r13 = 267386880(0xff00000, float:2.3665827E-29)
            r13 = r13 & r11
            int r13 = r13 >>> 20
            r14 = 1
            r15 = 1048575(0xfffff, float:1.469367E-39)
            switch(r13) {
                case 0: goto L_0x0550;
                case 1: goto L_0x053d;
                case 2: goto L_0x052a;
                case 3: goto L_0x0517;
                case 4: goto L_0x0504;
                case 5: goto L_0x04f1;
                case 6: goto L_0x04dd;
                case 7: goto L_0x04c9;
                case 8: goto L_0x04b5;
                case 9: goto L_0x049d;
                case 10: goto L_0x0487;
                case 11: goto L_0x0473;
                case 12: goto L_0x045f;
                case 13: goto L_0x044b;
                case 14: goto L_0x0437;
                case 15: goto L_0x0423;
                case 16: goto L_0x040f;
                case 17: goto L_0x03f7;
                case 18: goto L_0x03e5;
                case 19: goto L_0x03d3;
                case 20: goto L_0x03c1;
                case 21: goto L_0x03af;
                case 22: goto L_0x039d;
                case 23: goto L_0x038b;
                case 24: goto L_0x0379;
                case 25: goto L_0x0367;
                case 26: goto L_0x0355;
                case 27: goto L_0x033f;
                case 28: goto L_0x032d;
                case 29: goto L_0x031b;
                case 30: goto L_0x0309;
                case 31: goto L_0x02f7;
                case 32: goto L_0x02e5;
                case 33: goto L_0x02d3;
                case 34: goto L_0x02c1;
                case 35: goto L_0x02af;
                case 36: goto L_0x029d;
                case 37: goto L_0x028b;
                case 38: goto L_0x0279;
                case 39: goto L_0x0267;
                case 40: goto L_0x0255;
                case 41: goto L_0x0243;
                case 42: goto L_0x0231;
                case 43: goto L_0x021f;
                case 44: goto L_0x020d;
                case 45: goto L_0x01fb;
                case 46: goto L_0x01e9;
                case 47: goto L_0x01d7;
                case 48: goto L_0x01c6;
                case 49: goto L_0x01b3;
                case 50: goto L_0x01a8;
                case 51: goto L_0x0191;
                case 52: goto L_0x017a;
                case 53: goto L_0x0169;
                case 54: goto L_0x0158;
                case 55: goto L_0x0147;
                case 56: goto L_0x0136;
                case 57: goto L_0x0125;
                case 58: goto L_0x010e;
                case 59: goto L_0x00fd;
                case 60: goto L_0x00e8;
                case 61: goto L_0x00d5;
                case 62: goto L_0x00c5;
                case 63: goto L_0x00b5;
                case 64: goto L_0x00a5;
                case 65: goto L_0x0095;
                case 66: goto L_0x0085;
                case 67: goto L_0x0075;
                case 68: goto L_0x0061;
                default: goto L_0x005d;
            }
        L_0x005d:
            r16 = r4
            goto L_0x0562
        L_0x0061:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005d
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.protobuf.q1.p(r13, r1)
            com.google.protobuf.f1 r13 = r0.p(r10)
            r2.h(r12, r13, r11)
            goto L_0x005d
        L_0x0075:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005d
            r11 = r11 & r15
            long r13 = (long) r11
            long r13 = z(r13, r1)
            r2.p(r12, r13)
            goto L_0x005d
        L_0x0085:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005d
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = y(r13, r1)
            r2.o(r12, r11)
            goto L_0x005d
        L_0x0095:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005d
            r11 = r11 & r15
            long r13 = (long) r11
            long r13 = z(r13, r1)
            r2.n(r12, r13)
            goto L_0x005d
        L_0x00a5:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005d
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = y(r13, r1)
            r2.m(r12, r11)
            goto L_0x005d
        L_0x00b5:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005d
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = y(r13, r1)
            r2.d(r12, r11)
            goto L_0x005d
        L_0x00c5:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005d
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = y(r13, r1)
            r2.q(r12, r11)
            goto L_0x005d
        L_0x00d5:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005d
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.protobuf.q1.p(r13, r1)
            com.google.protobuf.i r11 = (com.google.protobuf.i) r11
            r2.b(r12, r11)
            goto L_0x005d
        L_0x00e8:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005d
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.protobuf.q1.p(r13, r1)
            com.google.protobuf.f1 r13 = r0.p(r10)
            r2.k(r12, r13, r11)
            goto L_0x005d
        L_0x00fd:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005d
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.protobuf.q1.p(r13, r1)
            Q(r12, r11, r2)
            goto L_0x005d
        L_0x010e:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005d
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.protobuf.q1.p(r13, r1)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r2.a(r12, r11)
            goto L_0x005d
        L_0x0125:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005d
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = y(r13, r1)
            r2.e(r12, r11)
            goto L_0x005d
        L_0x0136:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005d
            r11 = r11 & r15
            long r13 = (long) r11
            long r13 = z(r13, r1)
            r2.f(r12, r13)
            goto L_0x005d
        L_0x0147:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005d
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = y(r13, r1)
            r2.i(r12, r11)
            goto L_0x005d
        L_0x0158:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005d
            r11 = r11 & r15
            long r13 = (long) r11
            long r13 = z(r13, r1)
            r2.r(r12, r13)
            goto L_0x005d
        L_0x0169:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005d
            r11 = r11 & r15
            long r13 = (long) r11
            long r13 = z(r13, r1)
            r2.j(r12, r13)
            goto L_0x005d
        L_0x017a:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005d
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.protobuf.q1.p(r13, r1)
            java.lang.Float r11 = (java.lang.Float) r11
            float r11 = r11.floatValue()
            r2.g(r12, r11)
            goto L_0x005d
        L_0x0191:
            boolean r13 = r0.u(r12, r10, r1)
            if (r13 == 0) goto L_0x005d
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.protobuf.q1.p(r13, r1)
            java.lang.Double r11 = (java.lang.Double) r11
            double r13 = r11.doubleValue()
            r2.c(r12, r13)
            goto L_0x005d
        L_0x01a8:
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.protobuf.q1.p(r13, r1)
            r0.P(r2, r12, r11, r10)
            goto L_0x005d
        L_0x01b3:
            r12 = r7[r10]
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = com.google.protobuf.q1.p(r13, r1)
            java.util.List r11 = (java.util.List) r11
            com.google.protobuf.f1 r13 = r0.p(r10)
            com.google.protobuf.g1.M(r12, r11, r2, r13)
            goto L_0x005d
        L_0x01c6:
            r12 = r7[r10]
            r11 = r11 & r15
            r16 = r4
            long r3 = (long) r11
            java.lang.Object r3 = com.google.protobuf.q1.p(r3, r1)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.g1.T(r12, r3, r2, r14)
            goto L_0x0562
        L_0x01d7:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.S(r3, r4, r2, r14)
            goto L_0x0562
        L_0x01e9:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.R(r3, r4, r2, r14)
            goto L_0x0562
        L_0x01fb:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.Q(r3, r4, r2, r14)
            goto L_0x0562
        L_0x020d:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.I(r3, r4, r2, r14)
            goto L_0x0562
        L_0x021f:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.V(r3, r4, r2, r14)
            goto L_0x0562
        L_0x0231:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.F(r3, r4, r2, r14)
            goto L_0x0562
        L_0x0243:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.J(r3, r4, r2, r14)
            goto L_0x0562
        L_0x0255:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.K(r3, r4, r2, r14)
            goto L_0x0562
        L_0x0267:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.N(r3, r4, r2, r14)
            goto L_0x0562
        L_0x0279:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.W(r3, r4, r2, r14)
            goto L_0x0562
        L_0x028b:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.O(r3, r4, r2, r14)
            goto L_0x0562
        L_0x029d:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.L(r3, r4, r2, r14)
            goto L_0x0562
        L_0x02af:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.H(r3, r4, r2, r14)
            goto L_0x0562
        L_0x02c1:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.T(r3, r4, r2, r9)
            goto L_0x0562
        L_0x02d3:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.S(r3, r4, r2, r9)
            goto L_0x0562
        L_0x02e5:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.R(r3, r4, r2, r9)
            goto L_0x0562
        L_0x02f7:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.Q(r3, r4, r2, r9)
            goto L_0x0562
        L_0x0309:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.I(r3, r4, r2, r9)
            goto L_0x0562
        L_0x031b:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.V(r3, r4, r2, r9)
            goto L_0x0562
        L_0x032d:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.G(r3, r4, r2)
            goto L_0x0562
        L_0x033f:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.f1 r11 = r0.p(r10)
            com.google.protobuf.g1.P(r3, r4, r2, r11)
            goto L_0x0562
        L_0x0355:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.U(r3, r4, r2)
            goto L_0x0562
        L_0x0367:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.F(r3, r4, r2, r9)
            goto L_0x0562
        L_0x0379:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.J(r3, r4, r2, r9)
            goto L_0x0562
        L_0x038b:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.K(r3, r4, r2, r9)
            goto L_0x0562
        L_0x039d:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.N(r3, r4, r2, r9)
            goto L_0x0562
        L_0x03af:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.W(r3, r4, r2, r9)
            goto L_0x0562
        L_0x03c1:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.O(r3, r4, r2, r9)
            goto L_0x0562
        L_0x03d3:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.L(r3, r4, r2, r9)
            goto L_0x0562
        L_0x03e5:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = com.google.protobuf.q1.p(r11, r1)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.g1.H(r3, r4, r2, r9)
            goto L_0x0562
        L_0x03f7:
            r16 = r4
            boolean r3 = r0.t(r10, r1)
            if (r3 == 0) goto L_0x0562
            r3 = r11 & r15
            long r3 = (long) r3
            java.lang.Object r3 = com.google.protobuf.q1.p(r3, r1)
            com.google.protobuf.f1 r4 = r0.p(r10)
            r2.h(r12, r4, r3)
            goto L_0x0562
        L_0x040f:
            r16 = r4
            boolean r3 = r0.t(r10, r1)
            if (r3 == 0) goto L_0x0562
            r3 = r11 & r15
            long r3 = (long) r3
            long r3 = com.google.protobuf.q1.o(r3, r1)
            r2.p(r12, r3)
            goto L_0x0562
        L_0x0423:
            r16 = r4
            boolean r3 = r0.t(r10, r1)
            if (r3 == 0) goto L_0x0562
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = com.google.protobuf.q1.n(r3, r1)
            r2.o(r12, r3)
            goto L_0x0562
        L_0x0437:
            r16 = r4
            boolean r3 = r0.t(r10, r1)
            if (r3 == 0) goto L_0x0562
            r3 = r11 & r15
            long r3 = (long) r3
            long r3 = com.google.protobuf.q1.o(r3, r1)
            r2.n(r12, r3)
            goto L_0x0562
        L_0x044b:
            r16 = r4
            boolean r3 = r0.t(r10, r1)
            if (r3 == 0) goto L_0x0562
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = com.google.protobuf.q1.n(r3, r1)
            r2.m(r12, r3)
            goto L_0x0562
        L_0x045f:
            r16 = r4
            boolean r3 = r0.t(r10, r1)
            if (r3 == 0) goto L_0x0562
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = com.google.protobuf.q1.n(r3, r1)
            r2.d(r12, r3)
            goto L_0x0562
        L_0x0473:
            r16 = r4
            boolean r3 = r0.t(r10, r1)
            if (r3 == 0) goto L_0x0562
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = com.google.protobuf.q1.n(r3, r1)
            r2.q(r12, r3)
            goto L_0x0562
        L_0x0487:
            r16 = r4
            boolean r3 = r0.t(r10, r1)
            if (r3 == 0) goto L_0x0562
            r3 = r11 & r15
            long r3 = (long) r3
            java.lang.Object r3 = com.google.protobuf.q1.p(r3, r1)
            com.google.protobuf.i r3 = (com.google.protobuf.i) r3
            r2.b(r12, r3)
            goto L_0x0562
        L_0x049d:
            r16 = r4
            boolean r3 = r0.t(r10, r1)
            if (r3 == 0) goto L_0x0562
            r3 = r11 & r15
            long r3 = (long) r3
            java.lang.Object r3 = com.google.protobuf.q1.p(r3, r1)
            com.google.protobuf.f1 r4 = r0.p(r10)
            r2.k(r12, r4, r3)
            goto L_0x0562
        L_0x04b5:
            r16 = r4
            boolean r3 = r0.t(r10, r1)
            if (r3 == 0) goto L_0x0562
            r3 = r11 & r15
            long r3 = (long) r3
            java.lang.Object r3 = com.google.protobuf.q1.p(r3, r1)
            Q(r12, r3, r2)
            goto L_0x0562
        L_0x04c9:
            r16 = r4
            boolean r3 = r0.t(r10, r1)
            if (r3 == 0) goto L_0x0562
            r3 = r11 & r15
            long r3 = (long) r3
            boolean r3 = com.google.protobuf.q1.g(r3, r1)
            r2.a(r12, r3)
            goto L_0x0562
        L_0x04dd:
            r16 = r4
            boolean r3 = r0.t(r10, r1)
            if (r3 == 0) goto L_0x0562
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = com.google.protobuf.q1.n(r3, r1)
            r2.e(r12, r3)
            goto L_0x0562
        L_0x04f1:
            r16 = r4
            boolean r3 = r0.t(r10, r1)
            if (r3 == 0) goto L_0x0562
            r3 = r11 & r15
            long r3 = (long) r3
            long r3 = com.google.protobuf.q1.o(r3, r1)
            r2.f(r12, r3)
            goto L_0x0562
        L_0x0504:
            r16 = r4
            boolean r3 = r0.t(r10, r1)
            if (r3 == 0) goto L_0x0562
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = com.google.protobuf.q1.n(r3, r1)
            r2.i(r12, r3)
            goto L_0x0562
        L_0x0517:
            r16 = r4
            boolean r3 = r0.t(r10, r1)
            if (r3 == 0) goto L_0x0562
            r3 = r11 & r15
            long r3 = (long) r3
            long r3 = com.google.protobuf.q1.o(r3, r1)
            r2.r(r12, r3)
            goto L_0x0562
        L_0x052a:
            r16 = r4
            boolean r3 = r0.t(r10, r1)
            if (r3 == 0) goto L_0x0562
            r3 = r11 & r15
            long r3 = (long) r3
            long r3 = com.google.protobuf.q1.o(r3, r1)
            r2.j(r12, r3)
            goto L_0x0562
        L_0x053d:
            r16 = r4
            boolean r3 = r0.t(r10, r1)
            if (r3 == 0) goto L_0x0562
            r3 = r11 & r15
            long r3 = (long) r3
            float r3 = com.google.protobuf.q1.m(r3, r1)
            r2.g(r12, r3)
            goto L_0x0562
        L_0x0550:
            r16 = r4
            boolean r3 = r0.t(r10, r1)
            if (r3 == 0) goto L_0x0562
            r3 = r11 & r15
            long r3 = (long) r3
            double r3 = com.google.protobuf.q1.l(r3, r1)
            r2.c(r12, r3)
        L_0x0562:
            int r10 = r10 + 3
            r4 = r16
            goto L_0x002f
        L_0x0568:
            r16 = r4
        L_0x056a:
            if (r6 == 0) goto L_0x057f
            r5.j(r2, r6)
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L_0x057d
            java.lang.Object r3 = r16.next()
            r6 = r3
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x056a
        L_0x057d:
            r6 = 0
            goto L_0x056a
        L_0x057f:
            com.google.protobuf.m1<?, ?> r0 = r0.f3794o
            java.lang.Object r1 = r0.g(r1)
            r0.s(r1, r2)
            goto L_0x058c
        L_0x0589:
            r17.O(r18, r19)
        L_0x058c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.h(java.lang.Object, com.google.protobuf.m):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x022f, code lost:
        r7 = com.google.protobuf.g1.A(r1, r2, n(r3), r12, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x030a, code lost:
        r7 = com.google.protobuf.g1.E(r1, r2, r12, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x033e, code lost:
        com.google.protobuf.q1.z((long) (r4 & 1048575), r9, com.google.protobuf.a0.c(r1, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0350, code lost:
        com.google.protobuf.q1.z(r1, r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x037a, code lost:
        com.google.protobuf.q1.x(r4, r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x038d, code lost:
        com.google.protobuf.q1.y(r9, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03a6, code lost:
        K(r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03a9, code lost:
        r7 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03c9, code lost:
        r7 = r11.f(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03d4, code lost:
        if (r15 < r14) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03d6, code lost:
        r7 = m(r9, r13[r15], r7, r11);
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03df, code lost:
        if (r7 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c8, code lost:
        r2 = java.lang.Long.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d5, code lost:
        r2 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0191, code lost:
        L(r1, r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d3, code lost:
        r0.P(r2);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:160:0x03c4 */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03c9 A[Catch:{ all -> 0x03e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03f3 A[LOOP:5: B:175:0x03f1->B:176:0x03f3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03d4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03e5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(T r20, com.google.protobuf.e1 r21, com.google.protobuf.q r22) {
        /*
            r19 = this;
            r8 = r19
            r9 = r20
            r0 = r21
            r10 = r22
            r22.getClass()
            com.google.protobuf.m1<?, ?> r11 = r8.f3794o
            com.google.protobuf.r<?> r12 = r8.f3795p
            int[] r13 = r8.f3789j
            int r14 = r8.f3791l
            int r15 = r8.f3790k
            r16 = 0
            r7 = r16
            r17 = r7
        L_0x001b:
            int r1 = r21.t()     // Catch:{ all -> 0x03ed }
            int r2 = r8.f3783c     // Catch:{ all -> 0x03ed }
            if (r1 < r2) goto L_0x0030
            int r2 = r8.f3784d     // Catch:{ all -> 0x03ed }
            if (r1 > r2) goto L_0x0030
            r2 = 0
            int r2 = r8.M(r1, r2)     // Catch:{ all -> 0x03ed }
            goto L_0x0031
        L_0x002d:
            r12 = r7
            goto L_0x03f0
        L_0x0030:
            r2 = -1
        L_0x0031:
            r3 = r2
            if (r3 >= 0) goto L_0x0098
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0048
        L_0x0039:
            if (r15 >= r14) goto L_0x0044
            r0 = r13[r15]
            java.lang.Object r7 = r8.m(r9, r0, r7, r11)
            int r15 = r15 + 1
            goto L_0x0039
        L_0x0044:
            if (r7 == 0) goto L_0x03e4
            goto L_0x03e1
        L_0x0048:
            boolean r2 = r8.f3785f     // Catch:{ all -> 0x03ed }
            if (r2 != 0) goto L_0x004f
            r3 = r16
            goto L_0x0056
        L_0x004f:
            com.google.protobuf.r0 r2 = r8.e     // Catch:{ all -> 0x03ed }
            java.lang.Object r1 = r12.b(r10, r2, r1)     // Catch:{ all -> 0x03ed }
            r3 = r1
        L_0x0056:
            if (r3 == 0) goto L_0x0072
            if (r17 != 0) goto L_0x0060
            com.google.protobuf.u r1 = r12.d(r9)     // Catch:{ all -> 0x03e9 }
            r17 = r1
        L_0x0060:
            r1 = r12
            r2 = r21
            r4 = r22
            r5 = r17
            r6 = r7
            r18 = r12
            r12 = r7
            r7 = r11
            java.lang.Object r7 = r1.g(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x03eb }
            goto L_0x03e5
        L_0x0072:
            r18 = r12
            r12 = r7
            r11.p()     // Catch:{ all -> 0x03eb }
            if (r12 != 0) goto L_0x0080
            java.lang.Object r1 = r11.f(r9)     // Catch:{ all -> 0x03eb }
            r7 = r1
            goto L_0x0081
        L_0x0080:
            r7 = r12
        L_0x0081:
            boolean r1 = r11.l(r7, r0)     // Catch:{ all -> 0x03e9 }
            if (r1 == 0) goto L_0x0089
            goto L_0x03e5
        L_0x0089:
            if (r15 >= r14) goto L_0x0094
            r0 = r13[r15]
            java.lang.Object r7 = r8.m(r9, r0, r7, r11)
            int r15 = r15 + 1
            goto L_0x0089
        L_0x0094:
            if (r7 == 0) goto L_0x03e4
            goto L_0x03e1
        L_0x0098:
            r18 = r12
            r12 = r7
            int r4 = r8.N(r3)     // Catch:{ all -> 0x03eb }
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = r2 & r4
            int r2 = r2 >>> 20
            r5 = 1048575(0xfffff, float:1.469367E-39)
            com.google.protobuf.h0 r6 = r8.f3793n
            switch(r2) {
                case 0: goto L_0x039c;
                case 1: goto L_0x0391;
                case 2: goto L_0x0386;
                case 3: goto L_0x037e;
                case 4: goto L_0x0373;
                case 5: goto L_0x036b;
                case 6: goto L_0x0363;
                case 7: goto L_0x0358;
                case 8: goto L_0x0354;
                case 9: goto L_0x0328;
                case 10: goto L_0x0320;
                case 11: goto L_0x0318;
                case 12: goto L_0x02f9;
                case 13: goto L_0x02f0;
                case 14: goto L_0x02e7;
                case 15: goto L_0x02de;
                case 16: goto L_0x02d5;
                case 17: goto L_0x02ad;
                case 18: goto L_0x01fe;
                case 19: goto L_0x01f9;
                case 20: goto L_0x01f4;
                case 21: goto L_0x01ef;
                case 22: goto L_0x01ea;
                case 23: goto L_0x01e5;
                case 24: goto L_0x01e0;
                case 25: goto L_0x01db;
                case 26: goto L_0x0260;
                case 27: goto L_0x024e;
                case 28: goto L_0x0242;
                case 29: goto L_0x01d7;
                case 30: goto L_0x0227;
                case 31: goto L_0x01c8;
                case 32: goto L_0x01c4;
                case 33: goto L_0x01c0;
                case 34: goto L_0x01bc;
                case 35: goto L_0x01fe;
                case 36: goto L_0x01f9;
                case 37: goto L_0x01f4;
                case 38: goto L_0x01ef;
                case 39: goto L_0x01ea;
                case 40: goto L_0x01e5;
                case 41: goto L_0x01e0;
                case 42: goto L_0x01db;
                case 43: goto L_0x01d7;
                case 44: goto L_0x01cc;
                case 45: goto L_0x01c8;
                case 46: goto L_0x01c4;
                case 47: goto L_0x01c0;
                case 48: goto L_0x01bc;
                case 49: goto L_0x01a7;
                case 50: goto L_0x0196;
                case 51: goto L_0x0183;
                case 52: goto L_0x0177;
                case 53: goto L_0x016e;
                case 54: goto L_0x0165;
                case 55: goto L_0x015c;
                case 56: goto L_0x0153;
                case 57: goto L_0x014b;
                case 58: goto L_0x013f;
                case 59: goto L_0x013b;
                case 60: goto L_0x010f;
                case 61: goto L_0x0106;
                case 62: goto L_0x00fe;
                case 63: goto L_0x00eb;
                case 64: goto L_0x00e3;
                case 65: goto L_0x00db;
                case 66: goto L_0x00ce;
                case 67: goto L_0x00c1;
                case 68: goto L_0x00b4;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            if (r12 != 0) goto L_0x03af
            java.lang.Object r1 = r11.m()     // Catch:{ a -> 0x03ad }
            goto L_0x03ab
        L_0x00b4:
            r2 = r4 & r5
            long r4 = (long) r2     // Catch:{ a -> 0x03ad }
            com.google.protobuf.f1 r2 = r8.p(r3)     // Catch:{ a -> 0x03ad }
            java.lang.Object r2 = r0.A(r2, r10)     // Catch:{ a -> 0x03ad }
            goto L_0x018e
        L_0x00c1:
            r2 = r4 & r5
            long r4 = (long) r2     // Catch:{ a -> 0x03ad }
            long r6 = r21.k()     // Catch:{ a -> 0x03ad }
        L_0x00c8:
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x03ad }
            goto L_0x018e
        L_0x00ce:
            r2 = r4 & r5
            long r4 = (long) r2     // Catch:{ a -> 0x03ad }
            int r2 = r21.h()     // Catch:{ a -> 0x03ad }
        L_0x00d5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x03ad }
            goto L_0x018e
        L_0x00db:
            r2 = r4 & r5
            long r4 = (long) r2     // Catch:{ a -> 0x03ad }
            long r6 = r21.v()     // Catch:{ a -> 0x03ad }
            goto L_0x00c8
        L_0x00e3:
            r2 = r4 & r5
            long r4 = (long) r2     // Catch:{ a -> 0x03ad }
            int r2 = r21.G()     // Catch:{ a -> 0x03ad }
            goto L_0x00d5
        L_0x00eb:
            int r2 = r21.c()     // Catch:{ a -> 0x03ad }
            com.google.protobuf.a0$e r6 = r8.n(r3)     // Catch:{ a -> 0x03ad }
            if (r6 == 0) goto L_0x00fb
            boolean r6 = r6.isInRange(r2)     // Catch:{ a -> 0x03ad }
            if (r6 == 0) goto L_0x030a
        L_0x00fb:
            r4 = r4 & r5
            long r4 = (long) r4     // Catch:{ a -> 0x03ad }
            goto L_0x00d5
        L_0x00fe:
            r2 = r4 & r5
            long r4 = (long) r2     // Catch:{ a -> 0x03ad }
            int r2 = r21.D()     // Catch:{ a -> 0x03ad }
            goto L_0x00d5
        L_0x0106:
            r2 = r4 & r5
            long r4 = (long) r2     // Catch:{ a -> 0x03ad }
            com.google.protobuf.i r2 = r21.B()     // Catch:{ a -> 0x03ad }
            goto L_0x018e
        L_0x010f:
            boolean r2 = r8.u(r1, r3, r9)     // Catch:{ a -> 0x03ad }
            if (r2 == 0) goto L_0x0129
            r2 = r4 & r5
            long r4 = (long) r2     // Catch:{ a -> 0x03ad }
            java.lang.Object r2 = com.google.protobuf.q1.p(r4, r9)     // Catch:{ a -> 0x03ad }
            com.google.protobuf.f1 r6 = r8.p(r3)     // Catch:{ a -> 0x03ad }
            java.lang.Object r6 = r0.w(r6, r10)     // Catch:{ a -> 0x03ad }
            java.lang.Object r2 = com.google.protobuf.a0.c(r2, r6)     // Catch:{ a -> 0x03ad }
            goto L_0x018e
        L_0x0129:
            r2 = r4 & r5
            long r4 = (long) r2     // Catch:{ a -> 0x03ad }
            com.google.protobuf.f1 r2 = r8.p(r3)     // Catch:{ a -> 0x03ad }
            java.lang.Object r2 = r0.w(r2, r10)     // Catch:{ a -> 0x03ad }
            com.google.protobuf.q1.z(r4, r9, r2)     // Catch:{ a -> 0x03ad }
            r8.K(r3, r9)     // Catch:{ a -> 0x03ad }
            goto L_0x0191
        L_0x013b:
            r8.H(r9, r4, r0)     // Catch:{ a -> 0x03ad }
            goto L_0x0191
        L_0x013f:
            r2 = r4 & r5
            long r4 = (long) r2     // Catch:{ a -> 0x03ad }
            boolean r2 = r21.r()     // Catch:{ a -> 0x03ad }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ a -> 0x03ad }
            goto L_0x018e
        L_0x014b:
            r2 = r4 & r5
            long r4 = (long) r2     // Catch:{ a -> 0x03ad }
            int r2 = r21.p()     // Catch:{ a -> 0x03ad }
            goto L_0x00d5
        L_0x0153:
            r2 = r4 & r5
            long r4 = (long) r2     // Catch:{ a -> 0x03ad }
            long r6 = r21.f()     // Catch:{ a -> 0x03ad }
            goto L_0x00c8
        L_0x015c:
            r2 = r4 & r5
            long r4 = (long) r2     // Catch:{ a -> 0x03ad }
            int r2 = r21.E()     // Catch:{ a -> 0x03ad }
            goto L_0x00d5
        L_0x0165:
            r2 = r4 & r5
            long r4 = (long) r2     // Catch:{ a -> 0x03ad }
            long r6 = r21.d()     // Catch:{ a -> 0x03ad }
            goto L_0x00c8
        L_0x016e:
            r2 = r4 & r5
            long r4 = (long) r2     // Catch:{ a -> 0x03ad }
            long r6 = r21.L()     // Catch:{ a -> 0x03ad }
            goto L_0x00c8
        L_0x0177:
            r2 = r4 & r5
            long r4 = (long) r2     // Catch:{ a -> 0x03ad }
            float r2 = r21.readFloat()     // Catch:{ a -> 0x03ad }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ a -> 0x03ad }
            goto L_0x018e
        L_0x0183:
            r2 = r4 & r5
            long r4 = (long) r2     // Catch:{ a -> 0x03ad }
            double r6 = r21.readDouble()     // Catch:{ a -> 0x03ad }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ a -> 0x03ad }
        L_0x018e:
            com.google.protobuf.q1.z(r4, r9, r2)     // Catch:{ a -> 0x03ad }
        L_0x0191:
            r8.L(r1, r3, r9)     // Catch:{ a -> 0x03ad }
            goto L_0x03a9
        L_0x0196:
            java.lang.Object r4 = r8.o(r3)     // Catch:{ a -> 0x03ad }
            r1 = r19
            r2 = r20
            r5 = r22
            r6 = r21
            r1.w(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x03ad }
            goto L_0x03a9
        L_0x01a7:
            r1 = r4 & r5
            long r4 = (long) r1     // Catch:{ a -> 0x03ad }
            com.google.protobuf.f1 r6 = r8.p(r3)     // Catch:{ a -> 0x03ad }
            r1 = r19
            r2 = r20
            r3 = r4
            r5 = r21
            r7 = r22
            r1.F(r2, r3, r5, r6, r7)     // Catch:{ a -> 0x03ad }
            goto L_0x03a9
        L_0x01bc:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            goto L_0x0203
        L_0x01c0:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            goto L_0x020c
        L_0x01c4:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            goto L_0x0215
        L_0x01c8:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            goto L_0x021e
        L_0x01cc:
            r2 = r4 & r5
            long r4 = (long) r2     // Catch:{ a -> 0x03ad }
            java.util.List r2 = r6.c(r4, r9)     // Catch:{ a -> 0x03ad }
        L_0x01d3:
            r0.P(r2)     // Catch:{ a -> 0x03ad }
            goto L_0x022f
        L_0x01d7:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            goto L_0x0239
        L_0x01db:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            goto L_0x0265
        L_0x01e0:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            goto L_0x026e
        L_0x01e5:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            goto L_0x0277
        L_0x01ea:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            goto L_0x0280
        L_0x01ef:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            goto L_0x0289
        L_0x01f4:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            goto L_0x0292
        L_0x01f9:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            goto L_0x029b
        L_0x01fe:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            goto L_0x02a4
        L_0x0203:
            java.util.List r1 = r6.c(r1, r9)     // Catch:{ a -> 0x03ad }
            r0.i(r1)     // Catch:{ a -> 0x03ad }
            goto L_0x03a9
        L_0x020c:
            java.util.List r1 = r6.c(r1, r9)     // Catch:{ a -> 0x03ad }
            r0.b(r1)     // Catch:{ a -> 0x03ad }
            goto L_0x03a9
        L_0x0215:
            java.util.List r1 = r6.c(r1, r9)     // Catch:{ a -> 0x03ad }
            r0.K(r1)     // Catch:{ a -> 0x03ad }
            goto L_0x03a9
        L_0x021e:
            java.util.List r1 = r6.c(r1, r9)     // Catch:{ a -> 0x03ad }
            r0.g(r1)     // Catch:{ a -> 0x03ad }
            goto L_0x03a9
        L_0x0227:
            r2 = r4 & r5
            long r4 = (long) r2     // Catch:{ a -> 0x03ad }
            java.util.List r2 = r6.c(r4, r9)     // Catch:{ a -> 0x03ad }
            goto L_0x01d3
        L_0x022f:
            com.google.protobuf.a0$e r3 = r8.n(r3)     // Catch:{ a -> 0x03ad }
            java.lang.Object r7 = com.google.protobuf.g1.A(r1, r2, r3, r12, r11)     // Catch:{ a -> 0x03ad }
            goto L_0x03e5
        L_0x0239:
            java.util.List r1 = r6.c(r1, r9)     // Catch:{ a -> 0x03ad }
            r0.l(r1)     // Catch:{ a -> 0x03ad }
            goto L_0x03a9
        L_0x0242:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            java.util.List r1 = r6.c(r1, r9)     // Catch:{ a -> 0x03ad }
            r0.H(r1)     // Catch:{ a -> 0x03ad }
            goto L_0x03a9
        L_0x024e:
            com.google.protobuf.f1 r5 = r8.p(r3)     // Catch:{ a -> 0x03ad }
            r1 = r19
            r2 = r20
            r3 = r4
            r4 = r21
            r6 = r22
            r1.G(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x03ad }
            goto L_0x03a9
        L_0x0260:
            r8.I(r9, r4, r0)     // Catch:{ a -> 0x03ad }
            goto L_0x03a9
        L_0x0265:
            java.util.List r1 = r6.c(r1, r9)     // Catch:{ a -> 0x03ad }
            r0.n(r1)     // Catch:{ a -> 0x03ad }
            goto L_0x03a9
        L_0x026e:
            java.util.List r1 = r6.c(r1, r9)     // Catch:{ a -> 0x03ad }
            r0.e(r1)     // Catch:{ a -> 0x03ad }
            goto L_0x03a9
        L_0x0277:
            java.util.List r1 = r6.c(r1, r9)     // Catch:{ a -> 0x03ad }
            r0.N(r1)     // Catch:{ a -> 0x03ad }
            goto L_0x03a9
        L_0x0280:
            java.util.List r1 = r6.c(r1, r9)     // Catch:{ a -> 0x03ad }
            r0.O(r1)     // Catch:{ a -> 0x03ad }
            goto L_0x03a9
        L_0x0289:
            java.util.List r1 = r6.c(r1, r9)     // Catch:{ a -> 0x03ad }
            r0.y(r1)     // Catch:{ a -> 0x03ad }
            goto L_0x03a9
        L_0x0292:
            java.util.List r1 = r6.c(r1, r9)     // Catch:{ a -> 0x03ad }
            r0.J(r1)     // Catch:{ a -> 0x03ad }
            goto L_0x03a9
        L_0x029b:
            java.util.List r1 = r6.c(r1, r9)     // Catch:{ a -> 0x03ad }
            r0.C(r1)     // Catch:{ a -> 0x03ad }
            goto L_0x03a9
        L_0x02a4:
            java.util.List r1 = r6.c(r1, r9)     // Catch:{ a -> 0x03ad }
            r0.I(r1)     // Catch:{ a -> 0x03ad }
            goto L_0x03a9
        L_0x02ad:
            boolean r1 = r8.t(r3, r9)     // Catch:{ a -> 0x03ad }
            if (r1 == 0) goto L_0x02c8
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            java.lang.Object r1 = com.google.protobuf.q1.p(r1, r9)     // Catch:{ a -> 0x03ad }
            com.google.protobuf.f1 r2 = r8.p(r3)     // Catch:{ a -> 0x03ad }
            java.lang.Object r2 = r0.A(r2, r10)     // Catch:{ a -> 0x03ad }
        L_0x02c2:
            java.lang.Object r1 = com.google.protobuf.a0.c(r1, r2)     // Catch:{ a -> 0x03ad }
            goto L_0x033e
        L_0x02c8:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            com.google.protobuf.f1 r4 = r8.p(r3)     // Catch:{ a -> 0x03ad }
            java.lang.Object r4 = r0.A(r4, r10)     // Catch:{ a -> 0x03ad }
            goto L_0x0350
        L_0x02d5:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            long r4 = r21.k()     // Catch:{ a -> 0x03ad }
            goto L_0x038d
        L_0x02de:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            int r4 = r21.h()     // Catch:{ a -> 0x03ad }
            goto L_0x037a
        L_0x02e7:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            long r4 = r21.v()     // Catch:{ a -> 0x03ad }
            goto L_0x038d
        L_0x02f0:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            int r4 = r21.G()     // Catch:{ a -> 0x03ad }
            goto L_0x037a
        L_0x02f9:
            int r2 = r21.c()     // Catch:{ a -> 0x03ad }
            com.google.protobuf.a0$e r6 = r8.n(r3)     // Catch:{ a -> 0x03ad }
            if (r6 == 0) goto L_0x0310
            boolean r6 = r6.isInRange(r2)     // Catch:{ a -> 0x03ad }
            if (r6 == 0) goto L_0x030a
            goto L_0x0310
        L_0x030a:
            java.lang.Object r7 = com.google.protobuf.g1.E(r1, r2, r12, r11)     // Catch:{ a -> 0x03ad }
            goto L_0x03e5
        L_0x0310:
            r1 = r4 & r5
            long r4 = (long) r1     // Catch:{ a -> 0x03ad }
            com.google.protobuf.q1.x(r2, r4, r9)     // Catch:{ a -> 0x03ad }
            goto L_0x03a6
        L_0x0318:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            int r4 = r21.D()     // Catch:{ a -> 0x03ad }
            goto L_0x037a
        L_0x0320:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            com.google.protobuf.i r4 = r21.B()     // Catch:{ a -> 0x03ad }
            goto L_0x0350
        L_0x0328:
            boolean r1 = r8.t(r3, r9)     // Catch:{ a -> 0x03ad }
            if (r1 == 0) goto L_0x0345
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            java.lang.Object r1 = com.google.protobuf.q1.p(r1, r9)     // Catch:{ a -> 0x03ad }
            com.google.protobuf.f1 r2 = r8.p(r3)     // Catch:{ a -> 0x03ad }
            java.lang.Object r2 = r0.w(r2, r10)     // Catch:{ a -> 0x03ad }
            goto L_0x02c2
        L_0x033e:
            r2 = r4 & r5
            long r2 = (long) r2     // Catch:{ a -> 0x03ad }
            com.google.protobuf.q1.z(r2, r9, r1)     // Catch:{ a -> 0x03ad }
            goto L_0x03a9
        L_0x0345:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            com.google.protobuf.f1 r4 = r8.p(r3)     // Catch:{ a -> 0x03ad }
            java.lang.Object r4 = r0.w(r4, r10)     // Catch:{ a -> 0x03ad }
        L_0x0350:
            com.google.protobuf.q1.z(r1, r9, r4)     // Catch:{ a -> 0x03ad }
            goto L_0x03a6
        L_0x0354:
            r8.H(r9, r4, r0)     // Catch:{ a -> 0x03ad }
            goto L_0x03a6
        L_0x0358:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            boolean r4 = r21.r()     // Catch:{ a -> 0x03ad }
            com.google.protobuf.q1.r(r9, r1, r4)     // Catch:{ a -> 0x03ad }
            goto L_0x03a6
        L_0x0363:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            int r4 = r21.p()     // Catch:{ a -> 0x03ad }
            goto L_0x037a
        L_0x036b:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            long r4 = r21.f()     // Catch:{ a -> 0x03ad }
            goto L_0x038d
        L_0x0373:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            int r4 = r21.E()     // Catch:{ a -> 0x03ad }
        L_0x037a:
            com.google.protobuf.q1.x(r4, r1, r9)     // Catch:{ a -> 0x03ad }
            goto L_0x03a6
        L_0x037e:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            long r4 = r21.d()     // Catch:{ a -> 0x03ad }
            goto L_0x038d
        L_0x0386:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            long r4 = r21.L()     // Catch:{ a -> 0x03ad }
        L_0x038d:
            com.google.protobuf.q1.y(r9, r1, r4)     // Catch:{ a -> 0x03ad }
            goto L_0x03a6
        L_0x0391:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            float r4 = r21.readFloat()     // Catch:{ a -> 0x03ad }
            com.google.protobuf.q1.w(r9, r1, r4)     // Catch:{ a -> 0x03ad }
            goto L_0x03a6
        L_0x039c:
            r1 = r4 & r5
            long r1 = (long) r1     // Catch:{ a -> 0x03ad }
            double r4 = r21.readDouble()     // Catch:{ a -> 0x03ad }
            com.google.protobuf.q1.v(r9, r1, r4)     // Catch:{ a -> 0x03ad }
        L_0x03a6:
            r8.K(r3, r9)     // Catch:{ a -> 0x03ad }
        L_0x03a9:
            r7 = r12
            goto L_0x03e5
        L_0x03ab:
            r7 = r1
            goto L_0x03b0
        L_0x03ad:
            r7 = r12
            goto L_0x03c4
        L_0x03af:
            r7 = r12
        L_0x03b0:
            boolean r1 = r11.l(r7, r0)     // Catch:{ a -> 0x03c4 }
            if (r1 != 0) goto L_0x03e5
        L_0x03b6:
            if (r15 >= r14) goto L_0x03c1
            r0 = r13[r15]
            java.lang.Object r7 = r8.m(r9, r0, r7, r11)
            int r15 = r15 + 1
            goto L_0x03b6
        L_0x03c1:
            if (r7 == 0) goto L_0x03e4
            goto L_0x03e1
        L_0x03c4:
            r11.p()     // Catch:{ all -> 0x03e9 }
            if (r7 != 0) goto L_0x03ce
            java.lang.Object r1 = r11.f(r9)     // Catch:{ all -> 0x03e9 }
            r7 = r1
        L_0x03ce:
            boolean r1 = r11.l(r7, r0)     // Catch:{ all -> 0x03e9 }
            if (r1 != 0) goto L_0x03e5
        L_0x03d4:
            if (r15 >= r14) goto L_0x03df
            r0 = r13[r15]
            java.lang.Object r7 = r8.m(r9, r0, r7, r11)
            int r15 = r15 + 1
            goto L_0x03d4
        L_0x03df:
            if (r7 == 0) goto L_0x03e4
        L_0x03e1:
            r11.n(r9, r7)
        L_0x03e4:
            return
        L_0x03e5:
            r12 = r18
            goto L_0x001b
        L_0x03e9:
            r0 = move-exception
            goto L_0x03f1
        L_0x03eb:
            r0 = move-exception
            goto L_0x03f0
        L_0x03ed:
            r0 = move-exception
            goto L_0x002d
        L_0x03f0:
            r7 = r12
        L_0x03f1:
            if (r15 >= r14) goto L_0x03fc
            r1 = r13[r15]
            java.lang.Object r7 = r8.m(r9, r1, r7, r11)
            int r15 = r15 + 1
            goto L_0x03f1
        L_0x03fc:
            if (r7 == 0) goto L_0x0401
            r11.n(r9, r7)
        L_0x0401:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.i(java.lang.Object, com.google.protobuf.e1, com.google.protobuf.q):void");
    }

    public final void j(T t8, byte[] bArr, int i8, int i9, e.a aVar) {
        if (this.f3787h) {
            D(t8, bArr, i8, i9, aVar);
        } else {
            C(t8, bArr, i8, i9, 0, aVar);
        }
    }

    public final boolean k(Object obj, int i8, Object obj2) {
        return t(i8, obj) == t(i8, obj2);
    }

    public final <UT, UB> UB m(Object obj, int i8, UB ub, m1<UT, UB> m1Var) {
        a0.e n8;
        int i9 = this.f3781a[i8];
        Object p8 = q1.p((long) (N(i8) & 1048575), obj);
        if (p8 == null || (n8 = n(i8)) == null) {
            return ub;
        }
        m0 m0Var = this.f3796q;
        Map<?, ?> h8 = m0Var.h(p8);
        k0.a<?, ?> e4 = m0Var.e(o(i8));
        Iterator<Map.Entry<?, ?>> it = h8.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!n8.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = m1Var.m();
                }
                int a9 = k0.a(e4, next.getKey(), next.getValue());
                byte[] bArr = new byte[a9];
                Logger logger = l.f3712b;
                l.b bVar = new l.b(bArr, a9);
                try {
                    Object key = next.getKey();
                    Object value = next.getValue();
                    u.q(bVar, e4.f3708a, 1, key);
                    u.q(bVar, e4.f3710c, 2, value);
                    if (bVar.d0() == 0) {
                        m1Var.d(ub, i9, new i.f(bArr));
                        it.remove();
                    } else {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                } catch (IOException e9) {
                    throw new RuntimeException(e9);
                }
            }
        }
        return ub;
    }

    public final a0.e n(int i8) {
        return (a0.e) this.f3782b[((i8 / 3) * 2) + 1];
    }

    public final Object o(int i8) {
        return this.f3782b[(i8 / 3) * 2];
    }

    public final f1 p(int i8) {
        int i9 = (i8 / 3) * 2;
        Object[] objArr = this.f3782b;
        f1 f1Var = (f1) objArr[i9];
        if (f1Var != null) {
            return f1Var;
        }
        f1 a9 = b1.f3596c.a((Class) objArr[i9 + 1]);
        objArr[i9] = a9;
        return a9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e3, code lost:
        if (r13 != false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01f2, code lost:
        if (r13 != false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0201, code lost:
        if (r13 != false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0210, code lost:
        if (r13 != false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x021f, code lost:
        if (r13 != false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0221, code lost:
        r14.putInt(r1, (long) r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0225, code lost:
        r2 = r2 + (com.google.protobuf.l.B(r10) + com.google.protobuf.l.D(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02c6, code lost:
        r5 = r5 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02cd, code lost:
        r2 = com.google.protobuf.l.q(r10, (com.google.protobuf.r0) r14.getObject(r1, r2), p(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02e4, code lost:
        r2 = com.google.protobuf.l.y(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02f1, code lost:
        r2 = com.google.protobuf.l.x(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02fa, code lost:
        r2 = com.google.protobuf.l.w(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0303, code lost:
        r2 = com.google.protobuf.l.v(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0310, code lost:
        r2 = com.google.protobuf.l.m(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x031d, code lost:
        r2 = com.google.protobuf.l.C(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0326, code lost:
        r2 = r14.getObject(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x032a, code lost:
        r2 = com.google.protobuf.l.k(r10, (com.google.protobuf.i) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0335, code lost:
        r2 = com.google.protobuf.g1.o(r10, p(r4), r14.getObject(r1, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x034c, code lost:
        if ((r2 instanceof com.google.protobuf.i) != false) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x034f, code lost:
        r2 = com.google.protobuf.l.z(r10, (java.lang.String) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x035b, code lost:
        r2 = com.google.protobuf.l.j(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bd, code lost:
        if ((r2 instanceof com.google.protobuf.i) != false) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cf, code lost:
        r2 = com.google.protobuf.l.n(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00db, code lost:
        r2 = com.google.protobuf.l.o(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00eb, code lost:
        r2 = com.google.protobuf.l.r(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fb, code lost:
        r2 = com.google.protobuf.l.E(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010b, code lost:
        r2 = com.google.protobuf.l.t(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0117, code lost:
        r2 = com.google.protobuf.l.p(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0123, code lost:
        r2 = com.google.protobuf.l.l(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0155, code lost:
        if (r13 != false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0165, code lost:
        if (r13 != false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0175, code lost:
        if (r13 != false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0185, code lost:
        if (r13 != false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0195, code lost:
        if (r13 != false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a5, code lost:
        if (r13 != false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b5, code lost:
        if (r13 != false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c5, code lost:
        if (r13 != false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01d4, code lost:
        if (r13 != false) goto L_0x0221;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int r(T r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2
            r4 = 0
            r5 = 0
            r7 = 0
        L_0x000b:
            int[] r8 = r0.f3781a
            int r9 = r8.length
            if (r4 >= r9) goto L_0x039e
            int r9 = r0.N(r4)
            r10 = r8[r4]
            r11 = 267386880(0xff00000, float:2.3665827E-29)
            r11 = r11 & r9
            int r11 = r11 >>> 20
            r12 = 17
            boolean r13 = r0.f3788i
            sun.misc.Unsafe r14 = f3780s
            if (r11 > r12) goto L_0x0038
            int r12 = r4 + 2
            r8 = r8[r12]
            r12 = r8 & r2
            int r15 = r8 >>> 20
            r16 = 1
            int r15 = r16 << r15
            if (r12 == r6) goto L_0x0052
            long r6 = (long) r12
            int r7 = r14.getInt(r1, r6)
            r6 = r12
            goto L_0x0052
        L_0x0038:
            if (r13 == 0) goto L_0x0050
            com.google.protobuf.v r12 = com.google.protobuf.v.DOUBLE_LIST_PACKED
            int r12 = r12.e()
            if (r11 < r12) goto L_0x0050
            com.google.protobuf.v r12 = com.google.protobuf.v.SINT64_LIST_PACKED
            int r12 = r12.e()
            if (r11 > r12) goto L_0x0050
            int r12 = r4 + 2
            r8 = r8[r12]
            r8 = r8 & r2
            goto L_0x0051
        L_0x0050:
            r8 = 0
        L_0x0051:
            r15 = 0
        L_0x0052:
            r9 = r9 & r2
            long r2 = (long) r9
            switch(r11) {
                case 0: goto L_0x0391;
                case 1: goto L_0x038b;
                case 2: goto L_0x0381;
                case 3: goto L_0x0377;
                case 4: goto L_0x036d;
                case 5: goto L_0x0367;
                case 6: goto L_0x0361;
                case 7: goto L_0x0357;
                case 8: goto L_0x0342;
                case 9: goto L_0x0331;
                case 10: goto L_0x0322;
                case 11: goto L_0x0315;
                case 12: goto L_0x0308;
                case 13: goto L_0x02ff;
                case 14: goto L_0x02f6;
                case 15: goto L_0x02e9;
                case 16: goto L_0x02dc;
                case 17: goto L_0x02c9;
                case 18: goto L_0x0290;
                case 19: goto L_0x02bc;
                case 20: goto L_0x02b1;
                case 21: goto L_0x02a6;
                case 22: goto L_0x029b;
                case 23: goto L_0x0290;
                case 24: goto L_0x02bc;
                case 25: goto L_0x0285;
                case 26: goto L_0x027a;
                case 27: goto L_0x026b;
                case 28: goto L_0x0260;
                case 29: goto L_0x0255;
                case 30: goto L_0x0249;
                case 31: goto L_0x02bc;
                case 32: goto L_0x0290;
                case 33: goto L_0x023d;
                case 34: goto L_0x0231;
                case 35: goto L_0x0213;
                case 36: goto L_0x0204;
                case 37: goto L_0x01f5;
                case 38: goto L_0x01e6;
                case 39: goto L_0x01d7;
                case 40: goto L_0x01c8;
                case 41: goto L_0x01b9;
                case 42: goto L_0x01a9;
                case 43: goto L_0x0199;
                case 44: goto L_0x0189;
                case 45: goto L_0x0179;
                case 46: goto L_0x0169;
                case 47: goto L_0x0159;
                case 48: goto L_0x0149;
                case 49: goto L_0x0139;
                case 50: goto L_0x0129;
                case 51: goto L_0x011d;
                case 52: goto L_0x0111;
                case 53: goto L_0x0101;
                case 54: goto L_0x00f1;
                case 55: goto L_0x00e1;
                case 56: goto L_0x00d5;
                case 57: goto L_0x00c9;
                case 58: goto L_0x00c1;
                case 59: goto L_0x00b1;
                case 60: goto L_0x00a9;
                case 61: goto L_0x00a1;
                case 62: goto L_0x0095;
                case 63: goto L_0x0089;
                case 64: goto L_0x0081;
                case 65: goto L_0x0079;
                case 66: goto L_0x006d;
                case 67: goto L_0x0061;
                case 68: goto L_0x0059;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x0397
        L_0x0059:
            boolean r8 = r0.u(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            goto L_0x02cd
        L_0x0061:
            boolean r8 = r0.u(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            long r2 = z(r2, r1)
            goto L_0x02e4
        L_0x006d:
            boolean r8 = r0.u(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            int r2 = y(r2, r1)
            goto L_0x02f1
        L_0x0079:
            boolean r2 = r0.u(r10, r4, r1)
            if (r2 == 0) goto L_0x0397
            goto L_0x02fa
        L_0x0081:
            boolean r2 = r0.u(r10, r4, r1)
            if (r2 == 0) goto L_0x0397
            goto L_0x0303
        L_0x0089:
            boolean r8 = r0.u(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            int r2 = y(r2, r1)
            goto L_0x0310
        L_0x0095:
            boolean r8 = r0.u(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            int r2 = y(r2, r1)
            goto L_0x031d
        L_0x00a1:
            boolean r8 = r0.u(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            goto L_0x0326
        L_0x00a9:
            boolean r8 = r0.u(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            goto L_0x0335
        L_0x00b1:
            boolean r8 = r0.u(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            java.lang.Object r2 = r14.getObject(r1, r2)
            boolean r3 = r2 instanceof com.google.protobuf.i
            if (r3 == 0) goto L_0x034f
            goto L_0x034e
        L_0x00c1:
            boolean r2 = r0.u(r10, r4, r1)
            if (r2 == 0) goto L_0x0397
            goto L_0x035b
        L_0x00c9:
            boolean r2 = r0.u(r10, r4, r1)
            if (r2 == 0) goto L_0x0397
        L_0x00cf:
            int r2 = com.google.protobuf.l.n(r10)
            goto L_0x02c6
        L_0x00d5:
            boolean r2 = r0.u(r10, r4, r1)
            if (r2 == 0) goto L_0x0397
        L_0x00db:
            int r2 = com.google.protobuf.l.o(r10)
            goto L_0x02c6
        L_0x00e1:
            boolean r8 = r0.u(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            int r2 = y(r2, r1)
        L_0x00eb:
            int r2 = com.google.protobuf.l.r(r10, r2)
            goto L_0x02c6
        L_0x00f1:
            boolean r8 = r0.u(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            long r2 = z(r2, r1)
        L_0x00fb:
            int r2 = com.google.protobuf.l.E(r10, r2)
            goto L_0x02c6
        L_0x0101:
            boolean r8 = r0.u(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            long r2 = z(r2, r1)
        L_0x010b:
            int r2 = com.google.protobuf.l.t(r10, r2)
            goto L_0x02c6
        L_0x0111:
            boolean r2 = r0.u(r10, r4, r1)
            if (r2 == 0) goto L_0x0397
        L_0x0117:
            int r2 = com.google.protobuf.l.p(r10)
            goto L_0x02c6
        L_0x011d:
            boolean r2 = r0.u(r10, r4, r1)
            if (r2 == 0) goto L_0x0397
        L_0x0123:
            int r2 = com.google.protobuf.l.l(r10)
            goto L_0x02c6
        L_0x0129:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.lang.Object r3 = r0.o(r4)
            com.google.protobuf.m0 r8 = r0.f3796q
            int r2 = r8.b(r2, r10, r3)
            goto L_0x02c6
        L_0x0139:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            com.google.protobuf.f1 r3 = r0.p(r4)
            int r2 = com.google.protobuf.g1.j(r10, r2, r3)
            goto L_0x02c6
        L_0x0149:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.t(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x0159:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.r(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x0169:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.i(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x0179:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.g(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x0189:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.e(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x0199:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.w(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x01a9:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.b(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x01b9:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.g(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x01c8:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.i(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x01d7:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.l(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x01e6:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.y(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x01f5:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.n(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x0204:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.g(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x0213:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.i(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
        L_0x0221:
            long r8 = (long) r8
            r14.putInt(r1, r8, r2)
        L_0x0225:
            int r3 = com.google.protobuf.l.B(r10)
            int r8 = com.google.protobuf.l.D(r2)
            int r3 = r3 + r8
            int r2 = r2 + r3
            goto L_0x02c6
        L_0x0231:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.s(r10, r2)
            goto L_0x02c6
        L_0x023d:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.q(r10, r2)
            goto L_0x02c6
        L_0x0249:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.d(r10, r2)
            goto L_0x02c6
        L_0x0255:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.v(r10, r2)
            goto L_0x02c6
        L_0x0260:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.c(r10, r2)
            goto L_0x02c6
        L_0x026b:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            com.google.protobuf.f1 r3 = r0.p(r4)
            int r2 = com.google.protobuf.g1.p(r10, r2, r3)
            goto L_0x02c6
        L_0x027a:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.u(r10, r2)
            goto L_0x02c6
        L_0x0285:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.a(r10, r2)
            goto L_0x02c6
        L_0x0290:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.h(r10, r2)
            goto L_0x02c6
        L_0x029b:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.k(r10, r2)
            goto L_0x02c6
        L_0x02a6:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.x(r10, r2)
            goto L_0x02c6
        L_0x02b1:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.m(r10, r2)
            goto L_0x02c6
        L_0x02bc:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = com.google.protobuf.g1.f(r10, r2)
        L_0x02c6:
            int r5 = r5 + r2
            goto L_0x0397
        L_0x02c9:
            r8 = r7 & r15
            if (r8 == 0) goto L_0x0397
        L_0x02cd:
            java.lang.Object r2 = r14.getObject(r1, r2)
            com.google.protobuf.r0 r2 = (com.google.protobuf.r0) r2
            com.google.protobuf.f1 r3 = r0.p(r4)
            int r2 = com.google.protobuf.l.q(r10, r2, r3)
            goto L_0x02c6
        L_0x02dc:
            r8 = r7 & r15
            if (r8 == 0) goto L_0x0397
            long r2 = r14.getLong(r1, r2)
        L_0x02e4:
            int r2 = com.google.protobuf.l.y(r10, r2)
            goto L_0x02c6
        L_0x02e9:
            r8 = r7 & r15
            if (r8 == 0) goto L_0x0397
            int r2 = r14.getInt(r1, r2)
        L_0x02f1:
            int r2 = com.google.protobuf.l.x(r10, r2)
            goto L_0x02c6
        L_0x02f6:
            r2 = r7 & r15
            if (r2 == 0) goto L_0x0397
        L_0x02fa:
            int r2 = com.google.protobuf.l.w(r10)
            goto L_0x02c6
        L_0x02ff:
            r2 = r7 & r15
            if (r2 == 0) goto L_0x0397
        L_0x0303:
            int r2 = com.google.protobuf.l.v(r10)
            goto L_0x02c6
        L_0x0308:
            r8 = r7 & r15
            if (r8 == 0) goto L_0x0397
            int r2 = r14.getInt(r1, r2)
        L_0x0310:
            int r2 = com.google.protobuf.l.m(r10, r2)
            goto L_0x02c6
        L_0x0315:
            r8 = r7 & r15
            if (r8 == 0) goto L_0x0397
            int r2 = r14.getInt(r1, r2)
        L_0x031d:
            int r2 = com.google.protobuf.l.C(r10, r2)
            goto L_0x02c6
        L_0x0322:
            r8 = r7 & r15
            if (r8 == 0) goto L_0x0397
        L_0x0326:
            java.lang.Object r2 = r14.getObject(r1, r2)
        L_0x032a:
            com.google.protobuf.i r2 = (com.google.protobuf.i) r2
            int r2 = com.google.protobuf.l.k(r10, r2)
            goto L_0x02c6
        L_0x0331:
            r8 = r7 & r15
            if (r8 == 0) goto L_0x0397
        L_0x0335:
            java.lang.Object r2 = r14.getObject(r1, r2)
            com.google.protobuf.f1 r3 = r0.p(r4)
            int r2 = com.google.protobuf.g1.o(r10, r3, r2)
            goto L_0x02c6
        L_0x0342:
            r8 = r7 & r15
            if (r8 == 0) goto L_0x0397
            java.lang.Object r2 = r14.getObject(r1, r2)
            boolean r3 = r2 instanceof com.google.protobuf.i
            if (r3 == 0) goto L_0x034f
        L_0x034e:
            goto L_0x032a
        L_0x034f:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.google.protobuf.l.z(r10, r2)
            goto L_0x02c6
        L_0x0357:
            r2 = r7 & r15
            if (r2 == 0) goto L_0x0397
        L_0x035b:
            int r2 = com.google.protobuf.l.j(r10)
            goto L_0x02c6
        L_0x0361:
            r2 = r7 & r15
            if (r2 == 0) goto L_0x0397
            goto L_0x00cf
        L_0x0367:
            r2 = r7 & r15
            if (r2 == 0) goto L_0x0397
            goto L_0x00db
        L_0x036d:
            r8 = r7 & r15
            if (r8 == 0) goto L_0x0397
            int r2 = r14.getInt(r1, r2)
            goto L_0x00eb
        L_0x0377:
            r8 = r7 & r15
            if (r8 == 0) goto L_0x0397
            long r2 = r14.getLong(r1, r2)
            goto L_0x00fb
        L_0x0381:
            r8 = r7 & r15
            if (r8 == 0) goto L_0x0397
            long r2 = r14.getLong(r1, r2)
            goto L_0x010b
        L_0x038b:
            r2 = r7 & r15
            if (r2 == 0) goto L_0x0397
            goto L_0x0117
        L_0x0391:
            r2 = r7 & r15
            if (r2 == 0) goto L_0x0397
            goto L_0x0123
        L_0x0397:
            int r4 = r4 + 3
            r2 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000b
        L_0x039e:
            com.google.protobuf.m1<?, ?> r2 = r0.f3794o
            java.lang.Object r3 = r2.g(r1)
            int r2 = r2.h(r3)
            int r5 = r5 + r2
            boolean r2 = r0.f3785f
            if (r2 == 0) goto L_0x03b8
            com.google.protobuf.r<?> r0 = r0.f3795p
            com.google.protobuf.u r0 = r0.c(r1)
            int r0 = r0.i()
            int r5 = r5 + r0
        L_0x03b8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.r(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01e2, code lost:
        r7.putInt(r11, (long) r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e6, code lost:
        r3 = (com.google.protobuf.l.B(r6) + com.google.protobuf.l.D(r5)) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x027e, code lost:
        r3 = com.google.protobuf.l.q(r6, (com.google.protobuf.r0) com.google.protobuf.q1.p(r8, r11), p(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0298, code lost:
        r3 = com.google.protobuf.l.y(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02a8, code lost:
        r3 = com.google.protobuf.l.x(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02b4, code lost:
        r3 = com.google.protobuf.l.w(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02c0, code lost:
        r3 = com.google.protobuf.l.v(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02d0, code lost:
        r3 = com.google.protobuf.l.m(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02e0, code lost:
        r3 = com.google.protobuf.l.C(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ec, code lost:
        r3 = com.google.protobuf.q1.p(r8, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02f7, code lost:
        r3 = com.google.protobuf.g1.o(r6, p(r1), com.google.protobuf.q1.p(r8, r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0311, code lost:
        if ((r3 instanceof com.google.protobuf.i) != false) goto L_0x0313;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0313, code lost:
        r3 = com.google.protobuf.l.k(r6, (com.google.protobuf.i) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x031b, code lost:
        r3 = com.google.protobuf.l.z(r6, (java.lang.String) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0328, code lost:
        r3 = com.google.protobuf.l.j(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0333, code lost:
        r3 = com.google.protobuf.l.n(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x033e, code lost:
        r3 = com.google.protobuf.l.o(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x034d, code lost:
        r3 = com.google.protobuf.l.r(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x035c, code lost:
        r3 = com.google.protobuf.l.E(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x036b, code lost:
        r3 = com.google.protobuf.l.t(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0376, code lost:
        r3 = com.google.protobuf.l.p(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0381, code lost:
        r3 = com.google.protobuf.l.l(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0385, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        if ((r3 instanceof com.google.protobuf.i) != false) goto L_0x0313;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0116, code lost:
        if (r4 != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0126, code lost:
        if (r4 != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0136, code lost:
        if (r4 != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0146, code lost:
        if (r4 != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0156, code lost:
        if (r4 != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0166, code lost:
        if (r4 != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0176, code lost:
        if (r4 != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0186, code lost:
        if (r4 != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0195, code lost:
        if (r4 != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a4, code lost:
        if (r4 != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b3, code lost:
        if (r4 != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c2, code lost:
        if (r4 != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01d1, code lost:
        if (r4 != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e0, code lost:
        if (r4 != false) goto L_0x01e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int s(T r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L_0x0003:
            int[] r3 = r10.f3781a
            int r4 = r3.length
            if (r1 >= r4) goto L_0x038a
            int r4 = r10.N(r1)
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r4
            int r5 = r5 >>> 20
            r6 = r3[r1]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r8 = (long) r4
            com.google.protobuf.v r4 = com.google.protobuf.v.DOUBLE_LIST_PACKED
            int r4 = r4.e()
            if (r5 < r4) goto L_0x002e
            com.google.protobuf.v r4 = com.google.protobuf.v.SINT64_LIST_PACKED
            int r4 = r4.e()
            if (r5 > r4) goto L_0x002e
            int r4 = r1 + 2
            r3 = r3[r4]
            r3 = r3 & r7
            goto L_0x002f
        L_0x002e:
            r3 = r0
        L_0x002f:
            boolean r4 = r10.f3788i
            sun.misc.Unsafe r7 = f3780s
            switch(r5) {
                case 0: goto L_0x037b;
                case 1: goto L_0x0370;
                case 2: goto L_0x0361;
                case 3: goto L_0x0352;
                case 4: goto L_0x0343;
                case 5: goto L_0x0338;
                case 6: goto L_0x032d;
                case 7: goto L_0x0322;
                case 8: goto L_0x0305;
                case 9: goto L_0x02f1;
                case 10: goto L_0x02e6;
                case 11: goto L_0x02d6;
                case 12: goto L_0x02c6;
                case 13: goto L_0x02ba;
                case 14: goto L_0x02ae;
                case 15: goto L_0x029e;
                case 16: goto L_0x028e;
                case 17: goto L_0x0278;
                case 18: goto L_0x026e;
                case 19: goto L_0x0264;
                case 20: goto L_0x025a;
                case 21: goto L_0x0250;
                case 22: goto L_0x0246;
                case 23: goto L_0x026e;
                case 24: goto L_0x0264;
                case 25: goto L_0x023c;
                case 26: goto L_0x0232;
                case 27: goto L_0x0224;
                case 28: goto L_0x021a;
                case 29: goto L_0x0210;
                case 30: goto L_0x0206;
                case 31: goto L_0x0264;
                case 32: goto L_0x026e;
                case 33: goto L_0x01fc;
                case 34: goto L_0x01f2;
                case 35: goto L_0x01d4;
                case 36: goto L_0x01c5;
                case 37: goto L_0x01b6;
                case 38: goto L_0x01a7;
                case 39: goto L_0x0198;
                case 40: goto L_0x0189;
                case 41: goto L_0x017a;
                case 42: goto L_0x016a;
                case 43: goto L_0x015a;
                case 44: goto L_0x014a;
                case 45: goto L_0x013a;
                case 46: goto L_0x012a;
                case 47: goto L_0x011a;
                case 48: goto L_0x010a;
                case 49: goto L_0x00fc;
                case 50: goto L_0x00ec;
                case 51: goto L_0x00e4;
                case 52: goto L_0x00dc;
                case 53: goto L_0x00d0;
                case 54: goto L_0x00c4;
                case 55: goto L_0x00b8;
                case 56: goto L_0x00b0;
                case 57: goto L_0x00a8;
                case 58: goto L_0x00a0;
                case 59: goto L_0x0090;
                case 60: goto L_0x0088;
                case 61: goto L_0x0080;
                case 62: goto L_0x0074;
                case 63: goto L_0x0068;
                case 64: goto L_0x0060;
                case 65: goto L_0x0058;
                case 66: goto L_0x004c;
                case 67: goto L_0x0040;
                case 68: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0386
        L_0x0038:
            boolean r3 = r10.u(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            goto L_0x027e
        L_0x0040:
            boolean r3 = r10.u(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            long r3 = z(r8, r11)
            goto L_0x0298
        L_0x004c:
            boolean r3 = r10.u(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            int r3 = y(r8, r11)
            goto L_0x02a8
        L_0x0058:
            boolean r3 = r10.u(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            goto L_0x02b4
        L_0x0060:
            boolean r3 = r10.u(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            goto L_0x02c0
        L_0x0068:
            boolean r3 = r10.u(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            int r3 = y(r8, r11)
            goto L_0x02d0
        L_0x0074:
            boolean r3 = r10.u(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            int r3 = y(r8, r11)
            goto L_0x02e0
        L_0x0080:
            boolean r3 = r10.u(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            goto L_0x02ec
        L_0x0088:
            boolean r3 = r10.u(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            goto L_0x02f7
        L_0x0090:
            boolean r3 = r10.u(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            java.lang.Object r3 = com.google.protobuf.q1.p(r8, r11)
            boolean r4 = r3 instanceof com.google.protobuf.i
            if (r4 == 0) goto L_0x031b
            goto L_0x0313
        L_0x00a0:
            boolean r3 = r10.u(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            goto L_0x0328
        L_0x00a8:
            boolean r3 = r10.u(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            goto L_0x0333
        L_0x00b0:
            boolean r3 = r10.u(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            goto L_0x033e
        L_0x00b8:
            boolean r3 = r10.u(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            int r3 = y(r8, r11)
            goto L_0x034d
        L_0x00c4:
            boolean r3 = r10.u(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            long r3 = z(r8, r11)
            goto L_0x035c
        L_0x00d0:
            boolean r3 = r10.u(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            long r3 = z(r8, r11)
            goto L_0x036b
        L_0x00dc:
            boolean r3 = r10.u(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            goto L_0x0376
        L_0x00e4:
            boolean r3 = r10.u(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            goto L_0x0381
        L_0x00ec:
            java.lang.Object r3 = com.google.protobuf.q1.p(r8, r11)
            java.lang.Object r4 = r10.o(r1)
            com.google.protobuf.m0 r5 = r10.f3796q
            int r3 = r5.b(r3, r6, r4)
            goto L_0x0385
        L_0x00fc:
            java.util.List r3 = v(r8, r11)
            com.google.protobuf.f1 r4 = r10.p(r1)
            int r3 = com.google.protobuf.g1.j(r6, r3, r4)
            goto L_0x0385
        L_0x010a:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.g1.t(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x011a:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.g1.r(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x012a:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.g1.i(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x013a:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.g1.g(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x014a:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.g1.e(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x015a:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.g1.w(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x016a:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.g1.b(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x017a:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.g1.g(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x0189:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.g1.i(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x0198:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.g1.l(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x01a7:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.g1.y(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x01b6:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.g1.n(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x01c5:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.g1.g(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x01d4:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.g1.i(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
        L_0x01e2:
            long r3 = (long) r3
            r7.putInt(r11, r3, r5)
        L_0x01e6:
            int r3 = com.google.protobuf.l.B(r6)
            int r4 = com.google.protobuf.l.D(r5)
            int r3 = r3 + r4
            int r3 = r3 + r5
            goto L_0x0385
        L_0x01f2:
            java.util.List r3 = v(r8, r11)
            int r3 = com.google.protobuf.g1.s(r6, r3)
            goto L_0x0385
        L_0x01fc:
            java.util.List r3 = v(r8, r11)
            int r3 = com.google.protobuf.g1.q(r6, r3)
            goto L_0x0385
        L_0x0206:
            java.util.List r3 = v(r8, r11)
            int r3 = com.google.protobuf.g1.d(r6, r3)
            goto L_0x0385
        L_0x0210:
            java.util.List r3 = v(r8, r11)
            int r3 = com.google.protobuf.g1.v(r6, r3)
            goto L_0x0385
        L_0x021a:
            java.util.List r3 = v(r8, r11)
            int r3 = com.google.protobuf.g1.c(r6, r3)
            goto L_0x0385
        L_0x0224:
            java.util.List r3 = v(r8, r11)
            com.google.protobuf.f1 r4 = r10.p(r1)
            int r3 = com.google.protobuf.g1.p(r6, r3, r4)
            goto L_0x0385
        L_0x0232:
            java.util.List r3 = v(r8, r11)
            int r3 = com.google.protobuf.g1.u(r6, r3)
            goto L_0x0385
        L_0x023c:
            java.util.List r3 = v(r8, r11)
            int r3 = com.google.protobuf.g1.a(r6, r3)
            goto L_0x0385
        L_0x0246:
            java.util.List r3 = v(r8, r11)
            int r3 = com.google.protobuf.g1.k(r6, r3)
            goto L_0x0385
        L_0x0250:
            java.util.List r3 = v(r8, r11)
            int r3 = com.google.protobuf.g1.x(r6, r3)
            goto L_0x0385
        L_0x025a:
            java.util.List r3 = v(r8, r11)
            int r3 = com.google.protobuf.g1.m(r6, r3)
            goto L_0x0385
        L_0x0264:
            java.util.List r3 = v(r8, r11)
            int r3 = com.google.protobuf.g1.f(r6, r3)
            goto L_0x0385
        L_0x026e:
            java.util.List r3 = v(r8, r11)
            int r3 = com.google.protobuf.g1.h(r6, r3)
            goto L_0x0385
        L_0x0278:
            boolean r3 = r10.t(r1, r11)
            if (r3 == 0) goto L_0x0386
        L_0x027e:
            java.lang.Object r3 = com.google.protobuf.q1.p(r8, r11)
            com.google.protobuf.r0 r3 = (com.google.protobuf.r0) r3
            com.google.protobuf.f1 r4 = r10.p(r1)
            int r3 = com.google.protobuf.l.q(r6, r3, r4)
            goto L_0x0385
        L_0x028e:
            boolean r3 = r10.t(r1, r11)
            if (r3 == 0) goto L_0x0386
            long r3 = com.google.protobuf.q1.o(r8, r11)
        L_0x0298:
            int r3 = com.google.protobuf.l.y(r6, r3)
            goto L_0x0385
        L_0x029e:
            boolean r3 = r10.t(r1, r11)
            if (r3 == 0) goto L_0x0386
            int r3 = com.google.protobuf.q1.n(r8, r11)
        L_0x02a8:
            int r3 = com.google.protobuf.l.x(r6, r3)
            goto L_0x0385
        L_0x02ae:
            boolean r3 = r10.t(r1, r11)
            if (r3 == 0) goto L_0x0386
        L_0x02b4:
            int r3 = com.google.protobuf.l.w(r6)
            goto L_0x0385
        L_0x02ba:
            boolean r3 = r10.t(r1, r11)
            if (r3 == 0) goto L_0x0386
        L_0x02c0:
            int r3 = com.google.protobuf.l.v(r6)
            goto L_0x0385
        L_0x02c6:
            boolean r3 = r10.t(r1, r11)
            if (r3 == 0) goto L_0x0386
            int r3 = com.google.protobuf.q1.n(r8, r11)
        L_0x02d0:
            int r3 = com.google.protobuf.l.m(r6, r3)
            goto L_0x0385
        L_0x02d6:
            boolean r3 = r10.t(r1, r11)
            if (r3 == 0) goto L_0x0386
            int r3 = com.google.protobuf.q1.n(r8, r11)
        L_0x02e0:
            int r3 = com.google.protobuf.l.C(r6, r3)
            goto L_0x0385
        L_0x02e6:
            boolean r3 = r10.t(r1, r11)
            if (r3 == 0) goto L_0x0386
        L_0x02ec:
            java.lang.Object r3 = com.google.protobuf.q1.p(r8, r11)
            goto L_0x0313
        L_0x02f1:
            boolean r3 = r10.t(r1, r11)
            if (r3 == 0) goto L_0x0386
        L_0x02f7:
            java.lang.Object r3 = com.google.protobuf.q1.p(r8, r11)
            com.google.protobuf.f1 r4 = r10.p(r1)
            int r3 = com.google.protobuf.g1.o(r6, r4, r3)
            goto L_0x0385
        L_0x0305:
            boolean r3 = r10.t(r1, r11)
            if (r3 == 0) goto L_0x0386
            java.lang.Object r3 = com.google.protobuf.q1.p(r8, r11)
            boolean r4 = r3 instanceof com.google.protobuf.i
            if (r4 == 0) goto L_0x031b
        L_0x0313:
            com.google.protobuf.i r3 = (com.google.protobuf.i) r3
            int r3 = com.google.protobuf.l.k(r6, r3)
            goto L_0x0385
        L_0x031b:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.l.z(r6, r3)
            goto L_0x0385
        L_0x0322:
            boolean r3 = r10.t(r1, r11)
            if (r3 == 0) goto L_0x0386
        L_0x0328:
            int r3 = com.google.protobuf.l.j(r6)
            goto L_0x0385
        L_0x032d:
            boolean r3 = r10.t(r1, r11)
            if (r3 == 0) goto L_0x0386
        L_0x0333:
            int r3 = com.google.protobuf.l.n(r6)
            goto L_0x0385
        L_0x0338:
            boolean r3 = r10.t(r1, r11)
            if (r3 == 0) goto L_0x0386
        L_0x033e:
            int r3 = com.google.protobuf.l.o(r6)
            goto L_0x0385
        L_0x0343:
            boolean r3 = r10.t(r1, r11)
            if (r3 == 0) goto L_0x0386
            int r3 = com.google.protobuf.q1.n(r8, r11)
        L_0x034d:
            int r3 = com.google.protobuf.l.r(r6, r3)
            goto L_0x0385
        L_0x0352:
            boolean r3 = r10.t(r1, r11)
            if (r3 == 0) goto L_0x0386
            long r3 = com.google.protobuf.q1.o(r8, r11)
        L_0x035c:
            int r3 = com.google.protobuf.l.E(r6, r3)
            goto L_0x0385
        L_0x0361:
            boolean r3 = r10.t(r1, r11)
            if (r3 == 0) goto L_0x0386
            long r3 = com.google.protobuf.q1.o(r8, r11)
        L_0x036b:
            int r3 = com.google.protobuf.l.t(r6, r3)
            goto L_0x0385
        L_0x0370:
            boolean r3 = r10.t(r1, r11)
            if (r3 == 0) goto L_0x0386
        L_0x0376:
            int r3 = com.google.protobuf.l.p(r6)
            goto L_0x0385
        L_0x037b:
            boolean r3 = r10.t(r1, r11)
            if (r3 == 0) goto L_0x0386
        L_0x0381:
            int r3 = com.google.protobuf.l.l(r6)
        L_0x0385:
            int r2 = r2 + r3
        L_0x0386:
            int r1 = r1 + 3
            goto L_0x0003
        L_0x038a:
            com.google.protobuf.m1<?, ?> r10 = r10.f3794o
            java.lang.Object r11 = r10.g(r11)
            int r10 = r10.h(r11)
            int r2 = r2 + r10
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u0.s(java.lang.Object):int");
    }

    public final boolean t(int i8, Object obj) {
        boolean equals;
        int i9 = this.f3781a[i8 + 2];
        long j8 = (long) (i9 & 1048575);
        if (j8 != 1048575) {
            return ((1 << (i9 >>> 20)) & q1.n(j8, obj)) != 0;
        }
        int N = N(i8);
        long j9 = (long) (N & 1048575);
        switch ((N & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(q1.l(j9, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(q1.m(j9, obj)) != 0;
            case 2:
                return q1.o(j9, obj) != 0;
            case 3:
                return q1.o(j9, obj) != 0;
            case 4:
                return q1.n(j9, obj) != 0;
            case 5:
                return q1.o(j9, obj) != 0;
            case 6:
                return q1.n(j9, obj) != 0;
            case 7:
                return q1.g(j9, obj);
            case 8:
                Object p8 = q1.p(j9, obj);
                if (p8 instanceof String) {
                    equals = ((String) p8).isEmpty();
                    break;
                } else if (p8 instanceof i) {
                    equals = i.f3648g.equals(p8);
                    break;
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return q1.p(j9, obj) != null;
            case 10:
                equals = i.f3648g.equals(q1.p(j9, obj));
                break;
            case 11:
                return q1.n(j9, obj) != 0;
            case 12:
                return q1.n(j9, obj) != 0;
            case 13:
                return q1.n(j9, obj) != 0;
            case 14:
                return q1.o(j9, obj) != 0;
            case 15:
                return q1.n(j9, obj) != 0;
            case 16:
                return q1.o(j9, obj) != 0;
            case 17:
                return q1.p(j9, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !equals;
    }

    public final boolean u(int i8, int i9, Object obj) {
        return q1.n((long) (this.f3781a[i9 + 2] & 1048575), obj) == i8;
    }

    public final <K, V> void w(Object obj, int i8, Object obj2, q qVar, e1 e1Var) {
        long N = (long) (N(i8) & 1048575);
        Object p8 = q1.p(N, obj);
        m0 m0Var = this.f3796q;
        if (p8 == null) {
            p8 = m0Var.f();
            q1.z(N, obj, p8);
        } else if (m0Var.c(p8)) {
            Object f9 = m0Var.f();
            m0Var.a(f9, p8);
            q1.z(N, obj, f9);
            p8 = f9;
        }
        e1Var.x(m0Var.h(p8), m0Var.e(obj2), qVar);
    }
}
