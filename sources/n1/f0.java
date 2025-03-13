package n1;

import a1.a;
import j7.d;
import java.util.HashMap;
import l7.e;
import l7.h;
import n1.b0;
import p7.p;
import q7.k;
import y7.z;

@e(c = "androidx.wear.watchface.Renderer$onDestroyInternal$1", f = "Renderer.kt", l = {}, m = "invokeSuspend")
public final class f0 extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b0 f5554j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0(b0 b0Var, d<? super f0> dVar) {
        super(2, dVar);
        this.f5554j = b0Var;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new f0(this.f5554j, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        return ((f0) c((z) obj, (d) obj2)).h(h7.h.f4787a);
    }

    public final Object h(Object obj) {
        a.I(obj);
        HashMap<String, d0> hashMap = b0.f5512l;
        b0 b0Var = this.f5554j;
        k.e(b0Var, "renderer");
        String name = b0Var.getClass().getName();
        synchronized (b0.f5513m) {
            HashMap<String, d0> hashMap2 = b0.f5512l;
            d0 d0Var = hashMap2.get(name);
            if (d0Var != null) {
                int i8 = d0Var.f5545b - 1;
                d0Var.f5545b = i8;
                if (i8 == 0) {
                    b0.c cVar = d0Var.f5544a;
                    if (cVar != null) {
                        cVar.a();
                    }
                    hashMap2.remove(name);
                }
                h7.h hVar = h7.h.f4787a;
            }
        }
        return h7.h.f4787a;
    }
}
