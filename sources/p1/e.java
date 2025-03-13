package p1;

import android.graphics.drawable.Icon;
import android.support.wearable.complications.ComplicationProviderInfo;
import q1.d;
import q7.k;

public final class e {
    public static final a a(ComplicationProviderInfo complicationProviderInfo) {
        String appName = complicationProviderInfo.getAppName();
        k.b(appName);
        String providerName = complicationProviderInfo.getProviderName();
        k.b(providerName);
        Icon providerIcon = complicationProviderInfo.getProviderIcon();
        k.b(providerIcon);
        return new a(appName, providerName, providerIcon, d.a.a(complicationProviderInfo.getComplicationType()), complicationProviderInfo.getProviderComponentName());
    }
}
