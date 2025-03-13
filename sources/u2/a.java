package u2;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a implements ExecutorService {

    /* renamed from: g  reason: collision with root package name */
    public static final long f7723g = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: h  reason: collision with root package name */
    public static volatile int f7724h;

    /* renamed from: f  reason: collision with root package name */
    public final ExecutorService f7725f;

    /* renamed from: u2.a$a  reason: collision with other inner class name */
    public static final class C0138a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final String f7726a;

        /* renamed from: b  reason: collision with root package name */
        public final b f7727b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f7728c;

        /* renamed from: d  reason: collision with root package name */
        public int f7729d;

        /* renamed from: u2.a$a$a  reason: collision with other inner class name */
        public class C0139a extends Thread {
            public C0139a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public final void run() {
                Process.setThreadPriority(9);
                C0138a aVar = C0138a.this;
                if (aVar.f7728c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    aVar.f7727b.a(th);
                }
            }
        }

        public C0138a(String str, boolean z8) {
            b.C0140a aVar = b.f7731a;
            this.f7726a = str;
            this.f7727b = aVar;
            this.f7728c = z8;
        }

        public final synchronized Thread newThread(Runnable runnable) {
            C0139a aVar;
            aVar = new C0139a(runnable, "glide-" + this.f7726a + "-thread-" + this.f7729d);
            this.f7729d = this.f7729d + 1;
            return aVar;
        }
    }

    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0140a f7731a = new C0140a();

        /* renamed from: u2.a$b$a  reason: collision with other inner class name */
        public class C0140a implements b {
            public final void a(Throwable th) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        void a(Throwable th);
    }

    public a(ThreadPoolExecutor threadPoolExecutor) {
        this.f7725f = threadPoolExecutor;
    }

    public final boolean awaitTermination(long j8, TimeUnit timeUnit) {
        return this.f7725f.awaitTermination(j8, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f7725f.execute(runnable);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f7725f.invokeAll(collection);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j8, TimeUnit timeUnit) {
        return this.f7725f.invokeAll(collection, j8, timeUnit);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return this.f7725f.invokeAny(collection);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j8, TimeUnit timeUnit) {
        return this.f7725f.invokeAny(collection, j8, timeUnit);
    }

    public final boolean isShutdown() {
        return this.f7725f.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f7725f.isTerminated();
    }

    public final void shutdown() {
        this.f7725f.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.f7725f.shutdownNow();
    }

    public final Future<?> submit(Runnable runnable) {
        return this.f7725f.submit(runnable);
    }

    public final <T> Future<T> submit(Runnable runnable, T t8) {
        return this.f7725f.submit(runnable, t8);
    }

    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f7725f.submit(callable);
    }

    public final String toString() {
        return this.f7725f.toString();
    }
}
