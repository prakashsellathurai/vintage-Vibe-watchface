package androidx.health.services.client.impl.response;

import android.os.Parcelable;
import androidx.health.services.client.data.PassiveMonitoringCapabilities;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.proto.ResponsesProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class PassiveMonitoringCapabilitiesResponse extends ProtoParcelable<ResponsesProto.PassiveMonitoringCapabilitiesResponse> {
    public static final Parcelable.Creator<PassiveMonitoringCapabilitiesResponse> CREATOR = new PassiveMonitoringCapabilitiesResponse$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final PassiveMonitoringCapabilities passiveMonitoringCapabilities;
    private final ResponsesProto.PassiveMonitoringCapabilitiesResponse proto;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public PassiveMonitoringCapabilitiesResponse(PassiveMonitoringCapabilities passiveMonitoringCapabilities2) {
        k.e(passiveMonitoringCapabilities2, "passiveMonitoringCapabilities");
        this.passiveMonitoringCapabilities = passiveMonitoringCapabilities2;
        y build = ResponsesProto.PassiveMonitoringCapabilitiesResponse.newBuilder().setCapabilities(passiveMonitoringCapabilities2.getProto$health_services_client_release()).build();
        k.d(build, "newBuilder()\n           …oto)\n            .build()");
        this.proto = (ResponsesProto.PassiveMonitoringCapabilitiesResponse) build;
    }

    public final PassiveMonitoringCapabilities getPassiveMonitoringCapabilities() {
        return this.passiveMonitoringCapabilities;
    }

    public ResponsesProto.PassiveMonitoringCapabilitiesResponse getProto() {
        return this.proto;
    }
}
