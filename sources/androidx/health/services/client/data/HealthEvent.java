package androidx.health.services.client.data;

import a1.a;
import androidx.health.services.client.data.DataPoint;
import androidx.health.services.client.data.DataType;
import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import i7.f;
import i7.i;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import q7.g;
import q7.k;

public final class HealthEvent {
    public static final Companion Companion = new Companion((g) null);
    private final Instant eventTime;
    private final DataPointContainer metrics;
    private final DataProto.HealthEvent proto;
    private final Type type;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final DataPointContainer fromHealthEventProto$health_services_client_release(DataProto.HealthEvent healthEvent) {
            k.e(healthEvent, "proto");
            List<DataProto.HealthEvent.MetricsEntry> metricsList = healthEvent.getMetricsList();
            k.d(metricsList, "proto.metricsList");
            int C = a.C(f.M(metricsList));
            if (C < 16) {
                C = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(C);
            for (DataProto.HealthEvent.MetricsEntry metricsEntry : metricsList) {
                DataType.Companion companion = DataType.Companion;
                DataProto.DataType dataType = metricsEntry.getDataType();
                k.d(dataType, "entry.dataType");
                DeltaDataType<? extends Object, ? extends DataPoint<? extends Object>> deltaFromProto$health_services_client_release = companion.deltaFromProto$health_services_client_release(dataType);
                List<DataProto.DataPoint> dataPointsList = metricsEntry.getDataPointsList();
                k.d(dataPointsList, "entry.dataPointsList");
                ArrayList arrayList = new ArrayList(f.M(dataPointsList));
                for (DataProto.DataPoint dataPoint : dataPointsList) {
                    DataPoint.Companion companion2 = DataPoint.Companion;
                    k.d(dataPoint, "it");
                    arrayList.add(companion2.fromProto$health_services_client_release(dataPoint));
                }
                linkedHashMap.put(deltaFromProto$health_services_client_release, arrayList);
            }
            return new DataPointContainer((Map<DataType<?, ?>, ? extends List<? extends DataPoint<?>>>) linkedHashMap);
        }

        public final List<DataProto.HealthEvent.MetricsEntry> toEventProtoList$health_services_client_release(DataPointContainer dataPointContainer) {
            ArrayList arrayList;
            DataProto.HealthEvent.MetricsEntry.Builder builder;
            k.e(dataPointContainer, "container");
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry next : dataPointContainer.getDataPoints$health_services_client_release().entrySet()) {
                if (!((List) next.getValue()).isEmpty()) {
                    DataType.TimeType timeType$health_services_client_release = ((DataType) next.getKey()).getTimeType$health_services_client_release();
                    if (k.a(timeType$health_services_client_release, DataType.TimeType.SAMPLE)) {
                        builder = DataProto.HealthEvent.MetricsEntry.newBuilder().setDataType(((DataType) next.getKey()).getProto$health_services_client_release());
                        Iterable<DataPoint> iterable = (Iterable) next.getValue();
                        arrayList = new ArrayList(f.M(iterable));
                        for (DataPoint dataPoint : iterable) {
                            k.c(dataPoint, "null cannot be cast to non-null type androidx.health.services.client.data.SampleDataPoint<*>");
                            arrayList.add(((SampleDataPoint) dataPoint).getProto$health_services_client_release());
                        }
                    } else if (k.a(timeType$health_services_client_release, DataType.TimeType.INTERVAL)) {
                        builder = DataProto.HealthEvent.MetricsEntry.newBuilder().setDataType(((DataType) next.getKey()).getProto$health_services_client_release());
                        Iterable<DataPoint> iterable2 = (Iterable) next.getValue();
                        arrayList = new ArrayList(f.M(iterable2));
                        for (DataPoint dataPoint2 : iterable2) {
                            k.c(dataPoint2, "null cannot be cast to non-null type androidx.health.services.client.data.IntervalDataPoint<*>");
                            arrayList.add(((IntervalDataPoint) dataPoint2).getProto$health_services_client_release());
                        }
                    }
                    y build = builder.addAllDataPoints(arrayList).build();
                    k.d(build, "newBuilder()\n           …                 .build()");
                    arrayList2.add(build);
                }
            }
            return i.Y(arrayList2, new HealthEvent$Companion$toEventProtoList$$inlined$sortedBy$1());
        }
    }

    public static final class Type {
        public static final Companion Companion = new Companion((g) null);
        public static final Type FALL_DETECTED;
        public static final Type UNKNOWN;
        public static final List<Type> VALUES;
        private final int id;
        private final String name;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final Type fromProto$health_services_client_release(DataProto.HealthEvent.HealthEventType healthEventType) {
                T t8;
                boolean z8;
                k.e(healthEventType, "proto");
                Iterator<T> it = Type.VALUES.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t8 = null;
                        break;
                    }
                    t8 = it.next();
                    if (((Type) t8).getId() == healthEventType.getNumber()) {
                        z8 = true;
                        continue;
                    } else {
                        z8 = false;
                        continue;
                    }
                    if (z8) {
                        break;
                    }
                }
                Type type = (Type) t8;
                return type == null ? Type.UNKNOWN : type;
            }
        }

        static {
            Type type = new Type(0, "UNKNOWN");
            UNKNOWN = type;
            Type type2 = new Type(3, "FALL_DETECTED");
            FALL_DETECTED = type2;
            VALUES = a.B(type, type2);
        }

        private Type(int i8, String str) {
            this.id = i8;
            this.name = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Type) && this.id == ((Type) obj).id;
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

        public final DataProto.HealthEvent.HealthEventType toProto$health_services_client_release() {
            DataProto.HealthEvent.HealthEventType forNumber = DataProto.HealthEvent.HealthEventType.forNumber(this.id);
            return forNumber == null ? DataProto.HealthEvent.HealthEventType.HEALTH_EVENT_TYPE_UNKNOWN : forNumber;
        }

        public String toString() {
            return this.name;
        }
    }

    public HealthEvent(Type type2, Instant instant, DataPointContainer dataPointContainer) {
        k.e(type2, "type");
        k.e(instant, "eventTime");
        k.e(dataPointContainer, "metrics");
        this.type = type2;
        this.eventTime = instant;
        this.metrics = dataPointContainer;
        y build = DataProto.HealthEvent.newBuilder().setType(type2.toProto$health_services_client_release()).setEventTimeEpochMs(instant.toEpochMilli()).addAllMetrics(Companion.toEventProtoList$health_services_client_release(dataPointContainer)).build();
        k.d(build, "newBuilder()\n           …cs))\n            .build()");
        this.proto = (DataProto.HealthEvent) build;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HealthEvent(androidx.health.services.client.proto.DataProto.HealthEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "proto"
            q7.k.e(r4, r0)
            androidx.health.services.client.data.HealthEvent$Type$Companion r0 = androidx.health.services.client.data.HealthEvent.Type.Companion
            androidx.health.services.client.proto.DataProto$HealthEvent$HealthEventType r1 = r4.getType()
            java.lang.String r2 = "proto.type"
            q7.k.d(r1, r2)
            androidx.health.services.client.data.HealthEvent$Type r0 = r0.fromProto$health_services_client_release(r1)
            long r1 = r4.getEventTimeEpochMs()
            java.time.Instant r1 = java.time.Instant.ofEpochMilli(r1)
            java.lang.String r2 = "ofEpochMilli(proto.eventTimeEpochMs)"
            q7.k.d(r1, r2)
            androidx.health.services.client.data.HealthEvent$Companion r2 = Companion
            androidx.health.services.client.data.DataPointContainer r4 = r2.fromHealthEventProto$health_services_client_release(r4)
            r3.<init>(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.HealthEvent.<init>(androidx.health.services.client.proto.DataProto$HealthEvent):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HealthEvent)) {
            return false;
        }
        HealthEvent healthEvent = (HealthEvent) obj;
        return k.a(this.type, healthEvent.type) && k.a(this.eventTime, healthEvent.eventTime) && k.a(this.metrics, healthEvent.metrics);
    }

    public final Instant getEventTime() {
        return this.eventTime;
    }

    public final DataPointContainer getMetrics() {
        return this.metrics;
    }

    public final DataProto.HealthEvent getProto$health_services_client_release() {
        return this.proto;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.eventTime.hashCode()) * 31) + this.metrics.hashCode();
    }
}
