package androidx.health.services.client.impl.request;

import android.os.Parcelable;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.data.WarmUpConfig;
import androidx.health.services.client.proto.RequestsProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class PrepareExerciseRequest extends ProtoParcelable<RequestsProto.PrepareExerciseRequest> {
    public static final Parcelable.Creator<PrepareExerciseRequest> CREATOR = new PrepareExerciseRequest$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final String packageName;
    private final RequestsProto.PrepareExerciseRequest proto;
    private final WarmUpConfig warmUpConfig;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public PrepareExerciseRequest(String str, WarmUpConfig warmUpConfig2) {
        k.e(str, "packageName");
        k.e(warmUpConfig2, "warmUpConfig");
        this.packageName = str;
        this.warmUpConfig = warmUpConfig2;
        y build = RequestsProto.PrepareExerciseRequest.newBuilder().setPackageName(str).setConfig(warmUpConfig2.getProto$health_services_client_release()).build();
        k.d(build, "newBuilder()\n           …oto)\n            .build()");
        this.proto = (RequestsProto.PrepareExerciseRequest) build;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public RequestsProto.PrepareExerciseRequest getProto() {
        return this.proto;
    }

    public final WarmUpConfig getWarmUpConfig() {
        return this.warmUpConfig;
    }
}
