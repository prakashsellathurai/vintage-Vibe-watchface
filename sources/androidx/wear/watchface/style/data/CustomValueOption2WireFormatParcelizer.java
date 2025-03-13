package androidx.wear.watchface.style.data;

import g1.a;

public final class CustomValueOption2WireFormatParcelizer {
    public static CustomValueOption2WireFormat read(a aVar) {
        CustomValueOption2WireFormat customValueOption2WireFormat = new CustomValueOption2WireFormat();
        customValueOption2WireFormat.f2417f = aVar.m(customValueOption2WireFormat.f2417f, 1);
        return customValueOption2WireFormat;
    }

    public static void write(CustomValueOption2WireFormat customValueOption2WireFormat, a aVar) {
        aVar.H(false, false);
        aVar.O(customValueOption2WireFormat.f2417f, 1);
    }
}
