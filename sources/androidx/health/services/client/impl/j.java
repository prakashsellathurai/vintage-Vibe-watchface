package androidx.health.services.client.impl;

import androidx.health.services.client.impl.ipc.RemoteFutureOperation;
import androidx.health.services.client.impl.ipc.RemoteOperation;
import g5.l;

public final /* synthetic */ class j implements RemoteFutureOperation, RemoteOperation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1390a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ServiceBackedPassiveMonitoringClient f1391b;

    public /* synthetic */ j(ServiceBackedPassiveMonitoringClient serviceBackedPassiveMonitoringClient, int i8) {
        this.f1390a = i8;
        this.f1391b = serviceBackedPassiveMonitoringClient;
    }

    public final Object execute(Object obj) {
        return ServiceBackedPassiveMonitoringClient.getCapabilitiesAsync$lambda$8(this.f1391b, (IPassiveMonitoringApiService) obj);
    }

    public final void execute(Object obj, l lVar) {
        int i8 = this.f1390a;
        ServiceBackedPassiveMonitoringClient serviceBackedPassiveMonitoringClient = this.f1391b;
        switch (i8) {
            case 0:
                ServiceBackedPassiveMonitoringClient.clearPassiveListenerCallbackAsync$lambda$5(serviceBackedPassiveMonitoringClient, (IPassiveMonitoringApiService) obj, lVar);
                return;
            case 1:
                ServiceBackedPassiveMonitoringClient.clearPassiveListenerCallbackAsync$lambda$6(serviceBackedPassiveMonitoringClient, (IPassiveMonitoringApiService) obj, lVar);
                return;
            default:
                ServiceBackedPassiveMonitoringClient.clearPassiveListenerServiceAsync$lambda$4(serviceBackedPassiveMonitoringClient, (IPassiveMonitoringApiService) obj, lVar);
                return;
        }
    }
}
