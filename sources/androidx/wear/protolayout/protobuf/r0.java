package androidx.wear.protolayout.protobuf;

import androidx.wear.protolayout.protobuf.x;
import androidx.wear.protolayout.protobuf.y;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

public final class r0<T> implements b1<T> {
    public static final int[] r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    public static final Unsafe f2172s = l1.p();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f2173a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f2174b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2175c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2176d;
    public final o0 e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2177f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2178g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2179h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2180i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f2181j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2182k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2183l;

    /* renamed from: m  reason: collision with root package name */
    public final t0 f2184m;

    /* renamed from: n  reason: collision with root package name */
    public final e0 f2185n;

    /* renamed from: o  reason: collision with root package name */
    public final h1<?, ?> f2186o;

    /* renamed from: p  reason: collision with root package name */
    public final o<?> f2187p;

    /* renamed from: q  reason: collision with root package name */
    public final j0 f2188q;

    public r0(int[] iArr, Object[] objArr, int i8, int i9, o0 o0Var, boolean z8, int[] iArr2, int i10, int i11, t0 t0Var, e0 e0Var, h1 h1Var, o oVar, j0 j0Var) {
        this.f2173a = iArr;
        this.f2174b = objArr;
        this.f2175c = i8;
        this.f2176d = i9;
        this.f2178g = o0Var instanceof v;
        this.f2179h = z8;
        this.f2177f = oVar != null && oVar.e(o0Var);
        this.f2180i = false;
        this.f2181j = iArr2;
        this.f2182k = i10;
        this.f2183l = i11;
        this.f2184m = t0Var;
        this.f2185n = e0Var;
        this.f2186o = h1Var;
        this.f2187p = oVar;
        this.e = o0Var;
        this.f2188q = j0Var;
    }

    public static int A(long j8, Object obj) {
        return ((Integer) l1.o(j8, obj)).intValue();
    }

    public static long B(long j8, Object obj) {
        return ((Long) l1.o(j8, obj)).longValue();
    }

    public static Field H(Class<?> cls, String str) {
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

    public static void P(int i8, Object obj, k kVar) {
        if (obj instanceof String) {
            kVar.f2130a.S(i8, (String) obj);
            return;
        }
        kVar.b(i8, (g) obj);
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof v) {
            return ((v) obj).o();
        }
        return true;
    }

