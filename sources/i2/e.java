package i2;

import j2.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final b.a f4803a = b.a.a("ty", "d");

    /* JADX WARNING: type inference failed for: r6v2, types: [f2.b] */
    /* JADX WARNING: type inference failed for: r6v16 */
    /* JADX WARNING: type inference failed for: r6v24 */
    /* JADX WARNING: type inference failed for: r6v38 */
    /* JADX WARNING: type inference failed for: r17v9, types: [f2.a] */
    /* JADX WARNING: type inference failed for: r15v2, types: [f2.k] */
    /* JADX WARNING: type inference failed for: r18v23, types: [f2.d] */
    /* JADX WARNING: type inference failed for: r19v32, types: [f2.e] */
    /* JADX WARNING: type inference failed for: r17v10, types: [f2.i] */
    /* JADX WARNING: type inference failed for: r17v11, types: [f2.i] */
    /* JADX WARNING: type inference failed for: r17v12, types: [f2.h] */
    /* JADX WARNING: type inference failed for: r19v33, types: [f2.n] */
    /* JADX WARNING: type inference failed for: r17v13, types: [f2.o] */
    /* JADX WARNING: type inference failed for: r6v39 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01f9 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static f2.b a(j2.c r33, y1.f r34) {
        /*
            r0 = r33
            r1 = r34
            r33.c()
            r2 = 2
            r3 = r2
        L_0x0009:
            boolean r4 = r33.j()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x002c
            j2.b$a r4 = f4803a
            int r4 = r0.v(r4)
            if (r4 == 0) goto L_0x0027
            if (r4 == r5) goto L_0x0022
            r33.w()
            r33.x()
            goto L_0x0009
        L_0x0022:
            int r3 = r33.q()
            goto L_0x0009
        L_0x0027:
            java.lang.String r4 = r33.s()
            goto L_0x002d
        L_0x002c:
            r4 = r6
        L_0x002d:
            if (r4 != 0) goto L_0x0030
            return r6
        L_0x0030:
            int r7 = r4.hashCode()
            r8 = 4
            r9 = 5
            r11 = 3
            r12 = 0
            switch(r7) {
                case 3239: goto L_0x00d2;
                case 3270: goto L_0x00c7;
                case 3295: goto L_0x00bc;
                case 3307: goto L_0x00b1;
                case 3308: goto L_0x00a6;
                case 3488: goto L_0x009b;
                case 3633: goto L_0x0090;
                case 3646: goto L_0x0083;
                case 3669: goto L_0x0075;
                case 3679: goto L_0x0067;
                case 3681: goto L_0x0059;
                case 3705: goto L_0x004b;
                case 3710: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x00dd
        L_0x003d:
            java.lang.String r7 = "tr"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0047
            goto L_0x00dd
        L_0x0047:
            r7 = 12
            goto L_0x00de
        L_0x004b:
            java.lang.String r7 = "tm"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0055
            goto L_0x00dd
        L_0x0055:
            r7 = 11
            goto L_0x00de
        L_0x0059:
            java.lang.String r7 = "st"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0063
            goto L_0x00dd
        L_0x0063:
            r7 = 10
            goto L_0x00de
        L_0x0067:
            java.lang.String r7 = "sr"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0071
            goto L_0x00dd
        L_0x0071:
            r7 = 9
            goto L_0x00de
        L_0x0075:
            java.lang.String r7 = "sh"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x007f
            goto L_0x00dd
        L_0x007f:
            r7 = 8
            goto L_0x00de
        L_0x0083:
            java.lang.String r7 = "rp"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x008d
            goto L_0x00dd
        L_0x008d:
            r7 = 7
            goto L_0x00de
        L_0x0090:
            java.lang.String r7 = "rc"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0099
            goto L_0x00dd
        L_0x0099:
            r7 = 6
            goto L_0x00de
        L_0x009b:
            java.lang.String r7 = "mm"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00a4
            goto L_0x00dd
        L_0x00a4:
            r7 = r9
            goto L_0x00de
        L_0x00a6:
            java.lang.String r7 = "gs"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00af
            goto L_0x00dd
        L_0x00af:
            r7 = r8
            goto L_0x00de
        L_0x00b1:
            java.lang.String r7 = "gr"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00ba
            goto L_0x00dd
        L_0x00ba:
            r7 = r11
            goto L_0x00de
        L_0x00bc:
            java.lang.String r7 = "gf"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00c5
            goto L_0x00dd
        L_0x00c5:
            r7 = r2
            goto L_0x00de
        L_0x00c7:
            java.lang.String r7 = "fl"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00d0
            goto L_0x00dd
        L_0x00d0:
            r7 = r5
            goto L_0x00de
        L_0x00d2:
            java.lang.String r7 = "el"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            r7 = r12
            goto L_0x00de
        L_0x00dd:
            r7 = -1
        L_0x00de:
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 100
            java.lang.String r15 = "o"
            java.lang.String r6 = "g"
            java.lang.String r10 = "d"
            r18 = 0
            switch(r7) {
                case 0: goto L_0x06c5;
                case 1: goto L_0x0656;
                case 2: goto L_0x05a3;
                case 3: goto L_0x055c;
                case 4: goto L_0x041c;
                case 5: goto L_0x03cf;
                case 6: goto L_0x0387;
                case 7: goto L_0x033f;
                case 8: goto L_0x02fb;
                case 9: goto L_0x027e;
                case 10: goto L_0x016d;
                case 11: goto L_0x00ff;
                case 12: goto L_0x00f9;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            java.lang.String r1 = "Unknown shape type "
            java.lang.String r1 = r1.concat(r4)
            k2.c.b(r1)
            r6 = 0
            goto L_0x071a
        L_0x00f9:
            e2.d r6 = i2.c.a(r33, r34)
            goto L_0x071a
        L_0x00ff:
            j2.b$a r3 = i2.d0.f4802a
            r19 = r12
            r23 = r19
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
        L_0x010d:
            boolean r3 = r33.j()
            if (r3 == 0) goto L_0x0164
            j2.b$a r3 = i2.d0.f4802a
            int r3 = r0.v(r3)
            if (r3 == 0) goto L_0x015f
            if (r3 == r5) goto L_0x015a
            if (r3 == r2) goto L_0x0155
            if (r3 == r11) goto L_0x0150
            if (r3 == r8) goto L_0x012e
            if (r3 == r9) goto L_0x0129
            r33.x()
            goto L_0x010d
        L_0x0129:
            boolean r23 = r33.n()
            goto L_0x010d
        L_0x012e:
            int r3 = r33.q()
            if (r3 == r5) goto L_0x014d
            if (r3 != r2) goto L_0x0139
            r19 = r2
            goto L_0x010d
        L_0x0139:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown trim path type "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x014d:
            r19 = r5
            goto L_0x010d
        L_0x0150:
            java.lang.String r18 = r33.s()
            goto L_0x010d
        L_0x0155:
            e2.b r22 = k3.j.O(r0, r1, r12)
            goto L_0x010d
        L_0x015a:
            e2.b r21 = k3.j.O(r0, r1, r12)
            goto L_0x010d
        L_0x015f:
            e2.b r20 = k3.j.O(r0, r1, r12)
            goto L_0x010d
        L_0x0164:
            f2.o r6 = new f2.o
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23)
            goto L_0x071a
        L_0x016d:
            j2.b$a r3 = i2.c0.f4799a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r26 = r12
            r27 = r26
            r29 = r27
            r28 = r18
            r4 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r25 = 0
        L_0x0185:
            boolean r7 = r33.j()
            if (r7 == 0) goto L_0x025a
            j2.b$a r7 = i2.c0.f4799a
            int r7 = r0.v(r7)
            switch(r7) {
                case 0: goto L_0x0254;
                case 1: goto L_0x024e;
                case 2: goto L_0x0248;
                case 3: goto L_0x0242;
                case 4: goto L_0x0235;
                case 5: goto L_0x0228;
                case 6: goto L_0x021f;
                case 7: goto L_0x0219;
                case 8: goto L_0x0198;
                default: goto L_0x0194;
            }
        L_0x0194:
            r33.x()
            goto L_0x0185
        L_0x0198:
            r33.a()
        L_0x019b:
            boolean r7 = r33.j()
            if (r7 == 0) goto L_0x0207
            r33.c()
            r7 = 0
            r8 = 0
        L_0x01a6:
            boolean r9 = r33.j()
            if (r9 == 0) goto L_0x01c7
            j2.b$a r9 = i2.c0.f4800b
            int r9 = r0.v(r9)
            if (r9 == 0) goto L_0x01c2
            if (r9 == r5) goto L_0x01bd
            r33.w()
            r33.x()
            goto L_0x01a6
        L_0x01bd:
            e2.b r7 = k3.j.O(r0, r1, r5)
            goto L_0x01a6
        L_0x01c2:
            java.lang.String r8 = r33.s()
            goto L_0x01a6
        L_0x01c7:
            r33.g()
            r8.getClass()
            int r9 = r8.hashCode()
            if (r9 == r14) goto L_0x01ee
            r13 = 103(0x67, float:1.44E-43)
            if (r9 == r13) goto L_0x01e5
            r13 = 111(0x6f, float:1.56E-43)
            if (r9 == r13) goto L_0x01dc
            goto L_0x01f4
        L_0x01dc:
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x01e3
            goto L_0x01f4
        L_0x01e3:
            r8 = r2
            goto L_0x01f7
        L_0x01e5:
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x01ec
            goto L_0x01f4
        L_0x01ec:
            r8 = r5
            goto L_0x01f7
        L_0x01ee:
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x01f6
        L_0x01f4:
            r8 = -1
            goto L_0x01f7
        L_0x01f6:
            r8 = r12
        L_0x01f7:
            if (r8 == 0) goto L_0x0201
            if (r8 == r5) goto L_0x0201
            if (r8 == r2) goto L_0x01fe
            goto L_0x019b
        L_0x01fe:
            r21 = r7
            goto L_0x019b
        L_0x0201:
            r1.f8231n = r5
            r3.add(r7)
            goto L_0x019b
        L_0x0207:
            r33.d()
            int r7 = r3.size()
            if (r7 != r5) goto L_0x0185
            java.lang.Object r7 = r3.get(r12)
            r3.add(r7)
            goto L_0x0185
        L_0x0219:
            boolean r29 = r33.n()
            goto L_0x0185
        L_0x021f:
            double r7 = r33.o()
            float r7 = (float) r7
            r28 = r7
            goto L_0x0185
        L_0x0228:
            int[] r7 = s.g.c(r11)
            int r8 = r33.q()
            int r8 = r8 - r5
            r27 = r7[r8]
            goto L_0x0185
        L_0x0235:
            int[] r7 = s.g.c(r11)
            int r8 = r33.q()
            int r8 = r8 - r5
            r26 = r7[r8]
            goto L_0x0185
        L_0x0242:
            e2.a r4 = k3.j.P(r33, r34)
            goto L_0x0185
        L_0x0248:
            e2.b r25 = k3.j.O(r0, r1, r5)
            goto L_0x0185
        L_0x024e:
            e2.a r23 = k3.j.N(r33, r34)
            goto L_0x0185
        L_0x0254:
            java.lang.String r20 = r33.s()
            goto L_0x0185
        L_0x025a:
            if (r4 != 0) goto L_0x0271
            e2.a r1 = new e2.a
            l2.a r4 = new l2.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            r4.<init>(r5)
            java.util.List r4 = java.util.Collections.singletonList(r4)
            r1.<init>(r2, r4)
            r24 = r1
            goto L_0x0273
        L_0x0271:
            r24 = r4
        L_0x0273:
            f2.n r6 = new f2.n
            r19 = r6
            r22 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x071a
        L_0x027e:
            j2.b$a r3 = i2.u.f4832a
            r19 = r12
            r27 = r19
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
        L_0x0294:
            boolean r3 = r33.j()
            if (r3 == 0) goto L_0x02f2
            j2.b$a r3 = i2.u.f4832a
            int r3 = r0.v(r3)
            switch(r3) {
                case 0: goto L_0x02ed;
                case 1: goto L_0x02d2;
                case 2: goto L_0x02cd;
                case 3: goto L_0x02c8;
                case 4: goto L_0x02c3;
                case 5: goto L_0x02be;
                case 6: goto L_0x02b9;
                case 7: goto L_0x02b4;
                case 8: goto L_0x02af;
                case 9: goto L_0x02aa;
                default: goto L_0x02a3;
            }
        L_0x02a3:
            r33.w()
            r33.x()
            goto L_0x0294
        L_0x02aa:
            boolean r27 = r33.n()
            goto L_0x0294
        L_0x02af:
            e2.b r25 = k3.j.O(r0, r1, r12)
            goto L_0x0294
        L_0x02b4:
            e2.b r23 = k3.j.O(r0, r1, r5)
            goto L_0x0294
        L_0x02b9:
            e2.b r26 = k3.j.O(r0, r1, r12)
            goto L_0x0294
        L_0x02be:
            e2.b r24 = k3.j.O(r0, r1, r5)
            goto L_0x0294
        L_0x02c3:
            e2.b r22 = k3.j.O(r0, r1, r12)
            goto L_0x0294
        L_0x02c8:
            e2.e r21 = i2.a.b(r33, r34)
            goto L_0x0294
        L_0x02cd:
            e2.b r20 = k3.j.O(r0, r1, r12)
            goto L_0x0294
        L_0x02d2:
            int r3 = r33.q()
            int[] r4 = s.g.c(r2)
            int r6 = r4.length
            r7 = r12
        L_0x02dc:
            if (r7 >= r6) goto L_0x02ea
            r19 = r4[r7]
            int r8 = b6.a.g(r19)
            if (r8 != r3) goto L_0x02e7
            goto L_0x0294
        L_0x02e7:
            int r7 = r7 + 1
            goto L_0x02dc
        L_0x02ea:
            r19 = r12
            goto L_0x0294
        L_0x02ed:
            java.lang.String r18 = r33.s()
            goto L_0x0294
        L_0x02f2:
            f2.h r6 = new f2.h
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x071a
        L_0x02fb:
            j2.b$a r3 = i2.b0.f4796a
            r4 = r12
            r7 = r4
            r3 = 0
            r6 = 0
        L_0x0301:
            boolean r8 = r33.j()
            if (r8 == 0) goto L_0x0338
            j2.b$a r8 = i2.b0.f4796a
            int r8 = r0.v(r8)
            if (r8 == 0) goto L_0x0333
            if (r8 == r5) goto L_0x032e
            if (r8 == r2) goto L_0x031e
            if (r8 == r11) goto L_0x0319
            r33.x()
            goto L_0x0301
        L_0x0319:
            boolean r7 = r33.n()
            goto L_0x0301
        L_0x031e:
            e2.a r3 = new e2.a
            float r8 = k2.g.c()
            i2.y r10 = i2.y.f4836a
            java.util.ArrayList r8 = i2.o.a(r0, r1, r8, r10, r12)
            r3.<init>(r9, r8)
            goto L_0x0301
        L_0x032e:
            int r4 = r33.q()
            goto L_0x0301
        L_0x0333:
            java.lang.String r6 = r33.s()
            goto L_0x0301
        L_0x0338:
            f2.m r1 = new f2.m
            r1.<init>(r6, r4, r3, r7)
            goto L_0x05a0
        L_0x033f:
            j2.b$a r3 = i2.w.f4834a
            r22 = r12
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x034b:
            boolean r3 = r33.j()
            if (r3 == 0) goto L_0x037e
            j2.b$a r3 = i2.w.f4834a
            int r3 = r0.v(r3)
            if (r3 == 0) goto L_0x0379
            if (r3 == r5) goto L_0x0374
            if (r3 == r2) goto L_0x036f
            if (r3 == r11) goto L_0x036a
            if (r3 == r8) goto L_0x0365
            r33.x()
            goto L_0x034b
        L_0x0365:
            boolean r22 = r33.n()
            goto L_0x034b
        L_0x036a:
            e2.d r21 = i2.c.a(r33, r34)
            goto L_0x034b
        L_0x036f:
            e2.b r20 = k3.j.O(r0, r1, r12)
            goto L_0x034b
        L_0x0374:
            e2.b r19 = k3.j.O(r0, r1, r12)
            goto L_0x034b
        L_0x0379:
            java.lang.String r18 = r33.s()
            goto L_0x034b
        L_0x037e:
            f2.i r6 = new f2.i
            r17 = r6
            r17.<init>((java.lang.String) r18, (e2.b) r19, (e2.b) r20, (e2.d) r21, (boolean) r22)
            goto L_0x071a
        L_0x0387:
            j2.b$a r3 = i2.v.f4833a
            r22 = r12
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x0393:
            boolean r3 = r33.j()
            if (r3 == 0) goto L_0x03c6
            j2.b$a r3 = i2.v.f4833a
            int r3 = r0.v(r3)
            if (r3 == 0) goto L_0x03c1
            if (r3 == r5) goto L_0x03bc
            if (r3 == r2) goto L_0x03b7
            if (r3 == r11) goto L_0x03b2
            if (r3 == r8) goto L_0x03ad
            r33.x()
            goto L_0x0393
        L_0x03ad:
            boolean r22 = r33.n()
            goto L_0x0393
        L_0x03b2:
            e2.b r21 = k3.j.O(r0, r1, r5)
            goto L_0x0393
        L_0x03b7:
            e2.a r20 = k3.j.Q(r33, r34)
            goto L_0x0393
        L_0x03bc:
            e2.e r19 = i2.a.b(r33, r34)
            goto L_0x0393
        L_0x03c1:
            java.lang.String r18 = r33.s()
            goto L_0x0393
        L_0x03c6:
            f2.i r6 = new f2.i
            r17 = r6
            r17.<init>((java.lang.String) r18, (e2.e) r19, (e2.a) r20, (e2.b) r21, (boolean) r22)
            goto L_0x071a
        L_0x03cf:
            j2.b$a r3 = i2.r.f4829a
            r3 = r12
            r6 = 0
        L_0x03d3:
            boolean r4 = r33.j()
            if (r4 == 0) goto L_0x040f
            j2.b$a r4 = i2.r.f4829a
            int r4 = r0.v(r4)
            if (r4 == 0) goto L_0x040a
            if (r4 == r5) goto L_0x03f1
            if (r4 == r2) goto L_0x03ec
            r33.w()
            r33.x()
            goto L_0x03d3
        L_0x03ec:
            boolean r3 = r33.n()
            goto L_0x03d3
        L_0x03f1:
            int r4 = r33.q()
            if (r4 == r5) goto L_0x0408
            if (r4 == r2) goto L_0x0406
            if (r4 == r11) goto L_0x0404
            if (r4 == r8) goto L_0x0402
            if (r4 == r9) goto L_0x0400
            goto L_0x0408
        L_0x0400:
            r12 = r9
            goto L_0x03d3
        L_0x0402:
            r12 = r8
            goto L_0x03d3
        L_0x0404:
            r12 = r11
            goto L_0x03d3
        L_0x0406:
            r12 = r2
            goto L_0x03d3
        L_0x0408:
            r12 = r5
            goto L_0x03d3
        L_0x040a:
            java.lang.String r6 = r33.s()
            goto L_0x03d3
        L_0x040f:
            f2.g r2 = new f2.g
            r2.<init>(r6, r12, r3)
            java.lang.String r3 = "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove()."
            r1.a(r3)
            r6 = r2
            goto L_0x071a
        L_0x041c:
            j2.b$a r3 = i2.k.f4812a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r21 = r12
            r27 = r21
            r28 = r27
            r32 = r28
            r29 = r18
            r4 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r31 = 0
        L_0x043a:
            boolean r7 = r33.j()
            if (r7 == 0) goto L_0x0538
            j2.b$a r7 = i2.k.f4812a
            int r7 = r0.v(r7)
            switch(r7) {
                case 0: goto L_0x0532;
                case 1: goto L_0x04fc;
                case 2: goto L_0x04f6;
                case 3: goto L_0x04e8;
                case 4: goto L_0x04e2;
                case 5: goto L_0x04dc;
                case 6: goto L_0x04d6;
                case 7: goto L_0x04c9;
                case 8: goto L_0x04bc;
                case 9: goto L_0x04b3;
                case 10: goto L_0x04ae;
                case 11: goto L_0x0450;
                default: goto L_0x0449;
            }
        L_0x0449:
            r33.w()
            r33.x()
            goto L_0x043a
        L_0x0450:
            r33.a()
        L_0x0453:
            boolean r7 = r33.j()
            if (r7 == 0) goto L_0x049d
            r33.c()
            r7 = 0
            r8 = 0
        L_0x045e:
            boolean r9 = r33.j()
            if (r9 == 0) goto L_0x047f
            j2.b$a r9 = i2.k.f4814c
            int r9 = r0.v(r9)
            if (r9 == 0) goto L_0x047a
            if (r9 == r5) goto L_0x0475
            r33.w()
            r33.x()
            goto L_0x045e
        L_0x0475:
            e2.b r7 = k3.j.O(r0, r1, r5)
            goto L_0x045e
        L_0x047a:
            java.lang.String r8 = r33.s()
            goto L_0x045e
        L_0x047f:
            r33.g()
            boolean r9 = r8.equals(r15)
            if (r9 == 0) goto L_0x048b
            r31 = r7
            goto L_0x0453
        L_0x048b:
            boolean r9 = r8.equals(r10)
            if (r9 != 0) goto L_0x0497
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L_0x0453
        L_0x0497:
            r1.f8231n = r5
            r3.add(r7)
            goto L_0x0453
        L_0x049d:
            r33.d()
            int r7 = r3.size()
            if (r7 != r5) goto L_0x043a
            java.lang.Object r7 = r3.get(r12)
            r3.add(r7)
            goto L_0x043a
        L_0x04ae:
            boolean r32 = r33.n()
            goto L_0x043a
        L_0x04b3:
            double r7 = r33.o()
            float r7 = (float) r7
            r29 = r7
            goto L_0x043a
        L_0x04bc:
            int[] r7 = s.g.c(r11)
            int r8 = r33.q()
            int r8 = r8 - r5
            r28 = r7[r8]
            goto L_0x043a
        L_0x04c9:
            int[] r7 = s.g.c(r11)
            int r8 = r33.q()
            int r8 = r8 - r5
            r27 = r7[r8]
            goto L_0x043a
        L_0x04d6:
            e2.b r26 = k3.j.O(r0, r1, r5)
            goto L_0x043a
        L_0x04dc:
            e2.a r25 = k3.j.Q(r33, r34)
            goto L_0x043a
        L_0x04e2:
            e2.a r24 = k3.j.Q(r33, r34)
            goto L_0x043a
        L_0x04e8:
            int r7 = r33.q()
            if (r7 != r5) goto L_0x04f2
            r21 = r5
            goto L_0x043a
        L_0x04f2:
            r21 = r2
            goto L_0x043a
        L_0x04f6:
            e2.a r4 = k3.j.P(r33, r34)
            goto L_0x043a
        L_0x04fc:
            r33.c()
            r7 = -1
        L_0x0500:
            boolean r8 = r33.j()
            if (r8 == 0) goto L_0x052d
            j2.b$a r8 = i2.k.f4813b
            int r8 = r0.v(r8)
            if (r8 == 0) goto L_0x0528
            if (r8 == r5) goto L_0x0517
            r33.w()
            r33.x()
            goto L_0x0500
        L_0x0517:
            e2.a r8 = new e2.a
            y7.b0 r9 = new y7.b0
            r9.<init>(r7)
            java.util.ArrayList r9 = i2.o.a(r0, r1, r13, r9, r12)
            r8.<init>(r5, r9)
            r22 = r8
            goto L_0x0500
        L_0x0528:
            int r7 = r33.q()
            goto L_0x0500
        L_0x052d:
            r33.g()
            goto L_0x043a
        L_0x0532:
            java.lang.String r20 = r33.s()
            goto L_0x043a
        L_0x0538:
            if (r4 != 0) goto L_0x054f
            e2.a r1 = new e2.a
            l2.a r4 = new l2.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            r4.<init>(r5)
            java.util.List r4 = java.util.Collections.singletonList(r4)
            r1.<init>(r2, r4)
            r23 = r1
            goto L_0x0551
        L_0x054f:
            r23 = r4
        L_0x0551:
            f2.e r6 = new f2.e
            r19 = r6
            r30 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x071a
        L_0x055c:
            j2.b$a r3 = i2.a0.f4793a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = 0
        L_0x0564:
            boolean r4 = r33.j()
            if (r4 == 0) goto L_0x059b
            j2.b$a r4 = i2.a0.f4793a
            int r4 = r0.v(r4)
            if (r4 == 0) goto L_0x0596
            if (r4 == r5) goto L_0x0591
            if (r4 == r2) goto L_0x057a
            r33.x()
            goto L_0x0564
        L_0x057a:
            r33.a()
        L_0x057d:
            boolean r4 = r33.j()
            if (r4 == 0) goto L_0x058d
            f2.b r4 = a(r33, r34)
            if (r4 == 0) goto L_0x057d
            r3.add(r4)
            goto L_0x057d
        L_0x058d:
            r33.d()
            goto L_0x0564
        L_0x0591:
            boolean r12 = r33.n()
            goto L_0x0564
        L_0x0596:
            java.lang.String r6 = r33.s()
            goto L_0x0564
        L_0x059b:
            f2.l r1 = new f2.l
            r1.<init>(r6, r3, r12)
        L_0x05a0:
            r6 = r1
            goto L_0x071a
        L_0x05a3:
            j2.b$a r3 = i2.j.f4810a
            android.graphics.Path$FillType r3 = android.graphics.Path.FillType.WINDING
            r21 = r3
            r20 = r12
            r26 = r20
            r6 = 0
            r19 = 0
            r22 = 0
            r24 = 0
            r25 = 0
        L_0x05b6:
            boolean r3 = r33.j()
            if (r3 == 0) goto L_0x0634
            j2.b$a r3 = i2.j.f4810a
            int r3 = r0.v(r3)
            switch(r3) {
                case 0: goto L_0x062f;
                case 1: goto L_0x05fa;
                case 2: goto L_0x05f5;
                case 3: goto L_0x05e9;
                case 4: goto L_0x05e4;
                case 5: goto L_0x05df;
                case 6: goto L_0x05d1;
                case 7: goto L_0x05cc;
                default: goto L_0x05c5;
            }
        L_0x05c5:
            r33.w()
            r33.x()
            goto L_0x05b6
        L_0x05cc:
            boolean r26 = r33.n()
            goto L_0x05b6
        L_0x05d1:
            int r3 = r33.q()
            if (r3 != r5) goto L_0x05da
            android.graphics.Path$FillType r3 = android.graphics.Path.FillType.WINDING
            goto L_0x05dc
        L_0x05da:
            android.graphics.Path$FillType r3 = android.graphics.Path.FillType.EVEN_ODD
        L_0x05dc:
            r21 = r3
            goto L_0x05b6
        L_0x05df:
            e2.a r25 = k3.j.Q(r33, r34)
            goto L_0x05b6
        L_0x05e4:
            e2.a r24 = k3.j.Q(r33, r34)
            goto L_0x05b6
        L_0x05e9:
            int r3 = r33.q()
            if (r3 != r5) goto L_0x05f2
            r20 = r5
            goto L_0x05b6
        L_0x05f2:
            r20 = r2
            goto L_0x05b6
        L_0x05f5:
            e2.a r6 = k3.j.P(r33, r34)
            goto L_0x05b6
        L_0x05fa:
            r33.c()
            r3 = -1
        L_0x05fe:
            boolean r4 = r33.j()
            if (r4 == 0) goto L_0x062b
            j2.b$a r4 = i2.j.f4811b
            int r4 = r0.v(r4)
            if (r4 == 0) goto L_0x0626
            if (r4 == r5) goto L_0x0615
            r33.w()
            r33.x()
            goto L_0x05fe
        L_0x0615:
            e2.a r4 = new e2.a
            y7.b0 r7 = new y7.b0
            r7.<init>(r3)
            java.util.ArrayList r7 = i2.o.a(r0, r1, r13, r7, r12)
            r4.<init>(r5, r7)
            r22 = r4
            goto L_0x05fe
        L_0x0626:
            int r3 = r33.q()
            goto L_0x05fe
        L_0x062b:
            r33.g()
            goto L_0x05b6
        L_0x062f:
            java.lang.String r19 = r33.s()
            goto L_0x05b6
        L_0x0634:
            if (r6 != 0) goto L_0x064b
            e2.a r1 = new e2.a
            l2.a r3 = new l2.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r3.<init>(r4)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r1.<init>(r2, r3)
            r23 = r1
            goto L_0x064d
        L_0x064b:
            r23 = r6
        L_0x064d:
            f2.d r6 = new f2.d
            r18 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x071a
        L_0x0656:
            j2.b$a r3 = i2.z.f4838a
            r3 = r5
            r17 = r12
            r21 = r17
            r6 = 0
            r16 = 0
            r19 = 0
        L_0x0662:
            boolean r4 = r33.j()
            if (r4 == 0) goto L_0x069f
            j2.b$a r4 = i2.z.f4838a
            int r4 = r0.v(r4)
            if (r4 == 0) goto L_0x069a
            if (r4 == r5) goto L_0x0695
            if (r4 == r2) goto L_0x0690
            if (r4 == r11) goto L_0x068b
            if (r4 == r8) goto L_0x0686
            if (r4 == r9) goto L_0x0681
            r33.w()
            r33.x()
            goto L_0x0662
        L_0x0681:
            boolean r21 = r33.n()
            goto L_0x0662
        L_0x0686:
            int r3 = r33.q()
            goto L_0x0662
        L_0x068b:
            boolean r17 = r33.n()
            goto L_0x0662
        L_0x0690:
            e2.a r6 = k3.j.P(r33, r34)
            goto L_0x0662
        L_0x0695:
            e2.a r19 = k3.j.N(r33, r34)
            goto L_0x0662
        L_0x069a:
            java.lang.String r16 = r33.s()
            goto L_0x0662
        L_0x069f:
            if (r6 != 0) goto L_0x06b3
            e2.a r6 = new e2.a
            l2.a r1 = new l2.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r1.<init>(r4)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r6.<init>(r2, r1)
        L_0x06b3:
            r20 = r6
            if (r3 != r5) goto L_0x06ba
            android.graphics.Path$FillType r1 = android.graphics.Path.FillType.WINDING
            goto L_0x06bc
        L_0x06ba:
            android.graphics.Path$FillType r1 = android.graphics.Path.FillType.EVEN_ODD
        L_0x06bc:
            r18 = r1
            f2.k r6 = new f2.k
            r15 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21)
            goto L_0x071a
        L_0x06c5:
            j2.b$a r4 = i2.d.f4801a
            if (r3 != r11) goto L_0x06cb
            r3 = r5
            goto L_0x06cc
        L_0x06cb:
            r3 = r12
        L_0x06cc:
            r21 = r3
            r22 = r12
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x06d6:
            boolean r3 = r33.j()
            if (r3 == 0) goto L_0x0713
            j2.b$a r3 = i2.d.f4801a
            int r3 = r0.v(r3)
            if (r3 == 0) goto L_0x070e
            if (r3 == r5) goto L_0x0709
            if (r3 == r2) goto L_0x0704
            if (r3 == r11) goto L_0x06ff
            if (r3 == r8) goto L_0x06f3
            r33.w()
            r33.x()
            goto L_0x06d6
        L_0x06f3:
            int r3 = r33.q()
            if (r3 != r11) goto L_0x06fc
            r21 = r5
            goto L_0x06d6
        L_0x06fc:
            r21 = r12
            goto L_0x06d6
        L_0x06ff:
            boolean r22 = r33.n()
            goto L_0x06d6
        L_0x0704:
            e2.a r20 = k3.j.Q(r33, r34)
            goto L_0x06d6
        L_0x0709:
            e2.e r19 = i2.a.b(r33, r34)
            goto L_0x06d6
        L_0x070e:
            java.lang.String r18 = r33.s()
            goto L_0x06d6
        L_0x0713:
            f2.a r6 = new f2.a
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22)
        L_0x071a:
            boolean r1 = r33.j()
            if (r1 == 0) goto L_0x0724
            r33.x()
            goto L_0x071a
        L_0x0724:
            r33.g()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.e.a(j2.c, y1.f):f2.b");
    }
}
