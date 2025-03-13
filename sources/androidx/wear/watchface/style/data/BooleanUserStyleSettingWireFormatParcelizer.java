package androidx.wear.watchface.style.data;

import android.graphics.drawable.Icon;
import g1.a;

public final class BooleanUserStyleSettingWireFormatParcelizer {
    public static BooleanUserStyleSettingWireFormat read(a aVar) {
        BooleanUserStyleSettingWireFormat booleanUserStyleSettingWireFormat = new BooleanUserStyleSettingWireFormat();
        booleanUserStyleSettingWireFormat.f2424f = aVar.C(1, booleanUserStyleSettingWireFormat.f2424f);
        booleanUserStyleSettingWireFormat.f2430l = aVar.u(100, booleanUserStyleSettingWireFormat.f2430l);
        booleanUserStyleSettingWireFormat.f2431m = aVar.u(101, booleanUserStyleSettingWireFormat.f2431m);
        booleanUserStyleSettingWireFormat.f2432n = aVar.k(102, booleanUserStyleSettingWireFormat.f2432n);
        booleanUserStyleSettingWireFormat.f2433o = aVar.u(103, booleanUserStyleSettingWireFormat.f2433o);
        booleanUserStyleSettingWireFormat.f2425g = aVar.o(2, booleanUserStyleSettingWireFormat.f2425g);
        booleanUserStyleSettingWireFormat.f2426h = aVar.o(3, booleanUserStyleSettingWireFormat.f2426h);
        booleanUserStyleSettingWireFormat.f2427i = (Icon) aVar.z(booleanUserStyleSettingWireFormat.f2427i, 4);
        booleanUserStyleSettingWireFormat.f2428j = aVar.t(booleanUserStyleSettingWireFormat.f2428j, 5);
        booleanUserStyleSettingWireFormat.f2429k = aVar.u(6, booleanUserStyleSettingWireFormat.f2429k);
        return booleanUserStyleSettingWireFormat;
    }

    public static void write(BooleanUserStyleSettingWireFormat booleanUserStyleSettingWireFormat, a aVar) {
        aVar.H(false, false);
        aVar.c0(1, booleanUserStyleSettingWireFormat.f2424f);
        aVar.V(100, booleanUserStyleSettingWireFormat.f2430l);
        aVar.V(101, booleanUserStyleSettingWireFormat.f2431m);
        aVar.L(102, booleanUserStyleSettingWireFormat.f2432n);
        aVar.V(103, booleanUserStyleSettingWireFormat.f2433o);
        aVar.P(2, booleanUserStyleSettingWireFormat.f2425g);
        aVar.P(3, booleanUserStyleSettingWireFormat.f2426h);
        aVar.a0(booleanUserStyleSettingWireFormat.f2427i, 4);
        aVar.U(booleanUserStyleSettingWireFormat.f2428j, 5);
        aVar.V(6, booleanUserStyleSettingWireFormat.f2429k);
    }
}
