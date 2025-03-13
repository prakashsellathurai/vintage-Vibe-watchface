package androidx.health.services.client.data;

import a1.a;
import androidx.health.services.client.proto.DataProto;
import com.google.protobuf.y;
import java.util.Iterator;
import java.util.List;
import q7.g;
import q7.k;

public final class DataTypeAvailability implements Availability {
    public static final DataTypeAvailability ACQUIRING;
    public static final DataTypeAvailability AVAILABLE;
    public static final Companion Companion = new Companion((g) null);
    public static final DataTypeAvailability UNAVAILABLE;
    public static final DataTypeAvailability UNAVAILABLE_DEVICE_OFF_BODY;
    public static final DataTypeAvailability UNKNOWN;
    public static final List<DataTypeAvailability> VALUES;
    private final int id;
    private final String name;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final DataTypeAvailability fromId(int i8) {
            T t8;
            boolean z8;
            Iterator<T> it = DataTypeAvailability.VALUES.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t8 = null;
                    break;
                }
                t8 = it.next();
                if (((DataTypeAvailability) t8).getId() == i8) {
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
            return (DataTypeAvailability) t8;
        }

        public final DataTypeAvailability fromProto$health_services_client_release(DataProto.Availability.DataTypeAvailability dataTypeAvailability) {
            k.e(dataTypeAvailability, "proto");
            DataTypeAvailability fromId = fromId(dataTypeAvailability.getNumber());
            return fromId == null ? DataTypeAvailability.UNKNOWN : fromId;
        }
    }

    static {
        DataTypeAvailability dataTypeAvailability = new DataTypeAvailability(0, "UNKNOWN");
        UNKNOWN = dataTypeAvailability;
        DataTypeAvailability dataTypeAvailability2 = new DataTypeAvailability(1, "AVAILABLE");
        AVAILABLE = dataTypeAvailability2;
        DataTypeAvailability dataTypeAvailability3 = new DataTypeAvailability(2, "ACQUIRING");
        ACQUIRING = dataTypeAvailability3;
        DataTypeAvailability dataTypeAvailability4 = new DataTypeAvailability(3, "UNAVAILABLE");
        UNAVAILABLE = dataTypeAvailability4;
        DataTypeAvailability dataTypeAvailability5 = new DataTypeAvailability(4, "UNAVAILABLE_DEVICE_OFF_BODY");
        UNAVAILABLE_DEVICE_OFF_BODY = dataTypeAvailability5;
        VALUES = a.B(dataTypeAvailability, dataTypeAvailability2, dataTypeAvailability3, dataTypeAvailability4, dataTypeAvailability5);
    }

    private DataTypeAvailability(int i8, String str) {
        this.id = i8;
        this.name = str;
    }

    public static final DataTypeAvailability fromId(int i8) {
        return Companion.fromId(i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DataTypeAvailability) && getId() == ((DataTypeAvailability) obj).getId();
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
        DataProto.Availability.DataTypeAvailability forNumber = DataProto.Availability.DataTypeAvailability.forNumber(getId());
        if (forNumber == null) {
            forNumber = DataProto.Availability.DataTypeAvailability.DATA_TYPE_AVAILABILITY_UNKNOWN;
        }
        y build = newBuilder.setDataTypeAvailability(forNumber).build();
        k.d(build, "newBuilder()\n           …   )\n            .build()");
        return (DataProto.Availability) build;
    }

    public String toString() {
        return this.name;
    }
}
