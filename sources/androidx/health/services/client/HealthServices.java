package androidx.health.services.client;

import android.content.Context;
import androidx.health.services.client.impl.ServiceBackedHealthServicesClient;
import q7.k;

public final class HealthServices {
    public static final HealthServices INSTANCE = new HealthServices();

    private HealthServices() {
    }

    public static final HealthServicesClient getClient(Context context) {
        k.e(context, "context");
        return new ServiceBackedHealthServicesClient(context);
    }
}
