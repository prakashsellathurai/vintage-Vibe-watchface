package androidx.health.services.client.impl.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.data.ExerciseGoal;
import q7.k;

public final class ExerciseGoalRequest$Companion$CREATOR$1 implements Parcelable.Creator<ExerciseGoalRequest> {
    public ExerciseGoalRequest createFromParcel(Parcel parcel) {
        ExerciseGoal exerciseGoal;
        k.e(parcel, "source");
        String readString = parcel.readString();
        if (readString == null || (exerciseGoal = (ExerciseGoal) parcel.readParcelable(ExerciseGoal.class.getClassLoader())) == null) {
            return null;
        }
        return new ExerciseGoalRequest(readString, exerciseGoal);
    }

    public ExerciseGoalRequest[] newArray(int i8) {
        return new ExerciseGoalRequest[i8];
    }
}
