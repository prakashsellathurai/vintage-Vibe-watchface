package androidx.health.services.client.impl.event;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.services.client.proto.EventsProto;
import q7.k;

public final class ExerciseUpdateListenerEvent$special$$inlined$newCreator$1 implements Parcelable.Creator<ExerciseUpdateListenerEvent> {
    public ExerciseUpdateListenerEvent createFromParcel(Parcel parcel) {
        k.e(parcel, "source");
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        EventsProto.ExerciseUpdateListenerEvent parseFrom = EventsProto.ExerciseUpdateListenerEvent.parseFrom(createByteArray);
        k.d(parseFrom, "parseFrom(it)");
        return new ExerciseUpdateListenerEvent(parseFrom);
    }

    public ExerciseUpdateListenerEvent[] newArray(int i8) {
        return new ExerciseUpdateListenerEvent[i8];
    }
}
