package v0;

import androidx.lifecycle.j0;
import androidx.lifecycle.l0;
import q7.k;

public final class b implements l0.b {

    /* renamed from: a  reason: collision with root package name */
    public final d<?>[] f7833a;

    public b(d<?>... dVarArr) {
        k.e(dVarArr, "initializers");
        this.f7833a = dVarArr;
    }

    public final j0 b(Class cls, c cVar) {
        j0 j0Var = null;
        for (d<?> dVar : this.f7833a) {
            if (k.a(dVar.f7834a, cls)) {
                T invoke = dVar.f7835b.invoke(cVar);
                j0Var = invoke instanceof j0 ? (j0) invoke : null;
            }
        }
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
