package g0;

import android.os.Handler;
import java.util.concurrent.Callable;

public final class o<T> implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final Callable<T> f4477f;

    /* renamed from: g  reason: collision with root package name */
    public final i0.a<T> f4478g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f4479h;

    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ i0.a f4480f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Object f4481g;

        public a(i0.a aVar, Object obj) {
            this.f4480f = aVar;
            this.f4481g = obj;
        }

        public final void run() {
            this.f4480f.accept(this.f4481g);
        }
    }

    public o(Handler handler, Callable callable, j jVar) {
        this.f4477f = callable;
        this.f4478g = jVar;
        this.f4479h = handler;
    }

    public final void run() {
        T t8;
        try {
            t8 = this.f4477f.call();
        } catch (Exception unused) {
            t8 = null;
        }
        this.f4479h.post(new a(this.f4478g, t8));
    }
}
