package y7;

import a1.a;
import j7.f;
import k3.j;
import y7.x;

public final class y {
    public static final void a(f fVar, Throwable th) {
        try {
            x xVar = (x) fVar.d(x.a.f8624f);
            if (xVar != null) {
                xVar.j(fVar, th);
            } else {
                j.D(fVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                a.f(runtimeException, th);
                th = runtimeException;
            }
            j.D(fVar, th);
        }
    }
}
