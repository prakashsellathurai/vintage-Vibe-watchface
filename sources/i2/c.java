package i2;

import j2.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final b.a f4797a = b.a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b  reason: collision with root package name */
    public static final b.a f4798b = b.a.a("k");

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r5 = k3.j.O(r0, r8, false);
        r3 = (java.util.List) r5.f4251b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r3.isEmpty() == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        r9 = r1;
        r16 = r5;
        r26 = r6;
        r27 = r7;
        r1 = new l2.a(r29, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), (android.view.animation.Interpolator) null, 0.0f, java.lang.Float.valueOf(r8.f8229l));
        r3.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0098, code lost:
        r12 = r3;
        r16 = r5;
        r26 = r6;
        r27 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a7, code lost:
        if (((l2.a) r12.get(0)).f5269b != null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a9, code lost:
        r12.set(0, new l2.a(r29, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), (android.view.animation.Interpolator) null, 0.0f, java.lang.Float.valueOf(r8.f8229l)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c4, code lost:
        r1 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c6, code lost:
        r6 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0105, code lost:
        r7 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b2, code lost:
        if ((r0.f5285a == 1.0f && r0.f5286b == 1.0f) != false) goto L_0x01b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e2.d a(j2.c r28, y1.f r29) {
        /*
            r0 = r28
            r8 = r29
            int r1 = r28.t()
            r2 = 3
            r10 = 0
            if (r1 != r2) goto L_0x000e
            r11 = 1
            goto L_0x000f
        L_0x000e:
            r11 = r10
        L_0x000f:
            if (r11 == 0) goto L_0x0014
            r28.c()
        L_0x0014:
            r1 = 0
            r6 = 0
            r7 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r21 = 0
            r22 = 0
            r23 = 0
        L_0x0020:
            boolean r2 = r28.j()
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r2 == 0) goto L_0x0109
            j2.b$a r2 = f4797a
            int r2 = r0.v(r2)
            switch(r2) {
                case 0: goto L_0x00e0;
                case 1: goto L_0x00d8;
                case 2: goto L_0x00c9;
                case 3: goto L_0x0056;
                case 4: goto L_0x005b;
                case 5: goto L_0x0051;
                case 6: goto L_0x004c;
                case 7: goto L_0x0047;
                case 8: goto L_0x0042;
                case 9: goto L_0x003d;
                default: goto L_0x0032;
            }
        L_0x0032:
            r26 = r6
            r27 = r7
            r28.w()
            r28.x()
            goto L_0x0020
        L_0x003d:
            e2.b r13 = k3.j.O(r0, r8, r10)
            goto L_0x0020
        L_0x0042:
            e2.b r14 = k3.j.O(r0, r8, r10)
            goto L_0x0020
        L_0x0047:
            e2.b r23 = k3.j.O(r0, r8, r10)
            goto L_0x0020
        L_0x004c:
            e2.b r22 = k3.j.O(r0, r8, r10)
            goto L_0x0020
        L_0x0051:
            e2.a r21 = k3.j.P(r28, r29)
            goto L_0x0020
        L_0x0056:
            java.lang.String r1 = "Lottie doesn't support 3D layers."
            r8.a(r1)
        L_0x005b:
            e2.b r5 = k3.j.O(r0, r8, r10)
            java.util.Collection r1 = r5.f4251b
            r3 = r1
            java.util.List r3 = (java.util.List) r3
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x0098
            l2.a r2 = new l2.a
            java.lang.Float r16 = java.lang.Float.valueOf(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r17 = 0
            r18 = 0
            float r1 = r8.f8229l
            java.lang.Float r19 = java.lang.Float.valueOf(r1)
            r1 = r2
            r9 = r2
            r2 = r29
            r12 = r3
            r3 = r16
            r16 = r5
            r5 = r17
            r26 = r6
            r6 = r18
            r27 = r7
            r7 = r19
            r1.<init>((y1.f) r2, r3, r4, (android.view.animation.Interpolator) r5, (float) r6, (java.lang.Float) r7)
            r12.add(r9)
            goto L_0x00c4
        L_0x0098:
            r12 = r3
            r16 = r5
            r26 = r6
            r27 = r7
            java.lang.Object r1 = r12.get(r10)
            l2.a r1 = (l2.a) r1
            T r1 = r1.f5269b
            if (r1 != 0) goto L_0x00c4
            l2.a r9 = new l2.a
            java.lang.Float r3 = java.lang.Float.valueOf(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r5 = 0
            r6 = 0
            float r1 = r8.f8229l
            java.lang.Float r7 = java.lang.Float.valueOf(r1)
            r1 = r9
            r2 = r29
            r1.<init>((y1.f) r2, r3, r4, (android.view.animation.Interpolator) r5, (float) r6, (java.lang.Float) r7)
            r12.set(r10, r9)
        L_0x00c4:
            r1 = r16
        L_0x00c6:
            r6 = r26
            goto L_0x0105
        L_0x00c9:
            r27 = r7
            e2.a r6 = new e2.a
            i2.x r2 = i2.x.f4835a
            java.util.ArrayList r2 = i2.o.a(r0, r8, r3, r2, r10)
            r3 = 4
            r6.<init>(r3, r2)
            goto L_0x0105
        L_0x00d8:
            r26 = r6
            e2.e r7 = i2.a.b(r28, r29)
            goto L_0x0020
        L_0x00e0:
            r26 = r6
            r27 = r7
            r28.c()
        L_0x00e7:
            boolean r2 = r28.j()
            if (r2 == 0) goto L_0x0101
            j2.b$a r2 = f4798b
            int r2 = r0.v(r2)
            if (r2 == 0) goto L_0x00fc
            r28.w()
            r28.x()
            goto L_0x00e7
        L_0x00fc:
            a2.b r15 = i2.a.a(r28, r29)
            goto L_0x00e7
        L_0x0101:
            r28.g()
            goto L_0x00c6
        L_0x0105:
            r7 = r27
            goto L_0x0020
        L_0x0109:
            r26 = r6
            r27 = r7
            if (r11 == 0) goto L_0x0112
            r28.g()
        L_0x0112:
            if (r15 == 0) goto L_0x012f
            boolean r0 = r15.c()
            if (r0 == 0) goto L_0x012d
            java.util.List r0 = r15.f66a
            java.lang.Object r0 = r0.get(r10)
            l2.a r0 = (l2.a) r0
            T r0 = r0.f5269b
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            boolean r0 = r0.equals(r4, r4)
            if (r0 == 0) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r0 = r10
            goto L_0x0130
        L_0x012f:
            r0 = 1
        L_0x0130:
            if (r0 == 0) goto L_0x0137
            r7 = r27
            r17 = 0
            goto L_0x013b
        L_0x0137:
            r17 = r15
            r7 = r27
        L_0x013b:
            if (r7 == 0) goto L_0x015e
            boolean r0 = r7 instanceof e2.c
            if (r0 != 0) goto L_0x015c
            boolean r0 = r7.c()
            if (r0 == 0) goto L_0x015c
            java.util.List r0 = r7.b()
            java.lang.Object r0 = r0.get(r10)
            l2.a r0 = (l2.a) r0
            T r0 = r0.f5269b
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            boolean r0 = r0.equals(r4, r4)
            if (r0 == 0) goto L_0x015c
            goto L_0x015e
        L_0x015c:
            r0 = r10
            goto L_0x015f
        L_0x015e:
            r0 = 1
        L_0x015f:
            if (r0 == 0) goto L_0x0164
            r18 = 0
            goto L_0x0166
        L_0x0164:
            r18 = r7
        L_0x0166:
            if (r1 == 0) goto L_0x0187
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x0185
            java.util.Collection r0 = r1.f4251b
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r10)
            l2.a r0 = (l2.a) r0
            T r0 = r0.f5269b
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0185
            goto L_0x0187
        L_0x0185:
            r0 = r10
            goto L_0x0188
        L_0x0187:
            r0 = 1
        L_0x0188:
            r6 = r26
            if (r0 == 0) goto L_0x018d
            r1 = 0
        L_0x018d:
            if (r6 == 0) goto L_0x01b7
            boolean r0 = r6.c()
            if (r0 == 0) goto L_0x01b5
            java.util.Collection r0 = r6.f4251b
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r10)
            l2.a r0 = (l2.a) r0
            T r0 = r0.f5269b
            l2.c r0 = (l2.c) r0
            float r2 = r0.f5285a
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x01b1
            float r0 = r0.f5286b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x01b1
            r0 = 1
            goto L_0x01b2
        L_0x01b1:
            r0 = r10
        L_0x01b2:
            if (r0 == 0) goto L_0x01b5
            goto L_0x01b7
        L_0x01b5:
            r0 = r10
            goto L_0x01b8
        L_0x01b7:
            r0 = 1
        L_0x01b8:
            if (r0 == 0) goto L_0x01bd
            r19 = 0
            goto L_0x01bf
        L_0x01bd:
            r19 = r6
        L_0x01bf:
            if (r14 == 0) goto L_0x01e0
            boolean r0 = r14.c()
            if (r0 == 0) goto L_0x01de
            java.util.Collection r0 = r14.f4251b
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r10)
            l2.a r0 = (l2.a) r0
            T r0 = r0.f5269b
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x01de
            goto L_0x01e0
        L_0x01de:
            r0 = r10
            goto L_0x01e1
        L_0x01e0:
            r0 = 1
        L_0x01e1:
            if (r0 == 0) goto L_0x01e4
            r14 = 0
        L_0x01e4:
            if (r13 == 0) goto L_0x0205
            boolean r0 = r13.c()
            if (r0 == 0) goto L_0x0203
            java.util.Collection r0 = r13.f4251b
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r10)
            l2.a r0 = (l2.a) r0
            T r0 = r0.f5269b
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0203
            goto L_0x0205
        L_0x0203:
            r9 = r10
            goto L_0x0206
        L_0x0205:
            r9 = 1
        L_0x0206:
            if (r9 == 0) goto L_0x020b
            r25 = 0
            goto L_0x020d
        L_0x020b:
            r25 = r13
        L_0x020d:
            e2.d r0 = new e2.d
            r16 = r0
            r20 = r1
            r24 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.c.a(j2.c, y1.f):e2.d");
    }
}
