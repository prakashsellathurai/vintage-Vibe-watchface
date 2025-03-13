package androidx.health.services.client.impl.response;

import android.os.Parcelable;
import androidx.health.services.client.data.MeasureCapabilities;
import androidx.health.services.client.data.ProtoParcelable;
import androidx.health.services.client.proto.ResponsesProto;
import com.google.protobuf.y;
import q7.g;
import q7.k;

public final class MeasureCapabilitiesResponse extends ProtoParcelable<ResponsesProto.MeasureCapabilitiesResponse> {
    public static final Parcelable.Creator<MeasureCapabilitiesResponse> CREATOR = new MeasureCapabilitiesResponse$special$$inlined$newCreator$1();
    public static final Companion Companion = new Companion((g) null);
    private final MeasureCapabilities measureCapabilities;
    private final ResponsesProto.MeasureCapabilitiesResponse proto;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public MeasureCapabilitiesResponse(MeasureCapabilities measureCapabilities2) {
        k.e(measureCapabilities2, "measureCapabilities");
        this.measureCapabilities = measureCapabilities2;
        y build = ResponsesProto.MeasureCapabilitiesResponse.newBuilder().setCapabilities(measureCapabilities2.getProto$health_services_client_release()).build();
        k.d(build, "newBuilder()\n           …oto)\n            .build()");
        this.proto = (ResponsesProto.MeasureCapabilitiesResponse) build;
    }

    public final MeasureCapabilities getMeasureCapabilities() {
        return this.measureCapabilities;
    }

    public ResponsesProto.MeasureCapabilitiesResponse getProto() {
        return this.proto;
    }
}
