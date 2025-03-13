package androidx.health.services.client.impl.request;

import android.os.Parcelable;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.proto.RequestsProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class AutoPauseAndResumeConfigRequest extends ProtoParcelable<RequestsProto.AutoPauseAndResumeConfigRequest> {
    public static final Parcelable.Creator<AutoPauseAndResumeConfigRequest> CREATOR = new AutoPauseAndResumeConfigRequest$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final String packageName;
    private final RequestsProto.AutoPauseAndResumeConfigRequest proto;
    private final boolean shouldEnable;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public AutoPauseAndResumeConfigRequest(String str, boolean z8) {
        k.e(str, "packageName");
        this.packageName = str;
        this.shouldEnable = z8;
        y build = RequestsProto.AutoPauseAndResumeConfigRequest.newBuilder().setPackageName(str).setShouldEnable(z8).build();
        k.d(build, "newBuilder()\n           …ble)\n            .build()");
        this.proto = (RequestsProto.AutoPauseAndResumeConfigRequest) build;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public RequestsProto.AutoPauseAndResumeConfigRequest getProto() {
        return this.proto;
    }

    public final boolean getShouldEnable() {
        return this.shouldEnable;
    }
}
