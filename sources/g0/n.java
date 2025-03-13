package g0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

public final class n implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f4474a = "fonts-androidx";

    /* renamed from: b  reason: collision with root package name */
    public final int f4475b = 10;

    public static class a extends Thread {

        /* renamed from: f  reason: collision with root package name */
        public final int f4476f;

        public a(Runnable runnable, String str, int i8) {
            super(runnable, str);
            this.f4476f = i8;
        }

        public final void run() {
            Process.setThreadPriority(this.f4476f);
            super.run();
        }
    }

    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.f4474a, this.f4475b);
    }
}
