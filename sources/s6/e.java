package s6;

import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import s6.f;

public final class e extends a {
    public e(PointF pointF, float f9, int[] iArr, float[] fArr) {
        super(fArr, iArr);
        f fVar = new f();
        this.e = fVar;
        fVar.d(f.a.CENTER_X, new w5.f(pointF.x));
        this.e.d(f.a.CENTER_Y, new w5.f(pointF.y));
        this.e.d(f.a.RADIUS, new w5.f(f9));
        b();
    }

    public final void b() {
        PointF pointF = new PointF(this.e.b(f.a.CENTER_X).d(), this.e.b(f.a.CENTER_Y).d());
        float d9 = this.e.b(f.a.RADIUS).d();
        float f9 = pointF.x;
        PointF pointF2 = this.f7258f;
        float f10 = pointF2.x;
        float f11 = f9 * f10;
        float f12 = pointF.y;
        float f13 = pointF2.y;
        this.f7254a = new RadialGradient(f11, f12 * f13, d9 * Math.min(f10, f13), this.f7255b, this.f7256c, Shader.TileMode.CLAMP);
    }
}
