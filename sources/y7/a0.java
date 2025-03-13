package y7;

import c8.c;
import j7.f;
import java.util.concurrent.CancellationException;
import y7.z0;

public final class a0 {
    public static final c a(f fVar) {
        if (fVar.d(z0.b.f8628f) == null) {
            fVar = fVar.t(new c1((z0) null));
        }
        return new c(fVar);
    }

    public static void b(c cVar) {
        z0 z0Var = (z0) cVar.f2836f.d(z0.b.f8628f);
        if (z0Var != null) {
            z0Var.H((CancellationException) null);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + cVar).toString());
    }
}
