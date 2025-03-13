package androidx.health.services.client.impl;

import androidx.health.services.client.data.ExerciseConfig;
import androidx.health.services.client.impl.internal.StatusCallback;
import g5.l;
import q7.k;

public final class ServiceBackedExerciseClient$startExerciseAsync$1$1 extends StatusCallback {
    final /* synthetic */ ExerciseConfig $configuration;
    final /* synthetic */ ServiceBackedExerciseClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceBackedExerciseClient$startExerciseAsync$1$1(l<Void> lVar, ServiceBackedExerciseClient serviceBackedExerciseClient, ExerciseConfig exerciseConfig) {
        super(lVar);
        this.this$0 = serviceBackedExerciseClient;
        this.$configuration = exerciseConfig;
        k.d(lVar, "resultFuture");
    }

    public void onSuccess() {
        Object access$getRequestedDataTypesLock$p = this.this$0.requestedDataTypesLock;
        ServiceBackedExerciseClient serviceBackedExerciseClient = this.this$0;
        ExerciseConfig exerciseConfig = this.$configuration;
        synchronized (access$getRequestedDataTypesLock$p) {
            serviceBackedExerciseClient.requestedDataTypes.clear();
            serviceBackedExerciseClient.requestedDataTypes.addAll(exerciseConfig.getDataTypes());
        }
        super.onSuccess();
    }
}
