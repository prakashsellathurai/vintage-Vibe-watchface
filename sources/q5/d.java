package q5;

import android.util.Log;
import q5.e;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e.a f6611f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ long f6612g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ long f6613h;

    public /* synthetic */ d(e.a aVar, long j8, long j9) {
        this.f6611f = aVar;
        this.f6612g = j8;
        this.f6613h = j9;
    }

    public final void run() {
        e.a aVar = this.f6611f;
        aVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        e eVar = e.this;
        long j8 = currentTimeMillis - eVar.f6617d;
        long j9 = this.f6612g;
        if (j8 > j9) {
            Log.i("DWF:WatchFaceTimer", "restart timer");
            eVar.a(this.f6613h, j9);
            return;
        }
        eVar.f6615b.run();
    }
}
