package o6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import java.util.Collection;
import y5.e;

public final class b extends i {
    public e H = null;
    public boolean I = true;

    public b(q qVar) {
        super(qVar, true);
    }

    public final boolean F(String str, Matrix matrix, Point point) {
        if (!this.I) {
            return false;
        }
        return super.F(str, matrix, point);
    }

    public final boolean H(Canvas canvas) {
        canvas.save();
        e eVar = this.H;
        if (eVar != null) {
            canvas.clipPath(eVar.e(0.0f));
        }
        boolean I2 = I(canvas, (Collection<Integer>) null);
        canvas.restore();
        return I2;
    }
}
