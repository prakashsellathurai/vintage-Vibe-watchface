package androidx.wear.watchface.style.data;

import g1.a;

public final class BooleanOptionWireFormatParcelizer {
    public static BooleanOptionWireFormat read(a aVar) {
        BooleanOptionWireFormat booleanOptionWireFormat = new BooleanOptionWireFormat();
        booleanOptionWireFormat.f2417f = aVar.m(booleanOptionWireFormat.f2417f, 1);
        return booleanOptionWireFormat;
    }

    public static void write(BooleanOptionWireFormat booleanOptionWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.O(booleanOptionWireFormat.f2417f, 1);
    }
}
