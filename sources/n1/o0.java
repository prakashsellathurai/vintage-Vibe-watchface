package n1;

import a8.b;
import a8.f;
import c1.c;
import j7.d;
import l7.e;
import l7.h;
import p7.p;
import y7.z;

@e(c = "androidx.wear.watchface.WatchFaceImpl$4", f = "WatchFace.kt", l = {841}, m = "invokeSuspend")
public final class o0 extends h implements p<z, d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f5680j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ p0 f5681k;

    public static final class a<T> implements b {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ p0 f5682f;

        public a(p0 p0Var) {
            this.f5682f = p0Var;
        }

        public final Object emit(Object obj, d dVar) {
            Integer num = (Integer) obj;
            if (num != null) {
                int intValue = num.intValue();
                p0 p0Var = this.f5682f;
                p0Var.getClass();
                boolean z8 = intValue == 3 || intValue == 2 || intValue == 4;
                if (p0Var.f5697p != z8) {
                    p0Var.f5697p = z8;
                    p0Var.f5683a.f();
                }
            }
            return h7.h.f4787a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, d<? super o0> dVar) {
        super(2, dVar);
        this.f5681k = p0Var;
    }

    public final d<h7.h> c(Object obj, d<?> dVar) {
        return new o0(this.f5681k, dVar);
    }

    public final Object g(Object obj, Object obj2) {
        ((o0) c((z) obj, (d) obj2)).h(h7.h.f4787a);
        return k7.a.f5217f;
    }

    public final Object h(Object obj) {
        k7.a aVar = k7.a.f5217f;
        int i8 = this.f5680j;
        if (i8 == 0) {
            a1.a.I(obj);
            p0 p0Var = this.f5681k;
            f<Integer> fVar = p0Var.f5684b.f5631a;
            a aVar2 = new a(p0Var);
            this.f5680j = 1;
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
