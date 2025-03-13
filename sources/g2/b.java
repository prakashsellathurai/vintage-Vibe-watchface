package g2;

import a2.e;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.fragment.app.i0;
import b2.a;
import b2.c;
import d2.f;
import e2.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import k3.j;
import p.b;
import y1.l;
import y1.u;

public abstract class b implements e, a.C0028a, f {

    /* renamed from: a  reason: collision with root package name */
    public final Path f4507a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f4508b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    public final Paint f4509c;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f4510d;
    public final Paint e;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f4511f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f4512g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f4513h;

    /* renamed from: i  reason: collision with root package name */
    public final RectF f4514i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f4515j;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f4516k;

    /* renamed from: l  reason: collision with root package name */
    public final Matrix f4517l;

    /* renamed from: m  reason: collision with root package name */
    public final l f4518m;

    /* renamed from: n  reason: collision with root package name */
    public final e f4519n;

    /* renamed from: o  reason: collision with root package name */
    public final i0 f4520o;

    /* renamed from: p  reason: collision with root package name */
    public c f4521p;

    /* renamed from: q  reason: collision with root package name */
    public b f4522q;
    public b r;

    /* renamed from: s  reason: collision with root package name */
    public List<b> f4523s;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f4524t;

    /* renamed from: u  reason: collision with root package name */
    public final b2.l f4525u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4526v;
    public boolean w;

    /* renamed from: x  reason: collision with root package name */
    public Paint f4527x;

