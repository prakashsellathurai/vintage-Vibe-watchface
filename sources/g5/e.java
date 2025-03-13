package g5;

import g5.a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class e<V> extends h<V> {

    public static abstract class a<V> extends e<V> implements a.h<V> {
        public final void a(Runnable runnable, Executor executor) {
            super.a(runnable, executor);
        }

        public final boolean cancel(boolean z8) {
            return super.cancel(z8);
        }

        public final V get() {
            return super.get();
        }

        public final V get(long j8, TimeUnit timeUnit) {
            return super.get(j8, timeUnit);
        }

        public final boolean isCancelled() {
            return this.f4626f instanceof a.b;
        }

        public final boolean isDone() {
            return super.isDone();
        }
    }
}
