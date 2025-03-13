package q3;

import d4.d;
import d4.h;
import o3.c;

public final class i0 extends g0<Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final g<?> f6563c;

    public i0(g<?> gVar, d<Boolean> dVar) {
        super(dVar);
        this.f6563c = gVar;
    }

    public final /* bridge */ /* synthetic */ void c(k kVar, boolean z8) {
    }

    public final c[] f(t<?> tVar) {
        if (((c0) tVar.f6584f.get(this.f6563c)) == null) {
            return null;
        }
        throw null;
    }

    public final boolean g(t<?> tVar) {
        if (((c0) tVar.f6584f.get(this.f6563c)) == null) {
            return false;
        }
        throw null;
    }

    public final void h(t<?> tVar) {
        if (((c0) tVar.f6584f.remove(this.f6563c)) == null) {
            d<T> dVar = this.f6559b;
            TResult tresult = Boolean.FALSE;
            h<TResult> hVar = dVar.f4036a;
            synchronized (hVar.f4041a) {
                if (!hVar.f4043c) {
                    hVar.f4043c = true;
                    hVar.f4044d = tresult;
                    hVar.f4042b.d(hVar);
                    return;
                }
                return;
            }
        }
        throw null;
    }
}
