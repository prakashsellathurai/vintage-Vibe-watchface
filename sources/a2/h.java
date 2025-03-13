package a2;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import androidx.fragment.app.i0;
import b2.a;
import b2.m;
import d2.e;
import f2.c;
import g2.b;
import java.util.ArrayList;
import java.util.List;
import k2.f;
import p.d;
import y1.l;
import y1.q;

public final class h implements e, a.C0028a, k {

    /* renamed from: a  reason: collision with root package name */
    public final String f93a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f94b;

    /* renamed from: c  reason: collision with root package name */
    public final b f95c;

    /* renamed from: d  reason: collision with root package name */
    public final d<LinearGradient> f96d = new d<>();
    public final d<RadialGradient> e = new d<>();

    /* renamed from: f  reason: collision with root package name */
    public final Path f97f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f98g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f99h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f100i;

    /* renamed from: j  reason: collision with root package name */
    public final int f101j;

    /* renamed from: k  reason: collision with root package name */
    public final a<c, c> f102k;

    /* renamed from: l  reason: collision with root package name */
    public final a<Integer, Integer> f103l;

    /* renamed from: m  reason: collision with root package name */
    public final a<PointF, PointF> f104m;

    /* renamed from: n  reason: collision with root package name */
    public final a<PointF, PointF> f105n;

    /* renamed from: o  reason: collision with root package name */
    public m f106o;

    /* renamed from: p  reason: collision with root package name */
    public m f107p;

    /* renamed from: q  reason: collision with root package name */
    public final l f108q;
    public final int r;

    public h(l lVar, b bVar, f2.d dVar) {
        Path path = new Path();
        this.f97f = path;
        this.f98g = new z1.a(1);
        this.f99h = new RectF();
        this.f100i = new ArrayList();
        this.f95c = bVar;
        this.f93a = dVar.f4315g;
        this.f94b = dVar.f4316h;
        this.f108q = lVar;
        this.f101j = dVar.f4310a;
        path.setFillType(dVar.f4311b);
        this.r = (int) (lVar.f8251b.b() / 32.0f);
        a<c, c> a9 = dVar.f4312c.a();
        this.f102k = a9;
        a9.a(this);
        bVar.e(a9);
        a<Integer, Integer> a10 = dVar.f4313d.a();
        this.f103l = a10;
        a10.a(this);
        bVar.e(a10);
        a<PointF, PointF> a11 = dVar.e.a();
        this.f104m = a11;
        a11.a(this);
        bVar.e(a11);
        a<PointF, PointF> a12 = dVar.f4314f.a();
        this.f105n = a12;
        a12.a(this);
        bVar.e(a12);
    }

    public final void a(RectF rectF, Matrix matrix, boolean z8) {
        Path path = this.f97f;
        path.reset();
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f100i;
            if (i8 < arrayList.size()) {
                path.addPath(((m) arrayList.get(i8)).g(), matrix);
                i8++;
            } else {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
        }
    }

    public final void b() {
        this.f108q.invalidateSelf();
    }

    public final void c(e eVar, int i8, ArrayList arrayList, e eVar2) {
        f.d(eVar, i8, arrayList, eVar2, this);
    }

    public final void d(List<c> list, List<c> list2) {
        for (int i8 = 0; i8 < list2.size(); i8++) {
            c cVar = list2.get(i8);
            if (cVar instanceof m) {
                this.f100i.add((m) cVar);
            }
        }
    }

