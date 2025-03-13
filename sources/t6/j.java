package t6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import e7.d;
import e7.i;
import e7.k;
import s5.x;
import t6.k;
import u6.a;
import u6.b;
import w5.f;

public abstract class j implements d {

    /* renamed from: a  reason: collision with root package name */
    public final k f7522a;

    /* renamed from: b  reason: collision with root package name */
    public b f7523b;

    /* renamed from: c  reason: collision with root package name */
    public a f7524c;

    /* renamed from: d  reason: collision with root package name */
    public i f7525d;
    public final d e;

    /* renamed from: f  reason: collision with root package name */
    public PointF f7526f = new PointF(1.0f, 1.0f);

    public j(x xVar) {
        this.e = xVar;
        this.f7522a = new k(this);
    }

    public final f a(i.a aVar) {
        return this.f7525d.b(aVar);
    }

    public RectF b() {
        float d9 = a(k.a.X).d() * this.f7526f.x;
        float d10 = a(k.a.Y).d() * this.f7526f.y;
        return new RectF(d9, d10, (a(k.a.WIDTH).d() * this.f7526f.x) + d9, (a(k.a.HEIGHT).d() * this.f7526f.y) + d10);
    }

    public abstract void c(Canvas canvas, Paint paint);

    public final void e(i.a aVar, f fVar) {
        this.f7525d.d(aVar, fVar);
        ((x) this.e).a();
    }
}
