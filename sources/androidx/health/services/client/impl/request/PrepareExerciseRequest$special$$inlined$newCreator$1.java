package androidx.health.services.client.impl.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.data.WarmUpConfig;
import androidx.health.services.client.proto.DataProto;
import androidx.health.services.client.proto.RequestsProto;
import q7.k;

public final class PrepareExerciseRequest$special$$inlined$newCreator$1 implements Parcelable.Creator<PrepareExerciseRequest> {
    public PrepareExerciseRequest createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        RequestsProto.PrepareExerciseRequest parseFrom = RequestsProto.PrepareExerciseRequest.parseFrom(createByteArray);
        String packageName = parseFrom.getPackageName();
        k.d(packageName, "proto.packageName");
        DataProto.WarmUpConfig config = parseFrom.getConfig();
        k.d(config, "proto.config");
        return new PrepareExerciseRequest(packageName, new WarmUpConfig(config));
    }

    public PrepareExerciseRequest[] newArray(int i8) {
        return new PrepareExerciseRequest[i8];
    }
}
