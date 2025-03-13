package androidx.health.services.client.impl.response;

import android.os.Parcelable;
import androidx.health.services.client.data.PassiveMonitoringUpdate;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.proto.ResponsesProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class PassiveMonitoringUpdateResponse extends ProtoParcelable<ResponsesProto.PassiveMonitoringUpdateResponse> {
    public static final Parcelable.Creator<PassiveMonitoringUpdateResponse> CREATOR = new PassiveMonitoringUpdateResponse$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final PassiveMonitoringUpdate passiveMonitoringUpdate;
    private final ResponsesProto.PassiveMonitoringUpdateResponse proto;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public PassiveMonitoringUpdateResponse(PassiveMonitoringUpdate passiveMonitoringUpdate2) {
        k.e(passiveMonitoringUpdate2, "passiveMonitoringUpdate");
        this.passiveMonitoringUpdate = passiveMonitoringUpdate2;
        y build = ResponsesProto.PassiveMonitoringUpdateResponse.newBuilder().setUpdate(passiveMonitoringUpdate2.getProto$health_services_client_release()).build();
        k.d(build, "newBuilder()\n           …oto)\n            .build()");
        this.proto = (ResponsesProto.PassiveMonitoringUpdateResponse) build;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PassiveMonitoringUpdateResponse(androidx.health.services.client.proto.ResponsesProto.PassiveMonitoringUpdateResponse r3) {
        /*
            r2 = this;
            java.lang.String r0 = "proto"
            q7.k.e(r3, r0)
            androidx.health.services.client.data.PassiveMonitoringUpdate r0 = new androidx.health.services.client.data.PassiveMonitoringUpdate
            androidx.health.services.client.proto.DataProto$PassiveMonitoringUpdate r3 = r3.getUpdate()
            java.lang.String r1 = "proto.update"
            q7.k.d(r3, r1)
            r0.<init>(r3)
            r2.<init>((androidx.health.services.client.data.PassiveMonitoringUpdate) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.impl.response.PassiveMonitoringUpdateResponse.<init>(androidx.health.services.client.proto.ResponsesProto$PassiveMonitoringUpdateResponse):void");
    }

    public final PassiveMonitoringUpdate getPassiveMonitoringUpdate() {
        return this.passiveMonitoringUpdate;
    }

    public ResponsesProto.PassiveMonitoringUpdateResponse getProto() {
        return this.proto;
    }
}
