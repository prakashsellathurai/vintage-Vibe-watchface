package androidx.health.services.client.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.data.ExerciseGoal;
import androidx.health.services.client.proto.DataProto;
import q7.k;

public final class ExerciseGoal$Companion$CREATOR$1 implements Parcelable.Creator<ExerciseGoal<?>> {
    public ExerciseGoal<?> createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        DataProto.ExerciseGoal parseFrom = DataProto.ExerciseGoal.parseFrom(createByteArray);
        ExerciseGoal.Companion companion = ExerciseGoal.Companion;
        k.d(parseFrom, "proto");
        return companion.fromProto$health_services_client_release(parseFrom);
    }

    public ExerciseGoal<?>[] newArray(int i8) {
        return new ExerciseGoal[i8];
    }
}
