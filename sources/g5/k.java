package g5;

import g5.c;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class k implements Executor {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Executor f4663f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a f4664g;

    public k(Executor executor, c.a aVar) {
        this.f4663f = executor;
        this.f4664g = aVar;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f4663f.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f4664g.l(e);
        }
    }
}
