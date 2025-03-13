package o6;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.EnumSet;
import n6.d;
import o6.g;

public final class t extends i {
    public g H = null;
    public final d I = new d(1.0f, 1.0f);
    public final PointF J = new PointF(0.0f, 0.0f);

    public t() {
        super((q) null, false);
        this.y = EnumSet.of(g.a.f6150f);
    }

    public final void O(float f9, float f10) {
        d dVar = this.I;
        dVar.f5961a = f9;
        dVar.f5962b = f10;
    }

    public final void P() {
    }

    public final void R() {
    }

    public final void S() {
        Matrix matrix = this.f6139m;
        PointF pointF = this.J;
        matrix.setTranslate(pointF.x, pointF.y);
        d dVar = this.I;
        matrix.preScale(dVar.f5961a, dVar.f5962b);
    }
}
