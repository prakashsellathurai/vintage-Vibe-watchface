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

public final class IntervalDataPoint<T> extends DataPoint<T> {
    public static final Companion Companion = new Companion((g) null);
    private final DataPointAccuracy accuracy;
    private final DataType<T, ? extends IntervalDataPoint<T>> dataType;
    private final Duration endDurationFromBoot;
    private final Bundle metadata;
    private final DataProto.DataPoint proto;
    private final Duration startDurationFromBoot;
    private final T value;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final IntervalDataPoint<?> fromProto$health_services_client_release(DataProto.DataPoint dataPoint) {
            DataPointAccuracy dataPointAccuracy;
            k.e(dataPoint, "proto");
            DataType.Companion companion = DataType.Companion;
            DataProto.DataType dataType = dataPoint.getDataType();
            k.d(dataType, "proto.dataType");
            DeltaDataType<? extends Object, ? extends DataPoint<? extends Object>> deltaFromProto$health_services_client_release = companion.deltaFromProto$health_services_client_release(dataType);
            k.c(deltaFromProto$health_services_client_release, "null cannot be cast to non-null type androidx.health.services.client.data.DataType<kotlin.Any, androidx.health.services.client.data.IntervalDataPoint<kotlin.Any>>");
            DataProto.Value value = dataPoint.getValue();
            k.d(value, "proto.value");
            Object valueFromProto$health_services_client_release = deltaFromProto$health_services_client_release.toValueFromProto$health_services_client_release(value);
            Duration ofMillis = Duration.ofMillis(dataPoint.getStartDurationFromBootMs());
            k.d(ofMillis, "ofMillis(proto.startDurationFromBootMs)");
            Duration ofMillis2 = Duration.ofMillis(dataPoint.getEndDurationFromBootMs());
            k.d(ofMillis2, "ofMillis(proto.endDurationFromBootMs)");
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
            return new IntervalDataPoint(deltaFromProto$health_services_client_release, valueFromProto$health_services_client_release, ofMillis, ofMillis2, fromProto$health_services_client_release, dataPointAccuracy);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntervalDataPoint(DataType<T, ? extends IntervalDataPoint<T>> dataType2, T t8, Duration duration, Duration duration2, Bundle bundle, DataPointAccuracy dataPointAccuracy) {
        super(dataType2);
        k.e(dataType2, "dataType");
        k.e(t8, "value");
        k.e(duration, "startDurationFromBoot");
        k.e(duration2, "endDurationFromBoot");
        k.e(bundle, "metadata");
        this.dataType = dataType2;
        this.value = t8;
        this.startDurationFromBoot = duration;
        this.endDurationFromBoot = duration2;
        this.metadata = bundle;
        this.accuracy = dataPointAccuracy;
        this.proto = getDataPointProto();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IntervalDataPoint(DataType dataType2, Object obj, Duration duration, Duration duration2, Bundle bundle, DataPointAccuracy dataPointAccuracy, int i8, g gVar) {
        this(dataType2, obj, duration, duration2, (i8 & 16) != 0 ? new Bundle() : bundle, (i8 & 32) != 0 ? null : dataPointAccuracy);
    }

    private final DataProto.DataPoint getDataPointProto() {
        DataProto.DataPoint.Builder metaData = DataProto.DataPoint.newBuilder().setDataType(getDataType().getProto$health_services_client_release()).setValue(getDataType().toProtoFromValue$health_services_client_release(this.value)).setStartDurationFromBootMs(this.startDurationFromBoot.toMillis()).setEndDurationFromBootMs(this.endDurationFromBoot.toMillis()).setMetaData(BundlesUtil.toProto$health_services_client_release(this.metadata));
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
        if (!(obj instanceof IntervalDataPoint)) {
            return false;
        }
        IntervalDataPoint intervalDataPoint = (IntervalDataPoint) obj;
        return k.a(getDataType(), intervalDataPoint.getDataType()) && k.a(this.value, intervalDataPoint.value) && k.a(this.startDurationFromBoot, intervalDataPoint.startDurationFromBoot) && k.a(this.endDurationFromBoot, intervalDataPoint.endDurationFromBoot);
    }

    public final DataPointAccuracy getAccuracy() {
        return this.accuracy;
    }

    public DataType<T, ? extends IntervalDataPoint<T>> getDataType() {
        return this.dataType;
    }

    public final Duration getEndDurationFromBoot() {
        return this.endDurationFromBoot;
    }

    public final Instant getEndInstant(Instant instant) {
        k.e(instant, "bootInstant");
        Instant plus = instant.plus(this.endDurationFromBoot);
        k.d(plus, "bootInstant.plus(endDurationFromBoot)");
        return plus;
    }

    public final Bundle getMetadata() {
        return this.metadata;
    }

    public final DataProto.DataPoint getProto$health_services_client_release() {
        return this.proto;
    }

    public final Duration getStartDurationFromBoot() {
        return this.startDurationFromBoot;
    }

    public final Instant getStartInstant(Instant instant) {
        k.e(instant, "bootInstant");
        Instant plus = instant.plus(this.startDurationFromBoot);
        k.d(plus, "bootInstant.plus(startDurationFromBoot)");
        return plus;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        return (int) (((long) (((int) (((long) (((this.value.hashCode() * 31) + getDataType().hashCode()) * 31)) + this.startDurationFromBoot.toNanos())) * 31)) + this.endDurationFromBoot.toNanos());
    }
}
