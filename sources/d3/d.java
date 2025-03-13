package d3;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.k;
import d3.b;
import k3.j;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4007a;

    /* renamed from: b  reason: collision with root package name */
    public final b.a f4008b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4009c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4010d;
    public final BroadcastReceiver e = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        public final void onReceive(Context context, Intent intent) {
            d dVar = d.this;
            boolean z8 = dVar.f4009c;
            dVar.f4009c = d.l(context);
            if (z8 != d.this.f4009c) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    boolean z9 = d.this.f4009c;
                }
                d dVar2 = d.this;
                k.b bVar = (k.b) dVar2.f4008b;
                if (dVar2.f4009c) {
                    synchronized (k.this) {
                        bVar.f2969a.b();
                    }
                    return;
                }
                bVar.getClass();
            }
        }
    }

    public d(Context context, k.b bVar) {
        this.f4007a = context.getApplicationContext();
        this.f4008b = bVar;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean l(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        j.l(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e4) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e4);
            }
            return true;
        }
    }

    public final void a() {
    }

    public final void d() {
        if (this.f4010d) {
            this.f4007a.unregisterReceiver(this.e);
            this.f4010d = false;
        }
    }

    public final void j() {
        if (!this.f4010d) {
            Context context = this.f4007a;
            this.f4009c = l(context);
            try {
                context.registerReceiver(this.e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f4010d = true;
            } catch (SecurityException e4) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e4);
                }
            }
        }
    }
}
