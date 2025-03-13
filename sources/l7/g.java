package l7;

import j7.d;
import j7.f;

public abstract class g extends a {
    public g(d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.a() == j7.g.f5052f)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public final f a() {
        return j7.g.f5052f;
    }
}
