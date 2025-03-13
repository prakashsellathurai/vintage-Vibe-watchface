package b2;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import androidx.fragment.app.i0;
import java.util.List;
import l2.a;

public final class h extends f<PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f2530i = new PointF();

    /* renamed from: j  reason: collision with root package name */
    public final float[] f2531j = new float[2];

    /* renamed from: k  reason: collision with root package name */
    public final PathMeasure f2532k = new PathMeasure();

    /* renamed from: l  reason: collision with root package name */
    public g f2533l;

    public h(List<? extends a<PointF>> list) {
        super(list);
    }

    public final Object g(a aVar, float f9) {
        g gVar = (g) aVar;
        Path path = gVar.f2529q;
        if (path == null) {
            return (PointF) aVar.f5269b;
        }
        i0 i0Var = this.e;
        if (i0Var != null) {
            gVar.f5274h.floatValue();
            T t8 = gVar.f5270c;
            e();
            PointF pointF = (PointF) i0Var.j(gVar.f5269b, t8);
            if (pointF != null) {
                return pointF;
            }
        }
        g gVar2 = this.f2533l;
        PathMeasure pathMeasure = this.f2532k;
        if (gVar2 != gVar) {
            pathMeasure.setPath(path, false);
            this.f2533l = gVar;
        }
        float[] fArr = this.f2531j;
        pathMeasure.getPosTan(f9 * pathMeasure.getLength(), fArr, (float[]) null);
        PointF pointF2 = this.f2530i;
        pointF2.set(fArr[0], fArr[1]);
        return pointF2;
    }
}
