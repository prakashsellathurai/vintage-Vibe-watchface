package androidx.health.services.client.impl.event;

import android.os.Parcelable;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.impl.response.AvailabilityResponse;
import androidx.health.services.client.impl.response.ExerciseLapSummaryResponse;
import androidx.health.services.client.impl.response.ExerciseUpdateResponse;
import androidx.health.services.client.proto.EventsProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class ExerciseUpdateListenerEvent extends ProtoParcelable<EventsProto.ExerciseUpdateListenerEvent> {
    public static final Parcelable.Creator<ExerciseUpdateListenerEvent> CREATOR = new ExerciseUpdateListenerEvent$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final EventsProto.ExerciseUpdateListenerEvent proto;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final ExerciseUpdateListenerEvent createAvailabilityUpdateEvent(AvailabilityResponse availabilityResponse) {
            k.e(availabilityResponse, "availability");
            y build = EventsProto.ExerciseUpdateListenerEvent.newBuilder().setAvailabilityResponse(availabilityResponse.getProto()).build();
            k.d(build, "newBuilder().setAvailabi…ailability.proto).build()");
            return new ExerciseUpdateListenerEvent((EventsProto.ExerciseUpdateListenerEvent) build);
        }

        public final ExerciseUpdateListenerEvent createExerciseUpdateEvent(ExerciseUpdateResponse exerciseUpdateResponse) {
            k.e(exerciseUpdateResponse, "exerciseUpdate");
            y build = EventsProto.ExerciseUpdateListenerEvent.newBuilder().setExerciseUpdateResponse(exerciseUpdateResponse.getProto()).build();
            k.d(build, "newBuilder().setExercise…ciseUpdate.proto).build()");
            return new ExerciseUpdateListenerEvent((EventsProto.ExerciseUpdateListenerEvent) build);
        }

        public final ExerciseUpdateListenerEvent createLapSummaryEvent(ExerciseLapSummaryResponse exerciseLapSummaryResponse) {
            k.e(exerciseLapSummaryResponse, "lapSummary");
            y build = EventsProto.ExerciseUpdateListenerEvent.newBuilder().setLapSummaryResponse(exerciseLapSummaryResponse.getProto()).build();
            k.d(build, "newBuilder().setLapSumma…lapSummary.proto).build()");
            return new ExerciseUpdateListenerEvent((EventsProto.ExerciseUpdateListenerEvent) build);
        }
    }

    public ExerciseUpdateListenerEvent(EventsProto.ExerciseUpdateListenerEvent exerciseUpdateListenerEvent) {
        k.e(exerciseUpdateListenerEvent, "proto");
        this.proto = exerciseUpdateListenerEvent;
    }

    public static final ExerciseUpdateListenerEvent createAvailabilityUpdateEvent(AvailabilityResponse availabilityResponse) {
        return Companion.createAvailabilityUpdateEvent(availabilityResponse);
    }

    public static final ExerciseUpdateListenerEvent createExerciseUpdateEvent(ExerciseUpdateResponse exerciseUpdateResponse) {
        return Companion.createExerciseUpdateEvent(exerciseUpdateResponse);
    }

    public static final ExerciseUpdateListenerEvent createLapSummaryEvent(ExerciseLapSummaryResponse exerciseLapSummaryResponse) {
        return Companion.createLapSummaryEvent(exerciseLapSummaryResponse);
    }

    public EventsProto.ExerciseUpdateListenerEvent getProto() {
        return this.proto;
    }
}
