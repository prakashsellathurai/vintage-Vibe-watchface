package y5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public final RectF f8519a;

    /* renamed from: b  reason: collision with root package name */
    public final RectF f8520b;

    /* renamed from: c  reason: collision with root package name */
    public Path f8521c;

    /* renamed from: d  reason: collision with root package name */
    public final float f8522d;
    public final Matrix e;

    public e(RectF rectF, RectF rectF2, float f9, Matrix matrix) {
        this.f8519a = rectF;
        this.f8520b = rectF2;
        this.f8522d = f9;
        this.e = matrix;
    }

    public final RectF a() {
        RectF b9 = b(0.0f);
        RectF rectF = this.f8519a;
        b9.offset(rectF.left, rectF.top);
        return b9;
    }

    public final RectF b(float f9) {
        RectF rectF = new RectF(this.f8520b);
        float f10 = this.f8522d;
        float f11 = f9 / 2.0f;
        rectF.inset((-f10) + f11, (-f10) + f11);
        return rectF;
    }

    public abstract Path c(RectF rectF);

    public final Path d(float f9) {
        Path e4 = e(f9);
        Matrix matrix = new Matrix();
        RectF rectF = this.f8519a;
        matrix.setTranslate(-rectF.left, -rectF.top);
        e4.transform(matrix);
        PointF pointF = new PointF(rectF.left - f().left, rectF.top - f().top);
        Matrix matrix2 = new Matrix();
        matrix2.setTranslate(pointF.x, pointF.y);
        e4.transform(matrix2);
        return e4;
    }

    public final Path e(float f9) {
        Path c9 = c(b(f9));
        c9.transform(this.e);
        return c9;
    }

    public RectF f() {
        Path c9 = c(b(0.0f));
        c9.transform(this.e);
        RectF rectF = new RectF();
        c9.computeBounds(rectF, true);
        return rectF;
    }
}
