package androidx.health.services.client.data;

import a1.a;
import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import java.util.Iterator;
import java.util.List;
import q7.g;
import q7.k;

public final class LocationAvailability implements Availability {
    public static final LocationAvailability ACQUIRED_TETHERED;
    public static final LocationAvailability ACQUIRED_UNTETHERED;
    public static final LocationAvailability ACQUIRING;
    public static final Companion Companion = new Companion((g) null);
    public static final LocationAvailability NO_GNSS;
    public static final LocationAvailability UNAVAILABLE;
    public static final LocationAvailability UNKNOWN;
    public static final List<LocationAvailability> VALUES;
    private final int id;
    private final String name;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final LocationAvailability fromId(int i8) {
            T t8;
            boolean z8;
            Iterator<T> it = LocationAvailability.VALUES.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t8 = null;
                    break;
                }
                t8 = it.next();
                if (((LocationAvailability) t8).getId() == i8) {
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
            return (LocationAvailability) t8;
        }

        public final LocationAvailability fromProto$health_services_client_release(DataProto.Availability.LocationAvailability locationAvailability) {
            k.e(locationAvailability, "proto");
            LocationAvailability fromId = fromId(locationAvailability.getNumber());
            return fromId == null ? LocationAvailability.UNKNOWN : fromId;
        }
    }

    static {
        LocationAvailability locationAvailability = new LocationAvailability(0, "UNKNOWN");
        UNKNOWN = locationAvailability;
        LocationAvailability locationAvailability2 = new LocationAvailability(1, "UNAVAILABLE");
        UNAVAILABLE = locationAvailability2;
        LocationAvailability locationAvailability3 = new LocationAvailability(2, "NO_GNSS");
        NO_GNSS = locationAvailability3;
        LocationAvailability locationAvailability4 = new LocationAvailability(3, "ACQUIRING");
        ACQUIRING = locationAvailability4;
        LocationAvailability locationAvailability5 = new LocationAvailability(4, "ACQUIRED_TETHERED");
        ACQUIRED_TETHERED = locationAvailability5;
        LocationAvailability locationAvailability6 = new LocationAvailability(5, "ACQUIRED_UNTETHERED");
        ACQUIRED_UNTETHERED = locationAvailability6;
        VALUES = a.B(locationAvailability, locationAvailability2, locationAvailability3, locationAvailability4, locationAvailability5, locationAvailability6);
    }

    private LocationAvailability(int i8, String str) {
        this.id = i8;
        this.name = str;
    }

    public static final LocationAvailability fromId(int i8) {
        return Companion.fromId(i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocationAvailability) && getId() == ((LocationAvailability) obj).getId();
    }

    public int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return getId();
    }

    public DataProto.Availability toProto() {
        DataProto.Availability.Builder newBuilder = DataProto.Availability.newBuilder();
        DataProto.Availability.LocationAvailability forNumber = DataProto.Availability.LocationAvailability.forNumber(getId());
        if (forNumber == null) {
            forNumber = DataProto.Availability.LocationAvailability.LOCATION_AVAILABILITY_UNKNOWN;
        }
        y build = newBuilder.setLocationAvailability(forNumber).build();
        k.d(build, "newBuilder()\n           …   )\n            .build()");
        return (DataProto.Availability) build;
    }

    public String toString() {
        return this.name;
    }
}
