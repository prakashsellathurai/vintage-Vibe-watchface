package b2;

import android.graphics.PointF;
import androidx.fragment.app.i0;
import java.util.List;
import k2.f;
import l2.a;

public final class e extends f<Integer> {
    public e(List<a<Integer>> list) {
        super(list);
    }

    public final Object g(a aVar, float f9) {
        return Integer.valueOf(l(aVar, f9));
    }

    public final int l(a<Integer> aVar, float f9) {
        if (aVar.f5269b == null || aVar.f5270c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        i0 i0Var = this.e;
        T t8 = aVar.f5269b;
        if (i0Var != null) {
            aVar.f5274h.floatValue();
            T t9 = aVar.f5270c;
            e();
            Integer num = (Integer) i0Var.j(t8, t9);
            if (num != null) {
                return num.intValue();
            }
        }
        if (aVar.f5277k == 784923401) {
            aVar.f5277k = ((Integer) t8).intValue();
        }
        int i8 = aVar.f5277k;
        if (aVar.f5278l == 784923401) {
            aVar.f5278l = ((Integer) aVar.f5270c).intValue();
        }
        int i9 = aVar.f5278l;
        PointF pointF = f.f5117a;
        return (int) (((float) i8) + (f9 * ((float) (i9 - i8))));
    }
}
