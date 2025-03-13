package q5;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f6614a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f6615b;

    /* renamed from: c  reason: collision with root package name */
    public Timer f6616c;

    /* renamed from: d  reason: collision with root package name */
    public long f6617d = 0;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public long f6618f = 0;

    public class a extends TimerTask {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ long f6619f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ long f6620g;

        public a(long j8, long j9) {
            this.f6619f = j8;
            this.f6620g = j9;
        }

        public final void run() {
            e.this.f6614a.post(new d(this, this.f6619f, this.f6620g));
        }
    }

    public e(Runnable runnable) {
        this.f6615b = runnable;
        this.f6614a = new Handler(Looper.getMainLooper());
        this.e = (long) a1.a.k((float) 100, 100.0f, 60000.0f);
    }

    public final void a(long j8, long j9) {
        Log.i("DWF:WatchFaceTimer", "startTimer");
        b();
        this.f6615b.run();
        this.f6617d = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("WatchTimer-");
        long j10 = this.f6618f + 1;
        this.f6618f = j10;
        sb.append(j10);
        Timer timer = new Timer(sb.toString());
        this.f6616c = timer;
        timer.schedule(new a(j9, j8), j8 - (this.f6617d % j8), j8);
    }

    public final void b() {
        Log.i("DWF:WatchFaceTimer", "stopTimer");
        Timer timer = this.f6616c;
        if (timer != null) {
            timer.cancel();
            this.f6616c.purge();
            this.f6618f--;
            this.f6616c = null;
        }
        Handler handler = this.f6614a;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        this.f6617d = 0;
    }
}
