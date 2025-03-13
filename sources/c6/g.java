package c6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import d6.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import w5.d;
import w5.f;

public final class g extends d {

    /* renamed from: g  reason: collision with root package name */
    public boolean f2735g = false;

    /* renamed from: h  reason: collision with root package name */
    public String f2736h = Locale.getDefault().toString();

    /* renamed from: i  reason: collision with root package name */
    public final BroadcastReceiver f2737i = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
                g.this.n();
            }
        }
    }

    public g(Context context, boolean z8, c cVar) {
        super(context, z8, cVar);
    }

    public final void b(d dVar, f fVar) {
        d dVar2 = d.f8034k0;
        if (dVar == dVar2) {
            this.f2736h = fVar.h();
            this.f2717b.a(Arrays.asList(new d[]{dVar2}));
        }
    }

    public final void c() {
        p();
    }

    public final d d() {
        return d.f8032j0;
    }

    public final f e(d dVar) {
        if (dVar == d.f8034k0) {
            return new f(this.f2736h);
        }
        return null;
    }

    public final boolean f(d dVar) {
        return g();
    }

    public final void i(d dVar) {
        Log.i("DWF:ModelLanguage", "onConnected");
        n();
        o();
    }

    public final void j(d dVar) {
        Log.i("DWF:ModelLanguage", "onDisconnected");
        p();
    }

    public final void k() {
        p();
    }

    public final void l() {
        if (g()) {
            n();
            o();
        }
    }

    public final d m() {
        return d.f8036l0;
    }

    public final void n() {
        String locale = Locale.getDefault().toString();
        ArrayList arrayList = new ArrayList();
        if (!locale.equals(this.f2736h)) {
            this.f2736h = locale;
            arrayList.add(d.f8034k0);
        }
        if (arrayList.size() > 0) {
            this.f2717b.a(arrayList);
        }
    }

    public final void o() {
        if (!this.f2735g) {
            Log.i("DWF:ModelLanguage", "registerReceiver");
            this.f2735g = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
            this.f2716a.registerReceiver(this.f2737i, intentFilter);
        }
    }

    public final void p() {
        try {
            if (this.f2735g) {
                Log.i("DWF:ModelLanguage", "unregisterReceiver");
                this.f2735g = false;
                this.f2716a.unregisterReceiver(this.f2737i);
            }
        } catch (Exception e) {
            Log.e("DWF:ModelLanguage", e.getMessage());
        }
    }
}
