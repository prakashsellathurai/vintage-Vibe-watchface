package c6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import d6.c;
import java.util.ArrayList;
import w5.d;
import w5.f;

public final class e extends d {

    /* renamed from: g  reason: collision with root package name */
    public boolean f2721g = false;

    /* renamed from: h  reason: collision with root package name */
    public int f2722h;

    /* renamed from: i  reason: collision with root package name */
    public int f2723i = 100;

    /* renamed from: j  reason: collision with root package name */
    public int f2724j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2725k;

    /* renamed from: l  reason: collision with root package name */
    public int f2726l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2727m;

    /* renamed from: n  reason: collision with root package name */
    public final BroadcastReceiver f2728n = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                e.this.p(intent);
            }
        }
    }

    public e(Context context, boolean z8, c cVar) {
        super(context, z8, cVar);
    }

    public final void b(d dVar, f fVar) {
        int i8;
        Intent intent = new Intent();
        intent.putExtra("scale", this.f2723i);
        switch (dVar.ordinal()) {
            case EXERCISE_TYPE_SCUBA_DIVING_VALUE:
                intent.putExtra("level", (int) ((Float.parseFloat(fVar.h()) / 100.0f) * ((float) this.f2723i)));
                i8 = this.f2724j;
                break;
            case EXERCISE_TYPE_SKATING_VALUE:
                intent.putExtra("level", this.f2722h);
                if (!Boolean.parseBoolean(fVar.h())) {
                    i8 = 3;
                    break;
                } else {
                    i8 = 2;
                    break;
                }
            case EXERCISE_TYPE_SKIING_VALUE:
            case EXERCISE_TYPE_SNOWBOARDING_VALUE:
                intent.putExtra("temperature", fVar.e());
                break;
            case EXERCISE_TYPE_SNOWSHOEING_VALUE:
                intent.putExtra("battery_low", fVar.a());
                break;
        }
        intent.putExtra("status", i8);
        p(intent);
    }

    public final void c() {
        o();
    }

    public final d d() {
        return d.f8038m0;
    }

    public final f e(d dVar) {
        switch (dVar.ordinal()) {
            case EXERCISE_TYPE_SCUBA_DIVING_VALUE:
                int i8 = this.f2723i;
                int i9 = 0;
                if (i8 != 0) {
                    i9 = a1.a.l((int) Math.round((((double) this.f2722h) * 100.0d) / ((double) i8)), 0, 100);
                }
                return new f(i9);
            case EXERCISE_TYPE_SKATING_VALUE:
                return new f(this.f2725k);
            case EXERCISE_TYPE_SKIING_VALUE:
                return new f(((float) this.f2726l) / 10.0f);
            case EXERCISE_TYPE_SNOWBOARDING_VALUE:
                return new f((((((float) this.f2726l) / 10.0f) * 9.0f) / 5.0f) + 32.0f);
            case EXERCISE_TYPE_SNOWSHOEING_VALUE:
                return new f(this.f2727m);
            default:
                return null;
        }
    }

    public final boolean f(d dVar) {
        return g();
    }

    public final void i(d dVar) {
        Log.i("DWF:ModelBattery", "onConnected");
        p(this.f2716a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
        n();
    }

    public final void j(d dVar) {
        Log.i("DWF:ModelBattery", "onDisconnected");
        o();
    }

    public final void k() {
        o();
    }

    public final void l() {
        if (g()) {
            n();
        }
    }

    public final d m() {
        return d.s0;
    }

    public final void n() {
        if (!this.f2721g) {
            Log.i("DWF:ModelBattery", "registerReceiver");
            this.f2721g = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            this.f2716a.registerReceiver(this.f2728n, intentFilter);
        }
    }

    public final void o() {
        try {
            if (this.f2721g) {
                Log.i("DWF:ModelBattery", "unregisterReceiver");
                this.f2721g = false;
                this.f2716a.unregisterReceiver(this.f2728n);
            }
        } catch (Exception e) {
            Log.e("DWF:ModelBattery", e.getMessage());
        }
    }

    public final void p(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("scale", -1);
            int intExtra2 = intent.getIntExtra("level", -1);
            int intExtra3 = intent.getIntExtra("status", -1);
            this.f2724j = intExtra3;
            boolean z8 = intExtra3 == 2 || intExtra3 == 5;
            int intExtra4 = intent.getIntExtra("temperature", -1);
            boolean booleanExtra = intent.getBooleanExtra("battery_low", false);
            ArrayList arrayList = new ArrayList();
            if (intExtra != this.f2723i) {
                this.f2723i = intExtra;
                arrayList.add(d.f8040n0);
            }
            if (intExtra2 != this.f2722h) {
                this.f2722h = intExtra2;
                arrayList.add(d.f8040n0);
            }
            if (z8 != this.f2725k) {
                this.f2725k = z8;
                arrayList.add(d.f8042o0);
            }
            if (intExtra4 != this.f2726l) {
                this.f2726l = intExtra4;
                arrayList.add(d.f8044p0);
                arrayList.add(d.f8046q0);
            }
            if (booleanExtra != this.f2727m) {
                this.f2727m = booleanExtra;
                arrayList.add(d.f8047r0);
            }
            if (arrayList.size() > 0) {
                this.f2717b.a(arrayList);
            }
        }
    }
}
