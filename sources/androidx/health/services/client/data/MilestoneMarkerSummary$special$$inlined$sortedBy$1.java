package androidx.health.services.client.data;

import a1.a;
import androidx.health.services.client.proto.DataProto;
import java.util.Comparator;

public final class MilestoneMarkerSummary$special$$inlined$sortedBy$1<T> implements Comparator {
    public final int compare(T t8, T t9) {
        return a.m(((DataProto.MilestoneMarkerSummary.SummaryMetricsEntry) t8).getDataType().getName(), ((DataProto.MilestoneMarkerSummary.SummaryMetricsEntry) t9).getDataType().getName());
    }
}
