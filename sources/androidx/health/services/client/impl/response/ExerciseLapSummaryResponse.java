package androidx.health.services.client.impl.response;

import android.os.Parcelable;
import androidx.health.services.client.data.ExerciseLapSummary;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.proto.ResponsesProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class ExerciseLapSummaryResponse extends ProtoParcelable<ResponsesProto.ExerciseLapSummaryResponse> {
    public static final Parcelable.Creator<ExerciseLapSummaryResponse> CREATOR = new ExerciseLapSummaryResponse$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final ExerciseLapSummary exerciseLapSummary;
    private final ResponsesProto.ExerciseLapSummaryResponse proto;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public ExerciseLapSummaryResponse(ExerciseLapSummary exerciseLapSummary2) {
        k.e(exerciseLapSummary2, "exerciseLapSummary");
        this.exerciseLapSummary = exerciseLapSummary2;
        y build = ResponsesProto.ExerciseLapSummaryResponse.newBuilder().setLapSummary(exerciseLapSummary2.getProto$health_services_client_release()).build();
        k.d(build, "newBuilder()\n           …oto)\n            .build()");
        this.proto = (ResponsesProto.ExerciseLapSummaryResponse) build;
    }

    public final ExerciseLapSummary getExerciseLapSummary() {
        return this.exerciseLapSummary;
    }

    public ResponsesProto.ExerciseLapSummaryResponse getProto() {
        return this.proto;
    }
}
