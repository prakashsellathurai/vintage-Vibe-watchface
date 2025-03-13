package androidx.wear.watchface.style.data;

import android.graphics.drawable.Icon;
import g1.a;

public final class LongRangeUserStyleSettingWireFormatParcelizer {
    public static LongRangeUserStyleSettingWireFormat read(a aVar) {
        LongRangeUserStyleSettingWireFormat longRangeUserStyleSettingWireFormat = new LongRangeUserStyleSettingWireFormat();
        longRangeUserStyleSettingWireFormat.f2424f = aVar.C(1, longRangeUserStyleSettingWireFormat.f2424f);
        longRangeUserStyleSettingWireFormat.f2430l = aVar.u(100, longRangeUserStyleSettingWireFormat.f2430l);
        longRangeUserStyleSettingWireFormat.f2431m = aVar.u(101, longRangeUserStyleSettingWireFormat.f2431m);
        longRangeUserStyleSettingWireFormat.f2432n = aVar.k(102, longRangeUserStyleSettingWireFormat.f2432n);
        longRangeUserStyleSettingWireFormat.f2433o = aVar.u(103, longRangeUserStyleSettingWireFormat.f2433o);
        longRangeUserStyleSettingWireFormat.f2425g = aVar.o(2, longRangeUserStyleSettingWireFormat.f2425g);
        longRangeUserStyleSettingWireFormat.f2426h = aVar.o(3, longRangeUserStyleSettingWireFormat.f2426h);
        longRangeUserStyleSettingWireFormat.f2427i = (Icon) aVar.z(longRangeUserStyleSettingWireFormat.f2427i, 4);
        longRangeUserStyleSettingWireFormat.f2428j = aVar.t(longRangeUserStyleSettingWireFormat.f2428j, 5);
        longRangeUserStyleSettingWireFormat.f2429k = aVar.u(6, longRangeUserStyleSettingWireFormat.f2429k);
        return longRangeUserStyleSettingWireFormat;
    }

    public static void write(LongRangeUserStyleSettingWireFormat longRangeUserStyleSettingWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.c0(1, longRangeUserStyleSettingWireFormat.f2424f);
        aVar.V(100, longRangeUserStyleSettingWireFormat.f2430l);
        aVar.V(101, longRangeUserStyleSettingWireFormat.f2431m);
        aVar.L(102, longRangeUserStyleSettingWireFormat.f2432n);
        aVar.V(103, longRangeUserStyleSettingWireFormat.f2433o);
        aVar.P(2, longRangeUserStyleSettingWireFormat.f2425g);
        aVar.P(3, longRangeUserStyleSettingWireFormat.f2426h);
        aVar.a0(longRangeUserStyleSettingWireFormat.f2427i, 4);
        aVar.U(longRangeUserStyleSettingWireFormat.f2428j, 5);
        aVar.V(6, longRangeUserStyleSettingWireFormat.f2429k);
    }
}
