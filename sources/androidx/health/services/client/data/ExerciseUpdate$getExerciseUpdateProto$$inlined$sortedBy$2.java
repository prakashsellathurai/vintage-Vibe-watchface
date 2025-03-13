package androidx.health.services.client.data;

import a1.a;
import androidx.health.services.client.proto.DataProto;
import java.util.Comparator;

public final class ExerciseUpdate$getExerciseUpdateProto$$inlined$sortedBy$2<T> implements Comparator {
    public final int compare(T t8, T t9) {
        return a.m(((DataProto.ExerciseUpdate.LatestMetricsEntry) t8).getDataType().getName(), ((DataProto.ExerciseUpdate.LatestMetricsEntry) t9).getDataType().getName());
    }
}
