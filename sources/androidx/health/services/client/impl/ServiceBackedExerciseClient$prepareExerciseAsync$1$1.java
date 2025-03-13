package androidx.health.services.client.impl;

import androidx.health.services.client.data.WarmUpConfig;
import androidx.health.services.client.impl.internal.StatusCallback;
import g5.l;
import q7.k;

public final class ServiceBackedExerciseClient$prepareExerciseAsync$1$1 extends StatusCallback {
    final /* synthetic */ WarmUpConfig $configuration;
    final /* synthetic */ ServiceBackedExerciseClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceBackedExerciseClient$prepareExerciseAsync$1$1(l<Void> lVar, ServiceBackedExerciseClient serviceBackedExerciseClient, WarmUpConfig warmUpConfig) {
        super(lVar);
        this.this$0 = serviceBackedExerciseClient;
        this.$configuration = warmUpConfig;
        k.d(lVar, "resultFuture");
    }

    public void onSuccess() {
        Object access$getRequestedDataTypesLock$p = this.this$0.requestedDataTypesLock;
        ServiceBackedExerciseClient serviceBackedExerciseClient = this.this$0;
        WarmUpConfig warmUpConfig = this.$configuration;
        synchronized (access$getRequestedDataTypesLock$p) {
            serviceBackedExerciseClient.requestedDataTypes.clear();
            serviceBackedExerciseClient.requestedDataTypes.addAll(warmUpConfig.getDataTypes());
        }
        super.onSuccess();
    }
}
