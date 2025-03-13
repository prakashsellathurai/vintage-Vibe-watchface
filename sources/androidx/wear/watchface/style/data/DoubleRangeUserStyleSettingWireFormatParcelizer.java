package androidx.wear.watchface.style.data;

import android.graphics.drawable.Icon;
import g1.a;

public final class DoubleRangeUserStyleSettingWireFormatParcelizer {
    public static DoubleRangeUserStyleSettingWireFormat read(a aVar) {
        DoubleRangeUserStyleSettingWireFormat doubleRangeUserStyleSettingWireFormat = new DoubleRangeUserStyleSettingWireFormat();
        doubleRangeUserStyleSettingWireFormat.f2424f = aVar.C(1, doubleRangeUserStyleSettingWireFormat.f2424f);
        doubleRangeUserStyleSettingWireFormat.f2430l = aVar.u(100, doubleRangeUserStyleSettingWireFormat.f2430l);
        doubleRangeUserStyleSettingWireFormat.f2431m = aVar.u(101, doubleRangeUserStyleSettingWireFormat.f2431m);
        doubleRangeUserStyleSettingWireFormat.f2432n = aVar.k(102, doubleRangeUserStyleSettingWireFormat.f2432n);
        doubleRangeUserStyleSettingWireFormat.f2433o = aVar.u(103, doubleRangeUserStyleSettingWireFormat.f2433o);
        doubleRangeUserStyleSettingWireFormat.f2425g = aVar.o(2, doubleRangeUserStyleSettingWireFormat.f2425g);
        doubleRangeUserStyleSettingWireFormat.f2426h = aVar.o(3, doubleRangeUserStyleSettingWireFormat.f2426h);
        doubleRangeUserStyleSettingWireFormat.f2427i = (Icon) aVar.z(doubleRangeUserStyleSettingWireFormat.f2427i, 4);
        doubleRangeUserStyleSettingWireFormat.f2428j = aVar.t(doubleRangeUserStyleSettingWireFormat.f2428j, 5);
        doubleRangeUserStyleSettingWireFormat.f2429k = aVar.u(6, doubleRangeUserStyleSettingWireFormat.f2429k);
        return doubleRangeUserStyleSettingWireFormat;
    }

    public static void write(DoubleRangeUserStyleSettingWireFormat doubleRangeUserStyleSettingWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.c0(1, doubleRangeUserStyleSettingWireFormat.f2424f);
        aVar.V(100, doubleRangeUserStyleSettingWireFormat.f2430l);
        aVar.V(101, doubleRangeUserStyleSettingWireFormat.f2431m);
        aVar.L(102, doubleRangeUserStyleSettingWireFormat.f2432n);
        aVar.V(103, doubleRangeUserStyleSettingWireFormat.f2433o);
        aVar.P(2, doubleRangeUserStyleSettingWireFormat.f2425g);
        aVar.P(3, doubleRangeUserStyleSettingWireFormat.f2426h);
        aVar.a0(doubleRangeUserStyleSettingWireFormat.f2427i, 4);
        aVar.U(doubleRangeUserStyleSettingWireFormat.f2428j, 5);
        aVar.V(6, doubleRangeUserStyleSettingWireFormat.f2429k);
    }
}
