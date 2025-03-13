package q3;

import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p3.a;
import r3.b;
import r3.c;
import r3.i;

public final class w implements c.C0119c, d0 {

    /* renamed from: a  reason: collision with root package name */
    public final a.e f6595a;

    /* renamed from: b  reason: collision with root package name */
    public final a<?> f6596b;

    /* renamed from: c  reason: collision with root package name */
    public i f6597c = null;

    /* renamed from: d  reason: collision with root package name */
    public Set<Scope> f6598d = null;
    public boolean e = false;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d f6599f;

    public w(d dVar, a.e eVar, a<?> aVar) {
        this.f6599f = dVar;
        this.f6595a = eVar;
        this.f6596b = aVar;
    }

    public final void a(o3.a aVar) {
        this.f6599f.f6549l.post(new v(this, aVar));
    }

    public final void b(o3.a aVar) {
        t tVar = (t) this.f6599f.f6547j.get(this.f6596b);
        if (tVar != null) {
            b.a(tVar.f6590l.f6549l);
            a.e eVar = tVar.f6581b;
            String name = eVar.getClass().getName();
            String valueOf = String.valueOf(aVar);
            StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(valueOf);
            eVar.e(sb.toString());
            tVar.n(aVar, (RuntimeException) null);
        }
    }
}
