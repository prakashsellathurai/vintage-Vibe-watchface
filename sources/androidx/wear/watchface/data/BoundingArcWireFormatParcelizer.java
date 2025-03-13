package androidx.wear.watchface.data;

import g1.a;

public final class BoundingArcWireFormatParcelizer {
    public static BoundingArcWireFormat read(a aVar) {
        BoundingArcWireFormat boundingArcWireFormat = new BoundingArcWireFormat();
        float f9 = boundingArcWireFormat.f2304f;
        if (aVar.q(1)) {
            f9 = aVar.r();
        }
        boundingArcWireFormat.f2304f = f9;
        float f10 = boundingArcWireFormat.f2305g;
        if (aVar.q(2)) {
            f10 = aVar.r();
        }
        boundingArcWireFormat.f2305g = f10;
        float f11 = boundingArcWireFormat.f2306h;
        if (aVar.q(3)) {
            f11 = aVar.r();
        }
        boundingArcWireFormat.f2306h = f11;
        return boundingArcWireFormat;
    }

    public static void write(BoundingArcWireFormat boundingArcWireFormat, a aVar) {
        aVar.H(false, false);
        float f9 = boundingArcWireFormat.f2304f;
        aVar.G(1);
        aVar.S(f9);
        float f10 = boundingArcWireFormat.f2305g;
        aVar.G(2);
        aVar.S(f10);
        float f11 = boundingArcWireFormat.f2306h;
        aVar.G(3);
        aVar.S(f11);
    }
}
