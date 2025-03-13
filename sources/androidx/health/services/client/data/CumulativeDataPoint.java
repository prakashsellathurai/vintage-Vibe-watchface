package androidx.health.services.client.data;

import androidx.health.services.client.data.DataType;
import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import java.lang.Number;
import java.time.Instant;
import q7.g;
import q7.k;

public final class CumulativeDataPoint<T extends Number> extends DataPoint<T> {
    public static final Companion Companion = new Companion((g) null);
    private final Instant end;
    private final DataProto.AggregateDataPoint proto;
    private final Instant start;
    private final T total;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final CumulativeDataPoint<?> fromProto$health_services_client_release(DataProto.AggregateDataPoint.CumulativeDataPoint cumulativeDataPoint) {
            k.e(cumulativeDataPoint, "proto");
            DataType.Companion companion = DataType.Companion;
            DataProto.DataType dataType = cumulativeDataPoint.getDataType();
            k.d(dataType, "proto.dataType");
            AggregateDataType<? extends Number, ? extends DataPoint<? extends Number>> aggregateFromProto$health_services_client_release = companion.aggregateFromProto$health_services_client_release(dataType);
            k.c(aggregateFromProto$health_services_client_release, "null cannot be cast to non-null type androidx.health.services.client.data.AggregateDataType<kotlin.Number, androidx.health.services.client.data.CumulativeDataPoint<kotlin.Number>>");
            DataProto.Value total = cumulativeDataPoint.getTotal();
            k.d(total, "proto.total");
            Instant ofEpochMilli = Instant.ofEpochMilli(cumulativeDataPoint.getStartTimeEpochMs());
            k.d(ofEpochMilli, "ofEpochMilli(proto.startTimeEpochMs)");
            Instant ofEpochMilli2 = Instant.ofEpochMilli(cumulativeDataPoint.getEndTimeEpochMs());
            k.d(ofEpochMilli2, "ofEpochMilli(proto.endTimeEpochMs)");
            return new CumulativeDataPoint<>(aggregateFromProto$health_services_client_release, (Number) aggregateFromProto$health_services_client_release.toValueFromProto$health_services_client_release(total), ofEpochMilli, ofEpochMilli2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CumulativeDataPoint(AggregateDataType<T, CumulativeDataPoint<T>> aggregateDataType, T t8, Instant instant, Instant instant2) {
        super(aggregateDataType);
        k.e(aggregateDataType, "dataType");
        k.e(t8, "total");
        k.e(instant, "start");
        k.e(instant2, "end");
        this.total = t8;
        this.start = instant;
        this.end = instant2;
        y build = DataProto.AggregateDataPoint.newBuilder().setCumulativeDataPoint(DataProto.AggregateDataPoint.CumulativeDataPoint.newBuilder().setDataType(aggregateDataType.getProto$health_services_client_release()).setStartTimeEpochMs(instant.toEpochMilli()).setEndTimeEpochMs(instant2.toEpochMilli()).setTotal(aggregateDataType.toProtoFromValue$health_services_client_release(t8))).build();
        k.d(build, "newBuilder()\n           …l))\n            ).build()");
        this.proto = (DataProto.AggregateDataPoint) build;
    }

    public final Instant getEnd() {
        return this.end;
    }

    public final DataProto.AggregateDataPoint getProto$health_services_client_release() {
        return this.proto;
    }

    public final Instant getStart() {
        return this.start;
    }

    public final T getTotal() {
        return this.total;
    }
}
