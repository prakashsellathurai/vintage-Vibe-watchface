package z7;

import android.os.Handler;
import android.os.Looper;
import c8.m;
import d8.c;
import java.util.concurrent.CancellationException;
import q7.k;
import y7.g1;
import y7.h;
import y7.i1;
import y7.l0;
import y7.m0;
import y7.z0;

public final class f extends g {
    private volatile f _immediate;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f8725h;

    /* renamed from: i  reason: collision with root package name */
    public final String f8726i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f8727j;

    /* renamed from: k  reason: collision with root package name */
    public final f f8728k;

    public f() {
        throw null;
    }

    public f(Handler handler) {
        this(handler, (String) null, false);
    }

    public final void N(j7.f fVar, Runnable runnable) {
        if (!this.f8725h.post(runnable)) {
            Q(fVar, runnable);
        }
    }

    public final boolean O() {
        return !this.f8727j || !k.a(Looper.myLooper(), this.f8725h.getLooper());
    }

    public final g1 P() {
        return this.f8728k;
    }

    public final void Q(j7.f fVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        z0 z0Var = (z0) fVar.d(z0.b.f8628f);
        if (z0Var != null) {
            z0Var.H(cancellationException);
        }
        l0.f8581b.N(fVar, runnable);
    }

    public final void a(long j8, h hVar) {
        d dVar = new d(hVar, this);
        if (j8 > 4611686018427387903L) {
            j8 = 4611686018427387903L;
        }
        if (this.f8725h.postDelayed(dVar, j8)) {
            hVar.b(new e(this, dVar));
        } else {
            Q(hVar.f8573j, dVar);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && ((f) obj).f8725h == this.f8725h;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f8725h);
    }

    public final m0 s(long j8, Runnable runnable, j7.f fVar) {
        if (j8 > 4611686018427387903L) {
            j8 = 4611686018427387903L;
        }
        if (this.f8725h.postDelayed(runnable, j8)) {
            return new c(this, runnable);
        }
        Q(fVar, runnable);
        return i1.f8575f;
    }

    public final String toString() {
        String str;
        g1 g1Var;
        c cVar = l0.f8580a;
        g1 g1Var2 = m.f2865a;
        if (this == g1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                g1Var = g1Var2.P();
            } catch (UnsupportedOperationException unused) {
                g1Var = null;
            }
            str = this == g1Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f8726i;
        if (str2 == null) {
            str2 = this.f8725h.toString();
        }
        if (!this.f8727j) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public f(Handler handler, String str, boolean z8) {
        this.f8725h = handler;
        this.f8726i = str;
        this.f8727j = z8;
        this._immediate = z8 ? this : null;
        f fVar = this._immediate;
        if (fVar == null) {
            fVar = new f(handler, str, true);
            this._immediate = fVar;
        }
        this.f8728k = fVar;
    }
}
