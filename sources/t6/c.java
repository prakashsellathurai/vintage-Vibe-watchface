package t6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import s5.x;
import t6.k;
import w5.f;

public final class c extends j {
    public c(x xVar, RectF rectF) {
        super(xVar);
        k kVar = new k();
        this.f7525d = kVar;
        kVar.d(k.a.X, new f(rectF.left));
        this.f7525d.d(k.a.Y, new f(rectF.top));
        this.f7525d.d(k.a.WIDTH, new f(rectF.width()));
        this.f7525d.d(k.a.HEIGHT, new f(rectF.height()));
    }

    public final void c(Canvas canvas, Paint paint) {
        canvas.drawOval(b(), paint);
    }
}
