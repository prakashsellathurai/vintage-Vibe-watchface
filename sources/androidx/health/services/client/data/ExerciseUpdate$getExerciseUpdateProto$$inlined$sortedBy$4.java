package androidx.health.services.client.data;

import a1.a;
import androidx.health.services.client.proto.DataProto;
import java.util.Comparator;

public final class ExerciseUpdate$getExerciseUpdateProto$$inlined$sortedBy$4<T> implements Comparator {
    public final int compare(T t8, T t9) {
        return a.m(((DataProto.AggregateDataPoint) t8).getCumulativeDataPoint().getDataType().getName(), ((DataProto.AggregateDataPoint) t9).getCumulativeDataPoint().getDataType().getName());
    }
}
