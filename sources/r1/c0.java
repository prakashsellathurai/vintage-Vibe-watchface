package r1;

import android.util.Log;
import j7.d;
import j7.f;
import k3.j;
import l7.e;
import l7.h;
import n1.a1;
import n1.t0;
import p7.p;
import y7.z;

@e(c = "androidx.wear.watchface.control.InteractiveWatchFaceImpl$onDestroy$1", f = "InteractiveWatchFaceImpl.kt", l = {288}, m = "invokeSuspend")
public final class c0 extends h implements p<z, d<? super Object>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f6690j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ h0 f6691k;

    @e(c = "androidx.wear.watchface.control.InteractiveWatchFaceImpl$onDestroy$1$1", f = "InteractiveWatchFaceImpl.kt", l = {}, m = "invokeSuspend")
    public static final class a extends h implements p<z, d<? super h7.h>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ h0 f6692j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h0 h0Var, d<? super a> dVar) {
            super(2, dVar);
            this.f6692j = h0Var;
        }

        public final d<h7.h> c(Object obj, d<?> dVar) {
            return new a(this.f6692j, dVar);
        }

        public final Object g(Object obj, Object obj2) {
            return ((a) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        }

        public final Object h(Object obj) {
            a1.a.I(obj);
            h0 h0Var = this.f6692j;
            String str = h0Var.f6709b;
            t0.c cVar = h0Var.f6708a;
            if (cVar != null) {
                synchronized (cVar.K) {
                    cVar.v("onEngineDetached", a1.f5498f);
                }
            }
            this.f6692j.f6708a = null;
            return h7.h.f4787a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(h0 h0Var, d<? super c0> dVar) {
        super(2, dVar);
        this.f6691k = h0Var;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new c0(this.f6691k, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        return ((c0) c((z) obj, (d) obj2)).h(h7.h.f4787a);
    }

    public final Object h(Object obj) {
        h0 h0Var = this.f6691k;
        k7.a aVar = k7.a.f5217f;
        int i8 = this.f6690j;
        if (i8 == 0) {
            a1.a.I(obj);
            f f9 = h0Var.f6710c.f();
            a aVar2 = new a(h0Var, (d<? super a>) null);
            this.f6690j = 1;
            if (j.i0(f9, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i8 == 1) {
            try {
                a1.a.I(obj);
            } catch (Exception e) {
                return new Integer(Log.w("InteractiveWatchFaceImpl", "onDestroy failed to call onEngineDetached", e));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return h7.h.f4787a;
    }
}
