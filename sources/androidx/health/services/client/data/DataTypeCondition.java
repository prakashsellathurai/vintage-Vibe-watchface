package androidx.health.services.client.data;

import androidx.health.services.client.data.ComparisonType;
import androidx.health.services.client.data.DataType;
import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import java.lang.Number;
import q7.g;
import q7.k;

public final class DataTypeCondition<T extends Number, D extends DataType<T, ? extends DataPoint<T>>> {
    public static final Companion Companion = new Companion((g) null);
    private final ComparisonType comparisonType;
    private final D dataType;
    private final DataProto.DataTypeCondition proto;
    private final T threshold;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final DataTypeCondition<? extends Number, ? extends AggregateDataType<? extends Number, ?>> aggregateFromProto$health_services_client_release(DataProto.DataTypeCondition dataTypeCondition) {
            k.e(dataTypeCondition, "proto");
            DataType.Companion companion = DataType.Companion;
            DataProto.DataType dataType = dataTypeCondition.getDataType();
            k.d(dataType, "proto.dataType");
            AggregateDataType<? extends Number, ? extends DataPoint<? extends Number>> aggregateFromProto$health_services_client_release = companion.aggregateFromProto$health_services_client_release(dataType);
            k.c(aggregateFromProto$health_services_client_release, "null cannot be cast to non-null type androidx.health.services.client.data.AggregateDataType<kotlin.Number, *>");
            DataProto.Value threshold = dataTypeCondition.getThreshold();
            k.d(threshold, "proto.threshold");
            ComparisonType.Companion companion2 = ComparisonType.Companion;
            DataProto.ComparisonType comparisonType = dataTypeCondition.getComparisonType();
            k.d(comparisonType, "proto.comparisonType");
            return new DataTypeCondition<>(aggregateFromProto$health_services_client_release, (Number) aggregateFromProto$health_services_client_release.toValueFromProto$health_services_client_release(threshold), companion2.fromProto$health_services_client_release(comparisonType));
        }

        public final DataTypeCondition<? extends Number, ? extends DeltaDataType<? extends Number, ?>> deltaFromProto$health_services_client_release(DataProto.DataTypeCondition dataTypeCondition) {
            k.e(dataTypeCondition, "proto");
            DataType.Companion companion = DataType.Companion;
            DataProto.DataType dataType = dataTypeCondition.getDataType();
            k.d(dataType, "proto.dataType");
            DeltaDataType<? extends Object, ? extends DataPoint<? extends Object>> deltaFromProto$health_services_client_release = companion.deltaFromProto$health_services_client_release(dataType);
            k.c(deltaFromProto$health_services_client_release, "null cannot be cast to non-null type androidx.health.services.client.data.DeltaDataType<kotlin.Number, *>");
            DataProto.Value threshold = dataTypeCondition.getThreshold();
            k.d(threshold, "proto.threshold");
            ComparisonType.Companion companion2 = ComparisonType.Companion;
            DataProto.ComparisonType comparisonType = dataTypeCondition.getComparisonType();
            k.d(comparisonType, "proto.comparisonType");
            return new DataTypeCondition<>(deltaFromProto$health_services_client_release, (Number) deltaFromProto$health_services_client_release.toValueFromProto$health_services_client_release(threshold), companion2.fromProto$health_services_client_release(comparisonType));
        }
    }

    public DataTypeCondition(D d9, T t8, ComparisonType comparisonType2) {
        k.e(d9, "dataType");
        k.e(t8, "threshold");
        k.e(comparisonType2, "comparisonType");
        this.dataType = d9;
        this.threshold = t8;
        this.comparisonType = comparisonType2;
        y build = DataProto.DataTypeCondition.newBuilder().setDataType(d9.getProto$health_services_client_release()).setThreshold(d9.toProtoFromValue$health_services_client_release(t8)).setComparisonType(comparisonType2.toProto$health_services_client_release()).build();
        k.d(build, "newBuilder()\n           …o())\n            .build()");
        this.proto = (DataProto.DataTypeCondition) build;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataTypeCondition)) {
            return false;
        }
        DataTypeCondition dataTypeCondition = (DataTypeCondition) obj;
        return k.a(this.dataType, dataTypeCondition.dataType) && k.a(this.threshold, dataTypeCondition.threshold) && k.a(this.comparisonType, dataTypeCondition.comparisonType);
    }

    public final ComparisonType getComparisonType() {
        return this.comparisonType;
    }

    public final D getDataType() {
        return this.dataType;
    }

    public final DataProto.DataTypeCondition getProto$health_services_client_release() {
        return this.proto;
    }

    public final T getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        return (((this.dataType.hashCode() * 31) + this.threshold.hashCode()) * 31) + this.comparisonType.hashCode();
    }

    public String toString() {
        return "DataTypeCondition(dataType=" + this.dataType + ", threshold=" + this.threshold + ", comparisonType=" + this.comparisonType + ')';
    }
}
