package androidx.health.services.client.impl;

import androidx.health.services.client.impl.ipc.RemoteFutureOperation;
import g5.l;

public final /* synthetic */ class e implements RemoteFutureOperation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1374a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ServiceBackedExerciseClient f1375b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ExerciseUpdateListenerStub f1376c;

    public /* synthetic */ e(ServiceBackedExerciseClient serviceBackedExerciseClient, ExerciseUpdateListenerStub exerciseUpdateListenerStub, int i8) {
        this.f1374a = i8;
        this.f1375b = serviceBackedExerciseClient;
        this.f1376c = exerciseUpdateListenerStub;
    }

    public final void execute(Object obj, l lVar) {
        int i8 = this.f1374a;
        ServiceBackedExerciseClient serviceBackedExerciseClient = this.f1375b;
        ExerciseUpdateListenerStub exerciseUpdateListenerStub = this.f1376c;
        switch (i8) {
            case 0:
                ServiceBackedExerciseClient.setUpdateCallback$lambda$10(serviceBackedExerciseClient, exerciseUpdateListenerStub, (IExerciseApiService) obj, lVar);
                return;
            default:
                ServiceBackedExerciseClient.clearUpdateCallbackAsync$lambda$11(serviceBackedExerciseClient, exerciseUpdateListenerStub, (IExerciseApiService) obj, lVar);
                return;
        }
    }
}
