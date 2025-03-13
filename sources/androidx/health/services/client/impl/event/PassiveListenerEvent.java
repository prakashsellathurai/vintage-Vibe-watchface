package androidx.health.services.client.impl.event;

import android.os.Parcelable;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.impl.response.HealthEventResponse;
import androidx.health.services.client.impl.response.PassiveMonitoringGoalResponse;
import androidx.health.services.client.impl.response.PassiveMonitoringUpdateResponse;
import androidx.health.services.client.proto.EventsProto;
import androidx.health.services.client.proto.ResponsesProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class PassiveListenerEvent extends ProtoParcelable<EventsProto.PassiveListenerEvent> {
    public static final Parcelable.Creator<PassiveListenerEvent> CREATOR = new PassiveListenerEvent$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final EventsProto.PassiveListenerEvent proto;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final PassiveListenerEvent createHealthEventResponse(HealthEventResponse healthEventResponse) {
            k.e(healthEventResponse, "response");
            y build = EventsProto.PassiveListenerEvent.newBuilder().setHealthEventResponse(healthEventResponse.getProto()).build();
            k.d(build, "newBuilder().setHealthEv…e(response.proto).build()");
            return new PassiveListenerEvent((EventsProto.PassiveListenerEvent) build);
        }

        public final PassiveListenerEvent createPassiveGoalResponse(PassiveMonitoringGoalResponse passiveMonitoringGoalResponse) {
            k.e(passiveMonitoringGoalResponse, "response");
            y build = EventsProto.PassiveListenerEvent.newBuilder().setPassiveGoalResponse(passiveMonitoringGoalResponse.getProto()).build();
            k.d(build, "newBuilder().setPassiveG…e(response.proto).build()");
            return new PassiveListenerEvent((EventsProto.PassiveListenerEvent) build);
        }

        public final PassiveListenerEvent createPassiveUpdateResponse(PassiveMonitoringUpdateResponse passiveMonitoringUpdateResponse) {
            k.e(passiveMonitoringUpdateResponse, "response");
            y build = EventsProto.PassiveListenerEvent.newBuilder().setPassiveUpdateResponse(passiveMonitoringUpdateResponse.getProto()).build();
            k.d(build, "newBuilder().setPassiveU…e(response.proto).build()");
            return new PassiveListenerEvent((EventsProto.PassiveListenerEvent) build);
        }

        public final PassiveListenerEvent createPermissionLostResponse() {
            y build = EventsProto.PassiveListenerEvent.newBuilder().setPermissionLostResponse((ResponsesProto.PermissionLostResponse) ResponsesProto.PermissionLostResponse.newBuilder().build()).build();
            k.d(build, "newBuilder()\n           …                 .build()");
            return new PassiveListenerEvent((EventsProto.PassiveListenerEvent) build);
        }
    }

    public PassiveListenerEvent(EventsProto.PassiveListenerEvent passiveListenerEvent) {
        k.e(passiveListenerEvent, "proto");
        this.proto = passiveListenerEvent;
    }

    public static final PassiveListenerEvent createHealthEventResponse(HealthEventResponse healthEventResponse) {
        return Companion.createHealthEventResponse(healthEventResponse);
    }

    public static final PassiveListenerEvent createPassiveGoalResponse(PassiveMonitoringGoalResponse passiveMonitoringGoalResponse) {
        return Companion.createPassiveGoalResponse(passiveMonitoringGoalResponse);
    }

    public static final PassiveListenerEvent createPassiveUpdateResponse(PassiveMonitoringUpdateResponse passiveMonitoringUpdateResponse) {
        return Companion.createPassiveUpdateResponse(passiveMonitoringUpdateResponse);
    }

    public static final PassiveListenerEvent createPermissionLostResponse() {
        return Companion.createPermissionLostResponse();
    }

    public EventsProto.PassiveListenerEvent getProto() {
        return this.proto;
    }
}
