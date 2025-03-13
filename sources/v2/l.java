package v2;

import java.util.ArrayDeque;
import k3.g;
import v2.m;

public final class l extends g<m.a<Object>, Object> {
    public l() {
        super(500);
    }

    public final void c(Object obj, Object obj2) {
        m.a aVar = (m.a) obj;
        aVar.getClass();
        ArrayDeque arrayDeque = m.a.f7880d;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar);
        }
    }
}
