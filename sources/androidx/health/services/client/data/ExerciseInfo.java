package androidx.health.services.client.data;

import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import q7.k;

public final class ExerciseInfo {
    private final int exerciseTrackedStatus;
    private final ExerciseType exerciseType;
    private final DataProto.ExerciseInfo proto;

    public ExerciseInfo(int i8, ExerciseType exerciseType2) {
        k.e(exerciseType2, "exerciseType");
        this.exerciseTrackedStatus = i8;
        this.exerciseType = exerciseType2;
        y build = DataProto.ExerciseInfo.newBuilder().setExerciseTrackedStatus(ExerciseTrackedStatus.Companion.toProto$health_services_client_release(i8)).setExerciseType(exerciseType2.toProto()).build();
        k.d(build, "newBuilder()\n           …o())\n            .build()");
        this.proto = (DataProto.ExerciseInfo) build;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExerciseInfo(androidx.health.services.client.proto.DataProto.ExerciseInfo r4) {
        /*
            r3 = this;
            java.lang.String r0 = "proto"
            q7.k.e(r4, r0)
            androidx.health.services.client.data.ExerciseTrackedStatus$Companion r0 = androidx.health.services.client.data.ExerciseTrackedStatus.Companion
            androidx.health.services.client.proto.DataProto$ExerciseTrackedStatus r1 = r4.getExerciseTrackedStatus()
            java.lang.String r2 = "proto.exerciseTrackedStatus"
            q7.k.d(r1, r2)
            int r0 = r0.fromProto(r1)
            androidx.health.services.client.data.ExerciseType$Companion r1 = androidx.health.services.client.data.ExerciseType.Companion
            androidx.health.services.client.proto.DataProto$ExerciseType r4 = r4.getExerciseType()
            java.lang.String r2 = "proto.exerciseType"
            q7.k.d(r4, r2)
            androidx.health.services.client.data.ExerciseType r4 = r1.fromProto(r4)
            r3.<init>(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.ExerciseInfo.<init>(androidx.health.services.client.proto.DataProto$ExerciseInfo):void");
    }

    public final int getExerciseTrackedStatus() {
        return this.exerciseTrackedStatus;
    }

    public final ExerciseType getExerciseType() {
        return this.exerciseType;
    }

    public final DataProto.ExerciseInfo getProto$health_services_client_release() {
        return this.proto;
    }
}
