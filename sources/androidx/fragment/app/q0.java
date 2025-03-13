package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.h0;
import androidx.lifecycle.k;
import androidx.lifecycle.l0;
import androidx.lifecycle.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import androidx.lifecycle.s;
import androidx.savedstate.a;
import b1.b;
import b1.c;

public final class q0 implements k, c, o0 {

    /* renamed from: a  reason: collision with root package name */
    public final n f1312a;

    /* renamed from: b  reason: collision with root package name */
    public final n0 f1313b;

    /* renamed from: c  reason: collision with root package name */
    public l0.b f1314c;

    /* renamed from: d  reason: collision with root package name */
    public s f1315d = null;
    public b e = null;

    public q0(n nVar, n0 n0Var) {
        this.f1312a = nVar;
        this.f1313b = n0Var;
    }

    public final void b(m.a aVar) {
        this.f1315d.e(aVar);
    }

    public final void c() {
        if (this.f1315d == null) {
            this.f1315d = new s(this);
            this.e = new b(this);
        }
    }

    public final l0.b getDefaultViewModelProviderFactory() {
        Application application;
        n nVar = this.f1312a;
        l0.b defaultViewModelProviderFactory = nVar.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(nVar.T)) {
            this.f1314c = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f1314c == null) {
            Context applicationContext = nVar.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                } else if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            this.f1314c = new h0(application, this, nVar.getArguments());
        }
        return this.f1314c;
    }

    public final m getLifecycle() {
        c();
        return this.f1315d;
    }

    public final a getSavedStateRegistry() {
        c();
        return this.e.f2512b;
    }

    public final n0 getViewModelStore() {
        c();
        return this.f1313b;
    }
}
