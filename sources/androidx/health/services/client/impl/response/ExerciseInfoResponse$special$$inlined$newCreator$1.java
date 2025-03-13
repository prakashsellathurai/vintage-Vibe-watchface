package androidx.health.services.client.impl.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.data.ExerciseInfo;
import androidx.health.services.client.proto.DataProto;
import androidx.health.services.client.proto.ResponsesProto;
import q7.k;

public final class ExerciseInfoResponse$special$$inlined$newCreator$1 implements Parcelable.Creator<ExerciseInfoResponse> {
    public ExerciseInfoResponse createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        DataProto.ExerciseInfo exerciseInfo = ResponsesProto.ExerciseInfoResponse.parseFrom(createByteArray).getExerciseInfo();
        k.d(exerciseInfo, "proto.exerciseInfo");
        return new ExerciseInfoResponse(new ExerciseInfo(exerciseInfo));
    }

    public ExerciseInfoResponse[] newArray(int i8) {
        return new ExerciseInfoResponse[i8];
    }
}
