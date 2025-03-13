package androidx.health.services.client.impl.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.proto.ResponsesProto;
import q7.k;

public final class PassiveMonitoringGoalResponse$special$$inlined$newCreator$1 implements Parcelable.Creator<PassiveMonitoringGoalResponse> {
    public PassiveMonitoringGoalResponse createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        ResponsesProto.PassiveMonitoringGoalResponse parseFrom = ResponsesProto.PassiveMonitoringGoalResponse.parseFrom(createByteArray);
        k.d(parseFrom, "proto");
        return new PassiveMonitoringGoalResponse(parseFrom);
    }

    public PassiveMonitoringGoalResponse[] newArray(int i8) {
        return new PassiveMonitoringGoalResponse[i8];
    }
}
