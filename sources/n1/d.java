package n1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.io.PrintStream;
import q7.k;

public final class d extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f5543a;

    public d(c cVar) {
        this.f5543a = cVar;
    }

    public final void onReceive(Context context, Intent intent) {
        k.e(context, "context");
        k.e(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            c cVar = this.f5543a;
            switch (hashCode) {
                case -2128145023:
                    if (action.equals("android.intent.action.SCREEN_OFF")) {
                        cVar.f5534b.j();
                        return;
                    }
                    break;
                case -1980154005:
                    if (action.equals("android.intent.action.BATTERY_OKAY")) {
                        cVar.f5534b.c();
                        return;
                    }
                    break;
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        cVar.f5534b.i();
                        return;
                    }
                    break;
                case -1513032534:
                    if (action.equals("android.intent.action.TIME_TICK")) {
                        cVar.f5534b.b();
                        return;
                    }
                    break;
                case -1501918365:
                    if (action.equals("androidx.wear.watchface.MockTime")) {
                        cVar.f5534b.f(intent);
                        return;
                    }
                    break;
                case -1299800080:
                    if (action.equals("com.google.android.wearable.action.AMBIENT_STARTED")) {
                        cVar.f5534b.k();
                        return;
                    }
                    break;
                case -1286934212:
                    if (action.equals("com.google.android.wearable.action.AMBIENT_STOPPED")) {
                        cVar.f5534b.m();
                        return;
                    }
                    break;
                case 490310653:
                    if (action.equals("android.intent.action.BATTERY_LOW")) {
                        cVar.f5534b.d();
                        return;
                    }
                    break;
                case 502473491:
                    if (action.equals("android.intent.action.TIMEZONE_CHANGED")) {
                        cVar.f5534b.h();
                        return;
                    }
                    break;
                case 505380757:
                    if (action.equals("android.intent.action.TIME_SET")) {
                        cVar.f5534b.e();
                        return;
                    }
                    break;
                case 823795052:
                    if (action.equals("android.intent.action.USER_PRESENT")) {
                        cVar.f5534b.l();
                        return;
                    }
                    break;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        cVar.f5534b.g();
                        return;
                    }
                    break;
            }
        }
        PrintStream printStream = System.err;
        printStream.println("<< IGNORING " + intent);
    }
}
