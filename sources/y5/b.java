package y5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

public final class b extends e {
    public b(RectF rectF, RectF rectF2, float f9, Matrix matrix) {
        super(rectF, rectF2, f9, matrix);
    }

    public final Path c(RectF rectF) {
        Path path = new Path();
        this.f8521c = path;
        path.addRect(rectF, Path.Direction.CW);
        return this.f8521c;
    }
}
