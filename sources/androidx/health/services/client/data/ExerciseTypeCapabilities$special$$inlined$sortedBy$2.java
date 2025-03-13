package androidx.health.services.client.data;

import a1.a;
import androidx.health.services.client.proto.DataProto;
import java.util.Comparator;

public final class ExerciseTypeCapabilities$special$$inlined$sortedBy$2<T> implements Comparator {
    public final int compare(T t8, T t9) {
        return a.m(((DataProto.ExerciseTypeCapabilities.SupportedMilestoneEntry) t8).getDataType().getName(), ((DataProto.ExerciseTypeCapabilities.SupportedMilestoneEntry) t9).getDataType().getName());
    }
}
