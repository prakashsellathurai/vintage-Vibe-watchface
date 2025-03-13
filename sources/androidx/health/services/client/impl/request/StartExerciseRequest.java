package androidx.health.services.client.impl.request;

import android.os.Parcelable;
import androidx.health.services.client.data.ExerciseConfig;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.proto.RequestsProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class StartExerciseRequest extends ProtoParcelable<RequestsProto.StartExerciseRequest> {
    public static final Parcelable.Creator<StartExerciseRequest> CREATOR = new StartExerciseRequest$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final ExerciseConfig exerciseConfig;
    private final String packageName;
    private final RequestsProto.StartExerciseRequest proto;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public StartExerciseRequest(String str, ExerciseConfig exerciseConfig2) {
        k.e(str, "packageName");
        k.e(exerciseConfig2, "exerciseConfig");
        this.packageName = str;
        this.exerciseConfig = exerciseConfig2;
        y build = RequestsProto.StartExerciseRequest.newBuilder().setPackageName(str).setConfig(exerciseConfig2.toProto$health_services_client_release()).build();
        k.d(build, "newBuilder()\n           …o())\n            .build()");
        this.proto = (RequestsProto.StartExerciseRequest) build;
    }

    public final ExerciseConfig getExerciseConfig() {
        return this.exerciseConfig;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public RequestsProto.StartExerciseRequest getProto() {
        return this.proto;
    }
}
