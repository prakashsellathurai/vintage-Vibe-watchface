package androidx.wear.watchface.style.data;

import g1.a;

public final class OptionWireFormatParcelizer {
    public static OptionWireFormat read(a aVar) {
        OptionWireFormat optionWireFormat = new OptionWireFormat();
        optionWireFormat.f2417f = aVar.m(optionWireFormat.f2417f, 1);
        return optionWireFormat;
    }

    public static void write(OptionWireFormat optionWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.O(optionWireFormat.f2417f, 1);
    }
}
