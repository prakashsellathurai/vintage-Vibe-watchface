package b2;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import l2.a;
import y1.f;

public final class g extends a<PointF> {

    /* renamed from: q  reason: collision with root package name */
    public Path f2529q;
    public final a<PointF> r;

    public g(f fVar, a<PointF> aVar) {
        super(fVar, aVar.f5269b, aVar.f5270c, aVar.f5271d, aVar.e, aVar.f5272f, aVar.f5273g, aVar.f5274h);
        this.r = aVar;
        d();
    }

    public final void d() {
        T t8;
        T t9 = this.f5270c;
        T t10 = this.f5269b;
        boolean z8 = (t9 == null || t10 == null || !((PointF) t10).equals(((PointF) t9).x, ((PointF) t9).y)) ? false : true;
        if (t10 != null && (t8 = this.f5270c) != null && !z8) {
            PointF pointF = (PointF) t10;
            PointF pointF2 = (PointF) t8;
            a<PointF> aVar = this.r;
            PointF pointF3 = aVar.f5281o;
            PointF pointF4 = aVar.f5282p;
            ThreadLocal<PathMeasure> threadLocal = k2.g.f5118a;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
                path.lineTo(pointF2.x, pointF2.y);
            } else {
                float f9 = pointF.x;
                float f10 = pointF2.x;
                float f11 = pointF2.y;
                path.cubicTo(pointF3.x + f9, pointF.y + pointF3.y, f10 + pointF4.x, f11 + pointF4.y, f10, f11);
            }
            this.f2529q = path;
        }
    }
}
