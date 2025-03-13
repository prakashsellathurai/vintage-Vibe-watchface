package j5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.health.services.client.impl.i;
import d6.f;
import j5.b;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import w5.c;

public final class a extends f {

    /* renamed from: q  reason: collision with root package name */
    public b f4996q;
    public boolean r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4997s = true;

    /* renamed from: t  reason: collision with root package name */
    public final BroadcastReceiver f4998t = new C0068a();

    /* renamed from: j5.a$a  reason: collision with other inner class name */
    public class C0068a extends BroadcastReceiver {
        public C0068a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                a.this.t();
            }
        }
    }

    public a(Context context, boolean z8) {
        super(context, z8);
        if (!z8) {
            b bVar = new b(context, new i(3, this));
            Context context2 = bVar.f5002a;
            this.f4996q = bVar;
            if (!bVar.f5005d) {
                Log.i("DWF:HideInformationMonitor", "register ContentObserver!!");
                try {
                    bVar.e = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingDeque());
                    context2.getContentResolver().registerContentObserver(b.f5000i, false, bVar.f5006f);
                    bVar.f5005d = true;
                    if (bVar.f5008h == null) {
                        Log.i("DWF:HideInformationMonitor", "request to get hide information setting!!");
                        b.c cVar = new b.c(context2, bVar.f5007g);
                        bVar.f5008h = cVar;
                        bVar.e.execute(cVar);
                    }
                } catch (SecurityException unused) {
                    Log.i("DWF:HideInformationMonitor", "no provider for HideInformation");
                }
            }
            if (!this.r) {
                this.r = true;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                this.f4051d.registerReceiver(this.f4998t, intentFilter);
            }
        }
    }

    public final void a() {
        super.a();
        b bVar = this.f4996q;
        if (bVar != null) {
            if (bVar.f5005d) {
                bVar.f5005d = false;
                Log.i("DWF:HideInformationMonitor", "unregister ContentObserver!!");
                bVar.f5002a.getContentResolver().unregisterContentObserver(bVar.f5006f);
            }
            b.d dVar = bVar.f5007g;
            dVar.removeMessages(1);
            dVar.f5017b = true;
            bVar.e.shutdown();
            this.f4996q = null;
        }
        if (this.r) {
            try {
                this.f4051d.unregisterReceiver(this.f4998t);
            } catch (Exception e) {
                Log.w("DWF:GalaxyWatchStatusProvider", "unregisterReceiver: " + e.getMessage());
            } catch (Throwable th) {
                this.r = false;
                throw th;
            }
            this.r = false;
        }
    }

    public final void o(c cVar, w5.f fVar) {
        if (f.b.e(cVar.f8018a).ordinal() != 6) {
            super.o(cVar, fVar);
            return;
        }
        this.f4997s = Boolean.parseBoolean(fVar.h());
        r(f.b.f4087m);
    }

    public final boolean q() {
        return this.f4997s;
    }

    public final void t() {
        b bVar = this.f4996q;
        if (bVar != null) {
            b.C0069b bVar2 = bVar.f5004c;
            boolean z8 = this.f4997s;
            int ordinal = bVar2.ordinal();
            if (ordinal == 1) {
                z8 = true;
            } else if (ordinal == 2) {
                z8 = false;
            }
            if (this.f4997s != z8) {
                this.f4997s = z8;
                r(f.b.f4087m);
            }
            Log.i("DWF:GalaxyWatchStatusProvider", "checkDeviceLocked:" + this.f4075l + " hideInformationState:" + bVar2);
        }
    }
}
