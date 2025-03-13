package androidx.health.services.client.impl;

import androidx.health.services.client.impl.ipc.RemoteFutureOperation;
import androidx.health.services.client.impl.request.FlushRequest;
import g5.l;

public final /* synthetic */ class a implements RemoteFutureOperation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1366a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FlushRequest f1367b;

    public /* synthetic */ a(FlushRequest flushRequest, int i8) {
        this.f1366a = i8;
        this.f1367b = flushRequest;
    }

    public final void execute(Object obj, l lVar) {
        int i8 = this.f1366a;
        FlushRequest flushRequest = this.f1367b;
        switch (i8) {
            case 0:
                ServiceBackedExerciseClient.flushAsync$lambda$7(flushRequest, (IExerciseApiService) obj, lVar);
                return;
            default:
                ServiceBackedPassiveMonitoringClient.flushAsync$lambda$7(flushRequest, (IPassiveMonitoringApiService) obj, lVar);
                return;
        }
    }
}
