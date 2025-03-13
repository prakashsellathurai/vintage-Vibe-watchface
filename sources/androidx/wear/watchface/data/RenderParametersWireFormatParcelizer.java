package androidx.wear.watchface.data;

import g1.a;

public final class RenderParametersWireFormatParcelizer {
    public static RenderParametersWireFormat read(a aVar) {
        RenderParametersWireFormat renderParametersWireFormat = new RenderParametersWireFormat();
        renderParametersWireFormat.f2351f = aVar.t(renderParametersWireFormat.f2351f, 1);
        renderParametersWireFormat.f2352g = aVar.t(renderParametersWireFormat.f2352g, 2);
        renderParametersWireFormat.f2353h = aVar.t(renderParametersWireFormat.f2353h, 3);
        renderParametersWireFormat.f2354i = aVar.t(renderParametersWireFormat.f2354i, 4);
        renderParametersWireFormat.f2355j = aVar.C(5, renderParametersWireFormat.f2355j);
        renderParametersWireFormat.f2356k = aVar.t(renderParametersWireFormat.f2356k, 6);
        renderParametersWireFormat.f2357l = aVar.t(renderParametersWireFormat.f2357l, 7);
        renderParametersWireFormat.f2358m = aVar.u(9, renderParametersWireFormat.f2358m);
        return renderParametersWireFormat;
    }

    public static void write(RenderParametersWireFormat renderParametersWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.U(renderParametersWireFormat.f2351f, 1);
        aVar.U(renderParametersWireFormat.f2352g, 2);
        aVar.U(renderParametersWireFormat.f2353h, 3);
        aVar.U(renderParametersWireFormat.f2354i, 4);
        aVar.c0(5, renderParametersWireFormat.f2355j);
        aVar.U(renderParametersWireFormat.f2356k, 6);
        aVar.U(renderParametersWireFormat.f2357l, 7);
        aVar.V(9, renderParametersWireFormat.f2358m);
    }
}
