package androidx.health.services.client.impl.response;

import android.os.Parcelable;
import androidx.health.services.client.data.HealthEvent;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.proto.ResponsesProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class HealthEventResponse extends ProtoParcelable<ResponsesProto.HealthEventResponse> {
    public static final Parcelable.Creator<HealthEventResponse> CREATOR = new HealthEventResponse$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final HealthEvent healthEvent;
    private final ResponsesProto.HealthEventResponse proto;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public HealthEventResponse(HealthEvent healthEvent2) {
        k.e(healthEvent2, "healthEvent");
        this.healthEvent = healthEvent2;
        y build = ResponsesProto.HealthEventResponse.newBuilder().setHealthEvent(healthEvent2.getProto$health_services_client_release()).build();
        k.d(build, "newBuilder().setHealthEv…ealthEvent.proto).build()");
        this.proto = (ResponsesProto.HealthEventResponse) build;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HealthEventResponse(androidx.health.services.client.proto.ResponsesProto.HealthEventResponse r3) {
        /*
            r2 = this;
            java.lang.String r0 = "proto"
            q7.k.e(r3, r0)
            androidx.health.services.client.data.HealthEvent r0 = new androidx.health.services.client.data.HealthEvent
            androidx.health.services.client.proto.DataProto$HealthEvent r3 = r3.getHealthEvent()
            java.lang.String r1 = "proto.healthEvent"
            q7.k.d(r3, r1)
            r0.<init>(r3)
            r2.<init>((androidx.health.services.client.data.HealthEvent) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.impl.response.HealthEventResponse.<init>(androidx.health.services.client.proto.ResponsesProto$HealthEventResponse):void");
    }

    public final HealthEvent getHealthEvent() {
        return this.healthEvent;
    }

    public ResponsesProto.HealthEventResponse getProto() {
        return this.proto;
    }
}
