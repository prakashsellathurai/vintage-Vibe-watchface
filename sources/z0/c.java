package z0;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l.a;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f8671f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Context f8672g;

    public /* synthetic */ c(Context context, int i8) {
        this.f8671f = i8;
        this.f8672g = context;
    }

    public final void run() {
        int i8 = this.f8671f;
        Context context = this.f8672g;
        switch (i8) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new c(context, 1));
                return;
            default:
                androidx.profileinstaller.c.b(context, new a(5), androidx.profileinstaller.c.f1542a, false);
                return;
        }
    }
}
