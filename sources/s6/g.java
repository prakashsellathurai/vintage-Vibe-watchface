package s6;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.SweepGradient;
import e7.i;
import n6.a;
import s6.h;
import w5.f;

public final class g extends a {

    /* renamed from: h  reason: collision with root package name */
    public final boolean f7273h;

    public g(PointF pointF, float f9, float f10, boolean z8, int[] iArr, float[] fArr) {
        super(fArr, iArr);
        h hVar = new h();
        this.e = hVar;
        hVar.d(h.a.CENTER_X, new f(pointF.x));
        this.e.d(h.a.CENTER_Y, new f(pointF.y));
        this.e.d(h.a.START_ANGLE, new f(f9));
        this.e.d(h.a.END_ANGLE, new f(f10));
        this.f7273h = z8;
        b();
    }

    public final void b() {
        PointF pointF = new PointF(this.e.b(h.a.CENTER_X).d(), this.e.b(h.a.CENTER_Y).d());
        float f9 = pointF.x;
        PointF pointF2 = this.f7258f;
        float f10 = f9 * pointF2.x;
        float f11 = pointF.y * pointF2.y;
        i iVar = this.e;
        h.a aVar = h.a.START_ANGLE;
        float d9 = iVar.b(aVar).d();
        float d10 = this.e.b(h.a.END_ANGLE).d();
        boolean z8 = this.f7273h;
        a.C0095a b9 = a.b(d9, d10, Boolean.valueOf(z8));
        Matrix matrix = new Matrix();
        matrix.setRotate(this.e.b(aVar).d() - 0.049804688f, f10, f11);
        int[] iArr = this.f7255b;
        if (!z8) {
            int[] iArr2 = new int[iArr.length];
            for (int i8 = 0; i8 < iArr.length; i8++) {
                iArr2[i8] = iArr[(iArr.length - 1) - i8];
            }
            iArr = iArr2;
        }
        float[] fArr = this.f7256c;
        float[] fArr2 = new float[fArr.length];
        for (int i9 = 0; i9 < fArr.length; i9++) {
            float abs = Math.abs(b9.f5957b);
            if (z8) {
                fArr2[i9] = (abs * fArr[i9]) / 360.0f;
            } else {
                fArr2[i9] = 1.0f - ((abs * fArr[(fArr.length - i9) - 1]) / 360.0f);
            }
        }
        SweepGradient sweepGradient = new SweepGradient(f10, f11, iArr, fArr2);
        this.f7254a = sweepGradient;
        sweepGradient.setLocalMatrix(matrix);
    }
}
