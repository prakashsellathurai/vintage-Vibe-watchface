package r3;

import android.content.ServiceConnection;
import androidx.annotation.RecentlyNonNull;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f6990a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static v0 f6991b;

    public final void a(@RecentlyNonNull String str, @RecentlyNonNull String str2, int i8, @RecentlyNonNull ServiceConnection serviceConnection, boolean z8) {
        s0 s0Var = new s0(str, str2, i8, z8);
        v0 v0Var = (v0) this;
        synchronized (v0Var.f7045c) {
            t0 t0Var = v0Var.f7045c.get(s0Var);
            if (t0Var == null) {
                String valueOf = String.valueOf(s0Var);
                StringBuilder sb = new StringBuilder(valueOf.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (t0Var.f7037a.containsKey(serviceConnection)) {
                t0Var.f7037a.remove(serviceConnection);
                if (t0Var.f7037a.isEmpty()) {
                    v0Var.e.sendMessageDelayed(v0Var.e.obtainMessage(0, s0Var), v0Var.f7048g);
                }
            } else {
                String valueOf2 = String.valueOf(s0Var);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public abstract boolean b(s0 s0Var, ServiceConnection serviceConnection, String str);
}
