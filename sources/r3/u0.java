package r3;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

public final class u0 implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v0 f7043a;

    public /* synthetic */ u0(v0 v0Var) {
        this.f7043a = v0Var;
    }

    public final boolean handleMessage(Message message) {
        int i8 = message.what;
        if (i8 == 0) {
            synchronized (this.f7043a.f7045c) {
                try {
                    s0 s0Var = (s0) message.obj;
                    t0 t0Var = this.f7043a.f7045c.get(s0Var);
                    if (t0Var != null && t0Var.f7037a.isEmpty()) {
                        if (t0Var.f7039c) {
                            v0 v0Var = t0Var.f7042g;
                            v0Var.e.removeMessages(1, t0Var.e);
                            v0Var.f7047f.a(v0Var.f7046d, t0Var);
                            t0Var.f7039c = false;
                            t0Var.f7038b = 2;
                        }
                        this.f7043a.f7045c.remove(s0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        } else if (i8 != 1) {
            return false;
        } else {
            synchronized (this.f7043a.f7045c) {
                s0 s0Var2 = (s0) message.obj;
                t0 t0Var2 = this.f7043a.f7045c.get(s0Var2);
                if (t0Var2 != null && t0Var2.f7038b == 3) {
                    String valueOf = String.valueOf(s0Var2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = t0Var2.f7041f;
                    if (componentName == null) {
                        s0Var2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = s0Var2.f7031b;
                        b.b(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    t0Var2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
