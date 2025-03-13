package androidx.health.services.client.impl.event;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.proto.EventsProto;
import q7.k;

public final class PassiveListenerEvent$special$$inlined$newCreator$1 implements Parcelable.Creator<PassiveListenerEvent> {
    public PassiveListenerEvent createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        EventsProto.PassiveListenerEvent parseFrom = EventsProto.PassiveListenerEvent.parseFrom(createByteArray);
        k.d(parseFrom, "parseFrom(it)");
        return new PassiveListenerEvent(parseFrom);
    }

    public PassiveListenerEvent[] newArray(int i8) {
        return new PassiveListenerEvent[i8];
    }
}
