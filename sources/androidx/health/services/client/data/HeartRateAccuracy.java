package androidx.health.services.client.data;

import a1.a;
import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import java.util.Iterator;
import java.util.List;
import q7.g;
import q7.k;

public final class HeartRateAccuracy extends DataPointAccuracy {
    private final SensorStatus sensorStatus;

    public static final class SensorStatus {
        public static final SensorStatus ACCURACY_HIGH;
        public static final SensorStatus ACCURACY_LOW;
        public static final SensorStatus ACCURACY_MEDIUM;
        public static final Companion Companion = new Companion((g) null);
        public static final SensorStatus NO_CONTACT;
        public static final SensorStatus UNKNOWN;
        public static final SensorStatus UNRELIABLE;
        public static final List<SensorStatus> VALUES;
        private final int id;
        private final String name;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final SensorStatus fromProto(DataProto.DataPointAccuracy.HrAccuracy.SensorStatus sensorStatus) {
                T t8;
                boolean z8;
                k.e(sensorStatus, "proto");
                Iterator<T> it = SensorStatus.VALUES.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t8 = null;
                        break;
                    }
                    t8 = it.next();
                    if (((SensorStatus) t8).getId() == sensorStatus.getNumber()) {
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
                SensorStatus sensorStatus2 = (SensorStatus) t8;
                return sensorStatus2 == null ? SensorStatus.UNKNOWN : sensorStatus2;
            }
        }

        static {
            SensorStatus sensorStatus = new SensorStatus(0, "UNKNOWN");
            UNKNOWN = sensorStatus;
            SensorStatus sensorStatus2 = new SensorStatus(1, "NO_CONTACT");
            NO_CONTACT = sensorStatus2;
            SensorStatus sensorStatus3 = new SensorStatus(2, "UNRELIABLE");
            UNRELIABLE = sensorStatus3;
            SensorStatus sensorStatus4 = new SensorStatus(3, "ACCURACY_LOW");
            ACCURACY_LOW = sensorStatus4;
            SensorStatus sensorStatus5 = new SensorStatus(4, "ACCURACY_MEDIUM");
            ACCURACY_MEDIUM = sensorStatus5;
            SensorStatus sensorStatus6 = new SensorStatus(5, "ACCURACY_HIGH");
            ACCURACY_HIGH = sensorStatus6;
            VALUES = a.B(sensorStatus, sensorStatus2, sensorStatus3, sensorStatus4, sensorStatus5, sensorStatus6);
        }

        private SensorStatus(int i8, String str) {
            this.id = i8;
            this.name = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SensorStatus) && this.id == ((SensorStatus) obj).id;
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

        public final DataProto.DataPointAccuracy.HrAccuracy.SensorStatus toProto$health_services_client_release() {
            DataProto.DataPointAccuracy.HrAccuracy.SensorStatus forNumber = DataProto.DataPointAccuracy.HrAccuracy.SensorStatus.forNumber(this.id);
            return forNumber == null ? DataProto.DataPointAccuracy.HrAccuracy.SensorStatus.HR_ACCURACY_SENSOR_STATUS_UNKNOWN : forNumber;
        }

        public String toString() {
            return this.name;
        }
    }

    public HeartRateAccuracy(SensorStatus sensorStatus2) {
        k.e(sensorStatus2, "sensorStatus");
        this.sensorStatus = sensorStatus2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HeartRateAccuracy(androidx.health.services.client.proto.DataProto.DataPointAccuracy r3) {
        /*
            r2 = this;
            java.lang.String r0 = "proto"
            q7.k.e(r3, r0)
            androidx.health.services.client.data.HeartRateAccuracy$SensorStatus$Companion r0 = androidx.health.services.client.data.HeartRateAccuracy.SensorStatus.Companion
            androidx.health.services.client.proto.DataProto$DataPointAccuracy$HrAccuracy r3 = r3.getHrAccuracy()
            androidx.health.services.client.proto.DataProto$DataPointAccuracy$HrAccuracy$SensorStatus r3 = r3.getSensorStatus()
            java.lang.String r1 = "proto.hrAccuracy.sensorStatus"
            q7.k.d(r3, r1)
            androidx.health.services.client.data.HeartRateAccuracy$SensorStatus r3 = r0.fromProto(r3)
            r2.<init>((androidx.health.services.client.data.HeartRateAccuracy.SensorStatus) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.HeartRateAccuracy.<init>(androidx.health.services.client.proto.DataProto$DataPointAccuracy):void");
    }

    public final DataProto.DataPointAccuracy getDataPointAccuracyProto$health_services_client_release() {
        y build = DataProto.DataPointAccuracy.newBuilder().setHrAccuracy(DataProto.DataPointAccuracy.HrAccuracy.newBuilder().setSensorStatus(this.sensorStatus.toProto$health_services_client_release())).build();
        k.d(build, "newBuilder()\n           …()))\n            .build()");
        return (DataProto.DataPointAccuracy) build;
    }

    public final SensorStatus getSensorStatus() {
        return this.sensorStatus;
    }

    public String toString() {
        return "HrAccuracy(sensorStatus=" + this.sensorStatus + ')';
    }
}
