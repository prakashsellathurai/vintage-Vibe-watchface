package androidx.health.services.client.impl;

import androidx.health.services.client.MeasureCallback;
import g5.f;
import q7.k;

public final class ServiceBackedMeasureClient$registerMeasureCallback$1 implements f<Void> {
    final /* synthetic */ MeasureCallback $callback;

    public ServiceBackedMeasureClient$registerMeasureCallback$1(MeasureCallback measureCallback) {
        this.$callback = measureCallback;
    }

    public void onFailure(Throwable th) {
        k.e(th, "t");
        this.$callback.onRegistrationFailed(th);
    }

    public void onSuccess(Void voidR) {
        this.$callback.onRegistered();
    }
}
