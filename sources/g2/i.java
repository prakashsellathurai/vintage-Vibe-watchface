package g2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.fragment.app.i0;
import b2.c;
import b2.k;
import b2.m;
import java.util.HashMap;
import java.util.List;
import p.d;
import y1.f;
import y1.l;
import y1.q;

public final class i extends b {
    public final Matrix A = new Matrix();
    public final Paint B = new a();
    public final Paint C = new b();
    public final HashMap D = new HashMap();
    public final d<String> E = new d<>();
    public final k F;
    public final l G;
    public final f H;
    public final b2.a<Integer, Integer> I;
    public m J;
    public final b2.a<Integer, Integer> K;
    public m L;
    public final c M;
    public m N;
    public final c O;
    public m P;
    public m Q;
    public final StringBuilder y = new StringBuilder(2);

    /* renamed from: z  reason: collision with root package name */
    public final RectF f4551z = new RectF();

    public class a extends Paint {
        public a() {
            super(1);
            setStyle(Paint.Style.FILL);
        }
    }

    public class b extends Paint {
        public b() {
            super(1);
            setStyle(Paint.Style.STROKE);
        }
    }

    public i(l lVar, e eVar) {
        super(lVar, eVar);
        e2.b bVar;
        e2.b bVar2;
        e2.a aVar;
        e2.a aVar2;
        this.G = lVar;
        this.H = eVar.f4531b;
        k kVar = new k((List) eVar.f4545q.f4251b);
        this.F = kVar;
        kVar.a(this);
        e(kVar);
        s.c cVar = eVar.r;
        if (!(cVar == null || (aVar2 = (e2.a) cVar.f7134a) == null)) {
            b2.a<Integer, Integer> a9 = aVar2.a();
            this.I = a9;
            a9.a(this);
            e(a9);
        }
        if (!(cVar == null || (aVar = (e2.a) cVar.f7135b) == null)) {
            b2.a<Integer, Integer> a10 = aVar.a();
            this.K = a10;
            a10.a(this);
            e(a10);
        }
        if (!(cVar == null || (bVar2 = (e2.b) cVar.f7136c) == null)) {
            b2.a<Float, Float> a11 = bVar2.a();
            this.M = (c) a11;
            a11.a(this);
            e(a11);
        }
        if (cVar != null && (bVar = (e2.b) cVar.f7137d) != null) {
            b2.a<Float, Float> a12 = bVar.a();
            this.O = (c) a12;
            a12.a(this);
            e(a12);
        }
    }

