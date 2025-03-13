package u5;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f7786a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final RectF f7787b;

    /* renamed from: c  reason: collision with root package name */
    public final PointF f7788c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f7789d;

    public b(RectF rectF, Matrix matrix, PointF pointF) {
        this.f7787b = rectF;
        this.f7788c = new PointF(pointF.x, pointF.y);
        this.f7789d = new Matrix(matrix);
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();
}
