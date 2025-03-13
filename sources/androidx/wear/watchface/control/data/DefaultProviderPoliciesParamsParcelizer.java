package androidx.wear.watchface.control.data;

import android.content.ComponentName;
import g1.a;

public final class DefaultProviderPoliciesParamsParcelizer {
    public static DefaultProviderPoliciesParams read(a aVar) {
        DefaultProviderPoliciesParams defaultProviderPoliciesParams = new DefaultProviderPoliciesParams();
        defaultProviderPoliciesParams.f2265f = (ComponentName) aVar.z(defaultProviderPoliciesParams.f2265f, 1);
        return defaultProviderPoliciesParams;
    }

    public static void write(DefaultProviderPoliciesParams defaultProviderPoliciesParams, a aVar) {
        aVar.H(false, false);
        aVar.a0(defaultProviderPoliciesParams.f2265f, 1);
    }
}
