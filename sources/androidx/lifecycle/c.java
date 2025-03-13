package androidx.lifecycle;

import j7.d;
import k7.a;
import l7.e;
import l7.h;
import p7.p;
import y7.z;

@e(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {177}, m = "invokeSuspend")
public final class c extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f1431j;

    /* renamed from: k  reason: collision with root package name */
    public /* synthetic */ Object f1432k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ d<Object> f1433l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d<Object> dVar, d<? super c> dVar2) {
        super(2, dVar2);
        this.f1433l = dVar;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        c cVar = new c(this.f1433l, dVar);
        cVar.f1432k = obj;
        return cVar;
    }

    public final Object g(Object obj, Object obj2) {
        return ((c) c((z) obj, (d) obj2)).h(h7.h.f4787a);
    }

    public final Object h(Object obj) {
        a aVar = a.f5217f;
        int i8 = this.f1431j;
        d<Object> dVar = this.f1433l;
        if (i8 == 0) {
            a1.a.I(obj);
            w wVar = new w(dVar.f1436a, ((z) this.f1432k).f());
            p<v<T>, d<? super h7.h>, Object> pVar = dVar.f1437b;
            this.f1431j = 1;
            if (pVar.g(wVar, this) == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            a1.a.I(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dVar.e.invoke();
        return h7.h.f4787a;
    }
}
