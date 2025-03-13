package t3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import q3.c;
import q3.i;
import r3.g;
import r3.p;

public final class d extends g<a> {

    /* renamed from: z  reason: collision with root package name */
    public final p f7491z;

    public d(Context context, Looper looper, r3.d dVar, p pVar, c cVar, i iVar) {
        super(context, looper, 270, dVar, cVar, iVar);
        this.f7491z = pVar;
    }

    public final int h() {
        return 203390000;
    }

    public final /* bridge */ /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    public final o3.c[] s() {
        return y3.d.f8407b;
    }

    public final Bundle t() {
        p pVar = this.f7491z;
        pVar.getClass();
        Bundle bundle = new Bundle();
        String str = pVar.f7027a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final String w() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    public final String x() {
        return "com.google.android.gms.common.telemetry.service.START";
    }
}
