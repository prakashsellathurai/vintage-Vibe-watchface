package n1;

import a8.f;
import android.app.KeyguardManager;
import android.content.Intent;
import j7.d;
import k3.j;
import kotlinx.coroutines.flow.MutableStateFlow;
import l7.e;
import l7.h;
import n1.c;
import p7.p;
import q7.k;
import y7.e0;
import y7.g1;
import y7.o;
import y7.z;

public final class b implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public final j1 f5499a;

    /* renamed from: b  reason: collision with root package name */
    public final j0 f5500b;

    /* renamed from: c  reason: collision with root package name */
    public final e0<p0> f5501c;

    /* renamed from: d  reason: collision with root package name */
    public final z f5502d;
    public Boolean e;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f5503f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5504g;

    @e(c = "androidx.wear.watchface.BroadcastsObserver$onActionTimeChanged$1", f = "BroadcastsObserver.kt", l = {54}, m = "invokeSuspend")
    public static final class a extends h implements p<z, d<? super h7.h>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f5505j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ b f5506k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, d<? super a> dVar) {
            super(2, dVar);
            this.f5506k = bVar;
        }

        public final d<h7.h> c(Object obj, d<?> dVar) {
            return new a(this.f5506k, dVar);
        }

        public final Object g(Object obj, Object obj2) {
            return ((a) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        }

        public final Object h(Object obj) {
            k7.a aVar = k7.a.f5217f;
            int i8 = this.f5505j;
            if (i8 == 0) {
                a1.a.I(obj);
                e0<p0> e0Var = this.f5506k.f5501c;
                this.f5505j = 1;
                obj = e0Var.M(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                a1.a.I(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p0 p0Var = (p0) obj;
            p0Var.r = p0Var.f5690i.a();
            j0 j0Var = p0Var.f5692k.e;
            if (j0Var != null) {
                j0Var.f();
            }
            return h7.h.f4787a;
        }
    }

    @e(c = "androidx.wear.watchface.BroadcastsObserver$onActionTimeZoneChanged$1", f = "BroadcastsObserver.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: n1.b$b  reason: collision with other inner class name */
    public static final class C0084b extends h implements p<z, d<? super h7.h>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f5507j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ b f5508k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0084b(b bVar, d<? super C0084b> dVar) {
            super(2, dVar);
            this.f5508k = bVar;
        }

        public final d<h7.h> c(Object obj, d<?> dVar) {
            return new C0084b(this.f5508k, dVar);
        }

        public final Object g(Object obj, Object obj2) {
            return ((C0084b) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        }

        public final Object h(Object obj) {
            k7.a aVar = k7.a.f5217f;
            int i8 = this.f5507j;
            if (i8 == 0) {
                a1.a.I(obj);
                e0<p0> e0Var = this.f5508k.f5501c;
                this.f5507j = 1;
                obj = e0Var.M(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                a1.a.I(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j0 j0Var = ((p0) obj).f5692k.e;
            if (j0Var != null) {
                j0Var.f();
            }
            return h7.h.f4787a;
        }
    }

    @e(c = "androidx.wear.watchface.BroadcastsObserver$onMockTime$1", f = "BroadcastsObserver.kt", l = {82}, m = "invokeSuspend")
    public static final class c extends h implements p<z, d<? super h7.h>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f5509j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ b f5510k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Intent f5511l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar, Intent intent, d<? super c> dVar) {
            super(2, dVar);
            this.f5510k = bVar;
            this.f5511l = intent;
        }

        public final d<h7.h> c(Object obj, d<?> dVar) {
            return new c(this.f5510k, this.f5511l, dVar);
        }

        public final Object g(Object obj, Object obj2) {
            return ((c) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        }

        public final Object h(Object obj) {
            k7.a aVar = k7.a.f5217f;
            int i8 = this.f5509j;
            if (i8 == 0) {
                a1.a.I(obj);
                e0<p0> e0Var = this.f5510k.f5501c;
                this.f5509j = 1;
                obj = e0Var.M(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i8 == 1) {
                a1.a.I(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p0 p0Var = (p0) obj;
            p0Var.getClass();
            Intent intent = this.f5511l;
            k.e(intent, "intent");
            x xVar = p0Var.f5695n;
            xVar.f5863a = (double) intent.getFloatExtra("androidx.wear.watchface.extra.MOCK_TIME_SPEED_MULTIPLIER", 1.0f);
            long longExtra = intent.getLongExtra("androidx.wear.watchface.extra.MOCK_TIME_WRAPPING_MIN_TIME", -1);
            xVar.f5864b = longExtra;
            if (longExtra == -1) {
                xVar.f5864b = p0Var.f5690i.a();
            }
            xVar.f5865c = intent.getLongExtra("androidx.wear.watchface.extra.MOCK_TIME_WRAPPING_MAX_TIME", Long.MAX_VALUE);
            return h7.h.f4787a;
        }
    }

    public b(j1 j1Var, j0 j0Var, o oVar, c8.c cVar) {
        k.e(j1Var, "watchState");
        k.e(j0Var, "watchFaceHostApi");
        k.e(oVar, "deferredWatchFaceImpl");
        k.e(cVar, "uiThreadCoroutineScope");
        this.f5499a = j1Var;
        this.f5500b = j0Var;
        this.f5501c = oVar;
        this.f5502d = cVar;
    }

    public final void a(boolean z8) {
        f<Boolean> fVar = this.f5499a.f5633c;
        k.c(fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<kotlin.Boolean?>");
        MutableStateFlow mutableStateFlow = (MutableStateFlow) fVar;
        if (!j.E(mutableStateFlow) || !k.a(Boolean.valueOf(z8), mutableStateFlow.getValue())) {
            mutableStateFlow.setValue(Boolean.valueOf(z8));
            this.f5500b.f();
        }
    }

    public final void b() {
        this.f5500b.b();
    }

    public final void c() {
        this.e = Boolean.FALSE;
        a(false);
    }

    public final void d() {
        this.e = Boolean.TRUE;
        if (k.a(this.f5503f, Boolean.FALSE)) {
            a(true);
        }
    }

    public final void e() {
        j.K(this.f5502d, (g1) null, new a(this, (d<? super a>) null), 3);
    }

    public final void f(Intent intent) {
        k.e(intent, "intent");
        j.K(this.f5502d, (g1) null, new c(this, intent, (d<? super c>) null), 3);
    }

    public final void g() {
        this.f5503f = Boolean.TRUE;
        a(false);
    }

    public final void h() {
        j.K(this.f5502d, (g1) null, new C0084b(this, (d<? super C0084b>) null), 3);
    }

    public final void i() {
        this.f5503f = Boolean.FALSE;
        if (k.a(this.e, Boolean.TRUE)) {
            a(true);
        }
    }

    public final void j() {
        Object systemService = this.f5500b.a().getSystemService("keyguard");
        k.c(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        f<Boolean> fVar = this.f5499a.f5641l;
        k.c(fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<kotlin.Boolean>");
        ((MutableStateFlow) fVar).setValue(Boolean.valueOf(((KeyguardManager) systemService).isDeviceLocked()));
    }

    public final void k() {
        if (!this.f5504g) {
            f<Boolean> fVar = this.f5499a.f5632b;
            k.c(fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<kotlin.Boolean?>");
            ((MutableStateFlow) fVar).setValue(Boolean.TRUE);
        }
    }

    public final void l() {
        f<Boolean> fVar = this.f5499a.f5641l;
        k.c(fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<kotlin.Boolean>");
        ((MutableStateFlow) fVar).setValue(Boolean.FALSE);
    }

    public final void m() {
        if (!this.f5504g) {
            f<Boolean> fVar = this.f5499a.f5632b;
            k.c(fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<kotlin.Boolean?>");
            ((MutableStateFlow) fVar).setValue(Boolean.FALSE);
        }
    }
}
