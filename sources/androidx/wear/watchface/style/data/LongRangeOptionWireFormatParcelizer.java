package androidx.wear.watchface.style.data;

import g1.a;

public final class LongRangeOptionWireFormatParcelizer {
    public static LongRangeOptionWireFormat read(a aVar) {
        LongRangeOptionWireFormat longRangeOptionWireFormat = new LongRangeOptionWireFormat();
        longRangeOptionWireFormat.f2417f = aVar.m(longRangeOptionWireFormat.f2417f, 1);
        return longRangeOptionWireFormat;
    }

    public static void write(LongRangeOptionWireFormat longRangeOptionWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.O(longRangeOptionWireFormat.f2417f, 1);
    }
}
