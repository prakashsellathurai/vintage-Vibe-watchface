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

public final class MilestoneMarkerSummary {
    private final ExerciseGoal<? extends Number> achievedGoal;
    private final Duration activeDuration;
    private final Instant endTime;
    private final DataProto.MilestoneMarkerSummary proto;
    private final Instant startTime;
    private final DataPointContainer summaryMetrics;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MilestoneMarkerSummary(androidx.health.services.client.proto.DataProto.MilestoneMarkerSummary r9) {
        /*
            r8 = this;
            java.lang.String r0 = "proto"
            q7.k.e(r9, r0)
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
            androidx.health.services.client.data.ExerciseGoal$Companion r0 = androidx.health.services.client.data.ExerciseGoal.Companion
            androidx.health.services.client.proto.DataProto$AchievedExerciseGoal r1 = r9.getAchievedGoal()
            androidx.health.services.client.proto.DataProto$ExerciseGoal r1 = r1.getExerciseGoal()
            java.lang.String r2 = "proto.achievedGoal.exerciseGoal"
            q7.k.d(r1, r2)
            androidx.health.services.client.data.ExerciseGoal r6 = r0.fromProto$health_services_client_release(r1)
            java.util.List r9 = r9.getSummaryMetricsList()
            java.lang.String r0 = "proto.summaryMetricsList"
            q7.k.d(r9, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = i7.f.M(r9)
            r0.<init>(r1)
            java.util.Iterator r9 = r9.iterator()
        L_0x0055:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0074
            java.lang.Object r1 = r9.next()
            androidx.health.services.client.proto.DataProto$MilestoneMarkerSummary$SummaryMetricsEntry r1 = (androidx.health.services.client.proto.DataProto.MilestoneMarkerSummary.SummaryMetricsEntry) r1
            androidx.health.services.client.data.DataPoint$Companion r2 = androidx.health.services.client.data.DataPoint.Companion
            androidx.health.services.client.proto.DataProto$AggregateDataPoint r1 = r1.getAggregateDataPoint()
            java.lang.String r7 = "it.aggregateDataPoint"
            q7.k.d(r1, r7)
            androidx.health.services.client.data.DataPoint r1 = r2.fromProto$health_services_client_release((androidx.health.services.client.proto.DataProto.AggregateDataPoint) r1)
            r0.add(r1)
            goto L_0x0055
        L_0x0074:
            androidx.health.services.client.data.DataPointContainer r7 = new androidx.health.services.client.data.DataPointContainer
            r7.<init>((java.util.List<? extends androidx.health.services.client.data.DataPoint<?>>) r0)
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.MilestoneMarkerSummary.<init>(androidx.health.services.client.proto.DataProto$MilestoneMarkerSummary):void");
    }

    public MilestoneMarkerSummary(Instant instant, Instant instant2, Duration duration, ExerciseGoal<? extends Number> exerciseGoal, DataPointContainer dataPointContainer) {
        k.e(instant, "startTime");
        k.e(instant2, "endTime");
        k.e(duration, "activeDuration");
        k.e(exerciseGoal, "achievedGoal");
        k.e(dataPointContainer, "summaryMetrics");
        this.startTime = instant;
        this.endTime = instant2;
        this.activeDuration = duration;
        this.achievedGoal = exerciseGoal;
        this.summaryMetrics = dataPointContainer;
        DataProto.MilestoneMarkerSummary.Builder achievedGoal2 = DataProto.MilestoneMarkerSummary.newBuilder().setStartTimeEpochMs(instant.toEpochMilli()).setEndTimeEpochMs(instant2.toEpochMilli()).setActiveDurationMs(duration.toMillis()).setAchievedGoal(DataProto.AchievedExerciseGoal.newBuilder().setExerciseGoal(exerciseGoal.getProto$health_services_client_release()));
        List<CumulativeDataPoint<?>> cumulativeDataPoints = dataPointContainer.getCumulativeDataPoints();
        ArrayList arrayList = new ArrayList(f.M(cumulativeDataPoints));
        for (CumulativeDataPoint cumulativeDataPoint : cumulativeDataPoints) {
            arrayList.add((DataProto.MilestoneMarkerSummary.SummaryMetricsEntry) DataProto.MilestoneMarkerSummary.SummaryMetricsEntry.newBuilder().setDataType(cumulativeDataPoint.getDataType().getProto$health_services_client_release()).setAggregateDataPoint(cumulativeDataPoint.getProto$health_services_client_release()).build());
        }
        DataProto.MilestoneMarkerSummary.Builder addAllSummaryMetrics = achievedGoal2.addAllSummaryMetrics(i.Y(arrayList, new MilestoneMarkerSummary$special$$inlined$sortedBy$1()));
        List<StatisticalDataPoint<?>> statisticalDataPoints = this.summaryMetrics.getStatisticalDataPoints();
        ArrayList arrayList2 = new ArrayList(f.M(statisticalDataPoints));
        for (StatisticalDataPoint statisticalDataPoint : statisticalDataPoints) {
            arrayList2.add((DataProto.MilestoneMarkerSummary.SummaryMetricsEntry) DataProto.MilestoneMarkerSummary.SummaryMetricsEntry.newBuilder().setDataType(statisticalDataPoint.getDataType().getProto$health_services_client_release()).setAggregateDataPoint(statisticalDataPoint.getProto$health_services_client_release()).build());
        }
        y build = addAllSummaryMetrics.addAllSummaryMetrics(i.Y(arrayList2, new MilestoneMarkerSummary$special$$inlined$sortedBy$2())).build();
        k.d(build, "newBuilder()\n           …   )\n            .build()");
        this.proto = (DataProto.MilestoneMarkerSummary) build;
    }

    public final ExerciseGoal<? extends Number> getAchievedGoal() {
        return this.achievedGoal;
    }

    public final Duration getActiveDuration() {
        return this.activeDuration;
    }

    public final Instant getEndTime() {
        return this.endTime;
    }

    public final DataProto.MilestoneMarkerSummary getProto$health_services_client_release() {
        return this.proto;
    }

    public final Instant getStartTime() {
        return this.startTime;
    }

    public final DataPointContainer getSummaryMetrics() {
        return this.summaryMetrics;
    }

    public String toString() {
        return "MilestoneMarkerSummary(startTime=" + this.startTime + ", endTime=" + this.endTime + ", achievedGoal=" + this.achievedGoal + ", summaryMetrics=" + this.summaryMetrics + ')';
    }
}
