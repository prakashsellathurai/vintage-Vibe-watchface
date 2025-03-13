package androidx.health.services.client.impl;

import androidx.health.services.client.data.PassiveListenerConfig;
import androidx.health.services.client.impl.ipc.RemoteFutureOperation;
import g5.l;
import java.io.Serializable;

public final /* synthetic */ class k implements RemoteFutureOperation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1392a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1393b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1394c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f1395d;

    public /* synthetic */ k(ServiceBackedPassiveMonitoringClient serviceBackedPassiveMonitoringClient, PassiveListenerConfig passiveListenerConfig, PassiveListenerCallbackStub passiveListenerCallbackStub) {
        this.f1392a = 1;
        this.f1393b = serviceBackedPassiveMonitoringClient;
        this.f1394c = passiveListenerConfig;
        this.f1395d = passiveListenerCallbackStub;
    }

    public /* synthetic */ k(Object obj, Serializable serializable, Object obj2, int i8) {
        this.f1392a = i8;
        this.f1393b = obj;
        this.f1395d = serializable;
        this.f1394c = obj2;
    }

    public final void execute(Object obj, l lVar) {
        int i8 = this.f1392a;
        Object obj2 = this.f1394c;
        Object obj3 = this.f1395d;
        Object obj4 = this.f1393b;
        switch (i8) {
            case 0:
                ServiceBackedPassiveMonitoringClient.setPassiveListenerServiceAsync$lambda$2((ServiceBackedPassiveMonitoringClient) obj4, (Class) obj3, (PassiveListenerConfig) obj2, (IPassiveMonitoringApiService) obj, lVar);
                return;
            default:
                ServiceBackedPassiveMonitoringClient.setPassiveListenerCallback$lambda$3((ServiceBackedPassiveMonitoringClient) obj4, (PassiveListenerConfig) obj2, (PassiveListenerCallbackStub) obj3, (IPassiveMonitoringApiService) obj, lVar);
                return;
        }
    }
}
