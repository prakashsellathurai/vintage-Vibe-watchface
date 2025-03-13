package androidx.wear.watchface.style.data;

import g1.a;

public final class CustomValueOptionWireFormatParcelizer {
    public static CustomValueOptionWireFormat read(a aVar) {
        CustomValueOptionWireFormat customValueOptionWireFormat = new CustomValueOptionWireFormat();
        customValueOptionWireFormat.f2417f = aVar.m(customValueOptionWireFormat.f2417f, 1);
        return customValueOptionWireFormat;
    }

    public static void write(CustomValueOptionWireFormat customValueOptionWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.O(customValueOptionWireFormat.f2417f, 1);
    }
}
