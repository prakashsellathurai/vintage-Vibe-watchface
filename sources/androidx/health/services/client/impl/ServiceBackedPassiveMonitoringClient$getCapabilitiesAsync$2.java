package androidx.health.services.client.impl;

import androidx.health.services.client.data.PassiveMonitoringCapabilities;
import androidx.health.services.client.impl.response.PassiveMonitoringCapabilitiesResponse;
import q7.k;
import q7.l;

public final class ServiceBackedPassiveMonitoringClient$getCapabilitiesAsync$2 extends l implements p7.l<PassiveMonitoringCapabilitiesResponse, PassiveMonitoringCapabilities> {
    public static final ServiceBackedPassiveMonitoringClient$getCapabilitiesAsync$2 INSTANCE = new ServiceBackedPassiveMonitoringClient$getCapabilitiesAsync$2();

    public ServiceBackedPassiveMonitoringClient$getCapabilitiesAsync$2() {
        super(1);
    }

    public final PassiveMonitoringCapabilities invoke(PassiveMonitoringCapabilitiesResponse passiveMonitoringCapabilitiesResponse) {
        k.b(passiveMonitoringCapabilitiesResponse);
        return passiveMonitoringCapabilitiesResponse.getPassiveMonitoringCapabilities();
    }
}
