package com.samsung.android.wearable.watchfacestudio.editor;

import java.util.function.Consumer;

public final /* synthetic */ class r implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3905a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3906b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3907c;

    public /* synthetic */ r(Object obj, int i8, Object obj2) {
        this.f3905a = i8;
        this.f3906b = obj;
        this.f3907c = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: t6.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: t6.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: t6.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: t6.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: t6.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: t6.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: t6.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: t6.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: t6.e} */
    /* JADX WARNING: type inference failed for: r5v24, types: [t6.c, t6.j] */
    /* JADX WARNING: type inference failed for: r6v51, types: [t6.h, t6.j, t6.g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            int r2 = r0.f3905a
            r3 = 2
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            r6 = 4
            r7 = 0
            r8 = 0
            r9 = 1
            java.lang.Object r10 = r0.f3907c
            java.lang.Object r0 = r0.f3906b
            switch(r2) {
                case 0: goto L_0x03aa;
                case 1: goto L_0x0367;
                case 2: goto L_0x032d;
                case 3: goto L_0x02ee;
                case 4: goto L_0x02e2;
                case 5: goto L_0x002d;
                case 6: goto L_0x0021;
                case 7: goto L_0x0015;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x048e
        L_0x0015:
            r5.e r0 = (r5.e) r0
            x6.h r10 = (x6.h) r10
            r1 = r20
            i6.e r1 = (i6.e) r1
            s5.d0.a(r0, r1, r10)
            return
        L_0x0021:
            r5.e r0 = (r5.e) r0
            v6.b r10 = (v6.b) r10
            r1 = r20
            i6.e r1 = (i6.e) r1
            s5.u.f(r0, r1, r10)
            return
        L_0x002d:
            r5.e r0 = (r5.e) r0
            r6.a r10 = (r6.a) r10
            r2 = r20
            i6.e r2 = (i6.e) r2
            java.lang.String r4 = r2.f4862a
            r11 = 6
            int r4 = b6.a.A(r4)     // Catch:{ IllegalArgumentException -> 0x003d }
            goto L_0x003e
        L_0x003d:
            r4 = r11
        L_0x003e:
            if (r4 == r11) goto L_0x0042
            r4 = r9
            goto L_0x0043
        L_0x0042:
            r4 = r7
        L_0x0043:
            if (r4 == 0) goto L_0x02de
            java.util.Objects.requireNonNull(r10)
            s5.x r13 = new s5.x
            r13.<init>(r10, r7)
            java.lang.String r4 = r2.f4862a
            int r11 = b6.a.A(r4)     // Catch:{ IllegalArgumentException -> 0x0053 }
        L_0x0053:
            int r4 = s.g.b(r11)
            r11 = 3
            if (r4 == 0) goto L_0x0182
            if (r4 == r9) goto L_0x0165
            if (r4 == r3) goto L_0x00ec
            if (r4 == r11) goto L_0x00c8
            if (r4 == r6) goto L_0x006b
            java.lang.String r4 = "DWF:PartDrawFactory"
            java.lang.String r6 = "Unsupported shape for PartDraw "
            android.util.Log.e(r4, r6)
            goto L_0x01c0
        L_0x006b:
            java.lang.String r4 = "cornerRadiusX"
            i6.a r4 = r2.b(r4)
            float r4 = r4.b(r8)
            java.lang.String r5 = "cornerRadiusY"
            i6.a r5 = r2.b(r5)
            float r5 = r5.b(r8)
            t6.h r6 = new t6.h
            r6.<init>(r13)
            android.graphics.RectF r12 = s5.y.b(r2)
            r6.d(r12)
            android.graphics.PointF r12 = new android.graphics.PointF
            r12.<init>(r4, r5)
            e7.i r4 = r6.f7525d
            t6.i$a r5 = t6.i.a.CORNER_RADIUS_X
            w5.f r13 = new w5.f
            float r14 = r12.x
            r13.<init>((float) r14)
            r4.d(r5, r13)
            e7.i r4 = r6.f7525d
            t6.i$a r5 = t6.i.a.CORNER_RADIUS_Y
            w5.f r13 = new w5.f
            float r12 = r12.y
            r13.<init>((float) r12)
            r4.d(r5, r13)
            java.util.function.Function[] r4 = new java.util.function.Function[r3]
            com.samsung.android.wearable.watchfacestudio.editor.p r5 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r12 = 16
            r5.<init>(r12)
            r4[r7] = r5
            com.samsung.android.wearable.watchfacestudio.editor.p r5 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r12 = 17
            r5.<init>(r12)
            r4[r9] = r5
            e7.k r5 = r6.f7522a
            s5.y.a(r0, r10, r2, r5, r4)
            r5 = r6
            goto L_0x01c0
        L_0x00c8:
            t6.c r5 = new t6.c
            android.graphics.RectF r4 = s5.y.b(r2)
            r5.<init>(r13, r4)
            java.util.function.Function[] r4 = new java.util.function.Function[r3]
            com.samsung.android.wearable.watchfacestudio.editor.p r6 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r12 = 20
            r6.<init>(r12)
            r4[r7] = r6
            com.samsung.android.wearable.watchfacestudio.editor.p r6 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r12 = 21
            r6.<init>(r12)
            r4[r9] = r6
            e7.k r6 = r5.f7522a
            s5.y.a(r0, r10, r2, r6, r4)
            goto L_0x01c0
        L_0x00ec:
            java.lang.String r4 = "centerX"
            i6.a r4 = r2.b(r4)
            float r4 = r4.b(r8)
            java.lang.String r5 = "centerY"
            i6.a r5 = r2.b(r5)
            float r5 = r5.b(r8)
            java.lang.String r6 = "width"
            i6.a r6 = r2.b(r6)
            float r6 = r6.b(r8)
            java.lang.String r12 = "height"
            i6.a r12 = r2.b(r12)
            float r12 = r12.b(r8)
            java.lang.String r14 = "startAngle"
            i6.a r14 = r2.b(r14)
            float r16 = r14.b(r8)
            java.lang.String r14 = "endAngle"
            i6.a r14 = r2.b(r14)
            float r17 = r14.b(r8)
            java.lang.String r14 = "direction"
            i6.a r14 = r2.b(r14)
            java.lang.String r15 = "CLOCKWISE"
            java.lang.String r14 = r14.e(r15)
            t6.a r1 = new t6.a
            android.graphics.PointF r11 = new android.graphics.PointF
            r11.<init>(r4, r5)
            android.util.SizeF r4 = new android.util.SizeF
            r4.<init>(r6, r12)
            boolean r18 = r15.equals(r14)
            r12 = r1
            r14 = r11
            r15 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
            java.util.function.Function[] r4 = new java.util.function.Function[r3]
            com.samsung.android.wearable.watchfacestudio.editor.p r5 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r6 = 18
            r5.<init>(r6)
            r4[r7] = r5
            com.samsung.android.wearable.watchfacestudio.editor.p r5 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r6 = 19
            r5.<init>(r6)
            r4[r9] = r5
            e7.k r5 = r1.f7522a
            s5.y.a(r0, r10, r2, r5, r4)
            r5 = r1
            goto L_0x01c0
        L_0x0165:
            t6.g r5 = new t6.g
            r5.<init>(r13)
            android.graphics.RectF r1 = s5.y.b(r2)
            r5.d(r1)
            java.util.function.Function[] r1 = new java.util.function.Function[r9]
            com.samsung.android.wearable.watchfacestudio.editor.p r4 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r6 = 15
            r4.<init>(r6)
            r1[r7] = r4
            e7.k r4 = r5.f7522a
            s5.y.a(r0, r10, r2, r4, r1)
            goto L_0x01c0
        L_0x0182:
            java.lang.String r1 = "startX"
            i6.a r1 = r2.b(r1)
            float r14 = r1.b(r8)
            java.lang.String r1 = "startY"
            i6.a r1 = r2.b(r1)
            float r15 = r1.b(r8)
            java.lang.String r1 = "endX"
            i6.a r1 = r2.b(r1)
            float r16 = r1.b(r8)
            java.lang.String r1 = "endY"
            i6.a r1 = r2.b(r1)
            float r17 = r1.b(r8)
            t6.e r5 = new t6.e
            r12 = r5
            r12.<init>(r13, r14, r15, r16, r17)
            java.util.function.Function[] r1 = new java.util.function.Function[r9]
            com.samsung.android.wearable.watchfacestudio.editor.p r4 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r6 = 14
            r4.<init>(r6)
            r1[r7] = r4
            e7.k r4 = r5.f7522a
            s5.y.a(r0, r10, r2, r4, r1)
        L_0x01c0:
            if (r5 == 0) goto L_0x02e1
            java.util.ArrayList r1 = r2.f4863b
            java.util.Iterator r1 = r1.iterator()
        L_0x01c8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02d8
            java.lang.Object r2 = r1.next()
            i6.e r2 = (i6.e) r2
            java.lang.String r4 = r2.f4862a
            r4.getClass()
            java.lang.String r6 = "Stroke"
            boolean r6 = r4.equals(r6)
            java.util.ArrayList r11 = r2.f4863b
            java.lang.String r12 = "#FFFFFF"
            java.lang.String r13 = "color"
            if (r6 != 0) goto L_0x0231
            java.lang.String r6 = "Fill"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x01f1
            r14 = 3
            goto L_0x01c8
        L_0x01f1:
            u6.a r4 = new u6.a
            s5.x r6 = new s5.x
            r6.<init>(r10, r3)
            r4.<init>(r6)
            i6.a r2 = r2.b(r13)
            java.lang.String r2 = r2.e(r12)
            v5.b r6 = r0.f7077h
            r5.f r12 = new r5.f
            r14 = 3
            r12.<init>(r14, r4)
            r13 = -1
            android.graphics.Color r15 = android.graphics.Color.valueOf(r13)
            android.graphics.Color r2 = n6.b.a(r2, r6, r12, r10)
            if (r2 != 0) goto L_0x0217
            goto L_0x0218
        L_0x0217:
            r15 = r2
        L_0x0218:
            r4.b(r15)
            s6.a r2 = s5.y.c(r0, r10, r11)
            if (r2 == 0) goto L_0x022e
            r4.f7812c = r2
            u6.d$a r6 = r4.e
            r2.f7257d = r6
            android.graphics.Paint r6 = r4.f7810a
            android.graphics.Shader r2 = r2.f7254a
            r6.setShader(r2)
        L_0x022e:
            r5.f7524c = r4
            goto L_0x01c8
        L_0x0231:
            r14 = 3
            u6.b r4 = new u6.b
            s5.x r6 = new s5.x
            r6.<init>(r10, r9)
            r4.<init>(r6)
            java.lang.String r6 = "thickness"
            i6.a r6 = r2.b(r6)
            float r6 = r6.b(r8)
            u6.c$a r15 = u6.c.a.f7806h
            w5.f r14 = new w5.f
            r14.<init>((float) r6)
            u6.c r7 = r4.f7804f
            r7.d(r15, r14)
            android.graphics.Paint r7 = r4.f7810a
            r7.setStrokeWidth(r6)
            java.lang.String r6 = "cap"
            i6.a r6 = r2.b(r6)
            java.lang.String r14 = "BUTT"
            java.lang.String r6 = r6.e(r14)
            android.graphics.Paint$Cap r6 = android.graphics.Paint.Cap.valueOf(r6)
            r7.setStrokeCap(r6)
            i6.a r6 = r2.b(r13)
            java.lang.String r6 = r6.e(r12)
            v5.b r12 = r0.f7077h
            r5.f r13 = new r5.f
            r13.<init>(r3, r4)
            r14 = -1
            android.graphics.Color r15 = android.graphics.Color.valueOf(r14)
            android.graphics.Color r6 = n6.b.a(r6, r12, r13, r10)
            if (r6 != 0) goto L_0x0285
            goto L_0x0286
        L_0x0285:
            r15 = r6
        L_0x0286:
            r4.b(r15)
            java.lang.String r6 = "dashIntervals"
            boolean r12 = r2.c(r6)
            if (r12 == 0) goto L_0x02b1
            i6.a r6 = r2.b(r6)
            java.lang.String r12 = ""
            java.lang.String r6 = r6.e(r12)
            java.lang.String r12 = "dashPhase"
            i6.a r12 = r2.b(r12)
            float r12 = r12.b(r8)
            float[] r6 = s5.y.d(r6)
            android.graphics.DashPathEffect r13 = new android.graphics.DashPathEffect
            r13.<init>(r6, r12)
            r7.setPathEffect(r13)
        L_0x02b1:
            java.util.function.Function[] r6 = new java.util.function.Function[r9]
            com.samsung.android.wearable.watchfacestudio.editor.p r12 = new com.samsung.android.wearable.watchfacestudio.editor.p
            r13 = 13
            r12.<init>(r13)
            r13 = 0
            r6[r13] = r12
            e7.k r12 = r4.f7805g
            s5.y.a(r0, r10, r2, r12, r6)
            s6.a r2 = s5.y.c(r0, r10, r11)
            if (r2 == 0) goto L_0x02d3
            r4.f7812c = r2
            u6.d$a r6 = r4.e
            r2.f7257d = r6
            android.graphics.Shader r2 = r2.f7254a
            r7.setShader(r2)
        L_0x02d3:
            r5.f7523b = r4
            r7 = 0
            goto L_0x01c8
        L_0x02d8:
            java.util.ArrayList r0 = r10.F
            r0.add(r5)
            goto L_0x02e1
        L_0x02de:
            s5.u.f(r0, r2, r10)
        L_0x02e1:
            return
        L_0x02e2:
            r5.e r0 = (r5.e) r0
            v6.a r10 = (v6.a) r10
            r1 = r20
            i6.e r1 = (i6.e) r1
            s5.u.f(r0, r1, r10)
            return
        L_0x02ee:
            s5.i r0 = (s5.i) r0
            w5.f r10 = (w5.f) r10
            r1 = r20
            o6.q r1 = (o6.q) r1
            r0.getClass()
            java.util.ArrayList r2 = r1.f6176d
            i5.j r3 = new i5.j
            r3.<init>(r6)
            r2.forEach(r3)
            java.util.ArrayList r2 = r1.f6176d
            r2.clear()
            java.lang.String r3 = r10.h()
            r0.a(r1, r3)
            java.util.stream.Stream r1 = r2.stream()
            com.samsung.android.wearable.watchfacestudio.editor.q r2 = new com.samsung.android.wearable.watchfacestudio.editor.q
            r2.<init>(r6)
            java.util.stream.Stream r1 = r1.filter(r2)
            i5.j r2 = new i5.j
            r3 = 5
            r2.<init>(r3)
            r1.forEach(r2)
            r5.e r0 = r0.f7233b
            r5.d r0 = r0.f7074d
            r0.c()
            return
        L_0x032d:
            i6.b r0 = (i6.b) r0
            java.lang.String r10 = (java.lang.String) r10
            r1 = r20
            x5.b$a r1 = (x5.b.a) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "COMPLICATION."
            r2.<init>(r3)
            java.lang.String r4 = r1.toString()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = r0.e()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            r5.append(r10)
            java.lang.String r3 = "."
            r5.append(r3)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r1 = r4.replace(r2, r1)
            r0.f(r1)
            return
        L_0x0367:
            com.samsung.android.wearable.watchfacestudio.editor.w r0 = (com.samsung.android.wearable.watchfacestudio.editor.w) r0
            java.util.List r10 = (java.util.List) r10
            r1 = r20
            b6.c r1 = (b6.c) r1
            com.samsung.android.wearable.watchfacestudio.editor.EditorActivity r0 = r0.f3929a0
            java.util.ArrayList<android.graphics.Color> r2 = r1.e
            int r2 = r2.size()
            if (r2 >= r3) goto L_0x039a
            n5.b r0 = new n5.b
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.util.ArrayList<android.graphics.Color> r1 = r1.e
            r3 = 0
            java.lang.Object r1 = r1.get(r3)
            android.graphics.Color r1 = (android.graphics.Color) r1
            int r1 = r1.toArgb()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r3] = r1
            java.lang.String r1 = "#%08X"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            goto L_0x03a6
        L_0x039a:
            n5.c r2 = new n5.c
            android.graphics.drawable.Icon r1 = r1.f2614d
            android.graphics.drawable.Drawable r0 = r1.loadDrawable(r0)
            r2.<init>(r0)
            r0 = r2
        L_0x03a6:
            r10.add(r0)
            return
        L_0x03aa:
            r3 = r7
            com.samsung.android.wearable.watchfacestudio.editor.w r0 = (com.samsung.android.wearable.watchfacestudio.editor.w) r0
            java.util.Map r10 = (java.util.Map) r10
            r1 = r20
            u1.m r1 = (u1.m) r1
            com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip r2 = r0.f3948v0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r7 = "themeColor"
            java.lang.Object r5 = r10.getOrDefault(r7, r5)
            b6.b r5 = (b6.b) r5
            if (r5 == 0) goto L_0x03ce
            java.util.ArrayList r5 = r5.f2608g
            com.samsung.android.wearable.watchfacestudio.editor.r r7 = new com.samsung.android.wearable.watchfacestudio.editor.r
            r7.<init>(r0, r9, r6)
            r5.forEach(r7)
        L_0x03ce:
            java.util.List<u1.m$h> r5 = r1.f7645f
            u1.e r7 = r0.f3939k0
            r7.getClass()
            java.util.Map<u1.m, u1.m$h> r7 = r7.f7613f
            java.lang.Object r7 = r7.get(r1)
            u1.m$h r7 = (u1.m.h) r7
            if (r7 != 0) goto L_0x03ea
            java.util.List<u1.m$h> r7 = r1.f7645f
            int r1 = r1.f7646g
            java.lang.Object r1 = r7.get(r1)
            r7 = r1
            u1.m$h r7 = (u1.m.h) r7
        L_0x03ea:
            int r1 = r5.indexOf(r7)
            r2.getClass()
            if (r1 < 0) goto L_0x047c
            int r5 = r6.size()
            if (r1 < r5) goto L_0x03fb
            goto L_0x047c
        L_0x03fb:
            int r5 = r6.size()
            r2.f3952s = r5
            java.util.ArrayList<n5.a> r5 = r2.f3953t
            r5.clear()
            r5.addAll(r6)
            r2.y = r1
            int r6 = r2.f3952s
            int r7 = r1 - r6
            int r1 = r1 + r6
            if (r7 >= 0) goto L_0x0413
            r7 = r3
        L_0x0413:
            int r3 = r5.size()
            if (r1 < r3) goto L_0x041f
            int r1 = r5.size()
            r3 = -1
            int r1 = r1 + r3
        L_0x041f:
            int r3 = r2.y
            int r3 = r3 - r7
            int r3 = java.lang.Math.abs(r3)
            androidx.constraintlayout.widget.ConstraintLayout r5 = r2.f3956x
            float r6 = r5.getRotation()
            float r3 = (float) r3
            r9 = 1093140480(0x41280000, float:10.5)
            float r3 = r3 * r9
            r10 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r10
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r3 = r3 / r10
            float r6 = r6 - r3
            r5.setRotation(r6)
        L_0x043d:
            if (r7 > r1) goto L_0x0483
            int r3 = r2.y
            int r6 = r3 + -4
            if (r7 == r6) goto L_0x044c
            int r3 = r3 + 4
            if (r7 != r3) goto L_0x044a
            goto L_0x044c
        L_0x044a:
            r15 = r4
            goto L_0x044d
        L_0x044c:
            r15 = r8
        L_0x044d:
            java.util.ArrayList<com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip$a> r3 = r2.f3954u
            int r6 = r3.size()
            float r6 = (float) r6
            r11 = -1054343168(0xffffffffc1280000, float:-10.5)
            float r6 = r6 * r11
            float r6 = r6 * r10
            int r6 = java.lang.Math.round(r6)
            float r6 = (float) r6
            float r14 = r6 / r10
            int r6 = r3.size()
            float r6 = (float) r6
            float r6 = r6 * r9
            r11 = 1119092736(0x42b40000, float:90.0)
            float r16 = r6 + r11
            float r6 = r5.getRotation()
            float r6 = -r6
            int r12 = r3.size()
            r11 = r2
            r13 = r7
            r17 = r6
            r11.h(r12, r13, r14, r15, r16, r17)
            int r7 = r7 + 1
            goto L_0x043d
        L_0x047c:
            java.lang.String r1 = "DWF:ColorChip"
            java.lang.String r2 = "invalid focusCnt"
            android.util.Log.e(r1, r2)
        L_0x0483:
            com.samsung.android.wearable.watchfacestudio.editor.widget.ColorChip r1 = r0.f3948v0
            com.samsung.android.wearable.watchfacestudio.editor.i r2 = new com.samsung.android.wearable.watchfacestudio.editor.i
            r2.<init>(r0)
            r1.addOnLayoutChangeListener(r2)
            return
        L_0x048e:
            r6.a r0 = (r6.a) r0
            android.graphics.Canvas r10 = (android.graphics.Canvas) r10
            r1 = r20
            t6.j r1 = (t6.j) r1
            android.graphics.Matrix r2 = r0.f6139m
            r10.setMatrix(r2)
            android.graphics.ColorMatrix r2 = r0.f6140n
            u6.b r3 = r1.f7523b
            if (r3 == 0) goto L_0x04ab
            android.graphics.Paint r3 = r3.f7810a
            android.graphics.ColorMatrixColorFilter r5 = new android.graphics.ColorMatrixColorFilter
            r5.<init>(r2)
            r3.setColorFilter(r5)
        L_0x04ab:
            u6.a r3 = r1.f7524c
            if (r3 == 0) goto L_0x04b9
            android.graphics.Paint r3 = r3.f7810a
            android.graphics.ColorMatrixColorFilter r5 = new android.graphics.ColorMatrixColorFilter
            r5.<init>(r2)
            r3.setColorFilter(r5)
        L_0x04b9:
            boolean r2 = r0.f6148x
            if (r2 == 0) goto L_0x04bf
            r2 = r4
            goto L_0x04c6
        L_0x04bf:
            float r2 = r0.C()
            r3 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 / r3
        L_0x04c6:
            u6.b r3 = r1.f7523b
            if (r3 == 0) goto L_0x04db
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x04db
            android.graphics.Paint r5 = r3.f7810a
            int r3 = r3.f7813d
            float r3 = (float) r3
            float r3 = r3 * r2
            int r3 = java.lang.Math.round(r3)
            r5.setAlpha(r3)
        L_0x04db:
            u6.a r3 = r1.f7524c
            if (r3 == 0) goto L_0x04f0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x04f0
            android.graphics.Paint r4 = r3.f7810a
            int r3 = r3.f7813d
            float r3 = (float) r3
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)
            r4.setAlpha(r2)
        L_0x04f0:
            android.graphics.PointF r0 = r0.B()
            r1.f7526f = r0
            u6.b r2 = r1.f7523b
            if (r2 == 0) goto L_0x050f
            s6.a r2 = r2.f7812c
            if (r2 == 0) goto L_0x050f
            r2.f7258f = r0
            s6.b r3 = r2.f7257d
            if (r3 == 0) goto L_0x050f
            android.graphics.Shader r2 = r2.f7254a
            u6.d$a r3 = (u6.d.a) r3
            u6.d r3 = u6.d.this
            android.graphics.Paint r3 = r3.f7810a
            r3.setShader(r2)
        L_0x050f:
            u6.a r2 = r1.f7524c
            if (r2 == 0) goto L_0x0528
            s6.a r2 = r2.f7812c
            if (r2 == 0) goto L_0x0528
            r2.f7258f = r0
            s6.b r0 = r2.f7257d
            if (r0 == 0) goto L_0x0528
            android.graphics.Shader r2 = r2.f7254a
            u6.d$a r0 = (u6.d.a) r0
            u6.d r0 = u6.d.this
            android.graphics.Paint r0 = r0.f7810a
            r0.setShader(r2)
        L_0x0528:
            u6.a r0 = r1.f7524c
            if (r0 == 0) goto L_0x0531
            android.graphics.Paint r0 = r0.f7810a
            r1.c(r10, r0)
        L_0x0531:
            u6.b r0 = r1.f7523b
            if (r0 == 0) goto L_0x053a
            android.graphics.Paint r0 = r0.f7810a
            r1.c(r10, r0)
        L_0x053a:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r10.setMatrix(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.wearable.watchfacestudio.editor.r.accept(java.lang.Object):void");
    }
}
