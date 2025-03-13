package androidx.health.services.client.impl.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.proto.RequestsProto;
import q7.k;

public final class FlushRequest$special$$inlined$newCreator$1 implements Parcelable.Creator<FlushRequest> {
    public FlushRequest createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        String packageName = RequestsProto.FlushRequest.parseFrom(createByteArray).getPackageName();
        k.d(packageName, "request.packageName");
        return new FlushRequest(packageName);
    }

    public FlushRequest[] newArray(int i8) {
        return new FlushRequest[i8];
    }
}
