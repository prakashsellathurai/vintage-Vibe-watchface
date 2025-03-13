package androidx.health.services.client.impl.event;

import android.os.Parcelable;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.impl.response.AvailabilityResponse;
import androidx.health.services.client.impl.response.DataPointsResponse;
import androidx.health.services.client.proto.EventsProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class MeasureCallbackEvent extends ProtoParcelable<EventsProto.MeasureCallbackEvent> {
    public static final Parcelable.Creator<MeasureCallbackEvent> CREATOR = new MeasureCallbackEvent$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final EventsProto.MeasureCallbackEvent proto;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final MeasureCallbackEvent createAvailabilityUpdateEvent$health_services_client_release(AvailabilityResponse availabilityResponse) {
            k.e(availabilityResponse, "availability");
            y build = EventsProto.MeasureCallbackEvent.newBuilder().setAvailabilityResponse(availabilityResponse.getProto()).build();
            k.d(build, "newBuilder().setAvailabi…ailability.proto).build()");
            return new MeasureCallbackEvent((EventsProto.MeasureCallbackEvent) build);
        }

        public final MeasureCallbackEvent createDataPointsUpdateEvent$health_services_client_release(DataPointsResponse dataPointsResponse) {
            k.e(dataPointsResponse, "dataPointsResponse");
            y build = EventsProto.MeasureCallbackEvent.newBuilder().setDataPointResponse(dataPointsResponse.getProto()).build();
            k.d(build, "newBuilder().setDataPoin…tsResponse.proto).build()");
            return new MeasureCallbackEvent((EventsProto.MeasureCallbackEvent) build);
        }
    }

    public MeasureCallbackEvent(EventsProto.MeasureCallbackEvent measureCallbackEvent) {
        k.e(measureCallbackEvent, "proto");
        this.proto = measureCallbackEvent;
    }

    public EventsProto.MeasureCallbackEvent getProto() {
        return this.proto;
    }
}
