package androidx.health.services.client;

public interface HealthServicesClient {
    ExerciseClient getExerciseClient();

    MeasureClient getMeasureClient();

    PassiveMonitoringClient getPassiveMonitoringClient();
}
