package y5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

public final class d extends e {

    /* renamed from: f  reason: collision with root package name */
    public final float f8518f;

    public d(RectF rectF, RectF rectF2, float f9, float f10, Matrix matrix) {
        super(rectF, rectF2, f9, matrix);
        this.f8518f = f10;
    }

    public final Path c(RectF rectF) {
        Path path = new Path();
        this.f8521c = path;
        float f9 = this.f8518f;
        path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
        return this.f8521c;
    }
}
