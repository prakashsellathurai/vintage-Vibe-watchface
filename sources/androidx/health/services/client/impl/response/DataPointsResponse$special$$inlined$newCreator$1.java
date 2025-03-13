package androidx.health.services.client.impl.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.proto.ResponsesProto;
import q7.k;

public final class DataPointsResponse$special$$inlined$newCreator$1 implements Parcelable.Creator<DataPointsResponse> {
    public DataPointsResponse createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        ResponsesProto.DataPointsResponse parseFrom = ResponsesProto.DataPointsResponse.parseFrom(createByteArray);
        k.d(parseFrom, "proto");
        return new DataPointsResponse(parseFrom);
    }

    public DataPointsResponse[] newArray(int i8) {
        return new DataPointsResponse[i8];
    }
}
