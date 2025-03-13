package b2;

import androidx.fragment.app.i0;
import java.util.List;
import k2.f;
import k3.j;
import l2.a;

public final class b extends f<Integer> {
    public b(List<a<Integer>> list) {
        super(list);
    }

    public final Object g(a aVar, float f9) {
        return Integer.valueOf(l(aVar, f9));
    }

    public final int l(a<Integer> aVar, float f9) {
        T t8 = aVar.f5269b;
        if (t8 == null || aVar.f5270c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) t8).intValue();
        int intValue2 = ((Integer) aVar.f5270c).intValue();
        i0 i0Var = this.e;
        if (i0Var != null) {
            aVar.f5274h.floatValue();
            Integer valueOf = Integer.valueOf(intValue);
            Integer valueOf2 = Integer.valueOf(intValue2);
            e();
            Integer num = (Integer) i0Var.j(valueOf, valueOf2);
            if (num != null) {
                return num.intValue();
            }
        }
        return j.u(f.b(f9, 0.0f, 1.0f), intValue, intValue2);
    }
}
