package androidx.health.services.client.impl.event;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.proto.EventsProto;
import q7.k;

public final class MeasureCallbackEvent$special$$inlined$newCreator$1 implements Parcelable.Creator<MeasureCallbackEvent> {
    public MeasureCallbackEvent createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        EventsProto.MeasureCallbackEvent parseFrom = EventsProto.MeasureCallbackEvent.parseFrom(createByteArray);
        k.d(parseFrom, "parseFrom(it)");
        return new MeasureCallbackEvent(parseFrom);
    }

    public MeasureCallbackEvent[] newArray(int i8) {
        return new MeasureCallbackEvent[i8];
    }
}
