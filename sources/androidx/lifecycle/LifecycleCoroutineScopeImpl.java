package androidx.lifecycle;

import androidx.lifecycle.m;
import j7.f;
import java.util.concurrent.CancellationException;
import q7.k;
import y7.z0;

public final class LifecycleCoroutineScopeImpl extends n implements p {

    /* renamed from: f  reason: collision with root package name */
    public final m f1402f;

    /* renamed from: g  reason: collision with root package name */
    public final f f1403g;

    public LifecycleCoroutineScopeImpl(m mVar, f fVar) {
        z0 z0Var;
        k.e(fVar, "coroutineContext");
        this.f1402f = mVar;
        this.f1403g = fVar;
        if (((s) mVar).f1503d == m.b.f1491f && (z0Var = (z0) fVar.d(z0.b.f8628f)) != null) {
            z0Var.H((CancellationException) null);
        }
    }

    public final void c(r rVar, m.a aVar) {
        m mVar = this.f1402f;
        if (((s) mVar).f1503d.compareTo(m.b.f1491f) <= 0) {
            mVar.b(this);
            z0 z0Var = (z0) this.f1403g.d(z0.b.f8628f);
            if (z0Var != null) {
                z0Var.H((CancellationException) null);
            }
        }
    }

    public final f f() {
        return this.f1403g;
    }
}
