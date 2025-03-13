package androidx.health.services.client.impl.response;

import android.os.Parcelable;
import androidx.health.services.client.data.ExerciseCapabilities;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.proto.ResponsesProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class ExerciseCapabilitiesResponse extends ProtoParcelable<ResponsesProto.ExerciseCapabilitiesResponse> {
    public static final Parcelable.Creator<ExerciseCapabilitiesResponse> CREATOR = new ExerciseCapabilitiesResponse$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final ExerciseCapabilities exerciseCapabilities;
    private final ResponsesProto.ExerciseCapabilitiesResponse proto;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public ExerciseCapabilitiesResponse(ExerciseCapabilities exerciseCapabilities2) {
        k.e(exerciseCapabilities2, "exerciseCapabilities");
        this.exerciseCapabilities = exerciseCapabilities2;
        y build = ResponsesProto.ExerciseCapabilitiesResponse.newBuilder().setCapabilities(exerciseCapabilities2.getProto$health_services_client_release()).build();
        k.d(build, "newBuilder()\n           …oto)\n            .build()");
        this.proto = (ResponsesProto.ExerciseCapabilitiesResponse) build;
    }

    public final ExerciseCapabilities getExerciseCapabilities() {
        return this.exerciseCapabilities;
    }

    public ResponsesProto.ExerciseCapabilitiesResponse getProto() {
        return this.proto;
    }
}
