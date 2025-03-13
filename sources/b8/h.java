package b8;

import c8.q;
import j7.f;
import p7.p;
import q7.l;
import y7.z0;

public final class h extends l implements p<Integer, f.b, Integer> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f<?> f2630f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(f<?> fVar) {
        super(2);
        this.f2630f = fVar;
    }

    public final Object g(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        f.b bVar = (f.b) obj2;
        f.c key = bVar.getKey();
        f.b d9 = this.f2630f.f2624j.d(key);
        int i8 = z0.e;
        if (key != z0.b.f8628f) {
            return Integer.valueOf(bVar != d9 ? Integer.MIN_VALUE : intValue + 1);
        }
        z0 z0Var = (z0) d9;
        z0 z0Var2 = (z0) bVar;
        while (true) {
            if (z0Var2 != null) {
                if (z0Var2 == z0Var || !(z0Var2 instanceof q)) {
                    break;
                }
                z0Var2 = z0Var2.getParent();
            } else {
                z0Var2 = null;
                break;
            }
        }
        if (z0Var2 == z0Var) {
            if (z0Var != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + z0Var2 + ", expected child of " + z0Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
