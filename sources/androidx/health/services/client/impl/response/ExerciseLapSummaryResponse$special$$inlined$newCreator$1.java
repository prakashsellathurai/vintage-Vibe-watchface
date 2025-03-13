package androidx.health.services.client.impl.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.data.ExerciseLapSummary;
import androidx.health.services.client.proto.DataProto;
import androidx.health.services.client.proto.ResponsesProto;
import q7.k;

public final class ExerciseLapSummaryResponse$special$$inlined$newCreator$1 implements Parcelable.Creator<ExerciseLapSummaryResponse> {
    public ExerciseLapSummaryResponse createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        DataProto.ExerciseLapSummary lapSummary = ResponsesProto.ExerciseLapSummaryResponse.parseFrom(createByteArray).getLapSummary();
        k.d(lapSummary, "proto.lapSummary");
        return new ExerciseLapSummaryResponse(new ExerciseLapSummary(lapSummary));
    }

    public ExerciseLapSummaryResponse[] newArray(int i8) {
        return new ExerciseLapSummaryResponse[i8];
    }
}
