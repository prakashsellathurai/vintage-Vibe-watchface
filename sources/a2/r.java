package a2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.fragment.app.i0;
import b2.a;
import b2.m;
import g2.b;
import y1.q;

public final class r extends a {

    /* renamed from: o  reason: collision with root package name */
    public final b f157o;

    /* renamed from: p  reason: collision with root package name */
    public final String f158p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f159q;
    public final a<Integer, Integer> r;

    /* renamed from: s  reason: collision with root package name */
    public m f160s;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r(y1.l r14, g2.b r15, f2.n r16) {
        /*
            r13 = this;
            r10 = r13
            r11 = r15
            r12 = r16
            int r0 = r12.f4369g
            r1 = 0
            if (r0 == 0) goto L_0x005b
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
            int r0 = r12.f4370h
            if (r0 == 0) goto L_0x005a
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
            float r5 = r12.f4371i
            e2.a r6 = r12.e
            e2.b r7 = r12.f4368f
            java.util.List<e2.b> r8 = r12.f4366c
            e2.b r9 = r12.f4365b
            r0 = r13
            r1 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f157o = r11
            java.lang.String r0 = r12.f4364a
            r10.f158p = r0
            boolean r0 = r12.f4372j
            r10.f159q = r0
            e2.a r0 = r12.f4367d
            b2.a r0 = r0.a()
            r10.r = r0
            r0.a(r13)
            r15.e(r0)
            return
        L_0x005a:
            throw r1
        L_0x005b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.r.<init>(y1.l, g2.b, f2.n):void");
    }

    public final void f(Canvas canvas, Matrix matrix, int i8) {
        if (!this.f159q) {
            Paint paint = this.f58i;
            b2.b bVar = (b2.b) this.r;
            paint.setColor(bVar.l(bVar.b(), bVar.d()));
            m mVar = this.f160s;
            if (mVar != null) {
                paint.setColorFilter((ColorFilter) mVar.f());
            }
            super.f(canvas, matrix, i8);
        }
    }

    public final String getName() {
        return this.f158p;
    }

    public final void h(i0 i0Var, Object obj) {
        super.h(i0Var, obj);
        Integer num = q.f8300b;
        a<Integer, Integer> aVar = this.r;
        if (obj == num) {
            aVar.k(i0Var);
        } else if (obj == q.E) {
            m mVar = this.f160s;
            b bVar = this.f157o;
            if (mVar != null) {
                bVar.n(mVar);
            }
            if (i0Var == null) {
                this.f160s = null;
                return;
            }
            m mVar2 = new m(i0Var, null);
            this.f160s = mVar2;
            mVar2.a(this);
            bVar.e(aVar);
        }
    }
}
