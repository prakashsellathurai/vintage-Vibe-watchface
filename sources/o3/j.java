package o3;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import y3.e;

@SuppressLint({"HandlerLeak"})
public final class j extends e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6099a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f6100b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f6100b = dVar;
        this.f6099a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i8 = message.what;
        boolean z8 = true;
        if (i8 != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i8);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        d dVar = this.f6100b;
        Context context = this.f6099a;
        int c9 = dVar.c(context);
        AtomicBoolean atomicBoolean = g.f6093a;
        if (!(c9 == 1 || c9 == 2 || c9 == 3 || c9 == 9)) {
            z8 = false;
        }
        if (z8) {
            Intent a9 = dVar.a(context, c9, "n");
            dVar.e(context, c9, a9 == null ? null : PendingIntent.getActivity(context, 0, a9, 134217728));
        }
    }
}
