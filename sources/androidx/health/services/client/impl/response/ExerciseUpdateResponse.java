package androidx.health.services.client.impl.response;

import android.os.Parcelable;
import androidx.health.services.client.data.ExerciseUpdate;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.proto.ResponsesProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class ExerciseUpdateResponse extends ProtoParcelable<ResponsesProto.ExerciseUpdateResponse> {
    public static final Parcelable.Creator<ExerciseUpdateResponse> CREATOR = new ExerciseUpdateResponse$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final ExerciseUpdate exerciseUpdate;
    private final ResponsesProto.ExerciseUpdateResponse proto;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public ExerciseUpdateResponse(ExerciseUpdate exerciseUpdate2) {
        k.e(exerciseUpdate2, "exerciseUpdate");
        this.exerciseUpdate = exerciseUpdate2;
        y build = ResponsesProto.ExerciseUpdateResponse.newBuilder().setExerciseUpdate(exerciseUpdate2.getProto$health_services_client_release()).build();
        k.d(build, "newBuilder()\n           …oto)\n            .build()");
        this.proto = (ResponsesProto.ExerciseUpdateResponse) build;
    }

    public final ExerciseUpdate getExerciseUpdate() {
        return this.exerciseUpdate;
    }

    public ResponsesProto.ExerciseUpdateResponse getProto() {
        return this.proto;
    }
}
