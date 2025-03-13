package androidx.health.services.client.impl.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.data.DataType;
import androidx.health.services.client.proto.DataProto;
import androidx.health.services.client.proto.RequestsProto;
import q7.k;

public final class MeasureRegistrationRequest$special$$inlined$newCreator$1 implements Parcelable.Creator<MeasureRegistrationRequest> {
    public MeasureRegistrationRequest createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        RequestsProto.MeasureRegistrationRequest parseFrom = RequestsProto.MeasureRegistrationRequest.parseFrom(createByteArray);
        String packageName = parseFrom.getPackageName();
        k.d(packageName, "proto.packageName");
        DataType.Companion companion = DataType.Companion;
        DataProto.DataType dataType = parseFrom.getDataType();
        k.d(dataType, "proto.dataType");
        return new MeasureRegistrationRequest(packageName, companion.deltaFromProto$health_services_client_release(dataType));
    }

    public MeasureRegistrationRequest[] newArray(int i8) {
        return new MeasureRegistrationRequest[i8];
    }
}
