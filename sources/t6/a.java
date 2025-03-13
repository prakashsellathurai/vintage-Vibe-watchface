package t6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.SizeF;
import n6.a;
import s5.x;
import t6.b;
import t6.k;
import w5.f;

public final class a extends j {

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7502g;

    public a(x xVar, PointF pointF, SizeF sizeF, float f9, float f10, boolean z8) {
        super(xVar);
        b bVar = new b();
        this.f7525d = bVar;
        bVar.d(b.a.CENTER_X, new f(pointF.x));
        this.f7525d.d(b.a.CENTER_Y, new f(pointF.y));
        this.f7525d.d(k.a.WIDTH, new f(sizeF.getWidth()));
        this.f7525d.d(k.a.HEIGHT, new f(sizeF.getHeight()));
        this.f7525d.d(b.a.START_ANGLE, new f(f9));
        this.f7525d.d(b.a.END_ANGLE, new f(f10));
        this.f7502g = z8;
    }

    public final RectF b() {
        float d9 = a(b.a.CENTER_X).d() * this.f7526f.x;
        float d10 = a(b.a.CENTER_Y).d() * this.f7526f.y;
        float d11 = (a(k.a.WIDTH).d() * this.f7526f.x) / 2.0f;
        float d12 = (a(k.a.HEIGHT).d() * this.f7526f.y) / 2.0f;
        return new RectF(d9 - d11, d10 - d12, d9 + d11, d10 + d12);
    }

    public final void c(Canvas canvas, Paint paint) {
        a.C0095a b9 = n6.a.b(a(b.a.START_ANGLE).d() - 0.049804688f, a(b.a.END_ANGLE).d() - 0.049804688f, Boolean.valueOf(this.f7502g));
        canvas.drawArc(b(), b9.f5956a, b9.f5957b, false, paint);
    }
}
