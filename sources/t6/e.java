package t6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import s5.x;
import t6.f;

public final class e extends j {
    public e(x xVar, float f9, float f10, float f11, float f12) {
        super(xVar);
        f fVar = new f();
        this.f7525d = fVar;
        fVar.d(f.a.START_X, new w5.f(f9));
        this.f7525d.d(f.a.START_Y, new w5.f(f10));
        this.f7525d.d(f.a.END_X, new w5.f(f11));
        this.f7525d.d(f.a.END_Y, new w5.f(f12));
    }

    public final void c(Canvas canvas, Paint paint) {
        PointF pointF = new PointF(a(f.a.START_X).d() * this.f7526f.x, a(f.a.START_Y).d() * this.f7526f.y);
        PointF pointF2 = new PointF(a(f.a.END_X).d() * this.f7526f.x, a(f.a.END_Y).d() * this.f7526f.y);
        canvas.drawLine(pointF.x, pointF.y, pointF2.x, pointF2.y, paint);
    }
}
