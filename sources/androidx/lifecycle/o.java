package androidx.lifecycle;

import a1.a;
import androidx.lifecycle.m;
import j7.d;
import java.util.concurrent.CancellationException;
import l7.e;
import l7.h;
import p7.p;
import y7.z;
import y7.z0;

@e(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
public final class o extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public /* synthetic */ Object f1499j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ LifecycleCoroutineScopeImpl f1500k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, d<? super o> dVar) {
        super(2, dVar);
        this.f1500k = lifecycleCoroutineScopeImpl;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        o oVar = new o(this.f1500k, dVar);
        oVar.f1499j = obj;
        return oVar;
    }

    public final Object g(Object obj, Object obj2) {
        return ((o) c((z) obj, (d) obj2)).h(h7.h.f4787a);
    }

    public final Object h(Object obj) {
        a.I(obj);
        z zVar = (z) this.f1499j;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f1500k;
        if (((s) lifecycleCoroutineScopeImpl.f1402f).f1503d.compareTo(m.b.f1492g) >= 0) {
            lifecycleCoroutineScopeImpl.f1402f.a(lifecycleCoroutineScopeImpl);
        } else {
            z0 z0Var = (z0) zVar.f().d(z0.b.f8628f);
            if (z0Var != null) {
                z0Var.H((CancellationException) null);
            }
        }
        return h7.h.f4787a;
    }
}
