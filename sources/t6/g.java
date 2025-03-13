package t6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import s5.x;
import t6.k;
import w5.f;

public class g extends j {
    public g(x xVar) {
        super(xVar);
        this.f7525d = new k();
    }

    public void c(Canvas canvas, Paint paint) {
        RectF b9 = b();
        canvas.drawRect(b9.left, b9.top, b9.right, b9.bottom, paint);
    }

    public final void d(RectF rectF) {
        this.f7525d.d(k.a.X, new f(rectF.left));
        this.f7525d.d(k.a.Y, new f(rectF.top));
        this.f7525d.d(k.a.WIDTH, new f(rectF.width()));
        this.f7525d.d(k.a.HEIGHT, new f(rectF.height()));
    }
}
