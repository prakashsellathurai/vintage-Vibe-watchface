package androidx.wear.watchface.data;

import android.support.wearable.complications.ComplicationData;
import g1.a;

public final class IdAndComplicationDataWireFormatParcelizer {
    public static IdAndComplicationDataWireFormat read(a aVar) {
        IdAndComplicationDataWireFormat idAndComplicationDataWireFormat = new IdAndComplicationDataWireFormat();
        idAndComplicationDataWireFormat.f2341f = aVar.t(idAndComplicationDataWireFormat.f2341f, 1);
        idAndComplicationDataWireFormat.f2342g = (ComplicationData) aVar.z(idAndComplicationDataWireFormat.f2342g, 2);
        return idAndComplicationDataWireFormat;
    }

    public static void write(IdAndComplicationDataWireFormat idAndComplicationDataWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.U(idAndComplicationDataWireFormat.f2341f, 1);
        aVar.a0(idAndComplicationDataWireFormat.f2342g, 2);
    }
}
