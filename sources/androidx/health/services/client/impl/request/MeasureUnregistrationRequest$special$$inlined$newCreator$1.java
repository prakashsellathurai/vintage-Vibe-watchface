package androidx.health.services.client.impl.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.data.DataType;
import androidx.health.services.client.proto.DataProto;
import androidx.health.services.client.proto.RequestsProto;
import q7.k;

public final class MeasureUnregistrationRequest$special$$inlined$newCreator$1 implements Parcelable.Creator<MeasureUnregistrationRequest> {
    public MeasureUnregistrationRequest createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        RequestsProto.MeasureUnregistrationRequest parseFrom = RequestsProto.MeasureUnregistrationRequest.parseFrom(createByteArray);
        String packageName = parseFrom.getPackageName();
        k.d(packageName, "proto.packageName");
        DataType.Companion companion = DataType.Companion;
        DataProto.DataType dataType = parseFrom.getDataType();
        k.d(dataType, "proto.dataType");
        return new MeasureUnregistrationRequest(packageName, companion.deltaFromProto$health_services_client_release(dataType));
    }

    public MeasureUnregistrationRequest[] newArray(int i8) {
        return new MeasureUnregistrationRequest[i8];
    }
}