    public static void r(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    public static void s(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z8) {
        super.a(rectF, matrix, z8);
        f fVar = this.H;
        rectF.set(0.0f, 0.0f, (float) fVar.f8227j.width(), (float) fVar.f8227j.height());
    }

    public final void h(i0 i0Var, Object obj) {
        m mVar;
        super.h(i0Var, obj);
        if (obj == q.f8299a) {
            m mVar2 = this.J;
            if (mVar2 != null) {
                n(mVar2);
            }
            if (i0Var == null) {
                this.J = null;
                return;
            }
            m mVar3 = new m(i0Var, null);
            this.J = mVar3;
            mVar3.a(this);
            mVar = this.J;
        } else if (obj == q.f8300b) {
            m mVar4 = this.L;
            if (mVar4 != null) {
                n(mVar4);
            }
            if (i0Var == null) {
                this.L = null;
                return;
            }
            m mVar5 = new m(i0Var, null);
            this.L = mVar5;
            mVar5.a(this);
            mVar = this.L;
        } else if (obj == q.f8314q) {
            m mVar6 = this.N;
            if (mVar6 != null) {
                n(mVar6);
            }
            if (i0Var == null) {
                this.N = null;
                return;
            }
            m mVar7 = new m(i0Var, null);
            this.N = mVar7;
            mVar7.a(this);
            mVar = this.N;
        } else if (obj == q.r) {
            m mVar8 = this.P;
            if (mVar8 != null) {
                n(mVar8);
            }
            if (i0Var == null) {
                this.P = null;
                return;
            }
            m mVar9 = new m(i0Var, null);
            this.P = mVar9;
            mVar9.a(this);
            mVar = this.P;
        } else if (obj == q.D) {
            m mVar10 = this.Q;
            if (mVar10 != null) {
                n(mVar10);
            }
            if (i0Var == null) {
                this.Q = null;
                return;
            }
            m mVar11 = new m(i0Var, null);
            this.Q = mVar11;
            mVar11.a(this);
            mVar = this.Q;
        } else {
            return;
        }
        e(mVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x03f1  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(android.graphics.Canvas r32, android.graphics.Matrix r33, int r34) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r32.save()
            y1.l r2 = r0.G
            y1.f r3 = r2.f8251b
            p.g<d2.d> r3 = r3.f8224g
            int r3 = r3.e()
            if (r3 <= 0) goto L_0x0015
            r3 = 1
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            if (r3 != 0) goto L_0x001b
            r32.concat(r33)
        L_0x001b:
            b2.k r3 = r0.F
            java.lang.Object r3 = r3.f()
            d2.b r3 = (d2.b) r3
            y1.f r6 = r0.H
            java.util.Map<java.lang.String, d2.c> r7 = r6.e
            java.lang.String r8 = r3.f3981b
            java.lang.Object r7 = r7.get(r8)
            d2.c r7 = (d2.c) r7
            if (r7 != 0) goto L_0x0035
            r32.restore()
            return
        L_0x0035:
            b2.m r8 = r0.J
            android.graphics.Paint r9 = r0.B
            if (r8 == 0) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            b2.a<java.lang.Integer, java.lang.Integer> r8 = r0.I
            if (r8 == 0) goto L_0x004b
        L_0x0040:
            java.lang.Object r8 = r8.f()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            goto L_0x004d
        L_0x004b:
            int r8 = r3.f3986h
        L_0x004d:
            r9.setColor(r8)
            b2.m r8 = r0.L
            android.graphics.Paint r10 = r0.C
            if (r8 == 0) goto L_0x0057
            goto L_0x005b
        L_0x0057:
            b2.a<java.lang.Integer, java.lang.Integer> r8 = r0.K
            if (r8 == 0) goto L_0x0066
        L_0x005b:
            java.lang.Object r8 = r8.f()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            goto L_0x0068
        L_0x0066:
            int r8 = r3.f3987i
        L_0x0068:
            r10.setColor(r8)
            b2.l r8 = r0.f4525u
            b2.a<java.lang.Integer, java.lang.Integer> r8 = r8.f2550j
            r11 = 100
            if (r8 != 0) goto L_0x0075
            r8 = r11
            goto L_0x007f
        L_0x0075:
            java.lang.Object r8 = r8.f()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
        L_0x007f:
            int r8 = r8 * 255
            int r8 = r8 / r11
            r9.setAlpha(r8)
            r10.setAlpha(r8)
            b2.m r8 = r0.N
            if (r8 == 0) goto L_0x008d
            goto L_0x0091
        L_0x008d:
            b2.c r8 = r0.M
            if (r8 == 0) goto L_0x009f
        L_0x0091:
            java.lang.Object r8 = r8.f()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            r10.setStrokeWidth(r8)
            goto L_0x00ae
        L_0x009f:
            float r8 = k2.g.d(r33)
            float r11 = r3.f3988j
            float r12 = k2.g.c()
            float r11 = r11 * r12
            float r11 = r11 * r8
            r10.setStrokeWidth(r11)
        L_0x00ae:
            y1.f r8 = r2.f8251b
            p.g<d2.d> r8 = r8.f8224g
            int r8 = r8.e()
            if (r8 <= 0) goto L_0x00ba
            r8 = 1
            goto L_0x00bb
        L_0x00ba:
            r8 = 0
        L_0x00bb:
            java.lang.String r12 = "\n"
            java.lang.String r13 = "\r"
            java.lang.String r14 = "\r\n"
            r16 = 1073741824(0x40000000, float:2.0)
            b2.c r11 = r0.O
            boolean r4 = r3.f3989k
            int r5 = r3.f3983d
            int r15 = r3.e
            r18 = r11
            float r11 = r3.f3984f
            r19 = r15
            float r15 = r3.f3982c
            r20 = r15
            java.lang.String r15 = r3.f3980a
            r21 = r10
            java.lang.String r10 = r7.f3991b
            java.lang.String r7 = r7.f3990a
            if (r8 == 0) goto L_0x02ea
            b2.m r8 = r0.Q
            if (r8 == 0) goto L_0x00ee
            java.lang.Object r8 = r8.f()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            goto L_0x00f0
        L_0x00ee:
            r8 = r20
        L_0x00f0:
            r17 = 1120403456(0x42c80000, float:100.0)
            float r8 = r8 / r17
            r22 = r9
            float r9 = k2.g.d(r33)
            float r17 = k2.g.c()
            float r11 = r11 * r17
            java.lang.String r14 = r15.replaceAll(r14, r13)
            java.lang.String r12 = r14.replaceAll(r12, r13)
            java.lang.String[] r12 = r12.split(r13)
            java.util.List r12 = java.util.Arrays.asList(r12)
            int r13 = r12.size()
            r14 = 0
        L_0x0115:
            if (r14 >= r13) goto L_0x02e7
            java.lang.Object r15 = r12.get(r14)
            java.lang.String r15 = (java.lang.String) r15
            r24 = r3
            r23 = r4
            r17 = r12
            r4 = 0
            r12 = 0
        L_0x0125:
            int r3 = r15.length()
            if (r12 >= r3) goto L_0x016d
            char r3 = r15.charAt(r12)
            int r3 = d2.d.a(r3, r7, r10)
            r25 = r2
            p.g<d2.d> r2 = r6.f8224g
            r0 = 0
            java.lang.Object r2 = r2.c(r3, r0)
            d2.d r2 = (d2.d) r2
            if (r2 != 0) goto L_0x0148
            r0 = r6
            r26 = r7
            r20 = r14
            r27 = r15
            goto L_0x015f
        L_0x0148:
            double r3 = (double) r4
            r0 = r6
            r26 = r7
            double r6 = (double) r8
            r20 = r14
            r27 = r15
            double r14 = r2.f3994c
            double r14 = r14 * r6
            float r2 = k2.g.c()
            double r6 = (double) r2
            double r14 = r14 * r6
            double r6 = (double) r9
            double r14 = r14 * r6
            double r3 = r3 + r14
            float r2 = (float) r3
            r4 = r2
        L_0x015f:
            int r12 = r12 + 1
            r6 = r0
            r14 = r20
            r2 = r25
            r7 = r26
            r15 = r27
            r0 = r31
            goto L_0x0125
        L_0x016d:
            r25 = r2
            r0 = r6
            r26 = r7
            r20 = r14
            r27 = r15
            r32.save()
            if (r5 == 0) goto L_0x02e5
            int r2 = r5 + -1
            r3 = 1
            if (r2 == r3) goto L_0x0188
            r3 = 2
            if (r2 == r3) goto L_0x0184
            goto L_0x018d
        L_0x0184:
            float r2 = -r4
            float r2 = r2 / r16
            goto L_0x0189
        L_0x0188:
            float r2 = -r4
        L_0x0189:
            r3 = 0
            r1.translate(r2, r3)
        L_0x018d:
            int r2 = r13 + -1
            float r2 = (float) r2
            float r2 = r2 * r11
            float r2 = r2 / r16
            r3 = r20
            float r4 = (float) r3
            float r4 = r4 * r11
            float r4 = r4 - r2
            r2 = 0
            r1.translate(r2, r4)
            r2 = 0
        L_0x019d:
            int r4 = r27.length()
            if (r2 >= r4) goto L_0x02bd
            r15 = r27
            char r4 = r15.charAt(r2)
            r6 = r26
            int r4 = d2.d.a(r4, r6, r10)
            p.g<d2.d> r7 = r0.f8224g
            r12 = 0
            java.lang.Object r4 = r7.c(r4, r12)
            d2.d r4 = (d2.d) r4
            if (r4 != 0) goto L_0x01cc
            r7 = r31
            r20 = r0
            r30 = r5
            r26 = r11
            r27 = r13
            r4 = r19
            r13 = r21
            r5 = r25
            goto L_0x02a7
        L_0x01cc:
            r7 = r31
            java.util.HashMap r12 = r7.D
            boolean r14 = r12.containsKey(r4)
            if (r14 == 0) goto L_0x01e7
            java.lang.Object r12 = r12.get(r4)
            java.util.List r12 = (java.util.List) r12
            r20 = r0
            r30 = r5
            r26 = r11
            r27 = r13
            r5 = r25
            goto L_0x0224
        L_0x01e7:
            java.util.List<f2.l> r14 = r4.f3992a
            r20 = r0
            int r0 = r14.size()
            r26 = r11
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r0)
            r27 = r13
            r13 = 0
        L_0x01f9:
            if (r13 >= r0) goto L_0x021c
            java.lang.Object r28 = r14.get(r13)
            r29 = r0
            r0 = r28
            f2.l r0 = (f2.l) r0
            r28 = r14
            a2.d r14 = new a2.d
            r30 = r5
            r5 = r25
            r14.<init>(r5, r7, r0)
            r11.add(r14)
            int r13 = r13 + 1
            r14 = r28
            r0 = r29
            r5 = r30
            goto L_0x01f9
        L_0x021c:
            r30 = r5
            r5 = r25
            r12.put(r4, r11)
            r12 = r11
        L_0x0224:
            r0 = 0
        L_0x0225:
            int r11 = r12.size()
            if (r0 >= r11) goto L_0x027b
            java.lang.Object r11 = r12.get(r0)
            a2.d r11 = (a2.d) r11
            android.graphics.Path r11 = r11.g()
            android.graphics.RectF r13 = r7.f4551z
            r14 = 0
            r11.computeBounds(r13, r14)
            android.graphics.Matrix r13 = r7.A
            r14 = r33
            r13.set(r14)
            r25 = r12
            r12 = r24
            float r14 = r12.f3985g
            float r14 = -r14
            float r24 = k2.g.c()
            float r14 = r14 * r24
            r24 = r12
            r12 = 0
            r13.preTranslate(r12, r14)
            r13.preScale(r8, r8)
            r11.transform(r13)
            if (r23 == 0) goto L_0x0268
            r12 = r22
            s(r11, r12, r1)
            r13 = r21
            s(r11, r13, r1)
            goto L_0x0272
        L_0x0268:
            r13 = r21
            r12 = r22
            s(r11, r13, r1)
            s(r11, r12, r1)
        L_0x0272:
            int r0 = r0 + 1
            r22 = r12
            r21 = r13
            r12 = r25
            goto L_0x0225
        L_0x027b:
            r13 = r21
            double r11 = r4.f3994c
            float r0 = (float) r11
            float r0 = r0 * r8
            float r4 = k2.g.c()
            float r0 = r0 * r4
            float r0 = r0 * r9
            r4 = r19
            float r11 = (float) r4
            r12 = 1092616192(0x41200000, float:10.0)
            float r11 = r11 / r12
            b2.m r12 = r7.P
            if (r12 == 0) goto L_0x0292
            goto L_0x0296
        L_0x0292:
            if (r18 == 0) goto L_0x02a1
            r12 = r18
        L_0x0296:
            java.lang.Object r12 = r12.f()
            java.lang.Float r12 = (java.lang.Float) r12
            float r12 = r12.floatValue()
            float r11 = r11 + r12
        L_0x02a1:
            float r11 = r11 * r9
            float r0 = r0 + r11
            r11 = 0
            r1.translate(r0, r11)
        L_0x02a7:
            int r2 = r2 + 1
            r19 = r4
            r25 = r5
            r21 = r13
            r0 = r20
            r11 = r26
            r13 = r27
            r5 = r30
            r26 = r6
            r27 = r15
            goto L_0x019d
        L_0x02bd:
            r7 = r31
            r20 = r0
            r30 = r5
            r27 = r13
            r4 = r19
            r13 = r21
            r5 = r25
            r6 = r26
            r26 = r11
            r32.restore()
            int r14 = r3 + 1
            r2 = r5
            r0 = r7
            r12 = r17
            r4 = r23
            r3 = r24
            r13 = r27
            r5 = r30
            r7 = r6
            r6 = r20
            goto L_0x0115
        L_0x02e5:
            r0 = 0
            throw r0
        L_0x02e7:
            r8 = r1
            goto L_0x04fa
        L_0x02ea:
            r23 = r4
            r30 = r5
            r6 = r7
            r4 = r19
            r7 = r0
            r5 = r2
            r0 = r9
            r2 = r21
            k2.g.d(r33)
            android.graphics.drawable.Drawable$Callback r3 = r5.getCallback()
            if (r3 != 0) goto L_0x0301
            r3 = 0
            goto L_0x0312
        L_0x0301:
            c2.a r3 = r5.f8259k
            if (r3 != 0) goto L_0x0310
            c2.a r3 = new c2.a
            android.graphics.drawable.Drawable$Callback r8 = r5.getCallback()
            r3.<init>(r8)
            r5.f8259k = r3
        L_0x0310:
            c2.a r3 = r5.f8259k
        L_0x0312:
            if (r3 == 0) goto L_0x037f
            androidx.appcompat.widget.p r5 = r3.f2644a
            r5.f785b = r6
            r5.f786c = r10
            java.util.HashMap r8 = r3.f2645b
            java.lang.Object r9 = r8.get(r5)
            android.graphics.Typeface r9 = (android.graphics.Typeface) r9
            if (r9 == 0) goto L_0x0328
            r1 = r9
            r19 = r12
            goto L_0x0382
        L_0x0328:
            java.util.HashMap r9 = r3.f2646c
            java.lang.Object r19 = r9.get(r6)
            android.graphics.Typeface r19 = (android.graphics.Typeface) r19
            if (r19 == 0) goto L_0x0337
            r1 = r19
            r19 = r12
            goto L_0x0355
        L_0x0337:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r19 = r12
            java.lang.String r12 = "fonts/"
            r1.<init>(r12)
            r1.append(r6)
            java.lang.String r12 = r3.e
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.content.res.AssetManager r3 = r3.f2647d
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r3, r1)
            r9.put(r6, r1)
        L_0x0355:
            java.lang.String r3 = "Italic"
            boolean r3 = r10.contains(r3)
            java.lang.String r6 = "Bold"
            boolean r6 = r10.contains(r6)
            if (r3 == 0) goto L_0x0367
            if (r6 == 0) goto L_0x0367
            r3 = 3
            goto L_0x0370
        L_0x0367:
            if (r3 == 0) goto L_0x036b
            r3 = 2
            goto L_0x0370
        L_0x036b:
            if (r6 == 0) goto L_0x036f
            r3 = 1
            goto L_0x0370
        L_0x036f:
            r3 = 0
        L_0x0370:
            int r6 = r1.getStyle()
            if (r6 != r3) goto L_0x0377
            goto L_0x037b
        L_0x0377:
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r3)
        L_0x037b:
            r8.put(r5, r1)
            goto L_0x0382
        L_0x037f:
            r19 = r12
            r1 = 0
        L_0x0382:
            if (r1 != 0) goto L_0x0388
        L_0x0384:
            r8 = r32
            goto L_0x04fa
        L_0x0388:
            r0.setTypeface(r1)
            b2.m r1 = r7.Q
            if (r1 == 0) goto L_0x039a
            java.lang.Object r1 = r1.f()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L_0x039c
        L_0x039a:
            r1 = r20
        L_0x039c:
            float r3 = k2.g.c()
            float r3 = r3 * r1
            r0.setTextSize(r3)
            android.graphics.Typeface r3 = r0.getTypeface()
            r2.setTypeface(r3)
            float r3 = r0.getTextSize()
            r2.setTextSize(r3)
            float r3 = k2.g.c()
            float r11 = r11 * r3
            float r3 = (float) r4
            r4 = 1092616192(0x41200000, float:10.0)
            float r3 = r3 / r4
            b2.m r4 = r7.P
            if (r4 == 0) goto L_0x03c0
            goto L_0x03c4
        L_0x03c0:
            if (r18 == 0) goto L_0x03cf
            r4 = r18
        L_0x03c4:
            java.lang.Object r4 = r4.f()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            float r3 = r3 + r4
        L_0x03cf:
            float r4 = k2.g.c()
            float r3 = r3 * r4
            float r3 = r3 * r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r1
            java.lang.String r1 = r15.replaceAll(r14, r13)
            r4 = r19
            java.lang.String r1 = r1.replaceAll(r4, r13)
            java.lang.String[] r1 = r1.split(r13)
            java.util.List r1 = java.util.Arrays.asList(r1)
            int r4 = r1.size()
            r14 = 0
        L_0x03ef:
            if (r14 >= r4) goto L_0x0384
            java.lang.Object r5 = r1.get(r14)
            java.lang.String r5 = (java.lang.String) r5
            float r6 = r2.measureText(r5)
            int r8 = r5.length()
            r9 = 1
            int r8 = r8 - r9
            float r8 = (float) r8
            float r8 = r8 * r3
            float r6 = r6 + r8
            r32.save()
            if (r30 == 0) goto L_0x04f8
            int r8 = r30 + -1
            r10 = 2
            if (r8 == r9) goto L_0x0417
            if (r8 == r10) goto L_0x0413
            r8 = r32
            goto L_0x041e
        L_0x0413:
            float r6 = -r6
            float r6 = r6 / r16
            goto L_0x0418
        L_0x0417:
            float r6 = -r6
        L_0x0418:
            r8 = r32
            r12 = 0
            r8.translate(r6, r12)
        L_0x041e:
            int r6 = r4 + -1
            float r6 = (float) r6
            float r6 = r6 * r11
            float r6 = r6 / r16
            float r12 = (float) r14
            float r12 = r12 * r11
            float r12 = r12 - r6
            r6 = 0
            r8.translate(r6, r12)
            r6 = 0
        L_0x042c:
            int r12 = r5.length()
            if (r6 >= r12) goto L_0x04ea
            int r12 = r5.codePointAt(r6)
            int r13 = java.lang.Character.charCount(r12)
            int r13 = r13 + r6
        L_0x043b:
            int r15 = r5.length()
            if (r13 >= r15) goto L_0x047e
            int r15 = r5.codePointAt(r13)
            int r9 = java.lang.Character.getType(r15)
            r10 = 16
            if (r9 == r10) goto L_0x046f
            int r9 = java.lang.Character.getType(r15)
            r10 = 27
            if (r9 == r10) goto L_0x046f
            int r9 = java.lang.Character.getType(r15)
            r10 = 6
            if (r9 == r10) goto L_0x046f
            int r9 = java.lang.Character.getType(r15)
            r10 = 28
            if (r9 == r10) goto L_0x046f
            int r9 = java.lang.Character.getType(r15)
            r10 = 19
            if (r9 != r10) goto L_0x046d
            goto L_0x046f
        L_0x046d:
            r9 = 0
            goto L_0x0470
        L_0x046f:
            r9 = 1
        L_0x0470:
            if (r9 != 0) goto L_0x0473
            goto L_0x047e
        L_0x0473:
            int r9 = java.lang.Character.charCount(r15)
            int r13 = r13 + r9
            int r12 = r12 * 31
            int r12 = r12 + r15
            r9 = 1
            r10 = 2
            goto L_0x043b
        L_0x047e:
            long r9 = (long) r12
            p.d<java.lang.String> r12 = r7.E
            boolean r15 = r12.f6221f
            if (r15 == 0) goto L_0x0488
            r12.c()
        L_0x0488:
            long[] r15 = r12.f6222g
            r33 = r1
            int r1 = r12.f6224i
            int r1 = k3.j.i(r15, r1, r9)
            if (r1 < 0) goto L_0x0496
            r1 = 1
            goto L_0x0497
        L_0x0496:
            r1 = 0
        L_0x0497:
            if (r1 == 0) goto L_0x04a3
            r1 = 0
            java.lang.Object r9 = r12.d(r9, r1)
            java.lang.String r9 = (java.lang.String) r9
            r34 = r4
            goto L_0x04c5
        L_0x04a3:
            java.lang.StringBuilder r1 = r7.y
            r15 = 0
            r1.setLength(r15)
            r15 = r6
        L_0x04aa:
            r34 = r4
            if (r15 >= r13) goto L_0x04bd
            int r4 = r5.codePointAt(r15)
            r1.appendCodePoint(r4)
            int r4 = java.lang.Character.charCount(r4)
            int r15 = r15 + r4
            r4 = r34
            goto L_0x04aa
        L_0x04bd:
            java.lang.String r1 = r1.toString()
            r12.f(r9, r1)
            r9 = r1
        L_0x04c5:
            int r1 = r9.length()
            int r6 = r6 + r1
            if (r23 == 0) goto L_0x04d3
            r(r9, r0, r8)
            r(r9, r2, r8)
            goto L_0x04d9
        L_0x04d3:
            r(r9, r2, r8)
            r(r9, r0, r8)
        L_0x04d9:
            float r1 = r0.measureText(r9)
            float r1 = r1 + r3
            r4 = 0
            r8.translate(r1, r4)
            r1 = r33
            r4 = r34
            r9 = 1
            r10 = 2
            goto L_0x042c
        L_0x04ea:
            r33 = r1
            r34 = r4
            r4 = 0
            r32.restore()
            int r14 = r14 + 1
            r4 = r34
            goto L_0x03ef
        L_0x04f8:
            r1 = 0
            throw r1
        L_0x04fa:
            r32.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.i.k(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
