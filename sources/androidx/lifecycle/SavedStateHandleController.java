package androidx.lifecycle;

import androidx.lifecycle.m;
import androidx.savedstate.a;
import q7.k;

public final class SavedStateHandleController implements p {

    /* renamed from: f  reason: collision with root package name */
    public final String f1424f;

    /* renamed from: g  reason: collision with root package name */
    public final d0 f1425g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1426h;

    public SavedStateHandleController(String str, d0 d0Var) {
        this.f1424f = str;
        this.f1425g = d0Var;
    }

    public final void c(r rVar, m.a aVar) {
        if (aVar == m.a.ON_DESTROY) {
            this.f1426h = false;
            rVar.getLifecycle().b(this);
        }
    }

    public final void d(m mVar, a aVar) {
        k.e(aVar, "registry");
        k.e(mVar, "lifecycle");
        if (!this.f1426h) {
            this.f1426h = true;
            mVar.a(this);
            aVar.c(this.f1424f, this.f1425g.e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }
}
