package androidx.health.services.client.impl.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.proto.RequestsProto;
import q7.k;

public final class CapabilitiesRequest$special$$inlined$newCreator$1 implements Parcelable.Creator<CapabilitiesRequest> {
    public CapabilitiesRequest createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        String packageName = RequestsProto.CapabilitiesRequest.parseFrom(createByteArray).getPackageName();
        k.d(packageName, "request.packageName");
        return new CapabilitiesRequest(packageName);
    }

    public CapabilitiesRequest[] newArray(int i8) {
        return new CapabilitiesRequest[i8];
    }
}
