package q3;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.appcompat.widget.p;
import com.google.android.gms.common.api.Status;
import d3.l;
import d4.d;
import d4.e;
import d4.f;
import d4.h;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import k3.j;
import o3.c;
import p3.b;
import p3.g;

public final class h0<ResultT> extends a0 {

    /* renamed from: b  reason: collision with root package name */
    public final j<Object, ResultT> f6560b;

    /* renamed from: c  reason: collision with root package name */
    public final d<ResultT> f6561c;

    /* renamed from: d  reason: collision with root package name */
    public final j f6562d;

    public h0(f0 f0Var, d dVar, j jVar) {
        super(2);
        this.f6561c = dVar;
        this.f6560b = f0Var;
        this.f6562d = jVar;
        if (f0Var.f6565b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(Status status) {
        this.f6562d.getClass();
        this.f6561c.a(status.f3024i != null ? new g(status) : new b(status));
    }

    public final void b(RuntimeException runtimeException) {
        this.f6561c.a(runtimeException);
    }

    public final void c(k kVar, boolean z8) {
        Map<d<?>, Boolean> map = kVar.f6569b;
        Boolean valueOf = Boolean.valueOf(z8);
        d<ResultT> dVar = this.f6561c;
        map.put(dVar, valueOf);
        h<TResult> hVar = dVar.f4036a;
        p pVar = new p(kVar, (d) dVar);
        hVar.getClass();
        f fVar = new f(e.f4037a, pVar);
        l lVar = hVar.f4042b;
        synchronized (lVar.f4026c) {
            if (((Queue) lVar.f4027d) == null) {
                lVar.f4027d = new ArrayDeque();
            }
            ((Queue) lVar.f4027d).add(fVar);
        }
        synchronized (hVar.f4041a) {
            if (hVar.f4043c) {
                hVar.f4042b.d(hVar);
            }
        }
    }

    public final void d(t<?> tVar) {
        d<ResultT> dVar = this.f6561c;
        try {
            this.f6560b.a(tVar.f6581b, dVar);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e4) {
            a(j0.e(e4));
        } catch (RuntimeException e9) {
            dVar.a(e9);
        }
    }

    public final c[] f(t<?> tVar) {
        return this.f6560b.f6564a;
    }

    public final boolean g(t<?> tVar) {
        return this.f6560b.f6565b;
    }
}
