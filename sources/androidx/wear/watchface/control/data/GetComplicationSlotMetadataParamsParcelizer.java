package androidx.wear.watchface.control.data;

import android.content.ComponentName;
import g1.a;

public final class GetComplicationSlotMetadataParamsParcelizer {
    public static GetComplicationSlotMetadataParams read(a aVar) {
        GetComplicationSlotMetadataParams getComplicationSlotMetadataParams = new GetComplicationSlotMetadataParams();
        getComplicationSlotMetadataParams.f2266f = (ComponentName) aVar.z(getComplicationSlotMetadataParams.f2266f, 1);
        return getComplicationSlotMetadataParams;
    }

    public static void write(GetComplicationSlotMetadataParams getComplicationSlotMetadataParams, a aVar) {
        aVar.H(false, false);
        aVar.a0(getComplicationSlotMetadataParams.f2266f, 1);
    }
}
