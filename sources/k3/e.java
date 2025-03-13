package k3;

import java.util.concurrent.Executor;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f5135a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f5136b = new b();

    public class a implements Executor {
        public final void execute(Runnable runnable) {
            k.e().post(runnable);
        }
    }

    public class b implements Executor {
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
