package androidx.health.services.client.impl;

import androidx.health.services.client.impl.ipc.RemoteFutureOperation;
import androidx.health.services.client.impl.ipc.RemoteOperation;
import g5.l;

public final /* synthetic */ class b implements RemoteFutureOperation, RemoteOperation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1368a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ServiceBackedExerciseClient f1369b;

    public /* synthetic */ b(ServiceBackedExerciseClient serviceBackedExerciseClient, int i8) {
        this.f1368a = i8;
        this.f1369b = serviceBackedExerciseClient;
    }

    public final Object execute(Object obj) {
        return ServiceBackedExerciseClient.getCapabilitiesAsync$lambda$15(this.f1369b, (IExerciseApiService) obj);
    }

    public final void execute(Object obj, l lVar) {
        int i8 = this.f1368a;
        ServiceBackedExerciseClient serviceBackedExerciseClient = this.f1369b;
        switch (i8) {
            case 0:
                ServiceBackedExerciseClient.endExerciseAsync$lambda$6(serviceBackedExerciseClient, (IExerciseApiService) obj, lVar);
                return;
            case 1:
                ServiceBackedExerciseClient.getCurrentExerciseInfoAsync$lambda$9(serviceBackedExerciseClient, (IExerciseApiService) obj, lVar);
                return;
            case 2:
                ServiceBackedExerciseClient.markLapAsync$lambda$8(serviceBackedExerciseClient, (IExerciseApiService) obj, lVar);
                return;
            case 3:
                ServiceBackedExerciseClient.pauseExerciseAsync$lambda$4(serviceBackedExerciseClient, (IExerciseApiService) obj, lVar);
                return;
            default:
                ServiceBackedExerciseClient.resumeExerciseAsync$lambda$5(serviceBackedExerciseClient, (IExerciseApiService) obj, lVar);
                return;
        }
    }
}
