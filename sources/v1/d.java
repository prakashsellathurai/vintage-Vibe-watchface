package v1;

import java.io.Closeable;
import k3.j;
import k7.a;
import l7.e;
import l7.h;
import p7.p;
import y7.z;

@e(c = "androidx.wear.watchface.utility.TraceEventKt$launchWithTracing$1", f = "TraceEvent.kt", l = {92}, m = "invokeSuspend")
public final class d extends h implements p<z, j7.d<? super h7.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public int f7840j;

    /* renamed from: k  reason: collision with root package name */
    public /* synthetic */ Object f7841k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ String f7842l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ p<z, j7.d<? super h7.h>, Object> f7843m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str, p<? super z, ? super j7.d<? super h7.h>, ? extends Object> pVar, j7.d<? super d> dVar) {
        super(2, dVar);
        this.f7842l = str;
        this.f7843m = pVar;
    }

    public final j7.d<h7.h> c(Object obj, j7.d<?> dVar) {
        d dVar2 = new d(this.f7842l, this.f7843m, dVar);
        dVar2.f7841k = obj;
        return dVar2;
    }

    public final Object g(Object obj, Object obj2) {
        return ((d) c((z) obj, (j7.d) obj2)).h(h7.h.f4787a);
    }

    public final Object h(Object obj) {
        c cVar;
        a aVar = a.f5217f;
        int i8 = this.f7840j;
        if (i8 == 0) {
            a1.a.I(obj);
            z zVar = (z) this.f7841k;
            c cVar2 = new c(this.f7842l);
            p<z, j7.d<? super h7.h>, Object> pVar = this.f7843m;
            try {
                this.f7841k = cVar2;
                this.f7840j = 1;
                if (pVar.g(zVar, this) == aVar) {
                    return aVar;
                }
                cVar = cVar2;
            } catch (Throwable th) {
                th = th;
                cVar = cVar2;
                try {
                    throw th;
                } catch (Throwable th2) {
                    j.n(cVar, th);
                    throw th2;
                }
            }
        } else if (i8 == 1) {
            cVar = (Closeable) this.f7841k;
            try {
                a1.a.I(obj);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h7.h hVar = h7.h.f4787a;
        j.n(cVar, (Throwable) null);
        return h7.h.f4787a;
    }
}
