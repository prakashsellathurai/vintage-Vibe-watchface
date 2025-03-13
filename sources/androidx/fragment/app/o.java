package androidx.fragment.app;

import androidx.activity.result.b;
import androidx.activity.result.f;
import androidx.fragment.app.n;
import java.util.concurrent.atomic.AtomicReference;
import n.a;

public final class o extends n.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f1301a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f1302b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.a f1303c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f1304d;
    public final /* synthetic */ n e;

    public o(n nVar, a aVar, AtomicReference atomicReference, d.a aVar2, b bVar) {
        this.e = nVar;
        this.f1301a = aVar;
        this.f1302b = atomicReference;
        this.f1303c = aVar2;
        this.f1304d = bVar;
    }

    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        n nVar = this.e;
        sb.append(nVar.f1258f);
        sb.append("_rq#");
        sb.append(nVar.W.getAndIncrement());
        this.f1302b.set(((f) this.f1301a.apply()).c(sb.toString(), nVar, this.f1303c, this.f1304d));
    }
}
