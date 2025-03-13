package androidx.health.services.client;

import androidx.health.services.client.data.Availability;
import androidx.health.services.client.data.DataType;
import androidx.health.services.client.data.ExerciseLapSummary;
import androidx.health.services.client.data.ExerciseUpdate;

public interface ExerciseUpdateCallback {
    void onAvailabilityChanged(DataType<?, ?> dataType, Availability availability);

    void onExerciseUpdateReceived(ExerciseUpdate exerciseUpdate);

    void onLapSummaryReceived(ExerciseLapSummary exerciseLapSummary);

    void onRegistered();

    void onRegistrationFailed(Throwable th);
}
