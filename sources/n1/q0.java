package n1;

import android.util.Log;
import java.lang.Thread;

public final /* synthetic */ class q0 implements Thread.UncaughtExceptionHandler {
    public final void uncaughtException(Thread thread, Throwable th) {
        Log.e("WatchFaceService", "Uncaught exception on watch face background thread", th);
    }
}
