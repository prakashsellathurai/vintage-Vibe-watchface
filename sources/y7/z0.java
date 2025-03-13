package y7;

import j7.f;
import java.util.concurrent.CancellationException;

public interface z0 extends f.b {
    public static final /* synthetic */ int e = 0;

    public static final class a {
        public static /* synthetic */ m0 a(z0 z0Var, boolean z8, d1 d1Var, int i8) {
            boolean z9 = false;
            if ((i8 & 1) != 0) {
                z8 = false;
            }
            if ((i8 & 2) != 0) {
                z9 = true;
            }
            return z0Var.A(z8, z9, d1Var);
        }
    }

    public static final class b implements f.c<z0> {

        /* renamed from: f  reason: collision with root package name */
        public static final /* synthetic */ b f8628f = new b();
    }

    m0 A(boolean z8, boolean z9, d1 d1Var);

    CancellationException D();

    void H(CancellationException cancellationException);

    boolean c();

    z0 getParent();

    k n(e1 e1Var);

    boolean start();
}
