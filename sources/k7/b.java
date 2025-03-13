package k7;

import a1.a;
import j7.d;
import l7.g;
import p7.p;
import q7.k;
import q7.s;

public final class b extends g {

    /* renamed from: g  reason: collision with root package name */
    public int f5219g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ p f5220h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f5221i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Object obj, d dVar, p pVar) {
        super(dVar);
        this.f5220h = pVar;
        this.f5221i = obj;
        k.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    public final Object h(Object obj) {
        int i8 = this.f5219g;
        if (i8 == 0) {
            this.f5219g = 1;
            a.I(obj);
            p pVar = this.f5220h;
            k.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            s.a(2, pVar);
            return pVar.g(this.f5221i, this);
        } else if (i8 == 1) {
            this.f5219g = 2;
            a.I(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
