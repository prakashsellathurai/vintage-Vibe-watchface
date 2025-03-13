package androidx.health.services.client.data;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.data.DataTypeCondition;
import androidx.health.services.client.data.ExerciseGoalType;
import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import java.lang.Number;
import java.util.Objects;
import q7.g;
import q7.k;

@SuppressLint({"BanParcelableUsage"})
public final class ExerciseGoal<T extends Number> implements Parcelable {
    public static final Parcelable.Creator<ExerciseGoal<?>> CREATOR = new ExerciseGoal$Companion$CREATOR$1();
    public static final Companion Companion = new Companion((g) null);
    private final DataTypeCondition<T, AggregateDataType<T, ?>> dataTypeCondition;
    private final ExerciseGoalType exerciseGoalType;
    private final T period;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final <T extends Number> ExerciseGoal<T> createMilestone(DataTypeCondition<T, AggregateDataType<T, ?>> dataTypeCondition, T t8) {
            k.e(dataTypeCondition, "condition");
            k.e(t8, "period");
            return new ExerciseGoal<>(ExerciseGoalType.MILESTONE, dataTypeCondition, t8);
        }

        public final <T extends Number> ExerciseGoal<T> createMilestoneGoalWithUpdatedThreshold(ExerciseGoal<T> exerciseGoal, T t8) {
            k.e(exerciseGoal, "goal");
            k.e(t8, "newThreshold");
            ExerciseGoalType exerciseGoalType = ExerciseGoalType.MILESTONE;
            if (k.a(exerciseGoalType, exerciseGoal.getExerciseGoalType())) {
                if (exerciseGoal.getPeriod() != null) {
                    return new ExerciseGoal<>(exerciseGoalType, new DataTypeCondition(exerciseGoal.getDataTypeCondition().getDataType(), t8, exerciseGoal.getDataTypeCondition().getComparisonType()), exerciseGoal.getPeriod());
                }
                throw new IllegalArgumentException("The milestone goal's period should not be null.".toString());
            }
            throw new IllegalArgumentException("The goal to update should be of MILESTONE type.".toString());
        }

        public final <T extends Number> ExerciseGoal<T> createOneTimeGoal(DataTypeCondition<T, AggregateDataType<T, ?>> dataTypeCondition) {
            k.e(dataTypeCondition, "condition");
            return new ExerciseGoal(ExerciseGoalType.ONE_TIME_GOAL, dataTypeCondition, (Number) null, 4, (g) null);
        }

