package androidx.health.services.client.impl.internal;

import androidx.health.services.client.data.ExerciseInfo;
import androidx.health.services.client.impl.internal.IExerciseInfoCallback;
import androidx.health.services.client.impl.response.ExerciseInfoResponse;
import g5.l;
import q7.k;

public final class ExerciseInfoCallback extends IExerciseInfoCallback.Stub {
    private final l<ExerciseInfo> resultFuture;

    public ExerciseInfoCallback(l<ExerciseInfo> lVar) {
        k.e(lVar, "resultFuture");
        this.resultFuture = lVar;
    }

    public void onExerciseInfo(ExerciseInfoResponse exerciseInfoResponse) {
        k.e(exerciseInfoResponse, "response");
        this.resultFuture.m(exerciseInfoResponse.getExerciseInfo());
    }

    public void onFailure(String str) {
        k.e(str, "message");
        this.resultFuture.l(new Exception(str));
    }
}
