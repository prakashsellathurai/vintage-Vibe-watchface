package androidx.health.services.client.data;

import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import i7.f;
import i7.i;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import q7.k;

public final class ExerciseLapSummary {
    private final Duration activeDuration;
    private final Instant endTime;
    private final int lapCount;
    private final DataPointContainer lapMetrics;
    private final DataProto.ExerciseLapSummary proto;
    private final Instant startTime;

    public ExerciseLapSummary(int i8, Instant instant, Instant instant2, Duration duration, DataPointContainer dataPointContainer) {
        k.e(instant, "startTime");
        k.e(instant2, "endTime");
        k.e(duration, "activeDuration");
        k.e(dataPointContainer, "lapMetrics");
        this.lapCount = i8;
        this.startTime = instant;
        this.endTime = instant2;
        this.activeDuration = duration;
        this.lapMetrics = dataPointContainer;
        DataProto.ExerciseLapSummary.Builder activeDurationMs = DataProto.ExerciseLapSummary.newBuilder().setLapCount(i8).setStartTimeEpochMs(instant.toEpochMilli()).setEndTimeEpochMs(instant2.toEpochMilli()).setActiveDurationMs(duration.toMillis());
        List<StatisticalDataPoint<?>> statisticalDataPoints = dataPointContainer.getStatisticalDataPoints();
        ArrayList arrayList = new ArrayList(f.M(statisticalDataPoints));
        for (StatisticalDataPoint statisticalDataPoint : statisticalDataPoints) {
            arrayList.add((DataProto.ExerciseLapSummary.LapMetricsEntry) DataProto.ExerciseLapSummary.LapMetricsEntry.newBuilder().setDataType(statisticalDataPoint.getDataType().getProto$health_services_client_release()).setAggregateDataPoint(statisticalDataPoint.getProto$health_services_client_release()).build());
        }
        DataProto.ExerciseLapSummary.Builder addAllLapMetrics = activeDurationMs.addAllLapMetrics(i.Y(arrayList, new ExerciseLapSummary$special$$inlined$sortedBy$1()));
        List<CumulativeDataPoint<?>> cumulativeDataPoints = this.lapMetrics.getCumulativeDataPoints();
        ArrayList arrayList2 = new ArrayList(f.M(cumulativeDataPoints));
        for (CumulativeDataPoint cumulativeDataPoint : cumulativeDataPoints) {
            arrayList2.add((DataProto.ExerciseLapSummary.LapMetricsEntry) DataProto.ExerciseLapSummary.LapMetricsEntry.newBuilder().setDataType(cumulativeDataPoint.getDataType().getProto$health_services_client_release()).setAggregateDataPoint(cumulativeDataPoint.getProto$health_services_client_release()).build());
        }
        y build = addAllLapMetrics.addAllLapMetrics(i.Y(arrayList2, new ExerciseLapSummary$special$$inlined$sortedBy$2())).build();
        k.d(build, "newBuilder()\n           …   )\n            .build()");
        this.proto = (DataProto.ExerciseLapSummary) build;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExerciseLapSummary(androidx.health.services.client.proto.DataProto.ExerciseLapSummary r9) {
        /*
            r8 = this;
            java.lang.String r0 = "proto"
            q7.k.e(r9, r0)
            int r2 = r9.getLapCount()
            long r0 = r9.getStartTimeEpochMs()
            java.time.Instant r3 = java.time.Instant.ofEpochMilli(r0)
            java.lang.String r0 = "ofEpochMilli(proto.startTimeEpochMs)"
            q7.k.d(r3, r0)
            long r0 = r9.getEndTimeEpochMs()
            java.time.Instant r4 = java.time.Instant.ofEpochMilli(r0)
            java.lang.String r0 = "ofEpochMilli(proto.endTimeEpochMs)"
            q7.k.d(r4, r0)
            long r0 = r9.getActiveDurationMs()
            java.time.Duration r5 = java.time.Duration.ofMillis(r0)
            java.lang.String r0 = "ofMillis(proto.activeDurationMs)"
            q7.k.d(r5, r0)
            java.util.List r9 = r9.getLapMetricsList()
            java.lang.String r0 = "proto.lapMetricsList"
            q7.k.d(r9, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = i7.f.M(r9)
            r0.<init>(r1)
            java.util.Iterator r9 = r9.iterator()
        L_0x0046:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0065
            java.lang.Object r1 = r9.next()
            androidx.health.services.client.proto.DataProto$ExerciseLapSummary$LapMetricsEntry r1 = (androidx.health.services.client.proto.DataProto.ExerciseLapSummary.LapMetricsEntry) r1
            androidx.health.services.client.data.DataPoint$Companion r6 = androidx.health.services.client.data.DataPoint.Companion
            androidx.health.services.client.proto.DataProto$AggregateDataPoint r1 = r1.getAggregateDataPoint()
            java.lang.String r7 = "it.aggregateDataPoint"
            q7.k.d(r1, r7)
            androidx.health.services.client.data.DataPoint r1 = r6.fromProto$health_services_client_release((androidx.health.services.client.proto.DataProto.AggregateDataPoint) r1)
            r0.add(r1)
            goto L_0x0046
        L_0x0065:
            androidx.health.services.client.data.DataPointContainer r6 = new androidx.health.services.client.data.DataPointContainer
            r6.<init>((java.util.List<? extends androidx.health.services.client.data.DataPoint<?>>) r0)
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.ExerciseLapSummary.<init>(androidx.health.services.client.proto.DataProto$ExerciseLapSummary):void");
    }

    public final Duration getActiveDuration() {
        return this.activeDuration;
    }

    public final Instant getEndTime() {
        return this.endTime;
    }

    public final int getLapCount() {
        return this.lapCount;
    }

    public final DataPointContainer getLapMetrics() {
        return this.lapMetrics;
    }

    public final DataProto.ExerciseLapSummary getProto$health_services_client_release() {
        return this.proto;
    }

    public final Instant getStartTime() {
        return this.startTime;
    }

    public String toString() {
        return "ExerciseLapSummary(lapCount=" + this.lapCount + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", activeDuration=" + this.activeDuration + ", lapMetrics=" + this.lapMetrics + ')';
    }
}
