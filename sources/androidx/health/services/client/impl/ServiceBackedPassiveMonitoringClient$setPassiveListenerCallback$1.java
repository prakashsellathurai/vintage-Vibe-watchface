package androidx.health.services.client.impl;

import androidx.health.services.client.PassiveListenerCallback;
import g5.f;
import q7.k;

public final class ServiceBackedPassiveMonitoringClient$setPassiveListenerCallback$1 implements f<Void> {
    final /* synthetic */ PassiveListenerCallback $callback;

    public ServiceBackedPassiveMonitoringClient$setPassiveListenerCallback$1(PassiveListenerCallback passiveListenerCallback) {
        this.$callback = passiveListenerCallback;
    }

    public void onFailure(Throwable th) {
        k.e(th, "t");
        this.$callback.onRegistrationFailed(th);
    }

    public void onSuccess(Void voidR) {
        this.$callback.onRegistered();
    }
}
