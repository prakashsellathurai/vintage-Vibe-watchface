package b2;

import android.graphics.PointF;
import androidx.fragment.app.i0;
import java.util.List;
import k2.f;
import l2.a;

public final class c extends f<Float> {
    public c(List<a<Float>> list) {
        super(list);
    }

    public final Object g(a aVar, float f9) {
        return Float.valueOf(m(aVar, f9));
    }

    public final float l() {
        return m(b(), d());
    }

    public final float m(a<Float> aVar, float f9) {
        if (aVar.f5269b == null || aVar.f5270c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        i0 i0Var = this.e;
        T t8 = aVar.f5269b;
        if (i0Var != null) {
            aVar.f5274h.floatValue();
            T t9 = aVar.f5270c;
            e();
            Float f10 = (Float) i0Var.j(t8, t9);
            if (f10 != null) {
                return f10.floatValue();
            }
        }
        if (aVar.f5275i == -3987645.8f) {
            aVar.f5275i = ((Float) t8).floatValue();
        }
        float f11 = aVar.f5275i;
        if (aVar.f5276j == -3987645.8f) {
            aVar.f5276j = ((Float) aVar.f5270c).floatValue();
        }
        float f12 = aVar.f5276j;
        PointF pointF = f.f5117a;
        return f11 + (f9 * (f12 - f11));
    }
}
