package l;

import android.os.Handler;
import androidx.fragment.app.u;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class c extends u {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5228a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public volatile Handler f5229b;

    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f5230a = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f5230a.getAndIncrement());
            return thread;
        }
    }

    public c() {
        Executors.newFixedThreadPool(4, new a());
    }
}
