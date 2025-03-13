package t6;

import android.graphics.Canvas;
import android.graphics.Paint;
import s5.x;
import t6.i;

public final class h extends g {
    public h(x xVar) {
        super(xVar);
        this.f7525d = new i();
    }

    public final void c(Canvas canvas, Paint paint) {
        canvas.drawRoundRect(b(), a(i.a.CORNER_RADIUS_X).d(), a(i.a.CORNER_RADIUS_Y).d(), paint);
    }
}
