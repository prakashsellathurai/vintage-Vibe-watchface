package g5;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public interface j<V> extends Future<V> {
    void a(Runnable runnable, Executor executor);
}
