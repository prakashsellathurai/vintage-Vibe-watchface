package androidx.health.services.client.impl;

import androidx.health.services.client.data.DataType;
import java.util.Set;
import p7.a;
import q7.l;

public final class ServiceBackedExerciseClient$setUpdateCallback$listenerStub$1 extends l implements a<Set<? extends DataType<?, ?>>> {
    final /* synthetic */ ServiceBackedExerciseClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServiceBackedExerciseClient$setUpdateCallback$listenerStub$1(ServiceBackedExerciseClient serviceBackedExerciseClient) {
        super(0);
        this.this$0 = serviceBackedExerciseClient;
    }

    public final Set<DataType<?, ?>> invoke() {
        Set<DataType<?, ?>> access$getRequestedDataTypes$p;
        Object access$getRequestedDataTypesLock$p = this.this$0.requestedDataTypesLock;
        ServiceBackedExerciseClient serviceBackedExerciseClient = this.this$0;
        synchronized (access$getRequestedDataTypesLock$p) {
            access$getRequestedDataTypes$p = serviceBackedExerciseClient.requestedDataTypes;
        }
        return access$getRequestedDataTypes$p;
    }
}
