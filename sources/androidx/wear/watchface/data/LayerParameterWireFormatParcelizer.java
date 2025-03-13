package androidx.wear.watchface.data;

import g1.a;

public final class LayerParameterWireFormatParcelizer {
    public static LayerParameterWireFormat read(a aVar) {
        LayerParameterWireFormat layerParameterWireFormat = new LayerParameterWireFormat();
        layerParameterWireFormat.f2349f = aVar.t(layerParameterWireFormat.f2349f, 1);
        layerParameterWireFormat.f2350g = aVar.t(layerParameterWireFormat.f2350g, 2);
        return layerParameterWireFormat;
    }

    public static void write(LayerParameterWireFormat layerParameterWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.U(layerParameterWireFormat.f2349f, 1);
        aVar.U(layerParameterWireFormat.f2350g, 2);
    }
}
