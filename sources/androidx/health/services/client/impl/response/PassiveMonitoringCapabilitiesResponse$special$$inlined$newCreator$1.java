package androidx.health.services.client.impl.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.data.PassiveMonitoringCapabilities;
import androidx.health.services.client.proto.DataProto;
import androidx.health.services.client.proto.ResponsesProto;
import q7.k;

public final class PassiveMonitoringCapabilitiesResponse$special$$inlined$newCreator$1 implements Parcelable.Creator<PassiveMonitoringCapabilitiesResponse> {
    public PassiveMonitoringCapabilitiesResponse createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        DataProto.PassiveMonitoringCapabilities capabilities = ResponsesProto.PassiveMonitoringCapabilitiesResponse.parseFrom(createByteArray).getCapabilities();
        k.d(capabilities, "proto.capabilities");
        return new PassiveMonitoringCapabilitiesResponse(new PassiveMonitoringCapabilities(capabilities));
    }

    public PassiveMonitoringCapabilitiesResponse[] newArray(int i8) {
        return new PassiveMonitoringCapabilitiesResponse[i8];
    }
}
