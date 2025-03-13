package androidx.health.services.client.data;

import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import java.time.Instant;
import q7.g;
import q7.k;

public final class UserActivityInfo {
    public static final Companion Companion = new Companion((g) null);
    private final ExerciseInfo exerciseInfo;
    private final DataProto.UserActivityInfo proto;
    private final Instant stateChangeTime;
    private final UserActivityState userActivityState;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final UserActivityInfo createActiveExerciseState(ExerciseInfo exerciseInfo, Instant instant) {
            k.e(exerciseInfo, "exerciseInfo");
            k.e(instant, "stateChangeTime");
            return new UserActivityInfo(UserActivityState.USER_ACTIVITY_EXERCISE, exerciseInfo, instant);
        }

        public final UserActivityInfo createAsleepState(Instant instant) {
            k.e(instant, "stateChangeTime");
            return new UserActivityInfo(UserActivityState.USER_ACTIVITY_ASLEEP, (ExerciseInfo) null, instant);
        }

        public final UserActivityInfo createPassiveActivityState(Instant instant) {
            k.e(instant, "stateChangeTime");
            return new UserActivityInfo(UserActivityState.USER_ACTIVITY_PASSIVE, (ExerciseInfo) null, instant);
        }

        public final UserActivityInfo createUnknownTypeState(Instant instant) {
            k.e(instant, "stateChangeTime");
            return new UserActivityInfo(UserActivityState.USER_ACTIVITY_UNKNOWN, (ExerciseInfo) null, instant);
        }
    }

    public UserActivityInfo(UserActivityState userActivityState2, ExerciseInfo exerciseInfo2, Instant instant) {
        k.e(userActivityState2, "userActivityState");
        k.e(instant, "stateChangeTime");
        this.userActivityState = userActivityState2;
        this.exerciseInfo = exerciseInfo2;
        this.stateChangeTime = instant;
        this.proto = getUserActivityInfoProto();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UserActivityInfo(androidx.health.services.client.proto.DataProto.UserActivityInfo r5) {
        /*
            r4 = this;
            java.lang.String r0 = "proto"
            q7.k.e(r5, r0)
            androidx.health.services.client.data.UserActivityState$Companion r0 = androidx.health.services.client.data.UserActivityState.Companion
            androidx.health.services.client.proto.DataProto$UserActivityState r1 = r5.getState()
            java.lang.String r2 = "proto.state"
            q7.k.d(r1, r2)
            androidx.health.services.client.data.UserActivityState r0 = r0.fromProto(r1)
            boolean r1 = r5.hasExerciseInfo()
            if (r1 == 0) goto L_0x0029
            androidx.health.services.client.data.ExerciseInfo r1 = new androidx.health.services.client.data.ExerciseInfo
            androidx.health.services.client.proto.DataProto$ExerciseInfo r2 = r5.getExerciseInfo()
            java.lang.String r3 = "proto.exerciseInfo"
            q7.k.d(r2, r3)
            r1.<init>(r2)
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            long r2 = r5.getStateChangeTimeEpochMs()
            java.time.Instant r5 = java.time.Instant.ofEpochMilli(r2)
            java.lang.String r2 = "ofEpochMilli(proto.stateChangeTimeEpochMs)"
            q7.k.d(r5, r2)
            r4.<init>(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.UserActivityInfo.<init>(androidx.health.services.client.proto.DataProto$UserActivityInfo):void");
    }

    public static final UserActivityInfo createActiveExerciseState(ExerciseInfo exerciseInfo2, Instant instant) {
        return Companion.createActiveExerciseState(exerciseInfo2, instant);
    }

    public static final UserActivityInfo createAsleepState(Instant instant) {
        return Companion.createAsleepState(instant);
    }

    public static final UserActivityInfo createPassiveActivityState(Instant instant) {
        return Companion.createPassiveActivityState(instant);
    }

    public static final UserActivityInfo createUnknownTypeState(Instant instant) {
        return Companion.createUnknownTypeState(instant);
    }

    private final DataProto.UserActivityInfo getUserActivityInfoProto() {
        DataProto.UserActivityInfo.Builder stateChangeTimeEpochMs = DataProto.UserActivityInfo.newBuilder().setState(this.userActivityState.toProto$health_services_client_release()).setStateChangeTimeEpochMs(this.stateChangeTime.toEpochMilli());
        ExerciseInfo exerciseInfo2 = this.exerciseInfo;
        if (exerciseInfo2 != null) {
            stateChangeTimeEpochMs.setExerciseInfo(exerciseInfo2.getProto$health_services_client_release());
        }
        y build = stateChangeTimeEpochMs.build();
        k.d(build, "builder.build()");
        return (DataProto.UserActivityInfo) build;
    }

    public final ExerciseInfo getExerciseInfo() {
        return this.exerciseInfo;
    }

    public final DataProto.UserActivityInfo getProto$health_services_client_release() {
        return this.proto;
    }

    public final Instant getStateChangeTime() {
        return this.stateChangeTime;
    }

    public final UserActivityState getUserActivityState() {
        return this.userActivityState;
    }

    public String toString() {
        return "UserActivityInfo(userActivityState=" + this.userActivityState + ", stateChangeTime=" + this.stateChangeTime + ", exerciseInfo=" + this.exerciseInfo + ')';
    }
}
