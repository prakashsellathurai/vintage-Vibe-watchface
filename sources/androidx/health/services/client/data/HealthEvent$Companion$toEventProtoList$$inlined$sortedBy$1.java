package androidx.health.services.client.data;

import a1.a;
import androidx.health.services.client.proto.DataProto;
import java.util.Comparator;

public final class HealthEvent$Companion$toEventProtoList$$inlined$sortedBy$1<T> implements Comparator {
    public final int compare(T t8, T t9) {
        return a.m(((DataProto.HealthEvent.MetricsEntry) t8).getDataType().getName(), ((DataProto.HealthEvent.MetricsEntry) t9).getDataType().getName());
    }
}
