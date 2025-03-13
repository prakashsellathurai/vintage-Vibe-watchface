package androidx.health.services.client.impl.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.data.ExerciseGoal;
import q7.g;
import q7.k;

public final class ExerciseGoalRequest implements Parcelable {
    public static final Parcelable.Creator<ExerciseGoalRequest> CREATOR = new ExerciseGoalRequest$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    private final ExerciseGoal<?> exerciseGoal;
    private final String packageName;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public ExerciseGoalRequest(String str, ExerciseGoal<?> exerciseGoal2) {
        k.e(str, "packageName");
        k.e(exerciseGoal2, "exerciseGoal");
        this.packageName = str;
        this.exerciseGoal = exerciseGoal2;
    }

    public static /* synthetic */ ExerciseGoalRequest copy$default(ExerciseGoalRequest exerciseGoalRequest, String str, ExerciseGoal<?> exerciseGoal2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = exerciseGoalRequest.packageName;
        }
        if ((i8 & 2) != 0) {
            exerciseGoal2 = exerciseGoalRequest.exerciseGoal;
        }
        return exerciseGoalRequest.copy(str, exerciseGoal2);
    }

    public final String component1() {
        return this.packageName;
    }

    public final ExerciseGoal<?> component2() {
        return this.exerciseGoal;
    }

    public final ExerciseGoalRequest copy(String str, ExerciseGoal<?> exerciseGoal2) {
        k.e(str, "packageName");
        k.e(exerciseGoal2, "exerciseGoal");
        return new ExerciseGoalRequest(str, exerciseGoal2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExerciseGoalRequest)) {
            return false;
        }
        ExerciseGoalRequest exerciseGoalRequest = (ExerciseGoalRequest) obj;
        return k.a(this.packageName, exerciseGoalRequest.packageName) && k.a(this.exerciseGoal, exerciseGoalRequest.exerciseGoal);
    }

    public final ExerciseGoal<?> getExerciseGoal() {
        return this.exerciseGoal;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return (this.packageName.hashCode() * 31) + this.exerciseGoal.hashCode();
    }

    public String toString() {
        return "ExerciseGoalRequest(packageName=" + this.packageName + ", exerciseGoal=" + this.exerciseGoal + ')';
    }

    public void writeToParcel(Parcel parcel, int i8) {
        k.e(parcel, "dest");
        parcel.writeString(this.packageName);
        parcel.writeParcelable(this.exerciseGoal, i8);
    }
}
