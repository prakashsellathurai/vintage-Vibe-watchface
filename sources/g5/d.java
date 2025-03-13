package g5;

import java.util.concurrent.Executor;

public enum d implements Executor {
    ;

    /* access modifiers changed from: public */
    d() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
