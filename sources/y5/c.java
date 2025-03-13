package y5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

public final class c extends e {
    public c(RectF rectF, RectF rectF2, float f9, Matrix matrix) {
        super(rectF, rectF2, f9, matrix);
    }

    public final Path c(RectF rectF) {
        Path path = new Path();
        this.f8521c = path;
        path.addOval(rectF, Path.Direction.CCW);
        return this.f8521c;
    }
}
