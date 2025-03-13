package l;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.u;

public final class b extends u {

    /* renamed from: b  reason: collision with root package name */
    public static volatile b f5226b;

    /* renamed from: a  reason: collision with root package name */
    public final c f5227a = new c();

    public static b j() {
        if (f5226b != null) {
            return f5226b;
        }
        synchronized (b.class) {
            if (f5226b == null) {
                f5226b = new b();
            }
        }
        return f5226b;
    }

    public final boolean k() {
        this.f5227a.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final void l(Runnable runnable) {
        c cVar = this.f5227a;
        if (cVar.f5229b == null) {
            synchronized (cVar.f5228a) {
                if (cVar.f5229b == null) {
                    cVar.f5229b = Handler.createAsync(Looper.getMainLooper());
                }
            }
        }
        cVar.f5229b.post(runnable);
    }
}
