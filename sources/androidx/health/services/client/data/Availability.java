package androidx.health.services.client.data;

import androidx.health.services.client.data.DataTypeAvailability;
import androidx.health.services.client.data.LocationAvailability;
import androidx.health.services.client.proto.DataProto;
import c1.c;
import com.google.protobuf.y;
import q7.k;

public interface Availability {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    androidx.health.services.client.proto.DataProto$Availability$AvailabilityCase[] r0 = androidx.health.services.client.proto.DataProto.Availability.AvailabilityCase.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.health.services.client.proto.DataProto$Availability$AvailabilityCase r1 = androidx.health.services.client.proto.DataProto.Availability.AvailabilityCase.DATA_TYPE_AVAILABILITY     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.health.services.client.proto.DataProto$Availability$AvailabilityCase r1 = androidx.health.services.client.proto.DataProto.Availability.AvailabilityCase.LOCATION_AVAILABILITY     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.health.services.client.proto.DataProto$Availability$AvailabilityCase r1 = androidx.health.services.client.proto.DataProto.Availability.AvailabilityCase.AVAILABILITY_NOT_SET     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    $EnumSwitchMapping$0 = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.health.services.client.data.Availability.Companion.WhenMappings.<clinit>():void");
            }
        }

        private Companion() {
        }

        public final Availability fromProto(DataProto.Availability availability) {
            k.e(availability, "proto");
            DataProto.Availability.AvailabilityCase availabilityCase = availability.getAvailabilityCase();
            int i8 = availabilityCase == null ? -1 : WhenMappings.$EnumSwitchMapping$0[availabilityCase.ordinal()];
            if (i8 != -1) {
                if (i8 == 1) {
                    DataTypeAvailability.Companion companion = DataTypeAvailability.Companion;
                    DataProto.Availability.DataTypeAvailability dataTypeAvailability = availability.getDataTypeAvailability();
                    k.d(dataTypeAvailability, "proto.dataTypeAvailability");
                    return companion.fromProto$health_services_client_release(dataTypeAvailability);
                } else if (i8 == 2) {
                    LocationAvailability.Companion companion2 = LocationAvailability.Companion;
                    DataProto.Availability.LocationAvailability locationAvailability = availability.getLocationAvailability();
                    k.d(locationAvailability, "proto.locationAvailability");
                    return companion2.fromProto$health_services_client_release(locationAvailability);
                } else if (i8 != 3) {
                    throw new c();
                }
            }
            return DataTypeAvailability.UNKNOWN;
        }
    }

    public static final class DefaultImpls {
        public static DataProto.Availability toProto(Availability availability) {
            y build = DataProto.Availability.newBuilder().setDataTypeAvailability(DataProto.Availability.DataTypeAvailability.DATA_TYPE_AVAILABILITY_UNKNOWN).build();
            k.d(build, "newBuilder()\n           …OWN)\n            .build()");
            return (DataProto.Availability) build;
        }
    }

    static Availability fromProto(DataProto.Availability availability) {
        return Companion.fromProto(availability);
    }

    int getId();

    DataProto.Availability toProto();
}
