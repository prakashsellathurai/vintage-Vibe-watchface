package androidx.health.services.client.impl;

import android.content.Context;
import android.os.IBinder;
import androidx.health.services.client.ExerciseClient;
import androidx.health.services.client.HealthServicesClient;
import androidx.health.services.client.MeasureClient;
import androidx.health.services.client.PassiveMonitoringClient;
import androidx.health.services.client.impl.IHealthServicesApiService;
import androidx.health.services.client.impl.internal.HsConnectionManager;
import androidx.health.services.client.impl.ipc.Client;
import androidx.health.services.client.impl.ipc.ClientConfiguration;
import androidx.health.services.client.impl.ipc.internal.ConnectionManager;
import q7.g;
import q7.k;

public final class ServiceBackedHealthServicesClient extends Client<IHealthServicesApiService> implements HealthServicesClient {
    @Deprecated
    private static final String CLIENT = "HealthServicesClient";
    @Deprecated
    private static final ClientConfiguration CLIENT_CONFIGURATION = new ClientConfiguration(CLIENT, IpcConstants.SERVICE_PACKAGE_NAME, IpcConstants.HEALTH_SERVICES_BIND_ACTION);
    private static final Companion Companion = new Companion((g) null);
    private final Context applicationContext;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceBackedHealthServicesClient(Context context) {
        super(CLIENT_CONFIGURATION, HsConnectionManager.getInstance(context), new d(2), new d(3));
        k.e(context, "context");
        this.applicationContext = context.getApplicationContext();
    }

    /* access modifiers changed from: private */
    public static final IHealthServicesApiService _init_$lambda$0(IBinder iBinder) {
        return IHealthServicesApiService.Stub.asInterface(iBinder);
    }

    /* access modifiers changed from: private */
    public static final Integer _init_$lambda$1(IHealthServicesApiService iHealthServicesApiService) {
        return Integer.valueOf(iHealthServicesApiService.getApiVersion());
    }

    public ExerciseClient getExerciseClient() {
        Context context = this.applicationContext;
        k.d(context, "applicationContext");
        return new ServiceBackedExerciseClient(context, (ConnectionManager) null, 2, (g) null);
    }

    public MeasureClient getMeasureClient() {
        Context context = this.applicationContext;
        k.d(context, "applicationContext");
        return new ServiceBackedMeasureClient(context, (ConnectionManager) null, 2, (g) null);
    }

    public PassiveMonitoringClient getPassiveMonitoringClient() {
        Context context = this.applicationContext;
        k.d(context, "applicationContext");
        return new ServiceBackedPassiveMonitoringClient(context, (ConnectionManager) null, 2, (g) null);
    }
}
