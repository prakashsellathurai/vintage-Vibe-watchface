package androidx.health.services.client.impl.request;

import android.os.Parcelable;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.proto.RequestsProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class CapabilitiesRequest extends ProtoParcelable<RequestsProto.CapabilitiesRequest> {
    public static final Parcelable.Creator<CapabilitiesRequest> CREATOR = new CapabilitiesRequest$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final String packageName;
    private final RequestsProto.CapabilitiesRequest proto;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public CapabilitiesRequest(String str) {
        k.e(str, "packageName");
        this.packageName = str;
        y build = RequestsProto.CapabilitiesRequest.newBuilder().setPackageName(str).build();
        k.d(build, "newBuilder().setPackageName(packageName).build()");
        this.proto = (RequestsProto.CapabilitiesRequest) build;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public RequestsProto.CapabilitiesRequest getProto() {
        return this.proto;
    }
}
