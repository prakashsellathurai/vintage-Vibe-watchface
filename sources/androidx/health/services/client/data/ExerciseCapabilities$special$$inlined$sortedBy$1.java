package androidx.health.services.client.data;

import a1.a;
import androidx.health.services.client.proto.DataProto;
import java.util.Comparator;

public final class ExerciseCapabilities$special$$inlined$sortedBy$1<T> implements Comparator {
    public final int compare(T t8, T t9) {
        return a.m(((DataProto.ExerciseCapabilities.TypeToCapabilitiesEntry) t8).getType().name(), ((DataProto.ExerciseCapabilities.TypeToCapabilitiesEntry) t9).getType().name());
    }
}
