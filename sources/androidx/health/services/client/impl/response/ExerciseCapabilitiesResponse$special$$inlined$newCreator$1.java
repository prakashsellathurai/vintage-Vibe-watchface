package androidx.health.services.client.impl.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.data.ExerciseCapabilities;
import androidx.health.services.client.proto.DataProto;
import androidx.health.services.client.proto.ResponsesProto;
import q7.k;

public final class ExerciseCapabilitiesResponse$special$$inlined$newCreator$1 implements Parcelable.Creator<ExerciseCapabilitiesResponse> {
    public ExerciseCapabilitiesResponse createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        DataProto.ExerciseCapabilities capabilities = ResponsesProto.ExerciseCapabilitiesResponse.parseFrom(createByteArray).getCapabilities();
        k.d(capabilities, "proto.capabilities");
        return new ExerciseCapabilitiesResponse(new ExerciseCapabilities(capabilities));
    }

    public ExerciseCapabilitiesResponse[] newArray(int i8) {
        return new ExerciseCapabilitiesResponse[i8];
    }
}
