package n1;

import c1.c;
import j7.d;
import j7.f;
import k3.j;
import l7.e;
import l7.h;
import n1.t0;
import p7.l;
import p7.p;
import s.g;
import y7.z;

@e(c = "androidx.wear.watchface.WatchFaceService$Companion$awaitDeferredThenRunTaskOnThread$1$1", f = "WatchFaceService.kt", l = {385}, m = "invokeSuspend")
public final class s0 extends h implements p<z, d<Object>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f5716j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p<t0.c, d<Object>, Object> f5717k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ t0.c f5718l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f5719m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ l<Object, Object> f5720n;

    @e(c = "androidx.wear.watchface.WatchFaceService$Companion$awaitDeferredThenRunTaskOnThread$1$1$1", f = "WatchFaceService.kt", l = {386, 389}, m = "invokeSuspend")
    public static final class a extends h implements p<z, d<Object>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f5721j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ p<t0.c, d<Object>, Object> f5722k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t0.c f5723l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ int f5724m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ l<Object, Object> f5725n;

        @e(c = "androidx.wear.watchface.WatchFaceService$Companion$awaitDeferredThenRunTaskOnThread$1$1$1$1", f = "WatchFaceService.kt", l = {}, m = "invokeSuspend")
        /* renamed from: n1.s0$a$a  reason: collision with other inner class name */
        public static final class C0090a extends h implements p<z, d<Object>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ l<Object, Object> f5726j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ Object f5727k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0090a(Object obj, d dVar, l lVar) {
                super(2, dVar);
                this.f5726j = lVar;
                this.f5727k = obj;
            }

            public final d<h7.h> c(Object obj, d<?> dVar) {
                return new C0090a(this.f5727k, dVar, this.f5726j);
            }

            public final Object g(Object obj, Object obj2) {
                return ((C0090a) c((z) obj, (d) obj2)).h(h7.h.f4787a);
            }

            public final Object h(Object obj) {
                a1.a.I(obj);
                return this.f5726j.invoke(this.f5727k);
            }
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [int, java.lang.Object] */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(p7.p<? super n1.t0.c, ? super j7.d<java.lang.Object>, ? extends java.lang.Object> r1, n1.t0.c r2, java.lang.Object r3, p7.l<java.lang.Object, java.lang.Object> r4, j7.d<? super n1.s0.a> r5) {
            /*
                r0 = this;
                r0.f5722k = r1
                r0.f5723l = r2
                r0.f5724m = r3
                r0.f5725n = r4
                r1 = 2
                r0.<init>(r1, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n1.s0.a.<init>(p7.p, n1.t0$c, int, p7.l, j7.d):void");
        }

        public final d<h7.h> c(Object obj, d<?> dVar) {
            return new a(this.f5722k, this.f5723l, this.f5724m, this.f5725n, dVar);
        }

        public final Object g(Object obj, Object obj2) {
            return ((a) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        }

        public final Object h(Object obj) {
            k7.a aVar = k7.a.f5217f;
            int i8 = this.f5721j;
            t0.c cVar = this.f5723l;
            if (i8 == 0) {
                a1.a.I(obj);
                this.f5721j = 1;
                obj = this.f5722k.g(cVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                a1.a.I(obj);
            } else if (i8 == 2) {
                a1.a.I(obj);
                return obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int b9 = g.b(this.f5724m);
            l<Object, Object> lVar = this.f5725n;
            if (b9 == 0) {
                f fVar = cVar.f5744d.f2836f;
                C0090a aVar2 = new C0090a(obj, (d) null, lVar);
                this.f5721j = 2;
                obj = j.i0(fVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
                return obj;
            } else if (b9 == 1) {
                return lVar.invoke(obj);
            } else {
                throw new c();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [int, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s0(p7.p<? super n1.t0.c, ? super j7.d<java.lang.Object>, ? extends java.lang.Object> r1, n1.t0.c r2, java.lang.Object r3, p7.l<java.lang.Object, java.lang.Object> r4, j7.d<? super n1.s0> r5) {
        /*
            r0 = this;
            r0.f5717k = r1
            r0.f5718l = r2
            r0.f5719m = r3
            r0.f5720n = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.s0.<init>(p7.p, n1.t0$c, int, p7.l, j7.d):void");
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new s0(this.f5717k, this.f5718l, this.f5719m, this.f5720n, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        return ((s0) c((z) obj, (d) obj2)).h(h7.h.f4787a);
    }

    public final Object h(Object obj) {
        k7.a aVar = k7.a.f5217f;
        int i8 = this.f5716j;
        if (i8 == 0) {
            a1.a.I(obj);
            a aVar2 = new a(this.f5717k, this.f5718l, this.f5719m, this.f5720n, (d<? super a>) null);
            this.f5716j = 1;
            obj = j.j0(10000, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            a1.a.I(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
