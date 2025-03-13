package androidx.health.services.client.data;

import androidx.health.services.client.data.DataPoint;
import androidx.health.services.client.data.DataType;
import q7.k;

public final class DeltaDataType<T, D extends DataPoint<T>> extends DataType<T, D> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeltaDataType(String str, DataType.TimeType timeType, Class<T> cls) {
        super(str, timeType, cls, false);
        k.e(str, "name");
        k.e(timeType, "timeType");
        k.e(cls, "valueClass");
    }
}
