package androidx.wear.watchface.data;

import g1.a;

public final class IdAndComplicationStateWireFormatParcelizer {
    public static IdAndComplicationStateWireFormat read(a aVar) {
        IdAndComplicationStateWireFormat idAndComplicationStateWireFormat = new IdAndComplicationStateWireFormat();
        idAndComplicationStateWireFormat.f2343f = aVar.t(idAndComplicationStateWireFormat.f2343f, 1);
        idAndComplicationStateWireFormat.f2344g = (ComplicationStateWireFormat) aVar.F(idAndComplicationStateWireFormat.f2344g, 2);
        return idAndComplicationStateWireFormat;
    }

    public static void write(IdAndComplicationStateWireFormat idAndComplicationStateWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.U(idAndComplicationStateWireFormat.f2343f, 1);
        aVar.g0(idAndComplicationStateWireFormat.f2344g, 2);
    }
}
