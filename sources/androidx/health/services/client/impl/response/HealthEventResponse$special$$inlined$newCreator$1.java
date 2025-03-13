package androidx.health.services.client.impl.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.proto.ResponsesProto;
import q7.k;

public final class HealthEventResponse$special$$inlined$newCreator$1 implements Parcelable.Creator<HealthEventResponse> {
    public HealthEventResponse createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        ResponsesProto.HealthEventResponse parseFrom = ResponsesProto.HealthEventResponse.parseFrom(createByteArray);
        k.d(parseFrom, "proto");
        return new HealthEventResponse(parseFrom);
    }

    public HealthEventResponse[] newArray(int i8) {
        return new HealthEventResponse[i8];
    }
}
