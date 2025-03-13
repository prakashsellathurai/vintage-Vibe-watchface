package a2;

import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import androidx.fragment.app.i0;
import b2.a;
import b2.m;
import f2.c;
import g2.b;
import p.d;
import y1.q;

public final class i extends a {

    /* renamed from: o  reason: collision with root package name */
    public final String f109o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f110p;

    /* renamed from: q  reason: collision with root package name */
    public final d<LinearGradient> f111q;
    public final d<RadialGradient> r;

    /* renamed from: s  reason: collision with root package name */
    public final RectF f112s;

    /* renamed from: t  reason: collision with root package name */
    public final int f113t;

    /* renamed from: u  reason: collision with root package name */
    public final int f114u;

    /* renamed from: v  reason: collision with root package name */
    public final a<c, c> f115v;
    public final a<PointF, PointF> w;

    /* renamed from: x  reason: collision with root package name */
    public final a<PointF, PointF> f116x;
    public m y;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(y1.l r14, g2.b r15, f2.e r16) {
        /*
            r13 = this;
            r10 = r13
            r11 = r15
            r12 = r16
            int r0 = r12.f4323h
            r1 = 0
            if (r0 == 0) goto L_0x009b
            int r0 = r0 + -1
            r2 = 1
            if (r0 == 0) goto L_0x0016
            if (r0 == r2) goto L_0x0013
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
            goto L_0x0018
        L_0x0013:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto L_0x0018
        L_0x0016:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
        L_0x0018:
            r3 = r0
            int r0 = r12.f4324i
            if (r0 == 0) goto L_0x009a
            int r0 = r0 + -1
            if (r0 == 0) goto L_0x002e
            if (r0 == r2) goto L_0x002b
            r2 = 2
            if (r0 == r2) goto L_0x0028
            r4 = r1
            goto L_0x0031
        L_0x0028:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
            goto L_0x0030
        L_0x002b:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto L_0x0030
        L_0x002e:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
        L_0x0030:
            r4 = r0
        L_0x0031:
            float r5 = r12.f4325j
            e2.a r6 = r12.f4320d
            e2.b r7 = r12.f4322g
            java.util.List<e2.b> r8 = r12.f4326k
            e2.b r9 = r12.f4327l
            r0 = r13
            r1 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            p.d r0 = new p.d
            r0.<init>()
            r10.f111q = r0
            p.d r0 = new p.d
            r0.<init>()
            r10.r = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.f112s = r0
            java.lang.String r0 = r12.f4317a
            r10.f109o = r0
            int r0 = r12.f4318b
            r10.f113t = r0
            boolean r0 = r12.f4328m
            r10.f110p = r0
            r0 = r14
            y1.f r0 = r0.f8251b
            float r0 = r0.b()
            r1 = 1107296256(0x42000000, float:32.0)
            float r0 = r0 / r1
            int r0 = (int) r0
            r10.f114u = r0
            e2.a r0 = r12.f4319c
            b2.a r0 = r0.a()
            r10.f115v = r0
            r0.a(r13)
            r15.e(r0)
            e2.a r0 = r12.e
            b2.a r0 = r0.a()
            r10.w = r0
            r0.a(r13)
            r15.e(r0)
            e2.a r0 = r12.f4321f
            b2.a r0 = r0.a()
            r10.f116x = r0
            r0.a(r13)
            r15.e(r0)
            return
        L_0x009a:
            throw r1
        L_0x009b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.i.<init>(y1.l, g2.b, f2.e):void");
    }

    public final int[] e(int[] iArr) {
        m mVar = this.y;
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

    /* JADX WARNING: type inference failed for: r7v1, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r9v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r9v3, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.graphics.Canvas r18, android.graphics.Matrix r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r0.f110p
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            android.graphics.RectF r2 = r0.f112s
            r3 = 0
            r0.a(r2, r1, r3)
            int r2 = r0.f113t
            r3 = 1
            b2.a<f2.c, f2.c> r4 = r0.f115v
            b2.a<android.graphics.PointF, android.graphics.PointF> r5 = r0.f116x
            b2.a<android.graphics.PointF, android.graphics.PointF> r6 = r0.w
            r7 = 0
            if (r2 != r3) goto L_0x005a
            int r2 = r17.i()
            long r2 = (long) r2
            p.d<android.graphics.LinearGradient> r8 = r0.f111q
            java.lang.Object r7 = r8.d(r2, r7)
            android.graphics.LinearGradient r7 = (android.graphics.LinearGradient) r7
            if (r7 == 0) goto L_0x002c
            goto L_0x00a0
        L_0x002c:
            java.lang.Object r6 = r6.f()
            android.graphics.PointF r6 = (android.graphics.PointF) r6
            java.lang.Object r5 = r5.f()
            android.graphics.PointF r5 = (android.graphics.PointF) r5
            java.lang.Object r4 = r4.f()
            f2.c r4 = (f2.c) r4
            int[] r7 = r4.f4309b
            int[] r14 = r0.e(r7)
            float[] r15 = r4.f4308a
            float r10 = r6.x
            float r11 = r6.y
            float r12 = r5.x
            float r13 = r5.y
            android.graphics.LinearGradient r7 = new android.graphics.LinearGradient
            android.graphics.Shader$TileMode r16 = android.graphics.Shader.TileMode.CLAMP
            r9 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r8.f(r2, r7)
            goto L_0x00a0
        L_0x005a:
            int r2 = r17.i()
            long r2 = (long) r2
            p.d<android.graphics.RadialGradient> r8 = r0.r
            java.lang.Object r7 = r8.d(r2, r7)
            android.graphics.RadialGradient r7 = (android.graphics.RadialGradient) r7
            if (r7 == 0) goto L_0x006a
            goto L_0x00a0
        L_0x006a:
            java.lang.Object r6 = r6.f()
            android.graphics.PointF r6 = (android.graphics.PointF) r6
            java.lang.Object r5 = r5.f()
            android.graphics.PointF r5 = (android.graphics.PointF) r5
            java.lang.Object r4 = r4.f()
            f2.c r4 = (f2.c) r4
            int[] r7 = r4.f4309b
            int[] r13 = r0.e(r7)
            float[] r14 = r4.f4308a
            float r10 = r6.x
            float r11 = r6.y
            float r4 = r5.x
            float r5 = r5.y
            float r4 = r4 - r10
            double r6 = (double) r4
            float r5 = r5 - r11
            double r4 = (double) r5
            double r4 = java.lang.Math.hypot(r6, r4)
            float r12 = (float) r4
            android.graphics.RadialGradient r7 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
            r9 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r8.f(r2, r7)
        L_0x00a0:
            r7.setLocalMatrix(r1)
            android.graphics.Paint r2 = r0.f58i
            r2.setShader(r7)
            super.f(r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.i.f(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final String getName() {
        return this.f109o;
    }

    public final void h(i0 i0Var, Object obj) {
        super.h(i0Var, obj);
        if (obj == q.F) {
            m mVar = this.y;
            b bVar = this.f55f;
            if (mVar != null) {
                bVar.n(mVar);
            }
            if (i0Var == null) {
                this.y = null;
                return;
            }
            m mVar2 = new m(i0Var, null);
            this.y = mVar2;
            mVar2.a(this);
            bVar.e(this.y);
        }
    }

    public final int i() {
        float f9 = this.w.f2517d;
        int i8 = this.f114u;
        int round = Math.round(f9 * ((float) i8));
        int round2 = Math.round(this.f116x.f2517d * ((float) i8));
        int round3 = Math.round(this.f115v.f2517d * ((float) i8));
        int i9 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i9 = i9 * 31 * round2;
        }
        return round3 != 0 ? i9 * 31 * round3 : i9;
    }
}
