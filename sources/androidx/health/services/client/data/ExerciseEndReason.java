package androidx.health.services.client.data;

import androidx.health.services.client.proto.DataProto;
import c1.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import q7.k;

@Retention(RetentionPolicy.SOURCE)
public @interface ExerciseEndReason {
    public static final int AUTO_END_MISSING_LISTENER = 3;
    public static final int AUTO_END_PAUSE_EXPIRED = 2;
    public static final int AUTO_END_PERMISSION_LOST = 1;
    public static final int AUTO_END_PREPARE_EXPIRED = 6;
    public static final int AUTO_END_SUPERSEDED = 5;
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int UNKNOWN = 0;
    public static final int USER_END = 4;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int AUTO_END_MISSING_LISTENER = 3;
        public static final int AUTO_END_PAUSE_EXPIRED = 2;
        public static final int AUTO_END_PERMISSION_LOST = 1;
        public static final int AUTO_END_PREPARE_EXPIRED = 6;
        public static final int AUTO_END_SUPERSEDED = 5;
        public static final int UNKNOWN = 0;
        public static final int USER_END = 4;

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    androidx.health.services.client.proto.DataProto$ExerciseEndReason[] r0 = androidx.health.services.client.proto.DataProto.ExerciseEndReason.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.health.services.client.proto.DataProto$ExerciseEndReason r1 = androidx.health.services.client.proto.DataProto.ExerciseEndReason.EXERCISE_END_REASON_UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.health.services.client.proto.DataProto$ExerciseEndReason r1 = androidx.health.services.client.proto.DataProto.ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_PERMISSION_LOST     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.health.services.client.proto.DataProto$ExerciseEndReason r1 = androidx.health.services.client.proto.DataProto.ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_PAUSE_EXPIRED     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.health.services.client.proto.DataProto$ExerciseEndReason r1 = androidx.health.services.client.proto.DataProto.ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_MISSING_LISTENER     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    androidx.health.services.client.proto.DataProto$ExerciseEndReason r1 = androidx.health.services.client.proto.DataProto.ExerciseEndReason.EXERCISE_END_REASON_USER_END     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    androidx.health.services.client.proto.DataProto$ExerciseEndReason r1 = androidx.health.services.client.proto.DataProto.ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_SUPERSEDED     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    androidx.health.services.client.proto.DataProto$ExerciseEndReason r1 = androidx.health.services.client.proto.DataProto.ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_PREPARE_EXPIRED     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    $EnumSwitchMapping$0 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.ExerciseEndReason.Companion.WhenMappings.<clinit>():void");
            }
        }

        private Companion() {
        }

        public final int fromProto$health_services_client_release(DataProto.ExerciseEndReason exerciseEndReason) {
            k.e(exerciseEndReason, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[exerciseEndReason.ordinal()]) {
                case 1:
                    return 0;
                case 2:
                    return 1;
                case 3:
                    return 2;
                case 4:
                    return 3;
                case 5:
                    return 4;
                case 6:
                    return 5;
                case 7:
                    return 6;
                default:
                    throw new c();
            }
        }

        public final DataProto.ExerciseEndReason toProto$health_services_client_release(int i8) {
            switch (i8) {
                case 1:
                    return DataProto.ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_PERMISSION_LOST;
                case 2:
                    return DataProto.ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_PAUSE_EXPIRED;
                case 3:
                    return DataProto.ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_MISSING_LISTENER;
                case 4:
                    return DataProto.ExerciseEndReason.EXERCISE_END_REASON_USER_END;
                case 5:
                    return DataProto.ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_SUPERSEDED;
                case 6:
                    return DataProto.ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_PREPARE_EXPIRED;
                default:
                    return DataProto.ExerciseEndReason.EXERCISE_END_REASON_UNKNOWN;
            }
        }
    }
}
