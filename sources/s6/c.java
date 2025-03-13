package s6;

import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.Shader;
import t6.f;

public final class c extends a {
    public c(float f9, float f10, float f11, float f12, int[] iArr, float[] fArr) {
        super(fArr, iArr);
        f fVar = new f();
        this.e = fVar;
        fVar.d(d.START_X, new w5.f(f9));
        this.e.d(d.START_Y, new w5.f(f10));
        this.e.d(d.END_X, new w5.f(f11));
        this.e.d(d.END_Y, new w5.f(f12));
        b();
    }

    public final void b() {
        PointF pointF = new PointF(this.e.b(d.START_X).d(), this.e.b(d.START_Y).d());
        PointF pointF2 = new PointF(this.e.b(d.END_X).d(), this.e.b(d.END_Y).d());
        float f9 = pointF.x;
        PointF pointF3 = this.f7258f;
        float f10 = pointF3.x;
        float f11 = pointF.y;
        float f12 = pointF3.y;
        this.f7254a = new LinearGradient(f9 * f10, f11 * f12, pointF2.x * f10, pointF2.y * f12, this.f7255b, this.f7256c, Shader.TileMode.CLAMP);
    }
}