    public static List t(long j8, Object obj) {
        return (List) l1.o(j8, obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:155:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0389  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> androidx.wear.protolayout.protobuf.r0<T> z(androidx.wear.protolayout.protobuf.z0 r34, androidx.wear.protolayout.protobuf.t0 r35, androidx.wear.protolayout.protobuf.e0 r36, androidx.wear.protolayout.protobuf.h1<?, ?> r37, androidx.wear.protolayout.protobuf.o<?> r38, androidx.wear.protolayout.protobuf.j0 r39) {
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
            androidx.wear.protolayout.protobuf.o0 r18 = r34.c()
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
            sun.misc.Unsafe r15 = f2172s
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
            java.lang.reflect.Field r11 = H(r8, r11)
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
            java.lang.reflect.Field r13 = H(r8, r13)
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
            java.lang.reflect.Field r13 = H(r8, r13)
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
            java.lang.reflect.Field r14 = H(r8, r14)
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
            androidx.wear.protolayout.protobuf.r0 r0 = new androidx.wear.protolayout.protobuf.r0
            androidx.wear.protolayout.protobuf.o0 r2 = r34.c()
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.r0.z(androidx.wear.protolayout.protobuf.z0, androidx.wear.protolayout.protobuf.t0, androidx.wear.protolayout.protobuf.e0, androidx.wear.protolayout.protobuf.h1, androidx.wear.protolayout.protobuf.o, androidx.wear.protolayout.protobuf.j0):androidx.wear.protolayout.protobuf.r0");
    }

    public final int C(int i8) {
        if (i8 < this.f2175c || i8 > this.f2176d) {
            return -1;
        }
        int[] iArr = this.f2173a;
        int length = (iArr.length / 3) - 1;
        int i9 = 0;
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

    public final <E> void D(Object obj, long j8, a1 a1Var, b1<E> b1Var, n nVar) {
        int v8;
        List c9 = this.f2185n.c(j8, obj);
        i iVar = (i) a1Var;
        int i8 = iVar.f2115b;
        if ((i8 & 7) == 3) {
            do {
                E f9 = b1Var.f();
                iVar.b(f9, b1Var, nVar);
                b1Var.b(f9);
                c9.add(f9);
                h hVar = iVar.f2114a;
                if (!hVar.c() && iVar.f2117d == 0) {
                    v8 = hVar.v();
                } else {
                    return;
                }
            } while (v8 == i8);
            iVar.f2117d = v8;
            return;
        }
        int i9 = y.f2216f;
        throw new y.a();
    }

    public final <E> void E(Object obj, int i8, a1 a1Var, b1<E> b1Var, n nVar) {
        int v8;
        List c9 = this.f2185n.c((long) (i8 & 1048575), obj);
        i iVar = (i) a1Var;
        int i9 = iVar.f2115b;
        if ((i9 & 7) == 2) {
            do {
                E f9 = b1Var.f();
                iVar.c(f9, b1Var, nVar);
                b1Var.b(f9);
                c9.add(f9);
                h hVar = iVar.f2114a;
                if (!hVar.c() && iVar.f2117d == 0) {
                    v8 = hVar.v();
                } else {
                    return;
                }
            } while (v8 == i9);
            iVar.f2117d = v8;
            return;
        }
        int i10 = y.f2216f;
        throw new y.a();
    }

    public final void F(Object obj, int i8, a1 a1Var) {
        Object obj2;
        long j8;
        if ((536870912 & i8) != 0) {
            j8 = (long) (i8 & 1048575);
            i iVar = (i) a1Var;
            iVar.v(2);
            obj2 = iVar.f2114a.u();
        } else if (this.f2178g) {
            j8 = (long) (i8 & 1048575);
            i iVar2 = (i) a1Var;
            iVar2.v(2);
            obj2 = iVar2.f2114a.t();
        } else {
            j8 = (long) (i8 & 1048575);
            obj2 = ((i) a1Var).e();
        }
        l1.v(j8, obj, obj2);
    }

    public final void G(Object obj, int i8, a1 a1Var) {
        boolean z8 = (536870912 & i8) != 0;
        e0 e0Var = this.f2185n;
        if (z8) {
            ((i) a1Var).r(e0Var.c((long) (i8 & 1048575), obj), true);
        } else {
            ((i) a1Var).r(e0Var.c((long) (i8 & 1048575), obj), false);
        }
    }

    public final void I(int i8, Object obj) {
        int i9 = this.f2173a[i8 + 2];
        long j8 = (long) (1048575 & i9);
        if (j8 != 1048575) {
            l1.t((1 << (i9 >>> 20)) | l1.m(j8, obj), j8, obj);
        }
    }

    public final void J(int i8, int i9, Object obj) {
        l1.t(i8, (long) (this.f2173a[i9 + 2] & 1048575), obj);
    }

    public final void K(T t8, int i8, Object obj) {
        f2172s.putObject(t8, (long) (M(i8) & 1048575), obj);
        I(i8, t8);
    }

    public final void L(int i8, int i9, Object obj, Object obj2) {
        f2172s.putObject(obj, (long) (M(i9) & 1048575), obj2);
        J(i8, i9, obj);
    }

    public final int M(int i8) {
        return this.f2173a[i8 + 1];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02d4, code lost:
        r14 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x046f, code lost:
        r11 = r11 + 3;
        r5 = r19;
        r4 = r20;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03ca  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N(java.lang.Object r22, androidx.wear.protolayout.protobuf.k r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            boolean r4 = r0.f2177f
            androidx.wear.protolayout.protobuf.o<?> r5 = r0.f2187p
            if (r4 == 0) goto L_0x0021
            androidx.wear.protolayout.protobuf.r r4 = r5.c(r1)
            boolean r6 = r4.i()
            if (r6 != 0) goto L_0x0021
            java.util.Iterator r4 = r4.l()
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x0023
        L_0x0021:
            r4 = 0
            r6 = 0
        L_0x0023:
            int[] r7 = r0.f2173a
            int r8 = r7.length
            r11 = 0
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r13 = 0
        L_0x002b:
            if (r11 >= r8) goto L_0x0477
            int r14 = r0.M(r11)
            r15 = r7[r11]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r14 & r16
            int r3 = r16 >>> 20
            r10 = 17
            sun.misc.Unsafe r9 = f2172s
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
            if (r6 == 0) goto L_0x0077
            r5.a(r6)
            if (r15 < 0) goto L_0x0077
            r5.j(r6)
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0075
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x005e
        L_0x0075:
            r6 = 0
            goto L_0x005e
        L_0x0077:
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r14 = r14 & r17
            r20 = r4
            r19 = r5
            long r4 = (long) r14
            switch(r3) {
                case 0: goto L_0x0463;
                case 1: goto L_0x0456;
                case 2: goto L_0x0449;
                case 3: goto L_0x043c;
                case 4: goto L_0x042f;
                case 5: goto L_0x0422;
                case 6: goto L_0x0415;
                case 7: goto L_0x0408;
                case 8: goto L_0x03fa;
                case 9: goto L_0x03e8;
                case 10: goto L_0x03d8;
                case 11: goto L_0x03ca;
                case 12: goto L_0x03bc;
                case 13: goto L_0x03ae;
                case 14: goto L_0x03a0;
                case 15: goto L_0x0392;
                case 16: goto L_0x0384;
                case 17: goto L_0x0372;
                case 18: goto L_0x0364;
                case 19: goto L_0x0356;
                case 20: goto L_0x0348;
                case 21: goto L_0x033a;
                case 22: goto L_0x032c;
                case 23: goto L_0x031e;
                case 24: goto L_0x0310;
                case 25: goto L_0x0302;
                case 26: goto L_0x02f5;
                case 27: goto L_0x02e4;
                case 28: goto L_0x02d7;
                case 29: goto L_0x02c8;
                case 30: goto L_0x02bb;
                case 31: goto L_0x02ae;
                case 32: goto L_0x02a1;
                case 33: goto L_0x0294;
                case 34: goto L_0x0287;
                case 35: goto L_0x0279;
                case 36: goto L_0x026b;
                case 37: goto L_0x025d;
                case 38: goto L_0x024f;
                case 39: goto L_0x0241;
                case 40: goto L_0x0233;
                case 41: goto L_0x0225;
                case 42: goto L_0x0217;
                case 43: goto L_0x0209;
                case 44: goto L_0x01fb;
                case 45: goto L_0x01ed;
                case 46: goto L_0x01df;
                case 47: goto L_0x01d1;
                case 48: goto L_0x01c3;
                case 49: goto L_0x01b2;
                case 50: goto L_0x01a9;
                case 51: goto L_0x0194;
                case 52: goto L_0x017f;
                case 53: goto L_0x0170;
                case 54: goto L_0x0161;
                case 55: goto L_0x0152;
                case 56: goto L_0x0143;
                case 57: goto L_0x0134;
                case 58: goto L_0x011f;
                case 59: goto L_0x0110;
                case 60: goto L_0x00fd;
                case 61: goto L_0x00ed;
                case 62: goto L_0x00df;
                case 63: goto L_0x00d1;
                case 64: goto L_0x00c3;
                case 65: goto L_0x00b5;
                case 66: goto L_0x00a7;
                case 67: goto L_0x0099;
                case 68: goto L_0x0087;
                default: goto L_0x0084;
            }
        L_0x0084:
            r14 = 0
            goto L_0x046f
        L_0x0087:
            boolean r3 = r0.s(r15, r11, r1)
            if (r3 == 0) goto L_0x0084
            java.lang.Object r3 = r9.getObject(r1, r4)
            androidx.wear.protolayout.protobuf.b1 r4 = r0.n(r11)
            r2.h(r15, r4, r3)
            goto L_0x0084
        L_0x0099:
            boolean r3 = r0.s(r15, r11, r1)
            if (r3 == 0) goto L_0x0084
            long r3 = B(r4, r1)
            r2.p(r15, r3)
            goto L_0x0084
        L_0x00a7:
            boolean r3 = r0.s(r15, r11, r1)
            if (r3 == 0) goto L_0x0084
            int r3 = A(r4, r1)
            r2.o(r15, r3)
            goto L_0x0084
        L_0x00b5:
            boolean r3 = r0.s(r15, r11, r1)
            if (r3 == 0) goto L_0x0084
            long r3 = B(r4, r1)
            r2.n(r15, r3)
            goto L_0x0084
        L_0x00c3:
            boolean r3 = r0.s(r15, r11, r1)
            if (r3 == 0) goto L_0x0084
            int r3 = A(r4, r1)
            r2.m(r15, r3)
            goto L_0x0084
        L_0x00d1:
            boolean r3 = r0.s(r15, r11, r1)
            if (r3 == 0) goto L_0x0084
            int r3 = A(r4, r1)
            r2.d(r15, r3)
            goto L_0x0084
        L_0x00df:
            boolean r3 = r0.s(r15, r11, r1)
            if (r3 == 0) goto L_0x0084
            int r3 = A(r4, r1)
            r2.q(r15, r3)
            goto L_0x0084
        L_0x00ed:
            boolean r3 = r0.s(r15, r11, r1)
            if (r3 == 0) goto L_0x0084
            java.lang.Object r3 = r9.getObject(r1, r4)
            androidx.wear.protolayout.protobuf.g r3 = (androidx.wear.protolayout.protobuf.g) r3
            r2.b(r15, r3)
            goto L_0x0084
        L_0x00fd:
            boolean r3 = r0.s(r15, r11, r1)
            if (r3 == 0) goto L_0x0084
            java.lang.Object r3 = r9.getObject(r1, r4)
            androidx.wear.protolayout.protobuf.b1 r4 = r0.n(r11)
            r2.k(r15, r4, r3)
            goto L_0x0084
        L_0x0110:
            boolean r3 = r0.s(r15, r11, r1)
            if (r3 == 0) goto L_0x0084
            java.lang.Object r3 = r9.getObject(r1, r4)
            P(r15, r3, r2)
            goto L_0x0084
        L_0x011f:
            boolean r3 = r0.s(r15, r11, r1)
            if (r3 == 0) goto L_0x0084
            java.lang.Object r3 = androidx.wear.protolayout.protobuf.l1.o(r4, r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r2.a(r15, r3)
            goto L_0x0084
        L_0x0134:
            boolean r3 = r0.s(r15, r11, r1)
            if (r3 == 0) goto L_0x0084
            int r3 = A(r4, r1)
            r2.e(r15, r3)
            goto L_0x0084
        L_0x0143:
            boolean r3 = r0.s(r15, r11, r1)
            if (r3 == 0) goto L_0x0084
            long r3 = B(r4, r1)
            r2.f(r15, r3)
            goto L_0x0084
        L_0x0152:
            boolean r3 = r0.s(r15, r11, r1)
            if (r3 == 0) goto L_0x0084
            int r3 = A(r4, r1)
            r2.i(r15, r3)
            goto L_0x0084
        L_0x0161:
            boolean r3 = r0.s(r15, r11, r1)
            if (r3 == 0) goto L_0x0084
            long r3 = B(r4, r1)
            r2.r(r15, r3)
            goto L_0x0084
        L_0x0170:
            boolean r3 = r0.s(r15, r11, r1)
            if (r3 == 0) goto L_0x0084
            long r3 = B(r4, r1)
            r2.j(r15, r3)
            goto L_0x0084
        L_0x017f:
            boolean r3 = r0.s(r15, r11, r1)
            if (r3 == 0) goto L_0x0084
            java.lang.Object r3 = androidx.wear.protolayout.protobuf.l1.o(r4, r1)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2.g(r15, r3)
            goto L_0x0084
        L_0x0194:
            boolean r3 = r0.s(r15, r11, r1)
            if (r3 == 0) goto L_0x0084
            java.lang.Object r3 = androidx.wear.protolayout.protobuf.l1.o(r4, r1)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            r2.c(r15, r3)
            goto L_0x0084
        L_0x01a9:
            java.lang.Object r3 = r9.getObject(r1, r4)
            r0.O(r2, r15, r3, r11)
            goto L_0x0084
        L_0x01b2:
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.b1 r5 = r0.n(r11)
            androidx.wear.protolayout.protobuf.c1.K(r3, r4, r2, r5)
            goto L_0x0084
        L_0x01c3:
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r10 = 1
            androidx.wear.protolayout.protobuf.c1.R(r3, r4, r2, r10)
            goto L_0x0084
        L_0x01d1:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.Q(r3, r4, r2, r10)
            goto L_0x0084
        L_0x01df:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.P(r3, r4, r2, r10)
            goto L_0x0084
        L_0x01ed:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.O(r3, r4, r2, r10)
            goto L_0x0084
        L_0x01fb:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.G(r3, r4, r2, r10)
            goto L_0x0084
        L_0x0209:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.T(r3, r4, r2, r10)
            goto L_0x0084
        L_0x0217:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.D(r3, r4, r2, r10)
            goto L_0x0084
        L_0x0225:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.H(r3, r4, r2, r10)
            goto L_0x0084
        L_0x0233:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.I(r3, r4, r2, r10)
            goto L_0x0084
        L_0x0241:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.L(r3, r4, r2, r10)
            goto L_0x0084
        L_0x024f:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.U(r3, r4, r2, r10)
            goto L_0x0084
        L_0x025d:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.M(r3, r4, r2, r10)
            goto L_0x0084
        L_0x026b:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.J(r3, r4, r2, r10)
            goto L_0x0084
        L_0x0279:
            r10 = 1
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.F(r3, r4, r2, r10)
            goto L_0x0084
        L_0x0287:
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            androidx.wear.protolayout.protobuf.c1.R(r3, r4, r2, r10)
            goto L_0x02d4
        L_0x0294:
            r10 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.Q(r3, r4, r2, r10)
            goto L_0x02d4
        L_0x02a1:
            r10 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.P(r3, r4, r2, r10)
            goto L_0x02d4
        L_0x02ae:
            r10 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.O(r3, r4, r2, r10)
            goto L_0x02d4
        L_0x02bb:
            r10 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.G(r3, r4, r2, r10)
            goto L_0x02d4
        L_0x02c8:
            r10 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.T(r3, r4, r2, r10)
        L_0x02d4:
            r14 = r10
            goto L_0x046f
        L_0x02d7:
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.E(r3, r4, r2)
            goto L_0x0084
        L_0x02e4:
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.b1 r5 = r0.n(r11)
            androidx.wear.protolayout.protobuf.c1.N(r3, r4, r2, r5)
            goto L_0x0084
        L_0x02f5:
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.S(r3, r4, r2)
            goto L_0x0084
        L_0x0302:
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            r14 = 0
            androidx.wear.protolayout.protobuf.c1.D(r3, r4, r2, r14)
            goto L_0x046f
        L_0x0310:
            r14 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.H(r3, r4, r2, r14)
            goto L_0x046f
        L_0x031e:
            r14 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.I(r3, r4, r2, r14)
            goto L_0x046f
        L_0x032c:
            r14 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.L(r3, r4, r2, r14)
            goto L_0x046f
        L_0x033a:
            r14 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.U(r3, r4, r2, r14)
            goto L_0x046f
        L_0x0348:
            r14 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.M(r3, r4, r2, r14)
            goto L_0x046f
        L_0x0356:
            r14 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.J(r3, r4, r2, r14)
            goto L_0x046f
        L_0x0364:
            r14 = 0
            r3 = r7[r11]
            java.lang.Object r4 = r9.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.F(r3, r4, r2, r14)
            goto L_0x046f
        L_0x0372:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x046f
            java.lang.Object r3 = r9.getObject(r1, r4)
            androidx.wear.protolayout.protobuf.b1 r4 = r0.n(r11)
            r2.h(r15, r4, r3)
            goto L_0x046f
        L_0x0384:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x046f
            long r3 = r9.getLong(r1, r4)
            r2.p(r15, r3)
            goto L_0x046f
        L_0x0392:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x046f
            int r3 = r9.getInt(r1, r4)
            r2.o(r15, r3)
            goto L_0x046f
        L_0x03a0:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x046f
            long r3 = r9.getLong(r1, r4)
            r2.n(r15, r3)
            goto L_0x046f
        L_0x03ae:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x046f
            int r3 = r9.getInt(r1, r4)
            r2.m(r15, r3)
            goto L_0x046f
        L_0x03bc:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x046f
            int r3 = r9.getInt(r1, r4)
            r2.d(r15, r3)
            goto L_0x046f
        L_0x03ca:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x046f
            int r3 = r9.getInt(r1, r4)
            r2.q(r15, r3)
            goto L_0x046f
        L_0x03d8:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x046f
            java.lang.Object r3 = r9.getObject(r1, r4)
            androidx.wear.protolayout.protobuf.g r3 = (androidx.wear.protolayout.protobuf.g) r3
            r2.b(r15, r3)
            goto L_0x046f
        L_0x03e8:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x046f
            java.lang.Object r3 = r9.getObject(r1, r4)
            androidx.wear.protolayout.protobuf.b1 r4 = r0.n(r11)
            r2.k(r15, r4, r3)
            goto L_0x046f
        L_0x03fa:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x046f
            java.lang.Object r3 = r9.getObject(r1, r4)
            P(r15, r3, r2)
            goto L_0x046f
        L_0x0408:
            r14 = 0
            r3 = r13 & r10
            if (r3 == 0) goto L_0x046f
            boolean r3 = androidx.wear.protolayout.protobuf.l1.g(r4, r1)
            r2.a(r15, r3)
            goto L_0x046f
        L_0x0415:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x046f
            int r3 = r9.getInt(r1, r4)
            r2.e(r15, r3)
            goto L_0x046f
        L_0x0422:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x046f
            long r3 = r9.getLong(r1, r4)
            r2.f(r15, r3)
            goto L_0x046f
        L_0x042f:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x046f
            int r3 = r9.getInt(r1, r4)
            r2.i(r15, r3)
            goto L_0x046f
        L_0x043c:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x046f
            long r3 = r9.getLong(r1, r4)
            r2.r(r15, r3)
            goto L_0x046f
        L_0x0449:
            r14 = 0
            r3 = r10 & r13
            if (r3 == 0) goto L_0x046f
            long r3 = r9.getLong(r1, r4)
            r2.j(r15, r3)
            goto L_0x046f
        L_0x0456:
            r14 = 0
            r3 = r13 & r10
            if (r3 == 0) goto L_0x046f
            float r3 = androidx.wear.protolayout.protobuf.l1.l(r4, r1)
            r2.g(r15, r3)
            goto L_0x046f
        L_0x0463:
            r14 = 0
            r3 = r13 & r10
            if (r3 == 0) goto L_0x046f
            double r3 = androidx.wear.protolayout.protobuf.l1.k(r4, r1)
            r2.c(r15, r3)
        L_0x046f:
            int r11 = r11 + 3
            r5 = r19
            r4 = r20
            goto L_0x002b
        L_0x0477:
            r20 = r4
            r19 = r5
            r18 = r6
        L_0x047d:
            if (r6 == 0) goto L_0x0498
            r3 = r19
            r3.j(r6)
            boolean r4 = r20.hasNext()
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r20.next()
            r6 = r4
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            r19 = r3
            goto L_0x047d
        L_0x0494:
            r19 = r3
            r6 = 0
            goto L_0x047d
        L_0x0498:
            androidx.wear.protolayout.protobuf.h1<?, ?> r0 = r0.f2186o
            java.lang.Object r1 = r0.g(r1)
            r0.s(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.r0.N(java.lang.Object, androidx.wear.protolayout.protobuf.k):void");
    }

    public final void O(k kVar, int i8, Object obj, int i9) {
        if (obj != null) {
            Object m8 = m(i9);
            j0 j0Var = this.f2188q;
            j0Var.e(m8);
            Map<?, ?> g9 = j0Var.g(obj);
            j jVar = kVar.f2130a;
            jVar.getClass();
            Iterator<Map.Entry<?, ?>> it = g9.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry next = it.next();
                jVar.T(i8, 2);
                next.getKey();
                next.getValue();
                throw null;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        androidx.wear.protolayout.protobuf.l1.v(r6, r11, androidx.wear.protolayout.protobuf.l1.o(r6, r12));
        J(r1, r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009c, code lost:
        androidx.wear.protolayout.protobuf.l1.v(r6, r11, androidx.wear.protolayout.protobuf.l1.o(r6, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c8, code lost:
        androidx.wear.protolayout.protobuf.l1.t(androidx.wear.protolayout.protobuf.l1.m(r6, r12), r6, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dd, code lost:
        androidx.wear.protolayout.protobuf.l1.u(r11, r6, androidx.wear.protolayout.protobuf.l1.n(r6, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0105, code lost:
        I(r0, r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r11, T r12) {
        /*
            r10 = this;
            boolean r0 = r(r11)
            if (r0 == 0) goto L_0x0129
            r12.getClass()
            r0 = 0
        L_0x000a:
            int[] r1 = r10.f2173a
            int r2 = r1.length
            if (r0 >= r2) goto L_0x010c
            int r2 = r10.M(r0)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r6 = (long) r3
            r1 = r1[r0]
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = r2 & r3
            int r2 = r2 >>> 20
            switch(r2) {
                case 0: goto L_0x00f5;
                case 1: goto L_0x00e5;
                case 2: goto L_0x00d7;
                case 3: goto L_0x00d0;
                case 4: goto L_0x00c2;
                case 5: goto L_0x00bb;
                case 6: goto L_0x00b4;
                case 7: goto L_0x00a4;
                case 8: goto L_0x0096;
                case 9: goto L_0x0091;
                case 10: goto L_0x008a;
                case 11: goto L_0x0083;
                case 12: goto L_0x007c;
                case 13: goto L_0x0075;
                case 14: goto L_0x006d;
                case 15: goto L_0x0066;
                case 16: goto L_0x005e;
                case 17: goto L_0x0091;
                case 18: goto L_0x0057;
                case 19: goto L_0x0057;
                case 20: goto L_0x0057;
                case 21: goto L_0x0057;
                case 22: goto L_0x0057;
                case 23: goto L_0x0057;
                case 24: goto L_0x0057;
                case 25: goto L_0x0057;
                case 26: goto L_0x0057;
                case 27: goto L_0x0057;
                case 28: goto L_0x0057;
                case 29: goto L_0x0057;
                case 30: goto L_0x0057;
                case 31: goto L_0x0057;
                case 32: goto L_0x0057;
                case 33: goto L_0x0057;
                case 34: goto L_0x0057;
                case 35: goto L_0x0057;
                case 36: goto L_0x0057;
                case 37: goto L_0x0057;
                case 38: goto L_0x0057;
                case 39: goto L_0x0057;
                case 40: goto L_0x0057;
                case 41: goto L_0x0057;
                case 42: goto L_0x0057;
                case 43: goto L_0x0057;
                case 44: goto L_0x0057;
                case 45: goto L_0x0057;
                case 46: goto L_0x0057;
                case 47: goto L_0x0057;
                case 48: goto L_0x0057;
                case 49: goto L_0x0057;
                case 50: goto L_0x0042;
                case 51: goto L_0x0030;
                case 52: goto L_0x0030;
                case 53: goto L_0x0030;
                case 54: goto L_0x0030;
                case 55: goto L_0x0030;
                case 56: goto L_0x0030;
                case 57: goto L_0x0030;
                case 58: goto L_0x0030;
                case 59: goto L_0x0030;
                case 60: goto L_0x002b;
                case 61: goto L_0x0024;
                case 62: goto L_0x0024;
                case 63: goto L_0x0024;
                case 64: goto L_0x0024;
                case 65: goto L_0x0024;
                case 66: goto L_0x0024;
                case 67: goto L_0x0024;
                case 68: goto L_0x002b;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x0108
        L_0x0024:
            boolean r2 = r10.s(r1, r0, r12)
            if (r2 == 0) goto L_0x0108
            goto L_0x0036
        L_0x002b:
            r10.w(r11, r0, r12)
            goto L_0x0108
        L_0x0030:
            boolean r2 = r10.s(r1, r0, r12)
            if (r2 == 0) goto L_0x0108
        L_0x0036:
            java.lang.Object r2 = androidx.wear.protolayout.protobuf.l1.o(r6, r12)
            androidx.wear.protolayout.protobuf.l1.v(r6, r11, r2)
            r10.J(r1, r0, r11)
            goto L_0x0108
        L_0x0042:
            java.lang.Class<?> r1 = androidx.wear.protolayout.protobuf.c1.f2063a
            java.lang.Object r1 = androidx.wear.protolayout.protobuf.l1.o(r6, r11)
            java.lang.Object r2 = androidx.wear.protolayout.protobuf.l1.o(r6, r12)
            androidx.wear.protolayout.protobuf.j0 r3 = r10.f2188q
            java.lang.Object r1 = r3.a(r1, r2)
            androidx.wear.protolayout.protobuf.l1.v(r6, r11, r1)
            goto L_0x0108
        L_0x0057:
            androidx.wear.protolayout.protobuf.e0 r1 = r10.f2185n
            r1.b(r6, r11, r12)
            goto L_0x0108
        L_0x005e:
            boolean r1 = r10.q(r0, r12)
            if (r1 == 0) goto L_0x0108
            goto L_0x00dd
        L_0x0066:
            boolean r1 = r10.q(r0, r12)
            if (r1 == 0) goto L_0x0108
            goto L_0x00c8
        L_0x006d:
            boolean r1 = r10.q(r0, r12)
            if (r1 == 0) goto L_0x0108
            goto L_0x00dd
        L_0x0075:
            boolean r1 = r10.q(r0, r12)
            if (r1 == 0) goto L_0x0108
            goto L_0x00c8
        L_0x007c:
            boolean r1 = r10.q(r0, r12)
            if (r1 == 0) goto L_0x0108
            goto L_0x00c8
        L_0x0083:
            boolean r1 = r10.q(r0, r12)
            if (r1 == 0) goto L_0x0108
            goto L_0x00c8
        L_0x008a:
            boolean r1 = r10.q(r0, r12)
            if (r1 == 0) goto L_0x0108
            goto L_0x009c
        L_0x0091:
            r10.v(r11, r0, r12)
            goto L_0x0108
        L_0x0096:
            boolean r1 = r10.q(r0, r12)
            if (r1 == 0) goto L_0x0108
        L_0x009c:
            java.lang.Object r1 = androidx.wear.protolayout.protobuf.l1.o(r6, r12)
            androidx.wear.protolayout.protobuf.l1.v(r6, r11, r1)
            goto L_0x0105
        L_0x00a4:
            boolean r1 = r10.q(r0, r12)
            if (r1 == 0) goto L_0x0108
            boolean r1 = androidx.wear.protolayout.protobuf.l1.g(r6, r12)
            androidx.wear.protolayout.protobuf.l1$e r2 = androidx.wear.protolayout.protobuf.l1.f2140c
            r2.k(r11, r6, r1)
            goto L_0x0105
        L_0x00b4:
            boolean r1 = r10.q(r0, r12)
            if (r1 == 0) goto L_0x0108
            goto L_0x00c8
        L_0x00bb:
            boolean r1 = r10.q(r0, r12)
            if (r1 == 0) goto L_0x0108
            goto L_0x00dd
        L_0x00c2:
            boolean r1 = r10.q(r0, r12)
            if (r1 == 0) goto L_0x0108
        L_0x00c8:
            int r1 = androidx.wear.protolayout.protobuf.l1.m(r6, r12)
            androidx.wear.protolayout.protobuf.l1.t(r1, r6, r11)
            goto L_0x0105
        L_0x00d0:
            boolean r1 = r10.q(r0, r12)
            if (r1 == 0) goto L_0x0108
            goto L_0x00dd
        L_0x00d7:
            boolean r1 = r10.q(r0, r12)
            if (r1 == 0) goto L_0x0108
        L_0x00dd:
            long r1 = androidx.wear.protolayout.protobuf.l1.n(r6, r12)
            androidx.wear.protolayout.protobuf.l1.u(r11, r6, r1)
            goto L_0x0105
        L_0x00e5:
            boolean r1 = r10.q(r0, r12)
            if (r1 == 0) goto L_0x0108
            float r1 = androidx.wear.protolayout.protobuf.l1.l(r6, r12)
            androidx.wear.protolayout.protobuf.l1$e r2 = androidx.wear.protolayout.protobuf.l1.f2140c
            r2.n(r11, r6, r1)
            goto L_0x0105
        L_0x00f5:
            boolean r1 = r10.q(r0, r12)
            if (r1 == 0) goto L_0x0108
            double r8 = androidx.wear.protolayout.protobuf.l1.k(r6, r12)
            androidx.wear.protolayout.protobuf.l1$e r4 = androidx.wear.protolayout.protobuf.l1.f2140c
            r5 = r11
            r4.m(r5, r6, r8)
        L_0x0105:
            r10.I(r0, r11)
        L_0x0108:
            int r0 = r0 + 3
            goto L_0x000a
        L_0x010c:
            java.lang.Class<?> r0 = androidx.wear.protolayout.protobuf.c1.f2063a
            androidx.wear.protolayout.protobuf.h1<?, ?> r0 = r10.f2186o
            java.lang.Object r1 = r0.g(r11)
            java.lang.Object r2 = r0.g(r12)
            java.lang.Object r1 = r0.k(r1, r2)
            r0.o(r11, r1)
            boolean r0 = r10.f2177f
            if (r0 == 0) goto L_0x0128
            androidx.wear.protolayout.protobuf.o<?> r10 = r10.f2187p
            androidx.wear.protolayout.protobuf.c1.A(r10, r11, r12)
        L_0x0128:
            return
        L_0x0129:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Mutating immutable message: "
            r12.<init>(r0)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.r0.a(java.lang.Object, java.lang.Object):void");
    }

    public final void b(T t8) {
        if (r(t8)) {
            if (t8 instanceof v) {
                v vVar = (v) t8;
                vVar.i();
                vVar.h();
                vVar.p();
            }
            int length = this.f2173a.length;
            for (int i8 = 0; i8 < length; i8 += 3) {
                int M = M(i8);
                long j8 = (long) (1048575 & M);
                int i9 = (M & 267386880) >>> 20;
                Unsafe unsafe = f2172s;
                if (i9 != 9) {
                    switch (i9) {
                        case 17:
                            break;
                        case 18:
                        case 19:
                        case EXERCISE_TYPE_DUMBBELL_FRONT_RAISE_VALUE:
                        case EXERCISE_TYPE_DUMBBELL_LATERAL_RAISE_VALUE:
                        case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_LEFT_ARM_VALUE:
                        case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_RIGHT_ARM_VALUE:
                        case EXERCISE_TYPE_DUMBBELL_TRICEPS_EXTENSION_TWO_ARM_VALUE:
                        case EXERCISE_TYPE_ELLIPTICAL_VALUE:
                        case EXERCISE_TYPE_EXERCISE_CLASS_VALUE:
                        case 27:
                        case EXERCISE_TYPE_FRISBEE_DISC_VALUE:
                        case EXERCISE_TYPE_FOOTBALL_AMERICAN_VALUE:
                        case EXERCISE_TYPE_FOOTBALL_AUSTRALIAN_VALUE:
                        case EXERCISE_TYPE_FORWARD_TWIST_VALUE:
                        case EXERCISE_TYPE_GOLF_VALUE:
                        case EXERCISE_TYPE_GUIDED_BREATHING_VALUE:
                        case EXERCISE_TYPE_GYMNASTICS_VALUE:
                        case EXERCISE_TYPE_HANDBALL_VALUE:
                        case EXERCISE_TYPE_HIGH_INTENSITY_INTERVAL_TRAINING_VALUE:
                        case EXERCISE_TYPE_HIKING_VALUE:
                        case EXERCISE_TYPE_ICE_HOCKEY_VALUE:
                        case EXERCISE_TYPE_ICE_SKATING_VALUE:
                        case EXERCISE_TYPE_JUMP_ROPE_VALUE:
                        case EXERCISE_TYPE_JUMPING_JACK_VALUE:
                        case EXERCISE_TYPE_LAT_PULL_DOWN_VALUE:
                        case EXERCISE_TYPE_LUNGE_VALUE:
                        case EXERCISE_TYPE_MARTIAL_ARTS_VALUE:
                        case EXERCISE_TYPE_MEDITATION_VALUE:
                        case EXERCISE_TYPE_PADDLING_VALUE:
                        case EXERCISE_TYPE_PARA_GLIDING_VALUE:
                        case EXERCISE_TYPE_PILATES_VALUE:
                        case EXERCISE_TYPE_PLANK_VALUE:
                            this.f2185n.a(j8, t8);
                            continue;
                        case EXERCISE_TYPE_RACQUETBALL_VALUE:
                            Object object = unsafe.getObject(t8, j8);
                            if (object != null) {
                                unsafe.putObject(t8, j8, this.f2188q.d(object));
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                if (q(i8, t8)) {
                    n(i8).b(unsafe.getObject(t8, j8));
                }
            }
            this.f2186o.j(t8);
            if (this.f2177f) {
                this.f2187p.f(t8);
            }
        }
    }

    public final boolean c(T t8) {
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            boolean z8 = true;
            if (i9 >= this.f2182k) {
                return !this.f2177f || this.f2187p.c(t8).j();
            }
            int i11 = this.f2181j[i9];
            int[] iArr = this.f2173a;
            int i12 = iArr[i11];
            int M = M(i11);
            int i13 = iArr[i11 + 2];
            int i14 = i13 & 1048575;
            int i15 = 1 << (i13 >>> 20);
            if (i14 != i8) {
                if (i14 != 1048575) {
                    i10 = f2172s.getInt(t8, (long) i14);
                }
                i8 = i14;
            }
            if ((268435456 & M) != 0) {
                if (!(i8 == 1048575 ? q(i11, t8) : (i10 & i15) != 0)) {
                    return false;
                }
            }
            int i16 = (267386880 & M) >>> 20;
            if (i16 == 9 || i16 == 17) {
                if (i8 == 1048575) {
                    z8 = q(i11, t8);
                } else if ((i15 & i10) == 0) {
                    z8 = false;
                }
                if (z8 && !n(i11).c(l1.o((long) (M & 1048575), t8))) {
                    return false;
                }
            } else {
                if (i16 != 27) {
                    if (i16 == 60 || i16 == 68) {
                        if (s(i12, i11, t8) && !n(i11).c(l1.o((long) (M & 1048575), t8))) {
                            return false;
                        }
                    } else if (i16 != 49) {
                        if (i16 != 50) {
                            continue;
                        } else {
                            Object o8 = l1.o((long) (M & 1048575), t8);
                            j0 j0Var = this.f2188q;
                            if (!j0Var.g(o8).isEmpty()) {
                                j0Var.e(m(i11));
                                throw null;
                            }
                        }
                    }
                }
                List list = (List) l1.o((long) (M & 1048575), t8);
                if (!list.isEmpty()) {
                    b1 n8 = n(i11);
                    int i17 = 0;
                    while (true) {
                        if (i17 >= list.size()) {
                            break;
                        } else if (!n8.c(list.get(i17))) {
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
        if (androidx.wear.protolayout.protobuf.c1.B(androidx.wear.protolayout.protobuf.l1.o(r7, r11), androidx.wear.protolayout.protobuf.l1.o(r7, r12)) != false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        if (androidx.wear.protolayout.protobuf.c1.B(androidx.wear.protolayout.protobuf.l1.o(r7, r11), androidx.wear.protolayout.protobuf.l1.o(r7, r12)) != false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        if (androidx.wear.protolayout.protobuf.l1.n(r7, r11) == androidx.wear.protolayout.protobuf.l1.n(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
        if (androidx.wear.protolayout.protobuf.l1.m(r7, r11) == androidx.wear.protolayout.protobuf.l1.m(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        if (androidx.wear.protolayout.protobuf.l1.n(r7, r11) == androidx.wear.protolayout.protobuf.l1.n(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ad, code lost:
        if (androidx.wear.protolayout.protobuf.l1.m(r7, r11) == androidx.wear.protolayout.protobuf.l1.m(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bf, code lost:
        if (androidx.wear.protolayout.protobuf.l1.m(r7, r11) == androidx.wear.protolayout.protobuf.l1.m(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d1, code lost:
        if (androidx.wear.protolayout.protobuf.l1.m(r7, r11) == androidx.wear.protolayout.protobuf.l1.m(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e7, code lost:
        if (androidx.wear.protolayout.protobuf.c1.B(androidx.wear.protolayout.protobuf.l1.o(r7, r11), androidx.wear.protolayout.protobuf.l1.o(r7, r12)) != false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fd, code lost:
        if (androidx.wear.protolayout.protobuf.c1.B(androidx.wear.protolayout.protobuf.l1.o(r7, r11), androidx.wear.protolayout.protobuf.l1.o(r7, r12)) != false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0113, code lost:
        if (androidx.wear.protolayout.protobuf.c1.B(androidx.wear.protolayout.protobuf.l1.o(r7, r11), androidx.wear.protolayout.protobuf.l1.o(r7, r12)) != false) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0125, code lost:
        if (androidx.wear.protolayout.protobuf.l1.g(r7, r11) == androidx.wear.protolayout.protobuf.l1.g(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0137, code lost:
        if (androidx.wear.protolayout.protobuf.l1.m(r7, r11) == androidx.wear.protolayout.protobuf.l1.m(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014b, code lost:
        if (androidx.wear.protolayout.protobuf.l1.n(r7, r11) == androidx.wear.protolayout.protobuf.l1.n(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015d, code lost:
        if (androidx.wear.protolayout.protobuf.l1.m(r7, r11) == androidx.wear.protolayout.protobuf.l1.m(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0170, code lost:
        if (androidx.wear.protolayout.protobuf.l1.n(r7, r11) == androidx.wear.protolayout.protobuf.l1.n(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0183, code lost:
        if (androidx.wear.protolayout.protobuf.l1.n(r7, r11) == androidx.wear.protolayout.protobuf.l1.n(r7, r12)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019c, code lost:
        if (java.lang.Float.floatToIntBits(androidx.wear.protolayout.protobuf.l1.l(r7, r11)) == java.lang.Float.floatToIntBits(androidx.wear.protolayout.protobuf.l1.l(r7, r12))) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b7, code lost:
        if (java.lang.Double.doubleToLongBits(androidx.wear.protolayout.protobuf.l1.k(r7, r11)) == java.lang.Double.doubleToLongBits(androidx.wear.protolayout.protobuf.l1.k(r7, r12))) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ba, code lost:
        r4 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(T r11, T r12) {
        /*
            r10 = this;
            int[] r0 = r10.f2173a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x0005:
            r4 = 1
            if (r3 >= r1) goto L_0x01c2
            int r5 = r10.M(r3)
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
            int r9 = androidx.wear.protolayout.protobuf.l1.m(r5, r11)
            int r5 = androidx.wear.protolayout.protobuf.l1.m(r5, r12)
            if (r9 != r5) goto L_0x002e
            r5 = r4
            goto L_0x002f
        L_0x002e:
            r5 = r2
        L_0x002f:
            if (r5 == 0) goto L_0x01ba
            java.lang.Object r5 = androidx.wear.protolayout.protobuf.l1.o(r7, r11)
            java.lang.Object r6 = androidx.wear.protolayout.protobuf.l1.o(r7, r12)
            boolean r5 = androidx.wear.protolayout.protobuf.c1.B(r5, r6)
            if (r5 == 0) goto L_0x01ba
            goto L_0x01bb
        L_0x0041:
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r7, r11)
            java.lang.Object r5 = androidx.wear.protolayout.protobuf.l1.o(r7, r12)
            boolean r4 = androidx.wear.protolayout.protobuf.c1.B(r4, r5)
            goto L_0x01bb
        L_0x004f:
            boolean r5 = r10.j(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            java.lang.Object r5 = androidx.wear.protolayout.protobuf.l1.o(r7, r11)
            java.lang.Object r6 = androidx.wear.protolayout.protobuf.l1.o(r7, r12)
            boolean r5 = androidx.wear.protolayout.protobuf.c1.B(r5, r6)
            if (r5 == 0) goto L_0x01ba
            goto L_0x01bb
        L_0x0065:
            boolean r5 = r10.j(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            long r5 = androidx.wear.protolayout.protobuf.l1.n(r7, r11)
            long r7 = androidx.wear.protolayout.protobuf.l1.n(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x01ba
            goto L_0x01bb
        L_0x0079:
            boolean r5 = r10.j(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            int r5 = androidx.wear.protolayout.protobuf.l1.m(r7, r11)
            int r6 = androidx.wear.protolayout.protobuf.l1.m(r7, r12)
            if (r5 != r6) goto L_0x01ba
            goto L_0x01bb
        L_0x008b:
            boolean r5 = r10.j(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            long r5 = androidx.wear.protolayout.protobuf.l1.n(r7, r11)
            long r7 = androidx.wear.protolayout.protobuf.l1.n(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x01ba
            goto L_0x01bb
        L_0x009f:
            boolean r5 = r10.j(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            int r5 = androidx.wear.protolayout.protobuf.l1.m(r7, r11)
            int r6 = androidx.wear.protolayout.protobuf.l1.m(r7, r12)
            if (r5 != r6) goto L_0x01ba
            goto L_0x01bb
        L_0x00b1:
            boolean r5 = r10.j(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            int r5 = androidx.wear.protolayout.protobuf.l1.m(r7, r11)
            int r6 = androidx.wear.protolayout.protobuf.l1.m(r7, r12)
            if (r5 != r6) goto L_0x01ba
            goto L_0x01bb
        L_0x00c3:
            boolean r5 = r10.j(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            int r5 = androidx.wear.protolayout.protobuf.l1.m(r7, r11)
            int r6 = androidx.wear.protolayout.protobuf.l1.m(r7, r12)
            if (r5 != r6) goto L_0x01ba
            goto L_0x01bb
        L_0x00d5:
            boolean r5 = r10.j(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            java.lang.Object r5 = androidx.wear.protolayout.protobuf.l1.o(r7, r11)
            java.lang.Object r6 = androidx.wear.protolayout.protobuf.l1.o(r7, r12)
            boolean r5 = androidx.wear.protolayout.protobuf.c1.B(r5, r6)
            if (r5 == 0) goto L_0x01ba
            goto L_0x01bb
        L_0x00eb:
            boolean r5 = r10.j(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            java.lang.Object r5 = androidx.wear.protolayout.protobuf.l1.o(r7, r11)
            java.lang.Object r6 = androidx.wear.protolayout.protobuf.l1.o(r7, r12)
            boolean r5 = androidx.wear.protolayout.protobuf.c1.B(r5, r6)
            if (r5 == 0) goto L_0x01ba
            goto L_0x01bb
        L_0x0101:
            boolean r5 = r10.j(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            java.lang.Object r5 = androidx.wear.protolayout.protobuf.l1.o(r7, r11)
            java.lang.Object r6 = androidx.wear.protolayout.protobuf.l1.o(r7, r12)
            boolean r5 = androidx.wear.protolayout.protobuf.c1.B(r5, r6)
            if (r5 == 0) goto L_0x01ba
            goto L_0x01bb
        L_0x0117:
            boolean r5 = r10.j(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            boolean r5 = androidx.wear.protolayout.protobuf.l1.g(r7, r11)
            boolean r6 = androidx.wear.protolayout.protobuf.l1.g(r7, r12)
            if (r5 != r6) goto L_0x01ba
            goto L_0x01bb
        L_0x0129:
            boolean r5 = r10.j(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            int r5 = androidx.wear.protolayout.protobuf.l1.m(r7, r11)
            int r6 = androidx.wear.protolayout.protobuf.l1.m(r7, r12)
            if (r5 != r6) goto L_0x01ba
            goto L_0x01bb
        L_0x013b:
            boolean r5 = r10.j(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            long r5 = androidx.wear.protolayout.protobuf.l1.n(r7, r11)
            long r7 = androidx.wear.protolayout.protobuf.l1.n(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x01ba
            goto L_0x01bb
        L_0x014f:
            boolean r5 = r10.j(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            int r5 = androidx.wear.protolayout.protobuf.l1.m(r7, r11)
            int r6 = androidx.wear.protolayout.protobuf.l1.m(r7, r12)
            if (r5 != r6) goto L_0x01ba
            goto L_0x01bb
        L_0x0160:
            boolean r5 = r10.j(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            long r5 = androidx.wear.protolayout.protobuf.l1.n(r7, r11)
            long r7 = androidx.wear.protolayout.protobuf.l1.n(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x01ba
            goto L_0x01bb
        L_0x0173:
            boolean r5 = r10.j(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            long r5 = androidx.wear.protolayout.protobuf.l1.n(r7, r11)
            long r7 = androidx.wear.protolayout.protobuf.l1.n(r7, r12)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x01ba
            goto L_0x01bb
        L_0x0186:
            boolean r5 = r10.j(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            float r5 = androidx.wear.protolayout.protobuf.l1.l(r7, r11)
            int r5 = java.lang.Float.floatToIntBits(r5)
            float r6 = androidx.wear.protolayout.protobuf.l1.l(r7, r12)
            int r6 = java.lang.Float.floatToIntBits(r6)
            if (r5 != r6) goto L_0x01ba
            goto L_0x01bb
        L_0x019f:
            boolean r5 = r10.j(r11, r3, r12)
            if (r5 == 0) goto L_0x01ba
            double r5 = androidx.wear.protolayout.protobuf.l1.k(r7, r11)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            double r7 = androidx.wear.protolayout.protobuf.l1.k(r7, r12)
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
            androidx.wear.protolayout.protobuf.h1<?, ?> r0 = r10.f2186o
            java.lang.Object r1 = r0.g(r11)
            java.lang.Object r0 = r0.g(r12)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01d3
            return r2
        L_0x01d3:
            boolean r0 = r10.f2177f
            if (r0 == 0) goto L_0x01e6
            androidx.wear.protolayout.protobuf.o<?> r10 = r10.f2187p
            androidx.wear.protolayout.protobuf.r r11 = r10.c(r11)
            androidx.wear.protolayout.protobuf.r r10 = r10.c(r12)
            boolean r10 = r11.equals(r10)
            return r10
        L_0x01e6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.r0.d(java.lang.Object, java.lang.Object):boolean");
    }

    public final int e(T t8) {
        return this.f2179h ? p(t8) : o(t8);
    }

    public final T f() {
        return this.f2184m.a(this.e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        r4 = androidx.wear.protolayout.protobuf.l1.o(r6, r10);
        r3 = r3 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        r3 = r3 * 53;
        r4 = A(r6, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ab, code lost:
        r3 = r3 * 53;
        r4 = B(r6, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dd, code lost:
        if (r4 != null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e0, code lost:
        r3 = r3 * 53;
        r4 = androidx.wear.protolayout.protobuf.l1.o(r6, r10);
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
        r4 = ((java.lang.String) androidx.wear.protolayout.protobuf.l1.o(r6, r10)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010e, code lost:
        r4 = androidx.wear.protolayout.protobuf.x.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0127, code lost:
        r4 = java.lang.Float.floatToIntBits(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0132, code lost:
        r4 = java.lang.Double.doubleToLongBits(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0136, code lost:
        r4 = androidx.wear.protolayout.protobuf.x.b(r4);
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
            int[] r0 = r9.f2173a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x0005:
            if (r2 >= r1) goto L_0x013f
            int r4 = r9.M(r2)
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
            boolean r4 = r9.s(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x005e
        L_0x0023:
            boolean r4 = r9.s(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x00ab
        L_0x002b:
            boolean r4 = r9.s(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x0096
        L_0x0033:
            boolean r4 = r9.s(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x00ab
        L_0x003b:
            boolean r4 = r9.s(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x0096
        L_0x0042:
            boolean r4 = r9.s(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x0096
        L_0x0049:
            boolean r4 = r9.s(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x0096
        L_0x0050:
            boolean r4 = r9.s(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x00e0
        L_0x0058:
            boolean r4 = r9.s(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
        L_0x005e:
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r6, r10)
            int r3 = r3 * 53
            goto L_0x00e6
        L_0x0066:
            boolean r4 = r9.s(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x00fb
        L_0x006e:
            boolean r4 = r9.s(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            int r3 = r3 * 53
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r6, r10)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            goto L_0x010e
        L_0x0082:
            boolean r4 = r9.s(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x0096
        L_0x0089:
            boolean r4 = r9.s(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x00ab
        L_0x0090:
            boolean r4 = r9.s(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
        L_0x0096:
            int r3 = r3 * 53
            int r4 = A(r6, r10)
            goto L_0x013a
        L_0x009e:
            boolean r4 = r9.s(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            goto L_0x00ab
        L_0x00a5:
            boolean r4 = r9.s(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
        L_0x00ab:
            int r3 = r3 * 53
            long r4 = B(r6, r10)
            goto L_0x0136
        L_0x00b3:
            boolean r4 = r9.s(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            int r3 = r3 * 53
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r6, r10)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            goto L_0x0127
        L_0x00c6:
            boolean r4 = r9.s(r5, r2, r10)
            if (r4 == 0) goto L_0x013b
            int r3 = r3 * 53
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r6, r10)
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            goto L_0x0132
        L_0x00d9:
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r6, r10)
            if (r4 == 0) goto L_0x00f6
            goto L_0x00f1
        L_0x00e0:
            int r3 = r3 * 53
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r6, r10)
        L_0x00e6:
            int r4 = r4.hashCode()
            goto L_0x013a
        L_0x00eb:
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r6, r10)
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
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r6, r10)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.hashCode()
            goto L_0x013a
        L_0x0108:
            int r3 = r3 * 53
            boolean r4 = androidx.wear.protolayout.protobuf.l1.g(r6, r10)
        L_0x010e:
            int r4 = androidx.wear.protolayout.protobuf.x.a(r4)
            goto L_0x013a
        L_0x0113:
            int r3 = r3 * 53
            int r4 = androidx.wear.protolayout.protobuf.l1.m(r6, r10)
            goto L_0x013a
        L_0x011a:
            int r3 = r3 * 53
            long r4 = androidx.wear.protolayout.protobuf.l1.n(r6, r10)
            goto L_0x0136
        L_0x0121:
            int r3 = r3 * 53
            float r4 = androidx.wear.protolayout.protobuf.l1.l(r6, r10)
        L_0x0127:
            int r4 = java.lang.Float.floatToIntBits(r4)
            goto L_0x013a
        L_0x012c:
            int r3 = r3 * 53
            double r4 = androidx.wear.protolayout.protobuf.l1.k(r6, r10)
        L_0x0132:
            long r4 = java.lang.Double.doubleToLongBits(r4)
        L_0x0136:
            int r4 = androidx.wear.protolayout.protobuf.x.b(r4)
        L_0x013a:
            int r3 = r3 + r4
        L_0x013b:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x013f:
            int r3 = r3 * 53
            androidx.wear.protolayout.protobuf.h1<?, ?> r0 = r9.f2186o
            java.lang.Object r0 = r0.g(r10)
            int r0 = r0.hashCode()
            int r3 = r3 + r0
            boolean r0 = r9.f2177f
            if (r0 == 0) goto L_0x015d
            int r3 = r3 * 53
            androidx.wear.protolayout.protobuf.o<?> r9 = r9.f2187p
            androidx.wear.protolayout.protobuf.r r9 = r9.c(r10)
            int r9 = r9.hashCode()
            int r3 = r3 + r9
        L_0x015d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.r0.g(java.lang.Object):int");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:137|136|206|207|(0)|210|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02ae, code lost:
        r7.q(r14.c(r1, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02b9, code lost:
        r7.p(r14.c(r1, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02c4, code lost:
        r7.o(r14.c(r1, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02cf, code lost:
        r7.n(r14.c(r1, r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02de, code lost:
        r3 = l(r5);
        r4 = androidx.wear.protolayout.protobuf.c1.f2063a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02e4, code lost:
        if (r3 != null) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02e6, code lost:
        r21 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02ec, code lost:
        if ((r2 instanceof java.util.RandomAccess) == false) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02ee, code lost:
        r4 = r2.size();
        r6 = r15;
        r5 = 0;
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02f5, code lost:
        if (r14 >= r4) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02fd, code lost:
        r21 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02ff, code lost:
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r13 = ((java.lang.Integer) r2.get(r14)).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0307, code lost:
        if (r3.a() == false) goto L_0x0319;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0309, code lost:
        if (r14 == r5) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x030b, code lost:
        r2.set(r5, java.lang.Integer.valueOf(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0313, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0316, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0319, code lost:
        r6 = androidx.wear.protolayout.protobuf.c1.C(r9, r1, r13, r6, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x031d, code lost:
        r14 = r14 + 1;
        r13 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0329, code lost:
        r21 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x032b, code lost:
        if (r5 == r4) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x032d, code lost:
        r2.subList(r5, r4).clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0334, code lost:
        r15 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0337, code lost:
        r21 = r13;
        r2 = r2.iterator();
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0342, code lost:
        if (r2.hasNext() == false) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0344, code lost:
        r5 = ((java.lang.Integer) r2.next()).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0352, code lost:
        if (r3.a() != false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0354, code lost:
        r4 = androidx.wear.protolayout.protobuf.c1.C(r9, r1, r5, r4, r10);
        r2.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x035c, code lost:
        r15 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x036a, code lost:
        r7.s(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03a7, code lost:
        r7.d(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03b7, code lost:
        r7.i(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03c7, code lost:
        r7.j(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03d7, code lost:
        r7.l(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03e7, code lost:
        r7.t(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03f7, code lost:
        r7.m(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0407, code lost:
        r7.k(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0417, code lost:
        r7.g(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04d2, code lost:
        K(r9, r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04de, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0525, code lost:
        androidx.wear.protolayout.protobuf.l1.t(r3, r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0548, code lost:
        androidx.wear.protolayout.protobuf.l1.u(r9, r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x057a, code lost:
        I(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05a1, code lost:
        r15 = r10.f(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05ac, code lost:
        r13 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05ae, code lost:
        if (r13 < r12) goto L_0x05b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05b0, code lost:
        k(r25, r11[r13], r15, r10, r25);
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05c0, code lost:
        if (r15 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c7, code lost:
        r4 = java.lang.Long.valueOf(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d8, code lost:
        r4 = java.lang.Integer.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014b, code lost:
        L(r1, r5, r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c3, code lost:
        androidx.wear.protolayout.protobuf.l1.v(r2, r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01c6, code lost:
        J(r1, r5, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x022d, code lost:
        r7.h(r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:206:0x059c */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x05a1 A[Catch:{ all -> 0x0313 }] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x05cf A[LOOP:7: B:218:0x05cd->B:219:0x05cf, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x05e1  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x05ac A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x05c5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(T r25, androidx.wear.protolayout.protobuf.a1 r26, androidx.wear.protolayout.protobuf.n r27) {
        /*
            r24 = this;
            r8 = r24
            r9 = r25
            r0 = r27
            r27.getClass()
            boolean r1 = r(r25)
            if (r1 == 0) goto L_0x05e5
            androidx.wear.protolayout.protobuf.h1<?, ?> r10 = r8.f2186o
            int[] r11 = r8.f2181j
            int r12 = r8.f2183l
            int r13 = r8.f2182k
            r15 = 0
            r16 = 0
        L_0x001a:
            r7 = r26
            androidx.wear.protolayout.protobuf.i r7 = (androidx.wear.protolayout.protobuf.i) r7     // Catch:{ all -> 0x0322 }
            int r1 = r7.a()     // Catch:{ all -> 0x0322 }
            int r5 = r8.C(r1)     // Catch:{ all -> 0x0322 }
            if (r5 >= 0) goto L_0x008a
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0046
        L_0x002d:
            if (r13 >= r12) goto L_0x003f
            r3 = r11[r13]
            r1 = r24
            r2 = r25
            r4 = r15
            r5 = r10
            r6 = r25
            r1.k(r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x002d
        L_0x003f:
            if (r15 == 0) goto L_0x05c4
        L_0x0041:
            r10.n(r9, r15)
            goto L_0x05c4
        L_0x0046:
            boolean r2 = r8.f2177f     // Catch:{ all -> 0x0322 }
            androidx.wear.protolayout.protobuf.o<?> r3 = r8.f2187p
            if (r2 != 0) goto L_0x004e
            r1 = 0
            goto L_0x0054
        L_0x004e:
            androidx.wear.protolayout.protobuf.o0 r2 = r8.e     // Catch:{ all -> 0x0322 }
            java.lang.Object r1 = r3.b(r0, r2, r1)     // Catch:{ all -> 0x0322 }
        L_0x0054:
            if (r1 == 0) goto L_0x0061
            if (r16 != 0) goto L_0x005c
            androidx.wear.protolayout.protobuf.r r16 = r3.d(r9)     // Catch:{ all -> 0x0322 }
        L_0x005c:
            java.lang.Object r1 = r3.g(r1)     // Catch:{ all -> 0x0322 }
            goto L_0x0071
        L_0x0061:
            r10.p()     // Catch:{ all -> 0x0322 }
            if (r15 != 0) goto L_0x006a
            java.lang.Object r15 = r10.f(r9)     // Catch:{ all -> 0x0322 }
        L_0x006a:
            boolean r1 = r10.l(r15, r7)     // Catch:{ all -> 0x0322 }
            if (r1 == 0) goto L_0x0074
            r1 = r15
        L_0x0071:
            r15 = r1
            goto L_0x0111
        L_0x0074:
            if (r13 >= r12) goto L_0x0086
            r3 = r11[r13]
            r1 = r24
            r2 = r25
            r4 = r15
            r5 = r10
            r6 = r25
            r1.k(r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x0074
        L_0x0086:
            if (r15 == 0) goto L_0x05c4
            goto L_0x05c2
        L_0x008a:
            int r3 = r8.M(r5)     // Catch:{ all -> 0x0322 }
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = r2 & r3
            int r2 = r2 >>> 20
            r4 = 3
            r20 = 1048575(0xfffff, float:1.469367E-39)
            androidx.wear.protolayout.protobuf.h r6 = r7.f2114a
            androidx.wear.protolayout.protobuf.e0 r14 = r8.f2185n
            switch(r2) {
                case 0: goto L_0x0562;
                case 1: goto L_0x054c;
                case 2: goto L_0x0539;
                case 3: goto L_0x0529;
                case 4: goto L_0x0516;
                case 5: goto L_0x0506;
                case 6: goto L_0x04f6;
                case 7: goto L_0x04e1;
                case 8: goto L_0x04d7;
                case 9: goto L_0x04bd;
                case 10: goto L_0x04ae;
                case 11: goto L_0x049d;
                case 12: goto L_0x0476;
                case 13: goto L_0x0465;
                case 14: goto L_0x0454;
                case 15: goto L_0x0443;
                case 16: goto L_0x0432;
                case 17: goto L_0x041c;
                case 18: goto L_0x040c;
                case 19: goto L_0x03fc;
                case 20: goto L_0x03ec;
                case 21: goto L_0x03dc;
                case 22: goto L_0x03cc;
                case 23: goto L_0x03bc;
                case 24: goto L_0x03ac;
                case 25: goto L_0x039c;
                case 26: goto L_0x0393;
                case 27: goto L_0x037f;
                case 28: goto L_0x036f;
                case 29: goto L_0x035f;
                case 30: goto L_0x02d3;
                case 31: goto L_0x02c8;
                case 32: goto L_0x02bd;
                case 33: goto L_0x02b2;
                case 34: goto L_0x02a7;
                case 35: goto L_0x029a;
                case 36: goto L_0x028d;
                case 37: goto L_0x0280;
                case 38: goto L_0x0273;
                case 39: goto L_0x0266;
                case 40: goto L_0x0259;
                case 41: goto L_0x024c;
                case 42: goto L_0x023f;
                case 43: goto L_0x0232;
                case 44: goto L_0x0224;
                case 45: goto L_0x0219;
                case 46: goto L_0x020e;
                case 47: goto L_0x0203;
                case 48: goto L_0x01f8;
                case 49: goto L_0x01dd;
                case 50: goto L_0x01cf;
                case 51: goto L_0x01b4;
                case 52: goto L_0x01a4;
                case 53: goto L_0x0197;
                case 54: goto L_0x018a;
                case 55: goto L_0x017d;
                case 56: goto L_0x0170;
                case 57: goto L_0x0163;
                case 58: goto L_0x0153;
                case 59: goto L_0x014f;
                case 60: goto L_0x013a;
                case 61: goto L_0x0131;
                case 62: goto L_0x0125;
                case 63: goto L_0x00f6;
                case 64: goto L_0x00ea;
                case 65: goto L_0x00de;
                case 66: goto L_0x00cd;
                case 67: goto L_0x00bc;
                case 68: goto L_0x00aa;
                default: goto L_0x009e;
            }
        L_0x009e:
            r21 = r13
            r17 = 0
            if (r15 != 0) goto L_0x057f
            java.lang.Object r0 = r10.f(r9)     // Catch:{ a -> 0x059c }
            goto L_0x057e
        L_0x00aa:
            java.lang.Object r2 = r8.y(r1, r5, r9)     // Catch:{ a -> 0x01d9 }
            androidx.wear.protolayout.protobuf.o0 r2 = (androidx.wear.protolayout.protobuf.o0) r2     // Catch:{ a -> 0x01d9 }
            androidx.wear.protolayout.protobuf.b1 r3 = r8.n(r5)     // Catch:{ a -> 0x01d9 }
            r7.v(r4)     // Catch:{ a -> 0x01d9 }
            r7.b(r2, r3, r0)     // Catch:{ a -> 0x01d9 }
            goto L_0x014b
        L_0x00bc:
            r2 = r3 & r20
            long r2 = (long) r2     // Catch:{ a -> 0x01d9 }
            r4 = 0
            r7.v(r4)     // Catch:{ a -> 0x01d9 }
            long r18 = r6.s()     // Catch:{ a -> 0x01d9 }
        L_0x00c7:
            java.lang.Long r4 = java.lang.Long.valueOf(r18)     // Catch:{ a -> 0x01d9 }
            goto L_0x01c3
        L_0x00cd:
            r2 = r3 & r20
            long r2 = (long) r2     // Catch:{ a -> 0x01d9 }
            r4 = 0
            r7.v(r4)     // Catch:{ a -> 0x01d9 }
            int r4 = r6.r()     // Catch:{ a -> 0x01d9 }
        L_0x00d8:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ a -> 0x01d9 }
            goto L_0x01c3
        L_0x00de:
            r2 = r3 & r20
            long r2 = (long) r2     // Catch:{ a -> 0x01d9 }
            r4 = 1
            r7.v(r4)     // Catch:{ a -> 0x01d9 }
            long r18 = r6.q()     // Catch:{ a -> 0x01d9 }
            goto L_0x00c7
        L_0x00ea:
            r2 = r3 & r20
            long r2 = (long) r2     // Catch:{ a -> 0x01d9 }
            r4 = 5
            r7.v(r4)     // Catch:{ a -> 0x01d9 }
            int r4 = r6.p()     // Catch:{ a -> 0x01d9 }
            goto L_0x00d8
        L_0x00f6:
            r2 = 0
            r7.v(r2)     // Catch:{ a -> 0x01d9 }
            int r2 = r6.j()     // Catch:{ a -> 0x01d9 }
            androidx.wear.protolayout.protobuf.x$b r4 = r8.l(r5)     // Catch:{ a -> 0x01d9 }
            if (r4 == 0) goto L_0x0117
            boolean r4 = r4.a()     // Catch:{ a -> 0x01d9 }
            if (r4 == 0) goto L_0x010b
            goto L_0x0117
        L_0x010b:
            java.lang.Object r1 = androidx.wear.protolayout.protobuf.c1.C(r9, r1, r2, r15, r10)     // Catch:{ a -> 0x01d9 }
            goto L_0x0071
        L_0x0111:
            r21 = r13
            r17 = 0
            goto L_0x05c5
        L_0x0117:
            r3 = r3 & r20
            long r3 = (long) r3     // Catch:{ a -> 0x01d9 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x01d9 }
            r22 = r3
            r4 = r2
            r2 = r22
            goto L_0x01c3
        L_0x0125:
            r2 = r3 & r20
            long r2 = (long) r2     // Catch:{ a -> 0x01d9 }
            r4 = 0
            r7.v(r4)     // Catch:{ a -> 0x01d9 }
            int r4 = r6.w()     // Catch:{ a -> 0x01d9 }
            goto L_0x00d8
        L_0x0131:
            r2 = r3 & r20
            long r2 = (long) r2     // Catch:{ a -> 0x01d9 }
            androidx.wear.protolayout.protobuf.g r4 = r7.e()     // Catch:{ a -> 0x01d9 }
            goto L_0x01c3
        L_0x013a:
            java.lang.Object r2 = r8.y(r1, r5, r9)     // Catch:{ a -> 0x01d9 }
            androidx.wear.protolayout.protobuf.o0 r2 = (androidx.wear.protolayout.protobuf.o0) r2     // Catch:{ a -> 0x01d9 }
            androidx.wear.protolayout.protobuf.b1 r3 = r8.n(r5)     // Catch:{ a -> 0x01d9 }
            r4 = 2
            r7.v(r4)     // Catch:{ a -> 0x01d9 }
            r7.c(r2, r3, r0)     // Catch:{ a -> 0x01d9 }
        L_0x014b:
            r8.L(r1, r5, r9, r2)     // Catch:{ a -> 0x01d9 }
            goto L_0x0111
        L_0x014f:
            r8.F(r9, r3, r7)     // Catch:{ a -> 0x01d9 }
            goto L_0x01c6
        L_0x0153:
            r2 = r3 & r20
            long r2 = (long) r2     // Catch:{ a -> 0x01d9 }
            r4 = 0
            r7.v(r4)     // Catch:{ a -> 0x01d9 }
            boolean r4 = r6.g()     // Catch:{ a -> 0x01d9 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ a -> 0x01d9 }
            goto L_0x01c3
        L_0x0163:
            r2 = r3 & r20
            long r2 = (long) r2     // Catch:{ a -> 0x01d9 }
            r4 = 5
            r7.v(r4)     // Catch:{ a -> 0x01d9 }
            int r4 = r6.k()     // Catch:{ a -> 0x01d9 }
            goto L_0x00d8
        L_0x0170:
            r2 = r3 & r20
            long r2 = (long) r2     // Catch:{ a -> 0x01d9 }
            r4 = 1
            r7.v(r4)     // Catch:{ a -> 0x01d9 }
            long r18 = r6.l()     // Catch:{ a -> 0x01d9 }
            goto L_0x00c7
        L_0x017d:
            r2 = r3 & r20
            long r2 = (long) r2     // Catch:{ a -> 0x01d9 }
            r4 = 0
            r7.v(r4)     // Catch:{ a -> 0x01d9 }
            int r4 = r6.n()     // Catch:{ a -> 0x01d9 }
            goto L_0x00d8
        L_0x018a:
            r2 = r3 & r20
            long r2 = (long) r2     // Catch:{ a -> 0x01d9 }
            r4 = 0
            r7.v(r4)     // Catch:{ a -> 0x01d9 }
            long r18 = r6.x()     // Catch:{ a -> 0x01d9 }
            goto L_0x00c7
        L_0x0197:
            r2 = r3 & r20
            long r2 = (long) r2     // Catch:{ a -> 0x01d9 }
            r4 = 0
            r7.v(r4)     // Catch:{ a -> 0x01d9 }
            long r18 = r6.o()     // Catch:{ a -> 0x01d9 }
            goto L_0x00c7
        L_0x01a4:
            r2 = r3 & r20
            long r2 = (long) r2     // Catch:{ a -> 0x01d9 }
            r4 = 5
            r7.v(r4)     // Catch:{ a -> 0x01d9 }
            float r4 = r6.m()     // Catch:{ a -> 0x01d9 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ a -> 0x01d9 }
            goto L_0x01c3
        L_0x01b4:
            r2 = r3 & r20
            long r2 = (long) r2     // Catch:{ a -> 0x01d9 }
            r4 = 1
            r7.v(r4)     // Catch:{ a -> 0x01d9 }
            double r18 = r6.i()     // Catch:{ a -> 0x01d9 }
            java.lang.Double r4 = java.lang.Double.valueOf(r18)     // Catch:{ a -> 0x01d9 }
        L_0x01c3:
            androidx.wear.protolayout.protobuf.l1.v(r2, r9, r4)     // Catch:{ a -> 0x01d9 }
        L_0x01c6:
            r8.J(r1, r5, r9)     // Catch:{ a -> 0x01d9 }
            goto L_0x0111
        L_0x01cb:
            r21 = r13
            goto L_0x05cb
        L_0x01cf:
            java.lang.Object r1 = r8.m(r5)     // Catch:{ a -> 0x01d9 }
            r8.u(r9, r5, r1, r7)     // Catch:{ a -> 0x01d9 }
            r17 = 0
            throw r17     // Catch:{ a -> 0x0325 }
        L_0x01d9:
            r17 = 0
            goto L_0x0325
        L_0x01dd:
            r17 = 0
            r1 = r3 & r20
            long r3 = (long) r1     // Catch:{ a -> 0x0325 }
            androidx.wear.protolayout.protobuf.b1 r6 = r8.n(r5)     // Catch:{ a -> 0x0325 }
            r1 = r24
            r2 = r25
            r5 = r7
            r14 = r7
            r7 = r27
            r1.D(r2, r3, r5, r6, r7)     // Catch:{ a -> 0x01f3 }
            goto L_0x02e6
        L_0x01f3:
            r21 = r13
            r7 = r14
            goto L_0x059c
        L_0x01f8:
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1
        L_0x01fd:
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x0325 }
            goto L_0x02ae
        L_0x0203:
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x0325 }
        L_0x0208:
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x0325 }
            goto L_0x02b9
        L_0x020e:
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x0325 }
        L_0x0213:
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x0325 }
            goto L_0x02c4
        L_0x0219:
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x0325 }
        L_0x021e:
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x0325 }
            goto L_0x02cf
        L_0x0224:
            r17 = 0
            r2 = r3 & r20
            long r2 = (long) r2     // Catch:{ a -> 0x0325 }
            java.util.List r2 = r14.c(r2, r9)     // Catch:{ a -> 0x0325 }
        L_0x022d:
            r7.h(r2)     // Catch:{ a -> 0x0325 }
            goto L_0x02de
        L_0x0232:
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x0325 }
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x0325 }
            r21 = r13
            goto L_0x036a
        L_0x023f:
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x0325 }
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x0325 }
            r21 = r13
            goto L_0x03a7
        L_0x024c:
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x0325 }
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x0325 }
            r21 = r13
            goto L_0x03b7
        L_0x0259:
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x0325 }
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x0325 }
            r21 = r13
            goto L_0x03c7
        L_0x0266:
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x0325 }
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x0325 }
            r21 = r13
            goto L_0x03d7
        L_0x0273:
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x0325 }
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x0325 }
            r21 = r13
            goto L_0x03e7
        L_0x0280:
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x0325 }
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x0325 }
            r21 = r13
            goto L_0x03f7
        L_0x028d:
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x0325 }
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x0325 }
            r21 = r13
            goto L_0x0407
        L_0x029a:
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x0325 }
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x0325 }
            r21 = r13
            goto L_0x0417
        L_0x02a7:
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x0325 }
            goto L_0x01fd
        L_0x02ae:
            r7.q(r1)     // Catch:{ a -> 0x0325 }
            goto L_0x02e6
        L_0x02b2:
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x0325 }
            goto L_0x0208
        L_0x02b9:
            r7.p(r1)     // Catch:{ a -> 0x0325 }
            goto L_0x02e6
        L_0x02bd:
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x0325 }
            goto L_0x0213
        L_0x02c4:
            r7.o(r1)     // Catch:{ a -> 0x0325 }
            goto L_0x02e6
        L_0x02c8:
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x0325 }
            goto L_0x021e
        L_0x02cf:
            r7.n(r1)     // Catch:{ a -> 0x0325 }
            goto L_0x02e6
        L_0x02d3:
            r17 = 0
            r2 = r3 & r20
            long r2 = (long) r2     // Catch:{ a -> 0x0325 }
            java.util.List r2 = r14.c(r2, r9)     // Catch:{ a -> 0x0325 }
            goto L_0x022d
        L_0x02de:
            androidx.wear.protolayout.protobuf.x$b r3 = r8.l(r5)     // Catch:{ a -> 0x0325 }
            java.lang.Class<?> r4 = androidx.wear.protolayout.protobuf.c1.f2063a     // Catch:{ a -> 0x0325 }
            if (r3 != 0) goto L_0x02ea
        L_0x02e6:
            r21 = r13
            goto L_0x05c5
        L_0x02ea:
            boolean r4 = r2 instanceof java.util.RandomAccess     // Catch:{ a -> 0x0325 }
            if (r4 == 0) goto L_0x0337
            int r4 = r2.size()     // Catch:{ a -> 0x0325 }
            r6 = r15
            r5 = 0
            r14 = 0
        L_0x02f5:
            if (r14 >= r4) goto L_0x0329
            java.lang.Object r18 = r2.get(r14)     // Catch:{ a -> 0x0325 }
            java.lang.Integer r18 = (java.lang.Integer) r18     // Catch:{ a -> 0x0325 }
            r21 = r13
            int r13 = r18.intValue()     // Catch:{ a -> 0x059c }
            boolean r18 = r3.a()     // Catch:{ a -> 0x059c }
            if (r18 == 0) goto L_0x0319
            if (r14 == r5) goto L_0x0316
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ a -> 0x059c }
            r2.set(r5, r13)     // Catch:{ a -> 0x059c }
            goto L_0x0316
        L_0x0313:
            r0 = move-exception
            goto L_0x05cb
        L_0x0316:
            int r5 = r5 + 1
            goto L_0x031d
        L_0x0319:
            java.lang.Object r6 = androidx.wear.protolayout.protobuf.c1.C(r9, r1, r13, r6, r10)     // Catch:{ a -> 0x059c }
        L_0x031d:
            int r14 = r14 + 1
            r13 = r21
            goto L_0x02f5
        L_0x0322:
            r0 = move-exception
            goto L_0x01cb
        L_0x0325:
            r21 = r13
            goto L_0x059c
        L_0x0329:
            r21 = r13
            if (r5 == r4) goto L_0x0334
            java.util.List r1 = r2.subList(r5, r4)     // Catch:{ a -> 0x059c }
            r1.clear()     // Catch:{ a -> 0x059c }
        L_0x0334:
            r15 = r6
            goto L_0x05c5
        L_0x0337:
            r21 = r13
            java.util.Iterator r2 = r2.iterator()     // Catch:{ a -> 0x059c }
            r4 = r15
        L_0x033e:
            boolean r5 = r2.hasNext()     // Catch:{ a -> 0x059c }
            if (r5 == 0) goto L_0x035c
            java.lang.Object r5 = r2.next()     // Catch:{ a -> 0x059c }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ a -> 0x059c }
            int r5 = r5.intValue()     // Catch:{ a -> 0x059c }
            boolean r6 = r3.a()     // Catch:{ a -> 0x059c }
            if (r6 != 0) goto L_0x033e
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.c1.C(r9, r1, r5, r4, r10)     // Catch:{ a -> 0x059c }
            r2.remove()     // Catch:{ a -> 0x059c }
            goto L_0x033e
        L_0x035c:
            r15 = r4
            goto L_0x05c5
        L_0x035f:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x059c }
        L_0x036a:
            r7.s(r1)     // Catch:{ a -> 0x059c }
            goto L_0x05c5
        L_0x036f:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x059c }
            r7.f(r1)     // Catch:{ a -> 0x059c }
            goto L_0x05c5
        L_0x037f:
            r21 = r13
            r17 = 0
            androidx.wear.protolayout.protobuf.b1 r5 = r8.n(r5)     // Catch:{ a -> 0x059c }
            r1 = r24
            r2 = r25
            r4 = r7
            r6 = r27
            r1.E(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x059c }
            goto L_0x05c5
        L_0x0393:
            r21 = r13
            r17 = 0
            r8.G(r9, r3, r7)     // Catch:{ a -> 0x059c }
            goto L_0x05c5
        L_0x039c:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x059c }
        L_0x03a7:
            r7.d(r1)     // Catch:{ a -> 0x059c }
            goto L_0x05c5
        L_0x03ac:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x059c }
        L_0x03b7:
            r7.i(r1)     // Catch:{ a -> 0x059c }
            goto L_0x05c5
        L_0x03bc:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x059c }
        L_0x03c7:
            r7.j(r1)     // Catch:{ a -> 0x059c }
            goto L_0x05c5
        L_0x03cc:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x059c }
        L_0x03d7:
            r7.l(r1)     // Catch:{ a -> 0x059c }
            goto L_0x05c5
        L_0x03dc:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x059c }
        L_0x03e7:
            r7.t(r1)     // Catch:{ a -> 0x059c }
            goto L_0x05c5
        L_0x03ec:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x059c }
        L_0x03f7:
            r7.m(r1)     // Catch:{ a -> 0x059c }
            goto L_0x05c5
        L_0x03fc:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x059c }
        L_0x0407:
            r7.k(r1)     // Catch:{ a -> 0x059c }
            goto L_0x05c5
        L_0x040c:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            java.util.List r1 = r14.c(r1, r9)     // Catch:{ a -> 0x059c }
        L_0x0417:
            r7.g(r1)     // Catch:{ a -> 0x059c }
            goto L_0x05c5
        L_0x041c:
            r21 = r13
            r17 = 0
            java.lang.Object r1 = r8.x(r5, r9)     // Catch:{ a -> 0x059c }
            androidx.wear.protolayout.protobuf.o0 r1 = (androidx.wear.protolayout.protobuf.o0) r1     // Catch:{ a -> 0x059c }
            androidx.wear.protolayout.protobuf.b1 r2 = r8.n(r5)     // Catch:{ a -> 0x059c }
            r7.v(r4)     // Catch:{ a -> 0x059c }
            r7.b(r1, r2, r0)     // Catch:{ a -> 0x059c }
            goto L_0x04d2
        L_0x0432:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            r3 = 0
            r7.v(r3)     // Catch:{ a -> 0x059c }
            long r3 = r6.s()     // Catch:{ a -> 0x059c }
            goto L_0x0548
        L_0x0443:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            r3 = 0
            r7.v(r3)     // Catch:{ a -> 0x059c }
            int r3 = r6.r()     // Catch:{ a -> 0x059c }
            goto L_0x0525
        L_0x0454:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            r3 = 1
            r7.v(r3)     // Catch:{ a -> 0x059c }
            long r3 = r6.q()     // Catch:{ a -> 0x059c }
            goto L_0x0548
        L_0x0465:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            r3 = 5
            r7.v(r3)     // Catch:{ a -> 0x059c }
            int r3 = r6.p()     // Catch:{ a -> 0x059c }
            goto L_0x0525
        L_0x0476:
            r21 = r13
            r17 = 0
            r2 = 0
            r7.v(r2)     // Catch:{ a -> 0x059c }
            int r2 = r6.j()     // Catch:{ a -> 0x059c }
            androidx.wear.protolayout.protobuf.x$b r4 = r8.l(r5)     // Catch:{ a -> 0x059c }
            if (r4 == 0) goto L_0x0496
            boolean r4 = r4.a()     // Catch:{ a -> 0x059c }
            if (r4 == 0) goto L_0x048f
            goto L_0x0496
        L_0x048f:
            java.lang.Object r1 = androidx.wear.protolayout.protobuf.c1.C(r9, r1, r2, r15, r10)     // Catch:{ a -> 0x059c }
            r15 = r1
            goto L_0x05c5
        L_0x0496:
            r1 = r3 & r20
            long r3 = (long) r1     // Catch:{ a -> 0x059c }
            androidx.wear.protolayout.protobuf.l1.t(r2, r3, r9)     // Catch:{ a -> 0x059c }
            goto L_0x04de
        L_0x049d:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            r3 = 0
            r7.v(r3)     // Catch:{ a -> 0x059c }
            int r3 = r6.w()     // Catch:{ a -> 0x059c }
            goto L_0x0525
        L_0x04ae:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            androidx.wear.protolayout.protobuf.g r3 = r7.e()     // Catch:{ a -> 0x059c }
            androidx.wear.protolayout.protobuf.l1.v(r1, r9, r3)     // Catch:{ a -> 0x059c }
            goto L_0x04de
        L_0x04bd:
            r21 = r13
            r17 = 0
            java.lang.Object r1 = r8.x(r5, r9)     // Catch:{ a -> 0x059c }
            androidx.wear.protolayout.protobuf.o0 r1 = (androidx.wear.protolayout.protobuf.o0) r1     // Catch:{ a -> 0x059c }
            androidx.wear.protolayout.protobuf.b1 r2 = r8.n(r5)     // Catch:{ a -> 0x059c }
            r3 = 2
            r7.v(r3)     // Catch:{ a -> 0x059c }
            r7.c(r1, r2, r0)     // Catch:{ a -> 0x059c }
        L_0x04d2:
            r8.K(r9, r5, r1)     // Catch:{ a -> 0x059c }
            goto L_0x05c5
        L_0x04d7:
            r21 = r13
            r17 = 0
            r8.F(r9, r3, r7)     // Catch:{ a -> 0x059c }
        L_0x04de:
            r0 = r5
            goto L_0x057a
        L_0x04e1:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            r3 = 0
            r7.v(r3)     // Catch:{ a -> 0x059c }
            boolean r3 = r6.g()     // Catch:{ a -> 0x059c }
            androidx.wear.protolayout.protobuf.l1$e r4 = androidx.wear.protolayout.protobuf.l1.f2140c     // Catch:{ a -> 0x059c }
            r4.k(r9, r1, r3)     // Catch:{ a -> 0x059c }
            goto L_0x04de
        L_0x04f6:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            r3 = 5
            r7.v(r3)     // Catch:{ a -> 0x059c }
            int r3 = r6.k()     // Catch:{ a -> 0x059c }
            goto L_0x0525
        L_0x0506:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            r3 = 1
            r7.v(r3)     // Catch:{ a -> 0x059c }
            long r3 = r6.l()     // Catch:{ a -> 0x059c }
            goto L_0x0548
        L_0x0516:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            r3 = 0
            r7.v(r3)     // Catch:{ a -> 0x059c }
            int r3 = r6.n()     // Catch:{ a -> 0x059c }
        L_0x0525:
            androidx.wear.protolayout.protobuf.l1.t(r3, r1, r9)     // Catch:{ a -> 0x059c }
            goto L_0x04de
        L_0x0529:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            r3 = 0
            r7.v(r3)     // Catch:{ a -> 0x059c }
            long r3 = r6.x()     // Catch:{ a -> 0x059c }
            goto L_0x0548
        L_0x0539:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            r3 = 0
            r7.v(r3)     // Catch:{ a -> 0x059c }
            long r3 = r6.o()     // Catch:{ a -> 0x059c }
        L_0x0548:
            androidx.wear.protolayout.protobuf.l1.u(r9, r1, r3)     // Catch:{ a -> 0x059c }
            goto L_0x04de
        L_0x054c:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r1 = (long) r1     // Catch:{ a -> 0x059c }
            r3 = 5
            r7.v(r3)     // Catch:{ a -> 0x059c }
            float r3 = r6.m()     // Catch:{ a -> 0x059c }
            androidx.wear.protolayout.protobuf.l1$e r4 = androidx.wear.protolayout.protobuf.l1.f2140c     // Catch:{ a -> 0x059c }
            r4.n(r9, r1, r3)     // Catch:{ a -> 0x059c }
            goto L_0x04de
        L_0x0562:
            r21 = r13
            r17 = 0
            r1 = r3 & r20
            long r3 = (long) r1     // Catch:{ a -> 0x059c }
            r1 = 1
            r7.v(r1)     // Catch:{ a -> 0x059c }
            double r13 = r6.i()     // Catch:{ a -> 0x059c }
            androidx.wear.protolayout.protobuf.l1$e r1 = androidx.wear.protolayout.protobuf.l1.f2140c     // Catch:{ a -> 0x059c }
            r2 = r25
            r0 = r5
            r5 = r13
            r1.m(r2, r3, r5)     // Catch:{ a -> 0x059c }
        L_0x057a:
            r8.I(r0, r9)     // Catch:{ a -> 0x059c }
            goto L_0x05c5
        L_0x057e:
            r15 = r0
        L_0x057f:
            boolean r0 = r10.l(r15, r7)     // Catch:{ a -> 0x059c }
            if (r0 != 0) goto L_0x05c5
            r13 = r21
        L_0x0587:
            if (r13 >= r12) goto L_0x0599
            r3 = r11[r13]
            r1 = r24
            r2 = r25
            r4 = r15
            r5 = r10
            r6 = r25
            r1.k(r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x0587
        L_0x0599:
            if (r15 == 0) goto L_0x05c4
            goto L_0x05c2
        L_0x059c:
            r10.p()     // Catch:{ all -> 0x0313 }
            if (r15 != 0) goto L_0x05a6
            java.lang.Object r0 = r10.f(r9)     // Catch:{ all -> 0x0313 }
            r15 = r0
        L_0x05a6:
            boolean r0 = r10.l(r15, r7)     // Catch:{ all -> 0x0313 }
            if (r0 != 0) goto L_0x05c5
            r13 = r21
        L_0x05ae:
            if (r13 >= r12) goto L_0x05c0
            r3 = r11[r13]
            r1 = r24
            r2 = r25
            r4 = r15
            r5 = r10
            r6 = r25
            r1.k(r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x05ae
        L_0x05c0:
            if (r15 == 0) goto L_0x05c4
        L_0x05c2:
            goto L_0x0041
        L_0x05c4:
            return
        L_0x05c5:
            r0 = r27
            r13 = r21
            goto L_0x001a
        L_0x05cb:
            r13 = r21
        L_0x05cd:
            if (r13 >= r12) goto L_0x05df
            r3 = r11[r13]
            r1 = r24
            r2 = r25
            r4 = r15
            r5 = r10
            r6 = r25
            r1.k(r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x05cd
        L_0x05df:
            if (r15 == 0) goto L_0x05e4
            r10.n(r9, r15)
        L_0x05e4:
            throw r0
        L_0x05e5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Mutating immutable message: "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.r0.h(java.lang.Object, androidx.wear.protolayout.protobuf.a1, androidx.wear.protolayout.protobuf.n):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0436  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x04dc  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0503  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x053c  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x056b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0354  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(java.lang.Object r18, androidx.wear.protolayout.protobuf.k r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r19.getClass()
            boolean r3 = r0.f2179h
            if (r3 == 0) goto L_0x0588
            boolean r4 = r0.f2177f
            androidx.wear.protolayout.protobuf.o<?> r5 = r0.f2187p
            if (r4 == 0) goto L_0x0028
            androidx.wear.protolayout.protobuf.r r4 = r5.c(r1)
            boolean r6 = r4.i()
            if (r6 != 0) goto L_0x0028
            java.util.Iterator r4 = r4.l()
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x002a
        L_0x0028:
            r4 = 0
            r6 = 0
        L_0x002a:
            int[] r7 = r0.f2173a
            int r8 = r7.length
            r9 = 0
            r10 = r9
        L_0x002f:
            if (r10 >= r8) goto L_0x0567
            int r11 = r0.M(r10)
            r12 = r7[r10]
        L_0x0037:
            if (r6 == 0) goto L_0x0050
            r5.a(r6)
            if (r12 < 0) goto L_0x0050
            r5.j(r6)
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x004e
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x0037
        L_0x004e:
            r6 = 0
            goto L_0x0037
        L_0x0050:
            r13 = 267386880(0xff00000, float:2.3665827E-29)
            r13 = r13 & r11
            int r13 = r13 >>> 20
            r14 = 1
            r15 = 1048575(0xfffff, float:1.469367E-39)
            switch(r13) {
                case 0: goto L_0x054f;
                case 1: goto L_0x053c;
                case 2: goto L_0x0529;
                case 3: goto L_0x0516;
                case 4: goto L_0x0503;
                case 5: goto L_0x04f0;
                case 6: goto L_0x04dc;
                case 7: goto L_0x04c8;
                case 8: goto L_0x04b4;
                case 9: goto L_0x049c;
                case 10: goto L_0x0486;
                case 11: goto L_0x0472;
                case 12: goto L_0x045e;
                case 13: goto L_0x044a;
                case 14: goto L_0x0436;
                case 15: goto L_0x0422;
                case 16: goto L_0x040e;
                case 17: goto L_0x03f6;
                case 18: goto L_0x03e4;
                case 19: goto L_0x03d2;
                case 20: goto L_0x03c0;
                case 21: goto L_0x03ae;
                case 22: goto L_0x039c;
                case 23: goto L_0x038a;
                case 24: goto L_0x0378;
                case 25: goto L_0x0366;
                case 26: goto L_0x0354;
                case 27: goto L_0x033e;
                case 28: goto L_0x032c;
                case 29: goto L_0x031a;
                case 30: goto L_0x0308;
                case 31: goto L_0x02f6;
                case 32: goto L_0x02e4;
                case 33: goto L_0x02d2;
                case 34: goto L_0x02c0;
                case 35: goto L_0x02ae;
                case 36: goto L_0x029c;
                case 37: goto L_0x028a;
                case 38: goto L_0x0278;
                case 39: goto L_0x0266;
                case 40: goto L_0x0254;
                case 41: goto L_0x0242;
                case 42: goto L_0x0230;
                case 43: goto L_0x021e;
                case 44: goto L_0x020c;
                case 45: goto L_0x01fa;
                case 46: goto L_0x01e8;
                case 47: goto L_0x01d6;
                case 48: goto L_0x01c5;
                case 49: goto L_0x01b2;
                case 50: goto L_0x01a7;
                case 51: goto L_0x0190;
                case 52: goto L_0x0179;
                case 53: goto L_0x0168;
                case 54: goto L_0x0157;
                case 55: goto L_0x0146;
                case 56: goto L_0x0135;
                case 57: goto L_0x0124;
                case 58: goto L_0x010d;
                case 59: goto L_0x00fc;
                case 60: goto L_0x00e7;
                case 61: goto L_0x00d4;
                case 62: goto L_0x00c4;
                case 63: goto L_0x00b4;
                case 64: goto L_0x00a4;
                case 65: goto L_0x0094;
                case 66: goto L_0x0084;
                case 67: goto L_0x0074;
                case 68: goto L_0x0060;
                default: goto L_0x005c;
            }
        L_0x005c:
            r16 = r4
            goto L_0x0561
        L_0x0060:
            boolean r13 = r0.s(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = androidx.wear.protolayout.protobuf.l1.o(r13, r1)
            androidx.wear.protolayout.protobuf.b1 r13 = r0.n(r10)
            r2.h(r12, r13, r11)
            goto L_0x005c
        L_0x0074:
            boolean r13 = r0.s(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            long r13 = B(r13, r1)
            r2.p(r12, r13)
            goto L_0x005c
        L_0x0084:
            boolean r13 = r0.s(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = A(r13, r1)
            r2.o(r12, r11)
            goto L_0x005c
        L_0x0094:
            boolean r13 = r0.s(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            long r13 = B(r13, r1)
            r2.n(r12, r13)
            goto L_0x005c
        L_0x00a4:
            boolean r13 = r0.s(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = A(r13, r1)
            r2.m(r12, r11)
            goto L_0x005c
        L_0x00b4:
            boolean r13 = r0.s(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = A(r13, r1)
            r2.d(r12, r11)
            goto L_0x005c
        L_0x00c4:
            boolean r13 = r0.s(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = A(r13, r1)
            r2.q(r12, r11)
            goto L_0x005c
        L_0x00d4:
            boolean r13 = r0.s(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = androidx.wear.protolayout.protobuf.l1.o(r13, r1)
            androidx.wear.protolayout.protobuf.g r11 = (androidx.wear.protolayout.protobuf.g) r11
            r2.b(r12, r11)
            goto L_0x005c
        L_0x00e7:
            boolean r13 = r0.s(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = androidx.wear.protolayout.protobuf.l1.o(r13, r1)
            androidx.wear.protolayout.protobuf.b1 r13 = r0.n(r10)
            r2.k(r12, r13, r11)
            goto L_0x005c
        L_0x00fc:
            boolean r13 = r0.s(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = androidx.wear.protolayout.protobuf.l1.o(r13, r1)
            P(r12, r11, r2)
            goto L_0x005c
        L_0x010d:
            boolean r13 = r0.s(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = androidx.wear.protolayout.protobuf.l1.o(r13, r1)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r2.a(r12, r11)
            goto L_0x005c
        L_0x0124:
            boolean r13 = r0.s(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = A(r13, r1)
            r2.e(r12, r11)
            goto L_0x005c
        L_0x0135:
            boolean r13 = r0.s(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            long r13 = B(r13, r1)
            r2.f(r12, r13)
            goto L_0x005c
        L_0x0146:
            boolean r13 = r0.s(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            int r11 = A(r13, r1)
            r2.i(r12, r11)
            goto L_0x005c
        L_0x0157:
            boolean r13 = r0.s(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            long r13 = B(r13, r1)
            r2.r(r12, r13)
            goto L_0x005c
        L_0x0168:
            boolean r13 = r0.s(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            long r13 = B(r13, r1)
            r2.j(r12, r13)
            goto L_0x005c
        L_0x0179:
            boolean r13 = r0.s(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = androidx.wear.protolayout.protobuf.l1.o(r13, r1)
            java.lang.Float r11 = (java.lang.Float) r11
            float r11 = r11.floatValue()
            r2.g(r12, r11)
            goto L_0x005c
        L_0x0190:
            boolean r13 = r0.s(r12, r10, r1)
            if (r13 == 0) goto L_0x005c
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = androidx.wear.protolayout.protobuf.l1.o(r13, r1)
            java.lang.Double r11 = (java.lang.Double) r11
            double r13 = r11.doubleValue()
            r2.c(r12, r13)
            goto L_0x005c
        L_0x01a7:
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = androidx.wear.protolayout.protobuf.l1.o(r13, r1)
            r0.O(r2, r12, r11, r10)
            goto L_0x005c
        L_0x01b2:
            r12 = r7[r10]
            r11 = r11 & r15
            long r13 = (long) r11
            java.lang.Object r11 = androidx.wear.protolayout.protobuf.l1.o(r13, r1)
            java.util.List r11 = (java.util.List) r11
            androidx.wear.protolayout.protobuf.b1 r13 = r0.n(r10)
            androidx.wear.protolayout.protobuf.c1.K(r12, r11, r2, r13)
            goto L_0x005c
        L_0x01c5:
            r12 = r7[r10]
            r11 = r11 & r15
            r16 = r4
            long r3 = (long) r11
            java.lang.Object r3 = androidx.wear.protolayout.protobuf.l1.o(r3, r1)
            java.util.List r3 = (java.util.List) r3
            androidx.wear.protolayout.protobuf.c1.R(r12, r3, r2, r14)
            goto L_0x0561
        L_0x01d6:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.Q(r3, r4, r2, r14)
            goto L_0x0561
        L_0x01e8:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.P(r3, r4, r2, r14)
            goto L_0x0561
        L_0x01fa:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.O(r3, r4, r2, r14)
            goto L_0x0561
        L_0x020c:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.G(r3, r4, r2, r14)
            goto L_0x0561
        L_0x021e:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.T(r3, r4, r2, r14)
            goto L_0x0561
        L_0x0230:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.D(r3, r4, r2, r14)
            goto L_0x0561
        L_0x0242:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.H(r3, r4, r2, r14)
            goto L_0x0561
        L_0x0254:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.I(r3, r4, r2, r14)
            goto L_0x0561
        L_0x0266:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.L(r3, r4, r2, r14)
            goto L_0x0561
        L_0x0278:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.U(r3, r4, r2, r14)
            goto L_0x0561
        L_0x028a:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.M(r3, r4, r2, r14)
            goto L_0x0561
        L_0x029c:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.J(r3, r4, r2, r14)
            goto L_0x0561
        L_0x02ae:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.F(r3, r4, r2, r14)
            goto L_0x0561
        L_0x02c0:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.R(r3, r4, r2, r9)
            goto L_0x0561
        L_0x02d2:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.Q(r3, r4, r2, r9)
            goto L_0x0561
        L_0x02e4:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.P(r3, r4, r2, r9)
            goto L_0x0561
        L_0x02f6:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.O(r3, r4, r2, r9)
            goto L_0x0561
        L_0x0308:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.G(r3, r4, r2, r9)
            goto L_0x0561
        L_0x031a:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.T(r3, r4, r2, r9)
            goto L_0x0561
        L_0x032c:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.E(r3, r4, r2)
            goto L_0x0561
        L_0x033e:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.b1 r11 = r0.n(r10)
            androidx.wear.protolayout.protobuf.c1.N(r3, r4, r2, r11)
            goto L_0x0561
        L_0x0354:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.S(r3, r4, r2)
            goto L_0x0561
        L_0x0366:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.D(r3, r4, r2, r9)
            goto L_0x0561
        L_0x0378:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.H(r3, r4, r2, r9)
            goto L_0x0561
        L_0x038a:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.I(r3, r4, r2, r9)
            goto L_0x0561
        L_0x039c:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.L(r3, r4, r2, r9)
            goto L_0x0561
        L_0x03ae:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.U(r3, r4, r2, r9)
            goto L_0x0561
        L_0x03c0:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.M(r3, r4, r2, r9)
            goto L_0x0561
        L_0x03d2:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.J(r3, r4, r2, r9)
            goto L_0x0561
        L_0x03e4:
            r16 = r4
            r3 = r7[r10]
            r4 = r11 & r15
            long r11 = (long) r4
            java.lang.Object r4 = androidx.wear.protolayout.protobuf.l1.o(r11, r1)
            java.util.List r4 = (java.util.List) r4
            androidx.wear.protolayout.protobuf.c1.F(r3, r4, r2, r9)
            goto L_0x0561
        L_0x03f6:
            r16 = r4
            boolean r3 = r0.q(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            java.lang.Object r3 = androidx.wear.protolayout.protobuf.l1.o(r3, r1)
            androidx.wear.protolayout.protobuf.b1 r4 = r0.n(r10)
            r2.h(r12, r4, r3)
            goto L_0x0561
        L_0x040e:
            r16 = r4
            boolean r3 = r0.q(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            long r3 = androidx.wear.protolayout.protobuf.l1.n(r3, r1)
            r2.p(r12, r3)
            goto L_0x0561
        L_0x0422:
            r16 = r4
            boolean r3 = r0.q(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = androidx.wear.protolayout.protobuf.l1.m(r3, r1)
            r2.o(r12, r3)
            goto L_0x0561
        L_0x0436:
            r16 = r4
            boolean r3 = r0.q(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            long r3 = androidx.wear.protolayout.protobuf.l1.n(r3, r1)
            r2.n(r12, r3)
            goto L_0x0561
        L_0x044a:
            r16 = r4
            boolean r3 = r0.q(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = androidx.wear.protolayout.protobuf.l1.m(r3, r1)
            r2.m(r12, r3)
            goto L_0x0561
        L_0x045e:
            r16 = r4
            boolean r3 = r0.q(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = androidx.wear.protolayout.protobuf.l1.m(r3, r1)
            r2.d(r12, r3)
            goto L_0x0561
        L_0x0472:
            r16 = r4
            boolean r3 = r0.q(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = androidx.wear.protolayout.protobuf.l1.m(r3, r1)
            r2.q(r12, r3)
            goto L_0x0561
        L_0x0486:
            r16 = r4
            boolean r3 = r0.q(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            java.lang.Object r3 = androidx.wear.protolayout.protobuf.l1.o(r3, r1)
            androidx.wear.protolayout.protobuf.g r3 = (androidx.wear.protolayout.protobuf.g) r3
            r2.b(r12, r3)
            goto L_0x0561
        L_0x049c:
            r16 = r4
            boolean r3 = r0.q(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            java.lang.Object r3 = androidx.wear.protolayout.protobuf.l1.o(r3, r1)
            androidx.wear.protolayout.protobuf.b1 r4 = r0.n(r10)
            r2.k(r12, r4, r3)
            goto L_0x0561
        L_0x04b4:
            r16 = r4
            boolean r3 = r0.q(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            java.lang.Object r3 = androidx.wear.protolayout.protobuf.l1.o(r3, r1)
            P(r12, r3, r2)
            goto L_0x0561
        L_0x04c8:
            r16 = r4
            boolean r3 = r0.q(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            boolean r3 = androidx.wear.protolayout.protobuf.l1.g(r3, r1)
            r2.a(r12, r3)
            goto L_0x0561
        L_0x04dc:
            r16 = r4
            boolean r3 = r0.q(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = androidx.wear.protolayout.protobuf.l1.m(r3, r1)
            r2.e(r12, r3)
            goto L_0x0561
        L_0x04f0:
            r16 = r4
            boolean r3 = r0.q(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            long r3 = androidx.wear.protolayout.protobuf.l1.n(r3, r1)
            r2.f(r12, r3)
            goto L_0x0561
        L_0x0503:
            r16 = r4
            boolean r3 = r0.q(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            int r3 = androidx.wear.protolayout.protobuf.l1.m(r3, r1)
            r2.i(r12, r3)
            goto L_0x0561
        L_0x0516:
            r16 = r4
            boolean r3 = r0.q(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            long r3 = androidx.wear.protolayout.protobuf.l1.n(r3, r1)
            r2.r(r12, r3)
            goto L_0x0561
        L_0x0529:
            r16 = r4
            boolean r3 = r0.q(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            long r3 = androidx.wear.protolayout.protobuf.l1.n(r3, r1)
            r2.j(r12, r3)
            goto L_0x0561
        L_0x053c:
            r16 = r4
            boolean r3 = r0.q(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            float r3 = androidx.wear.protolayout.protobuf.l1.l(r3, r1)
            r2.g(r12, r3)
            goto L_0x0561
        L_0x054f:
            r16 = r4
            boolean r3 = r0.q(r10, r1)
            if (r3 == 0) goto L_0x0561
            r3 = r11 & r15
            long r3 = (long) r3
            double r3 = androidx.wear.protolayout.protobuf.l1.k(r3, r1)
            r2.c(r12, r3)
        L_0x0561:
            int r10 = r10 + 3
            r4 = r16
            goto L_0x002f
        L_0x0567:
            r16 = r4
        L_0x0569:
            if (r6 == 0) goto L_0x057e
            r5.j(r6)
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L_0x057c
            java.lang.Object r3 = r16.next()
            r6 = r3
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            goto L_0x0569
        L_0x057c:
            r6 = 0
            goto L_0x0569
        L_0x057e:
            androidx.wear.protolayout.protobuf.h1<?, ?> r0 = r0.f2186o
            java.lang.Object r1 = r0.g(r1)
            r0.s(r1, r2)
            goto L_0x058b
        L_0x0588:
            r17.N(r18, r19)
        L_0x058b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.r0.i(java.lang.Object, androidx.wear.protolayout.protobuf.k):void");
    }

    public final boolean j(Object obj, int i8, Object obj2) {
        return q(i8, obj) == q(i8, obj2);
    }

    public final void k(Object obj, int i8, Object obj2, h1 h1Var, Object obj3) {
        x.b l8;
        int i9 = this.f2173a[i8];
        Object o8 = l1.o((long) (M(i8) & 1048575), obj);
        if (o8 != null && (l8 = l(i8)) != null) {
            j0 j0Var = this.f2188q;
            Map<?, ?> h8 = j0Var.h(o8);
            j0Var.e(m(i8));
            for (Map.Entry next : h8.entrySet()) {
                ((Integer) next.getValue()).intValue();
                if (!l8.a()) {
                    if (obj2 == null) {
                        h1Var.f(obj3);
                    }
                    next.getKey();
                    next.getValue();
                    throw null;
                }
            }
        }
    }

    public final x.b l(int i8) {
        return (x.b) this.f2174b[((i8 / 3) * 2) + 1];
    }

    public final Object m(int i8) {
        return this.f2174b[(i8 / 3) * 2];
    }

    public final b1 n(int i8) {
        int i9 = (i8 / 3) * 2;
        Object[] objArr = this.f2174b;
        b1 b1Var = (b1) objArr[i9];
        if (b1Var != null) {
            return b1Var;
        }
        b1 a9 = y0.f2217c.a((Class) objArr[i9 + 1]);
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
        r2 = r2 + (androidx.wear.protolayout.protobuf.j.B(r10) + androidx.wear.protolayout.protobuf.j.D(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02c6, code lost:
        r5 = r5 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02cd, code lost:
        r2 = androidx.wear.protolayout.protobuf.j.q(r10, (androidx.wear.protolayout.protobuf.o0) r14.getObject(r1, r2), n(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02e4, code lost:
        r2 = androidx.wear.protolayout.protobuf.j.y(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02f1, code lost:
        r2 = androidx.wear.protolayout.protobuf.j.x(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02fa, code lost:
        r2 = androidx.wear.protolayout.protobuf.j.w(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0303, code lost:
        r2 = androidx.wear.protolayout.protobuf.j.v(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0310, code lost:
        r2 = androidx.wear.protolayout.protobuf.j.m(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x031d, code lost:
        r2 = androidx.wear.protolayout.protobuf.j.C(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0326, code lost:
        r2 = r14.getObject(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x032a, code lost:
        r2 = androidx.wear.protolayout.protobuf.j.k(r10, (androidx.wear.protolayout.protobuf.g) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0335, code lost:
        r2 = androidx.wear.protolayout.protobuf.c1.o(r10, n(r4), r14.getObject(r1, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x034c, code lost:
        if ((r2 instanceof androidx.wear.protolayout.protobuf.g) != false) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x034f, code lost:
        r2 = androidx.wear.protolayout.protobuf.j.z(r10, (java.lang.String) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x035b, code lost:
        r2 = androidx.wear.protolayout.protobuf.j.j(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bd, code lost:
        if ((r2 instanceof androidx.wear.protolayout.protobuf.g) != false) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cf, code lost:
        r2 = androidx.wear.protolayout.protobuf.j.n(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00db, code lost:
        r2 = androidx.wear.protolayout.protobuf.j.o(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00eb, code lost:
        r2 = androidx.wear.protolayout.protobuf.j.r(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fb, code lost:
        r2 = androidx.wear.protolayout.protobuf.j.E(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010b, code lost:
        r2 = androidx.wear.protolayout.protobuf.j.t(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0117, code lost:
        r2 = androidx.wear.protolayout.protobuf.j.p(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0123, code lost:
        r2 = androidx.wear.protolayout.protobuf.j.l(r10);
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
    public final int o(T r18) {
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
            int[] r8 = r0.f2173a
            int r9 = r8.length
            if (r4 >= r9) goto L_0x039e
            int r9 = r0.M(r4)
            r10 = r8[r4]
            r11 = 267386880(0xff00000, float:2.3665827E-29)
            r11 = r11 & r9
            int r11 = r11 >>> 20
            r12 = 17
            boolean r13 = r0.f2180i
            sun.misc.Unsafe r14 = f2172s
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
            androidx.wear.protolayout.protobuf.s r12 = androidx.wear.protolayout.protobuf.s.DOUBLE_LIST_PACKED
            int r12 = r12.e()
            if (r11 < r12) goto L_0x0050
            androidx.wear.protolayout.protobuf.s r12 = androidx.wear.protolayout.protobuf.s.SINT64_LIST_PACKED
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
            boolean r8 = r0.s(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            goto L_0x02cd
        L_0x0061:
            boolean r8 = r0.s(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            long r2 = B(r2, r1)
            goto L_0x02e4
        L_0x006d:
            boolean r8 = r0.s(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            int r2 = A(r2, r1)
            goto L_0x02f1
        L_0x0079:
            boolean r2 = r0.s(r10, r4, r1)
            if (r2 == 0) goto L_0x0397
            goto L_0x02fa
        L_0x0081:
            boolean r2 = r0.s(r10, r4, r1)
            if (r2 == 0) goto L_0x0397
            goto L_0x0303
        L_0x0089:
            boolean r8 = r0.s(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            int r2 = A(r2, r1)
            goto L_0x0310
        L_0x0095:
            boolean r8 = r0.s(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            int r2 = A(r2, r1)
            goto L_0x031d
        L_0x00a1:
            boolean r8 = r0.s(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            goto L_0x0326
        L_0x00a9:
            boolean r8 = r0.s(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            goto L_0x0335
        L_0x00b1:
            boolean r8 = r0.s(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            java.lang.Object r2 = r14.getObject(r1, r2)
            boolean r3 = r2 instanceof androidx.wear.protolayout.protobuf.g
            if (r3 == 0) goto L_0x034f
            goto L_0x034e
        L_0x00c1:
            boolean r2 = r0.s(r10, r4, r1)
            if (r2 == 0) goto L_0x0397
            goto L_0x035b
        L_0x00c9:
            boolean r2 = r0.s(r10, r4, r1)
            if (r2 == 0) goto L_0x0397
        L_0x00cf:
            int r2 = androidx.wear.protolayout.protobuf.j.n(r10)
            goto L_0x02c6
        L_0x00d5:
            boolean r2 = r0.s(r10, r4, r1)
            if (r2 == 0) goto L_0x0397
        L_0x00db:
            int r2 = androidx.wear.protolayout.protobuf.j.o(r10)
            goto L_0x02c6
        L_0x00e1:
            boolean r8 = r0.s(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            int r2 = A(r2, r1)
        L_0x00eb:
            int r2 = androidx.wear.protolayout.protobuf.j.r(r10, r2)
            goto L_0x02c6
        L_0x00f1:
            boolean r8 = r0.s(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            long r2 = B(r2, r1)
        L_0x00fb:
            int r2 = androidx.wear.protolayout.protobuf.j.E(r10, r2)
            goto L_0x02c6
        L_0x0101:
            boolean r8 = r0.s(r10, r4, r1)
            if (r8 == 0) goto L_0x0397
            long r2 = B(r2, r1)
        L_0x010b:
            int r2 = androidx.wear.protolayout.protobuf.j.t(r10, r2)
            goto L_0x02c6
        L_0x0111:
            boolean r2 = r0.s(r10, r4, r1)
            if (r2 == 0) goto L_0x0397
        L_0x0117:
            int r2 = androidx.wear.protolayout.protobuf.j.p(r10)
            goto L_0x02c6
        L_0x011d:
            boolean r2 = r0.s(r10, r4, r1)
            if (r2 == 0) goto L_0x0397
        L_0x0123:
            int r2 = androidx.wear.protolayout.protobuf.j.l(r10)
            goto L_0x02c6
        L_0x0129:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.lang.Object r3 = r0.m(r4)
            androidx.wear.protolayout.protobuf.j0 r8 = r0.f2188q
            int r2 = r8.b(r2, r10, r3)
            goto L_0x02c6
        L_0x0139:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            androidx.wear.protolayout.protobuf.b1 r3 = r0.n(r4)
            int r2 = androidx.wear.protolayout.protobuf.c1.j(r10, r2, r3)
            goto L_0x02c6
        L_0x0149:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.t(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x0159:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.r(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x0169:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.i(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x0179:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.g(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x0189:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.e(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x0199:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.w(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x01a9:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.b(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x01b9:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.g(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x01c8:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.i(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x01d7:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.l(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x01e6:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.y(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x01f5:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.n(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x0204:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.g(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
            goto L_0x0221
        L_0x0213:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.i(r2)
            if (r2 <= 0) goto L_0x0397
            if (r13 == 0) goto L_0x0225
        L_0x0221:
            long r8 = (long) r8
            r14.putInt(r1, r8, r2)
        L_0x0225:
            int r3 = androidx.wear.protolayout.protobuf.j.B(r10)
            int r8 = androidx.wear.protolayout.protobuf.j.D(r2)
            int r3 = r3 + r8
            int r2 = r2 + r3
            goto L_0x02c6
        L_0x0231:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.s(r10, r2)
            goto L_0x02c6
        L_0x023d:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.q(r10, r2)
            goto L_0x02c6
        L_0x0249:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.d(r10, r2)
            goto L_0x02c6
        L_0x0255:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.v(r10, r2)
            goto L_0x02c6
        L_0x0260:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.c(r10, r2)
            goto L_0x02c6
        L_0x026b:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            androidx.wear.protolayout.protobuf.b1 r3 = r0.n(r4)
            int r2 = androidx.wear.protolayout.protobuf.c1.p(r10, r2, r3)
            goto L_0x02c6
        L_0x027a:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.u(r10, r2)
            goto L_0x02c6
        L_0x0285:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.a(r10, r2)
            goto L_0x02c6
        L_0x0290:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.h(r10, r2)
            goto L_0x02c6
        L_0x029b:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.k(r10, r2)
            goto L_0x02c6
        L_0x02a6:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.x(r10, r2)
            goto L_0x02c6
        L_0x02b1:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.m(r10, r2)
            goto L_0x02c6
        L_0x02bc:
            java.lang.Object r2 = r14.getObject(r1, r2)
            java.util.List r2 = (java.util.List) r2
            int r2 = androidx.wear.protolayout.protobuf.c1.f(r10, r2)
        L_0x02c6:
            int r5 = r5 + r2
            goto L_0x0397
        L_0x02c9:
            r8 = r7 & r15
            if (r8 == 0) goto L_0x0397
        L_0x02cd:
            java.lang.Object r2 = r14.getObject(r1, r2)
            androidx.wear.protolayout.protobuf.o0 r2 = (androidx.wear.protolayout.protobuf.o0) r2
            androidx.wear.protolayout.protobuf.b1 r3 = r0.n(r4)
            int r2 = androidx.wear.protolayout.protobuf.j.q(r10, r2, r3)
            goto L_0x02c6
        L_0x02dc:
            r8 = r7 & r15
            if (r8 == 0) goto L_0x0397
            long r2 = r14.getLong(r1, r2)
        L_0x02e4:
            int r2 = androidx.wear.protolayout.protobuf.j.y(r10, r2)
            goto L_0x02c6
        L_0x02e9:
            r8 = r7 & r15
            if (r8 == 0) goto L_0x0397
            int r2 = r14.getInt(r1, r2)
        L_0x02f1:
            int r2 = androidx.wear.protolayout.protobuf.j.x(r10, r2)
            goto L_0x02c6
        L_0x02f6:
            r2 = r7 & r15
            if (r2 == 0) goto L_0x0397
        L_0x02fa:
            int r2 = androidx.wear.protolayout.protobuf.j.w(r10)
            goto L_0x02c6
        L_0x02ff:
            r2 = r7 & r15
            if (r2 == 0) goto L_0x0397
        L_0x0303:
            int r2 = androidx.wear.protolayout.protobuf.j.v(r10)
            goto L_0x02c6
        L_0x0308:
            r8 = r7 & r15
            if (r8 == 0) goto L_0x0397
            int r2 = r14.getInt(r1, r2)
        L_0x0310:
            int r2 = androidx.wear.protolayout.protobuf.j.m(r10, r2)
            goto L_0x02c6
        L_0x0315:
            r8 = r7 & r15
            if (r8 == 0) goto L_0x0397
            int r2 = r14.getInt(r1, r2)
        L_0x031d:
            int r2 = androidx.wear.protolayout.protobuf.j.C(r10, r2)
            goto L_0x02c6
        L_0x0322:
            r8 = r7 & r15
            if (r8 == 0) goto L_0x0397
        L_0x0326:
            java.lang.Object r2 = r14.getObject(r1, r2)
        L_0x032a:
            androidx.wear.protolayout.protobuf.g r2 = (androidx.wear.protolayout.protobuf.g) r2
            int r2 = androidx.wear.protolayout.protobuf.j.k(r10, r2)
            goto L_0x02c6
        L_0x0331:
            r8 = r7 & r15
            if (r8 == 0) goto L_0x0397
        L_0x0335:
            java.lang.Object r2 = r14.getObject(r1, r2)
            androidx.wear.protolayout.protobuf.b1 r3 = r0.n(r4)
            int r2 = androidx.wear.protolayout.protobuf.c1.o(r10, r3, r2)
            goto L_0x02c6
        L_0x0342:
            r8 = r7 & r15
            if (r8 == 0) goto L_0x0397
            java.lang.Object r2 = r14.getObject(r1, r2)
            boolean r3 = r2 instanceof androidx.wear.protolayout.protobuf.g
            if (r3 == 0) goto L_0x034f
        L_0x034e:
            goto L_0x032a
        L_0x034f:
            java.lang.String r2 = (java.lang.String) r2
            int r2 = androidx.wear.protolayout.protobuf.j.z(r10, r2)
            goto L_0x02c6
        L_0x0357:
            r2 = r7 & r15
            if (r2 == 0) goto L_0x0397
        L_0x035b:
            int r2 = androidx.wear.protolayout.protobuf.j.j(r10)
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
            androidx.wear.protolayout.protobuf.h1<?, ?> r2 = r0.f2186o
            java.lang.Object r3 = r2.g(r1)
            int r2 = r2.h(r3)
            int r5 = r5 + r2
            boolean r2 = r0.f2177f
            if (r2 == 0) goto L_0x03b8
            androidx.wear.protolayout.protobuf.o<?> r0 = r0.f2187p
            androidx.wear.protolayout.protobuf.r r0 = r0.c(r1)
            int r0 = r0.h()
            int r5 = r5 + r0
        L_0x03b8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.r0.o(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01e2, code lost:
        r7.putInt(r11, (long) r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e6, code lost:
        r3 = (androidx.wear.protolayout.protobuf.j.B(r6) + androidx.wear.protolayout.protobuf.j.D(r5)) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x027e, code lost:
        r3 = androidx.wear.protolayout.protobuf.j.q(r6, (androidx.wear.protolayout.protobuf.o0) androidx.wear.protolayout.protobuf.l1.o(r8, r11), n(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0298, code lost:
        r3 = androidx.wear.protolayout.protobuf.j.y(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02a8, code lost:
        r3 = androidx.wear.protolayout.protobuf.j.x(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02b4, code lost:
        r3 = androidx.wear.protolayout.protobuf.j.w(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02c0, code lost:
        r3 = androidx.wear.protolayout.protobuf.j.v(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02d0, code lost:
        r3 = androidx.wear.protolayout.protobuf.j.m(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02e0, code lost:
        r3 = androidx.wear.protolayout.protobuf.j.C(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ec, code lost:
        r3 = androidx.wear.protolayout.protobuf.l1.o(r8, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02f7, code lost:
        r3 = androidx.wear.protolayout.protobuf.c1.o(r6, n(r1), androidx.wear.protolayout.protobuf.l1.o(r8, r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0311, code lost:
        if ((r3 instanceof androidx.wear.protolayout.protobuf.g) != false) goto L_0x0313;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0313, code lost:
        r3 = androidx.wear.protolayout.protobuf.j.k(r6, (androidx.wear.protolayout.protobuf.g) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x031b, code lost:
        r3 = androidx.wear.protolayout.protobuf.j.z(r6, (java.lang.String) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0328, code lost:
        r3 = androidx.wear.protolayout.protobuf.j.j(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0333, code lost:
        r3 = androidx.wear.protolayout.protobuf.j.n(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x033e, code lost:
        r3 = androidx.wear.protolayout.protobuf.j.o(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x034d, code lost:
        r3 = androidx.wear.protolayout.protobuf.j.r(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x035c, code lost:
        r3 = androidx.wear.protolayout.protobuf.j.E(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x036b, code lost:
        r3 = androidx.wear.protolayout.protobuf.j.t(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0376, code lost:
        r3 = androidx.wear.protolayout.protobuf.j.p(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0381, code lost:
        r3 = androidx.wear.protolayout.protobuf.j.l(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0385, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        if ((r3 instanceof androidx.wear.protolayout.protobuf.g) != false) goto L_0x0313;
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
    public final int p(T r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L_0x0003:
            int[] r3 = r10.f2173a
            int r4 = r3.length
            if (r1 >= r4) goto L_0x038a
            int r4 = r10.M(r1)
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r4
            int r5 = r5 >>> 20
            r6 = r3[r1]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r8 = (long) r4
            androidx.wear.protolayout.protobuf.s r4 = androidx.wear.protolayout.protobuf.s.DOUBLE_LIST_PACKED
            int r4 = r4.e()
            if (r5 < r4) goto L_0x002e
            androidx.wear.protolayout.protobuf.s r4 = androidx.wear.protolayout.protobuf.s.SINT64_LIST_PACKED
            int r4 = r4.e()
            if (r5 > r4) goto L_0x002e
            int r4 = r1 + 2
            r3 = r3[r4]
            r3 = r3 & r7
            goto L_0x002f
        L_0x002e:
            r3 = r0
        L_0x002f:
            boolean r4 = r10.f2180i
            sun.misc.Unsafe r7 = f2172s
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
            boolean r3 = r10.s(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            goto L_0x027e
        L_0x0040:
            boolean r3 = r10.s(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            long r3 = B(r8, r11)
            goto L_0x0298
        L_0x004c:
            boolean r3 = r10.s(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            int r3 = A(r8, r11)
            goto L_0x02a8
        L_0x0058:
            boolean r3 = r10.s(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            goto L_0x02b4
        L_0x0060:
            boolean r3 = r10.s(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            goto L_0x02c0
        L_0x0068:
            boolean r3 = r10.s(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            int r3 = A(r8, r11)
            goto L_0x02d0
        L_0x0074:
            boolean r3 = r10.s(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            int r3 = A(r8, r11)
            goto L_0x02e0
        L_0x0080:
            boolean r3 = r10.s(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            goto L_0x02ec
        L_0x0088:
            boolean r3 = r10.s(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            goto L_0x02f7
        L_0x0090:
            boolean r3 = r10.s(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            java.lang.Object r3 = androidx.wear.protolayout.protobuf.l1.o(r8, r11)
            boolean r4 = r3 instanceof androidx.wear.protolayout.protobuf.g
            if (r4 == 0) goto L_0x031b
            goto L_0x0313
        L_0x00a0:
            boolean r3 = r10.s(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            goto L_0x0328
        L_0x00a8:
            boolean r3 = r10.s(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            goto L_0x0333
        L_0x00b0:
            boolean r3 = r10.s(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            goto L_0x033e
        L_0x00b8:
            boolean r3 = r10.s(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            int r3 = A(r8, r11)
            goto L_0x034d
        L_0x00c4:
            boolean r3 = r10.s(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            long r3 = B(r8, r11)
            goto L_0x035c
        L_0x00d0:
            boolean r3 = r10.s(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            long r3 = B(r8, r11)
            goto L_0x036b
        L_0x00dc:
            boolean r3 = r10.s(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            goto L_0x0376
        L_0x00e4:
            boolean r3 = r10.s(r6, r1, r11)
            if (r3 == 0) goto L_0x0386
            goto L_0x0381
        L_0x00ec:
            java.lang.Object r3 = androidx.wear.protolayout.protobuf.l1.o(r8, r11)
            java.lang.Object r4 = r10.m(r1)
            androidx.wear.protolayout.protobuf.j0 r5 = r10.f2188q
            int r3 = r5.b(r3, r6, r4)
            goto L_0x0385
        L_0x00fc:
            java.util.List r3 = t(r8, r11)
            androidx.wear.protolayout.protobuf.b1 r4 = r10.n(r1)
            int r3 = androidx.wear.protolayout.protobuf.c1.j(r6, r3, r4)
            goto L_0x0385
        L_0x010a:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.wear.protolayout.protobuf.c1.t(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x011a:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.wear.protolayout.protobuf.c1.r(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x012a:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.wear.protolayout.protobuf.c1.i(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x013a:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.wear.protolayout.protobuf.c1.g(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x014a:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.wear.protolayout.protobuf.c1.e(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x015a:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.wear.protolayout.protobuf.c1.w(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x016a:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.wear.protolayout.protobuf.c1.b(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x017a:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.wear.protolayout.protobuf.c1.g(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x0189:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.wear.protolayout.protobuf.c1.i(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x0198:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.wear.protolayout.protobuf.c1.l(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x01a7:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.wear.protolayout.protobuf.c1.y(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x01b6:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.wear.protolayout.protobuf.c1.n(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x01c5:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.wear.protolayout.protobuf.c1.g(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
            goto L_0x01e2
        L_0x01d4:
            java.lang.Object r5 = r7.getObject(r11, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = androidx.wear.protolayout.protobuf.c1.i(r5)
            if (r5 <= 0) goto L_0x0386
            if (r4 == 0) goto L_0x01e6
        L_0x01e2:
            long r3 = (long) r3
            r7.putInt(r11, r3, r5)
        L_0x01e6:
            int r3 = androidx.wear.protolayout.protobuf.j.B(r6)
            int r4 = androidx.wear.protolayout.protobuf.j.D(r5)
            int r3 = r3 + r4
            int r3 = r3 + r5
            goto L_0x0385
        L_0x01f2:
            java.util.List r3 = t(r8, r11)
            int r3 = androidx.wear.protolayout.protobuf.c1.s(r6, r3)
            goto L_0x0385
        L_0x01fc:
            java.util.List r3 = t(r8, r11)
            int r3 = androidx.wear.protolayout.protobuf.c1.q(r6, r3)
            goto L_0x0385
        L_0x0206:
            java.util.List r3 = t(r8, r11)
            int r3 = androidx.wear.protolayout.protobuf.c1.d(r6, r3)
            goto L_0x0385
        L_0x0210:
            java.util.List r3 = t(r8, r11)
            int r3 = androidx.wear.protolayout.protobuf.c1.v(r6, r3)
            goto L_0x0385
        L_0x021a:
            java.util.List r3 = t(r8, r11)
            int r3 = androidx.wear.protolayout.protobuf.c1.c(r6, r3)
            goto L_0x0385
        L_0x0224:
            java.util.List r3 = t(r8, r11)
            androidx.wear.protolayout.protobuf.b1 r4 = r10.n(r1)
            int r3 = androidx.wear.protolayout.protobuf.c1.p(r6, r3, r4)
            goto L_0x0385
        L_0x0232:
            java.util.List r3 = t(r8, r11)
            int r3 = androidx.wear.protolayout.protobuf.c1.u(r6, r3)
            goto L_0x0385
        L_0x023c:
            java.util.List r3 = t(r8, r11)
            int r3 = androidx.wear.protolayout.protobuf.c1.a(r6, r3)
            goto L_0x0385
        L_0x0246:
            java.util.List r3 = t(r8, r11)
            int r3 = androidx.wear.protolayout.protobuf.c1.k(r6, r3)
            goto L_0x0385
        L_0x0250:
            java.util.List r3 = t(r8, r11)
            int r3 = androidx.wear.protolayout.protobuf.c1.x(r6, r3)
            goto L_0x0385
        L_0x025a:
            java.util.List r3 = t(r8, r11)
            int r3 = androidx.wear.protolayout.protobuf.c1.m(r6, r3)
            goto L_0x0385
        L_0x0264:
            java.util.List r3 = t(r8, r11)
            int r3 = androidx.wear.protolayout.protobuf.c1.f(r6, r3)
            goto L_0x0385
        L_0x026e:
            java.util.List r3 = t(r8, r11)
            int r3 = androidx.wear.protolayout.protobuf.c1.h(r6, r3)
            goto L_0x0385
        L_0x0278:
            boolean r3 = r10.q(r1, r11)
            if (r3 == 0) goto L_0x0386
        L_0x027e:
            java.lang.Object r3 = androidx.wear.protolayout.protobuf.l1.o(r8, r11)
            androidx.wear.protolayout.protobuf.o0 r3 = (androidx.wear.protolayout.protobuf.o0) r3
            androidx.wear.protolayout.protobuf.b1 r4 = r10.n(r1)
            int r3 = androidx.wear.protolayout.protobuf.j.q(r6, r3, r4)
            goto L_0x0385
        L_0x028e:
            boolean r3 = r10.q(r1, r11)
            if (r3 == 0) goto L_0x0386
            long r3 = androidx.wear.protolayout.protobuf.l1.n(r8, r11)
        L_0x0298:
            int r3 = androidx.wear.protolayout.protobuf.j.y(r6, r3)
            goto L_0x0385
        L_0x029e:
            boolean r3 = r10.q(r1, r11)
            if (r3 == 0) goto L_0x0386
            int r3 = androidx.wear.protolayout.protobuf.l1.m(r8, r11)
        L_0x02a8:
            int r3 = androidx.wear.protolayout.protobuf.j.x(r6, r3)
            goto L_0x0385
        L_0x02ae:
            boolean r3 = r10.q(r1, r11)
            if (r3 == 0) goto L_0x0386
        L_0x02b4:
            int r3 = androidx.wear.protolayout.protobuf.j.w(r6)
            goto L_0x0385
        L_0x02ba:
            boolean r3 = r10.q(r1, r11)
            if (r3 == 0) goto L_0x0386
        L_0x02c0:
            int r3 = androidx.wear.protolayout.protobuf.j.v(r6)
            goto L_0x0385
        L_0x02c6:
            boolean r3 = r10.q(r1, r11)
            if (r3 == 0) goto L_0x0386
            int r3 = androidx.wear.protolayout.protobuf.l1.m(r8, r11)
        L_0x02d0:
            int r3 = androidx.wear.protolayout.protobuf.j.m(r6, r3)
            goto L_0x0385
        L_0x02d6:
            boolean r3 = r10.q(r1, r11)
            if (r3 == 0) goto L_0x0386
            int r3 = androidx.wear.protolayout.protobuf.l1.m(r8, r11)
        L_0x02e0:
            int r3 = androidx.wear.protolayout.protobuf.j.C(r6, r3)
            goto L_0x0385
        L_0x02e6:
            boolean r3 = r10.q(r1, r11)
            if (r3 == 0) goto L_0x0386
        L_0x02ec:
            java.lang.Object r3 = androidx.wear.protolayout.protobuf.l1.o(r8, r11)
            goto L_0x0313
        L_0x02f1:
            boolean r3 = r10.q(r1, r11)
            if (r3 == 0) goto L_0x0386
        L_0x02f7:
            java.lang.Object r3 = androidx.wear.protolayout.protobuf.l1.o(r8, r11)
            androidx.wear.protolayout.protobuf.b1 r4 = r10.n(r1)
            int r3 = androidx.wear.protolayout.protobuf.c1.o(r6, r4, r3)
            goto L_0x0385
        L_0x0305:
            boolean r3 = r10.q(r1, r11)
            if (r3 == 0) goto L_0x0386
            java.lang.Object r3 = androidx.wear.protolayout.protobuf.l1.o(r8, r11)
            boolean r4 = r3 instanceof androidx.wear.protolayout.protobuf.g
            if (r4 == 0) goto L_0x031b
        L_0x0313:
            androidx.wear.protolayout.protobuf.g r3 = (androidx.wear.protolayout.protobuf.g) r3
            int r3 = androidx.wear.protolayout.protobuf.j.k(r6, r3)
            goto L_0x0385
        L_0x031b:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = androidx.wear.protolayout.protobuf.j.z(r6, r3)
            goto L_0x0385
        L_0x0322:
            boolean r3 = r10.q(r1, r11)
            if (r3 == 0) goto L_0x0386
        L_0x0328:
            int r3 = androidx.wear.protolayout.protobuf.j.j(r6)
            goto L_0x0385
        L_0x032d:
            boolean r3 = r10.q(r1, r11)
            if (r3 == 0) goto L_0x0386
        L_0x0333:
            int r3 = androidx.wear.protolayout.protobuf.j.n(r6)
            goto L_0x0385
        L_0x0338:
            boolean r3 = r10.q(r1, r11)
            if (r3 == 0) goto L_0x0386
        L_0x033e:
            int r3 = androidx.wear.protolayout.protobuf.j.o(r6)
            goto L_0x0385
        L_0x0343:
            boolean r3 = r10.q(r1, r11)
            if (r3 == 0) goto L_0x0386
            int r3 = androidx.wear.protolayout.protobuf.l1.m(r8, r11)
        L_0x034d:
            int r3 = androidx.wear.protolayout.protobuf.j.r(r6, r3)
            goto L_0x0385
        L_0x0352:
            boolean r3 = r10.q(r1, r11)
            if (r3 == 0) goto L_0x0386
            long r3 = androidx.wear.protolayout.protobuf.l1.n(r8, r11)
        L_0x035c:
            int r3 = androidx.wear.protolayout.protobuf.j.E(r6, r3)
            goto L_0x0385
        L_0x0361:
            boolean r3 = r10.q(r1, r11)
            if (r3 == 0) goto L_0x0386
            long r3 = androidx.wear.protolayout.protobuf.l1.n(r8, r11)
        L_0x036b:
            int r3 = androidx.wear.protolayout.protobuf.j.t(r6, r3)
            goto L_0x0385
        L_0x0370:
            boolean r3 = r10.q(r1, r11)
            if (r3 == 0) goto L_0x0386
        L_0x0376:
            int r3 = androidx.wear.protolayout.protobuf.j.p(r6)
            goto L_0x0385
        L_0x037b:
            boolean r3 = r10.q(r1, r11)
            if (r3 == 0) goto L_0x0386
        L_0x0381:
            int r3 = androidx.wear.protolayout.protobuf.j.l(r6)
        L_0x0385:
            int r2 = r2 + r3
        L_0x0386:
            int r1 = r1 + 3
            goto L_0x0003
        L_0x038a:
            androidx.wear.protolayout.protobuf.h1<?, ?> r10 = r10.f2186o
            java.lang.Object r11 = r10.g(r11)
            int r10 = r10.h(r11)
            int r2 = r2 + r10
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.protolayout.protobuf.r0.p(java.lang.Object):int");
    }

    public final boolean q(int i8, Object obj) {
        boolean equals;
        int i9 = this.f2173a[i8 + 2];
        long j8 = (long) (i9 & 1048575);
        if (j8 != 1048575) {
            return ((1 << (i9 >>> 20)) & l1.m(j8, obj)) != 0;
        }
        int M = M(i8);
        long j9 = (long) (M & 1048575);
        switch ((M & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(l1.k(j9, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(l1.l(j9, obj)) != 0;
            case 2:
                return l1.n(j9, obj) != 0;
            case 3:
                return l1.n(j9, obj) != 0;
            case 4:
                return l1.m(j9, obj) != 0;
            case 5:
                return l1.n(j9, obj) != 0;
            case 6:
                return l1.m(j9, obj) != 0;
            case 7:
                return l1.g(j9, obj);
            case 8:
                Object o8 = l1.o(j9, obj);
                if (o8 instanceof String) {
                    equals = ((String) o8).isEmpty();
                    break;
                } else if (o8 instanceof g) {
                    equals = g.f2096g.equals(o8);
                    break;
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return l1.o(j9, obj) != null;
            case 10:
                equals = g.f2096g.equals(l1.o(j9, obj));
                break;
            case 11:
                return l1.m(j9, obj) != 0;
            case 12:
                return l1.m(j9, obj) != 0;
            case 13:
                return l1.m(j9, obj) != 0;
            case 14:
                return l1.n(j9, obj) != 0;
            case 15:
                return l1.m(j9, obj) != 0;
            case 16:
                return l1.n(j9, obj) != 0;
            case 17:
                return l1.o(j9, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !equals;
    }

    public final boolean s(int i8, int i9, Object obj) {
        return l1.m((long) (this.f2173a[i9 + 2] & 1048575), obj) == i8;
    }

    public final void u(Object obj, int i8, Object obj2, a1 a1Var) {
        long M = (long) (M(i8) & 1048575);
        Object o8 = l1.o(M, obj);
        j0 j0Var = this.f2188q;
        if (o8 == null) {
            o8 = j0Var.f();
            l1.v(M, obj, o8);
        } else if (j0Var.c(o8)) {
            Object f9 = j0Var.f();
            j0Var.a(f9, o8);
            l1.v(M, obj, f9);
            o8 = f9;
        }
        j0Var.h(o8);
        j0Var.e(obj2);
        i iVar = (i) a1Var;
        iVar.v(2);
        h hVar = iVar.f2114a;
        hVar.f(hVar.w());
        throw null;
    }

    public final void v(Object obj, int i8, Object obj2) {
        if (q(i8, obj2)) {
            long M = (long) (M(i8) & 1048575);
            Unsafe unsafe = f2172s;
            Object object = unsafe.getObject(obj2, M);
            if (object != null) {
                b1 n8 = n(i8);
                if (!q(i8, obj)) {
                    if (!r(object)) {
                        unsafe.putObject(obj, M, object);
                    } else {
                        Object f9 = n8.f();
                        n8.a(f9, object);
                        unsafe.putObject(obj, M, f9);
                    }
                    I(i8, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, M);
                if (!r(object2)) {
                    Object f10 = n8.f();
                    n8.a(f10, object2);
                    unsafe.putObject(obj, M, f10);
                    object2 = f10;
                }
                n8.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.f2173a[i8] + " is present but null: " + obj2);
        }
    }

    public final void w(Object obj, int i8, Object obj2) {
        int[] iArr = this.f2173a;
        int i9 = iArr[i8];
        if (s(i9, i8, obj2)) {
            long M = (long) (M(i8) & 1048575);
            Unsafe unsafe = f2172s;
            Object object = unsafe.getObject(obj2, M);
            if (object != null) {
                b1 n8 = n(i8);
                if (!s(i9, i8, obj)) {
                    if (!r(object)) {
                        unsafe.putObject(obj, M, object);
                    } else {
                        Object f9 = n8.f();
                        n8.a(f9, object);
                        unsafe.putObject(obj, M, f9);
                    }
                    J(i9, i8, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, M);
                if (!r(object2)) {
                    Object f10 = n8.f();
                    n8.a(f10, object2);
                    unsafe.putObject(obj, M, f10);
                    object2 = f10;
                }
                n8.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + iArr[i8] + " is present but null: " + obj2);
        }
    }

    public final Object x(int i8, Object obj) {
        b1 n8 = n(i8);
        long M = (long) (M(i8) & 1048575);
        if (!q(i8, obj)) {
            return n8.f();
        }
        Object object = f2172s.getObject(obj, M);
        if (r(object)) {
            return object;
        }
        Object f9 = n8.f();
        if (object != null) {
            n8.a(f9, object);
        }
        return f9;
    }

    public final Object y(int i8, int i9, Object obj) {
        b1 n8 = n(i9);
        if (!s(i8, i9, obj)) {
            return n8.f();
        }
        Object object = f2172s.getObject(obj, (long) (M(i9) & 1048575));
        if (r(object)) {
            return object;
        }
        Object f9 = n8.f();
        if (object != null) {
            n8.a(f9, object);
        }
        return f9;
    }
}
