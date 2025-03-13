package androidx.health.services.client.impl.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.data.MeasureCapabilities;
import androidx.health.services.client.proto.DataProto;
import androidx.health.services.client.proto.ResponsesProto;
import q7.k;

public final class MeasureCapabilitiesResponse$special$$inlined$newCreator$1 implements Parcelable.Creator<MeasureCapabilitiesResponse> {
    public MeasureCapabilitiesResponse createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        DataProto.MeasureCapabilities capabilities = ResponsesProto.MeasureCapabilitiesResponse.parseFrom(createByteArray).getCapabilities();
        k.d(capabilities, "proto.capabilities");
        return new MeasureCapabilitiesResponse(new MeasureCapabilities(capabilities));
    }

    public MeasureCapabilitiesResponse[] newArray(int i8) {
        return new MeasureCapabilitiesResponse[i8];
    }
}
