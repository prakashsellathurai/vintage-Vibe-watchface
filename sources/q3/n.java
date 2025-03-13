package q3;

import a4.a;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final /* synthetic */ class n implements Executor {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f6571f = 1;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f6572g = new a(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        int i8 = this.f6571f;
        Handler handler = this.f6572g;
        switch (i8) {
            case 0:
                handler.post(runnable);
                return;
            default:
                handler.post(runnable);
                return;
        }
    }
}
