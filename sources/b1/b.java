package b1;

import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import androidx.savedstate.Recreator;
import androidx.savedstate.a;
import java.util.Map;
import m.b;
import q7.k;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final c f2511a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2512b = new a();

    /* renamed from: c  reason: collision with root package name */
    public boolean f2513c;

    public b(c cVar) {
        this.f2511a = cVar;
    }

    public final void a() {
        c cVar = this.f2511a;
        m lifecycle = cVar.getLifecycle();
        if (((s) lifecycle).f1503d == m.b.f1492g) {
            lifecycle.a(new Recreator(cVar));
            a aVar = this.f2512b;
            aVar.getClass();
            if (!aVar.f1918b) {
                lifecycle.a(new a(aVar));
                aVar.f1918b = true;
                this.f2513c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void b(Bundle bundle) {
        if (!this.f2513c) {
            a();
        }
        s sVar = (s) this.f2511a.getLifecycle();
        if (!(sVar.f1503d.compareTo(m.b.f1494i) >= 0)) {
            a aVar = this.f2512b;
            if (!aVar.f1918b) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
            } else if (!aVar.f1920d) {
                aVar.f1919c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
                aVar.f1920d = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
        } else {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + sVar.f1503d).toString());
        }
    }

    public final void c(Bundle bundle) {
        k.e(bundle, "outBundle");
        a aVar = this.f2512b;
        aVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.f1919c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        m.b<String, a.b> bVar = aVar.f1917a;
        bVar.getClass();
        b.d dVar = new b.d();
        bVar.f5341h.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
