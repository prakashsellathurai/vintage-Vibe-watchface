package androidx.wear.watchface.data;

import g1.a;

public final class IdAndTapEventWireFormatParcelizer {
    public static IdAndTapEventWireFormat read(a aVar) {
        IdAndTapEventWireFormat idAndTapEventWireFormat = new IdAndTapEventWireFormat();
        idAndTapEventWireFormat.f2345f = aVar.t(idAndTapEventWireFormat.f2345f, 1);
        idAndTapEventWireFormat.f2346g = aVar.t(idAndTapEventWireFormat.f2346g, 2);
        idAndTapEventWireFormat.f2347h = aVar.t(idAndTapEventWireFormat.f2347h, 3);
        idAndTapEventWireFormat.f2348i = aVar.w(4, idAndTapEventWireFormat.f2348i);
        return idAndTapEventWireFormat;
    }

    public static void write(IdAndTapEventWireFormat idAndTapEventWireFormat, a aVar) {
        aVar.H(true, false);
        aVar.U(idAndTapEventWireFormat.f2345f, 1);
        aVar.U(idAndTapEventWireFormat.f2346g, 2);
        aVar.U(idAndTapEventWireFormat.f2347h, 3);
        aVar.W(4, idAndTapEventWireFormat.f2348i);
    }
}
