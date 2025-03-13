package androidx.health.services.client.impl;

import androidx.health.services.client.ExerciseUpdateCallback;
import g5.f;
import q7.k;

public final class ServiceBackedExerciseClient$setUpdateCallback$1 implements f<Void> {
    final /* synthetic */ ExerciseUpdateCallback $callback;

    public ServiceBackedExerciseClient$setUpdateCallback$1(ExerciseUpdateCallback exerciseUpdateCallback) {
        this.$callback = exerciseUpdateCallback;
    }

    public void onFailure(Throwable th) {
        k.e(th, "t");
        this.$callback.onRegistrationFailed(th);
    }

    public void onSuccess(Void voidR) {
        this.$callback.onRegistered();
    }
}
