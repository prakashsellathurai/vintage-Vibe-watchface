package androidx.health.services.client.data;

import androidx.health.services.client.proto.DataProto;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import q7.k;

@Retention(RetentionPolicy.SOURCE)
public @interface ExerciseTrackedStatus {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int NO_EXERCISE_IN_PROGRESS = 3;
    public static final int OTHER_APP_IN_PROGRESS = 1;
    public static final int OWNED_EXERCISE_IN_PROGRESS = 2;
    public static final int UNKNOWN = 0;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int NO_EXERCISE_IN_PROGRESS = 3;
        public static final int OTHER_APP_IN_PROGRESS = 1;
        public static final int OWNED_EXERCISE_IN_PROGRESS = 2;
        public static final int UNKNOWN = 0;

        private Companion() {
        }

        public final int fromProto(DataProto.ExerciseTrackedStatus exerciseTrackedStatus) {
            k.e(exerciseTrackedStatus, "proto");
            return exerciseTrackedStatus.getNumber();
        }

        public final DataProto.ExerciseTrackedStatus toProto$health_services_client_release(int i8) {
            DataProto.ExerciseTrackedStatus forNumber = DataProto.ExerciseTrackedStatus.forNumber(i8);
            return forNumber == null ? DataProto.ExerciseTrackedStatus.EXERCISE_TRACKED_STATUS_UNKNOWN : forNumber;
        }
    }
}
