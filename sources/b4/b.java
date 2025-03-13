package b4;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import p3.a;
import p3.d;
import r3.d;

public final class b extends a.C0106a<c4.a, a> {
    public final a.e a(Context context, Looper looper, d dVar, Object obj, d.a aVar, d.b bVar) {
        a aVar2 = (a) obj;
        Integer num = dVar.f6959g;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.f6954a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new c4.a(context, looper, dVar, bundle, aVar, bVar);
    }
}
