package androidx.health.services.client.data;

import a1.a;
import android.util.Log;
import androidx.health.services.client.data.DataPoint;
import androidx.health.services.client.proto.DataProto;
import c1.c;
import com.google.protobuf.y;
import i7.f;
import i7.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import q7.g;
import q7.k;
import q7.q;

public abstract class DataType<T, D extends DataPoint<T>> {
    public static final DeltaDataType<Double, SampleDataPoint<Double>> ABSOLUTE_ELEVATION;
    public static final AggregateDataType<Double, StatisticalDataPoint<Double>> ABSOLUTE_ELEVATION_STATS;
    public static final AggregateDataType<Long, CumulativeDataPoint<Long>> ACTIVE_EXERCISE_DURATION_TOTAL;
    public static final DeltaDataType<Double, IntervalDataPoint<Double>> CALORIES;
    public static final DeltaDataType<Double, IntervalDataPoint<Double>> CALORIES_DAILY;
    public static final AggregateDataType<Double, CumulativeDataPoint<Double>> CALORIES_TOTAL;
    public static final Companion Companion = new Companion((g) null);
    public static final DeltaDataType<Double, IntervalDataPoint<Double>> DECLINE_DISTANCE;
    public static final AggregateDataType<Double, CumulativeDataPoint<Double>> DECLINE_DISTANCE_TOTAL;
    public static final DeltaDataType<Long, IntervalDataPoint<Long>> DECLINE_DURATION;
    public static final AggregateDataType<Long, CumulativeDataPoint<Long>> DECLINE_DURATION_TOTAL;
    public static final DeltaDataType<Double, IntervalDataPoint<Double>> DISTANCE;
    public static final DeltaDataType<Double, IntervalDataPoint<Double>> DISTANCE_DAILY;
    public static final AggregateDataType<Double, CumulativeDataPoint<Double>> DISTANCE_TOTAL;
    public static final DeltaDataType<Double, IntervalDataPoint<Double>> ELEVATION_GAIN;
    public static final AggregateDataType<Double, CumulativeDataPoint<Double>> ELEVATION_GAIN_TOTAL;
    public static final DeltaDataType<Double, IntervalDataPoint<Double>> ELEVATION_LOSS;
    public static final AggregateDataType<Double, CumulativeDataPoint<Double>> ELEVATION_LOSS_TOTAL;
    public static final DeltaDataType<Double, IntervalDataPoint<Double>> FLAT_GROUND_DISTANCE;
    public static final AggregateDataType<Double, CumulativeDataPoint<Double>> FLAT_GROUND_DISTANCE_TOTAL;
    public static final DeltaDataType<Long, IntervalDataPoint<Long>> FLAT_GROUND_DURATION;
    public static final AggregateDataType<Long, CumulativeDataPoint<Long>> FLAT_GROUND_DURATION_TOTAL;
    public static final DeltaDataType<Double, IntervalDataPoint<Double>> FLOORS;
    public static final DeltaDataType<Double, IntervalDataPoint<Double>> FLOORS_DAILY;
    public static final AggregateDataType<Double, CumulativeDataPoint<Double>> FLOORS_TOTAL;
    public static final int FORMAT_BOOLEAN = 4;
    public static final int FORMAT_BYTE_ARRAY = 5;
    public static final int FORMAT_DOUBLE = 1;
    public static final int FORMAT_DOUBLE_ARRAY = 3;
    public static final int FORMAT_LONG = 2;
    public static final DeltaDataType<Long, IntervalDataPoint<Long>> GOLF_SHOT_COUNT;
    public static final AggregateDataType<Long, CumulativeDataPoint<Long>> GOLF_SHOT_COUNT_TOTAL;
    public static final DeltaDataType<Double, SampleDataPoint<Double>> HEART_RATE_BPM;
    public static final AggregateDataType<Double, StatisticalDataPoint<Double>> HEART_RATE_BPM_STATS;
    public static final DeltaDataType<Double, IntervalDataPoint<Double>> INCLINE_DISTANCE;
    public static final AggregateDataType<Double, CumulativeDataPoint<Double>> INCLINE_DISTANCE_TOTAL;
    public static final DeltaDataType<Long, IntervalDataPoint<Long>> INCLINE_DURATION;
    public static final AggregateDataType<Long, CumulativeDataPoint<Long>> INCLINE_DURATION_TOTAL;
    public static final DeltaDataType<LocationData, SampleDataPoint<LocationData>> LOCATION;
    public static final DeltaDataType<Double, SampleDataPoint<Double>> PACE;
    public static final AggregateDataType<Double, StatisticalDataPoint<Double>> PACE_STATS;
    public static final DeltaDataType<Long, IntervalDataPoint<Long>> REP_COUNT;
    public static final AggregateDataType<Long, CumulativeDataPoint<Long>> REP_COUNT_TOTAL;
    public static final DeltaDataType<Long, IntervalDataPoint<Long>> RESTING_EXERCISE_DURATION;
    public static final AggregateDataType<Long, CumulativeDataPoint<Long>> RESTING_EXERCISE_DURATION_TOTAL;
    public static final DeltaDataType<Long, IntervalDataPoint<Long>> RUNNING_STEPS;
    public static final AggregateDataType<Long, CumulativeDataPoint<Long>> RUNNING_STEPS_TOTAL;
    public static final DeltaDataType<Double, SampleDataPoint<Double>> SPEED;
    public static final AggregateDataType<Double, StatisticalDataPoint<Double>> SPEED_STATS;
    public static final DeltaDataType<Long, IntervalDataPoint<Long>> STEPS;
    public static final DeltaDataType<Long, IntervalDataPoint<Long>> STEPS_DAILY;
    public static final DeltaDataType<Long, SampleDataPoint<Long>> STEPS_PER_MINUTE;
    public static final AggregateDataType<Long, StatisticalDataPoint<Long>> STEPS_PER_MINUTE_STATS;
    public static final AggregateDataType<Long, CumulativeDataPoint<Long>> STEPS_TOTAL;
    public static final DeltaDataType<Long, IntervalDataPoint<Long>> SWIMMING_LAP_COUNT;
    public static final DeltaDataType<Long, IntervalDataPoint<Long>> SWIMMING_STROKES;
    public static final AggregateDataType<Long, CumulativeDataPoint<Long>> SWIMMING_STROKES_TOTAL;
    private static final String TAG = "DataType";
    public static final DeltaDataType<Double, SampleDataPoint<Double>> VO2_MAX;
    public static final AggregateDataType<Double, StatisticalDataPoint<Double>> VO2_MAX_STATS;
    public static final DeltaDataType<Long, IntervalDataPoint<Long>> WALKING_STEPS;
    public static final AggregateDataType<Long, CumulativeDataPoint<Long>> WALKING_STEPS_TOTAL;
    /* access modifiers changed from: private */
    public static final Set<AggregateDataType<?, ?>> aggregateDataTypes;
    /* access modifiers changed from: private */
    public static final Set<DeltaDataType<?, ?>> deltaDataTypes;
    /* access modifiers changed from: private */
    public static final Set<String> namesOfAggregatesWithNoDelta;
    /* access modifiers changed from: private */
    public static final Set<String> namesOfDeltasWithNoAggregate;
    private final boolean isAggregate;
    private final String name;
    private final DataProto.DataType proto;
    private final TimeType timeType;
    private final Class<T> valueClass;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final <T extends Number> AggregateDataType<T, CumulativeDataPoint<T>> createCumulativeDataType(String str) {
            TimeType.Companion companion = TimeType.Companion;
            k.g();
            throw null;
        }

