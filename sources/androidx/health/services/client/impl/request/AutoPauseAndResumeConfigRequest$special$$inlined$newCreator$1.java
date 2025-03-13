package androidx.health.services.client.impl.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.proto.RequestsProto;
import q7.k;

public final class AutoPauseAndResumeConfigRequest$special$$inlined$newCreator$1 implements Parcelable.Creator<AutoPauseAndResumeConfigRequest> {
    public AutoPauseAndResumeConfigRequest createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        RequestsProto.AutoPauseAndResumeConfigRequest parseFrom = RequestsProto.AutoPauseAndResumeConfigRequest.parseFrom(createByteArray);
        String packageName = parseFrom.getPackageName();
        k.d(packageName, "request.packageName");
        return new AutoPauseAndResumeConfigRequest(packageName, parseFrom.getShouldEnable());
    }

    public AutoPauseAndResumeConfigRequest[] newArray(int i8) {
        return new AutoPauseAndResumeConfigRequest[i8];
    }
}
