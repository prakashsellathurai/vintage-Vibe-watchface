package androidx.wear.watchface.control.data;

import android.content.ComponentName;
import g1.a;

public final class GetUserStyleFlavorsParamsParcelizer {
    public static GetUserStyleFlavorsParams read(a aVar) {
        GetUserStyleFlavorsParams getUserStyleFlavorsParams = new GetUserStyleFlavorsParams();
        getUserStyleFlavorsParams.f2267f = (ComponentName) aVar.z(getUserStyleFlavorsParams.f2267f, 1);
        return getUserStyleFlavorsParams;
    }

    public static void write(GetUserStyleFlavorsParams getUserStyleFlavorsParams, a aVar) {
        aVar.H(false, false);
        aVar.a0(getUserStyleFlavorsParams.f2267f, 1);
    }
}
