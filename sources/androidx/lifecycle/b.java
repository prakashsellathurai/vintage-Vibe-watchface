package androidx.lifecycle;

import j7.d;
import java.util.concurrent.CancellationException;
import k7.a;
import l7.e;
import l7.h;
import p7.p;
import y7.h0;
import y7.z;
import y7.z0;

@e(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {188}, m = "invokeSuspend")
public final class b extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f1428j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ d<Object> f1429k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(d<Object> dVar, d<? super b> dVar2) {
        super(2, dVar2);
        this.f1429k = dVar;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new b(this.f1429k, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        return ((b) c((z) obj, (d) obj2)).h(h7.h.f4787a);
    }

    public final Object h(Object obj) {
        a aVar = a.f5217f;
        int i8 = this.f1428j;
        boolean z8 = true;
        d<Object> dVar = this.f1429k;
        if (i8 == 0) {
            a1.a.I(obj);
            long j8 = dVar.f1438c;
            this.f1428j = 1;
            if (h0.a(j8, this) == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            a1.a.I(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (dVar.f1436a.f1407c <= 0) {
            z8 = false;
        }
        if (!z8) {
            z0 z0Var = dVar.f1440f;
            if (z0Var != null) {
                z0Var.H((CancellationException) null);
            }
            dVar.f1440f = null;
        }
        return h7.h.f4787a;
    }
}
