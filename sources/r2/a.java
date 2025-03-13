package r2;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

public final class a implements ThreadFactory {

    /* renamed from: r2.a$a  reason: collision with other inner class name */
    public class C0117a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Runnable f6740f;

        public C0117a(Runnable runnable) {
            this.f6740f = runnable;
        }

        public final void run() {
            Process.setThreadPriority(10);
            this.f6740f.run();
        }
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(new C0117a(runnable), "glide-active-resources");
    }
}