    public final int[] e(int[] iArr) {
        m mVar = this.f107p;
        if (mVar != null) {
            Integer[] numArr = (Integer[]) mVar.f();
            int i8 = 0;
            if (iArr.length == numArr.length) {
                while (i8 < iArr.length) {
                    iArr[i8] = numArr[i8].intValue();
                    i8++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i8 < numArr.length) {
                    iArr[i8] = numArr[i8].intValue();
                    i8++;
                }
            }
        }
        return iArr;
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r11v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: type inference failed for: r11v3, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.graphics.Canvas r22, android.graphics.Matrix r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            boolean r2 = r0.f94b
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            android.graphics.Path r2 = r0.f97f
            r2.reset()
            r3 = 0
            r4 = r3
        L_0x0010:
            java.util.ArrayList r5 = r0.f100i
            int r6 = r5.size()
            if (r4 >= r6) goto L_0x0028
            java.lang.Object r5 = r5.get(r4)
            a2.m r5 = (a2.m) r5
            android.graphics.Path r5 = r5.g()
            r2.addPath(r5, r1)
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0028:
            android.graphics.RectF r4 = r0.f99h
            r2.computeBounds(r4, r3)
            int r4 = r0.f101j
            r5 = 1
            b2.a<f2.c, f2.c> r6 = r0.f102k
            b2.a<android.graphics.PointF, android.graphics.PointF> r7 = r0.f105n
            b2.a<android.graphics.PointF, android.graphics.PointF> r8 = r0.f104m
            r9 = 0
            if (r4 != r5) goto L_0x007a
            int r4 = r21.i()
            long r4 = (long) r4
            p.d<android.graphics.LinearGradient> r10 = r0.f96d
            java.lang.Object r9 = r10.d(r4, r9)
            android.graphics.LinearGradient r9 = (android.graphics.LinearGradient) r9
            if (r9 == 0) goto L_0x004a
            goto L_0x00cf
        L_0x004a:
            java.lang.Object r8 = r8.f()
            android.graphics.PointF r8 = (android.graphics.PointF) r8
            java.lang.Object r7 = r7.f()
            android.graphics.PointF r7 = (android.graphics.PointF) r7
            java.lang.Object r6 = r6.f()
            f2.c r6 = (f2.c) r6
            int[] r9 = r6.f4309b
            int[] r16 = r0.e(r9)
            float[] r6 = r6.f4308a
            android.graphics.LinearGradient r9 = new android.graphics.LinearGradient
            float r12 = r8.x
            float r13 = r8.y
            float r14 = r7.x
            float r15 = r7.y
            android.graphics.Shader$TileMode r18 = android.graphics.Shader.TileMode.CLAMP
            r11 = r9
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r10.f(r4, r9)
            goto L_0x00cf
        L_0x007a:
            int r4 = r21.i()
            long r4 = (long) r4
            p.d<android.graphics.RadialGradient> r10 = r0.e
            java.lang.Object r9 = r10.d(r4, r9)
            android.graphics.RadialGradient r9 = (android.graphics.RadialGradient) r9
            if (r9 == 0) goto L_0x008a
            goto L_0x00cf
        L_0x008a:
            java.lang.Object r8 = r8.f()
            android.graphics.PointF r8 = (android.graphics.PointF) r8
            java.lang.Object r7 = r7.f()
            android.graphics.PointF r7 = (android.graphics.PointF) r7
            java.lang.Object r6 = r6.f()
            f2.c r6 = (f2.c) r6
            int[] r9 = r6.f4309b
            int[] r15 = r0.e(r9)
            float[] r6 = r6.f4308a
            float r12 = r8.x
            float r13 = r8.y
            float r8 = r7.x
            float r7 = r7.y
            float r8 = r8 - r12
            double r8 = (double) r8
            float r7 = r7 - r13
            r19 = r4
            double r3 = (double) r7
            double r3 = java.lang.Math.hypot(r8, r3)
            float r3 = (float) r3
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x00bf
            r3 = 981668463(0x3a83126f, float:0.001)
        L_0x00bf:
            r14 = r3
            android.graphics.RadialGradient r9 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r17 = android.graphics.Shader.TileMode.CLAMP
            r11 = r9
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r3 = r19
            r10.f(r3, r9)
        L_0x00cf:
            r9.setLocalMatrix(r1)
            android.graphics.Paint r1 = r0.f98g
            r1.setShader(r9)
            b2.m r3 = r0.f106o
            if (r3 == 0) goto L_0x00e4
            java.lang.Object r3 = r3.f()
            android.graphics.ColorFilter r3 = (android.graphics.ColorFilter) r3
            r1.setColorFilter(r3)
        L_0x00e4:
            r3 = r24
            float r3 = (float) r3
            r4 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 / r4
            b2.a<java.lang.Integer, java.lang.Integer> r0 = r0.f103l
            java.lang.Object r0 = r0.f()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            float r0 = (float) r0
            float r3 = r3 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r0
            float r3 = r3 * r4
            int r0 = (int) r3
            android.graphics.PointF r3 = k2.f.f5117a
            r3 = 255(0xff, float:3.57E-43)
            int r0 = java.lang.Math.min(r3, r0)
            r3 = 0
            int r0 = java.lang.Math.max(r3, r0)
            r1.setAlpha(r0)
            r0 = r22
            r0.drawPath(r2, r1)
            k3.j.s()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.h.f(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final String getName() {
        return this.f93a;
    }

    public final void h(i0 i0Var, Object obj) {
        m mVar;
        if (obj == q.f8302d) {
            this.f103l.k(i0Var);
            return;
        }
        ColorFilter colorFilter = q.E;
        b bVar = this.f95c;
        if (obj == colorFilter) {
            m mVar2 = this.f106o;
            if (mVar2 != null) {
                bVar.n(mVar2);
            }
            if (i0Var == null) {
                this.f106o = null;
                return;
            }
            m mVar3 = new m(i0Var, null);
            this.f106o = mVar3;
            mVar3.a(this);
            mVar = this.f106o;
        } else if (obj == q.F) {
            m mVar4 = this.f107p;
            if (mVar4 != null) {
                bVar.n(mVar4);
            }
            if (i0Var == null) {
                this.f107p = null;
                return;
            }
            this.f96d.a();
            this.e.a();
            m mVar5 = new m(i0Var, null);
            this.f107p = mVar5;
            mVar5.a(this);
            mVar = this.f107p;
        } else {
            return;
        }
        bVar.e(mVar);
    }

    public final int i() {
        float f9 = this.f104m.f2517d;
        int i8 = this.r;
        int round = Math.round(f9 * ((float) i8));
        int round2 = Math.round(this.f105n.f2517d * ((float) i8));
        int round3 = Math.round(this.f102k.f2517d * ((float) i8));
        int i9 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i9 = i9 * 31 * round2;
        }
        return round3 != 0 ? i9 * 31 * round3 : i9;
    }
}
