package androidx.health.services.client.impl.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.data.Availability;
import androidx.health.services.client.data.DataType;
import androidx.health.services.client.data.DataTypeAvailability;
import androidx.health.services.client.data.LocationAvailability;
import androidx.health.services.client.impl.response.AvailabilityResponse;
import androidx.health.services.client.proto.DataProto;
import androidx.health.services.client.proto.ResponsesProto;
import c1.c;
import q7.k;

public final class AvailabilityResponse$special$$inlined$newCreator$1 implements Parcelable.Creator<AvailabilityResponse> {
    public AvailabilityResponse createFromParcel(Parcel parcel) {
        Availability availability;
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        ResponsesProto.AvailabilityResponse parseFrom = ResponsesProto.AvailabilityResponse.parseFrom(createByteArray);
        DataProto.Availability.AvailabilityCase availabilityCase = parseFrom.getAvailability().getAvailabilityCase();
        int i8 = availabilityCase == null ? -1 : AvailabilityResponse.WhenMappings.$EnumSwitchMapping$0[availabilityCase.ordinal()];
        if (i8 != -1) {
            if (i8 == 1) {
                DataTypeAvailability.Companion companion = DataTypeAvailability.Companion;
                DataProto.Availability.DataTypeAvailability dataTypeAvailability = parseFrom.getAvailability().getDataTypeAvailability();
                k.d(dataTypeAvailability, "proto.availability.dataTypeAvailability");
                availability = companion.fromProto$health_services_client_release(dataTypeAvailability);
            } else if (i8 == 2) {
                LocationAvailability.Companion companion2 = LocationAvailability.Companion;
                DataProto.Availability.LocationAvailability locationAvailability = parseFrom.getAvailability().getLocationAvailability();
                k.d(locationAvailability, "proto.availability.locationAvailability");
                availability = companion2.fromProto$health_services_client_release(locationAvailability);
            } else if (i8 != 3) {
                throw new c();
            }
            DataType.Companion companion3 = DataType.Companion;
            DataProto.DataType dataType = parseFrom.getDataType();
            k.d(dataType, "proto.dataType");
            return new AvailabilityResponse(companion3.deltaFromProto$health_services_client_release(dataType), availability);
        }
        availability = DataTypeAvailability.UNKNOWN;
        DataType.Companion companion32 = DataType.Companion;
        DataProto.DataType dataType2 = parseFrom.getDataType();
        k.d(dataType2, "proto.dataType");
        return new AvailabilityResponse(companion32.deltaFromProto$health_services_client_release(dataType2), availability);
    }

    public AvailabilityResponse[] newArray(int i8) {
        return new AvailabilityResponse[i8];
    }
}
