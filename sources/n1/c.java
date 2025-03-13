package n1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import h7.h;
import q7.k;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5533a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5534b;

    /* renamed from: c  reason: collision with root package name */
    public final BroadcastReceiver f5535c;

    public interface a {
        void b();

        void c();

        void d();

        void e();

        void f(Intent intent);

        void g();

        void h();

        void i();

        void j() {
        }

        void k() {
        }

        void l() {
        }

        void m() {
        }
    }

    public c(Context context, b bVar) {
        k.e(context, "context");
        k.e(bVar, "observer");
        this.f5533a = context;
        this.f5534b = bVar;
        d dVar = new d(this);
        this.f5535c = dVar;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("androidx.wear.watchface.MockTime");
        intentFilter.addAction("com.google.android.wearable.action.AMBIENT_STARTED");
        intentFilter.addAction("com.google.android.wearable.action.AMBIENT_STOPPED");
        h hVar = h.f4787a;
        context.registerReceiver(dVar, intentFilter, 4);
    }
}
