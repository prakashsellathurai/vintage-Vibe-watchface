package androidx.health.services.client.impl.event;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.proto.EventsProto;
import q7.k;

public final class PassiveCallbackEvent$special$$inlined$newCreator$1 implements Parcelable.Creator<PassiveCallbackEvent> {
    public PassiveCallbackEvent createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        EventsProto.PassiveCallbackEvent parseFrom = EventsProto.PassiveCallbackEvent.parseFrom(createByteArray);
        k.d(parseFrom, "parseFrom(it)");
        return new PassiveCallbackEvent(parseFrom);
    }

    public PassiveCallbackEvent[] newArray(int i8) {
        return new PassiveCallbackEvent[i8];
    }
}
