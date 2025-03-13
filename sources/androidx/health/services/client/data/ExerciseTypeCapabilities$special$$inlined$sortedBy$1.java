package androidx.health.services.client.data;

import a1.a;
import androidx.health.services.client.proto.DataProto;
import java.util.Comparator;

public final class ExerciseTypeCapabilities$special$$inlined$sortedBy$1<T> implements Comparator {
    public final int compare(T t8, T t9) {
        return a.m(((DataProto.ExerciseTypeCapabilities.SupportedGoalEntry) t8).getDataType().getName(), ((DataProto.ExerciseTypeCapabilities.SupportedGoalEntry) t9).getDataType().getName());
    }
}
