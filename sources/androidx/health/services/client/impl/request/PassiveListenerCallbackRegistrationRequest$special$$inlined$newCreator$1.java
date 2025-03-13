package androidx.health.services.client.impl.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.data.PassiveListenerConfig;
import androidx.health.services.client.proto.DataProto;
import androidx.health.services.client.proto.RequestsProto;
import q7.k;

public final class PassiveListenerCallbackRegistrationRequest$special$$inlined$newCreator$1 implements Parcelable.Creator<PassiveListenerCallbackRegistrationRequest> {
    public PassiveListenerCallbackRegistrationRequest createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        RequestsProto.PassiveListenerCallbackRegistrationRequest parseFrom = RequestsProto.PassiveListenerCallbackRegistrationRequest.parseFrom(createByteArray);
        String packageName = parseFrom.getPackageName();
        k.d(packageName, "proto.packageName");
        DataProto.PassiveListenerConfig config = parseFrom.getConfig();
        k.d(config, "proto.config");
        return new PassiveListenerCallbackRegistrationRequest(packageName, new PassiveListenerConfig(config));
    }

    public PassiveListenerCallbackRegistrationRequest[] newArray(int i8) {
        return new PassiveListenerCallbackRegistrationRequest[i8];
    }
}
