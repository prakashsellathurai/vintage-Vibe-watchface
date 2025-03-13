package androidx.lifecycle;

import androidx.lifecycle.m;

public final class SavedStateHandleAttacher implements p {

    /* renamed from: f  reason: collision with root package name */
    public final f0 f1423f;

    public SavedStateHandleAttacher(f0 f0Var) {
        this.f1423f = f0Var;
    }

    public final void c(r rVar, m.a aVar) {
        if (aVar == m.a.ON_CREATE) {
            rVar.getLifecycle().b(this);
            f0 f0Var = this.f1423f;
            if (!f0Var.f1460b) {
                f0Var.f1461c = f0Var.f1459a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                f0Var.f1460b = true;
                g0 g0Var = (g0) f0Var.f1462d.getValue();
                return;
            }
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
    }
}
