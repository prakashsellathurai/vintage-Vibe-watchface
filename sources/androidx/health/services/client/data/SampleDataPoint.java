package androidx.health.services.client.data;

import android.os.Bundle;
import androidx.health.services.client.data.DataPointAccuracy;
import androidx.health.services.client.data.DataType;
import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import java.time.Duration;
import java.time.Instant;
import q7.g;
import q7.k;

public final class SampleDataPoint<T> extends DataPoint<T> {
    public static final Companion Companion = new Companion((g) null);
    private final DataPointAccuracy accuracy;
    private final DataType<T, SampleDataPoint<T>> dataType;
    private final Bundle metadata;
    private final DataProto.DataPoint proto;
    private final Duration timeDurationFromBoot;
    private final T value;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final SampleDataPoint<?> fromProto$health_services_client_release(DataProto.DataPoint dataPoint) {
            DataPointAccuracy dataPointAccuracy;
            k.e(dataPoint, "proto");
            DataType.Companion companion = DataType.Companion;
            DataProto.DataType dataType = dataPoint.getDataType();
            k.d(dataType, "proto.dataType");
            DeltaDataType<? extends Object, ? extends DataPoint<? extends Object>> deltaFromProto$health_services_client_release = companion.deltaFromProto$health_services_client_release(dataType);
            k.c(deltaFromProto$health_services_client_release, "null cannot be cast to non-null type androidx.health.services.client.data.DataType<kotlin.Any, androidx.health.services.client.data.SampleDataPoint<kotlin.Any>>");
            DataProto.Value value = dataPoint.getValue();
            k.d(value, "proto.value");
            Object valueFromProto$health_services_client_release = deltaFromProto$health_services_client_release.toValueFromProto$health_services_client_release(value);
            Duration ofMillis = Duration.ofMillis(dataPoint.getStartDurationFromBootMs());
            k.d(ofMillis, "ofMillis(proto.startDurationFromBootMs)");
            DataProto.Bundle metaData = dataPoint.getMetaData();
            k.d(metaData, "proto.metaData");
            Bundle fromProto$health_services_client_release = BundlesUtil.fromProto$health_services_client_release(metaData);
            if (dataPoint.hasAccuracy()) {
                DataPointAccuracy.Companion companion2 = DataPointAccuracy.Companion;
                DataProto.DataPointAccuracy accuracy = dataPoint.getAccuracy();
                k.d(accuracy, "proto.accuracy");
                dataPointAccuracy = companion2.fromProto$health_services_client_release(accuracy);
            } else {
                dataPointAccuracy = null;
            }
            return new SampleDataPoint(deltaFromProto$health_services_client_release, valueFromProto$health_services_client_release, ofMillis, fromProto$health_services_client_release, dataPointAccuracy);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SampleDataPoint(DataType<T, SampleDataPoint<T>> dataType2, T t8, Duration duration, Bundle bundle, DataPointAccuracy dataPointAccuracy) {
        super(dataType2);
        k.e(dataType2, "dataType");
        k.e(t8, "value");
        k.e(duration, "timeDurationFromBoot");
        k.e(bundle, "metadata");
        this.dataType = dataType2;
        this.value = t8;
        this.timeDurationFromBoot = duration;
        this.metadata = bundle;
        this.accuracy = dataPointAccuracy;
        this.proto = getDataPointProto();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SampleDataPoint(DataType dataType2, Object obj, Duration duration, Bundle bundle, DataPointAccuracy dataPointAccuracy, int i8, g gVar) {
        this(dataType2, obj, duration, (i8 & 8) != 0 ? new Bundle() : bundle, (i8 & 16) != 0 ? null : dataPointAccuracy);
    }

    private final DataProto.DataPoint getDataPointProto() {
        DataProto.DataPoint.Builder metaData = DataProto.DataPoint.newBuilder().setDataType(getDataType().getProto$health_services_client_release()).setValue(getDataType().toProtoFromValue$health_services_client_release(this.value)).setStartDurationFromBootMs(this.timeDurationFromBoot.toMillis()).setEndDurationFromBootMs(this.timeDurationFromBoot.toMillis()).setMetaData(BundlesUtil.toProto$health_services_client_release(this.metadata));
        DataPointAccuracy dataPointAccuracy = this.accuracy;
        if (dataPointAccuracy != null) {
            metaData.setAccuracy(dataPointAccuracy.getProto$health_services_client_release());
        }
        y build = metaData.build();
        k.d(build, "builder.build()");
        return (DataProto.DataPoint) build;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SampleDataPoint)) {
            return false;
        }
        SampleDataPoint sampleDataPoint = (SampleDataPoint) obj;
        return k.a(getDataType(), sampleDataPoint.getDataType()) && k.a(this.value, sampleDataPoint.value) && k.a(this.accuracy, sampleDataPoint.accuracy) && k.a(this.timeDurationFromBoot, sampleDataPoint.timeDurationFromBoot);
    }

    public final DataPointAccuracy getAccuracy() {
        return this.accuracy;
    }

    public DataType<T, SampleDataPoint<T>> getDataType() {
        return this.dataType;
    }

    public final Bundle getMetadata() {
        return this.metadata;
    }

    public final DataProto.DataPoint getProto$health_services_client_release() {
        return this.proto;
    }

    public final Duration getTimeDurationFromBoot() {
        return this.timeDurationFromBoot;
    }

    public final Instant getTimeInstant(Instant instant) {
        k.e(instant, "bootInstant");
        Instant plus = instant.plus(this.timeDurationFromBoot);
        k.d(plus, "bootInstant.plus(timeDurationFromBoot)");
        return plus;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = ((((this.value.hashCode() * 31) + this.timeDurationFromBoot.hashCode()) * 31) + this.metadata.hashCode()) * 31;
        DataPointAccuracy dataPointAccuracy = this.accuracy;
        return hashCode + (dataPointAccuracy != null ? dataPointAccuracy.hashCode() : 0);
    }
}
