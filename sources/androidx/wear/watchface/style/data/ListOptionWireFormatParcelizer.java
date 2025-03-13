package androidx.wear.watchface.style.data;

import android.graphics.drawable.Icon;
import g1.a;

public final class ListOptionWireFormatParcelizer {
    public static ListOptionWireFormat read(a aVar) {
        ListOptionWireFormat listOptionWireFormat = new ListOptionWireFormat();
        listOptionWireFormat.f2417f = aVar.m(listOptionWireFormat.f2417f, 1);
        listOptionWireFormat.f2414g = aVar.o(2, listOptionWireFormat.f2414g);
        listOptionWireFormat.f2415h = (Icon) aVar.z(listOptionWireFormat.f2415h, 3);
        return listOptionWireFormat;
    }

    public static void write(ListOptionWireFormat listOptionWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.O(listOptionWireFormat.f2417f, 1);
        aVar.P(2, listOptionWireFormat.f2414g);
        aVar.a0(listOptionWireFormat.f2415h, 3);
    }
}
