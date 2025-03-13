package androidx.health.services.client.data;

import androidx.health.services.client.data.DataPoint;
import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import i7.f;
import i7.h;
import i7.i;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q7.g;
import q7.k;

public final class ExerciseUpdate {
    public static final Companion Companion = new Companion((g) null);
    private final ActiveDurationCheckpoint activeDurationCheckpoint;
    private final ExerciseConfig exerciseConfig;
    private final ExerciseStateInfo exerciseStateInfo;
    private final Set<ExerciseGoal<? extends Number>> latestAchievedGoals;
    private final DataPointContainer latestMetrics;
    private final Set<MilestoneMarkerSummary> latestMilestoneMarkerSummaries;
    private final DataProto.ExerciseUpdate proto;
    private final Instant startTime;
    private final Duration updateDurationFromBoot;

    public static final class ActiveDurationCheckpoint {
        public static final Companion Companion = new Companion((g) null);
        private final Duration activeDuration;
        private final Instant time;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final ActiveDurationCheckpoint fromProto$health_services_client_release(DataProto.ExerciseUpdate.ActiveDurationCheckpoint activeDurationCheckpoint) {
                k.e(activeDurationCheckpoint, "proto");
                Instant ofEpochMilli = Instant.ofEpochMilli(activeDurationCheckpoint.getTimeEpochMs());
                k.d(ofEpochMilli, "ofEpochMilli(proto.timeEpochMs)");
                Duration ofMillis = Duration.ofMillis(activeDurationCheckpoint.getActiveDurationMs());
                k.d(ofMillis, "ofMillis(proto.activeDurationMs)");
                return new ActiveDurationCheckpoint(ofEpochMilli, ofMillis);
            }
        }

