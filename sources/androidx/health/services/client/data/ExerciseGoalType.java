package androidx.health.services.client.data;

import a1.a;
import androidx.health.services.client.proto.DataProto;
import java.util.Iterator;
import java.util.List;
import q7.g;
import q7.k;

public final class ExerciseGoalType {
    public static final Companion Companion = new Companion((g) null);
    public static final ExerciseGoalType MILESTONE;
    public static final ExerciseGoalType ONE_TIME_GOAL;
    public static final List<ExerciseGoalType> VALUES;
    private final int id;
    private final String name;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final ExerciseGoalType fromId(int i8) {
            T t8;
            boolean z8;
            Iterator<T> it = ExerciseGoalType.VALUES.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t8 = null;
                    break;
                }
                t8 = it.next();
                if (((ExerciseGoalType) t8).getId() == i8) {
                    z8 = true;
                    continue;
                } else {
                    z8 = false;
                    continue;
                }
                if (z8) {
                    break;
                }
            }
            return (ExerciseGoalType) t8;
        }

        public final ExerciseGoalType fromProto$health_services_client_release(DataProto.ExerciseGoalType exerciseGoalType) {
            k.e(exerciseGoalType, "proto");
            return fromId(exerciseGoalType.getNumber());
        }
    }

    static {
        ExerciseGoalType exerciseGoalType = new ExerciseGoalType(1, "ONE_TIME_GOAL");
        ONE_TIME_GOAL = exerciseGoalType;
        ExerciseGoalType exerciseGoalType2 = new ExerciseGoalType(2, "MILESTONE");
        MILESTONE = exerciseGoalType2;
        VALUES = a.B(exerciseGoalType, exerciseGoalType2);
    }

    private ExerciseGoalType(int i8, String str) {
        this.id = i8;
        this.name = str;
    }

    public static final ExerciseGoalType fromId(int i8) {
        return Companion.fromId(i8);
    }

    public static final ExerciseGoalType fromProto$health_services_client_release(DataProto.ExerciseGoalType exerciseGoalType) {
        return Companion.fromProto$health_services_client_release(exerciseGoalType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExerciseGoalType) && this.id == ((ExerciseGoalType) obj).id;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.id;
    }

    public final DataProto.ExerciseGoalType toProto$health_services_client_release() {
        DataProto.ExerciseGoalType forNumber = DataProto.ExerciseGoalType.forNumber(this.id);
        return forNumber == null ? DataProto.ExerciseGoalType.EXERCISE_GOAL_TYPE_UNKNOWN : forNumber;
    }

    public String toString() {
        return this.name;
    }
}
