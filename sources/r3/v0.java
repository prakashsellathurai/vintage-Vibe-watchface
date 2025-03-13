package r3;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import java.util.HashMap;
import u3.a;
import z3.b;

public final class v0 extends h {

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<s0, t0> f7045c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final Context f7046d;
    public final Handler e;

    /* renamed from: f  reason: collision with root package name */
    public final a f7047f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7048g;

    /* renamed from: h  reason: collision with root package name */
    public final long f7049h;

    public v0(Context context) {
        this.f7046d = context.getApplicationContext();
        this.e = new b(context.getMainLooper(), new u0(this));
        if (a.f7733c == null) {
            synchronized (a.f7732b) {
                if (a.f7733c == null) {
                    a.f7733c = new a();
                }
            }
        }
        a aVar = a.f7733c;
        b.b(aVar);
        this.f7047f = aVar;
        this.f7048g = 5000;
        this.f7049h = 300000;
    }

    public final boolean b(s0 s0Var, ServiceConnection serviceConnection, String str) {
        boolean z8;
        synchronized (this.f7045c) {
            try {
                t0 t0Var = this.f7045c.get(s0Var);
                if (t0Var == null) {
                    t0Var = new t0(this, s0Var);
                    t0Var.f7037a.put(serviceConnection, serviceConnection);
                    t0Var.a(str);
                    this.f7045c.put(s0Var, t0Var);
                } else {
                    this.e.removeMessages(0, s0Var);
                    if (!t0Var.f7037a.containsKey(serviceConnection)) {
                        t0Var.f7037a.put(serviceConnection, serviceConnection);
                        int i8 = t0Var.f7038b;
                        if (i8 == 1) {
                            ((l0) serviceConnection).onServiceConnected(t0Var.f7041f, t0Var.f7040d);
                        } else if (i8 == 2) {
                            t0Var.a(str);
                        }
                    } else {
                        String valueOf = String.valueOf(s0Var);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(valueOf);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                z8 = t0Var.f7039c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z8;
    }
}