    public b(l lVar, e eVar) {
        boolean z8 = true;
        this.f4509c = new z1.a(1);
        this.f4510d = new z1.a(PorterDuff.Mode.DST_IN, 0);
        this.e = new z1.a(PorterDuff.Mode.DST_OUT, 0);
        z1.a aVar = new z1.a(1);
        this.f4511f = aVar;
        this.f4512g = new z1.a(PorterDuff.Mode.CLEAR);
        this.f4513h = new RectF();
        this.f4514i = new RectF();
        this.f4515j = new RectF();
        this.f4516k = new RectF();
        this.f4517l = new Matrix();
        this.f4524t = new ArrayList();
        this.f4526v = true;
        this.f4518m = lVar;
        this.f4519n = eVar;
        StringBuilder sb = new StringBuilder();
        sb.append(eVar.f4532c);
        sb.append("#draw");
        aVar.setXfermode(eVar.f4548u == 3 ? new PorterDuffXfermode(PorterDuff.Mode.DST_OUT) : new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        d dVar = eVar.f4537i;
        dVar.getClass();
        b2.l lVar2 = new b2.l(dVar);
        this.f4525u = lVar2;
        lVar2.b(this);
        List<f2.f> list = eVar.f4536h;
        if (list != null && !list.isEmpty()) {
            i0 i0Var = new i0((List) list);
            this.f4520o = i0Var;
            for (a a9 : (List) i0Var.f1188a) {
                a9.a(this);
            }
            for (a aVar2 : (List) this.f4520o.f1189b) {
                e(aVar2);
                aVar2.a(this);
            }
        }
        e eVar2 = this.f4519n;
        if (!eVar2.f4547t.isEmpty()) {
            c cVar = new c(eVar2.f4547t);
            this.f4521p = cVar;
            cVar.f2515b = true;
            cVar.a(new a(this));
            z8 = ((Float) this.f4521p.f()).floatValue() != 1.0f ? false : z8;
            if (z8 != this.f4526v) {
                this.f4526v = z8;
                this.f4518m.invalidateSelf();
            }
            e(this.f4521p);
        } else if (true != this.f4526v) {
            this.f4526v = true;
            this.f4518m.invalidateSelf();
        }
    }

    public void a(RectF rectF, Matrix matrix, boolean z8) {
        this.f4513h.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.f4517l;
        matrix2.set(matrix);
        if (z8) {
            List<b> list = this.f4523s;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    matrix2.preConcat(this.f4523s.get(size).f4525u.d());
                }
            } else {
                b bVar = this.r;
                if (bVar != null) {
                    matrix2.preConcat(bVar.f4525u.d());
                }
            }
        }
        matrix2.preConcat(this.f4525u.d());
    }

    public final void b() {
        this.f4518m.invalidateSelf();
    }

    public final void c(d2.e eVar, int i8, ArrayList arrayList, d2.e eVar2) {
        b bVar = this.f4522q;
        e eVar3 = this.f4519n;
        if (bVar != null) {
            String str = bVar.f4519n.f4532c;
            eVar2.getClass();
            d2.e eVar4 = new d2.e(eVar2);
            eVar4.f3997a.add(str);
            if (eVar.a(i8, this.f4522q.f4519n.f4532c)) {
                b bVar2 = this.f4522q;
                d2.e eVar5 = new d2.e(eVar4);
                eVar5.f3998b = bVar2;
                arrayList.add(eVar5);
            }
            if (eVar.d(i8, eVar3.f4532c)) {
                this.f4522q.o(eVar, eVar.b(i8, this.f4522q.f4519n.f4532c) + i8, arrayList, eVar4);
            }
        }
        if (eVar.c(i8, eVar3.f4532c)) {
            String str2 = eVar3.f4532c;
            if (!"__container".equals(str2)) {
                eVar2.getClass();
                d2.e eVar6 = new d2.e(eVar2);
                eVar6.f3997a.add(str2);
                if (eVar.a(i8, str2)) {
                    d2.e eVar7 = new d2.e(eVar6);
                    eVar7.f3998b = this;
                    arrayList.add(eVar7);
                }
                eVar2 = eVar6;
            }
            if (eVar.d(i8, str2)) {
                o(eVar, i8 + eVar.b(i8, str2), arrayList, eVar2);
            }
        }
    }

    public final void d(List<a2.c> list, List<a2.c> list2) {
    }

    public final void e(a<?, ?> aVar) {
        if (aVar != null) {
            this.f4524t.add(aVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0209  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.graphics.Canvas r19, android.graphics.Matrix r20, int r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.f4526v
            if (r3 == 0) goto L_0x0396
            g2.e r3 = r0.f4519n
            boolean r4 = r3.f4549v
            if (r4 == 0) goto L_0x0012
            goto L_0x0396
        L_0x0012:
            r18.i()
            android.graphics.Matrix r4 = r0.f4508b
            r4.reset()
            r4.set(r2)
            java.util.List<g2.b> r5 = r0.f4523s
            int r5 = r5.size()
            r6 = 1
            int r5 = r5 - r6
        L_0x0025:
            if (r5 < 0) goto L_0x003b
            java.util.List<g2.b> r7 = r0.f4523s
            java.lang.Object r7 = r7.get(r5)
            g2.b r7 = (g2.b) r7
            b2.l r7 = r7.f4525u
            android.graphics.Matrix r7 = r7.d()
            r4.preConcat(r7)
            int r5 = r5 + -1
            goto L_0x0025
        L_0x003b:
            k3.j.s()
            b2.l r5 = r0.f4525u
            b2.a<java.lang.Integer, java.lang.Integer> r7 = r5.f2550j
            if (r7 != 0) goto L_0x0047
            r7 = 100
            goto L_0x0051
        L_0x0047:
            java.lang.Object r7 = r7.f()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
        L_0x0051:
            r8 = r21
            float r8 = (float) r8
            r9 = 1132396544(0x437f0000, float:255.0)
            float r8 = r8 / r9
            float r7 = (float) r7
            float r8 = r8 * r7
            r7 = 1120403456(0x42c80000, float:100.0)
            float r8 = r8 / r7
            float r8 = r8 * r9
            int r7 = (int) r8
            g2.b r8 = r0.f4522q
            r9 = 0
            if (r8 == 0) goto L_0x0065
            r8 = r6
            goto L_0x0066
        L_0x0065:
            r8 = r9
        L_0x0066:
            if (r8 != 0) goto L_0x0082
            boolean r8 = r18.l()
            if (r8 != 0) goto L_0x0082
            android.graphics.Matrix r2 = r5.d()
            r4.preConcat(r2)
            r0.k(r1, r4, r7)
            k3.j.s()
        L_0x007b:
            k3.j.s()
            r18.m()
            return
        L_0x0082:
            android.graphics.RectF r8 = r0.f4513h
            r0.a(r8, r4, r9)
            g2.b r10 = r0.f4522q
            if (r10 == 0) goto L_0x008d
            r10 = r6
            goto L_0x008e
        L_0x008d:
            r10 = r9
        L_0x008e:
            r11 = 3
            r12 = 0
            if (r10 != 0) goto L_0x0093
            goto L_0x00ab
        L_0x0093:
            int r3 = r3.f4548u
            if (r3 != r11) goto L_0x0098
            goto L_0x00ab
        L_0x0098:
            android.graphics.RectF r3 = r0.f4515j
            r3.set(r12, r12, r12, r12)
            g2.b r10 = r0.f4522q
            r10.a(r3, r2, r6)
            boolean r3 = r8.intersect(r3)
            if (r3 != 0) goto L_0x00ab
            r8.set(r12, r12, r12, r12)
        L_0x00ab:
            android.graphics.Matrix r3 = r5.d()
            r4.preConcat(r3)
            android.graphics.RectF r3 = r0.f4514i
            r3.set(r12, r12, r12, r12)
            boolean r5 = r18.l()
            android.graphics.Path r10 = r0.f4507a
            r13 = 2
            androidx.fragment.app.i0 r14 = r0.f4520o
            if (r5 != 0) goto L_0x00c5
            r3 = r12
            goto L_0x0147
        L_0x00c5:
            java.lang.Object r5 = r14.f1190c
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            r15 = r9
        L_0x00ce:
            if (r15 >= r5) goto L_0x013b
            java.lang.Object r12 = r14.f1190c
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r12.get(r15)
            f2.f r12 = (f2.f) r12
            java.lang.Object r9 = r14.f1188a
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r9 = r9.get(r15)
            b2.a r9 = (b2.a) r9
            java.lang.Object r9 = r9.f()
            android.graphics.Path r9 = (android.graphics.Path) r9
            r10.set(r9)
            r10.transform(r4)
            int r9 = r12.f4329a
            int r9 = s.g.b(r9)
            if (r9 == 0) goto L_0x00ff
            if (r9 == r6) goto L_0x0146
            if (r9 == r13) goto L_0x00ff
            if (r9 == r11) goto L_0x0146
            goto L_0x0104
        L_0x00ff:
            boolean r9 = r12.f4332d
            if (r9 == 0) goto L_0x0104
            goto L_0x0146
        L_0x0104:
            android.graphics.RectF r9 = r0.f4516k
            r12 = 0
            r10.computeBounds(r9, r12)
            if (r15 != 0) goto L_0x0110
            r3.set(r9)
            goto L_0x0133
        L_0x0110:
            float r12 = r3.left
            float r11 = r9.left
            float r11 = java.lang.Math.min(r12, r11)
            float r12 = r3.top
            float r13 = r9.top
            float r12 = java.lang.Math.min(r12, r13)
            float r13 = r3.right
            float r6 = r9.right
            float r6 = java.lang.Math.max(r13, r6)
            float r13 = r3.bottom
            float r9 = r9.bottom
            float r9 = java.lang.Math.max(r13, r9)
            r3.set(r11, r12, r6, r9)
        L_0x0133:
            int r15 = r15 + 1
            r6 = 1
            r9 = 0
            r11 = 3
            r12 = 0
            r13 = 2
            goto L_0x00ce
        L_0x013b:
            boolean r3 = r8.intersect(r3)
            if (r3 != 0) goto L_0x0146
            r3 = 0
            r8.set(r3, r3, r3, r3)
            goto L_0x0147
        L_0x0146:
            r3 = 0
        L_0x0147:
            int r5 = r19.getWidth()
            float r5 = (float) r5
            int r6 = r19.getHeight()
            float r6 = (float) r6
            boolean r5 = r8.intersect(r3, r3, r5, r6)
            if (r5 != 0) goto L_0x015a
            r8.set(r3, r3, r3, r3)
        L_0x015a:
            k3.j.s()
            float r3 = r8.width()
            r5 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x035f
            float r3 = r8.height()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x035f
            android.graphics.Paint r3 = r0.f4509c
            r5 = 255(0xff, float:3.57E-43)
            r3.setAlpha(r5)
            java.lang.ThreadLocal<android.graphics.PathMeasure> r6 = k2.g.f5118a
            r1.saveLayer(r8, r3)
            k3.j.s()
            k3.j.s()
            r18.j(r19)
            r0.k(r1, r4, r7)
            k3.j.s()
            boolean r6 = r18.l()
            if (r6 == 0) goto L_0x032e
            android.graphics.Paint r6 = r0.f4510d
            r1.saveLayer(r8, r6)
            k3.j.s()
            k3.j.s()
            r9 = 0
        L_0x019c:
            java.lang.Object r11 = r14.f1190c
            java.util.List r11 = (java.util.List) r11
            int r11 = r11.size()
            if (r9 >= r11) goto L_0x0325
            java.lang.Object r11 = r14.f1190c
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r11 = r11.get(r9)
            f2.f r11 = (f2.f) r11
            java.lang.Object r12 = r14.f1188a
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r13 = r12.get(r9)
            b2.a r13 = (b2.a) r13
            java.lang.Object r15 = r14.f1189b
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r15 = r15.get(r9)
            b2.a r15 = (b2.a) r15
            int r5 = r11.f4329a
            int r5 = s.g.b(r5)
            android.graphics.Paint r2 = r0.e
            r16 = 1076048691(0x40233333, float:2.55)
            boolean r11 = r11.f4332d
            if (r5 == 0) goto L_0x02c7
            r17 = r7
            r7 = 1
            if (r5 == r7) goto L_0x0273
            r7 = 2
            if (r5 == r7) goto L_0x0212
            r7 = 3
            if (r5 == r7) goto L_0x01e0
            goto L_0x026f
        L_0x01e0:
            boolean r2 = r12.isEmpty()
            if (r2 == 0) goto L_0x01e8
        L_0x01e6:
            r2 = 0
            goto L_0x0207
        L_0x01e8:
            r2 = 0
        L_0x01e9:
            java.lang.Object r5 = r14.f1190c
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            if (r2 >= r5) goto L_0x0206
            java.lang.Object r5 = r14.f1190c
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = r5.get(r2)
            f2.f r5 = (f2.f) r5
            int r5 = r5.f4329a
            r11 = 4
            if (r5 == r11) goto L_0x0203
            goto L_0x01e6
        L_0x0203:
            int r2 = r2 + 1
            goto L_0x01e9
        L_0x0206:
            r2 = 1
        L_0x0207:
            if (r2 == 0) goto L_0x026f
            r2 = 255(0xff, float:3.57E-43)
            r3.setAlpha(r2)
            r1.drawRect(r8, r3)
            goto L_0x026f
        L_0x0212:
            r7 = 3
            if (r11 == 0) goto L_0x0244
            java.lang.ThreadLocal<android.graphics.PathMeasure> r5 = k2.g.f5118a
            r1.saveLayer(r8, r6)
            k3.j.s()
            r1.drawRect(r8, r3)
            java.lang.Object r5 = r15.f()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            float r5 = (float) r5
            float r5 = r5 * r16
            int r5 = (int) r5
            r2.setAlpha(r5)
            java.lang.Object r5 = r13.f()
            android.graphics.Path r5 = (android.graphics.Path) r5
            r10.set(r5)
            r10.transform(r4)
            r1.drawPath(r10, r2)
            r19.restore()
            goto L_0x026f
        L_0x0244:
            java.lang.ThreadLocal<android.graphics.PathMeasure> r2 = k2.g.f5118a
            r1.saveLayer(r8, r6)
            k3.j.s()
            java.lang.Object r2 = r13.f()
            android.graphics.Path r2 = (android.graphics.Path) r2
            r10.set(r2)
            r10.transform(r4)
            java.lang.Object r2 = r15.f()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            float r2 = (float) r2
            float r2 = r2 * r16
            int r2 = (int) r2
            r3.setAlpha(r2)
            r1.drawPath(r10, r3)
            r19.restore()
        L_0x026f:
            r5 = 255(0xff, float:3.57E-43)
            goto L_0x031d
        L_0x0273:
            r7 = 3
            if (r9 != 0) goto L_0x0284
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setColor(r5)
            r5 = 255(0xff, float:3.57E-43)
            r3.setAlpha(r5)
            r1.drawRect(r8, r3)
            goto L_0x0286
        L_0x0284:
            r5 = 255(0xff, float:3.57E-43)
        L_0x0286:
            if (r11 == 0) goto L_0x02b7
            java.lang.ThreadLocal<android.graphics.PathMeasure> r11 = k2.g.f5118a
            r1.saveLayer(r8, r2)
            k3.j.s()
            r1.drawRect(r8, r3)
            java.lang.Object r11 = r15.f()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            float r11 = (float) r11
            float r11 = r11 * r16
            int r11 = (int) r11
            r2.setAlpha(r11)
            java.lang.Object r11 = r13.f()
            android.graphics.Path r11 = (android.graphics.Path) r11
            r10.set(r11)
            r10.transform(r4)
            r1.drawPath(r10, r2)
            r19.restore()
            goto L_0x031d
        L_0x02b7:
            java.lang.Object r11 = r13.f()
            android.graphics.Path r11 = (android.graphics.Path) r11
            r10.set(r11)
            r10.transform(r4)
            r1.drawPath(r10, r2)
            goto L_0x031d
        L_0x02c7:
            r17 = r7
            r5 = 255(0xff, float:3.57E-43)
            r7 = 3
            if (r11 == 0) goto L_0x02fd
            java.lang.ThreadLocal<android.graphics.PathMeasure> r11 = k2.g.f5118a
            r1.saveLayer(r8, r3)
            k3.j.s()
            r1.drawRect(r8, r3)
            java.lang.Object r11 = r13.f()
            android.graphics.Path r11 = (android.graphics.Path) r11
            r10.set(r11)
            r10.transform(r4)
            java.lang.Object r11 = r15.f()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            float r11 = (float) r11
            float r11 = r11 * r16
            int r11 = (int) r11
            r3.setAlpha(r11)
            r1.drawPath(r10, r2)
            r19.restore()
            goto L_0x031d
        L_0x02fd:
            java.lang.Object r2 = r13.f()
            android.graphics.Path r2 = (android.graphics.Path) r2
            r10.set(r2)
            r10.transform(r4)
            java.lang.Object r2 = r15.f()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            float r2 = (float) r2
            float r2 = r2 * r16
            int r2 = (int) r2
            r3.setAlpha(r2)
            r1.drawPath(r10, r3)
        L_0x031d:
            int r9 = r9 + 1
            r2 = r20
            r7 = r17
            goto L_0x019c
        L_0x0325:
            r17 = r7
            r19.restore()
            k3.j.s()
            goto L_0x0330
        L_0x032e:
            r17 = r7
        L_0x0330:
            g2.b r2 = r0.f4522q
            if (r2 == 0) goto L_0x0336
            r6 = 1
            goto L_0x0337
        L_0x0336:
            r6 = 0
        L_0x0337:
            if (r6 == 0) goto L_0x0359
            android.graphics.Paint r2 = r0.f4511f
            r1.saveLayer(r8, r2)
            k3.j.s()
            k3.j.s()
            r18.j(r19)
            g2.b r2 = r0.f4522q
            r3 = r20
            r4 = r17
            r2.f(r1, r3, r4)
            r19.restore()
            k3.j.s()
            k3.j.s()
        L_0x0359:
            r19.restore()
            k3.j.s()
        L_0x035f:
            boolean r2 = r0.w
            if (r2 == 0) goto L_0x007b
            android.graphics.Paint r2 = r0.f4527x
            if (r2 == 0) goto L_0x007b
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r3)
            android.graphics.Paint r2 = r0.f4527x
            r3 = -251901(0xfffffffffffc2803, float:NaN)
            r2.setColor(r3)
            android.graphics.Paint r2 = r0.f4527x
            r3 = 1082130432(0x40800000, float:4.0)
            r2.setStrokeWidth(r3)
            android.graphics.Paint r2 = r0.f4527x
            r1.drawRect(r8, r2)
            android.graphics.Paint r2 = r0.f4527x
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r2.setStyle(r3)
            android.graphics.Paint r2 = r0.f4527x
            r3 = 1357638635(0x50ebebeb, float:3.1664855E10)
            r2.setColor(r3)
            android.graphics.Paint r2 = r0.f4527x
            r1.drawRect(r8, r2)
            goto L_0x007b
        L_0x0396:
            k3.j.s()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.b.f(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final String getName() {
        return this.f4519n.f4532c;
    }

    public void h(i0 i0Var, Object obj) {
        this.f4525u.c(i0Var, obj);
    }

    public final void i() {
        if (this.f4523s == null) {
            if (this.r == null) {
                this.f4523s = Collections.emptyList();
                return;
            }
            this.f4523s = new ArrayList();
            for (b bVar = this.r; bVar != null; bVar = bVar.r) {
                this.f4523s.add(bVar);
            }
        }
    }

    public final void j(Canvas canvas) {
        RectF rectF = this.f4513h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f4512g);
        j.s();
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i8);

    public final boolean l() {
        i0 i0Var = this.f4520o;
        return i0Var != null && !((List) i0Var.f1188a).isEmpty();
    }

    public final void m() {
        u uVar = this.f4518m.f8251b.f8219a;
        String str = this.f4519n.f4532c;
        if (uVar.f8329a) {
            HashMap hashMap = uVar.f8331c;
            k2.e eVar = (k2.e) hashMap.get(str);
            if (eVar == null) {
                eVar = new k2.e();
                hashMap.put(str, eVar);
            }
            int i8 = eVar.f5116a + 1;
            eVar.f5116a = i8;
            if (i8 == Integer.MAX_VALUE) {
                eVar.f5116a = i8 / 2;
            }
            if (str.equals("__container")) {
                p.b bVar = (p.b) uVar.f8330b;
                bVar.getClass();
                b.a aVar = new b.a();
                while (aVar.hasNext()) {
                    ((u.a) aVar.next()).a();
                }
            }
        }
    }

    public final void n(a<?, ?> aVar) {
        this.f4524t.remove(aVar);
    }

    public void o(d2.e eVar, int i8, ArrayList arrayList, d2.e eVar2) {
    }

    public void p(boolean z8) {
        if (z8 && this.f4527x == null) {
            this.f4527x = new z1.a();
        }
        this.w = z8;
    }

    public void q(float f9) {
        b2.l lVar = this.f4525u;
        a<Integer, Integer> aVar = lVar.f2550j;
        if (aVar != null) {
            aVar.j(f9);
        }
        a<?, Float> aVar2 = lVar.f2553m;
        if (aVar2 != null) {
            aVar2.j(f9);
        }
        a<?, Float> aVar3 = lVar.f2554n;
        if (aVar3 != null) {
            aVar3.j(f9);
        }
        a<PointF, PointF> aVar4 = lVar.f2546f;
        if (aVar4 != null) {
            aVar4.j(f9);
        }
        a<?, PointF> aVar5 = lVar.f2547g;
        if (aVar5 != null) {
            aVar5.j(f9);
        }
        a<l2.c, l2.c> aVar6 = lVar.f2548h;
        if (aVar6 != null) {
            aVar6.j(f9);
        }
        a<Float, Float> aVar7 = lVar.f2549i;
        if (aVar7 != null) {
            aVar7.j(f9);
        }
        c cVar = lVar.f2551k;
        if (cVar != null) {
            cVar.j(f9);
        }
        c cVar2 = lVar.f2552l;
        if (cVar2 != null) {
            cVar2.j(f9);
        }
        int i8 = 0;
        i0 i0Var = this.f4520o;
        if (i0Var != null) {
            int i9 = 0;
            while (true) {
                Object obj = i0Var.f1188a;
                if (i9 >= ((List) obj).size()) {
                    break;
                }
                ((a) ((List) obj).get(i9)).j(f9);
                i9++;
            }
        }
        float f10 = this.f4519n.f4541m;
        if (f10 != 0.0f) {
            f9 /= f10;
        }
        c cVar3 = this.f4521p;
        if (cVar3 != null) {
            cVar3.j(f9 / f10);
        }
        b bVar = this.f4522q;
        if (bVar != null) {
            bVar.q(bVar.f4519n.f4541m * f9);
        }
        while (true) {
            ArrayList arrayList = this.f4524t;
            if (i8 < arrayList.size()) {
                ((a) arrayList.get(i8)).j(f9);
                i8++;
            } else {
                return;
            }
        }
    }
}
