package androidx.wear.watchface.style.data;

import g1.a;

public final class DoubleRangeOptionWireFormatParcelizer {
    public static DoubleRangeOptionWireFormat read(a aVar) {
        DoubleRangeOptionWireFormat doubleRangeOptionWireFormat = new DoubleRangeOptionWireFormat();
        doubleRangeOptionWireFormat.f2417f = aVar.m(doubleRangeOptionWireFormat.f2417f, 1);
        return doubleRangeOptionWireFormat;
    }

    public static void write(DoubleRangeOptionWireFormat doubleRangeOptionWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.O(doubleRangeOptionWireFormat.f2417f, 1);
    }
}
