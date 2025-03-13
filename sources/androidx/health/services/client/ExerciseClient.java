package androidx.health.services.client;

import androidx.health.services.client.data.ExerciseCapabilities;
import androidx.health.services.client.data.ExerciseConfig;
import androidx.health.services.client.data.ExerciseGoal;
import androidx.health.services.client.data.ExerciseInfo;
import androidx.health.services.client.data.WarmUpConfig;
import g5.j;
import java.util.concurrent.Executor;

public interface ExerciseClient {
    j<Void> addGoalToActiveExerciseAsync(ExerciseGoal<?> exerciseGoal);

    j<Void> clearUpdateCallbackAsync(ExerciseUpdateCallback exerciseUpdateCallback);

    j<Void> endExerciseAsync();

    j<Void> flushAsync();

    j<ExerciseCapabilities> getCapabilitiesAsync();

    j<ExerciseInfo> getCurrentExerciseInfoAsync();

    j<Void> markLapAsync();

    j<Void> overrideAutoPauseAndResumeForActiveExerciseAsync(boolean z8);

    j<Void> pauseExerciseAsync();

    j<Void> prepareExerciseAsync(WarmUpConfig warmUpConfig);

    j<Void> removeGoalFromActiveExerciseAsync(ExerciseGoal<?> exerciseGoal);

    j<Void> resumeExerciseAsync();

    void setUpdateCallback(ExerciseUpdateCallback exerciseUpdateCallback);

    void setUpdateCallback(Executor executor, ExerciseUpdateCallback exerciseUpdateCallback);

    j<Void> startExerciseAsync(ExerciseConfig exerciseConfig);
}
