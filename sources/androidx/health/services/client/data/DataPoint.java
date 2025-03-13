package androidx.health.services.client.data;

import androidx.health.services.client.data.CumulativeDataPoint;
import androidx.health.services.client.data.StatisticalDataPoint;
import androidx.health.services.client.proto.DataProto;
import q7.g;
import q7.k;

public abstract class DataPoint<T> {
    public static final Companion Companion = new Companion((g) null);
    private final DataType<T, ? extends DataPoint<T>> dataType;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final DataPoint<?> fromProto$health_services_client_release(DataProto.AggregateDataPoint aggregateDataPoint) {
            k.e(aggregateDataPoint, "proto");
            if (aggregateDataPoint.hasCumulativeDataPoint()) {
                CumulativeDataPoint.Companion companion = CumulativeDataPoint.Companion;
                DataProto.AggregateDataPoint.CumulativeDataPoint cumulativeDataPoint = aggregateDataPoint.getCumulativeDataPoint();
                k.d(cumulativeDataPoint, "proto.cumulativeDataPoint");
                return companion.fromProto$health_services_client_release(cumulativeDataPoint);
            }
            StatisticalDataPoint.Companion companion2 = StatisticalDataPoint.Companion;
            DataProto.AggregateDataPoint.StatisticalDataPoint statisticalDataPoint = aggregateDataPoint.getStatisticalDataPoint();
            k.d(statisticalDataPoint, "proto.statisticalDataPoint");
            return companion2.fromProto$health_services_client_release(statisticalDataPoint);
        }

        public final DataPoint<?> fromProto$health_services_client_release(DataProto.DataPoint dataPoint) {
            k.e(dataPoint, "proto");
            return dataPoint.getDataType().getTimeType() == DataProto.DataType.TimeType.TIME_TYPE_INTERVAL ? IntervalDataPoint.Companion.fromProto$health_services_client_release(dataPoint) : SampleDataPoint.Companion.fromProto$health_services_client_release(dataPoint);
        }
    }

    public DataPoint(DataType<T, ? extends DataPoint<T>> dataType2) {
        k.e(dataType2, "dataType");
        this.dataType = dataType2;
    }

    public DataType<T, ? extends DataPoint<T>> getDataType() {
        return this.dataType;
    }
}
