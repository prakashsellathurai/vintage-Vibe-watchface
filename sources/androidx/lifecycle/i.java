package androidx.lifecycle;

import a8.b;
import j7.d;
import l7.e;
import l7.h;
import p7.p;

@e(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {80}, m = "invokeSuspend")
public final class i extends h implements p<v<Object>, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f1473j;

    /* renamed from: k  reason: collision with root package name */
    public /* synthetic */ Object f1474k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ a8.a<Object> f1475l;

    public static final class a<T> implements b {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ v<T> f1476f;

        public a(v<T> vVar) {
            this.f1476f = vVar;
        }

        public final Object emit(T t8, d<? super h7.h> dVar) {
            Object emit = this.f1476f.emit(t8, dVar);
            return emit == k7.a.f5217f ? emit : h7.h.f4787a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(a8.a<Object> aVar, d<? super i> dVar) {
        super(2, dVar);
        this.f1475l = aVar;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        i iVar = new i(this.f1475l, dVar);
        iVar.f1474k = obj;
        return iVar;
    }

    public final Object g(Object obj, Object obj2) {
        return ((i) c((v) obj, (d) obj2)).h(h7.h.f4787a);
    }

    public final Object h(Object obj) {
        k7.a aVar = k7.a.f5217f;
        int i8 = this.f1473j;
        if (i8 == 0) {
            a1.a.I(obj);
            a aVar2 = new a((v) this.f1474k);
            this.f1473j = 1;
            if (this.f1475l.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            a1.a.I(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return h7.h.f4787a;
    }
}
