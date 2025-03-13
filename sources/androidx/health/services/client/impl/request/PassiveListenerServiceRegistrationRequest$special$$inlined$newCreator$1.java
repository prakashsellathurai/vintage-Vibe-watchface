package androidx.health.services.client.impl.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.data.PassiveListenerConfig;
import androidx.health.services.client.proto.DataProto;
import androidx.health.services.client.proto.RequestsProto;
import q7.k;

public final class PassiveListenerServiceRegistrationRequest$special$$inlined$newCreator$1 implements Parcelable.Creator<PassiveListenerServiceRegistrationRequest> {
    public PassiveListenerServiceRegistrationRequest createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        RequestsProto.PassiveListenerServiceRegistrationRequest parseFrom = RequestsProto.PassiveListenerServiceRegistrationRequest.parseFrom(createByteArray);
        String packageName = parseFrom.getPackageName();
        k.d(packageName, "proto.packageName");
        String listenerServiceClass = parseFrom.getListenerServiceClass();
        k.d(listenerServiceClass, "proto.listenerServiceClass");
        DataProto.PassiveListenerConfig config = parseFrom.getConfig();
        k.d(config, "proto.config");
        return new PassiveListenerServiceRegistrationRequest(packageName, listenerServiceClass, new PassiveListenerConfig(config));
    }

    public PassiveListenerServiceRegistrationRequest[] newArray(int i8) {
        return new PassiveListenerServiceRegistrationRequest[i8];
    }
}