        public ActiveDurationCheckpoint(Instant instant, Duration duration) {
            k.e(instant, "time");
            k.e(duration, "activeDuration");
            this.time = instant;
            this.activeDuration = duration;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!k.a(ActiveDurationCheckpoint.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            k.c(obj, "null cannot be cast to non-null type androidx.health.services.client.data.ExerciseUpdate.ActiveDurationCheckpoint");
            ActiveDurationCheckpoint activeDurationCheckpoint = (ActiveDurationCheckpoint) obj;
            return k.a(this.time, activeDurationCheckpoint.time) && k.a(this.activeDuration, activeDurationCheckpoint.activeDuration);
        }

        public final Duration getActiveDuration() {
            return this.activeDuration;
        }

        public final Instant getTime() {
            return this.time;
        }

        public int hashCode() {
            return (this.time.hashCode() * 31) + this.activeDuration.hashCode();
        }

        public final DataProto.ExerciseUpdate.ActiveDurationCheckpoint toProto$health_services_client_release() {
            y build = DataProto.ExerciseUpdate.ActiveDurationCheckpoint.newBuilder().setTimeEpochMs(this.time.toEpochMilli()).setActiveDurationMs(this.activeDuration.toMillis()).build();
            k.d(build, "newBuilder()\n           …\n                .build()");
            return (DataProto.ExerciseUpdate.ActiveDurationCheckpoint) build;
        }

        public String toString() {
            return "ActiveDurationCheckpoint(time=" + this.time + ", activeDuration=" + this.activeDuration + ')';
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final DataPointContainer exerciseUpdateProtoToDataPointContainer$health_services_client_release(DataProto.ExerciseUpdate exerciseUpdate) {
            k.e(exerciseUpdate, "proto");
            ArrayList arrayList = new ArrayList();
            List<DataProto.ExerciseUpdate.LatestMetricsEntry> latestMetricsList = exerciseUpdate.getLatestMetricsList();
            k.d(latestMetricsList, "proto.latestMetricsList");
            ArrayList arrayList2 = new ArrayList();
            for (DataProto.ExerciseUpdate.LatestMetricsEntry dataPointsList : latestMetricsList) {
                List<DataProto.DataPoint> dataPointsList2 = dataPointsList.getDataPointsList();
                k.d(dataPointsList2, "it.dataPointsList");
                h.S(dataPointsList2, arrayList2);
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                DataProto.DataPoint dataPoint = (DataProto.DataPoint) it.next();
                DataPoint.Companion companion = DataPoint.Companion;
                k.d(dataPoint, "it");
                arrayList.add(companion.fromProto$health_services_client_release(dataPoint));
            }
            List<DataProto.AggregateDataPoint> latestAggregateMetricsList = exerciseUpdate.getLatestAggregateMetricsList();
            k.d(latestAggregateMetricsList, "proto.latestAggregateMetricsList");
            for (DataProto.AggregateDataPoint aggregateDataPoint : latestAggregateMetricsList) {
                DataPoint.Companion companion2 = DataPoint.Companion;
                k.d(aggregateDataPoint, "it");
                arrayList.add(companion2.fromProto$health_services_client_release(aggregateDataPoint));
            }
            return new DataPointContainer((List<? extends DataPoint<?>>) arrayList);
        }
    }

    public ExerciseUpdate(DataPointContainer dataPointContainer, Set<? extends ExerciseGoal<? extends Number>> set, Set<MilestoneMarkerSummary> set2, ExerciseStateInfo exerciseStateInfo2, ExerciseConfig exerciseConfig2, ActiveDurationCheckpoint activeDurationCheckpoint2, Duration duration, Instant instant) {
        k.e(dataPointContainer, "latestMetrics");
        k.e(set, "latestAchievedGoals");
        k.e(set2, "latestMilestoneMarkerSummaries");
        k.e(exerciseStateInfo2, "exerciseStateInfo");
        this.latestMetrics = dataPointContainer;
        this.latestAchievedGoals = set;
        this.latestMilestoneMarkerSummaries = set2;
        this.exerciseStateInfo = exerciseStateInfo2;
        this.exerciseConfig = exerciseConfig2;
        this.activeDurationCheckpoint = activeDurationCheckpoint2;
        this.updateDurationFromBoot = duration;
        this.startTime = instant;
        this.proto = getExerciseUpdateProto();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ExerciseUpdate(androidx.health.services.client.data.DataPointContainer r13, java.util.Set r14, java.util.Set r15, androidx.health.services.client.data.ExerciseStateInfo r16, androidx.health.services.client.data.ExerciseConfig r17, androidx.health.services.client.data.ExerciseUpdate.ActiveDurationCheckpoint r18, java.time.Duration r19, java.time.Instant r20, int r21, q7.g r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r8 = r2
            goto L_0x000b
        L_0x0009:
            r8 = r17
        L_0x000b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0011
            r9 = r2
            goto L_0x0013
        L_0x0011:
            r9 = r18
        L_0x0013:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0019
            r10 = r2
            goto L_0x001b
        L_0x0019:
            r10 = r19
        L_0x001b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0021
            r11 = r2
            goto L_0x0023
        L_0x0021:
            r11 = r20
        L_0x0023:
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.ExerciseUpdate.<init>(androidx.health.services.client.data.DataPointContainer, java.util.Set, java.util.Set, androidx.health.services.client.data.ExerciseStateInfo, androidx.health.services.client.data.ExerciseConfig, androidx.health.services.client.data.ExerciseUpdate$ActiveDurationCheckpoint, java.time.Duration, java.time.Instant, int, q7.g):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExerciseUpdate(androidx.health.services.client.proto.DataProto.ExerciseUpdate r11) {
        /*
            r10 = this;
            java.lang.String r0 = "proto"
            q7.k.e(r11, r0)
            androidx.health.services.client.data.ExerciseUpdate$Companion r0 = Companion
            androidx.health.services.client.data.DataPointContainer r2 = r0.exerciseUpdateProtoToDataPointContainer$health_services_client_release(r11)
            java.util.List r0 = r11.getLatestAchievedGoalsList()
            java.lang.String r1 = "proto.latestAchievedGoalsList"
            q7.k.d(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = i7.f.M(r0)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0021:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0040
            java.lang.Object r3 = r0.next()
            androidx.health.services.client.proto.DataProto$AchievedExerciseGoal r3 = (androidx.health.services.client.proto.DataProto.AchievedExerciseGoal) r3
            androidx.health.services.client.data.ExerciseGoal$Companion r4 = androidx.health.services.client.data.ExerciseGoal.Companion
            androidx.health.services.client.proto.DataProto$ExerciseGoal r3 = r3.getExerciseGoal()
            java.lang.String r5 = "it.exerciseGoal"
            q7.k.d(r3, r5)
            androidx.health.services.client.data.ExerciseGoal r3 = r4.fromProto$health_services_client_release(r3)
            r1.add(r3)
            goto L_0x0021
        L_0x0040:
            java.util.Set r3 = i7.i.d0(r1)
            java.util.List r0 = r11.getMileStoneMarkerSummariesList()
            java.lang.String r1 = "proto.mileStoneMarkerSummariesList"
            q7.k.d(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = i7.f.M(r0)
            r1.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x005a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0074
            java.lang.Object r4 = r0.next()
            androidx.health.services.client.proto.DataProto$MilestoneMarkerSummary r4 = (androidx.health.services.client.proto.DataProto.MilestoneMarkerSummary) r4
            androidx.health.services.client.data.MilestoneMarkerSummary r5 = new androidx.health.services.client.data.MilestoneMarkerSummary
            java.lang.String r6 = "it"
            q7.k.d(r4, r6)
            r5.<init>(r4)
            r1.add(r5)
            goto L_0x005a
        L_0x0074:
            java.util.Set r4 = i7.i.d0(r1)
            androidx.health.services.client.data.ExerciseStateInfo r5 = new androidx.health.services.client.data.ExerciseStateInfo
            androidx.health.services.client.data.ExerciseState$Companion r0 = androidx.health.services.client.data.ExerciseState.Companion
            androidx.health.services.client.proto.DataProto$ExerciseState r1 = r11.getState()
            java.lang.String r6 = "proto.state"
            q7.k.d(r1, r6)
            androidx.health.services.client.data.ExerciseState r0 = r0.fromProto(r1)
            if (r0 == 0) goto L_0x00f4
            androidx.health.services.client.data.ExerciseEndReason$Companion r1 = androidx.health.services.client.data.ExerciseEndReason.Companion
            androidx.health.services.client.proto.DataProto$ExerciseEndReason r6 = r11.getExerciseEndReason()
            java.lang.String r7 = "proto.exerciseEndReason"
            q7.k.d(r6, r7)
            int r1 = r1.fromProto$health_services_client_release(r6)
            r5.<init>(r0, r1)
            boolean r0 = r11.hasExerciseConfig()
            r1 = 0
            if (r0 == 0) goto L_0x00b4
            androidx.health.services.client.data.ExerciseConfig r0 = new androidx.health.services.client.data.ExerciseConfig
            androidx.health.services.client.proto.DataProto$ExerciseConfig r6 = r11.getExerciseConfig()
            java.lang.String r7 = "proto.exerciseConfig"
            q7.k.d(r6, r7)
            r0.<init>(r6)
            r6 = r0
            goto L_0x00b5
        L_0x00b4:
            r6 = r1
        L_0x00b5:
            boolean r0 = r11.hasActiveDurationCheckpoint()
            if (r0 == 0) goto L_0x00cc
            androidx.health.services.client.data.ExerciseUpdate$ActiveDurationCheckpoint$Companion r0 = androidx.health.services.client.data.ExerciseUpdate.ActiveDurationCheckpoint.Companion
            androidx.health.services.client.proto.DataProto$ExerciseUpdate$ActiveDurationCheckpoint r7 = r11.getActiveDurationCheckpoint()
            java.lang.String r8 = "proto.activeDurationCheckpoint"
            q7.k.d(r7, r8)
            androidx.health.services.client.data.ExerciseUpdate$ActiveDurationCheckpoint r0 = r0.fromProto$health_services_client_release(r7)
            r7 = r0
            goto L_0x00cd
        L_0x00cc:
            r7 = r1
        L_0x00cd:
            boolean r0 = r11.hasUpdateDurationFromBootMs()
            if (r0 == 0) goto L_0x00dd
            long r8 = r11.getUpdateDurationFromBootMs()
            java.time.Duration r0 = java.time.Duration.ofMillis(r8)
            r8 = r0
            goto L_0x00de
        L_0x00dd:
            r8 = r1
        L_0x00de:
            boolean r0 = r11.hasStartTimeEpochMs()
            if (r0 == 0) goto L_0x00ee
            long r0 = r11.getStartTimeEpochMs()
            java.time.Instant r11 = java.time.Instant.ofEpochMilli(r0)
            r9 = r11
            goto L_0x00ef
        L_0x00ee:
            r9 = r1
        L_0x00ef:
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x00f4:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid ExerciseState: "
            r0.<init>(r1)
            androidx.health.services.client.proto.DataProto$ExerciseState r11 = r11.getState()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.ExerciseUpdate.<init>(androidx.health.services.client.proto.DataProto$ExerciseUpdate):void");
    }

    private final Duration getActiveDurationAtDataPoint(DataPoint<?> dataPoint, Duration duration) {
        List list = this.latestMetrics.getDataPoints$health_services_client_release().get(dataPoint.getDataType());
        boolean z8 = false;
        if (list != null && list.indexOf(dataPoint) == -1) {
            z8 = true;
        }
        if (z8) {
            throw new IllegalArgumentException("dataPoint not found in ExerciseUpdate");
        } else if (this.activeDurationCheckpoint == null) {
            Duration duration2 = Duration.ZERO;
            k.d(duration2, "ZERO");
            return duration2;
        } else if (k.a(this.exerciseStateInfo.getState(), ExerciseState.USER_PAUSED) || k.a(this.exerciseStateInfo.getState(), ExerciseState.AUTO_PAUSED)) {
            return this.activeDurationCheckpoint.getActiveDuration();
        } else {
            Duration minus = this.activeDurationCheckpoint.getActiveDuration().minus(getUpdateDurationFromBoot().minus(duration));
            k.d(minus, "activeDurationCheckpoint…urationSinceProvidedTime)");
            return minus;
        }
    }

    private final DataProto.ExerciseUpdate getExerciseUpdateProto() {
        DataProto.ExerciseUpdate.Builder state = DataProto.ExerciseUpdate.newBuilder().setState(this.exerciseStateInfo.getState().toProto$health_services_client_release());
        List<SampleDataPoint<?>> sampleDataPoints = this.latestMetrics.getSampleDataPoints();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : sampleDataPoints) {
            DataType dataType = ((SampleDataPoint) next).getDataType();
            Object obj = linkedHashMap.get(dataType);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(dataType, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            DataProto.ExerciseUpdate.LatestMetricsEntry.Builder dataType2 = DataProto.ExerciseUpdate.LatestMetricsEntry.newBuilder().setDataType(((DataType) entry.getKey()).getProto$health_services_client_release());
            Iterable<SampleDataPoint> iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(f.M(iterable));
            for (SampleDataPoint proto$health_services_client_release : iterable) {
                arrayList2.add(proto$health_services_client_release.getProto$health_services_client_release());
            }
            arrayList.add((DataProto.ExerciseUpdate.LatestMetricsEntry) dataType2.addAllDataPoints(arrayList2).build());
        }
        DataProto.ExerciseUpdate.Builder addAllLatestMetrics = state.addAllLatestMetrics(i.Y(arrayList, new ExerciseUpdate$getExerciseUpdateProto$$inlined$sortedBy$1()));
        List<IntervalDataPoint<?>> intervalDataPoints = this.latestMetrics.getIntervalDataPoints();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (T next2 : intervalDataPoints) {
            DataType dataType3 = ((IntervalDataPoint) next2).getDataType();
            Object obj2 = linkedHashMap2.get(dataType3);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap2.put(dataType3, obj2);
            }
            ((List) obj2).add(next2);
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            DataProto.ExerciseUpdate.LatestMetricsEntry.Builder dataType4 = DataProto.ExerciseUpdate.LatestMetricsEntry.newBuilder().setDataType(((DataType) entry2.getKey()).getProto$health_services_client_release());
            Iterable<IntervalDataPoint> iterable2 = (Iterable) entry2.getValue();
            ArrayList arrayList4 = new ArrayList(f.M(iterable2));
            for (IntervalDataPoint proto$health_services_client_release2 : iterable2) {
                arrayList4.add(proto$health_services_client_release2.getProto$health_services_client_release());
            }
            arrayList3.add((DataProto.ExerciseUpdate.LatestMetricsEntry) dataType4.addAllDataPoints(arrayList4).build());
        }
        DataProto.ExerciseUpdate.Builder addAllLatestMetrics2 = addAllLatestMetrics.addAllLatestMetrics(i.Y(arrayList3, new ExerciseUpdate$getExerciseUpdateProto$$inlined$sortedBy$2()));
        List<StatisticalDataPoint<?>> statisticalDataPoints = this.latestMetrics.getStatisticalDataPoints();
        ArrayList arrayList5 = new ArrayList(f.M(statisticalDataPoints));
        for (StatisticalDataPoint proto$health_services_client_release3 : statisticalDataPoints) {
            arrayList5.add(proto$health_services_client_release3.getProto$health_services_client_release());
        }
        DataProto.ExerciseUpdate.Builder addAllLatestAggregateMetrics = addAllLatestMetrics2.addAllLatestAggregateMetrics(i.Y(arrayList5, new ExerciseUpdate$getExerciseUpdateProto$$inlined$sortedBy$3()));
        List<CumulativeDataPoint<?>> cumulativeDataPoints = this.latestMetrics.getCumulativeDataPoints();
        ArrayList arrayList6 = new ArrayList(f.M(cumulativeDataPoints));
        for (CumulativeDataPoint proto$health_services_client_release4 : cumulativeDataPoints) {
            arrayList6.add(proto$health_services_client_release4.getProto$health_services_client_release());
        }
        DataProto.ExerciseUpdate.Builder addAllLatestAggregateMetrics2 = addAllLatestAggregateMetrics.addAllLatestAggregateMetrics(i.Y(arrayList6, new ExerciseUpdate$getExerciseUpdateProto$$inlined$sortedBy$4()));
        Set<ExerciseGoal<? extends Number>> set = this.latestAchievedGoals;
        ArrayList arrayList7 = new ArrayList(f.M(set));
        for (ExerciseGoal proto$health_services_client_release5 : set) {
            arrayList7.add((DataProto.AchievedExerciseGoal) DataProto.AchievedExerciseGoal.newBuilder().setExerciseGoal(proto$health_services_client_release5.getProto$health_services_client_release()).build());
        }
        DataProto.ExerciseUpdate.Builder addAllLatestAchievedGoals = addAllLatestAggregateMetrics2.addAllLatestAchievedGoals(arrayList7);
        Set<MilestoneMarkerSummary> set2 = this.latestMilestoneMarkerSummaries;
        ArrayList arrayList8 = new ArrayList(f.M(set2));
        for (MilestoneMarkerSummary proto$health_services_client_release6 : set2) {
            arrayList8.add(proto$health_services_client_release6.getProto$health_services_client_release());
        }
        DataProto.ExerciseUpdate.Builder exerciseEndReason = addAllLatestAchievedGoals.addAllMileStoneMarkerSummaries(arrayList8).setExerciseEndReason(ExerciseEndReason.Companion.toProto$health_services_client_release(this.exerciseStateInfo.getEndReason()));
        Instant instant = this.startTime;
        if (instant != null) {
            exerciseEndReason.setStartTimeEpochMs(instant.toEpochMilli());
        }
        Duration duration = this.updateDurationFromBoot;
        if (duration != null) {
            exerciseEndReason.setUpdateDurationFromBootMs(duration.toMillis());
        }
        ExerciseConfig exerciseConfig2 = this.exerciseConfig;
        if (exerciseConfig2 != null) {
            exerciseEndReason.setExerciseConfig(exerciseConfig2.toProto$health_services_client_release());
        }
        ActiveDurationCheckpoint activeDurationCheckpoint2 = this.activeDurationCheckpoint;
        if (activeDurationCheckpoint2 != null) {
            exerciseEndReason.setActiveDurationCheckpoint(activeDurationCheckpoint2.toProto$health_services_client_release());
            exerciseEndReason.setActiveDurationMs(this.activeDurationCheckpoint.getActiveDuration().toMillis());
        }
        y build = exerciseEndReason.build();
        k.d(build, "builder.build()");
        return (DataProto.ExerciseUpdate) build;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExerciseUpdate)) {
            return false;
        }
        ExerciseUpdate exerciseUpdate = (ExerciseUpdate) obj;
        return k.a(this.startTime, exerciseUpdate.startTime) && k.a(this.latestMetrics, exerciseUpdate.latestMetrics) && k.a(this.latestAchievedGoals, exerciseUpdate.latestAchievedGoals) && k.a(this.latestMilestoneMarkerSummaries, exerciseUpdate.latestMilestoneMarkerSummaries) && k.a(this.exerciseConfig, exerciseUpdate.exerciseConfig) && k.a(this.activeDurationCheckpoint, exerciseUpdate.activeDurationCheckpoint) && k.a(this.exerciseStateInfo, exerciseUpdate.exerciseStateInfo) && k.a(this.updateDurationFromBoot, exerciseUpdate.updateDurationFromBoot);
    }

    public final Duration getActiveDurationAtDataPoint(IntervalDataPoint<?> intervalDataPoint) {
        k.e(intervalDataPoint, "dataPoint");
        return getActiveDurationAtDataPoint(intervalDataPoint, intervalDataPoint.getEndDurationFromBoot());
    }

    public final Duration getActiveDurationAtDataPoint(SampleDataPoint<?> sampleDataPoint) {
        k.e(sampleDataPoint, "dataPoint");
        return getActiveDurationAtDataPoint(sampleDataPoint, sampleDataPoint.getTimeDurationFromBoot());
    }

    public final ActiveDurationCheckpoint getActiveDurationCheckpoint() {
        return this.activeDurationCheckpoint;
    }

    public final ExerciseConfig getExerciseConfig() {
        return this.exerciseConfig;
    }

    public final ExerciseStateInfo getExerciseStateInfo() {
        return this.exerciseStateInfo;
    }

    public final Set<ExerciseGoal<? extends Number>> getLatestAchievedGoals() {
        return this.latestAchievedGoals;
    }

    public final DataPointContainer getLatestMetrics() {
        return this.latestMetrics;
    }

    public final Set<MilestoneMarkerSummary> getLatestMilestoneMarkerSummaries() {
        return this.latestMilestoneMarkerSummaries;
    }

    public final DataProto.ExerciseUpdate getProto$health_services_client_release() {
        return this.proto;
    }

    public final Instant getStartTime() {
        return this.startTime;
    }

    public final Duration getUpdateDurationFromBoot() {
        Duration duration = this.updateDurationFromBoot;
        if (duration != null) {
            return duration;
        }
        throw new IllegalStateException("updateDurationFromBoot unavailable; is the Health Services APK out of date?".toString());
    }

    public int hashCode() {
        Instant instant = this.startTime;
        int i8 = 0;
        int hashCode = (((((((instant != null ? instant.hashCode() : 0) * 31) + this.latestMetrics.hashCode()) * 31) + this.latestAchievedGoals.hashCode()) * 31) + this.latestMilestoneMarkerSummaries.hashCode()) * 31;
        ExerciseConfig exerciseConfig2 = this.exerciseConfig;
        int hashCode2 = (hashCode + (exerciseConfig2 != null ? exerciseConfig2.hashCode() : 0)) * 31;
        ActiveDurationCheckpoint activeDurationCheckpoint2 = this.activeDurationCheckpoint;
        int hashCode3 = (((hashCode2 + (activeDurationCheckpoint2 != null ? activeDurationCheckpoint2.hashCode() : 0)) * 31) + this.exerciseStateInfo.hashCode()) * 31;
        Duration duration = this.updateDurationFromBoot;
        if (duration != null) {
            i8 = duration.hashCode();
        }
        return hashCode3 + i8;
    }

    public String toString() {
        return "ExerciseUpdate(state=" + this.exerciseStateInfo + ".state, startTime=" + this.startTime + ", updateDurationFromBoot=" + this.updateDurationFromBoot + ", latestMetrics=" + this.latestMetrics + ", latestAchievedGoals=" + this.latestAchievedGoals + ", latestMilestoneMarkerSummaries=" + this.latestMilestoneMarkerSummaries + ", exerciseConfig=" + this.exerciseConfig + ", activeDurationCheckpoint=" + this.activeDurationCheckpoint + ", exerciseEndReason=" + this.exerciseStateInfo.getEndReason() + ')';
    }
}
