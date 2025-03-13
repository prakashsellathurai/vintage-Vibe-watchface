package androidx.health.services.client.impl;

import androidx.health.services.client.data.ExerciseCapabilities;
import androidx.health.services.client.impl.response.ExerciseCapabilitiesResponse;
import q7.k;
import q7.l;

public final class ServiceBackedExerciseClient$getCapabilitiesAsync$2 extends l implements p7.l<ExerciseCapabilitiesResponse, ExerciseCapabilities> {
    public static final ServiceBackedExerciseClient$getCapabilitiesAsync$2 INSTANCE = new ServiceBackedExerciseClient$getCapabilitiesAsync$2();

    public ServiceBackedExerciseClient$getCapabilitiesAsync$2() {
        super(1);
    }

    public final ExerciseCapabilities invoke(ExerciseCapabilitiesResponse exerciseCapabilitiesResponse) {
        k.b(exerciseCapabilitiesResponse);
        return exerciseCapabilitiesResponse.getExerciseCapabilities();
    }
}