        public final ExerciseGoal<Number> fromProto$health_services_client_release(DataProto.ExerciseGoal exerciseGoal) {
            Number number;
            k.e(exerciseGoal, "proto");
            DataTypeCondition.Companion companion = DataTypeCondition.Companion;
            DataProto.DataTypeCondition dataTypeCondition = exerciseGoal.getDataTypeCondition();
            k.d(dataTypeCondition, "proto.dataTypeCondition");
            DataTypeCondition<? extends Number, ? extends AggregateDataType<? extends Number, ?>> aggregateFromProto$health_services_client_release = companion.aggregateFromProto$health_services_client_release(dataTypeCondition);
            k.c(aggregateFromProto$health_services_client_release, "null cannot be cast to non-null type androidx.health.services.client.data.DataTypeCondition<kotlin.Number, androidx.health.services.client.data.AggregateDataType<kotlin.Number, *>>");
            ExerciseGoalType.Companion companion2 = ExerciseGoalType.Companion;
            DataProto.ExerciseGoalType exerciseGoalType = exerciseGoal.getExerciseGoalType();
            k.d(exerciseGoalType, "proto.exerciseGoalType");
            ExerciseGoalType fromProto$health_services_client_release = companion2.fromProto$health_services_client_release(exerciseGoalType);
            if (fromProto$health_services_client_release != null) {
                if (exerciseGoal.hasPeriod()) {
                    DataProto.Value period = exerciseGoal.getPeriod();
                    k.d(period, "proto.period");
                    number = (Number) ((AggregateDataType) aggregateFromProto$health_services_client_release.getDataType()).toValueFromProto$health_services_client_release(period);
                } else {
                    number = null;
                }
                return new ExerciseGoal<>(fromProto$health_services_client_release, aggregateFromProto$health_services_client_release, number);
            }
            throw new IllegalStateException(exerciseGoal.getExerciseGoalType() + " not found");
        }
    }

    public ExerciseGoal(ExerciseGoalType exerciseGoalType2, DataTypeCondition<T, AggregateDataType<T, ?>> dataTypeCondition2, T t8) {
        k.e(exerciseGoalType2, "exerciseGoalType");
        k.e(dataTypeCondition2, "dataTypeCondition");
        this.exerciseGoalType = exerciseGoalType2;
        this.dataTypeCondition = dataTypeCondition2;
        this.period = t8;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExerciseGoal(ExerciseGoalType exerciseGoalType2, DataTypeCondition dataTypeCondition2, Number number, int i8, g gVar) {
        this(exerciseGoalType2, dataTypeCondition2, (i8 & 4) != 0 ? null : number);
    }

    public static final <T extends Number> ExerciseGoal<T> createMilestone(DataTypeCondition<T, AggregateDataType<T, ?>> dataTypeCondition2, T t8) {
        return Companion.createMilestone(dataTypeCondition2, t8);
    }

    public static final <T extends Number> ExerciseGoal<T> createMilestoneGoalWithUpdatedThreshold(ExerciseGoal<T> exerciseGoal, T t8) {
        return Companion.createMilestoneGoalWithUpdatedThreshold(exerciseGoal, t8);
    }

    public static final <T extends Number> ExerciseGoal<T> createOneTimeGoal(DataTypeCondition<T, AggregateDataType<T, ?>> dataTypeCondition2) {
        return Companion.createOneTimeGoal(dataTypeCondition2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExerciseGoal)) {
            return false;
        }
        ExerciseGoal exerciseGoal = (ExerciseGoal) obj;
        if (!k.a(this.exerciseGoalType, exerciseGoal.exerciseGoalType)) {
            return false;
        }
        return k.a(this.dataTypeCondition, exerciseGoal.dataTypeCondition) && k.a(this.period, exerciseGoal.period);
    }

    public final DataTypeCondition<T, AggregateDataType<T, ?>> getDataTypeCondition() {
        return this.dataTypeCondition;
    }

    public final ExerciseGoalType getExerciseGoalType() {
        return this.exerciseGoalType;
    }

    public final T getPeriod() {
        return this.period;
    }

    public final DataProto.ExerciseGoal getProto$health_services_client_release() {
        DataProto.ExerciseGoal.Builder dataTypeCondition2 = DataProto.ExerciseGoal.newBuilder().setExerciseGoalType(this.exerciseGoalType.toProto$health_services_client_release()).setDataTypeCondition(this.dataTypeCondition.getProto$health_services_client_release());
        if (this.period != null) {
            dataTypeCondition2.setPeriod(this.dataTypeCondition.getDataType().toProtoFromValue$health_services_client_release(this.period));
        }
        y build = dataTypeCondition2.build();
        k.d(build, "builder.build()");
        return (DataProto.ExerciseGoal) build;
    }

    public int hashCode() {
        if (k.a(this.exerciseGoalType, ExerciseGoalType.ONE_TIME_GOAL)) {
            return Objects.hash(new Object[]{this.exerciseGoalType, this.dataTypeCondition});
        }
        return Objects.hash(new Object[]{this.exerciseGoalType, this.dataTypeCondition.getDataType(), this.dataTypeCondition.getComparisonType(), this.period});
    }

    public String toString() {
        return "ExerciseGoal(exerciseGoalType=" + this.exerciseGoalType + ", dataTypeCondition=" + this.dataTypeCondition + ", period=" + this.period + ')';
    }

    public void writeToParcel(Parcel parcel, int i8) {
        k.e(parcel, "dest");
        parcel.writeByteArray(getProto$health_services_client_release().toByteArray());
    }
}
