package androidx.health.services.client.impl.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.data.ExerciseConfig;
import androidx.health.services.client.proto.DataProto;
import androidx.health.services.client.proto.RequestsProto;
import q7.k;

public final class StartExerciseRequest$special$$inlined$newCreator$1 implements Parcelable.Creator<StartExerciseRequest> {
    public StartExerciseRequest createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        RequestsProto.StartExerciseRequest parseFrom = RequestsProto.StartExerciseRequest.parseFrom(createByteArray);
        String packageName = parseFrom.getPackageName();
        k.d(packageName, "proto.packageName");
        DataProto.ExerciseConfig config = parseFrom.getConfig();
        k.d(config, "proto.config");
        return new StartExerciseRequest(packageName, new ExerciseConfig(config));
    }

    public StartExerciseRequest[] newArray(int i8) {
        return new StartExerciseRequest[i8];
    }
}
