package k7;

import a1.a;
import j7.d;
import j7.f;
import p7.p;
import q7.k;
import q7.s;

public final class c extends l7.c {

    /* renamed from: i  reason: collision with root package name */
    public int f5222i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ p f5223j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f5224k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar, f fVar, p pVar, Object obj) {
        super(dVar, fVar);
        this.f5223j = pVar;
        this.f5224k = obj;
        k.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    public final Object h(Object obj) {
        int i8 = this.f5222i;
        if (i8 == 0) {
            this.f5222i = 1;
            a.I(obj);
            p pVar = this.f5223j;
            k.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            s.a(2, pVar);
            return pVar.g(this.f5224k, this);
        } else if (i8 == 1) {
            this.f5222i = 2;
            a.I(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