        private final <T extends Number> DeltaDataType<T, IntervalDataPoint<T>> createIntervalDataType(String str) {
            TimeType.Companion companion = TimeType.Companion;
            k.g();
            throw null;
        }

        private final <T extends Number> DeltaDataType<T, SampleDataPoint<T>> createSampleDataType(String str) {
            TimeType.Companion companion = TimeType.Companion;
            k.g();
            throw null;
        }

        private final <T extends Number> AggregateDataType<T, StatisticalDataPoint<T>> createStatsDataType(String str) {
            TimeType.Companion companion = TimeType.Companion;
            k.g();
            throw null;
        }

        private final Class<? extends Object> protoDataTypeToClass(DataProto.DataType dataType) {
            int format = dataType.getFormat();
            if (format == 1) {
                return Double.TYPE;
            }
            if (format == 2) {
                return Long.TYPE;
            }
            if (format != 3) {
                return format != 4 ? format != 5 ? Void.class : byte[].class : Boolean.TYPE;
            }
            String name = dataType.getName();
            DeltaDataType<LocationData, SampleDataPoint<LocationData>> deltaDataType = DataType.LOCATION;
            return k.a(name, deltaDataType.getName()) ? deltaDataType.getValueClass() : double[].class;
        }

        public final AggregateDataType<? extends Number, ? extends DataPoint<? extends Number>> aggregateFromProto$health_services_client_release(DataProto.DataType dataType) {
            T t8;
            k.e(dataType, "proto");
            Iterator<T> it = getAggregateDataTypes$health_services_client_release().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t8 = null;
                    break;
                }
                t8 = it.next();
                if (k.a(((AggregateDataType) t8).getName(), dataType.getName())) {
                    break;
                }
            }
            AggregateDataType<? extends Number, ? extends DataPoint<? extends Number>> aggregateDataType = (AggregateDataType) t8;
            if (aggregateDataType != null) {
                return aggregateDataType;
            }
            String name = dataType.getName();
            k.d(name, "proto.name");
            TimeType.Companion companion = TimeType.Companion;
            DataProto.DataType.TimeType timeType = dataType.getTimeType();
            k.d(timeType, "proto.timeType");
            TimeType fromProto$health_services_client_release = companion.fromProto$health_services_client_release(timeType);
            Class<? extends Object> protoDataTypeToClass = protoDataTypeToClass(dataType);
            k.c(protoDataTypeToClass, "null cannot be cast to non-null type java.lang.Class<kotlin.Number>");
            return new AggregateDataType<>(name, fromProto$health_services_client_release, protoDataTypeToClass);
        }

        public final List<DataType<? extends Object, ? extends DataPoint<? extends Object>>> deltaAndAggregateFromProto$health_services_client_release(DataProto.DataType dataType) {
            k.e(dataType, "proto");
            ArrayList arrayList = new ArrayList();
            if (!DataType.namesOfAggregatesWithNoDelta.contains(dataType.getName())) {
                arrayList.add(deltaFromProto$health_services_client_release(dataType));
            }
            if (!DataType.namesOfDeltasWithNoAggregate.contains(dataType.getName())) {
                arrayList.add(aggregateFromProto$health_services_client_release(dataType));
            }
            return arrayList;
        }

        public final DeltaDataType<? extends Object, ? extends DataPoint<? extends Object>> deltaFromProto$health_services_client_release(DataProto.DataType dataType) {
            T t8;
            k.e(dataType, "proto");
            Iterator<T> it = getDeltaDataTypes$health_services_client_release().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t8 = null;
                    break;
                }
                t8 = it.next();
                if (k.a(((DeltaDataType) t8).getName(), dataType.getName())) {
                    break;
                }
            }
            DeltaDataType<? extends Object, ? extends DataPoint<? extends Object>> deltaDataType = (DeltaDataType) t8;
            if (deltaDataType != null) {
                return deltaDataType;
            }
            String name = dataType.getName();
            k.d(name, "proto.name");
            TimeType.Companion companion = TimeType.Companion;
            DataProto.DataType.TimeType timeType = dataType.getTimeType();
            k.d(timeType, "proto.timeType");
            return new DeltaDataType<>(name, companion.fromProto$health_services_client_release(timeType), protoDataTypeToClass(dataType));
        }

        public final Set<AggregateDataType<?, ?>> getAggregateDataTypes$health_services_client_release() {
            return DataType.aggregateDataTypes;
        }

        public final Set<DeltaDataType<?, ?>> getDeltaDataTypes$health_services_client_release() {
            return DataType.deltaDataTypes;
        }
    }

    public static final class TimeType {
        public static final Companion Companion = new Companion((g) null);
        public static final TimeType INTERVAL = new TimeType(1, "INTERVAL");
        public static final TimeType SAMPLE = new TimeType(2, "SAMPLE");
        public static final TimeType UNKNOWN = new TimeType(0, "UNKNOWN");
        private final int id;
        private final String name;

        public static final class Companion {

            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                static {
                    /*
                        androidx.health.services.client.proto.DataProto$DataType$TimeType[] r0 = androidx.health.services.client.proto.DataProto.DataType.TimeType.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        androidx.health.services.client.proto.DataProto$DataType$TimeType r1 = androidx.health.services.client.proto.DataProto.DataType.TimeType.TIME_TYPE_INTERVAL     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        androidx.health.services.client.proto.DataProto$DataType$TimeType r1 = androidx.health.services.client.proto.DataProto.DataType.TimeType.TIME_TYPE_SAMPLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        androidx.health.services.client.proto.DataProto$DataType$TimeType r1 = androidx.health.services.client.proto.DataProto.DataType.TimeType.TIME_TYPE_UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        $EnumSwitchMapping$0 = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.DataType.TimeType.Companion.WhenMappings.<clinit>():void");
                }
            }

            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final TimeType fromProto$health_services_client_release(DataProto.DataType.TimeType timeType) {
                k.e(timeType, "proto");
                int i8 = WhenMappings.$EnumSwitchMapping$0[timeType.ordinal()];
                if (i8 == 1) {
                    return TimeType.INTERVAL;
                }
                if (i8 == 2) {
                    return TimeType.SAMPLE;
                }
                if (i8 == 3) {
                    return TimeType.UNKNOWN;
                }
                throw new c();
            }
        }

        private TimeType(int i8, String str) {
            this.id = i8;
            this.name = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TimeType) && this.id == ((TimeType) obj).id;
        }

        public final int getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.id;
        }

        public final DataProto.DataType.TimeType toProto$health_services_client_release() {
            return k.a(this, INTERVAL) ? DataProto.DataType.TimeType.TIME_TYPE_INTERVAL : k.a(this, SAMPLE) ? DataProto.DataType.TimeType.TIME_TYPE_SAMPLE : DataProto.DataType.TimeType.TIME_TYPE_UNKNOWN;
        }

        public String toString() {
            return this.name;
        }
    }

    static {
        TimeType timeType2 = TimeType.INTERVAL;
        Class<Double> cls = Double.class;
        DeltaDataType<Double, IntervalDataPoint<Double>> deltaDataType = new DeltaDataType<>("Elevation Gain", timeType2, cls);
        ELEVATION_GAIN = deltaDataType;
        AggregateDataType<Double, CumulativeDataPoint<Double>> aggregateDataType = new AggregateDataType<>("Elevation Gain", timeType2, cls);
        ELEVATION_GAIN_TOTAL = aggregateDataType;
        DeltaDataType<Double, IntervalDataPoint<Double>> deltaDataType2 = new DeltaDataType<>("Elevation Loss", timeType2, cls);
        ELEVATION_LOSS = deltaDataType2;
        AggregateDataType<Double, CumulativeDataPoint<Double>> aggregateDataType2 = new AggregateDataType<>("Elevation Loss", timeType2, cls);
        ELEVATION_LOSS_TOTAL = aggregateDataType2;
        TimeType timeType3 = TimeType.SAMPLE;
        DeltaDataType<Double, SampleDataPoint<Double>> deltaDataType3 = new DeltaDataType<>("Absolute Elevation", timeType3, cls);
        ABSOLUTE_ELEVATION = deltaDataType3;
        AggregateDataType<Double, StatisticalDataPoint<Double>> aggregateDataType3 = new AggregateDataType<>("Absolute Elevation", timeType3, cls);
        ABSOLUTE_ELEVATION_STATS = aggregateDataType3;
        DeltaDataType<Double, IntervalDataPoint<Double>> deltaDataType4 = new DeltaDataType<>("Distance", timeType2, cls);
        DISTANCE = deltaDataType4;
        AggregateDataType<Double, CumulativeDataPoint<Double>> aggregateDataType4 = new AggregateDataType<>("Distance", timeType2, cls);
        DISTANCE_TOTAL = aggregateDataType4;
        DeltaDataType<Double, IntervalDataPoint<Double>> deltaDataType5 = new DeltaDataType<>("Decline Distance", timeType2, cls);
        DECLINE_DISTANCE = deltaDataType5;
        AggregateDataType<Double, CumulativeDataPoint<Double>> aggregateDataType5 = new AggregateDataType<>("Decline Distance", timeType2, cls);
        DECLINE_DISTANCE_TOTAL = aggregateDataType5;
        Class<Long> cls2 = Long.class;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType6 = new DeltaDataType<>("Decline Duration", timeType2, cls2);
        DECLINE_DURATION = deltaDataType6;
        AggregateDataType<Double, CumulativeDataPoint<Double>> aggregateDataType6 = aggregateDataType2;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType7 = new AggregateDataType<>("Decline Duration", timeType2, cls2);
        DECLINE_DURATION_TOTAL = aggregateDataType7;
        AggregateDataType<Double, CumulativeDataPoint<Double>> aggregateDataType8 = aggregateDataType;
        DeltaDataType<Double, IntervalDataPoint<Double>> deltaDataType7 = new DeltaDataType<>("Flat Ground Distance", timeType2, cls);
        FLAT_GROUND_DISTANCE = deltaDataType7;
        AggregateDataType<Double, CumulativeDataPoint<Double>> aggregateDataType9 = aggregateDataType4;
        AggregateDataType<Double, CumulativeDataPoint<Double>> aggregateDataType10 = new AggregateDataType<>("Flat Ground Distance", timeType2, cls);
        FLAT_GROUND_DISTANCE_TOTAL = aggregateDataType10;
        AggregateDataType<Double, CumulativeDataPoint<Double>> aggregateDataType11 = aggregateDataType10;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType8 = new DeltaDataType<>("Flat Ground Duration", timeType2, cls2);
        FLAT_GROUND_DURATION = deltaDataType8;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType12 = aggregateDataType7;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType13 = new AggregateDataType<>("Flat Ground Duration", timeType2, cls2);
        FLAT_GROUND_DURATION_TOTAL = aggregateDataType13;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType14 = aggregateDataType13;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType9 = new DeltaDataType<>("Golf Shot Count", timeType2, cls2);
        GOLF_SHOT_COUNT = deltaDataType9;
        AggregateDataType<Double, CumulativeDataPoint<Double>> aggregateDataType15 = aggregateDataType5;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType16 = new AggregateDataType<>("Golf Shot Count", timeType2, cls2);
        GOLF_SHOT_COUNT_TOTAL = aggregateDataType16;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType17 = aggregateDataType16;
        DeltaDataType<Double, IntervalDataPoint<Double>> deltaDataType10 = new DeltaDataType<>("Incline Distance", timeType2, cls);
        INCLINE_DISTANCE = deltaDataType10;
        AggregateDataType<Double, StatisticalDataPoint<Double>> aggregateDataType18 = aggregateDataType3;
        AggregateDataType<Double, CumulativeDataPoint<Double>> aggregateDataType19 = new AggregateDataType<>("Incline Distance", timeType2, cls);
        INCLINE_DISTANCE_TOTAL = aggregateDataType19;
        AggregateDataType<Double, CumulativeDataPoint<Double>> aggregateDataType20 = aggregateDataType19;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType11 = new DeltaDataType<>("Incline Duration", timeType2, cls2);
        INCLINE_DURATION = deltaDataType11;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType12 = deltaDataType11;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType21 = new AggregateDataType<>("Incline Duration", timeType2, cls2);
        INCLINE_DURATION_TOTAL = aggregateDataType21;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType22 = aggregateDataType21;
        DeltaDataType<Double, IntervalDataPoint<Double>> deltaDataType13 = new DeltaDataType<>("Floors", timeType2, cls);
        FLOORS = deltaDataType13;
        DeltaDataType<Double, IntervalDataPoint<Double>> deltaDataType14 = deltaDataType10;
        AggregateDataType<Double, CumulativeDataPoint<Double>> aggregateDataType23 = new AggregateDataType<>("Floors", timeType2, cls);
        FLOORS_TOTAL = aggregateDataType23;
        AggregateDataType<Double, CumulativeDataPoint<Double>> aggregateDataType24 = aggregateDataType23;
        DeltaDataType<Double, SampleDataPoint<Double>> deltaDataType15 = new DeltaDataType<>("HeartRate", timeType3, cls);
        HEART_RATE_BPM = deltaDataType15;
        DeltaDataType<Double, SampleDataPoint<Double>> deltaDataType16 = deltaDataType15;
        AggregateDataType<Double, StatisticalDataPoint<Double>> aggregateDataType25 = new AggregateDataType<>("HeartRate", timeType3, cls);
        HEART_RATE_BPM_STATS = aggregateDataType25;
        AggregateDataType<Double, StatisticalDataPoint<Double>> aggregateDataType26 = aggregateDataType25;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType17 = deltaDataType9;
        DeltaDataType<LocationData, SampleDataPoint<LocationData>> deltaDataType18 = new DeltaDataType<>("Location", timeType3, LocationData.class);
        LOCATION = deltaDataType18;
        DeltaDataType<Double, SampleDataPoint<Double>> deltaDataType19 = new DeltaDataType<>("Speed", timeType3, cls);
        SPEED = deltaDataType19;
        DeltaDataType<Double, SampleDataPoint<Double>> deltaDataType20 = deltaDataType19;
        AggregateDataType<Double, StatisticalDataPoint<Double>> aggregateDataType27 = new AggregateDataType<>("Speed", timeType3, cls);
        SPEED_STATS = aggregateDataType27;
        AggregateDataType<Double, StatisticalDataPoint<Double>> aggregateDataType28 = aggregateDataType27;
        DeltaDataType<Double, SampleDataPoint<Double>> deltaDataType21 = new DeltaDataType<>("VO2 Max", timeType3, cls);
        VO2_MAX = deltaDataType21;
        DeltaDataType<Double, SampleDataPoint<Double>> deltaDataType22 = deltaDataType21;
        AggregateDataType<Double, StatisticalDataPoint<Double>> aggregateDataType29 = new AggregateDataType<>("VO2 Max", timeType3, cls);
        VO2_MAX_STATS = aggregateDataType29;
        AggregateDataType<Double, StatisticalDataPoint<Double>> aggregateDataType30 = aggregateDataType29;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType23 = new DeltaDataType<>("Steps", timeType2, cls2);
        STEPS = deltaDataType23;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType24 = deltaDataType23;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType31 = new AggregateDataType<>("Steps", timeType2, cls2);
        STEPS_TOTAL = aggregateDataType31;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType32 = aggregateDataType31;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType25 = new DeltaDataType<>("Walking Steps", timeType2, cls2);
        WALKING_STEPS = deltaDataType25;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType26 = deltaDataType25;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType33 = new AggregateDataType<>("Walking Steps", timeType2, cls2);
        WALKING_STEPS_TOTAL = aggregateDataType33;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType34 = aggregateDataType33;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType27 = new DeltaDataType<>("Running Steps", timeType2, cls2);
        RUNNING_STEPS = deltaDataType27;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType28 = deltaDataType27;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType35 = new AggregateDataType<>("Running Steps", timeType2, cls2);
        RUNNING_STEPS_TOTAL = aggregateDataType35;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType36 = aggregateDataType35;
        DeltaDataType<Long, SampleDataPoint<Long>> deltaDataType29 = new DeltaDataType<>("Step per minute", timeType3, cls2);
        STEPS_PER_MINUTE = deltaDataType29;
        DeltaDataType<Long, SampleDataPoint<Long>> deltaDataType30 = deltaDataType29;
        AggregateDataType<Long, StatisticalDataPoint<Long>> aggregateDataType37 = new AggregateDataType<>("Step per minute", timeType3, cls2);
        STEPS_PER_MINUTE_STATS = aggregateDataType37;
        AggregateDataType<Long, StatisticalDataPoint<Long>> aggregateDataType38 = aggregateDataType37;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType31 = new DeltaDataType<>("Swimming Strokes", timeType2, cls2);
        SWIMMING_STROKES = deltaDataType31;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType32 = deltaDataType31;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType39 = new AggregateDataType<>("Swimming Strokes", timeType2, cls2);
        SWIMMING_STROKES_TOTAL = aggregateDataType39;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType40 = aggregateDataType39;
        DeltaDataType<Double, IntervalDataPoint<Double>> deltaDataType33 = new DeltaDataType<>("Calories", timeType2, cls);
        CALORIES = deltaDataType33;
        DeltaDataType<LocationData, SampleDataPoint<LocationData>> deltaDataType34 = deltaDataType18;
        AggregateDataType<Double, CumulativeDataPoint<Double>> aggregateDataType41 = new AggregateDataType<>("Calories", timeType2, cls);
        CALORIES_TOTAL = aggregateDataType41;
        AggregateDataType<Double, CumulativeDataPoint<Double>> aggregateDataType42 = aggregateDataType41;
        DeltaDataType<Double, SampleDataPoint<Double>> deltaDataType35 = new DeltaDataType<>("Pace", timeType3, cls);
        PACE = deltaDataType35;
        DeltaDataType<Double, SampleDataPoint<Double>> deltaDataType36 = deltaDataType35;
        AggregateDataType<Double, StatisticalDataPoint<Double>> aggregateDataType43 = new AggregateDataType<>("Pace", timeType3, cls);
        PACE_STATS = aggregateDataType43;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType37 = new DeltaDataType<>("Resting Exercise Duration", timeType2, cls2);
        RESTING_EXERCISE_DURATION = deltaDataType37;
        AggregateDataType<Double, StatisticalDataPoint<Double>> aggregateDataType44 = aggregateDataType43;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType45 = new AggregateDataType<>("Resting Exercise Duration", timeType2, cls2);
        RESTING_EXERCISE_DURATION_TOTAL = aggregateDataType45;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType46 = aggregateDataType45;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType47 = new AggregateDataType<>("Active Exercise Duration", timeType2, cls2);
        ACTIVE_EXERCISE_DURATION_TOTAL = aggregateDataType47;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType48 = aggregateDataType47;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType38 = new DeltaDataType<>("Swim Lap Count", timeType2, cls2);
        SWIMMING_LAP_COUNT = deltaDataType38;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType39 = deltaDataType38;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType40 = new DeltaDataType<>("Rep Count", timeType2, cls2);
        REP_COUNT = deltaDataType40;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType41 = deltaDataType37;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType49 = new AggregateDataType<>("Rep Count", timeType2, cls2);
        REP_COUNT_TOTAL = aggregateDataType49;
        AggregateDataType<Long, CumulativeDataPoint<Long>> aggregateDataType50 = aggregateDataType49;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType42 = new DeltaDataType<>("Daily Steps", timeType2, cls2);
        STEPS_DAILY = deltaDataType42;
        DeltaDataType<Double, IntervalDataPoint<Double>> deltaDataType43 = new DeltaDataType<>("Daily Floors", timeType2, cls);
        FLOORS_DAILY = deltaDataType43;
        DeltaDataType<Long, IntervalDataPoint<Long>> deltaDataType44 = deltaDataType40;
        DeltaDataType<Double, IntervalDataPoint<Double>> deltaDataType45 = new DeltaDataType<>("Daily Calories", timeType2, cls);
        CALORIES_DAILY = deltaDataType45;
        DeltaDataType<Double, IntervalDataPoint<Double>> deltaDataType46 = new DeltaDataType<>("Daily Distance", timeType2, cls);
        DISTANCE_DAILY = deltaDataType46;
        Set<DeltaDataType<?, ?>> G = a.G(deltaDataType3, deltaDataType33, deltaDataType45, deltaDataType46, deltaDataType43, deltaDataType42, deltaDataType5, deltaDataType6, deltaDataType4, deltaDataType, deltaDataType2, deltaDataType7, deltaDataType8, deltaDataType13, deltaDataType17, deltaDataType16, deltaDataType14, deltaDataType12, deltaDataType34, deltaDataType36, deltaDataType44, deltaDataType41, deltaDataType28, deltaDataType20, deltaDataType24, deltaDataType30, deltaDataType39, deltaDataType32, deltaDataType22, deltaDataType26);
        deltaDataTypes = G;
        aggregateDataTypes = a.G(aggregateDataType18, aggregateDataType48, aggregateDataType42, aggregateDataType15, aggregateDataType12, aggregateDataType9, aggregateDataType8, aggregateDataType6, aggregateDataType11, aggregateDataType14, aggregateDataType24, aggregateDataType17, aggregateDataType26, aggregateDataType20, aggregateDataType22, aggregateDataType44, aggregateDataType50, aggregateDataType46, aggregateDataType36, aggregateDataType28, aggregateDataType38, aggregateDataType32, aggregateDataType40, aggregateDataType30, aggregateDataType34);
        ArrayList arrayList = new ArrayList(f.M(G));
        for (DeltaDataType name2 : G) {
            arrayList.add(name2.getName());
        }
        Set<AggregateDataType<?, ?>> set = aggregateDataTypes;
        ArrayList arrayList2 = new ArrayList(f.M(set));
        for (AggregateDataType name3 : set) {
            arrayList2.add(name3.getName());
        }
        namesOfDeltasWithNoAggregate = i.Z(arrayList, i.d0(arrayList2));
        Set<AggregateDataType<?, ?>> set2 = aggregateDataTypes;
        ArrayList arrayList3 = new ArrayList(f.M(set2));
        for (AggregateDataType name4 : set2) {
            arrayList3.add(name4.getName());
        }
        Set<DeltaDataType<?, ?>> set3 = deltaDataTypes;
        ArrayList arrayList4 = new ArrayList(f.M(set3));
        for (DeltaDataType name5 : set3) {
            arrayList4.add(name5.getName());
        }
        namesOfAggregatesWithNoDelta = i.Z(arrayList3, i.d0(arrayList4));
    }

    public DataType(String str, TimeType timeType2, Class<T> cls, boolean z8) {
        k.e(str, "name");
        k.e(timeType2, "timeType");
        k.e(cls, "valueClass");
        this.name = str;
        this.timeType = timeType2;
        this.valueClass = cls;
        this.isAggregate = z8;
        y build = DataProto.DataType.newBuilder().setName(str).setTimeType(timeType2.toProto$health_services_client_release()).setFormat(classToValueFormat()).build();
        k.d(build, "newBuilder().setName(nam…sToValueFormat()).build()");
        this.proto = (DataProto.DataType) build;
    }

    private final int classToValueFormat() {
        Class<T> cls = this.valueClass;
        k.e(cls, "<this>");
        q7.f a9 = q.a(cls);
        if (k.a(a9, q.a(Double.TYPE))) {
            return 1;
        }
        if (k.a(a9, q.a(Long.TYPE))) {
            return 2;
        }
        if (k.a(a9, q.a(Boolean.TYPE))) {
            return 4;
        }
        if (!k.a(a9, q.a(double[].class))) {
            if (k.a(a9, q.a(byte[].class))) {
                return 5;
            }
            if (!k.a(a9, q.a(LocationData.class))) {
                throw new UnsupportedOperationException("No IPC format available for class " + this.valueClass);
            }
        }
        return 3;
    }

    public final String getName() {
        return this.name;
    }

    public final DataProto.DataType getProto$health_services_client_release() {
        return this.proto;
    }

    public final TimeType getTimeType$health_services_client_release() {
        return this.timeType;
    }

    public final Class<T> getValueClass() {
        return this.valueClass;
    }

    public final boolean isAggregate$health_services_client_release() {
        return this.isAggregate;
    }

    public final DataProto.Value toProtoFromValue$health_services_client_release(T t8) {
        ArrayList arrayList;
        k.e(t8, "value");
        DataProto.Value.Builder newBuilder = DataProto.Value.newBuilder();
        Class<T> cls = this.valueClass;
        k.e(cls, "<this>");
        q7.f a9 = q.a(cls);
        if (k.a(a9, q.a(Long.TYPE))) {
            newBuilder.setLongVal(((Long) t8).longValue());
        } else if (k.a(a9, q.a(Double.TYPE))) {
            newBuilder.setDoubleVal(((Double) t8).doubleValue());
        } else if (k.a(a9, q.a(Boolean.TYPE))) {
            newBuilder.setBoolVal(((Boolean) t8).booleanValue());
        } else {
            if (k.a(a9, q.a(byte[].class))) {
                byte[] bArr = (byte[]) t8;
                newBuilder.setByteArrayVal(com.google.protobuf.i.k(bArr, 0, bArr.length));
            } else if (k.a(a9, q.a(double[].class))) {
                DataProto.Value.DoubleArray.Builder newBuilder2 = DataProto.Value.DoubleArray.newBuilder();
                double[] dArr = (double[]) t8;
                int length = dArr.length;
                if (length == 0) {
                    arrayList = i7.k.f4879f;
                } else if (length != 1) {
                    ArrayList arrayList2 = new ArrayList(dArr.length);
                    for (double valueOf : dArr) {
                        arrayList2.add(Double.valueOf(valueOf));
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = a.A(Double.valueOf(dArr[0]));
                }
                newBuilder.setDoubleArrayVal((DataProto.Value.DoubleArray) newBuilder2.addAllDoubleArray(arrayList).build());
            } else if (k.a(a9, q.a(LocationData.class))) {
                k.d(newBuilder, "builder");
                ((LocationData) t8).addToValueProtoBuilder$health_services_client_release(newBuilder);
            } else {
                Log.w(TAG, "Unexpected value class ".concat(this.valueClass.getSimpleName()));
            }
        }
        y build = newBuilder.build();
        k.d(build, "builder.build()");
        return (DataProto.Value) build;
    }

    public String toString() {
        return "DataType(name=" + this.name + ", timeType=" + this.timeType + ", class=" + this.valueClass.getSimpleName() + ", isAggregate=" + this.isAggregate + ')';
    }

    public final T toValueFromProto$health_services_client_release(DataProto.Value value) {
        Object obj;
        k.e(value, "proto");
        Class<T> cls = this.valueClass;
        k.e(cls, "<this>");
        q7.f a9 = q.a(cls);
        if (k.a(a9, q.a(Long.TYPE))) {
            obj = Long.valueOf(value.getLongVal());
        } else if (k.a(a9, q.a(Double.TYPE))) {
            obj = Double.valueOf(value.getDoubleVal());
        } else if (k.a(a9, q.a(Boolean.TYPE))) {
            obj = Boolean.valueOf(value.getBoolVal());
        } else if (k.a(a9, q.a(byte[].class))) {
            com.google.protobuf.i byteArrayVal = value.getByteArrayVal();
            obj = byteArrayVal != null ? byteArrayVal.s() : null;
        } else if (k.a(a9, q.a(double[].class))) {
            obj = value.getDoubleArrayVal();
        } else if (k.a(a9, q.a(LocationData.class))) {
            obj = LocationData.Companion.fromDataProtoValue$health_services_client_release(value);
        } else {
            throw new UnsupportedOperationException("Cannot retrieve value for " + this.valueClass);
        }
        k.c(obj, "null cannot be cast to non-null type T of androidx.health.services.client.data.DataType");
        return obj;
    }
}
