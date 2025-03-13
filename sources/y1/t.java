package y1;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public final class t<T> {
    public static final ExecutorService e = Executors.newCachedThreadPool();

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f8324a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f8325b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f8326c;

    /* renamed from: d  reason: collision with root package name */
    public volatile r<T> f8327d;

    public class a extends FutureTask<r<T>> {
        public a(Callable<r<T>> callable) {
            super(callable);
        }

        public final void done() {
            t tVar = t.this;
            if (!isCancelled()) {
                try {
                    tVar.a((r) get());
                } catch (InterruptedException | ExecutionException e) {
                    tVar.a(new r(e));
                }
            }
        }
    }

    public t() {
        throw null;
    }

    public t(Callable<r<T>> callable, boolean z8) {
        this.f8324a = new LinkedHashSet(1);
        this.f8325b = new LinkedHashSet(1);
        this.f8326c = new Handler(Looper.getMainLooper());
        this.f8327d = null;
        if (z8) {
            try {
                a(callable.call());
            } catch (Throwable th) {
                a(new r(th));
            }
        } else {
            e.execute(new a(callable));
        }
    }

    public final void a(r<T> rVar) {
        if (this.f8327d == null) {
            this.f8327d = rVar;
            this.f8326c.post(new s(this));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }
}
