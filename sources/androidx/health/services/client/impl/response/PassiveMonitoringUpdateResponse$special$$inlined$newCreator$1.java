package androidx.health.services.client.impl.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.proto.ResponsesProto;
import q7.k;

public final class PassiveMonitoringUpdateResponse$special$$inlined$newCreator$1 implements Parcelable.Creator<PassiveMonitoringUpdateResponse> {
    public PassiveMonitoringUpdateResponse createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        ResponsesProto.PassiveMonitoringUpdateResponse parseFrom = ResponsesProto.PassiveMonitoringUpdateResponse.parseFrom(createByteArray);
        k.d(parseFrom, "proto");
        return new PassiveMonitoringUpdateResponse(parseFrom);
    }

    public PassiveMonitoringUpdateResponse[] newArray(int i8) {
        return new PassiveMonitoringUpdateResponse[i8];
    }
}
