package androidx.health.services.client.impl.response;

import android.os.Parcelable;
import androidx.health.services.client.data.Availability;
import androidx.health.services.client.data.DeltaDataType;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.proto.ResponsesProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class AvailabilityResponse extends ProtoParcelable<ResponsesProto.AvailabilityResponse> {
    public static final Parcelable.Creator<AvailabilityResponse> CREATOR = new AvailabilityResponse$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final Availability availability;
    private final DeltaDataType<?, ?> dataType;
    private final ResponsesProto.AvailabilityResponse proto;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.health.services.client.proto.DataProto$Availability$AvailabilityCase[] r0 = androidx.health.services.client.proto.DataProto.Availability.AvailabilityCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.health.services.client.proto.DataProto$Availability$AvailabilityCase r1 = androidx.health.services.client.proto.DataProto.Availability.AvailabilityCase.DATA_TYPE_AVAILABILITY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.health.services.client.proto.DataProto$Availability$AvailabilityCase r1 = androidx.health.services.client.proto.DataProto.Availability.AvailabilityCase.LOCATION_AVAILABILITY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.health.services.client.proto.DataProto$Availability$AvailabilityCase r1 = androidx.health.services.client.proto.DataProto.Availability.AvailabilityCase.AVAILABILITY_NOT_SET     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.impl.response.AvailabilityResponse.WhenMappings.<clinit>():void");
        }
    }

    public AvailabilityResponse(DeltaDataType<?, ?> deltaDataType, Availability availability2) {
        k.e(deltaDataType, "dataType");
        k.e(availability2, "availability");
        this.dataType = deltaDataType;
        this.availability = availability2;
        y build = ResponsesProto.AvailabilityResponse.newBuilder().setDataType(deltaDataType.getProto$health_services_client_release()).setAvailability(availability2.toProto()).build();
        k.d(build, "newBuilder()\n           …o())\n            .build()");
        this.proto = (ResponsesProto.AvailabilityResponse) build;
    }

    public final Availability getAvailability() {
        return this.availability;
    }

    public final DeltaDataType<?, ?> getDataType() {
        return this.dataType;
    }

    public ResponsesProto.AvailabilityResponse getProto() {
        return this.proto;
    }
}
