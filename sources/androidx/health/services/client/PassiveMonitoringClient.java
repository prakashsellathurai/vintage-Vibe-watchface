package androidx.health.services.client;

import androidx.health.services.client.data.PassiveListenerConfig;
import androidx.health.services.client.data.PassiveMonitoringCapabilities;
import g5.j;
import java.util.concurrent.Executor;

public interface PassiveMonitoringClient {
    j<Void> clearPassiveListenerCallbackAsync();

    j<Void> clearPassiveListenerServiceAsync();

    j<Void> flushAsync();

    j<PassiveMonitoringCapabilities> getCapabilitiesAsync();

    void setPassiveListenerCallback(PassiveListenerConfig passiveListenerConfig, PassiveListenerCallback passiveListenerCallback);

    void setPassiveListenerCallback(PassiveListenerConfig passiveListenerConfig, Executor executor, PassiveListenerCallback passiveListenerCallback);

    j<Void> setPassiveListenerServiceAsync(Class<? extends PassiveListenerService> cls, PassiveListenerConfig passiveListenerConfig);
}
