package androidx.health.services.client.impl.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.data.ExerciseUpdate;
import androidx.health.services.client.proto.DataProto;
import androidx.health.services.client.proto.ResponsesProto;
import q7.k;

public final class ExerciseUpdateResponse$special$$inlined$newCreator$1 implements Parcelable.Creator<ExerciseUpdateResponse> {
    public ExerciseUpdateResponse createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        DataProto.ExerciseUpdate exerciseUpdate = ResponsesProto.ExerciseUpdateResponse.parseFrom(createByteArray).getExerciseUpdate();
        k.d(exerciseUpdate, "proto.exerciseUpdate");
        return new ExerciseUpdateResponse(new ExerciseUpdate(exerciseUpdate));
    }

    public ExerciseUpdateResponse[] newArray(int i8) {
        return new ExerciseUpdateResponse[i8];
    }
}
