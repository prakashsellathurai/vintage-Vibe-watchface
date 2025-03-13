package g5;

import g5.a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class i<V> implements j<V> {

    /* renamed from: g  reason: collision with root package name */
    public static final i f4660g = new i((Object) null);

    /* renamed from: h  reason: collision with root package name */
    public static final Logger f4661h = Logger.getLogger(i.class.getName());

    /* renamed from: f  reason: collision with root package name */
    public final V f4662f;

    public static final class a<V> extends a.i<V> {
        public a(IllegalArgumentException illegalArgumentException) {
            l(illegalArgumentException);
        }
    }

    public i(V v8) {
        this.f4662f = v8;
    }

    public final void a(Runnable runnable, Executor executor) {
        if (executor != null) {
            try {
                executor.execute(runnable);
            } catch (RuntimeException e) {
                Level level = Level.SEVERE;
                String valueOf = String.valueOf(runnable);
                String valueOf2 = String.valueOf(executor);
                StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
                sb.append("RuntimeException while executing runnable ");
                sb.append(valueOf);
                sb.append(" with executor ");
                sb.append(valueOf2);
                f4661h.log(level, sb.toString(), e);
            }
        } else {
            throw new NullPointerException("Executor was null.");
        }
    }

    public final boolean cancel(boolean z8) {
        return false;
    }

    public final V get() {
        return this.f4662f;
    }

    public final V get(long j8, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f4662f;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f4662f);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 27 + valueOf.length());
        sb.append(obj);
        sb.append("[status=SUCCESS, result=[");
        sb.append(valueOf);
        sb.append("]]");
        return sb.toString();
    }
}
