package androidx.wear.watchface.style.data;

import android.graphics.drawable.Icon;
import g1.a;
import java.util.List;

public final class ComplicationsOptionWireFormatParcelizer {
    public static ComplicationsOptionWireFormat read(a aVar) {
        ComplicationsOptionWireFormat complicationsOptionWireFormat = new ComplicationsOptionWireFormat();
        complicationsOptionWireFormat.f2417f = aVar.m(complicationsOptionWireFormat.f2417f, 1);
        Object[] objArr = complicationsOptionWireFormat.f2409i;
        if (aVar.q(100)) {
            objArr = aVar.g(objArr);
        }
        complicationsOptionWireFormat.f2409i = (ComplicationOverlayWireFormat[]) objArr;
        complicationsOptionWireFormat.f2410j = aVar.u(101, complicationsOptionWireFormat.f2410j);
        complicationsOptionWireFormat.f2411k = aVar.u(102, complicationsOptionWireFormat.f2411k);
        complicationsOptionWireFormat.f2412l = aVar.u(103, complicationsOptionWireFormat.f2412l);
        complicationsOptionWireFormat.f2407g = aVar.o(2, complicationsOptionWireFormat.f2407g);
        complicationsOptionWireFormat.f2408h = (Icon) aVar.z(complicationsOptionWireFormat.f2408h, 3);
        return complicationsOptionWireFormat;
    }

    public static void write(ComplicationsOptionWireFormat complicationsOptionWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.O(complicationsOptionWireFormat.f2417f, 1);
        ComplicationOverlayWireFormat[] complicationOverlayWireFormatArr = complicationsOptionWireFormat.f2409i;
        aVar.G(100);
        aVar.I(complicationOverlayWireFormatArr);
        List<PerComplicationTypeMargins> list = complicationsOptionWireFormat.f2410j;
        if (list != null) {
            aVar.V(101, list);
        }
        List<Integer> list2 = complicationsOptionWireFormat.f2411k;
        if (list2 != null) {
            aVar.V(102, list2);
        }
        List<Integer> list3 = complicationsOptionWireFormat.f2412l;
        if (list3 != null) {
            aVar.V(103, list3);
        }
        aVar.P(2, complicationsOptionWireFormat.f2407g);
        aVar.a0(complicationsOptionWireFormat.f2408h, 3);
    }
}
