package n1;

import a8.b;
import a8.f;
import android.view.Surface;
import c1.c;
import j7.d;
import l7.e;
import l7.h;
import p7.p;
import q7.k;
import y7.z;

@e(c = "androidx.wear.watchface.WatchFaceImpl$3", f = "WatchFace.kt", l = {832}, m = "invokeSuspend")
public final class n0 extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f5672j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p0 f5673k;

    public static final class a<T> implements b {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ p0 f5674f;

        public a(p0 p0Var) {
            this.f5674f = p0Var;
        }

        public final Object emit(Object obj, d dVar) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                b0 b0Var = this.f5674f.f5692k;
                if (b0Var.f5516c.getSurface().isValid()) {
                    Surface surface = b0Var.f5516c.getSurface();
                    k.d(surface, "renderer.surfaceHolder.surface");
                    surface.setFrameRate(booleanValue ? 10.0f : 0.0f, 0);
                }
            }
            return h7.h.f4787a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n0(p0 p0Var, d<? super n0> dVar) {
        super(2, dVar);
        this.f5673k = p0Var;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new n0(this.f5673k, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        ((n0) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        return k7.a.f5217f;
    }

    public final Object h(Object obj) {
        k7.a aVar = k7.a.f5217f;
        int i8 = this.f5672j;
        if (i8 == 0) {
            a1.a.I(obj);
            p0 p0Var = this.f5673k;
            f<Boolean> fVar = p0Var.f5684b.f5633c;
            a aVar2 = new a(p0Var);
            this.f5672j = 1;
            if (fVar.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i8 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            a1.a.I(obj);
        }
        throw new c();
    }
}
