package androidx.health.services.client.impl.response;

import android.os.Parcelable;
import androidx.health.services.client.data.ExerciseInfo;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.proto.ResponsesProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class ExerciseInfoResponse extends ProtoParcelable<ResponsesProto.ExerciseInfoResponse> {
    public static final Parcelable.Creator<ExerciseInfoResponse> CREATOR = new ExerciseInfoResponse$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final ExerciseInfo exerciseInfo;
    private final ResponsesProto.ExerciseInfoResponse proto;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public ExerciseInfoResponse(ExerciseInfo exerciseInfo2) {
        k.e(exerciseInfo2, "exerciseInfo");
        this.exerciseInfo = exerciseInfo2;
        y build = ResponsesProto.ExerciseInfoResponse.newBuilder().setExerciseInfo(exerciseInfo2.getProto$health_services_client_release()).build();
        k.d(build, "newBuilder().setExercise…erciseInfo.proto).build()");
        this.proto = (ResponsesProto.ExerciseInfoResponse) build;
    }

    public final ExerciseInfo getExerciseInfo() {
        return this.exerciseInfo;
    }

    public ResponsesProto.ExerciseInfoResponse getProto() {
        return this.proto;
    }
}
