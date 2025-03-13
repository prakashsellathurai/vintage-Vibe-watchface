package androidx.health.services.client.impl;

import androidx.health.services.client.impl.ipc.RemoteFutureOperation;
import g5.l;

public final /* synthetic */ class h implements RemoteFutureOperation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ServiceBackedExerciseClient f1382a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f1383b;

    public /* synthetic */ h(ServiceBackedExerciseClient serviceBackedExerciseClient, boolean z8) {
        this.f1382a = serviceBackedExerciseClient;
        this.f1383b = z8;
    }

    public final void execute(Object obj, l lVar) {
        ServiceBackedExerciseClient.overrideAutoPauseAndResumeForActiveExerciseAsync$lambda$14(this.f1382a, this.f1383b, (IExerciseApiService) obj, lVar);
    }
}
