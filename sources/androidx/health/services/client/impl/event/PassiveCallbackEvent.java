package androidx.health.services.client.impl.event;

import android.os.Parcelable;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.impl.response.PassiveMonitoringUpdateResponse;
import androidx.health.services.client.proto.EventsProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class PassiveCallbackEvent extends ProtoParcelable<EventsProto.PassiveCallbackEvent> {
    public static final Parcelable.Creator<PassiveCallbackEvent> CREATOR = new PassiveCallbackEvent$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final EventsProto.PassiveCallbackEvent proto;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final PassiveCallbackEvent createPassiveUpdateResponse(PassiveMonitoringUpdateResponse passiveMonitoringUpdateResponse) {
            k.e(passiveMonitoringUpdateResponse, "response");
            y build = EventsProto.PassiveCallbackEvent.newBuilder().setPassiveUpdateResponse(passiveMonitoringUpdateResponse.getProto()).build();
            k.d(build, "newBuilder().setPassiveU…e(response.proto).build()");
            return new PassiveCallbackEvent((EventsProto.PassiveCallbackEvent) build);
        }
    }

    public PassiveCallbackEvent(EventsProto.PassiveCallbackEvent passiveCallbackEvent) {
        k.e(passiveCallbackEvent, "proto");
        this.proto = passiveCallbackEvent;
    }

    public static final PassiveCallbackEvent createPassiveUpdateResponse(PassiveMonitoringUpdateResponse passiveMonitoringUpdateResponse) {
        return Companion.createPassiveUpdateResponse(passiveMonitoringUpdateResponse);
    }

    public EventsProto.PassiveCallbackEvent getProto() {
        return this.proto;
    }
}
