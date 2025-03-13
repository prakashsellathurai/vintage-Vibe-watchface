package androidx.health.services.client.data;

import androidx.health.services.client.data.DataType;
import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import java.lang.Number;
import java.time.Instant;
import q7.g;
import q7.k;

public final class StatisticalDataPoint<T extends Number> extends DataPoint<T> {
    public static final Companion Companion = new Companion((g) null);
    private final T average;
    private final Instant end;
    private final T max;
    private final T min;
    private final DataProto.AggregateDataPoint proto;
    private final Instant start;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final StatisticalDataPoint<?> fromProto$health_services_client_release(DataProto.AggregateDataPoint.StatisticalDataPoint statisticalDataPoint) {
            k.e(statisticalDataPoint, "proto");
            DataType.Companion companion = DataType.Companion;
            DataProto.DataType dataType = statisticalDataPoint.getDataType();
            k.d(dataType, "proto.dataType");
            AggregateDataType<? extends Number, ? extends DataPoint<? extends Number>> aggregateFromProto$health_services_client_release = companion.aggregateFromProto$health_services_client_release(dataType);
            k.c(aggregateFromProto$health_services_client_release, "null cannot be cast to non-null type androidx.health.services.client.data.AggregateDataType<kotlin.Number, androidx.health.services.client.data.StatisticalDataPoint<kotlin.Number>>");
            DataProto.Value minValue = statisticalDataPoint.getMinValue();
            k.d(minValue, "proto.minValue");
            DataProto.Value maxValue = statisticalDataPoint.getMaxValue();
            k.d(maxValue, "proto.maxValue");
            DataProto.Value avgValue = statisticalDataPoint.getAvgValue();
            k.d(avgValue, "proto.avgValue");
            Instant ofEpochMilli = Instant.ofEpochMilli(statisticalDataPoint.getStartTimeEpochMs());
            k.d(ofEpochMilli, "ofEpochMilli(proto.startTimeEpochMs)");
            Instant ofEpochMilli2 = Instant.ofEpochMilli(statisticalDataPoint.getEndTimeEpochMs());
            k.d(ofEpochMilli2, "ofEpochMilli(proto.endTimeEpochMs)");
            return new StatisticalDataPoint(aggregateFromProto$health_services_client_release, (Number) aggregateFromProto$health_services_client_release.toValueFromProto$health_services_client_release(minValue), (Number) aggregateFromProto$health_services_client_release.toValueFromProto$health_services_client_release(maxValue), (Number) aggregateFromProto$health_services_client_release.toValueFromProto$health_services_client_release(avgValue), ofEpochMilli, ofEpochMilli2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatisticalDataPoint(AggregateDataType<T, StatisticalDataPoint<T>> aggregateDataType, T t8, T t9, T t10, Instant instant, Instant instant2) {
        super(aggregateDataType);
        k.e(aggregateDataType, "dataType");
        k.e(t8, "min");
        k.e(t9, "max");
        k.e(t10, "average");
        k.e(instant, "start");
        k.e(instant2, "end");
        this.min = t8;
        this.max = t9;
        this.average = t10;
        this.start = instant;
        this.end = instant2;
        y build = DataProto.AggregateDataPoint.newBuilder().setStatisticalDataPoint(DataProto.AggregateDataPoint.StatisticalDataPoint.newBuilder().setDataType(aggregateDataType.getProto$health_services_client_release()).setMinValue(aggregateDataType.toProtoFromValue$health_services_client_release(t8)).setMaxValue(aggregateDataType.toProtoFromValue$health_services_client_release(t9)).setAvgValue(aggregateDataType.toProtoFromValue$health_services_client_release(t10)).setStartTimeEpochMs(instant.toEpochMilli()).setEndTimeEpochMs(instant2.toEpochMilli())).build();
        k.d(build, "newBuilder()\n           …())\n            ).build()");
        this.proto = (DataProto.AggregateDataPoint) build;
    }

    public final T getAverage() {
        return this.average;
    }

    public final Instant getEnd() {
        return this.end;
    }

    public final T getMax() {
        return this.max;
    }

    public final T getMin() {
        return this.min;
    }

    public final DataProto.AggregateDataPoint getProto$health_services_client_release() {
        return this.proto;
    }

    public final Instant getStart() {
        return this.start;
    }
}
