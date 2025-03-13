package androidx.health.services.client.impl;

import androidx.health.services.client.data.ExerciseGoal;
import androidx.health.services.client.impl.ipc.RemoteFutureOperation;
import g5.l;

public final /* synthetic */ class f implements RemoteFutureOperation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1377a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ServiceBackedExerciseClient f1378b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ExerciseGoal f1379c;

    public /* synthetic */ f(ServiceBackedExerciseClient serviceBackedExerciseClient, ExerciseGoal exerciseGoal, int i8) {
        this.f1377a = i8;
        this.f1378b = serviceBackedExerciseClient;
        this.f1379c = exerciseGoal;
    }

    public final void execute(Object obj, l lVar) {
        int i8 = this.f1377a;
        ServiceBackedExerciseClient serviceBackedExerciseClient = this.f1378b;
        ExerciseGoal exerciseGoal = this.f1379c;
        switch (i8) {
            case 0:
                ServiceBackedExerciseClient.addGoalToActiveExerciseAsync$lambda$12(serviceBackedExerciseClient, exerciseGoal, (IExerciseApiService) obj, lVar);
                return;
            default:
                ServiceBackedExerciseClient.removeGoalFromActiveExerciseAsync$lambda$13(serviceBackedExerciseClient, exerciseGoal, (IExerciseApiService) obj, lVar);
                return;
        }
    }
}
